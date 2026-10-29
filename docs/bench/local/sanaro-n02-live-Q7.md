# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 71.9 | 45 / 350 | 3.53 | 13.6% | 37245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 249 |
| hadur117.nano.SanaroQ7 0.1 | 2.2 | 13.6% | 45 |
| sgp.JollyNinja 3.53 | 3.7 | 11.7% | 28 |
| mz.MicroGodMelee 1 | 4.3 | 11.2% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.6% | 6 |
| lorneswork.Predator 1.0 | 5.1 | 10.5% | 9 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.8% | 2 |
| skm.butterfly 1.0 | 8.9 | 4.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 71.4 | 6 / 35 | 3665 |
| 2 | 2 | 60.5 | 72.4 | 2 / 35 | 3737 |
| 3 | 4 | 58.1 | 61.6 | 5 / 35 | 3638 |
| 4 | 2 | 62.2 | 78.1 | 8 / 35 | 3339 |
| 5 | 2 | 59.6 | 67.6 | 5 / 35 | 3651 |
| 6 | 2 | 63.3 | 79.4 | 4 / 35 | 3883 |
| 7 | 2 | 63.4 | 80.0 | 6 / 35 | 3939 |
| 8 | 2 | 61.9 | 74.0 | 4 / 35 | 3984 |
| 9 | 2 | 59.3 | 66.3 | 2 / 35 | 3918 |
| 10 | 2 | 59.3 | 68.3 | 3 / 35 | 3491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 138 | 8% |
| sgp.JollyNinja 3.53 | 13 | 77% |
| mz.MicroGodMelee 1 | 11 | 91% |
| lorneswork.Predator 1.0 | 10 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 100% |
| skm.butterfly 1.0 | 1 | 0% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |

Hadur died in 305 of 350 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 169 | 55% | 177 |
| sgp.JollyNinja 3.53 | 35 | 11% | 46 |
| lorneswork.Predator 1.0 | 32 | 10% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 10% | 35 |
| mz.MicroGodMelee 1 | 16 | 5% | 30 |
| adt.Ar2 1.0 | 14 | 5% | 14 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 2% | 7 |
| skm.butterfly 1.0 | 3 | 1% | 3 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 64.5 | 59 / 350 | 4.20 | 13.7% | 43071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.7 | 14.6% | 105 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.7 | 14.7% | 79 |
| hadur117.nano.SanaroQ7 0.1 | 2.7 | 13.7% | 59 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.6% | 6 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.2% | 29 |
| fnc.bandit.Bandit 5.2.0 | 6.6 | 8.3% | 5 |
| sch.Simone 0.3d | 6.8 | 8.5% | 33 |
| Noran.BitchingElk 0.054 | 7.4 | 7.9% | 23 |
| stelo.PatternRobot 1.0 | 8.6 | 6.9% | 8 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 60.6 | 6 / 35 | 4073 |
| 2 | 3 | 59.8 | 64.1 | 5 / 35 | 4314 |
| 3 | 3 | 59.4 | 66.3 | 3 / 35 | 4079 |
| 4 | 4 | 54.2 | 52.4 | 2 / 35 | 3784 |
| 5 | 2 | 63.1 | 72.4 | 6 / 35 | 4691 |
| 6 | 2 | 63.0 | 72.1 | 7 / 35 | 4706 |
| 7 | 3 | 57.9 | 59.7 | 5 / 35 | 4078 |
| 8 | 3 | 59.3 | 61.0 | 7 / 35 | 4417 |
| 9 | 1 | 63.9 | 75.9 | 11 / 35 | 4539 |
| 10 | 3 | 59.2 | 60.3 | 7 / 35 | 4390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 16% |
| pulsar.PulsarMax 0.8.9 | 41 | 51% |
| sch.Simone 0.3d | 14 | 14% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 69% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| Noran.BitchingElk 0.054 | 9 | 33% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |
| stelo.PatternRobot 1.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 291 of 350 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 76 | 26% | 84 |
| pulsar.PulsarMax 0.8.9 | 74 | 25% | 90 |
| lrem.micro.SpikeSoldier 0.4 | 38 | 13% | 46 |
| sch.Simone 0.3d | 24 | 8% | 27 |
| fnc.bandit.Bandit 5.2.0 | 23 | 8% | 27 |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 8% | 32 |
| Noran.BitchingElk 0.054 | 13 | 4% | 18 |
| stelo.PatternRobot 1.0 | 13 | 4% | 16 |
| fullsail.SweetTea 1.1 | 8 | 3% | 10 |

## Melee bench: F03

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 76.2 | 60 / 350 | 3.14 | 14.5% | 40957 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 2.2 | 14.8% | 90 |
| hadur117.nano.SanaroQ7 0.1 | 2.3 | 14.5% | 60 |
| radnor.DoctorBob 1.42 | 2.4 | 14.6% | 96 |
| vuen.Cake 2.51 | 3.1 | 13.5% | 82 |
| urdos.URDOS 1.3 | 5.0 | 10.2% | 14 |
| adt.Ar1 2.1 | 6.1 | 8.4% | 3 |
| oa.weak.FlyMk1 0.1 | 7.5 | 7.0% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.8% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.1 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 75.6 | 6 / 35 | 3922 |
| 2 | 3 | 60.8 | 70.8 | 6 / 35 | 4042 |
| 3 | 3 | 63.1 | 79.7 | 7 / 35 | 4070 |
| 4 | 3 | 61.9 | 74.6 | 5 / 35 | 4154 |
| 5 | 1 | 63.0 | 78.7 | 9 / 35 | 4237 |
| 6 | 1 | 61.3 | 75.9 | 5 / 35 | 3959 |
| 7 | 1 | 62.9 | 79.0 | 6 / 35 | 4397 |
| 8 | 2 | 62.7 | 77.8 | 7 / 35 | 3952 |
| 9 | 2 | 61.7 | 76.2 | 7 / 35 | 4018 |
| 10 | 4 | 60.9 | 74.0 | 2 / 35 | 4206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 59 | 39% |
| radnor.DoctorBob 1.42 | 52 | 37% |
| kawigi.nano.Lib 1.0 | 44 | 11% |
| urdos.URDOS 1.3 | 14 | 36% |
| oa.weak.FlyMk1 0.1 | 5 | 80% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 0% |

Hadur died in 292 of 350 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 92 | 32% | 97 |
| radnor.DoctorBob 1.42 | 75 | 26% | 93 |
| vuen.Cake 2.51 | 55 | 19% | 74 |
| urdos.URDOS 1.3 | 35 | 12% | 38 |
| adt.Ar1 2.1 | 13 | 4% | 15 |
| ghent.ArthurPanzergon 1.0.0 | 8 | 3% | 8 |
| oa.weak.FlyMk1 0.1 | 7 | 2% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 1% | 7 |

## Melee bench: F04

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 68.8 | 9 / 350 | 3.81 | 13.5% | 43594 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.0% | 318 |
| apc.LeeroyJenkins2 1.0 | 2.4 | 13.8% | 14 |
| hadur117.nano.SanaroQ7 0.1 | 2.6 | 13.5% | 9 |
| TNT.TNT 0.99.1 | 4.1 | 10.6% | 2 |
| josago.Jorgito 0.16 | 5.0 | 9.5% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.9% | 5 |
| tj.zombie1n 1.0.1 | 6.7 | 7.1% | 2 |
| rampancy.Durandal 2.1d | 8.0 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.5% | 0 |
| spin.Bugstard 0.012b | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 65.1 | 2 / 35 | 3977 |
| 2 | 2 | 63.6 | 75.2 | 1 / 35 | 4340 |
| 3 | 2 | 62.4 | 72.4 | 1 / 35 | 4207 |
| 4 | 2 | 60.4 | 64.8 | 1 / 35 | 4493 |
| 5 | 3 | 60.9 | 67.3 | 0 / 35 | 4242 |
| 6 | 3 | 63.3 | 72.7 | 0 / 35 | 4608 |
| 7 | 2 | 61.6 | 67.9 | 1 / 35 | 4511 |
| 8 | 3 | 61.1 | 67.6 | 0 / 35 | 4390 |
| 9 | 3 | 60.4 | 65.1 | 2 / 35 | 4201 |
| 10 | 3 | 62.4 | 69.5 | 1 / 35 | 4625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 134 | 5% |
| apc.LeeroyJenkins2 1.0 | 3 | 67% |
| josago.Jorgito 0.16 | 1 | 0% |
| tj.zombie1n 1.0.1 | 1 | 0% |

Hadur died in 341 of 350 rounds, at a mean tick of 1086. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 209 | 61% | 217 |
| apc.LeeroyJenkins2 1.0 | 54 | 16% | 55 |
| josago.Jorgito 0.16 | 38 | 11% | 39 |
| TNT.TNT 0.99.1 | 14 | 4% | 14 |
| tj.zombie1n 1.0.1 | 12 | 4% | 11 |
| css.Delitioner 0.11 | 8 | 2% | 8 |
| rampancy.Durandal 2.1d | 4 | 1% | 4 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 66.5 | 52 / 350 | 4.01 | 12.9% | 33442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 1.5 | 14.9% | 115 |
| jekl.StoneGhost 0.7 | 1.9 | 15.1% | 91 |
| hadur117.nano.SanaroQ7 0.1 | 3.2 | 12.9% | 52 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.5% | 49 |
| mld.Wisdom 1.0 | 4.7 | 12.1% | 23 |
| gg.Wolverine 2.0 | 6.2 | 8.8% | 6 |
| spinnercat.Omen 1.0 | 7.1 | 7.5% | 4 |
| DBall.NUKE 0.1 | 8.2 | 6.8% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.4% | 7 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.7 | 61.6 | 5 / 35 | 3460 |
| 2 | 3 | 59.3 | 68.9 | 6 / 35 | 3150 |
| 3 | 3 | 60.5 | 72.7 | 4 / 35 | 3228 |
| 4 | 3 | 58.7 | 63.2 | 5 / 35 | 3624 |
| 5 | 3 | 59.5 | 67.0 | 4 / 35 | 3531 |
| 6 | 3 | 59.3 | 65.7 | 5 / 35 | 3420 |
| 7 | 4 | 57.7 | 61.9 | 5 / 35 | 3336 |
| 8 | 3 | 59.5 | 67.9 | 8 / 35 | 2977 |
| 9 | 3 | 57.8 | 63.5 | 5 / 35 | 3197 |
| 10 | 3 | 61.2 | 73.0 | 5 / 35 | 3519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 40 | 40% |
| jekl.StoneGhost 0.7 | 31 | 45% |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 33% |
| mld.Wisdom 1.0 | 10 | 40% |
| gg.Wolverine 2.0 | 7 | 100% |
| DBall.NUKE 0.1 | 2 | 50% |
| spinnercat.Omen 1.0 | 1 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 77 | 26% | 89 |
| origin.SleepSiphon 1.7b | 71 | 24% | 87 |
| mld.Wisdom 1.0 | 58 | 19% | 62 |
| pe.minimelee.SandboxMiniMelee 1.1 | 54 | 18% | 65 |
| gg.Wolverine 2.0 | 20 | 7% | 25 |
| spinnercat.Omen 1.0 | 10 | 3% | 10 |
| DBall.NUKE 0.1 | 5 | 2% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 1% | 4 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.4 | 103 / 350 | 2.77 | 16.6% | 50140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.3 | 18.3% | 107 |
| rtk.Tachikoma 1.0 | 2.0 | 17.5% | 96 |
| hadur117.nano.SanaroQ7 0.1 | 2.7 | 16.6% | 103 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.9% | 22 |
| franzor.Lizt 1.3.1 | 4.5 | 11.1% | 25 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.8% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.1% | 0 |
| sample.Target 1.0 | 9.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.7 | 82.9 | 12 / 35 | 4917 |
| 2 | 3 | 66.0 | 77.1 | 10 / 35 | 5002 |
| 3 | 3 | 65.9 | 74.9 | 9 / 35 | 4819 |
| 4 | 2 | 68.5 | 85.1 | 12 / 35 | 5002 |
| 5 | 3 | 68.6 | 83.8 | 16 / 35 | 4921 |
| 6 | 2 | 68.5 | 83.8 | 13 / 35 | 5242 |
| 7 | 3 | 66.7 | 76.5 | 9 / 35 | 5252 |
| 8 | 2 | 67.6 | 83.8 | 7 / 35 | 5434 |
| 9 | 3 | 66.9 | 78.4 | 9 / 35 | 5029 |
| 10 | 3 | 65.4 | 77.5 | 6 / 35 | 4522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 110 | 60% |
| rsalesc.melee.Monk 0.3.6c | 41 | 12% |
| oog.melee.CapuletDroid 1.1 | 24 | 83% |
| franzor.Lizt 1.3.1 | 17 | 53% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 248 of 350 rounds, at a mean tick of 1163. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 109 | 44% | 180 |
| rsalesc.melee.Monk 0.3.6c | 84 | 34% | 93 |
| oog.melee.CapuletDroid 1.1 | 30 | 12% | 58 |
| franzor.Lizt 1.3.1 | 12 | 5% | 3 |
| exauge.GateKeeper 1.1.121g | 6 | 2% | 8 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 3 |
| skm.PateranBotlock2 1.0 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 67.4 | 67 / 350 | 3.94 | 13.4% | 35511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| shrub.Vapour v159 | 1.8 | 14.1% | 88 |
| hadur117.nano.SanaroQ7 0.1 | 2.0 | 13.4% | 67 |
| tm.Yuugao 1.0 | 2.2 | 13.4% | 90 |
| Krabb.sliNk.Garm 0.9u | 4.6 | 10.8% | 29 |
| com.spp.robocode.MostlyHarmless 010 | 4.9 | 10.3% | 31 |
| m3thos.Eva00 1.1 | 6.0 | 9.3% | 20 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.7% | 18 |
| zyx.nano.BacillusComma 1.0 | 8.9 | 6.8% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.9 | 6.5% | 4 |
| SHAM.WOW 1.4 | 9.0 | 6.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 67.9 | 7 / 35 | 3430 |
| 2 | 1 | 62.0 | 72.4 | 11 / 35 | 3925 |
| 3 | 2 | 58.9 | 67.6 | 5 / 35 | 3772 |
| 4 | 2 | 59.7 | 69.8 | 10 / 35 | 3158 |
| 5 | 2 | 59.3 | 70.2 | 6 / 35 | 3353 |
| 6 | 2 | 58.4 | 66.3 | 6 / 35 | 3462 |
| 7 | 1 | 60.3 | 68.3 | 8 / 35 | 3876 |
| 8 | 3 | 56.1 | 60.6 | 4 / 35 | 3453 |
| 9 | 1 | 60.1 | 70.2 | 6 / 35 | 3753 |
| 10 | 3 | 55.7 | 60.3 | 4 / 35 | 3329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 45 | 53% |
| shrub.Vapour v159 | 22 | 23% |
| Krabb.sliNk.Garm 0.9u | 16 | 75% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 63% |
| com.spp.robocode.MostlyHarmless 010 | 10 | 80% |
| m3thos.Eva00 1.1 | 7 | 29% |
| qualidafial.MajorDick 1.0.1 | 4 | 75% |
| SHAM.WOW 1.4 | 3 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 64 | 22% | 87 |
| shrub.Vapour v159 | 60 | 21% | 68 |
| Krabb.sliNk.Garm 0.9u | 40 | 14% | 45 |
| com.spp.robocode.MostlyHarmless 010 | 33 | 12% | 40 |
| m3thos.Eva00 1.1 | 27 | 9% | 28 |
| jwst.DAD.DarkAndDarker 1.1 | 24 | 8% | 36 |
| zyx.nano.BacillusComma 1.0 | 19 | 7% | 20 |
| qualidafial.MajorDick 1.0.1 | 11 | 4% | 13 |
| SHAM.WOW 1.4 | 7 | 2% | 12 |

