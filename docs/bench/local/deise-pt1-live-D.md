# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 86.0 | 53 / 210 | 2.26 | 17.0% | 29218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 149 |
| hadur117.mini.DeiseD 0.5 | 2.0 | 17.0% | 53 |
| sgp.JollyNinja 3.53 | 3.3 | 11.3% | 2 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.4% | 0 |
| mz.MicroGodMelee 1 | 4.7 | 10.5% | 3 |
| lorneswork.Predator 1.0 | 5.5 | 10.0% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.2% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 86.7 | 12 / 35 | 4743 |
| 2 | 2 | 67.3 | 87.3 | 7 / 35 | 5010 |
| 3 | 2 | 66.6 | 84.4 | 7 / 35 | 5099 |
| 4 | 2 | 66.6 | 86.0 | 7 / 35 | 4744 |
| 5 | 2 | 66.2 | 84.1 | 10 / 35 | 4657 |
| 6 | 2 | 67.3 | 87.3 | 10 / 35 | 4965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 130 | 17% |
| sgp.JollyNinja 3.53 | 13 | 92% |
| mz.MicroGodMelee 1 | 10 | 80% |
| lorneswork.Predator 1.0 | 6 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 0% |

Hadur died in 158 of 210 rounds, at a mean tick of 1198. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 78% | 146 |
| mz.MicroGodMelee 1 | 10 | 6% | 20 |
| sgp.JollyNinja 3.53 | 9 | 6% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 13 |
| adt.Ar2 1.0 | 4 | 3% | 4 |
| lorneswork.Predator 1.0 | 3 | 2% | 7 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.4 | 110 / 210 | 2.22 | 18.3% | 28049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 18.3% | 110 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 15.2% | 51 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 12.9% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.9% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.3% | 11 |
| sch.Simone 0.3d | 7.0 | 7.2% | 4 |
| Noran.BitchingElk 0.054 | 7.2 | 7.4% | 10 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.6% | 1 |
| stelo.PatternRobot 1.0 | 8.5 | 6.2% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.7 | 19 / 35 | 4370 |
| 2 | 1 | 70.2 | 93.3 | 19 / 35 | 5122 |
| 3 | 1 | 66.2 | 80.6 | 17 / 35 | 4547 |
| 4 | 1 | 66.1 | 81.6 | 14 / 35 | 4675 |
| 5 | 1 | 68.2 | 88.3 | 20 / 35 | 4814 |
| 6 | 1 | 68.2 | 88.9 | 21 / 35 | 4521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 65 | 66% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 39 | 72% |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 68% |
| Noran.BitchingElk 0.054 | 15 | 67% |
| sch.Simone 0.3d | 6 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 80% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 2 | 50% |

Hadur died in 100 of 210 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 32 | 32% | 69 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 22% | 48 |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 13% | 28 |
| stelo.PatternRobot 1.0 | 12 | 12% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 8% | 13 |
| Noran.BitchingElk 0.054 | 5 | 5% | 21 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 7 |
| fullsail.SweetTea 1.1 | 3 | 3% | 5 |
| sch.Simone 0.3d | 1 | 1% | 5 |

