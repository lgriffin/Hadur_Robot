# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 76.6 | 40 / 350 | 3.11 | 14.1% | 36303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 247 |
| hadur117.nano.SanaroDAE 0.3 | 2.0 | 14.1% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.9 | 11.5% | 6 |
| sgp.JollyNinja 3.53 | 3.9 | 11.5% | 30 |
| mz.MicroGodMelee 1 | 4.4 | 11.3% | 17 |
| lorneswork.Predator 1.0 | 5.8 | 10.0% | 7 |
| adt.Ar2 1.0 | 7.0 | 7.5% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.7% | 2 |
| skm.butterfly 1.0 | 8.9 | 4.7% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 75.9 | 3 / 35 | 3267 |
| 2 | 2 | 62.4 | 77.5 | 5 / 35 | 3688 |
| 3 | 2 | 61.0 | 71.7 | 4 / 35 | 3741 |
| 4 | 2 | 63.6 | 79.0 | 4 / 35 | 4027 |
| 5 | 2 | 61.6 | 76.5 | 1 / 35 | 3564 |
| 6 | 2 | 62.1 | 78.4 | 4 / 35 | 3410 |
| 7 | 2 | 62.9 | 79.4 | 5 / 35 | 3802 |
| 8 | 2 | 60.3 | 72.7 | 3 / 35 | 3374 |
| 9 | 2 | 63.2 | 78.4 | 4 / 35 | 3902 |
| 10 | 2 | 61.9 | 76.2 | 7 / 35 | 3528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 143 | 8% |
| sgp.JollyNinja 3.53 | 23 | 48% |
| mz.MicroGodMelee 1 | 19 | 53% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 50% |
| lorneswork.Predator 1.0 | 6 | 50% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 311 of 350 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 172 | 55% | 184 |
| sgp.JollyNinja 3.53 | 42 | 14% | 50 |
| simonton.nano.WeekendObsession_Melee 1.0 | 36 | 12% | 38 |
| mz.MicroGodMelee 1 | 27 | 9% | 36 |
| lorneswork.Predator 1.0 | 21 | 7% | 24 |
| adt.Ar2 1.0 | 8 | 3% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 5 |
| skm.butterfly 1.0 | 2 | 1% | 3 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 68.1 | 65 / 350 | 3.87 | 13.8% | 38603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.8 | 14.2% | 93 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 14.0% | 74 |
| hadur117.nano.SanaroDAE 0.3 | 2.2 | 13.8% | 65 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 11.1% | 8 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.7% | 35 |
| Noran.BitchingElk 0.054 | 6.9 | 8.4% | 29 |
| sch.Simone 0.3d | 6.9 | 8.7% | 34 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.9% | 3 |
| stelo.PatternRobot 1.0 | 8.5 | 6.7% | 8 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 68.3 | 5 / 35 | 3883 |
| 2 | 2 | 61.5 | 68.6 | 10 / 35 | 4135 |
| 3 | 2 | 60.5 | 67.9 | 9 / 35 | 3939 |
| 4 | 3 | 57.5 | 61.9 | 3 / 35 | 3534 |
| 5 | 2 | 62.3 | 74.3 | 10 / 35 | 3869 |
| 6 | 2 | 60.8 | 70.8 | 6 / 35 | 3887 |
| 7 | 3 | 57.0 | 59.0 | 7 / 35 | 3621 |
| 8 | 3 | 57.3 | 60.6 | 4 / 35 | 3836 |
| 9 | 1 | 61.2 | 73.0 | 6 / 35 | 3735 |
| 10 | 1 | 62.9 | 76.5 | 5 / 35 | 4164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 53 | 38% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 38 | 47% |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 53% |
| sch.Simone 0.3d | 13 | 15% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 75% |
| Noran.BitchingElk 0.054 | 12 | 25% |
| stelo.PatternRobot 1.0 | 3 | 67% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 64 | 22% | 79 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 63 | 22% | 82 |
| lrem.micro.SpikeSoldier 0.4 | 34 | 12% | 40 |
| sch.Simone 0.3d | 34 | 12% | 35 |
| com.cohesiva.robocode.ManOwaR 1.0 | 32 | 11% | 45 |
| Noran.BitchingElk 0.054 | 20 | 7% | 22 |
| stelo.PatternRobot 1.0 | 18 | 6% | 21 |
| fullsail.SweetTea 1.1 | 14 | 5% | 14 |
| fnc.bandit.Bandit 5.2.0 | 7 | 2% | 11 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 78.5 | 79 / 350 | 2.93 | 14.9% | 39152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroDAE 0.3 | 2.0 | 14.9% | 79 |
| kawigi.nano.Lib 1.0 | 2.3 | 14.7% | 92 |
| radnor.DoctorBob 1.42 | 2.7 | 14.3% | 69 |
| vuen.Cake 2.51 | 3.0 | 13.9% | 90 |
| urdos.URDOS 1.3 | 5.0 | 10.3% | 15 |
| adt.Ar1 2.1 | 6.2 | 7.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 7.1% | 1 |
| oa.weak.FlyMk1 0.1 | 7.9 | 6.6% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.6% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 77.8 | 8 / 35 | 4190 |
| 2 | 2 | 62.0 | 76.8 | 7 / 35 | 3799 |
| 3 | 3 | 61.4 | 74.9 | 9 / 35 | 3731 |
| 4 | 2 | 62.8 | 81.0 | 6 / 35 | 4033 |
| 5 | 3 | 60.7 | 74.9 | 6 / 35 | 3562 |
| 6 | 2 | 63.8 | 83.5 | 8 / 35 | 4061 |
| 7 | 2 | 63.2 | 79.7 | 9 / 35 | 3946 |
| 8 | 2 | 62.0 | 75.6 | 5 / 35 | 4185 |
| 9 | 1 | 63.1 | 80.0 | 12 / 35 | 3746 |
| 10 | 1 | 63.4 | 81.0 | 9 / 35 | 3899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 58 | 57% |
| vuen.Cake 2.51 | 52 | 52% |
| kawigi.nano.Lib 1.0 | 42 | 0% |
| urdos.URDOS 1.3 | 19 | 68% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 67% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% |

Hadur died in 271 of 350 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 94 | 35% | 105 |
| radnor.DoctorBob 1.42 | 64 | 24% | 87 |
| vuen.Cake 2.51 | 43 | 16% | 70 |
| urdos.URDOS 1.3 | 38 | 14% | 48 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 3% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 8 | 3% | 11 |
| adt.Ar1 2.1 | 8 | 3% | 9 |
| oa.weak.FlyMk1 0.1 | 5 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 3 |

## Melee bench: F04

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 71.0 | 6 / 350 | 3.61 | 13.6% | 41749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.7% | 310 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 13.5% | 18 |
| hadur117.nano.SanaroDAE 0.3 | 2.6 | 13.6% | 6 |
| TNT.TNT 0.99.1 | 3.9 | 11.3% | 7 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 4 |
| css.Delitioner 0.11 | 6.5 | 7.6% | 2 |
| tj.zombie1n 1.0.1 | 6.6 | 7.2% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 79.7 | 1 / 35 | 3779 |
| 2 | 2 | 61.4 | 67.3 | 1 / 35 | 4508 |
| 3 | 3 | 61.1 | 69.2 | 1 / 35 | 3947 |
| 4 | 3 | 61.3 | 69.8 | 0 / 35 | 4098 |
| 5 | 3 | 60.4 | 66.3 | 0 / 35 | 4167 |
| 6 | 3 | 62.5 | 71.7 | 1 / 35 | 4329 |
| 7 | 3 | 60.7 | 67.3 | 0 / 35 | 4324 |
| 8 | 2 | 62.5 | 74.3 | 0 / 35 | 4362 |
| 9 | 2 | 61.7 | 71.7 | 1 / 35 | 4246 |
| 10 | 3 | 62.2 | 72.4 | 1 / 35 | 3989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 131 | 3% |
| apc.LeeroyJenkins2 1.0 | 7 | 14% |
| TNT.TNT 0.99.1 | 2 | 0% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 344 of 350 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 208 | 60% | 211 |
| apc.LeeroyJenkins2 1.0 | 50 | 15% | 52 |
| josago.Jorgito 0.16 | 44 | 13% | 44 |
| TNT.TNT 0.99.1 | 28 | 8% | 28 |
| css.Delitioner 0.11 | 5 | 1% | 6 |
| tj.zombie1n 1.0.1 | 4 | 1% | 4 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 68.8 | 65 / 350 | 3.81 | 13.5% | 34915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.5 | 15.5% | 82 |
| origin.SleepSiphon 1.7b | 1.9 | 14.8% | 114 |
| hadur117.nano.SanaroDAE 0.3 | 3.0 | 13.5% | 65 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.5% | 53 |
| mld.Wisdom 1.0 | 4.9 | 11.3% | 8 |
| gg.Wolverine 2.0 | 6.5 | 8.5% | 11 |
| spinnercat.Omen 1.0 | 7.1 | 7.5% | 5 |
| DBall.NUKE 0.1 | 7.9 | 6.8% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.3% | 7 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 67.3 | 4 / 35 | 3570 |
| 2 | 2 | 61.6 | 72.7 | 7 / 35 | 3627 |
| 3 | 3 | 59.8 | 67.9 | 5 / 35 | 3731 |
| 4 | 4 | 58.5 | 66.3 | 6 / 35 | 3164 |
| 5 | 2 | 62.0 | 74.0 | 8 / 35 | 3690 |
| 6 | 4 | 60.3 | 66.3 | 9 / 35 | 3651 |
| 7 | 3 | 60.6 | 69.8 | 7 / 35 | 3471 |
| 8 | 2 | 60.3 | 69.2 | 8 / 35 | 3397 |
| 9 | 3 | 61.2 | 71.4 | 8 / 35 | 3348 |
| 10 | 4 | 57.6 | 63.2 | 3 / 35 | 3266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 47 | 72% |
| origin.SleepSiphon 1.7b | 38 | 21% |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 38% |
| spinnercat.Omen 1.0 | 5 | 80% |
| gg.Wolverine 2.0 | 4 | 50% |
| mld.Wisdom 1.0 | 4 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 89 | 31% | 101 |
| jekl.StoneGhost 0.7 | 80 | 28% | 111 |
| pe.minimelee.SandboxMiniMelee 1.1 | 53 | 19% | 63 |
| mld.Wisdom 1.0 | 27 | 9% | 29 |
| spinnercat.Omen 1.0 | 12 | 4% | 15 |
| DBall.NUKE 0.1 | 10 | 4% | 12 |
| gg.Wolverine 2.0 | 8 | 3% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 2% | 9 |

## Melee bench: F07

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.9 | 58 / 350 | 2.81 | 15.8% | 46562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.5 | 18.2% | 114 |
| rsalesc.melee.Monk 0.3.6c | 1.7 | 17.6% | 87 |
| hadur117.nano.SanaroDAE 0.3 | 2.8 | 15.8% | 58 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.7% | 29 |
| franzor.Lizt 1.3.1 | 4.5 | 12.0% | 62 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 7.7% | 0 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.6% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| sample.Target 1.0 | 9.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.9 | 77.5 | 3 / 35 | 4289 |
| 2 | 3 | 67.1 | 82.5 | 8 / 35 | 4711 |
| 3 | 3 | 65.6 | 78.1 | 9 / 35 | 4395 |
| 4 | 3 | 64.8 | 79.0 | 2 / 35 | 4617 |
| 5 | 3 | 66.9 | 82.2 | 6 / 35 | 4681 |
| 6 | 3 | 65.7 | 79.7 | 4 / 35 | 4586 |
| 7 | 1 | 68.0 | 84.1 | 7 / 35 | 5400 |
| 8 | 3 | 66.9 | 81.3 | 9 / 35 | 4594 |
| 9 | 3 | 65.5 | 79.0 | 3 / 35 | 4666 |
| 10 | 3 | 65.2 | 75.6 | 7 / 35 | 4623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 93 | 47% |
| rsalesc.melee.Monk 0.3.6c | 32 | 3% |
| franzor.Lizt 1.3.1 | 27 | 30% |
| oog.melee.CapuletDroid 1.1 | 16 | 31% |

Hadur died in 292 of 350 rounds, at a mean tick of 1140. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 130 | 45% | 189 |
| rsalesc.melee.Monk 0.3.6c | 90 | 31% | 107 |
| oog.melee.CapuletDroid 1.1 | 33 | 11% | 40 |
| franzor.Lizt 1.3.1 | 30 | 10% | 3 |
| exauge.GateKeeper 1.1.121g | 7 | 2% | 9 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 2 |

## Melee bench: F08

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 70.9 | 88 / 350 | 3.62 | 14.0% | 34363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroDAE 0.3 | 1.9 | 14.0% | 88 |
| shrub.Vapour v159 | 2.1 | 13.6% | 85 |
| tm.Yuugao 1.0 | 2.1 | 14.0% | 99 |
| Krabb.sliNk.Garm 0.9u | 4.1 | 10.8% | 29 |
| com.spp.robocode.MostlyHarmless 010 | 5.4 | 9.6% | 19 |
| m3thos.Eva00 1.1 | 6.4 | 8.9% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 6.4 | 8.9% | 16 |
| SHAM.WOW 1.4 | 8.4 | 7.0% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.7% | 3 |
| qualidafial.MajorDick 1.0.1 | 9.4 | 6.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 69.8 | 9 / 35 | 3707 |
| 2 | 1 | 59.3 | 67.9 | 9 / 35 | 3481 |
| 3 | 2 | 62.4 | 73.0 | 11 / 35 | 3651 |
| 4 | 2 | 60.3 | 71.4 | 9 / 35 | 3448 |
| 5 | 3 | 58.5 | 67.6 | 6 / 35 | 3240 |
| 6 | 3 | 57.8 | 66.0 | 6 / 35 | 3127 |
| 7 | 1 | 61.0 | 74.9 | 10 / 35 | 3405 |
| 8 | 1 | 62.2 | 75.2 | 13 / 35 | 3646 |
| 9 | 1 | 61.0 | 74.0 | 8 / 35 | 3460 |
| 10 | 3 | 59.0 | 68.6 | 7 / 35 | 3198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 44 | 36% |
| shrub.Vapour v159 | 39 | 36% |
| Krabb.sliNk.Garm 0.9u | 20 | 85% |
| m3thos.Eva00 1.1 | 14 | 64% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 93% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 85% |
| SHAM.WOW 1.4 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 50% |

Hadur died in 263 of 350 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 85 | 32% | 104 |
| tm.Yuugao 1.0 | 63 | 24% | 79 |
| Krabb.sliNk.Garm 0.9u | 29 | 11% | 39 |
| com.spp.robocode.MostlyHarmless 010 | 23 | 9% | 35 |
| m3thos.Eva00 1.1 | 22 | 8% | 28 |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 5% | 26 |
| zyx.nano.BacillusComma 1.0 | 13 | 5% | 16 |
| SHAM.WOW 1.4 | 7 | 3% | 17 |
| qualidafial.MajorDick 1.0.1 | 7 | 3% | 6 |

## Melee bench: F09

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 61.0 | 36 / 350 | 4.51 | 11.8% | 29950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.0% | 189 |
| kc.micro.Figment 1.0 | 2.1 | 14.2% | 46 |
| hadur117.nano.SanaroDAE 0.3 | 3.6 | 11.8% | 36 |
| pedersen.Grishnakh 1.0 | 4.2 | 11.4% | 36 |
| yagami.Tidus 0.11 | 4.3 | 11.3% | 11 |
| mc2.enemy.Original 0.9 | 5.9 | 9.4% | 24 |
| dft.Calliope 5.6 | 6.9 | 8.1% | 7 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 63.5 | 6 / 35 | 3073 |
| 2 | 2 | 61.4 | 73.0 | 5 / 35 | 3319 |
| 3 | 3 | 56.5 | 60.3 | 3 / 35 | 2951 |
| 4 | 3 | 57.8 | 62.9 | 5 / 35 | 3168 |
| 5 | 4 | 55.0 | 56.5 | 3 / 35 | 2898 |
| 6 | 5 | 55.8 | 57.8 | 4 / 35 | 2945 |
| 7 | 4 | 57.2 | 63.5 | 4 / 35 | 2890 |
| 8 | 4 | 55.3 | 58.1 | 2 / 35 | 2937 |
| 9 | 5 | 53.1 | 52.7 | 3 / 35 | 2707 |
| 10 | 3 | 56.5 | 61.3 | 1 / 35 | 3062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 45 | 9% |
| kc.micro.Figment 1.0 | 29 | 83% |
| mc2.enemy.Original 0.9 | 8 | 38% |
| pedersen.Grishnakh 1.0 | 5 | 20% |
| yagami.Tidus 0.11 | 5 | 80% |
| dft.Calliope 5.6 | 1 | 0% |
| step.nanoPri 1.0 | 1 | 0% |

Hadur died in 314 of 350 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 97 | 31% | 101 |
| pedersen.Grishnakh 1.0 | 50 | 16% | 51 |
| yagami.Tidus 0.11 | 47 | 15% | 53 |
| kc.micro.Figment 1.0 | 45 | 14% | 67 |
| mc2.enemy.Original 0.9 | 37 | 12% | 40 |
| dft.Calliope 5.6 | 14 | 4% | 14 |
| robar.nano.Assertive_Melee 0.2 | 9 | 3% | 9 |
| step.nanoPri 1.0 | 8 | 3% | 8 |
| rdm.Dueler 0.4x | 7 | 2% | 7 |

## Melee bench: F10

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 81.2 | 97 / 350 | 2.69 | 15.7% | 41061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroDAE 0.3 | 1.2 | 15.7% | 97 |
| DTF.Kludgy 1.2b | 2.5 | 14.3% | 90 |
| ejb.Polaris 1.0.1 | 3.1 | 13.2% | 66 |
| ne.Chimera 1.2 | 3.5 | 13.0% | 31 |
| tvv.micro.Antares 1.1.1 | 5.1 | 10.9% | 38 |
| vStar.RAFzilla 2.15 | 5.6 | 10.3% | 14 |
| sam.Samspin 1.0 | 7.5 | 6.5% | 5 |
| kurios.DOSexe .9b | 8.3 | 5.8% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.4 | 5.8% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 80.3 | 10 / 35 | 4193 |
| 2 | 1 | 63.3 | 80.6 | 9 / 35 | 3915 |
| 3 | 1 | 65.0 | 84.1 | 8 / 35 | 4378 |
| 4 | 2 | 63.8 | 79.0 | 12 / 35 | 4171 |
| 5 | 1 | 65.2 | 85.4 | 10 / 35 | 4230 |
| 6 | 2 | 62.9 | 77.5 | 9 / 35 | 3901 |
| 7 | 1 | 63.7 | 80.0 | 12 / 35 | 4015 |
| 8 | 1 | 64.3 | 82.9 | 10 / 35 | 4102 |
| 9 | 1 | 62.7 | 78.4 | 9 / 35 | 3908 |
| 10 | 1 | 64.6 | 83.5 | 8 / 35 | 4248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 72 | 54% |
| DTF.Kludgy 1.2b | 62 | 34% |
| tvv.micro.Antares 1.1.1 | 27 | 33% |
| ne.Chimera 1.2 | 22 | 50% |
| vStar.RAFzilla 2.15 | 16 | 69% |
| sam.Samspin 1.0 | 4 | 25% |
| donjezza.Muncho 1.0 | 4 | 50% |
| kurios.DOSexe .9b | 3 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 258 of 350 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 83 | 32% | 106 |
| ejb.Polaris 1.0.1 | 58 | 22% | 102 |
| ne.Chimera 1.2 | 52 | 20% | 59 |
| tvv.micro.Antares 1.1.1 | 29 | 11% | 26 |
| sam.Samspin 1.0 | 10 | 4% | 13 |
| vStar.RAFzilla 2.15 | 8 | 3% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 3% | 8 |
| kurios.DOSexe .9b | 6 | 2% | 8 |
| donjezza.Muncho 1.0 | 4 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 62.9 | 29 / 350 | 4.34 | 12.1% | 30785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.7% | 158 |
| cx.mini.Nimrod 0.55 | 2.0 | 13.5% | 59 |
| hadur117.nano.SanaroDAE 0.3 | 3.4 | 12.1% | 29 |
| djc.DynaBot 0.1.1 | 4.2 | 11.0% | 39 |
| rdt199.Warlord 0.73 | 5.1 | 9.9% | 27 |
| br2.MobyDickBot 1.6 | 5.6 | 9.4% | 24 |
| uji.YellohFellah 1.0 | 7.0 | 8.5% | 15 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.5% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.9 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.5 | 63.8 | 2 / 35 | 3387 |
| 2 | 6 | 51.1 | 49.5 | 2 / 35 | 2693 |
| 3 | 3 | 57.8 | 64.8 | 1 / 35 | 3288 |
| 4 | 3 | 59.1 | 67.6 | 6 / 35 | 3082 |
| 5 | 4 | 55.3 | 60.0 | 2 / 35 | 2872 |
| 6 | 3 | 59.4 | 67.9 | 5 / 35 | 3397 |
| 7 | 3 | 57.3 | 63.8 | 3 / 35 | 3114 |
| 8 | 3 | 55.3 | 59.7 | 1 / 35 | 2935 |
| 9 | 3 | 58.4 | 67.6 | 5 / 35 | 2967 |
| 10 | 3 | 57.1 | 63.8 | 2 / 35 | 3050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 43 | 14% |
| cx.mini.Nimrod 0.55 | 16 | 25% |
| djc.DynaBot 0.1.1 | 12 | 50% |
| br2.MobyDickBot 1.6 | 12 | 50% |
| rdt199.Warlord 0.73 | 11 | 45% |
| uji.YellohFellah 1.0 | 7 | 29% |

Hadur died in 321 of 350 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 131 | 41% | 140 |
| cx.mini.Nimrod 0.55 | 73 | 23% | 78 |
| djc.DynaBot 0.1.1 | 31 | 10% | 36 |
| rdt199.Warlord 0.73 | 25 | 8% | 28 |
| br2.MobyDickBot 1.6 | 19 | 6% | 23 |
| uji.YellohFellah 1.0 | 16 | 5% | 20 |
| KiraNL.Chupacabra 0.4 | 13 | 4% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 2% | 7 |
| stelo.MirrorNano 1.3 | 5 | 2% | 5 |

## Melee bench: F12

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 70.6 | 70 / 350 | 3.65 | 13.6% | 30395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.6 | 14.4% | 102 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.8% | 53 |
| hadur117.nano.SanaroDAE 0.3 | 2.8 | 13.6% | 70 |
| darkcanuck.Leon 1.01 | 2.9 | 13.6% | 78 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 29 |
| jrm.Test0 1.0 | 6.6 | 8.2% | 1 |
| jp.Perpy 16.0 | 7.1 | 7.6% | 1 |
| cs.sheldor.Talon 1.1 | 7.6 | 7.0% | 4 |
| jaybot.bots.Oddball 4.0 | 8.9 | 6.1% | 9 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 66.7 | 9 / 35 | 3023 |
| 2 | 3 | 60.0 | 72.7 | 5 / 35 | 2914 |
| 3 | 3 | 58.8 | 66.3 | 7 / 35 | 3055 |
| 4 | 3 | 59.5 | 72.1 | 6 / 35 | 2747 |
| 5 | 4 | 56.2 | 61.9 | 4 / 35 | 2796 |
| 6 | 4 | 58.0 | 64.1 | 6 / 35 | 2969 |
| 7 | 1 | 62.6 | 79.4 | 7 / 35 | 3199 |
| 8 | 2 | 62.0 | 74.9 | 10 / 35 | 3244 |
| 9 | 1 | 63.9 | 79.7 | 11 / 35 | 3404 |
| 10 | 4 | 58.7 | 67.9 | 5 / 35 | 3044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 53 | 26% |
| bts.wiki.RipCurl 0.9b | 48 | 71% |
| nat.PallasHawk 1.0 | 41 | 22% |
| brainfade.melee.Genghis 0.36 | 9 | 44% |
| jaybot.bots.Oddball 4.0 | 5 | 0% |
| jrm.Test0 1.0 | 4 | 100% |
| jp.Perpy 16.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 77 | 27% | 88 |
| darkcanuck.Leon 1.01 | 65 | 23% | 82 |
| bts.wiki.RipCurl 0.9b | 47 | 17% | 73 |
| brainfade.melee.Genghis 0.36 | 34 | 12% | 37 |
| jrm.Test0 1.0 | 22 | 8% | 23 |
| cs.sheldor.Talon 1.1 | 11 | 4% | 16 |
| jp.Perpy 16.0 | 10 | 4% | 14 |
| jaybot.bots.Oddball 4.0 | 9 | 3% | 11 |
| stuff.Vlad 0.1 | 6 | 2% | 6 |

## Melee bench: F13

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 70.3 | 22 / 350 | 3.68 | 12.7% | 31869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.5% | 175 |
| ags.Glacier 0.2.11 | 1.8 | 16.8% | 101 |
| hadur117.nano.SanaroDAE 0.3 | 3.5 | 12.7% | 22 |
| shinh.Entangled 0.3 | 4.1 | 12.2% | 32 |
| gh.micro.Gruweltje 0.7 | 4.4 | 11.9% | 17 |
| apc.Colossus2 0.17 | 6.3 | 8.2% | 1 |
| stelo.Wang 1.0 | 6.7 | 7.6% | 2 |
| ayk.WallHugger 1.0 | 8.0 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 68.9 | 1 / 35 | 3121 |
| 2 | 3 | 59.8 | 71.7 | 1 / 35 | 2907 |
| 3 | 5 | 58.0 | 63.5 | 3 / 35 | 3328 |
| 4 | 3 | 58.7 | 68.6 | 0 / 35 | 3015 |
| 5 | 3 | 61.2 | 77.1 | 2 / 35 | 3282 |
| 6 | 3 | 61.1 | 75.9 | 5 / 35 | 3081 |
| 7 | 5 | 57.6 | 64.8 | 1 / 35 | 3179 |
| 8 | 3 | 59.1 | 69.2 | 4 / 35 | 3017 |
| 9 | 4 | 59.9 | 68.9 | 3 / 35 | 3489 |
| 10 | 3 | 60.9 | 74.0 | 2 / 35 | 3450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 58 | 19% |
| ags.Glacier 0.2.11 | 46 | 11% |
| shinh.Entangled 0.3 | 16 | 25% |
| gh.micro.Gruweltje 0.7 | 6 | 17% |
| stelo.Wang 1.0 | 1 | 0% |

Hadur died in 328 of 350 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 119 | 36% | 132 |
| ags.Glacier 0.2.11 | 87 | 27% | 93 |
| shinh.Entangled 0.3 | 51 | 16% | 51 |
| gh.micro.Gruweltje 0.7 | 44 | 13% | 47 |
| stelo.Wang 1.0 | 13 | 4% | 13 |
| maribo.FollowFire 1 | 6 | 2% | 6 |
| apc.Colossus2 0.17 | 6 | 2% | 6 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 72.8 | 71 / 350 | 3.45 | 13.8% | 33926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.1 | 17.3% | 151 |
| hadur117.nano.SanaroDAE 0.3 | 2.2 | 13.8% | 71 |
| catcat20.shape.Theta 0.018 | 2.8 | 12.8% | 65 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 10.9% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 10.0% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 10.1% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 6.5 | 9.3% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.3% | 17 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 69.8 | 8 / 35 | 3438 |
| 2 | 2 | 60.8 | 74.3 | 2 / 35 | 3520 |
| 3 | 2 | 59.1 | 69.5 | 4 / 35 | 3161 |
| 4 | 2 | 60.6 | 72.1 | 8 / 35 | 3163 |
| 5 | 3 | 58.5 | 63.8 | 5 / 35 | 3360 |
| 6 | 2 | 62.0 | 76.2 | 8 / 35 | 3462 |
| 7 | 3 | 60.5 | 73.7 | 5 / 35 | 3176 |
| 8 | 3 | 59.6 | 72.7 | 5 / 35 | 2988 |
| 9 | 2 | 62.7 | 75.6 | 9 / 35 | 3794 |
| 10 | 1 | 64.8 | 80.0 | 17 / 35 | 3864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 29% |
| catcat20.shape.Theta 0.018 | 48 | 46% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 86% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 67% |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 33% |

Hadur died in 280 of 350 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 112 | 40% | 137 |
| catcat20.shape.Theta 0.018 | 47 | 17% | 60 |
| Lo_Ian.Gandalf_V4 4.0 | 33 | 12% | 38 |
| dmh.robocode.robot.RedDwarf 0.4 | 25 | 9% | 35 |
| sanyi.mikrobi.Roberto 1.0 | 23 | 8% | 35 |
| co.edu.usb.rc.LidisTron 1.0 | 20 | 7% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 6% | 27 |
| pa.Improved 1.0 | 3 | 1% | 4 |

## Melee bench: F15

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 62.4 | 16 / 350 | 4.38 | 12.2% | 34858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 15.6% | 104 |
| emp.Yngwie 1.11 | 2.3 | 13.7% | 106 |
| mld.DustBunny 3.8 | 2.8 | 13.4% | 43 |
| hadur117.nano.SanaroDAE 0.3 | 4.0 | 12.2% | 16 |
| cb.nano.Insomnia 1.0 | 4.6 | 11.8% | 33 |
| kawigi.robot.Girl 1.2 | 6.0 | 10.2% | 45 |
| lambdaxy.TBot 0.1 | 7.5 | 6.8% | 1 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.9% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.4 | 4.7% | 0 |
| divineomega.TrialBot 0.003 | 9.6 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 64.4 | 1 / 35 | 3584 |
| 2 | 4 | 56.5 | 61.3 | 1 / 35 | 3266 |
| 3 | 2 | 59.5 | 67.9 | 5 / 35 | 3495 |
| 4 | 4 | 57.9 | 62.9 | 0 / 35 | 3865 |
| 5 | 4 | 57.4 | 60.0 | 3 / 35 | 3751 |
| 6 | 5 | 55.0 | 56.8 | 0 / 35 | 3273 |
| 7 | 5 | 56.8 | 61.6 | 2 / 35 | 3124 |
| 8 | 4 | 57.2 | 63.2 | 2 / 35 | 3353 |
| 9 | 4 | 59.1 | 67.9 | 1 / 35 | 3527 |
| 10 | 4 | 56.3 | 58.4 | 1 / 35 | 3620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 33 | 24% |
| kawigi.micro.Shiz 1.1 | 19 | 16% |
| cb.nano.Insomnia 1.0 | 9 | 11% |
| mld.DustBunny 3.8 | 8 | 13% |
| kawigi.robot.Girl 1.2 | 6 | 17% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 100% |

Hadur died in 334 of 350 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 93 | 28% | 102 |
| kawigi.micro.Shiz 1.1 | 77 | 23% | 79 |
| mld.DustBunny 3.8 | 68 | 20% | 73 |
| cb.nano.Insomnia 1.0 | 38 | 11% | 31 |
| kawigi.robot.Girl 1.2 | 25 | 7% | 29 |
| Grystrion.TrackerWO 1.0 | 11 | 3% | 12 |
| lambdaxy.TBot 0.1 | 11 | 3% | 11 |
| divineomega.TrialBot 0.003 | 8 | 2% | 10 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 1% | 3 |

## Melee bench: F16

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 67.7 | 31 / 350 | 3.91 | 13.6% | 39617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.5% | 194 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.3 | 14.7% | 15 |
| hadur117.nano.SanaroDAE 0.3 | 2.7 | 13.6% | 31 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 11.0% | 74 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.8% | 23 |
| bvh.fnr.Fenrir 0.36l | 5.9 | 9.2% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.6 | 7.7% | 7 |
| divineomega.DivineBot 1.9.4.5 | 8.6 | 5.4% | 2 |
| asd.Cthulhu 1.3 | 9.0 | 5.1% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 73.3 | 6 / 35 | 4099 |
| 2 | 3 | 59.1 | 65.1 | 3 / 35 | 3827 |
| 3 | 2 | 62.4 | 70.2 | 7 / 35 | 4223 |
| 4 | 3 | 58.2 | 62.5 | 0 / 35 | 3826 |
| 5 | 3 | 58.8 | 65.1 | 1 / 35 | 3746 |
| 6 | 3 | 59.3 | 66.0 | 1 / 35 | 3651 |
| 7 | 2 | 62.8 | 72.1 | 5 / 35 | 4452 |
| 8 | 2 | 61.3 | 69.2 | 2 / 35 | 4291 |
| 9 | 3 | 57.9 | 62.9 | 2 / 35 | 3457 |
| 10 | 3 | 61.7 | 70.8 | 4 / 35 | 4045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 84 | 11% |
| techdude.forest.FlamingForest 1.1 | 15 | 13% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 100% |
| tvv.nano.Polaris 1.2 | 8 | 25% |
| stelo.IntrinsicVolatility 1.4 | 5 | 60% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |

Hadur died in 319 of 350 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 149 | 47% | 159 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 57 | 18% | 66 |
| techdude.forest.FlamingForest 1.1 | 43 | 13% | 45 |
| bvh.fnr.Fenrir 0.36l | 31 | 10% | 35 |
| tvv.nano.Polaris 1.2 | 15 | 5% | 15 |
| stelo.IntrinsicVolatility 1.4 | 8 | 3% | 12 |
| asd.Cthulhu 1.3 | 6 | 2% | 6 |
| divineomega.DivineBot 1.9.4.5 | 5 | 2% | 7 |
| repositorio.NanoStep 1.0 | 5 | 2% | 5 |

## Melee bench: F17

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 65.5 | 29 / 350 | 4.10 | 12.7% | 34928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.5 | 14.9% | 92 |
| oog.melee.Mercutio 1.0 | 2.9 | 13.4% | 73 |
| cx.BlestPain 1.41 | 2.9 | 13.3% | 78 |
| hadur117.nano.SanaroDAE 0.3 | 3.5 | 12.7% | 29 |
| nic.Nicator 2.4 | 4.6 | 12.0% | 43 |
| ahf.NanoAndrew .4 | 5.6 | 11.2% | 30 |
| maribo.melee.BMV 0.1 | 7.0 | 8.5% | 2 |
| tex.Longbot 0.4 | 8.2 | 6.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.9 | 5.2% | 2 |
| goblin.Bender 2.4 | 9.9 | 2.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 70.8 | 6 / 35 | 3383 |
| 2 | 5 | 55.7 | 57.5 | 1 / 35 | 3312 |
| 3 | 1 | 62.0 | 74.0 | 3 / 35 | 4036 |
| 4 | 5 | 57.2 | 61.9 | 2 / 35 | 3300 |
| 5 | 5 | 57.3 | 61.6 | 5 / 35 | 3259 |
| 6 | 3 | 58.7 | 66.7 | 2 / 35 | 3466 |
| 7 | 4 | 58.3 | 63.5 | 2 / 35 | 3445 |
| 8 | 4 | 58.9 | 63.8 | 4 / 35 | 3643 |
| 9 | 2 | 60.3 | 68.6 | 2 / 35 | 3876 |
| 10 | 3 | 58.9 | 67.0 | 2 / 35 | 3208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 43 | 21% |
| oog.melee.Mercutio 1.0 | 25 | 28% |
| cx.BlestPain 1.41 | 23 | 9% |
| nic.Nicator 2.4 | 16 | 38% |
| ahf.NanoAndrew .4 | 13 | 38% |

Hadur died in 321 of 350 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 89 | 28% | 99 |
| cx.BlestPain 1.41 | 53 | 17% | 53 |
| nic.Nicator 2.4 | 49 | 15% | 57 |
| oog.melee.Mercutio 1.0 | 49 | 15% | 55 |
| ahf.NanoAndrew .4 | 49 | 15% | 53 |
| maribo.melee.BMV 0.1 | 14 | 4% | 14 |
| tex.Longbot 0.4 | 13 | 4% | 13 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 1% | 4 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 65.0 | 66 / 350 | 4.15 | 12.8% | 32253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.6 | 14.2% | 89 |
| agd.Mooserwirt2 2.7 | 2.6 | 12.6% | 73 |
| hadur117.nano.SanaroDAE 0.3 | 2.8 | 12.8% | 66 |
| uji.DBH 1.1 | 3.9 | 11.7% | 40 |
| ratosh.Nobo 0.21 | 4.7 | 10.8% | 18 |
| sigterm.Sigterm 1.0 | 6.2 | 9.0% | 21 |
| spinnercat.Robovirus 2.718 | 6.2 | 9.9% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.2% | 8 |
| stelo.WangRobot 1.0 | 9.3 | 6.1% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.0 | 67.6 | 7 / 35 | 3306 |
| 2 | 2 | 58.0 | 64.4 | 10 / 35 | 3203 |
| 3 | 2 | 59.2 | 67.6 | 5 / 35 | 3591 |
| 4 | 4 | 54.5 | 56.5 | 2 / 35 | 3189 |
| 5 | 3 | 58.7 | 67.6 | 7 / 35 | 3146 |
| 6 | 1 | 60.8 | 71.7 | 8 / 35 | 3569 |
| 7 | 5 | 54.3 | 56.8 | 5 / 35 | 2863 |
| 8 | 3 | 58.9 | 67.6 | 7 / 35 | 3205 |
| 9 | 4 | 55.1 | 57.5 | 8 / 35 | 2976 |
| 10 | 2 | 60.1 | 72.7 | 7 / 35 | 3205 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 43 | 42% |
| uji.DBH 1.1 | 20 | 50% |
| agd.Mooserwirt2 2.7 | 19 | 11% |
| sigterm.Sigterm 1.0 | 16 | 63% |
| spinnercat.Robovirus 2.718 | 13 | 62% |
| ratosh.Nobo 0.21 | 11 | 73% |
| stelo.WangRobot 1.0 | 10 | 70% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 86 | 30% | 105 |
| agd.Mooserwirt2 2.7 | 57 | 20% | 63 |
| uji.DBH 1.1 | 34 | 12% | 40 |
| ratosh.Nobo 0.21 | 24 | 8% | 32 |
| spinnercat.Robovirus 2.718 | 24 | 8% | 31 |
| stelo.WangRobot 1.0 | 17 | 6% | 25 |
| kawigi.mini.Fhqwhgads 1.1 | 17 | 6% | 20 |
| sigterm.Sigterm 1.0 | 15 | 5% | 23 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 11 | 4% | 11 |

## Melee bench: F19

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 78.7 | 75 / 350 | 2.92 | 15.4% | 40478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.6 | 16.3% | 111 |
| mld.Infinity 2.2 | 2.2 | 15.5% | 123 |
| hadur117.nano.SanaroDAE 0.3 | 2.2 | 15.4% | 75 |
| krillr.mini.JointStrike 2.0.0 | 4.1 | 11.7% | 9 |
| erdnis.Rover 0.3 | 4.9 | 10.6% | 10 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.8% | 11 |
| pac.ABC 2.1 | 7.4 | 7.5% | 12 |
| mbh.Mbh 0.1 | 7.6 | 7.3% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.7 | 76.5 | 7 / 35 | 3834 |
| 2 | 1 | 66.8 | 84.8 | 13 / 35 | 4152 |
| 3 | 2 | 65.6 | 81.6 | 9 / 35 | 4106 |
| 4 | 2 | 65.1 | 82.5 | 8 / 35 | 3993 |
| 5 | 3 | 64.9 | 80.3 | 7 / 35 | 4005 |
| 6 | 2 | 64.3 | 78.7 | 4 / 35 | 4165 |
| 7 | 3 | 63.4 | 76.5 | 5 / 35 | 3988 |
| 8 | 2 | 63.8 | 75.2 | 8 / 35 | 4196 |
| 9 | 1 | 65.2 | 80.3 | 11 / 35 | 4164 |
| 10 | 3 | 61.6 | 70.5 | 3 / 35 | 3875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 87 | 30% |
| mld.Infinity 2.2 | 64 | 28% |
| patson.PatsonTestBot 1.0 | 12 | 58% |
| erdnis.Rover 0.3 | 11 | 91% |
| krillr.mini.JointStrike 2.0.0 | 8 | 100% |
| pac.ABC 2.1 | 8 | 38% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 1047. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 119 | 43% | 167 |
| mld.Infinity 2.2 | 70 | 25% | 29 |
| krillr.mini.JointStrike 2.0.0 | 24 | 9% | 40 |
| erdnis.Rover 0.3 | 20 | 7% | 35 |
| patson.PatsonTestBot 1.0 | 18 | 6% | 32 |
| pac.ABC 2.1 | 16 | 6% | 22 |
| mbh.Mbh 0.1 | 9 | 3% | 14 |
| pbg.R2D2 1.0 | 1 | 0% | 6 |

## Melee bench: F20

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 70.2 | 60 / 350 | 3.69 | 13.7% | 35948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.1% | 144 |
| hadur117.nano.SanaroDAE 0.3 | 2.2 | 13.7% | 60 |
| fwb.Nine 1.0.1 | 3.4 | 12.3% | 63 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.5% | 13 |
| catcat20.Rabbit 0.001 | 4.9 | 10.1% | 36 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 9.0% | 11 |
| djdjdj.NanoSkunk10 1.0 | 6.9 | 8.6% | 12 |
| bayen.nut.Squirrel 1.615 | 7.6 | 8.3% | 11 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 75.6 | 11 / 35 | 3626 |
| 2 | 2 | 57.9 | 64.1 | 3 / 35 | 3423 |
| 3 | 2 | 58.5 | 63.2 | 5 / 35 | 3521 |
| 4 | 2 | 59.4 | 68.6 | 4 / 35 | 3732 |
| 5 | 2 | 60.8 | 74.3 | 5 / 35 | 3253 |
| 6 | 2 | 60.5 | 71.1 | 7 / 35 | 3414 |
| 7 | 2 | 60.0 | 68.9 | 7 / 35 | 3564 |
| 8 | 3 | 60.7 | 72.1 | 4 / 35 | 3588 |
| 9 | 2 | 63.4 | 75.6 | 13 / 35 | 3829 |
| 10 | 3 | 59.4 | 68.3 | 1 / 35 | 3998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 68 | 47% |
| fwb.Nine 1.0.1 | 27 | 11% |
| catcat20.Rabbit 0.001 | 13 | 38% |
| bayen.nut.Squirrel 1.615 | 12 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 40% |
| nz.jdc.nano.GridFu 1.0 | 4 | 50% |
| djdjdj.NanoSkunk10 1.0 | 4 | 75% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 290 of 350 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 120 | 41% | 143 |
| fwb.Nine 1.0.1 | 56 | 19% | 56 |
| nz.jdc.nano.GridFu 1.0 | 36 | 12% | 44 |
| catcat20.Rabbit 0.001 | 27 | 9% | 32 |
| bayen.nut.Squirrel 1.615 | 20 | 7% | 30 |
| djdjdj.NanoSkunk10 1.0 | 15 | 5% | 22 |
| m3thos.mini.Eva01 0.5.5 | 12 | 4% | 16 |
| ntc.ControlledChaos 1.1.4 | 3 | 1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% | 2 |

## Melee bench: F21

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 78.5 | 83 / 350 | 2.93 | 16.0% | 45551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.0 | 17.9% | 181 |
| hadur117.nano.SanaroDAE 0.3 | 2.1 | 16.0% | 83 |
| dummy.mini.Scimitar 1.01 | 2.9 | 14.5% | 35 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.1% | 22 |
| eld.Hmm 1.0 | 5.5 | 8.7% | 30 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.6% | 1 |
| el.JumpShoot 0.2 | 7.3 | 6.5% | 2 |
| fire219.CatBot 1.0 | 8.0 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 78.7 | 6 / 35 | 4861 |
| 2 | 2 | 65.5 | 78.4 | 11 / 35 | 4576 |
| 3 | 2 | 66.1 | 85.1 | 9 / 35 | 4393 |
| 4 | 2 | 65.4 | 78.1 | 8 / 35 | 4941 |
| 5 | 2 | 65.3 | 80.0 | 10 / 35 | 4306 |
| 6 | 2 | 65.4 | 78.7 | 12 / 35 | 4573 |
| 7 | 3 | 63.9 | 76.5 | 8 / 35 | 4301 |
| 8 | 2 | 63.9 | 76.2 | 5 / 35 | 4484 |
| 9 | 2 | 65.4 | 80.6 | 9 / 35 | 4522 |
| 10 | 2 | 63.5 | 72.7 | 5 / 35 | 4594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 113 | 42% |
| dummy.mini.Scimitar 1.01 | 32 | 72% |
| cf.RiO.RiOx 4.2.1 | 16 | 50% |
| eld.Hmm 1.0 | 10 | 20% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 269 of 350 rounds, at a mean tick of 1077. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 117 | 43% | 147 |
| dummy.mini.Scimitar 1.01 | 60 | 22% | 92 |
| cf.RiO.RiOx 4.2.1 | 37 | 14% | 45 |
| eld.Hmm 1.0 | 26 | 10% | 28 |
| el.JumpShoot 0.2 | 10 | 4% | 10 |
| oa.weak.BotherBot 0.1 | 7 | 3% | 14 |
| arthord.MannyPacquiao Beta | 4 | 1% | 5 |
| fire219.CatBot 1.0 | 4 | 1% | 5 |
| PSW.Relentless 0.1 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.5 | 99 / 350 | 2.49 | 16.3% | 39652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.7% | 150 |
| hadur117.nano.SanaroDAE 0.3 | 2.3 | 16.3% | 99 |
| cre.Karolos 0.32 | 2.7 | 14.5% | 65 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.4% | 25 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 9.1% | 6 |
| cw.megas.Blade 0.8 | 6.4 | 8.3% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.4 | 8.8% | 0 |
| sample.Walls 1.0 | 7.4 | 8.1% | 6 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 84.1 | 10 / 35 | 3614 |
| 2 | 3 | 64.7 | 79.0 | 6 / 35 | 3786 |
| 3 | 3 | 64.9 | 79.4 | 6 / 35 | 3771 |
| 4 | 2 | 67.7 | 87.6 | 12 / 35 | 4167 |
| 5 | 2 | 67.1 | 85.7 | 11 / 35 | 4263 |
| 6 | 3 | 64.7 | 80.3 | 10 / 35 | 3434 |
| 7 | 2 | 67.1 | 85.1 | 8 / 35 | 4510 |
| 8 | 2 | 66.5 | 85.7 | 9 / 35 | 4078 |
| 9 | 2 | 66.2 | 81.0 | 11 / 35 | 4167 |
| 10 | 2 | 67.5 | 87.0 | 16 / 35 | 3862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 127 | 39% |
| cre.Karolos 0.32 | 37 | 35% |
| stelo.AreaTargetingBot 1.1 | 23 | 52% |
| sample.Walls 1.0 | 17 | 88% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 253 of 350 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 144 | 57% | 200 |
| cre.Karolos 0.32 | 64 | 25% | 76 |
| stelo.AreaTargetingBot 1.1 | 26 | 10% | 32 |
| sample.Walls 1.0 | 6 | 2% | 10 |
| cw.megas.Blade 0.8 | 4 | 2% | 6 |
| stelo.RamTrackSurfer 1.2 | 3 | 1% | 15 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 1% | 8 |
| rrh.Iwillfindyou 2.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F24

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.9 | 62.5 | 28 / 350 | 4.37 | 11.7% | 27381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.2% | 77 |
| florent.XSeries.X2 0.12 | 2.6 | 13.9% | 72 |
| davidalves.Phoenix 0.54 | 2.6 | 13.6% | 91 |
| pedersen.Ugluk 1.1.1 | 3.8 | 12.4% | 52 |
| hadur117.nano.SanaroDAE 0.3 | 4.3 | 11.7% | 28 |
| oog.melee.Corsair 1.0 | 6.3 | 9.2% | 14 |
| stelo.SoJNanoMelee 1.1 | 6.6 | 8.5% | 15 |
| lunchie.Lunchbox 0.93 | 8.1 | 6.3% | 1 |
| evd.X1 0.01 | 9.4 | 5.0% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.1 | 63.2 | 4 / 35 | 2596 |
| 2 | 5 | 55.1 | 61.6 | 3 / 35 | 2498 |
| 3 | 5 | 51.9 | 54.0 | 2 / 35 | 2410 |
| 4 | 4 | 57.4 | 66.3 | 0 / 35 | 3065 |
| 5 | 5 | 55.8 | 63.2 | 3 / 35 | 2582 |
| 6 | 2 | 58.8 | 68.6 | 4 / 35 | 3080 |
| 7 | 5 | 56.1 | 62.5 | 4 / 35 | 2554 |
| 8 | 5 | 52.3 | 54.3 | 2 / 35 | 2648 |
| 9 | 4 | 57.4 | 63.5 | 3 / 35 | 3066 |
| 10 | 4 | 57.8 | 67.9 | 3 / 35 | 2882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 24 | 13% |
| florent.XSeries.X2 0.12 | 22 | 59% |
| davidalves.Phoenix 0.54 | 21 | 14% |
| pedersen.Ugluk 1.1.1 | 13 | 31% |
| oog.melee.Corsair 1.0 | 6 | 50% |
| stelo.SoJNanoMelee 1.1 | 5 | 20% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 72 | 22% | 76 |
| davidalves.Phoenix 0.54 | 71 | 22% | 74 |
| pedersen.Ugluk 1.1.1 | 62 | 19% | 63 |
| florent.XSeries.X2 0.12 | 54 | 17% | 66 |
| stelo.SoJNanoMelee 1.1 | 26 | 8% | 28 |
| oog.melee.Corsair 1.0 | 15 | 5% | 19 |
| lunchie.Lunchbox 0.93 | 13 | 4% | 14 |
| evd.X1 0.01 | 6 | 2% | 6 |
| as.FrankTheTank 1.3 | 3 | 1% | 4 |

## Melee bench: F25

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 70.3 | 73 / 350 | 3.67 | 13.7% | 30664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 14.6% | 81 |
| hadur117.nano.SanaroDAE 0.3 | 2.0 | 13.7% | 73 |
| voidious.micro.BlitzBat 1.05 | 2.9 | 13.3% | 59 |
| jdw.Hurricane 1.4 | 3.8 | 12.0% | 52 |
| ds.Oo 2.2 | 5.4 | 9.8% | 28 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 10.2% | 28 |
| gjr.Cephalosporin 0.1 | 7.4 | 8.1% | 17 |
| awesomeness.Elite 1.0 | 7.8 | 7.5% | 11 |
| adt.Ar2 1.1 | 8.7 | 6.7% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.8 | 73.3 | 8 / 35 | 2958 |
| 2 | 2 | 61.7 | 75.2 | 7 / 35 | 3303 |
| 3 | 1 | 61.1 | 73.0 | 8 / 35 | 3226 |
| 4 | 3 | 58.3 | 68.3 | 7 / 35 | 2641 |
| 5 | 4 | 57.9 | 66.0 | 4 / 35 | 2837 |
| 6 | 2 | 60.7 | 70.2 | 9 / 35 | 3303 |
| 7 | 1 | 61.1 | 70.8 | 8 / 35 | 3415 |
| 8 | 3 | 56.4 | 61.9 | 4 / 35 | 2981 |
| 9 | 2 | 59.3 | 71.1 | 4 / 35 | 2882 |
| 10 | 1 | 62.5 | 73.3 | 14 / 35 | 3118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 56 | 29% |
| voidious.micro.BlitzBat 1.05 | 44 | 32% |
| jdw.Hurricane 1.4 | 29 | 79% |
| ds.Oo 2.2 | 16 | 50% |
| gre.svman4.Morfeas 1.4.1 | 11 | 45% |
| adt.Ar2 1.1 | 5 | 100% |
| gjr.Cephalosporin 0.1 | 4 | 50% |
| awesomeness.Elite 1.0 | 2 | 0% |

Hadur died in 277 of 350 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 75 | 27% | 92 |
| voidious.mini.BrokenSword 2.0.3 | 64 | 23% | 81 |
| jdw.Hurricane 1.4 | 40 | 14% | 55 |
| ds.Oo 2.2 | 30 | 11% | 38 |
| gre.svman4.Morfeas 1.4.1 | 24 | 9% | 28 |
| adt.Ar2 1.1 | 15 | 5% | 19 |
| gjr.Cephalosporin 0.1 | 13 | 5% | 18 |
| awesomeness.Elite 1.0 | 13 | 5% | 15 |
| amk.ChumbaMini 0.2 | 3 | 1% | 4 |

## Melee bench: F26

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 69.3 | 39 / 350 | 3.76 | 12.9% | 33886 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.5% | 136 |
| lrem.Spectre 0.4.4 | 3.0 | 12.8% | 60 |
| shu.nitro.LENIN .T34 | 3.1 | 13.1% | 60 |
| hadur117.nano.SanaroDAE 0.3 | 3.3 | 12.9% | 39 |
| gh.mini.GrubbmOne 1.0 | 5.2 | 11.0% | 23 |
| js.PinBall 1.6 | 5.6 | 10.8% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 9.0% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.2% | 14 |
| sample.SpinBot 1.0 | 9.0 | 5.2% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.2 | 64.4 | 1 / 35 | 3298 |
| 2 | 3 | 60.5 | 72.4 | 3 / 35 | 3420 |
| 3 | 4 | 56.2 | 62.2 | 3 / 35 | 3050 |
| 4 | 3 | 59.7 | 69.5 | 3 / 35 | 3382 |
| 5 | 2 | 61.0 | 71.4 | 5 / 35 | 3696 |
| 6 | 3 | 60.0 | 70.2 | 3 / 35 | 3369 |
| 7 | 3 | 59.7 | 69.2 | 7 / 35 | 3169 |
| 8 | 3 | 59.7 | 70.5 | 2 / 35 | 3445 |
| 9 | 3 | 62.6 | 74.9 | 6 / 35 | 3872 |
| 10 | 4 | 59.6 | 68.3 | 6 / 35 | 3185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 49 | 24% |
| lrem.Spectre 0.4.4 | 32 | 50% |
| shu.nitro.LENIN .T34 | 25 | 16% |
| gh.mini.GrubbmOne 1.0 | 11 | 9% |
| js.PinBall 1.6 | 6 | 67% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 0% |
| sample.SpinBot 1.0 | 1 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 1 | 0% |

Hadur died in 313 of 350 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 85 | 27% | 100 |
| lrem.Spectre 0.4.4 | 60 | 19% | 68 |
| shu.nitro.LENIN .T34 | 59 | 19% | 70 |
| gh.mini.GrubbmOne 1.0 | 43 | 14% | 44 |
| js.PinBall 1.6 | 27 | 9% | 30 |
| fullsail.LaxativeTeaTwo 1.0 | 14 | 4% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 14 | 4% | 14 |
| sample.SpinBot 1.0 | 9 | 3% | 9 |
2 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 69.5 | 61 / 350 | 3.75 | 13.0% | 29152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.6 | 15.4% | 134 |
| hadur117.nano.SanaroDAE 0.3 | 2.4 | 13.0% | 61 |
| wee.Gem 1.8.4 | 2.9 | 13.0% | 78 |
| sheldor.melee.nano.TestMelee 0.1 | 3.3 | 12.3% | 42 |
| EH.Eagle 1.0.6 | 5.3 | 10.0% | 12 |
| joe.ADinosaur 1.0 | 6.8 | 8.6% | 0 |
| techdude.kombat.FlamingKombat 1.5 | 7.0 | 8.4% | 13 |
| throxbot.ThroxBot 0.1 | 7.4 | 7.9% | 6 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.2% | 4 |
| cs.Grudge 1.0 | 9.6 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 71.7 | 9 / 35 | 3096 |
| 2 | 3 | 56.4 | 66.0 | 3 / 35 | 2620 |
| 3 | 2 | 60.2 | 73.0 | 8 / 35 | 3091 |
| 4 | 4 | 58.2 | 68.3 | 6 / 35 | 2867 |
| 5 | 3 | 56.7 | 66.0 | 3 / 35 | 2701 |
| 6 | 2 | 59.3 | 69.2 | 5 / 35 | 3115 |
| 7 | 2 | 58.4 | 63.2 | 9 / 35 | 3277 |
| 8 | 2 | 59.3 | 72.1 | 5 / 35 | 2774 |
| 9 | 2 | 60.0 | 73.0 | 7 / 35 | 2971 |
| 10 | 2 | 59.1 | 72.4 | 6 / 35 | 2640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 69 | 48% |
| wee.Gem 1.8.4 | 25 | 20% |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 61% |
| EH.Eagle 1.0.6 | 9 | 78% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 17% |
| throxbot.ThroxBot 0.1 | 4 | 50% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 289 of 350 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 99 | 34% | 126 |
| wee.Gem 1.8.4 | 54 | 19% | 59 |
| sheldor.melee.nano.TestMelee 0.1 | 47 | 16% | 63 |
| joe.ADinosaur 1.0 | 28 | 10% | 30 |
| techdude.kombat.FlamingKombat 1.5 | 17 | 6% | 17 |
| throxbot.ThroxBot 0.1 | 16 | 6% | 17 |
| EH.Eagle 1.0.6 | 13 | 4% | 21 |
| caimano.Furia_Ceca 0.22 | 13 | 4% | 15 |
| cs.Grudge 1.0 | 2 | 1% | 2 |

## Melee bench: F28

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 78.5 | 107 / 350 | 2.93 | 15.2% | 33364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.1 | 16.3% | 120 |
| hadur117.nano.SanaroDAE 0.3 | 1.9 | 15.2% | 107 |
| uji.Antique 1.0 | 3.1 | 12.3% | 49 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 11.6% | 35 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.4% | 11 |
| ahr.ice.Ice 1.0.2 | 6.6 | 8.1% | 13 |
| amk.ChumbaWumba 0.3 | 6.6 | 8.1% | 9 |
| matt.advanced.Katana 1.0 | 8.4 | 6.6% | 5 |
| stelo.PianistNano 1.2 | 9.0 | 6.0% | 1 |
| stelo.Lifestealer 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 82.9 | 12 / 35 | 3402 |
| 2 | 1 | 63.6 | 80.0 | 13 / 35 | 3243 |
| 3 | 2 | 62.0 | 76.5 | 11 / 35 | 3214 |
| 4 | 2 | 63.5 | 80.6 | 9 / 35 | 3477 |
| 5 | 2 | 61.4 | 72.7 | 13 / 35 | 3254 |
| 6 | 2 | 62.2 | 78.7 | 10 / 35 | 3099 |
| 7 | 2 | 62.0 | 75.6 | 11 / 35 | 3402 |
| 8 | 2 | 62.8 | 78.4 | 8 / 35 | 3308 |
| 9 | 2 | 63.6 | 78.7 | 8 / 35 | 3895 |
| 10 | 2 | 63.4 | 81.3 | 12 / 35 | 3070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 104 | 53% |
| uji.Antique 1.0 | 38 | 68% |
| qohnil.blot.BlotBot 3.61 | 26 | 38% |
| pfvicm.Sobieski 7.2.3b | 9 | 56% |
| ahr.ice.Ice 1.0.2 | 7 | 29% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| matt.advanced.Katana 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 50% |

Hadur died in 243 of 350 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 107 | 44% | 149 |
| uji.Antique 1.0 | 34 | 14% | 64 |
| qohnil.blot.BlotBot 3.61 | 27 | 11% | 42 |
| pfvicm.Sobieski 7.2.3b | 25 | 10% | 28 |
| amk.ChumbaWumba 0.3 | 19 | 8% | 23 |
| ahr.ice.Ice 1.0.2 | 17 | 7% | 21 |
| stelo.PianistNano 1.2 | 7 | 3% | 7 |
| matt.advanced.Katana 1.0 | 6 | 2% | 10 |
| stelo.Lifestealer 1.0 | 1 | 0% | 4 |

## Melee bench: F29

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 66.2 | 40 / 350 | 4.04 | 13.1% | 33589 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.4 | 16.5% | 127 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.7% | 108 |
| hadur117.nano.SanaroDAE 0.3 | 3.3 | 13.1% | 40 |
| myl.micro.Troodon 1.10 | 3.4 | 12.6% | 23 |
| jok.PheonixM 0.1.2 | 4.9 | 11.2% | 18 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.1% | 4 |
| DBall.Anarchy 0.1 | 6.5 | 8.1% | 24 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 6.2% | 0 |
| ap.Frederick 1.1 | 9.4 | 4.2% | 2 |
| jangs.ns51 1.0 | 9.5 | 4.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.3 | 62.5 | 2 / 35 | 3271 |
| 2 | 3 | 59.6 | 67.0 | 1 / 35 | 3353 |
| 3 | 4 | 56.7 | 59.0 | 1 / 35 | 2977 |
| 4 | 3 | 60.8 | 69.2 | 4 / 35 | 3564 |
| 5 | 3 | 58.8 | 64.4 | 2 / 35 | 3150 |
| 6 | 3 | 60.8 | 68.6 | 6 / 35 | 3373 |
| 7 | 4 | 59.7 | 63.8 | 7 / 35 | 3398 |
| 8 | 2 | 63.9 | 77.5 | 6 / 35 | 3756 |
| 9 | 3 | 60.7 | 67.9 | 6 / 35 | 3288 |
| 10 | 4 | 58.6 | 61.9 | 5 / 35 | 3459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 53 | 19% |
| zyx.mega.YersiniaPestis 3.1 | 31 | 35% |
| myl.micro.Troodon 1.10 | 13 | 92% |
| jok.PheonixM 0.1.2 | 12 | 50% |
| DBall.Anarchy 0.1 | 9 | 11% |
| jangs.ns51 1.0 | 2 | 0% |

Hadur died in 310 of 350 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 104 | 34% | 111 |
| zyx.mega.YersiniaPestis 3.1 | 75 | 24% | 89 |
| myl.micro.Troodon 1.10 | 48 | 15% | 60 |
| jok.PheonixM 0.1.2 | 37 | 12% | 44 |
| DBall.Anarchy 0.1 | 17 | 5% | 18 |
| ph.melee.ArcherME 0.3 | 14 | 5% | 14 |
| fullsail.TimbotNoPrediction 1.0 | 8 | 3% | 8 |
| jangs.ns51 1.0 | 6 | 2% | 6 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F30

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.8 | 56.0 | 13 / 350 | 4.96 | 10.5% | 27392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.1 | 14.3% | 96 |
| stelo.PastFuture 2.3.2 | 2.5 | 13.8% | 62 |
| oog.melee.Capulet 1.2 | 2.5 | 14.0% | 74 |
| darkcanuck.B26354 1.06 | 2.9 | 13.8% | 79 |
| hadur117.nano.SanaroDAE 0.3 | 5.1 | 10.5% | 13 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.0% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 7.6 | 7.5% | 4 |
| ntc.Opposite 1.5 | 8.0 | 7.5% | 1 |
| tripphippy.Alice 1.1 | 8.3 | 7.1% | 7 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.5 | 56.8 | 1 / 35 | 2560 |
| 2 | 5 | 54.6 | 56.2 | 2 / 35 | 2782 |
| 3 | 5 | 52.3 | 52.7 | 2 / 35 | 2518 |
| 4 | 6 | 51.3 | 49.8 | 1 / 35 | 2551 |
| 5 | 5 | 53.9 | 54.6 | 0 / 35 | 2978 |
| 6 | 5 | 54.3 | 59.4 | 0 / 35 | 2774 |
| 7 | 5 | 53.8 | 57.1 | 1 / 35 | 2618 |
| 8 | 5 | 55.0 | 57.5 | 3 / 35 | 2910 |
| 9 | 5 | 53.9 | 54.9 | 1 / 35 | 2852 |
| 10 | 5 | 55.5 | 60.6 | 2 / 35 | 2849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 17 | 18% |
| oog.melee.Capulet 1.2 | 12 | 8% |
| darkcanuck.B26354 1.06 | 11 | 18% |
| stelo.PastFuture 2.3.2 | 9 | 33% |
| intruder.PrairieWolf 2.61 | 5 | 60% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 337 of 350 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 70 | 21% | 73 |
| oog.melee.Capulet 1.2 | 70 | 21% | 71 |
| darkcanuck.B26354 1.06 | 61 | 18% | 63 |
| catcat20.Matcha 0.006 | 58 | 17% | 61 |
| ntc.Opposite 1.5 | 28 | 8% | 28 |
| fowl3628800.LightningBolt 2.6.0 | 18 | 5% | 19 |
| intruder.PrairieWolf 2.61 | 17 | 5% | 20 |
| tripphippy.Alice 1.1 | 12 | 4% | 12 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.1 | 57.2 | 13 / 350 | 4.85 | 10.7% | 25616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.7% | 199 |
| gh.mini.Griezel 0.2 | 2.2 | 13.7% | 72 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 12.2% | 21 |
| d414.nano.Quantum 1.0.0 | 3.7 | 11.5% | 23 |
| hadur117.nano.SanaroDAE 0.3 | 4.8 | 10.7% | 13 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.8% | 19 |
| timmit.nano.TimDog 0.33 | 7.5 | 7.2% | 4 |
| fm.mammillarias 1.3 | 7.7 | 6.6% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 4.8% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.6 | 59.4 | 2 / 35 | 3041 |
| 2 | 5 | 54.4 | 57.1 | 0 / 35 | 2618 |
| 3 | 6 | 53.7 | 57.1 | 1 / 35 | 2386 |
| 4 | 5 | 50.9 | 50.2 | 2 / 35 | 2282 |
| 5 | 5 | 53.3 | 56.8 | 0 / 35 | 2453 |
| 6 | 5 | 52.1 | 52.1 | 1 / 35 | 2514 |
| 7 | 4 | 55.8 | 61.6 | 2 / 35 | 2574 |
| 8 | 4 | 55.9 | 61.0 | 1 / 35 | 2626 |
| 9 | 4 | 55.2 | 61.0 | 1 / 35 | 2457 |
| 10 | 6 | 54.3 | 55.9 | 3 / 35 | 2665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 31 | 23% |
| gh.mini.Griezel 0.2 | 26 | 12% |
| spinnercat.micro.Tyger 0.1 | 9 | 11% |
| d414.nano.Quantum 1.0.0 | 8 | 25% |
| timmit.nano.TimDog 0.33 | 3 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |

Hadur died in 337 of 350 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 90 | 27% | 93 |
| abc.Shadow 3.84i | 67 | 20% | 74 |
| spinnercat.micro.Tyger 0.1 | 57 | 17% | 58 |
| d414.nano.Quantum 1.0.0 | 48 | 14% | 50 |
| gh.nano.Grofvuil 0.2 | 34 | 10% | 34 |
| fm.mammillarias 1.3 | 20 | 6% | 20 |
| timmit.nano.TimDog 0.33 | 17 | 5% | 17 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 1% | 4 |

## Melee bench: F32

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 77.4 | 129 / 350 | 3.03 | 15.2% | 35146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroDAE 0.3 | 1.4 | 15.2% | 129 |
| kawigi.sbf.FloodHT 0.9.2 | 1.6 | 14.9% | 106 |
| apc.botM 3.0 | 3.1 | 12.4% | 48 |
| vjik.UnViolation 1.1 | 4.3 | 11.1% | 27 |
| lxx.ConceptA 0.8 | 4.8 | 10.9% | 11 |
| bayen.UbaMicro 1.4 | 6.3 | 9.1% | 13 |
| panzer.Panzer 0.2 | 7.1 | 7.7% | 1 |
| conscience.Electron 1.3g | 8.1 | 6.6% | 2 |
| yk.JahMicro 1.0 | 8.4 | 7.0% | 5 |
| donjezza.Jezza 1.0 | 9.9 | 5.0% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 84.1 | 17 / 35 | 3928 |
| 2 | 2 | 61.2 | 70.5 | 17 / 35 | 3408 |
| 3 | 1 | 62.8 | 78.7 | 13 / 35 | 3599 |
| 4 | 1 | 62.6 | 77.1 | 12 / 35 | 3579 |
| 5 | 1 | 62.9 | 77.1 | 13 / 35 | 3754 |
| 6 | 1 | 62.9 | 77.1 | 12 / 35 | 3810 |
| 7 | 1 | 62.6 | 77.5 | 14 / 35 | 3413 |
| 8 | 2 | 62.7 | 80.6 | 12 / 35 | 3053 |
| 9 | 2 | 59.5 | 72.4 | 6 / 35 | 3115 |
| 10 | 2 | 62.9 | 78.7 | 13 / 35 | 3487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 96 | 55% |
| apc.botM 3.0 | 45 | 58% |
| vjik.UnViolation 1.1 | 23 | 70% |
| lxx.ConceptA 0.8 | 19 | 84% |
| bayen.UbaMicro 1.4 | 11 | 64% |
| yk.JahMicro 1.0 | 8 | 88% |
| donjezza.Jezza 1.0 | 6 | 17% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 221 of 350 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 71 | 32% | 120 |
| lxx.ConceptA 0.8 | 39 | 18% | 49 |
| apc.botM 3.0 | 36 | 16% | 64 |
| bayen.UbaMicro 1.4 | 24 | 11% | 30 |
| vjik.UnViolation 1.1 | 20 | 9% | 47 |
| panzer.Panzer 0.2 | 10 | 5% | 12 |
| conscience.Electron 1.3g | 10 | 5% | 11 |
| yk.JahMicro 1.0 | 6 | 3% | 10 |
| donjezza.Jezza 1.0 | 5 | 2% | 7 |

## Melee bench: F33

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 69.0 | 66 / 350 | 3.79 | 14.0% | 37682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.4% | 133 |
| hadur117.nano.SanaroDAE 0.3 | 2.5 | 14.0% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 13.1% | 49 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.3% | 38 |
| labg.Cataclysm 2.05 | 4.2 | 11.5% | 43 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.4 | 9.0% | 14 |
| baal.nano.N 1.42 | 6.6 | 8.6% | 3 |
| zyx.micro.Ant 1.1 | 8.2 | 5.6% | 2 |
| sanja.First 0.1 | 9.1 | 4.9% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 73.3 | 9 / 35 | 3945 |
| 2 | 4 | 59.8 | 65.1 | 4 / 35 | 3739 |
| 3 | 3 | 61.3 | 70.2 | 9 / 35 | 3582 |
| 4 | 3 | 60.6 | 67.0 | 3 / 35 | 3996 |
| 5 | 2 | 63.6 | 76.5 | 8 / 35 | 3902 |
| 6 | 2 | 60.9 | 67.9 | 5 / 35 | 4037 |
| 7 | 2 | 58.7 | 63.8 | 5 / 35 | 3402 |
| 8 | 3 | 59.7 | 65.1 | 6 / 35 | 3477 |
| 9 | 2 | 60.1 | 67.6 | 7 / 35 | 3574 |
| 10 | 2 | 63.2 | 73.7 | 10 / 35 | 4028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 61 | 44% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 57% |
| labg.Cataclysm 2.05 | 19 | 53% |
| gre.svman4.Leonidas 1.3.2 | 13 | 69% |
| zyx.micro.Ant 1.1 | 3 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 2 | 0% |
| sanja.First 0.1 | 2 | 50% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 97 | 34% | 122 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 55 | 19% | 71 |
| gre.svman4.Leonidas 1.3.2 | 36 | 13% | 44 |
| labg.Cataclysm 2.05 | 33 | 12% | 45 |
| kinsen.melee.Angsaichmophobia 1.8c | 31 | 11% | 31 |
| baal.nano.N 1.42 | 20 | 7% | 20 |
| zyx.micro.Ant 1.1 | 10 | 4% | 12 |
| sanja.First 0.1 | 3 | 1% | 5 |

## Melee bench: F34

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 69.6 | 30 / 350 | 3.73 | 13.4% | 36705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.9% | 154 |
| kid.Gladiator .7.2 | 1.5 | 16.9% | 104 |
| hadur117.nano.SanaroDAE 0.3 | 3.3 | 13.4% | 30 |
| jcs.Seth 1.8 | 4.3 | 11.9% | 38 |
| tcf.Reach 3 | 4.7 | 11.4% | 17 |
| cli.Dancer 1.1 | 5.7 | 9.9% | 6 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 2 |
| amk.Punbot.Punbot 0.01 | 8.1 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.9 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.7 | 68.3 | 4 / 35 | 3910 |
| 2 | 3 | 62.4 | 70.2 | 8 / 35 | 3955 |
| 3 | 3 | 59.6 | 67.3 | 0 / 35 | 3541 |
| 4 | 3 | 60.7 | 69.5 | 3 / 35 | 3572 |
| 5 | 5 | 59.4 | 66.7 | 1 / 35 | 3227 |
| 6 | 3 | 63.7 | 75.9 | 3 / 35 | 4135 |
| 7 | 3 | 60.4 | 67.3 | 4 / 35 | 3352 |
| 8 | 3 | 61.0 | 69.2 | 4 / 35 | 3538 |
| 9 | 3 | 61.2 | 70.5 | 2 / 35 | 3596 |
| 10 | 3 | 61.5 | 71.4 | 1 / 35 | 3879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 49 | 37% |
| kid.Gladiator .7.2 | 31 | 23% |
| jcs.Seth 1.8 | 15 | 27% |
| tcf.Reach 3 | 6 | 17% |
| cli.Dancer 1.1 | 2 | 0% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 320 of 350 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 113 | 35% | 133 |
| kid.Gladiator .7.2 | 93 | 29% | 96 |
| jcs.Seth 1.8 | 47 | 15% | 50 |
| tcf.Reach 3 | 30 | 9% | 33 |
| cli.Dancer 1.1 | 19 | 6% | 20 |
| ratosh.Wesco 1.4 | 16 | 5% | 16 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |

## Melee bench: F35

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 66.5 | 10 / 350 | 4.01 | 12.0% | 26842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 21.1% | 296 |
| gh.mini.Gruwel 0.9 | 2.2 | 13.4% | 19 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.6 | 12.4% | 15 |
| hadur117.nano.SanaroDAE 0.3 | 3.9 | 12.0% | 10 |
| rz.HawkOnFire 0.1 | 4.3 | 11.6% | 4 |
| wit.Chuliath 1.0 | 6.7 | 7.1% | 4 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.1 | 5.6% | 1 |
| stelo.MyAgileRobot 0.2 | 8.6 | 5.1% | 1 |
| dans.Cinnamon 1.2 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 71.4 | 2 / 35 | 3014 |
| 2 | 4 | 57.8 | 66.0 | 1 / 35 | 2668 |
| 3 | 4 | 56.7 | 62.9 | 2 / 35 | 2585 |
| 4 | 4 | 58.5 | 66.0 | 0 / 35 | 3012 |
| 5 | 3 | 59.1 | 69.8 | 0 / 35 | 2839 |
| 6 | 4 | 57.0 | 63.5 | 0 / 35 | 2713 |
| 7 | 4 | 57.3 | 67.6 | 1 / 35 | 2389 |
| 8 | 5 | 55.2 | 61.3 | 2 / 35 | 2382 |
| 9 | 3 | 60.0 | 72.7 | 1 / 35 | 2854 |
| 10 | 5 | 56.2 | 63.8 | 1 / 35 | 2386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 66 | 3% |
| gh.mini.Gruwel 0.9 | 9 | 33% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 50% |
| rz.HawkOnFire 0.1 | 2 | 100% |
| wit.Chuliath 1.0 | 1 | 0% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 0% |

Hadur died in 340 of 350 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 131 | 39% | 130 |
| gh.mini.Gruwel 0.9 | 67 | 20% | 72 |
| rz.HawkOnFire 0.1 | 61 | 18% | 63 |
| dmh.robocode.robot.BlackDeath 9.2 | 51 | 15% | 55 |
| myl.nano.KomoriNinja 1.1 | 8 | 2% | 8 |
| wit.Chuliath 1.0 | 8 | 2% | 8 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 2% | 7 |
| stelo.MyAgileRobot 0.2 | 5 | 1% | 5 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 78.3 | 117 / 350 | 2.95 | 15.7% | 37502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroDAE 0.3 | 1.0 | 15.7% | 117 |
| alpha.RainingFire 1.0 | 3.0 | 12.6% | 58 |
| bzdp.Pansy 2.1 | 3.2 | 12.2% | 42 |
| mz.Cork 0.1 | 3.8 | 11.6% | 44 |
| bvh.micro.Freya 0.3 | 4.4 | 10.9% | 33 |
| m3thos.Eva02 0.7.1 | 5.9 | 9.8% | 21 |
| bvh.mini.Fenrir 0.39 | 6.8 | 9.1% | 9 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.9% | 7 |
| dl.BetterWalls 1.0 | 8.6 | 6.5% | 5 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.6% | 14 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 80.3 | 13 / 35 | 3661 |
| 2 | 1 | 65.6 | 84.1 | 16 / 35 | 3811 |
| 3 | 1 | 63.3 | 77.5 | 12 / 35 | 3849 |
| 4 | 1 | 63.5 | 78.1 | 10 / 35 | 3832 |
| 5 | 1 | 63.2 | 76.5 | 10 / 35 | 3858 |
| 6 | 1 | 63.5 | 76.5 | 15 / 35 | 3830 |
| 7 | 1 | 59.8 | 72.7 | 4 / 35 | 3403 |
| 8 | 1 | 65.1 | 81.9 | 14 / 35 | 3941 |
| 9 | 1 | 62.6 | 75.6 | 10 / 35 | 3653 |
| 10 | 1 | 64.1 | 79.7 | 13 / 35 | 3664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 36 | 69% |
| bzdp.Pansy 2.1 | 35 | 66% |
| mz.Cork 0.1 | 32 | 53% |
| alpha.RainingFire 1.0 | 29 | 21% |
| m3thos.Eva02 0.7.1 | 24 | 54% |
| bvh.mini.Fenrir 0.39 | 19 | 95% |
| sample.MyFirstRobot 1.0 | 12 | 58% |
| dl.BetterWalls 1.0 | 6 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 40% |

Hadur died in 233 of 350 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 57 | 24% | 67 |
| bzdp.Pansy 2.1 | 44 | 19% | 76 |
| mz.Cork 0.1 | 33 | 14% | 57 |
| bvh.micro.Freya 0.3 | 24 | 10% | 35 |
| m3thos.Eva02 0.7.1 | 23 | 10% | 41 |
| bvh.mini.Fenrir 0.39 | 20 | 9% | 26 |
| squidM.TentalceMeleeNano 1.1 | 15 | 6% | 18 |
| sample.MyFirstRobot 1.0 | 9 | 4% | 12 |
| dl.BetterWalls 1.0 | 8 | 3% | 18 |

## Melee bench: F37

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 79.0 | 143 / 350 | 2.89 | 15.8% | 43599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroDAE 0.3 | 1.0 | 15.8% | 143 |
| germ.TheMind .2 | 2.7 | 11.4% | 45 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.1 | 10.7% | 25 |
| agrach.Dalek 1.0 | 4.2 | 10.2% | 44 |
| EBBU.Sim2 1.02 | 5.3 | 9.8% | 20 |
| stelo.UntouchableNano 1.3 | 5.4 | 9.5% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 7.1 | 8.5% | 3 |
| lmk.ACPFinal 0.1 | 8.1 | 8.2% | 12 |
| mb.Beast 0.1 | 8.1 | 8.2% | 14 |
| skm.Ryubot 1.0 | 9.0 | 7.7% | 14 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 78.7 | 13 / 35 | 4118 |
| 2 | 1 | 64.3 | 81.6 | 18 / 35 | 4488 |
| 3 | 1 | 61.0 | 72.1 | 13 / 35 | 4253 |
| 4 | 1 | 64.2 | 85.1 | 15 / 35 | 4232 |
| 5 | 1 | 66.0 | 86.7 | 17 / 35 | 4935 |
| 6 | 1 | 61.0 | 73.3 | 10 / 35 | 4351 |
| 7 | 1 | 61.3 | 72.7 | 12 / 35 | 4318 |
| 8 | 1 | 63.9 | 81.6 | 14 / 35 | 4511 |
| 9 | 1 | 64.0 | 80.6 | 15 / 35 | 4578 |
| 10 | 1 | 61.9 | 77.8 | 16 / 35 | 3815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 41 | 59% |
| EBBU.Sim2 1.02 | 34 | 65% |
| com.syncleus.robocode.Dreadnaught 0.1 | 33 | 70% |
| stelo.UntouchableNano 1.3 | 29 | 59% |
| agrach.Dalek 1.0 | 26 | 58% |
| mb.Beast 0.1 | 20 | 95% |
| skm.Ryubot 1.0 | 17 | 76% |
| lmk.ACPFinal 0.1 | 8 | 63% |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 83% |

Hadur died in 210 of 350 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 39 | 19% | 55 |
| com.syncleus.robocode.Dreadnaught 0.1 | 29 | 14% | 61 |
| agrach.Dalek 1.0 | 29 | 14% | 59 |
| EBBU.Sim2 1.02 | 26 | 12% | 42 |
| stelo.UntouchableNano 1.3 | 21 | 10% | 31 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 10% | 25 |
| mb.Beast 0.1 | 19 | 9% | 40 |
| lmk.ACPFinal 0.1 | 19 | 9% | 23 |
| skm.Ryubot 1.0 | 7 | 3% | 11 |

## Melee bench: F38

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 63.7 | 39 / 350 | 4.27 | 11.9% | 28631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.4% | 146 |
| bvh.mini.Freya 0.55 | 2.1 | 13.8% | 51 |
| hadur117.nano.SanaroDAE 0.3 | 3.9 | 11.9% | 39 |
| cs.Wren 1.0 | 4.4 | 11.8% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.9 | 10.8% | 23 |
| bts.mega.Gnarly 1.4 | 4.9 | 11.4% | 43 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.1% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.4 | 6.0% | 2 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.6% | 1 |
| bzdp.BoxCar 2.0 | 9.3 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.5 | 60.6 | 3 / 35 | 3073 |
| 2 | 7 | 51.7 | 53.7 | 1 / 35 | 2519 |
| 3 | 4 | 55.9 | 60.6 | 6 / 35 | 2736 |
| 4 | 4 | 57.8 | 67.9 | 4 / 35 | 2658 |
| 5 | 5 | 55.2 | 60.6 | 2 / 35 | 2671 |
| 6 | 3 | 56.4 | 62.5 | 4 / 35 | 2881 |
| 7 | 3 | 57.8 | 66.0 | 5 / 35 | 2716 |
| 8 | 3 | 57.9 | 66.3 | 2 / 35 | 3100 |
| 9 | 3 | 58.5 | 68.3 | 5 / 35 | 2823 |
| 10 | 3 | 60.4 | 69.8 | 7 / 35 | 3454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 52 | 40% |
| bts.mega.Gnarly 1.4 | 16 | 19% |
| cs.Wren 1.0 | 12 | 33% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 17% |
| bvh.mini.Freya 0.55 | 11 | 45% |
| kdf.KoulDestroyer 1.0 | 2 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 76 | 24% | 97 |
| bvh.mini.Freya 0.55 | 59 | 19% | 64 |
| bts.mega.Gnarly 1.4 | 50 | 16% | 54 |
| cs.Wren 1.0 | 44 | 14% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 13% | 42 |
| kdf.KoulDestroyer 1.0 | 29 | 9% | 29 |
| kawigi.spare.SpareParts 0.7.6nosnd | 10 | 3% | 12 |
| bzdp.BoxCar 2.0 | 3 | 1% | 3 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 3 |

## Melee bench: F39

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 63.8 | 37 / 350 | 4.25 | 12.1% | 31463 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.5 | 15.0% | 70 |
| az.Ololobot 0.2.4 | 2.0 | 13.8% | 131 |
| hadur117.nano.SanaroDAE 0.3 | 3.4 | 12.1% | 37 |
| catcat20.Lambda 0.024 | 3.5 | 12.1% | 60 |
| stelo.SoRobotNanoMelee 1.2 | 5.4 | 10.1% | 36 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.9% | 9 |
| gimp.GimpBot 0.1 | 6.9 | 8.5% | 3 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.3% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.9 | 63.8 | 3 / 35 | 2864 |
| 2 | 4 | 53.5 | 56.2 | 1 / 35 | 3164 |
| 3 | 3 | 56.3 | 64.8 | 2 / 35 | 2998 |
| 4 | 3 | 57.9 | 66.7 | 3 / 35 | 3388 |
| 5 | 4 | 56.0 | 61.9 | 5 / 35 | 3121 |
| 6 | 2 | 59.9 | 70.8 | 7 / 35 | 3424 |
| 7 | 4 | 57.2 | 66.0 | 2 / 35 | 3210 |
| 8 | 4 | 54.7 | 59.4 | 4 / 35 | 3019 |
| 9 | 3 | 57.7 | 67.0 | 6 / 35 | 2999 |
| 10 | 3 | 56.5 | 61.9 | 4 / 35 | 3276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Lambda 0.024 | 33 | 36% |
| az.Ololobot 0.2.4 | 32 | 3% |
| bvh.fry.Freya 0.82 | 17 | 59% |
| gimp.GimpBot 0.1 | 8 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 29% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| apollokidd.ApolloKidd 0.9 | 3 | 33% |

Hadur died in 314 of 350 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 94 | 30% | 103 |
| az.Ololobot 0.2.4 | 67 | 21% | 70 |
| stelo.SoRobotNanoMelee 1.2 | 42 | 13% | 42 |
| catcat20.Lambda 0.024 | 41 | 13% | 46 |
| apollokidd.ApolloKidd 0.9 | 33 | 11% | 34 |
| winamp32.micro.MicroMacro 1.0 | 16 | 5% | 24 |
| gimp.GimpBot 0.1 | 10 | 3% | 18 |
| whitesquare.robots.SkynetAdvanced 1.1 | 7 | 2% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 4 | 1% | 4 |

## Melee bench: F41

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 69.2 | 56 / 350 | 3.77 | 13.3% | 31687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.9% | 181 |
| ary.Swarm 1.1 | 2.9 | 13.5% | 27 |
| hadur117.nano.SanaroDAE 0.3 | 3.2 | 13.3% | 56 |
| lessonz.robocode.Oz 0.5.0 | 3.4 | 13.1% | 33 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 12.0% | 39 |
| shrub.Silver v048 | 6.0 | 9.0% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 8.4 | 6.2% | 8 |
| stelo.Mirror 1.1 | 8.6 | 5.7% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 70.5 | 3 / 35 | 3036 |
| 2 | 4 | 60.3 | 66.7 | 5 / 35 | 3392 |
| 3 | 5 | 58.8 | 63.8 | 6 / 35 | 3171 |
| 4 | 2 | 61.2 | 70.8 | 7 / 35 | 3413 |
| 5 | 5 | 59.0 | 66.7 | 4 / 35 | 3202 |
| 6 | 2 | 59.9 | 70.2 | 4 / 35 | 3002 |
| 7 | 3 | 60.2 | 70.2 | 6 / 35 | 3047 |
| 8 | 3 | 60.1 | 66.7 | 7 / 35 | 3259 |
| 9 | 3 | 60.5 | 71.4 | 3 / 35 | 3229 |
| 10 | 2 | 62.2 | 75.2 | 11 / 35 | 2936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 70 | 9% |
| lessonz.robocode.Oz 0.5.0 | 25 | 76% |
| ary.Swarm 1.1 | 25 | 68% |
| simonton.nano.MeleeSeed 1.8 | 13 | 62% |
| shrub.Silver v048 | 5 | 20% |
| jsal.Jsalbot 1.0 | 4 | 25% |
| stelo.Mirror 1.1 | 4 | 75% |
| zyx.nano.Ant 1.1 | 2 | 50% |

Hadur died in 296 of 350 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 108 | 36% | 114 |
| ary.Swarm 1.1 | 67 | 23% | 85 |
| simonton.nano.MeleeSeed 1.8 | 39 | 13% | 46 |
| lessonz.robocode.Oz 0.5.0 | 38 | 13% | 50 |
| zyx.nano.Ant 1.1 | 18 | 6% | 20 |
| shrub.Silver v048 | 14 | 5% | 17 |
| jsal.Jsalbot 1.0 | 8 | 3% | 11 |
| stelo.Mirror 1.1 | 3 | 1% | 6 |
| acogdev.alpha 0.2 | 1 | 0% | 1 |

## Melee bench: F42

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 68.6 | 39 / 350 | 3.82 | 13.3% | 36327 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.6% | 180 |
| maribo.mini.MiniQuester 0.1 | 2.6 | 14.4% | 36 |
| ara.Shera 0.88 | 2.8 | 14.4% | 79 |
| hadur117.nano.SanaroDAE 0.3 | 3.6 | 13.3% | 39 |
| amz.NanoClone 1.41 | 5.1 | 9.1% | 6 |
| dsw.StaticD 1.0 | 6.3 | 7.5% | 8 |
| maribo.IotaCT 1.1 | 6.8 | 7.2% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.8 | 5.5% | 0 |
| stelo.MirrorMicro 1.0 | 9.0 | 5.5% | 1 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 75.9 | 9 / 35 | 3882 |
| 2 | 4 | 59.2 | 67.6 | 2 / 35 | 3507 |
| 3 | 4 | 60.5 | 69.8 | 6 / 35 | 3638 |
| 4 | 4 | 61.6 | 73.0 | 6 / 35 | 3796 |
| 5 | 4 | 59.2 | 67.3 | 2 / 35 | 3521 |
| 6 | 3 | 59.1 | 67.0 | 2 / 35 | 3699 |
| 7 | 4 | 59.4 | 67.0 | 3 / 35 | 3738 |
| 8 | 4 | 57.3 | 62.9 | 3 / 35 | 3171 |
| 9 | 3 | 61.5 | 72.7 | 4 / 35 | 3939 |
| 10 | 4 | 57.7 | 63.2 | 2 / 35 | 3436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 56 | 16% |
| ara.Shera 0.88 | 35 | 31% |
| maribo.mini.MiniQuester 0.1 | 26 | 54% |
| amz.NanoClone 1.41 | 3 | 33% |
| dsw.StaticD 1.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 311 of 350 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 101 | 32% | 111 |
| ara.Shera 0.88 | 79 | 25% | 85 |
| maribo.mini.MiniQuester 0.1 | 68 | 22% | 83 |
| amz.NanoClone 1.41 | 24 | 8% | 25 |
| maribo.IotaCT 1.1 | 11 | 4% | 14 |
| dsw.StaticD 1.0 | 11 | 4% | 13 |
| stelo.MirrorMicro 1.0 | 6 | 2% | 6 |
| mme.NikeEnhanced 2.0 | 6 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 2% | 7 |

## Melee bench: F43

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 60.9 | 8 / 350 | 4.52 | 11.2% | 27436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 269 |
| brainfade.melee.Dusk 0.44 | 2.3 | 13.3% | 47 |
| dummy.micro.Sparrow 2.5 | 2.9 | 12.7% | 13 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.5% | 8 |
| hadur117.nano.SanaroDAE 0.3 | 4.8 | 11.2% | 8 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 10.3% | 3 |
| mz.NanoGod 2.02 | 7.3 | 7.4% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.5% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.1 | 61.3 | 0 / 35 | 2543 |
| 2 | 5 | 56.2 | 57.1 | 1 / 35 | 2712 |
| 3 | 5 | 55.6 | 55.9 | 1 / 35 | 2642 |
| 4 | 6 | 55.2 | 54.3 | 2 / 35 | 2692 |
| 5 | 3 | 61.0 | 70.8 | 0 / 35 | 3064 |
| 6 | 4 | 59.4 | 66.3 | 2 / 35 | 2899 |
| 7 | 4 | 59.2 | 65.4 | 0 / 35 | 2720 |
| 8 | 6 | 55.4 | 56.8 | 0 / 35 | 2589 |
| 9 | 5 | 56.7 | 60.0 | 1 / 35 | 2741 |
| 10 | 5 | 57.7 | 60.6 | 1 / 35 | 2834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 51 | 4% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 20% |
| dummy.micro.Sparrow 2.5 | 5 | 80% |
| brainfade.melee.Dusk 0.44 | 3 | 33% |

Hadur died in 342 of 350 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 149 | 44% | 151 |
| brainfade.melee.Dusk 0.44 | 51 | 15% | 53 |
| dummy.micro.Sparrow 2.5 | 49 | 14% | 52 |
| wcsv.melee.EngineerMelee 0.1 | 36 | 11% | 36 |
| Krabb.akim2.Akim2 1.1b | 22 | 6% | 23 |
| mz.NanoGod 2.02 | 20 | 6% | 20 |
| jab.DiamondStealer 5 | 13 | 4% | 13 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 70.3 | 53 / 350 | 3.67 | 13.9% | 36770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 17.0% | 167 |
| tzu.TheArtOfWar 1.2 | 2.3 | 15.1% | 86 |
| hadur117.nano.SanaroDAE 0.3 | 2.6 | 13.9% | 53 |
| wompi.Quokka 1.6 | 4.5 | 10.8% | 8 |
| jwirde.Gort 2.0 | 5.0 | 10.2% | 27 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 9.2% | 2 |
| disan.Chair 2.2.0 | 7.0 | 7.9% | 7 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.7% | 1 |
| sample.Crazy 1.0 | 9.5 | 4.6% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 71.4 | 9 / 35 | 3877 |
| 2 | 2 | 62.3 | 75.6 | 7 / 35 | 3704 |
| 3 | 3 | 61.5 | 73.0 | 4 / 35 | 3653 |
| 4 | 2 | 61.4 | 72.7 | 6 / 35 | 3590 |
| 5 | 3 | 57.1 | 62.5 | 2 / 35 | 3068 |
| 6 | 3 | 60.0 | 67.0 | 4 / 35 | 3784 |
| 7 | 3 | 60.2 | 68.3 | 4 / 35 | 3640 |
| 8 | 2 | 62.9 | 74.9 | 7 / 35 | 4080 |
| 9 | 3 | 61.4 | 71.4 | 5 / 35 | 3781 |
| 10 | 3 | 60.0 | 66.7 | 5 / 35 | 3593 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 72 | 28% |
| tzu.TheArtOfWar 1.2 | 37 | 32% |
| jwirde.Gort 2.0 | 13 | 46% |
| wompi.Quokka 1.6 | 10 | 90% |
| disan.Chair 2.2.0 | 4 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 299 of 350 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 131 | 44% | 153 |
| tzu.TheArtOfWar 1.2 | 78 | 26% | 89 |
| jwirde.Gort 2.0 | 27 | 9% | 33 |
| wompi.Quokka 1.6 | 19 | 6% | 27 |
| disan.Chair 2.2.0 | 13 | 4% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 3% | 11 |
| stf.PanzerGeneral 0.1 | 9 | 3% | 11 |
| amk.jointstrike.JointStrike 0.2 | 6 | 2% | 6 |
| sample.Crazy 1.0 | 4 | 1% | 7 |
2 death(s) with no robot to name.

## Melee bench: F45

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 67.6 | 27 / 350 | 3.92 | 13.8% | 39750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 1.7 | 13.9% | 207 |
| hadur117.nano.SanaroDAE 0.3 | 1.9 | 13.8% | 27 |
| jje.BagPuss 1.2 | 2.9 | 12.8% | 23 |
| sul.Lunar 1.1 | 4.0 | 11.7% | 49 |
| myl.nano.Graviton 1.10 | 4.5 | 10.8% | 11 |
| hvilela.HVilela 0.9 | 6.6 | 8.7% | 1 |
| fm.claire 1.7 | 7.3 | 8.3% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 7.8% | 12 |
| wit.Deep7 2.0 | 8.4 | 7.0% | 21 |
| abud.ThirdRobo 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 71.1 | 3 / 35 | 3926 |
| 2 | 1 | 60.8 | 69.8 | 1 / 35 | 4289 |
| 3 | 1 | 61.0 | 71.7 | 3 / 35 | 3945 |
| 4 | 1 | 60.5 | 69.2 | 3 / 35 | 4061 |
| 5 | 1 | 61.1 | 69.8 | 5 / 35 | 3995 |
| 6 | 2 | 58.8 | 66.3 | 0 / 35 | 3746 |
| 7 | 5 | 53.9 | 53.3 | 3 / 35 | 3388 |
| 8 | 3 | 60.4 | 67.9 | 2 / 35 | 3974 |
| 9 | 3 | 59.2 | 65.1 | 2 / 35 | 4096 |
| 10 | 1 | 62.1 | 71.1 | 5 / 35 | 4330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 70 | 7% |
| jje.BagPuss 1.2 | 16 | 56% |
| sul.Lunar 1.1 | 13 | 0% |
| myl.nano.Graviton 1.10 | 11 | 55% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 75% |
| wit.Deep7 2.0 | 4 | 0% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 323 of 350 rounds, at a mean tick of 1114. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 73 | 23% | 0 |
| jje.BagPuss 1.2 | 68 | 21% | 107 |
| sul.Lunar 1.1 | 66 | 20% | 90 |
| myl.nano.Graviton 1.10 | 39 | 12% | 58 |
| hvilela.HVilela 0.9 | 22 | 7% | 26 |
| pez.mini.ChironexFleckeri 0.5 | 17 | 5% | 21 |
| fm.claire 1.7 | 17 | 5% | 19 |
| wit.Deep7 2.0 | 12 | 4% | 15 |
| abud.ThirdRobo 1.0 | 9 | 3% | 11 |

## Melee bench: F46

hadur117.nano.SanaroDAE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 68.6 | 22 / 350 | 3.83 | 12.6% | 30262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.4 | 18.0% | 148 |
| rsalesc.melee.Medina 0.4.5 | 1.6 | 17.5% | 144 |
| hadur117.nano.SanaroDAE 0.3 | 3.1 | 12.6% | 22 |
| mz.MicroSheep 1.0 | 4.5 | 10.6% | 5 |
| cx.Princess 1.0 | 4.9 | 10.2% | 27 |
| sadoner.killer 0.2 | 5.8 | 9.1% | 1 |
| arthord.NanoSatanMelee Beta | 6.9 | 7.6% | 3 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.2 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 69.2 | 2 / 35 | 3019 |
| 2 | 3 | 59.2 | 68.9 | 2 / 35 | 3164 |
| 3 | 3 | 58.2 | 66.0 | 2 / 35 | 3117 |
| 4 | 3 | 59.5 | 67.9 | 4 / 35 | 3283 |
| 5 | 3 | 59.0 | 70.8 | 3 / 35 | 2577 |
| 6 | 3 | 59.3 | 67.6 | 1 / 35 | 3411 |
| 7 | 3 | 60.7 | 73.0 | 3 / 35 | 3203 |
| 8 | 3 | 60.7 | 73.0 | 2 / 35 | 3295 |
| 9 | 3 | 58.3 | 69.8 | 3 / 35 | 2490 |
| 10 | 4 | 55.3 | 59.4 | 0 / 35 | 2703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 55 | 18% |
| rsalesc.melee.Medina 0.4.5 | 36 | 22% |
| cx.Princess 1.0 | 10 | 20% |
| mz.MicroSheep 1.0 | 3 | 0% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 328 of 350 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 141 | 43% | 148 |
| rsalesc.melee.Medina 0.4.5 | 82 | 25% | 92 |
| mz.MicroSheep 1.0 | 33 | 10% | 34 |
| cx.Princess 1.0 | 31 | 9% | 31 |
| sadoner.killer 0.2 | 15 | 5% | 18 |
| arthord.NanoSatanMelee Beta | 10 | 3% | 10 |
| jeremyreeder.collective.Prophet 5 | 8 | 2% | 8 |
| kurios.DOSexe .9a | 6 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |

