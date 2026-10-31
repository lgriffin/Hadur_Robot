# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 87.1 | 47 / 210 | 2.16 | 16.8% | 27782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 147 |
| hadur117.mini.DeiseSAME 0.4 | 2.0 | 16.8% | 47 |
| sgp.JollyNinja 3.53 | 3.2 | 11.6% | 8 |
| mz.MicroGodMelee 1 | 4.2 | 10.8% | 6 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.0 | 10.4% | 1 |
| lorneswork.Predator 1.0 | 5.7 | 9.4% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.6% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 85.7 | 9 / 35 | 4388 |
| 2 | 2 | 65.8 | 85.4 | 7 / 35 | 4414 |
| 3 | 2 | 66.9 | 86.3 | 8 / 35 | 4853 |
| 4 | 2 | 67.1 | 89.5 | 5 / 35 | 5048 |
| 5 | 2 | 67.1 | 88.9 | 11 / 35 | 4618 |
| 6 | 2 | 66.5 | 87.0 | 7 / 35 | 4461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 139 | 9% |
| mz.MicroGodMelee 1 | 15 | 80% |
| sgp.JollyNinja 3.53 | 13 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |

Hadur died in 163 of 210 rounds, at a mean tick of 1316. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 130 | 80% | 144 |
| sgp.JollyNinja 3.53 | 13 | 8% | 19 |
| mz.MicroGodMelee 1 | 9 | 6% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 3% | 11 |
| lorneswork.Predator 1.0 | 3 | 2% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
| adt.Ar2 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.2 | 119 / 210 | 2.42 | 18.2% | 28995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 18.2% | 119 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 13.9% | 28 |
| pulsar.PulsarMax 0.8.9 | 3.0 | 13.2% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.1% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.5% | 5 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.1% | 3 |
| Noran.BitchingElk 0.054 | 7.3 | 8.1% | 11 |
| sch.Simone 0.3d | 7.5 | 7.3% | 5 |
| stelo.PatternRobot 1.0 | 8.5 | 6.1% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.0 | 23 / 35 | 4660 |
| 2 | 1 | 67.2 | 83.5 | 19 / 35 | 4674 |
| 3 | 1 | 68.0 | 86.7 | 20 / 35 | 4788 |
| 4 | 1 | 66.7 | 81.3 | 18 / 35 | 4749 |
| 5 | 1 | 66.4 | 81.3 | 17 / 35 | 4867 |
| 6 | 1 | 68.6 | 85.4 | 22 / 35 | 5257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 53 | 83% |
| pulsar.PulsarMax 0.8.9 | 34 | 76% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 77% |
| stelo.PatternRobot 1.0 | 12 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| Noran.BitchingElk 0.054 | 8 | 75% |
| sch.Simone 0.3d | 6 | 83% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 4 | 50% |

Hadur died in 91 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 20 | 22% | 49 |
| lrem.micro.SpikeSoldier 0.4 | 19 | 21% | 28 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 18 | 20% | 55 |
| stelo.PatternRobot 1.0 | 10 | 11% | 17 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 8% | 19 |
| Noran.BitchingElk 0.054 | 7 | 8% | 18 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 9 |
| sch.Simone 0.3d | 4 | 4% | 10 |
| fullsail.SweetTea 1.1 | 1 | 1% | 5 |

## Melee bench: F03

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 93.0 | 148 / 210 | 1.63 | 20.0% | 35329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 20.0% | 148 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.7% | 13 |
| radnor.DoctorBob 1.42 | 3.0 | 13.6% | 15 |
| vuen.Cake 2.51 | 3.2 | 13.2% | 31 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 2 |
| adt.Ar1 2.1 | 6.7 | 7.2% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 6.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 93.0 | 28 / 35 | 5603 |
| 2 | 1 | 68.9 | 90.2 | 21 / 35 | 5674 |
| 3 | 1 | 71.1 | 93.7 | 24 / 35 | 6165 |
| 4 | 1 | 69.3 | 91.4 | 20 / 35 | 5964 |
| 5 | 1 | 70.7 | 94.6 | 28 / 35 | 5922 |
| 6 | 1 | 71.0 | 95.2 | 27 / 35 | 6001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 72 | 76% |
| kawigi.nano.Lib 1.0 | 54 | 93% |
| radnor.DoctorBob 1.42 | 40 | 90% |
| oa.weak.FlyMk1 0.1 | 3 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 32% | 73 |
| vuen.Cake 2.51 | 19 | 31% | 70 |
| radnor.DoctorBob 1.42 | 14 | 23% | 49 |
| urdos.URDOS 1.3 | 3 | 5% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 5% | 4 |
| oa.weak.FlyMk1 0.1 | 2 | 3% | 3 |
| adt.Ar1 2.1 | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.3 | 27 / 210 | 2.32 | 17.1% | 32308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.3% | 176 |
| hadur117.mini.DeiseSAME 0.4 | 2.0 | 17.1% | 27 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.0% | 4 |
| TNT.TNT 0.99.1 | 4.2 | 10.4% | 3 |
| josago.Jorgito 0.16 | 4.8 | 9.5% | 0 |
| css.Delitioner 0.11 | 6.5 | 6.7% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.1% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.0% | 1 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 85.4 | 4 / 35 | 5387 |
| 2 | 2 | 67.6 | 87.3 | 5 / 35 | 5112 |
| 3 | 2 | 67.7 | 85.4 | 6 / 35 | 5432 |
| 4 | 2 | 68.7 | 87.0 | 5 / 35 | 5843 |
| 5 | 2 | 66.3 | 83.2 | 2 / 35 | 5084 |
| 6 | 2 | 67.2 | 83.5 | 5 / 35 | 5450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 152 | 13% |
| apc.LeeroyJenkins2 1.0 | 6 | 83% |
| TNT.TNT 0.99.1 | 5 | 40% |
| spin.Bugstard 0.012b | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 1478. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 155 | 84% | 172 |
| apc.LeeroyJenkins2 1.0 | 11 | 6% | 18 |
| TNT.TNT 0.99.1 | 7 | 4% | 9 |
| josago.Jorgito 0.16 | 7 | 4% | 9 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 74.1 | 32 / 210 | 3.33 | 13.7% | 19384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.7% | 116 |
| justin.DemonicRage 3.4 | 1.8 | 17.2% | 53 |
| hadur117.mini.DeiseSAME 0.4 | 3.2 | 13.7% | 32 |
| wompi.Numbat 2.1 | 3.8 | 12.3% | 11 |
| ms.Ares 0.19 | 5.3 | 9.2% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 9.0% | 1 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 73.0 | 3 / 35 | 3102 |
| 2 | 3 | 60.6 | 72.4 | 3 / 35 | 3062 |
| 3 | 4 | 61.2 | 71.4 | 7 / 35 | 3227 |
| 4 | 3 | 62.7 | 77.1 | 5 / 35 | 3364 |
| 5 | 3 | 63.7 | 80.0 | 9 / 35 | 3328 |
| 6 | 3 | 60.3 | 70.8 | 5 / 35 | 3301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 34 | 21% |
| justin.DemonicRage 3.4 | 31 | 39% |
| wompi.Numbat 2.1 | 9 | 100% |
| axeBots.HataMoto 3.09 | 3 | 100% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 71 | 39% | 77 |
| justin.DemonicRage 3.4 | 60 | 33% | 78 |
| wompi.Numbat 2.1 | 18 | 10% | 24 |
| ms.Ares 0.19 | 12 | 7% | 12 |
| axeBots.HataMoto 3.09 | 9 | 5% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 4% | 7 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 83.9 | 101 / 210 | 2.45 | 17.3% | 25888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 17.3% | 101 |
| jekl.StoneGhost 0.7 | 2.2 | 15.6% | 43 |
| origin.SleepSiphon 1.7b | 3.0 | 13.8% | 46 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.3% | 14 |
| mld.Wisdom 1.0 | 4.8 | 10.5% | 3 |
| gg.Wolverine 2.0 | 6.0 | 8.4% | 0 |
| spinnercat.Omen 1.0 | 7.8 | 6.3% | 1 |
| DBall.NUKE 0.1 | 7.8 | 6.5% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.0% | 1 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.0 | 16 / 35 | 4419 |
| 2 | 1 | 66.9 | 86.7 | 17 / 35 | 4102 |
| 3 | 1 | 67.9 | 87.0 | 18 / 35 | 4609 |
| 4 | 1 | 66.5 | 82.5 | 17 / 35 | 4374 |
| 5 | 1 | 64.0 | 76.5 | 14 / 35 | 3889 |
| 6 | 1 | 67.1 | 83.5 | 19 / 35 | 4495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 50 | 82% |
| origin.SleepSiphon 1.7b | 42 | 64% |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 88% |
| gg.Wolverine 2.0 | 4 | 100% |
| mld.Wisdom 1.0 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 36 | 32% | 67 |
| origin.SleepSiphon 1.7b | 30 | 27% | 62 |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 24% | 47 |
| mld.Wisdom 1.0 | 9 | 8% | 17 |
| gg.Wolverine 2.0 | 5 | 5% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 3 |
| DBall.NUKE 0.1 | 1 | 1% | 5 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.2 | 126 / 210 | 1.61 | 20.0% | 34465 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 20.0% | 126 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.1% | 45 |
| rtk.Tachikoma 1.0 | 2.8 | 16.1% | 27 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.3% | 4 |
| franzor.Lizt 1.3.1 | 5.0 | 10.5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.5% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| sample.Target 1.0 | 9.3 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.4 | 20 / 35 | 5644 |
| 2 | 1 | 71.8 | 94.3 | 22 / 35 | 6127 |
| 3 | 1 | 71.0 | 92.7 | 20 / 35 | 5716 |
| 4 | 1 | 72.2 | 94.0 | 23 / 35 | 6018 |
| 5 | 1 | 71.0 | 93.7 | 22 / 35 | 5482 |
| 6 | 1 | 71.0 | 93.3 | 19 / 35 | 5478 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 97 | 82% |
| rsalesc.melee.Monk 0.3.6c | 49 | 29% |
| oog.melee.CapuletDroid 1.1 | 26 | 96% |
| franzor.Lizt 1.3.1 | 10 | 40% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 43 | 51% | 70 |
| rtk.Tachikoma 1.0 | 32 | 38% | 109 |
| franzor.Lizt 1.3.1 | 7 | 8% | 2 |
| oog.melee.CapuletDroid 1.1 | 2 | 2% | 23 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 6 |

## Melee bench: F08

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.4 | 140 / 210 | 1.77 | 19.5% | 29173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 19.5% | 140 |
| shrub.Vapour v159 | 2.5 | 12.7% | 22 |
| tm.Yuugao 1.0 | 2.7 | 12.9% | 32 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 9.6% | 6 |
| Krabb.sliNk.Garm 0.9u | 4.8 | 10.0% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.2% | 2 |
| m3thos.Eva00 1.1 | 6.8 | 7.9% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.9% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.3% | 0 |
| SHAM.WOW 1.4 | 9.3 | 6.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.5 | 23 / 35 | 4901 |
| 2 | 1 | 69.0 | 91.4 | 23 / 35 | 4963 |
| 3 | 1 | 68.6 | 89.5 | 22 / 35 | 4761 |
| 4 | 1 | 69.8 | 94.3 | 23 / 35 | 5096 |
| 5 | 1 | 69.2 | 91.7 | 25 / 35 | 4733 |
| 6 | 1 | 68.9 | 92.1 | 24 / 35 | 4719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 61 | 69% |
| shrub.Vapour v159 | 40 | 80% |
| Krabb.sliNk.Garm 0.9u | 27 | 85% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 94% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 82% |
| SHAM.WOW 1.4 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| m3thos.Eva00 1.1 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 31 | 44% | 77 |
| shrub.Vapour v159 | 15 | 21% | 45 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 11% | 24 |
| Krabb.sliNk.Garm 0.9u | 7 | 10% | 22 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 9% | 18 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 6 |
| SHAM.WOW 1.4 | 1 | 1% | 4 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 3 |
| m3thos.Eva00 1.1 | 0 | 0% | 9 |

## Melee bench: F09

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 77.4 | 65 / 210 | 3.03 | 15.6% | 23122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.6% | 106 |
| hadur117.mini.DeiseSAME 0.4 | 2.0 | 15.6% | 65 |
| kc.micro.Figment 1.0 | 2.7 | 13.9% | 20 |
| yagami.Tidus 0.11 | 4.7 | 10.2% | 0 |
| pedersen.Grishnakh 1.0 | 5.0 | 9.9% | 9 |
| mc2.enemy.Original 0.9 | 5.5 | 9.1% | 10 |
| dft.Calliope 5.6 | 6.8 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.5% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 79.0 | 8 / 35 | 3620 |
| 2 | 2 | 63.5 | 75.2 | 10 / 35 | 4082 |
| 3 | 2 | 65.1 | 80.3 | 13 / 35 | 3962 |
| 4 | 2 | 64.2 | 79.0 | 9 / 35 | 3781 |
| 5 | 3 | 62.0 | 72.7 | 11 / 35 | 3520 |
| 6 | 1 | 65.2 | 78.1 | 14 / 35 | 4157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 70 | 33% |
| kc.micro.Figment 1.0 | 31 | 84% |
| yagami.Tidus 0.11 | 6 | 100% |
| mc2.enemy.Original 0.9 | 6 | 50% |
| pedersen.Grishnakh 1.0 | 5 | 100% |
| dft.Calliope 5.6 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 69 | 48% | 94 |
| kc.micro.Figment 1.0 | 26 | 18% | 54 |
| yagami.Tidus 0.11 | 17 | 12% | 21 |
| pedersen.Grishnakh 1.0 | 12 | 8% | 16 |
| mc2.enemy.Original 0.9 | 7 | 5% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7 | 5% | 7 |
| dft.Calliope 5.6 | 4 | 3% | 6 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 94.9 | 161 / 210 | 1.46 | 20.1% | 31659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 20.1% | 161 |
| DTF.Kludgy 1.2b | 2.3 | 14.0% | 22 |
| ejb.Polaris 1.0.1 | 3.3 | 12.8% | 8 |
| ne.Chimera 1.2 | 3.3 | 12.5% | 10 |
| tvv.micro.Antares 1.1.1 | 5.0 | 10.4% | 3 |
| vStar.RAFzilla 2.15 | 6.0 | 9.8% | 4 |
| kurios.DOSexe .9b | 7.7 | 5.6% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 97.5 | 30 / 35 | 5601 |
| 2 | 1 | 70.1 | 94.6 | 28 / 35 | 5071 |
| 3 | 1 | 70.6 | 94.9 | 28 / 35 | 5198 |
| 4 | 1 | 68.7 | 90.2 | 19 / 35 | 5304 |
| 5 | 1 | 70.7 | 95.9 | 28 / 35 | 5191 |
| 6 | 1 | 71.0 | 96.5 | 28 / 35 | 5294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 64 | 94% |
| DTF.Kludgy 1.2b | 51 | 78% |
| ne.Chimera 1.2 | 32 | 75% |
| vStar.RAFzilla 2.15 | 17 | 88% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| donjezza.Muncho 1.0 | 6 | 67% |
| kurios.DOSexe .9b | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 47% | 63 |
| ne.Chimera 1.2 | 12 | 24% | 36 |
| ejb.Polaris 1.0.1 | 6 | 12% | 64 |
| tvv.micro.Antares 1.1.1 | 3 | 6% | 16 |
| donjezza.Muncho 1.0 | 3 | 6% | 5 |
| vStar.RAFzilla 2.15 | 2 | 4% | 17 |
| kurios.DOSexe .9b | 0 | 0% | 7 |
| sam.Samspin 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.0 | 89 / 210 | 2.62 | 16.9% | 25492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.3 | 16.9% | 89 |
| rz.Aleph 0.34 | 1.7 | 16.5% | 64 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.1% | 26 |
| djc.DynaBot 0.1.1 | 4.2 | 10.8% | 10 |
| rdt199.Warlord 0.73 | 5.5 | 9.4% | 10 |
| br2.MobyDickBot 1.6 | 5.5 | 9.2% | 8 |
| uji.YellohFellah 1.0 | 7.0 | 7.8% | 4 |
| KiraNL.Chupacabra 0.4 | 7.8 | 6.8% | 0 |
| stelo.MirrorNano 1.3 | 9.2 | 5.0% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 83.5 | 14 / 35 | 4199 |
| 2 | 2 | 66.7 | 84.1 | 16 / 35 | 4331 |
| 3 | 1 | 65.2 | 78.7 | 15 / 35 | 4137 |
| 4 | 1 | 65.6 | 80.3 | 16 / 35 | 4345 |
| 5 | 2 | 65.7 | 81.9 | 13 / 35 | 4303 |
| 6 | 1 | 66.1 | 83.5 | 15 / 35 | 4177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 58 | 60% |
| cx.mini.Nimrod 0.55 | 19 | 74% |
| djc.DynaBot 0.1.1 | 16 | 88% |
| br2.MobyDickBot 1.6 | 12 | 67% |
| uji.YellohFellah 1.0 | 11 | 91% |
| rdt199.Warlord 0.73 | 9 | 89% |

Hadur died in 122 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 63 | 52% | 96 |
| cx.mini.Nimrod 0.55 | 21 | 17% | 32 |
| djc.DynaBot 0.1.1 | 13 | 11% | 28 |
| rdt199.Warlord 0.73 | 11 | 9% | 19 |
| br2.MobyDickBot 1.6 | 7 | 6% | 17 |
| uji.YellohFellah 1.0 | 2 | 2% | 13 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |
| KiraNL.Chupacabra 0.4 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.5 | 137 / 210 | 2.21 | 18.2% | 24200 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 18.2% | 137 |
| darkcanuck.Leon 1.01 | 2.8 | 13.0% | 17 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.2% | 21 |
| nat.PallasHawk 1.0 | 3.3 | 12.9% | 24 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.8% | 9 |
| jrm.Test0 1.0 | 6.0 | 8.1% | 0 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.2% | 0 |
| jaybot.bots.Oddball 4.0 | 8.3 | 6.1% | 1 |
| jp.Perpy 16.0 | 8.5 | 6.2% | 1 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 81.0 | 21 / 35 | 3848 |
| 2 | 1 | 65.3 | 82.2 | 18 / 35 | 3700 |
| 3 | 1 | 69.1 | 89.8 | 27 / 35 | 4278 |
| 4 | 1 | 67.8 | 87.6 | 23 / 35 | 3960 |
| 5 | 1 | 69.1 | 90.2 | 25 / 35 | 4375 |
| 6 | 1 | 68.1 | 88.3 | 23 / 35 | 4039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 88% |
| bts.wiki.RipCurl 0.9b | 46 | 83% |
| darkcanuck.Leon 1.01 | 44 | 93% |
| brainfade.melee.Genghis 0.36 | 8 | 88% |
| jrm.Test0 1.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 67% |

Hadur died in 73 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 23 | 32% | 53 |
| nat.PallasHawk 1.0 | 16 | 22% | 55 |
| darkcanuck.Leon 1.01 | 13 | 18% | 66 |
| brainfade.melee.Genghis 0.36 | 8 | 11% | 14 |
| jrm.Test0 1.0 | 6 | 8% | 11 |
| jp.Perpy 16.0 | 3 | 4% | 4 |
| jaybot.bots.Oddball 4.0 | 3 | 4% | 3 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F13

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 86.0 | 91 / 210 | 2.26 | 17.2% | 26846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.3 | 17.2% | 91 |
| ags.Glacier 0.2.11 | 2.2 | 16.3% | 37 |
| mn.Combat 3.25.0 | 2.5 | 16.2% | 64 |
| shinh.Entangled 0.3 | 4.3 | 11.8% | 12 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.2% | 7 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 4.9% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.3% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.9 | 15 / 35 | 4489 |
| 2 | 1 | 67.2 | 86.0 | 18 / 35 | 4502 |
| 3 | 1 | 68.7 | 88.6 | 18 / 35 | 4860 |
| 4 | 2 | 65.9 | 86.3 | 14 / 35 | 3910 |
| 5 | 2 | 65.6 | 83.2 | 9 / 35 | 4452 |
| 6 | 1 | 67.4 | 83.8 | 17 / 35 | 4633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 68 | 66% |
| mn.Combat 3.25.0 | 66 | 55% |
| shinh.Entangled 0.3 | 10 | 60% |
| gh.micro.Gruweltje 0.7 | 4 | 75% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 50 | 42% | 86 |
| ags.Glacier 0.2.11 | 38 | 32% | 81 |
| shinh.Entangled 0.3 | 22 | 18% | 31 |
| gh.micro.Gruweltje 0.7 | 4 | 3% | 6 |
| ayk.WallHugger 1.0 | 2 | 2% | 2 |
| stelo.Wang 1.0 | 2 | 2% | 2 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 94.0 | 157 / 210 | 1.54 | 20.2% | 31777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 20.2% | 157 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 22 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.9% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.8% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.3% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 6.2 | 8.8% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.5% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.5% | 8 |
| pa.Improved 1.0 | 9.0 | 5.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 95.6 | 25 / 35 | 5252 |
| 2 | 1 | 70.5 | 93.3 | 27 / 35 | 5323 |
| 3 | 1 | 70.7 | 92.7 | 28 / 35 | 5453 |
| 4 | 1 | 69.8 | 94.0 | 24 / 35 | 4862 |
| 5 | 1 | 71.3 | 95.9 | 29 / 35 | 5407 |
| 6 | 1 | 70.4 | 92.7 | 24 / 35 | 5480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 89 | 90% |
| catcat20.shape.Theta 0.018 | 50 | 76% |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 75% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 89% |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 20 | 38% | 96 |
| catcat20.shape.Theta 0.018 | 17 | 32% | 48 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 13% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 8 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 6% | 22 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 2 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F15

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.9 | 104 / 210 | 2.45 | 18.1% | 31104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 18.1% | 104 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.5% | 24 |
| emp.Yngwie 1.11 | 3.2 | 12.9% | 42 |
| mld.DustBunny 3.8 | 4.5 | 11.8% | 11 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.3% | 10 |
| kawigi.robot.Girl 1.2 | 5.3 | 10.5% | 19 |
| lambdaxy.TBot 0.1 | 7.5 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.1% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.7 | 19 / 35 | 4968 |
| 2 | 1 | 69.1 | 86.7 | 18 / 35 | 5454 |
| 3 | 1 | 66.6 | 81.3 | 18 / 35 | 4763 |
| 4 | 1 | 68.3 | 86.0 | 17 / 35 | 5495 |
| 5 | 1 | 67.4 | 82.2 | 17 / 35 | 5237 |
| 6 | 1 | 67.1 | 81.3 | 15 / 35 | 5187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 46 | 54% |
| kawigi.micro.Shiz 1.1 | 25 | 92% |
| kawigi.robot.Girl 1.2 | 23 | 78% |
| cb.nano.Insomnia 1.0 | 22 | 100% |
| mld.DustBunny 3.8 | 12 | 92% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 34 | 32% | 71 |
| kawigi.robot.Girl 1.2 | 19 | 18% | 26 |
| kawigi.micro.Shiz 1.1 | 18 | 17% | 46 |
| cb.nano.Insomnia 1.0 | 15 | 14% | 21 |
| mld.DustBunny 3.8 | 12 | 11% | 29 |
| lambdaxy.TBot 0.1 | 4 | 4% | 5 |
| divineomega.TrialBot 0.003 | 2 | 2% | 8 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.6 | 109 / 210 | 2.12 | 19.0% | 32868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 19.0% | 109 |
| gh.Griezel 0.5.2 | 2.2 | 16.4% | 63 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.3% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 9.8% | 23 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.4% | 0 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.8% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 8.1% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 4.9% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 5.0% | 0 |
| repositorio.NanoStep 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.3 | 18 / 35 | 5671 |
| 2 | 1 | 68.4 | 86.7 | 15 / 35 | 5157 |
| 3 | 1 | 70.1 | 88.3 | 21 / 35 | 5679 |
| 4 | 1 | 69.1 | 87.6 | 20 / 35 | 5445 |
| 5 | 1 | 68.4 | 86.3 | 19 / 35 | 5040 |
| 6 | 1 | 69.9 | 89.2 | 16 / 35 | 5876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 92 | 53% |
| techdude.forest.FlamingForest 1.1 | 24 | 58% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 96% |
| bvh.fnr.Fenrir 0.36l | 9 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| asd.Cthulhu 1.3 | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 57 | 56% | 114 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 20% | 42 |
| techdude.forest.FlamingForest 1.1 | 10 | 10% | 23 |
| divineomega.DivineBot 1.9.4.5 | 5 | 5% | 10 |
| bvh.fnr.Fenrir 0.36l | 5 | 5% | 9 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 7 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 2 |
| asd.Cthulhu 1.3 | 0 | 0% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.2 | 104 / 210 | 2.33 | 18.0% | 29658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 18.0% | 104 |
| cx.BlestPain 1.41 | 3.2 | 12.6% | 42 |
| et.Predator 1.8 | 3.2 | 13.0% | 21 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.4% | 25 |
| nic.Nicator 2.4 | 4.8 | 11.2% | 8 |
| ahf.NanoAndrew .4 | 5.7 | 10.5% | 7 |
| maribo.melee.BMV 0.1 | 6.8 | 9.1% | 1 |
| tex.Longbot 0.4 | 8.3 | 5.4% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.2% | 2 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.5 | 19 / 35 | 5043 |
| 2 | 1 | 67.8 | 85.1 | 19 / 35 | 4937 |
| 3 | 1 | 66.6 | 81.6 | 14 / 35 | 4976 |
| 4 | 1 | 66.0 | 80.6 | 14 / 35 | 4726 |
| 5 | 1 | 69.2 | 89.8 | 21 / 35 | 5124 |
| 6 | 1 | 67.2 | 83.5 | 17 / 35 | 4852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 45 | 82% |
| cx.BlestPain 1.41 | 30 | 37% |
| oog.melee.Mercutio 1.0 | 28 | 82% |
| nic.Nicator 2.4 | 20 | 80% |
| ahf.NanoAndrew .4 | 12 | 92% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 0% |

Hadur died in 107 of 210 rounds, at a mean tick of 1074. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 37 | 35% | 53 |
| oog.melee.Mercutio 1.0 | 21 | 20% | 38 |
| et.Predator 1.8 | 18 | 17% | 50 |
| nic.Nicator 2.4 | 10 | 9% | 31 |
| ahf.NanoAndrew .4 | 8 | 7% | 17 |
| maribo.melee.BMV 0.1 | 5 | 5% | 10 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 4% | 6 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| goblin.Bender 2.4 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.7 | 126 / 210 | 2.10 | 18.5% | 26904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 18.5% | 126 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.3% | 26 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.1% | 22 |
| uji.DBH 1.1 | 4.5 | 10.4% | 8 |
| spinnercat.Robovirus 2.718 | 5.2 | 9.7% | 13 |
| ratosh.Nobo 0.21 | 6.0 | 9.3% | 3 |
| sigterm.Sigterm 1.0 | 6.2 | 8.7% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 6.6% | 2 |
| stelo.WangRobot 1.0 | 9.3 | 5.8% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 81.9 | 16 / 35 | 3983 |
| 2 | 1 | 69.3 | 91.1 | 25 / 35 | 4768 |
| 3 | 1 | 67.5 | 87.6 | 22 / 35 | 4480 |
| 4 | 1 | 65.4 | 83.2 | 16 / 35 | 3874 |
| 5 | 1 | 67.9 | 87.3 | 21 / 35 | 4792 |
| 6 | 1 | 70.2 | 95.2 | 26 / 35 | 5007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 48 | 71% |
| agd.Mooserwirt2 2.7 | 34 | 82% |
| sigterm.Sigterm 1.0 | 22 | 86% |
| uji.DBH 1.1 | 15 | 87% |
| spinnercat.Robovirus 2.718 | 15 | 67% |
| ratosh.Nobo 0.21 | 11 | 91% |
| stelo.WangRobot 1.0 | 10 | 90% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 31 | 36% | 73 |
| agd.Mooserwirt2 2.7 | 16 | 19% | 47 |
| ratosh.Nobo 0.21 | 10 | 12% | 20 |
| spinnercat.Robovirus 2.718 | 10 | 12% | 14 |
| sigterm.Sigterm 1.0 | 6 | 7% | 18 |
| uji.DBH 1.1 | 5 | 6% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 4% | 5 |
| stelo.WangRobot 1.0 | 2 | 2% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 1% | 11 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 96.0 | 175 / 210 | 1.36 | 21.2% | 33914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 21.2% | 175 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.0% | 12 |
| mld.Infinity 2.2 | 3.0 | 13.7% | 16 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.2% | 4 |
| erdnis.Rover 0.3 | 5.0 | 10.0% | 3 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.2% | 0 |
| pac.ABC 2.1 | 7.8 | 6.6% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.9 | 27 / 35 | 5377 |
| 2 | 1 | 71.7 | 95.2 | 28 / 35 | 5401 |
| 3 | 1 | 73.0 | 98.4 | 33 / 35 | 5719 |
| 4 | 1 | 72.8 | 95.9 | 31 / 35 | 6106 |
| 5 | 1 | 71.2 | 94.0 | 25 / 35 | 5327 |
| 6 | 1 | 73.0 | 97.5 | 31 / 35 | 5984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 100 | 94% |
| mld.Infinity 2.2 | 55 | 87% |
| krillr.mini.JointStrike 2.0.0 | 14 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| erdnis.Rover 0.3 | 6 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 1428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 14 | 39% | 121 |
| mld.Infinity 2.2 | 12 | 33% | 27 |
| krillr.mini.JointStrike 2.0.0 | 5 | 14% | 22 |
| erdnis.Rover 0.3 | 3 | 8% | 11 |
| patson.PatsonTestBot 1.0 | 1 | 3% | 13 |
| pbg.R2D2 1.0 | 0 | 0% | 6 |
| pac.ABC 2.1 | 0 | 0% | 3 |
| mbh.Mbh 0.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.7 | 121 / 210 | 2.02 | 19.2% | 31727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.2 | 19.2% | 121 |
| trm.Wrekt 1.1.6.f | 1.8 | 16.4% | 45 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.2% | 7 |
| fwb.Nine 1.0.1 | 4.0 | 11.2% | 17 |
| catcat20.Rabbit 0.001 | 4.3 | 10.3% | 17 |
| bayen.nut.Squirrel 1.615 | 6.3 | 7.5% | 4 |
| m3thos.mini.Eva01 0.5.5 | 7.2 | 7.4% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 7.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.3 | 23 / 35 | 5086 |
| 2 | 2 | 66.6 | 82.2 | 13 / 35 | 5007 |
| 3 | 1 | 69.7 | 89.5 | 21 / 35 | 5674 |
| 4 | 1 | 69.6 | 92.1 | 22 / 35 | 5018 |
| 5 | 1 | 70.1 | 93.7 | 23 / 35 | 5195 |
| 6 | 1 | 69.2 | 86.3 | 19 / 35 | 5747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 86 | 74% |
| fwb.Nine 1.0.1 | 25 | 80% |
| nz.jdc.nano.GridFu 1.0 | 18 | 89% |
| catcat20.Rabbit 0.001 | 18 | 56% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1084. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 41 | 46% | 85 |
| fwb.Nine 1.0.1 | 17 | 19% | 32 |
| catcat20.Rabbit 0.001 | 12 | 13% | 28 |
| nz.jdc.nano.GridFu 1.0 | 11 | 12% | 36 |
| bayen.nut.Squirrel 1.615 | 4 | 4% | 15 |
| ntc.ControlledChaos 1.1.4 | 2 | 2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.8 | 145 / 210 | 1.56 | 20.4% | 32622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 20.4% | 145 |
| eem.EvBot v4.6.16 | 2.2 | 16.1% | 49 |
| dummy.mini.Scimitar 1.01 | 2.8 | 14.5% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 2 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.5% | 0 |
| eld.Hmm 1.0 | 5.7 | 8.1% | 5 |
| fire219.CatBot 1.0 | 7.3 | 6.2% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 95.6 | 24 / 35 | 5826 |
| 2 | 1 | 71.1 | 94.3 | 25 / 35 | 5438 |
| 3 | 1 | 70.9 | 93.7 | 27 / 35 | 5136 |
| 4 | 1 | 71.8 | 93.3 | 26 / 35 | 5884 |
| 5 | 1 | 70.2 | 93.3 | 21 / 35 | 5261 |
| 6 | 1 | 70.1 | 92.7 | 22 / 35 | 5077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 117 | 72% |
| dummy.mini.Scimitar 1.01 | 40 | 88% |
| cf.RiO.RiOx 4.2.1 | 22 | 95% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| eld.Hmm 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 1417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 43 | 63% | 105 |
| dummy.mini.Scimitar 1.01 | 14 | 21% | 68 |
| cf.RiO.RiOx 4.2.1 | 4 | 6% | 12 |
| oa.weak.BotherBot 0.1 | 2 | 3% | 10 |
| eld.Hmm 1.0 | 1 | 1% | 12 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| PSW.Relentless 0.1 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.9 | 109 / 210 | 2.00 | 18.6% | 30141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 18.6% | 109 |
| pe.SandboxDT 2.71m | 2.2 | 16.0% | 58 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.5% | 25 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.1% | 15 |
| bigpete.Stewie 1.0 | 5.0 | 10.3% | 4 |
| tad.Dalek98 0.98 | 6.7 | 6.7% | 0 |
| yk.JahRoslav 1.1 | 7.0 | 6.7% | 1 |
| gg.Squaraus 0.6 | 7.5 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.4 | 22 / 35 | 5509 |
| 2 | 1 | 69.2 | 89.5 | 16 / 35 | 4971 |
| 3 | 1 | 68.5 | 87.6 | 18 / 35 | 5162 |
| 4 | 1 | 68.6 | 87.9 | 18 / 35 | 4925 |
| 5 | 1 | 68.2 | 87.6 | 15 / 35 | 5011 |
| 6 | 1 | 68.5 | 88.6 | 20 / 35 | 4563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 54 | 41% |
| kvk.HebusLeTroll 0.35 | 44 | 80% |
| jlm.javaDisturbance 0.59 | 38 | 89% |
| bigpete.Stewie 1.0 | 14 | 86% |
| pbg.NinjaX 1.2 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1037. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 45 | 44% | 81 |
| kvk.HebusLeTroll 0.35 | 25 | 25% | 51 |
| jlm.javaDisturbance 0.59 | 20 | 20% | 49 |
| bigpete.Stewie 1.0 | 5 | 5% | 14 |
| tad.Dalek98 0.98 | 2 | 2% | 5 |
| pbg.NinjaX 1.2 | 1 | 1% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.1 | 134 / 210 | 1.80 | 19.4% | 29464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 19.4% | 134 |
| pe.SandboxLump 1.52 | 2.0 | 16.9% | 45 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 19 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.6% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.5% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.8% | 5 |
| sample.Walls 1.0 | 6.5 | 8.3% | 1 |
| cw.megas.Blade 0.8 | 7.3 | 7.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.8 | 22 / 35 | 4719 |
| 2 | 1 | 70.7 | 92.4 | 23 / 35 | 4915 |
| 3 | 1 | 71.4 | 93.7 | 24 / 35 | 5401 |
| 4 | 1 | 71.0 | 94.0 | 25 / 35 | 4855 |
| 5 | 1 | 68.1 | 84.4 | 16 / 35 | 4497 |
| 6 | 1 | 70.6 | 92.4 | 24 / 35 | 5077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 83 | 76% |
| cre.Karolos 0.32 | 33 | 85% |
| stelo.AreaTargetingBot 1.1 | 22 | 86% |
| sample.Walls 1.0 | 11 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 41 | 54% | 108 |
| cre.Karolos 0.32 | 21 | 28% | 52 |
| stelo.AreaTargetingBot 1.1 | 7 | 9% | 21 |
| sample.Walls 1.0 | 3 | 4% | 7 |
| stelo.RamTrackSurfer 1.2 | 2 | 3% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 3% | 6 |
| cw.megas.Blade 0.8 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 78.0 | 83 / 210 | 2.98 | 15.8% | 22498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 15.8% | 83 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.7% | 33 |
| davidalves.Phoenix 0.54 | 2.8 | 13.5% | 41 |
| florent.XSeries.X2 0.12 | 3.7 | 13.1% | 32 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.7% | 15 |
| oog.melee.Corsair 1.0 | 6.2 | 9.3% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 7.8% | 3 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.6% | 0 |
| evd.X1 0.01 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 78.4 | 12 / 35 | 3593 |
| 2 | 1 | 64.9 | 79.7 | 16 / 35 | 3788 |
| 3 | 1 | 63.7 | 77.5 | 12 / 35 | 3823 |
| 4 | 1 | 63.2 | 75.2 | 14 / 35 | 3621 |
| 5 | 1 | 63.9 | 76.5 | 12 / 35 | 3920 |
| 6 | 1 | 65.0 | 81.0 | 17 / 35 | 3753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 29 | 62% |
| rz.GlowBlowMelee 1.4 | 28 | 64% |
| florent.XSeries.X2 0.12 | 22 | 55% |
| pedersen.Ugluk 1.1.1 | 22 | 95% |
| stelo.SoJNanoMelee 1.1 | 9 | 89% |
| oog.melee.Corsair 1.0 | 4 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 33 | 26% | 48 |
| davidalves.Phoenix 0.54 | 29 | 23% | 51 |
| rz.GlowBlowMelee 1.4 | 29 | 23% | 47 |
| pedersen.Ugluk 1.1.1 | 18 | 14% | 30 |
| oog.melee.Corsair 1.0 | 6 | 5% | 14 |
| stelo.SoJNanoMelee 1.1 | 6 | 5% | 12 |
| lunchie.Lunchbox 0.93 | 6 | 5% | 6 |
| evd.X1 0.01 | 1 | 1% | 2 |

## Melee bench: F25

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 87.9 | 146 / 210 | 2.09 | 19.1% | 26640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 19.1% | 146 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.7% | 19 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.6% | 8 |
| jdw.Hurricane 1.4 | 4.0 | 11.0% | 17 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.4% | 10 |
| ds.Oo 2.2 | 5.7 | 8.9% | 7 |
| awesomeness.Elite 1.0 | 7.7 | 7.3% | 1 |
| gjr.Cephalosporin 0.1 | 7.8 | 6.8% | 0 |
| adt.Ar2 1.1 | 8.5 | 6.5% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.9 | 25 / 35 | 4238 |
| 2 | 1 | 69.0 | 91.4 | 24 / 35 | 4293 |
| 3 | 1 | 66.8 | 82.5 | 23 / 35 | 4224 |
| 4 | 1 | 69.5 | 88.6 | 27 / 35 | 4673 |
| 5 | 1 | 68.3 | 85.4 | 21 / 35 | 4933 |
| 6 | 1 | 69.4 | 90.8 | 26 / 35 | 4279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 53 | 91% |
| voidious.micro.BlitzBat 1.05 | 41 | 98% |
| jdw.Hurricane 1.4 | 27 | 93% |
| ds.Oo 2.2 | 9 | 67% |
| gre.svman4.Morfeas 1.4.1 | 8 | 100% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| adt.Ar2 1.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 17 | 26% | 62 |
| jdw.Hurricane 1.4 | 16 | 25% | 36 |
| voidious.micro.BlitzBat 1.05 | 14 | 22% | 55 |
| awesomeness.Elite 1.0 | 8 | 12% | 11 |
| ds.Oo 2.2 | 6 | 9% | 20 |
| gre.svman4.Morfeas 1.4.1 | 4 | 6% | 16 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 8 |
| amk.ChumbaMini 0.2 | 0 | 0% | 1 |
| adt.Ar2 1.1 | 0 | 0% | 1 |

## Melee bench: F26

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.7 | 133 / 210 | 1.84 | 19.3% | 31845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 19.3% | 133 |
| ak.Fermat 2.0 | 2.0 | 14.4% | 28 |
| shu.nitro.LENIN .T34 | 3.2 | 12.6% | 23 |
| lrem.Spectre 0.4.4 | 3.8 | 11.9% | 15 |
| js.PinBall 1.6 | 5.3 | 10.4% | 6 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.5% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 9.1% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.4% | 1 |
| sample.SpinBot 1.0 | 8.8 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.9 | 19 / 35 | 5298 |
| 2 | 1 | 66.6 | 82.2 | 14 / 35 | 4890 |
| 3 | 1 | 70.9 | 94.9 | 25 / 35 | 5517 |
| 4 | 1 | 70.7 | 94.6 | 24 / 35 | 5409 |
| 5 | 1 | 70.7 | 92.4 | 25 / 35 | 5577 |
| 6 | 1 | 70.0 | 92.1 | 26 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 56 | 75% |
| ak.Fermat 2.0 | 52 | 75% |
| lrem.Spectre 0.4.4 | 34 | 88% |
| js.PinBall 1.6 | 12 | 75% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 80% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 26 | 34% | 59 |
| shu.nitro.LENIN .T34 | 22 | 29% | 67 |
| lrem.Spectre 0.4.4 | 12 | 16% | 34 |
| js.PinBall 1.6 | 10 | 13% | 29 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 6% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 7 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 5 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.9 | 144 / 210 | 2.09 | 19.2% | 29797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 19.2% | 144 |
| mk.Alpha 0.2.1 | 2.5 | 13.6% | 28 |
| wee.Gem 1.8.4 | 3.0 | 12.2% | 23 |
| EH.Eagle 1.0.6 | 4.0 | 11.3% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.0 | 10.2% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.8% | 3 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.7% | 0 |
| joe.ADinosaur 1.0 | 7.5 | 7.2% | 0 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.2 | 22 / 35 | 4692 |
| 2 | 1 | 69.2 | 90.8 | 27 / 35 | 4728 |
| 3 | 1 | 69.3 | 90.5 | 24 / 35 | 4798 |
| 4 | 1 | 70.0 | 82.5 | 23 / 35 | 5912 |
| 5 | 1 | 69.2 | 82.5 | 21 / 35 | 5552 |
| 6 | 1 | 68.7 | 91.1 | 27 / 35 | 4115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 69 | 87% |
| wee.Gem 1.8.4 | 43 | 72% |
| EH.Eagle 1.0.6 | 23 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 24 | 36% | 83 |
| wee.Gem 1.8.4 | 18 | 27% | 46 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 12% | 25 |
| EH.Eagle 1.0.6 | 5 | 7% | 30 |
| caimano.Furia_Ceca 0.22 | 4 | 6% | 5 |
| throxbot.ThroxBot 0.1 | 3 | 4% | 7 |
| joe.ADinosaur 1.0 | 2 | 3% | 5 |
| cs.Grudge 1.0 | 2 | 3% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 1% | 6 |

## Melee bench: F28

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 91.9 | 147 / 210 | 1.73 | 19.4% | 26608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 19.4% | 147 |
| kid.test.NightFox .2 | 2.0 | 14.6% | 27 |
| uji.Antique 1.0 | 3.7 | 11.5% | 14 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.1% | 17 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.4% | 2 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.0% | 2 |
| ahr.ice.Ice 1.0.2 | 7.0 | 7.6% | 1 |
| matt.advanced.Katana 1.0 | 8.5 | 6.1% | 0 |
| stelo.PianistNano 1.2 | 8.5 | 6.3% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 96.8 | 26 / 35 | 4546 |
| 2 | 1 | 67.6 | 87.6 | 20 / 35 | 4395 |
| 3 | 1 | 69.6 | 94.6 | 25 / 35 | 4449 |
| 4 | 1 | 69.0 | 90.5 | 25 / 35 | 4385 |
| 5 | 1 | 68.4 | 89.8 | 25 / 35 | 4093 |
| 6 | 1 | 69.9 | 92.1 | 26 / 35 | 4740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 80 | 80% |
| uji.Antique 1.0 | 46 | 93% |
| qohnil.blot.BlotBot 3.61 | 30 | 67% |
| amk.ChumbaWumba 0.3 | 8 | 100% |
| ahr.ice.Ice 1.0.2 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 23 | 37% | 88 |
| qohnil.blot.BlotBot 3.61 | 14 | 22% | 33 |
| uji.Antique 1.0 | 11 | 17% | 44 |
| ahr.ice.Ice 1.0.2 | 6 | 10% | 16 |
| pfvicm.Sobieski 7.2.3b | 6 | 10% | 13 |
| stelo.PianistNano 1.2 | 1 | 2% | 4 |
| matt.advanced.Katana 1.0 | 1 | 2% | 3 |
| stelo.Lifestealer 1.0 | 1 | 2% | 2 |
| amk.ChumbaWumba 0.3 | 0 | 0% | 6 |

