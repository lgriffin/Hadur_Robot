# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 75.4 | 59 / 350 | 3.21 | 14.0% | 35520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 230 |
| hadur117.nano.SanaroS2 0.2 | 2.0 | 14.0% | 59 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.9 | 11.5% | 11 |
| sgp.JollyNinja 3.53 | 3.9 | 11.7% | 29 |
| mz.MicroGodMelee 1 | 4.5 | 11.1% | 10 |
| lorneswork.Predator 1.0 | 5.7 | 9.7% | 5 |
| adt.Ar2 1.0 | 7.1 | 7.5% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.9% | 3 |
| skm.butterfly 1.0 | 8.9 | 4.9% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 71.7 | 7 / 35 | 3257 |
| 2 | 2 | 61.6 | 75.9 | 9 / 35 | 3327 |
| 3 | 2 | 61.3 | 73.3 | 3 / 35 | 3700 |
| 4 | 2 | 63.7 | 82.2 | 9 / 35 | 3603 |
| 5 | 2 | 60.8 | 72.7 | 5 / 35 | 3756 |
| 6 | 2 | 63.5 | 80.0 | 8 / 35 | 3688 |
| 7 | 2 | 60.8 | 73.3 | 4 / 35 | 3578 |
| 8 | 2 | 60.6 | 72.1 | 3 / 35 | 3705 |
| 9 | 2 | 61.6 | 78.1 | 4 / 35 | 3132 |
| 10 | 2 | 62.2 | 74.6 | 7 / 35 | 3774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 148 | 14% |
| sgp.JollyNinja 3.53 | 20 | 65% |
| mz.MicroGodMelee 1 | 15 | 80% |
| lorneswork.Predator 1.0 | 8 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 71% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 155 | 53% | 179 |
| sgp.JollyNinja 3.53 | 49 | 17% | 62 |
| lorneswork.Predator 1.0 | 29 | 10% | 34 |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 9% | 28 |
| mz.MicroGodMelee 1 | 19 | 7% | 30 |
| adt.Ar2 1.0 | 8 | 3% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 1% | 6 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |
| skm.butterfly 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 66.1 | 57 / 350 | 4.05 | 13.4% | 37681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.7 | 15.1% | 110 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.9 | 14.3% | 69 |
| hadur117.nano.SanaroS2 0.2 | 2.8 | 13.4% | 57 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 11.7% | 7 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.8% | 28 |
| sch.Simone 0.3d | 6.8 | 8.2% | 30 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.9% | 5 |
| Noran.BitchingElk 0.054 | 7.3 | 7.9% | 27 |
| stelo.PatternRobot 1.0 | 9.0 | 6.1% | 11 |
| fullsail.SweetTea 1.1 | 9.9 | 4.6% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.7 | 60.0 | 4 / 35 | 3484 |
| 2 | 3 | 60.0 | 67.9 | 5 / 35 | 3753 |
| 3 | 5 | 53.8 | 52.4 | 3 / 35 | 3339 |
| 4 | 3 | 60.9 | 69.5 | 7 / 35 | 3917 |
| 5 | 3 | 60.1 | 67.3 | 9 / 35 | 3503 |
| 6 | 2 | 62.0 | 74.3 | 6 / 35 | 3910 |
| 7 | 2 | 60.6 | 69.8 | 5 / 35 | 4032 |
| 8 | 3 | 58.1 | 61.0 | 5 / 35 | 3976 |
| 9 | 2 | 62.5 | 75.9 | 5 / 35 | 3992 |
| 10 | 2 | 58.7 | 62.5 | 8 / 35 | 3775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 50 | 36% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 39 | 33% |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 67% |
| sch.Simone 0.3d | 18 | 22% |
| Noran.BitchingElk 0.054 | 10 | 30% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 4 | 50% |
| fullsail.SweetTea 1.1 | 1 | 0% |
| stelo.PatternRobot 1.0 | 1 | 0% |

Hadur died in 293 of 350 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 77 | 26% | 94 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 66 | 23% | 81 |
| lrem.micro.SpikeSoldier 0.4 | 34 | 12% | 36 |
| com.cohesiva.robocode.ManOwaR 1.0 | 29 | 10% | 40 |
| sch.Simone 0.3d | 24 | 8% | 29 |
| fnc.bandit.Bandit 5.2.0 | 20 | 7% | 22 |
| stelo.PatternRobot 1.0 | 19 | 6% | 19 |
| Noran.BitchingElk 0.054 | 15 | 5% | 20 |
| fullsail.SweetTea 1.1 | 9 | 3% | 9 |

## Melee bench: F03

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 77.7 | 83 / 350 | 3.01 | 14.7% | 38967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.7 | 15.2% | 94 |
| hadur117.nano.SanaroS2 0.2 | 2.5 | 14.7% | 83 |
| kawigi.nano.Lib 1.0 | 2.6 | 14.7% | 85 |
| vuen.Cake 2.51 | 3.2 | 13.6% | 69 |
| urdos.URDOS 1.3 | 5.0 | 10.4% | 14 |
| adt.Ar1 2.1 | 6.3 | 7.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.1 | 6.9% | 3 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.5% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.9 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 83.5 | 12 / 35 | 4155 |
| 2 | 2 | 62.7 | 77.5 | 8 / 35 | 3972 |
| 3 | 3 | 62.2 | 75.6 | 8 / 35 | 4029 |
| 4 | 3 | 62.1 | 78.7 | 8 / 35 | 3496 |
| 5 | 2 | 62.6 | 79.0 | 6 / 35 | 3910 |
| 6 | 2 | 61.6 | 76.2 | 12 / 35 | 3559 |
| 7 | 3 | 61.5 | 74.6 | 6 / 35 | 4014 |
| 8 | 4 | 61.8 | 72.4 | 8 / 35 | 4027 |
| 9 | 2 | 64.4 | 85.7 | 11 / 35 | 3729 |
| 10 | 3 | 61.1 | 73.7 | 4 / 35 | 4076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 60 | 57% |
| radnor.DoctorBob 1.42 | 53 | 51% |
| kawigi.nano.Lib 1.0 | 45 | 18% |
| urdos.URDOS 1.3 | 14 | 50% |
| adt.Ar1 2.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 268 of 350 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 89 | 33% | 97 |
| radnor.DoctorBob 1.42 | 66 | 25% | 87 |
| vuen.Cake 2.51 | 43 | 16% | 79 |
| urdos.URDOS 1.3 | 43 | 16% | 50 |
| adt.Ar1 2.1 | 8 | 3% | 10 |
| oa.weak.FlyMk1 0.1 | 7 | 3% | 9 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 5 | 2% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 5 | 2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 1% | 1 |

## Melee bench: F04

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 72.2 | 11 / 350 | 3.50 | 13.9% | 42934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 324 |
| apc.LeeroyJenkins2 1.0 | 2.4 | 13.9% | 9 |
| hadur117.nano.SanaroS2 0.2 | 2.6 | 13.9% | 11 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 5 |
| josago.Jorgito 0.16 | 5.1 | 9.0% | 0 |
| css.Delitioner 0.11 | 5.9 | 7.8% | 1 |
| tj.zombie1n 1.0.1 | 7.2 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 8.9 | 4.7% | 0 |
| spin.Bugstard 0.012b | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 72.1 | 0 / 35 | 4230 |
| 2 | 2 | 65.5 | 82.2 | 1 / 35 | 4677 |
| 3 | 2 | 63.2 | 75.2 | 2 / 35 | 4227 |
| 4 | 3 | 61.4 | 69.2 | 1 / 35 | 4251 |
| 5 | 3 | 62.2 | 70.2 | 1 / 35 | 4387 |
| 6 | 3 | 61.0 | 67.9 | 1 / 35 | 4076 |
| 7 | 3 | 60.3 | 65.7 | 0 / 35 | 4198 |
| 8 | 2 | 62.3 | 71.7 | 1 / 35 | 4261 |
| 9 | 3 | 61.4 | 69.2 | 2 / 35 | 4176 |
| 10 | 2 | 64.2 | 78.4 | 2 / 35 | 4451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 133 | 2% |
| apc.LeeroyJenkins2 1.0 | 5 | 80% |
| TNT.TNT 0.99.1 | 3 | 33% |
| josago.Jorgito 0.16 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 339 of 350 rounds, at a mean tick of 1083. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 214 | 63% | 217 |
| apc.LeeroyJenkins2 1.0 | 61 | 18% | 65 |
| josago.Jorgito 0.16 | 23 | 7% | 25 |
| TNT.TNT 0.99.1 | 18 | 5% | 19 |
| css.Delitioner 0.11 | 11 | 3% | 12 |
| tj.zombie1n 1.0.1 | 7 | 2% | 7 |
| rampancy.Durandal 2.1d | 4 | 1% | 4 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 69.4 | 84 / 350 | 3.75 | 13.6% | 33147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.4 | 15.5% | 79 |
| origin.SleepSiphon 1.7b | 2.5 | 14.4% | 106 |
| hadur117.nano.SanaroS2 0.2 | 2.9 | 13.6% | 84 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.0% | 47 |
| mld.Wisdom 1.0 | 4.7 | 11.0% | 13 |
| gg.Wolverine 2.0 | 6.5 | 8.6% | 8 |
| spinnercat.Omen 1.0 | 7.4 | 7.7% | 5 |
| DBall.NUKE 0.1 | 7.7 | 7.4% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.7% | 6 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 61.0 | 5 / 35 | 2974 |
| 2 | 2 | 62.0 | 72.7 | 12 / 35 | 3697 |
| 3 | 2 | 62.4 | 73.3 | 10 / 35 | 3640 |
| 4 | 1 | 63.5 | 77.1 | 15 / 35 | 3609 |
| 5 | 5 | 57.2 | 62.5 | 6 / 35 | 3130 |
| 6 | 3 | 58.5 | 64.8 | 7 / 35 | 3147 |
| 7 | 3 | 59.7 | 69.8 | 6 / 35 | 3226 |
| 8 | 2 | 62.7 | 77.1 | 10 / 35 | 3379 |
| 9 | 4 | 59.3 | 67.0 | 6 / 35 | 3303 |
| 10 | 3 | 59.8 | 68.9 | 7 / 35 | 3042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 53 | 42% |
| jekl.StoneGhost 0.7 | 41 | 66% |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 50% |
| gg.Wolverine 2.0 | 8 | 38% |
| DBall.NUKE 0.1 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 83% |
| mld.Wisdom 1.0 | 6 | 83% |
| spinnercat.Omen 1.0 | 5 | 60% |

