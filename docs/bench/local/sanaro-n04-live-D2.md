# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 73.4 | 38 / 350 | 3.39 | 13.7% | 37174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 21.0% | 260 |
| hadur117.nano.SanaroD2 0.1 | 2.2 | 13.7% | 38 |
| sgp.JollyNinja 3.53 | 3.3 | 11.9% | 31 |
| mz.MicroGodMelee 1 | 4.0 | 11.6% | 10 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.0 | 10.7% | 3 |
| lorneswork.Predator 1.0 | 5.5 | 9.8% | 7 |
| adt.Ar2 1.0 | 7.1 | 7.3% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.9% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 69.2 | 1 / 35 | 3637 |
| 2 | 2 | 60.6 | 71.4 | 2 / 35 | 3638 |
| 3 | 2 | 61.4 | 71.7 | 3 / 35 | 3870 |
| 4 | 2 | 62.1 | 77.1 | 4 / 35 | 3407 |
| 5 | 2 | 62.8 | 79.4 | 4 / 35 | 3845 |
| 6 | 2 | 62.3 | 75.2 | 4 / 35 | 4058 |
| 7 | 2 | 61.2 | 73.3 | 4 / 35 | 3669 |
| 8 | 2 | 62.1 | 75.6 | 6 / 35 | 3701 |
| 9 | 3 | 60.1 | 67.9 | 5 / 35 | 3621 |
| 10 | 2 | 61.4 | 73.0 | 5 / 35 | 3728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 118 | 5% |
| sgp.JollyNinja 3.53 | 23 | 70% |
| mz.MicroGodMelee 1 | 13 | 85% |
| lorneswork.Predator 1.0 | 5 | 20% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 75% |
| adt.Ar2 1.0 | 2 | 50% |

Hadur died in 312 of 350 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 159 | 51% | 165 |
| sgp.JollyNinja 3.53 | 46 | 15% | 57 |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 9% | 31 |
| mz.MicroGodMelee 1 | 28 | 9% | 38 |
| lorneswork.Predator 1.0 | 28 | 9% | 32 |
| adt.Ar2 1.0 | 14 | 4% | 15 |
| skm.butterfly 1.0 | 5 | 2% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 3 |

## Melee bench: F02

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 59.2 | 42 / 350 | 4.67 | 12.5% | 40411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.4 | 15.2% | 114 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.8 | 14.9% | 87 |
| hadur117.nano.SanaroD2 0.1 | 3.1 | 12.5% | 42 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.2% | 10 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.2% | 40 |
| Noran.BitchingElk 0.054 | 6.7 | 8.4% | 28 |
| sch.Simone 0.3d | 6.8 | 8.4% | 19 |
| stelo.PatternRobot 1.0 | 8.1 | 7.1% | 10 |
| fnc.bandit.Bandit 5.2.0 | 8.2 | 7.4% | 1 |
| fullsail.SweetTea 1.1 | 9.9 | 4.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 63.8 | 5 / 35 | 4320 |
| 2 | 3 | 58.9 | 60.3 | 6 / 35 | 4102 |
| 3 | 3 | 58.7 | 64.1 | 5 / 35 | 3876 |
| 4 | 3 | 58.2 | 60.6 | 3 / 35 | 3876 |
| 5 | 4 | 55.3 | 54.3 | 2 / 35 | 3824 |
| 6 | 2 | 60.6 | 65.4 | 8 / 35 | 4084 |
| 7 | 3 | 56.1 | 55.6 | 5 / 35 | 3901 |
| 8 | 2 | 57.7 | 60.6 | 2 / 35 | 4191 |
| 9 | 4 | 54.7 | 50.8 | 3 / 35 | 4064 |
| 10 | 4 | 56.6 | 56.8 | 3 / 35 | 4173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 41% |
| pulsar.PulsarMax 0.8.9 | 29 | 31% |
| sch.Simone 0.3d | 9 | 78% |
| stelo.PatternRobot 1.0 | 5 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 40% |
| Noran.BitchingElk 0.054 | 3 | 33% |
| com.cohesiva.robocode.ManOwaR 1.0 | 3 | 33% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |
| fullsail.SweetTea 1.1 | 1 | 0% |

Hadur died in 309 of 350 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 84 | 27% | 93 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 81 | 26% | 99 |
| lrem.micro.SpikeSoldier 0.4 | 36 | 12% | 39 |
| com.cohesiva.robocode.ManOwaR 1.0 | 28 | 9% | 29 |
| sch.Simone 0.3d | 22 | 7% | 29 |
| fnc.bandit.Bandit 5.2.0 | 19 | 6% | 20 |
| stelo.PatternRobot 1.0 | 18 | 6% | 19 |
| Noran.BitchingElk 0.054 | 10 | 3% | 12 |
| fullsail.SweetTea 1.1 | 10 | 3% | 10 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 75.5 | 63 / 350 | 3.20 | 14.4% | 40783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.5 | 15.0% | 103 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.7% | 92 |
| hadur117.nano.SanaroD2 0.1 | 2.6 | 14.4% | 63 |
| vuen.Cake 2.51 | 3.8 | 13.2% | 70 |
| urdos.URDOS 1.3 | 4.9 | 10.6% | 13 |
| adt.Ar1 2.1 | 6.2 | 8.2% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 7.4 | 7.0% | 3 |
| oa.weak.FlyMk1 0.1 | 7.4 | 6.9% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 73.0 | 6 / 35 | 3905 |
| 2 | 3 | 61.5 | 73.7 | 4 / 35 | 4371 |
| 3 | 3 | 60.9 | 75.9 | 7 / 35 | 3517 |
| 4 | 3 | 61.4 | 75.6 | 6 / 35 | 3976 |
| 5 | 2 | 61.6 | 76.2 | 5 / 35 | 4131 |
| 6 | 3 | 61.0 | 71.7 | 7 / 35 | 4136 |
| 7 | 1 | 65.1 | 86.0 | 11 / 35 | 4205 |
| 8 | 1 | 62.6 | 74.6 | 6 / 35 | 4583 |
| 9 | 3 | 62.2 | 77.1 | 8 / 35 | 3984 |
| 10 | 4 | 59.8 | 71.4 | 3 / 35 | 3975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 53 | 47% |
| kawigi.nano.Lib 1.0 | 49 | 20% |
| radnor.DoctorBob 1.42 | 47 | 38% |
| urdos.URDOS 1.3 | 7 | 57% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 75% |
| adt.Ar1 2.1 | 3 | 67% |
| oa.weak.FlyMk1 0.1 | 2 | 50% |

Hadur died in 288 of 350 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 103 | 36% | 115 |
| radnor.DoctorBob 1.42 | 66 | 23% | 81 |
| vuen.Cake 2.51 | 51 | 18% | 75 |
| urdos.URDOS 1.3 | 34 | 12% | 38 |
| adt.Ar1 2.1 | 12 | 4% | 12 |
| oa.weak.FlyMk1 0.1 | 10 | 3% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 2% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 5 | 2% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% | 2 |

## Melee bench: F04

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 62.2 | 2 / 350 | 4.41 | 12.1% | 39086 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.2% | 327 |
| apc.LeeroyJenkins2 1.0 | 2.0 | 13.9% | 11 |
| hadur117.nano.SanaroD2 0.1 | 3.2 | 12.1% | 2 |
| TNT.TNT 0.99.1 | 3.8 | 11.2% | 3 |
| josago.Jorgito 0.16 | 5.1 | 8.9% | 3 |
| tj.zombie1n 1.0.1 | 6.4 | 7.5% | 0 |
| css.Delitioner 0.11 | 6.5 | 7.7% | 1 |
| rampancy.Durandal 2.1d | 8.1 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.7% | 0 |
| spin.Bugstard 0.012b | 9.9 | 3.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.9 | 62.9 | 1 / 35 | 3793 |
| 2 | 3 | 60.3 | 67.3 | 0 / 35 | 4065 |
| 3 | 3 | 59.5 | 64.1 | 1 / 35 | 4020 |
| 4 | 3 | 58.7 | 61.0 | 0 / 35 | 4118 |
| 5 | 4 | 57.1 | 59.0 | 0 / 35 | 3526 |
| 6 | 3 | 60.8 | 66.0 | 0 / 35 | 4380 |
| 7 | 3 | 57.0 | 59.0 | 0 / 35 | 3605 |
| 8 | 3 | 60.3 | 65.4 | 0 / 35 | 4154 |
| 9 | 3 | 56.9 | 57.1 | 0 / 35 | 3857 |
| 10 | 4 | 57.4 | 59.7 | 0 / 35 | 3568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 83 | 1% |
| apc.LeeroyJenkins2 1.0 | 2 | 50% |
| josago.Jorgito 0.16 | 2 | 0% |

Hadur died in 348 of 350 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 189 | 54% | 189 |
| apc.LeeroyJenkins2 1.0 | 65 | 19% | 67 |
| josago.Jorgito 0.16 | 36 | 10% | 36 |
| TNT.TNT 0.99.1 | 28 | 8% | 28 |
| tj.zombie1n 1.0.1 | 12 | 3% | 12 |
| rampancy.Durandal 2.1d | 10 | 3% | 10 |
| css.Delitioner 0.11 | 8 | 2% | 8 |

## Melee bench: F06

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 63.3 | 45 / 350 | 4.30 | 12.2% | 31518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.9% | 93 |
| origin.SleepSiphon 1.7b | 1.9 | 14.5% | 118 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.4% | 51 |
| hadur117.nano.SanaroD2 0.1 | 3.9 | 12.2% | 45 |
| mld.Wisdom 1.0 | 4.3 | 11.7% | 24 |
| gg.Wolverine 2.0 | 6.7 | 8.5% | 5 |
| DBall.NUKE 0.1 | 7.4 | 7.4% | 2 |
| spinnercat.Omen 1.0 | 7.9 | 7.2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.8% | 10 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.2 | 55.9 | 3 / 35 | 2950 |
| 2 | 4 | 58.7 | 66.3 | 4 / 35 | 3184 |
| 3 | 4 | 56.8 | 62.9 | 5 / 35 | 2943 |
| 4 | 4 | 57.7 | 62.2 | 7 / 35 | 3247 |
| 5 | 5 | 57.1 | 60.3 | 6 / 35 | 3224 |
| 6 | 3 | 57.4 | 63.5 | 6 / 35 | 3170 |
| 7 | 4 | 57.7 | 63.5 | 4 / 35 | 3086 |
| 8 | 4 | 57.4 | 63.2 | 3 / 35 | 3313 |
| 9 | 3 | 58.8 | 66.3 | 4 / 35 | 3197 |
| 10 | 3 | 59.0 | 69.2 | 3 / 35 | 3204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 40 | 55% |
| origin.SleepSiphon 1.7b | 25 | 36% |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 33% |
| mld.Wisdom 1.0 | 7 | 29% |
| gg.Wolverine 2.0 | 6 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 25% |
| DBall.NUKE 0.1 | 2 | 50% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 89 | 29% | 99 |
| origin.SleepSiphon 1.7b | 68 | 22% | 82 |
| pe.minimelee.SandboxMiniMelee 1.1 | 50 | 16% | 55 |
| mld.Wisdom 1.0 | 46 | 15% | 50 |
| spinnercat.Omen 1.0 | 17 | 6% | 19 |
| gg.Wolverine 2.0 | 14 | 5% | 17 |
| DBall.NUKE 0.1 | 10 | 3% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 3% | 10 |
| sample.Fire 1.0 | 3 | 1% | 3 |

