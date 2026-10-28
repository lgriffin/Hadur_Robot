# Bench suite: suite.txt

## Melee bench: F01

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 76.4 | 28 / 210 | 3.12 | 14.2% | 22492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 134 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.2% | 28 |
| sgp.JollyNinja 3.53 | 3.2 | 12.0% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.5% | 6 |
| mz.MicroGodMelee 1 | 4.7 | 11.3% | 9 |
| lorneswork.Predator 1.0 | 5.8 | 10.2% | 8 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.2 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 9.7 | 3.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 81.0 | 4 / 35 | 3615 |
| 2 | 2 | 62.2 | 76.8 | 7 / 35 | 3628 |
| 3 | 2 | 62.0 | 74.9 | 2 / 35 | 3997 |
| 4 | 2 | 61.0 | 72.7 | 7 / 35 | 3654 |
| 5 | 2 | 63.5 | 80.0 | 7 / 35 | 3694 |
| 6 | 2 | 61.0 | 73.0 | 1 / 35 | 3904 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 80 | 8% |
| mz.MicroGodMelee 1 | 14 | 64% |
| sgp.JollyNinja 3.53 | 12 | 58% |
| lorneswork.Predator 1.0 | 5 | 40% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 50% |
| adt.Ar2 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 0% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 1097. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 91 | 50% | 95 |
| sgp.JollyNinja 3.53 | 33 | 18% | 37 |
| lorneswork.Predator 1.0 | 19 | 10% | 21 |
| mz.MicroGodMelee 1 | 15 | 8% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 8% | 18 |
| adt.Ar2 1.0 | 4 | 2% | 5 |
| skm.butterfly 1.0 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 2 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 3 |

## Melee bench: F02

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 65.2 | 44 / 210 | 4.13 | 13.8% | 25389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.5 | 14.9% | 55 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.8 | 14.5% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.8% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.4% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 10.4% | 12 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.2% | 3 |
| sch.Simone 0.3d | 7.0 | 8.1% | 19 |
| Noran.BitchingElk 0.054 | 7.5 | 7.6% | 18 |
| stelo.PatternRobot 1.0 | 8.7 | 6.2% | 5 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 63.8 | 8 / 35 | 4212 |
| 2 | 2 | 62.4 | 72.4 | 6 / 35 | 4455 |
| 3 | 2 | 61.7 | 69.5 | 8 / 35 | 4228 |
| 4 | 3 | 59.7 | 63.8 | 8 / 35 | 4021 |
| 5 | 3 | 59.1 | 62.9 | 6 / 35 | 4059 |
| 6 | 3 | 58.9 | 59.0 | 8 / 35 | 4414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 33 | 42% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 23% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 100% |
| sch.Simone 0.3d | 6 | 83% |
| Noran.BitchingElk 0.054 | 5 | 0% |
| stelo.PatternRobot 1.0 | 5 | 40% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 75% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 27% | 55 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 25% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 19 | 11% | 24 |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 10% | 27 |
| fnc.bandit.Bandit 5.2.0 | 13 | 8% | 14 |
| stelo.PatternRobot 1.0 | 11 | 7% | 13 |
| sch.Simone 0.3d | 8 | 5% | 15 |
| Noran.BitchingElk 0.054 | 7 | 4% | 8 |
| fullsail.SweetTea 1.1 | 5 | 3% | 6 |

## Melee bench: F03

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 77.5 | 45 / 210 | 3.02 | 14.6% | 23075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.8 | 14.7% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 14.6% | 45 |
| vuen.Cake 2.51 | 3.0 | 13.9% | 59 |
| kawigi.nano.Lib 1.0 | 3.0 | 14.0% | 47 |
| urdos.URDOS 1.3 | 5.0 | 11.1% | 6 |
| adt.Ar1 2.1 | 6.2 | 7.7% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.8% | 1 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.5% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.3 | 6.0% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 77.1 | 8 / 35 | 3889 |
| 2 | 1 | 63.6 | 83.5 | 9 / 35 | 3781 |
| 3 | 3 | 62.8 | 77.8 | 9 / 35 | 4047 |
| 4 | 2 | 61.6 | 77.8 | 6 / 35 | 3708 |
| 5 | 2 | 61.4 | 73.7 | 7 / 35 | 4111 |
| 6 | 3 | 61.1 | 75.2 | 6 / 35 | 3539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 38 | 24% |
| radnor.DoctorBob 1.42 | 32 | 59% |
| kawigi.nano.Lib 1.0 | 26 | 19% |
| urdos.URDOS 1.3 | 12 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 51 | 31% | 57 |
| radnor.DoctorBob 1.42 | 42 | 25% | 54 |
| vuen.Cake 2.51 | 37 | 22% | 46 |
| urdos.URDOS 1.3 | 26 | 16% | 35 |
| ghent.ArthurPanzergon 1.0.0 | 4 | 2% | 5 |
| adt.Ar1 2.1 | 4 | 2% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 1 |

## Melee bench: F04

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 66.1 | 3 / 210 | 4.05 | 13.0% | 25383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.4% | 191 |
| apc.LeeroyJenkins2 1.0 | 2.3 | 13.9% | 11 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.0% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 2 |
| josago.Jorgito 0.16 | 5.3 | 9.1% | 1 |
| css.Delitioner 0.11 | 6.2 | 7.2% | 2 |
| tj.zombie1n 1.0.1 | 6.5 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 62.5 | 0 / 35 | 4184 |
| 2 | 3 | 60.7 | 65.7 | 1 / 35 | 4163 |
| 3 | 2 | 61.4 | 70.8 | 0 / 35 | 4105 |
| 4 | 3 | 59.6 | 62.2 | 1 / 35 | 4293 |
| 5 | 3 | 59.3 | 64.8 | 1 / 35 | 3920 |
| 6 | 2 | 62.7 | 70.8 | 0 / 35 | 4718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 66 | 5% |
| apc.LeeroyJenkins2 1.0 | 3 | 0% |
| css.Delitioner 0.11 | 1 | 0% |

Hadur died in 207 of 210 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 129 | 62% | 132 |
| apc.LeeroyJenkins2 1.0 | 31 | 15% | 31 |
| josago.Jorgito 0.16 | 20 | 10% | 20 |
| tj.zombie1n 1.0.1 | 9 | 4% | 9 |
| rampancy.Durandal 2.1d | 6 | 3% | 6 |
| css.Delitioner 0.11 | 5 | 2% | 5 |
| TNT.TNT 0.99.1 | 5 | 2% | 5 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F06

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 66.9 | 27 / 210 | 3.98 | 12.7% | 18698 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.9% | 62 |
| origin.SleepSiphon 1.7b | 2.0 | 14.0% | 60 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.2 | 13.2% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 27 |
| mld.Wisdom 1.0 | 5.2 | 11.2% | 10 |
| gg.Wolverine 2.0 | 6.0 | 8.4% | 3 |
| spinnercat.Omen 1.0 | 7.3 | 7.8% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 7.0% | 10 |
| DBall.NUKE 0.1 | 8.3 | 6.8% | 3 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.8 | 62.2 | 4 / 35 | 3004 |
| 2 | 4 | 56.7 | 62.5 | 2 / 35 | 3030 |
| 3 | 4 | 57.9 | 64.8 | 8 / 35 | 2914 |
| 4 | 4 | 59.9 | 71.4 | 3 / 35 | 3135 |
| 5 | 4 | 60.3 | 71.1 | 5 / 35 | 3440 |
| 6 | 3 | 59.6 | 69.2 | 5 / 35 | 3175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 29 | 21% |
| jekl.StoneGhost 0.7 | 28 | 43% |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 17% |
| mld.Wisdom 1.0 | 5 | 40% |
| gg.Wolverine 2.0 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 0% |

Hadur died in 183 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 47 | 26% | 54 |
| jekl.StoneGhost 0.7 | 46 | 25% | 56 |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 19% | 40 |
| mld.Wisdom 1.0 | 31 | 17% | 32 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 5% | 10 |
| gg.Wolverine 2.0 | 5 | 3% | 9 |
| spinnercat.Omen 1.0 | 5 | 3% | 5 |
| DBall.NUKE 0.1 | 3 | 2% | 3 |
| sample.Fire 1.0 | 1 | 1% | 1 |

## Melee bench: F07

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.2 | 56 / 210 | 2.60 | 16.7% | 29672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.3 | 18.3% | 72 |
| rtk.Tachikoma 1.0 | 2.0 | 17.3% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 16.7% | 56 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 12.0% | 15 |
| franzor.Lizt 1.3.1 | 4.8 | 11.0% | 21 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.0% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.8 | 80.6 | 8 / 35 | 4882 |
| 2 | 3 | 68.1 | 83.5 | 9 / 35 | 5176 |
| 3 | 2 | 67.3 | 82.9 | 12 / 35 | 4670 |
| 4 | 3 | 66.6 | 79.4 | 11 / 35 | 4848 |
| 5 | 3 | 67.7 | 85.4 | 6 / 35 | 4860 |
| 6 | 2 | 67.7 | 81.6 | 10 / 35 | 5236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 55 | 55% |
| rsalesc.melee.Monk 0.3.6c | 37 | 5% |
| oog.melee.CapuletDroid 1.1 | 26 | 62% |
| franzor.Lizt 1.3.1 | 11 | 55% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 1237. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 67 | 43% | 108 |
| rsalesc.melee.Monk 0.3.6c | 52 | 34% | 53 |
| oog.melee.CapuletDroid 1.1 | 23 | 15% | 39 |
| lrem.micro.MoggFanatic 0.2 | 5 | 3% | 6 |
| franzor.Lizt 1.3.1 | 5 | 3% | 1 |
| exauge.GateKeeper 1.1.121g | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F08

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 70.0 | 45 / 210 | 3.70 | 13.5% | 19181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.5 | 14.2% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.5% | 45 |
| shrub.Vapour v159 | 2.3 | 13.5% | 41 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.4% | 20 |
| com.spp.robocode.MostlyHarmless 010 | 5.7 | 9.9% | 20 |
| m3thos.Eva00 1.1 | 6.3 | 9.2% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.6% | 11 |
| zyx.nano.BacillusComma 1.0 | 8.3 | 7.0% | 1 |
| SHAM.WOW 1.4 | 9.0 | 6.4% | 1 |
| qualidafial.MajorDick 1.0.1 | 9.2 | 6.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 69.8 | 7 / 35 | 3127 |
| 2 | 1 | 63.6 | 81.6 | 12 / 35 | 3415 |
| 3 | 3 | 55.6 | 61.6 | 6 / 35 | 2783 |
| 4 | 2 | 62.1 | 76.5 | 9 / 35 | 3507 |
| 5 | 4 | 56.0 | 61.0 | 5 / 35 | 3156 |
| 6 | 2 | 58.8 | 69.5 | 6 / 35 | 3193 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 28 | 39% |
| shrub.Vapour v159 | 19 | 26% |
| Krabb.sliNk.Garm 0.9u | 13 | 77% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 75% |
| m3thos.Eva00 1.1 | 10 | 50% |
| com.spp.robocode.MostlyHarmless 010 | 7 | 0% |
| SHAM.WOW 1.4 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 38 | 23% | 48 |
| tm.Yuugao 1.0 | 35 | 21% | 50 |
| com.spp.robocode.MostlyHarmless 010 | 23 | 14% | 24 |
| Krabb.sliNk.Garm 0.9u | 21 | 13% | 24 |
| m3thos.Eva00 1.1 | 18 | 11% | 21 |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 10% | 22 |
| zyx.nano.BacillusComma 1.0 | 11 | 7% | 16 |
| qualidafial.MajorDick 1.0.1 | 2 | 1% | 2 |
| SHAM.WOW 1.4 | 1 | 1% | 3 |

## Melee bench: F09

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 61.2 | 16 / 210 | 4.50 | 11.8% | 18137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.3% | 105 |
| kc.micro.Figment 1.0 | 1.8 | 15.5% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 11.8% | 16 |
| yagami.Tidus 0.11 | 4.5 | 10.9% | 4 |
| pedersen.Grishnakh 1.0 | 4.7 | 11.0% | 18 |
| mc2.enemy.Original 0.9 | 5.5 | 9.9% | 17 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 4 |
| step.nanoPri 1.0 | 8.5 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.9 | 61.3 | 3 / 35 | 2922 |
| 2 | 3 | 57.3 | 61.3 | 4 / 35 | 3132 |
| 3 | 3 | 55.7 | 58.7 | 2 / 35 | 3015 |
| 4 | 3 | 56.7 | 61.9 | 3 / 35 | 2943 |
| 5 | 3 | 59.8 | 69.8 | 2 / 35 | 3260 |
| 6 | 4 | 53.9 | 54.0 | 2 / 35 | 2865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 31 | 19% |
| kc.micro.Figment 1.0 | 12 | 8% |
| pedersen.Grishnakh 1.0 | 8 | 63% |
| yagami.Tidus 0.11 | 5 | 60% |
| mc2.enemy.Original 0.9 | 3 | 33% |
| dft.Calliope 5.6 | 2 | 0% |

Hadur died in 194 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 64 | 33% | 70 |
| kc.micro.Figment 1.0 | 44 | 23% | 47 |
| yagami.Tidus 0.11 | 27 | 14% | 31 |
| pedersen.Grishnakh 1.0 | 21 | 11% | 21 |
| mc2.enemy.Original 0.9 | 21 | 11% | 21 |
| step.nanoPri 1.0 | 7 | 4% | 7 |
| dft.Calliope 5.6 | 5 | 3% | 8 |
| robar.nano.Assertive_Melee 0.2 | 4 | 2% | 4 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

## Melee bench: F10

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 78.3 | 61 / 210 | 2.95 | 15.3% | 25001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.5 | 15.9% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 15.3% | 61 |
| ejb.Polaris 1.0.1 | 3.2 | 13.1% | 25 |
| ne.Chimera 1.2 | 3.7 | 12.9% | 22 |
| vStar.RAFzilla 2.15 | 5.3 | 10.6% | 11 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.3% | 18 |
| sam.Samspin 1.0 | 7.7 | 6.4% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 5.9% | 0 |
| kurios.DOSexe .9b | 9.0 | 4.9% | 1 |
| donjezza.Muncho 1.0 | 9.5 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 77.8 | 12 / 35 | 4334 |
| 2 | 2 | 65.7 | 85.4 | 11 / 35 | 4425 |
| 3 | 2 | 61.4 | 72.4 | 9 / 35 | 3884 |
| 4 | 2 | 62.4 | 75.9 | 8 / 35 | 3904 |
| 5 | 1 | 64.6 | 80.3 | 12 / 35 | 4318 |
| 6 | 2 | 63.6 | 78.1 | 9 / 35 | 4136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 45 | 42% |
| ejb.Polaris 1.0.1 | 26 | 69% |
| tvv.micro.Antares 1.1.1 | 15 | 40% |
| ne.Chimera 1.2 | 14 | 43% |
| vStar.RAFzilla 2.15 | 12 | 67% |
| donjezza.Muncho 1.0 | 2 | 50% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 61 | 41% | 80 |
| ne.Chimera 1.2 | 33 | 22% | 40 |
| ejb.Polaris 1.0.1 | 19 | 13% | 39 |
| tvv.micro.Antares 1.1.1 | 16 | 11% | 18 |
| vStar.RAFzilla 2.15 | 8 | 5% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 4% | 7 |
| sam.Samspin 1.0 | 4 | 3% | 4 |
| donjezza.Muncho 1.0 | 1 | 1% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 3 |

## Melee bench: F11

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 60.7 | 23 / 210 | 4.53 | 11.8% | 18101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.2% | 97 |
| cx.mini.Nimrod 0.55 | 2.5 | 13.7% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 11.8% | 23 |
| djc.DynaBot 0.1.1 | 4.0 | 11.4% | 15 |
| br2.MobyDickBot 1.6 | 5.7 | 9.8% | 15 |
| rdt199.Warlord 0.73 | 6.0 | 9.1% | 13 |
| uji.YellohFellah 1.0 | 6.3 | 8.8% | 12 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.7% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 53.0 | 53.3 | 3 / 35 | 2855 |
| 2 | 3 | 59.1 | 65.7 | 5 / 35 | 3369 |
| 3 | 2 | 59.6 | 69.5 | 6 / 35 | 3352 |
| 4 | 3 | 55.5 | 61.0 | 3 / 35 | 2768 |
| 5 | 3 | 52.2 | 55.6 | 2 / 35 | 2439 |
| 6 | 3 | 56.6 | 59.4 | 4 / 35 | 3318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 26 | 23% |
| cx.mini.Nimrod 0.55 | 13 | 54% |
| djc.DynaBot 0.1.1 | 9 | 44% |
| br2.MobyDickBot 1.6 | 5 | 40% |
| rdt199.Warlord 0.73 | 4 | 75% |
| uji.YellohFellah 1.0 | 1 | 0% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 65 | 35% | 69 |
| cx.mini.Nimrod 0.55 | 40 | 21% | 46 |
| rdt199.Warlord 0.73 | 29 | 16% | 32 |
| djc.DynaBot 0.1.1 | 16 | 9% | 20 |
| br2.MobyDickBot 1.6 | 15 | 8% | 16 |
| uji.YellohFellah 1.0 | 12 | 6% | 15 |
| KiraNL.Chupacabra 0.4 | 6 | 3% | 6 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 2 |

## Melee bench: F12

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 65.7 | 30 / 210 | 4.09 | 12.7% | 17990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.5 | 14.9% | 60 |
| nat.PallasHawk 1.0 | 2.3 | 13.9% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.7% | 30 |
| darkcanuck.Leon 1.01 | 3.3 | 13.1% | 34 |
| brainfade.melee.Genghis 0.36 | 4.7 | 11.2% | 19 |
| jrm.Test0 1.0 | 6.2 | 8.6% | 3 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.6% | 2 |
| jp.Perpy 16.0 | 7.8 | 7.2% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.4% | 3 |
| stuff.Vlad 0.1 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.0 | 60.0 | 5 / 35 | 2698 |
| 2 | 3 | 58.9 | 69.2 | 4 / 35 | 2876 |
| 3 | 2 | 59.2 | 68.9 | 6 / 35 | 3057 |
| 4 | 1 | 60.9 | 73.0 | 5 / 35 | 3501 |
| 5 | 4 | 59.0 | 66.0 | 8 / 35 | 3271 |
| 6 | 5 | 53.6 | 56.8 | 2 / 35 | 2587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 31 | 29% |
| bts.wiki.RipCurl 0.9b | 23 | 35% |
| darkcanuck.Leon 1.01 | 17 | 18% |
| brainfade.melee.Genghis 0.36 | 6 | 67% |
| jrm.Test0 1.0 | 4 | 75% |
| jaybot.bots.Oddball 4.0 | 4 | 25% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 45 | 25% | 52 |
| nat.PallasHawk 1.0 | 35 | 19% | 43 |
| darkcanuck.Leon 1.01 | 31 | 17% | 41 |
| brainfade.melee.Genghis 0.36 | 27 | 15% | 27 |
| jaybot.bots.Oddball 4.0 | 12 | 7% | 13 |
| cs.sheldor.Talon 1.1 | 11 | 6% | 13 |
| jp.Perpy 16.0 | 9 | 5% | 9 |
| jrm.Test0 1.0 | 8 | 4% | 9 |
| stuff.Vlad 0.1 | 2 | 1% | 3 |