## Melee bench: F03

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.2 | 168 / 210 | 1.52 | 21.0% | 38786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 21.0% | 168 |
| radnor.DoctorBob 1.42 | 2.7 | 13.4% | 10 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.4% | 9 |
| vuen.Cake 2.51 | 3.3 | 12.8% | 21 |
| urdos.URDOS 1.3 | 5.5 | 8.7% | 1 |
| adt.Ar1 2.1 | 6.7 | 7.4% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 6.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 7.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.4 | 24 / 35 | 6431 |
| 2 | 1 | 71.8 | 95.9 | 31 / 35 | 6645 |
| 3 | 1 | 72.4 | 96.8 | 31 / 35 | 6549 |
| 4 | 1 | 71.4 | 95.6 | 28 / 35 | 6177 |
| 5 | 1 | 71.7 | 93.7 | 28 / 35 | 6762 |
| 6 | 1 | 70.8 | 91.7 | 26 / 35 | 6222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 76 | 87% |
| kawigi.nano.Lib 1.0 | 59 | 100% |
| radnor.DoctorBob 1.42 | 37 | 95% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 22 | 49% | 85 |
| radnor.DoctorBob 1.42 | 12 | 27% | 47 |
| kawigi.nano.Lib 1.0 | 6 | 13% | 62 |
| urdos.URDOS 1.3 | 3 | 7% | 3 |
| adt.Ar1 2.1 | 1 | 2% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.3 | 35 / 210 | 2.23 | 17.2% | 31595 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.3% | 171 |
| hadur117.mini.DeiseD 0.5 | 2.0 | 17.2% | 35 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.8% | 6 |
| TNT.TNT 0.99.1 | 4.0 | 10.4% | 1 |
| josago.Jorgito 0.16 | 5.2 | 8.9% | 0 |
| tj.zombie1n 1.0.1 | 6.2 | 7.1% | 0 |
| css.Delitioner 0.11 | 7.0 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 85.4 | 4 / 35 | 5103 |
| 2 | 2 | 66.7 | 84.8 | 5 / 35 | 4984 |
| 3 | 2 | 66.7 | 84.1 | 4 / 35 | 4962 |
| 4 | 2 | 69.4 | 89.2 | 12 / 35 | 5724 |
| 5 | 2 | 67.9 | 85.7 | 5 / 35 | 5344 |
| 6 | 2 | 68.6 | 88.6 | 5 / 35 | 5478 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 163 | 19% |
| apc.LeeroyJenkins2 1.0 | 5 | 60% |
| TNT.TNT 0.99.1 | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 1459. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 149 | 84% | 181 |
| apc.LeeroyJenkins2 1.0 | 12 | 7% | 15 |
| josago.Jorgito 0.16 | 5 | 3% | 5 |
| TNT.TNT 0.99.1 | 4 | 2% | 4 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 74.7 | 23 / 210 | 3.28 | 13.9% | 20168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.4% | 128 |
| justin.DemonicRage 3.4 | 2.0 | 16.8% | 49 |
| hadur117.mini.DeiseD 0.5 | 3.2 | 13.9% | 23 |
| wompi.Numbat 2.1 | 3.8 | 12.3% | 8 |
| ms.Ares 0.19 | 5.2 | 9.0% | 0 |
| axeBots.HataMoto 3.09 | 5.8 | 8.7% | 2 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.5% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 79.7 | 4 / 35 | 3325 |
| 2 | 3 | 61.7 | 74.3 | 5 / 35 | 3571 |
| 3 | 4 | 60.5 | 69.8 | 2 / 35 | 3346 |
| 4 | 3 | 63.4 | 77.1 | 6 / 35 | 3739 |
| 5 | 3 | 59.7 | 70.2 | 3 / 35 | 2795 |
| 6 | 3 | 62.6 | 76.8 | 3 / 35 | 3392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 42 | 12% |
| justin.DemonicRage 3.4 | 27 | 37% |
| wompi.Numbat 2.1 | 8 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 80 | 43% | 87 |
| justin.DemonicRage 3.4 | 61 | 32% | 69 |
| wompi.Numbat 2.1 | 21 | 11% | 28 |
| axeBots.HataMoto 3.09 | 11 | 6% | 11 |
| ms.Ares 0.19 | 8 | 4% | 8 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.0 | 128 / 210 | 1.99 | 19.0% | 29063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 19.0% | 128 |
| jekl.StoneGhost 0.7 | 2.3 | 14.4% | 24 |
| origin.SleepSiphon 1.7b | 3.2 | 13.9% | 35 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.5% | 13 |
| mld.Wisdom 1.0 | 5.0 | 10.5% | 3 |
| gg.Wolverine 2.0 | 5.8 | 8.7% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.5% | 5 |
| DBall.NUKE 0.1 | 7.7 | 6.1% | 0 |
| spinnercat.Omen 1.0 | 8.7 | 5.5% | 0 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.2 | 21 / 35 | 5194 |
| 2 | 1 | 68.2 | 86.3 | 18 / 35 | 4851 |
| 3 | 1 | 70.0 | 92.1 | 25 / 35 | 4879 |
| 4 | 1 | 68.9 | 88.3 | 21 / 35 | 4733 |
| 5 | 1 | 70.2 | 92.4 | 24 / 35 | 4931 |
| 6 | 1 | 67.7 | 85.7 | 19 / 35 | 4475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 53 | 72% |
| jekl.StoneGhost 0.7 | 46 | 93% |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 81% |
| gg.Wolverine 2.0 | 13 | 100% |
| mld.Wisdom 1.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 25 | 30% | 71 |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 28% | 54 |
| jekl.StoneGhost 0.7 | 23 | 28% | 53 |
| mld.Wisdom 1.0 | 5 | 6% | 13 |
| gg.Wolverine 2.0 | 2 | 2% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 3 |
| DBall.NUKE 0.1 | 1 | 1% | 5 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.1 | 127 / 210 | 1.53 | 20.0% | 34012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 20.0% | 127 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.3% | 43 |
| rtk.Tachikoma 1.0 | 2.7 | 17.2% | 34 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.2% | 3 |
| franzor.Lizt 1.3.1 | 5.0 | 10.0% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 7.8% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.5 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 96.2 | 24 / 35 | 6022 |
| 2 | 1 | 71.4 | 94.3 | 21 / 35 | 5786 |
| 3 | 1 | 72.4 | 95.2 | 23 / 35 | 5792 |
| 4 | 1 | 71.0 | 93.3 | 18 / 35 | 5325 |
| 5 | 1 | 70.7 | 90.8 | 19 / 35 | 5489 |
| 6 | 1 | 71.8 | 94.6 | 22 / 35 | 5598 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 106 | 75% |
| rsalesc.melee.Monk 0.3.6c | 51 | 35% |
| oog.melee.CapuletDroid 1.1 | 26 | 92% |
| franzor.Lizt 1.3.1 | 5 | 80% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1515. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 39 | 46% | 64 |
| rtk.Tachikoma 1.0 | 33 | 39% | 107 |
| oog.melee.CapuletDroid 1.1 | 5 | 6% | 31 |
| franzor.Lizt 1.3.1 | 4 | 5% | 0 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 92.5 | 144 / 210 | 1.67 | 19.9% | 30668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 19.9% | 144 |
| tm.Yuugao 1.0 | 2.7 | 13.2% | 33 |
| shrub.Vapour v159 | 2.7 | 12.6% | 17 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 10.7% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.1% | 3 |
| m3thos.Eva00 1.1 | 6.7 | 7.8% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 7.9% | 2 |
| qualidafial.MajorDick 1.0.1 | 7.7 | 6.7% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.0% | 0 |
| SHAM.WOW 1.4 | 9.3 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.1 | 22 / 35 | 5281 |
| 2 | 1 | 69.1 | 91.7 | 22 / 35 | 4824 |
| 3 | 1 | 69.8 | 94.6 | 25 / 35 | 5014 |
| 4 | 1 | 68.9 | 88.9 | 23 / 35 | 5160 |
| 5 | 1 | 70.7 | 95.9 | 27 / 35 | 5026 |
| 6 | 1 | 70.1 | 93.0 | 25 / 35 | 5363 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 69 | 80% |
| shrub.Vapour v159 | 35 | 74% |
| Krabb.sliNk.Garm 0.9u | 32 | 75% |
| com.spp.robocode.MostlyHarmless 010 | 20 | 90% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 83% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 75% |
| SHAM.WOW 1.4 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 21 | 30% | 79 |
| shrub.Vapour v159 | 19 | 28% | 48 |
| Krabb.sliNk.Garm 0.9u | 14 | 20% | 29 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 7% | 19 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 6% | 17 |
| SHAM.WOW 1.4 | 2 | 3% | 5 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 5 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 4 |
| m3thos.Eva00 1.1 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.0 | 65 / 210 | 2.89 | 16.2% | 24892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 18.0% | 104 |
| hadur117.mini.DeiseD 0.5 | 1.7 | 16.2% | 65 |
| kc.micro.Figment 1.0 | 3.0 | 14.2% | 18 |
| yagami.Tidus 0.11 | 4.0 | 10.7% | 1 |
| pedersen.Grishnakh 1.0 | 5.3 | 9.3% | 11 |
| mc2.enemy.Original 0.9 | 5.8 | 9.3% | 11 |
| dft.Calliope 5.6 | 6.8 | 7.7% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.0% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.8 | 12 / 35 | 4200 |
| 2 | 2 | 64.5 | 76.2 | 12 / 35 | 4012 |
| 3 | 1 | 67.0 | 84.8 | 14 / 35 | 4450 |
| 4 | 2 | 64.4 | 77.8 | 6 / 35 | 4059 |
| 5 | 2 | 63.6 | 72.1 | 11 / 35 | 4086 |
| 6 | 2 | 64.8 | 78.4 | 10 / 35 | 4085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 69 | 41% |
| kc.micro.Figment 1.0 | 20 | 95% |
| mc2.enemy.Original 0.9 | 11 | 73% |
| yagami.Tidus 0.11 | 6 | 100% |
| pedersen.Grishnakh 1.0 | 5 | 20% |
| dft.Calliope 5.6 | 2 | 50% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 69 | 47% | 97 |
| kc.micro.Figment 1.0 | 24 | 16% | 45 |
| yagami.Tidus 0.11 | 14 | 10% | 23 |
| mc2.enemy.Original 0.9 | 14 | 10% | 19 |
| pedersen.Grishnakh 1.0 | 14 | 10% | 14 |
| dft.Calliope 5.6 | 4 | 3% | 6 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 3 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 96.3 | 179 / 210 | 1.33 | 20.8% | 33038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 20.8% | 179 |
| DTF.Kludgy 1.2b | 2.0 | 14.1% | 11 |
| ne.Chimera 1.2 | 3.5 | 12.3% | 2 |
| ejb.Polaris 1.0.1 | 3.8 | 11.8% | 9 |
| tvv.micro.Antares 1.1.1 | 5.0 | 10.9% | 4 |
| vStar.RAFzilla 2.15 | 5.7 | 9.6% | 2 |
| kurios.DOSexe .9b | 7.7 | 5.9% | 2 |
| sam.Samspin 1.0 | 7.8 | 5.7% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.3 | 28 / 35 | 5892 |
| 2 | 1 | 72.4 | 99.7 | 34 / 35 | 5658 |
| 3 | 1 | 71.2 | 96.8 | 31 / 35 | 5078 |
| 4 | 1 | 71.5 | 94.9 | 30 / 35 | 5749 |
| 5 | 1 | 70.8 | 96.8 | 28 / 35 | 5030 |
| 6 | 1 | 70.9 | 95.6 | 28 / 35 | 5631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 66 | 91% |
| ejb.Polaris 1.0.1 | 51 | 90% |
| ne.Chimera 1.2 | 27 | 96% |
| tvv.micro.Antares 1.1.1 | 21 | 100% |
| vStar.RAFzilla 2.15 | 16 | 100% |
| donjezza.Muncho 1.0 | 5 | 80% |
| kurios.DOSexe .9b | 3 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 11 | 35% | 69 |
| ejb.Polaris 1.0.1 | 8 | 26% | 53 |
| ne.Chimera 1.2 | 7 | 23% | 36 |
| donjezza.Muncho 1.0 | 2 | 6% | 7 |
| kurios.DOSexe .9b | 2 | 6% | 4 |
| vStar.RAFzilla 2.15 | 1 | 3% | 14 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 18 |
| sam.Samspin 1.0 | 0 | 0% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 81.3 | 92 / 210 | 2.68 | 16.8% | 25051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 16.3% | 64 |
| hadur117.mini.DeiseD 0.5 | 1.5 | 16.8% | 92 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.4% | 16 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 13 |
| br2.MobyDickBot 1.6 | 5.5 | 9.3% | 14 |
| rdt199.Warlord 0.73 | 5.5 | 9.2% | 8 |
| uji.YellohFellah 1.0 | 7.3 | 7.5% | 4 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.2% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 5.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 73.3 | 16 / 35 | 3937 |
| 2 | 2 | 63.8 | 78.4 | 9 / 35 | 4020 |
| 3 | 1 | 67.8 | 87.9 | 20 / 35 | 4363 |
| 4 | 1 | 65.7 | 83.8 | 17 / 35 | 3911 |
| 5 | 1 | 66.6 | 85.1 | 16 / 35 | 4542 |
| 6 | 2 | 65.2 | 79.4 | 14 / 35 | 4278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 61 | 64% |
| cx.mini.Nimrod 0.55 | 26 | 73% |
| br2.MobyDickBot 1.6 | 17 | 65% |
| djc.DynaBot 0.1.1 | 14 | 71% |
| uji.YellohFellah 1.0 | 8 | 88% |
| rdt199.Warlord 0.73 | 7 | 71% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 44 | 37% | 85 |
| cx.mini.Nimrod 0.55 | 29 | 25% | 47 |
| br2.MobyDickBot 1.6 | 13 | 11% | 26 |
| djc.DynaBot 0.1.1 | 12 | 10% | 18 |
| rdt199.Warlord 0.73 | 10 | 8% | 16 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 7 |
| uji.YellohFellah 1.0 | 3 | 3% | 7 |
| stelo.MirrorNano 1.3 | 1 | 1% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.1 | 122 / 210 | 2.34 | 17.6% | 23191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 17.6% | 122 |
| nat.PallasHawk 1.0 | 2.3 | 14.0% | 33 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.7% | 29 |
| darkcanuck.Leon 1.01 | 3.8 | 12.6% | 18 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 7 |
| jrm.Test0 1.0 | 6.5 | 7.8% | 0 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.7% | 0 |
| jp.Perpy 16.0 | 7.7 | 6.7% | 1 |
| stuff.Vlad 0.1 | 8.8 | 5.5% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 76.8 | 15 / 35 | 3749 |
| 2 | 1 | 68.0 | 88.3 | 23 / 35 | 3878 |
| 3 | 1 | 66.5 | 82.9 | 20 / 35 | 3992 |
| 4 | 1 | 65.6 | 82.5 | 20 / 35 | 3596 |
| 5 | 1 | 69.6 | 93.3 | 25 / 35 | 3887 |
| 6 | 1 | 67.1 | 86.7 | 19 / 35 | 4089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 50 | 80% |
| nat.PallasHawk 1.0 | 47 | 81% |
| darkcanuck.Leon 1.01 | 39 | 82% |
| brainfade.melee.Genghis 0.36 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 0% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 20 | 22% | 56 |
| bts.wiki.RipCurl 0.9b | 19 | 21% | 51 |
| darkcanuck.Leon 1.01 | 14 | 16% | 58 |
| brainfade.melee.Genghis 0.36 | 12 | 13% | 14 |
| jrm.Test0 1.0 | 7 | 8% | 7 |
| cs.sheldor.Talon 1.1 | 6 | 7% | 8 |
| jaybot.bots.Oddball 4.0 | 5 | 6% | 5 |
| jp.Perpy 16.0 | 3 | 3% | 6 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 86.1 | 91 / 210 | 2.25 | 17.0% | 25270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.9% | 77 |
| hadur117.mini.DeiseD 0.5 | 1.7 | 17.0% | 91 |
| ags.Glacier 0.2.11 | 2.7 | 16.2% | 28 |
| shinh.Entangled 0.3 | 4.2 | 12.3% | 12 |
| gh.micro.Gruweltje 0.7 | 4.8 | 10.9% | 3 |
| apc.Colossus2 0.17 | 6.3 | 7.6% | 0 |
| stelo.Wang 1.0 | 6.7 | 6.7% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.0% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.2% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 85.4 | 15 / 35 | 4351 |
| 2 | 2 | 66.9 | 85.4 | 16 / 35 | 4160 |
| 3 | 2 | 67.6 | 89.8 | 14 / 35 | 4147 |
| 4 | 1 | 67.1 | 87.0 | 16 / 35 | 4194 |
| 5 | 1 | 67.2 | 86.3 | 15 / 35 | 4329 |
| 6 | 2 | 66.0 | 82.9 | 15 / 35 | 4089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 76 | 53% |
| ags.Glacier 0.2.11 | 45 | 69% |
| shinh.Entangled 0.3 | 19 | 84% |
| gh.micro.Gruweltje 0.7 | 4 | 50% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 49 | 40% | 86 |
| ags.Glacier 0.2.11 | 41 | 34% | 76 |
| shinh.Entangled 0.3 | 19 | 16% | 34 |
| gh.micro.Gruweltje 0.7 | 5 | 4% | 8 |
| stelo.Wang 1.0 | 3 | 2% | 3 |
| maribo.FollowFire 1 | 2 | 2% | 1 |
| apc.Colossus2 0.17 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 95.6 | 174 / 210 | 1.40 | 21.0% | 34251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 21.0% | 174 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.7% | 12 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 4.7 | 9.3% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 9.3% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.7 | 8.2% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.1% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.2% | 5 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 96.8 | 30 / 35 | 5695 |
| 2 | 1 | 72.1 | 97.8 | 30 / 35 | 5705 |
| 3 | 1 | 71.9 | 94.0 | 30 / 35 | 6122 |
| 4 | 1 | 71.3 | 94.9 | 28 / 35 | 5510 |
| 5 | 1 | 71.4 | 95.2 | 27 / 35 | 5673 |
| 6 | 1 | 71.4 | 94.9 | 29 / 35 | 5546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 94 | 97% |
| catcat20.shape.Theta 0.018 | 61 | 85% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 83% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 15 | 42% | 67 |
| simonton.micro.Sprout 1.1.3 | 14 | 39% | 97 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 11% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 8% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 0 | 0% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 2 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.6 | 112 / 210 | 2.39 | 18.3% | 30169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 18.3% | 112 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.4% | 14 |
| emp.Yngwie 1.11 | 2.8 | 13.6% | 41 |
| mld.DustBunny 3.8 | 4.2 | 11.9% | 11 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.2% | 8 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.6% | 19 |
| lambdaxy.TBot 0.1 | 7.5 | 6.4% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 5.9% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.0% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.7 | 20 / 35 | 4404 |
| 2 | 1 | 67.8 | 83.2 | 18 / 35 | 4946 |
| 3 | 1 | 69.1 | 87.3 | 20 / 35 | 5344 |
| 4 | 1 | 68.4 | 84.8 | 21 / 35 | 5109 |
| 5 | 1 | 67.8 | 82.5 | 15 / 35 | 5405 |
| 6 | 1 | 67.3 | 83.2 | 18 / 35 | 4961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 52 | 73% |
| mld.DustBunny 3.8 | 22 | 95% |
| kawigi.robot.Girl 1.2 | 22 | 82% |
| kawigi.micro.Shiz 1.1 | 20 | 95% |
| cb.nano.Insomnia 1.0 | 16 | 81% |
| divineomega.TrialBot 0.003 | 4 | 75% |