## Melee bench: F09

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.0 | 61.1 | 34 / 350 | 4.50 | 11.9% | 30547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.6% | 178 |
| kc.micro.Figment 1.0 | 1.9 | 15.2% | 72 |
| hadur117.nano.SanaroQ7 0.1 | 3.4 | 11.9% | 34 |
| yagami.Tidus 0.11 | 4.1 | 11.4% | 6 |
| pedersen.Grishnakh 1.0 | 4.6 | 11.2% | 36 |
| mc2.enemy.Original 0.9 | 5.9 | 9.0% | 16 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 8 |
| step.nanoPri 1.0 | 8.4 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 63.5 | 4 / 35 | 3243 |
| 2 | 3 | 57.4 | 62.2 | 4 / 35 | 3123 |
| 3 | 4 | 55.9 | 58.1 | 4 / 35 | 2823 |
| 4 | 3 | 57.1 | 62.9 | 4 / 35 | 2735 |
| 5 | 3 | 58.1 | 64.4 | 3 / 35 | 3090 |
| 6 | 4 | 57.2 | 61.9 | 2 / 35 | 3366 |
| 7 | 4 | 58.1 | 61.9 | 5 / 35 | 3208 |
| 8 | 4 | 55.3 | 57.8 | 0 / 35 | 3065 |
| 9 | 3 | 55.4 | 57.8 | 4 / 35 | 2807 |
| 10 | 3 | 57.4 | 60.6 | 4 / 35 | 3087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 47 | 32% |
| kc.micro.Figment 1.0 | 27 | 33% |
| mc2.enemy.Original 0.9 | 8 | 50% |
| pedersen.Grishnakh 1.0 | 7 | 14% |
| yagami.Tidus 0.11 | 6 | 67% |
| step.nanoPri 1.0 | 1 | 100% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 316 of 350 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 93 | 29% | 108 |
| kc.micro.Figment 1.0 | 75 | 24% | 83 |
| yagami.Tidus 0.11 | 48 | 15% | 53 |
| mc2.enemy.Original 0.9 | 35 | 11% | 38 |
| pedersen.Grishnakh 1.0 | 35 | 11% | 37 |
| dft.Calliope 5.6 | 12 | 4% | 12 |
| robar.nano.Assertive_Melee 0.2 | 9 | 3% | 9 |
| step.nanoPri 1.0 | 5 | 2% | 6 |
| rdm.Dueler 0.4x | 4 | 1% | 4 |

## Melee bench: F10

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 77.3 | 84 / 350 | 3.05 | 15.1% | 41877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroQ7 0.1 | 1.6 | 15.1% | 84 |
| DTF.Kludgy 1.2b | 1.8 | 14.9% | 92 |
| ne.Chimera 1.2 | 3.1 | 13.8% | 55 |
| ejb.Polaris 1.0.1 | 3.6 | 12.7% | 48 |
| vStar.RAFzilla 2.15 | 5.3 | 10.8% | 31 |
| tvv.micro.Antares 1.1.1 | 5.6 | 10.9% | 33 |
| sam.Samspin 1.0 | 7.4 | 6.5% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.5% | 5 |
| donjezza.Muncho 1.0 | 9.9 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 74.3 | 9 / 35 | 4236 |
| 2 | 1 | 63.2 | 76.5 | 8 / 35 | 4214 |
| 3 | 3 | 60.8 | 70.2 | 6 / 35 | 4152 |
| 4 | 2 | 62.0 | 75.6 | 7 / 35 | 3950 |
| 5 | 2 | 63.0 | 78.1 | 7 / 35 | 4039 |
| 6 | 1 | 64.0 | 80.6 | 9 / 35 | 4323 |
| 7 | 1 | 64.8 | 81.6 | 11 / 35 | 4279 |
| 8 | 1 | 63.7 | 78.7 | 11 / 35 | 4169 |
| 9 | 2 | 63.9 | 79.0 | 9 / 35 | 4345 |
| 10 | 2 | 63.5 | 78.1 | 7 / 35 | 4170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 49 | 53% |
| DTF.Kludgy 1.2b | 48 | 42% |
| ne.Chimera 1.2 | 26 | 31% |
| tvv.micro.Antares 1.1.1 | 24 | 38% |
| vStar.RAFzilla 2.15 | 16 | 56% |
| kurios.DOSexe .9b | 7 | 86% |
| sam.Samspin 1.0 | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 268 of 350 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 80 | 30% | 98 |
| ne.Chimera 1.2 | 77 | 29% | 89 |
| ejb.Polaris 1.0.1 | 45 | 17% | 73 |
| tvv.micro.Antares 1.1.1 | 29 | 11% | 30 |
| vStar.RAFzilla 2.15 | 18 | 7% | 26 |
| sam.Samspin 1.0 | 10 | 4% | 15 |
| kurios.DOSexe .9b | 5 | 2% | 14 |
| donjezza.Muncho 1.0 | 3 | 1% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 0% | 1 |

## Melee bench: F11

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 64.8 | 56 / 350 | 4.17 | 12.7% | 32235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.3% | 150 |
| cx.mini.Nimrod 0.55 | 2.5 | 12.6% | 42 |
| hadur117.nano.SanaroQ7 0.1 | 2.7 | 12.7% | 56 |
| djc.DynaBot 0.1.1 | 4.0 | 11.2% | 28 |
| br2.MobyDickBot 1.6 | 5.3 | 10.0% | 28 |
| uji.YellohFellah 1.0 | 6.2 | 9.1% | 24 |
| rdt199.Warlord 0.73 | 6.5 | 9.2% | 22 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.7% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.1 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.0 | 62.5 | 8 / 35 | 2961 |
| 2 | 3 | 57.1 | 61.3 | 4 / 35 | 3174 |
| 3 | 3 | 57.2 | 64.1 | 6 / 35 | 2863 |
| 4 | 2 | 58.0 | 63.8 | 4 / 35 | 3418 |
| 5 | 3 | 59.6 | 65.7 | 9 / 35 | 3252 |
| 6 | 3 | 60.9 | 71.4 | 6 / 35 | 3567 |
| 7 | 2 | 57.7 | 64.1 | 4 / 35 | 3234 |
| 8 | 2 | 59.9 | 68.6 | 6 / 35 | 3489 |
| 9 | 3 | 58.1 | 64.8 | 5 / 35 | 3287 |
| 10 | 3 | 56.2 | 61.3 | 4 / 35 | 2990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 64 | 53% |
| cx.mini.Nimrod 0.55 | 16 | 38% |
| djc.DynaBot 0.1.1 | 14 | 36% |
| br2.MobyDickBot 1.6 | 11 | 9% |
| rdt199.Warlord 0.73 | 10 | 80% |
| uji.YellohFellah 1.0 | 6 | 17% |

Hadur died in 294 of 350 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 117 | 40% | 146 |
| cx.mini.Nimrod 0.55 | 54 | 18% | 60 |
| djc.DynaBot 0.1.1 | 30 | 10% | 35 |
| rdt199.Warlord 0.73 | 28 | 10% | 39 |
| br2.MobyDickBot 1.6 | 23 | 8% | 25 |
| uji.YellohFellah 1.0 | 18 | 6% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 3% | 9 |
| stelo.MirrorNano 1.3 | 8 | 3% | 8 |
| KiraNL.Chupacabra 0.4 | 8 | 3% | 8 |

## Melee bench: F12

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 65.3 | 53 / 350 | 4.12 | 12.6% | 29035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.6 | 14.7% | 91 |
| nat.PallasHawk 1.0 | 2.4 | 13.7% | 78 |
| darkcanuck.Leon 1.01 | 2.5 | 13.9% | 87 |
| hadur117.nano.SanaroQ7 0.1 | 3.7 | 12.6% | 53 |
| brainfade.melee.Genghis 0.36 | 4.8 | 11.1% | 27 |
| jrm.Test0 1.0 | 6.4 | 8.1% | 2 |
| jp.Perpy 16.0 | 7.2 | 7.6% | 3 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.2% | 3 |
| jaybot.bots.Oddball 4.0 | 9.1 | 6.1% | 5 |
| stuff.Vlad 0.1 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.8 | 68.9 | 7 / 35 | 2619 |
| 2 | 4 | 56.6 | 62.2 | 5 / 35 | 2860 |
| 3 | 5 | 57.2 | 63.5 | 5 / 35 | 2814 |
| 4 | 2 | 59.2 | 69.8 | 4 / 35 | 3092 |
| 5 | 4 | 56.9 | 62.9 | 4 / 35 | 2917 |
| 6 | 3 | 59.2 | 69.5 | 6 / 35 | 3028 |
| 7 | 5 | 54.2 | 56.5 | 2 / 35 | 2873 |
| 8 | 4 | 59.0 | 67.6 | 8 / 35 | 2897 |
| 9 | 4 | 57.9 | 65.7 | 5 / 35 | 2823 |
| 10 | 2 | 58.9 | 66.7 | 7 / 35 | 3112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 40 | 20% |
| bts.wiki.RipCurl 0.9b | 39 | 44% |
| nat.PallasHawk 1.0 | 37 | 32% |
| brainfade.melee.Genghis 0.36 | 13 | 77% |
| jrm.Test0 1.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 0% |
| jp.Perpy 16.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 77 | 26% | 90 |
| nat.PallasHawk 1.0 | 58 | 20% | 73 |
| darkcanuck.Leon 1.01 | 53 | 18% | 66 |
| brainfade.melee.Genghis 0.36 | 36 | 12% | 41 |
| jrm.Test0 1.0 | 23 | 8% | 25 |
| jp.Perpy 16.0 | 18 | 6% | 18 |
| cs.sheldor.Talon 1.1 | 15 | 5% | 17 |
| stuff.Vlad 0.1 | 9 | 3% | 10 |
| jaybot.bots.Oddball 4.0 | 8 | 3% | 9 |