## Melee bench: F07

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 77.8 | 80 / 350 | 3.00 | 15.9% | 49092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.1 | 18.5% | 123 |
| rtk.Tachikoma 1.0 | 2.0 | 17.5% | 94 |
| hadur117.nano.SanaroD2 0.1 | 2.9 | 15.9% | 80 |
| oog.melee.CapuletDroid 1.1 | 4.1 | 12.1% | 28 |
| franzor.Lizt 1.3.1 | 4.9 | 10.9% | 27 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.4 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.6 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 85.1 | 12 / 35 | 4837 |
| 2 | 3 | 65.2 | 74.0 | 6 / 35 | 4721 |
| 3 | 3 | 66.1 | 77.1 | 8 / 35 | 4931 |
| 4 | 3 | 66.0 | 74.6 | 9 / 35 | 5013 |
| 5 | 3 | 67.0 | 81.9 | 8 / 35 | 5088 |
| 6 | 3 | 63.8 | 70.2 | 7 / 35 | 4668 |
| 7 | 3 | 66.4 | 78.7 | 7 / 35 | 4840 |
| 8 | 3 | 67.3 | 80.3 | 8 / 35 | 5309 |
| 9 | 3 | 65.0 | 76.2 | 7 / 35 | 4547 |
| 10 | 3 | 67.1 | 80.0 | 8 / 35 | 5138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 86 | 64% |
| rsalesc.melee.Monk 0.3.6c | 46 | 7% |
| oog.melee.CapuletDroid 1.1 | 28 | 64% |
| franzor.Lizt 1.3.1 | 6 | 50% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 272 of 350 rounds, at a mean tick of 1128. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 115 | 42% | 121 |
| rtk.Tachikoma 1.0 | 104 | 38% | 164 |
| oog.melee.CapuletDroid 1.1 | 26 | 10% | 40 |
| exauge.GateKeeper 1.1.121g | 11 | 4% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6 | 2% | 6 |
| franzor.Lizt 1.3.1 | 6 | 2% | 3 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 65.6 | 57 / 350 | 4.09 | 12.6% | 30410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| shrub.Vapour v159 | 1.6 | 13.8% | 76 |
| tm.Yuugao 1.0 | 1.8 | 13.9% | 118 |
| hadur117.nano.SanaroD2 0.1 | 2.9 | 12.6% | 57 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 11.4% | 39 |
| m3thos.Eva00 1.1 | 5.9 | 9.2% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 6.1 | 9.4% | 22 |
| jwst.DAD.DarkAndDarker 1.1 | 6.4 | 8.6% | 14 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 7.2% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 7.0% | 5 |
| SHAM.WOW 1.4 | 9.3 | 6.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.4 | 75.6 | 6 / 35 | 3608 |
| 2 | 3 | 56.8 | 66.0 | 5 / 35 | 2948 |
| 3 | 3 | 55.8 | 61.9 | 6 / 35 | 3001 |
| 4 | 2 | 58.2 | 68.6 | 5 / 35 | 3252 |
| 5 | 4 | 55.5 | 60.0 | 5 / 35 | 2947 |
| 6 | 4 | 51.7 | 54.6 | 4 / 35 | 2410 |
| 7 | 4 | 56.9 | 64.1 | 6 / 35 | 2995 |
| 8 | 3 | 57.8 | 66.3 | 8 / 35 | 3183 |
| 9 | 2 | 59.4 | 70.2 | 7 / 35 | 3351 |
| 10 | 3 | 57.5 | 68.9 | 5 / 35 | 2715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 37 | 24% |
| shrub.Vapour v159 | 22 | 32% |
| Krabb.sliNk.Garm 0.9u | 21 | 76% |
| com.spp.robocode.MostlyHarmless 010 | 10 | 70% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 78% |
| m3thos.Eva00 1.1 | 7 | 57% |
| qualidafial.MajorDick 1.0.1 | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 4 | 75% |
| SHAM.WOW 1.4 | 2 | 50% |

Hadur died in 294 of 350 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 64 | 22% | 73 |
| tm.Yuugao 1.0 | 60 | 20% | 70 |
| Krabb.sliNk.Garm 0.9u | 48 | 16% | 59 |
| jwst.DAD.DarkAndDarker 1.1 | 29 | 10% | 37 |
| com.spp.robocode.MostlyHarmless 010 | 27 | 9% | 35 |
| m3thos.Eva00 1.1 | 27 | 9% | 32 |
| zyx.nano.BacillusComma 1.0 | 21 | 7% | 23 |
| qualidafial.MajorDick 1.0.1 | 14 | 5% | 15 |
| SHAM.WOW 1.4 | 3 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.8 | 53.6 | 12 / 350 | 5.17 | 10.5% | 28852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 18.4% | 199 |
| kc.micro.Figment 1.0 | 1.9 | 15.6% | 76 |
| yagami.Tidus 0.11 | 3.8 | 11.3% | 3 |
| pedersen.Grishnakh 1.0 | 4.0 | 11.3% | 35 |
| hadur117.nano.SanaroD2 0.1 | 4.9 | 10.5% | 12 |
| mc2.enemy.Original 0.9 | 5.3 | 9.8% | 21 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 4 |
| step.nanoPri 1.0 | 8.1 | 6.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.6 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 51.6 | 47.9 | 1 / 35 | 2670 |
| 2 | 6 | 52.7 | 50.8 | 0 / 35 | 2770 |
| 3 | 5 | 54.0 | 52.4 | 2 / 35 | 2781 |
| 4 | 5 | 54.3 | 56.2 | 2 / 35 | 2700 |
| 5 | 5 | 54.3 | 53.3 | 1 / 35 | 3102 |
| 6 | 5 | 55.1 | 56.5 | 2 / 35 | 3014 |
| 7 | 3 | 56.3 | 59.7 | 1 / 35 | 3204 |
| 8 | 3 | 56.6 | 61.6 | 0 / 35 | 2958 |
| 9 | 6 | 48.6 | 42.5 | 0 / 35 | 2619 |
| 10 | 5 | 55.0 | 55.2 | 3 / 35 | 3034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 22 | 18% |
| kc.micro.Figment 1.0 | 10 | 20% |
| mc2.enemy.Original 0.9 | 4 | 50% |
| yagami.Tidus 0.11 | 3 | 67% |
| dft.Calliope 5.6 | 2 | 50% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 338 of 350 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 104 | 31% | 107 |
| kc.micro.Figment 1.0 | 69 | 20% | 71 |
| pedersen.Grishnakh 1.0 | 45 | 13% | 45 |
| yagami.Tidus 0.11 | 41 | 12% | 44 |
| mc2.enemy.Original 0.9 | 40 | 12% | 42 |
| step.nanoPri 1.0 | 14 | 4% | 15 |
| dft.Calliope 5.6 | 13 | 4% | 14 |
| robar.nano.Assertive_Melee 0.2 | 9 | 3% | 9 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |

## Melee bench: F10

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 79.6 | 123 / 350 | 2.84 | 16.0% | 44440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroD2 0.1 | 1.1 | 16.0% | 123 |
| DTF.Kludgy 1.2b | 2.2 | 14.6% | 73 |
| ejb.Polaris 1.0.1 | 3.4 | 13.3% | 46 |
| ne.Chimera 1.2 | 3.5 | 13.2% | 41 |
| vStar.RAFzilla 2.15 | 5.2 | 11.1% | 35 |
| tvv.micro.Antares 1.1.1 | 5.6 | 10.1% | 23 |
| sam.Samspin 1.0 | 7.8 | 6.2% | 3 |
| kurios.DOSexe .9b | 7.9 | 5.6% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.6% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 77.1 | 7 / 35 | 4384 |
| 2 | 1 | 67.0 | 87.3 | 18 / 35 | 4555 |
| 3 | 1 | 66.0 | 83.5 | 13 / 35 | 4710 |
| 4 | 1 | 65.8 | 81.0 | 15 / 35 | 4667 |
| 5 | 1 | 62.2 | 73.3 | 10 / 35 | 4187 |
| 6 | 1 | 64.7 | 77.8 | 13 / 35 | 4705 |
| 7 | 1 | 63.4 | 74.6 | 12 / 35 | 4166 |
| 8 | 2 | 62.3 | 75.2 | 8 / 35 | 4115 |
| 9 | 1 | 65.4 | 83.8 | 13 / 35 | 4325 |
| 10 | 1 | 65.7 | 81.9 | 14 / 35 | 4626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 49 | 84% |
| vStar.RAFzilla 2.15 | 41 | 63% |
| DTF.Kludgy 1.2b | 40 | 53% |
| ne.Chimera 1.2 | 25 | 60% |
| tvv.micro.Antares 1.1.1 | 20 | 50% |
| donjezza.Muncho 1.0 | 5 | 40% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 3 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 229 of 350 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 58 | 25% | 76 |
| ne.Chimera 1.2 | 55 | 24% | 69 |
| tvv.micro.Antares 1.1.1 | 36 | 16% | 44 |
| ejb.Polaris 1.0.1 | 34 | 15% | 79 |
| vStar.RAFzilla 2.15 | 25 | 11% | 49 |
| sam.Samspin 1.0 | 10 | 4% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 2% | 5 |
| kurios.DOSexe .9b | 3 | 1% | 11 |
| donjezza.Muncho 1.0 | 3 | 1% | 5 |

## Melee bench: F11

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.6 | 59.6 | 32 / 350 | 4.64 | 11.5% | 30160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.6% | 159 |
| cx.mini.Nimrod 0.55 | 2.0 | 13.4% | 48 |
| hadur117.nano.SanaroD2 0.1 | 3.5 | 11.5% | 32 |
| djc.DynaBot 0.1.1 | 4.1 | 10.9% | 23 |
| br2.MobyDickBot 1.6 | 5.7 | 9.9% | 39 |
| uji.YellohFellah 1.0 | 5.7 | 9.7% | 31 |
| rdt199.Warlord 0.73 | 6.1 | 9.3% | 17 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.4% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.4% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.7 | 55.6 | 5 / 35 | 3039 |
| 2 | 3 | 56.6 | 61.0 | 5 / 35 | 3185 |
| 3 | 3 | 56.1 | 61.0 | 1 / 35 | 3348 |
| 4 | 3 | 56.9 | 64.8 | 2 / 35 | 2778 |
| 5 | 3 | 56.1 | 59.4 | 2 / 35 | 3304 |
| 6 | 4 | 52.9 | 54.9 | 1 / 35 | 2724 |
| 7 | 3 | 56.0 | 61.9 | 5 / 35 | 2794 |
| 8 | 3 | 55.7 | 60.0 | 4 / 35 | 2988 |
| 9 | 6 | 52.2 | 52.7 | 0 / 35 | 2729 |
| 10 | 3 | 59.0 | 64.8 | 7 / 35 | 3271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 33 | 39% |
| cx.mini.Nimrod 0.55 | 11 | 45% |
| br2.MobyDickBot 1.6 | 8 | 25% |
| uji.YellohFellah 1.0 | 7 | 43% |
| djc.DynaBot 0.1.1 | 7 | 86% |
| rdt199.Warlord 0.73 | 3 | 67% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 318 of 350 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 121 | 38% | 135 |
| cx.mini.Nimrod 0.55 | 63 | 20% | 65 |
| djc.DynaBot 0.1.1 | 34 | 11% | 40 |
| rdt199.Warlord 0.73 | 33 | 10% | 38 |
| br2.MobyDickBot 1.6 | 19 | 6% | 21 |
| uji.YellohFellah 1.0 | 15 | 5% | 18 |
| stelo.MirrorNano 1.3 | 13 | 4% | 13 |
| KiraNL.Chupacabra 0.4 | 12 | 4% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 3% | 7 |

## Melee bench: F12

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.7 | 61.2 | 37 / 350 | 4.49 | 11.6% | 26547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.7 | 14.6% | 85 |
| nat.PallasHawk 1.0 | 1.9 | 14.2% | 100 |
| darkcanuck.Leon 1.01 | 2.5 | 14.0% | 78 |
| hadur117.nano.SanaroD2 0.1 | 4.4 | 11.6% | 37 |
| brainfade.melee.Genghis 0.36 | 4.5 | 11.4% | 32 |
| jrm.Test0 1.0 | 6.4 | 8.4% | 5 |
| jp.Perpy 16.0 | 7.2 | 7.8% | 4 |
| cs.sheldor.Talon 1.1 | 7.6 | 7.7% | 4 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.3% | 6 |
| stuff.Vlad 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.6 | 66.3 | 2 / 35 | 2778 |
| 2 | 4 | 56.3 | 62.5 | 6 / 35 | 2628 |
| 3 | 5 | 54.3 | 58.1 | 5 / 35 | 2427 |
| 4 | 5 | 55.4 | 61.3 | 4 / 35 | 2532 |
| 5 | 5 | 55.2 | 61.3 | 4 / 35 | 2419 |
| 6 | 4 | 55.4 | 60.0 | 3 / 35 | 2783 |
| 7 | 5 | 53.9 | 56.5 | 2 / 35 | 2429 |
| 8 | 4 | 58.1 | 66.0 | 4 / 35 | 2870 |
| 9 | 4 | 56.0 | 61.6 | 3 / 35 | 2949 |
| 10 | 4 | 54.5 | 58.1 | 4 / 35 | 2732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 32 | 25% |
| darkcanuck.Leon 1.01 | 30 | 10% |
| bts.wiki.RipCurl 0.9b | 25 | 52% |
| brainfade.melee.Genghis 0.36 | 10 | 90% |
| jrm.Test0 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 74 | 24% | 78 |
| nat.PallasHawk 1.0 | 71 | 23% | 80 |
| bts.wiki.RipCurl 0.9b | 48 | 15% | 61 |
| brainfade.melee.Genghis 0.36 | 40 | 13% | 46 |
| jrm.Test0 1.0 | 31 | 10% | 33 |
| cs.sheldor.Talon 1.1 | 26 | 8% | 28 |
| jp.Perpy 16.0 | 15 | 5% | 15 |
| stuff.Vlad 0.1 | 4 | 1% | 5 |
| jaybot.bots.Oddball 4.0 | 4 | 1% | 4 |

## Melee bench: F13

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.5 | 29 / 350 | 3.93 | 12.3% | 30843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.0 | 18.2% | 194 |
| ags.Glacier 0.2.11 | 2.0 | 17.2% | 94 |
| hadur117.nano.SanaroD2 0.1 | 3.9 | 12.3% | 29 |
| gh.micro.Gruweltje 0.7 | 4.0 | 12.1% | 15 |
| shinh.Entangled 0.3 | 4.1 | 12.0% | 16 |
| apc.Colossus2 0.17 | 6.2 | 8.2% | 1 |
| stelo.Wang 1.0 | 6.9 | 7.0% | 2 |
| ayk.WallHugger 1.0 | 8.1 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.3 | 66.3 | 1 / 35 | 2883 |
| 2 | 5 | 57.9 | 66.3 | 5 / 35 | 2687 |
| 3 | 3 | 59.0 | 67.3 | 2 / 35 | 3224 |
| 4 | 3 | 61.8 | 76.2 | 4 / 35 | 3188 |
| 5 | 4 | 57.2 | 63.8 | 1 / 35 | 3199 |
| 6 | 5 | 57.9 | 64.4 | 1 / 35 | 3094 |
| 7 | 3 | 59.8 | 69.5 | 5 / 35 | 3196 |
| 8 | 5 | 56.5 | 64.1 | 2 / 35 | 2527 |
| 9 | 5 | 58.4 | 64.8 | 4 / 35 | 3184 |
| 10 | 3 | 60.9 | 71.7 | 4 / 35 | 3661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 60 | 25% |
| ags.Glacier 0.2.11 | 37 | 19% |
| gh.micro.Gruweltje 0.7 | 5 | 80% |
| stelo.Wang 1.0 | 2 | 50% |
| shinh.Entangled 0.3 | 2 | 100% |

Hadur died in 321 of 350 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 102 | 32% | 108 |
| mn.Combat 3.25.0 | 92 | 29% | 109 |
| gh.micro.Gruweltje 0.7 | 50 | 16% | 53 |
| shinh.Entangled 0.3 | 32 | 10% | 34 |
| stelo.Wang 1.0 | 19 | 6% | 19 |
| apc.Colossus2 0.17 | 18 | 6% | 18 |
| maribo.FollowFire 1 | 8 | 2% | 8 |

## Melee bench: F14

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 73.9 | 91 / 350 | 3.35 | 14.3% | 36160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.4% | 145 |
| hadur117.nano.SanaroD2 0.1 | 2.1 | 14.3% | 91 |
| catcat20.shape.Theta 0.018 | 3.1 | 12.2% | 50 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 10.2% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 10.2% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 9.7% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 6.1 | 9.9% | 17 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.6% | 20 |
| pa.Improved 1.0 | 9.0 | 5.3% | 2 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 71.1 | 11 / 35 | 3799 |
| 2 | 2 | 59.7 | 70.2 | 7 / 35 | 3176 |
| 3 | 2 | 59.9 | 71.1 | 5 / 35 | 3182 |
| 4 | 2 | 65.0 | 81.6 | 16 / 35 | 3645 |
| 5 | 2 | 64.3 | 80.3 | 11 / 35 | 3916 |
| 6 | 2 | 61.9 | 73.0 | 8 / 35 | 3688 |
| 7 | 3 | 60.7 | 69.5 | 6 / 35 | 3615 |
| 8 | 2 | 60.9 | 71.1 | 8 / 35 | 3748 |
| 9 | 2 | 61.7 | 75.6 | 8 / 35 | 3746 |
| 10 | 2 | 62.3 | 75.9 | 11 / 35 | 3645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 50% |
| catcat20.shape.Theta 0.018 | 40 | 68% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 79% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 82% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 29% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 25% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 261 of 350 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 110 | 42% | 143 |
| dmh.robocode.robot.RedDwarf 0.4 | 37 | 14% | 40 |
| catcat20.shape.Theta 0.018 | 29 | 11% | 57 |
| Lo_Ian.Gandalf_V4 4.0 | 24 | 9% | 27 |
| sanyi.mikrobi.Roberto 1.0 | 22 | 8% | 29 |
| co.edu.usb.rc.LidisTron 1.0 | 19 | 7% | 20 |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 6% | 26 |
| pa.Improved 1.0 | 5 | 2% | 6 |

## Melee bench: F15

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.5 | 55.2 | 20 / 350 | 5.03 | 11.0% | 32311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 15.0% | 75 |
| emp.Yngwie 1.11 | 2.2 | 13.9% | 115 |
| mld.DustBunny 3.8 | 3.0 | 13.4% | 43 |
| cb.nano.Insomnia 1.0 | 4.4 | 12.0% | 25 |
| kawigi.robot.Girl 1.2 | 5.0 | 11.1% | 64 |
| hadur117.nano.SanaroD2 0.1 | 5.1 | 11.0% | 20 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.3% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.7% | 1 |
| divineomega.TrialBot 0.003 | 8.8 | 5.6% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 53.9 | 55.6 | 0 / 35 | 3298 |
| 2 | 6 | 53.3 | 54.0 | 1 / 35 | 2987 |
| 3 | 6 | 52.4 | 51.7 | 1 / 35 | 3053 |
| 4 | 6 | 52.5 | 51.1 | 1 / 35 | 3056 |
| 5 | 4 | 56.4 | 58.7 | 3 / 35 | 3249 |
| 6 | 6 | 53.4 | 50.5 | 1 / 35 | 3356 |
| 7 | 6 | 54.4 | 55.2 | 2 / 35 | 3133 |
| 8 | 5 | 52.5 | 51.7 | 3 / 35 | 3028 |
| 9 | 4 | 56.8 | 58.4 | 3 / 35 | 3552 |
| 10 | 2 | 59.2 | 64.8 | 5 / 35 | 3599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 14 | 57% |
| cb.nano.Insomnia 1.0 | 11 | 82% |
| mld.DustBunny 3.8 | 9 | 0% |
| kawigi.robot.Girl 1.2 | 4 | 25% |
| kawigi.micro.Shiz 1.1 | 3 | 33% |
| divineomega.TrialBot 0.003 | 2 | 50% |

Hadur died in 330 of 350 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 63 | 19% | 68 |
| kawigi.micro.Shiz 1.1 | 57 | 17% | 60 |
| cb.nano.Insomnia 1.0 | 56 | 17% | 55 |
| emp.Yngwie 1.11 | 53 | 16% | 61 |
| kawigi.robot.Girl 1.2 | 42 | 13% | 43 |
| Grystrion.TrackerWO 1.0 | 21 | 6% | 22 |
| lambdaxy.TBot 0.1 | 19 | 6% | 19 |
| divineomega.TrialBot 0.003 | 13 | 4% | 16 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 6 | 2% | 6 |

## Melee bench: F16

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.3 | 55.2 | 20 / 350 | 5.03 | 11.2% | 34902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.2% | 174 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 16.0% | 34 |
| techdude.forest.FlamingForest 1.1 | 3.5 | 11.5% | 78 |
| hadur117.nano.SanaroD2 0.1 | 3.8 | 11.2% | 20 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.4% | 22 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 9.3% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.6 | 8.5% | 10 |
| divineomega.DivineBot 1.9.4.5 | 8.4 | 6.1% | 7 |
| repositorio.NanoStep 1.0 | 9.2 | 5.0% | 0 |
| asd.Cthulhu 1.3 | 9.4 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 50.0 | 45.7 | 2 / 35 | 2855 |
| 2 | 3 | 59.3 | 64.1 | 4 / 35 | 3850 |
| 3 | 3 | 56.9 | 58.4 | 3 / 35 | 3526 |
| 4 | 5 | 53.4 | 50.8 | 2 / 35 | 3265 |
| 5 | 4 | 51.9 | 49.5 | 1 / 35 | 3120 |
| 6 | 4 | 57.3 | 56.8 | 3 / 35 | 3829 |
| 7 | 4 | 56.1 | 55.9 | 2 / 35 | 3612 |
| 8 | 3 | 56.1 | 57.1 | 0 / 35 | 3714 |
| 9 | 3 | 55.9 | 56.2 | 2 / 35 | 3385 |
| 10 | 4 | 56.5 | 57.1 | 1 / 35 | 3746 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 29 | 3% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 65% |
| techdude.forest.FlamingForest 1.1 | 7 | 14% |
| divineomega.DivineBot 1.9.4.5 | 4 | 50% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 33% |
| bvh.fnr.Fenrir 0.36l | 1 | 100% |

Hadur died in 330 of 350 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 142 | 43% | 147 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 70 | 21% | 77 |
| bvh.fnr.Fenrir 0.36l | 40 | 12% | 40 |
| techdude.forest.FlamingForest 1.1 | 26 | 8% | 28 |
| divineomega.DivineBot 1.9.4.5 | 18 | 5% | 22 |
| tvv.nano.Polaris 1.2 | 15 | 5% | 16 |
| stelo.IntrinsicVolatility 1.4 | 12 | 4% | 14 |
| asd.Cthulhu 1.3 | 4 | 1% | 4 |
| repositorio.NanoStep 1.0 | 3 | 1% | 2 |

## Melee bench: F17

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 61.5 | 44 / 350 | 4.46 | 12.4% | 36624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 1.7 | 14.3% | 97 |
| et.Predator 1.8 | 2.0 | 14.1% | 57 |
| cx.BlestPain 1.41 | 3.2 | 13.3% | 79 |
| hadur117.nano.SanaroD2 0.1 | 4.0 | 12.4% | 44 |
| nic.Nicator 2.4 | 4.6 | 11.9% | 38 |
| ahf.NanoAndrew .4 | 5.5 | 11.0% | 30 |
| maribo.melee.BMV 0.1 | 7.0 | 9.4% | 7 |
| tex.Longbot 0.4 | 8.4 | 5.3% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.6 | 5.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 60.3 | 5 / 35 | 3669 |
| 2 | 4 | 60.2 | 66.0 | 5 / 35 | 3751 |
| 3 | 3 | 58.4 | 63.8 | 4 / 35 | 3670 |
| 4 | 5 | 58.5 | 63.2 | 4 / 35 | 3684 |
| 5 | 5 | 56.7 | 57.8 | 5 / 35 | 3634 |
| 6 | 5 | 56.2 | 56.5 | 4 / 35 | 3510 |
| 7 | 3 | 59.9 | 66.0 | 6 / 35 | 3833 |
| 8 | 3 | 57.5 | 59.7 | 5 / 35 | 3751 |
| 9 | 3 | 57.9 | 61.0 | 4 / 35 | 3585 |
| 10 | 5 | 57.0 | 61.0 | 2 / 35 | 3537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 30 | 27% |
| oog.melee.Mercutio 1.0 | 28 | 25% |
| cx.BlestPain 1.41 | 27 | 67% |
| nic.Nicator 2.4 | 10 | 70% |
| ahf.NanoAndrew .4 | 4 | 25% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 62 | 20% | 69 |
| oog.melee.Mercutio 1.0 | 60 | 20% | 69 |
| cx.BlestPain 1.41 | 54 | 18% | 74 |
| nic.Nicator 2.4 | 49 | 16% | 55 |
| ahf.NanoAndrew .4 | 43 | 14% | 44 |
| maribo.melee.BMV 0.1 | 27 | 9% | 28 |
| tex.Longbot 0.4 | 8 | 3% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 1% | 3 |

## Melee bench: F18

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 67.7 | 70 / 350 | 3.90 | 13.5% | 35620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.5 | 14.3% | 89 |
| hadur117.nano.SanaroD2 0.1 | 1.8 | 13.5% | 70 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.7% | 76 |
| uji.DBH 1.1 | 4.4 | 11.3% | 37 |
| spinnercat.Robovirus 2.718 | 5.2 | 10.9% | 20 |
| ratosh.Nobo 0.21 | 5.5 | 10.2% | 16 |
| sigterm.Sigterm 1.0 | 7.1 | 8.4% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.3% | 7 |
| stelo.WangRobot 1.0 | 8.9 | 6.2% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 63.2 | 7 / 35 | 3420 |
| 2 | 2 | 58.9 | 68.9 | 5 / 35 | 3331 |
| 3 | 3 | 58.2 | 66.0 | 3 / 35 | 3421 |
| 4 | 1 | 60.9 | 68.9 | 11 / 35 | 3997 |
| 5 | 2 | 59.2 | 66.3 | 7 / 35 | 3375 |
| 6 | 1 | 59.9 | 70.8 | 7 / 35 | 3374 |
| 7 | 1 | 59.0 | 65.1 | 8 / 35 | 3773 |
| 8 | 1 | 61.0 | 71.4 | 8 / 35 | 3820 |
| 9 | 2 | 59.6 | 67.9 | 5 / 35 | 3660 |
| 10 | 2 | 60.2 | 68.9 | 9 / 35 | 3449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 42 | 52% |
| agd.Mooserwirt2 2.7 | 39 | 33% |
| spinnercat.Robovirus 2.718 | 15 | 80% |
| sigterm.Sigterm 1.0 | 12 | 75% |
| uji.DBH 1.1 | 12 | 58% |
| stelo.WangRobot 1.0 | 8 | 13% |
| ratosh.Nobo 0.21 | 7 | 29% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 280 of 350 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 94 | 34% | 113 |
| agd.Mooserwirt2 2.7 | 52 | 19% | 63 |
| ratosh.Nobo 0.21 | 36 | 13% | 40 |
| spinnercat.Robovirus 2.718 | 28 | 10% | 40 |
| uji.DBH 1.1 | 23 | 8% | 30 |
| stelo.WangRobot 1.0 | 16 | 6% | 18 |
| kawigi.mini.Fhqwhgads 1.1 | 13 | 5% | 18 |
| sigterm.Sigterm 1.0 | 11 | 4% | 19 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7 | 3% | 8 |

## Melee bench: F19

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 74.9 | 62 / 350 | 3.26 | 14.7% | 39934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.4 | 16.9% | 111 |
| mld.Infinity 2.2 | 1.7 | 16.2% | 132 |
| hadur117.nano.SanaroD2 0.1 | 2.9 | 14.7% | 62 |
| krillr.mini.JointStrike 2.0.0 | 4.1 | 11.4% | 17 |
| erdnis.Rover 0.3 | 5.0 | 10.3% | 8 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.7% | 4 |
| mbh.Mbh 0.1 | 7.4 | 7.5% | 0 |
| pac.ABC 2.1 | 7.7 | 7.3% | 14 |
| pbg.R2D2 1.0 | 8.6 | 6.3% | 2 |
| pedersen.Moron 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.4 | 73.7 | 7 / 35 | 4135 |
| 2 | 3 | 65.0 | 78.1 | 8 / 35 | 4274 |
| 3 | 3 | 63.6 | 73.7 | 6 / 35 | 4319 |
| 4 | 3 | 62.4 | 74.6 | 4 / 35 | 3855 |
| 5 | 3 | 62.6 | 75.6 | 4 / 35 | 3413 |
| 6 | 3 | 62.0 | 73.3 | 5 / 35 | 3674 |
| 7 | 3 | 63.0 | 74.3 | 5 / 35 | 4009 |
| 8 | 3 | 62.8 | 71.1 | 7 / 35 | 3934 |
| 9 | 3 | 62.8 | 71.1 | 6 / 35 | 4278 |
| 10 | 2 | 66.2 | 83.8 | 10 / 35 | 4043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 70 | 43% |
| davidalves.net.DuelistMiniMelee 1.2 | 67 | 24% |
| krillr.mini.JointStrike 2.0.0 | 10 | 60% |
| pac.ABC 2.1 | 7 | 57% |
| patson.PatsonTestBot 1.0 | 5 | 60% |
| pbg.R2D2 1.0 | 2 | 100% |
| erdnis.Rover 0.3 | 1 | 100% |

Hadur died in 289 of 350 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 126 | 44% | 171 |
| mld.Infinity 2.2 | 70 | 24% | 45 |
| krillr.mini.JointStrike 2.0.0 | 32 | 11% | 43 |
| erdnis.Rover 0.3 | 19 | 7% | 27 |
| patson.PatsonTestBot 1.0 | 17 | 6% | 26 |
| pac.ABC 2.1 | 10 | 3% | 14 |
| mbh.Mbh 0.1 | 9 | 3% | 10 |
| pbg.R2D2 1.0 | 6 | 2% | 12 |

## Melee bench: F20

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 63.4 | 38 / 350 | 4.29 | 12.5% | 35376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 18.0% | 179 |
| hadur117.nano.SanaroD2 0.1 | 2.8 | 12.5% | 38 |
| fwb.Nine 1.0.1 | 3.0 | 12.1% | 39 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.8% | 16 |
| catcat20.Rabbit 0.001 | 5.0 | 10.5% | 43 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 8.7% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.9 | 8.5% | 7 |
| bayen.nut.Squirrel 1.615 | 7.0 | 8.3% | 24 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.5 | 60.6 | 1 / 35 | 3578 |
| 2 | 2 | 57.7 | 62.2 | 5 / 35 | 3396 |
| 3 | 3 | 58.4 | 63.8 | 6 / 35 | 3494 |
| 4 | 5 | 54.6 | 56.8 | 0 / 35 | 2958 |
| 5 | 4 | 58.3 | 64.1 | 6 / 35 | 3350 |
| 6 | 2 | 58.5 | 64.4 | 4 / 35 | 3723 |
| 7 | 3 | 59.2 | 64.8 | 1 / 35 | 3936 |
| 8 | 2 | 58.7 | 64.8 | 4 / 35 | 3799 |
| 9 | 2 | 58.4 | 64.4 | 3 / 35 | 3734 |
| 10 | 2 | 59.9 | 68.3 | 8 / 35 | 3408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 42 | 45% |
| fwb.Nine 1.0.1 | 19 | 26% |
| catcat20.Rabbit 0.001 | 10 | 40% |
| bayen.nut.Squirrel 1.615 | 9 | 56% |
| djdjdj.NanoSkunk10 1.0 | 5 | 40% |
| nz.jdc.nano.GridFu 1.0 | 4 | 25% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 0% |

Hadur died in 313 of 350 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 133 | 42% | 153 |
| fwb.Nine 1.0.1 | 36 | 12% | 24 |
| catcat20.Rabbit 0.001 | 34 | 11% | 43 |
| nz.jdc.nano.GridFu 1.0 | 33 | 11% | 39 |
| bayen.nut.Squirrel 1.615 | 27 | 9% | 33 |
| djdjdj.NanoSkunk10 1.0 | 15 | 5% | 22 |
| m3thos.mini.Eva01 0.5.5 | 15 | 5% | 15 |
| ntc.ControlledChaos 1.1.4 | 11 | 4% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 9 | 3% | 10 |

## Melee bench: F21

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 71.9 | 74 / 350 | 3.53 | 14.9% | 44445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.4 | 16.8% | 172 |
| dummy.mini.Scimitar 1.01 | 2.1 | 15.6% | 47 |
| hadur117.nano.SanaroD2 0.1 | 2.5 | 14.9% | 74 |
| cf.RiO.RiOx 4.2.1 | 4.1 | 12.3% | 29 |
| oa.weak.BotherBot 0.1 | 5.1 | 9.4% | 3 |
| eld.Hmm 1.0 | 5.9 | 8.5% | 22 |
| fire219.CatBot 1.0 | 7.9 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 4 |
| PSW.Relentless 0.1 | 8.2 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 75.2 | 12 / 35 | 4601 |
| 2 | 3 | 62.2 | 67.3 | 9 / 35 | 4572 |
| 3 | 3 | 60.6 | 65.7 | 4 / 35 | 4472 |
| 4 | 2 | 64.5 | 76.5 | 9 / 35 | 4590 |
| 5 | 2 | 62.7 | 70.2 | 6 / 35 | 4657 |
| 6 | 3 | 61.6 | 68.3 | 6 / 35 | 4149 |
| 7 | 3 | 64.7 | 78.1 | 7 / 35 | 4326 |
| 8 | 3 | 63.9 | 74.3 | 8 / 35 | 4366 |
| 9 | 2 | 63.4 | 74.3 | 7 / 35 | 4402 |
| 10 | 3 | 61.7 | 68.9 | 6 / 35 | 4310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 88 | 53% |
| dummy.mini.Scimitar 1.01 | 21 | 71% |
| cf.RiO.RiOx 4.2.1 | 14 | 43% |
| eld.Hmm 1.0 | 7 | 43% |
| oa.weak.BotherBot 0.1 | 2 | 50% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.mini.Scimitar 1.01 | 94 | 34% | 122 |
| eem.EvBot v4.6.16 | 86 | 31% | 112 |
| cf.RiO.RiOx 4.2.1 | 45 | 16% | 53 |
| PSW.Relentless 0.1 | 14 | 5% | 15 |
| oa.weak.BotherBot 0.1 | 12 | 4% | 14 |
| el.JumpShoot 0.2 | 9 | 3% | 9 |
| fire219.CatBot 1.0 | 8 | 3% | 8 |
| eld.Hmm 1.0 | 6 | 2% | 13 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.7 | 75 / 350 | 3.01 | 15.1% | 38061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.9% | 164 |
| hadur117.nano.SanaroD2 0.1 | 2.3 | 15.1% | 75 |
| cre.Karolos 0.32 | 2.7 | 14.7% | 66 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.4% | 17 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 9.2% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.1 | 8.9% | 2 |
| cw.megas.Blade 0.8 | 6.9 | 8.6% | 2 |
| sample.Walls 1.0 | 7.3 | 8.3% | 8 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 77.8 | 7 / 35 | 3971 |
| 2 | 3 | 62.1 | 71.1 | 8 / 35 | 3410 |
| 3 | 2 | 65.2 | 81.3 | 8 / 35 | 3786 |
| 4 | 2 | 65.7 | 81.6 | 10 / 35 | 3726 |
| 5 | 2 | 65.7 | 78.7 | 12 / 35 | 4288 |
| 6 | 2 | 63.7 | 76.8 | 8 / 35 | 3917 |
| 7 | 2 | 64.3 | 77.5 | 5 / 35 | 3815 |
| 8 | 2 | 64.2 | 79.7 | 5 / 35 | 3817 |
| 9 | 3 | 64.1 | 76.5 | 6 / 35 | 3581 |
| 10 | 3 | 63.1 | 76.2 | 6 / 35 | 3750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 89 | 37% |
| cre.Karolos 0.32 | 35 | 20% |
| sample.Walls 1.0 | 21 | 81% |
| stelo.AreaTargetingBot 1.1 | 18 | 44% |
| stelo.RamTrackSurfer 1.2 | 10 | 70% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 276 of 350 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 130 | 47% | 164 |
| cre.Karolos 0.32 | 73 | 26% | 83 |
| stelo.AreaTargetingBot 1.1 | 28 | 10% | 38 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 15 | 5% | 17 |
| stelo.RamTrackSurfer 1.2 | 13 | 5% | 20 |
| sample.Walls 1.0 | 10 | 4% | 18 |
| cw.megas.Blade 0.8 | 7 | 3% | 7 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.0 | 52.3 | 14 / 350 | 5.29 | 10.0% | 26510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.2 | 15.4% | 112 |
| davidalves.Phoenix 0.54 | 2.4 | 14.3% | 90 |
| florent.XSeries.X2 0.12 | 2.8 | 13.4% | 70 |
| pedersen.Ugluk 1.1.1 | 3.7 | 12.0% | 31 |
| hadur117.nano.SanaroD2 0.1 | 5.5 | 10.0% | 14 |
| oog.melee.Corsair 1.0 | 5.5 | 9.8% | 14 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.4% | 16 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.8% | 2 |
| as.FrankTheTank 1.3 | 9.4 | 5.1% | 3 |
| evd.X1 0.01 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.9 | 53.0 | 2 / 35 | 2664 |
| 2 | 5 | 54.2 | 56.2 | 3 / 35 | 2623 |
| 3 | 6 | 52.0 | 51.7 | 1 / 35 | 2707 |
| 4 | 5 | 51.5 | 52.1 | 0 / 35 | 2550 |
| 5 | 5 | 52.7 | 52.7 | 1 / 35 | 2970 |
| 6 | 5 | 52.7 | 53.3 | 3 / 35 | 2763 |
| 7 | 6 | 48.9 | 46.7 | 1 / 35 | 2398 |
| 8 | 5 | 52.1 | 53.7 | 1 / 35 | 2638 |
| 9 | 6 | 50.9 | 51.1 | 1 / 35 | 2566 |
| 10 | 7 | 51.9 | 52.7 | 1 / 35 | 2631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 12 | 50% |
| rz.GlowBlowMelee 1.4 | 9 | 33% |
| stelo.SoJNanoMelee 1.1 | 6 | 17% |
| davidalves.Phoenix 0.54 | 6 | 33% |
| pedersen.Ugluk 1.1.1 | 2 | 100% |
| oog.melee.Corsair 1.0 | 1 | 0% |

Hadur died in 336 of 350 rounds, at a mean tick of 515. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 73 | 22% | 74 |
| davidalves.Phoenix 0.54 | 72 | 21% | 74 |
| florent.XSeries.X2 0.12 | 63 | 19% | 70 |
| pedersen.Ugluk 1.1.1 | 49 | 15% | 52 |
| oog.melee.Corsair 1.0 | 30 | 9% | 30 |
| stelo.SoJNanoMelee 1.1 | 29 | 9% | 29 |
| lunchie.Lunchbox 0.93 | 9 | 3% | 9 |
| evd.X1 0.01 | 6 | 2% | 7 |
| as.FrankTheTank 1.3 | 5 | 1% | 5 |

## Melee bench: F25

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.7 | 59.7 | 39 / 350 | 4.62 | 11.7% | 28193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 14.8% | 79 |
| jdw.Hurricane 1.4 | 2.4 | 13.2% | 75 |
| voidious.micro.BlitzBat 1.05 | 2.4 | 13.5% | 59 |
| hadur117.nano.SanaroD2 0.1 | 4.1 | 11.7% | 39 |
| gre.svman4.Morfeas 1.4.1 | 4.7 | 11.2% | 38 |
| ds.Oo 2.2 | 6.5 | 9.1% | 24 |
| gjr.Cephalosporin 0.1 | 6.6 | 8.8% | 25 |
| awesomeness.Elite 1.0 | 8.1 | 7.1% | 10 |
| adt.Ar2 1.1 | 8.8 | 6.2% | 4 |
| amk.ChumbaMini 0.2 | 9.9 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.5 | 52.1 | 3 / 35 | 2644 |
| 2 | 3 | 57.4 | 61.9 | 6 / 35 | 3020 |
| 3 | 4 | 56.3 | 60.3 | 5 / 35 | 2886 |
| 4 | 4 | 57.2 | 63.8 | 2 / 35 | 2775 |
| 5 | 5 | 53.5 | 55.2 | 3 / 35 | 2710 |
| 6 | 4 | 55.4 | 58.7 | 5 / 35 | 2749 |
| 7 | 4 | 55.6 | 61.3 | 2 / 35 | 2878 |
| 8 | 5 | 57.4 | 65.1 | 3 / 35 | 2696 |
| 9 | 3 | 57.9 | 63.8 | 6 / 35 | 3062 |
| 10 | 4 | 54.0 | 55.2 | 4 / 35 | 2773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 28 | 36% |
| voidious.micro.BlitzBat 1.05 | 19 | 26% |
| jdw.Hurricane 1.4 | 18 | 83% |
| gjr.Cephalosporin 0.1 | 10 | 40% |
| gre.svman4.Morfeas 1.4.1 | 8 | 38% |
| awesomeness.Elite 1.0 | 2 | 50% |
| ds.Oo 2.2 | 2 | 50% |
| adt.Ar2 1.1 | 1 | 0% |

Hadur died in 311 of 350 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 71 | 23% | 78 |
| voidious.mini.BrokenSword 2.0.3 | 66 | 21% | 77 |
| jdw.Hurricane 1.4 | 46 | 15% | 55 |
| gre.svman4.Morfeas 1.4.1 | 40 | 13% | 42 |
| ds.Oo 2.2 | 31 | 10% | 32 |
| gjr.Cephalosporin 0.1 | 20 | 6% | 24 |
| adt.Ar2 1.1 | 19 | 6% | 20 |
| awesomeness.Elite 1.0 | 11 | 4% | 13 |
| amk.ChumbaMini 0.2 | 7 | 2% | 9 |

## Melee bench: F26

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 66.4 | 37 / 350 | 4.02 | 12.8% | 37254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.5% | 122 |
| shu.nitro.LENIN .T34 | 2.5 | 13.5% | 84 |
| lrem.Spectre 0.4.4 | 3.3 | 13.0% | 53 |
| hadur117.nano.SanaroD2 0.1 | 3.5 | 12.8% | 37 |
| gh.mini.GrubbmOne 1.0 | 5.4 | 11.1% | 19 |
| js.PinBall 1.6 | 5.7 | 10.7% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 6.6 | 9.0% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.4% | 4 |
| sample.SpinBot 1.0 | 8.8 | 5.7% | 3 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 68.9 | 2 / 35 | 3676 |
| 2 | 4 | 60.6 | 69.5 | 5 / 35 | 3749 |
| 3 | 4 | 57.0 | 59.7 | 5 / 35 | 3401 |
| 4 | 3 | 61.2 | 70.5 | 4 / 35 | 3971 |
| 5 | 4 | 58.4 | 65.1 | 3 / 35 | 3508 |
| 6 | 2 | 62.4 | 72.1 | 4 / 35 | 4452 |
| 7 | 5 | 56.4 | 59.7 | 2 / 35 | 3237 |
| 8 | 4 | 59.5 | 65.7 | 4 / 35 | 3772 |
| 9 | 3 | 59.7 | 66.7 | 2 / 35 | 3885 |
| 10 | 3 | 59.3 | 66.3 | 6 / 35 | 3603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 33 | 36% |
| shu.nitro.LENIN .T34 | 30 | 10% |
| lrem.Spectre 0.4.4 | 18 | 44% |
| js.PinBall 1.6 | 12 | 50% |
| gh.mini.GrubbmOne 1.0 | 10 | 20% |
| sample.SpinBot 1.0 | 4 | 25% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 315 of 350 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 89 | 28% | 98 |
| shu.nitro.LENIN .T34 | 57 | 18% | 62 |
| gh.mini.GrubbmOne 1.0 | 56 | 18% | 60 |
| lrem.Spectre 0.4.4 | 48 | 15% | 57 |
| js.PinBall 1.6 | 27 | 9% | 31 |
| jaybot.adv.bots.JayBot 2.0 | 20 | 6% | 22 |
| sample.SpinBot 1.0 | 11 | 3% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 2% | 9 |

## Melee bench: F27

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.6 | 55.7 | 27 / 350 | 4.98 | 11.0% | 30482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.0 | 16.5% | 169 |
| wee.Gem 1.8.4 | 3.1 | 12.3% | 70 |
| sheldor.melee.nano.TestMelee 0.1 | 3.6 | 12.1% | 39 |
| EH.Eagle 1.0.6 | 4.2 | 11.2% | 26 |
| hadur117.nano.SanaroD2 0.1 | 4.9 | 11.0% | 27 |
| techdude.kombat.FlamingKombat 1.5 | 6.1 | 8.9% | 6 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.3% | 6 |
| joe.ADinosaur 1.0 | 7.5 | 7.7% | 3 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.6% | 4 |
| cs.Grudge 1.0 | 9.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 8 | 45.4 | 30.8 | 0 / 35 | 3675 |
| 2 | 5 | 55.0 | 60.3 | 2 / 35 | 2706 |
| 3 | 2 | 58.9 | 73.3 | 4 / 35 | 2751 |
| 4 | 9 | 42.0 | 25.1 | 1 / 35 | 3564 |
| 5 | 4 | 56.4 | 63.8 | 1 / 35 | 2859 |
| 6 | 4 | 56.9 | 66.3 | 3 / 35 | 2667 |
| 7 | 4 | 57.5 | 68.3 | 4 / 35 | 2730 |
| 8 | 3 | 57.4 | 65.1 | 6 / 35 | 2760 |
| 9 | 3 | 58.3 | 68.6 | 4 / 35 | 2948 |
| 10 | 7 | 48.5 | 35.9 | 2 / 35 | 3822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 41 | 34% |
| EH.Eagle 1.0.6 | 9 | 33% |
| wee.Gem 1.8.4 | 7 | 14% |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 17% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 80% |
| throxbot.ThroxBot 0.1 | 3 | 67% |
| joe.ADinosaur 1.0 | 3 | 67% |

Hadur died in 323 of 350 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 116 | 36% | 129 |
| sheldor.melee.nano.TestMelee 0.1 | 41 | 13% | 43 |
| wee.Gem 1.8.4 | 39 | 12% | 40 |
| cs.Grudge 1.0 | 36 | 11% | 33 |
| EH.Eagle 1.0.6 | 28 | 9% | 32 |
| joe.ADinosaur 1.0 | 18 | 6% | 21 |
| throxbot.ThroxBot 0.1 | 16 | 5% | 19 |
| techdude.kombat.FlamingKombat 1.5 | 15 | 5% | 19 |
| caimano.Furia_Ceca 0.22 | 14 | 4% | 14 |

## Melee bench: F28

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 74.4 | 91 / 350 | 3.30 | 14.6% | 34571 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.1 | 16.3% | 110 |
| hadur117.nano.SanaroD2 0.1 | 1.9 | 14.6% | 91 |
| uji.Antique 1.0 | 3.1 | 13.2% | 82 |
| qohnil.blot.BlotBot 3.61 | 4.4 | 10.9% | 31 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.9% | 13 |
| ahr.ice.Ice 1.0.2 | 6.6 | 8.2% | 15 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.2% | 5 |
| matt.advanced.Katana 1.0 | 8.0 | 6.5% | 3 |
| stelo.PianistNano 1.2 | 9.0 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 73.3 | 10 / 35 | 3666 |
| 2 | 2 | 62.0 | 76.5 | 9 / 35 | 3307 |
| 3 | 2 | 63.3 | 78.7 | 10 / 35 | 3529 |
| 4 | 2 | 61.3 | 74.0 | 8 / 35 | 3292 |
| 5 | 2 | 60.4 | 71.1 | 6 / 35 | 3381 |
| 6 | 2 | 62.9 | 75.9 | 11 / 35 | 3606 |
| 7 | 2 | 61.7 | 73.7 | 11 / 35 | 3234 |
| 8 | 2 | 59.7 | 68.3 | 9 / 35 | 3348 |
| 9 | 2 | 61.7 | 72.4 | 6 / 35 | 3782 |
| 10 | 1 | 63.2 | 80.3 | 11 / 35 | 3426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 83 | 59% |
| uji.Antique 1.0 | 41 | 46% |
| pfvicm.Sobieski 7.2.3b | 14 | 64% |
| qohnil.blot.BlotBot 3.61 | 11 | 36% |
| matt.advanced.Katana 1.0 | 6 | 83% |
| ahr.ice.Ice 1.0.2 | 4 | 25% |
| amk.ChumbaWumba 0.3 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 259 of 350 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 103 | 40% | 131 |
| uji.Antique 1.0 | 46 | 18% | 70 |
| pfvicm.Sobieski 7.2.3b | 39 | 15% | 44 |
| qohnil.blot.BlotBot 3.61 | 27 | 10% | 37 |
| ahr.ice.Ice 1.0.2 | 15 | 6% | 20 |
| amk.ChumbaWumba 0.3 | 15 | 6% | 18 |
| stelo.Lifestealer 1.0 | 7 | 3% | 11 |
| matt.advanced.Katana 1.0 | 5 | 2% | 13 |
| stelo.PianistNano 1.2 | 2 | 1% | 6 |

## Melee bench: F29

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 56.7 | 27 / 350 | 4.89 | 11.5% | 32386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.5 | 15.9% | 128 |
| deewiant.Anomaly 0.2 | 1.6 | 16.2% | 109 |
| myl.micro.Troodon 1.10 | 3.1 | 13.6% | 30 |
| hadur117.nano.SanaroD2 0.1 | 4.3 | 11.5% | 27 |
| jok.PheonixM 0.1.2 | 4.5 | 11.4% | 18 |
| DBall.Anarchy 0.1 | 6.4 | 8.7% | 30 |
| ph.melee.ArcherME 0.3 | 6.7 | 8.1% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.9% | 1 |
| jangs.ns51 1.0 | 9.1 | 4.4% | 1 |
| ap.Frederick 1.1 | 9.6 | 4.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.6 | 52.4 | 2 / 35 | 2955 |
| 2 | 4 | 57.7 | 59.4 | 4 / 35 | 3210 |
| 3 | 4 | 56.6 | 56.5 | 5 / 35 | 2964 |
| 4 | 5 | 56.2 | 57.8 | 2 / 35 | 3082 |
| 5 | 4 | 58.1 | 60.6 | 3 / 35 | 3606 |
| 6 | 4 | 55.4 | 54.0 | 1 / 35 | 3332 |
| 7 | 4 | 57.1 | 57.5 | 4 / 35 | 3355 |
| 8 | 3 | 60.3 | 64.4 | 4 / 35 | 3784 |
| 9 | 5 | 54.7 | 53.7 | 1 / 35 | 3199 |
| 10 | 5 | 53.3 | 51.1 | 1 / 35 | 2899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 22 | 18% |
| zyx.mega.YersiniaPestis 3.1 | 16 | 25% |
| myl.micro.Troodon 1.10 | 13 | 77% |
| DBall.Anarchy 0.1 | 9 | 33% |
| jok.PheonixM 0.1.2 | 6 | 83% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 324 of 350 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 116 | 36% | 120 |
| myl.micro.Troodon 1.10 | 69 | 21% | 77 |
| zyx.mega.YersiniaPestis 3.1 | 67 | 21% | 73 |
| jok.PheonixM 0.1.2 | 39 | 12% | 44 |
| DBall.Anarchy 0.1 | 14 | 4% | 17 |
| ph.melee.ArcherME 0.3 | 12 | 4% | 12 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 1% | 4 |
| jangs.ns51 1.0 | 3 | 1% | 3 |