Hadur died in 98 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 37% | 88 |
| cb.nano.Insomnia 1.0 | 22 | 22% | 22 |
| kawigi.micro.Shiz 1.1 | 13 | 13% | 35 |
| mld.DustBunny 3.8 | 10 | 10% | 34 |
| kawigi.robot.Girl 1.2 | 10 | 10% | 18 |
| divineomega.TrialBot 0.003 | 7 | 7% | 9 |
| lambdaxy.TBot 0.1 | 0 | 0% | 3 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.5 | 99 / 210 | 2.21 | 18.8% | 32938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 18.8% | 99 |
| gh.Griezel 0.5.2 | 2.0 | 17.1% | 61 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.6% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 11.1% | 37 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.2% | 3 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.5% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.4% | 2 |
| asd.Cthulhu 1.3 | 8.3 | 5.2% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 4.6% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.6 | 17 / 35 | 5691 |
| 2 | 1 | 68.5 | 84.4 | 14 / 35 | 5612 |
| 3 | 1 | 70.0 | 91.4 | 21 / 35 | 5376 |
| 4 | 1 | 68.4 | 84.4 | 17 / 35 | 5241 |
| 5 | 1 | 68.4 | 84.8 | 15 / 35 | 5396 |
| 6 | 1 | 69.0 | 86.3 | 15 / 35 | 5622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 97 | 65% |
| techdude.forest.FlamingForest 1.1 | 25 | 36% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 89% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 1306. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 50 | 45% | 110 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 25 | 23% | 38 |
| techdude.forest.FlamingForest 1.1 | 17 | 15% | 28 |
| bvh.fnr.Fenrir 0.36l | 9 | 8% | 11 |
| stelo.IntrinsicVolatility 1.4 | 6 | 5% | 10 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 6 |
| asd.Cthulhu 1.3 | 2 | 2% | 4 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 3 |

## Melee bench: F17

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.2 | 99 / 210 | 2.69 | 17.2% | 28572 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 17.2% | 99 |
| et.Predator 1.8 | 2.7 | 13.5% | 24 |
| cx.BlestPain 1.41 | 3.3 | 12.8% | 36 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.5% | 34 |
| nic.Nicator 2.4 | 4.8 | 11.1% | 12 |
| ahf.NanoAndrew .4 | 6.0 | 10.1% | 4 |
| maribo.melee.BMV 0.1 | 6.5 | 9.3% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.6 | 18 / 35 | 4801 |
| 2 | 1 | 66.9 | 81.3 | 18 / 35 | 4673 |
| 3 | 1 | 67.6 | 84.1 | 18 / 35 | 4867 |
| 4 | 1 | 67.6 | 83.2 | 18 / 35 | 5020 |
| 5 | 1 | 64.2 | 73.0 | 14 / 35 | 4586 |
| 6 | 1 | 65.3 | 78.1 | 13 / 35 | 4625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 46 | 91% |
| oog.melee.Mercutio 1.0 | 32 | 72% |
| cx.BlestPain 1.41 | 26 | 46% |
| nic.Nicator 2.4 | 16 | 75% |
| ahf.NanoAndrew .4 | 7 | 86% |
| maribo.melee.BMV 0.1 | 5 | 80% |

