# Bench suite: suite.txt

## Melee bench: F01

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.9 | 48 / 210 | 2.27 | 16.9% | 29050 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 140 |
| kc.mini.Mirage 0.2 | 2.0 | 16.9% | 48 |
| sgp.JollyNinja 3.53 | 3.0 | 12.0% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.2% | 0 |
| mz.MicroGodMelee 1 | 4.8 | 10.4% | 6 |
| lorneswork.Predator 1.0 | 5.8 | 9.3% | 2 |
| adt.Ar2 1.0 | 6.8 | 8.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.3% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 84.1 | 8 / 35 | 4844 |
| 2 | 2 | 66.6 | 84.4 | 9 / 35 | 4958 |
| 3 | 2 | 66.9 | 87.3 | 8 / 35 | 4723 |
| 4 | 2 | 66.5 | 85.1 | 7 / 35 | 4870 |
| 5 | 2 | 67.4 | 88.3 | 10 / 35 | 4849 |
| 6 | 2 | 66.8 | 86.3 | 6 / 35 | 4806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 125 | 13% |
| sgp.JollyNinja 3.53 | 15 | 93% |
| mz.MicroGodMelee 1 | 12 | 75% |
| lorneswork.Predator 1.0 | 5 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 121 | 75% | 141 |
| sgp.JollyNinja 3.53 | 13 | 8% | 22 |
| mz.MicroGodMelee 1 | 12 | 7% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 6% | 13 |
| adt.Ar2 1.0 | 5 | 3% | 7 |
| lorneswork.Predator 1.0 | 1 | 1% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |

## Melee bench: F02

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.1 | 90 / 210 | 2.52 | 18.1% | 31693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.1% | 90 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.5% | 51 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.2% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.0% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.2% | 7 |
| fnc.bandit.Bandit 5.2.0 | 6.2 | 8.7% | 2 |
| Noran.BitchingElk 0.054 | 7.2 | 7.8% | 15 |
| stelo.PatternRobot 1.0 | 8.2 | 7.0% | 5 |
| sch.Simone 0.3d | 8.2 | 7.0% | 5 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 82.9 | 15 / 35 | 5499 |
| 2 | 1 | 66.0 | 79.0 | 13 / 35 | 5135 |
| 3 | 1 | 65.3 | 77.5 | 10 / 35 | 5120 |
| 4 | 1 | 67.2 | 84.4 | 14 / 35 | 5175 |
| 5 | 1 | 69.1 | 88.3 | 18 / 35 | 5507 |
| 6 | 1 | 68.7 | 86.7 | 20 / 35 | 5257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 54 | 65% |
| pulsar.PulsarMax 0.8.9 | 47 | 38% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 90% |
| Noran.BitchingElk 0.054 | 9 | 44% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| sch.Simone 0.3d | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 2 | 50% |

Hadur died in 121 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 49 | 40% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 30 | 25% | 67 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 10% | 17 |
| stelo.PatternRobot 1.0 | 9 | 7% | 14 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 6% | 20 |
| Noran.BitchingElk 0.054 | 7 | 6% | 12 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 8 |
| fullsail.SweetTea 1.1 | 2 | 2% | 4 |
| sch.Simone 0.3d | 0 | 0% | 7 |

## Melee bench: F03

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.4 | 152 / 210 | 1.59 | 20.6% | 38195 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.6% | 152 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.7% | 28 |
| radnor.DoctorBob 1.42 | 3.2 | 12.5% | 6 |
| vuen.Cake 2.51 | 3.3 | 12.8% | 24 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 0 |
| adt.Ar1 2.1 | 6.2 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 6.7% | 0 |
| oa.weak.FlyMk1 0.1 | 8.2 | 6.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 93.7 | 23 / 35 | 5911 |
| 2 | 1 | 71.0 | 94.0 | 27 / 35 | 6600 |
| 3 | 1 | 71.7 | 94.6 | 26 / 35 | 6831 |
| 4 | 1 | 71.4 | 94.3 | 28 / 35 | 6209 |
| 5 | 1 | 69.4 | 89.8 | 21 / 35 | 6155 |
| 6 | 1 | 71.6 | 94.3 | 27 / 35 | 6489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 78 | 85% |
| vuen.Cake 2.51 | 71 | 69% |
| radnor.DoctorBob 1.42 | 28 | 96% |
| urdos.URDOS 1.3 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 27 | 47% | 78 |
| kawigi.nano.Lib 1.0 | 17 | 29% | 75 |
| radnor.DoctorBob 1.42 | 8 | 14% | 40 |
| urdos.URDOS 1.3 | 2 | 3% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 2 |
| adt.Ar1 2.1 | 1 | 2% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 1 |

## Melee bench: F04

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.2 | 25 / 210 | 2.42 | 17.3% | 34582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.4% | 175 |
| kc.mini.Mirage 0.2 | 2.0 | 17.3% | 25 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.0% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 10.1% | 3 |
| josago.Jorgito 0.16 | 5.2 | 8.8% | 2 |
| tj.zombie1n 1.0.1 | 6.2 | 7.1% | 1 |
| css.Delitioner 0.11 | 6.7 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.5% | 1 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.1% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 78.4 | 3 / 35 | 5620 |
| 2 | 2 | 69.2 | 87.9 | 6 / 35 | 6096 |
| 3 | 2 | 68.9 | 88.3 | 6 / 35 | 5886 |
| 4 | 2 | 67.7 | 84.1 | 3 / 35 | 5876 |
| 5 | 2 | 67.6 | 82.2 | 5 / 35 | 5794 |
| 6 | 2 | 67.2 | 84.4 | 2 / 35 | 5310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 148 | 11% |
| apc.LeeroyJenkins2 1.0 | 5 | 80% |
| TNT.TNT 0.99.1 | 3 | 67% |
| josago.Jorgito 0.16 | 2 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 1154. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 156 | 84% | 171 |
| apc.LeeroyJenkins2 1.0 | 12 | 6% | 17 |
| josago.Jorgito 0.16 | 8 | 4% | 9 |
| TNT.TNT 0.99.1 | 5 | 3% | 6 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| rampancy.Durandal 2.1d | 1 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 76.4 | 29 / 210 | 3.12 | 14.7% | 23083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.8% | 97 |
| justin.DemonicRage 3.4 | 1.7 | 16.7% | 57 |
| kc.mini.Mirage 0.2 | 3.2 | 14.7% | 29 |
| wompi.Numbat 2.1 | 3.8 | 12.7% | 19 |
| ms.Ares 0.19 | 5.2 | 9.4% | 4 |
| axeBots.HataMoto 3.09 | 5.8 | 8.7% | 4 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.8 | 80.3 | 5 / 35 | 3816 |
| 2 | 4 | 60.1 | 67.0 | 3 / 35 | 3626 |
| 3 | 3 | 63.0 | 79.0 | 4 / 35 | 3594 |
| 4 | 3 | 63.4 | 78.1 | 5 / 35 | 3991 |
| 5 | 3 | 63.3 | 75.2 | 5 / 35 | 3915 |
| 6 | 3 | 64.6 | 78.7 | 7 / 35 | 4141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 40 | 13% |
| justin.DemonicRage 3.4 | 36 | 31% |
| wompi.Numbat 2.1 | 14 | 71% |
| ms.Ares 0.19 | 4 | 25% |
| axeBots.HataMoto 3.09 | 3 | 67% |

Hadur died in 181 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 70 | 39% | 76 |
| justin.DemonicRage 3.4 | 53 | 29% | 64 |
| wompi.Numbat 2.1 | 36 | 20% | 43 |
| ms.Ares 0.19 | 12 | 7% | 14 |
| axeBots.HataMoto 3.09 | 7 | 4% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

## Melee bench: F06

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.8 | 110 / 210 | 2.28 | 18.0% | 27325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.0% | 110 |
| jekl.StoneGhost 0.7 | 2.2 | 15.1% | 38 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.3 | 12.3% | 20 |
| origin.SleepSiphon 1.7b | 3.7 | 12.6% | 32 |
| mld.Wisdom 1.0 | 4.8 | 10.6% | 5 |
| gg.Wolverine 2.0 | 6.2 | 8.2% | 1 |
| spinnercat.Omen 1.0 | 7.0 | 7.2% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.5% | 4 |
| DBall.NUKE 0.1 | 8.5 | 6.5% | 0 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.0 | 19 / 35 | 4760 |
| 2 | 1 | 68.2 | 88.3 | 20 / 35 | 4625 |
| 3 | 1 | 67.3 | 86.0 | 15 / 35 | 4726 |
| 4 | 1 | 69.2 | 91.4 | 22 / 35 | 4540 |
| 5 | 1 | 66.6 | 83.5 | 18 / 35 | 4087 |
| 6 | 1 | 66.3 | 79.7 | 16 / 35 | 4587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 54 | 83% |
| origin.SleepSiphon 1.7b | 35 | 63% |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 79% |
| gg.Wolverine 2.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 80% |
| DBall.NUKE 0.1 | 3 | 100% |
| mld.Wisdom 1.0 | 3 | 67% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 30 | 29% | 56 |
| origin.SleepSiphon 1.7b | 26 | 25% | 58 |
| mld.Wisdom 1.0 | 16 | 16% | 22 |
| pe.minimelee.SandboxMiniMelee 1.1 | 15 | 15% | 43 |
| gg.Wolverine 2.0 | 6 | 6% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 5% | 10 |
| spinnercat.Omen 1.0 | 3 | 3% | 6 |
| DBall.NUKE 0.1 | 1 | 1% | 6 |

## Melee bench: F07

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.8 | 124 / 210 | 1.65 | 20.3% | 37419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.3% | 124 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.4% | 43 |
| rtk.Tachikoma 1.0 | 2.8 | 15.9% | 36 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.9% | 3 |
| franzor.Lizt 1.3.1 | 5.0 | 10.1% | 4 |
| exauge.GateKeeper 1.1.121g | 6.3 | 7.9% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 7.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.1% | 0 |
| sample.Target 1.0 | 9.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.5 | 15 / 35 | 5774 |
| 2 | 1 | 72.1 | 93.0 | 23 / 35 | 6179 |
| 3 | 1 | 72.5 | 93.7 | 22 / 35 | 6779 |
| 4 | 1 | 72.7 | 94.6 | 24 / 35 | 6587 |
| 5 | 1 | 71.4 | 91.1 | 19 / 35 | 6116 |
| 6 | 1 | 71.7 | 93.7 | 21 / 35 | 5984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 82 | 76% |
| rsalesc.melee.Monk 0.3.6c | 49 | 29% |
| oog.melee.CapuletDroid 1.1 | 35 | 97% |
| franzor.Lizt 1.3.1 | 10 | 90% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1145. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 43 | 50% | 63 |
| rtk.Tachikoma 1.0 | 35 | 41% | 99 |
| oog.melee.CapuletDroid 1.1 | 4 | 5% | 36 |
| exauge.GateKeeper 1.1.121g | 3 | 3% | 7 |
| franzor.Lizt 1.3.1 | 1 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |

## Melee bench: F08

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.7 | 129 / 210 | 1.92 | 19.7% | 32195 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.7% | 129 |
| tm.Yuugao 1.0 | 2.0 | 13.7% | 44 |
| shrub.Vapour v159 | 3.3 | 11.4% | 13 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 10.8% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.4% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.4% | 5 |
| m3thos.Eva00 1.1 | 6.5 | 8.2% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.9% | 3 |
| SHAM.WOW 1.4 | 9.0 | 5.9% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.4 | 22 / 35 | 5154 |
| 2 | 1 | 70.0 | 90.2 | 22 / 35 | 5693 |
| 3 | 1 | 66.7 | 83.2 | 15 / 35 | 4841 |
| 4 | 1 | 70.1 | 93.0 | 23 / 35 | 5338 |
| 5 | 1 | 69.2 | 89.5 | 22 / 35 | 5145 |
| 6 | 1 | 70.7 | 91.1 | 25 / 35 | 6024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 66 | 62% |
| shrub.Vapour v159 | 38 | 79% |
| Krabb.sliNk.Garm 0.9u | 29 | 76% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 88% |
| com.spp.robocode.MostlyHarmless 010 | 9 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| m3thos.Eva00 1.1 | 4 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 34 | 41% | 75 |
| shrub.Vapour v159 | 15 | 18% | 37 |
| Krabb.sliNk.Garm 0.9u | 12 | 14% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 12% | 27 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 7% | 24 |
| zyx.nano.BacillusComma 1.0 | 3 | 4% | 5 |
| m3thos.Eva00 1.1 | 2 | 2% | 6 |
| SHAM.WOW 1.4 | 1 | 1% | 4 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |

## Melee bench: F09

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 76.5 | 68 / 210 | 3.12 | 15.7% | 24014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.2% | 84 |
| kc.mini.Mirage 0.2 | 2.0 | 15.7% | 68 |
| kc.micro.Figment 1.0 | 3.0 | 13.2% | 24 |
| yagami.Tidus 0.11 | 4.7 | 10.1% | 3 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.7% | 15 |
| mc2.enemy.Original 0.9 | 5.3 | 9.5% | 13 |
| dft.Calliope 5.6 | 7.2 | 7.4% | 3 |
| step.nanoPri 1.0 | 8.3 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 81.0 | 14 / 35 | 4164 |
| 2 | 2 | 63.8 | 75.9 | 10 / 35 | 3902 |
| 3 | 2 | 64.1 | 76.2 | 12 / 35 | 4006 |
| 4 | 2 | 64.7 | 80.0 | 11 / 35 | 3961 |
| 5 | 1 | 66.2 | 81.9 | 13 / 35 | 4406 |
| 6 | 3 | 59.5 | 63.8 | 8 / 35 | 3575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 61 | 46% |
| kc.micro.Figment 1.0 | 27 | 70% |
| mc2.enemy.Original 0.9 | 8 | 63% |
| pedersen.Grishnakh 1.0 | 7 | 71% |
| yagami.Tidus 0.11 | 7 | 86% |
| dft.Calliope 5.6 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 52 | 37% | 79 |
| kc.micro.Figment 1.0 | 31 | 22% | 53 |
| mc2.enemy.Original 0.9 | 14 | 10% | 19 |
| yagami.Tidus 0.11 | 12 | 8% | 18 |
| robar.nano.Assertive_Melee 0.2 | 10 | 7% | 12 |
| dft.Calliope 5.6 | 9 | 6% | 10 |
| pedersen.Grishnakh 1.0 | 8 | 6% | 13 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F10

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 95.6 | 162 / 210 | 1.40 | 20.7% | 34138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.7% | 162 |
| DTF.Kludgy 1.2b | 2.3 | 14.3% | 30 |
| ne.Chimera 1.2 | 3.0 | 12.4% | 6 |
| ejb.Polaris 1.0.1 | 3.7 | 11.5% | 5 |
| tvv.micro.Antares 1.1.1 | 5.3 | 9.8% | 3 |
| vStar.RAFzilla 2.15 | 5.7 | 10.0% | 2 |
| kurios.DOSexe .9b | 7.5 | 5.9% | 2 |
| sam.Samspin 1.0 | 8.2 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.9 | 26 / 35 | 6018 |
| 2 | 1 | 70.4 | 92.7 | 24 / 35 | 5843 |
| 3 | 1 | 70.3 | 95.6 | 29 / 35 | 5120 |
| 4 | 1 | 71.1 | 95.2 | 24 / 35 | 5694 |
| 5 | 1 | 71.6 | 96.8 | 27 / 35 | 5944 |
| 6 | 1 | 71.8 | 98.1 | 32 / 35 | 5519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 67 | 70% |
| ejb.Polaris 1.0.1 | 44 | 91% |
| ne.Chimera 1.2 | 36 | 89% |
| vStar.RAFzilla 2.15 | 25 | 96% |
| tvv.micro.Antares 1.1.1 | 8 | 88% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 4 | 100% |
| donjezza.Muncho 1.0 | 3 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 25 | 51% | 69 |
| ne.Chimera 1.2 | 9 | 18% | 35 |
| ejb.Polaris 1.0.1 | 6 | 12% | 46 |
| tvv.micro.Antares 1.1.1 | 4 | 8% | 11 |
| vStar.RAFzilla 2.15 | 3 | 6% | 26 |
| kurios.DOSexe .9b | 1 | 2% | 11 |
| sam.Samspin 1.0 | 1 | 2% | 5 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |

## Melee bench: F11

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.8 | 102 / 210 | 2.37 | 17.8% | 27142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.8% | 102 |
| rz.Aleph 0.34 | 1.7 | 16.0% | 54 |
| cx.mini.Nimrod 0.55 | 3.5 | 12.0% | 15 |
| djc.DynaBot 0.1.1 | 3.7 | 11.3% | 18 |
| rdt199.Warlord 0.73 | 5.3 | 8.8% | 8 |
| br2.MobyDickBot 1.6 | 6.0 | 8.5% | 9 |
| KiraNL.Chupacabra 0.4 | 7.0 | 7.6% | 2 |
| uji.YellohFellah 1.0 | 7.5 | 7.4% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 80.3 | 15 / 35 | 4500 |
| 2 | 2 | 65.2 | 81.9 | 12 / 35 | 4155 |
| 3 | 1 | 68.9 | 90.2 | 19 / 35 | 4884 |
| 4 | 1 | 68.4 | 89.8 | 20 / 35 | 4599 |
| 5 | 1 | 67.7 | 85.4 | 19 / 35 | 4492 |
| 6 | 1 | 66.0 | 81.0 | 17 / 35 | 4512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 72 | 64% |
| cx.mini.Nimrod 0.55 | 27 | 74% |
| djc.DynaBot 0.1.1 | 19 | 68% |
| rdt199.Warlord 0.73 | 10 | 80% |
| uji.YellohFellah 1.0 | 8 | 88% |
| br2.MobyDickBot 1.6 | 7 | 71% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 54 | 50% | 92 |
| cx.mini.Nimrod 0.55 | 21 | 19% | 36 |
| djc.DynaBot 0.1.1 | 12 | 11% | 24 |
| br2.MobyDickBot 1.6 | 6 | 6% | 17 |
| KiraNL.Chupacabra 0.4 | 6 | 6% | 12 |
| rdt199.Warlord 0.73 | 4 | 4% | 14 |
| uji.YellohFellah 1.0 | 2 | 2% | 12 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

## Melee bench: F12

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 89.0 | 136 / 210 | 1.99 | 18.7% | 24485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.7% | 136 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.4% | 30 |
| darkcanuck.Leon 1.01 | 3.0 | 12.4% | 18 |
| nat.PallasHawk 1.0 | 3.7 | 12.5% | 19 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.0% | 2 |
| jrm.Test0 1.0 | 6.5 | 8.0% | 0 |
| jp.Perpy 16.0 | 6.8 | 7.2% | 2 |
| cs.sheldor.Talon 1.1 | 8.3 | 6.5% | 0 |
| jaybot.bots.Oddball 4.0 | 8.7 | 6.0% | 2 |
| stuff.Vlad 0.1 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 95.9 | 28 / 35 | 4038 |
| 2 | 1 | 68.3 | 89.5 | 21 / 35 | 4298 |
| 3 | 1 | 68.0 | 87.6 | 23 / 35 | 4236 |
| 4 | 1 | 67.2 | 86.0 | 21 / 35 | 3804 |
| 5 | 1 | 67.6 | 87.6 | 21 / 35 | 3972 |
| 6 | 1 | 68.1 | 87.6 | 22 / 35 | 4137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 48 | 81% |
| nat.PallasHawk 1.0 | 48 | 85% |
| darkcanuck.Leon 1.01 | 42 | 76% |
| jaybot.bots.Oddball 4.0 | 7 | 100% |
| brainfade.melee.Genghis 0.36 | 7 | 100% |
| jp.Perpy 16.0 | 5 | 100% |
| jrm.Test0 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 23 | 31% | 55 |
| darkcanuck.Leon 1.01 | 21 | 28% | 59 |
| nat.PallasHawk 1.0 | 17 | 23% | 62 |
| brainfade.melee.Genghis 0.36 | 4 | 5% | 10 |
| jrm.Test0 1.0 | 3 | 4% | 7 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 4 |
| jp.Perpy 16.0 | 2 | 3% | 4 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 8 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |

## Melee bench: F13

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.7 | 59 / 210 | 2.64 | 16.1% | 25967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 2.0 | 16.1% | 80 |
| kc.mini.Mirage 0.2 | 2.0 | 16.1% | 59 |
| ags.Glacier 0.2.11 | 2.0 | 16.4% | 45 |
| shinh.Entangled 0.3 | 4.2 | 11.9% | 18 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.3% | 9 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.4% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.0% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.4% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 85.7 | 10 / 35 | 4293 |
| 2 | 1 | 65.4 | 85.4 | 9 / 35 | 4031 |
| 3 | 2 | 64.3 | 79.0 | 9 / 35 | 4233 |
| 4 | 3 | 65.1 | 81.0 | 11 / 35 | 4171 |
| 5 | 3 | 64.1 | 78.1 | 8 / 35 | 4227 |
| 6 | 1 | 66.7 | 81.3 | 12 / 35 | 5012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 51 | 29% |
| ags.Glacier 0.2.11 | 50 | 52% |
| shinh.Entangled 0.3 | 19 | 68% |
| gh.micro.Gruweltje 0.7 | 4 | 75% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 55 | 36% | 81 |
| mn.Combat 3.25.0 | 53 | 35% | 71 |
| shinh.Entangled 0.3 | 22 | 15% | 34 |
| gh.micro.Gruweltje 0.7 | 10 | 7% | 12 |
| stelo.Wang 1.0 | 6 | 4% | 7 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F14

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 94.0 | 158 / 210 | 1.54 | 20.4% | 33281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.4% | 158 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.4% | 15 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.7% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 9.7% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 9.4% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.4% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 6.0 | 9.2% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.8% | 9 |
| pa.Improved 1.0 | 9.0 | 5.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.9 | 25 / 35 | 5683 |
| 2 | 1 | 69.7 | 91.7 | 24 / 35 | 5205 |
| 3 | 1 | 69.7 | 91.1 | 23 / 35 | 5446 |
| 4 | 1 | 71.9 | 95.6 | 29 / 35 | 5881 |
| 5 | 1 | 70.7 | 95.2 | 26 / 35 | 5353 |
| 6 | 1 | 71.5 | 95.2 | 31 / 35 | 5713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 91 | 93% |
| catcat20.shape.Theta 0.018 | 54 | 63% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 70% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 22 | 42% | 53 |
| simonton.micro.Sprout 1.1.3 | 13 | 25% | 86 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 13% | 19 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 6% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 16 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 4% | 7 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 4% | 5 |
| pa.Improved 1.0 | 0 | 0% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.7 | 117 / 210 | 2.38 | 18.8% | 32924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.8% | 117 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.5% | 19 |
| emp.Yngwie 1.11 | 3.7 | 11.8% | 36 |
| mld.DustBunny 3.8 | 3.8 | 11.3% | 7 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.8% | 8 |
| kawigi.robot.Girl 1.2 | 5.2 | 10.3% | 21 |
| Grystrion.TrackerWO 1.0 | 7.3 | 7.0% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 5.1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.3 | 20 / 35 | 5478 |
| 2 | 1 | 70.8 | 90.8 | 25 / 35 | 5908 |
| 3 | 1 | 66.6 | 79.4 | 16 / 35 | 5157 |
| 4 | 1 | 68.3 | 86.7 | 17 / 35 | 5357 |
| 5 | 1 | 68.3 | 82.9 | 19 / 35 | 5676 |
| 6 | 1 | 68.5 | 87.3 | 20 / 35 | 5348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.robot.Girl 1.2 | 31 | 81% |
| kawigi.micro.Shiz 1.1 | 30 | 93% |
| mld.DustBunny 3.8 | 25 | 88% |
| cb.nano.Insomnia 1.0 | 25 | 92% |
| emp.Yngwie 1.11 | 21 | 62% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 37 | 40% | 63 |
| kawigi.micro.Shiz 1.1 | 13 | 14% | 41 |
| cb.nano.Insomnia 1.0 | 13 | 14% | 21 |
| kawigi.robot.Girl 1.2 | 11 | 12% | 25 |
| mld.DustBunny 3.8 | 8 | 9% | 37 |
| lambdaxy.TBot 0.1 | 5 | 5% | 8 |
| divineomega.TrialBot 0.003 | 3 | 3% | 9 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 6 |

## Melee bench: F16

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.3 | 88 / 210 | 2.32 | 18.9% | 35654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.9% | 88 |
| gh.Griezel 0.5.2 | 2.0 | 16.7% | 84 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 11 |
| bvh.fnr.Fenrir 0.36l | 4.5 | 9.4% | 2 |
| techdude.forest.FlamingForest 1.1 | 4.7 | 9.8% | 20 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.3% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.4% | 1 |
| asd.Cthulhu 1.3 | 8.8 | 5.0% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.8 | 13 / 35 | 5592 |
| 2 | 1 | 67.7 | 81.0 | 12 / 35 | 5782 |
| 3 | 1 | 71.2 | 90.5 | 21 / 35 | 6349 |
| 4 | 1 | 68.7 | 85.4 | 16 / 35 | 5762 |
| 5 | 1 | 67.9 | 82.2 | 11 / 35 | 5789 |
| 6 | 1 | 70.2 | 87.9 | 15 / 35 | 6380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 97 | 40% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 96% |
| techdude.forest.FlamingForest 1.1 | 16 | 44% |
| bvh.fnr.Fenrir 0.36l | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 72 | 59% | 109 |
| techdude.forest.FlamingForest 1.1 | 15 | 12% | 22 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 11% | 28 |
| bvh.fnr.Fenrir 0.36l | 10 | 8% | 18 |
| stelo.IntrinsicVolatility 1.4 | 5 | 4% | 9 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 9 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 9 |
| asd.Cthulhu 1.3 | 2 | 2% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F17

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.6 | 138 / 210 | 1.84 | 19.9% | 33004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.9% | 138 |
| et.Predator 1.8 | 2.5 | 12.8% | 20 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.1% | 20 |
| cx.BlestPain 1.41 | 3.8 | 11.7% | 20 |
| nic.Nicator 2.4 | 5.0 | 10.4% | 8 |
| ahf.NanoAndrew .4 | 5.3 | 10.2% | 2 |
| maribo.melee.BMV 0.1 | 7.0 | 8.6% | 1 |
| tex.Longbot 0.4 | 8.3 | 6.0% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.8% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.3 | 20 / 35 | 5683 |
| 2 | 1 | 69.5 | 87.6 | 23 / 35 | 5394 |
| 3 | 1 | 70.7 | 91.4 | 23 / 35 | 5790 |
| 4 | 1 | 71.0 | 94.6 | 24 / 35 | 5566 |
| 5 | 1 | 69.9 | 90.2 | 23 / 35 | 5315 |
| 6 | 1 | 70.4 | 91.7 | 25 / 35 | 5256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 59 | 81% |
| cx.BlestPain 1.41 | 40 | 65% |
| oog.melee.Mercutio 1.0 | 36 | 78% |
| nic.Nicator 2.4 | 23 | 87% |
| ahf.NanoAndrew .4 | 10 | 90% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| tex.Longbot 0.4 | 2 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 19 | 26% | 64 |
| cx.BlestPain 1.41 | 17 | 24% | 47 |
| oog.melee.Mercutio 1.0 | 15 | 21% | 42 |
| nic.Nicator 2.4 | 6 | 8% | 28 |
| ahf.NanoAndrew .4 | 6 | 8% | 14 |
| maribo.melee.BMV 0.1 | 6 | 8% | 9 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 4% | 3 |
| tex.Longbot 0.4 | 0 | 0% | 3 |

## Melee bench: F18

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.4 | 140 / 210 | 1.86 | 19.6% | 29263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.6% | 140 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.6% | 34 |
| agd.Mooserwirt2 2.7 | 2.8 | 11.9% | 12 |
| spinnercat.Robovirus 2.718 | 4.7 | 10.1% | 6 |
| uji.DBH 1.1 | 5.0 | 10.0% | 8 |
| ratosh.Nobo 0.21 | 5.5 | 9.7% | 3 |
| sigterm.Sigterm 1.0 | 6.8 | 7.8% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.0% | 1 |
| stelo.WangRobot 1.0 | 9.3 | 5.5% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.6 | 22 / 35 | 4636 |
| 2 | 1 | 70.4 | 93.3 | 24 / 35 | 5067 |
| 3 | 1 | 68.2 | 89.5 | 20 / 35 | 4632 |
| 4 | 1 | 69.2 | 89.2 | 25 / 35 | 4938 |
| 5 | 1 | 70.3 | 92.7 | 24 / 35 | 5045 |
| 6 | 1 | 69.6 | 90.2 | 25 / 35 | 4945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 59 | 73% |
| agd.Mooserwirt2 2.7 | 30 | 87% |
| uji.DBH 1.1 | 25 | 92% |
| spinnercat.Robovirus 2.718 | 25 | 84% |
| sigterm.Sigterm 1.0 | 11 | 91% |
| stelo.WangRobot 1.0 | 11 | 82% |
| ratosh.Nobo 0.21 | 6 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 29 | 41% | 70 |
| agd.Mooserwirt2 2.7 | 12 | 17% | 48 |
| uji.DBH 1.1 | 7 | 10% | 25 |
| stelo.WangRobot 1.0 | 7 | 10% | 13 |
| spinnercat.Robovirus 2.718 | 6 | 9% | 19 |
| ratosh.Nobo 0.21 | 5 | 7% | 11 |
| sigterm.Sigterm 1.0 | 2 | 3% | 14 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 3% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 2 |

## Melee bench: F19

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 96.9 | 180 / 210 | 1.28 | 21.6% | 34316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.6% | 180 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 15.0% | 12 |
| mld.Infinity 2.2 | 2.7 | 12.9% | 12 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.7% | 3 |
| erdnis.Rover 0.3 | 4.7 | 10.4% | 1 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.8% | 0 |
| mbh.Mbh 0.1 | 7.5 | 7.0% | 0 |
| pac.ABC 2.1 | 7.8 | 6.7% | 2 |
| pbg.R2D2 1.0 | 8.7 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.6 | 28 / 35 | 5913 |
| 2 | 1 | 73.1 | 99.0 | 33 / 35 | 5766 |
| 3 | 1 | 73.5 | 99.0 | 33 / 35 | 5948 |
| 4 | 1 | 72.0 | 96.5 | 28 / 35 | 5286 |
| 5 | 1 | 72.3 | 96.2 | 28 / 35 | 5759 |
| 6 | 1 | 72.1 | 95.9 | 30 / 35 | 5644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 106 | 92% |
| mld.Infinity 2.2 | 49 | 94% |
| krillr.mini.JointStrike 2.0.0 | 14 | 86% |
| erdnis.Rover 0.3 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 9 | 100% |
| pac.ABC 2.1 | 5 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 14 | 47% | 100 |
| mld.Infinity 2.2 | 7 | 23% | 34 |
| krillr.mini.JointStrike 2.0.0 | 3 | 10% | 21 |
| patson.PatsonTestBot 1.0 | 3 | 10% | 15 |
| erdnis.Rover 0.3 | 2 | 7% | 19 |
| mbh.Mbh 0.1 | 1 | 3% | 4 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 6 |

## Melee bench: F20

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.7 | 135 / 210 | 1.66 | 20.6% | 35192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.6% | 135 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 43 |
| fwb.Nine 1.0.1 | 3.5 | 11.4% | 11 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.8% | 2 |
| catcat20.Rabbit 0.001 | 4.5 | 10.0% | 15 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.3% | 0 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 7.7% | 2 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.1% | 3 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.7 | 23 / 35 | 5769 |
| 2 | 1 | 71.6 | 94.9 | 23 / 35 | 6058 |
| 3 | 1 | 71.6 | 94.0 | 27 / 35 | 5963 |
| 4 | 1 | 70.4 | 91.4 | 23 / 35 | 5674 |
| 5 | 1 | 70.5 | 91.1 | 20 / 35 | 5972 |
| 6 | 1 | 70.4 | 91.1 | 19 / 35 | 5756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 76 | 63% |
| fwb.Nine 1.0.1 | 34 | 94% |
| catcat20.Rabbit 0.001 | 30 | 67% |
| nz.jdc.nano.GridFu 1.0 | 17 | 94% |
| bayen.nut.Squirrel 1.615 | 11 | 91% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 1039. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 44 | 58% | 77 |
| catcat20.Rabbit 0.001 | 13 | 17% | 39 |
| fwb.Nine 1.0.1 | 10 | 13% | 35 |
| nz.jdc.nano.GridFu 1.0 | 5 | 7% | 30 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 8 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 5 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F21

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.5 | 146 / 210 | 1.58 | 20.7% | 34311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.7% | 146 |
| eem.EvBot v4.6.16 | 2.2 | 15.0% | 40 |
| dummy.mini.Scimitar 1.01 | 2.8 | 14.2% | 16 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 2 |
| oa.weak.BotherBot 0.1 | 5.5 | 7.9% | 1 |
| eld.Hmm 1.0 | 6.0 | 7.6% | 5 |
| fire219.CatBot 1.0 | 6.5 | 7.2% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 1 |
| PSW.Relentless 0.1 | 9.0 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.2 | 19 / 35 | 5320 |
| 2 | 1 | 71.4 | 94.0 | 23 / 35 | 5819 |
| 3 | 1 | 71.9 | 95.9 | 30 / 35 | 5686 |
| 4 | 1 | 72.2 | 95.2 | 28 / 35 | 6099 |
| 5 | 1 | 70.4 | 92.1 | 20 / 35 | 5645 |
| 6 | 1 | 71.2 | 94.0 | 26 / 35 | 5742 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 98 | 71% |
| dummy.mini.Scimitar 1.01 | 37 | 86% |
| cf.RiO.RiOx 4.2.1 | 30 | 97% |
| eld.Hmm 1.0 | 9 | 89% |
| oa.weak.BotherBot 0.1 | 6 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 1114. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 40 | 63% | 94 |
| dummy.mini.Scimitar 1.01 | 16 | 25% | 62 |
| cf.RiO.RiOx 4.2.1 | 3 | 5% | 22 |
| eld.Hmm 1.0 | 2 | 3% | 19 |
| oa.weak.BotherBot 0.1 | 2 | 3% | 7 |
| el.JumpShoot 0.2 | 1 | 2% | 3 |
| fire219.CatBot 1.0 | 0 | 0% | 3 |

## Melee bench: F22

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.4 | 95 / 210 | 2.13 | 18.4% | 31178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.4% | 95 |
| pe.SandboxDT 2.71m | 2.2 | 15.9% | 64 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.6% | 31 |
| jlm.javaDisturbance 0.59 | 4.2 | 11.8% | 14 |
| bigpete.Stewie 1.0 | 4.8 | 10.6% | 5 |
| yk.JahRoslav 1.1 | 6.7 | 7.0% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.9% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.5% | 1 |
| pbg.NinjaX 1.2 | 8.8 | 5.2% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.6 | 18 / 35 | 4818 |
| 2 | 1 | 71.1 | 94.9 | 21 / 35 | 5722 |
| 3 | 1 | 69.1 | 88.6 | 16 / 35 | 5295 |
| 4 | 1 | 68.6 | 87.9 | 13 / 35 | 5366 |
| 5 | 1 | 67.0 | 82.9 | 14 / 35 | 4961 |
| 6 | 1 | 68.2 | 88.6 | 13 / 35 | 5016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 65 | 75% |
| pe.SandboxDT 2.71m | 50 | 22% |
| jlm.javaDisturbance 0.59 | 32 | 78% |
| bigpete.Stewie 1.0 | 7 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 60 | 52% | 83 |
| kvk.HebusLeTroll 0.35 | 25 | 22% | 57 |
| jlm.javaDisturbance 0.59 | 19 | 17% | 45 |
| bigpete.Stewie 1.0 | 5 | 4% | 10 |
| tad.Dalek98 0.98 | 4 | 3% | 6 |
| yk.JahRoslav 1.1 | 2 | 2% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 3 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

## Melee bench: F23

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.3 | 108 / 210 | 1.97 | 19.4% | 33675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 19.4% | 108 |
| pe.SandboxLump 1.52 | 1.8 | 17.7% | 73 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.4% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4.8 | 9.3% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 8.8% | 4 |
| cw.megas.Blade 0.8 | 7.0 | 8.1% | 0 |
| sample.Walls 1.0 | 7.7 | 7.5% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 92.4 | 24 / 35 | 6134 |
| 2 | 1 | 69.9 | 90.8 | 17 / 35 | 5474 |
| 3 | 1 | 70.0 | 89.2 | 18 / 35 | 5866 |
| 4 | 2 | 69.2 | 84.4 | 11 / 35 | 5682 |
| 5 | 1 | 70.2 | 89.8 | 19 / 35 | 4991 |
| 6 | 1 | 70.4 | 88.9 | 19 / 35 | 5528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 109 | 54% |
| cre.Karolos 0.32 | 24 | 83% |
| stelo.AreaTargetingBot 1.1 | 20 | 80% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| sample.Walls 1.0 | 4 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 66 | 65% | 122 |
| cre.Karolos 0.32 | 22 | 22% | 47 |
| stelo.AreaTargetingBot 1.1 | 9 | 9% | 16 |
| stelo.RamTrackSurfer 1.2 | 4 | 4% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 3 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |

## Melee bench: F24

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 78.4 | 80 / 210 | 2.95 | 15.9% | 23272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 15.9% | 80 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.1% | 33 |
| davidalves.Phoenix 0.54 | 3.0 | 13.2% | 45 |
| florent.XSeries.X2 0.12 | 3.3 | 13.4% | 34 |
| pedersen.Ugluk 1.1.1 | 5.0 | 10.8% | 6 |
| oog.melee.Corsair 1.0 | 6.2 | 9.0% | 6 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 7.7% | 5 |
| lunchie.Lunchbox 0.93 | 8.3 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 8.8 | 5.6% | 1 |
| evd.X1 0.01 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 81.3 | 14 / 35 | 3897 |
| 2 | 1 | 63.7 | 75.2 | 16 / 35 | 3719 |
| 3 | 1 | 65.9 | 82.5 | 15 / 35 | 4124 |
| 4 | 1 | 64.2 | 77.1 | 15 / 35 | 3979 |
| 5 | 3 | 62.0 | 74.3 | 6 / 35 | 3686 |
| 6 | 1 | 64.7 | 79.7 | 14 / 35 | 3867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 34 | 50% |
| rz.GlowBlowMelee 1.4 | 30 | 70% |
| florent.XSeries.X2 0.12 | 26 | 58% |
| pedersen.Ugluk 1.1.1 | 17 | 94% |
| stelo.SoJNanoMelee 1.1 | 9 | 89% |
| oog.melee.Corsair 1.0 | 5 | 60% |

Hadur died in 130 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 35 | 27% | 44 |
| florent.XSeries.X2 0.12 | 32 | 25% | 49 |
| rz.GlowBlowMelee 1.4 | 31 | 24% | 50 |
| pedersen.Ugluk 1.1.1 | 11 | 8% | 26 |
| stelo.SoJNanoMelee 1.1 | 8 | 6% | 11 |
| oog.melee.Corsair 1.0 | 7 | 5% | 17 |
| evd.X1 0.01 | 4 | 3% | 6 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 4 |
| as.FrankTheTank 1.3 | 0 | 0% | 3 |

## Melee bench: F25

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.8 | 149 / 210 | 2.00 | 19.4% | 27207 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.4% | 149 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.0% | 19 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.2% | 9 |
| jdw.Hurricane 1.4 | 3.7 | 11.3% | 16 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.1% | 2 |
| ds.Oo 2.2 | 5.8 | 8.9% | 7 |
| gjr.Cephalosporin 0.1 | 7.0 | 7.8% | 6 |
| awesomeness.Elite 1.0 | 8.2 | 6.6% | 2 |
| adt.Ar2 1.1 | 8.5 | 6.6% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.7 | 24 / 35 | 4494 |
| 2 | 1 | 69.3 | 89.5 | 24 / 35 | 4533 |
| 3 | 1 | 70.5 | 91.7 | 28 / 35 | 5029 |
| 4 | 1 | 69.5 | 90.8 | 26 / 35 | 4397 |
| 5 | 1 | 68.5 | 87.3 | 23 / 35 | 4333 |
| 6 | 1 | 68.8 | 87.0 | 24 / 35 | 4421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 61 | 89% |
| voidious.micro.BlitzBat 1.05 | 46 | 91% |
| jdw.Hurricane 1.4 | 36 | 89% |
| gjr.Cephalosporin 0.1 | 9 | 100% |
| gre.svman4.Morfeas 1.4.1 | 5 | 80% |
| ds.Oo 2.2 | 3 | 100% |
| adt.Ar2 1.1 | 3 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 17 | 28% | 67 |
| jdw.Hurricane 1.4 | 15 | 25% | 49 |
| voidious.micro.BlitzBat 1.05 | 13 | 21% | 44 |
| ds.Oo 2.2 | 6 | 10% | 14 |
| awesomeness.Elite 1.0 | 4 | 7% | 8 |
| adt.Ar2 1.1 | 3 | 5% | 7 |
| gre.svman4.Morfeas 1.4.1 | 2 | 3% | 12 |
| amk.ChumbaMini 0.2 | 1 | 2% | 2 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 7 |

## Melee bench: F26

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.7 | 119 / 210 | 2.01 | 19.0% | 32534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.0% | 119 |
| ak.Fermat 2.0 | 2.0 | 15.6% | 42 |
| shu.nitro.LENIN .T34 | 3.3 | 12.3% | 30 |
| lrem.Spectre 0.4.4 | 3.7 | 11.7% | 12 |
| js.PinBall 1.6 | 5.5 | 9.8% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.4% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.2% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.3% | 0 |
| sample.SpinBot 1.0 | 8.8 | 5.3% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.0 | 22 / 35 | 5718 |
| 2 | 1 | 68.7 | 87.6 | 18 / 35 | 5459 |
| 3 | 1 | 70.3 | 91.1 | 24 / 35 | 5579 |
| 4 | 1 | 69.8 | 89.5 | 19 / 35 | 5530 |
| 5 | 1 | 67.5 | 83.2 | 16 / 35 | 5245 |
| 6 | 1 | 68.5 | 87.9 | 20 / 35 | 5003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 51 | 63% |
| shu.nitro.LENIN .T34 | 48 | 73% |
| lrem.Spectre 0.4.4 | 34 | 76% |
| js.PinBall 1.6 | 11 | 91% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 67% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 38 | 42% | 72 |
| shu.nitro.LENIN .T34 | 19 | 21% | 58 |
| lrem.Spectre 0.4.4 | 13 | 14% | 31 |
| gh.mini.GrubbmOne 1.0 | 7 | 8% | 12 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 4% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 4% | 8 |
| sample.SpinBot 1.0 | 4 | 4% | 4 |
| js.PinBall 1.6 | 2 | 2% | 9 |

## Melee bench: F27

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 93.8 | 160 / 210 | 1.56 | 20.3% | 29572 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.3% | 160 |
| mk.Alpha 0.2.1 | 2.0 | 13.5% | 28 |
| wee.Gem 1.8.4 | 3.8 | 10.6% | 11 |
| EH.Eagle 1.0.6 | 4.3 | 10.2% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 10.4% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 7.0 | 7.9% | 1 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.0% | 2 |
| joe.ADinosaur 1.0 | 7.7 | 7.1% | 1 |
| caimano.Furia_Ceca 0.22 | 8.2 | 7.1% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.8 | 23 / 35 | 4905 |
| 2 | 1 | 68.9 | 92.1 | 27 / 35 | 4229 |
| 3 | 1 | 71.6 | 97.5 | 29 / 35 | 5324 |
| 4 | 1 | 71.2 | 95.6 | 30 / 35 | 5112 |
| 5 | 1 | 70.4 | 93.3 | 27 / 35 | 5272 |
| 6 | 1 | 69.8 | 93.7 | 24 / 35 | 4730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 81 | 78% |
| wee.Gem 1.8.4 | 38 | 89% |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 100% |
| EH.Eagle 1.0.6 | 20 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| throxbot.ThroxBot 0.1 | 5 | 80% |
| joe.ADinosaur 1.0 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |

Hadur died in 50 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 24 | 48% | 87 |
| throxbot.ThroxBot 0.1 | 6 | 12% | 11 |
| wee.Gem 1.8.4 | 5 | 10% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 8% | 31 |
| EH.Eagle 1.0.6 | 4 | 8% | 28 |
| joe.ADinosaur 1.0 | 3 | 6% | 6 |
| caimano.Furia_Ceca 0.22 | 3 | 6% | 6 |
| cs.Grudge 1.0 | 1 | 2% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 3 |

## Melee bench: F28

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 91.3 | 148 / 210 | 1.79 | 19.2% | 26164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.2% | 148 |
| kid.test.NightFox .2 | 2.0 | 14.5% | 25 |
| uji.Antique 1.0 | 3.7 | 11.2% | 25 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.0% | 8 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.2% | 3 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.0% | 1 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.0% | 1 |
| matt.advanced.Katana 1.0 | 8.3 | 6.5% | 0 |
| stelo.PianistNano 1.2 | 9.2 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 96.2 | 29 / 35 | 4711 |
| 2 | 1 | 67.9 | 89.2 | 22 / 35 | 4080 |
| 3 | 1 | 69.6 | 94.9 | 29 / 35 | 3984 |
| 4 | 1 | 68.4 | 87.6 | 24 / 35 | 4631 |
| 5 | 1 | 68.2 | 90.5 | 21 / 35 | 4273 |
| 6 | 1 | 68.7 | 89.2 | 23 / 35 | 4485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 89 | 87% |
| uji.Antique 1.0 | 40 | 75% |
| qohnil.blot.BlotBot 3.61 | 15 | 93% |
| pfvicm.Sobieski 7.2.3b | 13 | 100% |
| ahr.ice.Ice 1.0.2 | 6 | 100% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 24 | 38% | 90 |
| uji.Antique 1.0 | 15 | 24% | 40 |
| qohnil.blot.BlotBot 3.61 | 7 | 11% | 29 |
| amk.ChumbaWumba 0.3 | 7 | 11% | 12 |
| pfvicm.Sobieski 7.2.3b | 5 | 8% | 16 |
| stelo.Lifestealer 1.0 | 2 | 3% | 6 |
| stelo.PianistNano 1.2 | 2 | 3% | 5 |
| ahr.ice.Ice 1.0.2 | 0 | 0% | 10 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F29

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.3 | 131 / 210 | 1.97 | 19.6% | 29497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.6% | 131 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.0% | 44 |
| deewiant.Anomaly 0.2 | 3.3 | 13.5% | 24 |
| myl.micro.Troodon 1.10 | 3.8 | 11.7% | 1 |
| jok.PheonixM 0.1.2 | 4.8 | 9.9% | 3 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.1% | 1 |
| DBall.Anarchy 0.1 | 6.8 | 7.4% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.2% | 0 |
| jangs.ns51 1.0 | 9.2 | 4.3% | 0 |
| ap.Frederick 1.1 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.5 | 18 / 35 | 5018 |
| 2 | 1 | 70.8 | 91.7 | 25 / 35 | 4911 |
| 3 | 1 | 66.9 | 80.6 | 16 / 35 | 4512 |
| 4 | 1 | 69.2 | 87.0 | 22 / 35 | 4800 |
| 5 | 1 | 70.9 | 93.0 | 26 / 35 | 5003 |
| 6 | 1 | 71.1 | 93.7 | 24 / 35 | 5253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 63 | 79% |
| zyx.mega.YersiniaPestis 3.1 | 51 | 65% |
| myl.micro.Troodon 1.10 | 24 | 100% |
| jok.PheonixM 0.1.2 | 14 | 86% |
| DBall.Anarchy 0.1 | 7 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 50% |
| ap.Frederick 1.1 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 29 | 36% | 59 |
| deewiant.Anomaly 0.2 | 27 | 34% | 81 |
| myl.micro.Troodon 1.10 | 8 | 10% | 28 |
| jok.PheonixM 0.1.2 | 8 | 10% | 18 |
| ph.melee.ArcherME 0.3 | 4 | 5% | 6 |
| jangs.ns51 1.0 | 2 | 3% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 3% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 12 |

## Melee bench: F30

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 78.7 | 68 / 210 | 2.92 | 15.9% | 24476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 15.9% | 68 |
| catcat20.Matcha 0.006 | 2.8 | 13.3% | 44 |
| darkcanuck.B26354 1.06 | 3.0 | 13.4% | 42 |
| oog.melee.Capulet 1.2 | 4.0 | 12.3% | 24 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.1% | 21 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.3% | 8 |
| ntc.Opposite 1.5 | 7.7 | 7.6% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 6.9% | 2 |
| tripphippy.Alice 1.1 | 8.2 | 6.4% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 83.8 | 11 / 35 | 4386 |
| 2 | 1 | 63.2 | 74.6 | 9 / 35 | 4046 |
| 3 | 1 | 62.6 | 74.3 | 9 / 35 | 3719 |
| 4 | 1 | 65.0 | 80.6 | 14 / 35 | 3868 |
| 5 | 1 | 65.4 | 80.6 | 13 / 35 | 4296 |
| 6 | 1 | 64.3 | 78.1 | 12 / 35 | 4161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 36 | 53% |
| oog.melee.Capulet 1.2 | 26 | 69% |
| darkcanuck.B26354 1.06 | 24 | 38% |
| stelo.PastFuture 2.3.2 | 14 | 64% |
| intruder.PrairieWolf 2.61 | 8 | 88% |
| tripphippy.Alice 1.1 | 4 | 75% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 45 | 32% | 58 |
| catcat20.Matcha 0.006 | 33 | 23% | 50 |
| stelo.PastFuture 2.3.2 | 24 | 17% | 28 |
| oog.melee.Capulet 1.2 | 21 | 15% | 40 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 4% | 9 |
| intruder.PrairieWolf 2.61 | 5 | 4% | 13 |
| tripphippy.Alice 1.1 | 5 | 4% | 8 |
| ntc.Opposite 1.5 | 3 | 2% | 3 |

## Melee bench: F31

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 79.9 | 63 / 210 | 2.81 | 16.2% | 23776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.1% | 86 |
| kc.mini.Mirage 0.2 | 1.7 | 16.2% | 63 |
| gh.mini.Griezel 0.2 | 3.0 | 13.2% | 43 |
| d414.nano.Quantum 1.0.0 | 4.5 | 10.6% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.2% | 9 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.3% | 1 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.9% | 1 |
| fm.mammillarias 1.3 | 8.2 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.6% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 78.1 | 9 / 35 | 3785 |
| 2 | 2 | 64.6 | 80.0 | 10 / 35 | 3827 |
| 3 | 2 | 66.0 | 83.8 | 15 / 35 | 3989 |
| 4 | 2 | 64.7 | 78.7 | 10 / 35 | 3854 |
| 5 | 1 | 66.0 | 83.2 | 10 / 35 | 4261 |
| 6 | 1 | 63.4 | 75.6 | 9 / 35 | 4060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 54 | 39% |
| gh.mini.Griezel 0.2 | 44 | 39% |
| spinnercat.micro.Tyger 0.1 | 12 | 67% |
| d414.nano.Quantum 1.0.0 | 11 | 82% |
| timmit.nano.TimDog 0.33 | 4 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 57 | 39% | 78 |
| gh.mini.Griezel 0.2 | 40 | 27% | 61 |
| spinnercat.micro.Tyger 0.1 | 19 | 13% | 23 |
| d414.nano.Quantum 1.0.0 | 12 | 8% | 21 |
| fm.mammillarias 1.3 | 9 | 6% | 10 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 6 |
| gh.nano.Grofvuil 0.2 | 3 | 2% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 89.2 | 125 / 210 | 1.98 | 19.0% | 30072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.0% | 125 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.6% | 58 |
| apc.botM 3.0 | 3.7 | 11.6% | 8 |
| lxx.ConceptA 0.8 | 3.7 | 11.2% | 8 |
| vjik.UnViolation 1.1 | 5.2 | 9.7% | 6 |
| bayen.UbaMicro 1.4 | 5.7 | 9.3% | 3 |
| yk.JahMicro 1.0 | 7.8 | 6.6% | 2 |
| panzer.Panzer 0.2 | 7.8 | 6.9% | 0 |
| conscience.Electron 1.3g | 8.2 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 83.5 | 16 / 35 | 4696 |
| 2 | 1 | 68.1 | 88.3 | 21 / 35 | 4674 |
| 3 | 1 | 70.1 | 95.2 | 23 / 35 | 5186 |
| 4 | 1 | 69.6 | 92.4 | 23 / 35 | 5191 |
| 5 | 1 | 68.8 | 86.3 | 23 / 35 | 5288 |
| 6 | 1 | 68.6 | 89.2 | 19 / 35 | 5037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 79 | 52% |
| lxx.ConceptA 0.8 | 33 | 88% |
| apc.botM 3.0 | 25 | 92% |
| bayen.UbaMicro 1.4 | 9 | 100% |
| vjik.UnViolation 1.1 | 8 | 100% |
| yk.JahMicro 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| panzer.Panzer 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 50 | 58% | 91 |
| lxx.ConceptA 0.8 | 13 | 15% | 30 |
| apc.botM 3.0 | 7 | 8% | 36 |
| conscience.Electron 1.3g | 6 | 7% | 7 |
| bayen.UbaMicro 1.4 | 5 | 6% | 14 |
| vjik.UnViolation 1.1 | 3 | 3% | 17 |
| yk.JahMicro 1.0 | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 6 |
| panzer.Panzer 0.2 | 0 | 0% | 2 |

## Melee bench: F33

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.4 | 140 / 210 | 1.96 | 19.9% | 31966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.9% | 140 |
| maribo.Quester 0.3 | 2.0 | 15.3% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 11.9% | 8 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.1% | 10 |
| labg.Cataclysm 2.05 | 4.8 | 10.1% | 9 |
| baal.nano.N 1.42 | 6.2 | 8.6% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.0% | 2 |
| zyx.micro.Ant 1.1 | 8.3 | 6.0% | 0 |
| sanja.First 0.1 | 8.7 | 5.1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.6 | 19 / 35 | 4800 |
| 2 | 1 | 69.1 | 84.8 | 20 / 35 | 5342 |
| 3 | 1 | 69.5 | 86.3 | 23 / 35 | 5076 |
| 4 | 1 | 71.1 | 93.0 | 26 / 35 | 5536 |
| 5 | 1 | 70.5 | 89.8 | 27 / 35 | 5395 |
| 6 | 1 | 72.0 | 94.6 | 25 / 35 | 5817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 57 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 90% |
| gre.svman4.Leonidas 1.3.2 | 41 | 93% |
| labg.Cataclysm 2.05 | 11 | 73% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| baal.nano.N 1.42 | 5 | 80% |
| sanja.First 0.1 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 27 | 38% | 74 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 17% | 52 |
| labg.Cataclysm 2.05 | 9 | 13% | 23 |
| gre.svman4.Leonidas 1.3.2 | 7 | 10% | 29 |
| zyx.micro.Ant 1.1 | 6 | 8% | 7 |
| baal.nano.N 1.42 | 4 | 6% | 10 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 6% | 8 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 3% | 2 |
| sanja.First 0.1 | 0 | 0% | 5 |

## Melee bench: F34

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.8 | 107 / 210 | 2.01 | 18.9% | 31508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.9% | 107 |
| kid.Gladiator .7.2 | 2.2 | 15.9% | 36 |
| stelo.Spread 0.9 | 2.8 | 15.3% | 50 |
| jcs.Seth 1.8 | 4.5 | 11.0% | 11 |
| tcf.Reach 3 | 4.8 | 10.4% | 4 |
| cli.Dancer 1.1 | 5.7 | 9.4% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.6 | 21 / 35 | 5289 |
| 2 | 1 | 68.7 | 86.0 | 14 / 35 | 5015 |
| 3 | 1 | 70.3 | 92.7 | 18 / 35 | 5219 |
| 4 | 1 | 68.8 | 87.3 | 14 / 35 | 5388 |
| 5 | 1 | 70.3 | 89.8 | 23 / 35 | 5097 |
| 6 | 1 | 69.4 | 88.3 | 17 / 35 | 5500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 84 | 69% |
| kid.Gladiator .7.2 | 51 | 53% |
| jcs.Seth 1.8 | 14 | 79% |
| tcf.Reach 3 | 7 | 86% |
| amk.Punbot.Punbot 0.01 | 3 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 45 | 44% | 101 |
| kid.Gladiator .7.2 | 37 | 36% | 59 |
| tcf.Reach 3 | 8 | 8% | 15 |
| jcs.Seth 1.8 | 6 | 6% | 19 |
| ratosh.Wesco 1.4 | 4 | 4% | 5 |
| cli.Dancer 1.1 | 3 | 3% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F35

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 80.7 | 39 / 210 | 2.73 | 15.4% | 21539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.8% | 144 |
| kc.mini.Mirage 0.2 | 2.0 | 15.4% | 39 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.8% | 19 |
| rz.HawkOnFire 0.1 | 4.3 | 11.5% | 2 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.5% | 5 |
| wit.Chuliath 1.0 | 6.7 | 6.8% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 84.1 | 7 / 35 | 3482 |
| 2 | 2 | 64.8 | 81.6 | 8 / 35 | 3604 |
| 3 | 2 | 65.7 | 84.8 | 9 / 35 | 3860 |
| 4 | 2 | 63.8 | 76.5 | 6 / 35 | 3889 |
| 5 | 2 | 63.4 | 79.4 | 7 / 35 | 3318 |
| 6 | 2 | 62.5 | 78.1 | 2 / 35 | 3386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 88 | 11% |
| gh.mini.Gruwel 0.9 | 17 | 41% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 91% |
| rz.HawkOnFire 0.1 | 9 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 100% |
| wit.Chuliath 1.0 | 1 | 0% |

Hadur died in 171 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 99 | 58% | 106 |
| gh.mini.Gruwel 0.9 | 35 | 20% | 43 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 10% | 31 |
| rz.HawkOnFire 0.1 | 12 | 7% | 19 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 5 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |

## Melee bench: F36

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.4 | 173 / 210 | 1.50 | 21.8% | 35986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.8% | 173 |
| bzdp.Pansy 2.1 | 2.2 | 12.3% | 11 |
| alpha.RainingFire 1.0 | 2.8 | 11.7% | 10 |
| bvh.micro.Freya 0.3 | 4.0 | 10.5% | 6 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.3% | 3 |
| mz.Cork 0.1 | 6.0 | 9.3% | 2 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.3% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 5.0% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.7 | 26 / 35 | 5774 |
| 2 | 1 | 71.4 | 90.5 | 29 / 35 | 6007 |
| 3 | 1 | 72.8 | 94.9 | 30 / 35 | 6254 |
| 4 | 1 | 71.8 | 94.9 | 28 / 35 | 5721 |
| 5 | 1 | 72.7 | 96.5 | 31 / 35 | 6040 |
| 6 | 1 | 72.6 | 96.2 | 29 / 35 | 6190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 95% |
| bvh.micro.Freya 0.3 | 32 | 94% |
| bvh.mini.Fenrir 0.39 | 25 | 96% |
| alpha.RainingFire 1.0 | 23 | 78% |
| mz.Cork 0.1 | 22 | 95% |
| m3thos.Eva02 0.7.1 | 16 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 9 | 24% | 76 |
| bvh.micro.Freya 0.3 | 9 | 24% | 27 |
| alpha.RainingFire 1.0 | 7 | 19% | 25 |
| mz.Cork 0.1 | 4 | 11% | 21 |
| m3thos.Eva02 0.7.1 | 3 | 8% | 20 |
| bvh.mini.Fenrir 0.39 | 2 | 5% | 15 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 3 |
| sample.MyFirstRobot 1.0 | 1 | 3% | 12 |
| dl.BetterWalls 1.0 | 0 | 0% | 9 |

## Melee bench: F37

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 92.3 | 176 / 210 | 1.70 | 20.4% | 35143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.4% | 176 |
| germ.TheMind .2 | 2.3 | 10.8% | 5 |
| EBBU.Sim2 1.02 | 3.8 | 9.9% | 4 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.3 | 9.7% | 4 |
| stelo.UntouchableNano 1.3 | 5.7 | 9.0% | 10 |
| agrach.Dalek 1.0 | 6.3 | 8.6% | 3 |
| mb.Beast 0.1 | 7.0 | 8.0% | 3 |
| lmk.ACPFinal 0.1 | 7.0 | 8.4% | 2 |
| skm.Ryubot 1.0 | 8.5 | 7.6% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 7.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.6 | 23 / 35 | 4867 |
| 2 | 1 | 71.0 | 96.5 | 31 / 35 | 6140 |
| 3 | 1 | 70.1 | 91.4 | 29 / 35 | 6176 |
| 4 | 1 | 69.8 | 92.7 | 30 / 35 | 5755 |
| 5 | 1 | 70.1 | 93.7 | 31 / 35 | 5744 |
| 6 | 1 | 71.7 | 97.8 | 32 / 35 | 6461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 40 | 100% |
| stelo.UntouchableNano 1.3 | 30 | 80% |
| skm.Ryubot 1.0 | 29 | 97% |
| EBBU.Sim2 1.02 | 29 | 97% |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 100% |
| lmk.ACPFinal 0.1 | 14 | 100% |
| agrach.Dalek 1.0 | 14 | 100% |
| mb.Beast 0.1 | 11 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 9 | 26% | 29 |
| EBBU.Sim2 1.02 | 6 | 17% | 36 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 17% | 7 |
| lmk.ACPFinal 0.1 | 4 | 11% | 24 |
| germ.TheMind .2 | 3 | 9% | 34 |
| skm.Ryubot 1.0 | 3 | 9% | 14 |
| agrach.Dalek 1.0 | 2 | 6% | 28 |
| com.syncleus.robocode.Dreadnaught 0.1 | 1 | 3% | 22 |
| mb.Beast 0.1 | 1 | 3% | 13 |

## Melee bench: F38

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.6 | 117 / 210 | 2.11 | 18.4% | 27798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.4% | 117 |
| justin.Mallais 14.0 | 2.0 | 15.4% | 55 |
| bvh.mini.Freya 0.55 | 3.2 | 12.8% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 10.6% | 7 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.3% | 10 |
| cs.Wren 1.0 | 5.5 | 9.9% | 4 |
| kdf.KoulDestroyer 1.0 | 6.5 | 8.8% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.9% | 1 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.4 | 19 / 35 | 4649 |
| 2 | 1 | 67.5 | 87.9 | 18 / 35 | 4349 |
| 3 | 1 | 70.0 | 91.1 | 23 / 35 | 4913 |
| 4 | 1 | 68.6 | 90.2 | 18 / 35 | 4658 |
| 5 | 1 | 69.2 | 90.8 | 20 / 35 | 4764 |
| 6 | 1 | 66.2 | 80.3 | 19 / 35 | 4465 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 63 | 60% |
| bvh.mini.Freya 0.55 | 28 | 89% |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 78% |
| bts.mega.Gnarly 1.4 | 17 | 88% |
| cs.Wren 1.0 | 16 | 88% |
| kdf.KoulDestroyer 1.0 | 8 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 44 | 47% | 87 |
| cs.Wren 1.0 | 13 | 14% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 12% | 28 |
| bvh.mini.Freya 0.55 | 10 | 11% | 27 |
| bts.mega.Gnarly 1.4 | 8 | 9% | 26 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 10 |
| kdf.KoulDestroyer 1.0 | 3 | 3% | 8 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

## Melee bench: F39

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.3 | 105 / 210 | 2.14 | 18.4% | 30046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.4% | 105 |
| bvh.fry.Freya 0.82 | 2.0 | 14.6% | 29 |
| az.Ololobot 0.2.4 | 3.2 | 12.5% | 49 |
| catcat20.Lambda 0.024 | 3.8 | 10.7% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.1% | 7 |
| gimp.GimpBot 0.1 | 6.3 | 8.1% | 0 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 8.1% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.5% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 83.2 | 14 / 35 | 4657 |
| 2 | 1 | 68.4 | 87.6 | 22 / 35 | 5070 |
| 3 | 1 | 68.6 | 89.8 | 19 / 35 | 5071 |
| 4 | 1 | 68.5 | 89.8 | 16 / 35 | 5141 |
| 5 | 1 | 68.7 | 89.5 | 17 / 35 | 5221 |
| 6 | 1 | 66.4 | 83.8 | 17 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 45 | 76% |
| az.Ololobot 0.2.4 | 43 | 44% |
| catcat20.Lambda 0.024 | 42 | 64% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 92% |
| gimp.GimpBot 0.1 | 6 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 34 | 32% | 66 |
| az.Ololobot 0.2.4 | 34 | 32% | 60 |
| catcat20.Lambda 0.024 | 21 | 20% | 41 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 9% | 14 |
| apollokidd.ApolloKidd 0.9 | 5 | 5% | 6 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 10 |
| gimp.GimpBot 0.1 | 1 | 1% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

## Melee bench: F40

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.2 | 133 / 210 | 1.89 | 19.7% | 30975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.7% | 133 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 38 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.3% | 15 |
| mz.AntiGrav 1.0 | 4.5 | 10.4% | 8 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.4% | 3 |
| stelo.Randomness 1.0 | 6.0 | 9.2% | 11 |
| alpha.BlackIce 1.0 | 6.8 | 8.0% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.5 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.4% | 0 |
| sample.Corners 1.0 | 9.7 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.4 | 20 / 35 | 4890 |
| 2 | 1 | 70.7 | 92.4 | 25 / 35 | 5443 |
| 3 | 1 | 70.4 | 92.1 | 23 / 35 | 5200 |
| 4 | 1 | 69.4 | 89.8 | 20 / 35 | 5038 |
| 5 | 1 | 69.8 | 91.4 | 23 / 35 | 5175 |
| 6 | 1 | 69.8 | 89.8 | 22 / 35 | 5229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 70 | 66% |
| kano.gamma.KanoGamma 1.8 | 41 | 76% |
| mz.AntiGrav 1.0 | 23 | 87% |
| Polkwane.SmashMelee 1.0 | 18 | 94% |
| stelo.Randomness 1.0 | 11 | 73% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 32 | 42% | 61 |
| kano.gamma.KanoGamma 1.8 | 14 | 18% | 53 |
| Polkwane.SmashMelee 1.0 | 7 | 9% | 23 |
| mz.AntiGrav 1.0 | 6 | 8% | 25 |
| stelo.Randomness 1.0 | 5 | 6% | 21 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 9 |
| alpha.BlackIce 1.0 | 4 | 5% | 8 |
| testantiswapgun.AntiSwap 1.0 | 3 | 4% | 4 |
| sample.Corners 1.0 | 2 | 3% | 4 |

## Melee bench: F41

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.7 | 123 / 210 | 2.02 | 18.8% | 28092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.8% | 123 |
| eem.EvBotNG v12.8 | 2.0 | 15.8% | 61 |
| ary.Swarm 1.1 | 3.2 | 13.1% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.0% | 10 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.8% | 6 |
| shrub.Silver v048 | 6.0 | 9.3% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.2% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.3 | 17 / 35 | 4616 |
| 2 | 1 | 68.1 | 86.3 | 20 / 35 | 4275 |
| 3 | 1 | 70.3 | 92.7 | 22 / 35 | 4880 |
| 4 | 1 | 69.5 | 89.2 | 24 / 35 | 4874 |
| 5 | 1 | 68.7 | 86.7 | 19 / 35 | 4662 |
| 6 | 1 | 69.5 | 89.8 | 21 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 70 | 51% |
| ary.Swarm 1.1 | 40 | 93% |
| lessonz.robocode.Oz 0.5.0 | 26 | 96% |
| simonton.nano.MeleeSeed 1.8 | 18 | 100% |
| shrub.Silver v048 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 52 | 59% | 92 |
| ary.Swarm 1.1 | 11 | 13% | 43 |
| lessonz.robocode.Oz 0.5.0 | 10 | 11% | 30 |
| zyx.nano.Ant 1.1 | 6 | 7% | 6 |
| simonton.nano.MeleeSeed 1.8 | 5 | 6% | 22 |
| stelo.Mirror 1.1 | 2 | 2% | 4 |
| shrub.Silver v048 | 1 | 1% | 9 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |

## Melee bench: F42

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.6 | 118 / 210 | 1.93 | 19.3% | 32912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.3% | 118 |
| wompi.Wallaby 5.1 | 2.3 | 14.7% | 32 |
| ara.Shera 0.88 | 3.2 | 13.5% | 36 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.3% | 21 |
| amz.NanoClone 1.41 | 5.0 | 9.0% | 2 |
| maribo.IotaCT 1.1 | 6.3 | 7.1% | 0 |
| dsw.StaticD 1.0 | 7.3 | 6.6% | 1 |
| stelo.MirrorMicro 1.0 | 7.8 | 6.2% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.6 | 18 / 35 | 5807 |
| 2 | 1 | 68.5 | 87.9 | 18 / 35 | 5261 |
| 3 | 1 | 71.1 | 94.0 | 26 / 35 | 5833 |
| 4 | 1 | 69.3 | 90.2 | 19 / 35 | 5341 |
| 5 | 1 | 69.7 | 90.8 | 21 / 35 | 5364 |
| 6 | 1 | 68.3 | 86.3 | 16 / 35 | 5306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 55 | 65% |
| maribo.mini.MiniQuester 0.1 | 46 | 80% |
| wompi.Wallaby 5.1 | 43 | 84% |
| dsw.StaticD 1.0 | 5 | 80% |
| amz.NanoClone 1.41 | 4 | 75% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 50% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 34 | 37% | 58 |
| wompi.Wallaby 5.1 | 28 | 30% | 73 |
| maribo.mini.MiniQuester 0.1 | 21 | 23% | 57 |
| amz.NanoClone 1.41 | 5 | 5% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 2% | 3 |
| dsw.StaticD 1.0 | 1 | 1% | 7 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F43

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 82.0 | 32 / 210 | 2.62 | 15.9% | 23651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.2% | 155 |
| kc.mini.Mirage 0.2 | 2.0 | 15.9% | 32 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.0% | 18 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.2% | 2 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.3% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.3% | 0 |
| jab.DiamondStealer 5 | 7.0 | 7.9% | 0 |
| mz.NanoGod 2.02 | 8.0 | 6.7% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.8% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 85.7 | 8 / 35 | 4360 |
| 2 | 2 | 64.7 | 80.6 | 2 / 35 | 3720 |
| 3 | 2 | 65.6 | 82.5 | 5 / 35 | 3797 |
| 4 | 2 | 65.1 | 80.3 | 6 / 35 | 3864 |
| 5 | 2 | 65.3 | 80.3 | 4 / 35 | 3956 |
| 6 | 2 | 66.1 | 82.5 | 7 / 35 | 3954 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 114 | 11% |
| brainfade.melee.Dusk 0.44 | 14 | 71% |
| dummy.micro.Sparrow 2.5 | 7 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 124 | 70% | 139 |
| brainfade.melee.Dusk 0.44 | 20 | 11% | 29 |
| dummy.micro.Sparrow 2.5 | 14 | 8% | 21 |
| wcsv.melee.EngineerMelee 0.1 | 9 | 5% | 10 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 4 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
| mz.NanoGod 2.02 | 2 | 1% | 2 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.7 | 130 / 210 | 1.74 | 20.4% | 34458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.4% | 130 |
| stelo.Liblix 0.3.1 | 2.3 | 14.7% | 50 |
| tzu.TheArtOfWar 1.2 | 2.7 | 13.8% | 27 |
| wompi.Quokka 1.6 | 4.7 | 9.7% | 0 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.0% | 1 |
| jwirde.Gort 2.0 | 5.3 | 8.8% | 1 |
| disan.Chair 2.2.0 | 7.2 | 7.1% | 1 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.8% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 93.0 | 22 / 35 | 5536 |
| 2 | 1 | 71.1 | 92.4 | 23 / 35 | 6102 |
| 3 | 1 | 71.6 | 92.7 | 23 / 35 | 6147 |
| 4 | 1 | 70.7 | 92.4 | 23 / 35 | 5583 |
| 5 | 1 | 69.9 | 91.1 | 22 / 35 | 5363 |
| 6 | 1 | 69.7 | 88.9 | 17 / 35 | 5727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 82 | 60% |
| tzu.TheArtOfWar 1.2 | 59 | 69% |
| wompi.Quokka 1.6 | 10 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| disan.Chair 2.2.0 | 6 | 83% |
| jwirde.Gort 2.0 | 5 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| stf.PanzerGeneral 0.1 | 4 | 100% |
| amk.jointstrike.JointStrike 0.2 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 42 | 53% | 98 |
| tzu.TheArtOfWar 1.2 | 28 | 35% | 65 |
| disan.Chair 2.2.0 | 4 | 5% | 12 |
| wompi.Quokka 1.6 | 4 | 5% | 11 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 6 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |
| jwirde.Gort 2.0 | 0 | 0% | 8 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 0 | 0% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

## Melee bench: F45

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.5 | 98 / 210 | 2.04 | 20.0% | 36024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.0% | 98 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.4% | 92 |
| jje.BagPuss 1.2 | 2.8 | 11.4% | 4 |
| myl.nano.Graviton 1.10 | 4.2 | 10.5% | 2 |
| sul.Lunar 1.1 | 5.0 | 10.1% | 6 |
| fm.claire 1.7 | 6.5 | 8.9% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.4% | 5 |
| hvilela.HVilela 0.9 | 7.2 | 8.4% | 1 |
| wit.Deep7 2.0 | 9.3 | 5.5% | 1 |
| abud.ThirdRobo 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.3 | 16 / 35 | 6194 |
| 2 | 1 | 70.6 | 91.1 | 17 / 35 | 6153 |
| 3 | 1 | 70.1 | 89.2 | 20 / 35 | 5824 |
| 4 | 1 | 69.6 | 88.6 | 19 / 35 | 5756 |
| 5 | 1 | 68.6 | 85.1 | 16 / 35 | 5721 |
| 6 | 1 | 70.0 | 89.5 | 10 / 35 | 6376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 104 | 33% |
| jje.BagPuss 1.2 | 17 | 82% |
| sul.Lunar 1.1 | 16 | 94% |
| myl.nano.Graviton 1.10 | 15 | 87% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 88% |
| wit.Deep7 2.0 | 8 | 88% |
| fm.claire 1.7 | 5 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 71 | 63% | 0 |
| myl.nano.Graviton 1.10 | 12 | 11% | 40 |
| jje.BagPuss 1.2 | 11 | 10% | 61 |
| sul.Lunar 1.1 | 5 | 4% | 52 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 21 |
| fm.claire 1.7 | 4 | 4% | 12 |
| wit.Deep7 2.0 | 2 | 2% | 11 |
| hvilela.HVilela 0.9 | 2 | 2% | 9 |

## Melee bench: F46

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.8 | 61 / 210 | 2.46 | 16.8% | 27425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.8% | 61 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.3% | 76 |
| hadur117.mini.Deise 0.4 | 2.2 | 16.3% | 66 |
| mz.MicroSheep 1.0 | 4.2 | 10.3% | 3 |
| cx.Princess 1.0 | 5.2 | 9.9% | 6 |
| sadoner.killer 0.2 | 5.7 | 8.9% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.7% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 6.0% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.9 | 77.8 | 3 / 35 | 4468 |
| 2 | 1 | 66.7 | 86.0 | 13 / 35 | 4385 |
| 3 | 3 | 65.9 | 84.8 | 7 / 35 | 4266 |
| 4 | 1 | 67.1 | 84.8 | 11 / 35 | 4791 |
| 5 | 1 | 66.8 | 83.8 | 14 / 35 | 4497 |
| 6 | 1 | 67.7 | 85.7 | 13 / 35 | 5018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| hadur117.mini.Deise 0.4 | 60 | 50% |
| rsalesc.melee.Medina 0.4.5 | 54 | 31% |
| mz.MicroSheep 1.0 | 8 | 88% |
| cx.Princess 1.0 | 6 | 50% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 66 | 44% | 82 |
| hadur117.mini.Deise 0.4 | 57 | 38% | 87 |
| cx.Princess 1.0 | 12 | 8% | 13 |
| arthord.NanoSatanMelee Beta | 7 | 5% | 11 |
| mz.MicroSheep 1.0 | 2 | 1% | 8 |
| sadoner.killer 0.2 | 2 | 1% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 3 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |
2 death(s) with no robot to name.