Hadur died in 268 of 350 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 82 | 31% | 104 |
| origin.SleepSiphon 1.7b | 63 | 24% | 87 |
| pe.minimelee.SandboxMiniMelee 1.1 | 42 | 16% | 57 |
| mld.Wisdom 1.0 | 39 | 15% | 43 |
| gg.Wolverine 2.0 | 20 | 7% | 21 |
| spinnercat.Omen 1.0 | 10 | 4% | 12 |
| DBall.NUKE 0.1 | 6 | 2% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 2% | 12 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 82.7 | 94 / 350 | 2.55 | 16.4% | 46084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.3 | 17.6% | 98 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.5% | 95 |
| hadur117.nano.SanaroS2 0.2 | 2.9 | 16.4% | 94 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.7% | 21 |
| franzor.Lizt 1.3.1 | 4.7 | 11.4% | 42 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 68.0 | 87.0 | 15 / 35 | 4315 |
| 2 | 3 | 67.0 | 82.9 | 9 / 35 | 4576 |
| 3 | 3 | 66.7 | 81.6 | 8 / 35 | 4608 |
| 4 | 3 | 65.2 | 78.4 | 8 / 35 | 4264 |
| 5 | 3 | 65.8 | 82.9 | 8 / 35 | 4390 |
| 6 | 2 | 68.8 | 85.7 | 13 / 35 | 5220 |
| 7 | 3 | 67.8 | 84.4 | 11 / 35 | 4816 |
| 8 | 3 | 66.8 | 81.9 | 8 / 35 | 4871 |
| 9 | 3 | 66.4 | 81.6 | 6 / 35 | 4638 |
| 10 | 3 | 66.0 | 81.0 | 8 / 35 | 4386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 100 | 55% |
| rsalesc.melee.Monk 0.3.6c | 49 | 20% |
| oog.melee.CapuletDroid 1.1 | 31 | 65% |
| franzor.Lizt 1.3.1 | 22 | 32% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 257 of 350 rounds, at a mean tick of 1411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 116 | 45% | 183 |
| rsalesc.melee.Monk 0.3.6c | 85 | 33% | 105 |
| oog.melee.CapuletDroid 1.1 | 32 | 12% | 47 |
| franzor.Lizt 1.3.1 | 17 | 7% | 3 |
| exauge.GateKeeper 1.1.121g | 5 | 2% | 8 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 72.8 | 98 / 350 | 3.45 | 14.3% | 34215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.5 | 14.3% | 98 |
| shrub.Vapour v159 | 2.2 | 13.9% | 82 |
| tm.Yuugao 1.0 | 2.5 | 13.2% | 67 |
| Krabb.sliNk.Garm 0.9u | 3.9 | 11.2% | 36 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.8% | 32 |
| m3thos.Eva00 1.1 | 6.1 | 9.3% | 14 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.8% | 16 |
| SHAM.WOW 1.4 | 8.8 | 6.8% | 2 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.4% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 6.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 71.7 | 11 / 35 | 3240 |
| 2 | 3 | 59.0 | 68.3 | 9 / 35 | 3121 |
| 3 | 1 | 59.2 | 68.9 | 6 / 35 | 3555 |
| 4 | 2 | 62.1 | 77.1 | 7 / 35 | 3573 |
| 5 | 2 | 59.8 | 68.6 | 11 / 35 | 3349 |
| 6 | 1 | 59.3 | 71.7 | 9 / 35 | 2941 |
| 7 | 1 | 61.5 | 73.0 | 11 / 35 | 3551 |
| 8 | 1 | 62.3 | 77.8 | 10 / 35 | 3623 |
| 9 | 1 | 60.9 | 74.3 | 7 / 35 | 3625 |
| 10 | 1 | 63.3 | 76.5 | 17 / 35 | 3637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 60 | 52% |
| shrub.Vapour v159 | 52 | 38% |
| Krabb.sliNk.Garm 0.9u | 18 | 83% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 53% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 85% |
| m3thos.Eva00 1.1 | 10 | 50% |
| SHAM.WOW 1.4 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 252 of 350 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 69 | 27% | 92 |
| tm.Yuugao 1.0 | 60 | 24% | 96 |
| com.spp.robocode.MostlyHarmless 010 | 32 | 13% | 42 |
| jwst.DAD.DarkAndDarker 1.1 | 25 | 10% | 32 |
| Krabb.sliNk.Garm 0.9u | 22 | 9% | 33 |
| m3thos.Eva00 1.1 | 19 | 8% | 22 |
| zyx.nano.BacillusComma 1.0 | 15 | 6% | 17 |
| qualidafial.MajorDick 1.0.1 | 7 | 3% | 6 |
| SHAM.WOW 1.4 | 3 | 1% | 10 |

## Melee bench: F09

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 61.7 | 36 / 350 | 4.45 | 11.8% | 28069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.9% | 187 |
| kc.micro.Figment 1.0 | 2.0 | 15.2% | 67 |
| hadur117.nano.SanaroS2 0.2 | 3.7 | 11.8% | 36 |
| yagami.Tidus 0.11 | 4.4 | 10.9% | 10 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.9% | 25 |
| mc2.enemy.Original 0.9 | 5.4 | 9.4% | 19 |
| dft.Calliope 5.6 | 6.8 | 7.9% | 5 |
| step.nanoPri 1.0 | 8.5 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.1 | 5.2% | 1 |
| rdm.Dueler 0.4x | 9.4 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 66.3 | 5 / 35 | 3067 |
| 2 | 4 | 54.5 | 57.8 | 3 / 35 | 2606 |
| 3 | 4 | 56.7 | 61.0 | 3 / 35 | 2903 |
| 4 | 3 | 57.8 | 64.8 | 3 / 35 | 2912 |
| 5 | 3 | 57.6 | 64.4 | 4 / 35 | 2898 |
| 6 | 4 | 54.8 | 58.4 | 2 / 35 | 2629 |
| 7 | 5 | 56.5 | 61.6 | 4 / 35 | 2660 |
| 8 | 3 | 58.3 | 65.7 | 6 / 35 | 2839 |
| 9 | 4 | 55.2 | 58.4 | 3 / 35 | 2718 |
| 10 | 4 | 55.7 | 58.7 | 3 / 35 | 2837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 72 | 15% |
| kc.micro.Figment 1.0 | 23 | 52% |
| mc2.enemy.Original 0.9 | 10 | 70% |
| pedersen.Grishnakh 1.0 | 5 | 20% |
| yagami.Tidus 0.11 | 3 | 67% |
| dft.Calliope 5.6 | 2 | 50% |
| robar.nano.Assertive_Melee 0.2 | 1 | 0% |

Hadur died in 314 of 350 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 108 | 34% | 121 |
| kc.micro.Figment 1.0 | 63 | 20% | 75 |
| pedersen.Grishnakh 1.0 | 36 | 11% | 37 |
| yagami.Tidus 0.11 | 34 | 11% | 37 |
| mc2.enemy.Original 0.9 | 29 | 9% | 35 |
| dft.Calliope 5.6 | 21 | 7% | 22 |
| robar.nano.Assertive_Melee 0.2 | 10 | 3% | 10 |
| step.nanoPri 1.0 | 7 | 2% | 7 |
| rdm.Dueler 0.4x | 6 | 2% | 6 |

## Melee bench: F10

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 78.1 | 93 / 350 | 2.97 | 15.1% | 39830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.6 | 15.1% | 93 |
| DTF.Kludgy 1.2b | 1.9 | 14.9% | 88 |
| ne.Chimera 1.2 | 2.8 | 14.1% | 50 |
| ejb.Polaris 1.0.1 | 3.8 | 12.9% | 49 |
| tvv.micro.Antares 1.1.1 | 5.0 | 11.2% | 46 |
| vStar.RAFzilla 2.15 | 5.9 | 10.1% | 15 |
| sam.Samspin 1.0 | 7.7 | 6.2% | 5 |
| kurios.DOSexe .9b | 8.3 | 5.5% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.8% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 77.5 | 5 / 35 | 3955 |
| 2 | 3 | 62.1 | 75.2 | 9 / 35 | 3712 |
| 3 | 1 | 63.0 | 76.5 | 12 / 35 | 3922 |
| 4 | 2 | 62.5 | 76.2 | 12 / 35 | 3954 |
| 5 | 2 | 63.8 | 77.8 | 6 / 35 | 4491 |
| 6 | 1 | 62.7 | 76.8 | 9 / 35 | 3839 |
| 7 | 1 | 64.0 | 80.6 | 11 / 35 | 3980 |
| 8 | 1 | 63.4 | 79.7 | 8 / 35 | 4102 |
| 9 | 1 | 62.4 | 76.8 | 11 / 35 | 3823 |
| 10 | 1 | 64.8 | 84.1 | 10 / 35 | 4052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 47 | 40% |
| ejb.Polaris 1.0.1 | 46 | 78% |
| ne.Chimera 1.2 | 36 | 44% |
| tvv.micro.Antares 1.1.1 | 23 | 22% |
| vStar.RAFzilla 2.15 | 20 | 60% |
| kurios.DOSexe .9b | 4 | 25% |
| sam.Samspin 1.0 | 4 | 50% |
| donjezza.Muncho 1.0 | 2 | 100% |

Hadur died in 257 of 350 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ne.Chimera 1.2 | 78 | 30% | 97 |
| DTF.Kludgy 1.2b | 74 | 29% | 89 |
| tvv.micro.Antares 1.1.1 | 36 | 14% | 38 |
| ejb.Polaris 1.0.1 | 35 | 14% | 69 |
| kurios.DOSexe .9b | 11 | 4% | 16 |
| sam.Samspin 1.0 | 10 | 4% | 12 |
| vStar.RAFzilla 2.15 | 9 | 4% | 22 |
| donjezza.Muncho 1.0 | 2 | 1% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 1% | 2 |

## Melee bench: F11

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 65.1 | 44 / 350 | 4.14 | 12.6% | 31854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.3% | 156 |
| cx.mini.Nimrod 0.55 | 2.4 | 12.9% | 40 |
| hadur117.nano.SanaroS2 0.2 | 2.8 | 12.6% | 44 |
| djc.DynaBot 0.1.1 | 3.9 | 11.2% | 26 |
| rdt199.Warlord 0.73 | 5.4 | 9.9% | 33 |
| uji.YellohFellah 1.0 | 6.3 | 9.0% | 28 |
| br2.MobyDickBot 1.6 | 6.5 | 9.1% | 20 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.6% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.7 | 63.5 | 3 / 35 | 2917 |
| 2 | 2 | 59.5 | 70.2 | 4 / 35 | 3366 |
| 3 | 2 | 58.4 | 64.4 | 7 / 35 | 3259 |
| 4 | 2 | 60.2 | 69.8 | 5 / 35 | 3490 |
| 5 | 3 | 57.2 | 63.2 | 5 / 35 | 3140 |
| 6 | 4 | 54.7 | 57.5 | 2 / 35 | 3035 |
| 7 | 4 | 56.6 | 61.0 | 7 / 35 | 3173 |
| 8 | 3 | 55.2 | 59.0 | 2 / 35 | 2906 |
| 9 | 3 | 58.8 | 66.0 | 6 / 35 | 3297 |
| 10 | 2 | 61.4 | 76.5 | 3 / 35 | 3271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 53 | 25% |
| uji.YellohFellah 1.0 | 15 | 33% |
| djc.DynaBot 0.1.1 | 13 | 77% |
| cx.mini.Nimrod 0.55 | 13 | 54% |
| rdt199.Warlord 0.73 | 8 | 75% |
| br2.MobyDickBot 1.6 | 7 | 43% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 307 of 350 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 126 | 41% | 136 |
| cx.mini.Nimrod 0.55 | 52 | 17% | 58 |
| rdt199.Warlord 0.73 | 38 | 12% | 46 |
| uji.YellohFellah 1.0 | 24 | 8% | 29 |
| djc.DynaBot 0.1.1 | 20 | 7% | 31 |
| br2.MobyDickBot 1.6 | 20 | 7% | 24 |
| KiraNL.Chupacabra 0.4 | 9 | 3% | 9 |
| stelo.MirrorNano 1.3 | 9 | 3% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 3% | 8 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 68.2 | 64 / 350 | 3.86 | 12.9% | 27453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.7 | 14.2% | 78 |
| nat.PallasHawk 1.0 | 1.9 | 14.1% | 94 |
| darkcanuck.Leon 1.01 | 3.0 | 13.4% | 57 |
| hadur117.nano.SanaroS2 0.2 | 3.5 | 12.9% | 64 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.9% | 39 |
| jrm.Test0 1.0 | 6.4 | 8.3% | 4 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.4% | 2 |
| jp.Perpy 16.0 | 7.6 | 7.3% | 2 |
| jaybot.bots.Oddball 4.0 | 8.8 | 6.1% | 9 |
| stuff.Vlad 0.1 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 65.4 | 6 / 35 | 2882 |
| 2 | 4 | 59.4 | 72.7 | 5 / 35 | 2732 |
| 3 | 3 | 60.3 | 72.7 | 10 / 35 | 2743 |
| 4 | 4 | 57.7 | 67.0 | 5 / 35 | 2675 |
| 5 | 3 | 60.0 | 71.1 | 7 / 35 | 3002 |
| 6 | 4 | 57.2 | 65.1 | 7 / 35 | 2570 |
| 7 | 2 | 60.2 | 74.6 | 7 / 35 | 2751 |
| 8 | 5 | 55.8 | 61.3 | 4 / 35 | 2713 |
| 9 | 2 | 59.9 | 70.5 | 11 / 35 | 2747 |
| 10 | 4 | 55.3 | 61.6 | 2 / 35 | 2638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 47 | 28% |
| bts.wiki.RipCurl 0.9b | 44 | 52% |
| darkcanuck.Leon 1.01 | 31 | 48% |
| brainfade.melee.Genghis 0.36 | 11 | 45% |
| jaybot.bots.Oddball 4.0 | 5 | 0% |
| jrm.Test0 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 69 | 24% | 84 |
| bts.wiki.RipCurl 0.9b | 54 | 19% | 77 |
| darkcanuck.Leon 1.01 | 54 | 19% | 70 |
| brainfade.melee.Genghis 0.36 | 37 | 13% | 38 |
| jrm.Test0 1.0 | 25 | 9% | 25 |
| jp.Perpy 16.0 | 17 | 6% | 17 |
| cs.sheldor.Talon 1.1 | 13 | 5% | 18 |
| jaybot.bots.Oddball 4.0 | 12 | 4% | 14 |
| stuff.Vlad 0.1 | 5 | 2% | 7 |