## Melee bench: F13

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 69.8 | 24 / 350 | 3.72 | 12.6% | 31354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 17.0% | 94 |
| mn.Combat 3.25.0 | 1.5 | 17.6% | 175 |
| shinh.Entangled 0.3 | 3.7 | 12.5% | 35 |
| hadur117.nano.SanaroQ7 0.1 | 3.8 | 12.6% | 24 |
| gh.micro.Gruweltje 0.7 | 4.5 | 12.1% | 20 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 1 |
| stelo.Wang 1.0 | 7.1 | 6.7% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.3 | 67.9 | 2 / 35 | 3264 |
| 2 | 3 | 61.0 | 74.3 | 4 / 35 | 3148 |
| 3 | 4 | 59.5 | 69.8 | 2 / 35 | 3108 |
| 4 | 3 | 60.8 | 75.6 | 4 / 35 | 3149 |
| 5 | 5 | 56.2 | 59.0 | 0 / 35 | 3163 |
| 6 | 4 | 59.9 | 73.0 | 1 / 35 | 2967 |
| 7 | 3 | 60.7 | 72.7 | 5 / 35 | 3205 |
| 8 | 4 | 58.1 | 66.7 | 1 / 35 | 3110 |
| 9 | 4 | 59.1 | 70.5 | 2 / 35 | 3021 |
| 10 | 4 | 59.1 | 68.3 | 3 / 35 | 3219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 75 | 24% |
| ags.Glacier 0.2.11 | 42 | 5% |
| shinh.Entangled 0.3 | 15 | 27% |
| gh.micro.Gruweltje 0.7 | 5 | 0% |

Hadur died in 326 of 350 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 109 | 33% | 125 |
| ags.Glacier 0.2.11 | 100 | 31% | 103 |
| shinh.Entangled 0.3 | 49 | 15% | 54 |
| gh.micro.Gruweltje 0.7 | 34 | 10% | 34 |
| stelo.Wang 1.0 | 16 | 5% | 16 |
| maribo.FollowFire 1 | 7 | 2% | 7 |
| apc.Colossus2 0.17 | 7 | 2% | 7 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 74.6 | 82 / 350 | 3.28 | 14.2% | 35343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.6% | 148 |
| hadur117.nano.SanaroQ7 0.1 | 2.0 | 14.2% | 82 |
| catcat20.shape.Theta 0.018 | 3.5 | 12.1% | 52 |
| Lo_Ian.Gandalf_V4 4.0 | 4.8 | 10.5% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 10.2% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 10.2% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 6.3 | 9.3% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.6 | 8.1% | 29 |
| pa.Improved 1.0 | 9.0 | 5.8% | 3 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 73.3 | 7 / 35 | 3316 |
| 2 | 2 | 62.7 | 77.8 | 9 / 35 | 3818 |
| 3 | 2 | 62.2 | 78.1 | 8 / 35 | 3425 |
| 4 | 2 | 61.1 | 72.4 | 9 / 35 | 3184 |
| 5 | 2 | 59.7 | 69.8 | 8 / 35 | 3364 |
| 6 | 2 | 61.5 | 72.7 | 4 / 35 | 3640 |
| 7 | 2 | 62.5 | 74.0 | 10 / 35 | 3789 |
| 8 | 2 | 61.4 | 73.0 | 7 / 35 | 3486 |
| 9 | 2 | 63.0 | 77.8 | 8 / 35 | 3690 |
| 10 | 2 | 63.1 | 77.5 | 12 / 35 | 3631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 83 | 39% |
| catcat20.shape.Theta 0.018 | 43 | 67% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 44% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 67% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 14% |
| sanyi.mikrobi.Roberto 1.0 | 6 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |

Hadur died in 268 of 350 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 117 | 44% | 144 |
| catcat20.shape.Theta 0.018 | 39 | 15% | 62 |
| Lo_Ian.Gandalf_V4 4.0 | 31 | 12% | 35 |
| sheldor.micro.PointInLineRRAL 1.0 | 23 | 9% | 27 |
| co.edu.usb.rc.LidisTron 1.0 | 20 | 7% | 25 |
| dmh.robocode.robot.RedDwarf 0.4 | 18 | 7% | 24 |
| sanyi.mikrobi.Roberto 1.0 | 13 | 5% | 25 |
| pa.Improved 1.0 | 5 | 2% | 6 |
| sample.TrackFire 1.0 | 2 | 1% | 2 |

## Melee bench: F15

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 62.8 | 45 / 350 | 4.35 | 12.7% | 37322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 14.7% | 72 |
| emp.Yngwie 1.11 | 2.8 | 13.8% | 110 |
| mld.DustBunny 3.8 | 3.2 | 12.9% | 39 |
| hadur117.nano.SanaroQ7 0.1 | 3.5 | 12.7% | 45 |
| kawigi.robot.Girl 1.2 | 5.0 | 10.9% | 56 |
| cb.nano.Insomnia 1.0 | 5.2 | 11.2% | 20 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.2% | 2 |
| lambdaxy.TBot 0.1 | 7.7 | 7.0% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.5% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 66.7 | 8 / 35 | 3606 |
| 2 | 5 | 56.1 | 58.4 | 3 / 35 | 3422 |
| 3 | 5 | 53.8 | 50.8 | 2 / 35 | 3517 |
| 4 | 4 | 57.9 | 60.0 | 4 / 35 | 3803 |
| 5 | 3 | 58.1 | 60.0 | 3 / 35 | 4091 |
| 6 | 3 | 56.8 | 59.7 | 4 / 35 | 3613 |
| 7 | 2 | 60.4 | 69.5 | 8 / 35 | 3526 |
| 8 | 3 | 59.8 | 66.3 | 4 / 35 | 4209 |
| 9 | 3 | 61.0 | 70.5 | 5 / 35 | 3723 |
| 10 | 4 | 59.4 | 66.0 | 4 / 35 | 3812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 32 | 50% |
| kawigi.micro.Shiz 1.1 | 25 | 16% |
| cb.nano.Insomnia 1.0 | 17 | 65% |
| kawigi.robot.Girl 1.2 | 16 | 56% |
| mld.DustBunny 3.8 | 8 | 13% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| Grystrion.TrackerWO 1.0 | 1 | 0% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 70 | 23% | 93 |
| mld.DustBunny 3.8 | 65 | 21% | 74 |
| kawigi.micro.Shiz 1.1 | 63 | 21% | 68 |
| cb.nano.Insomnia 1.0 | 34 | 11% | 31 |
| kawigi.robot.Girl 1.2 | 26 | 9% | 34 |
| Grystrion.TrackerWO 1.0 | 17 | 6% | 18 |
| divineomega.TrialBot 0.003 | 16 | 5% | 17 |
| lambdaxy.TBot 0.1 | 12 | 4% | 13 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 1% | 2 |

## Melee bench: F16

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 65.1 | 32 / 350 | 4.14 | 13.4% | 42012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.7% | 176 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.1 | 15.6% | 36 |
| hadur117.nano.SanaroQ7 0.1 | 2.9 | 13.4% | 32 |
| techdude.forest.FlamingForest 1.1 | 4.8 | 10.3% | 65 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.7% | 8 |
| tvv.nano.Polaris 1.2 | 5.4 | 9.6% | 21 |
| stelo.IntrinsicVolatility 1.4 | 6.6 | 8.1% | 6 |
| repositorio.NanoStep 1.0 | 8.8 | 5.4% | 1 |
| asd.Cthulhu 1.3 | 9.1 | 5.1% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.1 | 5.1% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 64.1 | 2 / 35 | 3981 |
| 2 | 3 | 60.8 | 67.3 | 2 / 35 | 4273 |
| 3 | 3 | 61.4 | 68.3 | 4 / 35 | 4501 |
| 4 | 3 | 58.1 | 60.3 | 3 / 35 | 3998 |
| 5 | 3 | 60.0 | 63.8 | 1 / 35 | 4288 |
| 6 | 3 | 60.9 | 66.0 | 4 / 35 | 4449 |
| 7 | 3 | 60.7 | 65.7 | 4 / 35 | 4295 |
| 8 | 3 | 56.2 | 57.5 | 2 / 35 | 3552 |
| 9 | 2 | 62.7 | 73.0 | 5 / 35 | 4348 |
| 10 | 3 | 60.6 | 64.8 | 5 / 35 | 4327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 67 | 6% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 27 | 44% |
| techdude.forest.FlamingForest 1.1 | 11 | 9% |
| bvh.fnr.Fenrir 0.36l | 10 | 90% |
| tvv.nano.Polaris 1.2 | 6 | 33% |
| stelo.IntrinsicVolatility 1.4 | 4 | 50% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |

Hadur died in 319 of 350 rounds, at a mean tick of 1116. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 142 | 45% | 149 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 74 | 23% | 87 |
| bvh.fnr.Fenrir 0.36l | 24 | 8% | 26 |
| techdude.forest.FlamingForest 1.1 | 19 | 6% | 22 |
| stelo.IntrinsicVolatility 1.4 | 19 | 6% | 21 |
| tvv.nano.Polaris 1.2 | 17 | 5% | 18 |
| divineomega.DivineBot 1.9.4.5 | 10 | 3% | 13 |
| asd.Cthulhu 1.3 | 10 | 3% | 10 |
| repositorio.NanoStep 1.0 | 4 | 1% | 4 |

## Melee bench: F17

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 62.4 | 54 / 350 | 4.38 | 12.7% | 37534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 2.3 | 14.2% | 85 |
| et.Predator 1.8 | 2.5 | 13.6% | 64 |
| cx.BlestPain 1.41 | 2.8 | 13.5% | 77 |
| hadur117.nano.SanaroQ7 0.1 | 3.5 | 12.7% | 54 |
| ahf.NanoAndrew .4 | 4.7 | 11.7% | 35 |
| nic.Nicator 2.4 | 5.3 | 11.0% | 29 |
| maribo.melee.BMV 0.1 | 6.9 | 8.9% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.9% | 2 |
| tex.Longbot 0.4 | 8.7 | 5.5% | 3 |
| goblin.Bender 2.4 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.6 | 61.3 | 6 / 35 | 3498 |
| 2 | 2 | 61.4 | 69.8 | 7 / 35 | 4168 |
| 3 | 6 | 53.6 | 49.2 | 2 / 35 | 3461 |
| 4 | 7 | 51.3 | 44.4 | 2 / 35 | 3482 |
| 5 | 3 | 58.8 | 63.8 | 6 / 35 | 3575 |
| 6 | 3 | 60.4 | 67.9 | 8 / 35 | 3626 |
| 7 | 1 | 60.2 | 66.0 | 7 / 35 | 4032 |
| 8 | 3 | 61.1 | 67.3 | 8 / 35 | 4038 |
| 9 | 1 | 61.5 | 70.2 | 5 / 35 | 4094 |
| 10 | 5 | 58.6 | 64.4 | 3 / 35 | 3560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 47% |
| cx.BlestPain 1.41 | 29 | 66% |
| et.Predator 1.8 | 28 | 32% |
| nic.Nicator 2.4 | 15 | 33% |
| ahf.NanoAndrew .4 | 11 | 27% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 19% | 71 |
| et.Predator 1.8 | 51 | 17% | 60 |
| cx.BlestPain 1.41 | 48 | 16% | 66 |
| nic.Nicator 2.4 | 48 | 16% | 54 |
| ahf.NanoAndrew .4 | 47 | 16% | 51 |
| maribo.melee.BMV 0.1 | 19 | 6% | 19 |
| tex.Longbot 0.4 | 13 | 4% | 13 |
| edu.otg.spr.TheTeacher 1.2 | 11 | 4% | 12 |
| goblin.Bender 2.4 | 3 | 1% | 4 |

