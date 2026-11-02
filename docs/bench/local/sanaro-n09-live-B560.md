# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 77.6 | 66 / 350 | 3.01 | 14.2% | 34604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 232 |
| hadur117.nano.SanaroB560 0.3 | 2.0 | 14.2% | 66 |
| sgp.JollyNinja 3.53 | 3.4 | 11.8% | 33 |
| mz.MicroGodMelee 1 | 4.4 | 10.8% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.4 | 11.1% | 8 |
| lorneswork.Predator 1.0 | 5.8 | 9.9% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.6% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 77.1 | 5 / 35 | 3690 |
| 2 | 2 | 61.8 | 72.7 | 8 / 35 | 3596 |
| 3 | 2 | 62.0 | 78.4 | 7 / 35 | 3369 |
| 4 | 2 | 61.8 | 78.4 | 5 / 35 | 3185 |
| 5 | 2 | 62.8 | 79.4 | 3 / 35 | 3689 |
| 6 | 2 | 61.6 | 74.9 | 7 / 35 | 3483 |
| 7 | 2 | 63.6 | 81.3 | 12 / 35 | 3462 |
| 8 | 2 | 61.2 | 74.9 | 5 / 35 | 3381 |
| 9 | 2 | 62.3 | 79.4 | 7 / 35 | 3181 |
| 10 | 2 | 63.0 | 79.7 | 7 / 35 | 3568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 165 | 21% |
| sgp.JollyNinja 3.53 | 18 | 39% |
| mz.MicroGodMelee 1 | 11 | 91% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 80% |
| lorneswork.Predator 1.0 | 6 | 67% |
| adt.Ar2 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 1117. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 171 | 60% | 207 |
| sgp.JollyNinja 3.53 | 36 | 13% | 44 |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 8% | 26 |
| lorneswork.Predator 1.0 | 23 | 8% | 30 |
| mz.MicroGodMelee 1 | 14 | 5% | 24 |
| adt.Ar2 1.0 | 9 | 3% | 11 |
| skm.butterfly 1.0 | 4 | 1% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 71.3 | 91 / 350 | 3.58 | 14.0% | 34480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.6 | 14.8% | 93 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.9 | 14.7% | 69 |
| hadur117.nano.SanaroB560 0.3 | 2.5 | 14.0% | 91 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.5% | 6 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.9% | 20 |
| fnc.bandit.Bandit 5.2.0 | 6.6 | 8.7% | 8 |
| sch.Simone 0.3d | 7.1 | 8.0% | 24 |
| Noran.BitchingElk 0.054 | 7.4 | 7.8% | 22 |
| stelo.PatternRobot 1.0 | 8.4 | 6.9% | 14 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 70.5 | 6 / 35 | 3365 |
| 2 | 2 | 61.6 | 75.2 | 11 / 35 | 3337 |
| 3 | 3 | 62.3 | 74.6 | 12 / 35 | 3429 |
| 4 | 2 | 60.8 | 68.9 | 9 / 35 | 3882 |
| 5 | 3 | 58.0 | 67.0 | 9 / 35 | 2789 |
| 6 | 3 | 58.5 | 66.7 | 7 / 35 | 3283 |
| 7 | 3 | 59.5 | 65.1 | 8 / 35 | 3725 |
| 8 | 2 | 63.3 | 79.0 | 7 / 35 | 3850 |
| 9 | 1 | 62.3 | 75.6 | 13 / 35 | 3425 |
| 10 | 3 | 60.7 | 70.8 | 9 / 35 | 3395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 53 | 58% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 51 | 41% |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 80% |
| sch.Simone 0.3d | 14 | 50% |
| Noran.BitchingElk 0.054 | 14 | 50% |
| fnc.bandit.Bandit 5.2.0 | 7 | 57% |
| stelo.PatternRobot 1.0 | 7 | 43% |
| fullsail.SweetTea 1.1 | 2 | 0% |
| lrem.micro.SpikeSoldier 0.4 | 2 | 100% |

Hadur died in 260 of 350 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 60 | 23% | 80 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 58 | 22% | 82 |
| lrem.micro.SpikeSoldier 0.4 | 29 | 11% | 32 |
| stelo.PatternRobot 1.0 | 27 | 10% | 30 |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 8% | 40 |
| sch.Simone 0.3d | 20 | 8% | 29 |
| fnc.bandit.Bandit 5.2.0 | 20 | 8% | 24 |
| Noran.BitchingElk 0.054 | 16 | 6% | 24 |
| fullsail.SweetTea 1.1 | 8 | 3% | 9 |

## Melee bench: F03

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 76.9 | 85 / 350 | 3.08 | 14.4% | 35797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 2.0 | 15.0% | 82 |
| hadur117.nano.SanaroB560 0.3 | 2.4 | 14.4% | 85 |
| kawigi.nano.Lib 1.0 | 2.5 | 14.6% | 84 |
| vuen.Cake 2.51 | 3.1 | 13.5% | 79 |
| urdos.URDOS 1.3 | 5.0 | 10.4% | 11 |
| adt.Ar1 2.1 | 6.6 | 7.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.9% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 7.4% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.8% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 77.8 | 10 / 35 | 3574 |
| 2 | 2 | 63.4 | 81.6 | 9 / 35 | 3767 |
| 3 | 2 | 62.2 | 79.4 | 8 / 35 | 3783 |
| 4 | 2 | 60.9 | 76.2 | 9 / 35 | 3402 |
| 5 | 4 | 59.2 | 68.6 | 6 / 35 | 3426 |
| 6 | 4 | 59.2 | 69.5 | 4 / 35 | 3661 |
| 7 | 2 | 63.5 | 82.5 | 11 / 35 | 3591 |
| 8 | 3 | 60.6 | 74.6 | 8 / 35 | 3361 |
| 9 | 1 | 63.6 | 81.3 | 12 / 35 | 3772 |
| 10 | 2 | 61.7 | 77.8 | 8 / 35 | 3460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 67 | 54% |
| vuen.Cake 2.51 | 48 | 50% |
| kawigi.nano.Lib 1.0 | 43 | 14% |
| urdos.URDOS 1.3 | 17 | 71% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 50% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 266 of 350 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 88 | 33% | 98 |
| radnor.DoctorBob 1.42 | 68 | 26% | 94 |
| vuen.Cake 2.51 | 46 | 17% | 74 |
| urdos.URDOS 1.3 | 32 | 12% | 42 |
| adt.Ar1 2.1 | 12 | 5% | 13 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 4% | 13 |
| oa.weak.FlyMk1 0.1 | 6 | 2% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 1% | 1 |

## Melee bench: F04

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 75.6 | 16 / 350 | 3.20 | 14.0% | 39156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.6% | 320 |
| hadur117.nano.SanaroB560 0.3 | 2.2 | 14.0% | 16 |
| apc.LeeroyJenkins2 1.0 | 2.8 | 13.2% | 11 |
| TNT.TNT 0.99.1 | 4.1 | 10.6% | 2 |
| josago.Jorgito 0.16 | 5.1 | 9.3% | 1 |
| tj.zombie1n 1.0.1 | 6.4 | 7.4% | 0 |
| css.Delitioner 0.11 | 6.5 | 7.5% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 75.6 | 0 / 35 | 3798 |
| 2 | 2 | 60.7 | 70.2 | 0 / 35 | 3723 |
| 3 | 2 | 64.6 | 82.9 | 1 / 35 | 4073 |
| 4 | 2 | 63.1 | 74.6 | 5 / 35 | 4066 |
| 5 | 2 | 64.0 | 77.8 | 2 / 35 | 4285 |
| 6 | 2 | 62.0 | 74.6 | 1 / 35 | 3742 |
| 7 | 2 | 62.7 | 78.1 | 2 / 35 | 3451 |
| 8 | 3 | 62.2 | 73.3 | 0 / 35 | 3984 |
| 9 | 2 | 62.7 | 74.3 | 3 / 35 | 4173 |
| 10 | 3 | 62.2 | 74.3 | 2 / 35 | 3861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 197 | 5% |
| TNT.TNT 0.99.1 | 3 | 67% |
| apc.LeeroyJenkins2 1.0 | 3 | 67% |
| josago.Jorgito 0.16 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 334 of 350 rounds, at a mean tick of 1293. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 246 | 74% | 258 |
| apc.LeeroyJenkins2 1.0 | 33 | 10% | 35 |
| josago.Jorgito 0.16 | 15 | 4% | 16 |
| TNT.TNT 0.99.1 | 14 | 4% | 15 |
| css.Delitioner 0.11 | 13 | 4% | 13 |
| tj.zombie1n 1.0.1 | 6 | 2% | 6 |
| rampancy.Durandal 2.1d | 4 | 1% | 4 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 76.0 | 118 / 350 | 3.16 | 14.6% | 31647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.6 | 15.4% | 71 |
| hadur117.nano.SanaroB560 0.3 | 1.9 | 14.6% | 118 |
| origin.SleepSiphon 1.7b | 2.5 | 14.0% | 97 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.4 | 11.9% | 30 |
| mld.Wisdom 1.0 | 4.6 | 11.3% | 10 |
| gg.Wolverine 2.0 | 6.4 | 8.6% | 7 |
| spinnercat.Omen 1.0 | 7.4 | 7.6% | 3 |
| DBall.NUKE 0.1 | 7.8 | 7.0% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 8.4 | 6.6% | 7 |
| sample.Fire 1.0 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 80.3 | 13 / 35 | 3278 |
| 2 | 2 | 59.8 | 70.8 | 8 / 35 | 3061 |
| 3 | 3 | 59.7 | 69.5 | 11 / 35 | 2972 |
| 4 | 1 | 63.1 | 79.7 | 15 / 35 | 2936 |
| 5 | 1 | 64.9 | 83.2 | 17 / 35 | 3386 |
| 6 | 3 | 60.0 | 73.3 | 5 / 35 | 2951 |
| 7 | 1 | 64.5 | 81.0 | 12 / 35 | 3788 |
| 8 | 2 | 61.0 | 73.7 | 11 / 35 | 2990 |
| 9 | 3 | 61.1 | 72.7 | 12 / 35 | 3203 |
| 10 | 2 | 62.6 | 76.2 | 14 / 35 | 3082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 68 | 66% |
| origin.SleepSiphon 1.7b | 58 | 52% |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 73% |
| gg.Wolverine 2.0 | 10 | 70% |
| DBall.NUKE 0.1 | 8 | 75% |
| spinnercat.Omen 1.0 | 3 | 67% |
| mld.Wisdom 1.0 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 100% |

Hadur died in 232 of 350 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 77 | 33% | 106 |
| origin.SleepSiphon 1.7b | 54 | 23% | 89 |
| pe.minimelee.SandboxMiniMelee 1.1 | 45 | 19% | 68 |
| mld.Wisdom 1.0 | 28 | 12% | 37 |
| gg.Wolverine 2.0 | 13 | 6% | 19 |
| DBall.NUKE 0.1 | 8 | 3% | 15 |
| spinnercat.Omen 1.0 | 5 | 2% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 0% | 7 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroB560 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.3 | 150 / 350 | 2.09 | 19.0% | 42854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.0 | 21.2% | 97 |
| hadur117.nano.SanaroB560 0.3 | 2.0 | 19.0% | 150 |
| franzor.Lizt 1.3.1 | 3.4 | 13.8% | 67 |
| oog.melee.CapuletDroid 1.1 | 3.6 | 13.9% | 33 |
| lrem.micro.MoggFanatic 0.2 | 5.1 | 10.5% | 1 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.5% | 0 |
| skm.PateranBotlock2 1.0 | 6.9 | 6.8% | 1 |
| sample.Target 1.0 | 8.5 | 3.1% | 1 |
| drd.Dreadknoght 0.9 | 8.5 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 85.0 | 12 / 35 | 4245 |
| 2 | 2 | 67.0 | 85.7 | 15 / 35 | 3994 |
| 3 | 2 | 68.9 | 87.5 | 15 / 35 | 4933 |
| 4 | 2 | 68.6 | 90.4 | 17 / 35 | 4043 |
| 5 | 2 | 67.1 | 85.0 | 14 / 35 | 3964 |
| 6 | 2 | 67.6 | 85.0 | 17 / 35 | 4456 |
| 7 | 2 | 68.5 | 88.2 | 15 / 35 | 4253 |
| 8 | 2 | 66.8 | 83.2 | 13 / 35 | 3988 |
| 9 | 2 | 68.9 | 87.9 | 18 / 35 | 4620 |
| 10 | 2 | 67.6 | 85.4 | 14 / 35 | 4358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 128 | 57% |
| oog.melee.CapuletDroid 1.1 | 65 | 75% |
| franzor.Lizt 1.3.1 | 52 | 50% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 202 of 350 rounds, at a mean tick of 1636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 112 | 55% | 224 |
| oog.melee.CapuletDroid 1.1 | 47 | 23% | 98 |
| franzor.Lizt 1.3.1 | 29 | 14% | 1 |
| skm.PateranBotlock2 1.0 | 6 | 3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 4 | 2% | 7 |
| exauge.GateKeeper 1.1.121g | 3 | 1% | 9 |
| drd.Dreadknoght 0.9 | 1 | 0% | 3 |