Hadur died in 112 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 33 | 29% | 51 |
| et.Predator 1.8 | 24 | 21% | 59 |
| oog.melee.Mercutio 1.0 | 20 | 18% | 43 |
| nic.Nicator 2.4 | 11 | 10% | 23 |
| ahf.NanoAndrew .4 | 11 | 10% | 17 |
| maribo.melee.BMV 0.1 | 7 | 6% | 10 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.1 | 142 / 210 | 1.90 | 19.0% | 26593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 19.0% | 142 |
| morbid.MorbidPriest 1.0 | 2.7 | 13.7% | 35 |
| uji.DBH 1.1 | 3.3 | 11.3% | 6 |
| agd.Mooserwirt2 2.7 | 3.7 | 11.5% | 19 |
| ratosh.Nobo 0.21 | 4.8 | 9.7% | 1 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.3% | 2 |
| sigterm.Sigterm 1.0 | 7.0 | 8.0% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.0% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.2% | 0 |
| stelo.WangRobot 1.0 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 89.5 | 20 / 35 | 4497 |
| 2 | 1 | 68.9 | 89.8 | 23 / 35 | 4718 |
| 3 | 1 | 67.5 | 85.7 | 24 / 35 | 4010 |
| 4 | 1 | 68.1 | 90.2 | 24 / 35 | 4253 |
| 5 | 1 | 70.1 | 93.0 | 30 / 35 | 4731 |
| 6 | 1 | 68.6 | 92.1 | 21 / 35 | 4384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 63 | 87% |
| agd.Mooserwirt2 2.7 | 30 | 70% |
| uji.DBH 1.1 | 25 | 92% |
| spinnercat.Robovirus 2.718 | 15 | 87% |
| sigterm.Sigterm 1.0 | 15 | 80% |
| ratosh.Nobo 0.21 | 12 | 92% |
| stelo.WangRobot 1.0 | 4 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 22 | 32% | 88 |
| agd.Mooserwirt2 2.7 | 18 | 26% | 45 |
| uji.DBH 1.1 | 8 | 12% | 22 |
| sigterm.Sigterm 1.0 | 8 | 12% | 15 |
| spinnercat.Robovirus 2.718 | 5 | 7% | 15 |
| ratosh.Nobo 0.21 | 3 | 4% | 13 |
| stelo.WangRobot 1.0 | 2 | 3% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 1% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.3 | 177 / 210 | 1.42 | 21.0% | 33196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 21.0% | 177 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.4% | 18 |
| mld.Infinity 2.2 | 3.0 | 13.4% | 11 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.2% | 2 |
| erdnis.Rover 0.3 | 5.0 | 10.1% | 1 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.6% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.2% | 0 |
| pac.ABC 2.1 | 8.0 | 6.5% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.7 | 27 / 35 | 5668 |
| 2 | 1 | 73.4 | 98.7 | 31 / 35 | 6005 |
| 3 | 1 | 73.1 | 98.4 | 32 / 35 | 5690 |
| 4 | 1 | 71.0 | 94.0 | 30 / 35 | 4860 |
| 5 | 1 | 70.7 | 89.8 | 26 / 35 | 5539 |
| 6 | 1 | 72.4 | 98.1 | 31 / 35 | 5434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 115 | 92% |
| mld.Infinity 2.2 | 45 | 93% |
| krillr.mini.JointStrike 2.0.0 | 13 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| erdnis.Rover 0.3 | 4 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 1049. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 18 | 55% | 130 |
| mld.Infinity 2.2 | 8 | 24% | 28 |
| krillr.mini.JointStrike 2.0.0 | 3 | 9% | 19 |
| erdnis.Rover 0.3 | 2 | 6% | 8 |
| pbg.R2D2 1.0 | 1 | 3% | 8 |
| patson.PatsonTestBot 1.0 | 1 | 3% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 6 |
| pac.ABC 2.1 | 0 | 0% | 2 |

## Melee bench: F20

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.3 | 141 / 210 | 1.78 | 20.1% | 33089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 20.1% | 141 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 35 |
| fwb.Nine 1.0.1 | 3.5 | 11.5% | 17 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 11.1% | 5 |
| catcat20.Rabbit 0.001 | 4.5 | 10.6% | 13 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 7.5% | 0 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.5% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.7 | 27 / 35 | 5450 |
| 2 | 1 | 70.5 | 91.4 | 23 / 35 | 5431 |
| 3 | 1 | 71.4 | 94.9 | 27 / 35 | 5772 |
| 4 | 1 | 70.1 | 90.8 | 24 / 35 | 5795 |
| 5 | 1 | 67.8 | 84.4 | 17 / 35 | 5060 |
| 6 | 1 | 70.6 | 92.7 | 23 / 35 | 5581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 76 | 78% |
| catcat20.Rabbit 0.001 | 39 | 90% |
| fwb.Nine 1.0.1 | 39 | 79% |
| nz.jdc.nano.GridFu 1.0 | 12 | 83% |
| bayen.nut.Squirrel 1.615 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 1212. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 49% | 84 |
| fwb.Nine 1.0.1 | 14 | 19% | 18 |
| catcat20.Rabbit 0.001 | 11 | 15% | 51 |
| nz.jdc.nano.GridFu 1.0 | 7 | 10% | 34 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 5 |
| bayen.nut.Squirrel 1.615 | 0 | 0% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.8 | 146 / 210 | 1.47 | 20.9% | 34932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 20.9% | 146 |
| eem.EvBot v4.6.16 | 2.0 | 16.8% | 55 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.5% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 1 |
| eld.Hmm 1.0 | 5.3 | 8.2% | 3 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.4% | 1 |
| fire219.CatBot 1.0 | 7.2 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.5% | 0 |
| el.JumpShoot 0.2 | 8.7 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.7 | 18 / 35 | 5596 |
| 2 | 1 | 72.0 | 95.6 | 28 / 35 | 5893 |
| 3 | 1 | 71.7 | 94.3 | 22 / 35 | 6031 |
| 4 | 1 | 71.6 | 94.6 | 25 / 35 | 5666 |
| 5 | 1 | 72.4 | 96.2 | 28 / 35 | 5851 |
| 6 | 1 | 72.2 | 96.2 | 25 / 35 | 5895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 147 | 73% |
| dummy.mini.Scimitar 1.01 | 29 | 93% |
| cf.RiO.RiOx 4.2.1 | 9 | 100% |
| eld.Hmm 1.0 | 2 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 51 | 78% | 128 |
| dummy.mini.Scimitar 1.01 | 9 | 14% | 47 |
| cf.RiO.RiOx 4.2.1 | 4 | 6% | 18 |
| eld.Hmm 1.0 | 0 | 0% | 13 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 2 |
| PSW.Relentless 0.1 | 0 | 0% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.6 | 108 / 210 | 2.03 | 18.8% | 31387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 18.8% | 108 |
| pe.SandboxDT 2.71m | 2.5 | 15.8% | 47 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.2% | 29 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.9% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 9.8% | 3 |
| yk.JahRoslav 1.1 | 6.7 | 6.2% | 0 |
| tad.Dalek98 0.98 | 6.8 | 6.5% | 1 |
| gg.Squaraus 0.6 | 7.7 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 90.2 | 18 / 35 | 4910 |
| 2 | 1 | 68.8 | 88.3 | 19 / 35 | 4877 |
| 3 | 1 | 69.8 | 86.0 | 20 / 35 | 5761 |
| 4 | 1 | 67.8 | 84.4 | 13 / 35 | 5120 |
| 5 | 1 | 70.4 | 91.7 | 20 / 35 | 5431 |
| 6 | 1 | 69.8 | 90.8 | 18 / 35 | 5288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 56 | 75% |
| jlm.javaDisturbance 0.59 | 51 | 78% |
| pe.SandboxDT 2.71m | 38 | 58% |
| bigpete.Stewie 1.0 | 5 | 80% |