## Melee bench: F18

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 66.9 | 79 / 350 | 3.98 | 13.6% | 36392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.4 | 14.0% | 88 |
| hadur117.nano.SanaroQ7 0.1 | 1.7 | 13.6% | 79 |
| agd.Mooserwirt2 2.7 | 3.5 | 12.4% | 63 |
| uji.DBH 1.1 | 4.2 | 11.6% | 32 |
| ratosh.Nobo 0.21 | 5.2 | 10.6% | 15 |
| spinnercat.Robovirus 2.718 | 5.2 | 10.5% | 27 |
| sigterm.Sigterm 1.0 | 7.1 | 9.2% | 29 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.4% | 9 |
| stelo.WangRobot 1.0 | 9.2 | 5.6% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 69.2 | 9 / 35 | 3893 |
| 2 | 1 | 58.9 | 64.4 | 8 / 35 | 3646 |
| 3 | 2 | 58.4 | 65.1 | 7 / 35 | 3297 |
| 4 | 2 | 60.0 | 66.3 | 7 / 35 | 4038 |
| 5 | 1 | 61.0 | 70.5 | 10 / 35 | 3654 |
| 6 | 2 | 58.4 | 65.1 | 6 / 35 | 3568 |
| 7 | 2 | 60.0 | 68.3 | 8 / 35 | 3467 |
| 8 | 2 | 59.9 | 68.6 | 9 / 35 | 3427 |
| 9 | 2 | 59.4 | 66.7 | 8 / 35 | 3597 |
| 10 | 1 | 58.8 | 64.8 | 7 / 35 | 3805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 51% |
| agd.Mooserwirt2 2.7 | 26 | 27% |
| uji.DBH 1.1 | 25 | 60% |
| spinnercat.Robovirus 2.718 | 19 | 84% |
| sigterm.Sigterm 1.0 | 15 | 67% |
| ratosh.Nobo 0.21 | 12 | 50% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 33% |
| stelo.WangRobot 1.0 | 1 | 100% |

Hadur died in 272 of 350 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 88 | 32% | 115 |
| agd.Mooserwirt2 2.7 | 45 | 17% | 58 |
| ratosh.Nobo 0.21 | 36 | 13% | 41 |
| uji.DBH 1.1 | 34 | 13% | 42 |
| spinnercat.Robovirus 2.718 | 25 | 9% | 36 |
| sigterm.Sigterm 1.0 | 15 | 6% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 15 | 6% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8 | 3% | 10 |
| stelo.WangRobot 1.0 | 6 | 2% | 7 |

## Melee bench: F19

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 77.9 | 86 / 350 | 2.99 | 15.5% | 41944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.6 | 16.3% | 121 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 16.3% | 114 |
| hadur117.nano.SanaroQ7 0.1 | 2.4 | 15.5% | 86 |
| krillr.mini.JointStrike 2.0.0 | 4.4 | 11.1% | 11 |
| erdnis.Rover 0.3 | 4.6 | 10.6% | 12 |
| patson.PatsonTestBot 1.0 | 6.1 | 8.8% | 2 |
| mbh.Mbh 0.1 | 7.6 | 7.3% | 1 |
| pac.ABC 2.1 | 7.7 | 7.2% | 3 |
| pbg.R2D2 1.0 | 8.6 | 6.1% | 1 |
| pedersen.Moron 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 79.4 | 9 / 35 | 4254 |
| 2 | 3 | 65.7 | 81.0 | 9 / 35 | 4358 |
| 3 | 1 | 66.7 | 82.9 | 10 / 35 | 4614 |
| 4 | 2 | 64.1 | 76.5 | 11 / 35 | 3915 |
| 5 | 3 | 64.1 | 74.6 | 9 / 35 | 4363 |
| 6 | 1 | 67.9 | 87.3 | 12 / 35 | 4709 |
| 7 | 3 | 64.4 | 78.1 | 5 / 35 | 4196 |
| 8 | 3 | 61.8 | 71.1 | 6 / 35 | 3646 |
| 9 | 3 | 63.3 | 74.0 | 7 / 35 | 4119 |
| 10 | 3 | 63.3 | 74.0 | 8 / 35 | 3770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 99 | 55% |
| davidalves.net.DuelistMiniMelee 1.2 | 72 | 13% |
| erdnis.Rover 0.3 | 12 | 67% |
| krillr.mini.JointStrike 2.0.0 | 9 | 67% |
| pac.ABC 2.1 | 7 | 86% |
| patson.PatsonTestBot 1.0 | 3 | 100% |

Hadur died in 264 of 350 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 105 | 40% | 154 |
| mld.Infinity 2.2 | 70 | 27% | 46 |
| krillr.mini.JointStrike 2.0.0 | 31 | 12% | 45 |
| erdnis.Rover 0.3 | 20 | 8% | 35 |
| patson.PatsonTestBot 1.0 | 14 | 5% | 27 |
| mbh.Mbh 0.1 | 8 | 3% | 16 |
| pac.ABC 2.1 | 8 | 3% | 15 |
| pbg.R2D2 1.0 | 8 | 3% | 11 |

## Melee bench: F20

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.6 | 62 / 350 | 3.83 | 13.6% | 37241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 18.1% | 170 |
| hadur117.nano.SanaroQ7 0.1 | 2.0 | 13.6% | 62 |
| nz.jdc.nano.GridFu 1.0 | 3.6 | 11.6% | 21 |
| fwb.Nine 1.0.1 | 3.7 | 11.2% | 31 |
| catcat20.Rabbit 0.001 | 5.4 | 10.1% | 34 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 9.1% | 11 |
| djdjdj.NanoSkunk10 1.0 | 6.6 | 8.9% | 12 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.6% | 7 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.0 | 65.4 | 7 / 35 | 3557 |
| 2 | 2 | 59.7 | 66.7 | 5 / 35 | 3771 |
| 3 | 2 | 62.1 | 72.4 | 6 / 35 | 3798 |
| 4 | 2 | 61.2 | 69.8 | 11 / 35 | 3822 |
| 5 | 2 | 58.8 | 63.8 | 6 / 35 | 3720 |
| 6 | 2 | 59.3 | 68.3 | 2 / 35 | 3721 |
| 7 | 2 | 59.0 | 66.7 | 4 / 35 | 3374 |
| 8 | 2 | 63.2 | 75.6 | 10 / 35 | 3946 |
| 9 | 2 | 57.9 | 64.1 | 4 / 35 | 3564 |
| 10 | 2 | 62.0 | 73.0 | 7 / 35 | 3968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 64 | 33% |
| fwb.Nine 1.0.1 | 19 | 79% |
| catcat20.Rabbit 0.001 | 14 | 57% |
| nz.jdc.nano.GridFu 1.0 | 14 | 36% |
| bayen.nut.Squirrel 1.615 | 6 | 83% |
| djdjdj.NanoSkunk10 1.0 | 5 | 80% |
| m3thos.mini.Eva01 0.5.5 | 5 | 60% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 33% |

Hadur died in 289 of 350 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 119 | 41% | 129 |
| nz.jdc.nano.GridFu 1.0 | 42 | 15% | 50 |
| fwb.Nine 1.0.1 | 34 | 12% | 39 |
| catcat20.Rabbit 0.001 | 31 | 11% | 44 |
| m3thos.mini.Eva01 0.5.5 | 20 | 7% | 27 |
| bayen.nut.Squirrel 1.615 | 16 | 6% | 21 |
| djdjdj.NanoSkunk10 1.0 | 12 | 4% | 21 |
| ntc.ControlledChaos 1.1.4 | 11 | 4% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 1% | 6 |

## Melee bench: F21

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 78.4 | 95 / 350 | 2.94 | 16.2% | 46992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.4 | 17.3% | 157 |
| hadur117.nano.SanaroQ7 0.1 | 1.9 | 16.2% | 95 |
| dummy.mini.Scimitar 1.01 | 2.7 | 14.6% | 33 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 28 |
| eld.Hmm 1.0 | 5.4 | 9.1% | 32 |
| oa.weak.BotherBot 0.1 | 5.6 | 8.6% | 8 |
| fire219.CatBot 1.0 | 7.7 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.1 | 6.1% | 1 |
| PSW.Relentless 0.1 | 8.2 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 81.0 | 11 / 35 | 5177 |
| 2 | 2 | 65.7 | 82.5 | 11 / 35 | 4508 |
| 3 | 3 | 63.1 | 73.0 | 8 / 35 | 4314 |
| 4 | 2 | 63.6 | 75.9 | 6 / 35 | 4350 |
| 5 | 1 | 65.4 | 79.0 | 8 / 35 | 5047 |
| 6 | 2 | 66.0 | 76.5 | 9 / 35 | 5372 |
| 7 | 1 | 66.6 | 81.3 | 11 / 35 | 5089 |
| 8 | 2 | 62.7 | 74.6 | 7 / 35 | 4082 |
| 9 | 2 | 65.6 | 78.4 | 11 / 35 | 4777 |
| 10 | 2 | 65.5 | 81.9 | 13 / 35 | 4276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 106 | 44% |
| dummy.mini.Scimitar 1.01 | 31 | 84% |
| cf.RiO.RiOx 4.2.1 | 19 | 47% |
| eld.Hmm 1.0 | 17 | 53% |
| oa.weak.BotherBot 0.1 | 6 | 50% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 257 of 350 rounds, at a mean tick of 1064. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 105 | 41% | 139 |
| dummy.mini.Scimitar 1.01 | 55 | 21% | 90 |
| cf.RiO.RiOx 4.2.1 | 44 | 17% | 50 |
| eld.Hmm 1.0 | 15 | 6% | 29 |
| oa.weak.BotherBot 0.1 | 14 | 5% | 19 |
| fire219.CatBot 1.0 | 9 | 4% | 9 |
| el.JumpShoot 0.2 | 7 | 3% | 7 |
| PSW.Relentless 0.1 | 3 | 1% | 4 |
| arthord.MannyPacquiao Beta | 3 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.1 | 92 / 350 | 2.88 | 15.6% | 39590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.4% | 138 |
| hadur117.nano.SanaroQ7 0.1 | 2.1 | 15.6% | 92 |
| cre.Karolos 0.32 | 2.8 | 14.7% | 72 |
| stelo.AreaTargetingBot 1.1 | 4.4 | 10.8% | 18 |
| stelo.RamTrackSurfer 1.2 | 4.9 | 9.6% | 18 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 9.1% | 2 |
| sample.Walls 1.0 | 6.7 | 8.8% | 9 |
| cw.megas.Blade 0.8 | 7.8 | 8.0% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 78.4 | 9 / 35 | 3865 |
| 2 | 2 | 64.6 | 79.4 | 9 / 35 | 3818 |
| 3 | 2 | 65.9 | 80.3 | 11 / 35 | 4023 |
| 4 | 2 | 65.5 | 78.7 | 13 / 35 | 3798 |
| 5 | 3 | 63.3 | 73.7 | 8 / 35 | 4002 |
| 6 | 2 | 64.7 | 78.1 | 10 / 35 | 3932 |
| 7 | 2 | 65.8 | 81.3 | 10 / 35 | 4218 |
| 8 | 2 | 65.6 | 81.0 | 10 / 35 | 3937 |
| 9 | 2 | 64.5 | 77.1 | 6 / 35 | 4057 |
| 10 | 2 | 65.3 | 82.9 | 6 / 35 | 3940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 100 | 41% |
| cre.Karolos 0.32 | 50 | 30% |
| sample.Walls 1.0 | 18 | 83% |
| stelo.AreaTargetingBot 1.1 | 15 | 53% |
| stelo.RamTrackSurfer 1.2 | 11 | 55% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 260 of 350 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 116 | 45% | 163 |
| cre.Karolos 0.32 | 71 | 27% | 86 |
| stelo.AreaTargetingBot 1.1 | 27 | 10% | 31 |
| stelo.RamTrackSurfer 1.2 | 17 | 7% | 24 |
| sample.Walls 1.0 | 15 | 6% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 3% | 14 |
| cw.megas.Blade 0.8 | 7 | 3% | 9 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.9 | 56.2 | 37 / 350 | 4.94 | 10.9% | 28037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.1 | 14.9% | 86 |
| florent.XSeries.X2 0.12 | 2.8 | 13.0% | 64 |
| davidalves.Phoenix 0.54 | 2.9 | 13.6% | 90 |
| pedersen.Ugluk 1.1.1 | 3.5 | 12.3% | 41 |
| hadur117.nano.SanaroQ7 0.1 | 4.9 | 10.9% | 37 |
| oog.melee.Corsair 1.0 | 6.0 | 9.5% | 10 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.6% | 16 |
| lunchie.Lunchbox 0.93 | 8.1 | 6.8% | 3 |
| as.FrankTheTank 1.3 | 9.3 | 5.3% | 3 |
| evd.X1 0.01 | 9.6 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.9 | 56.5 | 2 / 35 | 3023 |
| 2 | 5 | 54.6 | 58.4 | 4 / 35 | 2796 |
| 3 | 6 | 52.1 | 51.1 | 3 / 35 | 2794 |
| 4 | 6 | 51.2 | 50.5 | 2 / 35 | 2585 |
| 5 | 5 | 55.7 | 59.0 | 6 / 35 | 2821 |
| 6 | 5 | 53.0 | 54.3 | 1 / 35 | 2766 |
| 7 | 5 | 52.5 | 54.3 | 4 / 35 | 2582 |
| 8 | 3 | 56.7 | 61.6 | 6 / 35 | 3086 |
| 9 | 4 | 56.0 | 61.0 | 5 / 35 | 2920 |
| 10 | 5 | 53.2 | 55.2 | 4 / 35 | 2664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 25 | 40% |
| florent.XSeries.X2 0.12 | 17 | 76% |
| davidalves.Phoenix 0.54 | 16 | 31% |
| pedersen.Ugluk 1.1.1 | 13 | 38% |
| stelo.SoJNanoMelee 1.1 | 7 | 29% |
| oog.melee.Corsair 1.0 | 4 | 50% |
| as.FrankTheTank 1.3 | 1 | 0% |

