# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 77.3 | 63 / 350 | 3.04 | 14.3% | 36424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 229 |
| hadur117.nano.SanaroS3 0.3 | 2.0 | 14.3% | 63 |
| sgp.JollyNinja 3.53 | 3.7 | 11.7% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.4 | 11.3% | 12 |
| mz.MicroGodMelee 1 | 4.7 | 10.8% | 7 |
| lorneswork.Predator 1.0 | 5.3 | 10.1% | 10 |
| adt.Ar2 1.0 | 6.9 | 7.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 9.9 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 78.1 | 7 / 35 | 3767 |
| 2 | 2 | 62.8 | 79.4 | 8 / 35 | 3416 |
| 3 | 2 | 61.2 | 75.6 | 5 / 35 | 3479 |
| 4 | 2 | 62.3 | 79.0 | 8 / 35 | 3140 |
| 5 | 2 | 62.6 | 77.1 | 6 / 35 | 3810 |
| 6 | 2 | 64.8 | 80.3 | 8 / 35 | 4331 |
| 7 | 2 | 63.2 | 78.4 | 5 / 35 | 4141 |
| 8 | 2 | 61.4 | 74.3 | 5 / 35 | 3374 |
| 9 | 2 | 60.8 | 74.3 | 7 / 35 | 3065 |
| 10 | 2 | 62.2 | 76.8 | 4 / 35 | 3901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 148 | 13% |
| sgp.JollyNinja 3.53 | 22 | 59% |
| mz.MicroGodMelee 1 | 20 | 95% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 55% |
| lorneswork.Predator 1.0 | 8 | 50% |
| adt.Ar2 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 288 of 350 rounds, at a mean tick of 1020. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 166 | 58% | 183 |
| sgp.JollyNinja 3.53 | 41 | 14% | 52 |
| lorneswork.Predator 1.0 | 26 | 9% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 8% | 28 |
| mz.MicroGodMelee 1 | 17 | 6% | 36 |
| adt.Ar2 1.0 | 8 | 3% | 10 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 2% | 6 |
| skm.butterfly 1.0 | 2 | 1% | 4 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 69.7 | 65 / 350 | 3.73 | 13.9% | 37591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.6 | 14.8% | 75 |
| pulsar.PulsarMax 0.8.9 | 1.9 | 14.7% | 110 |
| hadur117.nano.SanaroS3 0.3 | 2.5 | 13.9% | 65 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.5% | 6 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.9 | 10.4% | 27 |
| sch.Simone 0.3d | 6.8 | 8.0% | 18 |
| Noran.BitchingElk 0.054 | 7.1 | 8.0% | 35 |
| fnc.bandit.Bandit 5.2.0 | 7.4 | 7.6% | 3 |
| stelo.PatternRobot 1.0 | 8.5 | 6.6% | 10 |
| fullsail.SweetTea 1.1 | 10.0 | 4.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 74.9 | 7 / 35 | 4033 |
| 2 | 3 | 60.4 | 68.9 | 7 / 35 | 3860 |
| 3 | 2 | 61.3 | 71.1 | 10 / 35 | 3707 |
| 4 | 1 | 63.2 | 77.5 | 11 / 35 | 4067 |
| 5 | 3 | 59.1 | 66.7 | 5 / 35 | 3591 |
| 6 | 3 | 58.5 | 65.4 | 4 / 35 | 3514 |
| 7 | 3 | 59.6 | 68.3 | 4 / 35 | 3702 |
| 8 | 2 | 60.7 | 69.2 | 7 / 35 | 3900 |
| 9 | 3 | 59.2 | 64.8 | 5 / 35 | 3675 |
| 10 | 3 | 59.9 | 69.8 | 5 / 35 | 3542 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 55 | 38% |
| pulsar.PulsarMax 0.8.9 | 39 | 33% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 73% |
| Noran.BitchingElk 0.054 | 15 | 27% |
| sch.Simone 0.3d | 14 | 43% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |
| stelo.PatternRobot 1.0 | 2 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 67 | 24% | 79 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 66 | 23% | 87 |
| lrem.micro.SpikeSoldier 0.4 | 37 | 13% | 41 |
| com.cohesiva.robocode.ManOwaR 1.0 | 31 | 11% | 45 |
| stelo.PatternRobot 1.0 | 25 | 9% | 26 |
| sch.Simone 0.3d | 20 | 7% | 27 |
| Noran.BitchingElk 0.054 | 16 | 6% | 17 |
| fnc.bandit.Bandit 5.2.0 | 14 | 5% | 16 |
| fullsail.SweetTea 1.1 | 9 | 3% | 12 |

## Melee bench: F03

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 78.0 | 84 / 350 | 2.98 | 14.7% | 38624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.9 | 15.1% | 96 |
| hadur117.nano.SanaroS3 0.3 | 2.1 | 14.7% | 84 |
| kawigi.nano.Lib 1.0 | 2.4 | 14.3% | 80 |
| vuen.Cake 2.51 | 3.6 | 13.5% | 76 |
| urdos.URDOS 1.3 | 5.0 | 10.0% | 7 |
| adt.Ar1 2.1 | 6.6 | 7.6% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 7.3% | 3 |
| oa.weak.FlyMk1 0.1 | 7.4 | 7.0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.9 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.3 | 72.1 | 4 / 35 | 3809 |
| 2 | 1 | 64.6 | 83.2 | 11 / 35 | 4097 |
| 3 | 2 | 63.8 | 80.3 | 9 / 35 | 4406 |
| 4 | 1 | 63.3 | 82.2 | 11 / 35 | 3712 |
| 5 | 2 | 63.4 | 84.1 | 11 / 35 | 3389 |
| 6 | 1 | 62.4 | 80.0 | 8 / 35 | 3771 |
| 7 | 3 | 61.0 | 73.7 | 8 / 35 | 3725 |
| 8 | 3 | 59.0 | 69.5 | 4 / 35 | 3736 |
| 9 | 3 | 59.7 | 70.8 | 7 / 35 | 3736 |
| 10 | 1 | 64.5 | 84.1 | 11 / 35 | 4243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 66 | 52% |
| vuen.Cake 2.51 | 57 | 44% |
| kawigi.nano.Lib 1.0 | 51 | 18% |
| urdos.URDOS 1.3 | 12 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 50% |
| adt.Ar1 2.1 | 4 | 75% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 267 of 350 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 80 | 30% | 92 |
| radnor.DoctorBob 1.42 | 78 | 29% | 107 |
| vuen.Cake 2.51 | 51 | 19% | 77 |
| urdos.URDOS 1.3 | 30 | 11% | 38 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 3% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 8 | 3% | 11 |
| adt.Ar1 2.1 | 7 | 3% | 9 |
| oa.weak.FlyMk1 0.1 | 3 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% | 3 |

## Melee bench: F04

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 76.5 | 22 / 350 | 3.12 | 14.5% | 41478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 312 |
| hadur117.nano.SanaroS3 0.3 | 2.3 | 14.5% | 22 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.9% | 11 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 3 |
| josago.Jorgito 0.16 | 5.5 | 8.8% | 1 |
| tj.zombie1n 1.0.1 | 6.1 | 7.6% | 0 |
| css.Delitioner 0.11 | 6.4 | 7.5% | 0 |
| rampancy.Durandal 2.1d | 8.4 | 4.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 73.0 | 2 / 35 | 3999 |
| 2 | 3 | 63.6 | 77.8 | 4 / 35 | 3759 |
| 3 | 2 | 63.2 | 74.0 | 5 / 35 | 4121 |
| 4 | 2 | 64.5 | 80.3 | 1 / 35 | 4279 |
| 5 | 2 | 65.8 | 82.5 | 3 / 35 | 4505 |
| 6 | 2 | 63.1 | 75.6 | 1 / 35 | 4070 |
| 7 | 2 | 63.8 | 78.4 | 1 / 35 | 4115 |
| 8 | 3 | 61.0 | 68.9 | 0 / 35 | 3786 |
| 9 | 2 | 63.5 | 76.8 | 3 / 35 | 4102 |
| 10 | 2 | 64.2 | 77.5 | 2 / 35 | 4742 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 167 | 4% |
| apc.LeeroyJenkins2 1.0 | 11 | 64% |
| css.Delitioner 0.11 | 4 | 100% |
| TNT.TNT 0.99.1 | 4 | 50% |
| josago.Jorgito 0.16 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 328 of 350 rounds, at a mean tick of 1232. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 242 | 74% | 251 |
| apc.LeeroyJenkins2 1.0 | 44 | 13% | 51 |
| josago.Jorgito 0.16 | 25 | 8% | 26 |
| TNT.TNT 0.99.1 | 8 | 2% | 9 |
| css.Delitioner 0.11 | 5 | 2% | 9 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |

## Melee bench: F06

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 71.3 | 102 / 350 | 3.59 | 13.8% | 32120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.4 | 15.0% | 61 |
| origin.SleepSiphon 1.7b | 2.0 | 14.9% | 107 |
| hadur117.nano.SanaroS3 0.3 | 3.0 | 13.8% | 102 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.6 | 12.9% | 45 |
| mld.Wisdom 1.0 | 5.0 | 10.2% | 8 |
| gg.Wolverine 2.0 | 6.1 | 8.8% | 7 |
| spinnercat.Omen 1.0 | 7.2 | 7.6% | 4 |
| DBall.NUKE 0.1 | 8.1 | 7.1% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.5% | 10 |
| sample.Fire 1.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.8 | 64.8 | 8 / 35 | 3325 |
| 2 | 4 | 60.5 | 71.4 | 10 / 35 | 3055 |
| 3 | 3 | 60.4 | 70.5 | 9 / 35 | 3336 |
| 4 | 4 | 58.7 | 64.8 | 9 / 35 | 3287 |
| 5 | 2 | 63.1 | 76.8 | 13 / 35 | 3246 |
| 6 | 3 | 61.2 | 74.9 | 9 / 35 | 2952 |
| 7 | 3 | 61.6 | 75.2 | 9 / 35 | 3108 |
| 8 | 2 | 60.5 | 69.8 | 12 / 35 | 3298 |
| 9 | 3 | 60.6 | 70.8 | 12 / 35 | 2984 |
| 10 | 2 | 61.9 | 73.7 | 11 / 35 | 3529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 55 | 55% |
| jekl.StoneGhost 0.7 | 49 | 76% |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 56% |
| gg.Wolverine 2.0 | 10 | 50% |
| DBall.NUKE 0.1 | 8 | 88% |
| mld.Wisdom 1.0 | 5 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 249 of 350 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 69 | 28% | 102 |
| jekl.StoneGhost 0.7 | 65 | 26% | 95 |
| pe.minimelee.SandboxMiniMelee 1.1 | 46 | 18% | 62 |
| spinnercat.Omen 1.0 | 22 | 9% | 24 |
| mld.Wisdom 1.0 | 19 | 8% | 27 |
| gg.Wolverine 2.0 | 14 | 6% | 17 |
| DBall.NUKE 0.1 | 11 | 4% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 1% | 8 |

## Melee bench: F07

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.4 | 112 / 350 | 2.25 | 18.7% | 46311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.1 | 21.3% | 117 |
| hadur117.nano.SanaroS3 0.3 | 1.9 | 18.7% | 112 |
| franzor.Lizt 1.3.1 | 3.4 | 14.2% | 78 |
| oog.melee.CapuletDroid 1.1 | 3.6 | 13.7% | 41 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.4% | 1 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.6% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 8.5 | 3.1% | 1 |
| sample.Target 1.0 | 8.5 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 82.9 | 12 / 35 | 4437 |
| 2 | 2 | 67.9 | 83.6 | 13 / 35 | 4733 |
| 3 | 2 | 66.3 | 81.8 | 6 / 35 | 4574 |
| 4 | 2 | 67.3 | 84.6 | 9 / 35 | 4856 |
| 5 | 2 | 66.1 | 80.7 | 7 / 35 | 4440 |
| 6 | 2 | 66.7 | 81.4 | 8 / 35 | 4729 |
| 7 | 2 | 67.6 | 87.5 | 13 / 35 | 4292 |
| 8 | 2 | 67.6 | 82.5 | 12 / 35 | 4743 |
| 9 | 1 | 70.2 | 92.5 | 19 / 35 | 4954 |
| 10 | 2 | 67.8 | 86.1 | 13 / 35 | 4553 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 117 | 55% |
| oog.melee.CapuletDroid 1.1 | 57 | 54% |
| franzor.Lizt 1.3.1 | 45 | 31% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 0% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 0% |