## Melee bench: F13

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 71.6 | 49 / 350 | 3.56 | 13.1% | 31550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.3% | 157 |
| ags.Glacier 0.2.11 | 1.7 | 16.3% | 80 |
| hadur117.nano.SanaroS2 0.2 | 3.7 | 13.1% | 49 |
| shinh.Entangled 0.3 | 3.9 | 12.5% | 37 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.3% | 25 |
| apc.Colossus2 0.17 | 6.2 | 8.4% | 0 |
| stelo.Wang 1.0 | 6.9 | 7.1% | 3 |
| ayk.WallHugger 1.0 | 7.9 | 5.5% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 67.0 | 3 / 35 | 2872 |
| 2 | 4 | 58.7 | 67.9 | 5 / 35 | 2936 |
| 3 | 4 | 62.0 | 74.6 | 5 / 35 | 3528 |
| 4 | 3 | 61.9 | 76.5 | 8 / 35 | 3129 |
| 5 | 3 | 61.2 | 74.0 | 6 / 35 | 3369 |
| 6 | 3 | 60.3 | 71.1 | 5 / 35 | 3290 |
| 7 | 5 | 60.8 | 74.3 | 5 / 35 | 3011 |
| 8 | 3 | 61.1 | 73.0 | 6 / 35 | 3415 |
| 9 | 4 | 59.2 | 69.2 | 1 / 35 | 3174 |
| 10 | 4 | 58.4 | 67.9 | 5 / 35 | 2826 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 84 | 38% |
| ags.Glacier 0.2.11 | 37 | 14% |
| shinh.Entangled 0.3 | 13 | 8% |
| gh.micro.Gruweltje 0.7 | 11 | 64% |
| stelo.Wang 1.0 | 6 | 67% |

Hadur died in 302 of 350 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 89 | 29% | 118 |
| ags.Glacier 0.2.11 | 83 | 27% | 88 |
| shinh.Entangled 0.3 | 48 | 16% | 51 |
| gh.micro.Gruweltje 0.7 | 44 | 15% | 52 |
| stelo.Wang 1.0 | 15 | 5% | 19 |
| maribo.FollowFire 1 | 10 | 3% | 10 |
| apc.Colossus2 0.17 | 8 | 3% | 8 |
| ayk.WallHugger 1.0 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 74.1 | 84 / 350 | 3.33 | 14.1% | 33644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.3% | 137 |
| hadur117.nano.SanaroS2 0.2 | 2.0 | 14.1% | 84 |
| catcat20.shape.Theta 0.018 | 3.1 | 12.8% | 71 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 10.3% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.4% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.4 | 10.2% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 6.2 | 9.8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.7% | 15 |
| pa.Improved 1.0 | 8.9 | 5.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 72.7 | 12 / 35 | 3458 |
| 2 | 2 | 59.5 | 68.9 | 8 / 35 | 3262 |
| 3 | 2 | 59.9 | 70.2 | 7 / 35 | 3241 |
| 4 | 2 | 61.0 | 73.7 | 10 / 35 | 3108 |
| 5 | 2 | 62.9 | 79.4 | 9 / 35 | 3454 |
| 6 | 2 | 63.9 | 81.3 | 8 / 35 | 3601 |
| 7 | 2 | 61.3 | 72.7 | 5 / 35 | 3525 |
| 8 | 2 | 60.5 | 71.4 | 9 / 35 | 3156 |
| 9 | 2 | 60.8 | 72.1 | 8 / 35 | 3213 |
| 10 | 2 | 63.5 | 79.0 | 8 / 35 | 3626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 85 | 47% |
| catcat20.shape.Theta 0.018 | 47 | 47% |
| Lo_Ian.Gandalf_V4 4.0 | 10 | 60% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| sanyi.mikrobi.Roberto 1.0 | 8 | 63% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 13% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 80% |

Hadur died in 266 of 350 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 99 | 37% | 138 |
| catcat20.shape.Theta 0.018 | 55 | 21% | 67 |
| dmh.robocode.robot.RedDwarf 0.4 | 31 | 12% | 38 |
| sanyi.mikrobi.Roberto 1.0 | 26 | 10% | 40 |
| Lo_Ian.Gandalf_V4 4.0 | 22 | 8% | 29 |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 6% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 5% | 19 |
| sample.TrackFire 1.0 | 2 | 1% | 4 |
| pa.Improved 1.0 | 2 | 1% | 3 |

## Melee bench: F15

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 64.8 | 50 / 350 | 4.17 | 12.9% | 35559 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.1 | 15.2% | 87 |
| emp.Yngwie 1.11 | 2.3 | 14.0% | 96 |
| mld.DustBunny 3.8 | 3.2 | 13.1% | 42 |
| hadur117.nano.SanaroS2 0.2 | 3.7 | 12.9% | 50 |
| cb.nano.Insomnia 1.0 | 5.1 | 11.0% | 29 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.1% | 41 |
| Grystrion.TrackerWO 1.0 | 7.4 | 7.0% | 1 |
| lambdaxy.TBot 0.1 | 7.8 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 8.9 | 5.7% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 68.9 | 5 / 35 | 3730 |
| 2 | 3 | 60.1 | 69.5 | 9 / 35 | 3323 |
| 3 | 4 | 57.5 | 60.0 | 4 / 35 | 3653 |
| 4 | 4 | 58.9 | 63.5 | 5 / 35 | 3859 |
| 5 | 4 | 57.2 | 63.2 | 3 / 35 | 3341 |
| 6 | 4 | 58.9 | 66.7 | 5 / 35 | 3188 |
| 7 | 3 | 58.4 | 63.8 | 5 / 35 | 3677 |
| 8 | 5 | 56.5 | 58.7 | 4 / 35 | 3401 |
| 9 | 4 | 58.6 | 64.8 | 3 / 35 | 3710 |
| 10 | 3 | 60.2 | 68.6 | 7 / 35 | 3677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 33 | 48% |
| kawigi.micro.Shiz 1.1 | 31 | 39% |
| mld.DustBunny 3.8 | 18 | 0% |
| kawigi.robot.Girl 1.2 | 16 | 81% |
| cb.nano.Insomnia 1.0 | 10 | 40% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 301 of 350 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 70 | 23% | 91 |
| kawigi.micro.Shiz 1.1 | 63 | 21% | 75 |
| mld.DustBunny 3.8 | 56 | 19% | 62 |
| cb.nano.Insomnia 1.0 | 45 | 15% | 43 |
| Grystrion.TrackerWO 1.0 | 21 | 7% | 21 |
| kawigi.robot.Girl 1.2 | 20 | 7% | 28 |
| lambdaxy.TBot 0.1 | 14 | 5% | 14 |
| divineomega.TrialBot 0.003 | 9 | 3% | 12 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 1% | 4 |

## Melee bench: F16

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 69.1 | 52 / 350 | 3.78 | 13.7% | 37857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.2% | 161 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.4 | 14.4% | 19 |
| hadur117.nano.SanaroS2 0.2 | 2.7 | 13.7% | 52 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.3% | 76 |
| tvv.nano.Polaris 1.2 | 5.1 | 10.1% | 34 |
| bvh.fnr.Fenrir 0.36l | 6.0 | 9.2% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 8.0% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 5.2% | 0 |
| asd.Cthulhu 1.3 | 9.1 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.1 | 4.9% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 66.7 | 5 / 35 | 3686 |
| 2 | 3 | 59.6 | 67.0 | 5 / 35 | 3478 |
| 3 | 3 | 60.4 | 68.3 | 3 / 35 | 3776 |
| 4 | 3 | 58.5 | 62.9 | 4 / 35 | 3401 |
| 5 | 2 | 63.2 | 75.2 | 6 / 35 | 4175 |
| 6 | 2 | 63.0 | 76.2 | 6 / 35 | 4095 |
| 7 | 2 | 62.1 | 71.7 | 5 / 35 | 4125 |
| 8 | 3 | 60.6 | 68.9 | 4 / 35 | 3618 |
| 9 | 3 | 60.9 | 67.6 | 7 / 35 | 3767 |
| 10 | 3 | 60.2 | 67.0 | 7 / 35 | 3736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 85 | 21% |
| techdude.forest.FlamingForest 1.1 | 17 | 29% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 75% |
| tvv.nano.Polaris 1.2 | 10 | 30% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| asd.Cthulhu 1.3 | 2 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 1223. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 138 | 46% | 161 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 57 | 19% | 65 |
| techdude.forest.FlamingForest 1.1 | 29 | 10% | 35 |
| tvv.nano.Polaris 1.2 | 26 | 9% | 28 |
| bvh.fnr.Fenrir 0.36l | 25 | 8% | 28 |
| stelo.IntrinsicVolatility 1.4 | 14 | 5% | 18 |
| asd.Cthulhu 1.3 | 5 | 2% | 7 |
| divineomega.DivineBot 1.9.4.5 | 2 | 1% | 7 |
| repositorio.NanoStep 1.0 | 2 | 1% | 1 |

## Melee bench: F17

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 69.6 | 66 / 350 | 3.73 | 13.6% | 35456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.1 | 14.3% | 75 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.8% | 89 |
| hadur117.nano.SanaroS2 0.2 | 2.8 | 13.6% | 66 |
| cx.BlestPain 1.41 | 3.6 | 12.6% | 57 |
| nic.Nicator 2.4 | 4.6 | 11.8% | 31 |
| ahf.NanoAndrew .4 | 5.4 | 11.0% | 28 |
| maribo.melee.BMV 0.1 | 7.0 | 9.1% | 5 |
| tex.Longbot 0.4 | 8.3 | 5.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.2% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 77.8 | 7 / 35 | 3764 |
| 2 | 3 | 60.0 | 68.6 | 7 / 35 | 3334 |
| 3 | 6 | 55.1 | 59.4 | 4 / 35 | 2807 |
| 4 | 3 | 60.3 | 70.8 | 5 / 35 | 3283 |
| 5 | 1 | 64.2 | 79.7 | 12 / 35 | 3889 |
| 6 | 2 | 61.0 | 68.6 | 6 / 35 | 3855 |
| 7 | 2 | 61.9 | 71.4 | 8 / 35 | 3679 |
| 8 | 4 | 59.4 | 66.7 | 3 / 35 | 3593 |
| 9 | 4 | 59.1 | 65.4 | 6 / 35 | 3405 |
| 10 | 2 | 60.5 | 67.9 | 8 / 35 | 3847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 46 | 20% |
| oog.melee.Mercutio 1.0 | 46 | 52% |
| cx.BlestPain 1.41 | 25 | 84% |
| nic.Nicator 2.4 | 17 | 35% |
| ahf.NanoAndrew .4 | 9 | 56% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 68 | 24% | 79 |
| oog.melee.Mercutio 1.0 | 56 | 20% | 76 |
| cx.BlestPain 1.41 | 49 | 17% | 74 |
| nic.Nicator 2.4 | 43 | 15% | 47 |
| ahf.NanoAndrew .4 | 37 | 13% | 43 |
| maribo.melee.BMV 0.1 | 17 | 6% | 17 |
| tex.Longbot 0.4 | 10 | 4% | 10 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 1% | 3 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 66.8 | 81 / 350 | 3.99 | 13.1% | 31812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.7 | 13.8% | 73 |
| agd.Mooserwirt2 2.7 | 2.4 | 13.2% | 75 |
| hadur117.nano.SanaroS2 0.2 | 2.7 | 13.1% | 81 |
| uji.DBH 1.1 | 3.8 | 11.9% | 39 |
| spinnercat.Robovirus 2.718 | 5.2 | 10.4% | 24 |
| ratosh.Nobo 0.21 | 5.2 | 10.5% | 12 |
| sigterm.Sigterm 1.0 | 7.2 | 8.6% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 8.1 | 7.5% | 10 |
| stelo.WangRobot 1.0 | 9.1 | 5.7% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.6 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.9 | 71.4 | 8 / 35 | 3110 |
| 2 | 2 | 59.4 | 70.5 | 8 / 35 | 3107 |
| 3 | 3 | 56.4 | 60.0 | 9 / 35 | 3049 |
| 4 | 1 | 62.2 | 75.6 | 13 / 35 | 3381 |
| 5 | 3 | 58.8 | 67.3 | 10 / 35 | 3054 |
| 6 | 3 | 57.9 | 66.0 | 7 / 35 | 3006 |
| 7 | 6 | 53.0 | 48.9 | 7 / 35 | 3193 |
| 8 | 4 | 56.1 | 63.5 | 2 / 35 | 3006 |
| 9 | 3 | 58.7 | 67.3 | 7 / 35 | 3193 |
| 10 | 1 | 62.9 | 77.5 | 10 / 35 | 3713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 40 | 48% |
| agd.Mooserwirt2 2.7 | 31 | 61% |
| uji.DBH 1.1 | 18 | 50% |
| stelo.WangRobot 1.0 | 11 | 45% |
| sigterm.Sigterm 1.0 | 11 | 64% |
| ratosh.Nobo 0.21 | 11 | 91% |
| spinnercat.Robovirus 2.718 | 10 | 70% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 67% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 270 of 350 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 65 | 24% | 84 |
| agd.Mooserwirt2 2.7 | 45 | 17% | 65 |
| ratosh.Nobo 0.21 | 43 | 16% | 51 |
| uji.DBH 1.1 | 32 | 12% | 43 |
| spinnercat.Robovirus 2.718 | 25 | 9% | 30 |
| kawigi.mini.Fhqwhgads 1.1 | 20 | 7% | 25 |
| sigterm.Sigterm 1.0 | 17 | 6% | 23 |
| stelo.WangRobot 1.0 | 15 | 6% | 20 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 82.2 | 119 / 350 | 2.60 | 16.2% | 39360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.7 | 16.2% | 119 |
| davidalves.net.DuelistMiniMelee 1.2 | 1.9 | 16.3% | 89 |
| mld.Infinity 2.2 | 2.4 | 15.2% | 96 |
| krillr.mini.JointStrike 2.0.0 | 4.1 | 11.7% | 16 |
| erdnis.Rover 0.3 | 5.1 | 10.5% | 7 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.9% | 7 |
| pac.ABC 2.1 | 7.5 | 7.1% | 15 |
| mbh.Mbh 0.1 | 7.7 | 7.1% | 1 |
| pbg.R2D2 1.0 | 8.8 | 6.1% | 1 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 83.8 | 8 / 35 | 3764 |
| 2 | 2 | 64.5 | 80.0 | 10 / 35 | 3984 |
| 3 | 2 | 64.2 | 77.1 | 12 / 35 | 3741 |
| 4 | 2 | 65.8 | 83.5 | 14 / 35 | 3624 |
| 5 | 2 | 65.9 | 82.2 | 12 / 35 | 4052 |
| 6 | 1 | 67.8 | 89.2 | 16 / 35 | 4188 |
| 7 | 1 | 66.0 | 81.3 | 13 / 35 | 3991 |
| 8 | 2 | 65.8 | 81.9 | 10 / 35 | 4028 |
| 9 | 1 | 65.3 | 80.0 | 13 / 35 | 3852 |
| 10 | 2 | 66.0 | 83.2 | 11 / 35 | 4136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 97 | 52% |
| davidalves.net.DuelistMiniMelee 1.2 | 73 | 40% |
| krillr.mini.JointStrike 2.0.0 | 24 | 75% |
| pac.ABC 2.1 | 12 | 42% |
| patson.PatsonTestBot 1.0 | 12 | 67% |
| erdnis.Rover 0.3 | 7 | 100% |
| mbh.Mbh 0.1 | 3 | 67% |
| pbg.R2D2 1.0 | 1 | 0% |

Hadur died in 234 of 350 rounds, at a mean tick of 1116. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 92 | 39% | 168 |
| mld.Infinity 2.2 | 69 | 29% | 44 |
| krillr.mini.JointStrike 2.0.0 | 24 | 10% | 41 |
| erdnis.Rover 0.3 | 20 | 9% | 38 |
| pac.ABC 2.1 | 13 | 6% | 15 |
| patson.PatsonTestBot 1.0 | 10 | 4% | 19 |
| pbg.R2D2 1.0 | 4 | 2% | 11 |
| mbh.Mbh 0.1 | 1 | 0% | 8 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 70.2 | 77 / 350 | 3.69 | 13.7% | 34584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.5% | 144 |
| hadur117.nano.SanaroS2 0.2 | 2.1 | 13.7% | 77 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.9% | 20 |
| fwb.Nine 1.0.1 | 3.8 | 11.5% | 39 |
| catcat20.Rabbit 0.001 | 4.8 | 10.3% | 33 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 8.7% | 9 |
| djdjdj.NanoSkunk10 1.0 | 6.9 | 8.8% | 15 |
| bayen.nut.Squirrel 1.615 | 7.1 | 8.2% | 12 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.6 | 62.9 | 5 / 35 | 3491 |
| 2 | 2 | 61.0 | 73.7 | 10 / 35 | 3124 |
| 3 | 2 | 63.1 | 75.2 | 14 / 35 | 3665 |
| 4 | 2 | 59.5 | 68.9 | 6 / 35 | 3401 |
| 5 | 2 | 60.0 | 66.7 | 8 / 35 | 3767 |
| 6 | 2 | 60.6 | 70.5 | 7 / 35 | 3650 |
| 7 | 2 | 60.4 | 71.4 | 6 / 35 | 3236 |
| 8 | 2 | 60.6 | 71.1 | 7 / 35 | 3422 |
| 9 | 2 | 61.3 | 72.1 | 9 / 35 | 3418 |
| 10 | 2 | 59.6 | 69.2 | 5 / 35 | 3410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 59 | 47% |
| fwb.Nine 1.0.1 | 32 | 69% |
| catcat20.Rabbit 0.001 | 17 | 59% |
| nz.jdc.nano.GridFu 1.0 | 10 | 60% |
| bayen.nut.Squirrel 1.615 | 9 | 89% |
| djdjdj.NanoSkunk10 1.0 | 4 | 50% |
| m3thos.mini.Eva01 0.5.5 | 2 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 274 of 350 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 120 | 44% | 145 |
| fwb.Nine 1.0.1 | 44 | 16% | 50 |
| nz.jdc.nano.GridFu 1.0 | 33 | 12% | 47 |
| catcat20.Rabbit 0.001 | 25 | 9% | 43 |
| bayen.nut.Squirrel 1.615 | 18 | 7% | 21 |
| djdjdj.NanoSkunk10 1.0 | 14 | 5% | 18 |
| m3thos.mini.Eva01 0.5.5 | 11 | 4% | 14 |
| ntc.ControlledChaos 1.1.4 | 4 | 1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 81.9 | 133 / 350 | 2.63 | 16.8% | 45448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.3 | 17.7% | 158 |
| hadur117.nano.SanaroS2 0.2 | 1.7 | 16.8% | 133 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 15 |
| cf.RiO.RiOx 4.2.1 | 4.1 | 11.6% | 22 |
| oa.weak.BotherBot 0.1 | 5.4 | 8.6% | 1 |
| eld.Hmm 1.0 | 5.5 | 8.6% | 22 |
| fire219.CatBot 1.0 | 7.8 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 1 |
| PSW.Relentless 0.1 | 8.4 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 79.7 | 11 / 35 | 4386 |
| 2 | 2 | 66.9 | 85.1 | 14 / 35 | 4628 |
| 3 | 2 | 65.9 | 80.0 | 14 / 35 | 4720 |
| 4 | 1 | 67.4 | 87.3 | 17 / 35 | 4260 |
| 5 | 1 | 67.5 | 85.1 | 17 / 35 | 4680 |
| 6 | 1 | 66.7 | 81.9 | 16 / 35 | 4595 |
| 7 | 2 | 64.6 | 79.0 | 8 / 35 | 4237 |
| 8 | 2 | 67.3 | 85.7 | 11 / 35 | 4906 |
| 9 | 2 | 65.0 | 75.9 | 12 / 35 | 4673 |
| 10 | 2 | 65.2 | 79.4 | 13 / 35 | 4363 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 146 | 54% |
| dummy.mini.Scimitar 1.01 | 33 | 88% |
| cf.RiO.RiOx 4.2.1 | 23 | 48% |
| eld.Hmm 1.0 | 14 | 71% |
| el.JumpShoot 0.2 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 219 of 350 rounds, at a mean tick of 1218. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 102 | 47% | 157 |
| cf.RiO.RiOx 4.2.1 | 43 | 20% | 49 |
| dummy.mini.Scimitar 1.01 | 36 | 16% | 82 |
| eld.Hmm 1.0 | 11 | 5% | 26 |
| oa.weak.BotherBot 0.1 | 9 | 4% | 11 |
| el.JumpShoot 0.2 | 7 | 3% | 9 |
| PSW.Relentless 0.1 | 6 | 3% | 6 |
| arthord.MannyPacquiao Beta | 3 | 1% | 6 |
| fire219.CatBot 1.0 | 2 | 1% | 3 |

## Melee bench: F23

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.2 | 104 / 350 | 2.60 | 16.3% | 41605 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.7% | 161 |
| hadur117.nano.SanaroS2 0.2 | 2.1 | 16.3% | 104 |
| cre.Karolos 0.32 | 2.8 | 15.0% | 47 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.3% | 21 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 9.1% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.9 | 8.8% | 6 |
| cw.megas.Blade 0.8 | 7.0 | 8.1% | 0 |
| sample.Walls 1.0 | 7.3 | 7.9% | 4 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 78.4 | 7 / 35 | 4301 |
| 2 | 2 | 65.7 | 81.3 | 7 / 35 | 4147 |
| 3 | 2 | 66.3 | 82.2 | 13 / 35 | 4045 |
| 4 | 2 | 66.9 | 84.4 | 11 / 35 | 4437 |
| 5 | 1 | 67.3 | 85.1 | 15 / 35 | 4309 |
| 6 | 2 | 66.2 | 83.5 | 10 / 35 | 3959 |
| 7 | 2 | 68.1 | 86.0 | 10 / 35 | 4482 |
| 8 | 3 | 64.2 | 75.9 | 8 / 35 | 3728 |
| 9 | 3 | 66.6 | 83.2 | 12 / 35 | 4047 |
| 10 | 2 | 66.1 | 81.9 | 11 / 35 | 4150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 120 | 37% |
| cre.Karolos 0.32 | 46 | 50% |
| stelo.AreaTargetingBot 1.1 | 23 | 65% |
| stelo.RamTrackSurfer 1.2 | 12 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 71% |
| sample.Walls 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 247 of 350 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 130 | 53% | 181 |
| cre.Karolos 0.32 | 65 | 26% | 87 |
| stelo.AreaTargetingBot 1.1 | 29 | 12% | 37 |
| stelo.RamTrackSurfer 1.2 | 10 | 4% | 22 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 3% | 13 |
| cw.megas.Blade 0.8 | 3 | 1% | 5 |
| sample.Walls 1.0 | 2 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.5 | 59.1 | 36 / 350 | 4.68 | 11.1% | 25985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 2.0 | 14.5% | 83 |
| florent.XSeries.X2 0.12 | 2.5 | 13.6% | 71 |
| davidalves.Phoenix 0.54 | 2.7 | 13.2% | 83 |
| pedersen.Ugluk 1.1.1 | 3.4 | 12.6% | 44 |
| hadur117.nano.SanaroS2 0.2 | 4.6 | 11.1% | 36 |
| oog.melee.Corsair 1.0 | 5.8 | 9.7% | 10 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.2% | 18 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.8% | 3 |
| as.FrankTheTank 1.3 | 9.2 | 5.3% | 2 |
| evd.X1 0.01 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.4 | 55.9 | 0 / 35 | 2733 |
| 2 | 5 | 55.9 | 62.2 | 7 / 35 | 2509 |
| 3 | 4 | 56.3 | 64.1 | 4 / 35 | 2860 |
| 4 | 5 | 55.1 | 59.4 | 6 / 35 | 2668 |
| 5 | 5 | 55.4 | 61.9 | 6 / 35 | 2265 |
| 6 | 5 | 52.1 | 54.3 | 0 / 35 | 2552 |
| 7 | 4 | 54.5 | 58.1 | 4 / 35 | 2659 |
| 8 | 4 | 56.1 | 64.1 | 3 / 35 | 2523 |
| 9 | 3 | 55.7 | 60.6 | 5 / 35 | 2898 |
| 10 | 6 | 50.1 | 50.2 | 1 / 35 | 2318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 25 | 32% |
| davidalves.Phoenix 0.54 | 22 | 36% |
| florent.XSeries.X2 0.12 | 18 | 56% |
| pedersen.Ugluk 1.1.1 | 14 | 43% |
| oog.melee.Corsair 1.0 | 4 | 75% |
| stelo.SoJNanoMelee 1.1 | 2 | 50% |