## Melee bench: F08

hadur117.nano.SanaroB560 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 77.0 | 117 / 350 | 2.84 | 16.4% | 31867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.6 | 16.3% | 99 |
| hadur117.nano.SanaroB560 0.3 | 1.9 | 16.4% | 117 |
| shrub.Vapour v159 | 2.5 | 15.6% | 74 |
| com.spp.robocode.MostlyHarmless 010 | 4.2 | 11.2% | 24 |
| jwst.DAD.DarkAndDarker 1.1 | 5.3 | 9.9% | 15 |
| m3thos.Eva00 1.1 | 5.5 | 9.8% | 14 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 7.1% | 3 |
| SHAM.WOW 1.4 | 7.8 | 7.3% | 3 |
| zyx.nano.BacillusComma 1.0 | 8.4 | 6.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 75.0 | 12 / 35 | 3127 |
| 2 | 2 | 62.5 | 76.1 | 12 / 35 | 3440 |
| 3 | 1 | 64.4 | 84.3 | 12 / 35 | 3290 |
| 4 | 3 | 60.4 | 71.1 | 12 / 35 | 3176 |
| 5 | 1 | 63.7 | 83.2 | 17 / 35 | 3098 |
| 6 | 1 | 65.2 | 85.4 | 14 / 35 | 3571 |
| 7 | 3 | 61.9 | 75.0 | 10 / 35 | 3212 |
| 8 | 3 | 58.1 | 70.7 | 7 / 35 | 2618 |
| 9 | 2 | 61.2 | 74.6 | 11 / 35 | 3106 |
| 10 | 1 | 60.9 | 74.6 | 10 / 35 | 3229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 90 | 60% |
| shrub.Vapour v159 | 52 | 40% |
| com.spp.robocode.MostlyHarmless 010 | 24 | 63% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 79% |
| m3thos.Eva00 1.1 | 11 | 36% |
| SHAM.WOW 1.4 | 9 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |

Hadur died in 237 of 350 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 73 | 31% | 125 |
| shrub.Vapour v159 | 71 | 30% | 87 |
| com.spp.robocode.MostlyHarmless 010 | 28 | 12% | 46 |
| jwst.DAD.DarkAndDarker 1.1 | 21 | 9% | 35 |
| m3thos.Eva00 1.1 | 21 | 9% | 24 |
| qualidafial.MajorDick 1.0.1 | 9 | 4% | 10 |
| zyx.nano.BacillusComma 1.0 | 8 | 3% | 10 |
| SHAM.WOW 1.4 | 6 | 3% | 12 |

## Melee bench: F09

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 65.0 | 53 / 350 | 4.15 | 12.2% | 25771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 18.4% | 198 |
| kc.micro.Figment 1.0 | 2.0 | 14.6% | 53 |
| hadur117.nano.SanaroB560 0.3 | 3.3 | 12.2% | 53 |
| pedersen.Grishnakh 1.0 | 4.3 | 11.4% | 29 |
| yagami.Tidus 0.11 | 4.5 | 11.1% | 1 |
| mc2.enemy.Original 0.9 | 5.8 | 9.2% | 14 |
| dft.Calliope 5.6 | 7.1 | 7.7% | 2 |
| step.nanoPri 1.0 | 8.4 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.5 | 5.5% | 0 |
| rdm.Dueler 0.4x | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.9 | 61.6 | 2 / 35 | 2389 |
| 2 | 3 | 57.7 | 67.0 | 6 / 35 | 2395 |
| 3 | 3 | 55.8 | 56.5 | 7 / 35 | 2746 |
| 4 | 3 | 58.4 | 67.9 | 4 / 35 | 2588 |
| 5 | 4 | 56.1 | 60.6 | 3 / 35 | 2513 |
| 6 | 3 | 56.7 | 65.4 | 4 / 35 | 2175 |
| 7 | 4 | 57.7 | 64.1 | 7 / 35 | 2653 |
| 8 | 3 | 58.6 | 67.0 | 6 / 35 | 2671 |
| 9 | 2 | 60.8 | 73.0 | 7 / 35 | 2939 |
| 10 | 3 | 58.5 | 66.7 | 7 / 35 | 2702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 69 | 20% |
| kc.micro.Figment 1.0 | 39 | 62% |
| pedersen.Grishnakh 1.0 | 12 | 42% |
| mc2.enemy.Original 0.9 | 8 | 63% |
| yagami.Tidus 0.11 | 3 | 100% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 98 | 33% | 114 |
| kc.micro.Figment 1.0 | 66 | 22% | 88 |
| yagami.Tidus 0.11 | 33 | 11% | 38 |
| pedersen.Grishnakh 1.0 | 32 | 11% | 34 |
| mc2.enemy.Original 0.9 | 26 | 9% | 31 |
| robar.nano.Assertive_Melee 0.2 | 14 | 5% | 14 |
| step.nanoPri 1.0 | 13 | 4% | 15 |
| dft.Calliope 5.6 | 8 | 3% | 9 |
| rdm.Dueler 0.4x | 7 | 2% | 7 |

## Melee bench: F10

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 82.8 | 147 / 350 | 2.55 | 15.9% | 37037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB560 0.3 | 1.4 | 15.9% | 147 |
| DTF.Kludgy 1.2b | 1.8 | 15.0% | 78 |
| ne.Chimera 1.2 | 3.0 | 13.5% | 40 |
| ejb.Polaris 1.0.1 | 3.9 | 12.6% | 29 |
| tvv.micro.Antares 1.1.1 | 5.4 | 10.6% | 30 |
| vStar.RAFzilla 2.15 | 5.5 | 10.3% | 16 |
| sam.Samspin 1.0 | 7.7 | 6.3% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.9% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.7% | 4 |
| donjezza.Muncho 1.0 | 9.8 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 82.2 | 15 / 35 | 3984 |
| 2 | 1 | 64.8 | 84.4 | 12 / 35 | 3921 |
| 3 | 2 | 64.0 | 83.5 | 12 / 35 | 3616 |
| 4 | 2 | 64.0 | 82.9 | 11 / 35 | 3695 |
| 5 | 2 | 63.4 | 79.7 | 15 / 35 | 3452 |
| 6 | 1 | 63.2 | 80.3 | 14 / 35 | 3481 |
| 7 | 1 | 64.4 | 82.9 | 11 / 35 | 3896 |
| 8 | 1 | 65.2 | 83.2 | 20 / 35 | 3665 |
| 9 | 2 | 64.1 | 79.4 | 18 / 35 | 3795 |
| 10 | 1 | 66.4 | 89.8 | 19 / 35 | 3532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 71 | 49% |
| ejb.Polaris 1.0.1 | 61 | 92% |
| ne.Chimera 1.2 | 43 | 49% |
| vStar.RAFzilla 2.15 | 25 | 64% |
| tvv.micro.Antares 1.1.1 | 22 | 45% |
| kurios.DOSexe .9b | 5 | 60% |
| donjezza.Muncho 1.0 | 5 | 60% |
| sam.Samspin 1.0 | 4 | 25% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 203 of 350 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 73 | 36% | 110 |
| ne.Chimera 1.2 | 57 | 28% | 81 |
| tvv.micro.Antares 1.1.1 | 21 | 10% | 25 |
| ejb.Polaris 1.0.1 | 20 | 10% | 78 |
| vStar.RAFzilla 2.15 | 13 | 6% | 29 |
| sam.Samspin 1.0 | 9 | 4% | 10 |
| donjezza.Muncho 1.0 | 4 | 2% | 8 |
| kurios.DOSexe .9b | 3 | 1% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 1% | 3 |

## Melee bench: F11

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 68.7 | 90 / 350 | 3.81 | 13.2% | 28961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 16.8% | 127 |
| hadur117.nano.SanaroB560 0.3 | 2.6 | 13.2% | 90 |
| cx.mini.Nimrod 0.55 | 2.7 | 13.2% | 46 |
| djc.DynaBot 0.1.1 | 3.8 | 11.5% | 23 |
| uji.YellohFellah 1.0 | 5.8 | 9.1% | 36 |
| br2.MobyDickBot 1.6 | 6.0 | 9.2% | 13 |
| rdt199.Warlord 0.73 | 6.2 | 9.0% | 16 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.6% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 65.4 | 8 / 35 | 2612 |
| 2 | 2 | 60.7 | 73.3 | 11 / 35 | 2846 |
| 3 | 2 | 59.9 | 70.5 | 9 / 35 | 3135 |
| 4 | 4 | 55.8 | 60.3 | 7 / 35 | 2603 |
| 5 | 2 | 59.4 | 72.1 | 8 / 35 | 2732 |
| 6 | 4 | 54.9 | 57.5 | 4 / 35 | 2919 |
| 7 | 3 | 60.2 | 72.4 | 12 / 35 | 2707 |
| 8 | 2 | 61.1 | 72.7 | 11 / 35 | 3154 |
| 9 | 2 | 61.2 | 72.1 | 12 / 35 | 3260 |
| 10 | 2 | 59.6 | 71.1 | 8 / 35 | 2993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 64 | 56% |
| cx.mini.Nimrod 0.55 | 24 | 58% |
| djc.DynaBot 0.1.1 | 20 | 90% |
| uji.YellohFellah 1.0 | 17 | 53% |
| br2.MobyDickBot 1.6 | 12 | 75% |
| rdt199.Warlord 0.73 | 3 | 67% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 260 of 350 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 100 | 38% | 132 |
| cx.mini.Nimrod 0.55 | 58 | 22% | 68 |
| djc.DynaBot 0.1.1 | 25 | 10% | 47 |
| uji.YellohFellah 1.0 | 20 | 8% | 31 |
| rdt199.Warlord 0.73 | 16 | 6% | 19 |
| br2.MobyDickBot 1.6 | 14 | 5% | 24 |
| KiraNL.Chupacabra 0.4 | 12 | 5% | 13 |
| stelo.MirrorNano 1.3 | 10 | 4% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 2% | 6 |

## Melee bench: F12

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 71.4 | 90 / 350 | 3.57 | 13.6% | 27293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.8 | 14.5% | 112 |
| bts.wiki.RipCurl 0.9b | 2.1 | 14.3% | 72 |
| hadur117.nano.SanaroB560 0.3 | 2.9 | 13.6% | 90 |
| darkcanuck.Leon 1.01 | 3.2 | 13.3% | 56 |
| brainfade.melee.Genghis 0.36 | 5.1 | 10.0% | 13 |
| jrm.Test0 1.0 | 6.2 | 8.4% | 0 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.4% | 5 |
| jp.Perpy 16.0 | 7.8 | 7.5% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.8% | 4 |
| stuff.Vlad 0.1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.4 | 70.8 | 4 / 35 | 2899 |
| 2 | 1 | 60.7 | 72.1 | 12 / 35 | 2887 |
| 3 | 2 | 61.9 | 78.4 | 10 / 35 | 2614 |
| 4 | 3 | 58.4 | 66.0 | 9 / 35 | 2703 |
| 5 | 2 | 61.4 | 77.1 | 11 / 35 | 2579 |
| 6 | 4 | 59.3 | 70.2 | 9 / 35 | 2607 |
| 7 | 2 | 62.1 | 78.4 | 11 / 35 | 2803 |
| 8 | 4 | 57.9 | 65.1 | 8 / 35 | 2767 |
| 9 | 4 | 54.8 | 58.1 | 5 / 35 | 2778 |
| 10 | 3 | 62.0 | 78.1 | 11 / 35 | 2656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 70 | 23% |
| darkcanuck.Leon 1.01 | 54 | 54% |
| bts.wiki.RipCurl 0.9b | 37 | 70% |
| brainfade.melee.Genghis 0.36 | 13 | 85% |
| jp.Perpy 16.0 | 5 | 100% |
| jrm.Test0 1.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 0% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 261 of 350 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 84 | 32% | 99 |
| darkcanuck.Leon 1.01 | 52 | 20% | 85 |
| bts.wiki.RipCurl 0.9b | 49 | 19% | 73 |
| jrm.Test0 1.0 | 24 | 9% | 24 |
| brainfade.melee.Genghis 0.36 | 17 | 7% | 24 |
| jp.Perpy 16.0 | 14 | 5% | 18 |
| cs.sheldor.Talon 1.1 | 11 | 4% | 14 |
| jaybot.bots.Oddball 4.0 | 6 | 2% | 6 |
| stuff.Vlad 0.1 | 4 | 2% | 5 |