## Melee bench: F13

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 71.2 | 16 / 210 | 3.60 | 12.8% | 19149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.2 | 17.3% | 67 |
| mn.Combat 3.25.0 | 1.8 | 16.4% | 91 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 16 |
| shinh.Entangled 0.3 | 4.0 | 12.7% | 20 |
| gh.micro.Gruweltje 0.7 | 4.3 | 12.5% | 15 |
| apc.Colossus2 0.17 | 6.3 | 8.1% | 1 |
| stelo.Wang 1.0 | 6.7 | 7.1% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 74.0 | 3 / 35 | 3441 |
| 2 | 3 | 60.6 | 71.7 | 3 / 35 | 3503 |
| 3 | 3 | 59.7 | 73.0 | 2 / 35 | 2907 |
| 4 | 4 | 59.0 | 70.5 | 4 / 35 | 2928 |
| 5 | 4 | 58.5 | 67.6 | 3 / 35 | 2982 |
| 6 | 5 | 59.7 | 70.2 | 1 / 35 | 3388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 40 | 8% |
| mn.Combat 3.25.0 | 32 | 28% |
| shinh.Entangled 0.3 | 12 | 25% |
| gh.micro.Gruweltje 0.7 | 4 | 25% |

Hadur died in 194 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 70 | 36% | 73 |
| mn.Combat 3.25.0 | 51 | 26% | 60 |
| gh.micro.Gruweltje 0.7 | 28 | 14% | 29 |
| shinh.Entangled 0.3 | 27 | 14% | 30 |
| stelo.Wang 1.0 | 10 | 5% | 10 |
| apc.Colossus2 0.17 | 5 | 3% | 5 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F14

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 74.9 | 42 / 210 | 3.26 | 14.2% | 21076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.9% | 96 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.2% | 42 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 37 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 10.4% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 5.2 | 10.2% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 10.1% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 6.3 | 9.6% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 8.1% | 10 |
| pa.Improved 1.0 | 9.0 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 76.5 | 7 / 35 | 3757 |
| 2 | 2 | 59.7 | 70.8 | 6 / 35 | 2882 |
| 3 | 2 | 61.6 | 74.3 | 8 / 35 | 3383 |
| 4 | 2 | 61.4 | 74.0 | 6 / 35 | 3660 |
| 5 | 2 | 63.5 | 79.4 | 8 / 35 | 3722 |
| 6 | 2 | 61.7 | 74.6 | 7 / 35 | 3672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 29% |
| catcat20.shape.Theta 0.018 | 28 | 43% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 40% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 20% |
| sanyi.mikrobi.Roberto 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 50% |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 67% |

Hadur died in 168 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 46% | 93 |
| catcat20.shape.Theta 0.018 | 24 | 14% | 35 |
| dmh.robocode.robot.RedDwarf 0.4 | 18 | 11% | 20 |
| Lo_Ian.Gandalf_V4 4.0 | 18 | 11% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 8% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 7% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 3% | 14 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F15

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 63.5 | 22 / 210 | 4.28 | 12.7% | 22480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 15.1% | 57 |
| emp.Yngwie 1.11 | 2.5 | 13.7% | 63 |
| mld.DustBunny 3.8 | 3.3 | 12.9% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 22 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.6% | 11 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.6% | 28 |
| lambdaxy.TBot 0.1 | 7.5 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.6% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 66.0 | 4 / 35 | 3847 |
| 2 | 5 | 56.9 | 60.6 | 2 / 35 | 3520 |
| 3 | 3 | 58.2 | 61.3 | 5 / 35 | 3701 |
| 4 | 3 | 59.3 | 67.0 | 2 / 35 | 3773 |
| 5 | 3 | 60.6 | 67.6 | 4 / 35 | 4243 |
| 6 | 5 | 56.9 | 58.7 | 5 / 35 | 3396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 17 | 18% |
| emp.Yngwie 1.11 | 14 | 43% |
| cb.nano.Insomnia 1.0 | 11 | 64% |
| mld.DustBunny 3.8 | 8 | 13% |
| kawigi.robot.Girl 1.2 | 7 | 43% |
| divineomega.TrialBot 0.003 | 2 | 50% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 43 | 23% | 52 |
| kawigi.micro.Shiz 1.1 | 43 | 23% | 47 |
| mld.DustBunny 3.8 | 34 | 18% | 39 |
| cb.nano.Insomnia 1.0 | 32 | 17% | 29 |
| kawigi.robot.Girl 1.2 | 15 | 8% | 19 |
| divineomega.TrialBot 0.003 | 8 | 4% | 9 |
| lambdaxy.TBot 0.1 | 6 | 3% | 8 |
| Grystrion.TrackerWO 1.0 | 6 | 3% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |

## Melee bench: F16

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 66.3 | 24 / 210 | 4.03 | 13.4% | 23864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.2 | 17.7% | 99 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 1.8 | 15.2% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.4% | 24 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 11.3% | 50 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.5% | 10 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.5% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.8% | 3 |
| repositorio.NanoStep 1.0 | 8.7 | 5.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.2% | 5 |
| asd.Cthulhu 1.3 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 70.5 | 5 / 35 | 4008 |
| 2 | 3 | 63.0 | 72.4 | 6 / 35 | 4318 |
| 3 | 3 | 60.3 | 65.7 | 3 / 35 | 4338 |
| 4 | 3 | 57.7 | 60.3 | 3 / 35 | 3619 |
| 5 | 3 | 59.0 | 62.9 | 4 / 35 | 3751 |
| 6 | 3 | 59.8 | 66.3 | 3 / 35 | 3830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 41 | 10% |
| techdude.forest.FlamingForest 1.1 | 9 | 11% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 8 | 63% |
| tvv.nano.Polaris 1.2 | 5 | 60% |
| stelo.IntrinsicVolatility 1.4 | 5 | 80% |
| bvh.fnr.Fenrir 0.36l | 4 | 75% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 1182. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 80 | 43% | 84 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 36 | 19% | 40 |
| bvh.fnr.Fenrir 0.36l | 23 | 12% | 27 |
| techdude.forest.FlamingForest 1.1 | 16 | 9% | 18 |
| stelo.IntrinsicVolatility 1.4 | 10 | 5% | 13 |
| tvv.nano.Polaris 1.2 | 10 | 5% | 11 |
| divineomega.DivineBot 1.9.4.5 | 7 | 4% | 12 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |

## Melee bench: F17

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 67.0 | 33 / 210 | 3.97 | 13.5% | 23605 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.7 | 14.3% | 42 |
| oog.melee.Mercutio 1.0 | 2.3 | 13.9% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.5% | 33 |
| cx.BlestPain 1.41 | 3.8 | 12.7% | 34 |
| nic.Nicator 2.4 | 5.0 | 11.6% | 21 |
| ahf.NanoAndrew .4 | 5.5 | 11.3% | 26 |
| maribo.melee.BMV 0.1 | 7.0 | 8.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 70.5 | 7 / 35 | 4423 |
| 2 | 2 | 61.2 | 68.9 | 5 / 35 | 4147 |
| 3 | 2 | 61.9 | 71.4 | 5 / 35 | 4216 |
| 4 | 4 | 58.2 | 62.2 | 7 / 35 | 3528 |
| 5 | 3 | 57.7 | 62.2 | 4 / 35 | 3393 |
| 6 | 3 | 60.1 | 67.0 | 5 / 35 | 3898 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 23 | 13% |
| oog.melee.Mercutio 1.0 | 23 | 48% |
| cx.BlestPain 1.41 | 13 | 69% |
| ahf.NanoAndrew .4 | 11 | 36% |
| nic.Nicator 2.4 | 10 | 50% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 39 | 22% | 44 |
| ahf.NanoAndrew .4 | 38 | 21% | 44 |
| oog.melee.Mercutio 1.0 | 26 | 15% | 35 |
| cx.BlestPain 1.41 | 25 | 14% | 33 |
| nic.Nicator 2.4 | 22 | 12% | 26 |
| maribo.melee.BMV 0.1 | 17 | 10% | 17 |
| tex.Longbot 0.4 | 5 | 3% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 2% | 3 |
| goblin.Bender 2.4 | 2 | 1% | 3 |

## Melee bench: F18

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 64.8 | 36 / 210 | 4.17 | 12.8% | 20091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.8 | 14.0% | 54 |
| agd.Mooserwirt2 2.7 | 2.3 | 12.8% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 12.8% | 36 |
| uji.DBH 1.1 | 4.0 | 11.5% | 21 |
| spinnercat.Robovirus 2.718 | 5.2 | 10.8% | 14 |
| ratosh.Nobo 0.21 | 5.7 | 10.6% | 5 |
| sigterm.Sigterm 1.0 | 6.5 | 9.2% | 18 |
| kawigi.mini.Fhqwhgads 1.1 | 8.5 | 7.5% | 8 |
| stelo.WangRobot 1.0 | 8.5 | 6.3% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.4 | 61.0 | 5 / 35 | 3245 |
| 2 | 2 | 58.6 | 65.1 | 4 / 35 | 3552 |
| 3 | 1 | 61.2 | 73.7 | 12 / 35 | 3457 |
| 4 | 4 | 57.1 | 61.9 | 6 / 35 | 3169 |
| 5 | 3 | 56.7 | 61.9 | 5 / 35 | 3102 |
| 6 | 2 | 58.5 | 65.4 | 4 / 35 | 3566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 20 | 45% |
| agd.Mooserwirt2 2.7 | 19 | 11% |
| uji.DBH 1.1 | 13 | 62% |
| sigterm.Sigterm 1.0 | 10 | 50% |
| spinnercat.Robovirus 2.718 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 25% |
| ratosh.Nobo 0.21 | 4 | 75% |
| stelo.WangRobot 1.0 | 3 | 33% |

Hadur died in 175 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 43 | 25% | 57 |
| agd.Mooserwirt2 2.7 | 41 | 23% | 43 |
| uji.DBH 1.1 | 29 | 17% | 32 |
| ratosh.Nobo 0.21 | 17 | 10% | 21 |
| spinnercat.Robovirus 2.718 | 15 | 9% | 19 |
| sigterm.Sigterm 1.0 | 12 | 7% | 17 |
| stelo.WangRobot 1.0 | 8 | 5% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 4% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 2% | 4 |

## Melee bench: F19

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.0 | 53 / 210 | 2.53 | 16.4% | 25823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.5 | 16.4% | 53 |
| mld.Infinity 2.2 | 2.0 | 16.1% | 71 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 15.9% | 59 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.3% | 7 |
| erdnis.Rover 0.3 | 5.0 | 10.6% | 9 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.9% | 6 |
| mbh.Mbh 0.1 | 7.3 | 7.1% | 0 |
| pac.ABC 2.1 | 7.7 | 6.7% | 6 |
| pbg.R2D2 1.0 | 9.0 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 84.1 | 9 / 35 | 4353 |
| 2 | 2 | 66.5 | 83.8 | 7 / 35 | 4574 |
| 3 | 1 | 66.9 | 83.2 | 13 / 35 | 4410 |
| 4 | 1 | 66.3 | 84.4 | 9 / 35 | 4261 |
| 5 | 1 | 66.0 | 83.8 | 8 / 35 | 4171 |
| 6 | 3 | 64.6 | 78.7 | 7 / 35 | 4054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 68 | 49% |
| davidalves.net.DuelistMiniMelee 1.2 | 45 | 9% |
| krillr.mini.JointStrike 2.0.0 | 13 | 62% |
| pac.ABC 2.1 | 6 | 33% |
| erdnis.Rover 0.3 | 5 | 20% |
| patson.PatsonTestBot 1.0 | 3 | 67% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 1167. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 65 | 41% | 115 |
| mld.Infinity 2.2 | 43 | 27% | 16 |
| krillr.mini.JointStrike 2.0.0 | 14 | 9% | 23 |
| erdnis.Rover 0.3 | 14 | 9% | 17 |
| pac.ABC 2.1 | 7 | 4% | 8 |
| patson.PatsonTestBot 1.0 | 6 | 4% | 13 |
| pbg.R2D2 1.0 | 6 | 4% | 11 |
| mbh.Mbh 0.1 | 2 | 1% | 3 |

## Melee bench: F20

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.4 | 48 / 210 | 3.85 | 13.7% | 21735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.2 | 17.8% | 88 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 13.7% | 48 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.3% | 17 |
| fwb.Nine 1.0.1 | 4.2 | 11.3% | 13 |
| catcat20.Rabbit 0.001 | 4.3 | 10.8% | 27 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 8.7% | 4 |
| bayen.nut.Squirrel 1.615 | 7.0 | 8.2% | 7 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 8.6% | 6 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 65.1 | 6 / 35 | 3501 |
| 2 | 2 | 59.6 | 67.0 | 7 / 35 | 3555 |
| 3 | 1 | 64.7 | 79.7 | 11 / 35 | 4328 |
| 4 | 2 | 58.4 | 63.8 | 8 / 35 | 3452 |
| 5 | 2 | 59.7 | 67.3 | 7 / 35 | 3350 |
| 6 | 2 | 59.9 | 67.3 | 9 / 35 | 3549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 39 | 46% |
| catcat20.Rabbit 0.001 | 12 | 42% |
| fwb.Nine 1.0.1 | 9 | 100% |
| nz.jdc.nano.GridFu 1.0 | 8 | 50% |
| m3thos.mini.Eva01 0.5.5 | 6 | 67% |
| djdjdj.NanoSkunk10 1.0 | 5 | 80% |
| bayen.nut.Squirrel 1.615 | 4 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 78 | 48% | 87 |
| nz.jdc.nano.GridFu 1.0 | 23 | 14% | 26 |
| fwb.Nine 1.0.1 | 20 | 12% | 27 |
| catcat20.Rabbit 0.001 | 16 | 10% | 25 |
| bayen.nut.Squirrel 1.615 | 8 | 5% | 10 |
| m3thos.mini.Eva01 0.5.5 | 7 | 4% | 15 |
| djdjdj.NanoSkunk10 1.0 | 7 | 4% | 14 |
| ntc.ControlledChaos 1.1.4 | 3 | 2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 1 |

## Melee bench: F21

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.0 | 76 / 210 | 2.62 | 16.9% | 27542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.5 | 17.7% | 94 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.7 | 16.9% | 76 |
| dummy.mini.Scimitar 1.01 | 2.8 | 14.3% | 15 |
| cf.RiO.RiOx 4.2.1 | 4.2 | 12.1% | 12 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.6% | 2 |
| eld.Hmm 1.0 | 5.7 | 8.4% | 11 |
| fire219.CatBot 1.0 | 6.8 | 6.5% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 1 |
| PSW.Relentless 0.1 | 8.8 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 79.7 | 10 / 35 | 4454 |
| 2 | 1 | 66.4 | 81.9 | 13 / 35 | 4626 |
| 3 | 1 | 68.0 | 87.3 | 17 / 35 | 4538 |
| 4 | 2 | 65.5 | 78.4 | 10 / 35 | 4635 |
| 5 | 2 | 67.5 | 85.4 | 14 / 35 | 4917 |
| 6 | 2 | 65.0 | 79.4 | 12 / 35 | 4372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 87 | 48% |
| dummy.mini.Scimitar 1.01 | 31 | 87% |
| cf.RiO.RiOx 4.2.1 | 11 | 55% |
| eld.Hmm 1.0 | 4 | 25% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 134 of 210 rounds, at a mean tick of 1135. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 59 | 44% | 86 |
| dummy.mini.Scimitar 1.01 | 38 | 28% | 66 |
| cf.RiO.RiOx 4.2.1 | 20 | 15% | 31 |
| eld.Hmm 1.0 | 6 | 4% | 13 |
| el.JumpShoot 0.2 | 5 | 4% | 5 |
| oa.weak.BotherBot 0.1 | 2 | 1% | 4 |
| arthord.MannyPacquiao Beta | 2 | 1% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |

## Melee bench: F23

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.5 | 55 / 210 | 2.75 | 15.9% | 24613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.5% | 87 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 15.9% | 55 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 32 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.7% | 15 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.5% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 9.0% | 1 |
| cw.megas.Blade 0.8 | 7.0 | 8.3% | 1 |
| sample.Walls 1.0 | 7.3 | 8.3% | 10 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 78.4 | 7 / 35 | 4476 |
| 2 | 2 | 64.4 | 78.4 | 5 / 35 | 4162 |
| 3 | 2 | 66.2 | 81.0 | 12 / 35 | 3885 |
| 4 | 2 | 65.0 | 77.8 | 8 / 35 | 4315 |
| 5 | 2 | 65.6 | 82.5 | 12 / 35 | 3420 |
| 6 | 2 | 66.3 | 85.1 | 11 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 62 | 45% |
| cre.Karolos 0.32 | 22 | 41% |
| stelo.AreaTargetingBot 1.1 | 16 | 63% |
| sample.Walls 1.0 | 12 | 42% |
| stelo.RamTrackSurfer 1.2 | 2 | 50% |
| cw.megas.Blade 0.8 | 2 | 50% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 69 | 45% | 97 |
| cre.Karolos 0.32 | 37 | 24% | 45 |
| stelo.AreaTargetingBot 1.1 | 18 | 12% | 23 |
| sample.Walls 1.0 | 11 | 7% | 14 |
| stelo.RamTrackSurfer 1.2 | 9 | 6% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 5% | 9 |
| cw.megas.Blade 0.8 | 3 | 2% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.8 | 61.0 | 30 / 210 | 4.51 | 11.7% | 16797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 1.7 | 14.4% | 52 |
| rz.GlowBlowMelee 1.4 | 1.8 | 14.4% | 47 |
| davidalves.Phoenix 0.54 | 3.3 | 13.0% | 45 |
| pedersen.Ugluk 1.1.1 | 3.7 | 12.7% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 11.7% | 30 |
| oog.melee.Corsair 1.0 | 6.3 | 8.9% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.5% | 7 |
| lunchie.Lunchbox 0.93 | 8.3 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.3% | 1 |
| evd.X1 0.01 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.2 | 54.3 | 4 / 35 | 2278 |
| 2 | 5 | 57.1 | 64.1 | 3 / 35 | 2992 |
| 3 | 5 | 53.7 | 55.6 | 3 / 35 | 2768 |
| 4 | 2 | 61.0 | 73.0 | 11 / 35 | 3155 |
| 5 | 5 | 53.3 | 55.6 | 4 / 35 | 2589 |
| 6 | 5 | 56.7 | 63.2 | 5 / 35 | 3015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 19 | 37% |
| florent.XSeries.X2 0.12 | 13 | 46% |
| pedersen.Ugluk 1.1.1 | 12 | 58% |
| davidalves.Phoenix 0.54 | 9 | 56% |
| stelo.SoJNanoMelee 1.1 | 5 | 40% |
| oog.melee.Corsair 1.0 | 4 | 75% |

Hadur died in 180 of 210 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 45 | 25% | 54 |
| florent.XSeries.X2 0.12 | 32 | 18% | 38 |
| davidalves.Phoenix 0.54 | 32 | 18% | 37 |
| pedersen.Ugluk 1.1.1 | 32 | 18% | 36 |
| stelo.SoJNanoMelee 1.1 | 13 | 7% | 13 |
| oog.melee.Corsair 1.0 | 10 | 6% | 14 |
| lunchie.Lunchbox 0.93 | 6 | 3% | 7 |
| evd.X1 0.01 | 6 | 3% | 7 |
| as.FrankTheTank 1.3 | 4 | 2% | 4 |

## Melee bench: F25

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 68.7 | 31 / 210 | 3.82 | 13.2% | 18044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.8 | 14.1% | 49 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.4% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.2% | 31 |
| jdw.Hurricane 1.4 | 3.8 | 12.1% | 30 |
| gre.svman4.Morfeas 1.4.1 | 4.7 | 10.6% | 24 |
| ds.Oo 2.2 | 6.0 | 9.2% | 16 |
| gjr.Cephalosporin 0.1 | 7.2 | 8.6% | 7 |
| adt.Ar2 1.1 | 8.2 | 7.1% | 4 |
| awesomeness.Elite 1.0 | 8.5 | 7.0% | 6 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 63.8 | 3 / 35 | 2824 |
| 2 | 2 | 59.0 | 68.9 | 4 / 35 | 2942 |
| 3 | 2 | 59.6 | 72.4 | 4 / 35 | 2922 |
| 4 | 2 | 59.6 | 68.3 | 9 / 35 | 3010 |
| 5 | 5 | 53.7 | 56.5 | 1 / 35 | 2936 |
| 6 | 1 | 63.9 | 82.2 | 10 / 35 | 3410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 28 | 21% |
| voidious.micro.BlitzBat 1.05 | 21 | 10% |
| jdw.Hurricane 1.4 | 16 | 63% |
| gre.svman4.Morfeas 1.4.1 | 11 | 64% |
| ds.Oo 2.2 | 10 | 20% |
| awesomeness.Elite 1.0 | 3 | 67% |
| gjr.Cephalosporin 0.1 | 2 | 50% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 55 | 31% | 62 |
| voidious.micro.BlitzBat 1.05 | 41 | 23% | 45 |
| jdw.Hurricane 1.4 | 27 | 15% | 36 |
| ds.Oo 2.2 | 20 | 11% | 22 |
| gre.svman4.Morfeas 1.4.1 | 17 | 9% | 22 |
| adt.Ar2 1.1 | 9 | 5% | 11 |
| awesomeness.Elite 1.0 | 5 | 3% | 6 |
| gjr.Cephalosporin 0.1 | 3 | 2% | 3 |
| amk.ChumbaMini 0.2 | 2 | 1% | 3 |

## Melee bench: F26

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.1 | 22 / 210 | 3.87 | 13.2% | 23333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 17.2% | 94 |
| shu.nitro.LENIN .T34 | 2.8 | 13.0% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 22 |
| lrem.Spectre 0.4.4 | 3.7 | 12.7% | 28 |
| js.PinBall 1.6 | 5.2 | 11.3% | 10 |
| gh.mini.GrubbmOne 1.0 | 5.3 | 10.3% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 8.7% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.9% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.3 | 67.3 | 6 / 35 | 3881 |
| 2 | 2 | 60.8 | 70.2 | 5 / 35 | 3803 |
| 3 | 3 | 59.2 | 64.8 | 4 / 35 | 3771 |
| 4 | 2 | 62.7 | 74.0 | 6 / 35 | 4136 |
| 5 | 3 | 59.9 | 67.3 | 1 / 35 | 4001 |
| 6 | 4 | 58.2 | 65.1 | 0 / 35 | 3741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 30 | 10% |
| shu.nitro.LENIN .T34 | 23 | 30% |
| lrem.Spectre 0.4.4 | 19 | 47% |
| js.PinBall 1.6 | 6 | 50% |
| sample.SpinBot 1.0 | 1 | 0% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 0% |

Hadur died in 188 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 69 | 37% | 72 |
| shu.nitro.LENIN .T34 | 36 | 19% | 44 |
| lrem.Spectre 0.4.4 | 23 | 12% | 29 |
| js.PinBall 1.6 | 16 | 9% | 20 |
| jaybot.adv.bots.JayBot 2.0 | 16 | 9% | 17 |
| gh.mini.GrubbmOne 1.0 | 16 | 9% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 3% | 6 |
| sample.SpinBot 1.0 | 6 | 3% | 6 |

## Melee bench: F27

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 69.5 | 46 / 210 | 3.75 | 13.3% | 18193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.0 | 16.2% | 93 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.3% | 46 |
| wee.Gem 1.8.4 | 3.8 | 11.6% | 28 |
| EH.Eagle 1.0.6 | 4.2 | 11.2% | 11 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 11.3% | 23 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 9.3% | 6 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.5% | 2 |
| joe.ADinosaur 1.0 | 7.5 | 7.7% | 1 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.3% | 3 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 73.0 | 10 / 35 | 3334 |
| 2 | 3 | 59.7 | 70.2 | 9 / 35 | 3128 |
| 3 | 3 | 57.5 | 66.0 | 6 / 35 | 2879 |
| 4 | 3 | 59.2 | 69.2 | 7 / 35 | 2921 |
| 5 | 2 | 59.0 | 68.9 | 7 / 35 | 3084 |
| 6 | 2 | 58.7 | 69.5 | 7 / 35 | 2847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 45 | 42% |
| wee.Gem 1.8.4 | 15 | 40% |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 43% |
| EH.Eagle 1.0.6 | 9 | 89% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 63% |
| joe.ADinosaur 1.0 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |
| throxbot.ThroxBot 0.1 | 1 | 0% |

Hadur died in 166 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 64 | 39% | 84 |
| wee.Gem 1.8.4 | 20 | 12% | 27 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 11% | 21 |
| throxbot.ThroxBot 0.1 | 16 | 10% | 16 |
| joe.ADinosaur 1.0 | 14 | 8% | 15 |
| EH.Eagle 1.0.6 | 11 | 7% | 24 |
| caimano.Furia_Ceca 0.22 | 9 | 5% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 8 | 5% | 11 |
| cs.Grudge 1.0 | 3 | 2% | 3 |
2 death(s) with no robot to name.

## Melee bench: F28

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 77.1 | 66 / 210 | 3.06 | 15.3% | 21270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.2% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.7 | 15.3% | 66 |
| uji.Antique 1.0 | 3.2 | 12.2% | 35 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 11.1% | 17 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.5% | 6 |
| ahr.ice.Ice 1.0.2 | 6.2 | 9.0% | 10 |
| amk.ChumbaWumba 0.3 | 7.0 | 8.1% | 3 |
| matt.advanced.Katana 1.0 | 8.3 | 6.4% | 3 |
| stelo.PianistNano 1.2 | 9.2 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 80.6 | 14 / 35 | 3841 |
| 2 | 1 | 64.2 | 79.7 | 14 / 35 | 3684 |
| 3 | 2 | 61.5 | 74.0 | 6 / 35 | 3413 |
| 4 | 2 | 62.7 | 77.1 | 11 / 35 | 3202 |
| 5 | 2 | 62.2 | 74.6 | 10 / 35 | 3740 |
| 6 | 2 | 62.5 | 76.5 | 11 / 35 | 3390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 69 | 55% |
| uji.Antique 1.0 | 23 | 61% |
| qohnil.blot.BlotBot 3.61 | 10 | 50% |
| ahr.ice.Ice 1.0.2 | 6 | 67% |
| pfvicm.Sobieski 7.2.3b | 2 | 100% |
| matt.advanced.Katana 1.0 | 2 | 50% |
| amk.ChumbaWumba 0.3 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 58 | 40% | 85 |
| uji.Antique 1.0 | 20 | 14% | 34 |
| pfvicm.Sobieski 7.2.3b | 17 | 12% | 22 |
| amk.ChumbaWumba 0.3 | 16 | 11% | 16 |
| qohnil.blot.BlotBot 3.61 | 15 | 10% | 22 |
| ahr.ice.Ice 1.0.2 | 9 | 6% | 15 |
| stelo.PianistNano 1.2 | 4 | 3% | 4 |
| stelo.Lifestealer 1.0 | 3 | 2% | 5 |
| matt.advanced.Katana 1.0 | 2 | 1% | 7 |

## Melee bench: F29

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 65.7 | 29 / 210 | 4.09 | 13.2% | 20440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.2 | 16.6% | 69 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 15.1% | 59 |
| myl.micro.Troodon 1.10 | 3.7 | 12.9% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 13.2% | 29 |
| jok.PheonixM 0.1.2 | 4.7 | 11.7% | 15 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.1% | 1 |
| DBall.Anarchy 0.1 | 6.7 | 7.8% | 17 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.5% | 2 |
| jangs.ns51 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.7 | 62.5 | 6 / 35 | 3608 |
| 2 | 3 | 63.8 | 75.2 | 10 / 35 | 3576 |
| 3 | 5 | 56.9 | 59.7 | 2 / 35 | 3163 |
| 4 | 3 | 60.0 | 67.9 | 3 / 35 | 3368 |
| 5 | 4 | 57.2 | 60.3 | 3 / 35 | 3145 |
| 6 | 3 | 61.2 | 68.6 | 5 / 35 | 3580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 33 | 27% |
| zyx.mega.YersiniaPestis 3.1 | 19 | 53% |
| myl.micro.Troodon 1.10 | 13 | 54% |
| jok.PheonixM 0.1.2 | 6 | 50% |
| DBall.Anarchy 0.1 | 2 | 0% |
| ap.Frederick 1.1 | 1 | 0% |

Hadur died in 182 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 70 | 38% | 79 |
| myl.micro.Troodon 1.10 | 35 | 19% | 41 |
| zyx.mega.YersiniaPestis 3.1 | 34 | 19% | 46 |
| jok.PheonixM 0.1.2 | 24 | 13% | 25 |
| ph.melee.ArcherME 0.3 | 7 | 4% | 7 |
| DBall.Anarchy 0.1 | 5 | 3% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 3% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F30

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 56.8 | 21 / 210 | 4.89 | 10.8% | 16455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.0 | 14.2% | 49 |
| darkcanuck.B26354 1.06 | 2.5 | 13.7% | 43 |
| oog.melee.Capulet 1.2 | 2.7 | 13.7% | 48 |
| stelo.PastFuture 2.3.2 | 2.8 | 13.6% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 5.0 | 10.8% | 21 |
| intruder.PrairieWolf 2.61 | 6.5 | 9.1% | 3 |
| ntc.Opposite 1.5 | 7.0 | 7.9% | 1 |
| tripphippy.Alice 1.1 | 7.8 | 7.4% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 8.7 | 7.0% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.8 | 60.6 | 5 / 35 | 2690 |
| 2 | 5 | 54.7 | 56.8 | 3 / 35 | 2905 |
| 3 | 5 | 54.6 | 56.5 | 4 / 35 | 2814 |
| 4 | 5 | 52.9 | 53.7 | 3 / 35 | 2587 |
| 5 | 5 | 55.0 | 57.5 | 4 / 35 | 2759 |
| 6 | 5 | 53.3 | 55.9 | 2 / 35 | 2700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 17 | 59% |
| oog.melee.Capulet 1.2 | 10 | 0% |
| darkcanuck.B26354 1.06 | 10 | 40% |
| stelo.PastFuture 2.3.2 | 7 | 57% |
| intruder.PrairieWolf 2.61 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 44 | 23% | 49 |
| oog.melee.Capulet 1.2 | 39 | 21% | 40 |
| darkcanuck.B26354 1.06 | 34 | 18% | 39 |
| catcat20.Matcha 0.006 | 33 | 17% | 43 |
| ntc.Opposite 1.5 | 17 | 9% | 17 |
| intruder.PrairieWolf 2.61 | 11 | 6% | 11 |
| tripphippy.Alice 1.1 | 7 | 4% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 2% | 4 |

## Melee bench: F31

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.6 | 56.9 | 12 / 210 | 4.88 | 10.9% | 16480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.8% | 101 |
| gh.mini.Griezel 0.2 | 2.3 | 14.0% | 54 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 12.4% | 20 |
| d414.nano.Quantum 1.0.0 | 3.7 | 12.2% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.8 | 10.9% | 12 |
| gh.nano.Grofvuil 0.2 | 6.2 | 9.2% | 4 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.0% | 2 |
| fm.mammillarias 1.3 | 8.0 | 6.7% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.0 | 56.8 | 1 / 35 | 2899 |
| 2 | 5 | 54.1 | 56.8 | 3 / 35 | 2691 |
| 3 | 4 | 57.0 | 61.9 | 4 / 35 | 2883 |
| 4 | 5 | 54.9 | 57.1 | 0 / 35 | 2783 |
| 5 | 5 | 55.4 | 59.0 | 3 / 35 | 2725 |
| 6 | 5 | 51.2 | 49.8 | 1 / 35 | 2499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 26 | 4% |
| abc.Shadow 3.84i | 15 | 33% |
| d414.nano.Quantum 1.0.0 | 8 | 38% |
| spinnercat.micro.Tyger 0.1 | 3 | 0% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 198 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 51 | 26% | 52 |
| abc.Shadow 3.84i | 42 | 21% | 48 |
| spinnercat.micro.Tyger 0.1 | 36 | 18% | 37 |
| d414.nano.Quantum 1.0.0 | 30 | 15% | 32 |
| fm.mammillarias 1.3 | 14 | 7% | 14 |
| gh.nano.Grofvuil 0.2 | 12 | 6% | 14 |
| timmit.nano.TimDog 0.33 | 10 | 5% | 10 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 71.0 | 52 / 210 | 3.61 | 13.9% | 20885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.7 | 14.8% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 13.9% | 52 |
| lxx.ConceptA 0.8 | 3.2 | 11.9% | 8 |
| apc.botM 3.0 | 3.2 | 12.5% | 37 |
| vjik.UnViolation 1.1 | 4.8 | 10.7% | 20 |
| bayen.UbaMicro 1.4 | 6.2 | 9.3% | 10 |
| panzer.Panzer 0.2 | 7.0 | 7.8% | 2 |
| yk.JahMicro 1.0 | 8.2 | 6.9% | 8 |
| conscience.Electron 1.3g | 9.3 | 6.4% | 2 |
| donjezza.Jezza 1.0 | 9.3 | 5.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 80.0 | 11 / 35 | 3905 |
| 2 | 4 | 57.8 | 63.2 | 6 / 35 | 3457 |
| 3 | 1 | 62.9 | 77.8 | 14 / 35 | 3682 |
| 4 | 2 | 59.9 | 72.4 | 4 / 35 | 3521 |
| 5 | 1 | 59.4 | 71.4 | 10 / 35 | 3185 |
| 6 | 4 | 56.3 | 61.0 | 7 / 35 | 3135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 36 | 39% |
| apc.botM 3.0 | 18 | 50% |
| vjik.UnViolation 1.1 | 12 | 58% |
| lxx.ConceptA 0.8 | 9 | 89% |
| bayen.UbaMicro 1.4 | 7 | 71% |
| yk.JahMicro 1.0 | 7 | 29% |
| donjezza.Jezza 1.0 | 5 | 80% |
| panzer.Panzer 0.2 | 4 | 75% |
| conscience.Electron 1.3g | 2 | 0% |

Hadur died in 158 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 30% | 62 |
| lxx.ConceptA 0.8 | 32 | 20% | 36 |
| apc.botM 3.0 | 21 | 13% | 33 |
| bayen.UbaMicro 1.4 | 18 | 11% | 21 |
| vjik.UnViolation 1.1 | 12 | 8% | 22 |
| panzer.Panzer 0.2 | 10 | 6% | 13 |
| conscience.Electron 1.3g | 8 | 5% | 11 |
| yk.JahMicro 1.0 | 7 | 4% | 7 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |

## Melee bench: F33

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 65.9 | 18 / 210 | 4.07 | 12.8% | 19912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.0% | 86 |
| hadur117.nano.Sanaro 0.1 | 2.7 | 13.0% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 18 |
| labg.Cataclysm 2.05 | 4.0 | 11.5% | 37 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.3% | 21 |
| baal.nano.N 1.42 | 6.5 | 8.7% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.8% | 10 |
| zyx.micro.Ant 1.1 | 8.2 | 6.0% | 2 |
| sanja.First 0.1 | 9.3 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.6 | 60.3 | 4 / 35 | 2970 |
| 2 | 3 | 56.8 | 61.9 | 2 / 35 | 2941 |
| 3 | 5 | 54.2 | 55.6 | 1 / 35 | 3016 |
| 4 | 3 | 57.1 | 62.5 | 2 / 35 | 3126 |
| 5 | 2 | 61.8 | 74.0 | 3 / 35 | 3627 |
| 6 | 2 | 64.7 | 81.0 | 6 / 35 | 4232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 39 | 18% |
| hadur117.nano.Sanaro 0.1 | 15 | 27% |
| labg.Cataclysm 2.05 | 10 | 10% |
| gre.svman4.Leonidas 1.3.2 | 8 | 13% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 40% |
| zyx.micro.Ant 1.1 | 2 | 50% |
| baal.nano.N 1.42 | 2 | 50% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 67 | 35% | 73 |
| labg.Cataclysm 2.05 | 30 | 16% | 31 |
| gre.svman4.Leonidas 1.3.2 | 29 | 15% | 28 |
| hadur117.nano.Sanaro 0.1 | 27 | 14% | 32 |
| kinsen.melee.Angsaichmophobia 1.8c | 16 | 8% | 20 |
| baal.nano.N 1.42 | 11 | 6% | 12 |
| zyx.micro.Ant 1.1 | 6 | 3% | 7 |
| sanja.First 0.1 | 3 | 2% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 2% | 3 |

## Melee bench: F34

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 71.6 | 34 / 210 | 3.56 | 14.1% | 23662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.3 | 17.3% | 74 |
| kid.Gladiator .7.2 | 1.7 | 17.3% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.1% | 34 |
| tcf.Reach 3 | 4.5 | 11.4% | 8 |
| jcs.Seth 1.8 | 4.8 | 10.9% | 14 |
| cli.Dancer 1.1 | 5.7 | 9.7% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 74.6 | 5 / 35 | 4246 |
| 2 | 3 | 62.9 | 74.9 | 4 / 35 | 4047 |
| 3 | 3 | 60.6 | 66.0 | 5 / 35 | 3802 |
| 4 | 3 | 63.9 | 74.6 | 9 / 35 | 3943 |
| 5 | 3 | 59.9 | 66.3 | 4 / 35 | 3657 |
| 6 | 3 | 63.0 | 73.0 | 7 / 35 | 3967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 47 | 55% |
| kid.Gladiator .7.2 | 26 | 4% |
| jcs.Seth 1.8 | 9 | 56% |
| ratosh.Wesco 1.4 | 2 | 100% |
| tcf.Reach 3 | 2 | 0% |

Hadur died in 177 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 80 | 45% | 81 |
| stelo.Spread 0.9 | 50 | 28% | 73 |
| jcs.Seth 1.8 | 17 | 10% | 22 |
| tcf.Reach 3 | 16 | 9% | 17 |
| ratosh.Wesco 1.4 | 8 | 5% | 10 |
| cli.Dancer 1.1 | 4 | 2% | 5 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |

## Melee bench: F35

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 69.1 | 8 / 210 | 3.78 | 12.6% | 16868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.8% | 171 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.3% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.6% | 8 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.2% | 5 |
| rz.HawkOnFire 0.1 | 4.3 | 11.5% | 6 |
| wit.Chuliath 1.0 | 6.5 | 7.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.6% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.3 | 68.6 | 1 / 35 | 2959 |
| 2 | 4 | 58.6 | 67.9 | 2 / 35 | 2696 |
| 3 | 4 | 59.1 | 69.2 | 2 / 35 | 2753 |
| 4 | 2 | 59.2 | 70.8 | 0 / 35 | 2856 |
| 5 | 3 | 59.9 | 70.8 | 2 / 35 | 3028 |
| 6 | 3 | 57.7 | 67.3 | 1 / 35 | 2576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 48 | 2% |
| gh.mini.Gruwel 0.9 | 12 | 8% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 50% |

Hadur died in 202 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 92 | 46% | 92 |
| gh.mini.Gruwel 0.9 | 41 | 20% | 42 |
| rz.HawkOnFire 0.1 | 30 | 15% | 36 |
| dmh.robocode.robot.BlackDeath 9.2 | 30 | 15% | 31 |
| myl.nano.KomoriNinja 1.1 | 5 | 2% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 0% | 1 |

## Melee bench: F36

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 72.2 | 70 / 210 | 3.50 | 14.8% | 21845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.3 | 14.8% | 70 |
| alpha.RainingFire 1.0 | 2.0 | 13.5% | 42 |
| bzdp.Pansy 2.1 | 3.2 | 12.0% | 25 |
| mz.Cork 0.1 | 4.2 | 11.0% | 14 |
| bvh.micro.Freya 0.3 | 5.3 | 10.6% | 12 |
| m3thos.Eva02 0.7.1 | 5.5 | 10.4% | 23 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.8% | 7 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.8% | 2 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 7 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.4% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 68.9 | 11 / 35 | 3683 |
| 2 | 2 | 58.3 | 64.1 | 9 / 35 | 3232 |
| 3 | 1 | 64.9 | 82.2 | 14 / 35 | 3823 |
| 4 | 1 | 62.3 | 71.7 | 12 / 35 | 3793 |
| 5 | 2 | 62.1 | 73.3 | 11 / 35 | 3696 |
| 6 | 1 | 61.9 | 72.7 | 13 / 35 | 3618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 24 | 63% |
| bvh.micro.Freya 0.3 | 22 | 73% |
| mz.Cork 0.1 | 16 | 75% |
| bvh.mini.Fenrir 0.39 | 15 | 80% |
| alpha.RainingFire 1.0 | 14 | 50% |
| m3thos.Eva02 0.7.1 | 12 | 42% |
| sample.MyFirstRobot 1.0 | 6 | 17% |
| dl.BetterWalls 1.0 | 2 | 50% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |

Hadur died in 141 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 40 | 28% | 47 |
| bzdp.Pansy 2.1 | 27 | 19% | 46 |
| m3thos.Eva02 0.7.1 | 19 | 13% | 27 |
| bvh.micro.Freya 0.3 | 14 | 10% | 21 |
| mz.Cork 0.1 | 11 | 8% | 22 |
| bvh.mini.Fenrir 0.39 | 11 | 8% | 19 |
| dl.BetterWalls 1.0 | 8 | 6% | 14 |
| sample.MyFirstRobot 1.0 | 7 | 5% | 9 |
| squidM.TentalceMeleeNano 1.1 | 4 | 3% | 5 |

## Melee bench: F37

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 76.3 | 65 / 210 | 3.13 | 15.2% | 26376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.0 | 15.2% | 65 |
| germ.TheMind .2 | 2.7 | 11.4% | 27 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.8 | 10.6% | 18 |
| EBBU.Sim2 1.02 | 4.8 | 9.9% | 14 |
| mb.Beast 0.1 | 5.2 | 9.7% | 23 |
| lmk.ACPFinal 0.1 | 6.0 | 9.3% | 17 |
| agrach.Dalek 1.0 | 6.3 | 9.1% | 16 |
| stelo.UntouchableNano 1.3 | 8.2 | 8.4% | 15 |
| skm.Ryubot 1.0 | 8.3 | 8.4% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 8.7 | 8.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 72.4 | 11 / 35 | 4373 |
| 2 | 1 | 64.3 | 82.2 | 14 / 35 | 4680 |
| 3 | 1 | 61.3 | 77.8 | 6 / 35 | 4285 |
| 4 | 1 | 61.2 | 71.4 | 13 / 35 | 4404 |
| 5 | 1 | 62.5 | 79.4 | 10 / 35 | 4478 |
| 6 | 1 | 61.0 | 74.9 | 11 / 35 | 4156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 59% |
| germ.TheMind .2 | 20 | 40% |
| agrach.Dalek 1.0 | 17 | 71% |
| stelo.UntouchableNano 1.3 | 16 | 69% |
| mb.Beast 0.1 | 13 | 62% |
| EBBU.Sim2 1.02 | 13 | 31% |
| lmk.ACPFinal 0.1 | 10 | 40% |
| skm.Ryubot 1.0 | 9 | 33% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 29 | 19% | 39 |
| lmk.ACPFinal 0.1 | 24 | 16% | 26 |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 13% | 33 |
| EBBU.Sim2 1.02 | 19 | 13% | 23 |
| agrach.Dalek 1.0 | 15 | 10% | 28 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 8% | 14 |
| mb.Beast 0.1 | 11 | 7% | 18 |
| skm.Ryubot 1.0 | 11 | 7% | 11 |
| stelo.UntouchableNano 1.3 | 8 | 5% | 18 |

## Melee bench: F38

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.2 | 62.3 | 17 / 210 | 4.39 | 11.7% | 17910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.0% | 100 |
| bvh.mini.Freya 0.55 | 2.5 | 13.3% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 11.7% | 17 |
| cs.Wren 1.0 | 4.2 | 11.5% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 11.0% | 15 |
| bts.mega.Gnarly 1.4 | 4.8 | 11.0% | 23 |
| kdf.KoulDestroyer 1.0 | 7.0 | 9.0% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.5 | 5.8% | 2 |
| matt.UnderDark3 2.4.34 | 8.8 | 5.0% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.8 | 59.0 | 1 / 35 | 2766 |
| 2 | 4 | 54.2 | 57.5 | 3 / 35 | 2742 |
| 3 | 5 | 56.4 | 61.3 | 5 / 35 | 2733 |
| 4 | 3 | 57.3 | 61.6 | 4 / 35 | 3343 |
| 5 | 5 | 56.0 | 63.5 | 2 / 35 | 2759 |
| 6 | 2 | 59.6 | 71.1 | 2 / 35 | 3567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 33 | 12% |
| bvh.mini.Freya 0.55 | 8 | 50% |
| cs.Wren 1.0 | 8 | 63% |
| bts.mega.Gnarly 1.4 | 8 | 25% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 0% |
| kdf.KoulDestroyer 1.0 | 3 | 33% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 54 | 28% | 59 |
| bvh.mini.Freya 0.55 | 32 | 16% | 32 |
| cs.Wren 1.0 | 30 | 15% | 33 |
| bts.mega.Gnarly 1.4 | 24 | 12% | 25 |
| kdf.KoulDestroyer 1.0 | 21 | 11% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 9% | 20 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 4% | 8 |
| bzdp.BoxCar 2.0 | 7 | 4% | 7 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 3 |

## Melee bench: F39

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 64.6 | 33 / 210 | 4.19 | 12.4% | 19628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 15.4% | 42 |
| az.Ololobot 0.2.4 | 2.0 | 13.9% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.4% | 33 |
| catcat20.Lambda 0.024 | 3.8 | 11.5% | 30 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.7% | 22 |
| gimp.GimpBot 0.1 | 6.5 | 8.7% | 6 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.2% | 3 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 8.2% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 6.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 68.3 | 4 / 35 | 3397 |
| 2 | 3 | 60.2 | 69.2 | 8 / 35 | 3785 |
| 3 | 4 | 55.0 | 61.0 | 5 / 35 | 2799 |
| 4 | 3 | 58.8 | 68.6 | 7 / 35 | 3395 |
| 5 | 3 | 56.8 | 64.4 | 5 / 35 | 3187 |
| 6 | 4 | 53.6 | 55.9 | 4 / 35 | 3065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 26 | 54% |
| az.Ololobot 0.2.4 | 23 | 13% |
| catcat20.Lambda 0.024 | 14 | 57% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 67% |
| apollokidd.ApolloKidd 0.9 | 2 | 0% |
| gimp.GimpBot 0.1 | 1 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 68 | 38% | 77 |
| az.Ololobot 0.2.4 | 39 | 22% | 42 |
| stelo.SoRobotNanoMelee 1.2 | 23 | 13% | 24 |
| catcat20.Lambda 0.024 | 16 | 9% | 25 |
| apollokidd.ApolloKidd 0.9 | 11 | 6% | 12 |
| winamp32.micro.MicroMacro 1.0 | 8 | 4% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 6 | 3% | 6 |
| gimp.GimpBot 0.1 | 5 | 3% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 4 | 2% | 6 |

## Melee bench: F41

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 68.7 | 32 / 210 | 3.82 | 13.2% | 18958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.3% | 99 |
| lessonz.robocode.Oz 0.5.0 | 2.8 | 12.9% | 30 |
| ary.Swarm 1.1 | 3.2 | 12.7% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 13.2% | 32 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 12.1% | 17 |
| shrub.Silver v048 | 6.0 | 8.7% | 4 |
| zyx.nano.Ant 1.1 | 7.2 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 5 |
| stelo.Mirror 1.1 | 8.7 | 6.0% | 3 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 66.0 | 3 / 35 | 3074 |
| 2 | 4 | 59.3 | 68.6 | 5 / 35 | 2838 |
| 3 | 4 | 59.3 | 66.3 | 5 / 35 | 3166 |
| 4 | 2 | 64.0 | 82.9 | 10 / 35 | 3206 |
| 5 | 3 | 59.7 | 68.3 | 4 / 35 | 3397 |
| 6 | 4 | 57.4 | 60.0 | 5 / 35 | 3277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 46 | 24% |
| lessonz.robocode.Oz 0.5.0 | 17 | 41% |
| ary.Swarm 1.1 | 11 | 73% |
| simonton.nano.MeleeSeed 1.8 | 8 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 67 | 38% | 80 |
| ary.Swarm 1.1 | 40 | 22% | 49 |
| lessonz.robocode.Oz 0.5.0 | 29 | 16% | 32 |
| simonton.nano.MeleeSeed 1.8 | 21 | 12% | 24 |
| shrub.Silver v048 | 7 | 4% | 8 |
| zyx.nano.Ant 1.1 | 7 | 4% | 7 |
| jsal.Jsalbot 1.0 | 5 | 3% | 6 |
| stelo.Mirror 1.1 | 2 | 1% | 4 |

## Melee bench: F42

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 69.0 | 26 / 210 | 3.79 | 13.3% | 21316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.9% | 109 |
| ara.Shera 0.88 | 2.7 | 14.3% | 34 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 14.1% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.3% | 26 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 2 |
| dsw.StaticD 1.0 | 6.5 | 7.2% | 5 |
| maribo.IotaCT 1.1 | 6.5 | 7.3% | 1 |
| stelo.MirrorMicro 1.0 | 8.7 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 72.7 | 5 / 35 | 3914 |
| 2 | 4 | 58.0 | 64.8 | 2 / 35 | 3495 |
| 3 | 4 | 58.7 | 66.7 | 2 / 35 | 3225 |
| 4 | 4 | 59.1 | 70.2 | 2 / 35 | 3282 |
| 5 | 4 | 59.6 | 66.7 | 6 / 35 | 3543 |
| 6 | 2 | 61.9 | 73.0 | 9 / 35 | 3857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 47 | 26% |
| ara.Shera 0.88 | 16 | 38% |
| maribo.mini.MiniQuester 0.1 | 11 | 36% |
| dsw.StaticD 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 65 | 35% | 75 |
| ara.Shera 0.88 | 48 | 26% | 55 |
| maribo.mini.MiniQuester 0.1 | 38 | 21% | 43 |
| amz.NanoClone 1.41 | 14 | 8% | 15 |
| maribo.IotaCT 1.1 | 8 | 4% | 8 |
| dsw.StaticD 1.0 | 4 | 2% | 7 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |

## Melee bench: F43

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 61.5 | 10 / 210 | 4.46 | 11.7% | 18119 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 165 |
| brainfade.melee.Dusk 0.44 | 2.3 | 13.1% | 20 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.7% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.0 | 11.7% | 9 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 11.7% | 10 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.9% | 2 |
| mz.NanoGod 2.02 | 7.2 | 7.8% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.2 | 59.7 | 1 / 35 | 2742 |
| 2 | 3 | 59.5 | 64.8 | 1 / 35 | 3236 |
| 3 | 5 | 57.2 | 58.7 | 1 / 35 | 2866 |
| 4 | 3 | 59.8 | 64.4 | 4 / 35 | 3207 |
| 5 | 3 | 59.8 | 65.1 | 2 / 35 | 3224 |
| 6 | 5 | 56.2 | 56.5 | 1 / 35 | 2844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 41 | 7% |
| dummy.micro.Sparrow 2.5 | 4 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 33% |
| brainfade.melee.Dusk 0.44 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 200 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 93 | 47% | 95 |
| wcsv.melee.EngineerMelee 0.1 | 29 | 15% | 30 |
| dummy.micro.Sparrow 2.5 | 23 | 12% | 27 |
| brainfade.melee.Dusk 0.44 | 22 | 11% | 25 |
| mz.NanoGod 2.02 | 14 | 7% | 14 |
| Krabb.akim2.Akim2 1.1b | 10 | 5% | 10 |
| jab.DiamondStealer 5 | 7 | 4% | 7 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 70.3 | 38 / 210 | 3.67 | 14.0% | 22398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 17.0% | 92 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.0% | 38 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.9% | 52 |
| wompi.Quokka 1.6 | 4.3 | 10.8% | 9 |
| jwirde.Gort 2.0 | 4.8 | 10.3% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.2 | 8.8% | 1 |
| disan.Chair 2.2.0 | 6.7 | 8.2% | 2 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.8% | 2 |
| sample.Crazy 1.0 | 9.5 | 4.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 71.1 | 6 / 35 | 3877 |
| 2 | 1 | 64.4 | 80.3 | 9 / 35 | 4166 |
| 3 | 2 | 62.0 | 72.4 | 7 / 35 | 4041 |
| 4 | 3 | 57.8 | 63.2 | 3 / 35 | 3217 |
| 5 | 3 | 61.0 | 68.3 | 6 / 35 | 3800 |
| 6 | 3 | 59.4 | 66.7 | 7 / 35 | 3297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 45 | 47% |
| tzu.TheArtOfWar 1.2 | 24 | 25% |
| jwirde.Gort 2.0 | 7 | 29% |
| wompi.Quokka 1.6 | 6 | 50% |
| disan.Chair 2.2.0 | 5 | 80% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 58 | 34% | 79 |
| tzu.TheArtOfWar 1.2 | 50 | 29% | 56 |
| jwirde.Gort 2.0 | 15 | 9% | 22 |
| wompi.Quokka 1.6 | 14 | 8% | 17 |
| disan.Chair 2.2.0 | 10 | 6% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 6% | 10 |
| stf.PanzerGeneral 0.1 | 8 | 5% | 8 |
| amk.jointstrike.JointStrike 0.2 | 5 | 3% | 5 |
| sample.Crazy 1.0 | 2 | 1% | 2 |

## Melee bench: F45

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 67.3 | 26 / 210 | 3.94 | 13.7% | 22267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.5 | 13.7% | 26 |
| eem.IWillFireNoBullet v2.8 | 1.7 | 12.9% | 114 |
| jje.BagPuss 1.2 | 3.0 | 12.1% | 14 |
| myl.nano.Graviton 1.10 | 4.2 | 11.2% | 12 |
| sul.Lunar 1.1 | 4.8 | 11.0% | 24 |
| hvilela.HVilela 0.9 | 6.2 | 9.8% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.8% | 3 |
| fm.claire 1.7 | 7.5 | 8.5% | 0 |
| wit.Deep7 2.0 | 8.8 | 7.0% | 12 |
| abud.ThirdRobo 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.9 | 64.4 | 4 / 35 | 3452 |
| 2 | 2 | 57.8 | 63.8 | 3 / 35 | 3460 |
| 3 | 1 | 60.3 | 70.2 | 5 / 35 | 3631 |
| 4 | 1 | 59.7 | 67.9 | 3 / 35 | 3915 |
| 5 | 1 | 57.6 | 62.2 | 5 / 35 | 3751 |
| 6 | 1 | 62.8 | 75.2 | 6 / 35 | 4058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 48 | 19% |
| jje.BagPuss 1.2 | 13 | 46% |
| sul.Lunar 1.1 | 7 | 29% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 83% |
| myl.nano.Graviton 1.10 | 6 | 0% |
| wit.Deep7 2.0 | 4 | 25% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 1240. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 44 | 24% | 0 |
| jje.BagPuss 1.2 | 36 | 20% | 55 |
| sul.Lunar 1.1 | 24 | 13% | 38 |
| hvilela.HVilela 0.9 | 24 | 13% | 27 |
| myl.nano.Graviton 1.10 | 19 | 10% | 36 |
| pez.mini.ChironexFleckeri 0.5 | 15 | 8% | 18 |
| wit.Deep7 2.0 | 10 | 5% | 16 |
| fm.claire 1.7 | 9 | 5% | 13 |
| abud.ThirdRobo 1.0 | 3 | 2% | 6 |

## Melee bench: F46

sheldor.melee.nano.NaturalScience 1.2.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 69.2 | 12 / 210 | 3.77 | 12.5% | 17826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 18.3% | 87 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.4% | 91 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.5% | 12 |
| mz.MicroSheep 1.0 | 4.3 | 10.8% | 4 |
| cx.Princess 1.0 | 4.7 | 10.6% | 13 |
| sadoner.killer 0.2 | 6.2 | 8.8% | 1 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.8% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 71.4 | 4 / 35 | 3367 |
| 2 | 3 | 60.3 | 73.0 | 1 / 35 | 3063 |
| 3 | 3 | 56.3 | 65.4 | 1 / 35 | 2529 |
| 4 | 3 | 60.7 | 75.6 | 3 / 35 | 2886 |
| 5 | 3 | 57.5 | 66.0 | 2 / 35 | 2720 |
| 6 | 3 | 57.8 | 63.8 | 1 / 35 | 3261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 48 | 10% |
| rsalesc.melee.Medina 0.4.5 | 26 | 19% |
| cx.Princess 1.0 | 3 | 67% |
| mz.MicroSheep 1.0 | 1 | 0% |
| sadoner.killer 0.2 | 1 | 0% |

Hadur died in 198 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 85 | 43% | 92 |
| rsalesc.melee.Medina 0.4.5 | 60 | 30% | 62 |
| mz.MicroSheep 1.0 | 16 | 8% | 17 |
| sadoner.killer 0.2 | 12 | 6% | 13 |
| cx.Princess 1.0 | 11 | 6% | 11 |
| arthord.NanoSatanMelee Beta | 9 | 5% | 9 |
| jeremyreeder.collective.Prophet 5 | 4 | 2% | 5 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