Hadur died in 102 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 38 | 37% | 63 |
| kvk.HebusLeTroll 0.35 | 36 | 35% | 69 |
| jlm.javaDisturbance 0.59 | 26 | 25% | 65 |
| bigpete.Stewie 1.0 | 1 | 1% | 8 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.0 | 142 / 210 | 1.81 | 19.7% | 30921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 19.7% | 142 |
| pe.SandboxLump 1.52 | 2.0 | 17.4% | 53 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 12 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.9% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.3% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.2% | 1 |
| cw.megas.Blade 0.8 | 6.8 | 8.1% | 0 |
| sample.Walls 1.0 | 7.8 | 7.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 90.8 | 25 / 35 | 5545 |
| 2 | 1 | 71.1 | 91.7 | 24 / 35 | 5275 |
| 3 | 1 | 70.9 | 91.7 | 25 / 35 | 4919 |
| 4 | 1 | 70.1 | 90.5 | 21 / 35 | 4543 |
| 5 | 1 | 71.4 | 90.5 | 25 / 35 | 5672 |
| 6 | 1 | 70.0 | 90.5 | 22 / 35 | 4967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 90 | 77% |
| cre.Karolos 0.32 | 38 | 89% |
| stelo.AreaTargetingBot 1.1 | 19 | 100% |
| sample.Walls 1.0 | 8 | 100% |
| stelo.RamTrackSurfer 1.2 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 47 | 69% | 111 |
| cre.Karolos 0.32 | 15 | 22% | 52 |
| stelo.AreaTargetingBot 1.1 | 4 | 6% | 19 |
| stelo.RamTrackSurfer 1.2 | 1 | 1% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 7 |
| sample.Walls 1.0 | 0 | 0% | 4 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.2 | 98 / 210 | 2.60 | 16.5% | 21967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 16.5% | 98 |
| rz.GlowBlowMelee 1.4 | 2.8 | 13.6% | 26 |
| davidalves.Phoenix 0.54 | 3.5 | 12.6% | 33 |
| florent.XSeries.X2 0.12 | 3.5 | 13.2% | 27 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.3% | 21 |
| oog.melee.Corsair 1.0 | 6.3 | 9.1% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.0% | 3 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.5% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 4.5% | 0 |
| evd.X1 0.01 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 81.0 | 12 / 35 | 3670 |
| 2 | 1 | 64.0 | 81.6 | 13 / 35 | 3297 |
| 3 | 1 | 66.7 | 84.8 | 19 / 35 | 3905 |
| 4 | 1 | 64.0 | 77.8 | 16 / 35 | 3423 |
| 5 | 1 | 66.9 | 87.6 | 21 / 35 | 3772 |
| 6 | 1 | 65.7 | 80.3 | 17 / 35 | 3900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 40 | 63% |
| rz.GlowBlowMelee 1.4 | 29 | 93% |
| pedersen.Ugluk 1.1.1 | 19 | 89% |
| florent.XSeries.X2 0.12 | 19 | 84% |
| stelo.SoJNanoMelee 1.1 | 12 | 83% |
| oog.melee.Corsair 1.0 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 35 | 31% | 59 |
| florent.XSeries.X2 0.12 | 27 | 24% | 49 |
| pedersen.Ugluk 1.1.1 | 19 | 17% | 31 |
| rz.GlowBlowMelee 1.4 | 17 | 15% | 44 |
| stelo.SoJNanoMelee 1.1 | 6 | 5% | 10 |
| oog.melee.Corsair 1.0 | 3 | 3% | 9 |
| lunchie.Lunchbox 0.93 | 3 | 3% | 4 |
| as.FrankTheTank 1.3 | 2 | 2% | 4 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.8 | 146 / 210 | 2.01 | 19.1% | 26326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 19.1% | 146 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 14.3% | 19 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.5% | 15 |
| ds.Oo 2.2 | 4.7 | 9.9% | 10 |
| jdw.Hurricane 1.4 | 4.7 | 10.4% | 11 |
| gre.svman4.Morfeas 1.4.1 | 6.5 | 8.0% | 4 |
| adt.Ar2 1.1 | 7.2 | 7.3% | 2 |
| awesomeness.Elite 1.0 | 7.5 | 7.0% | 2 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.4% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.2 | 26 / 35 | 4230 |
| 2 | 1 | 66.9 | 83.5 | 19 / 35 | 4241 |
| 3 | 1 | 68.6 | 89.5 | 23 / 35 | 4221 |
| 4 | 1 | 71.1 | 94.6 | 30 / 35 | 4703 |
| 5 | 1 | 69.2 | 88.6 | 25 / 35 | 4323 |
| 6 | 1 | 68.6 | 87.3 | 23 / 35 | 4608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 61 | 95% |
| voidious.micro.BlitzBat 1.05 | 49 | 90% |
| jdw.Hurricane 1.4 | 22 | 95% |
| ds.Oo 2.2 | 10 | 80% |
| adt.Ar2 1.1 | 5 | 100% |
| gjr.Cephalosporin 0.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| gre.svman4.Morfeas 1.4.1 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 15 | 23% | 55 |
| ds.Oo 2.2 | 13 | 20% | 23 |
| jdw.Hurricane 1.4 | 11 | 17% | 30 |
| voidious.mini.BrokenSword 2.0.3 | 9 | 14% | 60 |
| adt.Ar2 1.1 | 6 | 9% | 10 |
| awesomeness.Elite 1.0 | 6 | 9% | 9 |
| gre.svman4.Morfeas 1.4.1 | 2 | 3% | 10 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 9 |
| amk.ChumbaMini 0.2 | 1 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.2 | 150 / 210 | 1.61 | 20.3% | 34351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 20.3% | 150 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 28 |
| lrem.Spectre 0.4.4 | 3.7 | 12.3% | 11 |
| shu.nitro.LENIN .T34 | 3.8 | 12.1% | 17 |
| js.PinBall 1.6 | 4.7 | 10.8% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.0% | 2 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.0% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.9% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.7 | 23 / 35 | 5733 |
| 2 | 1 | 72.4 | 97.8 | 31 / 35 | 5993 |
| 3 | 1 | 69.7 | 89.2 | 21 / 35 | 5366 |
| 4 | 1 | 71.2 | 92.7 | 26 / 35 | 5892 |
| 5 | 1 | 71.0 | 94.0 | 25 / 35 | 5597 |
| 6 | 1 | 71.2 | 94.0 | 24 / 35 | 5770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 60 | 83% |
| lrem.Spectre 0.4.4 | 45 | 91% |
| shu.nitro.LENIN .T34 | 44 | 80% |
| js.PinBall 1.6 | 11 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 86% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 30 | 50% | 73 |
| shu.nitro.LENIN .T34 | 13 | 22% | 58 |
| lrem.Spectre 0.4.4 | 8 | 13% | 45 |
| js.PinBall 1.6 | 5 | 8% | 19 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 5% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 5 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.8 | 134 / 210 | 2.19 | 19.0% | 29339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 19.0% | 134 |
| wee.Gem 1.8.4 | 2.7 | 12.4% | 23 |
| mk.Alpha 0.2.1 | 2.7 | 12.8% | 28 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.1% | 17 |
| EH.Eagle 1.0.6 | 4.7 | 10.8% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 9.0% | 1 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.0% | 4 |
| joe.ADinosaur 1.0 | 7.5 | 7.4% | 0 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.7% | 0 |
| cs.Grudge 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.8 | 20 / 35 | 4009 |
| 2 | 1 | 70.6 | 87.3 | 23 / 35 | 5862 |
| 3 | 1 | 69.4 | 91.7 | 26 / 35 | 4733 |
| 4 | 1 | 68.2 | 78.1 | 21 / 35 | 5483 |
| 5 | 1 | 68.8 | 87.9 | 21 / 35 | 4784 |
| 6 | 1 | 68.5 | 90.8 | 23 / 35 | 4468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 53 | 79% |
| wee.Gem 1.8.4 | 45 | 78% |
| sheldor.melee.nano.TestMelee 0.1 | 25 | 88% |
| EH.Eagle 1.0.6 | 15 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 100% |
| throxbot.ThroxBot 0.1 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 22 | 29% | 45 |
| mk.Alpha 0.2.1 | 19 | 25% | 58 |
| wee.Gem 1.8.4 | 15 | 20% | 54 |
| throxbot.ThroxBot 0.1 | 7 | 9% | 13 |
| EH.Eagle 1.0.6 | 5 | 7% | 20 |
| joe.ADinosaur 1.0 | 4 | 5% | 5 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 7 |

## Melee bench: F28

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 91.6 | 136 / 210 | 1.75 | 19.2% | 26179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 19.2% | 136 |
| kid.test.NightFox .2 | 2.0 | 15.8% | 43 |
| uji.Antique 1.0 | 3.7 | 11.8% | 16 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.4% | 9 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.6% | 4 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.5% | 1 |
| ahr.ice.Ice 1.0.2 | 7.5 | 7.2% | 1 |
| stelo.PianistNano 1.2 | 8.2 | 5.8% | 0 |
| matt.advanced.Katana 1.0 | 8.3 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 92.4 | 21 / 35 | 4509 |
| 2 | 1 | 69.8 | 93.3 | 27 / 35 | 4369 |
| 3 | 1 | 69.4 | 91.1 | 24 / 35 | 4410 |
| 4 | 1 | 68.6 | 89.5 | 23 / 35 | 4429 |
| 5 | 1 | 67.7 | 88.6 | 18 / 35 | 4321 |
| 6 | 1 | 69.4 | 94.9 | 23 / 35 | 4141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 110 | 75% |
| uji.Antique 1.0 | 33 | 91% |
| qohnil.blot.BlotBot 3.61 | 11 | 73% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| amk.ChumbaWumba 0.3 | 6 | 83% |
| ahr.ice.Ice 1.0.2 | 3 | 67% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 44 | 59% | 111 |
| uji.Antique 1.0 | 13 | 17% | 39 |
| qohnil.blot.BlotBot 3.61 | 7 | 9% | 26 |
| pfvicm.Sobieski 7.2.3b | 4 | 5% | 14 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 6 |
| amk.ChumbaWumba 0.3 | 3 | 4% | 5 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.0 | 126 / 210 | 2.26 | 18.8% | 28067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 18.8% | 126 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.1% | 39 |
| deewiant.Anomaly 0.2 | 2.5 | 15.3% | 39 |
| myl.micro.Troodon 1.10 | 4.2 | 11.6% | 3 |
| jok.PheonixM 0.1.2 | 4.8 | 10.5% | 3 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.2% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 6.0% | 2 |
| jangs.ns51 1.0 | 9.2 | 4.2% | 0 |
| ap.Frederick 1.1 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.0 | 21 / 35 | 4260 |
| 2 | 1 | 68.7 | 83.2 | 19 / 35 | 4685 |
| 3 | 1 | 69.8 | 88.6 | 23 / 35 | 4748 |
| 4 | 1 | 68.1 | 81.6 | 21 / 35 | 4516 |
| 5 | 1 | 69.1 | 85.4 | 19 / 35 | 4821 |
| 6 | 1 | 70.5 | 91.1 | 23 / 35 | 5037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 72 | 76% |
| zyx.mega.YersiniaPestis 3.1 | 62 | 82% |
| myl.micro.Troodon 1.10 | 13 | 100% |
| jok.PheonixM 0.1.2 | 4 | 75% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 40 | 47% | 95 |
| zyx.mega.YersiniaPestis 3.1 | 22 | 26% | 67 |
| myl.micro.Troodon 1.10 | 11 | 13% | 26 |
| jok.PheonixM 0.1.2 | 4 | 5% | 10 |
| ph.melee.ArcherME 0.3 | 4 | 5% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 5 |
| jangs.ns51 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 76.1 | 60 / 210 | 3.15 | 15.0% | 21781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.3 | 15.0% | 60 |
| catcat20.Matcha 0.006 | 2.3 | 14.5% | 52 |
| darkcanuck.B26354 1.06 | 3.3 | 13.9% | 41 |
| oog.melee.Capulet 1.2 | 3.3 | 13.3% | 27 |
| stelo.PastFuture 2.3.2 | 4.7 | 12.6% | 24 |
| intruder.PrairieWolf 2.61 | 7.0 | 7.2% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 6.9% | 2 |
| ntc.Opposite 1.5 | 7.7 | 7.2% | 0 |
| tripphippy.Alice 1.1 | 7.8 | 7.0% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 78.7 | 9 / 35 | 3791 |
| 2 | 1 | 63.8 | 75.6 | 14 / 35 | 3779 |
| 3 | 2 | 62.9 | 75.9 | 8 / 35 | 3566 |
| 4 | 2 | 62.9 | 75.9 | 8 / 35 | 3689 |
| 5 | 1 | 63.8 | 77.1 | 12 / 35 | 3712 |
| 6 | 1 | 61.7 | 73.7 | 9 / 35 | 3244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 32 | 53% |
| oog.melee.Capulet 1.2 | 25 | 64% |
| darkcanuck.B26354 1.06 | 20 | 55% |
| stelo.PastFuture 2.3.2 | 17 | 71% |
| tripphippy.Alice 1.1 | 4 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 0% |

Hadur died in 150 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 40 | 27% | 56 |
| darkcanuck.B26354 1.06 | 33 | 22% | 45 |
| oog.melee.Capulet 1.2 | 31 | 21% | 49 |
| stelo.PastFuture 2.3.2 | 31 | 21% | 42 |
| ntc.Opposite 1.5 | 7 | 5% | 7 |
| intruder.PrairieWolf 2.61 | 3 | 2% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 3 |
| tripphippy.Alice 1.1 | 2 | 1% | 4 |

## Melee bench: F31

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 76.7 | 64 / 210 | 3.10 | 15.1% | 20745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.1% | 99 |
| hadur117.mini.DeiseD 0.5 | 2.0 | 15.1% | 64 |
| gh.mini.Griezel 0.2 | 3.2 | 13.4% | 36 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 10.9% | 8 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.0% | 5 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.6% | 1 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.0% | 2 |
| fm.mammillarias 1.3 | 7.8 | 6.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 72.1 | 11 / 35 | 3484 |
| 2 | 2 | 64.9 | 82.2 | 13 / 35 | 3907 |
| 3 | 2 | 64.9 | 81.0 | 10 / 35 | 3803 |
| 4 | 2 | 62.4 | 73.3 | 11 / 35 | 3362 |
| 5 | 2 | 62.5 | 75.9 | 8 / 35 | 3285 |
| 6 | 2 | 62.4 | 75.6 | 11 / 35 | 2904 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 57 | 61% |
| gh.mini.Griezel 0.2 | 30 | 53% |
| d414.nano.Quantum 1.0.0 | 7 | 100% |
| spinnercat.micro.Tyger 0.1 | 5 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 53 | 36% | 87 |
| gh.mini.Griezel 0.2 | 40 | 27% | 58 |
| spinnercat.micro.Tyger 0.1 | 20 | 13% | 26 |
| d414.nano.Quantum 1.0.0 | 12 | 8% | 17 |
| fm.mammillarias 1.3 | 9 | 6% | 9 |
| gh.nano.Grofvuil 0.2 | 7 | 5% | 7 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
3 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 90.6 | 143 / 210 | 1.85 | 19.2% | 28836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 19.2% | 143 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.1% | 45 |
| apc.botM 3.0 | 3.2 | 11.3% | 10 |
| lxx.ConceptA 0.8 | 3.8 | 10.6% | 5 |
| vjik.UnViolation 1.1 | 5.5 | 8.6% | 4 |
| bayen.UbaMicro 1.4 | 6.0 | 8.7% | 2 |
| panzer.Panzer 0.2 | 7.2 | 7.8% | 0 |
| yk.JahMicro 1.0 | 8.0 | 6.8% | 1 |
| conscience.Electron 1.3g | 8.3 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.4 | 21 / 35 | 4883 |
| 2 | 1 | 70.8 | 97.5 | 29 / 35 | 5149 |
| 3 | 1 | 68.7 | 91.1 | 24 / 35 | 4663 |
| 4 | 1 | 69.9 | 93.3 | 26 / 35 | 4998 |
| 5 | 1 | 66.7 | 84.1 | 18 / 35 | 4629 |
| 6 | 1 | 67.7 | 86.0 | 25 / 35 | 4514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 95 | 71% |
| apc.botM 3.0 | 31 | 94% |
| lxx.ConceptA 0.8 | 21 | 90% |
| vjik.UnViolation 1.1 | 10 | 100% |
| panzer.Panzer 0.2 | 6 | 100% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| yk.JahMicro 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 38 | 57% | 107 |
| lxx.ConceptA 0.8 | 9 | 13% | 18 |
| apc.botM 3.0 | 7 | 10% | 40 |
| bayen.UbaMicro 1.4 | 4 | 6% | 8 |
| vjik.UnViolation 1.1 | 3 | 4% | 15 |
| conscience.Electron 1.3g | 3 | 4% | 7 |
| yk.JahMicro 1.0 | 2 | 3% | 6 |
| panzer.Panzer 0.2 | 1 | 1% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F33

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.7 | 142 / 210 | 1.93 | 19.6% | 29672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 19.6% | 142 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.0% | 17 |
| labg.Cataclysm 2.05 | 4.2 | 10.7% | 11 |
| gre.svman4.Leonidas 1.3.2 | 5.2 | 9.9% | 3 |
| baal.nano.N 1.42 | 6.0 | 9.3% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 7.9% | 4 |
| zyx.micro.Ant 1.1 | 8.7 | 5.0% | 1 |
| sanja.First 0.1 | 8.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.3 | 25 / 35 | 4938 |
| 2 | 1 | 67.8 | 84.1 | 19 / 35 | 4540 |
| 3 | 1 | 70.2 | 91.7 | 25 / 35 | 4725 |
| 4 | 1 | 70.1 | 90.5 | 22 / 35 | 5301 |
| 5 | 1 | 72.3 | 96.8 | 29 / 35 | 5226 |
| 6 | 1 | 68.7 | 86.7 | 22 / 35 | 4942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 58 | 81% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 86% |
| labg.Cataclysm 2.05 | 21 | 90% |
| gre.svman4.Leonidas 1.3.2 | 20 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 100% |
| baal.nano.N 1.42 | 4 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 27 | 40% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 25% | 59 |
| gre.svman4.Leonidas 1.3.2 | 7 | 10% | 20 |
| baal.nano.N 1.42 | 6 | 9% | 11 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 9% | 8 |
| labg.Cataclysm 2.05 | 3 | 4% | 20 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.0 | 89 / 210 | 2.17 | 17.8% | 29029 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.2 | 17.8% | 89 |
| stelo.Spread 0.9 | 2.3 | 16.5% | 64 |
| kid.Gladiator .7.2 | 2.5 | 16.4% | 41 |
| jcs.Seth 1.8 | 4.5 | 10.7% | 13 |
| tcf.Reach 3 | 4.8 | 10.5% | 3 |
| cli.Dancer 1.1 | 5.8 | 9.2% | 2 |
| ratosh.Wesco 1.4 | 6.8 | 7.8% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 8.8 | 3.4% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.3 | 15 / 35 | 4885 |
| 2 | 1 | 69.2 | 90.2 | 19 / 35 | 4915 |
| 3 | 1 | 67.3 | 84.4 | 15 / 35 | 4463 |
| 4 | 1 | 68.2 | 86.3 | 13 / 35 | 4991 |
| 5 | 2 | 68.3 | 86.7 | 10 / 35 | 4891 |
| 6 | 1 | 68.3 | 88.3 | 17 / 35 | 4884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 84 | 57% |
| kid.Gladiator .7.2 | 44 | 55% |
| jcs.Seth 1.8 | 13 | 77% |
| tcf.Reach 3 | 5 | 80% |
| ratosh.Wesco 1.4 | 3 | 67% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1151. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 51 | 41% | 95 |
| kid.Gladiator .7.2 | 50 | 40% | 73 |
| jcs.Seth 1.8 | 7 | 6% | 19 |
| tcf.Reach 3 | 4 | 3% | 9 |
| cli.Dancer 1.1 | 4 | 3% | 8 |
| ratosh.Wesco 1.4 | 4 | 3% | 5 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 81.4 | 43 / 210 | 2.67 | 15.4% | 20971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 135 |
| hadur117.mini.DeiseD 0.5 | 2.2 | 15.4% | 43 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.5% | 16 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.4% | 13 |
| rz.HawkOnFire 0.1 | 4.3 | 11.6% | 3 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.0% | 0 |
| wit.Chuliath 1.0 | 7.0 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 86.7 | 9 / 35 | 3654 |
| 2 | 2 | 65.0 | 81.9 | 10 / 35 | 3649 |
| 3 | 2 | 64.0 | 80.3 | 6 / 35 | 3369 |
| 4 | 2 | 63.7 | 80.6 | 8 / 35 | 3425 |
| 5 | 3 | 61.8 | 75.9 | 3 / 35 | 3190 |
| 6 | 2 | 65.0 | 83.2 | 7 / 35 | 3684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 97 | 24% |
| gh.mini.Gruwel 0.9 | 12 | 58% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 75% |
| rz.HawkOnFire 0.1 | 7 | 86% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 99 | 59% | 118 |
| gh.mini.Gruwel 0.9 | 29 | 17% | 38 |
| rz.HawkOnFire 0.1 | 17 | 10% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 10% | 22 |
| myl.nano.KomoriNinja 1.1 | 4 | 2% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 0 | 0% | 1 |