Hadur died in 314 of 350 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 71 | 23% | 84 |
| rz.GlowBlowMelee 1.4 | 61 | 19% | 74 |
| davidalves.Phoenix 0.54 | 57 | 18% | 60 |
| pedersen.Ugluk 1.1.1 | 50 | 16% | 51 |
| stelo.SoJNanoMelee 1.1 | 23 | 7% | 27 |
| oog.melee.Corsair 1.0 | 22 | 7% | 23 |
| lunchie.Lunchbox 0.93 | 17 | 5% | 19 |
| evd.X1 0.01 | 7 | 2% | 7 |
| as.FrankTheTank 1.3 | 5 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 63.8 | 50 / 350 | 4.25 | 12.5% | 29485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.1 | 14.5% | 92 |
| voidious.micro.BlitzBat 1.05 | 2.6 | 13.3% | 56 |
| jdw.Hurricane 1.4 | 3.2 | 12.8% | 67 |
| hadur117.nano.SanaroQ7 0.1 | 3.4 | 12.5% | 50 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 10.7% | 42 |
| ds.Oo 2.2 | 5.8 | 9.6% | 20 |
| gjr.Cephalosporin 0.1 | 7.1 | 8.4% | 15 |
| awesomeness.Elite 1.0 | 8.0 | 7.3% | 7 |
| adt.Ar2 1.1 | 8.9 | 6.4% | 2 |
| amk.ChumbaMini 0.2 | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 66.0 | 3 / 35 | 2944 |
| 2 | 4 | 56.9 | 62.9 | 6 / 35 | 2799 |
| 3 | 3 | 57.8 | 63.8 | 7 / 35 | 2949 |
| 4 | 3 | 57.0 | 64.1 | 4 / 35 | 2915 |
| 5 | 4 | 55.2 | 60.3 | 2 / 35 | 2828 |
| 6 | 2 | 60.9 | 70.2 | 10 / 35 | 3200 |
| 7 | 4 | 56.8 | 59.7 | 3 / 35 | 3414 |
| 8 | 3 | 58.5 | 66.3 | 6 / 35 | 2950 |
| 9 | 4 | 53.3 | 54.9 | 2 / 35 | 2728 |
| 10 | 3 | 59.4 | 70.2 | 7 / 35 | 2758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jdw.Hurricane 1.4 | 34 | 59% |
| voidious.mini.BrokenSword 2.0.3 | 32 | 31% |
| voidious.micro.BlitzBat 1.05 | 26 | 27% |
| gre.svman4.Morfeas 1.4.1 | 8 | 38% |
| ds.Oo 2.2 | 6 | 50% |
| gjr.Cephalosporin 0.1 | 4 | 25% |
| awesomeness.Elite 1.0 | 3 | 67% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| adt.Ar2 1.1 | 2 | 50% |

Hadur died in 302 of 350 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 73 | 24% | 82 |
| voidious.mini.BrokenSword 2.0.3 | 69 | 23% | 79 |
| jdw.Hurricane 1.4 | 55 | 18% | 71 |
| gre.svman4.Morfeas 1.4.1 | 32 | 11% | 35 |
| gjr.Cephalosporin 0.1 | 23 | 8% | 24 |
| ds.Oo 2.2 | 15 | 5% | 19 |
| adt.Ar2 1.1 | 15 | 5% | 16 |
| awesomeness.Elite 1.0 | 12 | 4% | 14 |
| amk.ChumbaMini 0.2 | 8 | 3% | 10 |

## Melee bench: F26

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 67.9 | 47 / 350 | 3.89 | 13.2% | 38202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.7% | 138 |
| shu.nitro.LENIN .T34 | 2.7 | 13.3% | 81 |
| hadur117.nano.SanaroQ7 0.1 | 2.9 | 13.2% | 47 |
| lrem.Spectre 0.4.4 | 3.6 | 12.8% | 42 |
| gh.mini.GrubbmOne 1.0 | 5.4 | 11.1% | 14 |
| js.PinBall 1.6 | 5.6 | 10.9% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 9.2% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.5% | 7 |
| sample.SpinBot 1.0 | 8.9 | 5.1% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 69.2 | 6 / 35 | 3863 |
| 2 | 3 | 60.5 | 65.7 | 5 / 35 | 4224 |
| 3 | 3 | 60.6 | 68.9 | 6 / 35 | 3561 |
| 4 | 3 | 57.8 | 63.8 | 3 / 35 | 3429 |
| 5 | 3 | 61.1 | 70.8 | 3 / 35 | 4023 |
| 6 | 3 | 60.5 | 68.3 | 5 / 35 | 3662 |
| 7 | 2 | 61.3 | 69.8 | 8 / 35 | 4082 |
| 8 | 3 | 60.6 | 68.3 | 2 / 35 | 4130 |
| 9 | 4 | 58.5 | 64.1 | 3 / 35 | 3483 |
| 10 | 2 | 61.2 | 70.2 | 6 / 35 | 3745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 43 | 23% |
| shu.nitro.LENIN .T34 | 28 | 25% |
| lrem.Spectre 0.4.4 | 25 | 60% |
| js.PinBall 1.6 | 13 | 69% |
| gh.mini.GrubbmOne 1.0 | 8 | 38% |
| jaybot.adv.bots.JayBot 2.0 | 2 | 50% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 0% |

Hadur died in 303 of 350 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 103 | 34% | 110 |
| shu.nitro.LENIN .T34 | 56 | 18% | 65 |
| lrem.Spectre 0.4.4 | 45 | 15% | 53 |
| gh.mini.GrubbmOne 1.0 | 39 | 13% | 44 |
| js.PinBall 1.6 | 30 | 10% | 41 |
| jaybot.adv.bots.JayBot 2.0 | 12 | 4% | 15 |
| sample.SpinBot 1.0 | 10 | 3% | 10 |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 3% | 12 |

## Melee bench: F27

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 59.6 | 45 / 350 | 4.64 | 11.9% | 32848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.8 | 15.1% | 137 |
| sheldor.melee.nano.TestMelee 0.1 | 3.0 | 12.5% | 46 |
| EH.Eagle 1.0.6 | 3.6 | 11.9% | 34 |
| hadur117.nano.SanaroQ7 0.1 | 3.8 | 11.9% | 45 |
| wee.Gem 1.8.4 | 4.0 | 11.4% | 65 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 9.8% | 15 |
| joe.ADinosaur 1.0 | 6.7 | 9.0% | 5 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.0% | 6 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.5% | 2 |
| cs.Grudge 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 48.9 | 36.5 | 2 / 35 | 3780 |
| 2 | 2 | 60.2 | 73.0 | 7 / 35 | 2983 |
| 3 | 5 | 54.4 | 58.4 | 4 / 35 | 2762 |
| 4 | 2 | 58.6 | 68.6 | 5 / 35 | 3081 |
| 5 | 6 | 53.1 | 43.8 | 2 / 35 | 4161 |
| 6 | 5 | 50.9 | 37.8 | 2 / 35 | 4195 |
| 7 | 4 | 57.3 | 66.0 | 7 / 35 | 2939 |
| 8 | 2 | 60.0 | 69.8 | 9 / 35 | 2990 |
| 9 | 3 | 58.3 | 68.9 | 2 / 35 | 2992 |
| 10 | 2 | 59.8 | 73.0 | 5 / 35 | 2965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 44 | 45% |
| EH.Eagle 1.0.6 | 25 | 32% |
| wee.Gem 1.8.4 | 17 | 35% |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 40% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 57% |
| throxbot.ThroxBot 0.1 | 2 | 50% |
| joe.ADinosaur 1.0 | 1 | 0% |

Hadur died in 308 of 350 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 78 | 25% | 93 |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 15% | 52 |
| EH.Eagle 1.0.6 | 43 | 14% | 50 |
| wee.Gem 1.8.4 | 35 | 11% | 43 |
| joe.ADinosaur 1.0 | 31 | 10% | 32 |
| cs.Grudge 1.0 | 25 | 8% | 27 |
| techdude.kombat.FlamingKombat 1.5 | 20 | 6% | 23 |
| caimano.Furia_Ceca 0.22 | 15 | 5% | 14 |
| throxbot.ThroxBot 0.1 | 13 | 4% | 16 |
3 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 76.1 | 91 / 350 | 3.15 | 15.1% | 36956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.4% | 135 |
| hadur117.nano.SanaroQ7 0.1 | 1.7 | 15.1% | 91 |
| uji.Antique 1.0 | 3.1 | 13.2% | 62 |
| qohnil.blot.BlotBot 3.61 | 4.1 | 11.5% | 28 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.9% | 14 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.1% | 12 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.8% | 6 |
| matt.advanced.Katana 1.0 | 7.9 | 6.9% | 1 |
| stelo.PianistNano 1.2 | 9.5 | 5.5% | 1 |
| stelo.Lifestealer 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 80.0 | 10 / 35 | 3402 |
| 2 | 2 | 63.6 | 77.8 | 10 / 35 | 3711 |
| 3 | 2 | 61.5 | 71.7 | 8 / 35 | 3694 |
| 4 | 2 | 60.4 | 69.8 | 4 / 35 | 3793 |
| 5 | 1 | 65.0 | 80.6 | 15 / 35 | 3877 |
| 6 | 2 | 63.0 | 78.1 | 7 / 35 | 3521 |
| 7 | 1 | 62.5 | 75.9 | 9 / 35 | 3835 |
| 8 | 2 | 62.2 | 74.6 | 10 / 35 | 3612 |
| 9 | 2 | 60.0 | 69.8 | 7 / 35 | 3472 |
| 10 | 1 | 65.4 | 82.2 | 11 / 35 | 4039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 104 | 43% |
| uji.Antique 1.0 | 46 | 48% |
| qohnil.blot.BlotBot 3.61 | 18 | 50% |
| pfvicm.Sobieski 7.2.3b | 12 | 67% |
| ahr.ice.Ice 1.0.2 | 6 | 33% |
| amk.ChumbaWumba 0.3 | 2 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 260 of 350 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 99 | 38% | 127 |
| uji.Antique 1.0 | 65 | 25% | 91 |
| pfvicm.Sobieski 7.2.3b | 29 | 11% | 35 |
| qohnil.blot.BlotBot 3.61 | 24 | 9% | 37 |
| ahr.ice.Ice 1.0.2 | 14 | 5% | 19 |
| amk.ChumbaWumba 0.3 | 12 | 5% | 16 |
| stelo.PianistNano 1.2 | 6 | 2% | 7 |
| stelo.Lifestealer 1.0 | 6 | 2% | 6 |
| matt.advanced.Katana 1.0 | 5 | 2% | 11 |

## Melee bench: F29

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 64.2 | 36 / 350 | 4.22 | 12.9% | 34633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.5 | 16.1% | 131 |
| deewiant.Anomaly 0.2 | 1.6 | 15.9% | 103 |
| myl.micro.Troodon 1.10 | 3.3 | 13.3% | 33 |
| hadur117.nano.SanaroQ7 0.1 | 3.7 | 12.9% | 36 |
| jok.PheonixM 0.1.2 | 4.9 | 11.4% | 25 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.0% | 1 |
| DBall.Anarchy 0.1 | 6.7 | 7.8% | 19 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.8% | 0 |
| jangs.ns51 1.0 | 9.4 | 4.5% | 0 |
| ap.Frederick 1.1 | 9.6 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.6 | 61.0 | 2 / 35 | 3278 |
| 2 | 3 | 59.9 | 66.3 | 2 / 35 | 3326 |
| 3 | 3 | 61.7 | 68.3 | 6 / 35 | 3813 |
| 4 | 3 | 61.2 | 69.5 | 3 / 35 | 3823 |
| 5 | 4 | 59.0 | 61.9 | 5 / 35 | 3475 |
| 6 | 4 | 57.6 | 60.3 | 1 / 35 | 3496 |
| 7 | 4 | 57.6 | 60.3 | 4 / 35 | 3299 |
| 8 | 4 | 59.7 | 65.7 | 6 / 35 | 3258 |
| 9 | 3 | 59.8 | 67.6 | 5 / 35 | 3323 |
| 10 | 4 | 58.5 | 61.0 | 2 / 35 | 3542 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 38 | 34% |
| deewiant.Anomaly 0.2 | 35 | 14% |
| myl.micro.Troodon 1.10 | 20 | 50% |
| jok.PheonixM 0.1.2 | 9 | 33% |
| DBall.Anarchy 0.1 | 7 | 57% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 315 of 350 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 103 | 33% | 109 |
| zyx.mega.YersiniaPestis 3.1 | 77 | 24% | 86 |
| myl.micro.Troodon 1.10 | 53 | 17% | 64 |
| jok.PheonixM 0.1.2 | 41 | 13% | 44 |
| DBall.Anarchy 0.1 | 15 | 5% | 19 |
| ph.melee.ArcherME 0.3 | 12 | 4% | 13 |
| fullsail.TimbotNoPrediction 1.0 | 7 | 2% | 8 |
| jangs.ns51 1.0 | 7 | 2% | 7 |

## Melee bench: F30

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.7 | 53.4 | 36 / 350 | 5.19 | 10.6% | 29216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.2 | 14.1% | 80 |
| darkcanuck.B26354 1.06 | 2.3 | 13.7% | 87 |
| oog.melee.Capulet 1.2 | 2.5 | 13.8% | 59 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.4% | 53 |
| hadur117.nano.SanaroQ7 0.1 | 5.1 | 10.6% | 36 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.4% | 20 |
| ntc.Opposite 1.5 | 7.3 | 8.0% | 1 |
| tripphippy.Alice 1.1 | 8.3 | 7.4% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 7.3% | 10 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 51.9 | 49.2 | 0 / 35 | 2973 |
| 2 | 5 | 53.3 | 51.7 | 4 / 35 | 2876 |
| 3 | 5 | 54.3 | 54.3 | 3 / 35 | 3162 |
| 4 | 5 | 55.2 | 55.2 | 5 / 35 | 3114 |
| 5 | 5 | 54.9 | 57.5 | 5 / 35 | 2677 |
| 6 | 5 | 54.1 | 55.9 | 6 / 35 | 2652 |
| 7 | 5 | 53.0 | 51.1 | 2 / 35 | 3064 |
| 8 | 5 | 54.2 | 56.2 | 4 / 35 | 2831 |
| 9 | 5 | 52.9 | 50.8 | 4 / 35 | 2886 |
| 10 | 5 | 53.4 | 52.4 | 3 / 35 | 2981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 21 | 67% |
| darkcanuck.B26354 1.06 | 11 | 36% |
| oog.melee.Capulet 1.2 | 9 | 44% |
| stelo.PastFuture 2.3.2 | 8 | 75% |
| intruder.PrairieWolf 2.61 | 8 | 63% |
| tripphippy.Alice 1.1 | 3 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |

Hadur died in 314 of 350 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 66 | 21% | 69 |
| stelo.PastFuture 2.3.2 | 59 | 19% | 67 |
| catcat20.Matcha 0.006 | 53 | 17% | 68 |
| oog.melee.Capulet 1.2 | 48 | 15% | 55 |
| intruder.PrairieWolf 2.61 | 23 | 7% | 25 |
| tripphippy.Alice 1.1 | 22 | 7% | 24 |
| ntc.Opposite 1.5 | 21 | 7% | 21 |
| fowl3628800.LightningBolt 2.6.0 | 17 | 5% | 16 |
| GarmBox.Anger 1.0 | 5 | 2% | 5 |

## Melee bench: F31

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.2 | 55.7 | 16 / 350 | 4.99 | 10.7% | 28681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 193 |
| gh.mini.Griezel 0.2 | 2.1 | 14.2% | 88 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 11.8% | 22 |
| d414.nano.Quantum 1.0.0 | 3.8 | 11.6% | 19 |
| hadur117.nano.SanaroQ7 0.1 | 4.7 | 10.7% | 16 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.6% | 10 |
| timmit.nano.TimDog 0.33 | 7.4 | 7.2% | 2 |
| fm.mammillarias 1.3 | 8.0 | 6.4% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.8 | 58.1 | 4 / 35 | 3061 |
| 2 | 5 | 54.8 | 57.1 | 2 / 35 | 2754 |
| 3 | 5 | 51.3 | 50.8 | 0 / 35 | 2576 |
| 4 | 5 | 53.2 | 52.7 | 3 / 35 | 2760 |
| 5 | 3 | 57.8 | 63.5 | 3 / 35 | 3157 |
| 6 | 5 | 55.1 | 56.5 | 1 / 35 | 3004 |
| 7 | 6 | 53.3 | 53.3 | 1 / 35 | 2642 |
| 8 | 5 | 49.9 | 47.0 | 1 / 35 | 2572 |
| 9 | 4 | 53.9 | 56.2 | 1 / 35 | 2879 |
| 10 | 4 | 57.2 | 61.6 | 0 / 35 | 3276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 32 | 25% |
| gh.mini.Griezel 0.2 | 30 | 10% |
| d414.nano.Quantum 1.0.0 | 9 | 0% |
| spinnercat.micro.Tyger 0.1 | 8 | 25% |
| fm.mammillarias 1.3 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |

Hadur died in 335 of 350 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 94 | 28% | 98 |
| abc.Shadow 3.84i | 79 | 24% | 85 |
| spinnercat.micro.Tyger 0.1 | 45 | 13% | 46 |
| d414.nano.Quantum 1.0.0 | 36 | 11% | 38 |
| fm.mammillarias 1.3 | 24 | 7% | 25 |
| gh.nano.Grofvuil 0.2 | 24 | 7% | 25 |
| timmit.nano.TimDog 0.33 | 17 | 5% | 18 |
| Gecko.ultimateGeckoBot 1.0 | 13 | 4% | 13 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 72.9 | 94 / 350 | 3.44 | 14.2% | 35041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.5% | 125 |
| hadur117.nano.SanaroQ7 0.1 | 2.0 | 14.2% | 94 |
| apc.botM 3.0 | 3.1 | 12.3% | 53 |
| lxx.ConceptA 0.8 | 4.1 | 11.3% | 8 |
| vjik.UnViolation 1.1 | 4.6 | 11.2% | 37 |
| bayen.UbaMicro 1.4 | 6.4 | 9.1% | 12 |
| panzer.Panzer 0.2 | 7.1 | 7.8% | 2 |
| yk.JahMicro 1.0 | 8.1 | 6.7% | 6 |
| conscience.Electron 1.3g | 8.7 | 6.3% | 2 |
| donjezza.Jezza 1.0 | 9.6 | 5.6% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 75.6 | 12 / 35 | 3372 |
| 2 | 2 | 62.3 | 74.3 | 11 / 35 | 3812 |
| 3 | 2 | 58.5 | 67.9 | 8 / 35 | 3225 |
| 4 | 2 | 61.7 | 73.3 | 13 / 35 | 3518 |
| 5 | 2 | 63.5 | 81.6 | 10 / 35 | 3797 |
| 6 | 2 | 60.4 | 73.0 | 7 / 35 | 3428 |
| 7 | 2 | 59.5 | 68.6 | 8 / 35 | 3465 |
| 8 | 1 | 60.2 | 70.2 | 10 / 35 | 3560 |
| 9 | 4 | 57.2 | 63.5 | 5 / 35 | 3221 |
| 10 | 1 | 63.2 | 81.0 | 10 / 35 | 3643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 89 | 39% |
| apc.botM 3.0 | 27 | 81% |
| vjik.UnViolation 1.1 | 26 | 35% |
| lxx.ConceptA 0.8 | 14 | 93% |
| donjezza.Jezza 1.0 | 7 | 43% |
| bayen.UbaMicro 1.4 | 7 | 71% |
| yk.JahMicro 1.0 | 6 | 67% |
| panzer.Panzer 0.2 | 4 | 75% |

Hadur died in 257 of 350 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 87 | 34% | 126 |
| lxx.ConceptA 0.8 | 59 | 23% | 66 |
| vjik.UnViolation 1.1 | 35 | 14% | 46 |
| apc.botM 3.0 | 25 | 10% | 49 |
| bayen.UbaMicro 1.4 | 17 | 7% | 20 |
| panzer.Panzer 0.2 | 11 | 4% | 13 |
| conscience.Electron 1.3g | 9 | 4% | 10 |
| yk.JahMicro 1.0 | 8 | 3% | 9 |
| donjezza.Jezza 1.0 | 6 | 2% | 10 |

## Melee bench: F33

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 64.7 | 42 / 350 | 4.18 | 13.1% | 37326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.1% | 157 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.0% | 42 |
| hadur117.nano.SanaroQ7 0.1 | 2.8 | 13.1% | 42 |
| gre.svman4.Leonidas 1.3.2 | 4.1 | 11.4% | 40 |
| labg.Cataclysm 2.05 | 4.7 | 11.2% | 43 |
| baal.nano.N 1.42 | 6.3 | 8.9% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.5% | 18 |
| zyx.micro.Ant 1.1 | 8.4 | 5.9% | 1 |
| sanja.First 0.1 | 9.2 | 5.0% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.2 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 65.1 | 2 / 35 | 4067 |
| 2 | 2 | 58.3 | 62.9 | 2 / 35 | 3697 |
| 3 | 4 | 56.8 | 58.1 | 4 / 35 | 3622 |
| 4 | 2 | 62.8 | 74.0 | 8 / 35 | 3899 |
| 5 | 5 | 55.8 | 55.6 | 3 / 35 | 3499 |
| 6 | 2 | 58.3 | 63.2 | 5 / 35 | 3355 |
| 7 | 4 | 57.5 | 60.0 | 2 / 35 | 3652 |
| 8 | 3 | 61.4 | 72.4 | 3 / 35 | 3440 |
| 9 | 2 | 59.1 | 61.6 | 7 / 35 | 3726 |
| 10 | 2 | 63.7 | 74.3 | 6 / 35 | 4369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 59 | 24% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 47% |
| gre.svman4.Leonidas 1.3.2 | 12 | 33% |
| labg.Cataclysm 2.05 | 11 | 45% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 33% |
| baal.nano.N 1.42 | 2 | 50% |

Hadur died in 308 of 350 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 116 | 38% | 131 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 17% | 70 |
| gre.svman4.Leonidas 1.3.2 | 45 | 15% | 47 |
| kinsen.melee.Angsaichmophobia 1.8c | 29 | 9% | 31 |
| labg.Cataclysm 2.05 | 24 | 8% | 28 |
| baal.nano.N 1.42 | 16 | 5% | 16 |
| zyx.micro.Ant 1.1 | 16 | 5% | 16 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 7 | 2% | 7 |
| sanja.First 0.1 | 3 | 1% | 4 |

## Melee bench: F34

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 72.3 | 59 / 350 | 3.49 | 14.4% | 40689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.3 | 17.6% | 128 |
| stelo.Spread 0.9 | 1.7 | 16.9% | 121 |
| hadur117.nano.SanaroQ7 0.1 | 3.0 | 14.4% | 59 |
| jcs.Seth 1.8 | 4.4 | 11.4% | 23 |
| tcf.Reach 3 | 4.9 | 10.6% | 8 |
| cli.Dancer 1.1 | 5.7 | 9.7% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 4 |
| amk.Punbot.Punbot 0.01 | 8.3 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 8.9 | 4.0% | 2 |
| sample.RamFire 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 72.4 | 4 / 35 | 4144 |
| 2 | 3 | 59.7 | 64.4 | 3 / 35 | 3872 |
| 3 | 3 | 62.6 | 72.7 | 6 / 35 | 4115 |
| 4 | 3 | 64.4 | 77.1 | 10 / 35 | 4023 |
| 5 | 3 | 64.2 | 73.3 | 6 / 35 | 4433 |
| 6 | 3 | 62.4 | 71.1 | 5 / 35 | 3892 |
| 7 | 3 | 63.4 | 75.9 | 4 / 35 | 4182 |
| 8 | 3 | 61.4 | 68.3 | 6 / 35 | 3862 |
| 9 | 3 | 62.3 | 70.5 | 7 / 35 | 3887 |
| 10 | 3 | 65.2 | 77.8 | 8 / 35 | 4279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 66 | 59% |
| kid.Gladiator .7.2 | 62 | 13% |
| jcs.Seth 1.8 | 16 | 56% |
| tcf.Reach 3 | 4 | 25% |
| sample.VelociRobot 1.0 | 2 | 50% |
| cli.Dancer 1.1 | 2 | 50% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 292 of 350 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 125 | 43% | 132 |
| stelo.Spread 0.9 | 81 | 28% | 120 |
| jcs.Seth 1.8 | 31 | 11% | 40 |
| tcf.Reach 3 | 18 | 6% | 19 |
| ratosh.Wesco 1.4 | 17 | 6% | 17 |
| cli.Dancer 1.1 | 11 | 4% | 13 |
| sample.VelociRobot 1.0 | 5 | 2% | 5 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 3 |
| sample.RamFire 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 66.6 | 20 / 350 | 4.01 | 12.3% | 29054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.7% | 273 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.3% | 32 |
| rz.HawkOnFire 0.1 | 3.5 | 12.2% | 13 |
| hadur117.nano.SanaroQ7 0.1 | 3.7 | 12.3% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.0% | 12 |
| wit.Chuliath 1.0 | 6.5 | 7.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.1 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.4 | 59.4 | 4 / 35 | 2472 |
| 2 | 2 | 60.3 | 70.2 | 2 / 35 | 3203 |
| 3 | 5 | 58.2 | 65.7 | 2 / 35 | 2853 |
| 4 | 4 | 59.7 | 69.2 | 3 / 35 | 2996 |
| 5 | 3 | 59.9 | 70.2 | 2 / 35 | 3120 |
| 6 | 4 | 57.2 | 63.8 | 0 / 35 | 2798 |
| 7 | 5 | 57.1 | 64.8 | 1 / 35 | 2679 |
| 8 | 3 | 59.2 | 66.7 | 3 / 35 | 3223 |
| 9 | 3 | 58.2 | 67.9 | 0 / 35 | 2864 |
| 10 | 3 | 58.8 | 67.9 | 3 / 35 | 2846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 79 | 9% |
| gh.mini.Gruwel 0.9 | 16 | 19% |
| rz.HawkOnFire 0.1 | 12 | 50% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 38% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 330 of 350 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 145 | 44% | 152 |
| gh.mini.Gruwel 0.9 | 50 | 15% | 53 |
| dmh.robocode.robot.BlackDeath 9.2 | 49 | 15% | 53 |
| rz.HawkOnFire 0.1 | 48 | 15% | 53 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 12 | 4% | 12 |
| myl.nano.KomoriNinja 1.1 | 10 | 3% | 10 |
| wit.Chuliath 1.0 | 9 | 3% | 10 |
| dans.Cinnamon 1.2 | 4 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 3 |