Hadur died in 238 of 350 rounds, at a mean tick of 1592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 144 | 61% | 245 |
| oog.melee.CapuletDroid 1.1 | 46 | 19% | 81 |
| franzor.Lizt 1.3.1 | 39 | 16% | 4 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 6 |
| skm.PateranBotlock2 1.0 | 3 | 1% | 5 |
| exauge.GateKeeper 1.1.121g | 2 | 1% | 6 |
| drd.Dreadknoght 0.9 | 1 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 78.3 | 126 / 350 | 2.73 | 16.7% | 32351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.5 | 16.7% | 126 |
| shrub.Vapour v159 | 1.9 | 16.2% | 87 |
| tm.Yuugao 1.0 | 2.6 | 15.5% | 88 |
| jwst.DAD.DarkAndDarker 1.1 | 4.7 | 10.4% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 10.4% | 18 |
| m3thos.Eva00 1.1 | 5.7 | 9.7% | 9 |
| SHAM.WOW 1.4 | 7.7 | 7.3% | 1 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 7.0% | 4 |
| zyx.nano.BacillusComma 1.0 | 8.3 | 6.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 82.5 | 14 / 35 | 3303 |
| 2 | 1 | 64.1 | 82.9 | 15 / 35 | 3231 |
| 3 | 2 | 61.6 | 73.6 | 12 / 35 | 3255 |
| 4 | 1 | 61.1 | 72.1 | 14 / 35 | 3115 |
| 5 | 1 | 65.1 | 86.8 | 16 / 35 | 3444 |
| 6 | 1 | 62.9 | 78.9 | 15 / 35 | 3334 |
| 7 | 3 | 61.1 | 74.3 | 9 / 35 | 3179 |
| 8 | 1 | 63.1 | 81.4 | 13 / 35 | 3076 |
| 9 | 2 | 62.0 | 77.5 | 10 / 35 | 3183 |
| 10 | 2 | 60.6 | 73.2 | 8 / 35 | 3231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 83 | 49% |
| shrub.Vapour v159 | 66 | 42% |
| jwst.DAD.DarkAndDarker 1.1 | 31 | 94% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 63% |
| m3thos.Eva00 1.1 | 13 | 69% |
| SHAM.WOW 1.4 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 225 of 350 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 82 | 36% | 111 |
| tm.Yuugao 1.0 | 69 | 31% | 113 |
| jwst.DAD.DarkAndDarker 1.1 | 23 | 10% | 50 |
| com.spp.robocode.MostlyHarmless 010 | 21 | 9% | 32 |
| m3thos.Eva00 1.1 | 15 | 7% | 22 |
| zyx.nano.BacillusComma 1.0 | 10 | 4% | 14 |
| SHAM.WOW 1.4 | 3 | 1% | 6 |
| qualidafial.MajorDick 1.0.1 | 2 | 1% | 2 |

## Melee bench: F09

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 64.0 | 46 / 350 | 4.24 | 12.2% | 27680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.2% | 189 |
| kc.micro.Figment 1.0 | 2.0 | 14.5% | 58 |
| hadur117.nano.SanaroS3 0.3 | 3.1 | 12.2% | 46 |
| yagami.Tidus 0.11 | 4.0 | 11.4% | 7 |
| pedersen.Grishnakh 1.0 | 5.2 | 10.6% | 26 |
| mc2.enemy.Original 0.9 | 5.8 | 9.5% | 17 |
| dft.Calliope 5.6 | 6.9 | 7.9% | 6 |
| step.nanoPri 1.0 | 8.5 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.5% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 62.2 | 4 / 35 | 2974 |
| 2 | 3 | 57.8 | 62.9 | 3 / 35 | 2728 |
| 3 | 3 | 57.6 | 64.1 | 6 / 35 | 2753 |
| 4 | 4 | 55.5 | 57.8 | 6 / 35 | 2834 |
| 5 | 3 | 57.6 | 67.6 | 3 / 35 | 2391 |
| 6 | 3 | 58.9 | 68.3 | 5 / 35 | 2820 |
| 7 | 3 | 57.9 | 66.0 | 3 / 35 | 2756 |
| 8 | 3 | 57.9 | 66.3 | 5 / 35 | 2800 |
| 9 | 3 | 57.0 | 63.8 | 6 / 35 | 2618 |
| 10 | 3 | 57.1 | 61.0 | 5 / 35 | 3006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 70 | 23% |
| kc.micro.Figment 1.0 | 24 | 46% |
| mc2.enemy.Original 0.9 | 13 | 69% |
| yagami.Tidus 0.11 | 7 | 100% |
| pedersen.Grishnakh 1.0 | 5 | 60% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 304 of 350 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 105 | 35% | 122 |
| kc.micro.Figment 1.0 | 59 | 19% | 72 |
| yagami.Tidus 0.11 | 52 | 17% | 58 |
| mc2.enemy.Original 0.9 | 25 | 8% | 33 |
| pedersen.Grishnakh 1.0 | 24 | 8% | 25 |
| dft.Calliope 5.6 | 12 | 4% | 13 |
| robar.nano.Assertive_Melee 0.2 | 11 | 4% | 11 |
| step.nanoPri 1.0 | 8 | 3% | 8 |
| rdm.Dueler 0.4x | 8 | 3% | 8 |

## Melee bench: F10

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 83.1 | 133 / 350 | 2.52 | 16.0% | 39256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.5 | 16.0% | 133 |
| DTF.Kludgy 1.2b | 1.6 | 15.5% | 94 |
| ne.Chimera 1.2 | 3.3 | 13.5% | 36 |
| ejb.Polaris 1.0.1 | 3.6 | 12.9% | 39 |
| vStar.RAFzilla 2.15 | 5.4 | 10.4% | 15 |
| tvv.micro.Antares 1.1.1 | 5.6 | 10.1% | 25 |
| sam.Samspin 1.0 | 7.6 | 6.2% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.1 | 5.9% | 1 |
| kurios.DOSexe .9b | 8.5 | 5.2% | 2 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 82.9 | 15 / 35 | 3441 |
| 2 | 1 | 64.0 | 81.6 | 15 / 35 | 3978 |
| 3 | 1 | 65.8 | 82.5 | 16 / 35 | 4437 |
| 4 | 2 | 63.5 | 80.6 | 8 / 35 | 3775 |
| 5 | 2 | 63.6 | 80.0 | 14 / 35 | 3675 |
| 6 | 1 | 65.8 | 86.3 | 17 / 35 | 3877 |
| 7 | 2 | 64.4 | 81.9 | 12 / 35 | 3888 |
| 8 | 1 | 66.0 | 87.0 | 17 / 35 | 4217 |
| 9 | 2 | 63.9 | 83.2 | 7 / 35 | 3823 |
| 10 | 1 | 65.5 | 85.4 | 12 / 35 | 4145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 81 | 44% |
| ejb.Polaris 1.0.1 | 61 | 84% |
| ne.Chimera 1.2 | 27 | 48% |
| tvv.micro.Antares 1.1.1 | 25 | 40% |
| vStar.RAFzilla 2.15 | 21 | 76% |
| kurios.DOSexe .9b | 5 | 80% |
| donjezza.Muncho 1.0 | 5 | 40% |
| sam.Samspin 1.0 | 2 | 50% |

Hadur died in 217 of 350 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 89 | 41% | 123 |
| ne.Chimera 1.2 | 52 | 24% | 68 |
| tvv.micro.Antares 1.1.1 | 23 | 11% | 29 |
| ejb.Polaris 1.0.1 | 17 | 8% | 68 |
| vStar.RAFzilla 2.15 | 16 | 7% | 31 |
| sam.Samspin 1.0 | 9 | 4% | 11 |
| kurios.DOSexe .9b | 5 | 2% | 10 |
| donjezza.Muncho 1.0 | 3 | 1% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 1% | 4 |

## Melee bench: F11

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 71.7 | 80 / 350 | 3.55 | 13.7% | 30940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.5% | 149 |
| hadur117.nano.SanaroS3 0.3 | 2.2 | 13.7% | 80 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 39 |
| djc.DynaBot 0.1.1 | 4.1 | 10.7% | 21 |
| rdt199.Warlord 0.73 | 5.5 | 9.5% | 18 |
| br2.MobyDickBot 1.6 | 5.9 | 9.1% | 20 |
| uji.YellohFellah 1.0 | 6.6 | 8.6% | 22 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.8% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 73.7 | 10 / 35 | 2834 |
| 2 | 2 | 59.7 | 69.5 | 8 / 35 | 3233 |
| 3 | 2 | 62.5 | 78.4 | 6 / 35 | 3450 |
| 4 | 2 | 61.6 | 73.0 | 10 / 35 | 3314 |
| 5 | 3 | 58.1 | 65.4 | 7 / 35 | 3050 |
| 6 | 2 | 57.9 | 67.3 | 5 / 35 | 2861 |
| 7 | 2 | 62.5 | 76.2 | 13 / 35 | 3224 |
| 8 | 3 | 59.5 | 69.5 | 7 / 35 | 3096 |
| 9 | 2 | 59.0 | 68.9 | 7 / 35 | 3059 |
| 10 | 2 | 60.3 | 74.6 | 7 / 35 | 2819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 76 | 41% |
| cx.mini.Nimrod 0.55 | 22 | 73% |
| uji.YellohFellah 1.0 | 15 | 47% |
| djc.DynaBot 0.1.1 | 15 | 73% |
| rdt199.Warlord 0.73 | 13 | 92% |
| br2.MobyDickBot 1.6 | 10 | 30% |

Hadur died in 270 of 350 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 106 | 39% | 132 |
| cx.mini.Nimrod 0.55 | 45 | 17% | 61 |
| rdt199.Warlord 0.73 | 30 | 11% | 41 |
| djc.DynaBot 0.1.1 | 23 | 9% | 35 |
| uji.YellohFellah 1.0 | 21 | 8% | 33 |
| KiraNL.Chupacabra 0.4 | 18 | 7% | 18 |
| br2.MobyDickBot 1.6 | 17 | 6% | 20 |
| stelo.MirrorNano 1.3 | 6 | 2% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 1% | 4 |

## Melee bench: F12

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 73.4 | 89 / 350 | 3.40 | 13.9% | 27673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 2.1 | 14.3% | 71 |
| nat.PallasHawk 1.0 | 2.2 | 14.0% | 88 |
| hadur117.nano.SanaroS3 0.3 | 2.7 | 13.9% | 89 |
| darkcanuck.Leon 1.01 | 3.0 | 13.6% | 73 |
| brainfade.melee.Genghis 0.36 | 5.1 | 10.8% | 20 |
| jrm.Test0 1.0 | 6.5 | 8.0% | 3 |
| cs.sheldor.Talon 1.1 | 6.9 | 7.3% | 2 |
| jp.Perpy 16.0 | 7.6 | 7.2% | 3 |
| stuff.Vlad 0.1 | 9.4 | 5.6% | 1 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.3 | 71.4 | 10 / 35 | 2752 |
| 2 | 3 | 62.1 | 74.6 | 14 / 35 | 2885 |
| 3 | 1 | 62.5 | 78.1 | 9 / 35 | 3084 |
| 4 | 3 | 59.5 | 70.8 | 7 / 35 | 2907 |
| 5 | 3 | 59.8 | 73.3 | 6 / 35 | 2577 |
| 6 | 4 | 57.5 | 65.1 | 9 / 35 | 2573 |
| 7 | 1 | 62.3 | 78.1 | 9 / 35 | 2982 |
| 8 | 1 | 62.0 | 77.1 | 12 / 35 | 2894 |
| 9 | 3 | 59.3 | 72.7 | 7 / 35 | 2381 |
| 10 | 4 | 59.8 | 72.4 | 6 / 35 | 2638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 62 | 24% |
| bts.wiki.RipCurl 0.9b | 57 | 60% |
| darkcanuck.Leon 1.01 | 50 | 44% |
| brainfade.melee.Genghis 0.36 | 14 | 86% |
| jrm.Test0 1.0 | 3 | 100% |
| jp.Perpy 16.0 | 2 | 50% |
| jaybot.bots.Oddball 4.0 | 2 | 0% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 262 of 350 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 78 | 30% | 91 |
| darkcanuck.Leon 1.01 | 57 | 22% | 87 |
| bts.wiki.RipCurl 0.9b | 57 | 22% | 85 |
| brainfade.melee.Genghis 0.36 | 25 | 10% | 34 |
| jrm.Test0 1.0 | 14 | 5% | 17 |
| jp.Perpy 16.0 | 10 | 4% | 11 |
| cs.sheldor.Talon 1.1 | 9 | 3% | 11 |
| jaybot.bots.Oddball 4.0 | 6 | 2% | 8 |
| stuff.Vlad 0.1 | 5 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 75.8 | 58 / 350 | 3.18 | 13.5% | 29122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.7% | 165 |
| ags.Glacier 0.2.11 | 1.5 | 17.0% | 86 |
| hadur117.nano.SanaroS3 0.3 | 3.1 | 13.5% | 58 |
| shinh.Entangled 0.3 | 4.3 | 12.0% | 24 |
| gh.micro.Gruweltje 0.7 | 4.6 | 11.7% | 16 |
| apc.Colossus2 0.17 | 6.0 | 8.4% | 0 |
| stelo.Wang 1.0 | 7.1 | 6.4% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.9 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 80.6 | 2 / 35 | 2604 |
| 2 | 3 | 58.6 | 68.9 | 5 / 35 | 2718 |
| 3 | 3 | 59.9 | 73.7 | 4 / 35 | 2852 |
| 4 | 3 | 60.5 | 74.0 | 5 / 35 | 2821 |
| 5 | 3 | 61.8 | 78.1 | 6 / 35 | 2801 |
| 6 | 3 | 62.5 | 76.2 | 10 / 35 | 3294 |
| 7 | 3 | 62.8 | 80.6 | 10 / 35 | 2925 |
| 8 | 4 | 58.5 | 69.5 | 4 / 35 | 2757 |
| 9 | 3 | 62.8 | 77.8 | 6 / 35 | 3535 |
| 10 | 3 | 62.2 | 78.7 | 6 / 35 | 2815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 91 | 42% |
| ags.Glacier 0.2.11 | 61 | 15% |
| shinh.Entangled 0.3 | 18 | 39% |
| gh.micro.Gruweltje 0.7 | 6 | 50% |