Hadur died in 314 of 350 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 74 | 24% | 83 |
| pedersen.Ugluk 1.1.1 | 67 | 21% | 71 |
| davidalves.Phoenix 0.54 | 58 | 18% | 66 |
| florent.XSeries.X2 0.12 | 57 | 18% | 65 |
| stelo.SoJNanoMelee 1.1 | 18 | 6% | 19 |
| oog.melee.Corsair 1.0 | 17 | 5% | 22 |
| lunchie.Lunchbox 0.93 | 13 | 4% | 13 |
| evd.X1 0.01 | 7 | 2% | 7 |
| as.FrankTheTank 1.3 | 3 | 1% | 4 |

## Melee bench: F25

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 67.9 | 69 / 350 | 3.89 | 13.3% | 30281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 14.7% | 82 |
| voidious.micro.BlitzBat 1.05 | 1.7 | 14.3% | 73 |
| hadur117.nano.SanaroS2 0.2 | 2.8 | 13.3% | 69 |
| jdw.Hurricane 1.4 | 4.3 | 11.1% | 50 |
| gre.svman4.Morfeas 1.4.1 | 5.1 | 10.2% | 26 |
| ds.Oo 2.2 | 6.4 | 9.2% | 18 |
| gjr.Cephalosporin 0.1 | 6.5 | 8.9% | 27 |
| awesomeness.Elite 1.0 | 7.9 | 7.3% | 2 |
| adt.Ar2 1.1 | 8.8 | 6.6% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.9 | 65.7 | 4 / 35 | 3065 |
| 2 | 3 | 56.9 | 61.0 | 9 / 35 | 2885 |
| 3 | 3 | 56.7 | 62.5 | 6 / 35 | 2624 |
| 4 | 3 | 57.3 | 64.4 | 6 / 35 | 2824 |
| 5 | 1 | 61.3 | 73.0 | 7 / 35 | 3224 |
| 6 | 3 | 60.4 | 69.5 | 6 / 35 | 3267 |
| 7 | 3 | 61.6 | 72.7 | 9 / 35 | 3335 |
| 8 | 3 | 58.7 | 66.3 | 4 / 35 | 3135 |
| 9 | 3 | 60.8 | 72.4 | 10 / 35 | 2900 |
| 10 | 3 | 60.2 | 71.4 | 8 / 35 | 3022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 36% |
| voidious.mini.BrokenSword 2.0.3 | 37 | 35% |
| jdw.Hurricane 1.4 | 21 | 67% |
| gjr.Cephalosporin 0.1 | 16 | 44% |
| ds.Oo 2.2 | 13 | 54% |
| gre.svman4.Morfeas 1.4.1 | 11 | 45% |
| awesomeness.Elite 1.0 | 4 | 100% |
| adt.Ar2 1.1 | 2 | 50% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 70 | 25% | 86 |
| voidious.mini.BrokenSword 2.0.3 | 68 | 24% | 82 |
| jdw.Hurricane 1.4 | 41 | 15% | 55 |
| ds.Oo 2.2 | 29 | 10% | 35 |
| gjr.Cephalosporin 0.1 | 24 | 9% | 30 |
| gre.svman4.Morfeas 1.4.1 | 20 | 7% | 26 |
| adt.Ar2 1.1 | 13 | 5% | 14 |
| awesomeness.Elite 1.0 | 12 | 4% | 16 |
| amk.ChumbaMini 0.2 | 4 | 1% | 6 |

## Melee bench: F26

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 71.1 | 68 / 350 | 3.60 | 13.7% | 36613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.4% | 135 |
| hadur117.nano.SanaroS2 0.2 | 2.4 | 13.7% | 68 |
| lrem.Spectre 0.4.4 | 3.0 | 12.9% | 41 |
| shu.nitro.LENIN .T34 | 3.9 | 12.5% | 58 |
| js.PinBall 1.6 | 5.1 | 11.2% | 18 |
| gh.mini.GrubbmOne 1.0 | 5.6 | 10.4% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 9.2% | 10 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 1 |
| sample.SpinBot 1.0 | 9.0 | 5.3% | 5 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 78.1 | 11 / 35 | 3823 |
| 2 | 2 | 59.7 | 70.2 | 6 / 35 | 3256 |
| 3 | 2 | 61.9 | 73.7 | 5 / 35 | 3705 |
| 4 | 2 | 62.4 | 75.2 | 4 / 35 | 3970 |
| 5 | 3 | 58.9 | 65.4 | 6 / 35 | 3457 |
| 6 | 2 | 62.2 | 74.0 | 9 / 35 | 3703 |
| 7 | 2 | 62.9 | 73.3 | 12 / 35 | 3863 |
| 8 | 4 | 59.7 | 67.6 | 7 / 35 | 3535 |
| 9 | 2 | 60.9 | 72.7 | 4 / 35 | 3524 |
| 10 | 3 | 57.5 | 60.6 | 4 / 35 | 3777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 47 | 26% |
| lrem.Spectre 0.4.4 | 30 | 67% |
| shu.nitro.LENIN .T34 | 27 | 48% |
| gh.mini.GrubbmOne 1.0 | 10 | 50% |
| js.PinBall 1.6 | 10 | 80% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 3 | 33% |

Hadur died in 283 of 350 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 92 | 33% | 105 |
| lrem.Spectre 0.4.4 | 47 | 17% | 59 |
| shu.nitro.LENIN .T34 | 44 | 16% | 64 |
| js.PinBall 1.6 | 33 | 12% | 41 |
| gh.mini.GrubbmOne 1.0 | 29 | 10% | 34 |
| jaybot.adv.bots.JayBot 2.0 | 16 | 6% | 22 |
| sample.SpinBot 1.0 | 11 | 4% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 10 | 4% | 14 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 67.9 | 86 / 350 | 3.89 | 13.5% | 33159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.4 | 15.2% | 132 |
| hadur117.nano.SanaroS2 0.2 | 2.4 | 13.5% | 86 |
| wee.Gem 1.8.4 | 3.5 | 11.9% | 58 |
| sheldor.melee.nano.TestMelee 0.1 | 3.9 | 11.6% | 38 |
| EH.Eagle 1.0.6 | 4.2 | 11.5% | 22 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.4% | 9 |
| throxbot.ThroxBot 0.1 | 7.7 | 8.1% | 3 |
| joe.ADinosaur 1.0 | 7.7 | 7.5% | 1 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.8% | 3 |
| cs.Grudge 1.0 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 72.1 | 11 / 35 | 3115 |
| 2 | 1 | 61.9 | 76.8 | 12 / 35 | 3138 |
| 3 | 3 | 57.6 | 62.5 | 5 / 35 | 3215 |
| 4 | 2 | 60.7 | 72.7 | 13 / 35 | 2798 |
| 5 | 2 | 62.7 | 77.8 | 13 / 35 | 3210 |
| 6 | 4 | 56.0 | 49.8 | 5 / 35 | 4165 |
| 7 | 2 | 58.6 | 69.5 | 6 / 35 | 2901 |
| 8 | 5 | 54.1 | 46.0 | 4 / 35 | 4243 |
| 9 | 2 | 60.0 | 71.7 | 7 / 35 | 2966 |
| 10 | 1 | 62.8 | 80.3 | 10 / 35 | 3408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 69 | 58% |
| wee.Gem 1.8.4 | 29 | 59% |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 58% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 40% |
| EH.Eagle 1.0.6 | 8 | 88% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 264 of 350 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 83 | 31% | 119 |
| sheldor.melee.nano.TestMelee 0.1 | 44 | 17% | 57 |
| wee.Gem 1.8.4 | 41 | 16% | 62 |
| EH.Eagle 1.0.6 | 21 | 8% | 31 |
| cs.Grudge 1.0 | 19 | 7% | 18 |
| caimano.Furia_Ceca 0.22 | 17 | 6% | 18 |
| throxbot.ThroxBot 0.1 | 15 | 6% | 17 |
| joe.ADinosaur 1.0 | 13 | 5% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 11 | 4% | 14 |

## Melee bench: F28

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 78.3 | 105 / 350 | 2.95 | 15.1% | 31952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.2 | 16.8% | 129 |
| hadur117.nano.SanaroS2 0.2 | 1.9 | 15.1% | 105 |
| uji.Antique 1.0 | 3.0 | 12.7% | 57 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.6% | 9 |
| qohnil.blot.BlotBot 3.61 | 4.6 | 10.6% | 29 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.3% | 6 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.1% | 10 |
| matt.advanced.Katana 1.0 | 8.8 | 6.2% | 4 |
| stelo.Lifestealer 1.0 | 8.9 | 6.0% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 75.9 | 11 / 35 | 3155 |
| 2 | 1 | 64.6 | 83.8 | 14 / 35 | 3116 |
| 3 | 2 | 64.4 | 82.9 | 12 / 35 | 3440 |
| 4 | 2 | 62.2 | 77.8 | 8 / 35 | 3389 |
| 5 | 3 | 58.8 | 69.2 | 3 / 35 | 2813 |
| 6 | 2 | 63.6 | 81.6 | 12 / 35 | 3462 |
| 7 | 2 | 60.5 | 71.4 | 9 / 35 | 3190 |
| 8 | 1 | 65.2 | 84.1 | 16 / 35 | 3473 |
| 9 | 2 | 61.3 | 76.8 | 8 / 35 | 2901 |
| 10 | 2 | 63.1 | 80.0 | 12 / 35 | 3013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 116 | 51% |
| uji.Antique 1.0 | 40 | 58% |
| qohnil.blot.BlotBot 3.61 | 23 | 48% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| ahr.ice.Ice 1.0.2 | 5 | 20% |
| amk.ChumbaWumba 0.3 | 4 | 75% |
| matt.advanced.Katana 1.0 | 4 | 100% |

Hadur died in 246 of 350 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 116 | 47% | 155 |
| uji.Antique 1.0 | 45 | 18% | 74 |
| pfvicm.Sobieski 7.2.3b | 30 | 12% | 33 |
| qohnil.blot.BlotBot 3.61 | 19 | 8% | 32 |
| amk.ChumbaWumba 0.3 | 15 | 6% | 19 |
| stelo.PianistNano 1.2 | 8 | 3% | 9 |
| ahr.ice.Ice 1.0.2 | 7 | 3% | 14 |
| matt.advanced.Katana 1.0 | 3 | 1% | 9 |
| stelo.Lifestealer 1.0 | 3 | 1% | 3 |