## Melee bench: F36

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 69.8 | 93 / 350 | 3.72 | 14.3% | 36915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroQ7 0.1 | 1.0 | 14.3% | 93 |
| bzdp.Pansy 2.1 | 2.6 | 12.6% | 56 |
| alpha.RainingFire 1.0 | 3.1 | 12.5% | 57 |
| mz.Cork 0.1 | 4.4 | 11.4% | 35 |
| bvh.micro.Freya 0.3 | 4.4 | 11.5% | 38 |
| m3thos.Eva02 0.7.1 | 5.9 | 10.4% | 31 |
| bvh.mini.Fenrir 0.39 | 6.6 | 9.4% | 12 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.5% | 6 |
| dl.BetterWalls 1.0 | 8.6 | 6.6% | 5 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.8% | 17 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 58.9 | 67.9 | 8 / 35 | 3236 |
| 2 | 1 | 61.5 | 70.8 | 10 / 35 | 3768 |
| 3 | 1 | 62.1 | 71.1 | 12 / 35 | 3970 |
| 4 | 1 | 62.8 | 72.7 | 10 / 35 | 4292 |
| 5 | 1 | 62.6 | 72.4 | 13 / 35 | 3957 |
| 6 | 1 | 61.4 | 73.3 | 7 / 35 | 3695 |
| 7 | 1 | 59.3 | 63.8 | 10 / 35 | 3587 |
| 8 | 1 | 61.6 | 74.0 | 7 / 35 | 3630 |
| 9 | 1 | 57.4 | 62.2 | 6 / 35 | 3332 |
| 10 | 1 | 60.6 | 69.8 | 10 / 35 | 3448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 31 | 48% |
| mz.Cork 0.1 | 27 | 67% |
| bvh.micro.Freya 0.3 | 26 | 81% |
| alpha.RainingFire 1.0 | 22 | 64% |
| m3thos.Eva02 0.7.1 | 16 | 44% |
| bvh.mini.Fenrir 0.39 | 13 | 85% |
| sample.MyFirstRobot 1.0 | 8 | 50% |
| dl.BetterWalls 1.0 | 4 | 50% |
| squidM.TentalceMeleeNano 1.1 | 4 | 25% |

Hadur died in 259 of 350 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 57 | 22% | 71 |
| bzdp.Pansy 2.1 | 44 | 17% | 61 |
| m3thos.Eva02 0.7.1 | 33 | 13% | 43 |
| bvh.micro.Freya 0.3 | 31 | 12% | 45 |
| mz.Cork 0.1 | 26 | 10% | 44 |
| bvh.mini.Fenrir 0.39 | 24 | 9% | 29 |
| squidM.TentalceMeleeNano 1.1 | 18 | 7% | 20 |
| dl.BetterWalls 1.0 | 17 | 7% | 25 |
| sample.MyFirstRobot 1.0 | 9 | 3% | 12 |

## Melee bench: F37

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 74.0 | 101 / 350 | 3.34 | 14.8% | 43930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroQ7 0.1 | 1.0 | 14.8% | 101 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 11.0% | 32 |
| germ.TheMind .2 | 3.0 | 11.7% | 51 |
| agrach.Dalek 1.0 | 4.8 | 10.2% | 55 |
| EBBU.Sim2 1.02 | 5.2 | 10.0% | 18 |
| stelo.UntouchableNano 1.3 | 6.3 | 9.2% | 34 |
| lmk.ACPFinal 0.1 | 7.3 | 8.6% | 12 |
| mb.Beast 0.1 | 7.5 | 8.7% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 8.1% | 2 |
| skm.Ryubot 1.0 | 8.8 | 7.7% | 22 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.6 | 68.6 | 10 / 35 | 4459 |
| 2 | 1 | 60.6 | 72.4 | 10 / 35 | 4230 |
| 3 | 1 | 62.7 | 77.1 | 14 / 35 | 4369 |
| 4 | 1 | 64.3 | 80.6 | 15 / 35 | 4867 |
| 5 | 1 | 61.1 | 76.2 | 7 / 35 | 4155 |
| 6 | 1 | 61.2 | 71.4 | 11 / 35 | 4642 |
| 7 | 1 | 59.6 | 70.8 | 7 / 35 | 4213 |
| 8 | 1 | 58.9 | 67.3 | 6 / 35 | 4355 |
| 9 | 1 | 62.8 | 79.4 | 13 / 35 | 4343 |
| 10 | 1 | 61.3 | 76.5 | 8 / 35 | 4297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 38 | 42% |
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 63% |
| agrach.Dalek 1.0 | 27 | 44% |
| EBBU.Sim2 1.02 | 23 | 78% |
| skm.Ryubot 1.0 | 17 | 24% |
| mb.Beast 0.1 | 17 | 65% |
| lmk.ACPFinal 0.1 | 16 | 75% |
| stelo.UntouchableNano 1.3 | 15 | 73% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 0% |

Hadur died in 250 of 350 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 51 | 20% | 70 |
| agrach.Dalek 1.0 | 45 | 18% | 57 |
| com.syncleus.robocode.Dreadnaught 0.1 | 39 | 16% | 59 |
| lmk.ACPFinal 0.1 | 25 | 10% | 39 |
| EBBU.Sim2 1.02 | 22 | 9% | 35 |
| mb.Beast 0.1 | 21 | 8% | 32 |
| stelo.UntouchableNano 1.3 | 20 | 8% | 24 |
| skm.Ryubot 1.0 | 16 | 6% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 4% | 14 |

## Melee bench: F38

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 60.4 | 32 / 350 | 4.57 | 11.5% | 29898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.7% | 186 |
| bvh.mini.Freya 0.55 | 2.4 | 13.1% | 32 |
| hadur117.nano.SanaroQ7 0.1 | 3.9 | 11.5% | 32 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.3% | 40 |
| cs.Wren 1.0 | 4.4 | 11.4% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 10.7% | 21 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.3% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.4% | 5 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.3 | 57.5 | 6 / 35 | 2841 |
| 2 | 4 | 57.0 | 63.8 | 3 / 35 | 2923 |
| 3 | 3 | 56.4 | 61.9 | 2 / 35 | 3067 |
| 4 | 6 | 54.1 | 54.0 | 1 / 35 | 3222 |
| 5 | 5 | 56.0 | 63.2 | 2 / 35 | 2709 |
| 6 | 3 | 57.1 | 63.2 | 2 / 35 | 3071 |
| 7 | 4 | 56.2 | 60.3 | 5 / 35 | 3085 |
| 8 | 3 | 57.4 | 61.9 | 4 / 35 | 3025 |
| 9 | 6 | 53.7 | 56.8 | 2 / 35 | 2658 |
| 10 | 2 | 57.5 | 61.3 | 5 / 35 | 3297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 52 | 29% |
| bvh.mini.Freya 0.55 | 13 | 54% |
| bts.mega.Gnarly 1.4 | 12 | 25% |
| cs.Wren 1.0 | 7 | 43% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 0% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |

Hadur died in 318 of 350 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 106 | 33% | 121 |
| bvh.mini.Freya 0.55 | 45 | 14% | 52 |
| bts.mega.Gnarly 1.4 | 44 | 14% | 47 |
| cs.Wren 1.0 | 41 | 13% | 42 |
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 10% | 34 |
| kdf.KoulDestroyer 1.0 | 31 | 10% | 33 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 3% | 9 |
| matt.UnderDark3 2.4.34 | 6 | 2% | 6 |
| bzdp.BoxCar 2.0 | 5 | 2% | 5 |

## Melee bench: F39

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.0 | 64.1 | 36 / 350 | 4.23 | 12.3% | 33439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 15.7% | 85 |
| az.Ololobot 0.2.4 | 2.1 | 13.7% | 123 |
| hadur117.nano.SanaroQ7 0.1 | 3.2 | 12.3% | 36 |
| catcat20.Lambda 0.024 | 3.6 | 12.0% | 47 |
| stelo.SoRobotNanoMelee 1.2 | 5.4 | 10.0% | 36 |
| winamp32.micro.MicroMacro 1.0 | 6.4 | 8.8% | 11 |
| gimp.GimpBot 0.1 | 6.9 | 8.1% | 6 |
| apollokidd.ApolloKidd 0.9 | 7.7 | 7.7% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.7 | 6.7% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.3 | 65.1 | 4 / 35 | 3508 |
| 2 | 3 | 58.4 | 67.3 | 3 / 35 | 3541 |
| 3 | 4 | 53.2 | 54.9 | 3 / 35 | 3004 |
| 4 | 4 | 54.8 | 59.4 | 1 / 35 | 3107 |
| 5 | 4 | 56.3 | 61.9 | 4 / 35 | 3165 |
| 6 | 3 | 60.0 | 71.4 | 5 / 35 | 3611 |
| 7 | 2 | 58.3 | 68.6 | 5 / 35 | 3246 |
| 8 | 3 | 58.6 | 65.7 | 3 / 35 | 4000 |
| 9 | 3 | 56.2 | 63.2 | 4 / 35 | 2959 |
| 10 | 3 | 56.9 | 63.2 | 4 / 35 | 3298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 44 | 9% |
| bvh.fry.Freya 0.82 | 30 | 33% |
| catcat20.Lambda 0.024 | 18 | 67% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 13% |
| winamp32.micro.MicroMacro 1.0 | 9 | 56% |
| gimp.GimpBot 0.1 | 5 | 60% |
| apollokidd.ApolloKidd 0.9 | 2 | 0% |

Hadur died in 316 of 350 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 93 | 29% | 99 |
| az.Ololobot 0.2.4 | 65 | 21% | 68 |
| stelo.SoRobotNanoMelee 1.2 | 53 | 17% | 56 |
| catcat20.Lambda 0.024 | 38 | 12% | 49 |
| apollokidd.ApolloKidd 0.9 | 24 | 8% | 24 |
| winamp32.micro.MicroMacro 1.0 | 17 | 5% | 22 |
| gimp.GimpBot 0.1 | 11 | 3% | 15 |
| dcs.Eater_of_Worlds 1.1.3-A | 9 | 3% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 2% | 8 |

## Melee bench: F41

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 65.6 | 59 / 350 | 4.10 | 12.7% | 31452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.2% | 156 |
| ary.Swarm 1.1 | 2.9 | 13.5% | 40 |
| lessonz.robocode.Oz 0.5.0 | 3.0 | 13.4% | 48 |
| hadur117.nano.SanaroQ7 0.1 | 3.6 | 12.7% | 59 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 12.1% | 37 |
| shrub.Silver v048 | 6.3 | 8.5% | 5 |
| zyx.nano.Ant 1.1 | 6.7 | 8.2% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.1% | 5 |
| stelo.Mirror 1.1 | 8.7 | 5.6% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 62.9 | 5 / 35 | 3349 |
| 2 | 5 | 56.7 | 59.7 | 4 / 35 | 2990 |
| 3 | 4 | 57.5 | 61.9 | 6 / 35 | 2890 |
| 4 | 2 | 60.0 | 67.3 | 9 / 35 | 3090 |
| 5 | 5 | 56.5 | 58.4 | 3 / 35 | 3220 |
| 6 | 3 | 61.3 | 70.8 | 7 / 35 | 3379 |
| 7 | 4 | 59.5 | 67.9 | 4 / 35 | 3006 |
| 8 | 3 | 60.5 | 68.3 | 7 / 35 | 3156 |
| 9 | 2 | 61.8 | 75.2 | 8 / 35 | 3224 |
| 10 | 4 | 58.7 | 63.5 | 6 / 35 | 3148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 65 | 38% |
| lessonz.robocode.Oz 0.5.0 | 22 | 59% |
| ary.Swarm 1.1 | 16 | 75% |
| simonton.nano.MeleeSeed 1.8 | 14 | 36% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| shrub.Silver v048 | 2 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 96 | 33% | 119 |
| ary.Swarm 1.1 | 54 | 18% | 69 |
| lessonz.robocode.Oz 0.5.0 | 53 | 18% | 63 |
| simonton.nano.MeleeSeed 1.8 | 47 | 16% | 51 |
| zyx.nano.Ant 1.1 | 18 | 6% | 18 |
| stelo.Mirror 1.1 | 8 | 3% | 9 |
| shrub.Silver v048 | 6 | 2% | 8 |
| jsal.Jsalbot 1.0 | 6 | 2% | 8 |
| acogdev.alpha 0.2 | 4 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 69.0 | 45 / 350 | 3.79 | 13.4% | 36986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 180 |
| maribo.mini.MiniQuester 0.1 | 2.6 | 14.5% | 54 |
| ara.Shera 0.88 | 2.9 | 14.0% | 58 |
| hadur117.nano.SanaroQ7 0.1 | 3.5 | 13.4% | 45 |
| amz.NanoClone 1.41 | 5.2 | 9.3% | 7 |
| maribo.IotaCT 1.1 | 6.0 | 8.0% | 2 |
| dsw.StaticD 1.0 | 6.8 | 7.0% | 4 |
| stelo.MirrorMicro 1.0 | 8.6 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.4 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.0 | 67.3 | 5 / 35 | 3856 |
| 2 | 4 | 59.3 | 65.7 | 7 / 35 | 3470 |
| 3 | 4 | 60.9 | 70.5 | 7 / 35 | 3600 |
| 4 | 2 | 60.7 | 69.8 | 8 / 35 | 3786 |
| 5 | 3 | 59.9 | 71.1 | 4 / 35 | 3567 |
| 6 | 2 | 62.1 | 72.7 | 4 / 35 | 4161 |
| 7 | 4 | 60.0 | 71.4 | 1 / 35 | 3343 |
| 8 | 4 | 59.2 | 66.3 | 2 / 35 | 3895 |
| 9 | 4 | 59.6 | 67.6 | 4 / 35 | 3502 |
| 10 | 4 | 59.4 | 67.0 | 3 / 35 | 3806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 70 | 31% |
| ara.Shera 0.88 | 30 | 30% |
| maribo.mini.MiniQuester 0.1 | 24 | 54% |
| dsw.StaticD 1.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 0% |

Hadur died in 306 of 350 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 97 | 32% | 118 |
| ara.Shera 0.88 | 77 | 25% | 87 |
| maribo.mini.MiniQuester 0.1 | 73 | 24% | 84 |
| amz.NanoClone 1.41 | 16 | 5% | 17 |
| maribo.IotaCT 1.1 | 15 | 5% | 15 |
| dsw.StaticD 1.0 | 9 | 3% | 10 |
| mme.NikeEnhanced 2.0 | 8 | 3% | 8 |
| stelo.MirrorMicro 1.0 | 6 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 2% | 5 |

## Melee bench: F43

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 58.5 | 11 / 350 | 4.74 | 11.3% | 31383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.9% | 280 |
| brainfade.melee.Dusk 0.44 | 2.2 | 13.2% | 29 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.3% | 19 |
| hadur117.nano.SanaroQ7 0.1 | 4.2 | 11.3% | 11 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.1% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 10.0% | 5 |
| jab.DiamondStealer 5 | 7.3 | 7.8% | 0 |
| mz.NanoGod 2.02 | 7.6 | 7.7% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.0 | 56.8 | 2 / 35 | 3080 |
| 2 | 5 | 55.5 | 53.7 | 0 / 35 | 2934 |
| 3 | 4 | 58.2 | 60.3 | 0 / 35 | 3116 |
| 4 | 4 | 59.3 | 61.6 | 1 / 35 | 3327 |
| 5 | 5 | 57.7 | 60.3 | 0 / 35 | 2801 |
| 6 | 5 | 57.2 | 55.2 | 2 / 35 | 3229 |
| 7 | 2 | 60.1 | 64.8 | 4 / 35 | 3457 |
| 8 | 4 | 57.7 | 58.7 | 1 / 35 | 3242 |
| 9 | 4 | 56.3 | 55.9 | 0 / 35 | 2992 |
| 10 | 5 | 57.2 | 57.5 | 1 / 35 | 3205 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 60 | 10% |
| brainfade.melee.Dusk 0.44 | 11 | 27% |
| dummy.micro.Sparrow 2.5 | 5 | 20% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |

Hadur died in 339 of 350 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 149 | 44% | 153 |
| dummy.micro.Sparrow 2.5 | 47 | 14% | 49 |
| wcsv.melee.EngineerMelee 0.1 | 45 | 13% | 46 |
| brainfade.melee.Dusk 0.44 | 44 | 13% | 48 |
| Krabb.akim2.Akim2 1.1b | 18 | 5% | 18 |
| mz.NanoGod 2.02 | 17 | 5% | 17 |
| jab.DiamondStealer 5 | 15 | 4% | 15 |
| cvt.Firsty 1.0 | 4 | 1% | 4 |

## Melee bench: F44

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 68.0 | 65 / 350 | 3.88 | 13.7% | 37757 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.3 | 16.6% | 132 |
| tzu.TheArtOfWar 1.2 | 1.7 | 15.6% | 91 |
| hadur117.nano.SanaroQ7 0.1 | 3.0 | 13.7% | 65 |
| wompi.Quokka 1.6 | 4.1 | 11.6% | 18 |
| jwirde.Gort 2.0 | 5.0 | 10.5% | 32 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 8.9% | 6 |
| disan.Chair 2.2.0 | 7.0 | 7.5% | 6 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.6% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.7% | 1 |
| sample.Crazy 1.0 | 9.6 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 71.7 | 4 / 35 | 3715 |
| 2 | 3 | 59.8 | 66.7 | 3 / 35 | 3690 |
| 3 | 3 | 61.6 | 68.6 | 9 / 35 | 3966 |
| 4 | 3 | 61.6 | 69.2 | 8 / 35 | 3806 |
| 5 | 3 | 62.0 | 68.3 | 7 / 35 | 4121 |
| 6 | 3 | 58.0 | 61.9 | 5 / 35 | 3466 |
| 7 | 3 | 61.7 | 69.8 | 11 / 35 | 3683 |
| 8 | 3 | 59.7 | 64.8 | 9 / 35 | 3765 |
| 9 | 3 | 60.4 | 66.3 | 4 / 35 | 3796 |
| 10 | 3 | 61.7 | 73.0 | 5 / 35 | 3749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 59 | 49% |
| tzu.TheArtOfWar 1.2 | 48 | 42% |
| jwirde.Gort 2.0 | 10 | 50% |
| wompi.Quokka 1.6 | 7 | 57% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 100% |
| disan.Chair 2.2.0 | 4 | 75% |
| stf.PanzerGeneral 0.1 | 2 | 0% |

Hadur died in 285 of 350 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 96 | 34% | 126 |
| tzu.TheArtOfWar 1.2 | 87 | 31% | 107 |
| jwirde.Gort 2.0 | 32 | 11% | 40 |
| wompi.Quokka 1.6 | 22 | 8% | 23 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 17 | 6% | 19 |
| stf.PanzerGeneral 0.1 | 12 | 4% | 13 |
| disan.Chair 2.2.0 | 11 | 4% | 11 |
| amk.jointstrike.JointStrike 0.2 | 7 | 2% | 8 |
| sample.Crazy 1.0 | 1 | 0% | 3 |

## Melee bench: F45

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 65.4 | 50 / 350 | 4.11 | 13.8% | 40584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroQ7 0.1 | 1.7 | 13.8% | 50 |
| eem.IWillFireNoBullet v2.8 | 2.1 | 13.4% | 203 |
| jje.BagPuss 1.2 | 3.0 | 12.5% | 27 |
| sul.Lunar 1.1 | 4.3 | 11.0% | 31 |
| myl.nano.Graviton 1.10 | 4.5 | 10.8% | 18 |
| hvilela.HVilela 0.9 | 6.0 | 9.8% | 2 |
| fm.claire 1.7 | 7.0 | 8.5% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.6 | 8.4% | 10 |
| wit.Deep7 2.0 | 9.1 | 6.4% | 11 |
| abud.ThirdRobo 1.0 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 61.6 | 3 / 35 | 3695 |
| 2 | 1 | 59.6 | 64.4 | 5 / 35 | 4179 |
| 3 | 1 | 59.4 | 63.8 | 5 / 35 | 4222 |
| 4 | 2 | 58.7 | 63.2 | 4 / 35 | 3828 |
| 5 | 5 | 53.9 | 53.3 | 1 / 35 | 3460 |
| 6 | 1 | 63.2 | 74.3 | 7 / 35 | 4634 |
| 7 | 1 | 58.3 | 62.9 | 4 / 35 | 3717 |
| 8 | 1 | 61.0 | 65.7 | 7 / 35 | 4451 |
| 9 | 1 | 63.5 | 76.8 | 8 / 35 | 4107 |
| 10 | 1 | 60.8 | 67.9 | 6 / 35 | 4291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 73 | 34% |
| sul.Lunar 1.1 | 21 | 62% |
| jje.BagPuss 1.2 | 12 | 25% |
| myl.nano.Graviton 1.10 | 7 | 29% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| wit.Deep7 2.0 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 1 | 100% |

Hadur died in 301 of 350 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 64 | 21% | 86 |
| eem.IWillFireNoBullet v2.8 | 55 | 18% | 0 |
| myl.nano.Graviton 1.10 | 46 | 15% | 55 |
| sul.Lunar 1.1 | 38 | 13% | 79 |
| hvilela.HVilela 0.9 | 34 | 11% | 39 |
| fm.claire 1.7 | 21 | 7% | 28 |
| pez.mini.ChironexFleckeri 0.5 | 17 | 6% | 24 |
| abud.ThirdRobo 1.0 | 14 | 5% | 19 |
| wit.Deep7 2.0 | 11 | 4% | 15 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.nano.SanaroQ7 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 66.6 | 24 / 350 | 4.00 | 12.2% | 28989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.9% | 139 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.3% | 149 |
| hadur117.nano.SanaroQ7 0.1 | 3.2 | 12.2% | 24 |
| mz.MicroSheep 1.0 | 4.3 | 10.7% | 6 |
| cx.Princess 1.0 | 4.7 | 10.5% | 28 |
| sadoner.killer 0.2 | 6.0 | 9.1% | 3 |
| arthord.NanoSatanMelee Beta | 6.9 | 7.7% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.3% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.6 | 66.7 | 1 / 35 | 2771 |
| 2 | 3 | 59.5 | 70.8 | 3 / 35 | 3083 |
| 3 | 3 | 60.0 | 72.1 | 4 / 35 | 2984 |
| 4 | 4 | 55.7 | 61.6 | 2 / 35 | 2623 |
| 5 | 3 | 58.1 | 67.0 | 2 / 35 | 2830 |
| 6 | 3 | 59.3 | 70.5 | 2 / 35 | 2843 |
| 7 | 3 | 56.0 | 61.0 | 3 / 35 | 2869 |
| 8 | 4 | 56.5 | 62.9 | 1 / 35 | 2868 |
| 9 | 3 | 58.6 | 64.8 | 4 / 35 | 3087 |
| 10 | 3 | 59.2 | 69.2 | 2 / 35 | 3031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 64 | 23% |
| rsalesc.melee.Medina 0.4.5 | 28 | 14% |
| cx.Princess 1.0 | 5 | 80% |
| mz.MicroSheep 1.0 | 3 | 33% |
| jeremyreeder.collective.Prophet 5 | 1 | 0% |

Hadur died in 326 of 350 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 124 | 38% | 140 |
| rsalesc.melee.Medina 0.4.5 | 92 | 28% | 97 |
| mz.MicroSheep 1.0 | 31 | 10% | 31 |
| cx.Princess 1.0 | 24 | 7% | 25 |
| arthord.NanoSatanMelee Beta | 21 | 6% | 21 |
| sadoner.killer 0.2 | 18 | 6% | 18 |
| jeremyreeder.collective.Prophet 5 | 12 | 4% | 13 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 3 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