Hadur died in 293 of 350 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 100 | 34% | 110 |
| mn.Combat 3.25.0 | 94 | 32% | 131 |
| shinh.Entangled 0.3 | 40 | 14% | 47 |
| gh.micro.Gruweltje 0.7 | 35 | 12% | 38 |
| stelo.Wang 1.0 | 10 | 3% | 10 |
| apc.Colossus2 0.17 | 7 | 2% | 7 |
| maribo.FollowFire 1 | 6 | 2% | 6 |
| ayk.WallHugger 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 81.7 | 129 / 350 | 2.46 | 16.8% | 32330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.1 | 19.2% | 135 |
| hadur117.nano.SanaroS3 0.3 | 1.9 | 16.8% | 129 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.2 | 12.0% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 4.2 | 11.9% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 11.3% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 5.1 | 11.0% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 9.8% | 21 |
| pa.Improved 1.0 | 8.0 | 6.1% | 3 |
| sample.TrackFire 1.0 | 9.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 81.4 | 12 / 35 | 3126 |
| 2 | 2 | 65.2 | 86.4 | 14 / 35 | 3317 |
| 3 | 1 | 65.6 | 87.5 | 18 / 35 | 3240 |
| 4 | 2 | 62.0 | 77.1 | 12 / 35 | 3099 |
| 5 | 2 | 63.9 | 82.1 | 11 / 35 | 3468 |
| 6 | 2 | 63.8 | 80.0 | 13 / 35 | 3151 |
| 7 | 2 | 64.2 | 85.0 | 11 / 35 | 3380 |
| 8 | 2 | 64.2 | 81.8 | 17 / 35 | 3200 |
| 9 | 2 | 62.9 | 78.6 | 11 / 35 | 3338 |
| 10 | 2 | 61.5 | 77.1 | 10 / 35 | 3011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 138 | 57% |
| sheldor.micro.PointInLineRRAL 1.0 | 23 | 57% |
| sanyi.mikrobi.Roberto 1.0 | 22 | 45% |
| Lo_Ian.Gandalf_V4 4.0 | 17 | 65% |
| dmh.robocode.robot.RedDwarf 0.4 | 14 | 64% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 43% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 221 of 350 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 104 | 47% | 181 |
| sheldor.micro.PointInLineRRAL 1.0 | 25 | 11% | 44 |
| sanyi.mikrobi.Roberto 1.0 | 25 | 11% | 39 |
| dmh.robocode.robot.RedDwarf 0.4 | 22 | 10% | 31 |
| Lo_Ian.Gandalf_V4 4.0 | 22 | 10% | 30 |
| co.edu.usb.rc.LidisTron 1.0 | 21 | 10% | 18 |
| pa.Improved 1.0 | 2 | 1% | 6 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 65.3 | 54 / 350 | 4.13 | 12.9% | 34982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 14.9% | 72 |
| emp.Yngwie 1.11 | 2.2 | 14.2% | 113 |
| mld.DustBunny 3.8 | 3.3 | 13.1% | 34 |
| hadur117.nano.SanaroS3 0.3 | 3.5 | 12.9% | 54 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.4% | 26 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.6% | 48 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.8% | 1 |
| lambdaxy.TBot 0.1 | 7.8 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.2% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 64.8 | 6 / 35 | 3272 |
| 2 | 2 | 61.0 | 70.8 | 7 / 35 | 3735 |
| 3 | 3 | 59.3 | 66.3 | 3 / 35 | 3677 |
| 4 | 4 | 58.2 | 64.4 | 7 / 35 | 3208 |
| 5 | 3 | 58.1 | 60.6 | 4 / 35 | 3878 |
| 6 | 5 | 55.6 | 57.5 | 3 / 35 | 3395 |
| 7 | 4 | 59.2 | 64.1 | 7 / 35 | 3431 |
| 8 | 2 | 61.4 | 72.7 | 7 / 35 | 3680 |
| 9 | 4 | 58.2 | 64.8 | 4 / 35 | 3320 |
| 10 | 4 | 59.3 | 66.7 | 6 / 35 | 3386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 35 | 57% |
| kawigi.micro.Shiz 1.1 | 26 | 27% |
| cb.nano.Insomnia 1.0 | 22 | 55% |
| kawigi.robot.Girl 1.2 | 21 | 67% |
| mld.DustBunny 3.8 | 12 | 0% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 296 of 350 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 70 | 24% | 96 |
| kawigi.micro.Shiz 1.1 | 61 | 21% | 69 |
| mld.DustBunny 3.8 | 58 | 20% | 70 |
| cb.nano.Insomnia 1.0 | 42 | 14% | 33 |
| kawigi.robot.Girl 1.2 | 37 | 13% | 49 |
| Grystrion.TrackerWO 1.0 | 13 | 4% | 14 |
| divineomega.TrialBot 0.003 | 8 | 3% | 11 |
| lambdaxy.TBot 0.1 | 5 | 2% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 1% | 2 |

## Melee bench: F16

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 69.7 | 56 / 350 | 3.73 | 13.7% | 36981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.1 | 17.6% | 150 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 15.0% | 25 |
| hadur117.nano.SanaroS3 0.3 | 2.9 | 13.7% | 56 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 11.3% | 78 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.7% | 11 |
| tvv.nano.Polaris 1.2 | 5.6 | 9.6% | 24 |
| stelo.IntrinsicVolatility 1.4 | 7.1 | 7.3% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 5.3% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.3% | 4 |
| asd.Cthulhu 1.3 | 9.2 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 66.3 | 1 / 35 | 3565 |
| 2 | 3 | 60.2 | 65.1 | 7 / 35 | 3949 |
| 3 | 3 | 62.3 | 74.6 | 9 / 35 | 3549 |
| 4 | 3 | 59.1 | 65.4 | 3 / 35 | 3732 |
| 5 | 3 | 62.4 | 74.6 | 5 / 35 | 3876 |
| 6 | 2 | 61.7 | 72.1 | 7 / 35 | 3816 |
| 7 | 3 | 61.9 | 72.7 | 8 / 35 | 3803 |
| 8 | 3 | 59.6 | 66.3 | 7 / 35 | 3320 |
| 9 | 3 | 58.8 | 64.4 | 3 / 35 | 3554 |
| 10 | 3 | 62.2 | 74.9 | 6 / 35 | 3817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 82 | 27% |
| techdude.forest.FlamingForest 1.1 | 21 | 29% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 88% |
| tvv.nano.Polaris 1.2 | 12 | 17% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |

Hadur died in 296 of 350 rounds, at a mean tick of 1267. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 128 | 43% | 154 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 49 | 17% | 59 |
| bvh.fnr.Fenrir 0.36l | 40 | 14% | 43 |
| techdude.forest.FlamingForest 1.1 | 31 | 10% | 36 |
| tvv.nano.Polaris 1.2 | 21 | 7% | 22 |
| stelo.IntrinsicVolatility 1.4 | 12 | 4% | 18 |
| asd.Cthulhu 1.3 | 7 | 2% | 7 |
| divineomega.DivineBot 1.9.4.5 | 5 | 2% | 7 |
| repositorio.NanoStep 1.0 | 1 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F17

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 69.3 | 73 / 350 | 3.77 | 13.5% | 33957 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.9 | 13.9% | 69 |
| hadur117.nano.SanaroS3 0.3 | 2.9 | 13.5% | 73 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.3% | 65 |
| cx.BlestPain 1.41 | 3.2 | 13.0% | 69 |
| ahf.NanoAndrew .4 | 4.9 | 11.5% | 36 |
| nic.Nicator 2.4 | 5.2 | 11.8% | 33 |
| maribo.melee.BMV 0.1 | 6.9 | 9.0% | 5 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 73.3 | 10 / 35 | 3592 |
| 2 | 4 | 59.6 | 69.8 | 5 / 35 | 3208 |
| 3 | 2 | 60.1 | 68.3 | 9 / 35 | 3293 |
| 4 | 4 | 59.6 | 70.5 | 6 / 35 | 2885 |
| 5 | 5 | 58.2 | 65.1 | 4 / 35 | 3341 |
| 6 | 1 | 61.9 | 72.1 | 10 / 35 | 3439 |
| 7 | 1 | 61.0 | 68.9 | 10 / 35 | 3917 |
| 8 | 2 | 61.5 | 74.0 | 6 / 35 | 3587 |
| 9 | 2 | 61.4 | 70.2 | 8 / 35 | 3805 |
| 10 | 6 | 56.9 | 60.6 | 5 / 35 | 2890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 44 | 36% |
| oog.melee.Mercutio 1.0 | 33 | 55% |
| cx.BlestPain 1.41 | 30 | 67% |
| nic.Nicator 2.4 | 21 | 52% |
| ahf.NanoAndrew .4 | 15 | 33% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |

Hadur died in 277 of 350 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 56 | 20% | 71 |
| ahf.NanoAndrew .4 | 52 | 19% | 56 |
| nic.Nicator 2.4 | 46 | 17% | 54 |
| oog.melee.Mercutio 1.0 | 45 | 16% | 67 |
| cx.BlestPain 1.41 | 43 | 16% | 62 |
| maribo.melee.BMV 0.1 | 23 | 8% | 25 |
| tex.Longbot 0.4 | 6 | 2% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 1% | 6 |
| goblin.Bender 2.4 | 2 | 1% | 2 |

## Melee bench: F18

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 72.9 | 127 / 350 | 3.17 | 15.8% | 30271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.3 | 15.8% | 127 |
| agd.Mooserwirt2 2.7 | 2.0 | 14.8% | 85 |
| uji.DBH 1.1 | 3.2 | 13.4% | 43 |
| ratosh.Nobo 0.21 | 4.1 | 12.4% | 13 |
| spinnercat.Robovirus 2.718 | 4.5 | 11.9% | 16 |
| sigterm.Sigterm 1.0 | 5.9 | 10.3% | 35 |
| kawigi.mini.Fhqwhgads 1.1 | 7.1 | 8.4% | 11 |
| stelo.WangRobot 1.0 | 8.3 | 6.8% | 19 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.6 | 6.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 85.7 | 21 / 35 | 3035 |
| 2 | 2 | 59.6 | 70.0 | 9 / 35 | 3215 |
| 3 | 2 | 60.7 | 72.1 | 13 / 35 | 2947 |
| 4 | 1 | 62.6 | 76.8 | 15 / 35 | 3253 |
| 5 | 1 | 60.1 | 70.4 | 10 / 35 | 3096 |
| 6 | 1 | 59.4 | 70.7 | 13 / 35 | 2739 |
| 7 | 2 | 57.8 | 65.7 | 10 / 35 | 2904 |
| 8 | 1 | 61.7 | 75.4 | 13 / 35 | 3006 |
| 9 | 1 | 60.5 | 71.4 | 13 / 35 | 3062 |
| 10 | 1 | 60.2 | 71.1 | 10 / 35 | 3014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 51 | 76% |
| spinnercat.Robovirus 2.718 | 37 | 95% |
| uji.DBH 1.1 | 33 | 55% |
| sigterm.Sigterm 1.0 | 29 | 66% |
| stelo.WangRobot 1.0 | 13 | 46% |
| ratosh.Nobo 0.21 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 33% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 50% |

Hadur died in 224 of 350 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 52 | 23% | 95 |
| uji.DBH 1.1 | 48 | 21% | 54 |
| ratosh.Nobo 0.21 | 32 | 14% | 46 |
| spinnercat.Robovirus 2.718 | 28 | 13% | 51 |
| sigterm.Sigterm 1.0 | 21 | 9% | 44 |
| stelo.WangRobot 1.0 | 21 | 9% | 29 |
| kawigi.mini.Fhqwhgads 1.1 | 15 | 7% | 19 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7 | 3% | 11 |

## Melee bench: F19

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.3 | 136 / 350 | 2.41 | 16.6% | 39039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.6 | 16.6% | 136 |
| davidalves.net.DuelistMiniMelee 1.2 | 1.9 | 16.1% | 79 |
| mld.Infinity 2.2 | 2.5 | 15.7% | 109 |
| krillr.mini.JointStrike 2.0.0 | 4.4 | 10.8% | 9 |
| erdnis.Rover 0.3 | 4.6 | 10.6% | 7 |
| patson.PatsonTestBot 1.0 | 6.5 | 8.5% | 2 |
| mbh.Mbh 0.1 | 7.1 | 7.5% | 1 |
| pac.ABC 2.1 | 7.5 | 7.3% | 8 |
| pbg.R2D2 1.0 | 8.9 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.0 | 79.7 | 8 / 35 | 4150 |
| 2 | 1 | 67.5 | 87.0 | 15 / 35 | 4121 |
| 3 | 1 | 66.5 | 85.4 | 13 / 35 | 3904 |
| 4 | 1 | 67.4 | 91.4 | 16 / 35 | 3417 |
| 5 | 2 | 66.5 | 83.8 | 13 / 35 | 4157 |
| 6 | 2 | 64.8 | 80.6 | 12 / 35 | 3566 |
| 7 | 3 | 65.0 | 81.0 | 14 / 35 | 3532 |
| 8 | 1 | 66.7 | 85.4 | 13 / 35 | 4044 |
| 9 | 1 | 65.9 | 81.9 | 15 / 35 | 4119 |
| 10 | 1 | 67.5 | 87.3 | 17 / 35 | 4029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 100 | 52% |
| davidalves.net.DuelistMiniMelee 1.2 | 84 | 50% |
| krillr.mini.JointStrike 2.0.0 | 17 | 76% |
| erdnis.Rover 0.3 | 16 | 88% |
| pac.ABC 2.1 | 7 | 86% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 215 of 350 rounds, at a mean tick of 1113. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 93 | 43% | 186 |
| mld.Infinity 2.2 | 70 | 33% | 39 |
| patson.PatsonTestBot 1.0 | 16 | 7% | 33 |
| krillr.mini.JointStrike 2.0.0 | 13 | 6% | 24 |
| erdnis.Rover 0.3 | 12 | 6% | 25 |
| mbh.Mbh 0.1 | 5 | 2% | 17 |
| pac.ABC 2.1 | 4 | 2% | 12 |
| pbg.R2D2 1.0 | 2 | 1% | 12 |

## Melee bench: F20

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 71.5 | 85 / 350 | 3.56 | 13.8% | 33148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 18.0% | 150 |
| hadur117.nano.SanaroS3 0.3 | 2.0 | 13.8% | 85 |
| nz.jdc.nano.GridFu 1.0 | 3.6 | 11.7% | 24 |
| fwb.Nine 1.0.1 | 3.8 | 11.7% | 38 |
| catcat20.Rabbit 0.001 | 5.0 | 10.1% | 29 |
| m3thos.mini.Eva01 0.5.5 | 6.4 | 8.5% | 6 |
| djdjdj.NanoSkunk10 1.0 | 7.1 | 8.3% | 5 |
| bayen.nut.Squirrel 1.615 | 7.1 | 8.0% | 11 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 70.2 | 7 / 35 | 3468 |
| 2 | 2 | 58.1 | 65.7 | 8 / 35 | 3022 |
| 3 | 2 | 62.1 | 74.3 | 11 / 35 | 3561 |
| 4 | 2 | 60.0 | 70.5 | 9 / 35 | 3099 |
| 5 | 2 | 60.7 | 71.1 | 8 / 35 | 3307 |
| 6 | 2 | 58.1 | 65.1 | 5 / 35 | 3255 |
| 7 | 2 | 62.4 | 75.6 | 9 / 35 | 3661 |
| 8 | 2 | 60.6 | 71.1 | 7 / 35 | 3330 |
| 9 | 2 | 62.7 | 78.4 | 11 / 35 | 3237 |
| 10 | 2 | 60.9 | 73.3 | 10 / 35 | 3208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 76 | 46% |
| fwb.Nine 1.0.1 | 19 | 74% |
| catcat20.Rabbit 0.001 | 17 | 76% |
| djdjdj.NanoSkunk10 1.0 | 9 | 78% |
| m3thos.mini.Eva01 0.5.5 | 8 | 75% |
| bayen.nut.Squirrel 1.615 | 8 | 88% |
| nz.jdc.nano.GridFu 1.0 | 8 | 25% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 265 of 350 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 115 | 43% | 140 |
| fwb.Nine 1.0.1 | 46 | 17% | 58 |
| nz.jdc.nano.GridFu 1.0 | 38 | 14% | 45 |
| catcat20.Rabbit 0.001 | 24 | 9% | 41 |
| bayen.nut.Squirrel 1.615 | 16 | 6% | 21 |
| m3thos.mini.Eva01 0.5.5 | 9 | 3% | 17 |
| djdjdj.NanoSkunk10 1.0 | 9 | 3% | 15 |
| ntc.ControlledChaos 1.1.4 | 6 | 2% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 5 |

## Melee bench: F21

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.7 | 139 / 350 | 2.46 | 17.0% | 43479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.2 | 17.6% | 153 |
| hadur117.nano.SanaroS3 0.3 | 1.8 | 17.0% | 139 |
| dummy.mini.Scimitar 1.01 | 3.1 | 14.2% | 20 |
| cf.RiO.RiOx 4.2.1 | 3.9 | 12.5% | 24 |
| oa.weak.BotherBot 0.1 | 5.4 | 8.3% | 0 |
| eld.Hmm 1.0 | 5.6 | 8.4% | 15 |
| el.JumpShoot 0.2 | 7.7 | 6.0% | 0 |
| fire219.CatBot 1.0 | 7.9 | 6.3% | 0 |
| PSW.Relentless 0.1 | 8.6 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 82.5 | 11 / 35 | 4343 |
| 2 | 2 | 64.0 | 78.7 | 11 / 35 | 3910 |
| 3 | 2 | 66.8 | 85.1 | 14 / 35 | 4516 |
| 4 | 2 | 64.6 | 79.0 | 11 / 35 | 4150 |
| 5 | 1 | 66.7 | 85.4 | 15 / 35 | 4346 |
| 6 | 1 | 67.6 | 87.3 | 16 / 35 | 4413 |
| 7 | 2 | 67.2 | 86.0 | 15 / 35 | 4615 |
| 8 | 2 | 68.1 | 85.7 | 16 / 35 | 4809 |
| 9 | 2 | 67.2 | 85.4 | 14 / 35 | 4374 |
| 10 | 2 | 66.0 | 82.2 | 16 / 35 | 4003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 156 | 53% |
| dummy.mini.Scimitar 1.01 | 38 | 82% |
| cf.RiO.RiOx 4.2.1 | 28 | 54% |
| eld.Hmm 1.0 | 14 | 64% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 211 of 350 rounds, at a mean tick of 1341. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 92 | 44% | 151 |
| cf.RiO.RiOx 4.2.1 | 55 | 26% | 65 |
| dummy.mini.Scimitar 1.01 | 38 | 18% | 85 |
| eld.Hmm 1.0 | 8 | 4% | 24 |
| arthord.MannyPacquiao Beta | 5 | 2% | 5 |
| fire219.CatBot 1.0 | 4 | 2% | 4 |
| PSW.Relentless 0.1 | 4 | 2% | 4 |
| el.JumpShoot 0.2 | 3 | 1% | 4 |
| oa.weak.BotherBot 0.1 | 2 | 1% | 8 |

## Melee bench: F23

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.6 | 129 / 350 | 2.48 | 16.6% | 40304 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.4% | 139 |
| hadur117.nano.SanaroS3 0.3 | 2.0 | 16.6% | 129 |
| cre.Karolos 0.32 | 3.1 | 13.8% | 45 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 11.7% | 27 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.1% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.8% | 4 |
| cw.megas.Blade 0.8 | 6.7 | 8.4% | 0 |
| sample.Walls 1.0 | 7.1 | 8.5% | 2 |
| cli.WasteOfAmmo 1.0 | 9.1 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 88.9 | 15 / 35 | 4447 |
| 2 | 2 | 65.6 | 80.0 | 11 / 35 | 3933 |
| 3 | 2 | 67.3 | 86.0 | 15 / 35 | 4088 |
| 4 | 2 | 66.3 | 84.4 | 11 / 35 | 3817 |
| 5 | 2 | 66.1 | 84.4 | 9 / 35 | 3914 |
| 6 | 2 | 67.0 | 84.8 | 15 / 35 | 4233 |
| 7 | 2 | 66.4 | 80.6 | 14 / 35 | 4058 |
| 8 | 2 | 67.1 | 84.8 | 15 / 35 | 4083 |
| 9 | 2 | 64.3 | 79.4 | 13 / 35 | 3587 |
| 10 | 2 | 66.2 | 82.2 | 11 / 35 | 4144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 119 | 50% |
| cre.Karolos 0.32 | 53 | 62% |
| stelo.AreaTargetingBot 1.1 | 25 | 52% |
| sample.Walls 1.0 | 15 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 67% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 222 of 350 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 109 | 49% | 175 |
| cre.Karolos 0.32 | 45 | 20% | 75 |
| stelo.AreaTargetingBot 1.1 | 43 | 19% | 52 |
| stelo.RamTrackSurfer 1.2 | 10 | 5% | 22 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 3% | 11 |
| cw.megas.Blade 0.8 | 5 | 2% | 9 |
| sample.Walls 1.0 | 2 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F24

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 62.9 | 47 / 350 | 4.34 | 11.7% | 25156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.6 | 15.0% | 98 |
| florent.XSeries.X2 0.12 | 2.3 | 13.8% | 57 |
| davidalves.Phoenix 0.54 | 2.8 | 13.5% | 78 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.0% | 32 |
| hadur117.nano.SanaroS3 0.3 | 4.4 | 11.7% | 47 |
| oog.melee.Corsair 1.0 | 6.1 | 9.6% | 14 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.3% | 21 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.6% | 3 |
| evd.X1 0.01 | 9.4 | 4.9% | 1 |
| as.FrankTheTank 1.3 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 52.7 | 56.2 | 1 / 35 | 2335 |
| 2 | 5 | 53.5 | 56.8 | 5 / 35 | 2461 |
| 3 | 5 | 54.3 | 59.4 | 4 / 35 | 2408 |
| 4 | 3 | 57.2 | 62.9 | 7 / 35 | 2701 |
| 5 | 3 | 56.8 | 66.0 | 2 / 35 | 2593 |
| 6 | 5 | 58.0 | 67.0 | 5 / 35 | 2535 |
| 7 | 4 | 57.4 | 65.4 | 6 / 35 | 2599 |
| 8 | 4 | 58.1 | 68.3 | 8 / 35 | 2472 |
| 9 | 4 | 57.7 | 66.7 | 4 / 35 | 2655 |
| 10 | 5 | 54.7 | 60.3 | 5 / 35 | 2397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 26 | 38% |
| davidalves.Phoenix 0.54 | 21 | 48% |
| florent.XSeries.X2 0.12 | 20 | 65% |
| pedersen.Ugluk 1.1.1 | 14 | 57% |
| stelo.SoJNanoMelee 1.1 | 9 | 33% |
| oog.melee.Corsair 1.0 | 5 | 60% |
| lunchie.Lunchbox 0.93 | 2 | 0% |

Hadur died in 304 of 350 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 68 | 22% | 81 |
| rz.GlowBlowMelee 1.4 | 62 | 20% | 76 |
| pedersen.Ugluk 1.1.1 | 57 | 19% | 60 |
| davidalves.Phoenix 0.54 | 50 | 16% | 58 |
| stelo.SoJNanoMelee 1.1 | 27 | 9% | 29 |
| oog.melee.Corsair 1.0 | 19 | 6% | 23 |
| lunchie.Lunchbox 0.93 | 9 | 3% | 9 |
| evd.X1 0.01 | 8 | 3% | 9 |
| as.FrankTheTank 1.3 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 74.1 | 98 / 350 | 3.07 | 15.6% | 26478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 1.8 | 15.9% | 78 |
| voidious.mini.BrokenSword 2.0.3 | 2.1 | 15.6% | 68 |
| hadur117.nano.SanaroS3 0.3 | 2.3 | 15.6% | 98 |
| jdw.Hurricane 1.4 | 3.9 | 13.1% | 51 |
| gjr.Cephalosporin 0.1 | 5.6 | 9.6% | 22 |
| ds.Oo 2.2 | 5.6 | 10.3% | 27 |
| awesomeness.Elite 1.0 | 7.3 | 7.7% | 6 |
| adt.Ar2 1.1 | 7.4 | 7.8% | 4 |
| amk.ChumbaMini 0.2 | 9.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 73.6 | 15 / 35 | 2723 |
| 2 | 4 | 57.1 | 65.7 | 5 / 35 | 2345 |
| 3 | 2 | 61.9 | 76.1 | 12 / 35 | 2455 |
| 4 | 1 | 63.3 | 78.9 | 13 / 35 | 2840 |
| 5 | 3 | 59.6 | 70.4 | 10 / 35 | 2556 |
| 6 | 2 | 60.4 | 72.1 | 7 / 35 | 2733 |
| 7 | 3 | 59.9 | 72.1 | 7 / 35 | 2776 |
| 8 | 1 | 62.8 | 78.9 | 13 / 35 | 2736 |
| 9 | 3 | 61.7 | 76.8 | 8 / 35 | 2688 |
| 10 | 2 | 61.4 | 76.1 | 8 / 35 | 2626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 66 | 35% |
| voidious.mini.BrokenSword 2.0.3 | 47 | 51% |
| jdw.Hurricane 1.4 | 33 | 70% |
| ds.Oo 2.2 | 19 | 47% |
| gjr.Cephalosporin 0.1 | 17 | 59% |
| adt.Ar2 1.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 2 | 50% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 253 of 350 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 85 | 34% | 113 |
| voidious.mini.BrokenSword 2.0.3 | 56 | 22% | 86 |
| jdw.Hurricane 1.4 | 40 | 16% | 56 |
| ds.Oo 2.2 | 29 | 11% | 37 |
| gjr.Cephalosporin 0.1 | 17 | 7% | 26 |
| awesomeness.Elite 1.0 | 13 | 5% | 13 |
| adt.Ar2 1.1 | 10 | 4% | 16 |
| amk.ChumbaMini 0.2 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 70.6 | 58 / 350 | 3.65 | 13.2% | 34201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.1 | 16.1% | 116 |
| shu.nitro.LENIN .T34 | 2.4 | 13.4% | 79 |
| hadur117.nano.SanaroS3 0.3 | 2.9 | 13.2% | 58 |
| lrem.Spectre 0.4.4 | 3.7 | 12.9% | 51 |
| gh.mini.GrubbmOne 1.0 | 5.5 | 10.9% | 22 |
| js.PinBall 1.6 | 5.6 | 10.6% | 13 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 8.9% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.1% | 4 |
| sample.SpinBot 1.0 | 8.9 | 5.4% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.7 | 65.7 | 5 / 35 | 3417 |
| 2 | 3 | 59.7 | 69.8 | 5 / 35 | 3277 |
| 3 | 3 | 60.0 | 69.2 | 6 / 35 | 3596 |
| 4 | 3 | 61.2 | 72.7 | 6 / 35 | 3662 |
| 5 | 2 | 61.8 | 72.1 | 8 / 35 | 3869 |
| 6 | 2 | 61.0 | 75.2 | 7 / 35 | 3234 |
| 7 | 3 | 60.9 | 73.7 | 4 / 35 | 3397 |
| 8 | 4 | 58.9 | 68.9 | 6 / 35 | 3210 |
| 9 | 2 | 60.3 | 70.8 | 5 / 35 | 3198 |
| 10 | 3 | 59.6 | 67.9 | 6 / 35 | 3341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 55 | 35% |
| shu.nitro.LENIN .T34 | 39 | 28% |
| lrem.Spectre 0.4.4 | 29 | 45% |
| js.PinBall 1.6 | 7 | 71% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 83% |
| gh.mini.GrubbmOne 1.0 | 5 | 20% |
| sample.SpinBot 1.0 | 2 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 2 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 89 | 30% | 107 |
| shu.nitro.LENIN .T34 | 61 | 21% | 75 |
| lrem.Spectre 0.4.4 | 46 | 16% | 53 |
| gh.mini.GrubbmOne 1.0 | 42 | 14% | 44 |
| js.PinBall 1.6 | 17 | 6% | 22 |
| jaybot.adv.bots.JayBot 2.0 | 16 | 5% | 19 |
| fullsail.LaxativeTeaTwo 1.0 | 15 | 5% | 23 |
| sample.SpinBot 1.0 | 6 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 72.7 | 109 / 350 | 3.46 | 13.8% | 28041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 2.0 | 14.9% | 100 |
| hadur117.nano.SanaroS3 0.3 | 2.0 | 13.8% | 109 |
| wee.Gem 1.8.4 | 3.6 | 11.8% | 61 |
| sheldor.melee.nano.TestMelee 0.1 | 3.6 | 11.7% | 44 |
| EH.Eagle 1.0.6 | 4.7 | 10.6% | 11 |
| joe.ADinosaur 1.0 | 6.3 | 9.0% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.8% | 9 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.9% | 5 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.9% | 5 |
| cs.Grudge 1.0 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 75.6 | 9 / 35 | 2797 |
| 2 | 1 | 61.5 | 77.5 | 14 / 35 | 2703 |
| 3 | 3 | 58.0 | 67.6 | 9 / 35 | 2551 |
| 4 | 1 | 62.7 | 80.0 | 15 / 35 | 2931 |
| 5 | 1 | 64.3 | 85.4 | 18 / 35 | 2740 |
| 6 | 2 | 60.1 | 74.0 | 8 / 35 | 2675 |
| 7 | 2 | 61.9 | 77.1 | 11 / 35 | 2795 |
| 8 | 1 | 61.0 | 79.7 | 11 / 35 | 2535 |
| 9 | 2 | 58.9 | 71.7 | 7 / 35 | 2654 |
| 10 | 5 | 50.9 | 38.4 | 7 / 35 | 3660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 76 | 66% |
| wee.Gem 1.8.4 | 41 | 56% |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 54% |
| EH.Eagle 1.0.6 | 11 | 91% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 67% |
| throxbot.ThroxBot 0.1 | 6 | 67% |
| caimano.Furia_Ceca 0.22 | 5 | 60% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 241 of 350 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 75 | 31% | 132 |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 19% | 57 |
| wee.Gem 1.8.4 | 33 | 14% | 56 |
| joe.ADinosaur 1.0 | 29 | 12% | 31 |
| EH.Eagle 1.0.6 | 17 | 7% | 22 |
| caimano.Furia_Ceca 0.22 | 17 | 7% | 18 |
| throxbot.ThroxBot 0.1 | 10 | 4% | 15 |
| techdude.kombat.FlamingKombat 1.5 | 10 | 4% | 14 |
| cs.Grudge 1.0 | 5 | 2% | 5 |

## Melee bench: F28

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 80.5 | 130 / 350 | 2.75 | 15.8% | 34239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.5 | 15.8% | 130 |
| kid.test.NightFox .2 | 1.5 | 15.9% | 100 |
| uji.Antique 1.0 | 3.2 | 12.6% | 53 |
| qohnil.blot.BlotBot 3.61 | 4.4 | 11.1% | 30 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.7% | 13 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.6% | 8 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.8% | 11 |
| matt.advanced.Katana 1.0 | 8.4 | 6.3% | 6 |
| stelo.PianistNano 1.2 | 8.8 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 85.4 | 17 / 35 | 3610 |
| 2 | 1 | 64.8 | 84.1 | 13 / 35 | 3476 |
| 3 | 1 | 64.5 | 82.5 | 16 / 35 | 3268 |
| 4 | 2 | 60.2 | 71.7 | 7 / 35 | 3137 |
| 5 | 2 | 61.9 | 74.6 | 11 / 35 | 3264 |
| 6 | 2 | 62.3 | 79.7 | 10 / 35 | 2959 |
| 7 | 1 | 66.7 | 87.6 | 16 / 35 | 3919 |
| 8 | 2 | 61.7 | 73.7 | 11 / 35 | 3218 |
| 9 | 1 | 65.8 | 85.1 | 18 / 35 | 3775 |
| 10 | 2 | 63.9 | 80.6 | 11 / 35 | 3613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 116 | 47% |
| uji.Antique 1.0 | 52 | 71% |
| qohnil.blot.BlotBot 3.61 | 21 | 67% |
| pfvicm.Sobieski 7.2.3b | 11 | 73% |
| ahr.ice.Ice 1.0.2 | 10 | 80% |
| amk.ChumbaWumba 0.3 | 7 | 100% |
| matt.advanced.Katana 1.0 | 5 | 20% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 221 of 350 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 92 | 42% | 135 |
| uji.Antique 1.0 | 40 | 18% | 82 |
| pfvicm.Sobieski 7.2.3b | 25 | 11% | 32 |
| qohnil.blot.BlotBot 3.61 | 18 | 8% | 35 |
| amk.ChumbaWumba 0.3 | 18 | 8% | 23 |
| ahr.ice.Ice 1.0.2 | 9 | 4% | 16 |
| matt.advanced.Katana 1.0 | 8 | 4% | 11 |
| stelo.Lifestealer 1.0 | 7 | 3% | 11 |
| stelo.PianistNano 1.2 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 70.0 | 72 / 350 | 3.70 | 13.8% | 32958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.6 | 15.8% | 106 |
| deewiant.Anomaly 0.2 | 1.6 | 15.9% | 113 |
| hadur117.nano.SanaroS3 0.3 | 3.0 | 13.8% | 72 |
| myl.micro.Troodon 1.10 | 3.9 | 12.5% | 20 |
| jok.PheonixM 0.1.2 | 5.0 | 10.5% | 14 |
| DBall.Anarchy 0.1 | 6.3 | 8.3% | 20 |
| ph.melee.ArcherME 0.3 | 6.6 | 8.0% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 6.0% | 0 |
| jangs.ns51 1.0 | 9.4 | 4.5% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 70.8 | 6 / 35 | 3599 |
| 2 | 3 | 60.7 | 69.5 | 7 / 35 | 3161 |
| 3 | 1 | 63.0 | 79.0 | 12 / 35 | 3092 |
| 4 | 4 | 59.1 | 63.5 | 7 / 35 | 3160 |
| 5 | 3 | 61.4 | 70.8 | 8 / 35 | 3211 |
| 6 | 4 | 58.0 | 61.6 | 2 / 35 | 3250 |
| 7 | 3 | 61.9 | 71.4 | 7 / 35 | 3428 |
| 8 | 3 | 62.3 | 73.0 | 9 / 35 | 3369 |
| 9 | 3 | 61.9 | 72.4 | 8 / 35 | 3404 |
| 10 | 3 | 60.3 | 68.3 | 6 / 35 | 3284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 60 | 62% |
| deewiant.Anomaly 0.2 | 52 | 10% |
| myl.micro.Troodon 1.10 | 18 | 83% |
| DBall.Anarchy 0.1 | 11 | 45% |
| jok.PheonixM 0.1.2 | 10 | 80% |
| ap.Frederick 1.1 | 2 | 50% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 1078. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 113 | 40% | 121 |
| zyx.mega.YersiniaPestis 3.1 | 63 | 22% | 98 |
| myl.micro.Troodon 1.10 | 37 | 13% | 50 |
| jok.PheonixM 0.1.2 | 31 | 11% | 39 |
| DBall.Anarchy 0.1 | 13 | 5% | 18 |
| ph.melee.ArcherME 0.3 | 8 | 3% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 8 | 3% | 9 |
| jangs.ns51 1.0 | 5 | 2% | 5 |
| ap.Frederick 1.1 | 2 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.1 | 60.2 | 39 / 350 | 4.19 | 12.3% | 25476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.8 | 16.8% | 124 |
| oog.melee.Capulet 1.2 | 2.0 | 15.9% | 81 |
| stelo.PastFuture 2.3.2 | 2.2 | 16.1% | 69 |
| hadur117.nano.SanaroS3 0.3 | 4.1 | 12.3% | 39 |
| intruder.PrairieWolf 2.61 | 5.2 | 10.1% | 24 |
| ntc.Opposite 1.5 | 6.3 | 9.3% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.0 | 8.3% | 6 |
| tripphippy.Alice 1.1 | 7.4 | 8.2% | 5 |
| GarmBox.Anger 1.0 | 9.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.8 | 59.6 | 2 / 35 | 2328 |
| 2 | 4 | 58.6 | 68.2 | 9 / 35 | 2806 |
| 3 | 4 | 52.1 | 54.6 | 1 / 35 | 2338 |
| 4 | 4 | 55.2 | 59.6 | 4 / 35 | 2483 |
| 5 | 4 | 53.0 | 55.4 | 1 / 35 | 2626 |
| 6 | 5 | 51.5 | 53.2 | 2 / 35 | 2207 |
| 7 | 4 | 52.3 | 54.6 | 6 / 35 | 2136 |
| 8 | 4 | 57.3 | 64.6 | 4 / 35 | 2758 |
| 9 | 4 | 56.7 | 62.5 | 4 / 35 | 2806 |
| 10 | 4 | 59.9 | 69.3 | 6 / 35 | 2988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 42 | 26% |
| stelo.PastFuture 2.3.2 | 26 | 50% |
| oog.melee.Capulet 1.2 | 26 | 12% |
| intruder.PrairieWolf 2.61 | 12 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |
| tripphippy.Alice 1.1 | 1 | 100% |
| ntc.Opposite 1.5 | 1 | 0% |

Hadur died in 312 of 350 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 89 | 29% | 97 |
| oog.melee.Capulet 1.2 | 78 | 25% | 84 |
| stelo.PastFuture 2.3.2 | 64 | 21% | 78 |
| ntc.Opposite 1.5 | 26 | 8% | 28 |
| intruder.PrairieWolf 2.61 | 22 | 7% | 29 |
| tripphippy.Alice 1.1 | 16 | 5% | 17 |
| fowl3628800.LightningBolt 2.6.0 | 13 | 4% | 13 |
| GarmBox.Anger 1.0 | 4 | 1% | 4 |

## Melee bench: F31

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.8 | 59.5 | 38 / 350 | 4.65 | 11.0% | 23948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.1% | 169 |
| gh.mini.Griezel 0.2 | 2.4 | 13.6% | 77 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 12.6% | 30 |
| d414.nano.Quantum 1.0.0 | 3.8 | 11.9% | 23 |
| hadur117.nano.SanaroS3 0.3 | 4.6 | 11.0% | 38 |
| gh.nano.Grofvuil 0.2 | 6.1 | 9.3% | 6 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.2% | 4 |
| fm.mammillarias 1.3 | 7.8 | 6.4% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 8.9 | 5.6% | 1 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 68.9 | 6 / 35 | 2377 |
| 2 | 5 | 54.1 | 56.5 | 3 / 35 | 2536 |
| 3 | 5 | 53.9 | 57.1 | 2 / 35 | 2476 |
| 4 | 4 | 57.7 | 65.7 | 5 / 35 | 2668 |
| 5 | 5 | 55.8 | 63.5 | 4 / 35 | 2239 |
| 6 | 5 | 51.4 | 51.1 | 2 / 35 | 2357 |
| 7 | 5 | 54.3 | 59.7 | 3 / 35 | 2370 |
| 8 | 4 | 56.7 | 63.8 | 4 / 35 | 2638 |
| 9 | 5 | 53.4 | 57.1 | 4 / 35 | 2071 |
| 10 | 4 | 51.8 | 51.1 | 5 / 35 | 2216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 49 | 39% |
| gh.mini.Griezel 0.2 | 38 | 42% |
| spinnercat.micro.Tyger 0.1 | 6 | 17% |
| d414.nano.Quantum 1.0.0 | 3 | 33% |
| timmit.nano.TimDog 0.33 | 2 | 0% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 75 | 24% | 94 |
| gh.mini.Griezel 0.2 | 65 | 21% | 81 |
| spinnercat.micro.Tyger 0.1 | 57 | 18% | 58 |
| d414.nano.Quantum 1.0.0 | 34 | 11% | 35 |
| gh.nano.Grofvuil 0.2 | 27 | 9% | 28 |
| fm.mammillarias 1.3 | 20 | 6% | 20 |
| timmit.nano.TimDog 0.33 | 15 | 5% | 15 |
| Gecko.ultimateGeckoBot 1.0 | 14 | 4% | 14 |
| tlp.ThreeLeggedPig 1 | 5 | 2% | 5 |

## Melee bench: F32

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 76.5 | 133 / 350 | 3.11 | 14.9% | 33421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.4 | 14.9% | 133 |
| kawigi.sbf.FloodHT 0.9.2 | 1.6 | 15.1% | 103 |
| apc.botM 3.0 | 3.2 | 12.5% | 50 |
| lxx.ConceptA 0.8 | 4.2 | 11.2% | 8 |
| vjik.UnViolation 1.1 | 4.8 | 10.5% | 24 |
| bayen.UbaMicro 1.4 | 5.8 | 9.1% | 12 |
| yk.JahMicro 1.0 | 8.0 | 7.2% | 12 |
| panzer.Panzer 0.2 | 8.1 | 7.2% | 1 |
| conscience.Electron 1.3g | 8.4 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 9.5 | 5.8% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 71.7 | 11 / 35 | 3057 |
| 2 | 1 | 63.4 | 81.9 | 14 / 35 | 3442 |
| 3 | 1 | 62.5 | 78.4 | 10 / 35 | 3674 |
| 4 | 1 | 63.4 | 80.6 | 17 / 35 | 3240 |
| 5 | 1 | 60.7 | 75.6 | 11 / 35 | 3144 |
| 6 | 2 | 62.4 | 76.8 | 13 / 35 | 3468 |
| 7 | 1 | 64.7 | 81.0 | 19 / 35 | 3755 |
| 8 | 1 | 63.5 | 79.7 | 17 / 35 | 3392 |
| 9 | 2 | 58.0 | 67.3 | 7 / 35 | 3125 |
| 10 | 2 | 60.6 | 72.4 | 14 / 35 | 3124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 89 | 62% |
| apc.botM 3.0 | 47 | 60% |
| lxx.ConceptA 0.8 | 20 | 100% |
| vjik.UnViolation 1.1 | 19 | 68% |
| donjezza.Jezza 1.0 | 10 | 60% |
| yk.JahMicro 1.0 | 8 | 75% |
| bayen.UbaMicro 1.4 | 7 | 43% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 217 of 350 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 65 | 30% | 120 |
| lxx.ConceptA 0.8 | 46 | 21% | 53 |
| apc.botM 3.0 | 36 | 17% | 65 |
| vjik.UnViolation 1.1 | 20 | 9% | 41 |
| bayen.UbaMicro 1.4 | 17 | 8% | 21 |
| panzer.Panzer 0.2 | 15 | 7% | 21 |
| yk.JahMicro 1.0 | 9 | 4% | 15 |
| donjezza.Jezza 1.0 | 5 | 2% | 9 |
| conscience.Electron 1.3g | 4 | 2% | 5 |

## Melee bench: F33

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 74.3 | 84 / 350 | 3.05 | 16.1% | 33751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.2 | 18.4% | 90 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 16.6% | 115 |
| hadur117.nano.SanaroS3 0.3 | 2.6 | 16.1% | 84 |
| labg.Cataclysm 2.05 | 4.0 | 13.1% | 47 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.4 | 10.0% | 12 |
| baal.nano.N 1.42 | 5.5 | 9.9% | 2 |
| zyx.micro.Ant 1.1 | 7.6 | 6.1% | 0 |
| sanja.First 0.1 | 7.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 76.4 | 7 / 35 | 3466 |
| 2 | 4 | 58.6 | 62.5 | 7 / 35 | 3118 |
| 3 | 3 | 63.1 | 74.6 | 10 / 35 | 3488 |
| 4 | 2 | 63.5 | 74.6 | 11 / 35 | 3417 |
| 5 | 3 | 64.2 | 75.4 | 11 / 35 | 3553 |
| 6 | 3 | 61.8 | 73.2 | 5 / 35 | 3138 |
| 7 | 2 | 62.9 | 77.1 | 10 / 35 | 3315 |
| 8 | 2 | 62.3 | 74.3 | 7 / 35 | 3358 |
| 9 | 3 | 62.5 | 74.3 | 5 / 35 | 3239 |
| 10 | 1 | 65.0 | 80.7 | 11 / 35 | 3659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 80 | 13% |
| maribo.Quester 0.3 | 68 | 69% |
| labg.Cataclysm 2.05 | 24 | 54% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 80% |
| baal.nano.N 1.42 | 5 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 266 of 350 rounds, at a mean tick of 1396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 101 | 38% | 113 |
| maribo.Quester 0.3 | 83 | 31% | 135 |
| labg.Cataclysm 2.05 | 35 | 13% | 45 |
| kinsen.melee.Angsaichmophobia 1.8c | 27 | 10% | 31 |
| baal.nano.N 1.42 | 10 | 4% | 15 |
| zyx.micro.Ant 1.1 | 9 | 3% | 9 |
| sanja.First 0.1 | 1 | 0% | 2 |

## Melee bench: F34

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 72.6 | 57 / 350 | 3.46 | 13.6% | 33182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.5 | 17.4% | 109 |
| stelo.Spread 0.9 | 1.6 | 17.7% | 137 |
| hadur117.nano.SanaroS3 0.3 | 3.0 | 13.6% | 57 |
| jcs.Seth 1.8 | 4.1 | 11.7% | 29 |
| tcf.Reach 3 | 4.9 | 10.9% | 13 |
| cli.Dancer 1.1 | 5.9 | 10.1% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 2 |
| amk.Punbot.Punbot 0.01 | 8.1 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 84.1 | 6 / 35 | 3865 |
| 2 | 3 | 62.4 | 74.9 | 6 / 35 | 3299 |
| 3 | 3 | 62.8 | 76.5 | 8 / 35 | 3215 |
| 4 | 4 | 61.1 | 69.8 | 4 / 35 | 3415 |
| 5 | 3 | 61.9 | 74.3 | 6 / 35 | 3358 |
| 6 | 3 | 60.4 | 69.8 | 6 / 35 | 2985 |
| 7 | 3 | 60.5 | 69.8 | 3 / 35 | 3441 |
| 8 | 3 | 60.3 | 67.6 | 5 / 35 | 3318 |
| 9 | 3 | 61.2 | 70.2 | 4 / 35 | 3442 |
| 10 | 3 | 60.4 | 69.2 | 9 / 35 | 2844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 63 | 49% |
| kid.Gladiator .7.2 | 57 | 19% |
| jcs.Seth 1.8 | 16 | 63% |
| tcf.Reach 3 | 6 | 67% |
| cli.Dancer 1.1 | 2 | 0% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 126 | 43% | 126 |
| stelo.Spread 0.9 | 91 | 31% | 129 |
| jcs.Seth 1.8 | 24 | 8% | 34 |
| tcf.Reach 3 | 24 | 8% | 31 |
| ratosh.Wesco 1.4 | 11 | 4% | 11 |
| cli.Dancer 1.1 | 10 | 3% | 11 |
| amk.Punbot.Punbot 0.01 | 4 | 1% | 4 |
| sample.VelociRobot 1.0 | 3 | 1% | 4 |

## Melee bench: F35

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 70.1 | 33 / 350 | 3.69 | 12.6% | 26089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 254 |
| gh.mini.Gruwel 0.9 | 2.3 | 13.4% | 39 |
| hadur117.nano.SanaroS3 0.3 | 3.4 | 12.6% | 33 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.3% | 13 |
| rz.HawkOnFire 0.1 | 4.3 | 11.8% | 8 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.3% | 2 |
| wit.Chuliath 1.0 | 6.8 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.1 | 6.1% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 68.6 | 5 / 35 | 2580 |
| 2 | 3 | 58.9 | 69.5 | 4 / 35 | 2565 |
| 3 | 3 | 60.2 | 74.0 | 3 / 35 | 2538 |
| 4 | 5 | 56.4 | 63.8 | 2 / 35 | 2264 |
| 5 | 4 | 59.3 | 71.4 | 1 / 35 | 2615 |
| 6 | 2 | 61.5 | 77.1 | 5 / 35 | 2849 |
| 7 | 2 | 60.0 | 72.4 | 4 / 35 | 2908 |
| 8 | 4 | 59.9 | 72.1 | 3 / 35 | 2806 |
| 9 | 4 | 56.8 | 62.9 | 3 / 35 | 2612 |
| 10 | 4 | 58.0 | 68.9 | 3 / 35 | 2352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 84 | 4% |
| gh.mini.Gruwel 0.9 | 24 | 50% |
| rz.HawkOnFire 0.1 | 10 | 90% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 60% |
| wit.Chuliath 1.0 | 2 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 50% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 317 of 350 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 131 | 41% | 134 |
| gh.mini.Gruwel 0.9 | 52 | 16% | 64 |
| dmh.robocode.robot.BlackDeath 9.2 | 52 | 16% | 58 |
| rz.HawkOnFire 0.1 | 43 | 14% | 53 |
| myl.nano.KomoriNinja 1.1 | 15 | 5% | 15 |
| wit.Chuliath 1.0 | 10 | 3% | 11 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 2% | 6 |
| dans.Cinnamon 1.2 | 5 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 4 | 1% | 5 |

## Melee bench: F36

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 76.4 | 134 / 350 | 3.13 | 15.4% | 36226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.1 | 15.4% | 134 |
| alpha.RainingFire 1.0 | 2.8 | 12.5% | 48 |
| bzdp.Pansy 2.1 | 3.1 | 12.6% | 59 |
| mz.Cork 0.1 | 3.8 | 11.7% | 38 |
| bvh.micro.Freya 0.3 | 4.7 | 11.0% | 24 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.7% | 19 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.7% | 6 |
| dl.BetterWalls 1.0 | 8.4 | 6.5% | 5 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.6% | 4 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.3% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 73.3 | 13 / 35 | 3362 |
| 2 | 1 | 64.3 | 78.7 | 12 / 35 | 4147 |
| 3 | 1 | 62.7 | 73.0 | 16 / 35 | 3688 |
| 4 | 1 | 64.2 | 79.0 | 15 / 35 | 3791 |
| 5 | 1 | 60.3 | 69.2 | 11 / 35 | 3233 |
| 6 | 1 | 64.0 | 80.3 | 15 / 35 | 3640 |
| 7 | 1 | 61.1 | 70.8 | 10 / 35 | 3482 |
| 8 | 1 | 65.0 | 84.1 | 15 / 35 | 3719 |
| 9 | 1 | 62.9 | 76.8 | 13 / 35 | 3446 |
| 10 | 1 | 63.8 | 78.4 | 14 / 35 | 3718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 52% |
| mz.Cork 0.1 | 38 | 76% |
| bvh.micro.Freya 0.3 | 33 | 82% |
| alpha.RainingFire 1.0 | 31 | 55% |
| bvh.mini.Fenrir 0.39 | 20 | 85% |
| m3thos.Eva02 0.7.1 | 20 | 55% |
| sample.MyFirstRobot 1.0 | 6 | 17% |
| dl.BetterWalls 1.0 | 6 | 67% |
| squidM.TentalceMeleeNano 1.1 | 3 | 67% |

Hadur died in 216 of 350 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 45 | 21% | 77 |
| alpha.RainingFire 1.0 | 45 | 21% | 64 |
| mz.Cork 0.1 | 32 | 15% | 63 |
| m3thos.Eva02 0.7.1 | 26 | 12% | 41 |
| bvh.micro.Freya 0.3 | 25 | 12% | 43 |
| bvh.mini.Fenrir 0.39 | 19 | 9% | 27 |
| dl.BetterWalls 1.0 | 10 | 5% | 15 |
| sample.MyFirstRobot 1.0 | 8 | 4% | 11 |
| squidM.TentalceMeleeNano 1.1 | 6 | 3% | 9 |

## Melee bench: F37

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 80.8 | 140 / 350 | 2.73 | 16.1% | 44665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.0 | 16.1% | 140 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.1 | 11.4% | 36 |
| germ.TheMind .2 | 3.1 | 11.3% | 43 |
| EBBU.Sim2 1.02 | 4.0 | 10.1% | 24 |
| agrach.Dalek 1.0 | 5.7 | 9.4% | 24 |
| lmk.ACPFinal 0.1 | 6.3 | 8.8% | 16 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.8% | 26 |
| mb.Beast 0.1 | 8.3 | 8.1% | 19 |
| skm.Ryubot 1.0 | 8.4 | 8.1% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 81.0 | 9 / 35 | 3846 |
| 2 | 1 | 64.6 | 84.1 | 16 / 35 | 4536 |
| 3 | 1 | 65.6 | 83.5 | 18 / 35 | 4968 |
| 4 | 1 | 63.1 | 80.0 | 13 / 35 | 4308 |
| 5 | 1 | 64.1 | 83.8 | 12 / 35 | 4383 |
| 6 | 1 | 64.6 | 81.0 | 14 / 35 | 5222 |
| 7 | 1 | 60.2 | 70.5 | 14 / 35 | 3957 |
| 8 | 1 | 64.0 | 82.2 | 15 / 35 | 4496 |
| 9 | 1 | 62.2 | 78.1 | 10 / 35 | 4201 |
| 10 | 1 | 65.0 | 83.8 | 19 / 35 | 4748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 39 | 49% |
| germ.TheMind .2 | 33 | 52% |
| EBBU.Sim2 1.02 | 31 | 58% |
| agrach.Dalek 1.0 | 27 | 81% |
| stelo.UntouchableNano 1.3 | 26 | 58% |
| mb.Beast 0.1 | 26 | 77% |
| skm.Ryubot 1.0 | 24 | 50% |
| lmk.ACPFinal 0.1 | 20 | 70% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 216 of 350 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 42 | 19% | 63 |
| germ.TheMind .2 | 34 | 16% | 53 |
| EBBU.Sim2 1.02 | 34 | 16% | 50 |
| agrach.Dalek 1.0 | 25 | 12% | 48 |
| lmk.ACPFinal 0.1 | 22 | 10% | 27 |
| skm.Ryubot 1.0 | 19 | 9% | 30 |
| stelo.UntouchableNano 1.3 | 17 | 8% | 30 |
| mb.Beast 0.1 | 15 | 7% | 36 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 4% | 11 |

## Melee bench: F38

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 65.0 | 44 / 350 | 4.15 | 11.9% | 26781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.9% | 146 |
| bvh.mini.Freya 0.55 | 2.7 | 12.8% | 33 |
| hadur117.nano.SanaroS3 0.3 | 3.7 | 11.9% | 44 |
| cs.Wren 1.0 | 4.3 | 11.4% | 24 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.5% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.2 | 10.8% | 27 |
| kdf.KoulDestroyer 1.0 | 6.6 | 9.8% | 15 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.4% | 8 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.5% | 1 |
| bzdp.BoxCar 2.0 | 9.9 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.9 | 61.3 | 1 / 35 | 2591 |
| 2 | 4 | 56.0 | 61.0 | 5 / 35 | 2821 |
| 3 | 6 | 53.5 | 56.5 | 4 / 35 | 2432 |
| 4 | 2 | 58.1 | 67.0 | 9 / 35 | 2424 |
| 5 | 6 | 55.2 | 60.6 | 4 / 35 | 2612 |
| 6 | 3 | 56.7 | 66.3 | 4 / 35 | 2341 |
| 7 | 4 | 58.7 | 69.2 | 3 / 35 | 2994 |
| 8 | 3 | 58.9 | 69.5 | 5 / 35 | 2979 |
| 9 | 2 | 60.2 | 73.0 | 4 / 35 | 3053 |
| 10 | 2 | 56.5 | 66.0 | 5 / 35 | 2534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 50 | 48% |
| bts.mega.Gnarly 1.4 | 19 | 16% |
| cs.Wren 1.0 | 15 | 47% |
| bvh.mini.Freya 0.55 | 13 | 38% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 0% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |
| matt.UnderDark3 2.4.34 | 1 | 0% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 80 | 26% | 106 |
| bts.mega.Gnarly 1.4 | 46 | 15% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 14% | 44 |
| bvh.mini.Freya 0.55 | 42 | 14% | 47 |
| cs.Wren 1.0 | 41 | 13% | 44 |
| kdf.KoulDestroyer 1.0 | 37 | 12% | 41 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 3% | 9 |
| bzdp.BoxCar 2.0 | 7 | 2% | 7 |
| matt.UnderDark3 2.4.34 | 3 | 1% | 3 |

## Melee bench: F39

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 69.4 | 43 / 350 | 3.45 | 14.2% | 31148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.3 | 17.9% | 93 |
| az.Ololobot 0.2.4 | 1.9 | 16.1% | 145 |
| hadur117.nano.SanaroS3 0.3 | 2.8 | 14.2% | 43 |
| stelo.SoRobotNanoMelee 1.2 | 4.9 | 10.6% | 37 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.7% | 13 |
| apollokidd.ApolloKidd 0.9 | 5.4 | 9.6% | 4 |
| gimp.GimpBot 0.1 | 6.6 | 8.8% | 11 |
| whitesquare.robots.SkynetAdvanced 1.1 | 7.9 | 7.4% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.9 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 73.6 | 5 / 35 | 3034 |
| 2 | 3 | 56.2 | 65.4 | 3 / 35 | 2740 |
| 3 | 3 | 58.2 | 70.0 | 4 / 35 | 3049 |
| 4 | 2 | 58.0 | 68.2 | 6 / 35 | 3296 |
| 5 | 3 | 59.6 | 72.1 | 7 / 35 | 3136 |
| 6 | 3 | 57.9 | 70.4 | 2 / 35 | 2946 |
| 7 | 3 | 56.5 | 67.9 | 2 / 35 | 2615 |
| 8 | 2 | 59.1 | 70.7 | 4 / 35 | 3317 |
| 9 | 3 | 57.4 | 65.0 | 4 / 35 | 3323 |
| 10 | 3 | 60.3 | 70.7 | 6 / 35 | 3692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 77 | 14% |
| bvh.fry.Freya 0.82 | 53 | 25% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 44% |
| gimp.GimpBot 0.1 | 9 | 33% |
| winamp32.micro.MicroMacro 1.0 | 8 | 63% |
| whitesquare.robots.SkynetAdvanced 1.1 | 4 | 75% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |

Hadur died in 307 of 350 rounds, at a mean tick of 1208. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 118 | 38% | 131 |
| az.Ololobot 0.2.4 | 82 | 27% | 91 |
| stelo.SoRobotNanoMelee 1.2 | 36 | 12% | 40 |
| apollokidd.ApolloKidd 0.9 | 27 | 9% | 29 |
| gimp.GimpBot 0.1 | 13 | 4% | 15 |
| winamp32.micro.MicroMacro 1.0 | 12 | 4% | 19 |
| whitesquare.robots.SkynetAdvanced 1.1 | 10 | 3% | 15 |
| dcs.Eater_of_Worlds 1.1.3-A | 9 | 3% | 9 |