## Melee bench: F13

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 72.3 | 51 / 350 | 3.49 | 12.9% | 27930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.4% | 148 |
| ags.Glacier 0.2.11 | 1.6 | 17.2% | 96 |
| hadur117.nano.SanaroB560 0.3 | 3.8 | 12.9% | 51 |
| shinh.Entangled 0.3 | 4.0 | 12.6% | 34 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.3% | 21 |
| apc.Colossus2 0.17 | 6.2 | 7.9% | 0 |
| stelo.Wang 1.0 | 6.9 | 6.9% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 75.2 | 7 / 35 | 2633 |
| 2 | 4 | 59.7 | 71.7 | 5 / 35 | 2768 |
| 3 | 4 | 61.0 | 76.5 | 5 / 35 | 2751 |
| 4 | 4 | 58.3 | 68.6 | 2 / 35 | 2674 |
| 5 | 4 | 60.7 | 74.6 | 6 / 35 | 2797 |
| 6 | 4 | 58.6 | 68.3 | 7 / 35 | 2671 |
| 7 | 3 | 61.3 | 74.0 | 7 / 35 | 2991 |
| 8 | 4 | 58.7 | 67.9 | 3 / 35 | 3083 |
| 9 | 4 | 60.2 | 71.1 | 6 / 35 | 2806 |
| 10 | 4 | 60.6 | 75.2 | 3 / 35 | 2756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 79 | 37% |
| ags.Glacier 0.2.11 | 55 | 16% |
| shinh.Entangled 0.3 | 19 | 32% |
| gh.micro.Gruweltje 0.7 | 11 | 36% |
| apc.Colossus2 0.17 | 2 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 101 | 34% | 111 |
| mn.Combat 3.25.0 | 92 | 31% | 121 |
| shinh.Entangled 0.3 | 44 | 15% | 51 |
| gh.micro.Gruweltje 0.7 | 34 | 11% | 39 |
| stelo.Wang 1.0 | 15 | 5% | 14 |
| apc.Colossus2 0.17 | 5 | 2% | 6 |
| maribo.FollowFire 1 | 4 | 1% | 4 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroB560 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 81.8 | 144 / 350 | 2.45 | 16.6% | 28845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 19.9% | 145 |
| hadur117.nano.SanaroB560 0.3 | 2.0 | 16.6% | 144 |
| Lo_Ian.Gandalf_V4 4.0 | 3.6 | 12.0% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.2 | 11.9% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.1 | 11.0% | 15 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 10.8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.6 | 9.5% | 21 |
| pa.Improved 1.0 | 8.0 | 6.1% | 1 |
| sample.TrackFire 1.0 | 9.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 85.4 | 16 / 35 | 2827 |
| 2 | 2 | 63.3 | 82.9 | 14 / 35 | 2711 |
| 3 | 2 | 63.4 | 82.9 | 12 / 35 | 2824 |
| 4 | 2 | 64.0 | 81.4 | 18 / 35 | 2894 |
| 5 | 2 | 63.0 | 77.9 | 17 / 35 | 2929 |
| 6 | 2 | 61.7 | 80.0 | 11 / 35 | 2391 |
| 7 | 2 | 64.9 | 83.9 | 19 / 35 | 3134 |
| 8 | 2 | 63.9 | 83.9 | 12 / 35 | 2959 |
| 9 | 2 | 63.4 | 81.8 | 10 / 35 | 2954 |
| 10 | 2 | 62.9 | 78.2 | 15 / 35 | 3222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 151 | 52% |
| sheldor.micro.PointInLineRRAL 1.0 | 25 | 68% |
| Lo_Ian.Gandalf_V4 4.0 | 22 | 95% |
| co.edu.usb.rc.LidisTron 1.0 | 19 | 47% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 8 | 88% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 206 of 350 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 120 | 58% | 194 |
| co.edu.usb.rc.LidisTron 1.0 | 21 | 10% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 17 | 8% | 37 |
| Lo_Ian.Gandalf_V4 4.0 | 17 | 8% | 30 |
| sanyi.mikrobi.Roberto 1.0 | 15 | 7% | 30 |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 7% | 33 |
| pa.Improved 1.0 | 1 | 0% | 4 |
| sample.TrackFire 1.0 | 1 | 0% | 2 |

## Melee bench: F15

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 70.0 | 83 / 350 | 3.70 | 13.6% | 33096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.4 | 15.0% | 72 |
| hadur117.nano.SanaroB560 0.3 | 2.7 | 13.6% | 83 |
| emp.Yngwie 1.11 | 3.0 | 13.3% | 93 |
| mld.DustBunny 3.8 | 3.1 | 13.2% | 35 |
| cb.nano.Insomnia 1.0 | 5.3 | 11.1% | 22 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.4% | 37 |
| lambdaxy.TBot 0.1 | 7.1 | 7.4% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.3% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 72.1 | 7 / 35 | 3580 |
| 2 | 5 | 53.2 | 55.6 | 1 / 35 | 2882 |
| 3 | 2 | 61.1 | 71.7 | 8 / 35 | 3473 |
| 4 | 2 | 61.3 | 73.0 | 9 / 35 | 3385 |
| 5 | 4 | 58.0 | 64.8 | 4 / 35 | 3180 |
| 6 | 2 | 61.3 | 73.3 | 8 / 35 | 3489 |
| 7 | 3 | 59.0 | 67.3 | 8 / 35 | 3105 |
| 8 | 3 | 61.1 | 74.6 | 9 / 35 | 3028 |
| 9 | 2 | 61.0 | 72.1 | 12 / 35 | 3363 |
| 10 | 2 | 63.4 | 75.9 | 17 / 35 | 3611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 43 | 65% |
| kawigi.micro.Shiz 1.1 | 31 | 52% |
| cb.nano.Insomnia 1.0 | 24 | 63% |
| mld.DustBunny 3.8 | 21 | 14% |
| kawigi.robot.Girl 1.2 | 18 | 89% |
| divineomega.TrialBot 0.003 | 4 | 75% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 268 of 350 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 64 | 24% | 80 |
| kawigi.micro.Shiz 1.1 | 59 | 22% | 72 |
| emp.Yngwie 1.11 | 48 | 18% | 87 |
| cb.nano.Insomnia 1.0 | 46 | 17% | 39 |
| kawigi.robot.Girl 1.2 | 22 | 8% | 36 |
| divineomega.TrialBot 0.003 | 14 | 5% | 20 |
| lambdaxy.TBot 0.1 | 8 | 3% | 8 |
| Grystrion.TrackerWO 1.0 | 7 | 3% | 8 |

## Melee bench: F16

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 70.3 | 71 / 350 | 3.68 | 13.9% | 36210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.7% | 150 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.3 | 14.8% | 7 |
| hadur117.nano.SanaroB560 0.3 | 2.8 | 13.9% | 71 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.6% | 75 |
| tvv.nano.Polaris 1.2 | 5.1 | 10.0% | 33 |
| bvh.fnr.Fenrir 0.36l | 5.9 | 9.1% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.6% | 4 |
| repositorio.NanoStep 1.0 | 8.9 | 5.1% | 2 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.4% | 5 |
| asd.Cthulhu 1.3 | 9.1 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 69.5 | 3 / 35 | 3699 |
| 2 | 3 | 59.8 | 69.2 | 5 / 35 | 3294 |
| 3 | 3 | 62.0 | 73.3 | 10 / 35 | 3471 |
| 4 | 3 | 59.9 | 68.6 | 5 / 35 | 3679 |
| 5 | 3 | 61.8 | 70.5 | 12 / 35 | 3453 |
| 6 | 2 | 61.8 | 72.1 | 7 / 35 | 3720 |
| 7 | 3 | 58.5 | 63.5 | 4 / 35 | 3403 |
| 8 | 2 | 62.6 | 73.3 | 11 / 35 | 3787 |
| 9 | 2 | 65.2 | 81.6 | 11 / 35 | 4060 |
| 10 | 4 | 58.0 | 61.0 | 3 / 35 | 3644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 87 | 31% |
| techdude.forest.FlamingForest 1.1 | 30 | 40% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 100% |
| tvv.nano.Polaris 1.2 | 14 | 29% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| asd.Cthulhu 1.3 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 0% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 280 of 350 rounds, at a mean tick of 1325. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 133 | 48% | 163 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 48 | 17% | 58 |
| techdude.forest.FlamingForest 1.1 | 36 | 13% | 49 |
| tvv.nano.Polaris 1.2 | 20 | 7% | 23 |
| bvh.fnr.Fenrir 0.36l | 20 | 7% | 22 |
| divineomega.DivineBot 1.9.4.5 | 7 | 3% | 12 |
| stelo.IntrinsicVolatility 1.4 | 6 | 2% | 11 |
| asd.Cthulhu 1.3 | 5 | 2% | 8 |
| repositorio.NanoStep 1.0 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 68.7 | 94 / 350 | 3.82 | 13.2% | 31092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.4 | 14.6% | 77 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.5% | 58 |
| hadur117.nano.SanaroB560 0.3 | 3.2 | 13.2% | 94 |
| cx.BlestPain 1.41 | 3.4 | 13.1% | 69 |
| nic.Nicator 2.4 | 4.8 | 11.6% | 30 |
| ahf.NanoAndrew .4 | 5.5 | 11.2% | 21 |
| maribo.melee.BMV 0.1 | 6.9 | 8.9% | 2 |
| tex.Longbot 0.4 | 8.3 | 5.5% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 67.0 | 10 / 35 | 3175 |
| 2 | 4 | 60.3 | 68.6 | 10 / 35 | 3210 |
| 3 | 1 | 63.0 | 75.9 | 11 / 35 | 3589 |
| 4 | 2 | 60.3 | 71.7 | 9 / 35 | 2929 |
| 5 | 5 | 57.0 | 60.6 | 4 / 35 | 3002 |
| 6 | 3 | 59.2 | 68.3 | 10 / 35 | 2918 |
| 7 | 3 | 61.0 | 71.7 | 13 / 35 | 3053 |
| 8 | 4 | 59.4 | 67.6 | 8 / 35 | 3153 |
| 9 | 4 | 58.5 | 66.3 | 7 / 35 | 3047 |
| 10 | 3 | 60.2 | 69.2 | 12 / 35 | 3016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 57 | 49% |
| oog.melee.Mercutio 1.0 | 36 | 81% |
| cx.BlestPain 1.41 | 25 | 72% |
| nic.Nicator 2.4 | 20 | 60% |
| ahf.NanoAndrew .4 | 10 | 40% |
| maribo.melee.BMV 0.1 | 3 | 100% |

Hadur died in 256 of 350 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 68 | 27% | 99 |
| cx.BlestPain 1.41 | 42 | 16% | 60 |
| nic.Nicator 2.4 | 37 | 14% | 50 |
| ahf.NanoAndrew .4 | 37 | 14% | 41 |
| oog.melee.Mercutio 1.0 | 35 | 14% | 62 |
| maribo.melee.BMV 0.1 | 24 | 9% | 25 |
| tex.Longbot 0.4 | 7 | 3% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 5 | 2% | 5 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroB560 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 73.4 | 124 / 350 | 3.13 | 15.6% | 27967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB560 0.3 | 1.4 | 15.6% | 124 |
| agd.Mooserwirt2 2.7 | 1.8 | 15.2% | 83 |
| uji.DBH 1.1 | 3.0 | 13.5% | 46 |
| ratosh.Nobo 0.21 | 4.2 | 12.3% | 15 |
| spinnercat.Robovirus 2.718 | 4.8 | 11.9% | 26 |
| sigterm.Sigterm 1.0 | 5.9 | 10.5% | 32 |
| kawigi.mini.Fhqwhgads 1.1 | 7.1 | 8.7% | 10 |
| stelo.WangRobot 1.0 | 8.1 | 6.5% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.7 | 5.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 70.4 | 11 / 35 | 2669 |
| 2 | 1 | 61.7 | 78.2 | 11 / 35 | 2763 |
| 3 | 2 | 58.1 | 68.2 | 9 / 35 | 2632 |
| 4 | 2 | 56.5 | 61.8 | 8 / 35 | 2803 |
| 5 | 1 | 61.8 | 75.7 | 14 / 35 | 2956 |
| 6 | 2 | 60.5 | 72.9 | 11 / 35 | 2939 |
| 7 | 1 | 61.5 | 77.1 | 14 / 35 | 2734 |
| 8 | 1 | 61.1 | 73.9 | 16 / 35 | 2915 |
| 9 | 1 | 61.7 | 76.1 | 14 / 35 | 2850 |
| 10 | 1 | 62.8 | 80.0 | 16 / 35 | 2706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 53 | 68% |
| uji.DBH 1.1 | 36 | 58% |
| sigterm.Sigterm 1.0 | 26 | 73% |
| spinnercat.Robovirus 2.718 | 24 | 92% |
| ratosh.Nobo 0.21 | 18 | 72% |
| stelo.WangRobot 1.0 | 9 | 78% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 71% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 0% |