## Melee bench: F29

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.7 | 113 / 210 | 2.29 | 18.6% | 28893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 18.6% | 113 |
| deewiant.Anomaly 0.2 | 2.3 | 15.2% | 39 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.7% | 41 |
| myl.micro.Troodon 1.10 | 4.2 | 11.5% | 9 |
| jok.PheonixM 0.1.2 | 4.8 | 10.0% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 1 |
| DBall.Anarchy 0.1 | 7.3 | 6.7% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.7% | 1 |
| jangs.ns51 1.0 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.0 | 16 / 35 | 5312 |
| 2 | 1 | 70.6 | 90.8 | 21 / 35 | 5103 |
| 3 | 1 | 69.4 | 87.3 | 22 / 35 | 4635 |
| 4 | 1 | 67.4 | 81.9 | 19 / 35 | 4528 |
| 5 | 1 | 68.5 | 85.7 | 21 / 35 | 4869 |
| 6 | 1 | 66.5 | 82.5 | 14 / 35 | 4446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 64 | 75% |
| zyx.mega.YersiniaPestis 3.1 | 47 | 72% |
| myl.micro.Troodon 1.10 | 10 | 100% |
| DBall.Anarchy 0.1 | 7 | 100% |
| jok.PheonixM 0.1.2 | 6 | 83% |
| ph.melee.ArcherME 0.3 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 40 | 40% | 91 |
| zyx.mega.YersiniaPestis 3.1 | 24 | 24% | 54 |
| myl.micro.Troodon 1.10 | 14 | 14% | 27 |
| jok.PheonixM 0.1.2 | 13 | 13% | 21 |
| jangs.ns51 1.0 | 4 | 4% | 4 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 73.8 | 56 / 210 | 3.36 | 14.7% | 22295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.5 | 14.9% | 48 |
| hadur117.mini.DeiseSAME 0.4 | 1.8 | 14.7% | 56 |
| oog.melee.Capulet 1.2 | 3.2 | 13.5% | 35 |
| darkcanuck.B26354 1.06 | 4.0 | 12.9% | 37 |
| stelo.PastFuture 2.3.2 | 4.5 | 12.4% | 27 |
| ntc.Opposite 1.5 | 7.2 | 7.6% | 0 |
| intruder.PrairieWolf 2.61 | 7.3 | 7.3% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.2% | 4 |
| tripphippy.Alice 1.1 | 8.2 | 6.9% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 73.3 | 8 / 35 | 3551 |
| 2 | 1 | 63.1 | 72.7 | 11 / 35 | 4045 |
| 3 | 3 | 61.1 | 69.5 | 8 / 35 | 3715 |
| 4 | 1 | 63.3 | 76.2 | 9 / 35 | 3892 |
| 5 | 1 | 64.5 | 80.6 | 12 / 35 | 3694 |
| 6 | 3 | 60.8 | 70.5 | 8 / 35 | 3398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 30 | 60% |
| darkcanuck.B26354 1.06 | 23 | 74% |
| oog.melee.Capulet 1.2 | 21 | 43% |
| stelo.PastFuture 2.3.2 | 14 | 64% |
| intruder.PrairieWolf 2.61 | 4 | 25% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 40 | 26% | 56 |
| oog.melee.Capulet 1.2 | 36 | 23% | 48 |
| stelo.PastFuture 2.3.2 | 24 | 16% | 33 |
| darkcanuck.B26354 1.06 | 23 | 15% | 38 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 6% | 11 |
| tripphippy.Alice 1.1 | 9 | 6% | 9 |
| ntc.Opposite 1.5 | 7 | 5% | 8 |
| intruder.PrairieWolf 2.61 | 4 | 3% | 6 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 77.6 | 59 / 210 | 3.01 | 15.2% | 20614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.7% | 87 |
| hadur117.mini.DeiseSAME 0.4 | 2.2 | 15.2% | 59 |
| gh.mini.Griezel 0.2 | 2.7 | 13.8% | 44 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.1% | 8 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.0% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.6% | 3 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.7% | 1 |
| fm.mammillarias 1.3 | 7.8 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 4.9% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 76.5 | 10 / 35 | 3411 |
| 2 | 2 | 62.4 | 74.0 | 10 / 35 | 3392 |
| 3 | 2 | 63.3 | 78.7 | 8 / 35 | 3188 |
| 4 | 2 | 64.4 | 79.4 | 13 / 35 | 3481 |
| 5 | 2 | 62.6 | 77.1 | 8 / 35 | 3356 |
| 6 | 3 | 64.6 | 80.0 | 10 / 35 | 3786 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 57 | 47% |
| gh.mini.Griezel 0.2 | 33 | 48% |
| d414.nano.Quantum 1.0.0 | 9 | 89% |
| spinnercat.micro.Tyger 0.1 | 4 | 75% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 58 | 38% | 83 |
| gh.mini.Griezel 0.2 | 50 | 33% | 70 |
| spinnercat.micro.Tyger 0.1 | 13 | 9% | 15 |
| d414.nano.Quantum 1.0.0 | 11 | 7% | 17 |
| gh.nano.Grofvuil 0.2 | 10 | 7% | 14 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 7 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 90.7 | 145 / 210 | 1.84 | 19.2% | 28793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 19.2% | 145 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.0% | 34 |
| lxx.ConceptA 0.8 | 3.3 | 11.4% | 5 |
| apc.botM 3.0 | 3.8 | 11.1% | 14 |
| vjik.UnViolation 1.1 | 5.3 | 9.4% | 3 |
| bayen.UbaMicro 1.4 | 6.2 | 8.8% | 3 |
| panzer.Panzer 0.2 | 6.7 | 8.0% | 0 |
| yk.JahMicro 1.0 | 7.8 | 6.7% | 2 |
| conscience.Electron 1.3g | 9.3 | 5.8% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.3 | 22 / 35 | 4405 |
| 2 | 1 | 69.4 | 92.7 | 27 / 35 | 4793 |
| 3 | 1 | 68.9 | 90.5 | 24 / 35 | 5140 |
| 4 | 1 | 68.4 | 89.5 | 24 / 35 | 4792 |
| 5 | 1 | 68.6 | 91.1 | 21 / 35 | 4779 |
| 6 | 1 | 69.4 | 93.0 | 27 / 35 | 4884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 85 | 73% |
| lxx.ConceptA 0.8 | 31 | 100% |
| apc.botM 3.0 | 30 | 77% |
| vjik.UnViolation 1.1 | 8 | 100% |
| yk.JahMicro 1.0 | 7 | 100% |
| donjezza.Jezza 1.0 | 5 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 26 | 39% | 88 |
| lxx.ConceptA 0.8 | 13 | 20% | 34 |
| apc.botM 3.0 | 11 | 17% | 36 |
| bayen.UbaMicro 1.4 | 8 | 12% | 9 |
| yk.JahMicro 1.0 | 3 | 5% | 10 |
| vjik.UnViolation 1.1 | 2 | 3% | 21 |
| conscience.Electron 1.3g | 2 | 3% | 6 |
| panzer.Panzer 0.2 | 1 | 2% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F33

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.6 | 140 / 210 | 1.94 | 19.6% | 30084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 19.6% | 140 |
| maribo.Quester 0.3 | 2.0 | 15.5% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 19 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.9% | 4 |
| labg.Cataclysm 2.05 | 4.7 | 10.9% | 10 |
| baal.nano.N 1.42 | 6.0 | 8.6% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.0% | 6 |
| zyx.micro.Ant 1.1 | 8.3 | 5.1% | 0 |
| sanja.First 0.1 | 9.0 | 4.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.6 | 25 / 35 | 5209 |
| 2 | 1 | 69.6 | 89.5 | 23 / 35 | 4666 |
| 3 | 1 | 69.9 | 88.9 | 23 / 35 | 4998 |
| 4 | 1 | 70.7 | 92.7 | 26 / 35 | 5045 |
| 5 | 1 | 69.8 | 89.8 | 22 / 35 | 5089 |
| 6 | 1 | 69.4 | 88.9 | 21 / 35 | 5077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 56 | 82% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 85% |
| gre.svman4.Leonidas 1.3.2 | 27 | 100% |
| labg.Cataclysm 2.05 | 19 | 89% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 31 | 43% | 87 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 18% | 65 |
| labg.Cataclysm 2.05 | 8 | 11% | 18 |
| gre.svman4.Leonidas 1.3.2 | 6 | 8% | 15 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 8% | 10 |
| sanja.First 0.1 | 3 | 4% | 4 |
| zyx.micro.Ant 1.1 | 3 | 4% | 3 |
| baal.nano.N 1.42 | 2 | 3% | 6 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.8 | 103 / 210 | 2.10 | 18.1% | 28747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.2 | 18.1% | 103 |
| stelo.Spread 0.9 | 2.0 | 16.2% | 56 |
| kid.Gladiator .7.2 | 2.8 | 15.4% | 33 |
| jcs.Seth 1.8 | 4.0 | 11.9% | 17 |
| tcf.Reach 3 | 5.3 | 10.2% | 1 |
| cli.Dancer 1.1 | 5.7 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 90.5 | 17 / 35 | 4738 |
| 2 | 1 | 67.8 | 85.4 | 18 / 35 | 4657 |
| 3 | 1 | 69.7 | 90.2 | 20 / 35 | 5009 |
| 4 | 1 | 67.8 | 84.4 | 15 / 35 | 4877 |
| 5 | 2 | 66.5 | 84.1 | 10 / 35 | 4365 |
| 6 | 1 | 70.2 | 92.1 | 23 / 35 | 5101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 75 | 60% |
| kid.Gladiator .7.2 | 46 | 63% |
| jcs.Seth 1.8 | 21 | 76% |
| tcf.Reach 3 | 6 | 100% |
| ratosh.Wesco 1.4 | 4 | 100% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1059. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 52 | 48% | 93 |
| kid.Gladiator .7.2 | 35 | 32% | 60 |
| jcs.Seth 1.8 | 9 | 8% | 27 |
| tcf.Reach 3 | 7 | 6% | 15 |
| ratosh.Wesco 1.4 | 3 | 3% | 7 |
| cli.Dancer 1.1 | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 79.5 | 38 / 210 | 2.84 | 15.0% | 20543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 148 |
| hadur117.mini.DeiseSAME 0.4 | 2.0 | 15.0% | 38 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.5% | 15 |
| rz.HawkOnFire 0.1 | 3.7 | 11.9% | 2 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.8 | 10.9% | 6 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.9% | 0 |
| wit.Chuliath 1.0 | 7.3 | 6.8% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.3% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 79.7 | 3 / 35 | 3543 |
| 2 | 2 | 62.6 | 76.5 | 8 / 35 | 3495 |
| 3 | 2 | 63.6 | 80.0 | 7 / 35 | 3395 |
| 4 | 2 | 63.0 | 80.6 | 5 / 35 | 3240 |
| 5 | 2 | 64.4 | 80.3 | 9 / 35 | 3546 |
| 6 | 2 | 63.6 | 80.0 | 6 / 35 | 3324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 92 | 21% |
| gh.mini.Gruwel 0.9 | 11 | 55% |
| rz.HawkOnFire 0.1 | 8 | 88% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 63% |

Hadur died in 172 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 101 | 59% | 120 |
| gh.mini.Gruwel 0.9 | 27 | 16% | 36 |
| rz.HawkOnFire 0.1 | 20 | 12% | 26 |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 9% | 19 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 3 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.6 | 157 / 210 | 1.85 | 20.2% | 31923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 20.2% | 157 |
| bzdp.Pansy 2.1 | 2.3 | 12.2% | 11 |
| alpha.RainingFire 1.0 | 2.8 | 12.0% | 18 |
| mz.Cork 0.1 | 4.7 | 10.2% | 7 |
| bvh.micro.Freya 0.3 | 5.3 | 10.3% | 8 |
| bvh.mini.Fenrir 0.39 | 5.5 | 9.8% | 2 |
| m3thos.Eva02 0.7.1 | 6.3 | 8.7% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.0% | 2 |
| dl.BetterWalls 1.0 | 9.0 | 5.9% | 2 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 95.2 | 27 / 35 | 5470 |
| 2 | 1 | 70.4 | 91.1 | 27 / 35 | 5397 |
| 3 | 1 | 69.9 | 90.5 | 25 / 35 | 5293 |
| 4 | 1 | 71.5 | 95.2 | 28 / 35 | 5567 |
| 5 | 1 | 68.5 | 84.8 | 23 / 35 | 5020 |
| 6 | 1 | 69.3 | 86.7 | 27 / 35 | 5176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 96% |
| bvh.micro.Freya 0.3 | 35 | 91% |
| alpha.RainingFire 1.0 | 31 | 77% |
| mz.Cork 0.1 | 19 | 89% |
| bvh.mini.Fenrir 0.39 | 15 | 100% |
| m3thos.Eva02 0.7.1 | 11 | 91% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 14 | 25% | 39 |
| bzdp.Pansy 2.1 | 11 | 20% | 62 |
| bvh.mini.Fenrir 0.39 | 9 | 16% | 21 |
| m3thos.Eva02 0.7.1 | 7 | 13% | 16 |
| bvh.micro.Freya 0.3 | 4 | 7% | 27 |
| mz.Cork 0.1 | 3 | 5% | 28 |
| dl.BetterWalls 1.0 | 3 | 5% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |
2 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 95.7 | 185 / 210 | 1.39 | 21.0% | 35645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 21.0% | 185 |
| germ.TheMind .2 | 3.0 | 10.6% | 10 |
| EBBU.Sim2 1.02 | 3.0 | 10.5% | 3 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 9.9% | 5 |
| agrach.Dalek 1.0 | 5.3 | 9.0% | 2 |
| lmk.ACPFinal 0.1 | 7.0 | 8.1% | 1 |
| mb.Beast 0.1 | 7.2 | 7.9% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 7.5 | 8.0% | 0 |
| stelo.UntouchableNano 1.3 | 8.3 | 7.7% | 3 |
| skm.Ryubot 1.0 | 8.5 | 7.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.6 | 32 / 35 | 5770 |
| 2 | 1 | 69.9 | 92.7 | 28 / 35 | 5708 |
| 3 | 1 | 70.4 | 95.9 | 30 / 35 | 5754 |
| 4 | 1 | 70.7 | 94.6 | 29 / 35 | 6329 |
| 5 | 1 | 71.2 | 97.8 | 32 / 35 | 6169 |
| 6 | 1 | 71.4 | 98.7 | 34 / 35 | 5915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 37 | 89% |
| EBBU.Sim2 1.02 | 34 | 100% |
| skm.Ryubot 1.0 | 27 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 100% |
| mb.Beast 0.1 | 18 | 100% |
| lmk.ACPFinal 0.1 | 18 | 94% |
| stelo.UntouchableNano 1.3 | 18 | 94% |
| agrach.Dalek 1.0 | 16 | 100% |

Hadur died in 25 of 210 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 11 | 44% | 44 |
| EBBU.Sim2 1.02 | 6 | 24% | 32 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2 | 8% | 30 |
| agrach.Dalek 1.0 | 2 | 8% | 30 |
| stelo.UntouchableNano 1.3 | 2 | 8% | 21 |
| lmk.ACPFinal 0.1 | 2 | 8% | 18 |
| mb.Beast 0.1 | 0 | 0% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 0 | 0% | 6 |
| skm.Ryubot 1.0 | 0 | 0% | 3 |

## Melee bench: F38

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.0 | 94 / 210 | 2.44 | 17.0% | 24679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.2 | 17.0% | 94 |
| justin.Mallais 14.0 | 1.8 | 16.4% | 69 |
| bvh.mini.Freya 0.55 | 3.7 | 12.1% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.5% | 12 |
| bts.mega.Gnarly 1.4 | 4.8 | 11.0% | 16 |
| cs.Wren 1.0 | 5.5 | 10.3% | 5 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.6% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 5.7% | 0 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 81.9 | 15 / 35 | 4240 |
| 2 | 1 | 66.2 | 85.1 | 15 / 35 | 3870 |
| 3 | 1 | 66.0 | 84.1 | 15 / 35 | 3947 |
| 4 | 1 | 67.0 | 84.1 | 17 / 35 | 4437 |
| 5 | 1 | 67.6 | 87.3 | 18 / 35 | 4241 |
| 6 | 1 | 65.0 | 81.6 | 14 / 35 | 3944 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 66 | 65% |
| bvh.mini.Freya 0.55 | 19 | 84% |
| bts.mega.Gnarly 1.4 | 17 | 76% |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 85% |
| cs.Wren 1.0 | 10 | 80% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 51 | 44% | 97 |
| bvh.mini.Freya 0.55 | 22 | 19% | 30 |
| bts.mega.Gnarly 1.4 | 16 | 14% | 33 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 12% | 29 |
| cs.Wren 1.0 | 8 | 7% | 11 |
| kdf.KoulDestroyer 1.0 | 3 | 3% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 3 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.8 | 109 / 210 | 2.28 | 17.8% | 27742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 17.8% | 109 |
| bvh.fry.Freya 0.82 | 2.2 | 14.6% | 21 |
| az.Ololobot 0.2.4 | 3.0 | 12.6% | 48 |
| catcat20.Lambda 0.024 | 3.8 | 11.1% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.6% | 9 |
| gimp.GimpBot 0.1 | 7.0 | 7.6% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.8% | 0 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 7.9% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.6 | 22 / 35 | 4457 |
| 2 | 1 | 68.3 | 89.2 | 20 / 35 | 4843 |
| 3 | 1 | 66.6 | 84.8 | 18 / 35 | 4621 |
| 4 | 1 | 65.9 | 82.2 | 16 / 35 | 4760 |
| 5 | 1 | 66.6 | 85.1 | 15 / 35 | 4586 |
| 6 | 1 | 66.8 | 86.0 | 18 / 35 | 4475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 45 | 58% |
| bvh.fry.Freya 0.82 | 44 | 82% |
| catcat20.Lambda 0.024 | 39 | 72% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 87% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 50% |

Hadur died in 101 of 210 rounds, at a mean tick of 1033. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 32 | 32% | 69 |
| az.Ololobot 0.2.4 | 29 | 29% | 62 |
| catcat20.Lambda 0.024 | 18 | 18% | 38 |
| apollokidd.ApolloKidd 0.9 | 6 | 6% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 5 | 5% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5 | 5% | 8 |
| gimp.GimpBot 0.1 | 2 | 2% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 2 |

## Melee bench: F40

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.8 | 131 / 210 | 2.19 | 18.7% | 28104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 18.7% | 131 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.3% | 34 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.8% | 17 |
| mz.AntiGrav 1.0 | 4.3 | 10.7% | 3 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.7% | 11 |
| stelo.Randomness 1.0 | 6.0 | 8.9% | 9 |
| alpha.BlackIce 1.0 | 6.8 | 8.6% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 5.2% | 1 |
| sample.Corners 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.0 | 20 / 35 | 4608 |
| 2 | 1 | 69.1 | 87.6 | 23 / 35 | 5101 |
| 3 | 1 | 67.5 | 83.8 | 23 / 35 | 4449 |
| 4 | 1 | 68.6 | 89.2 | 20 / 35 | 4717 |
| 5 | 1 | 68.0 | 85.4 | 21 / 35 | 4483 |
| 6 | 1 | 69.2 | 88.9 | 24 / 35 | 4746 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 47 | 74% |
| kano.gamma.KanoGamma 1.8 | 36 | 89% |
| Polkwane.SmashMelee 1.0 | 26 | 100% |
| mz.AntiGrav 1.0 | 20 | 100% |
| stelo.Randomness 1.0 | 13 | 85% |
| alpha.BlackIce 1.0 | 7 | 57% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 32 | 40% | 63 |
| kano.gamma.KanoGamma 1.8 | 19 | 23% | 56 |
| mz.AntiGrav 1.0 | 8 | 10% | 29 |
| stelo.Randomness 1.0 | 7 | 9% | 22 |
| Polkwane.SmashMelee 1.0 | 6 | 7% | 18 |
| amk.superstrike.SuperStrike 0.3 | 5 | 6% | 6 |
| alpha.BlackIce 1.0 | 4 | 5% | 9 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 5 |
| sample.Corners 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.3 | 113 / 210 | 2.23 | 17.8% | 25213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 17.8% | 113 |
| eem.EvBotNG v12.8 | 2.0 | 15.1% | 47 |
| ary.Swarm 1.1 | 3.5 | 13.7% | 24 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 13.1% | 14 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.1% | 10 |
| shrub.Silver v048 | 6.2 | 8.4% | 1 |
| zyx.nano.Ant 1.1 | 7.2 | 7.3% | 0 |
| jsal.Jsalbot 1.0 | 7.7 | 6.3% | 2 |
| stelo.Mirror 1.1 | 9.0 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 82.5 | 17 / 35 | 3730 |
| 2 | 1 | 67.5 | 87.3 | 16 / 35 | 4142 |
| 3 | 1 | 68.8 | 89.8 | 23 / 35 | 4177 |
| 4 | 1 | 69.1 | 88.9 | 22 / 35 | 4535 |
| 5 | 1 | 67.1 | 84.4 | 16 / 35 | 4348 |
| 6 | 1 | 67.5 | 84.8 | 19 / 35 | 4281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 64 | 67% |
| ary.Swarm 1.1 | 34 | 71% |
| lessonz.robocode.Oz 0.5.0 | 32 | 88% |
| simonton.nano.MeleeSeed 1.8 | 11 | 100% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| shrub.Silver v048 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 34 | 35% | 75 |
| ary.Swarm 1.1 | 24 | 25% | 51 |
| lessonz.robocode.Oz 0.5.0 | 20 | 21% | 39 |
| simonton.nano.MeleeSeed 1.8 | 11 | 11% | 24 |
| jsal.Jsalbot 1.0 | 3 | 3% | 11 |
| shrub.Silver v048 | 3 | 3% | 5 |
| zyx.nano.Ant 1.1 | 2 | 2% | 2 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |

## Melee bench: F42

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.5 | 105 / 210 | 2.13 | 18.2% | 29845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 18.2% | 105 |
| wompi.Wallaby 5.1 | 2.2 | 15.7% | 48 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.5% | 16 |
| ara.Shera 0.88 | 3.5 | 13.5% | 38 |
| amz.NanoClone 1.41 | 5.0 | 8.6% | 2 |
| maribo.IotaCT 1.1 | 6.5 | 7.1% | 0 |
| dsw.StaticD 1.0 | 6.8 | 7.0% | 3 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.4% | 0 |
| mme.NikeEnhanced 2.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 92.1 | 21 / 35 | 5099 |
| 2 | 1 | 66.7 | 83.5 | 18 / 35 | 4881 |
| 3 | 1 | 67.5 | 87.0 | 15 / 35 | 4821 |
| 4 | 1 | 68.5 | 90.5 | 19 / 35 | 4951 |
| 5 | 1 | 68.0 | 86.3 | 16 / 35 | 5297 |
| 6 | 1 | 67.2 | 85.4 | 16 / 35 | 4796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 58 | 74% |
| ara.Shera 0.88 | 53 | 62% |
| maribo.mini.MiniQuester 0.1 | 29 | 79% |
| dsw.StaticD 1.0 | 5 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 36% | 83 |
| ara.Shera 0.88 | 38 | 36% | 64 |
| maribo.mini.MiniQuester 0.1 | 23 | 21% | 49 |
| amz.NanoClone 1.41 | 5 | 5% | 7 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| dsw.StaticD 1.0 | 0 | 0% | 5 |
2 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 76.1 | 28 / 210 | 3.15 | 14.5% | 21236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.4% | 154 |
| hadur117.mini.DeiseSAME 0.4 | 2.0 | 14.5% | 28 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.6% | 19 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.1% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.3% | 2 |
| jab.DiamondStealer 5 | 7.3 | 7.6% | 1 |
| mz.NanoGod 2.02 | 7.7 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 78.7 | 6 / 35 | 3729 |
| 2 | 2 | 63.5 | 76.5 | 5 / 35 | 3402 |
| 3 | 2 | 63.4 | 75.6 | 5 / 35 | 3648 |
| 4 | 2 | 62.5 | 72.4 | 2 / 35 | 3317 |
| 5 | 2 | 65.3 | 81.9 | 6 / 35 | 3462 |
| 6 | 2 | 62.6 | 71.4 | 4 / 35 | 3678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 88 | 17% |
| brainfade.melee.Dusk 0.44 | 11 | 64% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |
| cvt.Firsty 1.0 | 1 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 112 | 62% | 127 |
| dummy.micro.Sparrow 2.5 | 22 | 12% | 25 |
| brainfade.melee.Dusk 0.44 | 19 | 10% | 25 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 7% | 12 |
| Krabb.akim2.Akim2 1.1b | 7 | 4% | 8 |
| mz.NanoGod 2.02 | 5 | 3% | 6 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
| cvt.Firsty 1.0 | 1 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.3 | 124 / 210 | 2.06 | 19.0% | 30167 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 19.0% | 124 |
| stelo.Liblix 0.3.1 | 2.2 | 16.2% | 56 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.5% | 28 |
| wompi.Quokka 1.6 | 4.5 | 9.9% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 8.8% | 0 |
| jwirde.Gort 2.0 | 5.7 | 8.6% | 2 |
| disan.Chair 2.2.0 | 6.5 | 7.5% | 0 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.5% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.1 | 21 / 35 | 4781 |
| 2 | 1 | 68.8 | 87.0 | 21 / 35 | 4938 |
| 3 | 1 | 70.4 | 93.7 | 22 / 35 | 5185 |
| 4 | 1 | 69.3 | 87.9 | 24 / 35 | 5062 |
| 5 | 1 | 68.6 | 85.7 | 19 / 35 | 4999 |
| 6 | 1 | 68.3 | 84.1 | 17 / 35 | 5202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 81 | 77% |
| tzu.TheArtOfWar 1.2 | 53 | 77% |
| wompi.Quokka 1.6 | 6 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| jwirde.Gort 2.0 | 5 | 100% |
| disan.Chair 2.2.0 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 44 | 50% | 105 |
| tzu.TheArtOfWar 1.2 | 26 | 30% | 62 |
| wompi.Quokka 1.6 | 6 | 7% | 14 |
| jwirde.Gort 2.0 | 4 | 5% | 14 |
| disan.Chair 2.2.0 | 4 | 5% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 2% | 7 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.3 | 79 / 210 | 2.05 | 19.6% | 35946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSAME 0.4 | 1.0 | 19.6% | 79 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.3% | 112 |
| jje.BagPuss 1.2 | 3.2 | 12.0% | 5 |
| sul.Lunar 1.1 | 4.3 | 10.1% | 7 |
| myl.nano.Graviton 1.10 | 4.7 | 10.1% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.2% | 0 |
| fm.claire 1.7 | 7.0 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 7.9% | 3 |
| wit.Deep7 2.0 | 9.0 | 6.1% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.9 | 10 / 35 | 5841 |
| 2 | 1 | 71.4 | 93.3 | 18 / 35 | 6466 |
| 3 | 1 | 69.9 | 88.9 | 11 / 35 | 6490 |
| 4 | 1 | 68.9 | 85.7 | 13 / 35 | 6042 |
| 5 | 1 | 68.5 | 85.7 | 14 / 35 | 5658 |
| 6 | 1 | 68.6 | 88.3 | 13 / 35 | 5449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 119 | 22% |
| jje.BagPuss 1.2 | 13 | 92% |
| sul.Lunar 1.1 | 12 | 100% |
| myl.nano.Graviton 1.10 | 10 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| wit.Deep7 2.0 | 5 | 100% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 2430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 94 | 72% | 0 |
| jje.BagPuss 1.2 | 10 | 8% | 65 |
| sul.Lunar 1.1 | 8 | 6% | 59 |
| myl.nano.Graviton 1.10 | 7 | 5% | 34 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 21 |
| fm.claire 1.7 | 5 | 4% | 9 |
| wit.Deep7 2.0 | 1 | 1% | 7 |
| hvilela.HVilela 0.9 | 0 | 0% | 10 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeiseSAME 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.0 | 66 / 210 | 2.44 | 16.5% | 24848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.8 | 16.8% | 59 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.9% | 78 |
| hadur117.mini.DeiseSAME 0.4 | 2.2 | 16.5% | 66 |
| mz.MicroSheep 1.0 | 4.3 | 10.3% | 0 |
| cx.Princess 1.0 | 5.0 | 9.7% | 5 |
| sadoner.killer 0.2 | 5.8 | 8.6% | 2 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.5% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 85.7 | 12 / 35 | 4248 |
| 2 | 3 | 64.7 | 80.0 | 6 / 35 | 3971 |
| 3 | 2 | 65.7 | 85.4 | 13 / 35 | 3685 |
| 4 | 1 | 67.7 | 87.3 | 15 / 35 | 4700 |
| 5 | 3 | 65.9 | 83.2 | 9 / 35 | 4166 |
| 6 | 3 | 65.3 | 82.2 | 11 / 35 | 4078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 61 | 61% |
| rsalesc.melee.Medina 0.4.5 | 53 | 23% |
| cx.Princess 1.0 | 11 | 82% |
| mz.MicroSheep 1.0 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 68 | 47% | 86 |
| kc.mini.Mirage 0.2 | 53 | 37% | 91 |
| cx.Princess 1.0 | 8 | 6% | 14 |
| mz.MicroSheep 1.0 | 7 | 5% | 10 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 5 |
| sadoner.killer 0.2 | 2 | 1% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
1 death(s) with no robot to name.

