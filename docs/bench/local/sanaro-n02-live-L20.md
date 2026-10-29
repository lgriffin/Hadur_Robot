# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 74.1 | 37 / 350 | 3.33 | 13.5% | 34487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 244 |
| hadur117.nano.SanaroL20 0.1 | 2.1 | 13.5% | 37 |
| sgp.JollyNinja 3.53 | 3.8 | 11.7% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.3% | 6 |
| mz.MicroGodMelee 1 | 4.4 | 11.2% | 13 |
| lorneswork.Predator 1.0 | 5.4 | 10.4% | 7 |
| adt.Ar2 1.0 | 7.1 | 7.7% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.6% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 72.4 | 3 / 35 | 3511 |
| 2 | 3 | 58.9 | 70.2 | 2 / 35 | 3298 |
| 3 | 2 | 60.7 | 75.6 | 4 / 35 | 3076 |
| 4 | 2 | 61.2 | 72.4 | 4 / 35 | 3864 |
| 5 | 2 | 61.0 | 74.3 | 3 / 35 | 3525 |
| 6 | 2 | 62.3 | 79.0 | 5 / 35 | 3210 |
| 7 | 2 | 59.2 | 71.7 | 5 / 35 | 3167 |
| 8 | 2 | 60.0 | 71.4 | 3 / 35 | 3667 |
| 9 | 2 | 62.8 | 77.1 | 4 / 35 | 3749 |
| 10 | 2 | 61.5 | 76.5 | 4 / 35 | 3420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 133 | 5% |
| sgp.JollyNinja 3.53 | 18 | 56% |
| mz.MicroGodMelee 1 | 15 | 60% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 78% |
| lorneswork.Predator 1.0 | 4 | 50% |
| adt.Ar2 1.0 | 4 | 75% |

Hadur died in 314 of 350 rounds, at a mean tick of 1105. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 162 | 52% | 168 |
| sgp.JollyNinja 3.53 | 52 | 17% | 59 |
| simonton.nano.WeekendObsession_Melee 1.0 | 30 | 10% | 37 |
| lorneswork.Predator 1.0 | 26 | 8% | 30 |
| mz.MicroGodMelee 1 | 25 | 8% | 33 |
| adt.Ar2 1.0 | 14 | 4% | 17 |
| skm.butterfly 1.0 | 3 | 1% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% | 2 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.0 | 66 / 350 | 3.88 | 13.9% | 39392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.7 | 14.4% | 82 |
| pulsar.PulsarMax 0.8.9 | 1.8 | 14.7% | 95 |
| hadur117.nano.SanaroL20 0.1 | 2.5 | 13.9% | 66 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.0% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.5% | 29 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.2% | 7 |
| sch.Simone 0.3d | 7.1 | 8.1% | 23 |
| Noran.BitchingElk 0.054 | 7.3 | 7.8% | 31 |
| stelo.PatternRobot 1.0 | 8.8 | 6.7% | 11 |
| fullsail.SweetTea 1.1 | 9.9 | 4.8% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 70.8 | 3 / 35 | 3906 |
| 2 | 3 | 59.3 | 63.5 | 4 / 35 | 4147 |
| 3 | 2 | 62.0 | 71.4 | 7 / 35 | 4252 |
| 4 | 3 | 58.3 | 63.8 | 6 / 35 | 3351 |
| 5 | 1 | 62.5 | 73.7 | 7 / 35 | 4284 |
| 6 | 3 | 59.7 | 65.7 | 7 / 35 | 4069 |
| 7 | 3 | 57.3 | 61.9 | 7 / 35 | 3335 |
| 8 | 3 | 57.5 | 62.9 | 7 / 35 | 3444 |
| 9 | 1 | 65.8 | 82.2 | 13 / 35 | 4625 |
| 10 | 3 | 59.0 | 64.4 | 5 / 35 | 3979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 55 | 51% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 40 | 10% |
| sch.Simone 0.3d | 14 | 43% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 77% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| Noran.BitchingElk 0.054 | 7 | 0% |
| stelo.PatternRobot 1.0 | 7 | 43% |
| fnc.bandit.Bandit 5.2.0 | 4 | 50% |
| fullsail.SweetTea 1.1 | 4 | 50% |

Hadur died in 286 of 350 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 79 | 28% | 90 |
| pulsar.PulsarMax 0.8.9 | 66 | 23% | 87 |
| stelo.PatternRobot 1.0 | 29 | 10% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 28 | 10% | 33 |
| sch.Simone 0.3d | 23 | 8% | 30 |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 8% | 33 |
| Noran.BitchingElk 0.054 | 14 | 5% | 18 |
| fnc.bandit.Bandit 5.2.0 | 14 | 5% | 17 |
| fullsail.SweetTea 1.1 | 10 | 3% | 11 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 79.1 | 66 / 350 | 2.88 | 14.8% | 39790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroL20 0.1 | 1.9 | 14.8% | 66 |
| radnor.DoctorBob 1.42 | 2.2 | 14.8% | 89 |
| kawigi.nano.Lib 1.0 | 2.5 | 14.4% | 81 |
| vuen.Cake 2.51 | 3.4 | 13.8% | 93 |
| urdos.URDOS 1.3 | 5.1 | 10.4% | 13 |
| adt.Ar1 2.1 | 6.5 | 7.5% | 2 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.8% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 7.6 | 6.9% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 6.1% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 80.0 | 8 / 35 | 3720 |
| 2 | 1 | 63.6 | 81.3 | 11 / 35 | 3817 |
| 3 | 2 | 61.8 | 78.7 | 4 / 35 | 3920 |
| 4 | 4 | 60.4 | 74.3 | 1 / 35 | 3901 |
| 5 | 3 | 61.5 | 77.1 | 6 / 35 | 3718 |
| 6 | 1 | 62.5 | 78.1 | 7 / 35 | 4116 |
| 7 | 1 | 63.9 | 81.6 | 9 / 35 | 4335 |
| 8 | 3 | 62.6 | 79.4 | 6 / 35 | 4037 |
| 9 | 1 | 62.8 | 78.7 | 7 / 35 | 4201 |
| 10 | 2 | 63.5 | 81.9 | 7 / 35 | 4025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 71 | 31% |
| radnor.DoctorBob 1.42 | 56 | 46% |
| kawigi.nano.Lib 1.0 | 45 | 4% |
| urdos.URDOS 1.3 | 16 | 69% |
| oa.weak.FlyMk1 0.1 | 5 | 60% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 0% |

Hadur died in 285 of 350 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 76 | 27% | 81 |
| radnor.DoctorBob 1.42 | 72 | 25% | 94 |
| vuen.Cake 2.51 | 70 | 25% | 90 |
| urdos.URDOS 1.3 | 38 | 13% | 49 |
| adt.Ar1 2.1 | 8 | 3% | 9 |
| oa.weak.FlyMk1 0.1 | 7 | 2% | 11 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 7 | 2% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 5 | 2% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 1% | 2 |

## Melee bench: F04

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 70.1 | 9 / 350 | 3.69 | 13.5% | 41216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.1% | 319 |
| apc.LeeroyJenkins2 1.0 | 2.2 | 14.3% | 16 |
| hadur117.nano.SanaroL20 0.1 | 2.8 | 13.5% | 9 |
| TNT.TNT 0.99.1 | 4.1 | 10.8% | 2 |
| josago.Jorgito 0.16 | 5.1 | 9.0% | 2 |
| tj.zombie1n 1.0.1 | 6.4 | 7.4% | 0 |
| css.Delitioner 0.11 | 6.4 | 7.5% | 1 |
| rampancy.Durandal 2.1d | 8.2 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.1 | 4.5% | 1 |
| spin.Bugstard 0.012b | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 67.3 | 0 / 35 | 4692 |
| 2 | 3 | 60.5 | 67.3 | 1 / 35 | 3906 |
| 3 | 2 | 62.8 | 72.7 | 1 / 35 | 4358 |
| 4 | 2 | 62.3 | 72.7 | 2 / 35 | 4242 |
| 5 | 3 | 61.1 | 70.5 | 0 / 35 | 3905 |
| 6 | 3 | 62.1 | 72.7 | 1 / 35 | 3880 |
| 7 | 3 | 59.7 | 65.7 | 0 / 35 | 3791 |
| 8 | 3 | 62.1 | 72.4 | 1 / 35 | 4057 |
| 9 | 3 | 60.9 | 67.9 | 1 / 35 | 4120 |
| 10 | 3 | 62.3 | 71.7 | 2 / 35 | 4265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 123 | 3% |
| apc.LeeroyJenkins2 1.0 | 8 | 63% |
| josago.Jorgito 0.16 | 1 | 0% |
| sp.Nanos.Ember 1.1 | 1 | 0% |

Hadur died in 341 of 350 rounds, at a mean tick of 1161. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 236 | 69% | 238 |
| apc.LeeroyJenkins2 1.0 | 41 | 12% | 48 |
| josago.Jorgito 0.16 | 27 | 8% | 27 |
| TNT.TNT 0.99.1 | 19 | 6% | 19 |
| tj.zombie1n 1.0.1 | 6 | 2% | 6 |
| css.Delitioner 0.11 | 6 | 2% | 6 |
| rampancy.Durandal 2.1d | 5 | 1% | 5 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.3 | 61 / 350 | 3.95 | 12.8% | 30386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.0 | 15.9% | 96 |
| origin.SleepSiphon 1.7b | 2.4 | 14.0% | 98 |
| hadur117.nano.SanaroL20 0.1 | 3.1 | 12.8% | 61 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.4% | 46 |
| mld.Wisdom 1.0 | 4.5 | 11.8% | 22 |
| gg.Wolverine 2.0 | 6.3 | 8.3% | 11 |
| spinnercat.Omen 1.0 | 7.4 | 7.5% | 4 |
| DBall.NUKE 0.1 | 7.6 | 7.5% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.7 | 6.8% | 10 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 74.3 | 8 / 35 | 3055 |
| 2 | 2 | 60.4 | 68.3 | 10 / 35 | 3405 |
| 3 | 5 | 54.7 | 60.0 | 2 / 35 | 2543 |
| 4 | 4 | 56.8 | 62.5 | 5 / 35 | 2834 |
| 5 | 2 | 60.9 | 72.1 | 7 / 35 | 3180 |
| 6 | 3 | 57.5 | 65.7 | 3 / 35 | 2971 |
| 7 | 3 | 59.1 | 67.0 | 5 / 35 | 3469 |
| 8 | 3 | 59.1 | 67.9 | 5 / 35 | 3038 |
| 9 | 2 | 60.8 | 70.5 | 10 / 35 | 3200 |
| 10 | 4 | 56.5 | 64.4 | 6 / 35 | 2691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 41 | 51% |
| origin.SleepSiphon 1.7b | 34 | 41% |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 48% |
| gg.Wolverine 2.0 | 11 | 82% |
| DBall.NUKE 0.1 | 4 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| mld.Wisdom 1.0 | 1 | 0% |

Hadur died in 291 of 350 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 86 | 30% | 104 |
| origin.SleepSiphon 1.7b | 68 | 23% | 83 |
| mld.Wisdom 1.0 | 57 | 20% | 60 |
| pe.minimelee.SandboxMiniMelee 1.1 | 44 | 15% | 55 |
| gg.Wolverine 2.0 | 12 | 4% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 3% | 11 |
| DBall.NUKE 0.1 | 7 | 2% | 14 |
| spinnercat.Omen 1.0 | 7 | 2% | 7 |
| sample.Fire 1.0 | 2 | 1% | 2 |

## Melee bench: F07

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 80.5 | 96 / 350 | 2.75 | 16.1% | 45533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.4 | 17.8% | 90 |
| rsalesc.melee.Monk 0.3.6c | 1.9 | 17.9% | 103 |
| hadur117.nano.SanaroL20 0.1 | 2.7 | 16.1% | 96 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 12.0% | 25 |
| franzor.Lizt 1.3.1 | 4.7 | 11.3% | 36 |
| lrem.micro.MoggFanatic 0.2 | 6.1 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.9 | 7.4% | 2 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.4 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.6 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.4 | 73.0 | 7 / 35 | 4029 |
| 2 | 2 | 68.8 | 86.0 | 13 / 35 | 5022 |
| 3 | 3 | 67.0 | 80.3 | 10 / 35 | 4656 |
| 4 | 3 | 64.9 | 78.1 | 6 / 35 | 4135 |
| 5 | 3 | 65.8 | 78.7 | 11 / 35 | 4332 |
| 6 | 2 | 66.7 | 81.0 | 9 / 35 | 4704 |
| 7 | 3 | 66.5 | 82.2 | 10 / 35 | 4514 |
| 8 | 3 | 66.3 | 80.6 | 7 / 35 | 4559 |
| 9 | 2 | 68.6 | 85.4 | 14 / 35 | 5170 |
| 10 | 3 | 66.0 | 79.7 | 9 / 35 | 4412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 104 | 66% |
| rsalesc.melee.Monk 0.3.6c | 54 | 19% |
| oog.melee.CapuletDroid 1.1 | 23 | 52% |
| franzor.Lizt 1.3.1 | 11 | 45% |
| exauge.GateKeeper 1.1.121g | 1 | 0% |