Hadur died in 226 of 350 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 55 | 24% | 96 |
| uji.DBH 1.1 | 50 | 22% | 69 |
| ratosh.Nobo 0.21 | 40 | 18% | 49 |
| sigterm.Sigterm 1.0 | 25 | 11% | 44 |
| spinnercat.Robovirus 2.718 | 22 | 10% | 40 |
| kawigi.mini.Fhqwhgads 1.1 | 14 | 6% | 21 |
| stelo.WangRobot 1.0 | 13 | 6% | 21 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7 | 3% | 7 |

## Melee bench: F19

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 80.6 | 118 / 350 | 2.74 | 15.4% | 34104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.6 | 16.6% | 110 |
| davidalves.net.DuelistMiniMelee 1.2 | 1.7 | 16.3% | 87 |
| hadur117.nano.SanaroB560 0.3 | 2.7 | 15.4% | 118 |
| krillr.mini.JointStrike 2.0.0 | 4.4 | 10.8% | 8 |
| erdnis.Rover 0.3 | 4.6 | 10.7% | 11 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.5% | 3 |
| mbh.Mbh 0.1 | 7.2 | 7.7% | 0 |
| pac.ABC 2.1 | 7.6 | 7.3% | 12 |
| pbg.R2D2 1.0 | 8.9 | 5.8% | 1 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 77.8 | 10 / 35 | 3127 |
| 2 | 3 | 65.4 | 83.5 | 15 / 35 | 3231 |
| 3 | 3 | 64.3 | 81.9 | 9 / 35 | 3021 |
| 4 | 3 | 62.5 | 77.1 | 8 / 35 | 3298 |
| 5 | 3 | 64.1 | 77.5 | 11 / 35 | 3645 |
| 6 | 1 | 65.5 | 82.5 | 16 / 35 | 3632 |
| 7 | 3 | 65.3 | 83.2 | 13 / 35 | 3347 |
| 8 | 2 | 66.7 | 86.0 | 14 / 35 | 3606 |
| 9 | 3 | 63.5 | 75.2 | 10 / 35 | 3641 |
| 10 | 3 | 65.0 | 81.6 | 12 / 35 | 3556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 115 | 56% |
| davidalves.net.DuelistMiniMelee 1.2 | 75 | 41% |
| erdnis.Rover 0.3 | 10 | 70% |
| krillr.mini.JointStrike 2.0.0 | 10 | 90% |
| patson.PatsonTestBot 1.0 | 4 | 100% |
| pac.ABC 2.1 | 3 | 33% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 234 of 350 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 100 | 43% | 181 |
| mld.Infinity 2.2 | 70 | 30% | 34 |
| erdnis.Rover 0.3 | 22 | 9% | 33 |
| krillr.mini.JointStrike 2.0.0 | 21 | 9% | 37 |
| mbh.Mbh 0.1 | 7 | 3% | 13 |
| pbg.R2D2 1.0 | 6 | 3% | 17 |
| patson.PatsonTestBot 1.0 | 4 | 2% | 19 |
| pac.ABC 2.1 | 4 | 2% | 14 |

## Melee bench: F20

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 76.2 | 105 / 350 | 3.14 | 14.6% | 32098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.5% | 135 |
| hadur117.nano.SanaroB560 0.3 | 2.0 | 14.6% | 105 |
| fwb.Nine 1.0.1 | 3.4 | 11.8% | 39 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.4% | 14 |
| catcat20.Rabbit 0.001 | 5.2 | 10.1% | 29 |
| m3thos.mini.Eva01 0.5.5 | 6.1 | 9.1% | 7 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 8.4% | 7 |
| bayen.nut.Squirrel 1.615 | 7.6 | 7.9% | 12 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 79.0 | 10 / 35 | 3149 |
| 2 | 2 | 62.1 | 78.4 | 13 / 35 | 2859 |
| 3 | 2 | 61.3 | 74.0 | 8 / 35 | 3385 |
| 4 | 2 | 63.9 | 80.0 | 15 / 35 | 3343 |
| 5 | 2 | 60.5 | 71.1 | 9 / 35 | 3238 |
| 6 | 2 | 61.6 | 75.6 | 11 / 35 | 3421 |
| 7 | 2 | 62.2 | 76.2 | 10 / 35 | 3442 |
| 8 | 2 | 61.0 | 74.9 | 6 / 35 | 3008 |
| 9 | 2 | 62.9 | 78.7 | 14 / 35 | 2972 |
| 10 | 2 | 61.5 | 74.3 | 9 / 35 | 3281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 84 | 38% |
| fwb.Nine 1.0.1 | 48 | 67% |
| catcat20.Rabbit 0.001 | 22 | 64% |
| nz.jdc.nano.GridFu 1.0 | 11 | 55% |
| bayen.nut.Squirrel 1.615 | 8 | 88% |
| djdjdj.NanoSkunk10 1.0 | 8 | 88% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 246 of 350 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 110 | 45% | 152 |
| fwb.Nine 1.0.1 | 34 | 14% | 23 |
| nz.jdc.nano.GridFu 1.0 | 28 | 11% | 45 |
| catcat20.Rabbit 0.001 | 25 | 10% | 44 |
| bayen.nut.Squirrel 1.615 | 15 | 6% | 22 |
| m3thos.mini.Eva01 0.5.5 | 13 | 5% | 27 |
| djdjdj.NanoSkunk10 1.0 | 13 | 5% | 25 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 2% | 6 |
| ntc.ControlledChaos 1.1.4 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.9 | 152 / 350 | 2.45 | 17.2% | 44302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.5 | 17.2% | 135 |
| hadur117.nano.SanaroB560 0.3 | 1.6 | 17.2% | 152 |
| dummy.mini.Scimitar 1.01 | 2.9 | 14.3% | 23 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 14 |
| eld.Hmm 1.0 | 5.6 | 8.6% | 22 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.6% | 4 |
| fire219.CatBot 1.0 | 7.3 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.9 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 76.5 | 14 / 35 | 4951 |
| 2 | 1 | 67.7 | 87.0 | 19 / 35 | 4486 |
| 3 | 1 | 65.2 | 83.8 | 16 / 35 | 3567 |
| 4 | 2 | 65.3 | 80.6 | 9 / 35 | 4172 |
| 5 | 1 | 69.2 | 90.8 | 20 / 35 | 4830 |
| 6 | 2 | 66.8 | 83.2 | 12 / 35 | 4719 |
| 7 | 3 | 63.9 | 74.0 | 13 / 35 | 4386 |
| 8 | 2 | 66.6 | 83.8 | 13 / 35 | 4407 |
| 9 | 1 | 67.5 | 88.6 | 19 / 35 | 4036 |
| 10 | 1 | 68.3 | 90.8 | 17 / 35 | 4748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 165 | 55% |
| dummy.mini.Scimitar 1.01 | 35 | 74% |
| cf.RiO.RiOx 4.2.1 | 24 | 83% |
| eld.Hmm 1.0 | 17 | 59% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 198 of 350 rounds, at a mean tick of 1412. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 98 | 49% | 167 |
| dummy.mini.Scimitar 1.01 | 39 | 20% | 82 |
| cf.RiO.RiOx 4.2.1 | 29 | 15% | 47 |
| eld.Hmm 1.0 | 13 | 7% | 27 |
| oa.weak.BotherBot 0.1 | 5 | 3% | 11 |
| el.JumpShoot 0.2 | 5 | 3% | 6 |
| PSW.Relentless 0.1 | 4 | 2% | 4 |
| fire219.CatBot 1.0 | 3 | 2% | 3 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |

## Melee bench: F23

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.7 | 140 / 350 | 2.38 | 16.5% | 37626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.3% | 132 |
| hadur117.nano.SanaroB560 0.3 | 1.9 | 16.5% | 140 |
| cre.Karolos 0.32 | 3.0 | 14.5% | 47 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.1% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.2% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 9.1% | 10 |
| cw.megas.Blade 0.8 | 7.0 | 8.5% | 0 |
| sample.Walls 1.0 | 7.2 | 8.3% | 3 |
| cli.WasteOfAmmo 1.0 | 9.1 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 82.5 | 13 / 35 | 3642 |
| 2 | 2 | 66.5 | 84.1 | 11 / 35 | 3800 |
| 3 | 2 | 66.9 | 86.0 | 12 / 35 | 3829 |
| 4 | 1 | 67.6 | 87.3 | 17 / 35 | 3911 |
| 5 | 2 | 68.1 | 86.7 | 18 / 35 | 4045 |
| 6 | 2 | 65.9 | 83.5 | 15 / 35 | 3758 |
| 7 | 2 | 66.4 | 84.4 | 14 / 35 | 3812 |
| 8 | 2 | 67.2 | 86.3 | 16 / 35 | 3873 |
| 9 | 2 | 65.6 | 82.5 | 14 / 35 | 3726 |
| 10 | 2 | 65.4 | 83.5 | 10 / 35 | 3230 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 131 | 55% |
| cre.Karolos 0.32 | 58 | 53% |
| stelo.AreaTargetingBot 1.1 | 24 | 75% |
| sample.Walls 1.0 | 9 | 89% |
| stelo.RamTrackSurfer 1.2 | 9 | 67% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 210 of 350 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 106 | 50% | 181 |
| cre.Karolos 0.32 | 51 | 24% | 78 |
| stelo.AreaTargetingBot 1.1 | 29 | 14% | 43 |
| stelo.RamTrackSurfer 1.2 | 9 | 4% | 19 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 3% | 13 |
| sample.Walls 1.0 | 5 | 2% | 8 |
| cw.megas.Blade 0.8 | 3 | 1% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 2 |

## Melee bench: F24

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 64.3 | 70 / 350 | 4.21 | 11.9% | 23985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.9 | 14.3% | 75 |
| florent.XSeries.X2 0.12 | 2.2 | 13.8% | 71 |
| davidalves.Phoenix 0.54 | 2.4 | 13.5% | 70 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.3% | 37 |
| hadur117.nano.SanaroB560 0.3 | 4.6 | 11.9% | 70 |
| stelo.SoJNanoMelee 1.1 | 6.4 | 9.0% | 19 |
| oog.melee.Corsair 1.0 | 6.5 | 9.5% | 8 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.1% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 5.1% | 1 |
| evd.X1 0.01 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.8 | 68.9 | 9 / 35 | 2204 |
| 2 | 5 | 58.0 | 67.6 | 6 / 35 | 2609 |
| 3 | 5 | 53.3 | 55.6 | 5 / 35 | 2486 |
| 4 | 5 | 54.3 | 62.5 | 5 / 35 | 1921 |
| 5 | 6 | 54.7 | 59.7 | 3 / 35 | 2432 |
| 6 | 5 | 56.9 | 63.2 | 6 / 35 | 2520 |
| 7 | 4 | 57.1 | 64.1 | 8 / 35 | 2498 |
| 8 | 5 | 56.1 | 61.9 | 7 / 35 | 2503 |
| 9 | 4 | 57.4 | 66.0 | 8 / 35 | 2490 |
| 10 | 3 | 60.0 | 73.3 | 13 / 35 | 2322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 43 | 51% |
| florent.XSeries.X2 0.12 | 29 | 66% |
| davidalves.Phoenix 0.54 | 25 | 64% |
| pedersen.Ugluk 1.1.1 | 11 | 73% |
| stelo.SoJNanoMelee 1.1 | 9 | 44% |
| oog.melee.Corsair 1.0 | 2 | 50% |