## Melee bench: F36

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 96.8 | 189 / 210 | 1.29 | 22.1% | 34814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 22.1% | 189 |
| alpha.RainingFire 1.0 | 2.2 | 12.5% | 11 |
| bzdp.Pansy 2.1 | 3.8 | 11.6% | 1 |
| mz.Cork 0.1 | 4.2 | 10.7% | 3 |
| bvh.micro.Freya 0.3 | 4.2 | 11.0% | 3 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.1% | 1 |
| m3thos.Eva02 0.7.1 | 6.5 | 8.9% | 1 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 4.4% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.9% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 96.5 | 31 / 35 | 5826 |
| 2 | 1 | 73.5 | 99.0 | 32 / 35 | 6116 |
| 3 | 1 | 72.6 | 98.7 | 32 / 35 | 5652 |
| 4 | 1 | 72.9 | 96.5 | 33 / 35 | 5861 |
| 5 | 1 | 71.1 | 90.8 | 28 / 35 | 5530 |
| 6 | 1 | 73.2 | 99.4 | 33 / 35 | 5829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 47 | 96% |
| bzdp.Pansy 2.1 | 42 | 98% |
| alpha.RainingFire 1.0 | 42 | 83% |
| mz.Cork 0.1 | 35 | 97% |
| bvh.mini.Fenrir 0.39 | 13 | 100% |
| m3thos.Eva02 0.7.1 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 21 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 9 | 43% | 45 |
| bzdp.Pansy 2.1 | 7 | 33% | 55 |
| bvh.micro.Freya 0.3 | 3 | 14% | 36 |
| mz.Cork 0.1 | 2 | 10% | 35 |
| m3thos.Eva02 0.7.1 | 0 | 0% | 16 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 9 |
| bvh.mini.Fenrir 0.39 | 0 | 0% | 7 |
| dl.BetterWalls 1.0 | 0 | 0% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F37

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 93.5 | 179 / 210 | 1.59 | 20.3% | 34196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 20.3% | 179 |
| germ.TheMind .2 | 2.3 | 11.2% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.7 | 10.7% | 6 |
| EBBU.Sim2 1.02 | 4.3 | 9.4% | 1 |
| agrach.Dalek 1.0 | 6.3 | 8.8% | 7 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.4% | 4 |
| lmk.ACPFinal 0.1 | 6.7 | 8.4% | 1 |
| mb.Beast 0.1 | 7.8 | 7.9% | 1 |
| skm.Ryubot 1.0 | 8.3 | 7.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 7.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.7 | 30 / 35 | 5868 |
| 2 | 1 | 68.7 | 89.8 | 28 / 35 | 5570 |
| 3 | 1 | 69.8 | 93.7 | 29 / 35 | 5709 |
| 4 | 1 | 69.8 | 94.0 | 30 / 35 | 5525 |
| 5 | 1 | 71.1 | 98.7 | 32 / 35 | 5713 |
| 6 | 1 | 69.6 | 91.1 | 30 / 35 | 5811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 49 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 30 | 100% |
| stelo.UntouchableNano 1.3 | 25 | 92% |
| EBBU.Sim2 1.02 | 22 | 100% |
| agrach.Dalek 1.0 | 20 | 90% |
| skm.Ryubot 1.0 | 15 | 100% |
| lmk.ACPFinal 0.1 | 15 | 100% |
| mb.Beast 0.1 | 9 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 8 | 25% | 43 |
| agrach.Dalek 1.0 | 7 | 22% | 36 |
| stelo.UntouchableNano 1.3 | 4 | 13% | 25 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 9% | 40 |
| EBBU.Sim2 1.02 | 3 | 9% | 17 |
| lmk.ACPFinal 0.1 | 3 | 9% | 14 |
| mb.Beast 0.1 | 2 | 6% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 6% | 5 |
| skm.Ryubot 1.0 | 0 | 0% | 5 |

## Melee bench: F38

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.9 | 101 / 210 | 2.45 | 17.0% | 24569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.2 | 17.0% | 101 |
| justin.Mallais 14.0 | 1.8 | 16.2% | 67 |
| bvh.mini.Freya 0.55 | 3.2 | 13.1% | 16 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.2% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 9.9% | 4 |
| cs.Wren 1.0 | 5.5 | 9.9% | 3 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.2% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 5.9% | 1 |
| matt.UnderDark3 2.4.34 | 8.7 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.1 | 15 / 35 | 4534 |
| 2 | 1 | 66.9 | 83.8 | 20 / 35 | 4178 |
| 3 | 1 | 66.8 | 85.1 | 19 / 35 | 3927 |
| 4 | 1 | 67.2 | 86.7 | 17 / 35 | 4124 |
| 5 | 2 | 65.0 | 81.9 | 15 / 35 | 3692 |
| 6 | 1 | 65.6 | 80.6 | 15 / 35 | 4114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 62 | 66% |
| bvh.mini.Freya 0.55 | 20 | 85% |
| bts.mega.Gnarly 1.4 | 18 | 89% |
| cs.Wren 1.0 | 14 | 93% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 82% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 49 | 45% | 90 |
| bvh.mini.Freya 0.55 | 21 | 19% | 31 |
| bts.mega.Gnarly 1.4 | 11 | 10% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 9% | 20 |
| kdf.KoulDestroyer 1.0 | 8 | 7% | 11 |
| cs.Wren 1.0 | 6 | 5% | 17 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 6 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.4 | 106 / 210 | 2.40 | 17.8% | 28913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 17.8% | 106 |
| bvh.fry.Freya 0.82 | 2.0 | 15.3% | 21 |
| catcat20.Lambda 0.024 | 3.3 | 12.1% | 26 |
| az.Ololobot 0.2.4 | 3.7 | 12.9% | 48 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 8.6% | 7 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 7.9% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 7.7% | 2 |
| gimp.GimpBot 0.1 | 7.0 | 7.7% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.8 | 21 / 35 | 5268 |
| 2 | 1 | 67.1 | 86.7 | 17 / 35 | 4665 |
| 3 | 1 | 66.6 | 83.2 | 17 / 35 | 4794 |
| 4 | 1 | 65.5 | 77.1 | 15 / 35 | 4780 |
| 5 | 1 | 67.1 | 85.1 | 17 / 35 | 4778 |
| 6 | 1 | 66.9 | 84.8 | 19 / 35 | 4628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Lambda 0.024 | 47 | 72% |
| bvh.fry.Freya 0.82 | 46 | 93% |
| az.Ololobot 0.2.4 | 39 | 49% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 1050. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 38 | 37% | 78 |
| az.Ololobot 0.2.4 | 32 | 31% | 56 |
| catcat20.Lambda 0.024 | 25 | 24% | 56 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 4% | 6 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 4 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 1 |
| gimp.GimpBot 0.1 | 0 | 0% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |

## Melee bench: F40

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.3 | 139 / 210 | 1.96 | 19.5% | 30193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 19.5% | 139 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 36 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.4% | 18 |
| Polkwane.SmashMelee 1.0 | 4.2 | 11.2% | 11 |
| mz.AntiGrav 1.0 | 5.2 | 9.9% | 1 |
| alpha.BlackIce 1.0 | 6.3 | 9.1% | 1 |
| stelo.Randomness 1.0 | 6.3 | 9.1% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 4.3% | 0 |
| sample.Corners 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.9 | 24 / 35 | 5016 |
| 2 | 1 | 69.9 | 87.6 | 24 / 35 | 5357 |
| 3 | 1 | 69.6 | 89.5 | 23 / 35 | 4962 |
| 4 | 1 | 68.7 | 87.6 | 21 / 35 | 4813 |
| 5 | 1 | 70.4 | 90.5 | 24 / 35 | 5078 |
| 6 | 1 | 70.0 | 92.7 | 23 / 35 | 4967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 63 | 81% |
| kano.gamma.KanoGamma 1.8 | 32 | 88% |
| Polkwane.SmashMelee 1.0 | 30 | 97% |
| mz.AntiGrav 1.0 | 15 | 100% |
| stelo.Randomness 1.0 | 8 | 88% |
| alpha.BlackIce 1.0 | 4 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 29 | 40% | 55 |
| kano.gamma.KanoGamma 1.8 | 18 | 25% | 63 |
| Polkwane.SmashMelee 1.0 | 10 | 14% | 34 |
| stelo.Randomness 1.0 | 6 | 8% | 16 |
| mz.AntiGrav 1.0 | 5 | 7% | 26 |
| alpha.BlackIce 1.0 | 4 | 6% | 8 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |
| amk.superstrike.SuperStrike 0.3 | 0 | 0% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.1 | 88 / 210 | 2.34 | 17.1% | 24616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.3 | 17.1% | 88 |
| eem.EvBotNG v12.8 | 1.7 | 16.5% | 85 |
| ary.Swarm 1.1 | 3.3 | 13.0% | 7 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.3% | 12 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.2% | 11 |
| shrub.Silver v048 | 6.3 | 8.5% | 3 |
| zyx.nano.Ant 1.1 | 6.7 | 7.6% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 5.9% | 3 |
| stelo.Mirror 1.1 | 8.8 | 5.5% | 3 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 86.0 | 13 / 35 | 3825 |
| 2 | 2 | 64.8 | 79.4 | 9 / 35 | 4148 |
| 3 | 1 | 66.9 | 85.1 | 16 / 35 | 4061 |
| 4 | 1 | 66.7 | 85.7 | 14 / 35 | 4002 |
| 5 | 1 | 68.7 | 89.8 | 20 / 35 | 4361 |
| 6 | 1 | 66.8 | 84.8 | 16 / 35 | 4219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 80 | 43% |
| lessonz.robocode.Oz 0.5.0 | 23 | 91% |
| ary.Swarm 1.1 | 21 | 90% |
| simonton.nano.MeleeSeed 1.8 | 16 | 75% |
| shrub.Silver v048 | 3 | 33% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 62 | 50% | 99 |
| ary.Swarm 1.1 | 21 | 17% | 39 |
| lessonz.robocode.Oz 0.5.0 | 13 | 10% | 24 |
| simonton.nano.MeleeSeed 1.8 | 11 | 9% | 26 |
| shrub.Silver v048 | 7 | 6% | 12 |
| stelo.Mirror 1.1 | 3 | 2% | 3 |
| jsal.Jsalbot 1.0 | 2 | 2% | 3 |
| zyx.nano.Ant 1.1 | 2 | 2% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.1 | 100 / 210 | 2.25 | 18.1% | 30680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 18.1% | 100 |
| wompi.Wallaby 5.1 | 2.2 | 15.8% | 52 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.9% | 26 |
| ara.Shera 0.88 | 3.5 | 13.8% | 29 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 1 |
| dsw.StaticD 1.0 | 6.5 | 7.0% | 2 |
| maribo.IotaCT 1.1 | 6.7 | 6.9% | 0 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.4% | 1 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 91.1 | 19 / 35 | 5607 |
| 2 | 1 | 67.0 | 83.8 | 16 / 35 | 4871 |
| 3 | 1 | 67.0 | 82.2 | 14 / 35 | 5029 |
| 4 | 1 | 68.1 | 88.3 | 16 / 35 | 5063 |
| 5 | 1 | 68.8 | 88.3 | 19 / 35 | 5274 |
| 6 | 1 | 67.0 | 82.9 | 16 / 35 | 4836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 52 | 77% |
| ara.Shera 0.88 | 48 | 69% |
| maribo.mini.MiniQuester 0.1 | 28 | 79% |
| dsw.StaticD 1.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 41 | 37% | 75 |
| wompi.Wallaby 5.1 | 35 | 31% | 79 |
| maribo.mini.MiniQuester 0.1 | 28 | 25% | 46 |
| amz.NanoClone 1.41 | 4 | 4% | 4 |
| dsw.StaticD 1.0 | 2 | 2% | 3 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.4 | 29 / 210 | 3.04 | 14.9% | 22137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.1% | 156 |
| hadur117.mini.DeiseD 0.5 | 2.0 | 14.9% | 29 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.9% | 16 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.0% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.8% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.1% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.3% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 76.2 | 6 / 35 | 3672 |
| 2 | 2 | 63.2 | 73.3 | 4 / 35 | 3617 |
| 3 | 2 | 64.9 | 78.1 | 5 / 35 | 3924 |
| 4 | 2 | 65.0 | 79.0 | 4 / 35 | 3839 |
| 5 | 2 | 64.5 | 78.7 | 6 / 35 | 3506 |
| 6 | 2 | 64.6 | 78.7 | 4 / 35 | 3579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 86 | 14% |
| dummy.micro.Sparrow 2.5 | 9 | 89% |
| brainfade.melee.Dusk 0.44 | 6 | 83% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| cvt.Firsty 1.0 | 1 | 0% |

Hadur died in 182 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 117 | 64% | 128 |
| dummy.micro.Sparrow 2.5 | 22 | 12% | 29 |
| brainfade.melee.Dusk 0.44 | 19 | 10% | 27 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 12 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 6 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
| mz.NanoGod 2.02 | 2 | 1% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.5 | 137 / 210 | 1.77 | 19.9% | 31629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 19.9% | 137 |
| stelo.Liblix 0.3.1 | 2.0 | 16.5% | 50 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.0% | 20 |
| wompi.Quokka 1.6 | 4.0 | 10.4% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.0% | 3 |
| disan.Chair 2.2.0 | 6.5 | 7.5% | 0 |
| jwirde.Gort 2.0 | 7.0 | 7.2% | 0 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.7% | 0 |
| sample.Crazy 1.0 | 9.2 | 4.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 96.2 | 28 / 35 | 5298 |
| 2 | 1 | 69.5 | 88.6 | 21 / 35 | 5268 |
| 3 | 1 | 70.4 | 90.5 | 19 / 35 | 5669 |
| 4 | 1 | 68.5 | 86.0 | 18 / 35 | 4958 |
| 5 | 1 | 71.6 | 95.9 | 27 / 35 | 5335 |
| 6 | 1 | 70.1 | 91.7 | 24 / 35 | 5101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 107 | 79% |
| tzu.TheArtOfWar 1.2 | 34 | 76% |
| wompi.Quokka 1.6 | 11 | 91% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 88% |
| disan.Chair 2.2.0 | 5 | 100% |
| jwirde.Gort 2.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1053. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 40 | 51% | 123 |
| tzu.TheArtOfWar 1.2 | 24 | 30% | 50 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 8% | 12 |
| wompi.Quokka 1.6 | 4 | 5% | 12 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |
| jwirde.Gort 2.0 | 0 | 0% | 5 |
| disan.Chair 2.2.0 | 0 | 0% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.8 | 76 / 210 | 1.91 | 20.2% | 37369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.5 | 1.0 | 20.2% | 76 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.7% | 125 |
| jje.BagPuss 1.2 | 3.0 | 12.4% | 4 |
| myl.nano.Graviton 1.10 | 4.3 | 9.9% | 0 |
| sul.Lunar 1.1 | 5.2 | 9.5% | 3 |
| fm.claire 1.7 | 6.3 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 7.9% | 1 |
| hvilela.HVilela 0.9 | 7.7 | 7.5% | 1 |
| wit.Deep7 2.0 | 8.7 | 6.2% | 0 |
| abud.ThirdRobo 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.3 | 16 / 35 | 6859 |
| 2 | 1 | 70.5 | 92.1 | 11 / 35 | 6217 |
| 3 | 1 | 70.4 | 88.3 | 16 / 35 | 6263 |
| 4 | 1 | 68.3 | 87.3 | 10 / 35 | 5669 |
| 5 | 1 | 70.0 | 88.6 | 11 / 35 | 6324 |
| 6 | 1 | 69.6 | 89.5 | 12 / 35 | 6037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 148 | 22% |
| jje.BagPuss 1.2 | 16 | 88% |
| sul.Lunar 1.1 | 11 | 91% |
| myl.nano.Graviton 1.10 | 8 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 100% |
| wit.Deep7 2.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 0% |

Hadur died in 134 of 210 rounds, at a mean tick of 2697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 114 | 85% | 0 |
| jje.BagPuss 1.2 | 10 | 7% | 81 |
| hvilela.HVilela 0.9 | 4 | 3% | 14 |
| sul.Lunar 1.1 | 2 | 1% | 48 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 1% | 17 |
| myl.nano.Graviton 1.10 | 1 | 1% | 32 |
| fm.claire 1.7 | 1 | 1% | 9 |
| wit.Deep7 2.0 | 0 | 0% | 6 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

## Melee bench: F46

hadur117.mini.DeiseD 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 84.1 | 63 / 210 | 2.43 | 16.4% | 24145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.2% | 67 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.6% | 71 |
| hadur117.mini.DeiseD 0.5 | 2.3 | 16.4% | 63 |
| mz.MicroSheep 1.0 | 4.2 | 10.7% | 4 |
| cx.Princess 1.0 | 4.8 | 9.9% | 5 |
| sadoner.killer 0.2 | 6.0 | 8.8% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.1% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.4% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 85.4 | 13 / 35 | 3830 |
| 2 | 2 | 65.3 | 82.5 | 7 / 35 | 4340 |
| 3 | 3 | 67.3 | 85.1 | 15 / 35 | 4175 |
| 4 | 3 | 65.3 | 82.2 | 7 / 35 | 4110 |
| 5 | 2 | 65.7 | 86.3 | 10 / 35 | 3852 |
| 6 | 2 | 65.2 | 82.9 | 11 / 35 | 3838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 57 | 49% |
| rsalesc.melee.Medina 0.4.5 | 44 | 41% |
| cx.Princess 1.0 | 8 | 75% |
| mz.MicroSheep 1.0 | 7 | 100% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 71 | 48% | 107 |
| rsalesc.melee.Medina 0.4.5 | 59 | 40% | 76 |
| mz.MicroSheep 1.0 | 8 | 5% | 13 |
| cx.Princess 1.0 | 4 | 3% | 7 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 5 |
| sadoner.killer 0.2 | 1 | 1% | 1 |