## Melee bench: F30

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.4 | 47.0 | 12 / 350 | 5.77 | 9.0% | 24602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 2.1 | 14.1% | 87 |
| catcat20.Matcha 0.006 | 2.1 | 14.2% | 94 |
| stelo.PastFuture 2.3.2 | 2.4 | 14.1% | 68 |
| oog.melee.Capulet 1.2 | 3.4 | 13.1% | 46 |
| intruder.PrairieWolf 2.61 | 5.7 | 9.3% | 28 |
| hadur117.nano.SanaroD2 0.1 | 6.2 | 9.0% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 8.1% | 10 |
| ntc.Opposite 1.5 | 7.7 | 7.9% | 2 |
| tripphippy.Alice 1.1 | 8.1 | 7.6% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 47.9 | 43.8 | 2 / 35 | 2414 |
| 2 | 6 | 50.8 | 48.6 | 0 / 35 | 2765 |
| 3 | 5 | 51.7 | 51.7 | 2 / 35 | 2469 |
| 4 | 6 | 49.4 | 46.0 | 2 / 35 | 2356 |
| 5 | 8 | 46.2 | 42.2 | 1 / 35 | 2116 |
| 6 | 6 | 48.5 | 45.4 | 1 / 35 | 2444 |
| 7 | 6 | 49.1 | 45.4 | 0 / 35 | 2504 |
| 8 | 6 | 51.1 | 50.8 | 2 / 35 | 2487 |
| 9 | 5 | 52.7 | 54.3 | 2 / 35 | 2692 |
| 10 | 7 | 46.6 | 41.3 | 0 / 35 | 2355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 13 | 38% |
| stelo.PastFuture 2.3.2 | 6 | 67% |
| oog.melee.Capulet 1.2 | 4 | 25% |
| darkcanuck.B26354 1.06 | 4 | 50% |

Hadur died in 338 of 350 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 65 | 19% | 67 |
| stelo.PastFuture 2.3.2 | 61 | 18% | 64 |
| catcat20.Matcha 0.006 | 57 | 17% | 62 |
| oog.melee.Capulet 1.2 | 52 | 15% | 54 |
| intruder.PrairieWolf 2.61 | 30 | 9% | 30 |
| tripphippy.Alice 1.1 | 28 | 8% | 28 |
| ntc.Opposite 1.5 | 26 | 8% | 26 |
| fowl3628800.LightningBolt 2.6.0 | 18 | 5% | 18 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |

## Melee bench: F31

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.5 | 50.9 | 11 / 350 | 5.42 | 9.8% | 25714 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.0% | 215 |
| gh.mini.Griezel 0.2 | 2.3 | 14.0% | 63 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 12.2% | 22 |
| d414.nano.Quantum 1.0.0 | 3.6 | 11.8% | 22 |
| hadur117.nano.SanaroD2 0.1 | 5.0 | 9.8% | 11 |
| gh.nano.Grofvuil 0.2 | 5.6 | 9.3% | 11 |
| timmit.nano.TimDog 0.33 | 7.6 | 7.0% | 5 |
| fm.mammillarias 1.3 | 7.7 | 6.6% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 49.1 | 45.1 | 0 / 35 | 2580 |
| 2 | 6 | 47.7 | 45.1 | 0 / 35 | 2106 |
| 3 | 5 | 50.6 | 48.9 | 0 / 35 | 2412 |
| 4 | 6 | 47.6 | 43.5 | 0 / 35 | 2373 |
| 5 | 2 | 59.1 | 68.9 | 4 / 35 | 3107 |
| 6 | 5 | 51.3 | 48.9 | 1 / 35 | 2596 |
| 7 | 5 | 51.4 | 49.8 | 2 / 35 | 2516 |
| 8 | 5 | 54.6 | 56.8 | 1 / 35 | 2751 |
| 9 | 6 | 50.0 | 47.9 | 1 / 35 | 2459 |
| 10 | 5 | 53.6 | 54.0 | 2 / 35 | 2814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 21 | 24% |
| gh.mini.Griezel 0.2 | 8 | 38% |
| spinnercat.micro.Tyger 0.1 | 5 | 20% |
| d414.nano.Quantum 1.0.0 | 2 | 50% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 339 of 350 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 84 | 25% | 86 |
| spinnercat.micro.Tyger 0.1 | 70 | 21% | 70 |
| abc.Shadow 3.84i | 65 | 19% | 70 |
| d414.nano.Quantum 1.0.0 | 46 | 14% | 47 |
| gh.nano.Grofvuil 0.2 | 28 | 8% | 29 |
| timmit.nano.TimDog 0.33 | 17 | 5% | 18 |
| fm.mammillarias 1.3 | 15 | 4% | 15 |
| Gecko.ultimateGeckoBot 1.0 | 8 | 2% | 9 |
| tlp.ThreeLeggedPig 1 | 6 | 2% | 6 |

## Melee bench: F32

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 72.2 | 90 / 350 | 3.50 | 14.2% | 35914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.1 | 15.5% | 128 |
| hadur117.nano.SanaroD2 0.1 | 1.9 | 14.2% | 90 |
| apc.botM 3.0 | 3.6 | 12.1% | 45 |
| lxx.ConceptA 0.8 | 4.4 | 10.8% | 11 |
| vjik.UnViolation 1.1 | 4.7 | 10.7% | 39 |
| bayen.UbaMicro 1.4 | 5.6 | 9.3% | 10 |
| panzer.Panzer 0.2 | 7.0 | 8.1% | 3 |
| yk.JahMicro 1.0 | 8.3 | 7.1% | 11 |
| conscience.Electron 1.3g | 9.0 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 9.4 | 5.7% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 77.5 | 10 / 35 | 3636 |
| 2 | 2 | 59.6 | 70.8 | 6 / 35 | 3555 |
| 3 | 2 | 60.5 | 68.3 | 11 / 35 | 3717 |
| 4 | 2 | 59.8 | 72.1 | 6 / 35 | 3363 |
| 5 | 2 | 62.1 | 73.7 | 10 / 35 | 3860 |
| 6 | 2 | 59.8 | 69.5 | 9 / 35 | 3391 |
| 7 | 2 | 62.2 | 74.6 | 10 / 35 | 3844 |
| 8 | 2 | 61.6 | 74.0 | 12 / 35 | 3645 |
| 9 | 2 | 59.2 | 70.5 | 6 / 35 | 3353 |
| 10 | 2 | 60.5 | 71.1 | 10 / 35 | 3550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 71 | 44% |
| vjik.UnViolation 1.1 | 30 | 47% |
| apc.botM 3.0 | 21 | 62% |
| lxx.ConceptA 0.8 | 20 | 80% |
| bayen.UbaMicro 1.4 | 10 | 70% |
| yk.JahMicro 1.0 | 8 | 50% |
| donjezza.Jezza 1.0 | 6 | 50% |
| panzer.Panzer 0.2 | 3 | 33% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 262 of 350 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 74 | 28% | 106 |
| lxx.ConceptA 0.8 | 51 | 19% | 58 |
| apc.botM 3.0 | 37 | 14% | 49 |
| vjik.UnViolation 1.1 | 36 | 14% | 54 |
| bayen.UbaMicro 1.4 | 17 | 6% | 26 |
| panzer.Panzer 0.2 | 15 | 6% | 17 |
| yk.JahMicro 1.0 | 12 | 5% | 15 |
| conscience.Electron 1.3g | 11 | 4% | 12 |
| donjezza.Jezza 1.0 | 9 | 3% | 12 |

## Melee bench: F33

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.6 | 56.3 | 22 / 350 | 4.93 | 11.4% | 32995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.2% | 152 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.5% | 53 |
| hadur117.nano.SanaroD2 0.1 | 4.0 | 11.4% | 22 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.5% | 37 |
| labg.Cataclysm 2.05 | 4.1 | 11.3% | 53 |
| baal.nano.N 1.42 | 6.3 | 9.2% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 9.2% | 19 |
| zyx.micro.Ant 1.1 | 8.1 | 6.0% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.9% | 5 |
| sanja.First 0.1 | 9.6 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.3 | 54.6 | 1 / 35 | 3324 |
| 2 | 4 | 55.7 | 54.0 | 4 / 35 | 3628 |
| 3 | 5 | 55.1 | 56.2 | 0 / 35 | 3272 |
| 4 | 3 | 57.1 | 61.3 | 1 / 35 | 3425 |
| 5 | 4 | 57.0 | 58.1 | 3 / 35 | 3549 |
| 6 | 3 | 57.9 | 60.3 | 4 / 35 | 3412 |
| 7 | 6 | 52.3 | 48.9 | 3 / 35 | 2918 |
| 8 | 3 | 56.2 | 59.7 | 3 / 35 | 3188 |
| 9 | 4 | 54.2 | 55.6 | 1 / 35 | 3065 |
| 10 | 4 | 55.0 | 54.9 | 2 / 35 | 3214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 27 | 15% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 29% |
| labg.Cataclysm 2.05 | 10 | 50% |
| gre.svman4.Leonidas 1.3.2 | 9 | 44% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 60% |
| zyx.micro.Ant 1.1 | 3 | 67% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 0% |

Hadur died in 329 of 350 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 114 | 35% | 122 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 61 | 19% | 67 |
| gre.svman4.Leonidas 1.3.2 | 43 | 13% | 44 |
| labg.Cataclysm 2.05 | 36 | 11% | 40 |
| kinsen.melee.Angsaichmophobia 1.8c | 29 | 9% | 32 |
| baal.nano.N 1.42 | 18 | 5% | 19 |
| zyx.micro.Ant 1.1 | 16 | 5% | 16 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 7 | 2% | 5 |
| sanja.First 0.1 | 5 | 2% | 5 |

## Melee bench: F34

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 67.2 | 29 / 350 | 3.95 | 13.2% | 39539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.4 | 17.6% | 119 |
| stelo.Spread 0.9 | 1.6 | 17.6% | 153 |
| hadur117.nano.SanaroD2 0.1 | 3.1 | 13.2% | 29 |
| jcs.Seth 1.8 | 4.3 | 11.4% | 25 |
| tcf.Reach 3 | 5.0 | 10.9% | 17 |
| cli.Dancer 1.1 | 5.6 | 9.7% | 6 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 2 |
| amk.Punbot.Punbot 0.01 | 8.1 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.3 | 61.3 | 2 / 35 | 3642 |
| 2 | 3 | 59.2 | 63.2 | 3 / 35 | 3736 |
| 3 | 3 | 61.5 | 68.3 | 1 / 35 | 4253 |
| 4 | 3 | 62.5 | 71.7 | 5 / 35 | 4231 |
| 5 | 3 | 61.0 | 68.3 | 5 / 35 | 3768 |
| 6 | 3 | 61.1 | 68.9 | 3 / 35 | 4004 |
| 7 | 3 | 60.7 | 67.0 | 4 / 35 | 3808 |
| 8 | 3 | 61.6 | 68.6 | 2 / 35 | 4210 |
| 9 | 3 | 59.2 | 65.4 | 0 / 35 | 3596 |
| 10 | 3 | 62.5 | 69.8 | 4 / 35 | 4291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 42 | 33% |
| kid.Gladiator .7.2 | 31 | 23% |
| jcs.Seth 1.8 | 11 | 64% |
| cli.Dancer 1.1 | 3 | 33% |
| tcf.Reach 3 | 2 | 0% |