Hadur died in 280 of 350 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 60 | 21% | 81 |
| florent.XSeries.X2 0.12 | 57 | 20% | 80 |
| davidalves.Phoenix 0.54 | 56 | 20% | 64 |
| pedersen.Ugluk 1.1.1 | 49 | 18% | 53 |
| stelo.SoJNanoMelee 1.1 | 20 | 7% | 24 |
| oog.melee.Corsair 1.0 | 18 | 6% | 26 |
| lunchie.Lunchbox 0.93 | 10 | 4% | 10 |
| as.FrankTheTank 1.3 | 7 | 3% | 9 |
| evd.X1 0.01 | 3 | 1% | 3 |

## Melee bench: F25

hadur117.nano.SanaroB560 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 73.5 | 97 / 350 | 3.12 | 15.3% | 24452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.8 | 16.0% | 76 |
| voidious.micro.BlitzBat 1.05 | 1.9 | 15.7% | 80 |
| hadur117.nano.SanaroB560 0.3 | 2.4 | 15.3% | 97 |
| jdw.Hurricane 1.4 | 4.0 | 13.2% | 50 |
| ds.Oo 2.2 | 5.0 | 10.5% | 21 |
| gjr.Cephalosporin 0.1 | 6.1 | 9.1% | 14 |
| adt.Ar2 1.1 | 7.4 | 7.9% | 7 |
| awesomeness.Elite 1.0 | 7.4 | 7.6% | 5 |
| amk.ChumbaMini 0.2 | 9.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 71.8 | 8 / 35 | 2421 |
| 2 | 2 | 58.2 | 66.1 | 11 / 35 | 2393 |
| 3 | 2 | 60.9 | 73.9 | 10 / 35 | 2387 |
| 4 | 3 | 57.8 | 70.0 | 7 / 35 | 2084 |
| 5 | 1 | 63.8 | 80.4 | 15 / 35 | 2782 |
| 6 | 3 | 62.0 | 78.6 | 9 / 35 | 2490 |
| 7 | 2 | 59.4 | 70.7 | 10 / 35 | 2352 |
| 8 | 4 | 59.2 | 70.4 | 7 / 35 | 2401 |
| 9 | 1 | 62.9 | 79.3 | 13 / 35 | 2730 |
| 10 | 3 | 59.7 | 74.3 | 7 / 35 | 2412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 57 | 32% |
| voidious.micro.BlitzBat 1.05 | 53 | 34% |
| jdw.Hurricane 1.4 | 39 | 85% |
| ds.Oo 2.2 | 16 | 69% |
| gjr.Cephalosporin 0.1 | 14 | 71% |
| adt.Ar2 1.1 | 8 | 63% |
| awesomeness.Elite 1.0 | 3 | 67% |

Hadur died in 253 of 350 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 75 | 30% | 95 |
| voidious.micro.BlitzBat 1.05 | 74 | 29% | 96 |
| jdw.Hurricane 1.4 | 35 | 14% | 58 |
| ds.Oo 2.2 | 21 | 8% | 34 |
| adt.Ar2 1.1 | 17 | 7% | 20 |
| gjr.Cephalosporin 0.1 | 14 | 6% | 25 |
| awesomeness.Elite 1.0 | 11 | 4% | 15 |
| amk.ChumbaMini 0.2 | 6 | 2% | 7 |

## Melee bench: F26

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 72.8 | 66 / 350 | 3.45 | 13.5% | 33040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.1 | 16.1% | 122 |
| hadur117.nano.SanaroB560 0.3 | 2.6 | 13.5% | 66 |
| lrem.Spectre 0.4.4 | 3.2 | 13.0% | 52 |
| shu.nitro.LENIN .T34 | 3.2 | 13.0% | 68 |
| js.PinBall 1.6 | 5.3 | 11.0% | 14 |
| gh.mini.GrubbmOne 1.0 | 5.8 | 10.6% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 9.3% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.7% | 4 |
| sample.SpinBot 1.0 | 8.8 | 5.2% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 70.2 | 6 / 35 | 3305 |
| 2 | 2 | 62.0 | 77.8 | 10 / 35 | 2919 |
| 3 | 2 | 63.0 | 77.1 | 5 / 35 | 3905 |
| 4 | 2 | 62.0 | 76.8 | 8 / 35 | 3488 |
| 5 | 3 | 59.2 | 68.9 | 6 / 35 | 3224 |
| 6 | 3 | 59.8 | 73.0 | 4 / 35 | 2793 |
| 7 | 2 | 62.0 | 75.2 | 10 / 35 | 3332 |
| 8 | 4 | 59.7 | 66.3 | 6 / 35 | 3669 |
| 9 | 3 | 59.7 | 68.6 | 6 / 35 | 3367 |
| 10 | 3 | 60.6 | 73.7 | 5 / 35 | 3038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 63 | 22% |
| lrem.Spectre 0.4.4 | 42 | 60% |
| shu.nitro.LENIN .T34 | 38 | 34% |
| gh.mini.GrubbmOne 1.0 | 10 | 40% |
| js.PinBall 1.6 | 10 | 60% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 20% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 2 | 50% |

Hadur died in 285 of 350 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 94 | 33% | 106 |
| shu.nitro.LENIN .T34 | 57 | 20% | 73 |
| lrem.Spectre 0.4.4 | 36 | 13% | 54 |
| gh.mini.GrubbmOne 1.0 | 36 | 13% | 43 |
| js.PinBall 1.6 | 27 | 9% | 34 |
| jaybot.adv.bots.JayBot 2.0 | 21 | 7% | 22 |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 2% | 10 |
| sample.SpinBot 1.0 | 6 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 69.7 | 130 / 350 | 3.73 | 13.7% | 29520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.9 | 14.7% | 92 |
| hadur117.nano.SanaroB560 0.3 | 2.3 | 13.7% | 130 |
| wee.Gem 1.8.4 | 3.2 | 12.5% | 69 |
| EH.Eagle 1.0.6 | 4.0 | 10.9% | 15 |
| sheldor.melee.nano.TestMelee 0.1 | 4.1 | 11.1% | 24 |
| techdude.kombat.FlamingKombat 1.5 | 6.4 | 9.3% | 8 |
| joe.ADinosaur 1.0 | 7.5 | 8.3% | 4 |
| throxbot.ThroxBot 0.1 | 8.0 | 7.8% | 8 |
| caimano.Furia_Ceca 0.22 | 8.2 | 6.9% | 2 |
| cs.Grudge 1.0 | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 81.6 | 18 / 35 | 3061 |
| 2 | 1 | 61.8 | 79.4 | 15 / 35 | 2473 |
| 3 | 5 | 52.9 | 43.2 | 5 / 35 | 3807 |
| 4 | 1 | 61.5 | 75.9 | 16 / 35 | 2759 |
| 5 | 1 | 61.5 | 78.1 | 16 / 35 | 2543 |
| 6 | 2 | 61.6 | 73.3 | 12 / 35 | 3285 |
| 7 | 2 | 61.1 | 75.9 | 15 / 35 | 2508 |
| 8 | 1 | 61.3 | 76.5 | 16 / 35 | 2416 |
| 9 | 2 | 60.5 | 73.3 | 13 / 35 | 2644 |
| 10 | 6 | 51.7 | 39.4 | 4 / 35 | 4024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 77 | 82% |
| wee.Gem 1.8.4 | 31 | 58% |
| EH.Eagle 1.0.6 | 18 | 89% |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 81% |
| techdude.kombat.FlamingKombat 1.5 | 13 | 85% |
| throxbot.ThroxBot 0.1 | 4 | 75% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |

Hadur died in 220 of 350 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 54 | 25% | 116 |
| wee.Gem 1.8.4 | 38 | 17% | 62 |
| joe.ADinosaur 1.0 | 29 | 13% | 31 |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 13% | 40 |
| EH.Eagle 1.0.6 | 20 | 9% | 37 |
| cs.Grudge 1.0 | 16 | 7% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 12 | 5% | 20 |
| caimano.Furia_Ceca 0.22 | 12 | 5% | 13 |
| throxbot.ThroxBot 0.1 | 11 | 5% | 15 |

## Melee bench: F28

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 81.8 | 147 / 350 | 2.64 | 15.8% | 31489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.5 | 15.8% | 99 |
| hadur117.nano.SanaroB560 0.3 | 1.5 | 15.8% | 147 |
| uji.Antique 1.0 | 3.4 | 12.3% | 44 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 11.2% | 34 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.9% | 13 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.4% | 5 |
| ahr.ice.Ice 1.0.2 | 6.9 | 7.7% | 4 |
| matt.advanced.Katana 1.0 | 8.2 | 6.6% | 3 |
| stelo.PianistNano 1.2 | 8.8 | 6.0% | 1 |
| stelo.Lifestealer 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 80.0 | 13 / 35 | 3329 |
| 2 | 2 | 59.9 | 72.4 | 9 / 35 | 2708 |
| 3 | 1 | 67.3 | 91.4 | 22 / 35 | 3275 |
| 4 | 1 | 65.3 | 85.1 | 15 / 35 | 3406 |
| 5 | 2 | 61.7 | 76.8 | 14 / 35 | 2861 |
| 6 | 2 | 63.5 | 79.4 | 13 / 35 | 3373 |
| 7 | 1 | 65.0 | 85.4 | 13 / 35 | 3423 |
| 8 | 1 | 63.4 | 80.3 | 16 / 35 | 3131 |
| 9 | 2 | 63.8 | 79.7 | 14 / 35 | 3284 |
| 10 | 1 | 64.6 | 87.3 | 18 / 35 | 2699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 125 | 56% |
| uji.Antique 1.0 | 45 | 69% |
| qohnil.blot.BlotBot 3.61 | 28 | 61% |
| amk.ChumbaWumba 0.3 | 13 | 77% |
| pfvicm.Sobieski 7.2.3b | 12 | 75% |
| ahr.ice.Ice 1.0.2 | 5 | 80% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.Lifestealer 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 204 of 350 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 95 | 47% | 144 |
| uji.Antique 1.0 | 28 | 14% | 71 |
| pfvicm.Sobieski 7.2.3b | 25 | 12% | 34 |
| qohnil.blot.BlotBot 3.61 | 21 | 10% | 39 |
| amk.ChumbaWumba 0.3 | 16 | 8% | 19 |
| ahr.ice.Ice 1.0.2 | 6 | 3% | 14 |
| stelo.Lifestealer 1.0 | 6 | 3% | 10 |
| stelo.PianistNano 1.2 | 4 | 2% | 7 |
| matt.advanced.Katana 1.0 | 3 | 1% | 11 |

## Melee bench: F29

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 70.9 | 78 / 350 | 3.62 | 13.7% | 29290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.7 | 16.2% | 115 |
| zyx.mega.YersiniaPestis 3.1 | 1.7 | 15.8% | 98 |
| hadur117.nano.SanaroB560 0.3 | 2.8 | 13.7% | 78 |
| myl.micro.Troodon 1.10 | 4.1 | 12.6% | 21 |
| jok.PheonixM 0.1.2 | 4.7 | 10.8% | 17 |
| DBall.Anarchy 0.1 | 6.5 | 7.9% | 16 |
| ph.melee.ArcherME 0.3 | 6.6 | 8.4% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.9 | 5.8% | 0 |
| jangs.ns51 1.0 | 9.2 | 4.6% | 2 |
| ap.Frederick 1.1 | 9.8 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 76.5 | 12 / 35 | 3034 |
| 2 | 3 | 57.2 | 63.8 | 1 / 35 | 2735 |
| 3 | 3 | 59.4 | 66.7 | 9 / 35 | 2617 |
| 4 | 3 | 59.5 | 67.9 | 6 / 35 | 2881 |
| 5 | 2 | 64.3 | 78.4 | 10 / 35 | 3501 |
| 6 | 5 | 56.6 | 60.6 | 5 / 35 | 2683 |
| 7 | 3 | 61.9 | 74.0 | 10 / 35 | 2873 |
| 8 | 3 | 61.6 | 71.7 | 8 / 35 | 3066 |
| 9 | 3 | 60.4 | 70.8 | 4 / 35 | 2939 |
| 10 | 1 | 63.6 | 78.4 | 13 / 35 | 2961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 68 | 22% |
| zyx.mega.YersiniaPestis 3.1 | 57 | 61% |
| DBall.Anarchy 0.1 | 18 | 61% |
| myl.micro.Troodon 1.10 | 16 | 88% |
| jok.PheonixM 0.1.2 | 4 | 75% |
| ph.melee.ArcherME 0.3 | 1 | 0% |

Hadur died in 273 of 350 rounds, at a mean tick of 1210. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 117 | 43% | 132 |
| zyx.mega.YersiniaPestis 3.1 | 54 | 20% | 88 |
| myl.micro.Troodon 1.10 | 41 | 15% | 56 |
| jok.PheonixM 0.1.2 | 28 | 10% | 30 |
| DBall.Anarchy 0.1 | 13 | 5% | 24 |
| ph.melee.ArcherME 0.3 | 12 | 4% | 12 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 2% | 5 |
| jangs.ns51 1.0 | 3 | 1% | 3 |

## Melee bench: F30

hadur117.nano.SanaroB560 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.7 | 61.8 | 43 / 350 | 4.05 | 12.5% | 24608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.7 | 16.6% | 101 |
| stelo.PastFuture 2.3.2 | 2.1 | 15.4% | 50 |
| darkcanuck.B26354 1.06 | 2.2 | 16.3% | 111 |
| hadur117.nano.SanaroB560 0.3 | 4.0 | 12.5% | 43 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.4% | 14 |
| tripphippy.Alice 1.1 | 6.2 | 9.3% | 12 |
| ntc.Opposite 1.5 | 6.3 | 9.3% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 7.4 | 8.3% | 15 |
| GarmBox.Anger 1.0 | 9.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.7 | 65.4 | 7 / 35 | 2705 |
| 2 | 4 | 55.7 | 59.3 | 5 / 35 | 2676 |
| 3 | 4 | 54.6 | 60.0 | 3 / 35 | 2160 |
| 4 | 4 | 55.2 | 57.1 | 1 / 35 | 2949 |
| 5 | 4 | 53.4 | 58.6 | 1 / 35 | 2261 |
| 6 | 4 | 57.0 | 66.1 | 5 / 35 | 2210 |
| 7 | 4 | 56.1 | 62.5 | 6 / 35 | 2466 |
| 8 | 4 | 54.6 | 59.3 | 6 / 35 | 2394 |
| 9 | 4 | 58.5 | 70.4 | 6 / 35 | 2454 |
| 10 | 4 | 54.3 | 59.6 | 3 / 35 | 2333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 43 | 28% |
| oog.melee.Capulet 1.2 | 37 | 30% |
| stelo.PastFuture 2.3.2 | 22 | 59% |
| intruder.PrairieWolf 2.61 | 9 | 44% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |
| ntc.Opposite 1.5 | 2 | 50% |
| tripphippy.Alice 1.1 | 1 | 0% |

Hadur died in 308 of 350 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 83 | 27% | 97 |
| oog.melee.Capulet 1.2 | 79 | 26% | 90 |
| stelo.PastFuture 2.3.2 | 60 | 19% | 70 |
| ntc.Opposite 1.5 | 30 | 10% | 31 |
| tripphippy.Alice 1.1 | 22 | 7% | 22 |
| intruder.PrairieWolf 2.61 | 21 | 7% | 26 |
| fowl3628800.LightningBolt 2.6.0 | 12 | 4% | 13 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |

## Melee bench: F31

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.9 | 59.7 | 38 / 350 | 4.63 | 11.0% | 22979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 179 |
| gh.mini.Griezel 0.2 | 2.0 | 14.3% | 77 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 12.4% | 27 |
| d414.nano.Quantum 1.0.0 | 3.9 | 11.7% | 23 |
| hadur117.nano.SanaroB560 0.3 | 4.8 | 11.0% | 38 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.6% | 5 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.9% | 4 |
| fm.mammillarias 1.3 | 8.1 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.4 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.0 | 58.1 | 3 / 35 | 2231 |
| 2 | 5 | 54.6 | 60.0 | 2 / 35 | 2224 |
| 3 | 5 | 55.7 | 60.6 | 4 / 35 | 2565 |
| 4 | 4 | 55.8 | 62.2 | 8 / 35 | 2174 |
| 5 | 5 | 56.6 | 64.1 | 6 / 35 | 2208 |
| 6 | 5 | 53.7 | 56.5 | 3 / 35 | 2464 |
| 7 | 5 | 55.3 | 61.3 | 5 / 35 | 2106 |
| 8 | 5 | 53.6 | 55.6 | 2 / 35 | 2351 |
| 9 | 3 | 56.9 | 63.8 | 3 / 35 | 2619 |
| 10 | 6 | 52.5 | 54.9 | 2 / 35 | 2037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 37% |
| gh.mini.Griezel 0.2 | 40 | 43% |
| spinnercat.micro.Tyger 0.1 | 8 | 0% |
| d414.nano.Quantum 1.0.0 | 7 | 0% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 79 | 25% | 98 |
| gh.mini.Griezel 0.2 | 77 | 25% | 91 |
| spinnercat.micro.Tyger 0.1 | 54 | 17% | 56 |
| d414.nano.Quantum 1.0.0 | 40 | 13% | 41 |
| gh.nano.Grofvuil 0.2 | 27 | 9% | 27 |
| fm.mammillarias 1.3 | 15 | 5% | 15 |
| timmit.nano.TimDog 0.33 | 11 | 4% | 12 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 3 |

## Melee bench: F32

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 78.9 | 156 / 350 | 2.90 | 15.1% | 30654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB560 0.3 | 1.4 | 15.1% | 156 |
| kawigi.sbf.FloodHT 0.9.2 | 1.6 | 15.0% | 83 |
| apc.botM 3.0 | 3.1 | 12.4% | 36 |
| lxx.ConceptA 0.8 | 4.5 | 10.9% | 8 |
| vjik.UnViolation 1.1 | 4.8 | 10.9% | 33 |
| bayen.UbaMicro 1.4 | 5.6 | 9.8% | 12 |
| panzer.Panzer 0.2 | 7.4 | 7.6% | 4 |
| yk.JahMicro 1.0 | 8.0 | 7.0% | 12 |
| conscience.Electron 1.3g | 8.9 | 6.1% | 2 |
| donjezza.Jezza 1.0 | 9.7 | 5.3% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 81.3 | 17 / 35 | 3164 |
| 2 | 2 | 62.7 | 78.4 | 12 / 35 | 3244 |
| 3 | 1 | 64.6 | 84.4 | 21 / 35 | 3011 |
| 4 | 1 | 62.0 | 77.1 | 16 / 35 | 3175 |
| 5 | 1 | 63.2 | 78.7 | 19 / 35 | 3083 |
| 6 | 1 | 62.0 | 77.1 | 15 / 35 | 3126 |
| 7 | 2 | 63.8 | 81.0 | 17 / 35 | 3453 |
| 8 | 1 | 61.0 | 74.9 | 14 / 35 | 3014 |
| 9 | 2 | 60.4 | 76.8 | 11 / 35 | 2535 |
| 10 | 2 | 62.0 | 79.0 | 14 / 35 | 2849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 90 | 60% |
| apc.botM 3.0 | 52 | 88% |
| vjik.UnViolation 1.1 | 28 | 86% |
| lxx.ConceptA 0.8 | 13 | 92% |
| bayen.UbaMicro 1.4 | 11 | 82% |
| yk.JahMicro 1.0 | 9 | 56% |
| panzer.Panzer 0.2 | 6 | 100% |
| donjezza.Jezza 1.0 | 3 | 0% |

Hadur died in 195 of 350 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 67 | 34% | 124 |
| lxx.ConceptA 0.8 | 39 | 20% | 51 |
| apc.botM 3.0 | 24 | 12% | 68 |
| bayen.UbaMicro 1.4 | 22 | 11% | 28 |
| vjik.UnViolation 1.1 | 13 | 7% | 42 |
| panzer.Panzer 0.2 | 12 | 6% | 12 |
| yk.JahMicro 1.0 | 7 | 4% | 11 |
| donjezza.Jezza 1.0 | 5 | 3% | 8 |
| conscience.Electron 1.3g | 5 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F33

hadur117.nano.SanaroB560 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 74.1 | 103 / 350 | 3.07 | 16.1% | 32097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.2 | 19.0% | 103 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 16.6% | 99 |
| hadur117.nano.SanaroB560 0.3 | 2.6 | 16.1% | 103 |
| labg.Cataclysm 2.05 | 4.0 | 12.1% | 19 |
| baal.nano.N 1.42 | 5.3 | 10.2% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.7 | 9.9% | 19 |
| zyx.micro.Ant 1.1 | 7.2 | 6.8% | 1 |
| sanja.First 0.1 | 8.0 | 5.3% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 70.4 | 12 / 35 | 2969 |
| 2 | 2 | 65.8 | 81.1 | 14 / 35 | 3454 |
| 3 | 1 | 65.3 | 82.1 | 17 / 35 | 3193 |
| 4 | 3 | 58.8 | 64.3 | 9 / 35 | 2783 |
| 5 | 3 | 63.9 | 80.4 | 10 / 35 | 3265 |
| 6 | 3 | 63.0 | 75.7 | 7 / 35 | 3307 |
| 7 | 2 | 62.6 | 75.0 | 8 / 35 | 3560 |
| 8 | 3 | 61.2 | 71.8 | 8 / 35 | 3104 |
| 9 | 3 | 62.3 | 72.1 | 10 / 35 | 3212 |
| 10 | 3 | 60.6 | 68.6 | 8 / 35 | 3250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 83 | 25% |
| maribo.Quester 0.3 | 76 | 62% |
| labg.Cataclysm 2.05 | 22 | 73% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 60% |
| baal.nano.N 1.42 | 5 | 100% |
| zyx.micro.Ant 1.1 | 4 | 100% |
| sanja.First 0.1 | 3 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 247 of 350 rounds, at a mean tick of 1546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 97 | 39% | 121 |
| maribo.Quester 0.3 | 80 | 32% | 131 |
| kinsen.melee.Angsaichmophobia 1.8c | 27 | 11% | 28 |
| labg.Cataclysm 2.05 | 19 | 8% | 34 |
| baal.nano.N 1.42 | 11 | 4% | 18 |
| zyx.micro.Ant 1.1 | 10 | 4% | 13 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 1% | 2 |
| sanja.First 0.1 | 1 | 0% | 3 |

## Melee bench: F34

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 73.1 | 71 / 350 | 3.42 | 13.7% | 32548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.4 | 17.1% | 105 |
| stelo.Spread 0.9 | 1.6 | 17.2% | 122 |
| hadur117.nano.SanaroB560 0.3 | 3.0 | 13.7% | 71 |
| jcs.Seth 1.8 | 4.4 | 11.7% | 32 |
| tcf.Reach 3 | 4.7 | 11.6% | 13 |
| cli.Dancer 1.1 | 5.9 | 9.9% | 6 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.1 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.2 | 78.7 | 9 / 35 | 3316 |
| 2 | 3 | 59.2 | 67.3 | 4 / 35 | 3026 |
| 3 | 3 | 61.4 | 71.1 | 5 / 35 | 3370 |
| 4 | 3 | 61.8 | 74.6 | 8 / 35 | 3214 |
| 5 | 3 | 60.5 | 67.6 | 6 / 35 | 3462 |
| 6 | 3 | 63.2 | 77.1 | 7 / 35 | 3335 |
| 7 | 3 | 62.1 | 76.8 | 4 / 35 | 3246 |
| 8 | 3 | 63.3 | 78.1 | 12 / 35 | 3067 |
| 9 | 3 | 59.2 | 65.4 | 8 / 35 | 3039 |
| 10 | 3 | 62.5 | 74.0 | 8 / 35 | 3473 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 59 | 59% |
| kid.Gladiator .7.2 | 49 | 27% |
| jcs.Seth 1.8 | 24 | 67% |
| tcf.Reach 3 | 8 | 63% |
| cli.Dancer 1.1 | 4 | 25% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 279 of 350 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 120 | 43% | 124 |
| stelo.Spread 0.9 | 90 | 32% | 130 |
| tcf.Reach 3 | 25 | 9% | 29 |
| jcs.Seth 1.8 | 19 | 7% | 37 |
| cli.Dancer 1.1 | 13 | 5% | 17 |
| ratosh.Wesco 1.4 | 10 | 4% | 10 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 1 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 71.4 | 29 / 350 | 3.57 | 12.6% | 24276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 265 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.5% | 36 |
| rz.HawkOnFire 0.1 | 3.3 | 12.6% | 9 |
| hadur117.nano.SanaroB560 0.3 | 3.5 | 12.6% | 29 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.6% | 11 |
| wit.Chuliath 1.0 | 6.5 | 7.2% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.1 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.1 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 74.9 | 5 / 35 | 2850 |
| 2 | 5 | 58.6 | 68.9 | 3 / 35 | 2441 |
| 3 | 4 | 57.7 | 69.5 | 1 / 35 | 2187 |
| 4 | 4 | 58.4 | 70.5 | 2 / 35 | 2367 |
| 5 | 4 | 57.9 | 68.9 | 1 / 35 | 2361 |
| 6 | 2 | 60.4 | 74.0 | 4 / 35 | 2552 |
| 7 | 2 | 59.9 | 74.3 | 5 / 35 | 2366 |
| 8 | 4 | 58.8 | 71.4 | 3 / 35 | 2414 |
| 9 | 5 | 56.2 | 65.7 | 0 / 35 | 2133 |
| 10 | 3 | 61.0 | 76.2 | 5 / 35 | 2605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 91 | 2% |
| gh.mini.Gruwel 0.9 | 28 | 54% |
| rz.HawkOnFire 0.1 | 9 | 89% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 75% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 159 | 49% | 160 |
| gh.mini.Gruwel 0.9 | 57 | 18% | 72 |
| dmh.robocode.robot.BlackDeath 9.2 | 48 | 15% | 51 |
| rz.HawkOnFire 0.1 | 31 | 10% | 39 |
| wit.Chuliath 1.0 | 9 | 3% | 9 |
| myl.nano.KomoriNinja 1.1 | 7 | 2% | 8 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 2% | 7 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 78.1 | 161 / 350 | 2.97 | 15.7% | 33791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB560 0.3 | 1.0 | 15.7% | 161 |
| bzdp.Pansy 2.1 | 3.1 | 12.3% | 46 |
| alpha.RainingFire 1.0 | 3.4 | 11.9% | 36 |
| mz.Cork 0.1 | 3.9 | 11.6% | 31 |
| bvh.micro.Freya 0.3 | 4.1 | 11.4% | 27 |
| bvh.mini.Fenrir 0.39 | 6.1 | 10.0% | 8 |
| m3thos.Eva02 0.7.1 | 6.4 | 9.9% | 24 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.8% | 9 |
| dl.BetterWalls 1.0 | 8.8 | 6.3% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.9% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 74.9 | 16 / 35 | 3345 |
| 2 | 1 | 65.1 | 83.2 | 16 / 35 | 3599 |
| 3 | 1 | 63.2 | 77.8 | 17 / 35 | 3270 |
| 4 | 1 | 64.8 | 82.5 | 17 / 35 | 3444 |
| 5 | 1 | 64.5 | 80.6 | 21 / 35 | 3151 |
| 6 | 1 | 64.3 | 81.3 | 17 / 35 | 3408 |
| 7 | 1 | 63.3 | 76.8 | 14 / 35 | 3516 |
| 8 | 1 | 62.0 | 74.6 | 15 / 35 | 3316 |
| 9 | 1 | 60.9 | 72.7 | 9 / 35 | 3306 |
| 10 | 1 | 63.9 | 76.8 | 19 / 35 | 3436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 57% |
| mz.Cork 0.1 | 43 | 77% |
| bvh.micro.Freya 0.3 | 37 | 84% |
| alpha.RainingFire 1.0 | 35 | 63% |
| bvh.mini.Fenrir 0.39 | 29 | 90% |
| m3thos.Eva02 0.7.1 | 13 | 62% |
| sample.MyFirstRobot 1.0 | 6 | 67% |
| dl.BetterWalls 1.0 | 6 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 80% |

Hadur died in 192 of 350 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 40 | 21% | 75 |
| alpha.RainingFire 1.0 | 34 | 18% | 56 |
| bvh.mini.Fenrir 0.39 | 27 | 14% | 39 |
| bvh.micro.Freya 0.3 | 23 | 12% | 43 |
| mz.Cork 0.1 | 20 | 10% | 60 |
| m3thos.Eva02 0.7.1 | 20 | 10% | 27 |
| squidM.TentalceMeleeNano 1.1 | 13 | 7% | 20 |
| dl.BetterWalls 1.0 | 7 | 4% | 18 |
| sample.MyFirstRobot 1.0 | 7 | 4% | 12 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 81.1 | 145 / 350 | 2.70 | 15.8% | 41924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB560 0.3 | 1.0 | 15.8% | 145 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 11.7% | 41 |
| germ.TheMind .2 | 3.3 | 11.2% | 35 |
| EBBU.Sim2 1.02 | 4.1 | 10.2% | 27 |
| stelo.UntouchableNano 1.3 | 6.0 | 9.0% | 22 |
| agrach.Dalek 1.0 | 6.2 | 9.0% | 25 |
| mb.Beast 0.1 | 7.0 | 8.5% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.1% | 3 |
| lmk.ACPFinal 0.1 | 8.2 | 8.3% | 16 |
| skm.Ryubot 1.0 | 8.4 | 8.1% | 20 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 85.1 | 16 / 35 | 4634 |
| 2 | 1 | 62.1 | 78.4 | 12 / 35 | 4182 |
| 3 | 1 | 61.5 | 73.3 | 12 / 35 | 4390 |
| 4 | 1 | 63.4 | 82.2 | 18 / 35 | 4190 |
| 5 | 1 | 63.0 | 84.8 | 15 / 35 | 3435 |
| 6 | 1 | 63.2 | 81.3 | 15 / 35 | 4113 |
| 7 | 1 | 62.4 | 77.1 | 14 / 35 | 4491 |
| 8 | 1 | 64.4 | 86.3 | 13 / 35 | 4377 |
| 9 | 1 | 64.0 | 82.5 | 17 / 35 | 4148 |
| 10 | 1 | 62.3 | 79.7 | 13 / 35 | 3964 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 44 | 68% |
| com.syncleus.robocode.Dreadnaught 0.1 | 37 | 51% |
| stelo.UntouchableNano 1.3 | 32 | 81% |
| skm.Ryubot 1.0 | 28 | 57% |
| EBBU.Sim2 1.02 | 24 | 42% |
| mb.Beast 0.1 | 20 | 80% |
| agrach.Dalek 1.0 | 18 | 78% |
| lmk.ACPFinal 0.1 | 14 | 79% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 209 of 350 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 38 | 18% | 61 |
| germ.TheMind .2 | 35 | 17% | 64 |
| lmk.ACPFinal 0.1 | 25 | 12% | 34 |
| EBBU.Sim2 1.02 | 24 | 11% | 32 |
| skm.Ryubot 1.0 | 21 | 10% | 29 |
| agrach.Dalek 1.0 | 20 | 10% | 43 |
| mb.Beast 0.1 | 16 | 8% | 35 |
| stelo.UntouchableNano 1.3 | 16 | 8% | 35 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 6% | 16 |
1 death(s) with no robot to name.

## Melee bench: F38

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 65.6 | 58 / 350 | 4.10 | 12.2% | 27046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.7% | 138 |
| bvh.mini.Freya 0.55 | 2.8 | 13.2% | 39 |
| hadur117.nano.SanaroB560 0.3 | 3.8 | 12.2% | 58 |
| bts.mega.Gnarly 1.4 | 4.1 | 11.9% | 47 |
| cs.Wren 1.0 | 4.6 | 11.6% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.9 | 11.4% | 30 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.2% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 5.5% | 2 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.4% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.5 | 59.0 | 2 / 35 | 2629 |
| 2 | 5 | 56.8 | 63.5 | 4 / 35 | 2702 |
| 3 | 3 | 57.4 | 65.7 | 5 / 35 | 2637 |
| 4 | 3 | 57.7 | 67.6 | 6 / 35 | 2683 |
| 5 | 4 | 57.6 | 66.0 | 5 / 35 | 2647 |
| 6 | 7 | 51.6 | 51.4 | 2 / 35 | 2303 |
| 7 | 3 | 61.2 | 73.0 | 11 / 35 | 2950 |
| 8 | 2 | 59.5 | 69.2 | 8 / 35 | 2854 |
| 9 | 4 | 57.8 | 66.3 | 2 / 35 | 2991 |
| 10 | 2 | 60.8 | 74.0 | 13 / 35 | 2650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 65 | 51% |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 25% |
| bvh.mini.Freya 0.55 | 15 | 73% |
| bts.mega.Gnarly 1.4 | 13 | 46% |
| cs.Wren 1.0 | 7 | 43% |
| kdf.KoulDestroyer 1.0 | 1 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 91 | 31% | 128 |
| bvh.mini.Freya 0.55 | 46 | 16% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 15% | 52 |
| bts.mega.Gnarly 1.4 | 42 | 14% | 49 |
| cs.Wren 1.0 | 32 | 11% | 32 |
| kdf.KoulDestroyer 1.0 | 22 | 8% | 25 |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 2% | 6 |
| bzdp.BoxCar 2.0 | 6 | 2% | 6 |
| matt.UnderDark3 2.4.34 | 3 | 1% | 3 |

## Melee bench: F39

hadur117.nano.SanaroB560 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 71.5 | 49 / 350 | 3.28 | 14.3% | 29185 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.3 | 17.7% | 85 |
| az.Ololobot 0.2.4 | 1.9 | 16.0% | 154 |
| hadur117.nano.SanaroB560 0.3 | 2.8 | 14.3% | 49 |
| stelo.SoRobotNanoMelee 1.2 | 4.4 | 10.8% | 40 |
| apollokidd.ApolloKidd 0.9 | 5.4 | 9.7% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.6% | 8 |
| gimp.GimpBot 0.1 | 6.4 | 9.0% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.2 | 7.2% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 72.9 | 5 / 35 | 3020 |
| 2 | 2 | 62.0 | 80.4 | 9 / 35 | 3462 |
| 3 | 3 | 58.1 | 69.3 | 4 / 35 | 2773 |
| 4 | 3 | 59.8 | 76.4 | 2 / 35 | 2979 |
| 5 | 3 | 58.7 | 71.1 | 6 / 35 | 2965 |
| 6 | 3 | 57.2 | 68.2 | 4 / 35 | 2874 |
| 7 | 3 | 57.9 | 70.0 | 4 / 35 | 2890 |
| 8 | 3 | 55.4 | 63.2 | 5 / 35 | 2704 |
| 9 | 3 | 57.9 | 72.1 | 4 / 35 | 2619 |
| 10 | 2 | 58.5 | 71.4 | 6 / 35 | 2899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 80 | 5% |
| bvh.fry.Freya 0.82 | 63 | 37% |
| stelo.SoRobotNanoMelee 1.2 | 21 | 48% |
| winamp32.micro.MicroMacro 1.0 | 8 | 63% |
| apollokidd.ApolloKidd 0.9 | 5 | 40% |
| gimp.GimpBot 0.1 | 5 | 80% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |

Hadur died in 302 of 350 rounds, at a mean tick of 1401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 103 | 34% | 121 |
| az.Ololobot 0.2.4 | 95 | 31% | 102 |
| apollokidd.ApolloKidd 0.9 | 38 | 13% | 40 |
| stelo.SoRobotNanoMelee 1.2 | 34 | 11% | 40 |
| gimp.GimpBot 0.1 | 13 | 4% | 22 |
| winamp32.micro.MicroMacro 1.0 | 11 | 4% | 17 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 2% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 2 |

## Melee bench: F41

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 73.4 | 118 / 350 | 3.40 | 14.1% | 28811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.2 | 15.9% | 119 |
| hadur117.nano.SanaroB560 0.3 | 2.8 | 14.1% | 118 |
| ary.Swarm 1.1 | 3.1 | 13.6% | 31 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 13.4% | 40 |
| simonton.nano.MeleeSeed 1.8 | 4.4 | 12.3% | 30 |
| shrub.Silver v048 | 6.1 | 8.8% | 7 |
| zyx.nano.Ant 1.1 | 7.1 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 5.9% | 6 |
| stelo.Mirror 1.1 | 8.6 | 5.8% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 73.3 | 11 / 35 | 2801 |
| 2 | 3 | 59.5 | 67.3 | 8 / 35 | 3009 |
| 3 | 2 | 61.5 | 73.3 | 12 / 35 | 2944 |
| 4 | 3 | 61.4 | 72.7 | 12 / 35 | 2955 |
| 5 | 5 | 58.8 | 65.1 | 6 / 35 | 2833 |
| 6 | 3 | 62.1 | 75.6 | 8 / 35 | 3085 |
| 7 | 2 | 62.9 | 78.4 | 14 / 35 | 2671 |
| 8 | 1 | 63.4 | 78.4 | 17 / 35 | 2924 |
| 9 | 1 | 65.3 | 82.5 | 18 / 35 | 3153 |
| 10 | 5 | 59.0 | 67.0 | 12 / 35 | 2436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 72 | 56% |
| simonton.nano.MeleeSeed 1.8 | 33 | 91% |
| lessonz.robocode.Oz 0.5.0 | 31 | 74% |
| ary.Swarm 1.1 | 23 | 74% |
| shrub.Silver v048 | 7 | 43% |
| jsal.Jsalbot 1.0 | 6 | 50% |
| stelo.Mirror 1.1 | 2 | 100% |