Hadur died in 255 of 350 rounds, at a mean tick of 1261. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 112 | 44% | 187 |
| rsalesc.melee.Monk 0.3.6c | 96 | 38% | 108 |
| oog.melee.CapuletDroid 1.1 | 28 | 11% | 39 |
| franzor.Lizt 1.3.1 | 8 | 3% | 3 |
| exauge.GateKeeper 1.1.121g | 7 | 3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 67.7 | 68 / 350 | 3.90 | 13.1% | 31886 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.3 | 14.6% | 113 |
| hadur117.nano.SanaroL20 0.1 | 2.4 | 13.1% | 68 |
| shrub.Vapour v159 | 2.5 | 13.1% | 71 |
| Krabb.sliNk.Garm 0.9u | 4.1 | 11.1% | 30 |
| com.spp.robocode.MostlyHarmless 010 | 5.1 | 10.3% | 34 |
| m3thos.Eva00 1.1 | 6.3 | 9.2% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 6.4 | 8.9% | 20 |
| SHAM.WOW 1.4 | 8.7 | 6.8% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.9 | 6.6% | 5 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 6.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 56.6 | 64.1 | 6 / 35 | 3129 |
| 2 | 2 | 61.3 | 75.6 | 7 / 35 | 3582 |
| 3 | 2 | 61.1 | 73.0 | 13 / 35 | 3148 |
| 4 | 2 | 57.5 | 66.0 | 4 / 35 | 3230 |
| 5 | 3 | 55.7 | 61.0 | 8 / 35 | 2831 |
| 6 | 1 | 60.5 | 74.0 | 8 / 35 | 3119 |
| 7 | 2 | 58.0 | 65.4 | 7 / 35 | 3266 |
| 8 | 4 | 54.4 | 59.7 | 4 / 35 | 2842 |
| 9 | 3 | 60.0 | 72.1 | 5 / 35 | 3340 |
| 10 | 3 | 58.9 | 66.7 | 6 / 35 | 3399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 50 | 34% |
| shrub.Vapour v159 | 34 | 26% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 65% |
| Krabb.sliNk.Garm 0.9u | 14 | 93% |
| com.spp.robocode.MostlyHarmless 010 | 12 | 25% |
| m3thos.Eva00 1.1 | 9 | 67% |
| SHAM.WOW 1.4 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 77 | 27% | 97 |
| shrub.Vapour v159 | 64 | 23% | 72 |
| Krabb.sliNk.Garm 0.9u | 34 | 12% | 39 |
| com.spp.robocode.MostlyHarmless 010 | 30 | 11% | 35 |
| m3thos.Eva00 1.1 | 29 | 10% | 37 |
| jwst.DAD.DarkAndDarker 1.1 | 25 | 9% | 35 |
| zyx.nano.BacillusComma 1.0 | 11 | 4% | 13 |
| qualidafial.MajorDick 1.0.1 | 7 | 2% | 10 |
| SHAM.WOW 1.4 | 6 | 2% | 12 |

## Melee bench: F09

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.5 | 59.0 | 30 / 350 | 4.69 | 11.3% | 27480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.2% | 197 |
| kc.micro.Figment 1.0 | 2.0 | 14.9% | 71 |
| yagami.Tidus 0.11 | 4.0 | 11.3% | 1 |
| hadur117.nano.SanaroL20 0.1 | 4.0 | 11.3% | 30 |
| pedersen.Grishnakh 1.0 | 4.3 | 11.0% | 28 |
| mc2.enemy.Original 0.9 | 5.8 | 9.6% | 19 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 2 |
| step.nanoPri 1.0 | 8.1 | 6.1% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.6 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.7 | 53.0 | 3 / 35 | 2827 |
| 2 | 6 | 51.2 | 48.9 | 2 / 35 | 2617 |
| 3 | 5 | 56.3 | 62.5 | 3 / 35 | 2571 |
| 4 | 3 | 56.2 | 59.7 | 3 / 35 | 2935 |
| 5 | 4 | 56.2 | 60.6 | 3 / 35 | 2816 |
| 6 | 4 | 54.9 | 58.4 | 2 / 35 | 2526 |
| 7 | 3 | 57.4 | 63.5 | 4 / 35 | 2993 |
| 8 | 3 | 55.7 | 59.0 | 4 / 35 | 2754 |
| 9 | 4 | 56.2 | 60.6 | 4 / 35 | 2543 |
| 10 | 3 | 57.3 | 63.5 | 2 / 35 | 2898 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 57 | 39% |
| kc.micro.Figment 1.0 | 26 | 15% |
| pedersen.Grishnakh 1.0 | 5 | 0% |
| mc2.enemy.Original 0.9 | 3 | 33% |
| yagami.Tidus 0.11 | 2 | 100% |
| dft.Calliope 5.6 | 2 | 50% |
| step.nanoPri 1.0 | 1 | 0% |

Hadur died in 320 of 350 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 109 | 34% | 131 |
| kc.micro.Figment 1.0 | 82 | 26% | 87 |
| pedersen.Grishnakh 1.0 | 40 | 13% | 40 |
| yagami.Tidus 0.11 | 30 | 9% | 31 |
| mc2.enemy.Original 0.9 | 17 | 5% | 18 |
| robar.nano.Assertive_Melee 0.2 | 17 | 5% | 17 |
| dft.Calliope 5.6 | 11 | 3% | 12 |
| step.nanoPri 1.0 | 11 | 3% | 11 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |

## Melee bench: F10

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 77.9 | 99 / 350 | 2.99 | 15.2% | 40569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroL20 0.1 | 1.5 | 15.2% | 99 |
| DTF.Kludgy 1.2b | 1.8 | 15.0% | 96 |
| ne.Chimera 1.2 | 3.0 | 13.2% | 47 |
| ejb.Polaris 1.0.1 | 3.7 | 12.8% | 36 |
| tvv.micro.Antares 1.1.1 | 5.4 | 11.4% | 47 |
| vStar.RAFzilla 2.15 | 5.6 | 10.8% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.9 | 5.6% | 0 |
| kurios.DOSexe .9b | 8.1 | 5.6% | 3 |
| sam.Samspin 1.0 | 8.2 | 5.8% | 1 |
| donjezza.Muncho 1.0 | 9.8 | 4.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 83.5 | 13 / 35 | 4119 |
| 2 | 2 | 62.7 | 76.8 | 8 / 35 | 4218 |
| 3 | 3 | 59.2 | 68.3 | 6 / 35 | 3643 |
| 4 | 2 | 63.0 | 76.8 | 11 / 35 | 3959 |
| 5 | 1 | 64.2 | 80.3 | 11 / 35 | 4283 |
| 6 | 1 | 63.4 | 79.0 | 8 / 35 | 4250 |
| 7 | 1 | 61.2 | 73.0 | 8 / 35 | 3817 |
| 8 | 1 | 65.8 | 85.4 | 13 / 35 | 4440 |
| 9 | 1 | 63.4 | 78.1 | 9 / 35 | 4189 |
| 10 | 2 | 63.3 | 78.1 | 12 / 35 | 3651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 65 | 31% |
| ejb.Polaris 1.0.1 | 40 | 73% |
| tvv.micro.Antares 1.1.1 | 27 | 44% |
| ne.Chimera 1.2 | 23 | 48% |
| vStar.RAFzilla 2.15 | 21 | 76% |
| kurios.DOSexe .9b | 8 | 100% |
| sam.Samspin 1.0 | 3 | 67% |
| donjezza.Muncho 1.0 | 3 | 0% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 253 of 350 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 88 | 35% | 106 |
| ne.Chimera 1.2 | 66 | 26% | 80 |
| tvv.micro.Antares 1.1.1 | 34 | 13% | 38 |
| ejb.Polaris 1.0.1 | 29 | 11% | 64 |
| vStar.RAFzilla 2.15 | 14 | 6% | 27 |
| sam.Samspin 1.0 | 11 | 4% | 12 |
| donjezza.Muncho 1.0 | 6 | 2% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 1% | 3 |
| kurios.DOSexe .9b | 2 | 1% | 11 |

## Melee bench: F11

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 61.2 | 45 / 350 | 4.49 | 11.8% | 29812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.2% | 149 |
| cx.mini.Nimrod 0.55 | 2.2 | 13.0% | 42 |
| hadur117.nano.SanaroL20 0.1 | 3.1 | 11.8% | 45 |
| djc.DynaBot 0.1.1 | 4.3 | 11.0% | 26 |
| rdt199.Warlord 0.73 | 5.7 | 9.8% | 27 |
| br2.MobyDickBot 1.6 | 5.9 | 9.6% | 32 |
| uji.YellohFellah 1.0 | 6.0 | 9.4% | 29 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.5% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.1 | 5.8% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 52.1 | 52.1 | 2 / 35 | 2741 |
| 2 | 2 | 60.1 | 68.3 | 8 / 35 | 3572 |
| 3 | 3 | 56.4 | 61.6 | 6 / 35 | 2860 |
| 4 | 3 | 54.6 | 56.8 | 4 / 35 | 2916 |
| 5 | 2 | 57.1 | 62.5 | 5 / 35 | 3294 |
| 6 | 3 | 57.8 | 64.4 | 7 / 35 | 2996 |
| 7 | 3 | 54.8 | 59.4 | 3 / 35 | 2737 |
| 8 | 3 | 57.6 | 65.7 | 5 / 35 | 2883 |
| 9 | 3 | 58.2 | 66.7 | 5 / 35 | 3161 |
| 10 | 5 | 51.9 | 54.3 | 0 / 35 | 2652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 49 | 47% |
| cx.mini.Nimrod 0.55 | 16 | 38% |
| djc.DynaBot 0.1.1 | 13 | 69% |
| uji.YellohFellah 1.0 | 11 | 27% |
| br2.MobyDickBot 1.6 | 8 | 25% |
| rdt199.Warlord 0.73 | 2 | 50% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 93 | 30% | 110 |
| cx.mini.Nimrod 0.55 | 57 | 19% | 64 |
| rdt199.Warlord 0.73 | 45 | 15% | 49 |
| br2.MobyDickBot 1.6 | 27 | 9% | 30 |
| djc.DynaBot 0.1.1 | 26 | 9% | 31 |
| uji.YellohFellah 1.0 | 23 | 8% | 28 |
| KiraNL.Chupacabra 0.4 | 16 | 5% | 19 |
| stelo.MirrorNano 1.3 | 10 | 3% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 3% | 8 |

## Melee bench: F12

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 63.6 | 58 / 350 | 4.27 | 12.2% | 28017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.7 | 14.7% | 84 |
| nat.PallasHawk 1.0 | 1.9 | 14.4% | 97 |
| darkcanuck.Leon 1.01 | 2.5 | 13.7% | 70 |
| hadur117.nano.SanaroL20 0.1 | 4.0 | 12.2% | 58 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.8% | 26 |
| jrm.Test0 1.0 | 6.2 | 8.5% | 6 |
| cs.sheldor.Talon 1.1 | 7.4 | 7.2% | 4 |
| jp.Perpy 16.0 | 7.8 | 7.2% | 2 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.8% | 5 |
| stuff.Vlad 0.1 | 9.6 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.0 | 61.6 | 6 / 35 | 2987 |
| 2 | 4 | 56.4 | 60.6 | 5 / 35 | 2935 |
| 3 | 4 | 58.2 | 64.1 | 7 / 35 | 2912 |
| 4 | 5 | 54.5 | 58.1 | 2 / 35 | 2757 |
| 5 | 4 | 55.7 | 60.3 | 7 / 35 | 2576 |
| 6 | 4 | 57.7 | 66.0 | 7 / 35 | 2714 |
| 7 | 4 | 56.5 | 64.1 | 6 / 35 | 2631 |
| 8 | 3 | 59.0 | 66.3 | 7 / 35 | 3063 |
| 9 | 4 | 59.7 | 68.6 | 7 / 35 | 3068 |
| 10 | 4 | 56.4 | 66.3 | 4 / 35 | 2374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 42 | 43% |
| bts.wiki.RipCurl 0.9b | 34 | 47% |
| darkcanuck.Leon 1.01 | 26 | 19% |
| brainfade.melee.Genghis 0.36 | 11 | 82% |
| stuff.Vlad 0.1 | 3 | 100% |
| jrm.Test0 1.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| jp.Perpy 16.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 72 | 25% | 91 |
| bts.wiki.RipCurl 0.9b | 60 | 21% | 73 |
| darkcanuck.Leon 1.01 | 53 | 18% | 60 |
| brainfade.melee.Genghis 0.36 | 35 | 12% | 41 |
| jrm.Test0 1.0 | 25 | 9% | 27 |
| jp.Perpy 16.0 | 18 | 6% | 22 |
| jaybot.bots.Oddball 4.0 | 14 | 5% | 15 |
| cs.sheldor.Talon 1.1 | 10 | 3% | 12 |
| stuff.Vlad 0.1 | 5 | 2% | 7 |

## Melee bench: F13

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 71.5 | 29 / 350 | 3.57 | 12.9% | 31265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.4 | 17.3% | 108 |
| mn.Combat 3.25.0 | 1.6 | 17.1% | 157 |
| hadur117.nano.SanaroL20 0.1 | 3.6 | 12.9% | 29 |
| shinh.Entangled 0.3 | 4.2 | 12.2% | 33 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.2% | 22 |
| apc.Colossus2 0.17 | 6.2 | 8.1% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.0% | 2 |
| ayk.WallHugger 1.0 | 8.3 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 71.7 | 2 / 35 | 3303 |
| 2 | 5 | 57.7 | 68.6 | 2 / 35 | 2527 |
| 3 | 3 | 60.6 | 72.1 | 4 / 35 | 3246 |
| 4 | 4 | 57.6 | 65.4 | 2 / 35 | 2939 |
| 5 | 4 | 57.4 | 64.8 | 1 / 35 | 2952 |
| 6 | 4 | 59.5 | 71.1 | 4 / 35 | 2963 |
| 7 | 3 | 62.6 | 78.7 | 5 / 35 | 3309 |
| 8 | 4 | 59.8 | 72.4 | 2 / 35 | 3022 |
| 9 | 3 | 60.5 | 74.3 | 2 / 35 | 3241 |
| 10 | 3 | 62.2 | 75.6 | 5 / 35 | 3763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 69 | 26% |
| ags.Glacier 0.2.11 | 58 | 10% |
| shinh.Entangled 0.3 | 23 | 22% |
| gh.micro.Gruweltje 0.7 | 4 | 0% |
| stelo.Wang 1.0 | 2 | 0% |

Hadur died in 321 of 350 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 112 | 35% | 118 |
| mn.Combat 3.25.0 | 91 | 28% | 108 |
| gh.micro.Gruweltje 0.7 | 42 | 13% | 43 |
| shinh.Entangled 0.3 | 38 | 12% | 42 |
| stelo.Wang 1.0 | 12 | 4% | 12 |
| maribo.FollowFire 1 | 11 | 3% | 10 |
| apc.Colossus2 0.17 | 9 | 3% | 9 |
| ayk.WallHugger 1.0 | 5 | 2% | 7 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 75.6 | 79 / 350 | 3.20 | 14.2% | 33501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 18.7% | 173 |
| hadur117.nano.SanaroL20 0.1 | 2.0 | 14.2% | 79 |
| catcat20.shape.Theta 0.018 | 3.1 | 12.2% | 50 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 10.4% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 10.1% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 10.0% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 6.5 | 9.2% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.7% | 9 |
| pa.Improved 1.0 | 9.0 | 5.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 73.7 | 7 / 35 | 3880 |
| 2 | 2 | 62.1 | 76.2 | 7 / 35 | 3390 |
| 3 | 2 | 63.5 | 79.4 | 12 / 35 | 3354 |
| 4 | 2 | 61.7 | 76.5 | 5 / 35 | 3383 |
| 5 | 2 | 63.8 | 81.3 | 10 / 35 | 3399 |
| 6 | 2 | 61.9 | 76.2 | 9 / 35 | 3027 |
| 7 | 2 | 62.9 | 77.1 | 11 / 35 | 3427 |
| 8 | 2 | 60.0 | 70.2 | 6 / 35 | 3324 |
| 9 | 2 | 62.2 | 74.6 | 10 / 35 | 3384 |
| 10 | 2 | 58.9 | 70.8 | 2 / 35 | 2933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 110 | 31% |
| catcat20.shape.Theta 0.018 | 39 | 62% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 91% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 29% |
| sanyi.mikrobi.Roberto 1.0 | 6 | 33% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 75% |
| pa.Improved 1.0 | 3 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 50% |

Hadur died in 271 of 350 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 141 | 52% | 174 |
| catcat20.shape.Theta 0.018 | 36 | 13% | 57 |
| dmh.robocode.robot.RedDwarf 0.4 | 24 | 9% | 27 |
| Lo_Ian.Gandalf_V4 4.0 | 20 | 7% | 22 |
| co.edu.usb.rc.LidisTron 1.0 | 19 | 7% | 22 |
| sanyi.mikrobi.Roberto 1.0 | 17 | 6% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 4% | 15 |
| pa.Improved 1.0 | 4 | 1% | 9 |

## Melee bench: F15

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 63.1 | 34 / 350 | 4.32 | 12.3% | 33851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.2 | 14.9% | 88 |
| emp.Yngwie 1.11 | 2.1 | 14.1% | 122 |
| mld.DustBunny 3.8 | 3.0 | 13.6% | 43 |
| hadur117.nano.SanaroL20 0.1 | 4.0 | 12.3% | 34 |
| cb.nano.Insomnia 1.0 | 5.2 | 11.1% | 22 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.3% | 37 |
| Grystrion.TrackerWO 1.0 | 7.3 | 7.7% | 1 |
| lambdaxy.TBot 0.1 | 7.9 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 8.9 | 5.4% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 63.8 | 1 / 35 | 3735 |
| 2 | 5 | 55.9 | 61.3 | 4 / 35 | 2997 |
| 3 | 4 | 56.1 | 61.9 | 1 / 35 | 3149 |
| 4 | 6 | 54.8 | 57.1 | 1 / 35 | 3180 |
| 5 | 4 | 55.6 | 56.5 | 3 / 35 | 3422 |
| 6 | 2 | 60.9 | 70.8 | 5 / 35 | 3695 |
| 7 | 4 | 55.3 | 60.0 | 3 / 35 | 2888 |
| 8 | 3 | 60.2 | 67.6 | 7 / 35 | 3750 |
| 9 | 4 | 58.1 | 64.4 | 4 / 35 | 3333 |
| 10 | 4 | 60.3 | 67.3 | 5 / 35 | 3702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 27 | 19% |
| emp.Yngwie 1.11 | 21 | 38% |
| mld.DustBunny 3.8 | 16 | 25% |
| cb.nano.Insomnia 1.0 | 15 | 53% |
| kawigi.robot.Girl 1.2 | 12 | 58% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 316 of 350 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 71 | 22% | 77 |
| mld.DustBunny 3.8 | 69 | 22% | 77 |
| emp.Yngwie 1.11 | 67 | 21% | 80 |
| cb.nano.Insomnia 1.0 | 38 | 12% | 34 |
| kawigi.robot.Girl 1.2 | 31 | 10% | 38 |
| Grystrion.TrackerWO 1.0 | 19 | 6% | 20 |
| lambdaxy.TBot 0.1 | 10 | 3% | 11 |
| divineomega.TrialBot 0.003 | 8 | 3% | 9 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 1% | 4 |

## Melee bench: F16

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 66.0 | 28 / 350 | 4.06 | 13.2% | 38652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.5% | 165 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 15.5% | 32 |
| hadur117.nano.SanaroL20 0.1 | 3.1 | 13.2% | 28 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 11.1% | 74 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.7% | 11 |
| tvv.nano.Polaris 1.2 | 5.4 | 9.7% | 25 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.9% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.4% | 10 |
| repositorio.NanoStep 1.0 | 9.0 | 5.1% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.8 | 63.2 | 1 / 35 | 3697 |
| 2 | 3 | 59.3 | 65.4 | 2 / 35 | 3807 |
| 3 | 3 | 61.0 | 69.5 | 6 / 35 | 3921 |
| 4 | 3 | 59.2 | 66.7 | 1 / 35 | 3532 |
| 5 | 3 | 60.2 | 65.4 | 3 / 35 | 3970 |
| 6 | 3 | 62.8 | 72.1 | 6 / 35 | 4394 |
| 7 | 3 | 60.6 | 67.9 | 2 / 35 | 4256 |
| 8 | 3 | 58.3 | 63.2 | 2 / 35 | 3678 |
| 9 | 3 | 59.8 | 65.7 | 4 / 35 | 3930 |
| 10 | 3 | 57.2 | 61.3 | 1 / 35 | 3467 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 69 | 3% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 61% |
| tvv.nano.Polaris 1.2 | 13 | 38% |
| techdude.forest.FlamingForest 1.1 | 12 | 33% |
| divineomega.DivineBot 1.9.4.5 | 3 | 33% |
| bvh.fnr.Fenrir 0.36l | 3 | 67% |
| asd.Cthulhu 1.3 | 1 | 0% |

Hadur died in 322 of 350 rounds, at a mean tick of 1112. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 130 | 40% | 133 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 77 | 24% | 90 |
| bvh.fnr.Fenrir 0.36l | 34 | 11% | 35 |
| techdude.forest.FlamingForest 1.1 | 30 | 9% | 35 |
| tvv.nano.Polaris 1.2 | 17 | 5% | 21 |
| stelo.IntrinsicVolatility 1.4 | 15 | 5% | 15 |
| divineomega.DivineBot 1.9.4.5 | 10 | 3% | 11 |
| asd.Cthulhu 1.3 | 7 | 2% | 7 |
| repositorio.NanoStep 1.0 | 2 | 1% | 3 |

## Melee bench: F17

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 65.3 | 63 / 350 | 4.12 | 13.0% | 35712 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.3 | 13.6% | 57 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.6% | 76 |
| cx.BlestPain 1.41 | 2.7 | 13.6% | 71 |
| hadur117.nano.SanaroL20 0.1 | 2.9 | 13.0% | 63 |
| nic.Nicator 2.4 | 5.1 | 11.8% | 41 |
| ahf.NanoAndrew .4 | 5.5 | 11.2% | 35 |
| maribo.melee.BMV 0.1 | 7.0 | 9.1% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.4% | 2 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.0 | 55.6 | 4 / 35 | 3253 |
| 2 | 1 | 60.3 | 66.7 | 8 / 35 | 3735 |
| 3 | 1 | 61.1 | 71.7 | 4 / 35 | 4063 |
| 4 | 4 | 59.3 | 66.0 | 2 / 35 | 3639 |
| 5 | 3 | 59.2 | 66.3 | 7 / 35 | 3285 |
| 6 | 4 | 58.1 | 62.9 | 8 / 35 | 3328 |
| 7 | 4 | 57.9 | 61.0 | 6 / 35 | 3414 |
| 8 | 3 | 57.5 | 62.5 | 6 / 35 | 3220 |
| 9 | 1 | 63.3 | 74.6 | 12 / 35 | 4200 |
| 10 | 3 | 59.2 | 66.0 | 6 / 35 | 3575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 37 | 57% |
| cx.BlestPain 1.41 | 30 | 80% |
| et.Predator 1.8 | 28 | 21% |
| nic.Nicator 2.4 | 13 | 23% |
| ahf.NanoAndrew .4 | 12 | 58% |
| maribo.melee.BMV 0.1 | 1 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 74 | 26% | 81 |
| nic.Nicator 2.4 | 49 | 17% | 52 |
| oog.melee.Mercutio 1.0 | 48 | 17% | 67 |
| cx.BlestPain 1.41 | 45 | 16% | 70 |
| ahf.NanoAndrew .4 | 37 | 13% | 45 |
| maribo.melee.BMV 0.1 | 20 | 7% | 20 |
| tex.Longbot 0.4 | 9 | 3% | 9 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 1% | 4 |
| goblin.Bender 2.4 | 2 | 1% | 2 |

## Melee bench: F18

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 72.1 | 75 / 350 | 3.51 | 14.0% | 33512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.7 | 14.3% | 88 |
| hadur117.nano.SanaroL20 0.1 | 2.0 | 14.0% | 75 |
| agd.Mooserwirt2 2.7 | 2.7 | 12.7% | 68 |
| uji.DBH 1.1 | 4.5 | 11.1% | 30 |
| spinnercat.Robovirus 2.718 | 5.0 | 10.4% | 25 |
| ratosh.Nobo 0.21 | 5.5 | 10.1% | 11 |
| sigterm.Sigterm 1.0 | 6.6 | 9.1% | 26 |
| kawigi.mini.Fhqwhgads 1.1 | 8.6 | 6.6% | 8 |
| stelo.WangRobot 1.0 | 9.0 | 6.1% | 18 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.4 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.4 | 59.7 | 6 / 35 | 2900 |
| 2 | 1 | 62.9 | 79.0 | 9 / 35 | 3519 |
| 3 | 1 | 62.9 | 78.7 | 10 / 35 | 3469 |
| 4 | 1 | 60.6 | 73.3 | 8 / 35 | 3405 |
| 5 | 1 | 60.8 | 73.3 | 8 / 35 | 3451 |
| 6 | 2 | 60.6 | 70.8 | 10 / 35 | 3433 |
| 7 | 3 | 59.9 | 72.7 | 6 / 35 | 3071 |
| 8 | 1 | 61.2 | 74.9 | 5 / 35 | 3636 |
| 9 | 2 | 61.9 | 75.6 | 7 / 35 | 3662 |
| 10 | 4 | 56.6 | 62.5 | 6 / 35 | 2966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 51 | 37% |
| agd.Mooserwirt2 2.7 | 39 | 36% |
| uji.DBH 1.1 | 22 | 36% |
| spinnercat.Robovirus 2.718 | 21 | 71% |
| sigterm.Sigterm 1.0 | 17 | 47% |
| ratosh.Nobo 0.21 | 8 | 88% |
| stelo.WangRobot 1.0 | 6 | 33% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 40% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 0% |

Hadur died in 276 of 350 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 85 | 31% | 108 |
| agd.Mooserwirt2 2.7 | 52 | 19% | 66 |
| uji.DBH 1.1 | 38 | 14% | 45 |
| ratosh.Nobo 0.21 | 29 | 11% | 36 |
| spinnercat.Robovirus 2.718 | 27 | 10% | 39 |
| sigterm.Sigterm 1.0 | 18 | 7% | 24 |
| stelo.WangRobot 1.0 | 11 | 4% | 14 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 3% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8 | 3% | 8 |

## Melee bench: F19

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.9 | 92 / 350 | 2.72 | 15.9% | 40668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.5 | 16.8% | 121 |
| mld.Infinity 2.2 | 2.2 | 16.0% | 111 |
| hadur117.nano.SanaroL20 0.1 | 2.3 | 15.9% | 92 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 10.9% | 3 |
| erdnis.Rover 0.3 | 5.0 | 10.3% | 5 |
| patson.PatsonTestBot 1.0 | 5.7 | 8.8% | 6 |
| mbh.Mbh 0.1 | 7.5 | 7.2% | 0 |
| pac.ABC 2.1 | 7.8 | 7.0% | 12 |
| pbg.R2D2 1.0 | 8.7 | 6.1% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.9 | 77.5 | 11 / 35 | 4239 |
| 2 | 3 | 64.3 | 78.7 | 6 / 35 | 4038 |
| 3 | 3 | 65.7 | 85.1 | 8 / 35 | 3698 |
| 4 | 2 | 65.3 | 83.5 | 10 / 35 | 3509 |
| 5 | 1 | 67.2 | 85.7 | 13 / 35 | 4494 |
| 6 | 1 | 66.5 | 80.6 | 12 / 35 | 4797 |
| 7 | 3 | 63.8 | 74.6 | 6 / 35 | 4087 |
| 8 | 3 | 64.0 | 77.8 | 7 / 35 | 4046 |
| 9 | 2 | 65.9 | 83.2 | 12 / 35 | 3902 |
| 10 | 2 | 65.1 | 82.5 | 7 / 35 | 3858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 106 | 55% |
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 15% |
| erdnis.Rover 0.3 | 9 | 67% |
| patson.PatsonTestBot 1.0 | 6 | 50% |
| krillr.mini.JointStrike 2.0.0 | 6 | 100% |
| pbg.R2D2 1.0 | 5 | 100% |
| pac.ABC 2.1 | 4 | 0% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 258 of 350 rounds, at a mean tick of 1124. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 123 | 48% | 184 |
| mld.Infinity 2.2 | 66 | 26% | 26 |
| erdnis.Rover 0.3 | 21 | 8% | 33 |
| patson.PatsonTestBot 1.0 | 16 | 6% | 31 |
| krillr.mini.JointStrike 2.0.0 | 16 | 6% | 28 |
| pac.ABC 2.1 | 12 | 5% | 18 |
| pbg.R2D2 1.0 | 3 | 1% | 16 |
| mbh.Mbh 0.1 | 1 | 0% | 8 |

## Melee bench: F20

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 71.5 | 64 / 350 | 3.57 | 13.8% | 34747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 18.0% | 157 |
| hadur117.nano.SanaroL20 0.1 | 2.2 | 13.8% | 64 |
| fwb.Nine 1.0.1 | 3.5 | 11.6% | 46 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.5% | 20 |
| catcat20.Rabbit 0.001 | 4.7 | 10.4% | 29 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.8% | 11 |
| djdjdj.NanoSkunk10 1.0 | 6.9 | 8.4% | 7 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.8% | 14 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 74.9 | 7 / 35 | 3703 |
| 2 | 2 | 59.8 | 71.1 | 5 / 35 | 3014 |
| 3 | 2 | 60.5 | 70.8 | 7 / 35 | 3315 |
| 4 | 2 | 60.1 | 70.2 | 6 / 35 | 3196 |
| 5 | 2 | 62.6 | 74.0 | 12 / 35 | 3829 |
| 6 | 2 | 64.0 | 82.5 | 7 / 35 | 3780 |
| 7 | 2 | 58.9 | 67.6 | 4 / 35 | 3464 |
| 8 | 4 | 56.8 | 62.2 | 1 / 35 | 3411 |
| 9 | 2 | 60.0 | 69.8 | 7 / 35 | 3312 |
| 10 | 2 | 61.5 | 71.7 | 8 / 35 | 3723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 82 | 33% |
| fwb.Nine 1.0.1 | 28 | 50% |
| catcat20.Rabbit 0.001 | 25 | 64% |
| nz.jdc.nano.GridFu 1.0 | 11 | 27% |
| djdjdj.NanoSkunk10 1.0 | 5 | 20% |
| m3thos.mini.Eva01 0.5.5 | 3 | 33% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 50% |
| bayen.nut.Squirrel 1.615 | 1 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 135 | 47% | 149 |
| fwb.Nine 1.0.1 | 43 | 15% | 42 |
| nz.jdc.nano.GridFu 1.0 | 37 | 13% | 52 |
| catcat20.Rabbit 0.001 | 25 | 9% | 41 |
| bayen.nut.Squirrel 1.615 | 19 | 7% | 25 |
| m3thos.mini.Eva01 0.5.5 | 11 | 4% | 16 |
| djdjdj.NanoSkunk10 1.0 | 10 | 3% | 16 |
| ntc.ControlledChaos 1.1.4 | 5 | 2% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 3 |

## Melee bench: F21

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 81.3 | 132 / 350 | 2.68 | 16.5% | 43141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.4 | 17.3% | 146 |
| hadur117.nano.SanaroL20 0.1 | 1.7 | 16.5% | 132 |
| dummy.mini.Scimitar 1.01 | 2.9 | 14.5% | 20 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.4% | 28 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.8% | 6 |
| eld.Hmm 1.0 | 5.5 | 8.6% | 17 |
| fire219.CatBot 1.0 | 7.6 | 6.1% | 0 |
| el.JumpShoot 0.2 | 7.9 | 6.0% | 2 |
| PSW.Relentless 0.1 | 8.6 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 83.8 | 15 / 35 | 4202 |
| 2 | 2 | 65.3 | 77.5 | 13 / 35 | 4569 |
| 3 | 3 | 64.1 | 74.6 | 10 / 35 | 4256 |
| 4 | 1 | 65.3 | 81.9 | 15 / 35 | 4055 |
| 5 | 1 | 65.2 | 81.0 | 13 / 35 | 3925 |
| 6 | 2 | 65.9 | 80.6 | 14 / 35 | 4366 |
| 7 | 1 | 67.5 | 86.0 | 17 / 35 | 4309 |
| 8 | 2 | 65.7 | 82.9 | 11 / 35 | 4261 |
| 9 | 1 | 66.1 | 82.2 | 14 / 35 | 4596 |
| 10 | 2 | 65.8 | 82.5 | 10 / 35 | 4602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 135 | 48% |
| dummy.mini.Scimitar 1.01 | 41 | 90% |
| cf.RiO.RiOx 4.2.1 | 21 | 57% |
| eld.Hmm 1.0 | 14 | 57% |
| oa.weak.BotherBot 0.1 | 12 | 83% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 220 of 350 rounds, at a mean tick of 1161. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 104 | 47% | 150 |
| dummy.mini.Scimitar 1.01 | 44 | 20% | 90 |
| cf.RiO.RiOx 4.2.1 | 30 | 14% | 40 |
| eld.Hmm 1.0 | 11 | 5% | 26 |
| oa.weak.BotherBot 0.1 | 11 | 5% | 23 |
| el.JumpShoot 0.2 | 8 | 4% | 8 |
| fire219.CatBot 1.0 | 5 | 2% | 5 |
| PSW.Relentless 0.1 | 5 | 2% | 5 |
| arthord.MannyPacquiao Beta | 2 | 1% | 3 |

## Melee bench: F23

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 78.8 | 79 / 350 | 2.91 | 15.2% | 37063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 19.0% | 165 |
| hadur117.nano.SanaroL20 0.1 | 2.5 | 15.2% | 79 |
| cre.Karolos 0.32 | 2.5 | 14.4% | 67 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 11.3% | 20 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 9.2% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.2% | 0 |
| sample.Walls 1.0 | 6.7 | 8.7% | 3 |
| cw.megas.Blade 0.8 | 7.5 | 8.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 80.0 | 10 / 35 | 3907 |
| 2 | 2 | 67.0 | 86.7 | 13 / 35 | 4178 |
| 3 | 2 | 65.7 | 82.5 | 8 / 35 | 4090 |
| 4 | 3 | 63.3 | 75.2 | 7 / 35 | 3403 |
| 5 | 2 | 63.1 | 74.6 | 7 / 35 | 3754 |
| 6 | 3 | 64.2 | 79.7 | 7 / 35 | 3360 |
| 7 | 3 | 63.8 | 76.8 | 5 / 35 | 3341 |
| 8 | 2 | 64.5 | 79.0 | 8 / 35 | 3732 |
| 9 | 3 | 63.7 | 78.1 | 9 / 35 | 3290 |
| 10 | 3 | 63.8 | 74.9 | 5 / 35 | 4008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 114 | 30% |
| cre.Karolos 0.32 | 38 | 32% |
| sample.Walls 1.0 | 16 | 94% |
| stelo.AreaTargetingBot 1.1 | 12 | 50% |
| stelo.RamTrackSurfer 1.2 | 10 | 70% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |

Hadur died in 272 of 350 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 148 | 54% | 186 |
| cre.Karolos 0.32 | 61 | 22% | 75 |
| stelo.AreaTargetingBot 1.1 | 24 | 9% | 27 |
| stelo.RamTrackSurfer 1.2 | 15 | 6% | 26 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 11 | 4% | 18 |
| cw.megas.Blade 0.8 | 7 | 3% | 9 |
| sample.Walls 1.0 | 5 | 2% | 8 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.5 | 60.4 | 47 / 350 | 4.56 | 11.5% | 27008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.5 | 15.0% | 88 |
| davidalves.Phoenix 0.54 | 2.4 | 13.7% | 78 |
| florent.XSeries.X2 0.12 | 2.5 | 13.6% | 63 |
| pedersen.Ugluk 1.1.1 | 4.4 | 11.5% | 34 |
| hadur117.nano.SanaroL20 0.1 | 4.5 | 11.5% | 47 |
| oog.melee.Corsair 1.0 | 6.2 | 9.4% | 6 |
| stelo.SoJNanoMelee 1.1 | 6.6 | 8.7% | 30 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.6% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 5.4% | 2 |
| evd.X1 0.01 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.2 | 61.9 | 5 / 35 | 2843 |
| 2 | 4 | 57.5 | 64.8 | 6 / 35 | 2973 |
| 3 | 5 | 53.1 | 55.2 | 4 / 35 | 2457 |
| 4 | 4 | 56.3 | 63.2 | 4 / 35 | 2693 |
| 5 | 5 | 55.0 | 58.4 | 7 / 35 | 2606 |
| 6 | 5 | 56.0 | 60.6 | 6 / 35 | 2656 |
| 7 | 5 | 55.6 | 60.0 | 5 / 35 | 2859 |
| 8 | 4 | 54.6 | 59.0 | 5 / 35 | 2449 |
| 9 | 5 | 54.1 | 57.1 | 4 / 35 | 2572 |
| 10 | 4 | 56.6 | 64.1 | 1 / 35 | 2900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 25 | 60% |
| davidalves.Phoenix 0.54 | 25 | 40% |
| florent.XSeries.X2 0.12 | 21 | 43% |
| pedersen.Ugluk 1.1.1 | 16 | 56% |
| stelo.SoJNanoMelee 1.1 | 7 | 14% |
| oog.melee.Corsair 1.0 | 3 | 67% |
| as.FrankTheTank 1.3 | 2 | 50% |

Hadur died in 304 of 350 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 71 | 23% | 83 |
| florent.XSeries.X2 0.12 | 66 | 22% | 75 |
| davidalves.Phoenix 0.54 | 59 | 19% | 64 |
| pedersen.Ugluk 1.1.1 | 50 | 16% | 60 |
| oog.melee.Corsair 1.0 | 25 | 8% | 28 |
| stelo.SoJNanoMelee 1.1 | 16 | 5% | 18 |
| lunchie.Lunchbox 0.93 | 9 | 3% | 10 |
| as.FrankTheTank 1.3 | 4 | 1% | 8 |
| evd.X1 0.01 | 4 | 1% | 4 |

## Melee bench: F25

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 67.4 | 53 / 350 | 3.94 | 12.9% | 28250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.6 | 14.4% | 80 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.6% | 59 |
| hadur117.nano.SanaroL20 0.1 | 2.8 | 12.9% | 53 |
| jdw.Hurricane 1.4 | 4.3 | 11.5% | 44 |
| gre.svman4.Morfeas 1.4.1 | 4.8 | 11.2% | 45 |
| ds.Oo 2.2 | 6.2 | 9.1% | 25 |
| gjr.Cephalosporin 0.1 | 6.4 | 9.3% | 35 |
| adt.Ar2 1.1 | 8.4 | 6.8% | 5 |
| awesomeness.Elite 1.0 | 8.5 | 7.2% | 5 |
| amk.ChumbaMini 0.2 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.5 | 71.1 | 9 / 35 | 3231 |
| 2 | 4 | 56.3 | 63.5 | 3 / 35 | 2700 |
| 3 | 3 | 57.0 | 64.4 | 2 / 35 | 2832 |
| 4 | 3 | 59.7 | 70.5 | 6 / 35 | 2879 |
| 5 | 3 | 57.4 | 64.4 | 3 / 35 | 2867 |
| 6 | 2 | 59.2 | 71.7 | 6 / 35 | 2486 |
| 7 | 4 | 56.1 | 62.9 | 5 / 35 | 2509 |
| 8 | 1 | 61.8 | 74.9 | 10 / 35 | 3000 |
| 9 | 3 | 58.1 | 66.7 | 6 / 35 | 2708 |
| 10 | 4 | 57.1 | 63.5 | 3 / 35 | 3038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 46 | 22% |
| voidious.micro.BlitzBat 1.05 | 30 | 33% |
| jdw.Hurricane 1.4 | 23 | 70% |
| gre.svman4.Morfeas 1.4.1 | 20 | 45% |
| gjr.Cephalosporin 0.1 | 14 | 29% |
| ds.Oo 2.2 | 9 | 33% |
| adt.Ar2 1.1 | 2 | 0% |
| awesomeness.Elite 1.0 | 2 | 50% |

Hadur died in 298 of 350 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 82 | 28% | 92 |
| voidious.micro.BlitzBat 1.05 | 61 | 20% | 71 |
| jdw.Hurricane 1.4 | 45 | 15% | 59 |
| gre.svman4.Morfeas 1.4.1 | 26 | 9% | 33 |
| gjr.Cephalosporin 0.1 | 26 | 9% | 30 |
| ds.Oo 2.2 | 22 | 7% | 27 |
| adt.Ar2 1.1 | 20 | 7% | 20 |
| awesomeness.Elite 1.0 | 11 | 4% | 12 |
| amk.ChumbaMini 0.2 | 5 | 2% | 5 |

## Melee bench: F26

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 69.2 | 50 / 350 | 3.77 | 13.2% | 35989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.1 | 16.4% | 133 |
| hadur117.nano.SanaroL20 0.1 | 2.7 | 13.2% | 50 |
| shu.nitro.LENIN .T34 | 3.1 | 12.8% | 73 |
| lrem.Spectre 0.4.4 | 3.4 | 12.9% | 46 |
| js.PinBall 1.6 | 5.2 | 11.3% | 22 |
| gh.mini.GrubbmOne 1.0 | 5.5 | 11.2% | 20 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 8.9% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.4% | 2 |
| sample.SpinBot 1.0 | 8.9 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 73.3 | 4 / 35 | 3448 |
| 2 | 1 | 61.0 | 72.7 | 5 / 35 | 3759 |
| 3 | 3 | 59.4 | 67.9 | 5 / 35 | 3444 |
| 4 | 3 | 60.6 | 71.1 | 3 / 35 | 3865 |
| 5 | 4 | 59.4 | 67.0 | 3 / 35 | 3605 |
| 6 | 2 | 61.3 | 71.1 | 7 / 35 | 3660 |
| 7 | 2 | 62.0 | 74.3 | 10 / 35 | 3700 |
| 8 | 2 | 60.9 | 69.5 | 6 / 35 | 3636 |
| 9 | 4 | 58.0 | 62.5 | 4 / 35 | 3322 |
| 10 | 4 | 57.9 | 62.5 | 3 / 35 | 3550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 64 | 17% |
| shu.nitro.LENIN .T34 | 40 | 25% |
| lrem.Spectre 0.4.4 | 29 | 41% |
| js.PinBall 1.6 | 13 | 62% |
| gh.mini.GrubbmOne 1.0 | 8 | 25% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 60% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 100 | 33% | 112 |
| shu.nitro.LENIN .T34 | 58 | 19% | 69 |
| lrem.Spectre 0.4.4 | 47 | 16% | 56 |
| gh.mini.GrubbmOne 1.0 | 32 | 11% | 35 |
| js.PinBall 1.6 | 24 | 8% | 32 |
| fullsail.LaxativeTeaTwo 1.0 | 19 | 6% | 21 |
| jaybot.adv.bots.JayBot 2.0 | 17 | 6% | 20 |
| sample.SpinBot 1.0 | 3 | 1% | 5 |

## Melee bench: F27

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 71.4 | 73 / 350 | 3.58 | 13.3% | 27708 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.9 | 15.3% | 139 |
| hadur117.nano.SanaroL20 0.1 | 2.3 | 13.3% | 73 |
| sheldor.melee.nano.TestMelee 0.1 | 3.6 | 11.8% | 36 |
| wee.Gem 1.8.4 | 4.1 | 11.7% | 63 |
| EH.Eagle 1.0.6 | 4.4 | 10.5% | 13 |
| joe.ADinosaur 1.0 | 6.3 | 8.8% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 6.4 | 9.1% | 10 |
| throxbot.ThroxBot 0.1 | 7.4 | 8.2% | 7 |
| caimano.Furia_Ceca 0.22 | 8.7 | 7.2% | 7 |
| cs.Grudge 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.5 | 70.8 | 6 / 35 | 2661 |
| 2 | 2 | 58.4 | 69.5 | 6 / 35 | 2877 |
| 3 | 3 | 59.7 | 70.5 | 9 / 35 | 2996 |
| 4 | 2 | 61.4 | 77.5 | 10 / 35 | 2802 |
| 5 | 2 | 60.7 | 74.3 | 10 / 35 | 2929 |
| 6 | 3 | 58.0 | 68.6 | 5 / 35 | 2481 |
| 7 | 1 | 57.8 | 67.9 | 7 / 35 | 2888 |
| 8 | 2 | 60.4 | 73.3 | 9 / 35 | 2876 |
| 9 | 3 | 57.9 | 71.1 | 4 / 35 | 2409 |
| 10 | 2 | 59.0 | 70.2 | 7 / 35 | 2789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 67 | 46% |
| EH.Eagle 1.0.6 | 23 | 78% |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 29% |
| wee.Gem 1.8.4 | 19 | 37% |
| techdude.kombat.FlamingKombat 1.5 | 12 | 50% |
| caimano.Furia_Ceca 0.22 | 3 | 33% |
| throxbot.ThroxBot 0.1 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 279 of 350 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 95 | 34% | 125 |
| sheldor.melee.nano.TestMelee 0.1 | 48 | 17% | 54 |
| wee.Gem 1.8.4 | 40 | 14% | 48 |
| EH.Eagle 1.0.6 | 21 | 8% | 41 |
| joe.ADinosaur 1.0 | 21 | 8% | 24 |
| techdude.kombat.FlamingKombat 1.5 | 19 | 7% | 22 |
| caimano.Furia_Ceca 0.22 | 18 | 6% | 18 |
| throxbot.ThroxBot 0.1 | 16 | 6% | 16 |
| cs.Grudge 1.0 | 1 | 0% | 2 |

## Melee bench: F28

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 77.9 | 96 / 350 | 2.99 | 15.0% | 32856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 15.8% | 105 |
| hadur117.nano.SanaroL20 0.1 | 1.9 | 15.0% | 96 |
| uji.Antique 1.0 | 2.8 | 13.6% | 80 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.2% | 31 |
| pfvicm.Sobieski 7.2.3b | 5.1 | 9.9% | 9 |
| amk.ChumbaWumba 0.3 | 6.1 | 8.7% | 10 |
| ahr.ice.Ice 1.0.2 | 6.8 | 8.1% | 10 |
| matt.advanced.Katana 1.0 | 8.8 | 6.1% | 5 |
| stelo.Lifestealer 1.0 | 9.1 | 5.9% | 3 |
| stelo.PianistNano 1.2 | 9.1 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 81.6 | 8 / 35 | 3071 |
| 2 | 3 | 60.9 | 74.9 | 6 / 35 | 3006 |
| 3 | 2 | 62.3 | 75.6 | 12 / 35 | 3242 |
| 4 | 2 | 64.4 | 82.9 | 15 / 35 | 3302 |
| 5 | 1 | 62.4 | 81.9 | 8 / 35 | 2841 |
| 6 | 1 | 63.1 | 79.0 | 8 / 35 | 3800 |
| 7 | 2 | 64.4 | 80.0 | 12 / 35 | 3696 |
| 8 | 2 | 62.0 | 77.1 | 9 / 35 | 3276 |
| 9 | 3 | 58.6 | 65.4 | 7 / 35 | 3068 |
| 10 | 2 | 63.8 | 81.0 | 11 / 35 | 3554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 101 | 49% |
| uji.Antique 1.0 | 65 | 52% |
| qohnil.blot.BlotBot 3.61 | 13 | 23% |
| amk.ChumbaWumba 0.3 | 6 | 50% |
| matt.advanced.Katana 1.0 | 6 | 33% |
| ahr.ice.Ice 1.0.2 | 6 | 50% |
| pfvicm.Sobieski 7.2.3b | 5 | 0% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 254 of 350 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 82 | 32% | 117 |
| uji.Antique 1.0 | 62 | 24% | 94 |
| pfvicm.Sobieski 7.2.3b | 36 | 14% | 39 |
| qohnil.blot.BlotBot 3.61 | 28 | 11% | 34 |
| amk.ChumbaWumba 0.3 | 21 | 8% | 27 |
| ahr.ice.Ice 1.0.2 | 10 | 4% | 17 |
| stelo.Lifestealer 1.0 | 6 | 2% | 8 |
| stelo.PianistNano 1.2 | 5 | 2% | 7 |
| matt.advanced.Katana 1.0 | 4 | 2% | 6 |

## Melee bench: F29

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 65.7 | 46 / 350 | 4.09 | 12.9% | 32520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.3 | 16.1% | 125 |
| deewiant.Anomaly 0.2 | 1.7 | 15.4% | 101 |
| hadur117.nano.SanaroL20 0.1 | 3.6 | 12.9% | 46 |
| myl.micro.Troodon 1.10 | 3.7 | 12.8% | 26 |
| jok.PheonixM 0.1.2 | 4.7 | 11.3% | 20 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.3% | 3 |
| DBall.Anarchy 0.1 | 6.6 | 8.0% | 24 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.1 | 4.8% | 6 |
| jangs.ns51 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.8 | 67.3 | 5 / 35 | 3531 |
| 2 | 4 | 58.9 | 66.0 | 6 / 35 | 2998 |
| 3 | 3 | 59.9 | 65.7 | 5 / 35 | 3667 |
| 4 | 5 | 57.3 | 62.2 | 1 / 35 | 3256 |
| 5 | 3 | 60.9 | 70.5 | 5 / 35 | 3160 |
| 6 | 3 | 59.8 | 64.1 | 6 / 35 | 3464 |
| 7 | 4 | 56.4 | 61.6 | 4 / 35 | 2860 |
| 8 | 3 | 61.0 | 68.9 | 5 / 35 | 3522 |
| 9 | 3 | 59.4 | 66.0 | 4 / 35 | 3336 |
| 10 | 4 | 58.5 | 64.8 | 5 / 35 | 2726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 51 | 16% |
| zyx.mega.YersiniaPestis 3.1 | 42 | 50% |
| myl.micro.Troodon 1.10 | 18 | 50% |
| DBall.Anarchy 0.1 | 8 | 50% |
| jok.PheonixM 0.1.2 | 4 | 50% |
| ph.melee.ArcherME 0.3 | 1 | 0% |
| ap.Frederick 1.1 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 104 | 34% | 113 |
| zyx.mega.YersiniaPestis 3.1 | 72 | 24% | 92 |
| myl.micro.Troodon 1.10 | 47 | 15% | 54 |
| jok.PheonixM 0.1.2 | 44 | 14% | 47 |
| ph.melee.ArcherME 0.3 | 14 | 5% | 15 |
| DBall.Anarchy 0.1 | 10 | 3% | 14 |
| fullsail.TimbotNoPrediction 1.0 | 8 | 3% | 8 |
| jangs.ns51 1.0 | 5 | 2% | 6 |
2 death(s) with no robot to name.

## Melee bench: F30

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.7 | 53.6 | 21 / 350 | 5.17 | 10.2% | 26020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 2.0 | 14.2% | 88 |
| catcat20.Matcha 0.006 | 2.4 | 14.1% | 91 |
| stelo.PastFuture 2.3.2 | 2.5 | 13.7% | 58 |
| oog.melee.Capulet 1.2 | 3.1 | 13.6% | 68 |
| hadur117.nano.SanaroL20 0.1 | 5.3 | 10.2% | 21 |
| intruder.PrairieWolf 2.61 | 5.9 | 9.3% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.6% | 6 |
| tripphippy.Alice 1.1 | 7.9 | 7.3% | 4 |
| ntc.Opposite 1.5 | 8.1 | 7.7% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.3 | 54.3 | 1 / 35 | 2438 |
| 2 | 6 | 49.7 | 48.9 | 2 / 35 | 2075 |
| 3 | 5 | 54.9 | 60.6 | 3 / 35 | 2491 |
| 4 | 5 | 55.7 | 59.0 | 3 / 35 | 2936 |
| 5 | 5 | 51.4 | 49.5 | 1 / 35 | 2591 |
| 6 | 5 | 53.4 | 55.2 | 1 / 35 | 2574 |
| 7 | 6 | 48.3 | 44.4 | 0 / 35 | 2631 |
| 8 | 5 | 55.0 | 58.7 | 5 / 35 | 2434 |
| 9 | 5 | 54.7 | 55.9 | 4 / 35 | 2955 |
| 10 | 6 | 51.6 | 49.5 | 1 / 35 | 2895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 21 | 24% |
| catcat20.Matcha 0.006 | 16 | 25% |
| stelo.PastFuture 2.3.2 | 9 | 67% |
| oog.melee.Capulet 1.2 | 8 | 25% |
| intruder.PrairieWolf 2.61 | 5 | 60% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |
| tripphippy.Alice 1.1 | 1 | 0% |

Hadur died in 329 of 350 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 65 | 20% | 71 |
| darkcanuck.B26354 1.06 | 65 | 20% | 70 |
| catcat20.Matcha 0.006 | 57 | 17% | 61 |
| oog.melee.Capulet 1.2 | 50 | 15% | 53 |
| ntc.Opposite 1.5 | 28 | 9% | 28 |
| fowl3628800.LightningBolt 2.6.0 | 27 | 8% | 27 |
| tripphippy.Alice 1.1 | 17 | 5% | 17 |
| intruder.PrairieWolf 2.61 | 16 | 5% | 19 |
| GarmBox.Anger 1.0 | 4 | 1% | 4 |

## Melee bench: F31

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.5 | 57.9 | 18 / 350 | 4.79 | 10.9% | 26283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 186 |
| gh.mini.Griezel 0.2 | 2.4 | 13.6% | 83 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 12.7% | 27 |
| d414.nano.Quantum 1.0.0 | 4.1 | 11.8% | 20 |
| hadur117.nano.SanaroL20 0.1 | 4.7 | 10.9% | 18 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.0% | 9 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.4% | 7 |
| fm.mammillarias 1.3 | 8.0 | 6.4% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.3% | 1 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 64.1 | 2 / 35 | 2754 |
| 2 | 5 | 53.3 | 57.1 | 2 / 35 | 2356 |
| 3 | 5 | 56.0 | 60.0 | 2 / 35 | 2758 |
| 4 | 4 | 53.6 | 55.6 | 1 / 35 | 2681 |
| 5 | 5 | 54.8 | 58.7 | 2 / 35 | 2863 |
| 6 | 5 | 52.0 | 52.1 | 1 / 35 | 2569 |
| 7 | 5 | 52.4 | 53.7 | 2 / 35 | 2273 |
| 8 | 4 | 55.3 | 58.7 | 4 / 35 | 2592 |
| 9 | 5 | 55.5 | 59.0 | 2 / 35 | 2813 |
| 10 | 5 | 54.8 | 60.0 | 0 / 35 | 2624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 34 | 26% |
| gh.mini.Griezel 0.2 | 29 | 7% |
| d414.nano.Quantum 1.0.0 | 8 | 0% |
| spinnercat.micro.Tyger 0.1 | 7 | 14% |
| gh.nano.Grofvuil 0.2 | 7 | 71% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 332 of 350 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 75 | 23% | 81 |
| gh.mini.Griezel 0.2 | 72 | 22% | 74 |
| d414.nano.Quantum 1.0.0 | 60 | 18% | 62 |
| spinnercat.micro.Tyger 0.1 | 55 | 17% | 56 |
| gh.nano.Grofvuil 0.2 | 21 | 6% | 26 |
| timmit.nano.TimDog 0.33 | 21 | 6% | 22 |
| fm.mammillarias 1.3 | 16 | 5% | 16 |
| Gecko.ultimateGeckoBot 1.0 | 10 | 3% | 10 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 72.3 | 85 / 350 | 3.49 | 13.9% | 32735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.1 | 15.3% | 115 |
| hadur117.nano.SanaroL20 0.1 | 2.2 | 13.9% | 85 |
| apc.botM 3.0 | 2.9 | 12.8% | 67 |
| lxx.ConceptA 0.8 | 4.3 | 11.0% | 10 |
| vjik.UnViolation 1.1 | 4.7 | 10.6% | 31 |
| bayen.UbaMicro 1.4 | 5.8 | 9.5% | 12 |
| panzer.Panzer 0.2 | 7.6 | 7.7% | 2 |
| yk.JahMicro 1.0 | 7.8 | 7.4% | 15 |
| conscience.Electron 1.3g | 8.9 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.5% | 14 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 70.5 | 5 / 35 | 3639 |
| 2 | 2 | 59.3 | 71.1 | 8 / 35 | 2949 |
| 3 | 3 | 58.0 | 65.7 | 6 / 35 | 3228 |
| 4 | 2 | 61.1 | 74.6 | 12 / 35 | 3190 |
| 5 | 2 | 61.7 | 76.2 | 12 / 35 | 3239 |
| 6 | 2 | 60.1 | 73.3 | 9 / 35 | 2874 |
| 7 | 2 | 61.3 | 73.3 | 8 / 35 | 3662 |
| 8 | 2 | 60.0 | 72.4 | 10 / 35 | 3170 |
| 9 | 2 | 61.7 | 76.2 | 9 / 35 | 3558 |
| 10 | 2 | 58.9 | 69.5 | 6 / 35 | 3226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 36% |
| apc.botM 3.0 | 40 | 50% |
| vjik.UnViolation 1.1 | 18 | 56% |
| lxx.ConceptA 0.8 | 15 | 93% |
| donjezza.Jezza 1.0 | 6 | 17% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| yk.JahMicro 1.0 | 4 | 50% |
| panzer.Panzer 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 266 of 350 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 30% | 112 |
| lxx.ConceptA 0.8 | 49 | 18% | 57 |
| apc.botM 3.0 | 44 | 17% | 69 |
| vjik.UnViolation 1.1 | 29 | 11% | 42 |
| bayen.UbaMicro 1.4 | 24 | 9% | 25 |
| conscience.Electron 1.3g | 11 | 4% | 12 |
| panzer.Panzer 0.2 | 11 | 4% | 11 |
| yk.JahMicro 1.0 | 10 | 4% | 12 |
| donjezza.Jezza 1.0 | 7 | 3% | 9 |

## Melee bench: F33

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 66.0 | 47 / 350 | 4.06 | 13.1% | 34879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.3% | 155 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.6% | 54 |
| hadur117.nano.SanaroL20 0.1 | 2.8 | 13.1% | 47 |
| labg.Cataclysm 2.05 | 4.2 | 11.5% | 46 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.9% | 37 |
| baal.nano.N 1.42 | 6.3 | 9.0% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.0% | 6 |
| zyx.micro.Ant 1.1 | 8.5 | 5.2% | 0 |
| sanja.First 0.1 | 9.0 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 62.9 | 5 / 35 | 3285 |
| 2 | 2 | 62.3 | 72.7 | 8 / 35 | 3733 |
| 3 | 2 | 60.3 | 67.6 | 6 / 35 | 3521 |
| 4 | 3 | 58.6 | 64.1 | 2 / 35 | 3228 |
| 5 | 2 | 59.0 | 66.3 | 2 / 35 | 3204 |
| 6 | 3 | 60.2 | 67.3 | 6 / 35 | 3501 |
| 7 | 4 | 58.9 | 62.2 | 4 / 35 | 3485 |
| 8 | 4 | 58.5 | 62.2 | 5 / 35 | 3600 |
| 9 | 3 | 58.8 | 63.2 | 3 / 35 | 3623 |
| 10 | 2 | 61.5 | 71.1 | 6 / 35 | 3699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 55 | 31% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 45% |
| gre.svman4.Leonidas 1.3.2 | 24 | 46% |
| labg.Cataclysm 2.05 | 12 | 25% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 20% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 303 of 350 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 111 | 37% | 132 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 58 | 19% | 71 |
| gre.svman4.Leonidas 1.3.2 | 54 | 18% | 56 |
| labg.Cataclysm 2.05 | 33 | 11% | 38 |
| kinsen.melee.Angsaichmophobia 1.8c | 19 | 6% | 19 |
| baal.nano.N 1.42 | 17 | 6% | 20 |
| zyx.micro.Ant 1.1 | 7 | 2% | 7 |
| sanja.First 0.1 | 3 | 1% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 0% | 2 |

## Melee bench: F34

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 70.7 | 49 / 350 | 3.64 | 13.7% | 37518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.4 | 17.4% | 132 |
| kid.Gladiator .7.2 | 1.6 | 17.7% | 129 |
| hadur117.nano.SanaroL20 0.1 | 3.1 | 13.7% | 49 |
| jcs.Seth 1.8 | 4.6 | 11.3% | 20 |
| tcf.Reach 3 | 4.7 | 10.9% | 14 |
| cli.Dancer 1.1 | 5.6 | 9.9% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 4 |
| amk.Punbot.Punbot 0.01 | 8.1 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 68.3 | 3 / 35 | 3345 |
| 2 | 3 | 62.1 | 71.7 | 6 / 35 | 3492 |
| 3 | 3 | 61.6 | 67.3 | 7 / 35 | 4109 |
| 4 | 3 | 60.3 | 64.8 | 4 / 35 | 3784 |
| 5 | 3 | 62.5 | 76.2 | 4 / 35 | 3628 |
| 6 | 3 | 64.1 | 76.8 | 6 / 35 | 3948 |
| 7 | 3 | 63.0 | 74.9 | 4 / 35 | 4310 |
| 8 | 4 | 59.2 | 63.2 | 5 / 35 | 3669 |
| 9 | 3 | 62.4 | 72.1 | 7 / 35 | 3718 |
| 10 | 3 | 61.9 | 71.7 | 3 / 35 | 3515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 58 | 10% |
| stelo.Spread 0.9 | 53 | 57% |
| jcs.Seth 1.8 | 15 | 67% |
| tcf.Reach 3 | 4 | 25% |
| cli.Dancer 1.1 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 132 | 44% | 135 |
| stelo.Spread 0.9 | 86 | 28% | 116 |
| tcf.Reach 3 | 33 | 11% | 35 |
| jcs.Seth 1.8 | 20 | 7% | 30 |
| cli.Dancer 1.1 | 17 | 6% | 19 |
| ratosh.Wesco 1.4 | 13 | 4% | 13 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 66.8 | 19 / 350 | 3.99 | 12.2% | 27177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.3% | 257 |
| gh.mini.Gruwel 0.9 | 2.6 | 13.6% | 39 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.7 | 12.4% | 20 |
| rz.HawkOnFire 0.1 | 3.8 | 12.4% | 13 |
| hadur117.nano.SanaroL20 0.1 | 3.9 | 12.2% | 19 |
| wit.Chuliath 1.0 | 6.7 | 6.9% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.1 | 5.0% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 67.9 | 2 / 35 | 2698 |
| 2 | 3 | 58.0 | 69.5 | 1 / 35 | 2594 |
| 3 | 5 | 55.0 | 57.8 | 0 / 35 | 2633 |
| 4 | 5 | 59.4 | 69.8 | 1 / 35 | 2886 |
| 5 | 2 | 61.6 | 75.6 | 4 / 35 | 3036 |
| 6 | 3 | 58.1 | 66.7 | 2 / 35 | 2764 |
| 7 | 4 | 58.0 | 63.8 | 4 / 35 | 2732 |
| 8 | 4 | 58.3 | 67.9 | 1 / 35 | 2653 |
| 9 | 4 | 57.1 | 61.9 | 2 / 35 | 2710 |
| 10 | 5 | 57.7 | 67.3 | 2 / 35 | 2471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 57 | 9% |
| gh.mini.Gruwel 0.9 | 17 | 12% |
| rz.HawkOnFire 0.1 | 14 | 50% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 50% |

Hadur died in 331 of 350 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 121 | 37% | 126 |
| gh.mini.Gruwel 0.9 | 62 | 19% | 67 |
| rz.HawkOnFire 0.1 | 58 | 18% | 64 |
| dmh.robocode.robot.BlackDeath 9.2 | 53 | 16% | 56 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 13 | 4% | 13 |
| stelo.MyAgileRobot 0.2 | 8 | 2% | 8 |
| myl.nano.KomoriNinja 1.1 | 7 | 2% | 7 |
| wit.Chuliath 1.0 | 5 | 2% | 5 |
| dans.Cinnamon 1.2 | 4 | 1% | 4 |

## Melee bench: F36

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 70.3 | 96 / 350 | 3.67 | 14.1% | 35023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroL20 0.1 | 1.4 | 14.1% | 96 |
| bzdp.Pansy 2.1 | 2.4 | 12.9% | 59 |
| alpha.RainingFire 1.0 | 2.8 | 12.6% | 58 |
| mz.Cork 0.1 | 4.3 | 11.2% | 36 |
| bvh.micro.Freya 0.3 | 4.7 | 11.0% | 33 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.7% | 12 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.8% | 26 |
| squidM.TentalceMeleeNano 1.1 | 8.4 | 6.9% | 3 |
| dl.BetterWalls 1.0 | 8.7 | 7.1% | 7 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.6% | 20 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 74.0 | 12 / 35 | 3756 |
| 2 | 1 | 61.4 | 71.1 | 12 / 35 | 3665 |
| 3 | 1 | 61.3 | 71.7 | 9 / 35 | 3817 |
| 4 | 2 | 59.9 | 70.5 | 7 / 35 | 3377 |
| 5 | 1 | 61.4 | 72.1 | 12 / 35 | 3395 |
| 6 | 1 | 60.2 | 68.3 | 13 / 35 | 3253 |
| 7 | 1 | 62.1 | 72.4 | 11 / 35 | 3822 |
| 8 | 1 | 60.1 | 71.4 | 6 / 35 | 3348 |
| 9 | 3 | 57.2 | 63.8 | 5 / 35 | 3238 |
| 10 | 2 | 59.5 | 67.9 | 9 / 35 | 3352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 40 | 48% |
| alpha.RainingFire 1.0 | 31 | 61% |
| bvh.micro.Freya 0.3 | 27 | 63% |
| mz.Cork 0.1 | 26 | 69% |
| bvh.mini.Fenrir 0.39 | 15 | 73% |
| m3thos.Eva02 0.7.1 | 10 | 60% |
| sample.MyFirstRobot 1.0 | 8 | 13% |
| dl.BetterWalls 1.0 | 3 | 67% |
| squidM.TentalceMeleeNano 1.1 | 3 | 67% |

Hadur died in 254 of 350 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 53 | 21% | 82 |
| alpha.RainingFire 1.0 | 49 | 19% | 63 |
| bvh.mini.Fenrir 0.39 | 37 | 15% | 42 |
| bvh.micro.Freya 0.3 | 35 | 14% | 46 |
| mz.Cork 0.1 | 27 | 11% | 47 |
| m3thos.Eva02 0.7.1 | 17 | 7% | 25 |
| squidM.TentalceMeleeNano 1.1 | 16 | 6% | 20 |
| sample.MyFirstRobot 1.0 | 11 | 4% | 12 |
| dl.BetterWalls 1.0 | 9 | 4% | 13 |

## Melee bench: F37

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 76.4 | 115 / 350 | 3.13 | 15.1% | 42801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroL20 0.1 | 1.0 | 15.1% | 115 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 11.2% | 29 |
| germ.TheMind .2 | 3.1 | 11.4% | 51 |
| agrach.Dalek 1.0 | 4.3 | 10.3% | 37 |
| EBBU.Sim2 1.02 | 5.0 | 10.0% | 26 |
| stelo.UntouchableNano 1.3 | 6.4 | 9.1% | 30 |
| mb.Beast 0.1 | 7.4 | 8.6% | 24 |
| skm.Ryubot 1.0 | 8.0 | 8.2% | 25 |
| lmk.ACPFinal 0.1 | 8.3 | 8.2% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 8.5 | 7.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 58.3 | 67.6 | 10 / 35 | 3855 |
| 2 | 1 | 64.9 | 85.1 | 17 / 35 | 4522 |
| 3 | 1 | 62.0 | 77.5 | 7 / 35 | 4544 |
| 4 | 1 | 61.8 | 75.6 | 12 / 35 | 4240 |
| 5 | 1 | 64.9 | 86.7 | 16 / 35 | 4310 |
| 6 | 1 | 62.5 | 77.5 | 12 / 35 | 4419 |
| 7 | 1 | 59.4 | 70.5 | 9 / 35 | 3905 |
| 8 | 1 | 60.1 | 73.0 | 7 / 35 | 4232 |
| 9 | 1 | 60.5 | 71.7 | 10 / 35 | 4480 |
| 10 | 1 | 63.0 | 78.7 | 15 / 35 | 4294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 33 | 67% |
| EBBU.Sim2 1.02 | 32 | 56% |
| germ.TheMind .2 | 31 | 48% |
| skm.Ryubot 1.0 | 25 | 40% |
| mb.Beast 0.1 | 20 | 75% |
| stelo.UntouchableNano 1.3 | 20 | 60% |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 68% |
| lmk.ACPFinal 0.1 | 12 | 67% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 241 of 350 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 54 | 22% | 66 |
| agrach.Dalek 1.0 | 33 | 14% | 67 |
| EBBU.Sim2 1.02 | 32 | 13% | 41 |
| lmk.ACPFinal 0.1 | 24 | 10% | 30 |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 10% | 38 |
| skm.Ryubot 1.0 | 22 | 9% | 29 |
| stelo.UntouchableNano 1.3 | 19 | 8% | 26 |
| mb.Beast 0.1 | 18 | 7% | 35 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 6% | 17 |
1 death(s) with no robot to name.

## Melee bench: F38

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 65.1 | 41 / 350 | 4.14 | 12.2% | 29934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.3% | 167 |
| bvh.mini.Freya 0.55 | 2.6 | 12.9% | 45 |
| hadur117.nano.SanaroL20 0.1 | 3.6 | 12.2% | 41 |
| cs.Wren 1.0 | 4.3 | 11.3% | 27 |
| bts.mega.Gnarly 1.4 | 4.4 | 11.5% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 10.6% | 19 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.3% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.1% | 6 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.4% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 73.0 | 6 / 35 | 3474 |
| 2 | 3 | 60.0 | 70.8 | 4 / 35 | 3224 |
| 3 | 6 | 54.6 | 56.8 | 2 / 35 | 2648 |
| 4 | 4 | 56.7 | 63.5 | 3 / 35 | 2930 |
| 5 | 3 | 58.3 | 66.3 | 5 / 35 | 3165 |
| 6 | 3 | 57.1 | 61.9 | 5 / 35 | 3348 |
| 7 | 2 | 58.7 | 67.6 | 4 / 35 | 3202 |
| 8 | 4 | 57.7 | 66.3 | 5 / 35 | 2550 |
| 9 | 5 | 55.4 | 61.3 | 4 / 35 | 2672 |
| 10 | 4 | 55.9 | 63.5 | 3 / 35 | 2721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 58 | 45% |
| cs.Wren 1.0 | 12 | 17% |
| bts.mega.Gnarly 1.4 | 11 | 27% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 0% |
| bvh.mini.Freya 0.55 | 8 | 38% |
| kdf.KoulDestroyer 1.0 | 8 | 50% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |

Hadur died in 310 of 350 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 94 | 30% | 122 |
| bvh.mini.Freya 0.55 | 58 | 19% | 59 |
| cs.Wren 1.0 | 44 | 14% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 12% | 37 |
| bts.mega.Gnarly 1.4 | 34 | 11% | 36 |
| kdf.KoulDestroyer 1.0 | 26 | 8% | 28 |
| kawigi.spare.SpareParts 0.7.6nosnd | 9 | 3% | 11 |
| bzdp.BoxCar 2.0 | 5 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 4 | 1% | 4 |

## Melee bench: F39

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 62.5 | 44 / 350 | 4.37 | 11.9% | 30881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.8% | 76 |
| az.Ololobot 0.2.4 | 1.9 | 13.9% | 117 |
| catcat20.Lambda 0.024 | 3.4 | 11.9% | 51 |
| hadur117.nano.SanaroL20 0.1 | 3.6 | 11.9% | 44 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.4% | 38 |
| apollokidd.ApolloKidd 0.9 | 6.4 | 8.6% | 5 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 8.6% | 13 |
| gimp.GimpBot 0.1 | 7.3 | 8.1% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.4% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.1 | 50.8 | 3 / 35 | 2757 |
| 2 | 3 | 58.5 | 68.6 | 4 / 35 | 3393 |
| 3 | 4 | 58.5 | 67.3 | 3 / 35 | 3615 |
| 4 | 3 | 58.1 | 67.9 | 6 / 35 | 3161 |
| 5 | 3 | 58.8 | 69.8 | 6 / 35 | 3254 |
| 6 | 3 | 54.5 | 58.4 | 5 / 35 | 2906 |
| 7 | 4 | 55.6 | 60.3 | 5 / 35 | 2996 |
| 8 | 3 | 57.6 | 66.0 | 4 / 35 | 3305 |
| 9 | 4 | 53.1 | 57.5 | 5 / 35 | 2511 |
| 10 | 4 | 54.4 | 58.7 | 3 / 35 | 2983 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 47 | 15% |
| bvh.fry.Freya 0.82 | 29 | 41% |
| catcat20.Lambda 0.024 | 21 | 57% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 62% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| gimp.GimpBot 0.1 | 3 | 33% |
| apollokidd.ApolloKidd 0.9 | 3 | 33% |

Hadur died in 307 of 350 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 101 | 33% | 116 |
| az.Ololobot 0.2.4 | 61 | 20% | 66 |
| catcat20.Lambda 0.024 | 43 | 14% | 53 |
| stelo.SoRobotNanoMelee 1.2 | 33 | 11% | 35 |
| apollokidd.ApolloKidd 0.9 | 32 | 10% | 35 |
| gimp.GimpBot 0.1 | 16 | 5% | 20 |
| winamp32.micro.MicroMacro 1.0 | 14 | 5% | 17 |
| whitesquare.robots.SkynetAdvanced 1.1 | 5 | 2% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 3 |

## Melee bench: F41

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 66.3 | 53 / 350 | 4.03 | 12.6% | 29264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.1% | 154 |
| lessonz.robocode.Oz 0.5.0 | 2.5 | 13.8% | 57 |
| ary.Swarm 1.1 | 3.0 | 13.6% | 31 |
| hadur117.nano.SanaroL20 0.1 | 4.0 | 12.6% | 53 |
| simonton.nano.MeleeSeed 1.8 | 4.6 | 11.3% | 36 |
| shrub.Silver v048 | 5.9 | 9.3% | 7 |
| zyx.nano.Ant 1.1 | 7.0 | 7.9% | 3 |
| jsal.Jsalbot 1.0 | 8.4 | 6.0% | 7 |
| stelo.Mirror 1.1 | 8.6 | 5.9% | 3 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 63.5 | 4 / 35 | 2878 |
| 2 | 5 | 57.0 | 61.6 | 4 / 35 | 2762 |
| 3 | 4 | 58.4 | 65.4 | 3 / 35 | 2862 |
| 4 | 5 | 57.6 | 65.7 | 5 / 35 | 2529 |
| 5 | 4 | 56.7 | 61.9 | 3 / 35 | 3007 |
| 6 | 3 | 61.2 | 70.5 | 8 / 35 | 3159 |
| 7 | 3 | 60.7 | 72.1 | 7 / 35 | 3117 |
| 8 | 4 | 57.3 | 61.9 | 5 / 35 | 3008 |
| 9 | 4 | 59.5 | 67.6 | 8 / 35 | 3019 |
| 10 | 4 | 61.0 | 73.0 | 6 / 35 | 2923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 64 | 44% |
| lessonz.robocode.Oz 0.5.0 | 21 | 33% |
| simonton.nano.MeleeSeed 1.8 | 12 | 67% |
| ary.Swarm 1.1 | 11 | 64% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| stelo.Mirror 1.1 | 1 | 0% |
| shrub.Silver v048 | 1 | 0% |