Hadur died in 322 of 350 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 128 | 40% | 132 |
| stelo.Spread 0.9 | 102 | 32% | 118 |
| tcf.Reach 3 | 35 | 11% | 35 |
| jcs.Seth 1.8 | 23 | 7% | 30 |
| cli.Dancer 1.1 | 20 | 6% | 22 |
| ratosh.Wesco 1.4 | 6 | 2% | 6 |
| amk.Punbot.Punbot 0.01 | 4 | 1% | 4 |
| sample.VelociRobot 1.0 | 2 | 1% | 2 |
| sample.RamFire 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 61.9 | 9 / 350 | 4.43 | 11.4% | 27593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.8% | 295 |
| gh.mini.Gruwel 0.9 | 2.6 | 13.4% | 27 |
| rz.HawkOnFire 0.1 | 3.3 | 12.4% | 3 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.9 | 11.9% | 14 |
| hadur117.nano.SanaroD2 0.1 | 4.2 | 11.4% | 9 |
| myl.nano.KomoriNinja 1.1 | 6.2 | 7.6% | 2 |
| wit.Chuliath 1.0 | 7.0 | 7.3% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.4 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.7 | 55.2 | 0 / 35 | 2545 |
| 2 | 5 | 55.0 | 58.1 | 1 / 35 | 2513 |
| 3 | 5 | 54.3 | 58.1 | 0 / 35 | 2565 |
| 4 | 5 | 56.3 | 61.0 | 1 / 35 | 2734 |
| 5 | 5 | 55.3 | 58.1 | 1 / 35 | 2859 |
| 6 | 2 | 59.1 | 67.3 | 1 / 35 | 3142 |
| 7 | 5 | 56.3 | 60.3 | 1 / 35 | 2934 |
| 8 | 3 | 57.0 | 64.8 | 1 / 35 | 2712 |
| 9 | 3 | 58.6 | 69.2 | 2 / 35 | 2710 |
| 10 | 4 | 58.5 | 66.7 | 1 / 35 | 2879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 54 | 0% |
| rz.HawkOnFire 0.1 | 5 | 80% |
| gh.mini.Gruwel 0.9 | 5 | 40% |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 341 of 350 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 133 | 39% | 134 |
| gh.mini.Gruwel 0.9 | 74 | 22% | 76 |
| rz.HawkOnFire 0.1 | 54 | 16% | 58 |
| dmh.robocode.robot.BlackDeath 9.2 | 41 | 12% | 43 |
| myl.nano.KomoriNinja 1.1 | 11 | 3% | 11 |
| wit.Chuliath 1.0 | 11 | 3% | 10 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 9 | 3% | 10 |
| dans.Cinnamon 1.2 | 4 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 4 | 1% | 4 |

## Melee bench: F36

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.7 | 59.0 | 55 / 350 | 4.69 | 11.8% | 31486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| alpha.RainingFire 1.0 | 1.7 | 13.1% | 71 |
| bzdp.Pansy 2.1 | 3.0 | 12.3% | 47 |
| bvh.micro.Freya 0.3 | 3.3 | 11.8% | 50 |
| mz.Cork 0.1 | 3.6 | 11.9% | 54 |
| hadur117.nano.SanaroD2 0.1 | 4.3 | 11.8% | 55 |
| m3thos.Eva02 0.7.1 | 5.7 | 10.4% | 38 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.7% | 15 |
| dl.BetterWalls 1.0 | 8.1 | 7.8% | 10 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 6.6% | 2 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.6% | 15 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 53.2 | 54.0 | 3 / 35 | 3057 |
| 2 | 5 | 55.4 | 58.4 | 4 / 35 | 3117 |
| 3 | 3 | 56.1 | 59.7 | 8 / 35 | 3033 |
| 4 | 1 | 61.9 | 73.7 | 9 / 35 | 3869 |
| 5 | 6 | 53.2 | 53.7 | 5 / 35 | 2848 |
| 6 | 2 | 57.9 | 64.4 | 6 / 35 | 3343 |
| 7 | 5 | 55.5 | 55.9 | 6 / 35 | 3259 |
| 8 | 5 | 53.9 | 54.6 | 7 / 35 | 2899 |
| 9 | 6 | 53.4 | 55.2 | 4 / 35 | 2834 |
| 10 | 4 | 56.1 | 60.3 | 3 / 35 | 3227 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 22 | 50% |
| alpha.RainingFire 1.0 | 16 | 50% |
| bvh.micro.Freya 0.3 | 14 | 57% |
| mz.Cork 0.1 | 12 | 67% |
| m3thos.Eva02 0.7.1 | 10 | 40% |
| bvh.mini.Fenrir 0.39 | 10 | 80% |
| dl.BetterWalls 1.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 0% |
| squidM.TentalceMeleeNano 1.1 | 1 | 0% |

Hadur died in 296 of 350 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 61 | 21% | 72 |
| bzdp.Pansy 2.1 | 52 | 18% | 67 |
| bvh.micro.Freya 0.3 | 44 | 15% | 49 |
| m3thos.Eva02 0.7.1 | 41 | 14% | 45 |
| bvh.mini.Fenrir 0.39 | 35 | 12% | 39 |
| mz.Cork 0.1 | 29 | 10% | 40 |
| dl.BetterWalls 1.0 | 14 | 5% | 19 |
| squidM.TentalceMeleeNano 1.1 | 11 | 4% | 10 |
| sample.MyFirstRobot 1.0 | 8 | 3% | 8 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 74.9 | 129 / 350 | 3.26 | 15.1% | 43912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroD2 0.1 | 1.0 | 15.1% | 129 |
| germ.TheMind .2 | 2.6 | 11.5% | 43 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.6 | 10.8% | 29 |
| EBBU.Sim2 1.02 | 4.4 | 10.2% | 13 |
| agrach.Dalek 1.0 | 5.4 | 10.1% | 46 |
| mb.Beast 0.1 | 6.4 | 9.3% | 33 |
| stelo.UntouchableNano 1.3 | 6.9 | 8.7% | 25 |
| lmk.ACPFinal 0.1 | 7.1 | 8.8% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 8.4 | 8.1% | 0 |
| skm.Ryubot 1.0 | 9.2 | 7.4% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 73.0 | 13 / 35 | 4700 |
| 2 | 1 | 61.8 | 76.8 | 14 / 35 | 4158 |
| 3 | 1 | 61.1 | 72.1 | 11 / 35 | 4379 |
| 4 | 1 | 63.1 | 80.3 | 12 / 35 | 4382 |
| 5 | 1 | 62.0 | 77.1 | 13 / 35 | 4196 |
| 6 | 1 | 62.0 | 77.8 | 13 / 35 | 4197 |
| 7 | 1 | 62.2 | 76.2 | 15 / 35 | 4251 |
| 8 | 1 | 62.0 | 72.7 | 12 / 35 | 4795 |
| 9 | 1 | 60.5 | 69.5 | 11 / 35 | 4435 |
| 10 | 1 | 62.2 | 73.7 | 15 / 35 | 4419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 34 | 59% |
| agrach.Dalek 1.0 | 34 | 71% |
| mb.Beast 0.1 | 32 | 63% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 71% |
| EBBU.Sim2 1.02 | 20 | 75% |
| skm.Ryubot 1.0 | 19 | 74% |
| lmk.ACPFinal 0.1 | 14 | 79% |
| stelo.UntouchableNano 1.3 | 13 | 54% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 228 of 350 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 36 | 16% | 59 |
| agrach.Dalek 1.0 | 33 | 14% | 56 |
| com.syncleus.robocode.Dreadnaught 0.1 | 31 | 14% | 50 |
| lmk.ACPFinal 0.1 | 28 | 12% | 38 |
| mb.Beast 0.1 | 25 | 11% | 42 |
| stelo.UntouchableNano 1.3 | 21 | 9% | 30 |
| EBBU.Sim2 1.02 | 20 | 9% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 8% | 20 |
| skm.Ryubot 1.0 | 15 | 7% | 21 |

## Melee bench: F38

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.3 | 58.8 | 29 / 350 | 4.71 | 11.2% | 28804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.9% | 167 |
| bvh.mini.Freya 0.55 | 2.7 | 13.3% | 40 |
| cs.Wren 1.0 | 3.1 | 12.4% | 33 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.6% | 47 |
| hadur117.nano.SanaroD2 0.1 | 4.6 | 11.2% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.4 | 10.9% | 20 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.3% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.1% | 4 |
| bzdp.BoxCar 2.0 | 9.3 | 4.2% | 0 |
| matt.UnderDark3 2.4.34 | 9.4 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.1 | 60.0 | 2 / 35 | 3144 |
| 2 | 5 | 55.7 | 58.1 | 6 / 35 | 2855 |
| 3 | 4 | 57.6 | 62.5 | 4 / 35 | 3128 |
| 4 | 3 | 56.3 | 59.4 | 6 / 35 | 2959 |
| 5 | 7 | 51.3 | 50.2 | 2 / 35 | 2529 |
| 6 | 4 | 57.8 | 66.0 | 3 / 35 | 2863 |
| 7 | 6 | 51.5 | 52.1 | 1 / 35 | 2361 |
| 8 | 4 | 54.7 | 56.2 | 2 / 35 | 3179 |
| 9 | 3 | 56.7 | 62.9 | 2 / 35 | 2999 |
| 10 | 5 | 55.1 | 60.3 | 1 / 35 | 2787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 33 | 48% |
| bts.mega.Gnarly 1.4 | 10 | 40% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 0% |
| cs.Wren 1.0 | 7 | 71% |
| bvh.mini.Freya 0.55 | 6 | 50% |
| kdf.KoulDestroyer 1.0 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 91 | 28% | 107 |
| bvh.mini.Freya 0.55 | 51 | 16% | 53 |
| cs.Wren 1.0 | 50 | 16% | 55 |
| bts.mega.Gnarly 1.4 | 44 | 14% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 11% | 36 |
| kdf.KoulDestroyer 1.0 | 33 | 10% | 34 |
| bzdp.BoxCar 2.0 | 8 | 2% | 8 |
| matt.UnderDark3 2.4.34 | 6 | 2% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 1% | 3 |

## Melee bench: F39

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 62.2 | 24 / 350 | 4.41 | 11.9% | 32446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 15.5% | 77 |
| az.Ololobot 0.2.4 | 1.9 | 14.7% | 140 |
| hadur117.nano.SanaroD2 0.1 | 3.5 | 11.9% | 24 |
| catcat20.Lambda 0.024 | 3.6 | 11.9% | 54 |
| stelo.SoRobotNanoMelee 1.2 | 5.1 | 9.8% | 33 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 8.5% | 15 |
| apollokidd.ApolloKidd 0.9 | 6.9 | 8.4% | 2 |
| gimp.GimpBot 0.1 | 7.1 | 8.1% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.2% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.4 | 61.0 | 2 / 35 | 2961 |
| 2 | 3 | 55.9 | 62.9 | 2 / 35 | 3260 |
| 3 | 4 | 57.6 | 64.8 | 2 / 35 | 3462 |
| 4 | 3 | 56.4 | 63.2 | 4 / 35 | 3103 |
| 5 | 3 | 57.6 | 67.0 | 2 / 35 | 3360 |
| 6 | 4 | 55.3 | 60.0 | 3 / 35 | 3243 |
| 7 | 3 | 57.2 | 62.5 | 3 / 35 | 3663 |
| 8 | 3 | 56.0 | 62.5 | 2 / 35 | 3279 |
| 9 | 4 | 55.1 | 61.0 | 3 / 35 | 2892 |
| 10 | 4 | 54.4 | 56.8 | 1 / 35 | 3223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 26 | 12% |
| bvh.fry.Freya 0.82 | 19 | 42% |
| catcat20.Lambda 0.024 | 15 | 47% |
| stelo.SoRobotNanoMelee 1.2 | 8 | 38% |
| winamp32.micro.MicroMacro 1.0 | 4 | 25% |
| gimp.GimpBot 0.1 | 2 | 100% |

Hadur died in 326 of 350 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 114 | 35% | 118 |
| az.Ololobot 0.2.4 | 48 | 15% | 51 |
| stelo.SoRobotNanoMelee 1.2 | 37 | 11% | 41 |
| catcat20.Lambda 0.024 | 36 | 11% | 42 |
| apollokidd.ApolloKidd 0.9 | 30 | 9% | 31 |
| winamp32.micro.MicroMacro 1.0 | 25 | 8% | 25 |
| whitesquare.robots.SkynetAdvanced 1.1 | 16 | 5% | 17 |
| gimp.GimpBot 0.1 | 15 | 5% | 20 |
| dcs.Eater_of_Worlds 1.1.3-A | 5 | 2% | 5 |