## Melee bench: F41

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 73.7 | 97 / 350 | 3.37 | 14.0% | 30041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.3% | 167 |
| hadur117.nano.SanaroS3 0.3 | 2.3 | 14.0% | 97 |
| ary.Swarm 1.1 | 3.0 | 13.3% | 28 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.8% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.9 | 11.8% | 20 |
| shrub.Silver v048 | 6.1 | 8.9% | 8 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 2 |
| jsal.Jsalbot 1.0 | 8.3 | 5.9% | 4 |
| stelo.Mirror 1.1 | 8.6 | 5.6% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 80.0 | 11 / 35 | 3184 |
| 2 | 3 | 62.2 | 74.9 | 12 / 35 | 3009 |
| 3 | 2 | 61.5 | 73.0 | 9 / 35 | 3102 |
| 4 | 2 | 61.4 | 71.7 | 11 / 35 | 2921 |
| 5 | 2 | 61.4 | 72.1 | 8 / 35 | 3068 |
| 6 | 2 | 62.9 | 76.5 | 13 / 35 | 3164 |
| 7 | 2 | 61.7 | 74.6 | 9 / 35 | 3109 |
| 8 | 3 | 61.4 | 71.7 | 9 / 35 | 3119 |
| 9 | 2 | 59.8 | 70.5 | 8 / 35 | 2575 |
| 10 | 3 | 60.8 | 72.1 | 7 / 35 | 2790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 99 | 42% |
| lessonz.robocode.Oz 0.5.0 | 25 | 76% |
| simonton.nano.MeleeSeed 1.8 | 17 | 59% |
| ary.Swarm 1.1 | 17 | 100% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| shrub.Silver v048 | 4 | 25% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 254 of 350 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 100 | 39% | 143 |
| ary.Swarm 1.1 | 47 | 19% | 70 |
| simonton.nano.MeleeSeed 1.8 | 35 | 14% | 46 |
| lessonz.robocode.Oz 0.5.0 | 33 | 13% | 44 |
| shrub.Silver v048 | 17 | 7% | 20 |
| zyx.nano.Ant 1.1 | 10 | 4% | 10 |
| jsal.Jsalbot 1.0 | 5 | 2% | 10 |
| stelo.Mirror 1.1 | 4 | 2% | 5 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 73.0 | 80 / 350 | 3.43 | 14.0% | 34367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 158 |
| maribo.mini.MiniQuester 0.1 | 2.7 | 14.2% | 36 |
| hadur117.nano.SanaroS3 0.3 | 2.8 | 14.0% | 80 |
| ara.Shera 0.88 | 3.5 | 13.8% | 59 |
| amz.NanoClone 1.41 | 5.1 | 9.4% | 5 |
| dsw.StaticD 1.0 | 6.6 | 7.2% | 12 |
| maribo.IotaCT 1.1 | 6.9 | 7.0% | 0 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.9% | 1 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 71.4 | 9 / 35 | 3100 |
| 2 | 2 | 62.1 | 74.9 | 10 / 35 | 3405 |
| 3 | 4 | 61.3 | 73.0 | 10 / 35 | 3372 |
| 4 | 2 | 61.6 | 74.0 | 9 / 35 | 3673 |
| 5 | 3 | 61.1 | 75.6 | 4 / 35 | 3338 |
| 6 | 3 | 61.2 | 71.7 | 6 / 35 | 3713 |
| 7 | 2 | 61.7 | 77.1 | 7 / 35 | 3354 |
| 8 | 2 | 61.5 | 73.0 | 10 / 35 | 3391 |
| 9 | 4 | 58.6 | 65.1 | 6 / 35 | 3310 |
| 10 | 3 | 62.2 | 74.6 | 9 / 35 | 3711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 85 | 46% |
| ara.Shera 0.88 | 30 | 47% |
| maribo.mini.MiniQuester 0.1 | 27 | 70% |
| dsw.StaticD 1.0 | 8 | 63% |
| amz.NanoClone 1.41 | 2 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 270 of 350 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 103 | 38% | 145 |
| ara.Shera 0.88 | 64 | 24% | 78 |
| maribo.mini.MiniQuester 0.1 | 60 | 22% | 77 |
| amz.NanoClone 1.41 | 15 | 6% | 15 |
| dsw.StaticD 1.0 | 10 | 4% | 14 |
| maribo.IotaCT 1.1 | 8 | 3% | 9 |
| mme.NikeEnhanced 2.0 | 6 | 2% | 6 |
| stelo.MirrorMicro 1.0 | 4 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 61.3 | 27 / 350 | 4.48 | 11.4% | 26992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.6% | 267 |
| brainfade.melee.Dusk 0.44 | 2.6 | 13.0% | 24 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.1% | 16 |
| wcsv.melee.EngineerMelee 0.1 | 3.9 | 11.8% | 12 |
| hadur117.nano.SanaroS3 0.3 | 4.8 | 11.4% | 27 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.1% | 1 |
| mz.NanoGod 2.02 | 7.2 | 7.8% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 56.1 | 58.4 | 2 / 35 | 2663 |
| 2 | 5 | 57.8 | 62.5 | 1 / 35 | 2649 |
| 3 | 4 | 58.8 | 64.1 | 3 / 35 | 2662 |
| 4 | 4 | 59.4 | 65.7 | 2 / 35 | 2745 |
| 5 | 5 | 57.0 | 58.7 | 2 / 35 | 2642 |
| 6 | 5 | 58.9 | 64.4 | 3 / 35 | 2491 |
| 7 | 5 | 59.4 | 63.5 | 5 / 35 | 2787 |
| 8 | 4 | 59.4 | 64.1 | 6 / 35 | 2786 |
| 9 | 4 | 57.5 | 60.3 | 3 / 35 | 2899 |
| 10 | 6 | 53.7 | 51.1 | 0 / 35 | 2668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 57 | 21% |
| brainfade.melee.Dusk 0.44 | 13 | 69% |
| dummy.micro.Sparrow 2.5 | 8 | 63% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 33% |
| mz.NanoGod 2.02 | 1 | 0% |
| cvt.Firsty 1.0 | 1 | 0% |

Hadur died in 323 of 350 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 132 | 41% | 144 |
| dummy.micro.Sparrow 2.5 | 46 | 14% | 51 |
| wcsv.melee.EngineerMelee 0.1 | 46 | 14% | 47 |
| brainfade.melee.Dusk 0.44 | 43 | 13% | 52 |
| mz.NanoGod 2.02 | 22 | 7% | 22 |
| Krabb.akim2.Akim2 1.1b | 19 | 6% | 19 |
| jab.DiamondStealer 5 | 9 | 3% | 9 |
| cvt.Firsty 1.0 | 6 | 2% | 6 |

## Melee bench: F44

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 72.1 | 87 / 350 | 3.51 | 14.2% | 34865 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 16.3% | 127 |
| tzu.TheArtOfWar 1.2 | 2.1 | 15.3% | 81 |
| hadur117.nano.SanaroS3 0.3 | 2.7 | 14.2% | 87 |
| wompi.Quokka 1.6 | 4.6 | 11.1% | 14 |
| jwirde.Gort 2.0 | 4.7 | 10.7% | 26 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 9.2% | 7 |
| disan.Chair 2.2.0 | 7.0 | 7.4% | 6 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.8% | 2 |
| sample.Crazy 1.0 | 9.1 | 4.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 75.9 | 9 / 35 | 3592 |
| 2 | 3 | 61.7 | 71.1 | 11 / 35 | 3544 |
| 3 | 3 | 61.0 | 70.8 | 6 / 35 | 3475 |
| 4 | 2 | 62.3 | 74.6 | 8 / 35 | 3534 |
| 5 | 3 | 58.3 | 63.8 | 7 / 35 | 3114 |
| 6 | 2 | 60.9 | 70.5 | 9 / 35 | 3490 |
| 7 | 2 | 64.0 | 79.0 | 8 / 35 | 3999 |
| 8 | 3 | 62.8 | 74.0 | 12 / 35 | 3453 |
| 9 | 3 | 60.1 | 69.8 | 7 / 35 | 3334 |
| 10 | 3 | 61.4 | 71.7 | 10 / 35 | 3330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 74 | 61% |
| tzu.TheArtOfWar 1.2 | 39 | 31% |
| jwirde.Gort 2.0 | 19 | 79% |
| wompi.Quokka 1.6 | 11 | 45% |
| disan.Chair 2.2.0 | 5 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 25% |
| sample.Crazy 1.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 88 | 33% | 137 |
| tzu.TheArtOfWar 1.2 | 72 | 27% | 86 |
| wompi.Quokka 1.6 | 31 | 12% | 34 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 30 | 11% | 31 |
| jwirde.Gort 2.0 | 28 | 11% | 44 |
| stf.PanzerGeneral 0.1 | 7 | 3% | 8 |
| disan.Chair 2.2.0 | 5 | 2% | 6 |
| sample.Crazy 1.0 | 2 | 1% | 4 |

## Melee bench: F45

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 72.8 | 69 / 350 | 3.45 | 14.7% | 38009 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.2 | 14.7% | 69 |
| eem.IWillFireNoBullet v2.8 | 2.4 | 13.4% | 178 |
| jje.BagPuss 1.2 | 2.9 | 12.7% | 22 |
| sul.Lunar 1.1 | 3.8 | 11.4% | 53 |
| myl.nano.Graviton 1.10 | 5.2 | 10.0% | 6 |
| hvilela.HVilela 0.9 | 5.8 | 9.4% | 0 |
| fm.claire 1.7 | 7.2 | 8.6% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 8.3% | 5 |
| wit.Deep7 2.0 | 8.9 | 6.3% | 17 |
| abud.ThirdRobo 1.0 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 81.3 | 8 / 35 | 4031 |
| 2 | 2 | 61.2 | 71.1 | 5 / 35 | 3895 |
| 3 | 1 | 63.8 | 77.1 | 10 / 35 | 4056 |
| 4 | 1 | 59.2 | 68.3 | 3 / 35 | 3562 |
| 5 | 1 | 61.4 | 71.7 | 10 / 35 | 3711 |
| 6 | 2 | 59.6 | 68.3 | 5 / 35 | 3533 |
| 7 | 1 | 61.5 | 72.4 | 7 / 35 | 3797 |
| 8 | 1 | 61.3 | 71.4 | 7 / 35 | 3732 |
| 9 | 1 | 61.2 | 71.4 | 6 / 35 | 3789 |
| 10 | 1 | 62.3 | 75.2 | 8 / 35 | 3903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 102 | 42% |
| sul.Lunar 1.1 | 31 | 19% |
| jje.BagPuss 1.2 | 18 | 50% |
| wit.Deep7 2.0 | 7 | 57% |
| myl.nano.Graviton 1.10 | 7 | 57% |
| pez.mini.ChironexFleckeri 0.5 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 1443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 75 | 27% | 0 |
| sul.Lunar 1.1 | 62 | 22% | 100 |
| jje.BagPuss 1.2 | 53 | 19% | 98 |
| myl.nano.Graviton 1.10 | 31 | 11% | 54 |
| fm.claire 1.7 | 21 | 7% | 31 |
| hvilela.HVilela 0.9 | 21 | 7% | 27 |
| wit.Deep7 2.0 | 9 | 3% | 20 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 3% | 16 |
| abud.ThirdRobo 1.0 | 1 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F46

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 74.8 | 70 / 350 | 3.02 | 15.0% | 28220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.5% | 209 |
| hadur117.nano.SanaroS3 0.3 | 2.0 | 15.0% | 70 |
| cx.Princess 1.0 | 3.3 | 13.6% | 46 |
| mz.MicroSheep 1.0 | 3.7 | 12.6% | 19 |
| sadoner.killer 0.2 | 5.3 | 10.3% | 1 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.2% | 5 |
| jeremyreeder.collective.Prophet 5 | 6.9 | 7.2% | 1 |
| kurios.DOSexe .9a | 8.1 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 8.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.2 | 70.7 | 4 / 35 | 2680 |
| 2 | 2 | 60.5 | 75.7 | 7 / 35 | 2613 |
| 3 | 2 | 57.8 | 68.6 | 5 / 35 | 2525 |
| 4 | 2 | 63.7 | 82.5 | 9 / 35 | 3205 |
| 5 | 2 | 59.7 | 71.4 | 5 / 35 | 3043 |
| 6 | 2 | 60.5 | 73.6 | 9 / 35 | 2690 |
| 7 | 2 | 62.7 | 81.4 | 8 / 35 | 2934 |
| 8 | 2 | 61.2 | 77.9 | 5 / 35 | 2861 |
| 9 | 2 | 61.2 | 75.4 | 10 / 35 | 2871 |
| 10 | 2 | 58.8 | 70.4 | 8 / 35 | 2798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 133 | 32% |
| cx.Princess 1.0 | 26 | 69% |
| mz.MicroSheep 1.0 | 10 | 20% |
| sadoner.killer 0.2 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 280 of 350 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 170 | 61% | 222 |
| mz.MicroSheep 1.0 | 33 | 12% | 35 |
| cx.Princess 1.0 | 31 | 11% | 40 |
| sadoner.killer 0.2 | 20 | 7% | 22 |
| arthord.NanoSatanMelee Beta | 14 | 5% | 16 |
| jeremyreeder.collective.Prophet 5 | 9 | 3% | 9 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 4 |
| kurios.DOSexe .9a | 1 | 0% | 1 |