## Melee bench: F29

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 65.2 | 46 / 350 | 4.13 | 12.9% | 32680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.3 | 16.3% | 113 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 15.8% | 118 |
| hadur117.nano.SanaroS2 0.2 | 3.3 | 12.9% | 46 |
| myl.micro.Troodon 1.10 | 3.8 | 12.7% | 24 |
| jok.PheonixM 0.1.2 | 4.8 | 11.4% | 19 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.5% | 0 |
| DBall.Anarchy 0.1 | 6.9 | 8.0% | 26 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.3% | 3 |
| jangs.ns51 1.0 | 9.5 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 66.3 | 3 / 35 | 3601 |
| 2 | 4 | 59.4 | 63.5 | 8 / 35 | 3140 |
| 3 | 3 | 60.2 | 67.3 | 5 / 35 | 3260 |
| 4 | 3 | 56.8 | 60.0 | 3 / 35 | 3120 |
| 5 | 4 | 58.5 | 65.1 | 5 / 35 | 2893 |
| 6 | 4 | 58.6 | 61.6 | 3 / 35 | 3234 |
| 7 | 3 | 57.4 | 62.2 | 1 / 35 | 3037 |
| 8 | 3 | 61.4 | 68.3 | 8 / 35 | 3517 |
| 9 | 3 | 60.5 | 68.3 | 4 / 35 | 3297 |
| 10 | 3 | 60.9 | 69.2 | 6 / 35 | 3581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 52 | 6% |
| zyx.mega.YersiniaPestis 3.1 | 40 | 43% |
| myl.micro.Troodon 1.10 | 16 | 88% |
| DBall.Anarchy 0.1 | 14 | 43% |
| jok.PheonixM 0.1.2 | 7 | 57% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 304 of 350 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 105 | 35% | 113 |
| zyx.mega.YersiniaPestis 3.1 | 69 | 23% | 87 |
| myl.micro.Troodon 1.10 | 48 | 16% | 58 |
| jok.PheonixM 0.1.2 | 38 | 13% | 41 |
| ph.melee.ArcherME 0.3 | 17 | 6% | 18 |
| DBall.Anarchy 0.1 | 14 | 5% | 20 |
| fullsail.TimbotNoPrediction 1.0 | 9 | 3% | 9 |
| jangs.ns51 1.0 | 3 | 1% | 4 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F30

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.6 | 55.2 | 22 / 350 | 5.03 | 10.5% | 28093 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.8 | 14.3% | 103 |
| oog.melee.Capulet 1.2 | 2.3 | 13.8% | 59 |
| stelo.PastFuture 2.3.2 | 2.4 | 13.7% | 60 |
| darkcanuck.B26354 1.06 | 3.5 | 13.1% | 70 |
| hadur117.nano.SanaroS2 0.2 | 5.1 | 10.5% | 22 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.0% | 20 |
| ntc.Opposite 1.5 | 7.7 | 7.9% | 1 |
| tripphippy.Alice 1.1 | 7.9 | 7.5% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 8.1 | 7.7% | 7 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.0 | 57.5 | 3 / 35 | 3064 |
| 2 | 5 | 56.3 | 60.6 | 2 / 35 | 3043 |
| 3 | 5 | 52.5 | 53.7 | 2 / 35 | 2638 |
| 4 | 5 | 52.9 | 54.3 | 1 / 35 | 2629 |
| 5 | 6 | 52.5 | 51.7 | 2 / 35 | 2819 |
| 6 | 5 | 55.8 | 61.9 | 2 / 35 | 2962 |
| 7 | 5 | 51.9 | 49.8 | 2 / 35 | 2836 |
| 8 | 5 | 53.4 | 55.2 | 2 / 35 | 2831 |
| 9 | 5 | 53.3 | 53.0 | 3 / 35 | 2868 |
| 10 | 5 | 52.7 | 54.3 | 3 / 35 | 2403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 22 | 14% |
| stelo.PastFuture 2.3.2 | 18 | 33% |
| darkcanuck.B26354 1.06 | 17 | 12% |
| oog.melee.Capulet 1.2 | 16 | 31% |
| intruder.PrairieWolf 2.61 | 8 | 63% |
| tripphippy.Alice 1.1 | 2 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |

Hadur died in 328 of 350 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 65 | 20% | 71 |
| darkcanuck.B26354 1.06 | 58 | 18% | 61 |
| stelo.PastFuture 2.3.2 | 55 | 17% | 57 |
| oog.melee.Capulet 1.2 | 50 | 15% | 59 |
| ntc.Opposite 1.5 | 34 | 10% | 34 |
| intruder.PrairieWolf 2.61 | 25 | 8% | 27 |
| tripphippy.Alice 1.1 | 24 | 7% | 25 |
| fowl3628800.LightningBolt 2.6.0 | 14 | 4% | 13 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.0 | 58.9 | 35 / 350 | 4.70 | 11.0% | 25015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 183 |
| gh.mini.Griezel 0.2 | 2.4 | 13.7% | 76 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 12.5% | 25 |
| d414.nano.Quantum 1.0.0 | 3.8 | 11.7% | 21 |
| hadur117.nano.SanaroS2 0.2 | 4.8 | 11.0% | 35 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.6% | 8 |
| timmit.nano.TimDog 0.33 | 7.1 | 6.9% | 3 |
| fm.mammillarias 1.3 | 7.9 | 6.4% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.0 | 59.4 | 4 / 35 | 2498 |
| 2 | 5 | 55.7 | 60.6 | 6 / 35 | 2414 |
| 3 | 6 | 54.2 | 57.5 | 4 / 35 | 2328 |
| 4 | 4 | 55.3 | 59.4 | 5 / 35 | 2484 |
| 5 | 5 | 53.5 | 55.6 | 1 / 35 | 2472 |
| 6 | 6 | 51.0 | 51.4 | 0 / 35 | 2176 |
| 7 | 4 | 57.5 | 65.7 | 3 / 35 | 2507 |
| 8 | 5 | 55.2 | 59.7 | 4 / 35 | 2364 |
| 9 | 4 | 57.6 | 64.1 | 4 / 35 | 3001 |
| 10 | 5 | 54.6 | 55.2 | 4 / 35 | 2771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 34 | 41% |
| abc.Shadow 3.84i | 29 | 48% |
| d414.nano.Quantum 1.0.0 | 9 | 11% |
| spinnercat.micro.Tyger 0.1 | 6 | 17% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 315 of 350 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 80 | 25% | 94 |
| abc.Shadow 3.84i | 66 | 21% | 80 |
| spinnercat.micro.Tyger 0.1 | 66 | 21% | 70 |
| d414.nano.Quantum 1.0.0 | 42 | 13% | 43 |
| gh.nano.Grofvuil 0.2 | 27 | 9% | 29 |
| timmit.nano.TimDog 0.33 | 18 | 6% | 19 |
| fm.mammillarias 1.3 | 8 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 5 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 1% | 3 |

## Melee bench: F32

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 75.2 | 124 / 350 | 3.23 | 14.6% | 33436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.0% | 92 |
| hadur117.nano.SanaroS2 0.2 | 1.6 | 14.6% | 124 |
| apc.botM 3.0 | 3.2 | 12.5% | 48 |
| lxx.ConceptA 0.8 | 4.2 | 11.1% | 15 |
| vjik.UnViolation 1.1 | 4.7 | 10.8% | 27 |
| bayen.UbaMicro 1.4 | 5.9 | 9.4% | 12 |
| panzer.Panzer 0.2 | 7.4 | 7.7% | 4 |
| yk.JahMicro 1.0 | 8.0 | 7.3% | 15 |
| conscience.Electron 1.3g | 8.8 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.3% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 75.2 | 10 / 35 | 3423 |
| 2 | 2 | 58.7 | 69.8 | 8 / 35 | 2862 |
| 3 | 2 | 61.5 | 73.3 | 13 / 35 | 3416 |
| 4 | 2 | 61.8 | 74.9 | 11 / 35 | 3392 |
| 5 | 1 | 62.4 | 76.5 | 9 / 35 | 3837 |
| 6 | 2 | 59.9 | 69.8 | 13 / 35 | 3090 |
| 7 | 2 | 60.5 | 71.1 | 15 / 35 | 3178 |
| 8 | 1 | 62.7 | 77.1 | 15 / 35 | 3523 |
| 9 | 1 | 62.2 | 77.8 | 13 / 35 | 3243 |
| 10 | 1 | 65.1 | 86.7 | 17 / 35 | 3472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 93 | 61% |
| apc.botM 3.0 | 35 | 63% |
| vjik.UnViolation 1.1 | 18 | 67% |
| lxx.ConceptA 0.8 | 17 | 76% |
| donjezza.Jezza 1.0 | 10 | 30% |
| yk.JahMicro 1.0 | 10 | 60% |
| panzer.Panzer 0.2 | 5 | 100% |
| bayen.UbaMicro 1.4 | 4 | 50% |
| conscience.Electron 1.3g | 4 | 100% |

Hadur died in 228 of 350 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 67 | 29% | 125 |
| lxx.ConceptA 0.8 | 50 | 22% | 58 |
| apc.botM 3.0 | 29 | 13% | 54 |
| bayen.UbaMicro 1.4 | 24 | 11% | 31 |
| vjik.UnViolation 1.1 | 20 | 9% | 34 |
| yk.JahMicro 1.0 | 11 | 5% | 12 |
| donjezza.Jezza 1.0 | 10 | 4% | 13 |
| panzer.Panzer 0.2 | 10 | 4% | 12 |
| conscience.Electron 1.3g | 7 | 3% | 10 |

## Melee bench: F33

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 67.6 | 71 / 350 | 3.91 | 13.7% | 36911 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.4% | 116 |
| hadur117.nano.SanaroS2 0.2 | 2.7 | 13.7% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.7% | 68 |
| labg.Cataclysm 2.05 | 4.2 | 11.9% | 50 |
| gre.svman4.Leonidas 1.3.2 | 4.4 | 11.2% | 28 |
| baal.nano.N 1.42 | 6.3 | 8.6% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.5% | 12 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 4.8% | 1 |
| zyx.micro.Ant 1.1 | 9.0 | 5.1% | 2 |
| sanja.First 0.1 | 9.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 66.0 | 9 / 35 | 3825 |
| 2 | 2 | 62.6 | 72.4 | 8 / 35 | 3902 |
| 3 | 5 | 56.3 | 57.5 | 3 / 35 | 3182 |
| 4 | 3 | 58.1 | 61.3 | 4 / 35 | 3511 |
| 5 | 3 | 58.1 | 61.6 | 8 / 35 | 3481 |
| 6 | 2 | 62.8 | 73.7 | 9 / 35 | 3704 |
| 7 | 3 | 62.9 | 74.0 | 6 / 35 | 3817 |
| 8 | 3 | 61.7 | 69.5 | 6 / 35 | 4073 |
| 9 | 2 | 63.5 | 74.0 | 8 / 35 | 3883 |
| 10 | 2 | 60.5 | 66.3 | 10 / 35 | 3533 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 46 | 57% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 19% |
| gre.svman4.Leonidas 1.3.2 | 23 | 78% |
| labg.Cataclysm 2.05 | 19 | 58% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 89% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 95 | 34% | 129 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 66 | 23% | 77 |
| gre.svman4.Leonidas 1.3.2 | 34 | 12% | 47 |
| labg.Cataclysm 2.05 | 31 | 11% | 39 |
| kinsen.melee.Angsaichmophobia 1.8c | 23 | 8% | 26 |
| baal.nano.N 1.42 | 15 | 5% | 15 |
| zyx.micro.Ant 1.1 | 13 | 5% | 13 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 1% | 3 |
| sanja.First 0.1 | 1 | 0% | 1 |

## Melee bench: F34

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 71.1 | 50 / 350 | 3.60 | 13.5% | 34890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.5 | 17.5% | 112 |
| stelo.Spread 0.9 | 1.5 | 17.7% | 136 |
| hadur117.nano.SanaroS2 0.2 | 3.1 | 13.5% | 50 |
| tcf.Reach 3 | 4.5 | 11.3% | 15 |
| jcs.Seth 1.8 | 4.6 | 11.2% | 31 |
| cli.Dancer 1.1 | 5.8 | 9.6% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.5% | 1 |
| sample.VelociRobot 1.0 | 9.4 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.6 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.4 | 77.1 | 8 / 35 | 3519 |
| 2 | 3 | 61.7 | 73.7 | 8 / 35 | 3120 |
| 3 | 3 | 60.9 | 72.1 | 4 / 35 | 3223 |
| 4 | 4 | 58.0 | 61.0 | 2 / 35 | 3281 |
| 5 | 3 | 59.3 | 65.4 | 4 / 35 | 3574 |
| 6 | 3 | 63.4 | 74.6 | 6 / 35 | 3838 |
| 7 | 3 | 62.1 | 73.3 | 3 / 35 | 3586 |
| 8 | 3 | 60.0 | 67.3 | 3 / 35 | 3424 |
| 9 | 3 | 61.9 | 73.0 | 8 / 35 | 3384 |
| 10 | 3 | 62.8 | 73.3 | 4 / 35 | 3941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 49 | 29% |
| stelo.Spread 0.9 | 47 | 55% |
| jcs.Seth 1.8 | 12 | 42% |
| tcf.Reach 3 | 8 | 25% |
| cli.Dancer 1.1 | 5 | 40% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 127 | 42% | 134 |
| stelo.Spread 0.9 | 84 | 28% | 113 |
| tcf.Reach 3 | 32 | 11% | 38 |
| jcs.Seth 1.8 | 24 | 8% | 29 |
| cli.Dancer 1.1 | 15 | 5% | 17 |
| ratosh.Wesco 1.4 | 13 | 4% | 14 |
| amk.Punbot.Punbot 0.01 | 4 | 1% | 4 |
| sample.RamFire 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 65.8 | 25 / 350 | 4.07 | 12.1% | 27235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 275 |
| gh.mini.Gruwel 0.9 | 2.4 | 13.4% | 32 |
| rz.HawkOnFire 0.1 | 3.6 | 12.4% | 5 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.9 | 12.2% | 13 |
| hadur117.nano.SanaroS2 0.2 | 4.1 | 12.1% | 25 |
| wit.Chuliath 1.0 | 6.6 | 7.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.8 | 60.6 | 4 / 35 | 2453 |
| 2 | 4 | 56.5 | 63.5 | 3 / 35 | 2487 |
| 3 | 5 | 55.8 | 61.0 | 2 / 35 | 2668 |
| 4 | 5 | 57.4 | 64.8 | 3 / 35 | 2732 |
| 5 | 4 | 57.5 | 64.8 | 4 / 35 | 2637 |
| 6 | 3 | 60.3 | 71.7 | 3 / 35 | 2901 |
| 7 | 3 | 60.1 | 71.4 | 1 / 35 | 2946 |
| 8 | 3 | 60.1 | 69.2 | 3 / 35 | 3178 |
| 9 | 4 | 58.9 | 69.5 | 2 / 35 | 2685 |
| 10 | 5 | 55.6 | 61.9 | 0 / 35 | 2548 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 71 | 1% |
| gh.mini.Gruwel 0.9 | 25 | 52% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 71% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 325 of 350 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 142 | 44% | 142 |
| gh.mini.Gruwel 0.9 | 51 | 16% | 64 |
| dmh.robocode.robot.BlackDeath 9.2 | 51 | 16% | 58 |
| rz.HawkOnFire 0.1 | 51 | 16% | 55 |
| myl.nano.KomoriNinja 1.1 | 12 | 4% | 12 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 11 | 3% | 12 |
| wit.Chuliath 1.0 | 4 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 0% | 1 |

## Melee bench: F36

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 74.2 | 120 / 350 | 3.33 | 15.1% | 36769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.0 | 15.1% | 120 |
| alpha.RainingFire 1.0 | 2.6 | 12.8% | 57 |
| mz.Cork 0.1 | 3.5 | 11.8% | 39 |
| bzdp.Pansy 2.1 | 3.8 | 11.9% | 46 |
| bvh.micro.Freya 0.3 | 4.8 | 10.8% | 30 |
| bvh.mini.Fenrir 0.39 | 5.9 | 9.8% | 7 |
| m3thos.Eva02 0.7.1 | 6.4 | 9.8% | 29 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.8% | 3 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 5 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.4% | 16 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 75.6 | 14 / 35 | 3735 |
| 2 | 1 | 60.1 | 67.0 | 10 / 35 | 3662 |
| 3 | 1 | 63.3 | 78.4 | 12 / 35 | 3535 |
| 4 | 1 | 61.8 | 73.3 | 10 / 35 | 3504 |
| 5 | 1 | 62.5 | 74.6 | 14 / 35 | 3515 |
| 6 | 1 | 65.3 | 81.3 | 16 / 35 | 3999 |
| 7 | 1 | 61.1 | 70.2 | 14 / 35 | 3535 |
| 8 | 1 | 60.9 | 71.7 | 8 / 35 | 3449 |
| 9 | 1 | 63.3 | 75.6 | 12 / 35 | 4285 |
| 10 | 1 | 61.7 | 74.0 | 10 / 35 | 3550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.Cork 0.1 | 44 | 70% |
| bzdp.Pansy 2.1 | 32 | 47% |
| bvh.micro.Freya 0.3 | 30 | 77% |
| alpha.RainingFire 1.0 | 28 | 39% |
| m3thos.Eva02 0.7.1 | 22 | 50% |
| bvh.mini.Fenrir 0.39 | 16 | 94% |
| sample.MyFirstRobot 1.0 | 10 | 40% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| dl.BetterWalls 1.0 | 5 | 80% |

Hadur died in 232 of 350 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 59 | 25% | 73 |
| bzdp.Pansy 2.1 | 39 | 17% | 56 |
| mz.Cork 0.1 | 29 | 13% | 61 |
| bvh.micro.Freya 0.3 | 29 | 13% | 46 |
| m3thos.Eva02 0.7.1 | 24 | 10% | 39 |
| bvh.mini.Fenrir 0.39 | 22 | 9% | 30 |
| squidM.TentalceMeleeNano 1.1 | 15 | 6% | 21 |
| sample.MyFirstRobot 1.0 | 8 | 3% | 10 |
| dl.BetterWalls 1.0 | 6 | 3% | 13 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 78.2 | 132 / 350 | 2.96 | 15.6% | 44053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.0 | 15.6% | 132 |
| germ.TheMind .2 | 2.8 | 11.5% | 49 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.8% | 23 |
| EBBU.Sim2 1.02 | 3.9 | 10.8% | 33 |
| agrach.Dalek 1.0 | 5.5 | 9.6% | 30 |
| stelo.UntouchableNano 1.3 | 6.9 | 8.9% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 7.3 | 8.4% | 2 |
| mb.Beast 0.1 | 7.4 | 8.5% | 28 |
| lmk.ACPFinal 0.1 | 7.5 | 8.5% | 15 |
| skm.Ryubot 1.0 | 9.2 | 7.4% | 15 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 81.3 | 11 / 35 | 4380 |
| 2 | 1 | 64.4 | 80.0 | 15 / 35 | 4985 |
| 3 | 1 | 62.0 | 74.9 | 12 / 35 | 4478 |
| 4 | 1 | 62.2 | 74.9 | 14 / 35 | 4485 |
| 5 | 1 | 63.7 | 78.4 | 19 / 35 | 4448 |
| 6 | 1 | 59.7 | 71.7 | 8 / 35 | 4031 |
| 7 | 1 | 61.6 | 76.5 | 12 / 35 | 4135 |
| 8 | 1 | 64.2 | 81.9 | 18 / 35 | 4349 |
| 9 | 1 | 64.7 | 84.8 | 12 / 35 | 4688 |
| 10 | 1 | 61.5 | 77.8 | 11 / 35 | 4074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 51 | 69% |
| EBBU.Sim2 1.02 | 37 | 49% |
| agrach.Dalek 1.0 | 32 | 66% |
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 68% |
| mb.Beast 0.1 | 21 | 62% |
| stelo.UntouchableNano 1.3 | 20 | 60% |
| lmk.ACPFinal 0.1 | 17 | 76% |
| skm.Ryubot 1.0 | 9 | 44% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 221 of 350 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 44 | 20% | 58 |
| germ.TheMind .2 | 40 | 18% | 74 |
| com.syncleus.robocode.Dreadnaught 0.1 | 32 | 14% | 45 |
| agrach.Dalek 1.0 | 25 | 11% | 52 |
| mb.Beast 0.1 | 23 | 10% | 38 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 9% | 23 |
| lmk.ACPFinal 0.1 | 16 | 7% | 26 |
| stelo.UntouchableNano 1.3 | 14 | 6% | 24 |
| skm.Ryubot 1.0 | 8 | 4% | 9 |

## Melee bench: F38

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 61.9 | 38 / 350 | 4.43 | 11.6% | 28990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.4% | 137 |
| bvh.mini.Freya 0.55 | 2.5 | 13.2% | 30 |
| bts.mega.Gnarly 1.4 | 3.5 | 12.3% | 61 |
| hadur117.nano.SanaroS2 0.2 | 4.4 | 11.6% | 38 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.9 | 10.9% | 29 |
| cs.Wren 1.0 | 5.1 | 11.1% | 27 |
| kdf.KoulDestroyer 1.0 | 6.6 | 9.3% | 19 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.7% | 9 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.4% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.4 | 59.7 | 4 / 35 | 2645 |
| 2 | 4 | 58.4 | 65.4 | 3 / 35 | 3182 |
| 3 | 4 | 57.5 | 66.3 | 3 / 35 | 2873 |
| 4 | 5 | 54.2 | 58.7 | 3 / 35 | 2707 |
| 5 | 4 | 55.4 | 61.9 | 4 / 35 | 2522 |
| 6 | 5 | 55.7 | 61.6 | 3 / 35 | 2867 |
| 7 | 5 | 55.8 | 61.3 | 4 / 35 | 2711 |
| 8 | 3 | 59.0 | 66.7 | 5 / 35 | 3195 |
| 9 | 5 | 55.4 | 58.7 | 4 / 35 | 3059 |
| 10 | 4 | 56.3 | 58.7 | 5 / 35 | 3229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 42 | 57% |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 0% |
| bvh.mini.Freya 0.55 | 12 | 33% |
| bts.mega.Gnarly 1.4 | 11 | 27% |
| cs.Wren 1.0 | 11 | 45% |
| kdf.KoulDestroyer 1.0 | 2 | 50% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |

Hadur died in 312 of 350 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 74 | 24% | 98 |
| bvh.mini.Freya 0.55 | 54 | 17% | 55 |
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 16% | 51 |
| bts.mega.Gnarly 1.4 | 44 | 14% | 47 |
| cs.Wren 1.0 | 43 | 14% | 47 |
| kdf.KoulDestroyer 1.0 | 32 | 10% | 34 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 3% | 10 |
| bzdp.BoxCar 2.0 | 5 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 3 | 1% | 3 |

## Melee bench: F39

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 65.7 | 45 / 350 | 4.09 | 12.4% | 31784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 15.8% | 82 |
| az.Ololobot 0.2.4 | 2.1 | 14.2% | 128 |
| hadur117.nano.SanaroS2 0.2 | 3.2 | 12.4% | 45 |
| catcat20.Lambda 0.024 | 3.7 | 11.8% | 49 |
| stelo.SoRobotNanoMelee 1.2 | 5.8 | 9.8% | 27 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.8% | 9 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.5% | 1 |
| gimp.GimpBot 0.1 | 7.3 | 8.1% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.9% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 67.3 | 4 / 35 | 3158 |
| 2 | 3 | 58.0 | 67.0 | 7 / 35 | 2869 |
| 3 | 4 | 54.8 | 58.7 | 4 / 35 | 3077 |
| 4 | 4 | 56.5 | 64.8 | 4 / 35 | 2937 |
| 5 | 3 | 59.0 | 69.2 | 4 / 35 | 3325 |
| 6 | 3 | 57.4 | 67.0 | 4 / 35 | 3044 |
| 7 | 3 | 60.4 | 71.7 | 5 / 35 | 3614 |
| 8 | 3 | 58.0 | 67.0 | 3 / 35 | 3288 |
| 9 | 3 | 55.8 | 60.0 | 6 / 35 | 3296 |
| 10 | 3 | 56.7 | 63.8 | 4 / 35 | 3176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 39 | 21% |
| bvh.fry.Freya 0.82 | 32 | 31% |
| catcat20.Lambda 0.024 | 25 | 68% |
| stelo.SoRobotNanoMelee 1.2 | 8 | 38% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| gimp.GimpBot 0.1 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |

Hadur died in 305 of 350 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 108 | 35% | 115 |
| az.Ololobot 0.2.4 | 54 | 18% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 38 | 12% | 40 |
| catcat20.Lambda 0.024 | 35 | 11% | 48 |
| apollokidd.ApolloKidd 0.9 | 34 | 11% | 35 |
| winamp32.micro.MicroMacro 1.0 | 17 | 6% | 20 |
| gimp.GimpBot 0.1 | 8 | 3% | 14 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 2% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 5 | 2% | 5 |

## Melee bench: F41

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 70.3 | 77 / 350 | 3.67 | 13.6% | 32055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.7% | 154 |
| hadur117.nano.SanaroS2 0.2 | 2.9 | 13.6% | 77 |
| ary.Swarm 1.1 | 3.0 | 13.4% | 28 |
| lessonz.robocode.Oz 0.5.0 | 3.4 | 13.0% | 47 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.9% | 33 |
| shrub.Silver v048 | 6.3 | 8.9% | 3 |
| zyx.nano.Ant 1.1 | 6.7 | 8.0% | 4 |
| jsal.Jsalbot 1.0 | 8.5 | 5.8% | 4 |
| stelo.Mirror 1.1 | 8.5 | 5.8% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 64.8 | 9 / 35 | 3368 |
| 2 | 2 | 60.6 | 73.3 | 6 / 35 | 2854 |
| 3 | 4 | 58.2 | 63.8 | 6 / 35 | 2993 |
| 4 | 4 | 59.2 | 66.0 | 7 / 35 | 3220 |
| 5 | 4 | 60.8 | 70.8 | 6 / 35 | 3248 |
| 6 | 2 | 61.5 | 73.0 | 8 / 35 | 3175 |
| 7 | 2 | 61.2 | 70.8 | 10 / 35 | 3364 |
| 8 | 2 | 63.3 | 77.8 | 9 / 35 | 3371 |
| 9 | 4 | 59.1 | 66.7 | 6 / 35 | 3024 |
| 10 | 2 | 63.0 | 76.5 | 10 / 35 | 3438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 85 | 35% |
| lessonz.robocode.Oz 0.5.0 | 28 | 64% |
| ary.Swarm 1.1 | 23 | 70% |
| simonton.nano.MeleeSeed 1.8 | 17 | 71% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 275 of 350 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 99 | 36% | 132 |
| ary.Swarm 1.1 | 60 | 22% | 76 |
| lessonz.robocode.Oz 0.5.0 | 39 | 14% | 54 |
| simonton.nano.MeleeSeed 1.8 | 35 | 13% | 46 |
| shrub.Silver v048 | 17 | 6% | 17 |
| zyx.nano.Ant 1.1 | 16 | 6% | 16 |
| jsal.Jsalbot 1.0 | 4 | 1% | 5 |
| stelo.Mirror 1.1 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 70.6 | 67 / 350 | 3.64 | 13.7% | 35702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.1% | 189 |
| ara.Shera 0.88 | 2.6 | 14.0% | 54 |
| hadur117.nano.SanaroS2 0.2 | 2.9 | 13.7% | 67 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.4% | 30 |
| amz.NanoClone 1.41 | 5.2 | 9.7% | 4 |
| maribo.IotaCT 1.1 | 6.0 | 7.9% | 2 |
| dsw.StaticD 1.0 | 6.9 | 7.0% | 4 |
| stelo.MirrorMicro 1.0 | 8.6 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 9.1 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 67.3 | 8 / 35 | 3854 |
| 2 | 4 | 57.4 | 62.5 | 4 / 35 | 3447 |
| 3 | 3 | 61.9 | 73.3 | 8 / 35 | 3651 |
| 4 | 2 | 61.3 | 71.1 | 8 / 35 | 3760 |
| 5 | 3 | 60.3 | 70.5 | 7 / 35 | 3275 |
| 6 | 3 | 63.3 | 78.7 | 7 / 35 | 3672 |
| 7 | 4 | 59.5 | 67.3 | 7 / 35 | 3410 |
| 8 | 3 | 58.7 | 69.2 | 3 / 35 | 3309 |
| 9 | 2 | 61.1 | 71.7 | 5 / 35 | 3648 |
| 10 | 2 | 62.4 | 74.6 | 10 / 35 | 3676 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 79 | 41% |
| ara.Shera 0.88 | 32 | 59% |
| maribo.mini.MiniQuester 0.1 | 17 | 71% |
| amz.NanoClone 1.41 | 2 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 111 | 39% | 143 |
| ara.Shera 0.88 | 70 | 25% | 87 |
| maribo.mini.MiniQuester 0.1 | 44 | 16% | 57 |
| amz.NanoClone 1.41 | 26 | 9% | 29 |
| dsw.StaticD 1.0 | 15 | 5% | 16 |
| mme.NikeEnhanced 2.0 | 6 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 4 | 1% | 5 |
| stelo.MirrorMicro 1.0 | 4 | 1% | 4 |
| maribo.IotaCT 1.1 | 3 | 1% | 3 |

## Melee bench: F43

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 63.7 | 14 / 350 | 4.27 | 11.8% | 28397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.0% | 285 |
| brainfade.melee.Dusk 0.44 | 2.2 | 13.4% | 34 |
| hadur117.nano.SanaroS2 0.2 | 3.5 | 11.8% | 14 |
| dummy.micro.Sparrow 2.5 | 3.6 | 11.9% | 10 |
| wcsv.melee.EngineerMelee 0.1 | 4.9 | 10.9% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 9.9% | 4 |
| mz.NanoGod 2.02 | 7.3 | 8.2% | 1 |
| jab.DiamondStealer 5 | 7.6 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 67.3 | 2 / 35 | 2893 |
| 2 | 4 | 57.7 | 61.3 | 1 / 35 | 2775 |
| 3 | 3 | 58.2 | 61.3 | 1 / 35 | 2980 |
| 4 | 4 | 58.9 | 63.5 | 4 / 35 | 2807 |
| 5 | 4 | 57.6 | 61.3 | 2 / 35 | 2616 |
| 6 | 4 | 59.1 | 64.8 | 1 / 35 | 2738 |
| 7 | 4 | 58.1 | 62.9 | 0 / 35 | 2670 |
| 8 | 3 | 58.8 | 63.8 | 1 / 35 | 2894 |
| 9 | 3 | 58.7 | 61.6 | 1 / 35 | 2970 |
| 10 | 3 | 60.5 | 69.2 | 1 / 35 | 3054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 74 | 7% |
| brainfade.melee.Dusk 0.44 | 9 | 56% |
| dummy.micro.Sparrow 2.5 | 5 | 40% |
| Krabb.akim2.Akim2 1.1b | 3 | 33% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 0% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 336 of 350 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 178 | 53% | 182 |
| brainfade.melee.Dusk 0.44 | 44 | 13% | 49 |
| dummy.micro.Sparrow 2.5 | 33 | 10% | 35 |
| wcsv.melee.EngineerMelee 0.1 | 31 | 9% | 31 |
| Krabb.akim2.Akim2 1.1b | 22 | 7% | 25 |
| mz.NanoGod 2.02 | 16 | 5% | 16 |
| jab.DiamondStealer 5 | 12 | 4% | 12 |

## Melee bench: F44

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 72.2 | 72 / 350 | 3.50 | 14.3% | 37276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.5 | 16.4% | 131 |
| tzu.TheArtOfWar 1.2 | 1.6 | 15.9% | 101 |
| hadur117.nano.SanaroS2 0.2 | 2.9 | 14.3% | 72 |
| wompi.Quokka 1.6 | 4.5 | 10.7% | 15 |
| jwirde.Gort 2.0 | 5.0 | 10.0% | 24 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.4% | 6 |
| disan.Chair 2.2.0 | 7.1 | 7.4% | 4 |
| stf.PanzerGeneral 0.1 | 7.9 | 6.6% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 71.7 | 9 / 35 | 3492 |
| 2 | 3 | 60.2 | 68.9 | 4 / 35 | 3725 |
| 3 | 3 | 62.6 | 74.9 | 7 / 35 | 3556 |
| 4 | 3 | 62.6 | 73.7 | 6 / 35 | 4095 |
| 5 | 2 | 64.5 | 79.4 | 13 / 35 | 4031 |
| 6 | 3 | 61.5 | 71.4 | 6 / 35 | 3625 |
| 7 | 3 | 61.4 | 70.8 | 7 / 35 | 3871 |
| 8 | 3 | 60.1 | 67.3 | 7 / 35 | 3651 |
| 9 | 3 | 61.5 | 70.8 | 9 / 35 | 3515 |
| 10 | 3 | 62.1 | 73.3 | 4 / 35 | 3715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tzu.TheArtOfWar 1.2 | 55 | 22% |
| stelo.Liblix 0.3.1 | 55 | 62% |
| jwirde.Gort 2.0 | 18 | 33% |
| wompi.Quokka 1.6 | 9 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 100% |
| disan.Chair 2.2.0 | 5 | 80% |

Hadur died in 280 of 350 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 94 | 34% | 103 |
| stelo.Liblix 0.3.1 | 87 | 31% | 124 |
| jwirde.Gort 2.0 | 31 | 11% | 39 |
| wompi.Quokka 1.6 | 25 | 9% | 31 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 18 | 6% | 22 |
| stf.PanzerGeneral 0.1 | 9 | 3% | 14 |
| amk.jointstrike.JointStrike 0.2 | 8 | 3% | 8 |
| sample.Crazy 1.0 | 4 | 1% | 5 |
| disan.Chair 2.2.0 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 71.9 | 75 / 350 | 3.53 | 14.7% | 38825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.2 | 14.7% | 75 |
| jje.BagPuss 1.2 | 2.5 | 13.2% | 35 |
| eem.IWillFireNoBullet v2.8 | 2.8 | 12.8% | 167 |
| sul.Lunar 1.1 | 4.0 | 11.1% | 38 |
| myl.nano.Graviton 1.10 | 4.8 | 10.5% | 15 |
| hvilela.HVilela 0.9 | 6.3 | 9.3% | 2 |
| fm.claire 1.7 | 7.0 | 8.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.4 | 8.3% | 4 |
| wit.Deep7 2.0 | 9.0 | 6.6% | 15 |
| abud.ThirdRobo 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 76.8 | 11 / 35 | 3823 |
| 2 | 1 | 63.4 | 78.4 | 9 / 35 | 3896 |
| 3 | 1 | 63.0 | 76.2 | 8 / 35 | 3903 |
| 4 | 1 | 62.4 | 73.7 | 7 / 35 | 4018 |
| 5 | 2 | 60.6 | 68.9 | 8 / 35 | 3821 |
| 6 | 1 | 60.3 | 68.9 | 8 / 35 | 3768 |
| 7 | 1 | 59.7 | 66.3 | 7 / 35 | 3674 |
| 8 | 2 | 57.7 | 61.3 | 6 / 35 | 3537 |
| 9 | 1 | 61.5 | 69.8 | 7 / 35 | 4110 |
| 10 | 1 | 63.4 | 78.4 | 4 / 35 | 4275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 91 | 45% |
| jje.BagPuss 1.2 | 22 | 36% |
| sul.Lunar 1.1 | 20 | 30% |
| myl.nano.Graviton 1.10 | 12 | 75% |
| wit.Deep7 2.0 | 6 | 33% |
| fm.claire 1.7 | 4 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 75% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 276 of 350 rounds, at a mean tick of 1215. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 66 | 24% | 102 |
| eem.IWillFireNoBullet v2.8 | 61 | 22% | 0 |
| sul.Lunar 1.1 | 40 | 14% | 70 |
| myl.nano.Graviton 1.10 | 38 | 14% | 65 |
| fm.claire 1.7 | 25 | 9% | 30 |
| hvilela.HVilela 0.9 | 16 | 6% | 27 |
| wit.Deep7 2.0 | 14 | 5% | 24 |
| pez.mini.ChironexFleckeri 0.5 | 11 | 4% | 21 |
| abud.ThirdRobo 1.0 | 4 | 1% | 10 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 70.9 | 43 / 350 | 3.62 | 12.9% | 28855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.6% | 130 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.1% | 142 |
| hadur117.nano.SanaroS2 0.2 | 3.0 | 12.9% | 43 |
| cx.Princess 1.0 | 4.3 | 10.8% | 23 |
| mz.MicroSheep 1.0 | 4.9 | 10.6% | 7 |
| sadoner.killer 0.2 | 5.9 | 9.4% | 4 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.2% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.8% | 0 |
| kurios.DOSexe .9a | 9.1 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 74.6 | 2 / 35 | 2767 |
| 2 | 3 | 59.3 | 71.1 | 3 / 35 | 2756 |
| 3 | 3 | 60.9 | 74.3 | 6 / 35 | 3048 |
| 4 | 3 | 61.3 | 76.2 | 5 / 35 | 3011 |
| 5 | 3 | 58.8 | 70.8 | 2 / 35 | 2833 |
| 6 | 3 | 57.7 | 65.4 | 2 / 35 | 2904 |
| 7 | 3 | 59.4 | 69.2 | 6 / 35 | 2906 |
| 8 | 3 | 58.4 | 66.0 | 5 / 35 | 2906 |
| 9 | 3 | 59.2 | 69.5 | 6 / 35 | 2807 |
| 10 | 3 | 59.8 | 71.4 | 6 / 35 | 2917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 73 | 45% |
| rsalesc.melee.Medina 0.4.5 | 45 | 11% |
| cx.Princess 1.0 | 6 | 33% |
| mz.MicroSheep 1.0 | 6 | 17% |
| sadoner.killer 0.2 | 2 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 111 | 36% | 145 |
| rsalesc.melee.Medina 0.4.5 | 98 | 32% | 104 |
| mz.MicroSheep 1.0 | 27 | 9% | 28 |
| cx.Princess 1.0 | 24 | 8% | 24 |
| sadoner.killer 0.2 | 19 | 6% | 20 |
| arthord.NanoSatanMelee Beta | 16 | 5% | 16 |
| jeremyreeder.collective.Prophet 5 | 9 | 3% | 9 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 3 |
| kurios.DOSexe .9a | 1 | 0% | 1 |