## Melee bench: F41

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 63.2 | 55 / 350 | 4.31 | 12.4% | 30532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.7% | 159 |
| ary.Swarm 1.1 | 2.5 | 14.0% | 43 |
| lessonz.robocode.Oz 0.5.0 | 3.4 | 13.3% | 43 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 12.4% | 38 |
| hadur117.nano.SanaroD2 0.1 | 4.1 | 12.4% | 55 |
| shrub.Silver v048 | 6.3 | 8.5% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 2 |
| stelo.Mirror 1.1 | 8.0 | 6.5% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 6.1% | 7 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.0 | 67.0 | 6 / 35 | 2837 |
| 2 | 2 | 61.3 | 72.4 | 9 / 35 | 3346 |
| 3 | 4 | 59.7 | 66.0 | 7 / 35 | 3078 |
| 4 | 4 | 56.6 | 57.1 | 5 / 35 | 3309 |
| 5 | 5 | 59.3 | 64.4 | 7 / 35 | 3088 |
| 6 | 4 | 57.3 | 62.5 | 5 / 35 | 2831 |
| 7 | 5 | 55.0 | 56.8 | 3 / 35 | 2862 |
| 8 | 5 | 53.4 | 53.3 | 1 / 35 | 2618 |
| 9 | 4 | 59.2 | 65.1 | 6 / 35 | 3035 |
| 10 | 4 | 60.8 | 67.6 | 6 / 35 | 3528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 36 | 47% |
| lessonz.robocode.Oz 0.5.0 | 19 | 74% |
| simonton.nano.MeleeSeed 1.8 | 17 | 88% |
| ary.Swarm 1.1 | 12 | 67% |
| jsal.Jsalbot 1.0 | 1 | 0% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 295 of 350 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ary.Swarm 1.1 | 81 | 27% | 90 |
| eem.EvBotNG v12.8 | 70 | 24% | 89 |
| lessonz.robocode.Oz 0.5.0 | 54 | 18% | 64 |
| simonton.nano.MeleeSeed 1.8 | 34 | 12% | 48 |
| zyx.nano.Ant 1.1 | 19 | 6% | 20 |
| shrub.Silver v048 | 19 | 6% | 20 |
| stelo.Mirror 1.1 | 11 | 4% | 11 |
| jsal.Jsalbot 1.0 | 4 | 1% | 5 |
| acogdev.alpha 0.2 | 3 | 1% | 3 |

## Melee bench: F42

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 64.3 | 29 / 350 | 4.22 | 12.5% | 35673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.3% | 207 |
| ara.Shera 0.88 | 2.5 | 14.4% | 65 |
| maribo.mini.MiniQuester 0.1 | 2.6 | 14.4% | 43 |
| hadur117.nano.SanaroD2 0.1 | 3.9 | 12.5% | 29 |
| amz.NanoClone 1.41 | 5.2 | 8.9% | 3 |
| maribo.IotaCT 1.1 | 6.1 | 7.8% | 0 |
| dsw.StaticD 1.0 | 6.9 | 7.3% | 3 |
| stelo.MirrorMicro 1.0 | 8.6 | 5.4% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.0 | 68.3 | 9 / 35 | 3421 |
| 2 | 4 | 58.4 | 62.5 | 4 / 35 | 3856 |
| 3 | 4 | 59.7 | 67.6 | 6 / 35 | 3440 |
| 4 | 4 | 55.7 | 57.8 | 1 / 35 | 3383 |
| 5 | 3 | 59.5 | 68.6 | 1 / 35 | 3855 |
| 6 | 4 | 59.1 | 65.4 | 1 / 35 | 3848 |
| 7 | 4 | 59.2 | 66.0 | 3 / 35 | 3641 |
| 8 | 4 | 56.9 | 60.6 | 2 / 35 | 3504 |
| 9 | 4 | 58.4 | 65.1 | 2 / 35 | 3523 |
| 10 | 4 | 56.2 | 60.6 | 0 / 35 | 3202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 43 | 28% |
| ara.Shera 0.88 | 20 | 55% |
| maribo.mini.MiniQuester 0.1 | 7 | 29% |
| amz.NanoClone 1.41 | 3 | 67% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 321 of 350 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 113 | 35% | 124 |
| ara.Shera 0.88 | 79 | 25% | 89 |
| maribo.mini.MiniQuester 0.1 | 70 | 22% | 73 |
| amz.NanoClone 1.41 | 18 | 6% | 19 |
| maribo.IotaCT 1.1 | 13 | 4% | 13 |
| dsw.StaticD 1.0 | 12 | 4% | 15 |
| stelo.MirrorMicro 1.0 | 7 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 6 | 2% | 6 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 4 |

## Melee bench: F43

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.0 | 57.1 | 5 / 350 | 4.86 | 11.1% | 31462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 276 |
| brainfade.melee.Dusk 0.44 | 2.1 | 13.3% | 41 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.2% | 14 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.3% | 8 |
| hadur117.nano.SanaroD2 0.1 | 4.7 | 11.1% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.3% | 5 |
| mz.NanoGod 2.02 | 7.2 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.6 | 53.0 | 1 / 35 | 3063 |
| 2 | 5 | 56.5 | 56.8 | 0 / 35 | 2946 |
| 3 | 6 | 56.2 | 55.2 | 1 / 35 | 3085 |
| 4 | 5 | 57.6 | 58.4 | 0 / 35 | 3284 |
| 5 | 5 | 57.8 | 57.8 | 0 / 35 | 3453 |
| 6 | 4 | 59.4 | 64.1 | 0 / 35 | 3297 |
| 7 | 4 | 57.1 | 55.2 | 2 / 35 | 3078 |
| 8 | 5 | 55.4 | 54.9 | 0 / 35 | 3009 |
| 9 | 4 | 56.2 | 55.6 | 1 / 35 | 3042 |
| 10 | 4 | 58.1 | 60.0 | 0 / 35 | 3205 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 46 | 7% |
| brainfade.melee.Dusk 0.44 | 4 | 50% |
| dummy.micro.Sparrow 2.5 | 2 | 0% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 0% |

Hadur died in 345 of 350 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 141 | 41% | 144 |
| brainfade.melee.Dusk 0.44 | 46 | 13% | 48 |
| dummy.micro.Sparrow 2.5 | 46 | 13% | 46 |
| wcsv.melee.EngineerMelee 0.1 | 39 | 11% | 39 |
| mz.NanoGod 2.02 | 27 | 8% | 27 |
| Krabb.akim2.Akim2 1.1b | 27 | 8% | 27 |
| jab.DiamondStealer 5 | 17 | 5% | 17 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 63.6 | 42 / 350 | 4.28 | 12.8% | 37237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 17.5% | 177 |
| tzu.TheArtOfWar 1.2 | 1.9 | 15.6% | 79 |
| hadur117.nano.SanaroD2 0.1 | 3.1 | 12.8% | 42 |
| jwirde.Gort 2.0 | 4.7 | 10.5% | 29 |
| wompi.Quokka 1.6 | 4.7 | 10.5% | 9 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.6 | 9.3% | 5 |
| disan.Chair 2.2.0 | 7.2 | 7.3% | 5 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.9% | 4 |
| amk.jointstrike.JointStrike 0.2 | 9.1 | 4.9% | 1 |
| sample.Crazy 1.0 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 62.5 | 3 / 35 | 3733 |
| 2 | 3 | 58.6 | 61.9 | 5 / 35 | 3732 |
| 3 | 3 | 57.8 | 61.3 | 2 / 35 | 3682 |
| 4 | 3 | 60.2 | 66.3 | 3 / 35 | 3834 |
| 5 | 3 | 60.6 | 67.6 | 3 / 35 | 4066 |
| 6 | 3 | 57.1 | 62.2 | 3 / 35 | 3316 |
| 7 | 3 | 62.5 | 70.5 | 9 / 35 | 4328 |
| 8 | 3 | 60.0 | 65.7 | 7 / 35 | 3599 |
| 9 | 3 | 59.0 | 64.4 | 4 / 35 | 3721 |
| 10 | 4 | 54.6 | 53.0 | 3 / 35 | 3226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 63 | 29% |
| tzu.TheArtOfWar 1.2 | 27 | 44% |
| wompi.Quokka 1.6 | 8 | 88% |
| jwirde.Gort 2.0 | 4 | 25% |
| disan.Chair 2.2.0 | 3 | 0% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 104 | 34% | 122 |
| tzu.TheArtOfWar 1.2 | 81 | 26% | 95 |
| jwirde.Gort 2.0 | 32 | 10% | 38 |
| wompi.Quokka 1.6 | 32 | 10% | 34 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 19 | 6% | 20 |
| disan.Chair 2.2.0 | 16 | 5% | 14 |
| stf.PanzerGeneral 0.1 | 13 | 4% | 15 |
| amk.jointstrike.JointStrike 0.2 | 10 | 3% | 11 |
| sample.Crazy 1.0 | 1 | 0% | 1 |

## Melee bench: F45

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 61.5 | 34 / 350 | 4.46 | 12.7% | 37243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 1.9 | 13.4% | 185 |
| jje.BagPuss 1.2 | 2.5 | 12.6% | 20 |
| hadur117.nano.SanaroD2 0.1 | 2.7 | 12.7% | 34 |
| sul.Lunar 1.1 | 3.3 | 11.8% | 50 |
| myl.nano.Graviton 1.10 | 5.1 | 10.4% | 16 |
| hvilela.HVilela 0.9 | 6.6 | 9.2% | 6 |
| pez.mini.ChironexFleckeri 0.5 | 6.7 | 9.2% | 14 |
| fm.claire 1.7 | 7.4 | 8.4% | 0 |
| wit.Deep7 2.0 | 8.8 | 6.9% | 25 |
| abud.ThirdRobo 1.0 | 10.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.8 | 58.1 | 3 / 35 | 3512 |
| 2 | 1 | 61.5 | 72.4 | 7 / 35 | 3840 |
| 3 | 2 | 58.7 | 63.8 | 5 / 35 | 3603 |
| 4 | 3 | 55.2 | 56.2 | 4 / 35 | 3518 |
| 5 | 3 | 57.5 | 61.0 | 3 / 35 | 3758 |
| 6 | 5 | 52.9 | 51.4 | 1 / 35 | 3364 |
| 7 | 2 | 58.9 | 65.1 | 5 / 35 | 3851 |
| 8 | 1 | 60.1 | 68.6 | 3 / 35 | 4084 |
| 9 | 3 | 56.9 | 60.3 | 2 / 35 | 3753 |
| 10 | 4 | 56.6 | 58.4 | 1 / 35 | 3960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 47 | 28% |
| sul.Lunar 1.1 | 20 | 30% |
| jje.BagPuss 1.2 | 7 | 71% |
| wit.Deep7 2.0 | 6 | 33% |
| hvilela.HVilela 0.9 | 4 | 75% |
| myl.nano.Graviton 1.10 | 4 | 75% |
| pez.mini.ChironexFleckeri 0.5 | 2 | 100% |

Hadur died in 316 of 350 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 70 | 22% | 92 |
| sul.Lunar 1.1 | 63 | 20% | 81 |
| myl.nano.Graviton 1.10 | 37 | 12% | 46 |
| eem.IWillFireNoBullet v2.8 | 36 | 11% | 0 |
| fm.claire 1.7 | 32 | 10% | 36 |
| hvilela.HVilela 0.9 | 26 | 8% | 30 |
| pez.mini.ChironexFleckeri 0.5 | 24 | 8% | 32 |
| wit.Deep7 2.0 | 20 | 6% | 22 |
| abud.ThirdRobo 1.0 | 8 | 3% | 11 |

## Melee bench: F46

hadur117.nano.SanaroD2 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 65.8 | 22 / 350 | 4.07 | 11.8% | 26748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.0% | 134 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 17.1% | 147 |
| hadur117.nano.SanaroD2 0.1 | 3.4 | 11.8% | 22 |
| cx.Princess 1.0 | 4.2 | 11.1% | 32 |
| mz.MicroSheep 1.0 | 4.4 | 10.9% | 6 |
| sadoner.killer 0.2 | 6.1 | 9.1% | 5 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.5% | 3 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.5 | 64.8 | 2 / 35 | 2707 |
| 2 | 3 | 56.5 | 65.7 | 0 / 35 | 2721 |
| 3 | 3 | 57.7 | 67.3 | 2 / 35 | 2769 |
| 4 | 3 | 57.7 | 67.0 | 2 / 35 | 2559 |
| 5 | 3 | 58.4 | 69.5 | 3 / 35 | 2765 |
| 6 | 4 | 55.4 | 59.0 | 1 / 35 | 2717 |
| 7 | 3 | 57.3 | 64.4 | 5 / 35 | 2588 |
| 8 | 5 | 54.9 | 61.0 | 1 / 35 | 2273 |
| 9 | 3 | 59.0 | 69.2 | 4 / 35 | 2835 |
| 10 | 3 | 58.9 | 70.5 | 2 / 35 | 2814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 46 | 35% |
| rsalesc.melee.Medina 0.4.5 | 20 | 15% |
| cx.Princess 1.0 | 4 | 0% |
| arthord.NanoSatanMelee Beta | 3 | 33% |
| sadoner.killer 0.2 | 2 | 50% |
| mz.MicroSheep 1.0 | 1 | 0% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 328 of 350 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 136 | 41% | 151 |
| rsalesc.melee.Medina 0.4.5 | 86 | 26% | 88 |
| cx.Princess 1.0 | 29 | 9% | 30 |
| mz.MicroSheep 1.0 | 24 | 7% | 25 |
| sadoner.killer 0.2 | 22 | 7% | 24 |
| arthord.NanoSatanMelee Beta | 18 | 5% | 18 |
| jeremyreeder.collective.Prophet 5 | 11 | 3% | 12 |
| kurios.DOSexe .9a | 1 | 0% | 1 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |

