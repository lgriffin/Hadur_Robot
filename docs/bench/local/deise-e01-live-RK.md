# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 81.5 | 32 / 210 | 2.66 | 15.7% | 27069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 148 |
| hadur117.mini.DeiseRK 0.2 | 2.0 | 15.7% | 32 |
| sgp.JollyNinja 3.53 | 3.3 | 12.1% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.0% | 1 |
| mz.MicroGodMelee 1 | 5.0 | 10.2% | 9 |
| lorneswork.Predator 1.0 | 6.0 | 9.1% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 7.8 | 6.0% | 1 |
| skm.butterfly 1.0 | 9.0 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 82.9 | 5 / 35 | 4429 |
| 2 | 2 | 64.5 | 78.4 | 6 / 35 | 4698 |
| 3 | 2 | 66.0 | 85.1 | 9 / 35 | 4622 |
| 4 | 2 | 64.6 | 79.0 | 5 / 35 | 4698 |
| 5 | 2 | 63.6 | 81.6 | 4 / 35 | 3919 |
| 6 | 2 | 65.2 | 82.2 | 3 / 35 | 4703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 94 | 12% |
| mz.MicroGodMelee 1 | 13 | 62% |
| sgp.JollyNinja 3.53 | 7 | 57% |
| adt.Ar2 1.0 | 4 | 100% |
| skm.butterfly 1.0 | 2 | 100% |
| lorneswork.Predator 1.0 | 2 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 70% | 137 |
| sgp.JollyNinja 3.53 | 23 | 13% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 7% | 17 |
| mz.MicroGodMelee 1 | 11 | 6% | 17 |
| lorneswork.Predator 1.0 | 3 | 2% | 4 |
| adt.Ar2 1.0 | 2 | 1% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |

## Melee bench: F02

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.4 | 88 / 210 | 2.86 | 17.1% | 28977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 17.1% | 88 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.4% | 48 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.1% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.4% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.7 | 9.5% | 9 |
| fnc.bandit.Bandit 5.2.0 | 5.7 | 9.2% | 2 |
| Noran.BitchingElk 0.054 | 7.5 | 7.6% | 11 |
| sch.Simone 0.3d | 7.8 | 7.9% | 12 |
| stelo.PatternRobot 1.0 | 7.8 | 6.8% | 9 |
| fullsail.SweetTea 1.1 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 79.7 | 17 / 35 | 4837 |
| 2 | 1 | 65.3 | 80.0 | 10 / 35 | 4575 |
| 3 | 1 | 65.3 | 79.7 | 15 / 35 | 4734 |
| 4 | 1 | 66.7 | 81.9 | 14 / 35 | 5008 |
| 5 | 1 | 66.0 | 79.4 | 17 / 35 | 4793 |
| 6 | 1 | 65.0 | 75.6 | 15 / 35 | 5030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 38 | 47% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 32 | 69% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| sch.Simone 0.3d | 8 | 75% |
| Noran.BitchingElk 0.054 | 7 | 71% |
| stelo.PatternRobot 1.0 | 7 | 100% |
| fnc.bandit.Bandit 5.2.0 | 5 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 37 | 30% | 66 |
| pulsar.PulsarMax 0.8.9 | 37 | 30% | 52 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 12% | 23 |
| stelo.PatternRobot 1.0 | 11 | 9% | 18 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 6% | 20 |
| Noran.BitchingElk 0.054 | 6 | 5% | 9 |
| sch.Simone 0.3d | 5 | 4% | 12 |
| fnc.bandit.Bandit 5.2.0 | 3 | 2% | 6 |
| fullsail.SweetTea 1.1 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.7 | 138 / 210 | 1.93 | 19.0% | 33156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 19.0% | 138 |
| radnor.DoctorBob 1.42 | 2.2 | 13.8% | 22 |
| kawigi.nano.Lib 1.0 | 3.3 | 13.1% | 22 |
| vuen.Cake 2.51 | 3.5 | 13.0% | 25 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.7% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 6.7 | 7.2% | 0 |
| oa.weak.FlyMk1 0.1 | 8.3 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.7% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.4 | 28 / 35 | 5685 |
| 2 | 1 | 69.1 | 90.2 | 19 / 35 | 5956 |
| 3 | 1 | 67.6 | 86.0 | 22 / 35 | 5130 |
| 4 | 1 | 69.5 | 90.5 | 24 / 35 | 5811 |
| 5 | 1 | 68.8 | 89.8 | 21 / 35 | 5574 |
| 6 | 1 | 68.4 | 89.2 | 24 / 35 | 5000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 64 | 78% |
| radnor.DoctorBob 1.42 | 46 | 89% |
| kawigi.nano.Lib 1.0 | 42 | 90% |
| urdos.URDOS 1.3 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 27% | 57 |
| kawigi.nano.Lib 1.0 | 19 | 26% | 59 |
| vuen.Cake 2.51 | 17 | 23% | 65 |
| urdos.URDOS 1.3 | 9 | 12% | 15 |
| adt.Ar1 2.1 | 3 | 4% | 5 |
| oa.weak.FlyMk1 0.1 | 2 | 3% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 1 |

## Melee bench: F04

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 74.8 | 8 / 210 | 3.27 | 15.0% | 29912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.2% | 189 |
| hadur117.mini.DeiseRK 0.2 | 2.0 | 15.0% | 8 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.5% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 4 |
| josago.Jorgito 0.16 | 5.0 | 10.0% | 2 |
| tj.zombie1n 1.0.1 | 6.2 | 7.3% | 0 |
| css.Delitioner 0.11 | 7.0 | 6.7% | 1 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 78.4 | 3 / 35 | 5170 |
| 2 | 2 | 63.8 | 73.3 | 1 / 35 | 4857 |
| 3 | 2 | 64.3 | 73.3 | 1 / 35 | 5150 |
| 4 | 2 | 62.4 | 70.5 | 1 / 35 | 4558 |
| 5 | 2 | 64.7 | 76.8 | 2 / 35 | 4809 |
| 6 | 2 | 65.1 | 76.5 | 0 / 35 | 5368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 68 | 6% |
| apc.LeeroyJenkins2 1.0 | 2 | 0% |
| TNT.TNT 0.99.1 | 2 | 50% |
| josago.Jorgito 0.16 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 0% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 203 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 164 | 81% | 168 |
| josago.Jorgito 0.16 | 13 | 6% | 13 |
| apc.LeeroyJenkins2 1.0 | 11 | 5% | 11 |
| TNT.TNT 0.99.1 | 7 | 3% | 8 |
| css.Delitioner 0.11 | 3 | 1% | 3 |
| tj.zombie1n 1.0.1 | 2 | 1% | 3 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 65.4 | 11 / 210 | 4.11 | 12.3% | 19725 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.5% | 129 |
| justin.DemonicRage 3.4 | 2.0 | 17.4% | 55 |
| hadur117.mini.DeiseRK 0.2 | 3.5 | 12.3% | 11 |
| wompi.Numbat 2.1 | 3.5 | 12.6% | 10 |
| ms.Ares 0.19 | 5.3 | 9.6% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 8.9% | 5 |
| supersample.SuperBoxBot 1.0 | 7.2 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.3 | 5.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 68.3 | 1 / 35 | 3645 |
| 2 | 3 | 61.7 | 70.8 | 2 / 35 | 3788 |
| 3 | 4 | 56.5 | 60.6 | 2 / 35 | 2855 |
| 4 | 4 | 55.8 | 59.4 | 2 / 35 | 2717 |
| 5 | 4 | 58.5 | 64.8 | 2 / 35 | 3307 |
| 6 | 3 | 60.0 | 68.6 | 2 / 35 | 3413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 20 | 10% |
| justin.DemonicRage 3.4 | 14 | 29% |
| wompi.Numbat 2.1 | 5 | 80% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 199 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 94 | 47% | 96 |
| justin.DemonicRage 3.4 | 51 | 26% | 54 |
| wompi.Numbat 2.1 | 28 | 14% | 32 |
| ms.Ares 0.19 | 10 | 5% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 6 | 3% | 6 |
| axeBots.HataMoto 3.09 | 5 | 3% | 6 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.7 | 125 / 210 | 2.02 | 18.6% | 27671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 18.6% | 125 |
| jekl.StoneGhost 0.7 | 2.3 | 14.7% | 27 |
| origin.SleepSiphon 1.7b | 3.5 | 12.3% | 29 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 11.9% | 15 |
| mld.Wisdom 1.0 | 4.5 | 10.9% | 5 |
| spinnercat.Omen 1.0 | 6.8 | 7.4% | 0 |
| gg.Wolverine 2.0 | 6.8 | 7.7% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.9% | 6 |
| DBall.NUKE 0.1 | 8.5 | 6.2% | 2 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.3 | 17 / 35 | 4078 |
| 2 | 1 | 68.1 | 87.6 | 18 / 35 | 4601 |
| 3 | 1 | 69.4 | 91.7 | 24 / 35 | 4763 |
| 4 | 1 | 69.0 | 91.4 | 21 / 35 | 4778 |
| 5 | 1 | 68.5 | 88.3 | 21 / 35 | 4831 |
| 6 | 1 | 69.2 | 91.7 | 24 / 35 | 4620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 62 | 89% |
| origin.SleepSiphon 1.7b | 38 | 63% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 74% |
| mld.Wisdom 1.0 | 8 | 75% |
| gg.Wolverine 2.0 | 7 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| spinnercat.Omen 1.0 | 6 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 24 | 28% | 49 |
| jekl.StoneGhost 0.7 | 23 | 27% | 70 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 21% | 48 |
| mld.Wisdom 1.0 | 11 | 13% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 5% | 8 |
| gg.Wolverine 2.0 | 3 | 4% | 7 |
| DBall.NUKE 0.1 | 2 | 2% | 5 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
| sample.Fire 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.3 | 64 / 210 | 2.50 | 17.2% | 30892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.2 | 18.6% | 72 |
| hadur117.mini.DeiseRK 0.2 | 1.8 | 17.2% | 64 |
| rtk.Tachikoma 1.0 | 3.0 | 16.2% | 49 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.6% | 12 |
| franzor.Lizt 1.3.1 | 5.0 | 10.8% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.6% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 8.2% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.1% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.8 | 83.5 | 13 / 35 | 5687 |
| 2 | 2 | 67.6 | 82.5 | 8 / 35 | 5059 |
| 3 | 2 | 67.5 | 83.2 | 10 / 35 | 5143 |
| 4 | 2 | 66.3 | 82.2 | 10 / 35 | 4381 |
| 5 | 2 | 68.0 | 82.2 | 13 / 35 | 5324 |
| 6 | 1 | 68.8 | 86.0 | 10 / 35 | 5298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 46 | 61% |
| rsalesc.melee.Monk 0.3.6c | 33 | 18% |
| oog.melee.CapuletDroid 1.1 | 20 | 95% |
| franzor.Lizt 1.3.1 | 11 | 64% |
| skm.PateranBotlock2 1.0 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 1070. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 67 | 46% | 78 |
| rtk.Tachikoma 1.0 | 60 | 41% | 94 |
| oog.melee.CapuletDroid 1.1 | 9 | 6% | 27 |
| exauge.GateKeeper 1.1.121g | 5 | 3% | 9 |
| franzor.Lizt 1.3.1 | 5 | 3% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.1 | 109 / 210 | 2.25 | 18.7% | 31696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 18.7% | 109 |
| tm.Yuugao 1.0 | 2.7 | 12.5% | 36 |
| shrub.Vapour v159 | 3.2 | 12.5% | 28 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 10.5% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.6% | 11 |
| m3thos.Eva00 1.1 | 5.8 | 9.0% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.3% | 6 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 6.6% | 0 |
| SHAM.WOW 1.4 | 8.7 | 6.5% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.1 | 20 / 35 | 5265 |
| 2 | 1 | 68.5 | 90.5 | 16 / 35 | 5206 |
| 3 | 1 | 66.8 | 81.6 | 18 / 35 | 5073 |
| 4 | 1 | 69.2 | 88.9 | 23 / 35 | 5225 |
| 5 | 1 | 68.4 | 86.0 | 15 / 35 | 5853 |
| 6 | 1 | 67.2 | 84.8 | 17 / 35 | 5074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 44 | 66% |
| tm.Yuugao 1.0 | 44 | 61% |
| Krabb.sliNk.Garm 0.9u | 33 | 73% |
| com.spp.robocode.MostlyHarmless 010 | 12 | 83% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 80% |
| m3thos.Eva00 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 29 | 29% | 57 |
| shrub.Vapour v159 | 25 | 25% | 54 |
| Krabb.sliNk.Garm 0.9u | 19 | 19% | 36 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 10% | 24 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 7% | 20 |
| m3thos.Eva00 1.1 | 5 | 5% | 12 |
| SHAM.WOW 1.4 | 3 | 3% | 3 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 3 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 75.6 | 43 / 210 | 3.20 | 14.9% | 22190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.2% | 100 |
| hadur117.mini.DeiseRK 0.2 | 2.2 | 14.9% | 43 |
| kc.micro.Figment 1.0 | 2.8 | 14.1% | 39 |
| yagami.Tidus 0.11 | 4.5 | 10.4% | 3 |
| pedersen.Grishnakh 1.0 | 4.8 | 9.9% | 12 |
| mc2.enemy.Original 0.9 | 5.7 | 9.4% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.4% | 1 |
| step.nanoPri 1.0 | 8.2 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.5% | 0 |
| rdm.Dueler 0.4x | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 71.7 | 7 / 35 | 3551 |
| 2 | 3 | 60.2 | 70.8 | 3 / 35 | 3510 |
| 3 | 2 | 64.5 | 80.3 | 8 / 35 | 3840 |
| 4 | 2 | 64.5 | 81.0 | 10 / 35 | 3742 |
| 5 | 2 | 62.9 | 74.6 | 9 / 35 | 3966 |
| 6 | 2 | 62.3 | 74.9 | 6 / 35 | 3581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 36 | 58% |
| positive.Portia 1.26e | 33 | 33% |
| yagami.Tidus 0.11 | 7 | 100% |
| pedersen.Grishnakh 1.0 | 6 | 33% |
| mc2.enemy.Original 0.9 | 3 | 67% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 167 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 62 | 37% | 75 |
| kc.micro.Figment 1.0 | 35 | 21% | 53 |
| yagami.Tidus 0.11 | 20 | 12% | 26 |
| mc2.enemy.Original 0.9 | 18 | 11% | 21 |
| pedersen.Grishnakh 1.0 | 14 | 8% | 17 |
| robar.nano.Assertive_Melee 0.2 | 9 | 5% | 9 |
| dft.Calliope 5.6 | 8 | 5% | 8 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 91.5 | 133 / 210 | 1.76 | 19.1% | 30828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 19.1% | 133 |
| DTF.Kludgy 1.2b | 2.2 | 14.7% | 36 |
| ne.Chimera 1.2 | 2.8 | 13.3% | 13 |
| ejb.Polaris 1.0.1 | 4.0 | 12.2% | 13 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.2% | 6 |
| vStar.RAFzilla 2.15 | 5.7 | 9.8% | 6 |
| sam.Samspin 1.0 | 7.5 | 5.7% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.2% | 0 |
| kurios.DOSexe .9b | 8.8 | 5.1% | 1 |
| donjezza.Muncho 1.0 | 9.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.5 | 19 / 35 | 5169 |
| 2 | 1 | 69.4 | 91.4 | 24 / 35 | 5135 |
| 3 | 1 | 70.0 | 93.3 | 23 / 35 | 5381 |
| 4 | 1 | 68.8 | 89.8 | 22 / 35 | 5023 |
| 5 | 1 | 69.2 | 94.0 | 24 / 35 | 4832 |
| 6 | 1 | 69.3 | 91.1 | 21 / 35 | 5288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 63 | 70% |
| ejb.Polaris 1.0.1 | 39 | 95% |
| ne.Chimera 1.2 | 30 | 87% |
| vStar.RAFzilla 2.15 | 16 | 81% |
| tvv.micro.Antares 1.1.1 | 12 | 75% |
| donjezza.Muncho 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 34 | 44% | 69 |
| ne.Chimera 1.2 | 15 | 19% | 43 |
| ejb.Polaris 1.0.1 | 9 | 12% | 44 |
| sam.Samspin 1.0 | 6 | 8% | 12 |
| vStar.RAFzilla 2.15 | 5 | 6% | 18 |
| tvv.micro.Antares 1.1.1 | 5 | 6% | 14 |
| kurios.DOSexe .9b | 1 | 1% | 5 |
| donjezza.Muncho 1.0 | 1 | 1% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 1% | 2 |

## Melee bench: F11

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 80.4 | 82 / 210 | 2.77 | 16.6% | 25038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.6% | 74 |
| hadur117.mini.DeiseRK 0.2 | 1.7 | 16.6% | 82 |
| cx.mini.Nimrod 0.55 | 3.2 | 11.9% | 18 |
| djc.DynaBot 0.1.1 | 4.2 | 10.5% | 10 |
| br2.MobyDickBot 1.6 | 5.3 | 9.1% | 7 |
| rdt199.Warlord 0.73 | 5.5 | 9.1% | 16 |
| uji.YellohFellah 1.0 | 6.8 | 8.2% | 5 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.6% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 79.7 | 14 / 35 | 4317 |
| 2 | 1 | 64.0 | 80.0 | 11 / 35 | 3927 |
| 3 | 2 | 64.6 | 77.5 | 14 / 35 | 4064 |
| 4 | 2 | 65.1 | 81.0 | 13 / 35 | 4095 |
| 5 | 2 | 64.4 | 77.5 | 12 / 35 | 4143 |
| 6 | 1 | 67.5 | 86.7 | 18 / 35 | 4492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 54 | 54% |
| cx.mini.Nimrod 0.55 | 18 | 78% |
| djc.DynaBot 0.1.1 | 15 | 80% |
| rdt199.Warlord 0.73 | 14 | 71% |
| uji.YellohFellah 1.0 | 10 | 90% |
| br2.MobyDickBot 1.6 | 8 | 75% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 58 | 45% | 78 |
| cx.mini.Nimrod 0.55 | 21 | 16% | 30 |
| rdt199.Warlord 0.73 | 16 | 13% | 27 |
| br2.MobyDickBot 1.6 | 10 | 8% | 21 |
| djc.DynaBot 0.1.1 | 8 | 6% | 20 |
| uji.YellohFellah 1.0 | 5 | 4% | 19 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 8 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |

## Melee bench: F12

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 82.6 | 90 / 210 | 2.57 | 16.7% | 22203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.2 | 16.7% | 90 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.4% | 44 |
| nat.PallasHawk 1.0 | 3.2 | 12.9% | 35 |
| darkcanuck.Leon 1.01 | 3.8 | 12.1% | 19 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.8% | 16 |
| jrm.Test0 1.0 | 6.3 | 7.8% | 2 |
| jp.Perpy 16.0 | 7.2 | 7.2% | 0 |
| stuff.Vlad 0.1 | 8.5 | 6.1% | 1 |
| cs.sheldor.Talon 1.1 | 8.5 | 6.3% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 80.6 | 16 / 35 | 3493 |
| 2 | 1 | 64.3 | 81.0 | 11 / 35 | 3742 |
| 3 | 1 | 67.2 | 87.6 | 19 / 35 | 3980 |
| 4 | 1 | 66.8 | 86.0 | 18 / 35 | 3886 |
| 5 | 1 | 64.3 | 79.7 | 14 / 35 | 3705 |
| 6 | 2 | 64.1 | 80.6 | 12 / 35 | 3397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 38 | 63% |
| nat.PallasHawk 1.0 | 32 | 66% |
| darkcanuck.Leon 1.01 | 31 | 71% |
| brainfade.melee.Genghis 0.36 | 18 | 72% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| jrm.Test0 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 41 | 34% | 63 |
| nat.PallasHawk 1.0 | 31 | 26% | 58 |
| brainfade.melee.Genghis 0.36 | 21 | 17% | 29 |
| darkcanuck.Leon 1.01 | 16 | 13% | 40 |
| jrm.Test0 1.0 | 6 | 5% | 7 |
| jp.Perpy 16.0 | 2 | 2% | 5 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 2 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |

## Melee bench: F13

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 77.0 | 44 / 210 | 3.07 | 14.8% | 24018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.3% | 93 |
| ags.Glacier 0.2.11 | 1.7 | 17.1% | 51 |
| hadur117.mini.DeiseRK 0.2 | 3.0 | 14.8% | 44 |
| gh.micro.Gruweltje 0.7 | 4.3 | 11.9% | 3 |
| shinh.Entangled 0.3 | 4.7 | 11.8% | 20 |
| apc.Colossus2 0.17 | 6.0 | 7.8% | 0 |
| stelo.Wang 1.0 | 7.2 | 6.3% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.4 | 80.0 | 10 / 35 | 4247 |
| 2 | 3 | 63.4 | 77.5 | 8 / 35 | 4047 |
| 3 | 3 | 63.4 | 76.5 | 7 / 35 | 3866 |
| 4 | 3 | 63.0 | 77.1 | 5 / 35 | 4093 |
| 5 | 3 | 63.2 | 77.5 | 7 / 35 | 3644 |
| 6 | 3 | 62.9 | 73.3 | 7 / 35 | 4121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 35 | 43% |
| ags.Glacier 0.2.11 | 27 | 44% |
| shinh.Entangled 0.3 | 10 | 50% |
| gh.micro.Gruweltje 0.7 | 9 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 65 | 39% | 78 |
| mn.Combat 3.25.0 | 60 | 36% | 74 |
| shinh.Entangled 0.3 | 28 | 17% | 35 |
| gh.micro.Gruweltje 0.7 | 8 | 5% | 16 |
| stelo.Wang 1.0 | 4 | 2% | 5 |
| apc.Colossus2 0.17 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.8 | 159 / 210 | 1.65 | 19.9% | 30658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 19.9% | 159 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 17 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.6% | 23 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.6% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 9.7% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.5% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 6.2 | 9.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.3% | 7 |
| pa.Improved 1.0 | 9.0 | 5.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.7 | 25 / 35 | 5122 |
| 2 | 1 | 70.7 | 94.3 | 27 / 35 | 5371 |
| 3 | 1 | 71.0 | 95.2 | 31 / 35 | 5127 |
| 4 | 1 | 70.0 | 93.7 | 26 / 35 | 4809 |
| 5 | 1 | 69.7 | 91.7 | 25 / 35 | 5123 |
| 6 | 1 | 69.8 | 89.8 | 25 / 35 | 5106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 91 | 88% |
| catcat20.shape.Theta 0.018 | 34 | 76% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 80% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 24 | 47% | 102 |
| catcat20.shape.Theta 0.018 | 15 | 29% | 41 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 12% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 6 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 13 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.8 | 98 / 210 | 2.37 | 18.1% | 30639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 18.1% | 98 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.0% | 27 |
| emp.Yngwie 1.11 | 3.2 | 12.8% | 49 |
| mld.DustBunny 3.8 | 4.2 | 12.2% | 17 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.3% | 5 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.9% | 14 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.4% | 0 |
| lambdaxy.TBot 0.1 | 8.2 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.5% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.6 | 16 / 35 | 5130 |
| 2 | 1 | 69.0 | 88.6 | 17 / 35 | 5348 |
| 3 | 1 | 67.2 | 82.9 | 17 / 35 | 5010 |
| 4 | 1 | 68.8 | 88.6 | 18 / 35 | 5276 |
| 5 | 1 | 68.0 | 86.7 | 19 / 35 | 4978 |
| 6 | 1 | 65.6 | 80.3 | 11 / 35 | 4897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 43 | 79% |
| emp.Yngwie 1.11 | 36 | 53% |
| mld.DustBunny 3.8 | 18 | 67% |
| kawigi.robot.Girl 1.2 | 16 | 88% |
| cb.nano.Insomnia 1.0 | 15 | 93% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 35 | 31% | 57 |
| kawigi.micro.Shiz 1.1 | 29 | 26% | 55 |
| mld.DustBunny 3.8 | 20 | 18% | 39 |
| cb.nano.Insomnia 1.0 | 14 | 13% | 17 |
| kawigi.robot.Girl 1.2 | 6 | 5% | 21 |
| divineomega.TrialBot 0.003 | 3 | 3% | 10 |
| lambdaxy.TBot 0.1 | 3 | 3% | 3 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 7 |

## Melee bench: F16

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.0 | 88 / 210 | 2.26 | 18.6% | 32659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.2 | 18.6% | 88 |
| gh.Griezel 0.5.2 | 1.8 | 17.1% | 84 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.4% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.7 | 10.0% | 18 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.4% | 3 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.1% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.7% | 3 |
| repositorio.NanoStep 1.0 | 8.2 | 5.6% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 5.0% | 1 |
| divineomega.DivineBot 1.9.4.5 | 9.7 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.0 | 17 / 35 | 5636 |
| 2 | 1 | 67.9 | 82.9 | 14 / 35 | 5466 |
| 3 | 1 | 68.8 | 87.3 | 16 / 35 | 5572 |
| 4 | 2 | 68.6 | 86.7 | 12 / 35 | 5468 |
| 5 | 1 | 68.5 | 86.7 | 13 / 35 | 5552 |
| 6 | 1 | 68.1 | 85.4 | 16 / 35 | 4965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 91 | 34% |
| techdude.forest.FlamingForest 1.1 | 25 | 68% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 90% |
| bvh.fnr.Fenrir 0.36l | 10 | 80% |
| tvv.nano.Polaris 1.2 | 7 | 100% |
| asd.Cthulhu 1.3 | 3 | 67% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| divineomega.DivineBot 1.9.4.5 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 1430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 66 | 54% | 104 |
| bvh.fnr.Fenrir 0.36l | 14 | 11% | 18 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 10% | 31 |
| techdude.forest.FlamingForest 1.1 | 11 | 9% | 23 |
| stelo.IntrinsicVolatility 1.4 | 8 | 7% | 10 |
| asd.Cthulhu 1.3 | 5 | 4% | 8 |
| tvv.nano.Polaris 1.2 | 4 | 3% | 9 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 4 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |

## Melee bench: F17

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 88.2 | 104 / 210 | 2.06 | 18.6% | 29502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 18.6% | 104 |
| et.Predator 1.8 | 2.8 | 13.4% | 35 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.0% | 25 |
| cx.BlestPain 1.41 | 3.8 | 11.8% | 30 |
| nic.Nicator 2.4 | 4.5 | 11.4% | 10 |
| ahf.NanoAndrew .4 | 5.5 | 9.9% | 6 |
| maribo.melee.BMV 0.1 | 7.0 | 8.9% | 0 |
| tex.Longbot 0.4 | 8.2 | 6.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.9 | 18 / 35 | 4682 |
| 2 | 1 | 69.2 | 89.5 | 18 / 35 | 5260 |
| 3 | 1 | 68.2 | 88.6 | 16 / 35 | 4825 |
| 4 | 1 | 68.7 | 88.9 | 16 / 35 | 5008 |
| 5 | 1 | 68.1 | 87.0 | 16 / 35 | 5132 |
| 6 | 1 | 67.9 | 86.3 | 20 / 35 | 4595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 54 | 56% |
| oog.melee.Mercutio 1.0 | 34 | 71% |
| cx.BlestPain 1.41 | 32 | 47% |
| nic.Nicator 2.4 | 24 | 79% |
| ahf.NanoAndrew .4 | 15 | 93% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1082. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 43 | 41% | 69 |
| cx.BlestPain 1.41 | 24 | 23% | 41 |
| oog.melee.Mercutio 1.0 | 17 | 16% | 44 |
| nic.Nicator 2.4 | 14 | 13% | 31 |
| ahf.NanoAndrew .4 | 6 | 6% | 19 |
| maribo.melee.BMV 0.1 | 1 | 1% | 3 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.4 | 114 / 210 | 2.40 | 17.5% | 24302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 17.5% | 114 |
| morbid.MorbidPriest 1.0 | 2.2 | 12.9% | 26 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.1% | 24 |
| uji.DBH 1.1 | 4.0 | 11.2% | 12 |
| ratosh.Nobo 0.21 | 5.2 | 10.2% | 9 |
| spinnercat.Robovirus 2.718 | 5.5 | 10.1% | 7 |
| sigterm.Sigterm 1.0 | 7.3 | 7.9% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.7% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.4% | 0 |
| stelo.WangRobot 1.0 | 9.5 | 5.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 81.6 | 16 / 35 | 3784 |
| 2 | 1 | 65.6 | 82.2 | 19 / 35 | 3708 |
| 3 | 1 | 65.2 | 81.3 | 17 / 35 | 4188 |
| 4 | 1 | 68.5 | 91.7 | 21 / 35 | 4305 |
| 5 | 1 | 65.5 | 80.0 | 18 / 35 | 4169 |
| 6 | 1 | 68.2 | 89.5 | 23 / 35 | 4148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 35 | 66% |
| uji.DBH 1.1 | 31 | 84% |
| agd.Mooserwirt2 2.7 | 28 | 71% |
| spinnercat.Robovirus 2.718 | 24 | 92% |
| sigterm.Sigterm 1.0 | 9 | 67% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 63% |
| ratosh.Nobo 0.21 | 8 | 88% |
| stelo.WangRobot 1.0 | 5 | 80% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 27 | 28% | 58 |
| agd.Mooserwirt2 2.7 | 20 | 21% | 43 |
| uji.DBH 1.1 | 11 | 11% | 26 |
| ratosh.Nobo 0.21 | 10 | 10% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 9% | 17 |
| spinnercat.Robovirus 2.718 | 8 | 8% | 23 |
| sigterm.Sigterm 1.0 | 4 | 4% | 10 |
| stelo.WangRobot 1.0 | 4 | 4% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 5 |

## Melee bench: F19

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 93.1 | 147 / 210 | 1.62 | 20.0% | 31170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 20.0% | 147 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.1% | 27 |
| mld.Infinity 2.2 | 2.8 | 14.2% | 21 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.2% | 8 |
| erdnis.Rover 0.3 | 5.0 | 10.1% | 3 |
| patson.PatsonTestBot 1.0 | 5.7 | 9.6% | 3 |
| mbh.Mbh 0.1 | 7.5 | 6.5% | 0 |
| pac.ABC 2.1 | 7.8 | 6.4% | 1 |
| pbg.R2D2 1.0 | 8.7 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.2 | 22 / 35 | 5239 |
| 2 | 1 | 71.2 | 94.9 | 26 / 35 | 5050 |
| 3 | 1 | 70.7 | 93.0 | 25 / 35 | 4900 |
| 4 | 1 | 71.0 | 93.7 | 25 / 35 | 5376 |
| 5 | 1 | 69.6 | 91.1 | 19 / 35 | 5106 |
| 6 | 1 | 72.4 | 96.8 | 30 / 35 | 5499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 71 | 85% |
| mld.Infinity 2.2 | 63 | 89% |
| krillr.mini.JointStrike 2.0.0 | 16 | 69% |
| erdnis.Rover 0.3 | 10 | 70% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 27 | 43% | 99 |
| mld.Infinity 2.2 | 14 | 22% | 53 |
| krillr.mini.JointStrike 2.0.0 | 10 | 16% | 16 |
| erdnis.Rover 0.3 | 7 | 11% | 17 |
| patson.PatsonTestBot 1.0 | 3 | 5% | 12 |
| pbg.R2D2 1.0 | 2 | 3% | 10 |
| mbh.Mbh 0.1 | 0 | 0% | 1 |

## Melee bench: F20

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 92.6 | 145 / 210 | 1.67 | 20.3% | 32772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 20.3% | 145 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 33 |
| fwb.Nine 1.0.1 | 3.3 | 11.1% | 11 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.9% | 4 |
| catcat20.Rabbit 0.001 | 4.8 | 9.8% | 11 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 7.6% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.6% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.4% | 3 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 93.0 | 27 / 35 | 5289 |
| 2 | 1 | 70.4 | 92.7 | 23 / 35 | 5348 |
| 3 | 1 | 71.6 | 95.6 | 29 / 35 | 5385 |
| 4 | 1 | 70.2 | 91.4 | 25 / 35 | 5497 |
| 5 | 1 | 71.0 | 93.3 | 22 / 35 | 5944 |
| 6 | 1 | 69.2 | 89.5 | 19 / 35 | 5309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 70 | 73% |
| fwb.Nine 1.0.1 | 41 | 88% |
| nz.jdc.nano.GridFu 1.0 | 26 | 92% |
| catcat20.Rabbit 0.001 | 15 | 93% |
| bayen.nut.Squirrel 1.615 | 10 | 80% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| m3thos.mini.Eva01 0.5.5 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 34 | 52% | 77 |
| fwb.Nine 1.0.1 | 11 | 17% | 22 |
| catcat20.Rabbit 0.001 | 7 | 11% | 28 |
| bayen.nut.Squirrel 1.615 | 6 | 9% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3 | 5% | 39 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 9 |
| m3thos.mini.Eva01 0.5.5 | 1 | 2% | 7 |
| djdjdj.NanoSkunk10 1.0 | 1 | 2% | 7 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.6 | 120 / 210 | 1.75 | 19.5% | 31116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 19.5% | 120 |
| eem.EvBot v4.6.16 | 2.0 | 15.9% | 65 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 9 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.1% | 0 |
| eld.Hmm 1.0 | 5.7 | 8.2% | 6 |
| fire219.CatBot 1.0 | 7.7 | 6.6% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 1 |
| PSW.Relentless 0.1 | 8.5 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.5 | 18 / 35 | 5148 |
| 2 | 1 | 70.2 | 93.3 | 24 / 35 | 5308 |
| 3 | 1 | 70.3 | 93.0 | 21 / 35 | 5163 |
| 4 | 1 | 70.9 | 93.3 | 24 / 35 | 5425 |
| 5 | 1 | 69.5 | 91.7 | 18 / 35 | 5248 |
| 6 | 1 | 68.5 | 88.9 | 15 / 35 | 4824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 95 | 53% |
| dummy.mini.Scimitar 1.01 | 41 | 95% |
| cf.RiO.RiOx 4.2.1 | 18 | 94% |
| oa.weak.BotherBot 0.1 | 8 | 100% |
| eld.Hmm 1.0 | 7 | 57% |
| el.JumpShoot 0.2 | 3 | 67% |

Hadur died in 90 of 210 rounds, at a mean tick of 1220. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 52 | 58% | 95 |
| dummy.mini.Scimitar 1.01 | 18 | 20% | 58 |
| cf.RiO.RiOx 4.2.1 | 12 | 13% | 27 |
| eld.Hmm 1.0 | 4 | 4% | 13 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 11 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.9 | 85 / 210 | 2.18 | 17.7% | 28145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.5 | 17.7% | 85 |
| pe.SandboxDT 2.71m | 1.5 | 17.3% | 77 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.2% | 29 |
| jlm.javaDisturbance 0.59 | 4.0 | 11.8% | 13 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 6 |
| yk.JahRoslav 1.1 | 6.3 | 7.3% | 1 |
| tad.Dalek98 0.98 | 6.8 | 7.1% | 0 |
| gg.Squaraus 0.6 | 8.0 | 6.4% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.5% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 9.8 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.2 | 14 / 35 | 5178 |
| 2 | 2 | 67.1 | 86.0 | 12 / 35 | 4550 |
| 3 | 2 | 65.4 | 79.0 | 13 / 35 | 4529 |
| 4 | 2 | 67.2 | 87.6 | 14 / 35 | 4216 |
| 5 | 1 | 68.0 | 87.9 | 15 / 35 | 4560 |
| 6 | 1 | 69.1 | 90.8 | 17 / 35 | 5112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 68 | 37% |
| kvk.HebusLeTroll 0.35 | 39 | 59% |
| jlm.javaDisturbance 0.59 | 28 | 86% |
| bigpete.Stewie 1.0 | 7 | 71% |
| tad.Dalek98 0.98 | 3 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| yk.JahRoslav 1.1 | 2 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 60 | 48% | 89 |
| kvk.HebusLeTroll 0.35 | 33 | 26% | 55 |
| jlm.javaDisturbance 0.59 | 20 | 16% | 40 |
| bigpete.Stewie 1.0 | 6 | 5% | 12 |
| tad.Dalek98 0.98 | 6 | 5% | 9 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.8 | 101 / 210 | 2.10 | 18.7% | 31347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.2 | 18.7% | 101 |
| pe.SandboxLump 1.52 | 1.8 | 16.5% | 63 |
| cre.Karolos 0.32 | 3.0 | 14.1% | 28 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.1% | 11 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.5% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.3% | 1 |
| cw.megas.Blade 0.8 | 7.0 | 8.0% | 0 |
| sample.Walls 1.0 | 8.0 | 7.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 82.2 | 12 / 35 | 4800 |
| 2 | 1 | 70.4 | 90.8 | 19 / 35 | 5301 |
| 3 | 1 | 69.6 | 90.2 | 19 / 35 | 5177 |
| 4 | 1 | 69.7 | 89.2 | 19 / 35 | 5244 |
| 5 | 1 | 68.4 | 85.7 | 14 / 35 | 5088 |
| 6 | 1 | 69.4 | 88.6 | 18 / 35 | 5737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 79 | 47% |
| cre.Karolos 0.32 | 37 | 62% |
| stelo.AreaTargetingBot 1.1 | 20 | 80% |
| stelo.RamTrackSurfer 1.2 | 12 | 92% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 55 | 50% | 95 |
| cre.Karolos 0.32 | 28 | 26% | 50 |
| stelo.AreaTargetingBot 1.1 | 15 | 14% | 30 |
| stelo.RamTrackSurfer 1.2 | 5 | 5% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 3% | 9 |
| sample.Walls 1.0 | 2 | 2% | 5 |
| cw.megas.Blade 0.8 | 1 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 73.3 | 54 / 210 | 3.40 | 14.4% | 20069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 2.2 | 14.4% | 54 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.3% | 40 |
| florent.XSeries.X2 0.12 | 2.5 | 14.4% | 47 |
| davidalves.Phoenix 0.54 | 3.7 | 12.7% | 36 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.4% | 19 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.3% | 11 |
| oog.melee.Corsair 1.0 | 6.5 | 8.6% | 2 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.4% | 1 |
| evd.X1 0.01 | 9.5 | 4.9% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 75.9 | 9 / 35 | 3428 |
| 2 | 4 | 60.0 | 68.9 | 6 / 35 | 3059 |
| 3 | 1 | 63.3 | 75.9 | 14 / 35 | 3464 |
| 4 | 3 | 60.5 | 71.4 | 6 / 35 | 3287 |
| 5 | 2 | 61.7 | 72.7 | 11 / 35 | 3369 |
| 6 | 2 | 62.1 | 74.9 | 8 / 35 | 3462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 30 | 43% |
| davidalves.Phoenix 0.54 | 21 | 57% |
| rz.GlowBlowMelee 1.4 | 19 | 74% |
| pedersen.Ugluk 1.1.1 | 9 | 78% |
| stelo.SoJNanoMelee 1.1 | 8 | 63% |
| oog.melee.Corsair 1.0 | 3 | 67% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 58 | 37% | 68 |
| rz.GlowBlowMelee 1.4 | 27 | 17% | 42 |
| davidalves.Phoenix 0.54 | 23 | 15% | 31 |
| pedersen.Ugluk 1.1.1 | 19 | 12% | 26 |
| stelo.SoJNanoMelee 1.1 | 17 | 11% | 22 |
| evd.X1 0.01 | 8 | 5% | 8 |
| oog.melee.Corsair 1.0 | 5 | 3% | 11 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 1 |
| as.FrankTheTank 1.3 | 0 | 0% | 1 |

## Melee bench: F25

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.0 | 117 / 210 | 2.53 | 17.5% | 23382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 17.5% | 117 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.5% | 19 |
| jdw.Hurricane 1.4 | 3.2 | 12.5% | 32 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 13.0% | 14 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 10.1% | 15 |
| ds.Oo 2.2 | 6.5 | 8.7% | 7 |
| gjr.Cephalosporin 0.1 | 7.2 | 7.3% | 4 |
| adt.Ar2 1.1 | 8.0 | 6.8% | 1 |
| awesomeness.Elite 1.0 | 8.3 | 6.4% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 82.2 | 20 / 35 | 3899 |
| 2 | 1 | 65.5 | 81.0 | 15 / 35 | 3764 |
| 3 | 1 | 64.4 | 76.8 | 16 / 35 | 3717 |
| 4 | 1 | 67.8 | 85.4 | 24 / 35 | 3990 |
| 5 | 1 | 67.2 | 85.7 | 20 / 35 | 3936 |
| 6 | 1 | 67.8 | 87.0 | 22 / 35 | 4076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 47 | 85% |
| voidious.micro.BlitzBat 1.05 | 42 | 90% |
| jdw.Hurricane 1.4 | 18 | 78% |
| gre.svman4.Morfeas 1.4.1 | 8 | 50% |
| gjr.Cephalosporin 0.1 | 8 | 100% |
| ds.Oo 2.2 | 6 | 67% |
| adt.Ar2 1.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 34 | 37% | 47 |
| voidious.mini.BrokenSword 2.0.3 | 17 | 18% | 56 |
| voidious.micro.BlitzBat 1.05 | 15 | 16% | 47 |
| gre.svman4.Morfeas 1.4.1 | 11 | 12% | 18 |
| ds.Oo 2.2 | 7 | 8% | 18 |
| adt.Ar2 1.1 | 4 | 4% | 9 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 9 |
| awesomeness.Elite 1.0 | 2 | 2% | 4 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |

## Melee bench: F26

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.2 | 105 / 210 | 2.24 | 18.2% | 31384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 18.2% | 105 |
| ak.Fermat 2.0 | 2.0 | 15.0% | 52 |
| shu.nitro.LENIN .T34 | 3.5 | 12.2% | 20 |
| lrem.Spectre 0.4.4 | 4.2 | 11.7% | 15 |
| js.PinBall 1.6 | 4.7 | 10.9% | 10 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.7% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.3% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 86.3 | 14 / 35 | 5044 |
| 2 | 1 | 69.0 | 86.7 | 21 / 35 | 5805 |
| 3 | 1 | 67.0 | 83.5 | 15 / 35 | 4803 |
| 4 | 1 | 66.3 | 79.7 | 15 / 35 | 4795 |
| 5 | 1 | 69.2 | 89.5 | 21 / 35 | 5254 |
| 6 | 1 | 69.9 | 91.4 | 19 / 35 | 5683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 47 | 53% |
| shu.nitro.LENIN .T34 | 40 | 80% |
| lrem.Spectre 0.4.4 | 22 | 86% |
| js.PinBall 1.6 | 18 | 61% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 100% |
| gh.mini.GrubbmOne 1.0 | 5 | 80% |
| sample.SpinBot 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 44 | 42% | 69 |
| shu.nitro.LENIN .T34 | 24 | 23% | 62 |
| js.PinBall 1.6 | 13 | 12% | 22 |
| lrem.Spectre 0.4.4 | 12 | 11% | 28 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 5% | 13 |
| sample.SpinBot 1.0 | 4 | 4% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 5 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 5 |

## Melee bench: F27

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.6 | 106 / 210 | 2.57 | 17.3% | 25701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 17.3% | 106 |
| mk.Alpha 0.2.1 | 2.2 | 14.3% | 53 |
| wee.Gem 1.8.4 | 3.8 | 10.7% | 14 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 10.8% | 18 |
| EH.Eagle 1.0.6 | 4.2 | 10.8% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.9% | 4 |
| throxbot.ThroxBot 0.1 | 6.8 | 8.4% | 6 |
| joe.ADinosaur 1.0 | 7.3 | 8.4% | 4 |
| caimano.Furia_Ceca 0.22 | 9.2 | 6.2% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 84.4 | 18 / 35 | 4090 |
| 2 | 1 | 65.6 | 81.6 | 17 / 35 | 4111 |
| 3 | 1 | 66.7 | 84.8 | 20 / 35 | 3835 |
| 4 | 1 | 66.4 | 85.4 | 19 / 35 | 4260 |
| 5 | 1 | 66.0 | 82.9 | 18 / 35 | 4209 |
| 6 | 1 | 66.8 | 76.5 | 14 / 35 | 5196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 66 | 68% |
| wee.Gem 1.8.4 | 27 | 89% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 59% |
| EH.Eagle 1.0.6 | 12 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| throxbot.ThroxBot 0.1 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |

Hadur died in 104 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 42 | 40% | 82 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 13% | 31 |
| joe.ADinosaur 1.0 | 14 | 13% | 20 |
| throxbot.ThroxBot 0.1 | 12 | 12% | 17 |
| EH.Eagle 1.0.6 | 8 | 8% | 14 |
| wee.Gem 1.8.4 | 6 | 6% | 31 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 3% | 6 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F28

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 90.3 | 130 / 210 | 1.88 | 18.5% | 24286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 18.5% | 130 |
| kid.test.NightFox .2 | 2.0 | 15.4% | 45 |
| uji.Antique 1.0 | 3.3 | 11.5% | 17 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 11.1% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.6% | 10 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.2% | 2 |
| ahr.ice.Ice 1.0.2 | 7.0 | 7.5% | 1 |
| matt.advanced.Katana 1.0 | 8.3 | 6.3% | 0 |
| stelo.Lifestealer 1.0 | 9.2 | 5.6% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 92.1 | 27 / 35 | 4056 |
| 2 | 1 | 67.6 | 90.5 | 21 / 35 | 3868 |
| 3 | 1 | 68.7 | 92.7 | 22 / 35 | 4089 |
| 4 | 1 | 68.3 | 89.8 | 23 / 35 | 4285 |
| 5 | 1 | 68.4 | 89.8 | 20 / 35 | 4291 |
| 6 | 1 | 66.4 | 86.7 | 17 / 35 | 3697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 86 | 72% |
| uji.Antique 1.0 | 28 | 93% |
| qohnil.blot.BlotBot 3.61 | 19 | 63% |
| pfvicm.Sobieski 7.2.3b | 16 | 88% |
| amk.ChumbaWumba 0.3 | 12 | 92% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 33 | 41% | 86 |
| pfvicm.Sobieski 7.2.3b | 14 | 18% | 19 |
| uji.Antique 1.0 | 10 | 13% | 34 |
| qohnil.blot.BlotBot 3.61 | 9 | 11% | 26 |
| amk.ChumbaWumba 0.3 | 8 | 10% | 18 |
| ahr.ice.Ice 1.0.2 | 5 | 6% | 10 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |
| matt.advanced.Katana 1.0 | 0 | 0% | 8 |
| stelo.Lifestealer 1.0 | 0 | 0% | 4 |

## Melee bench: F29

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.7 | 88 / 210 | 2.56 | 17.5% | 26651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.5 | 17.5% | 88 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 16.2% | 67 |
| deewiant.Anomaly 0.2 | 2.7 | 14.7% | 37 |
| myl.micro.Troodon 1.10 | 4.5 | 10.9% | 5 |
| jok.PheonixM 0.1.2 | 4.7 | 10.3% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.2% | 1 |
| DBall.Anarchy 0.1 | 7.2 | 7.0% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.8% | 0 |
| ap.Frederick 1.1 | 8.8 | 5.1% | 1 |
| jangs.ns51 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.2 | 16 / 35 | 4454 |
| 2 | 1 | 66.3 | 81.0 | 12 / 35 | 4353 |
| 3 | 1 | 69.1 | 87.9 | 18 / 35 | 4811 |
| 4 | 3 | 63.9 | 75.9 | 12 / 35 | 3824 |
| 5 | 1 | 68.9 | 88.3 | 18 / 35 | 4617 |
| 6 | 2 | 66.6 | 80.0 | 12 / 35 | 4592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 56 | 57% |
| deewiant.Anomaly 0.2 | 44 | 68% |
| myl.micro.Troodon 1.10 | 12 | 92% |
| DBall.Anarchy 0.1 | 7 | 100% |
| jok.PheonixM 0.1.2 | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 46 | 37% | 73 |
| deewiant.Anomaly 0.2 | 38 | 31% | 72 |
| myl.micro.Troodon 1.10 | 13 | 10% | 23 |
| jok.PheonixM 0.1.2 | 8 | 6% | 12 |
| ph.melee.ArcherME 0.3 | 8 | 6% | 10 |
| DBall.Anarchy 0.1 | 4 | 3% | 11 |
| jangs.ns51 1.0 | 3 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 2 |
2 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 73.2 | 45 / 210 | 3.41 | 14.6% | 23309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.5 | 14.6% | 45 |
| catcat20.Matcha 0.006 | 2.7 | 13.8% | 48 |
| darkcanuck.B26354 1.06 | 3.2 | 13.5% | 49 |
| stelo.PastFuture 2.3.2 | 3.5 | 13.1% | 28 |
| oog.melee.Capulet 1.2 | 4.2 | 12.6% | 23 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.7% | 7 |
| ntc.Opposite 1.5 | 7.3 | 7.6% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 7.3% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 6.5% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 71.7 | 7 / 35 | 3837 |
| 2 | 1 | 62.5 | 76.8 | 8 / 35 | 3532 |
| 3 | 1 | 63.1 | 74.9 | 9 / 35 | 4035 |
| 4 | 3 | 61.9 | 70.8 | 6 / 35 | 3980 |
| 5 | 1 | 61.4 | 72.1 | 4 / 35 | 3772 |
| 6 | 1 | 63.0 | 73.0 | 11 / 35 | 4153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 28 | 39% |
| stelo.PastFuture 2.3.2 | 20 | 65% |
| darkcanuck.B26354 1.06 | 20 | 35% |
| oog.melee.Capulet 1.2 | 9 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 100% |
| tripphippy.Alice 1.1 | 3 | 33% |
| intruder.PrairieWolf 2.61 | 2 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 46 | 28% | 53 |
| catcat20.Matcha 0.006 | 44 | 27% | 59 |
| stelo.PastFuture 2.3.2 | 29 | 18% | 41 |
| oog.melee.Capulet 1.2 | 20 | 12% | 27 |
| tripphippy.Alice 1.1 | 12 | 7% | 13 |
| ntc.Opposite 1.5 | 6 | 4% | 7 |
| intruder.PrairieWolf 2.61 | 6 | 4% | 6 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 0 | 0% | 2 |

## Melee bench: F31

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 78.1 | 45 / 210 | 2.97 | 15.0% | 20305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.6% | 103 |
| hadur117.mini.DeiseRK 0.2 | 2.0 | 15.0% | 45 |
| gh.mini.Griezel 0.2 | 3.5 | 12.9% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 11.6% | 11 |
| d414.nano.Quantum 1.0.0 | 4.7 | 10.7% | 8 |
| gh.nano.Grofvuil 0.2 | 6.5 | 8.2% | 1 |
| timmit.nano.TimDog 0.33 | 6.7 | 6.9% | 0 |
| fm.mammillarias 1.3 | 8.5 | 6.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.8% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 73.0 | 2 / 35 | 3406 |
| 2 | 2 | 65.1 | 83.2 | 13 / 35 | 3522 |
| 3 | 2 | 62.9 | 75.9 | 8 / 35 | 3372 |
| 4 | 2 | 62.0 | 77.1 | 5 / 35 | 3213 |
| 5 | 2 | 63.5 | 81.0 | 7 / 35 | 3234 |
| 6 | 2 | 63.9 | 78.7 | 10 / 35 | 3558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 44 | 32% |
| gh.mini.Griezel 0.2 | 30 | 37% |
| spinnercat.micro.Tyger 0.1 | 13 | 85% |
| d414.nano.Quantum 1.0.0 | 7 | 57% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 76 | 46% | 93 |
| gh.mini.Griezel 0.2 | 32 | 19% | 42 |
| spinnercat.micro.Tyger 0.1 | 18 | 11% | 28 |
| d414.nano.Quantum 1.0.0 | 17 | 10% | 21 |
| fm.mammillarias 1.3 | 10 | 6% | 10 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 11 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
| timmit.nano.TimDog 0.33 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 90.2 | 127 / 210 | 1.89 | 18.9% | 28131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 18.9% | 127 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.3% | 43 |
| apc.botM 3.0 | 2.8 | 12.1% | 23 |
| lxx.ConceptA 0.8 | 4.2 | 10.4% | 4 |
| bayen.UbaMicro 1.4 | 5.2 | 8.9% | 3 |
| vjik.UnViolation 1.1 | 5.7 | 9.4% | 2 |
| panzer.Panzer 0.2 | 7.2 | 7.6% | 0 |
| yk.JahMicro 1.0 | 8.5 | 6.8% | 4 |
| conscience.Electron 1.3g | 8.7 | 6.2% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 91.1 | 20 / 35 | 4495 |
| 2 | 1 | 69.0 | 92.7 | 22 / 35 | 4685 |
| 3 | 1 | 67.8 | 87.3 | 19 / 35 | 4872 |
| 4 | 1 | 68.3 | 89.8 | 23 / 35 | 4458 |
| 5 | 1 | 68.8 | 90.5 | 22 / 35 | 4951 |
| 6 | 1 | 68.2 | 89.5 | 21 / 35 | 4670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 68 | 62% |
| apc.botM 3.0 | 30 | 77% |
| lxx.ConceptA 0.8 | 26 | 88% |
| vjik.UnViolation 1.1 | 12 | 92% |
| donjezza.Jezza 1.0 | 12 | 92% |
| bayen.UbaMicro 1.4 | 10 | 80% |
| yk.JahMicro 1.0 | 5 | 100% |
| panzer.Panzer 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 83 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 35 | 42% | 85 |
| apc.botM 3.0 | 16 | 19% | 41 |
| lxx.ConceptA 0.8 | 14 | 17% | 25 |
| bayen.UbaMicro 1.4 | 7 | 8% | 11 |
| panzer.Panzer 0.2 | 3 | 4% | 6 |
| conscience.Electron 1.3g | 3 | 4% | 3 |
| vjik.UnViolation 1.1 | 2 | 2% | 22 |
| yk.JahMicro 1.0 | 2 | 2% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 8 |

## Melee bench: F33

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.9 | 116 / 210 | 2.18 | 18.7% | 28687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 18.7% | 116 |
| maribo.Quester 0.3 | 2.0 | 15.7% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.6% | 19 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 10.7% | 10 |
| labg.Cataclysm 2.05 | 5.0 | 9.8% | 11 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.6% | 5 |
| sanja.First 0.1 | 8.5 | 5.4% | 0 |
| zyx.micro.Ant 1.1 | 8.5 | 5.7% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.3 | 21 / 35 | 5006 |
| 2 | 1 | 67.5 | 83.5 | 17 / 35 | 4424 |
| 3 | 1 | 68.7 | 87.6 | 19 / 35 | 4827 |
| 4 | 1 | 67.3 | 82.2 | 18 / 35 | 4696 |
| 5 | 1 | 69.6 | 90.5 | 21 / 35 | 4976 |
| 6 | 1 | 68.9 | 89.2 | 20 / 35 | 4758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 53 | 70% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 76% |
| gre.svman4.Leonidas 1.3.2 | 31 | 90% |
| labg.Cataclysm 2.05 | 11 | 64% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 88% |
| baal.nano.N 1.42 | 4 | 100% |
| sanja.First 0.1 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 0% |

Hadur died in 95 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 38 | 40% | 81 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 13% | 44 |
| labg.Cataclysm 2.05 | 11 | 12% | 20 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 11% | 15 |
| zyx.micro.Ant 1.1 | 10 | 11% | 11 |
| gre.svman4.Leonidas 1.3.2 | 9 | 9% | 25 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 3% | 5 |
| baal.nano.N 1.42 | 2 | 2% | 7 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 80.8 | 60 / 210 | 2.72 | 16.5% | 27953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.7 | 16.5% | 52 |
| stelo.Spread 0.9 | 2.2 | 16.3% | 68 |
| hadur117.mini.DeiseRK 0.2 | 2.2 | 16.5% | 60 |
| tcf.Reach 3 | 4.7 | 10.8% | 7 |
| jcs.Seth 1.8 | 4.7 | 10.9% | 18 |
| cli.Dancer 1.1 | 5.7 | 9.2% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.4% | 1 |
| sample.VelociRobot 1.0 | 9.2 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.2 | 81.3 | 11 / 35 | 4506 |
| 2 | 2 | 66.5 | 81.6 | 9 / 35 | 4533 |
| 3 | 2 | 64.6 | 77.1 | 7 / 35 | 4640 |
| 4 | 1 | 67.9 | 86.0 | 16 / 35 | 4798 |
| 5 | 2 | 66.0 | 79.4 | 9 / 35 | 4929 |
| 6 | 3 | 65.4 | 79.7 | 8 / 35 | 4547 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 47 | 40% |
| kid.Gladiator .7.2 | 37 | 54% |
| jcs.Seth 1.8 | 15 | 80% |
| tcf.Reach 3 | 7 | 57% |
| cli.Dancer 1.1 | 3 | 100% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 58 | 38% | 76 |
| stelo.Spread 0.9 | 56 | 37% | 74 |
| tcf.Reach 3 | 13 | 9% | 16 |
| ratosh.Wesco 1.4 | 10 | 7% | 13 |
| jcs.Seth 1.8 | 8 | 5% | 21 |
| cli.Dancer 1.1 | 3 | 2% | 5 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 3 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |

## Melee bench: F35

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 76.3 | 16 / 210 | 3.13 | 13.8% | 17891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 156 |
| hadur117.mini.DeiseRK 0.2 | 2.3 | 13.8% | 16 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.5% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.0% | 12 |
| rz.HawkOnFire 0.1 | 4.5 | 11.6% | 3 |
| wit.Chuliath 1.0 | 6.7 | 6.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 76.8 | 4 / 35 | 2857 |
| 2 | 2 | 59.8 | 73.3 | 1 / 35 | 2817 |
| 3 | 2 | 61.2 | 75.2 | 1 / 35 | 3055 |
| 4 | 3 | 62.4 | 79.4 | 3 / 35 | 3017 |
| 5 | 3 | 60.9 | 72.7 | 3 / 35 | 3026 |
| 6 | 2 | 63.1 | 80.3 | 4 / 35 | 3119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 48 | 10% |
| gh.mini.Gruwel 0.9 | 17 | 35% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 33% |
| rz.HawkOnFire 0.1 | 5 | 60% |

Hadur died in 194 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 118 | 61% | 123 |
| dmh.robocode.robot.BlackDeath 9.2 | 24 | 12% | 26 |
| gh.mini.Gruwel 0.9 | 23 | 12% | 27 |
| rz.HawkOnFire 0.1 | 16 | 8% | 20 |
| myl.nano.KomoriNinja 1.1 | 5 | 3% | 5 |
| dans.Cinnamon 1.2 | 2 | 1% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.7 | 165 / 210 | 1.66 | 20.7% | 31515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 20.7% | 165 |
| bzdp.Pansy 2.1 | 2.5 | 12.6% | 11 |
| alpha.RainingFire 1.0 | 3.2 | 11.9% | 16 |
| bvh.micro.Freya 0.3 | 4.3 | 10.6% | 9 |
| mz.Cork 0.1 | 5.2 | 9.9% | 3 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.3% | 1 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.2% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.9% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.8% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 96.8 | 30 / 35 | 5722 |
| 2 | 1 | 70.7 | 91.4 | 27 / 35 | 5429 |
| 3 | 1 | 71.6 | 97.1 | 29 / 35 | 5146 |
| 4 | 1 | 69.9 | 90.5 | 26 / 35 | 4976 |
| 5 | 1 | 69.8 | 89.2 | 26 / 35 | 5068 |
| 6 | 1 | 70.7 | 91.1 | 27 / 35 | 5174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 58 | 97% |
| bvh.micro.Freya 0.3 | 40 | 88% |
| alpha.RainingFire 1.0 | 24 | 75% |
| bvh.mini.Fenrir 0.39 | 17 | 100% |
| mz.Cork 0.1 | 17 | 94% |
| m3thos.Eva02 0.7.1 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 18 | 40% | 40 |
| bzdp.Pansy 2.1 | 8 | 18% | 69 |
| bvh.micro.Freya 0.3 | 6 | 13% | 23 |
| bvh.mini.Fenrir 0.39 | 6 | 13% | 20 |
| mz.Cork 0.1 | 4 | 9% | 18 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 10 |
| m3thos.Eva02 0.7.1 | 1 | 2% | 17 |
| dl.BetterWalls 1.0 | 0 | 0% | 11 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 87.2 | 138 / 210 | 2.15 | 18.4% | 30645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 18.4% | 138 |
| germ.TheMind .2 | 2.0 | 12.2% | 24 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.2% | 6 |
| EBBU.Sim2 1.02 | 4.3 | 9.7% | 4 |
| agrach.Dalek 1.0 | 6.2 | 8.9% | 11 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.8% | 10 |
| lmk.ACPFinal 0.1 | 6.5 | 8.7% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.8% | 1 |
| mb.Beast 0.1 | 8.3 | 7.6% | 5 |
| skm.Ryubot 1.0 | 8.7 | 7.7% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 83.8 | 21 / 35 | 5198 |
| 2 | 1 | 67.5 | 86.7 | 25 / 35 | 5181 |
| 3 | 1 | 68.3 | 92.4 | 23 / 35 | 5211 |
| 4 | 1 | 65.4 | 81.0 | 21 / 35 | 4891 |
| 5 | 1 | 68.2 | 91.1 | 26 / 35 | 4948 |
| 6 | 1 | 67.6 | 88.3 | 22 / 35 | 5216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 47 | 79% |
| EBBU.Sim2 1.02 | 23 | 100% |
| stelo.UntouchableNano 1.3 | 20 | 90% |
| mb.Beast 0.1 | 15 | 93% |
| lmk.ACPFinal 0.1 | 14 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 100% |
| skm.Ryubot 1.0 | 14 | 79% |
| agrach.Dalek 1.0 | 8 | 75% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 27 | 37% | 53 |
| agrach.Dalek 1.0 | 11 | 15% | 25 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 12% | 12 |
| lmk.ACPFinal 0.1 | 6 | 8% | 16 |
| EBBU.Sim2 1.02 | 5 | 7% | 21 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 5% | 25 |
| mb.Beast 0.1 | 4 | 5% | 23 |
| stelo.UntouchableNano 1.3 | 4 | 5% | 23 |
| skm.Ryubot 1.0 | 3 | 4% | 11 |

## Melee bench: F38

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 79.0 | 75 / 210 | 2.89 | 16.0% | 24430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 15.8% | 66 |
| hadur117.mini.DeiseRK 0.2 | 1.5 | 16.0% | 75 |
| bvh.mini.Freya 0.55 | 3.2 | 12.5% | 12 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.1% | 26 |
| cs.Wren 1.0 | 5.0 | 10.7% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.0 | 9.7% | 6 |
| kdf.KoulDestroyer 1.0 | 6.3 | 9.3% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.5% | 3 |
| bzdp.BoxCar 2.0 | 9.5 | 4.0% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 72.7 | 12 / 35 | 3847 |
| 2 | 1 | 66.1 | 82.2 | 13 / 35 | 4381 |
| 3 | 1 | 65.6 | 81.9 | 16 / 35 | 4131 |
| 4 | 2 | 64.7 | 80.6 | 12 / 35 | 4044 |
| 5 | 1 | 65.0 | 80.3 | 11 / 35 | 4307 |
| 6 | 2 | 63.0 | 76.5 | 11 / 35 | 3720 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 47 | 60% |
| bvh.mini.Freya 0.55 | 16 | 88% |
| bts.mega.Gnarly 1.4 | 15 | 60% |
| cs.Wren 1.0 | 12 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 91% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 40 | 30% | 72 |
| bvh.mini.Freya 0.55 | 27 | 20% | 39 |
| bts.mega.Gnarly 1.4 | 20 | 15% | 30 |
| cs.Wren 1.0 | 18 | 13% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 12% | 25 |
| kdf.KoulDestroyer 1.0 | 9 | 7% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 6 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.6 | 90 / 210 | 2.39 | 17.4% | 28089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 17.4% | 90 |
| bvh.fry.Freya 0.82 | 2.0 | 14.9% | 30 |
| az.Ololobot 0.2.4 | 3.0 | 12.8% | 55 |
| catcat20.Lambda 0.024 | 4.0 | 10.8% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 9.0% | 12 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.3% | 2 |
| gimp.GimpBot 0.1 | 6.8 | 7.8% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.7% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 86.3 | 13 / 35 | 4398 |
| 2 | 1 | 66.0 | 84.8 | 16 / 35 | 4470 |
| 3 | 1 | 67.5 | 87.0 | 17 / 35 | 4937 |
| 4 | 1 | 66.5 | 82.9 | 14 / 35 | 5232 |
| 5 | 1 | 66.2 | 83.5 | 18 / 35 | 4538 |
| 6 | 1 | 65.4 | 82.9 | 12 / 35 | 4514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 43 | 72% |
| az.Ololobot 0.2.4 | 40 | 40% |
| catcat20.Lambda 0.024 | 21 | 57% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 100% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| gimp.GimpBot 0.1 | 4 | 75% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 42 | 35% | 69 |
| az.Ololobot 0.2.4 | 28 | 23% | 44 |
| catcat20.Lambda 0.024 | 22 | 18% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 19 | 16% | 31 |
| gimp.GimpBot 0.1 | 3 | 2% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 3 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 7 |

## Melee bench: F40

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.2 | 113 / 210 | 2.15 | 18.5% | 27532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 18.5% | 113 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 39 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.4% | 21 |
| mz.AntiGrav 1.0 | 4.3 | 11.0% | 10 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.5% | 11 |
| stelo.Randomness 1.0 | 6.3 | 8.9% | 10 |
| alpha.BlackIce 1.0 | 6.5 | 8.6% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.5 | 5.6% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.5 | 5.7% | 1 |
| sample.Corners 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 84.8 | 22 / 35 | 4640 |
| 2 | 1 | 68.0 | 87.0 | 16 / 35 | 4730 |
| 3 | 1 | 69.4 | 91.1 | 21 / 35 | 4613 |
| 4 | 1 | 67.7 | 85.4 | 19 / 35 | 4444 |
| 5 | 1 | 68.7 | 88.9 | 20 / 35 | 4733 |
| 6 | 1 | 67.1 | 86.0 | 15 / 35 | 4372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 56 | 71% |
| kano.gamma.KanoGamma 1.8 | 35 | 86% |
| mz.AntiGrav 1.0 | 22 | 95% |
| Polkwane.SmashMelee 1.0 | 12 | 100% |
| stelo.Randomness 1.0 | 6 | 50% |
| alpha.BlackIce 1.0 | 5 | 60% |
| sample.Corners 1.0 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 34 | 35% | 66 |
| kano.gamma.KanoGamma 1.8 | 21 | 22% | 55 |
| mz.AntiGrav 1.0 | 10 | 10% | 32 |
| alpha.BlackIce 1.0 | 10 | 10% | 13 |
| Polkwane.SmashMelee 1.0 | 8 | 8% | 16 |
| stelo.Randomness 1.0 | 7 | 7% | 16 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 7 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 3 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.9 | 109 / 210 | 2.18 | 17.6% | 23129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 17.6% | 109 |
| eem.EvBotNG v12.8 | 2.0 | 16.1% | 63 |
| ary.Swarm 1.1 | 3.5 | 12.5% | 15 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.5% | 9 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.1% | 12 |
| shrub.Silver v048 | 6.0 | 9.0% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.0% | 2 |
| stelo.Mirror 1.1 | 9.0 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.4 | 18 / 35 | 3589 |
| 2 | 1 | 66.8 | 83.8 | 19 / 35 | 3995 |
| 3 | 1 | 65.6 | 83.5 | 14 / 35 | 3609 |
| 4 | 1 | 68.6 | 90.5 | 21 / 35 | 4288 |
| 5 | 1 | 67.6 | 86.7 | 19 / 35 | 3850 |
| 6 | 1 | 68.3 | 91.4 | 18 / 35 | 3798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 65 | 51% |
| lessonz.robocode.Oz 0.5.0 | 32 | 94% |
| ary.Swarm 1.1 | 30 | 73% |
| simonton.nano.MeleeSeed 1.8 | 14 | 100% |
| stelo.Mirror 1.1 | 4 | 100% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 46 | 46% | 83 |
| ary.Swarm 1.1 | 23 | 23% | 45 |
| lessonz.robocode.Oz 0.5.0 | 12 | 12% | 27 |
| simonton.nano.MeleeSeed 1.8 | 12 | 12% | 25 |
| stelo.Mirror 1.1 | 3 | 3% | 11 |
| jsal.Jsalbot 1.0 | 2 | 2% | 7 |
| zyx.nano.Ant 1.1 | 2 | 2% | 5 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| shrub.Silver v048 | 0 | 0% | 5 |

## Melee bench: F42

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.2 | 83 / 210 | 2.24 | 17.6% | 28753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.2 | 17.6% | 83 |
| wompi.Wallaby 5.1 | 1.8 | 15.8% | 68 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.7% | 22 |
| ara.Shera 0.88 | 3.8 | 13.1% | 31 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 2 |
| maribo.IotaCT 1.1 | 6.5 | 7.3% | 2 |
| dsw.StaticD 1.0 | 6.7 | 7.2% | 2 |
| stelo.MirrorMicro 1.0 | 8.2 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 89.2 | 18 / 35 | 4577 |
| 2 | 1 | 66.6 | 82.5 | 12 / 35 | 5133 |
| 3 | 1 | 67.2 | 85.7 | 16 / 35 | 4822 |
| 4 | 1 | 68.1 | 89.2 | 15 / 35 | 4888 |
| 5 | 1 | 68.0 | 89.5 | 12 / 35 | 4859 |
| 6 | 2 | 65.2 | 81.0 | 10 / 35 | 4474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 66 | 45% |
| maribo.mini.MiniQuester 0.1 | 34 | 85% |
| ara.Shera 0.88 | 29 | 55% |
| dsw.StaticD 1.0 | 6 | 83% |
| maribo.IotaCT 1.1 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 50% |

Hadur died in 127 of 210 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 63 | 50% | 99 |
| ara.Shera 0.88 | 28 | 22% | 43 |
| maribo.mini.MiniQuester 0.1 | 23 | 18% | 48 |
| amz.NanoClone 1.41 | 8 | 6% | 8 |
| dsw.StaticD 1.0 | 2 | 2% | 7 |
| maribo.IotaCT 1.1 | 2 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |

## Melee bench: F43

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 69.6 | 19 / 210 | 3.73 | 13.3% | 20395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.0% | 164 |
| hadur117.mini.DeiseRK 0.2 | 2.3 | 13.3% | 19 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.1% | 17 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.3% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.0% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 10.3% | 3 |
| mz.NanoGod 2.02 | 7.3 | 7.5% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.7% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.2 | 64.8 | 1 / 35 | 2928 |
| 2 | 2 | 62.2 | 72.4 | 3 / 35 | 3304 |
| 3 | 2 | 63.0 | 71.7 | 2 / 35 | 3781 |
| 4 | 2 | 61.6 | 69.2 | 7 / 35 | 3335 |
| 5 | 2 | 63.0 | 73.7 | 4 / 35 | 3474 |
| 6 | 2 | 60.6 | 66.0 | 2 / 35 | 3573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 58 | 10% |
| brainfade.melee.Dusk 0.44 | 10 | 80% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |
| dummy.micro.Sparrow 2.5 | 1 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 119 | 62% | 126 |
| brainfade.melee.Dusk 0.44 | 19 | 10% | 27 |
| dummy.micro.Sparrow 2.5 | 19 | 10% | 20 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 8% | 17 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 8 |
| jab.DiamondStealer 5 | 6 | 3% | 6 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.2 | 115 / 210 | 1.89 | 19.3% | 30377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 19.3% | 115 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.5% | 40 |
| stelo.Liblix 0.3.1 | 2.5 | 14.8% | 46 |
| wompi.Quokka 1.6 | 4.2 | 10.8% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 9.1% | 2 |
| jwirde.Gort 2.0 | 5.7 | 8.6% | 0 |
| disan.Chair 2.2.0 | 7.5 | 7.4% | 2 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.7% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 90.2 | 16 / 35 | 5043 |
| 2 | 1 | 69.1 | 88.6 | 19 / 35 | 5062 |
| 3 | 1 | 69.3 | 90.2 | 19 / 35 | 4831 |
| 4 | 1 | 69.4 | 90.8 | 20 / 35 | 5092 |
| 5 | 1 | 69.9 | 92.4 | 20 / 35 | 5313 |
| 6 | 1 | 69.2 | 88.9 | 21 / 35 | 5036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 75 | 65% |
| tzu.TheArtOfWar 1.2 | 65 | 60% |
| wompi.Quokka 1.6 | 14 | 79% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 86% |
| disan.Chair 2.2.0 | 6 | 83% |
| jwirde.Gort 2.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 41 | 43% | 78 |
| stelo.Liblix 0.3.1 | 39 | 41% | 87 |
| wompi.Quokka 1.6 | 7 | 7% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 4% | 7 |
| jwirde.Gort 2.0 | 2 | 2% | 7 |
| disan.Chair 2.2.0 | 1 | 1% | 8 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |

## Melee bench: F45

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.7 | 97 / 210 | 1.93 | 19.8% | 33530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRK 0.2 | 1.0 | 19.8% | 97 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.7% | 91 |
| jje.BagPuss 1.2 | 2.7 | 11.9% | 6 |
| myl.nano.Graviton 1.10 | 4.3 | 10.3% | 4 |
| sul.Lunar 1.1 | 4.7 | 10.2% | 7 |
| fm.claire 1.7 | 6.3 | 8.4% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.3% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 7.9% | 2 |
| wit.Deep7 2.0 | 9.3 | 5.7% | 2 |
| abud.ThirdRobo 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 92.4 | 17 / 35 | 5450 |
| 2 | 1 | 68.3 | 86.0 | 15 / 35 | 5256 |
| 3 | 1 | 69.1 | 88.9 | 15 / 35 | 5498 |
| 4 | 1 | 69.6 | 88.9 | 16 / 35 | 5822 |
| 5 | 1 | 70.5 | 92.7 | 18 / 35 | 5780 |
| 6 | 1 | 69.5 | 89.2 | 16 / 35 | 5724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 117 | 40% |
| jje.BagPuss 1.2 | 18 | 78% |
| myl.nano.Graviton 1.10 | 17 | 88% |
| sul.Lunar 1.1 | 11 | 82% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 83% |
| wit.Deep7 2.0 | 5 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 2088. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 72 | 64% | 0 |
| jje.BagPuss 1.2 | 12 | 11% | 54 |
| myl.nano.Graviton 1.10 | 11 | 10% | 49 |
| sul.Lunar 1.1 | 7 | 6% | 48 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 25 |
| fm.claire 1.7 | 4 | 4% | 13 |
| hvilela.HVilela 0.9 | 2 | 2% | 8 |
| wit.Deep7 2.0 | 1 | 1% | 10 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

## Melee bench: F46

hadur117.mini.DeiseRK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 77.5 | 31 / 210 | 3.03 | 15.1% | 25177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 17.5% | 94 |
| kc.mini.Mirage 0.2 | 1.7 | 16.6% | 61 |
| hadur117.mini.DeiseRK 0.2 | 3.0 | 15.1% | 31 |
| mz.MicroSheep 1.0 | 4.5 | 10.5% | 6 |
| cx.Princess 1.0 | 4.5 | 10.2% | 17 |
| sadoner.killer 0.2 | 6.0 | 8.9% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 6.2% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 74.0 | 3 / 35 | 4393 |
| 2 | 3 | 64.0 | 79.7 | 5 / 35 | 4109 |
| 3 | 3 | 62.0 | 72.7 | 4 / 35 | 3931 |
| 4 | 3 | 65.7 | 82.2 | 8 / 35 | 4331 |
| 5 | 3 | 63.9 | 77.1 | 6 / 35 | 4292 |
| 6 | 3 | 64.1 | 79.0 | 5 / 35 | 4121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 48 | 40% |
| rsalesc.melee.Medina 0.4.5 | 34 | 18% |
| mz.MicroSheep 1.0 | 6 | 83% |
| cx.Princess 1.0 | 5 | 0% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 68 | 38% | 87 |
| rsalesc.melee.Medina 0.4.5 | 63 | 35% | 71 |
| cx.Princess 1.0 | 19 | 11% | 19 |
| mz.MicroSheep 1.0 | 15 | 8% | 19 |
| arthord.NanoSatanMelee Beta | 8 | 4% | 8 |
| sadoner.killer 0.2 | 3 | 2% | 3 |
| jeremyreeder.collective.Prophet 5 | 3 | 2% | 3 |