Hadur died in 297 of 350 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 89 | 30% | 113 |
| ary.Swarm 1.1 | 75 | 25% | 84 |
| lessonz.robocode.Oz 0.5.0 | 47 | 16% | 50 |
| simonton.nano.MeleeSeed 1.8 | 29 | 10% | 39 |
| shrub.Silver v048 | 22 | 7% | 23 |
| zyx.nano.Ant 1.1 | 21 | 7% | 21 |
| stelo.Mirror 1.1 | 6 | 2% | 7 |
| acogdev.alpha 0.2 | 6 | 2% | 6 |
| jsal.Jsalbot 1.0 | 2 | 1% | 5 |

## Melee bench: F42

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 70.3 | 50 / 350 | 3.67 | 13.4% | 34619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.6% | 174 |
| maribo.mini.MiniQuester 0.1 | 2.9 | 14.0% | 45 |
| ara.Shera 0.88 | 3.0 | 13.7% | 63 |
| hadur117.nano.SanaroL20 0.1 | 3.1 | 13.4% | 50 |
| amz.NanoClone 1.41 | 5.5 | 9.3% | 3 |
| maribo.IotaCT 1.1 | 6.1 | 7.9% | 3 |
| dsw.StaticD 1.0 | 6.5 | 7.7% | 11 |
| stelo.MirrorMicro 1.0 | 8.6 | 5.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.1 | 5.3% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 74.0 | 7 / 35 | 3574 |
| 2 | 4 | 56.1 | 62.9 | 1 / 35 | 3019 |
| 3 | 2 | 60.4 | 69.5 | 9 / 35 | 3590 |
| 4 | 3 | 60.0 | 68.9 | 4 / 35 | 3643 |
| 5 | 4 | 57.9 | 65.4 | 3 / 35 | 3261 |
| 6 | 2 | 62.8 | 77.8 | 6 / 35 | 3745 |
| 7 | 4 | 57.2 | 62.2 | 5 / 35 | 3394 |
| 8 | 4 | 59.9 | 72.7 | 3 / 35 | 3168 |
| 9 | 3 | 61.2 | 74.9 | 4 / 35 | 3428 |
| 10 | 2 | 62.2 | 74.9 | 8 / 35 | 3797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 81 | 26% |
| ara.Shera 0.88 | 34 | 32% |
| maribo.mini.MiniQuester 0.1 | 22 | 64% |
| dsw.StaticD 1.0 | 7 | 57% |
| maribo.IotaCT 1.1 | 2 | 0% |
| amz.NanoClone 1.41 | 1 | 0% |

Hadur died in 301 of 350 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 112 | 37% | 134 |
| ara.Shera 0.88 | 78 | 26% | 87 |
| maribo.mini.MiniQuester 0.1 | 58 | 19% | 72 |
| amz.NanoClone 1.41 | 17 | 6% | 17 |
| maribo.IotaCT 1.1 | 15 | 5% | 15 |
| dsw.StaticD 1.0 | 11 | 4% | 15 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 6 | 2% | 6 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 65.0 | 22 / 350 | 4.15 | 12.3% | 31387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.6% | 270 |
| brainfade.melee.Dusk 0.44 | 2.7 | 12.7% | 27 |
| hadur117.nano.SanaroL20 0.1 | 3.2 | 12.3% | 22 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.8% | 13 |
| wcsv.melee.EngineerMelee 0.1 | 4.4 | 11.4% | 10 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.9% | 7 |
| jab.DiamondStealer 5 | 7.2 | 7.7% | 2 |
| mz.NanoGod 2.02 | 7.7 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 72.4 | 3 / 35 | 3308 |
| 2 | 2 | 61.8 | 71.4 | 2 / 35 | 3191 |
| 3 | 5 | 57.8 | 60.3 | 1 / 35 | 3088 |
| 4 | 5 | 54.7 | 51.1 | 1 / 35 | 2973 |
| 5 | 3 | 60.7 | 68.3 | 2 / 35 | 3348 |
| 6 | 2 | 60.6 | 65.7 | 3 / 35 | 3594 |
| 7 | 3 | 59.5 | 64.4 | 2 / 35 | 3233 |
| 8 | 3 | 60.5 | 67.6 | 6 / 35 | 3046 |
| 9 | 4 | 58.5 | 63.5 | 0 / 35 | 2894 |
| 10 | 3 | 59.0 | 65.7 | 2 / 35 | 2712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 81 | 10% |
| brainfade.melee.Dusk 0.44 | 13 | 54% |
| dummy.micro.Sparrow 2.5 | 7 | 29% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 67% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 329 of 350 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 159 | 48% | 167 |
| brainfade.melee.Dusk 0.44 | 53 | 16% | 60 |
| dummy.micro.Sparrow 2.5 | 37 | 11% | 39 |
| wcsv.melee.EngineerMelee 0.1 | 33 | 10% | 35 |
| Krabb.akim2.Akim2 1.1b | 16 | 5% | 16 |
| mz.NanoGod 2.02 | 13 | 4% | 14 |
| jab.DiamondStealer 5 | 12 | 4% | 13 |
| cvt.Firsty 1.0 | 6 | 2% | 6 |

## Melee bench: F44

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 69.0 | 58 / 350 | 3.79 | 13.6% | 36109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 17.3% | 158 |
| tzu.TheArtOfWar 1.2 | 2.1 | 14.8% | 85 |
| hadur117.nano.SanaroL20 0.1 | 2.8 | 13.6% | 58 |
| jwirde.Gort 2.0 | 4.5 | 11.2% | 27 |
| wompi.Quokka 1.6 | 4.6 | 10.9% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 8.7% | 4 |
| disan.Chair 2.2.0 | 7.4 | 7.3% | 5 |
| stf.PanzerGeneral 0.1 | 7.6 | 6.7% | 1 |
| sample.Crazy 1.0 | 9.4 | 4.9% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.9 | 63.8 | 5 / 35 | 3147 |
| 2 | 2 | 62.0 | 74.6 | 6 / 35 | 3780 |
| 3 | 3 | 59.7 | 66.0 | 8 / 35 | 3327 |
| 4 | 3 | 60.2 | 68.6 | 4 / 35 | 3675 |
| 5 | 3 | 59.5 | 67.6 | 7 / 35 | 3285 |
| 6 | 3 | 61.0 | 67.9 | 7 / 35 | 3712 |
| 7 | 2 | 63.2 | 75.9 | 7 / 35 | 4063 |
| 8 | 3 | 60.2 | 69.2 | 4 / 35 | 3620 |
| 9 | 3 | 61.0 | 70.2 | 6 / 35 | 3553 |
| 10 | 3 | 60.2 | 66.0 | 4 / 35 | 3947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 79 | 32% |
| tzu.TheArtOfWar 1.2 | 35 | 31% |
| wompi.Quokka 1.6 | 12 | 75% |
| jwirde.Gort 2.0 | 10 | 70% |
| disan.Chair 2.2.0 | 6 | 67% |
| stf.PanzerGeneral 0.1 | 1 | 0% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 115 | 39% | 140 |
| tzu.TheArtOfWar 1.2 | 88 | 30% | 99 |
| jwirde.Gort 2.0 | 28 | 10% | 36 |
| wompi.Quokka 1.6 | 23 | 8% | 29 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 17 | 6% | 18 |
| disan.Chair 2.2.0 | 10 | 3% | 12 |
| amk.jointstrike.JointStrike 0.2 | 7 | 2% | 9 |
| stf.PanzerGeneral 0.1 | 6 | 2% | 6 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F45

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 68.1 | 55 / 350 | 3.87 | 13.8% | 36785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroL20 0.1 | 1.6 | 13.8% | 55 |
| eem.IWillFireNoBullet v2.8 | 2.1 | 13.0% | 183 |
| jje.BagPuss 1.2 | 2.8 | 12.6% | 29 |
| myl.nano.Graviton 1.10 | 4.1 | 11.4% | 17 |
| sul.Lunar 1.1 | 5.0 | 10.5% | 32 |
| hvilela.HVilela 0.9 | 6.4 | 9.6% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.8% | 6 |
| fm.claire 1.7 | 7.0 | 8.8% | 1 |
| wit.Deep7 2.0 | 9.0 | 6.7% | 23 |
| abud.ThirdRobo 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.3 | 60.3 | 4 / 35 | 3455 |
| 2 | 3 | 57.3 | 59.4 | 8 / 35 | 3452 |
| 3 | 3 | 56.8 | 61.9 | 3 / 35 | 3280 |
| 4 | 1 | 63.0 | 78.7 | 6 / 35 | 3872 |
| 5 | 1 | 63.1 | 75.9 | 8 / 35 | 4216 |
| 6 | 1 | 60.5 | 71.4 | 4 / 35 | 3618 |
| 7 | 1 | 59.8 | 67.3 | 4 / 35 | 3800 |
| 8 | 1 | 59.1 | 66.3 | 7 / 35 | 3330 |
| 9 | 1 | 57.6 | 63.8 | 4 / 35 | 3474 |
| 10 | 1 | 63.4 | 75.9 | 7 / 35 | 4288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 75 | 29% |
| sul.Lunar 1.1 | 19 | 68% |
| myl.nano.Graviton 1.10 | 15 | 40% |
| jje.BagPuss 1.2 | 13 | 31% |
| wit.Deep7 2.0 | 11 | 18% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 295 of 350 rounds, at a mean tick of 1182. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 67 | 23% | 0 |
| jje.BagPuss 1.2 | 59 | 20% | 87 |
| myl.nano.Graviton 1.10 | 43 | 15% | 64 |
| sul.Lunar 1.1 | 31 | 11% | 70 |
| fm.claire 1.7 | 26 | 9% | 34 |
| hvilela.HVilela 0.9 | 24 | 8% | 33 |
| pez.mini.ChironexFleckeri 0.5 | 21 | 7% | 24 |
| wit.Deep7 2.0 | 19 | 6% | 28 |
| abud.ThirdRobo 1.0 | 5 | 2% | 8 |

## Melee bench: F46

hadur117.nano.SanaroL20 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 69.9 | 28 / 350 | 3.71 | 12.5% | 27949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 18.2% | 148 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.3% | 150 |
| hadur117.nano.SanaroL20 0.1 | 3.0 | 12.5% | 28 |
| cx.Princess 1.0 | 4.9 | 10.2% | 17 |
| mz.MicroSheep 1.0 | 4.9 | 10.5% | 5 |
| sadoner.killer 0.2 | 5.2 | 9.4% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.9% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.2% | 0 |
| kurios.DOSexe .9a | 9.1 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 73.3 | 4 / 35 | 2601 |
| 2 | 3 | 60.3 | 72.1 | 3 / 35 | 3244 |
| 3 | 3 | 56.2 | 62.9 | 2 / 35 | 2673 |
| 4 | 3 | 55.8 | 62.2 | 1 / 35 | 2692 |
| 5 | 3 | 59.6 | 72.1 | 5 / 35 | 2830 |
| 6 | 3 | 59.1 | 70.2 | 3 / 35 | 2867 |
| 7 | 3 | 59.8 | 70.5 | 3 / 35 | 3058 |
| 8 | 3 | 59.4 | 71.1 | 3 / 35 | 2711 |
| 9 | 3 | 60.7 | 76.2 | 3 / 35 | 2819 |
| 10 | 3 | 57.7 | 68.9 | 1 / 35 | 2454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 65 | 22% |
| rsalesc.melee.Medina 0.4.5 | 38 | 24% |
| cx.Princess 1.0 | 8 | 25% |
| mz.MicroSheep 1.0 | 4 | 25% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 134 | 42% | 152 |
| rsalesc.melee.Medina 0.4.5 | 93 | 29% | 98 |
| mz.MicroSheep 1.0 | 25 | 8% | 26 |
| sadoner.killer 0.2 | 24 | 7% | 25 |
| cx.Princess 1.0 | 23 | 7% | 25 |
| arthord.NanoSatanMelee Beta | 16 | 5% | 17 |
| jeremyreeder.collective.Prophet 5 | 6 | 2% | 6 |
| kurios.DOSexe .9a | 1 | 0% | 1 |