Hadur died in 232 of 350 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 72 | 31% | 113 |
| ary.Swarm 1.1 | 64 | 28% | 86 |
| simonton.nano.MeleeSeed 1.8 | 31 | 13% | 59 |
| lessonz.robocode.Oz 0.5.0 | 29 | 13% | 46 |
| shrub.Silver v048 | 18 | 8% | 21 |
| zyx.nano.Ant 1.1 | 8 | 3% | 9 |
| jsal.Jsalbot 1.0 | 5 | 2% | 9 |
| stelo.Mirror 1.1 | 4 | 2% | 5 |
| acogdev.alpha 0.2 | 1 | 0% | 1 |

## Melee bench: F42

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 72.9 | 76 / 350 | 3.44 | 13.8% | 33807 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.6% | 172 |
| ara.Shera 0.88 | 2.5 | 14.3% | 58 |
| hadur117.nano.SanaroB560 0.3 | 3.1 | 13.8% | 76 |
| maribo.mini.MiniQuester 0.1 | 3.4 | 13.9% | 31 |
| amz.NanoClone 1.41 | 5.1 | 9.2% | 2 |
| maribo.IotaCT 1.1 | 6.4 | 7.9% | 3 |
| dsw.StaticD 1.0 | 6.6 | 7.3% | 7 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.4 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 74.3 | 6 / 35 | 3373 |
| 2 | 4 | 58.8 | 66.0 | 4 / 35 | 3277 |
| 3 | 3 | 61.8 | 74.9 | 8 / 35 | 3486 |
| 4 | 2 | 63.6 | 79.7 | 14 / 35 | 3290 |
| 5 | 3 | 62.8 | 75.9 | 8 / 35 | 3589 |
| 6 | 3 | 59.7 | 69.2 | 8 / 35 | 3276 |
| 7 | 4 | 58.1 | 65.7 | 4 / 35 | 3432 |
| 8 | 2 | 61.7 | 76.2 | 8 / 35 | 3133 |
| 9 | 4 | 59.9 | 70.8 | 7 / 35 | 3376 |
| 10 | 3 | 62.6 | 76.5 | 9 / 35 | 3575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 81 | 42% |
| ara.Shera 0.88 | 32 | 50% |
| maribo.mini.MiniQuester 0.1 | 30 | 73% |
| dsw.StaticD 1.0 | 5 | 60% |
| maribo.IotaCT 1.1 | 2 | 50% |

Hadur died in 274 of 350 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 92 | 34% | 123 |
| ara.Shera 0.88 | 77 | 28% | 93 |
| maribo.mini.MiniQuester 0.1 | 54 | 20% | 78 |
| amz.NanoClone 1.41 | 22 | 8% | 22 |
| maribo.IotaCT 1.1 | 12 | 4% | 13 |
| dsw.StaticD 1.0 | 7 | 3% | 11 |
| stelo.MirrorMicro 1.0 | 5 | 2% | 5 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 64.3 | 20 / 350 | 4.22 | 11.6% | 25778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.1% | 284 |
| brainfade.melee.Dusk 0.44 | 2.6 | 12.6% | 16 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.3% | 17 |
| hadur117.nano.SanaroB560 0.3 | 3.9 | 11.6% | 20 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.0% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 10.2% | 3 |
| mz.NanoGod 2.02 | 7.3 | 8.0% | 3 |
| jab.DiamondStealer 5 | 7.6 | 7.5% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.0 | 62.9 | 1 / 35 | 2173 |
| 2 | 4 | 57.6 | 61.9 | 2 / 35 | 2724 |
| 3 | 4 | 57.7 | 61.9 | 1 / 35 | 2777 |
| 4 | 4 | 58.4 | 65.7 | 1 / 35 | 2631 |
| 5 | 4 | 59.2 | 67.0 | 1 / 35 | 2456 |
| 6 | 4 | 58.1 | 63.8 | 1 / 35 | 2545 |
| 7 | 4 | 57.1 | 58.7 | 2 / 35 | 2831 |
| 8 | 3 | 60.1 | 70.2 | 5 / 35 | 2574 |
| 9 | 3 | 60.0 | 70.2 | 3 / 35 | 2649 |
| 10 | 4 | 57.0 | 60.3 | 3 / 35 | 2418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 83 | 7% |
| brainfade.melee.Dusk 0.44 | 14 | 64% |
| dummy.micro.Sparrow 2.5 | 11 | 36% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 330 of 350 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 161 | 49% | 167 |
| brainfade.melee.Dusk 0.44 | 45 | 14% | 54 |
| dummy.micro.Sparrow 2.5 | 44 | 13% | 48 |
| wcsv.melee.EngineerMelee 0.1 | 28 | 8% | 28 |
| Krabb.akim2.Akim2 1.1b | 23 | 7% | 23 |
| mz.NanoGod 2.02 | 14 | 4% | 15 |
| jab.DiamondStealer 5 | 14 | 4% | 14 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |

## Melee bench: F44

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 73.0 | 92 / 350 | 3.43 | 14.2% | 33641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.4 | 16.5% | 123 |
| tzu.TheArtOfWar 1.2 | 2.2 | 14.9% | 83 |
| hadur117.nano.SanaroB560 0.3 | 2.4 | 14.2% | 92 |
| jwirde.Gort 2.0 | 4.4 | 10.8% | 27 |
| wompi.Quokka 1.6 | 5.0 | 10.4% | 8 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.6 | 9.8% | 7 |
| disan.Chair 2.2.0 | 7.1 | 7.4% | 6 |
| stf.PanzerGeneral 0.1 | 7.9 | 6.3% | 1 |
| sample.Crazy 1.0 | 9.3 | 5.0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 71.7 | 8 / 35 | 3405 |
| 2 | 2 | 63.1 | 79.4 | 11 / 35 | 3443 |
| 3 | 2 | 62.6 | 79.0 | 9 / 35 | 3137 |
| 4 | 1 | 63.9 | 78.7 | 14 / 35 | 3694 |
| 5 | 3 | 58.0 | 64.8 | 5 / 35 | 3081 |
| 6 | 3 | 60.9 | 71.1 | 7 / 35 | 3542 |
| 7 | 2 | 63.5 | 76.2 | 13 / 35 | 3570 |
| 8 | 3 | 60.6 | 70.2 | 8 / 35 | 3186 |
| 9 | 3 | 61.0 | 71.4 | 9 / 35 | 3407 |
| 10 | 3 | 59.9 | 67.0 | 8 / 35 | 3176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 86 | 67% |
| tzu.TheArtOfWar 1.2 | 56 | 29% |
| jwirde.Gort 2.0 | 12 | 58% |
| wompi.Quokka 1.6 | 9 | 89% |
| disan.Chair 2.2.0 | 4 | 50% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 33% |
| amk.jointstrike.JointStrike 0.2 | 1 | 0% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 258 of 350 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 93 | 36% | 108 |
| stelo.Liblix 0.3.1 | 80 | 31% | 140 |
| jwirde.Gort 2.0 | 25 | 10% | 37 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 18 | 7% | 20 |
| wompi.Quokka 1.6 | 17 | 7% | 21 |
| disan.Chair 2.2.0 | 10 | 4% | 9 |
| stf.PanzerGeneral 0.1 | 9 | 3% | 10 |
| amk.jointstrike.JointStrike 0.2 | 5 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 0% | 0 |

## Melee bench: F45

hadur117.nano.SanaroB560 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 73.5 | 81 / 350 | 3.39 | 14.8% | 37003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB560 0.3 | 1.0 | 14.8% | 81 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 13.0% | 175 |
| jje.BagPuss 1.2 | 2.7 | 12.6% | 31 |
| sul.Lunar 1.1 | 3.9 | 11.4% | 36 |
| myl.nano.Graviton 1.10 | 4.9 | 10.8% | 9 |
| hvilela.HVilela 0.9 | 6.6 | 8.9% | 0 |
| fm.claire 1.7 | 7.0 | 8.6% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.4 | 8.2% | 6 |
| wit.Deep7 2.0 | 9.2 | 6.5% | 11 |
| abud.ThirdRobo 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 76.2 | 13 / 35 | 3712 |
| 2 | 1 | 62.1 | 72.4 | 9 / 35 | 3967 |
| 3 | 1 | 62.8 | 77.1 | 8 / 35 | 3745 |
| 4 | 1 | 61.2 | 71.7 | 6 / 35 | 3728 |
| 5 | 1 | 62.2 | 79.0 | 7 / 35 | 3191 |
| 6 | 1 | 61.2 | 72.4 | 6 / 35 | 3673 |
| 7 | 1 | 61.1 | 71.7 | 6 / 35 | 3768 |
| 8 | 1 | 62.8 | 75.6 | 8 / 35 | 3963 |
| 9 | 1 | 61.3 | 70.2 | 9 / 35 | 3811 |
| 10 | 1 | 60.0 | 68.3 | 9 / 35 | 3445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 108 | 44% |
| sul.Lunar 1.1 | 25 | 16% |
| jje.BagPuss 1.2 | 19 | 42% |
| myl.nano.Graviton 1.10 | 14 | 57% |
| wit.Deep7 2.0 | 12 | 58% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 100% |
| fm.claire 1.7 | 2 | 50% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 269 of 350 rounds, at a mean tick of 1328. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 68 | 25% | 0 |
| jje.BagPuss 1.2 | 59 | 22% | 97 |
| sul.Lunar 1.1 | 46 | 17% | 89 |
| myl.nano.Graviton 1.10 | 31 | 12% | 56 |
| fm.claire 1.7 | 21 | 8% | 27 |
| hvilela.HVilela 0.9 | 18 | 7% | 25 |
| pez.mini.ChironexFleckeri 0.5 | 14 | 5% | 26 |
| wit.Deep7 2.0 | 8 | 3% | 21 |
| abud.ThirdRobo 1.0 | 4 | 1% | 7 |

## Melee bench: F46

hadur117.nano.SanaroB560 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 75.7 | 69 / 350 | 2.95 | 15.1% | 28696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 22.1% | 232 |
| hadur117.nano.SanaroB560 0.3 | 2.0 | 15.1% | 69 |
| mz.MicroSheep 1.0 | 3.5 | 12.6% | 14 |
| cx.Princess 1.0 | 3.5 | 12.7% | 31 |
| sadoner.killer 0.2 | 5.0 | 10.7% | 1 |
| arthord.NanoSatanMelee Beta | 6.1 | 8.7% | 3 |
| jeremyreeder.collective.Prophet 5 | 7.1 | 7.6% | 0 |
| kurios.DOSexe .9a | 8.1 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 78.2 | 7 / 35 | 3176 |
| 2 | 2 | 59.9 | 72.1 | 9 / 35 | 2855 |
| 3 | 2 | 61.0 | 75.4 | 8 / 35 | 2817 |
| 4 | 2 | 64.4 | 86.1 | 10 / 35 | 3120 |
| 5 | 2 | 61.2 | 79.3 | 6 / 35 | 2598 |
| 6 | 2 | 62.1 | 78.9 | 9 / 35 | 2906 |
| 7 | 2 | 58.5 | 68.6 | 1 / 35 | 2761 |
| 8 | 2 | 61.1 | 74.6 | 5 / 35 | 3093 |
| 9 | 2 | 57.8 | 69.3 | 6 / 35 | 2596 |
| 10 | 2 | 60.6 | 74.3 | 8 / 35 | 2774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 163 | 35% |
| cx.Princess 1.0 | 13 | 38% |
| mz.MicroSheep 1.0 | 9 | 56% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| mbro.Detektor3 0.1.1 | 2 | 0% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 1066. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 170 | 60% | 231 |
| mz.MicroSheep 1.0 | 36 | 13% | 38 |
| cx.Princess 1.0 | 30 | 11% | 34 |
| sadoner.killer 0.2 | 21 | 7% | 23 |
| arthord.NanoSatanMelee Beta | 12 | 4% | 12 |
| jeremyreeder.collective.Prophet 5 | 5 | 2% | 6 |
| kurios.DOSexe .9a | 5 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 3 |
3 death(s) with no robot to name.

