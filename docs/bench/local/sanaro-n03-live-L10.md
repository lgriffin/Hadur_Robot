# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 68.7 | 15 / 350 | 3.82 | 12.8% | 36221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 263 |
| hadur117.nano.SanaroL10 0.1 | 2.5 | 12.8% | 15 |
| sgp.JollyNinja 3.53 | 3.2 | 12.0% | 36 |
| mz.MicroGodMelee 1 | 4.1 | 11.4% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.8 | 11.1% | 10 |
| lorneswork.Predator 1.0 | 5.5 | 10.2% | 7 |
| adt.Ar2 1.0 | 6.9 | 7.7% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 6.0% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 62.2 | 1 / 35 | 3412 |
| 2 | 2 | 60.7 | 72.7 | 3 / 35 | 3512 |
| 3 | 2 | 60.5 | 69.8 | 2 / 35 | 3986 |
| 4 | 4 | 56.3 | 62.5 | 0 / 35 | 3320 |
| 5 | 2 | 60.4 | 71.1 | 2 / 35 | 3647 |
| 6 | 2 | 61.7 | 75.9 | 3 / 35 | 3528 |
| 7 | 4 | 58.3 | 66.0 | 0 / 35 | 3685 |
| 8 | 2 | 60.3 | 69.2 | 2 / 35 | 4004 |
| 9 | 2 | 56.7 | 62.9 | 1 / 35 | 3416 |
| 10 | 2 | 61.2 | 74.6 | 1 / 35 | 3711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 87 | 1% |
| sgp.JollyNinja 3.53 | 14 | 36% |
| mz.MicroGodMelee 1 | 7 | 43% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 29% |
| adt.Ar2 1.0 | 3 | 33% |
| lorneswork.Predator 1.0 | 3 | 67% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 335 of 350 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 158 | 47% | 159 |
| mz.MicroGodMelee 1 | 56 | 17% | 58 |
| sgp.JollyNinja 3.53 | 34 | 10% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 34 | 10% | 36 |
| lorneswork.Predator 1.0 | 26 | 8% | 30 |
| adt.Ar2 1.0 | 15 | 4% | 16 |
| kawigi.sbf.FloodSonnet 0.9 | 8 | 2% | 8 |
| skm.butterfly 1.0 | 4 | 1% | 5 |

## Melee bench: F02

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 61.8 | 43 / 350 | 4.44 | 12.8% | 39891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.1 | 15.7% | 131 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.2 | 14.2% | 62 |
| hadur117.nano.SanaroL10 0.1 | 2.8 | 12.8% | 43 |
| lrem.micro.SpikeSoldier 0.4 | 3.9 | 11.4% | 6 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 10.1% | 31 |
| sch.Simone 0.3d | 6.3 | 8.9% | 29 |
| Noran.BitchingElk 0.054 | 7.3 | 7.8% | 23 |
| fnc.bandit.Bandit 5.2.0 | 7.4 | 7.8% | 8 |
| stelo.PatternRobot 1.0 | 8.7 | 6.9% | 16 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.9 | 63.8 | 3 / 35 | 4175 |
| 2 | 3 | 59.8 | 64.4 | 5 / 35 | 4154 |
| 3 | 2 | 58.9 | 64.8 | 4 / 35 | 4116 |
| 4 | 3 | 58.5 | 62.5 | 6 / 35 | 3870 |
| 5 | 4 | 55.0 | 52.1 | 4 / 35 | 3869 |
| 6 | 3 | 57.6 | 61.0 | 3 / 35 | 4015 |
| 7 | 3 | 57.7 | 60.6 | 5 / 35 | 3752 |
| 8 | 2 | 61.0 | 67.3 | 5 / 35 | 4336 |
| 9 | 2 | 60.5 | 67.0 | 7 / 35 | 4092 |
| 10 | 3 | 54.3 | 54.6 | 1 / 35 | 3512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 34 | 12% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 31 | 55% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 89% |
| sch.Simone 0.3d | 8 | 50% |
| stelo.PatternRobot 1.0 | 6 | 33% |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 100% |
| fnc.bandit.Bandit 5.2.0 | 5 | 40% |
| Noran.BitchingElk 0.054 | 2 | 0% |

Hadur died in 307 of 350 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 106 | 35% | 108 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 52 | 17% | 70 |
| lrem.micro.SpikeSoldier 0.4 | 41 | 13% | 47 |
| com.cohesiva.robocode.ManOwaR 1.0 | 26 | 8% | 33 |
| fnc.bandit.Bandit 5.2.0 | 24 | 8% | 28 |
| sch.Simone 0.3d | 23 | 7% | 28 |
| stelo.PatternRobot 1.0 | 19 | 6% | 20 |
| Noran.BitchingElk 0.054 | 10 | 3% | 10 |
| fullsail.SweetTea 1.1 | 6 | 2% | 6 |

## Melee bench: F03

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 74.1 | 64 / 350 | 3.33 | 14.1% | 39377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.4 | 15.8% | 112 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.6% | 78 |
| hadur117.nano.SanaroL10 0.1 | 2.9 | 14.1% | 64 |
| vuen.Cake 2.51 | 3.5 | 13.3% | 69 |
| urdos.URDOS 1.3 | 5.0 | 10.2% | 15 |
| adt.Ar1 2.1 | 6.6 | 7.8% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 7.1 | 7.3% | 5 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.7% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.9 | 5.6% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 74.0 | 5 / 35 | 4049 |
| 2 | 3 | 60.7 | 74.9 | 5 / 35 | 3670 |
| 3 | 2 | 62.1 | 77.1 | 9 / 35 | 3917 |
| 4 | 4 | 58.0 | 65.7 | 6 / 35 | 3630 |
| 5 | 3 | 61.6 | 75.9 | 10 / 35 | 3629 |
| 6 | 4 | 60.6 | 71.4 | 4 / 35 | 4059 |
| 7 | 1 | 61.6 | 76.8 | 4 / 35 | 4076 |
| 8 | 2 | 63.1 | 78.4 | 6 / 35 | 4502 |
| 9 | 4 | 60.4 | 73.0 | 6 / 35 | 3607 |
| 10 | 3 | 61.9 | 73.7 | 9 / 35 | 4238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 44 | 39% |
| vuen.Cake 2.51 | 43 | 28% |
| kawigi.nano.Lib 1.0 | 40 | 60% |
| urdos.URDOS 1.3 | 13 | 46% |
| ghent.ArthurPanzergon 1.0.0 | 5 | 60% |
| oa.weak.FlyMk1 0.1 | 3 | 67% |
| adt.Ar1 2.1 | 2 | 0% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% |

Hadur died in 287 of 350 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 86 | 30% | 99 |
| kawigi.nano.Lib 1.0 | 68 | 24% | 92 |
| vuen.Cake 2.51 | 53 | 18% | 67 |
| urdos.URDOS 1.3 | 37 | 13% | 43 |
| adt.Ar1 2.1 | 15 | 5% | 15 |
| ghent.ArthurPanzergon 1.0.0 | 9 | 3% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 2% | 7 |
| oa.weak.FlyMk1 0.1 | 6 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 5 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 63.5 | 3 / 350 | 4.29 | 12.5% | 41202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.4% | 329 |
| apc.LeeroyJenkins2 1.0 | 2.1 | 14.2% | 11 |
| hadur117.nano.SanaroL10 0.1 | 2.9 | 12.5% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 2 |
| josago.Jorgito 0.16 | 5.2 | 9.0% | 1 |
| css.Delitioner 0.11 | 6.0 | 8.1% | 1 |
| tj.zombie1n 1.0.1 | 7.1 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.5% | 1 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.7% | 1 |
| spin.Bugstard 0.012b | 9.7 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 68.9 | 2 / 35 | 4433 |
| 2 | 3 | 57.7 | 56.2 | 0 / 35 | 4219 |
| 3 | 3 | 58.6 | 62.2 | 0 / 35 | 3830 |
| 4 | 3 | 59.0 | 62.2 | 0 / 35 | 3899 |
| 5 | 3 | 62.3 | 69.5 | 0 / 35 | 4504 |
| 6 | 3 | 60.0 | 63.8 | 0 / 35 | 4325 |
| 7 | 3 | 59.8 | 64.1 | 1 / 35 | 3913 |
| 8 | 3 | 59.4 | 62.9 | 0 / 35 | 4049 |
| 9 | 3 | 57.0 | 60.3 | 0 / 35 | 3513 |
| 10 | 2 | 60.6 | 64.8 | 0 / 35 | 4517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 82 | 0% |
| TNT.TNT 0.99.1 | 2 | 100% |
| apc.LeeroyJenkins2 1.0 | 2 | 50% |
| sp.Nanos.Ember 1.1 | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 347 of 350 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 222 | 64% | 222 |
| apc.LeeroyJenkins2 1.0 | 48 | 14% | 50 |
| josago.Jorgito 0.16 | 24 | 7% | 24 |
| TNT.TNT 0.99.1 | 19 | 5% | 21 |
| css.Delitioner 0.11 | 13 | 4% | 13 |
| tj.zombie1n 1.0.1 | 8 | 2% | 8 |
| rampancy.Durandal 2.1d | 7 | 2% | 7 |
| sp.Nanos.Ember 1.1 | 6 | 2% | 5 |

## Melee bench: F06

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 61.4 | 40 / 350 | 4.47 | 11.8% | 30826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.3 | 15.5% | 93 |
| origin.SleepSiphon 1.7b | 1.8 | 14.9% | 117 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.2 | 13.1% | 54 |
| hadur117.nano.SanaroL10 0.1 | 4.1 | 11.8% | 40 |
| mld.Wisdom 1.0 | 4.6 | 11.2% | 17 |
| gg.Wolverine 2.0 | 6.5 | 8.3% | 11 |
| DBall.NUKE 0.1 | 7.4 | 7.7% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 7.7% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.4 | 6.9% | 12 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 65.1 | 5 / 35 | 3151 |
| 2 | 3 | 58.7 | 65.4 | 8 / 35 | 3150 |
| 3 | 4 | 54.6 | 57.8 | 3 / 35 | 2808 |
| 4 | 5 | 54.5 | 55.6 | 5 / 35 | 2795 |
| 5 | 5 | 55.0 | 59.7 | 1 / 35 | 2971 |
| 6 | 4 | 59.3 | 67.9 | 3 / 35 | 3411 |
| 7 | 5 | 56.8 | 61.3 | 4 / 35 | 3224 |
| 8 | 4 | 57.0 | 59.0 | 7 / 35 | 3133 |
| 9 | 3 | 56.2 | 60.6 | 3 / 35 | 3130 |
| 10 | 4 | 56.4 | 61.9 | 1 / 35 | 3053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 24 | 63% |
| origin.SleepSiphon 1.7b | 24 | 38% |
| pe.minimelee.SandboxMiniMelee 1.1 | 12 | 67% |
| mld.Wisdom 1.0 | 6 | 50% |
| gg.Wolverine 2.0 | 3 | 67% |
| spinnercat.Omen 1.0 | 2 | 50% |
| DBall.NUKE 0.1 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 0% |

Hadur died in 311 of 350 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 79 | 25% | 89 |
| jekl.StoneGhost 0.7 | 72 | 23% | 84 |
| pe.minimelee.SandboxMiniMelee 1.1 | 60 | 19% | 69 |
| mld.Wisdom 1.0 | 47 | 15% | 51 |
| gg.Wolverine 2.0 | 15 | 5% | 18 |
| spinnercat.Omen 1.0 | 14 | 5% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 13 | 4% | 13 |
| DBall.NUKE 0.1 | 8 | 3% | 8 |
| sample.Fire 1.0 | 3 | 1% | 3 |

## Melee bench: F07

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 74.5 | 42 / 350 | 3.29 | 14.8% | 45685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.5 | 18.4% | 130 |
| rsalesc.melee.Monk 0.3.6c | 1.5 | 18.5% | 127 |
| hadur117.nano.SanaroL10 0.1 | 3.0 | 14.8% | 42 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.9% | 17 |
| franzor.Lizt 1.3.1 | 4.7 | 11.1% | 32 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.4% | 1 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.2% | 2 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.1% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.3% | 0 |
| sample.Target 1.0 | 9.5 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 76.2 | 6 / 35 | 4254 |
| 2 | 3 | 63.4 | 70.2 | 4 / 35 | 4645 |
| 3 | 3 | 64.4 | 75.6 | 3 / 35 | 4635 |
| 4 | 3 | 65.7 | 78.1 | 3 / 35 | 4691 |
| 5 | 3 | 63.3 | 73.0 | 5 / 35 | 4265 |
| 6 | 3 | 64.8 | 75.2 | 4 / 35 | 4713 |
| 7 | 3 | 62.9 | 69.5 | 2 / 35 | 4601 |
| 8 | 3 | 64.4 | 73.7 | 6 / 35 | 4363 |
| 9 | 3 | 66.2 | 79.7 | 5 / 35 | 4734 |
| 10 | 3 | 64.7 | 74.0 | 4 / 35 | 4784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 75 | 37% |
| rsalesc.melee.Monk 0.3.6c | 40 | 3% |
| oog.melee.CapuletDroid 1.1 | 11 | 82% |
| franzor.Lizt 1.3.1 | 10 | 30% |
| exauge.GateKeeper 1.1.121g | 1 | 0% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 132 | 43% | 163 |
| rsalesc.melee.Monk 0.3.6c | 117 | 38% | 121 |
| oog.melee.CapuletDroid 1.1 | 28 | 9% | 39 |
| franzor.Lizt 1.3.1 | 14 | 5% | 7 |
| exauge.GateKeeper 1.1.121g | 10 | 3% | 11 |
| lrem.micro.MoggFanatic 0.2 | 5 | 2% | 7 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 2 |

## Melee bench: F08

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 65.7 | 39 / 350 | 4.09 | 12.6% | 32109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.4 | 14.3% | 98 |
| shrub.Vapour v159 | 2.0 | 13.9% | 93 |
| hadur117.nano.SanaroL10 0.1 | 3.0 | 12.6% | 39 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 11.1% | 35 |
| com.spp.robocode.MostlyHarmless 010 | 4.9 | 10.2% | 39 |
| m3thos.Eva00 1.1 | 5.7 | 9.6% | 22 |
| jwst.DAD.DarkAndDarker 1.1 | 7.6 | 7.8% | 14 |
| SHAM.WOW 1.4 | 8.6 | 7.0% | 3 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.5% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 7.0% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.5 | 55.9 | 1 / 35 | 2634 |
| 2 | 3 | 57.5 | 66.0 | 4 / 35 | 3171 |
| 3 | 3 | 57.6 | 63.8 | 4 / 35 | 3468 |
| 4 | 3 | 56.2 | 64.1 | 2 / 35 | 3028 |
| 5 | 4 | 54.0 | 57.8 | 4 / 35 | 3038 |
| 6 | 2 | 60.5 | 72.7 | 7 / 35 | 3482 |
| 7 | 4 | 57.1 | 63.8 | 3 / 35 | 3256 |
| 8 | 1 | 59.5 | 72.7 | 6 / 35 | 3313 |
| 9 | 3 | 58.8 | 69.2 | 4 / 35 | 3203 |
| 10 | 2 | 59.4 | 71.1 | 4 / 35 | 3516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 35 | 20% |
| tm.Yuugao 1.0 | 27 | 37% |
| com.spp.robocode.MostlyHarmless 010 | 12 | 8% |
| m3thos.Eva00 1.1 | 12 | 50% |
| Krabb.sliNk.Garm 0.9u | 11 | 64% |
| qualidafial.MajorDick 1.0.1 | 6 | 67% |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 50% |
| SHAM.WOW 1.4 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 80 | 26% | 89 |
| tm.Yuugao 1.0 | 71 | 23% | 85 |
| com.spp.robocode.MostlyHarmless 010 | 43 | 14% | 48 |
| Krabb.sliNk.Garm 0.9u | 35 | 11% | 40 |
| m3thos.Eva00 1.1 | 30 | 10% | 33 |
| zyx.nano.BacillusComma 1.0 | 20 | 6% | 21 |
| qualidafial.MajorDick 1.0.1 | 15 | 5% | 13 |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 4% | 13 |
| SHAM.WOW 1.4 | 7 | 2% | 8 |

## Melee bench: F09

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 55.9 | 12 / 350 | 4.97 | 10.8% | 28752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.9% | 188 |
| kc.micro.Figment 1.0 | 1.9 | 15.7% | 80 |
| yagami.Tidus 0.11 | 4.0 | 11.2% | 7 |
| pedersen.Grishnakh 1.0 | 4.1 | 11.1% | 31 |
| hadur117.nano.SanaroL10 0.1 | 4.3 | 10.8% | 12 |
| mc2.enemy.Original 0.9 | 5.6 | 9.7% | 27 |
| dft.Calliope 5.6 | 7.0 | 8.0% | 3 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 1 |
| robar.nano.Assertive_Melee 0.2 | 8.9 | 5.2% | 1 |
| rdm.Dueler 0.4x | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.9 | 54.9 | 1 / 35 | 2666 |
| 2 | 4 | 53.4 | 54.3 | 1 / 35 | 2780 |
| 3 | 4 | 54.1 | 53.3 | 0 / 35 | 3002 |
| 4 | 3 | 56.0 | 60.6 | 1 / 35 | 2917 |
| 5 | 5 | 54.3 | 55.9 | 1 / 35 | 3025 |
| 6 | 3 | 57.3 | 63.2 | 2 / 35 | 3261 |
| 7 | 6 | 51.9 | 50.5 | 1 / 35 | 2496 |
| 8 | 5 | 53.8 | 54.0 | 1 / 35 | 2830 |
| 9 | 4 | 55.6 | 56.8 | 3 / 35 | 3156 |
| 10 | 4 | 53.6 | 55.2 | 1 / 35 | 2619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 17 | 24% |
| positive.Portia 1.26e | 15 | 20% |
| mc2.enemy.Original 0.9 | 5 | 0% |
| yagami.Tidus 0.11 | 4 | 100% |
| pedersen.Grishnakh 1.0 | 2 | 0% |
| dft.Calliope 5.6 | 2 | 50% |

Hadur died in 338 of 350 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 93 | 28% | 96 |
| kc.micro.Figment 1.0 | 86 | 25% | 90 |
| yagami.Tidus 0.11 | 45 | 13% | 50 |
| pedersen.Grishnakh 1.0 | 43 | 13% | 43 |
| mc2.enemy.Original 0.9 | 39 | 12% | 39 |
| dft.Calliope 5.6 | 12 | 4% | 12 |
| robar.nano.Assertive_Melee 0.2 | 8 | 2% | 8 |
| rdm.Dueler 0.4x | 6 | 2% | 6 |
| step.nanoPri 1.0 | 6 | 2% | 6 |

## Melee bench: F10

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 73.6 | 77 / 350 | 3.38 | 14.2% | 38379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.7 | 14.8% | 95 |
| hadur117.nano.SanaroL10 0.1 | 2.5 | 14.2% | 77 |
| ne.Chimera 1.2 | 2.8 | 13.8% | 46 |
| ejb.Polaris 1.0.1 | 3.4 | 13.0% | 51 |
| tvv.micro.Antares 1.1.1 | 5.3 | 11.0% | 42 |
| vStar.RAFzilla 2.15 | 5.3 | 11.1% | 23 |
| sam.Samspin 1.0 | 7.5 | 6.5% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 6.1% | 1 |
| kurios.DOSexe .9b | 8.8 | 5.3% | 6 |
| donjezza.Muncho 1.0 | 9.7 | 4.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 71.4 | 8 / 35 | 3771 |
| 2 | 3 | 60.3 | 71.7 | 5 / 35 | 3872 |
| 3 | 1 | 64.3 | 82.5 | 10 / 35 | 4103 |
| 4 | 3 | 60.9 | 71.7 | 6 / 35 | 3932 |
| 5 | 3 | 58.8 | 67.3 | 4 / 35 | 3683 |
| 6 | 1 | 64.0 | 78.4 | 13 / 35 | 4044 |
| 7 | 3 | 61.3 | 71.4 | 10 / 35 | 3827 |
| 8 | 3 | 60.4 | 72.7 | 7 / 35 | 3557 |
| 9 | 2 | 62.4 | 77.1 | 9 / 35 | 3900 |
| 10 | 3 | 60.3 | 71.4 | 5 / 35 | 3690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 38 | 39% |
| ejb.Polaris 1.0.1 | 37 | 70% |
| ne.Chimera 1.2 | 25 | 48% |
| tvv.micro.Antares 1.1.1 | 24 | 17% |
| vStar.RAFzilla 2.15 | 18 | 67% |
| sam.Samspin 1.0 | 5 | 40% |
| donjezza.Muncho 1.0 | 4 | 50% |
| kurios.DOSexe .9b | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 274 of 350 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ne.Chimera 1.2 | 83 | 30% | 94 |
| DTF.Kludgy 1.2b | 72 | 26% | 86 |
| ejb.Polaris 1.0.1 | 44 | 16% | 73 |
| tvv.micro.Antares 1.1.1 | 32 | 12% | 30 |
| vStar.RAFzilla 2.15 | 21 | 8% | 31 |
| sam.Samspin 1.0 | 7 | 3% | 12 |
| kurios.DOSexe .9b | 7 | 3% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 2% | 8 |
| donjezza.Muncho 1.0 | 2 | 1% | 5 |

## Melee bench: F11

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.9 | 57.7 | 17 / 350 | 4.81 | 11.2% | 31046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.9% | 163 |
| cx.mini.Nimrod 0.55 | 2.3 | 13.1% | 52 |
| djc.DynaBot 0.1.1 | 3.5 | 11.4% | 30 |
| hadur117.nano.SanaroL10 0.1 | 3.9 | 11.2% | 17 |
| br2.MobyDickBot 1.6 | 5.2 | 10.2% | 30 |
| rdt199.Warlord 0.73 | 5.3 | 10.1% | 36 |
| uji.YellohFellah 1.0 | 7.0 | 8.3% | 21 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.4% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.1 | 5.5% | 2 |
| stelo.MirrorNano 1.3 | 9.9 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.2 | 56.5 | 1 / 35 | 3355 |
| 2 | 5 | 54.9 | 56.2 | 1 / 35 | 3246 |
| 3 | 4 | 55.4 | 58.7 | 3 / 35 | 3184 |
| 4 | 3 | 55.7 | 59.4 | 0 / 35 | 3317 |
| 5 | 4 | 55.4 | 59.0 | 4 / 35 | 2917 |
| 6 | 3 | 57.4 | 62.2 | 3 / 35 | 3496 |
| 7 | 5 | 53.4 | 55.6 | 2 / 35 | 2812 |
| 8 | 3 | 52.9 | 54.3 | 1 / 35 | 2803 |
| 9 | 3 | 55.3 | 58.7 | 2 / 35 | 3143 |
| 10 | 5 | 53.1 | 56.2 | 0 / 35 | 2773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 27 | 19% |
| cx.mini.Nimrod 0.55 | 10 | 40% |
| djc.DynaBot 0.1.1 | 5 | 40% |
| rdt199.Warlord 0.73 | 4 | 50% |
| uji.YellohFellah 1.0 | 4 | 75% |
| br2.MobyDickBot 1.6 | 2 | 50% |

Hadur died in 333 of 350 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 115 | 35% | 117 |
| cx.mini.Nimrod 0.55 | 69 | 21% | 73 |
| rdt199.Warlord 0.73 | 39 | 12% | 42 |
| djc.DynaBot 0.1.1 | 28 | 8% | 32 |
| br2.MobyDickBot 1.6 | 25 | 8% | 26 |
| KiraNL.Chupacabra 0.4 | 16 | 5% | 16 |
| uji.YellohFellah 1.0 | 15 | 5% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 14 | 4% | 14 |
| stelo.MirrorNano 1.3 | 12 | 4% | 11 |

## Melee bench: F12

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 62.8 | 45 / 350 | 4.35 | 12.0% | 28352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.6 | 14.2% | 83 |
| nat.PallasHawk 1.0 | 1.8 | 14.4% | 102 |
| darkcanuck.Leon 1.01 | 2.7 | 13.5% | 68 |
| hadur117.nano.SanaroL10 0.1 | 4.2 | 12.0% | 45 |
| brainfade.melee.Genghis 0.36 | 4.7 | 11.8% | 41 |
| jrm.Test0 1.0 | 6.3 | 8.2% | 2 |
| cs.sheldor.Talon 1.1 | 7.1 | 7.4% | 2 |
| jp.Perpy 16.0 | 7.7 | 7.1% | 4 |
| jaybot.bots.Oddball 4.0 | 9.4 | 5.8% | 4 |
| stuff.Vlad 0.1 | 9.5 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.9 | 62.5 | 4 / 35 | 2799 |
| 2 | 4 | 58.3 | 66.3 | 5 / 35 | 2877 |
| 3 | 5 | 55.2 | 59.0 | 5 / 35 | 2686 |
| 4 | 4 | 57.1 | 62.9 | 5 / 35 | 3167 |
| 5 | 4 | 56.2 | 61.6 | 6 / 35 | 2715 |
| 6 | 5 | 54.0 | 57.5 | 3 / 35 | 2595 |
| 7 | 3 | 59.9 | 71.1 | 7 / 35 | 2854 |
| 8 | 4 | 56.1 | 61.9 | 2 / 35 | 2863 |
| 9 | 5 | 55.2 | 60.3 | 3 / 35 | 2620 |
| 10 | 4 | 57.7 | 64.4 | 5 / 35 | 3176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 26 | 38% |
| darkcanuck.Leon 1.01 | 25 | 52% |
| nat.PallasHawk 1.0 | 24 | 50% |
| brainfade.melee.Genghis 0.36 | 7 | 43% |
| jaybot.bots.Oddball 4.0 | 3 | 33% |
| jrm.Test0 1.0 | 3 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 68 | 22% | 84 |
| bts.wiki.RipCurl 0.9b | 64 | 21% | 70 |
| darkcanuck.Leon 1.01 | 48 | 16% | 65 |
| brainfade.melee.Genghis 0.36 | 43 | 14% | 45 |
| jrm.Test0 1.0 | 29 | 10% | 30 |
| jaybot.bots.Oddball 4.0 | 18 | 6% | 19 |
| jp.Perpy 16.0 | 16 | 5% | 16 |
| cs.sheldor.Talon 1.1 | 13 | 4% | 14 |
| stuff.Vlad 0.1 | 6 | 2% | 6 |

## Melee bench: F13

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 63.8 | 11 / 350 | 4.26 | 11.7% | 32062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.6% | 178 |
| ags.Glacier 0.2.11 | 1.7 | 17.2% | 93 |
| gh.micro.Gruweltje 0.7 | 3.7 | 12.6% | 30 |
| shinh.Entangled 0.3 | 3.8 | 12.3% | 35 |
| hadur117.nano.SanaroL10 0.1 | 4.5 | 11.7% | 11 |
| apc.Colossus2 0.17 | 6.2 | 8.4% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.1% | 3 |
| ayk.WallHugger 1.0 | 8.2 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.3 | 67.6 | 0 / 35 | 3210 |
| 2 | 5 | 56.9 | 61.0 | 1 / 35 | 3205 |
| 3 | 4 | 59.5 | 67.0 | 1 / 35 | 3671 |
| 4 | 5 | 56.1 | 60.6 | 1 / 35 | 3134 |
| 5 | 5 | 56.3 | 61.0 | 0 / 35 | 3291 |
| 6 | 4 | 57.7 | 63.5 | 3 / 35 | 3102 |
| 7 | 5 | 57.5 | 63.5 | 0 / 35 | 3213 |
| 8 | 5 | 57.1 | 64.1 | 1 / 35 | 3004 |
| 9 | 5 | 56.7 | 62.9 | 2 / 35 | 3101 |
| 10 | 3 | 58.5 | 66.7 | 2 / 35 | 3131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 23 | 9% |
| mn.Combat 3.25.0 | 17 | 24% |
| shinh.Entangled 0.3 | 8 | 13% |
| gh.micro.Gruweltje 0.7 | 6 | 50% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 339 of 350 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 116 | 34% | 117 |
| mn.Combat 3.25.0 | 91 | 27% | 98 |
| shinh.Entangled 0.3 | 46 | 14% | 46 |
| gh.micro.Gruweltje 0.7 | 39 | 12% | 42 |
| stelo.Wang 1.0 | 20 | 6% | 20 |
| apc.Colossus2 0.17 | 14 | 4% | 14 |
| ayk.WallHugger 1.0 | 6 | 2% | 6 |
| maribo.FollowFire 1 | 5 | 1% | 5 |
| sample.Tracker 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 69.5 | 59 / 350 | 3.75 | 13.1% | 32496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 18.0% | 160 |
| hadur117.nano.SanaroL10 0.1 | 2.5 | 13.1% | 59 |
| catcat20.shape.Theta 0.018 | 2.7 | 12.6% | 73 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.1 | 10.9% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 5.6 | 10.3% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 10.1% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 6.3 | 9.7% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 8.2% | 13 |
| pa.Improved 1.0 | 9.0 | 5.4% | 3 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.9 | 62.5 | 2 / 35 | 3305 |
| 2 | 2 | 61.4 | 75.9 | 5 / 35 | 3395 |
| 3 | 2 | 58.8 | 67.0 | 7 / 35 | 2912 |
| 4 | 3 | 59.8 | 69.5 | 5 / 35 | 3324 |
| 5 | 2 | 59.2 | 68.9 | 6 / 35 | 3029 |
| 6 | 3 | 58.9 | 66.0 | 4 / 35 | 3344 |
| 7 | 2 | 61.9 | 74.3 | 7 / 35 | 3584 |
| 8 | 3 | 61.3 | 74.0 | 8 / 35 | 3047 |
| 9 | 3 | 58.7 | 66.0 | 8 / 35 | 3156 |
| 10 | 2 | 60.8 | 70.5 | 7 / 35 | 3400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 36% |
| catcat20.shape.Theta 0.018 | 20 | 30% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 62% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 50% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 60% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 17% |

Hadur died in 291 of 350 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 127 | 44% | 146 |
| catcat20.shape.Theta 0.018 | 44 | 15% | 58 |
| dmh.robocode.robot.RedDwarf 0.4 | 28 | 10% | 35 |
| co.edu.usb.rc.LidisTron 1.0 | 26 | 9% | 26 |
| sanyi.mikrobi.Roberto 1.0 | 24 | 8% | 34 |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 7% | 26 |
| Lo_Ian.Gandalf_V4 4.0 | 20 | 7% | 20 |
| pa.Improved 1.0 | 2 | 1% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 58.0 | 32 / 350 | 4.78 | 11.7% | 34792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 15.0% | 82 |
| emp.Yngwie 1.11 | 2.1 | 14.1% | 118 |
| mld.DustBunny 3.8 | 2.9 | 13.3% | 37 |
| hadur117.nano.SanaroL10 0.1 | 4.3 | 11.7% | 32 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.3% | 19 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.6% | 51 |
| Grystrion.TrackerWO 1.0 | 7.4 | 7.2% | 2 |
| lambdaxy.TBot 0.1 | 7.9 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.7% | 9 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.9 | 63.8 | 5 / 35 | 3677 |
| 2 | 3 | 58.0 | 64.4 | 3 / 35 | 3596 |
| 3 | 5 | 54.9 | 55.6 | 2 / 35 | 3243 |
| 4 | 5 | 54.3 | 53.7 | 3 / 35 | 3429 |
| 5 | 4 | 56.2 | 60.0 | 1 / 35 | 3345 |
| 6 | 5 | 55.1 | 54.6 | 4 / 35 | 3378 |
| 7 | 6 | 52.9 | 51.1 | 1 / 35 | 3298 |
| 8 | 4 | 57.2 | 61.0 | 5 / 35 | 3433 |
| 9 | 5 | 55.1 | 54.0 | 3 / 35 | 3485 |
| 10 | 3 | 58.6 | 62.2 | 5 / 35 | 3908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.nano.Insomnia 1.0 | 12 | 67% |
| kawigi.robot.Girl 1.2 | 12 | 58% |
| emp.Yngwie 1.11 | 11 | 55% |
| mld.DustBunny 3.8 | 11 | 55% |
| kawigi.micro.Shiz 1.1 | 10 | 50% |
| divineomega.TrialBot 0.003 | 1 | 0% |

Hadur died in 318 of 350 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 76 | 24% | 84 |
| kawigi.micro.Shiz 1.1 | 64 | 20% | 74 |
| mld.DustBunny 3.8 | 63 | 20% | 72 |
| cb.nano.Insomnia 1.0 | 41 | 13% | 36 |
| kawigi.robot.Girl 1.2 | 34 | 11% | 40 |
| Grystrion.TrackerWO 1.0 | 14 | 4% | 15 |
| divineomega.TrialBot 0.003 | 13 | 4% | 15 |
| lambdaxy.TBot 0.1 | 10 | 3% | 11 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 1% | 3 |

## Melee bench: F16

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 62.3 | 29 / 350 | 4.40 | 12.6% | 38675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.7% | 195 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 15.8% | 27 |
| hadur117.nano.SanaroL10 0.1 | 3.1 | 12.6% | 29 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.5% | 58 |
| tvv.nano.Polaris 1.2 | 5.4 | 9.4% | 19 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.1% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.6% | 6 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.9% | 12 |
| repositorio.NanoStep 1.0 | 9.0 | 5.4% | 0 |
| asd.Cthulhu 1.3 | 9.6 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 67.6 | 3 / 35 | 4208 |
| 2 | 4 | 56.7 | 57.8 | 3 / 35 | 3674 |
| 3 | 3 | 57.7 | 60.3 | 3 / 35 | 3796 |
| 4 | 3 | 55.1 | 54.9 | 0 / 35 | 3417 |
| 5 | 3 | 59.4 | 66.3 | 2 / 35 | 3713 |
| 6 | 3 | 54.8 | 53.7 | 1 / 35 | 3605 |
| 7 | 3 | 59.3 | 63.5 | 6 / 35 | 3896 |
| 8 | 3 | 59.7 | 65.4 | 4 / 35 | 3860 |
| 9 | 3 | 60.9 | 65.4 | 2 / 35 | 4391 |
| 10 | 3 | 61.0 | 67.6 | 5 / 35 | 4115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 48 | 13% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 79% |
| tvv.nano.Polaris 1.2 | 6 | 33% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| techdude.forest.FlamingForest 1.1 | 5 | 0% |
| divineomega.DivineBot 1.9.4.5 | 2 | 0% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| asd.Cthulhu 1.3 | 1 | 0% |

Hadur died in 321 of 350 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 135 | 42% | 145 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 91 | 28% | 98 |
| bvh.fnr.Fenrir 0.36l | 23 | 7% | 26 |
| techdude.forest.FlamingForest 1.1 | 22 | 7% | 23 |
| tvv.nano.Polaris 1.2 | 15 | 5% | 18 |
| stelo.IntrinsicVolatility 1.4 | 14 | 4% | 13 |
| asd.Cthulhu 1.3 | 12 | 4% | 12 |
| divineomega.DivineBot 1.9.4.5 | 8 | 2% | 12 |
| repositorio.NanoStep 1.0 | 1 | 0% | 3 |

## Melee bench: F17

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 60.8 | 38 / 350 | 4.53 | 12.1% | 35830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cx.BlestPain 1.41 | 1.8 | 14.1% | 92 |
| et.Predator 1.8 | 2.2 | 13.7% | 56 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.5% | 81 |
| hadur117.nano.SanaroL10 0.1 | 4.3 | 12.1% | 38 |
| nic.Nicator 2.4 | 4.9 | 11.8% | 39 |
| ahf.NanoAndrew .4 | 5.3 | 11.6% | 32 |
| maribo.melee.BMV 0.1 | 7.0 | 8.9% | 7 |
| tex.Longbot 0.4 | 8.4 | 5.6% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.6 | 5.6% | 4 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 69.2 | 6 / 35 | 4037 |
| 2 | 5 | 56.6 | 57.5 | 5 / 35 | 3453 |
| 3 | 6 | 57.0 | 61.0 | 2 / 35 | 3301 |
| 4 | 4 | 57.4 | 60.3 | 5 / 35 | 3501 |
| 5 | 3 | 57.4 | 63.5 | 3 / 35 | 3325 |
| 6 | 5 | 56.0 | 55.2 | 3 / 35 | 3838 |
| 7 | 5 | 56.9 | 57.8 | 5 / 35 | 3536 |
| 8 | 6 | 58.6 | 62.2 | 3 / 35 | 3697 |
| 9 | 4 | 55.5 | 57.5 | 2 / 35 | 3585 |
| 10 | 3 | 57.9 | 63.5 | 4 / 35 | 3557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 18 | 33% |
| oog.melee.Mercutio 1.0 | 18 | 39% |
| nic.Nicator 2.4 | 14 | 71% |
| ahf.NanoAndrew .4 | 9 | 33% |
| cx.BlestPain 1.41 | 9 | 67% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 60 | 19% | 65 |
| nic.Nicator 2.4 | 58 | 19% | 65 |
| oog.melee.Mercutio 1.0 | 54 | 17% | 62 |
| ahf.NanoAndrew .4 | 49 | 16% | 54 |
| et.Predator 1.8 | 44 | 14% | 54 |
| maribo.melee.BMV 0.1 | 26 | 8% | 28 |
| tex.Longbot 0.4 | 13 | 4% | 13 |
| edu.otg.spr.TheTeacher 1.2 | 8 | 3% | 8 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 64.5 | 61 / 350 | 4.20 | 12.7% | 33194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.9 | 13.5% | 82 |
| agd.Mooserwirt2 2.7 | 2.7 | 12.7% | 77 |
| hadur117.nano.SanaroL10 0.1 | 2.7 | 12.7% | 61 |
| uji.DBH 1.1 | 3.9 | 11.7% | 42 |
| ratosh.Nobo 0.21 | 4.8 | 11.1% | 16 |
| spinnercat.Robovirus 2.718 | 5.0 | 10.9% | 20 |
| sigterm.Sigterm 1.0 | 7.3 | 8.8% | 28 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.8% | 9 |
| stelo.WangRobot 1.0 | 9.0 | 6.0% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.7 | 66.7 | 10 / 35 | 3244 |
| 2 | 4 | 57.9 | 63.5 | 5 / 35 | 3345 |
| 3 | 1 | 62.0 | 72.7 | 12 / 35 | 3731 |
| 4 | 3 | 55.5 | 58.7 | 4 / 35 | 3258 |
| 5 | 3 | 57.6 | 65.1 | 5 / 35 | 3038 |
| 6 | 3 | 55.5 | 59.0 | 5 / 35 | 3168 |
| 7 | 1 | 57.4 | 63.8 | 4 / 35 | 3671 |
| 8 | 4 | 56.2 | 62.5 | 4 / 35 | 3051 |
| 9 | 4 | 57.9 | 65.4 | 3 / 35 | 3321 |
| 10 | 2 | 59.3 | 67.3 | 9 / 35 | 3367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 27 | 48% |
| agd.Mooserwirt2 2.7 | 23 | 39% |
| uji.DBH 1.1 | 19 | 53% |
| spinnercat.Robovirus 2.718 | 18 | 83% |
| sigterm.Sigterm 1.0 | 10 | 50% |
| ratosh.Nobo 0.21 | 9 | 44% |
| stelo.WangRobot 1.0 | 5 | 40% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 50% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 289 of 350 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 67 | 23% | 85 |
| agd.Mooserwirt2 2.7 | 45 | 16% | 56 |
| ratosh.Nobo 0.21 | 39 | 13% | 47 |
| uji.DBH 1.1 | 38 | 13% | 45 |
| spinnercat.Robovirus 2.718 | 30 | 10% | 39 |
| sigterm.Sigterm 1.0 | 25 | 9% | 28 |
| kawigi.mini.Fhqwhgads 1.1 | 24 | 8% | 26 |
| stelo.WangRobot 1.0 | 16 | 6% | 17 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 2% | 7 |

## Melee bench: F19

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 74.5 | 84 / 350 | 3.30 | 14.7% | 39054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.4 | 16.9% | 136 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 16.3% | 95 |
| hadur117.nano.SanaroL10 0.1 | 2.6 | 14.7% | 84 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 11.5% | 11 |
| erdnis.Rover 0.3 | 4.7 | 10.6% | 5 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.9% | 6 |
| mbh.Mbh 0.1 | 7.6 | 6.9% | 1 |
| pac.ABC 2.1 | 7.8 | 7.0% | 8 |
| pbg.R2D2 1.0 | 8.6 | 6.0% | 4 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.4 | 76.5 | 9 / 35 | 4003 |
| 2 | 3 | 62.4 | 73.3 | 6 / 35 | 3723 |
| 3 | 1 | 65.0 | 78.1 | 12 / 35 | 4496 |
| 4 | 2 | 64.5 | 77.5 | 9 / 35 | 4066 |
| 5 | 3 | 63.8 | 76.2 | 9 / 35 | 3676 |
| 6 | 2 | 66.0 | 78.4 | 14 / 35 | 4441 |
| 7 | 3 | 62.9 | 75.9 | 6 / 35 | 3635 |
| 8 | 3 | 62.0 | 69.8 | 5 / 35 | 3923 |
| 9 | 3 | 62.0 | 72.4 | 7 / 35 | 3576 |
| 10 | 3 | 61.0 | 66.7 | 7 / 35 | 3515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 64 | 48% |
| mld.Infinity 2.2 | 61 | 56% |
| krillr.mini.JointStrike 2.0.0 | 10 | 90% |
| patson.PatsonTestBot 1.0 | 7 | 86% |
| erdnis.Rover 0.3 | 6 | 50% |
| pbg.R2D2 1.0 | 4 | 25% |
| pac.ABC 2.1 | 1 | 0% |

Hadur died in 267 of 350 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 99 | 37% | 145 |
| mld.Infinity 2.2 | 73 | 27% | 59 |
| krillr.mini.JointStrike 2.0.0 | 26 | 10% | 41 |
| patson.PatsonTestBot 1.0 | 24 | 9% | 37 |
| erdnis.Rover 0.3 | 19 | 7% | 25 |
| pac.ABC 2.1 | 10 | 4% | 13 |
| pbg.R2D2 1.0 | 9 | 3% | 20 |
| mbh.Mbh 0.1 | 7 | 3% | 10 |

## Melee bench: F20

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 62.8 | 28 / 350 | 4.35 | 12.2% | 34611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.8% | 165 |
| nz.jdc.nano.GridFu 1.0 | 2.9 | 12.2% | 15 |
| hadur117.nano.SanaroL10 0.1 | 3.1 | 12.2% | 28 |
| fwb.Nine 1.0.1 | 3.1 | 11.9% | 47 |
| catcat20.Rabbit 0.001 | 5.0 | 10.3% | 45 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 8.9% | 16 |
| djdjdj.NanoSkunk10 1.0 | 6.9 | 8.9% | 11 |
| bayen.nut.Squirrel 1.615 | 7.2 | 8.4% | 20 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 67.6 | 6 / 35 | 3663 |
| 2 | 4 | 55.8 | 61.0 | 0 / 35 | 3293 |
| 3 | 5 | 56.4 | 59.7 | 2 / 35 | 3487 |
| 4 | 3 | 57.1 | 63.8 | 5 / 35 | 2972 |
| 5 | 2 | 58.4 | 63.2 | 3 / 35 | 3826 |
| 6 | 2 | 57.4 | 62.2 | 3 / 35 | 3682 |
| 7 | 2 | 58.8 | 67.3 | 4 / 35 | 3498 |
| 8 | 4 | 56.5 | 60.6 | 1 / 35 | 3448 |
| 9 | 3 | 57.4 | 65.4 | 2 / 35 | 3095 |
| 10 | 4 | 55.2 | 56.8 | 2 / 35 | 3647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 44 | 27% |
| nz.jdc.nano.GridFu 1.0 | 8 | 63% |
| catcat20.Rabbit 0.001 | 5 | 80% |
| djdjdj.NanoSkunk10 1.0 | 5 | 40% |
| fwb.Nine 1.0.1 | 4 | 50% |
| m3thos.mini.Eva01 0.5.5 | 3 | 0% |
| bayen.nut.Squirrel 1.615 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 109 | 34% | 119 |
| fwb.Nine 1.0.1 | 67 | 21% | 68 |
| nz.jdc.nano.GridFu 1.0 | 50 | 16% | 56 |
| bayen.nut.Squirrel 1.615 | 27 | 8% | 28 |
| catcat20.Rabbit 0.001 | 26 | 8% | 31 |
| m3thos.mini.Eva01 0.5.5 | 18 | 6% | 18 |
| djdjdj.NanoSkunk10 1.0 | 15 | 5% | 16 |
| ntc.ControlledChaos 1.1.4 | 8 | 2% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 5 |

## Melee bench: F21

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 72.8 | 75 / 350 | 3.45 | 14.9% | 43828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.0 | 17.7% | 181 |
| dummy.mini.Scimitar 1.01 | 2.4 | 15.2% | 34 |
| hadur117.nano.SanaroL10 0.1 | 2.6 | 14.9% | 75 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.6% | 25 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.7% | 8 |
| eld.Hmm 1.0 | 5.5 | 8.8% | 25 |
| fire219.CatBot 1.0 | 7.6 | 6.6% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.7% | 0 |
| el.JumpShoot 0.2 | 8.4 | 6.0% | 3 |
| arthord.MannyPacquiao Beta | 9.7 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 71.7 | 5 / 35 | 3755 |
| 2 | 2 | 63.5 | 71.4 | 8 / 35 | 4695 |
| 3 | 3 | 63.0 | 71.4 | 9 / 35 | 4284 |
| 4 | 3 | 61.8 | 69.5 | 7 / 35 | 4101 |
| 5 | 3 | 62.7 | 71.7 | 7 / 35 | 4425 |
| 6 | 3 | 63.5 | 75.2 | 5 / 35 | 4431 |
| 7 | 2 | 63.6 | 72.7 | 9 / 35 | 4642 |
| 8 | 3 | 63.6 | 73.7 | 9 / 35 | 4474 |
| 9 | 2 | 64.3 | 76.8 | 6 / 35 | 4497 |
| 10 | 2 | 63.9 | 73.7 | 10 / 35 | 4524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 70 | 54% |
| dummy.mini.Scimitar 1.01 | 27 | 96% |
| cf.RiO.RiOx 4.2.1 | 10 | 50% |
| eld.Hmm 1.0 | 6 | 67% |
| oa.weak.BotherBot 0.1 | 5 | 20% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 275 of 350 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 120 | 44% | 150 |
| dummy.mini.Scimitar 1.01 | 56 | 20% | 87 |
| cf.RiO.RiOx 4.2.1 | 46 | 17% | 51 |
| oa.weak.BotherBot 0.1 | 21 | 8% | 24 |
| eld.Hmm 1.0 | 14 | 5% | 20 |
| el.JumpShoot 0.2 | 7 | 3% | 8 |
| fire219.CatBot 1.0 | 4 | 1% | 4 |
| PSW.Relentless 0.1 | 4 | 1% | 3 |
| arthord.MannyPacquiao Beta | 3 | 1% | 3 |

## Melee bench: F23

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 71.9 | 57 / 350 | 3.53 | 13.9% | 35726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 19.2% | 176 |
| cre.Karolos 0.32 | 2.4 | 15.3% | 73 |
| hadur117.nano.SanaroL10 0.1 | 2.6 | 13.9% | 57 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 10.8% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.9 | 9.3% | 4 |
| stelo.RamTrackSurfer 1.2 | 6.1 | 9.4% | 14 |
| sample.Walls 1.0 | 6.5 | 9.1% | 15 |
| cw.megas.Blade 0.8 | 7.4 | 8.5% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 79.4 | 7 / 35 | 4004 |
| 2 | 2 | 63.4 | 74.6 | 9 / 35 | 3508 |
| 3 | 2 | 62.6 | 74.6 | 6 / 35 | 3229 |
| 4 | 3 | 59.7 | 63.5 | 4 / 35 | 3431 |
| 5 | 3 | 61.3 | 69.8 | 5 / 35 | 3213 |
| 6 | 3 | 64.3 | 77.5 | 9 / 35 | 3692 |
| 7 | 3 | 59.1 | 61.3 | 3 / 35 | 3409 |
| 8 | 3 | 60.1 | 67.3 | 5 / 35 | 3366 |
| 9 | 2 | 64.2 | 78.4 | 5 / 35 | 3747 |
| 10 | 3 | 63.5 | 73.0 | 4 / 35 | 4127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 64 | 27% |
| cre.Karolos 0.32 | 32 | 38% |
| sample.Walls 1.0 | 14 | 79% |
| stelo.AreaTargetingBot 1.1 | 10 | 70% |
| stelo.RamTrackSurfer 1.2 | 9 | 78% |
| cw.megas.Blade 0.8 | 4 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 0% |

Hadur died in 294 of 350 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 135 | 46% | 155 |
| cre.Karolos 0.32 | 74 | 25% | 87 |
| stelo.AreaTargetingBot 1.1 | 28 | 10% | 35 |
| stelo.RamTrackSurfer 1.2 | 18 | 6% | 26 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 18 | 6% | 21 |
| sample.Walls 1.0 | 13 | 4% | 17 |
| cw.megas.Blade 0.8 | 6 | 2% | 8 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F24

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.2 | 57.3 | 26 / 350 | 4.84 | 11.0% | 28420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.2% | 79 |
| davidalves.Phoenix 0.54 | 2.4 | 13.6% | 85 |
| florent.XSeries.X2 0.12 | 2.8 | 13.4% | 73 |
| pedersen.Ugluk 1.1.1 | 3.3 | 12.9% | 54 |
| hadur117.nano.SanaroL10 0.1 | 4.9 | 11.0% | 26 |
| oog.melee.Corsair 1.0 | 6.2 | 9.4% | 11 |
| stelo.SoJNanoMelee 1.1 | 6.6 | 8.7% | 21 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.6% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 5.3% | 0 |
| evd.X1 0.01 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 50.7 | 50.5 | 0 / 35 | 2582 |
| 2 | 6 | 51.0 | 49.8 | 2 / 35 | 2636 |
| 3 | 5 | 56.3 | 62.2 | 2 / 35 | 2930 |
| 4 | 5 | 54.9 | 61.0 | 3 / 35 | 2758 |
| 5 | 5 | 54.3 | 56.5 | 4 / 35 | 2789 |
| 6 | 5 | 54.2 | 57.5 | 3 / 35 | 2792 |
| 7 | 5 | 53.7 | 55.9 | 1 / 35 | 2681 |
| 8 | 6 | 53.4 | 54.9 | 2 / 35 | 3073 |
| 9 | 2 | 57.9 | 64.1 | 6 / 35 | 3254 |
| 10 | 5 | 56.1 | 61.0 | 3 / 35 | 2925 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pedersen.Ugluk 1.1.1 | 15 | 33% |
| rz.GlowBlowMelee 1.4 | 14 | 43% |
| davidalves.Phoenix 0.54 | 9 | 33% |
| stelo.SoJNanoMelee 1.1 | 8 | 38% |
| florent.XSeries.X2 0.12 | 8 | 63% |
| oog.melee.Corsair 1.0 | 3 | 33% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 325 of 350 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 73 | 22% | 79 |
| florent.XSeries.X2 0.12 | 67 | 21% | 72 |
| davidalves.Phoenix 0.54 | 62 | 19% | 64 |
| pedersen.Ugluk 1.1.1 | 56 | 17% | 59 |
| stelo.SoJNanoMelee 1.1 | 23 | 7% | 25 |
| oog.melee.Corsair 1.0 | 22 | 7% | 26 |
| lunchie.Lunchbox 0.93 | 10 | 3% | 13 |
| evd.X1 0.01 | 9 | 3% | 9 |
| as.FrankTheTank 1.3 | 3 | 1% | 3 |

## Melee bench: F25

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 60.7 | 57 / 350 | 4.53 | 12.0% | 28235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 14.4% | 71 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.4% | 45 |
| jdw.Hurricane 1.4 | 2.8 | 13.1% | 68 |
| hadur117.nano.SanaroL10 0.1 | 3.5 | 12.0% | 57 |
| gre.svman4.Morfeas 1.4.1 | 4.5 | 11.4% | 53 |
| gjr.Cephalosporin 0.1 | 6.4 | 8.9% | 20 |
| ds.Oo 2.2 | 7.1 | 8.6% | 23 |
| awesomeness.Elite 1.0 | 7.8 | 7.5% | 9 |
| adt.Ar2 1.1 | 8.7 | 6.7% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.1 | 57.1 | 5 / 35 | 2751 |
| 2 | 1 | 60.7 | 72.7 | 8 / 35 | 3026 |
| 3 | 4 | 53.9 | 55.2 | 4 / 35 | 2951 |
| 4 | 5 | 52.6 | 53.0 | 6 / 35 | 2223 |
| 5 | 5 | 52.8 | 52.1 | 5 / 35 | 2560 |
| 6 | 4 | 54.4 | 55.2 | 4 / 35 | 2913 |
| 7 | 4 | 57.2 | 61.3 | 6 / 35 | 3094 |
| 8 | 2 | 60.6 | 69.8 | 7 / 35 | 3308 |
| 9 | 3 | 60.0 | 71.7 | 7 / 35 | 2683 |
| 10 | 4 | 55.4 | 59.0 | 5 / 35 | 2726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 25 | 60% |
| gre.svman4.Morfeas 1.4.1 | 25 | 60% |
| voidious.micro.BlitzBat 1.05 | 20 | 55% |
| jdw.Hurricane 1.4 | 17 | 71% |
| ds.Oo 2.2 | 4 | 50% |
| awesomeness.Elite 1.0 | 3 | 33% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 69 | 24% | 86 |
| voidious.micro.BlitzBat 1.05 | 53 | 18% | 66 |
| jdw.Hurricane 1.4 | 45 | 15% | 55 |
| gjr.Cephalosporin 0.1 | 38 | 13% | 40 |
| gre.svman4.Morfeas 1.4.1 | 32 | 11% | 41 |
| ds.Oo 2.2 | 23 | 8% | 27 |
| adt.Ar2 1.1 | 18 | 6% | 19 |
| awesomeness.Elite 1.0 | 13 | 4% | 12 |
| amk.ChumbaMini 0.2 | 2 | 1% | 3 |

## Melee bench: F26

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 65.0 | 33 / 350 | 4.15 | 12.6% | 37255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.5% | 135 |
| shu.nitro.LENIN .T34 | 2.8 | 13.0% | 73 |
| hadur117.nano.SanaroL10 0.1 | 3.4 | 12.6% | 33 |
| lrem.Spectre 0.4.4 | 3.7 | 12.5% | 48 |
| gh.mini.GrubbmOne 1.0 | 4.8 | 11.3% | 18 |
| js.PinBall 1.6 | 5.4 | 11.1% | 23 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 9.1% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 7.9 | 7.1% | 12 |
| sample.SpinBot 1.0 | 9.0 | 5.3% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.7 | 61.9 | 3 / 35 | 4017 |
| 2 | 4 | 57.7 | 64.8 | 3 / 35 | 3434 |
| 3 | 3 | 59.0 | 63.2 | 6 / 35 | 3911 |
| 4 | 2 | 61.0 | 71.4 | 5 / 35 | 3984 |
| 5 | 5 | 57.3 | 61.3 | 1 / 35 | 3505 |
| 6 | 2 | 61.6 | 72.4 | 4 / 35 | 3952 |
| 7 | 3 | 59.3 | 66.3 | 4 / 35 | 3723 |
| 8 | 4 | 57.3 | 60.0 | 2 / 35 | 3743 |
| 9 | 4 | 57.9 | 62.9 | 3 / 35 | 3565 |
| 10 | 3 | 58.3 | 65.4 | 2 / 35 | 3421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 33 | 18% |
| lrem.Spectre 0.4.4 | 19 | 47% |
| shu.nitro.LENIN .T34 | 18 | 17% |
| js.PinBall 1.6 | 13 | 54% |
| gh.mini.GrubbmOne 1.0 | 9 | 44% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 80% |
| sample.SpinBot 1.0 | 1 | 0% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 0% |

Hadur died in 317 of 350 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 84 | 26% | 91 |
| gh.mini.GrubbmOne 1.0 | 54 | 17% | 59 |
| shu.nitro.LENIN .T34 | 51 | 16% | 56 |
| lrem.Spectre 0.4.4 | 46 | 15% | 53 |
| js.PinBall 1.6 | 35 | 11% | 42 |
| jaybot.adv.bots.JayBot 2.0 | 24 | 8% | 26 |
| fullsail.LaxativeTeaTwo 1.0 | 14 | 4% | 13 |
| sample.SpinBot 1.0 | 9 | 3% | 10 |

## Melee bench: F27

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 63.3 | 35 / 350 | 4.30 | 11.8% | 27961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.4 | 16.6% | 173 |
| wee.Gem 1.8.4 | 3.1 | 12.0% | 54 |
| hadur117.nano.SanaroL10 0.1 | 3.3 | 11.8% | 35 |
| sheldor.melee.nano.TestMelee 0.1 | 3.7 | 11.6% | 40 |
| EH.Eagle 1.0.6 | 4.5 | 10.6% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 5.7 | 9.5% | 14 |
| throxbot.ThroxBot 0.1 | 7.1 | 8.5% | 8 |
| joe.ADinosaur 1.0 | 8.1 | 7.5% | 6 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.1% | 3 |
| cs.Grudge 1.0 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.3 | 60.3 | 2 / 35 | 2542 |
| 2 | 2 | 59.8 | 71.7 | 8 / 35 | 3066 |
| 3 | 2 | 57.2 | 66.3 | 5 / 35 | 2731 |
| 4 | 4 | 55.5 | 61.9 | 3 / 35 | 2831 |
| 5 | 4 | 54.6 | 60.3 | 1 / 35 | 2619 |
| 6 | 3 | 56.3 | 63.2 | 3 / 35 | 2833 |
| 7 | 5 | 54.9 | 60.6 | 1 / 35 | 2867 |
| 8 | 4 | 55.5 | 63.2 | 2 / 35 | 2558 |
| 9 | 3 | 54.9 | 61.9 | 2 / 35 | 2665 |
| 10 | 2 | 58.0 | 63.5 | 8 / 35 | 3249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 49 | 33% |
| EH.Eagle 1.0.6 | 15 | 47% |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 50% |
| wee.Gem 1.8.4 | 3 | 33% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 67% |
| joe.ADinosaur 1.0 | 2 | 50% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| throxbot.ThroxBot 0.1 | 2 | 100% |

Hadur died in 315 of 350 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 106 | 34% | 123 |
| sheldor.melee.nano.TestMelee 0.1 | 51 | 16% | 57 |
| wee.Gem 1.8.4 | 46 | 15% | 47 |
| EH.Eagle 1.0.6 | 35 | 11% | 41 |
| joe.ADinosaur 1.0 | 24 | 8% | 27 |
| throxbot.ThroxBot 0.1 | 19 | 6% | 20 |
| techdude.kombat.FlamingKombat 1.5 | 19 | 6% | 19 |
| caimano.Furia_Ceca 0.22 | 15 | 5% | 16 |

## Melee bench: F28

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 75.9 | 93 / 350 | 3.17 | 15.0% | 35882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.1% | 110 |
| hadur117.nano.SanaroL10 0.1 | 1.8 | 15.0% | 93 |
| uji.Antique 1.0 | 3.0 | 12.9% | 81 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.9% | 19 |
| qohnil.blot.BlotBot 3.61 | 4.6 | 10.7% | 26 |
| ahr.ice.Ice 1.0.2 | 6.4 | 8.4% | 5 |
| amk.ChumbaWumba 0.3 | 6.8 | 8.0% | 5 |
| matt.advanced.Katana 1.0 | 7.9 | 6.8% | 9 |
| stelo.PianistNano 1.2 | 8.8 | 6.0% | 2 |
| stelo.Lifestealer 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 81.6 | 10 / 35 | 3977 |
| 2 | 1 | 63.3 | 79.0 | 14 / 35 | 3393 |
| 3 | 2 | 62.2 | 77.8 | 8 / 35 | 3567 |
| 4 | 1 | 63.6 | 79.4 | 10 / 35 | 3538 |
| 5 | 2 | 61.4 | 75.6 | 8 / 35 | 3141 |
| 6 | 3 | 59.7 | 67.6 | 6 / 35 | 3416 |
| 7 | 2 | 62.2 | 75.6 | 9 / 35 | 3592 |
| 8 | 2 | 61.9 | 72.1 | 11 / 35 | 3532 |
| 9 | 2 | 64.4 | 78.7 | 11 / 35 | 4056 |
| 10 | 2 | 60.7 | 72.1 | 6 / 35 | 3670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 68 | 53% |
| uji.Antique 1.0 | 46 | 61% |
| qohnil.blot.BlotBot 3.61 | 17 | 65% |
| ahr.ice.Ice 1.0.2 | 8 | 50% |
| matt.advanced.Katana 1.0 | 7 | 57% |
| pfvicm.Sobieski 7.2.3b | 7 | 43% |
| stelo.PianistNano 1.2 | 4 | 75% |
| amk.ChumbaWumba 0.3 | 4 | 75% |
| stelo.Lifestealer 1.0 | 1 | 0% |

Hadur died in 257 of 350 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 80 | 31% | 98 |
| uji.Antique 1.0 | 62 | 24% | 95 |
| pfvicm.Sobieski 7.2.3b | 35 | 14% | 42 |
| qohnil.blot.BlotBot 3.61 | 23 | 9% | 37 |
| amk.ChumbaWumba 0.3 | 19 | 7% | 21 |
| ahr.ice.Ice 1.0.2 | 13 | 5% | 21 |
| stelo.Lifestealer 1.0 | 10 | 4% | 12 |
| matt.advanced.Katana 1.0 | 9 | 4% | 16 |
| stelo.PianistNano 1.2 | 6 | 2% | 7 |

## Melee bench: F29

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 58.8 | 22 / 350 | 4.71 | 11.6% | 31510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.5 | 16.4% | 122 |
| zyx.mega.YersiniaPestis 3.1 | 1.5 | 16.4% | 144 |
| myl.micro.Troodon 1.10 | 3.8 | 12.5% | 24 |
| jok.PheonixM 0.1.2 | 4.0 | 12.1% | 25 |
| hadur117.nano.SanaroL10 0.1 | 4.2 | 11.6% | 22 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.2% | 1 |
| DBall.Anarchy 0.1 | 6.9 | 7.7% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.0% | 0 |
| jangs.ns51 1.0 | 9.4 | 4.5% | 2 |
| ap.Frederick 1.1 | 9.5 | 4.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.7 | 54.6 | 0 / 35 | 2853 |
| 2 | 5 | 53.9 | 54.3 | 1 / 35 | 2740 |
| 3 | 4 | 56.6 | 59.4 | 4 / 35 | 3003 |
| 4 | 3 | 60.1 | 66.0 | 3 / 35 | 3677 |
| 5 | 4 | 56.9 | 59.0 | 5 / 35 | 3218 |
| 6 | 3 | 57.9 | 61.6 | 3 / 35 | 3184 |
| 7 | 3 | 59.7 | 65.1 | 3 / 35 | 3638 |
| 8 | 5 | 55.7 | 56.2 | 1 / 35 | 3109 |
| 9 | 5 | 55.7 | 56.2 | 2 / 35 | 3000 |
| 10 | 5 | 54.6 | 55.6 | 0 / 35 | 3088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 25 | 20% |
| zyx.mega.YersiniaPestis 3.1 | 20 | 40% |
| myl.micro.Troodon 1.10 | 8 | 63% |
| jok.PheonixM 0.1.2 | 5 | 40% |
| DBall.Anarchy 0.1 | 3 | 67% |
| ap.Frederick 1.1 | 1 | 0% |

Hadur died in 328 of 350 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 117 | 36% | 122 |
| zyx.mega.YersiniaPestis 3.1 | 63 | 19% | 70 |
| myl.micro.Troodon 1.10 | 62 | 19% | 66 |
| jok.PheonixM 0.1.2 | 47 | 14% | 50 |
| fullsail.TimbotNoPrediction 1.0 | 12 | 4% | 12 |
| ph.melee.ArcherME 0.3 | 11 | 3% | 11 |
| jangs.ns51 1.0 | 8 | 2% | 8 |
| DBall.Anarchy 0.1 | 7 | 2% | 11 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F30

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.8 | 50.0 | 8 / 350 | 5.50 | 9.5% | 26336 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.1 | 14.5% | 98 |
| stelo.PastFuture 2.3.2 | 2.3 | 13.7% | 68 |
| oog.melee.Capulet 1.2 | 2.5 | 13.6% | 63 |
| darkcanuck.B26354 1.06 | 3.1 | 13.3% | 74 |
| hadur117.nano.SanaroL10 0.1 | 6.0 | 9.5% | 8 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.3% | 20 |
| ntc.Opposite 1.5 | 7.2 | 8.1% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.6% | 9 |
| tripphippy.Alice 1.1 | 7.9 | 7.6% | 8 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.5 | 53.7 | 1 / 35 | 2896 |
| 2 | 6 | 52.3 | 52.4 | 0 / 35 | 2971 |
| 3 | 5 | 51.3 | 49.5 | 1 / 35 | 2595 |
| 4 | 5 | 54.1 | 55.9 | 1 / 35 | 2799 |
| 5 | 6 | 50.6 | 50.5 | 0 / 35 | 2505 |
| 6 | 7 | 47.5 | 45.1 | 0 / 35 | 2309 |
| 7 | 5 | 53.5 | 54.3 | 2 / 35 | 2963 |
| 8 | 7 | 48.4 | 45.1 | 0 / 35 | 2430 |
| 9 | 5 | 52.5 | 53.0 | 3 / 35 | 2583 |
| 10 | 9 | 45.3 | 40.6 | 0 / 35 | 2285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.PastFuture 2.3.2 | 10 | 30% |
| darkcanuck.B26354 1.06 | 8 | 38% |
| catcat20.Matcha 0.006 | 5 | 0% |
| oog.melee.Capulet 1.2 | 4 | 50% |
| intruder.PrairieWolf 2.61 | 3 | 0% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |

Hadur died in 342 of 350 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 71 | 21% | 75 |
| oog.melee.Capulet 1.2 | 59 | 17% | 62 |
| catcat20.Matcha 0.006 | 58 | 17% | 59 |
| darkcanuck.B26354 1.06 | 52 | 15% | 54 |
| ntc.Opposite 1.5 | 29 | 8% | 29 |
| intruder.PrairieWolf 2.61 | 27 | 8% | 27 |
| tripphippy.Alice 1.1 | 20 | 6% | 20 |
| fowl3628800.LightningBolt 2.6.0 | 19 | 6% | 17 |
| GarmBox.Anger 1.0 | 7 | 2% | 7 |

## Melee bench: F31

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.7 | 52.8 | 11 / 350 | 5.25 | 10.1% | 26425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.1% | 211 |
| gh.mini.Griezel 0.2 | 2.1 | 14.1% | 81 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 12.2% | 24 |
| d414.nano.Quantum 1.0.0 | 4.1 | 11.2% | 13 |
| hadur117.nano.SanaroL10 0.1 | 5.0 | 10.1% | 11 |
| gh.nano.Grofvuil 0.2 | 5.5 | 9.5% | 7 |
| timmit.nano.TimDog 0.33 | 7.4 | 7.1% | 1 |
| fm.mammillarias 1.3 | 7.6 | 6.8% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.4 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.9 | 54.3 | 0 / 35 | 2613 |
| 2 | 5 | 54.9 | 57.8 | 2 / 35 | 2717 |
| 3 | 6 | 54.4 | 56.8 | 0 / 35 | 2675 |
| 4 | 5 | 51.1 | 48.6 | 0 / 35 | 2544 |
| 5 | 4 | 53.5 | 55.9 | 1 / 35 | 2554 |
| 6 | 4 | 54.1 | 53.3 | 4 / 35 | 2756 |
| 7 | 6 | 48.5 | 44.4 | 0 / 35 | 2612 |
| 8 | 5 | 52.8 | 52.1 | 2 / 35 | 2661 |
| 9 | 5 | 51.7 | 52.1 | 1 / 35 | 2594 |
| 10 | 5 | 53.0 | 53.0 | 1 / 35 | 2699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 23 | 4% |
| gh.mini.Griezel 0.2 | 14 | 21% |
| d414.nano.Quantum 1.0.0 | 3 | 67% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| spinnercat.micro.Tyger 0.1 | 2 | 50% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |

Hadur died in 339 of 350 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 92 | 27% | 94 |
| gh.mini.Griezel 0.2 | 79 | 23% | 82 |
| spinnercat.micro.Tyger 0.1 | 54 | 16% | 56 |
| d414.nano.Quantum 1.0.0 | 43 | 13% | 43 |
| gh.nano.Grofvuil 0.2 | 26 | 8% | 26 |
| fm.mammillarias 1.3 | 19 | 6% | 19 |
| timmit.nano.TimDog 0.33 | 13 | 4% | 16 |
| Gecko.ultimateGeckoBot 1.0 | 12 | 4% | 12 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 2 |

## Melee bench: F32

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.6 | 74 / 350 | 3.92 | 13.2% | 33858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.2 | 15.3% | 114 |
| hadur117.nano.SanaroL10 0.1 | 2.3 | 13.2% | 74 |
| apc.botM 3.0 | 3.1 | 12.5% | 56 |
| vjik.UnViolation 1.1 | 4.0 | 11.4% | 45 |
| lxx.ConceptA 0.8 | 4.5 | 11.2% | 14 |
| bayen.UbaMicro 1.4 | 6.3 | 8.9% | 14 |
| yk.JahMicro 1.0 | 7.5 | 7.6% | 16 |
| panzer.Panzer 0.2 | 8.0 | 7.1% | 4 |
| conscience.Electron 1.3g | 8.4 | 6.8% | 2 |
| donjezza.Jezza 1.0 | 9.7 | 5.9% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.4 | 65.7 | 6 / 35 | 3180 |
| 2 | 3 | 58.6 | 68.6 | 5 / 35 | 3464 |
| 3 | 1 | 61.4 | 73.0 | 12 / 35 | 3626 |
| 4 | 3 | 58.7 | 68.6 | 7 / 35 | 3411 |
| 5 | 4 | 56.1 | 62.9 | 5 / 35 | 2907 |
| 6 | 2 | 59.7 | 68.9 | 11 / 35 | 3358 |
| 7 | 2 | 58.5 | 68.9 | 5 / 35 | 3133 |
| 8 | 1 | 61.9 | 74.9 | 8 / 35 | 3949 |
| 9 | 2 | 55.5 | 57.1 | 8 / 35 | 3355 |
| 10 | 3 | 58.8 | 67.0 | 7 / 35 | 3475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 65 | 49% |
| apc.botM 3.0 | 26 | 62% |
| vjik.UnViolation 1.1 | 20 | 50% |
| lxx.ConceptA 0.8 | 10 | 80% |
| yk.JahMicro 1.0 | 5 | 60% |
| bayen.UbaMicro 1.4 | 4 | 50% |
| donjezza.Jezza 1.0 | 4 | 25% |
| panzer.Panzer 0.2 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 276 of 350 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 72 | 26% | 107 |
| lxx.ConceptA 0.8 | 58 | 21% | 62 |
| apc.botM 3.0 | 47 | 17% | 65 |
| vjik.UnViolation 1.1 | 30 | 11% | 41 |
| bayen.UbaMicro 1.4 | 22 | 8% | 25 |
| panzer.Panzer 0.2 | 18 | 7% | 19 |
| conscience.Electron 1.3g | 13 | 5% | 13 |
| yk.JahMicro 1.0 | 10 | 4% | 11 |
| donjezza.Jezza 1.0 | 6 | 2% | 7 |

## Melee bench: F33

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 60.4 | 32 / 350 | 4.57 | 12.1% | 34049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.8% | 144 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 13.3% | 38 |
| hadur117.nano.SanaroL10 0.1 | 3.6 | 12.1% | 32 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.7% | 54 |
| labg.Cataclysm 2.05 | 4.3 | 11.4% | 57 |
| baal.nano.N 1.42 | 5.9 | 9.1% | 5 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.5% | 13 |
| zyx.micro.Ant 1.1 | 8.2 | 5.8% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.4 | 5.1% | 5 |
| sanja.First 0.1 | 9.4 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 62.5 | 6 / 35 | 3448 |
| 2 | 4 | 57.4 | 62.5 | 2 / 35 | 3438 |
| 3 | 4 | 56.7 | 59.4 | 3 / 35 | 3437 |
| 4 | 4 | 56.9 | 59.7 | 2 / 35 | 3457 |
| 5 | 4 | 55.1 | 55.6 | 2 / 35 | 3244 |
| 6 | 3 | 58.0 | 61.9 | 4 / 35 | 3644 |
| 7 | 4 | 56.4 | 57.5 | 3 / 35 | 3362 |
| 8 | 4 | 56.1 | 57.5 | 3 / 35 | 3384 |
| 9 | 2 | 59.6 | 67.3 | 4 / 35 | 3458 |
| 10 | 3 | 56.5 | 60.0 | 3 / 35 | 3177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 21 | 43% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 86% |
| gre.svman4.Leonidas 1.3.2 | 11 | 45% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 40% |
| labg.Cataclysm 2.05 | 5 | 40% |
| sanja.First 0.1 | 2 | 100% |
| baal.nano.N 1.42 | 1 | 0% |

Hadur died in 318 of 350 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 107 | 34% | 118 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 15% | 62 |
| labg.Cataclysm 2.05 | 45 | 14% | 49 |
| kinsen.melee.Angsaichmophobia 1.8c | 39 | 12% | 39 |
| gre.svman4.Leonidas 1.3.2 | 36 | 11% | 40 |
| zyx.micro.Ant 1.1 | 17 | 5% | 17 |
| baal.nano.N 1.42 | 17 | 5% | 17 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 5 | 2% | 5 |
| sanja.First 0.1 | 3 | 1% | 3 |

## Melee bench: F34

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 70.0 | 38 / 350 | 3.70 | 13.6% | 38780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.1 | 18.2% | 164 |
| kid.Gladiator .7.2 | 1.9 | 17.3% | 115 |
| hadur117.nano.SanaroL10 0.1 | 3.0 | 13.6% | 38 |
| jcs.Seth 1.8 | 4.5 | 11.0% | 18 |
| tcf.Reach 3 | 4.6 | 11.1% | 10 |
| cli.Dancer 1.1 | 5.9 | 9.5% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 2 |
| amk.Punbot.Punbot 0.01 | 8.1 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 4.0% | 0 |
| sample.RamFire 1.0 | 9.9 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 71.4 | 3 / 35 | 3814 |
| 2 | 3 | 61.7 | 71.4 | 3 / 35 | 3784 |
| 3 | 3 | 60.4 | 65.4 | 2 / 35 | 4142 |
| 4 | 3 | 63.8 | 76.2 | 5 / 35 | 4074 |
| 5 | 3 | 61.8 | 71.1 | 4 / 35 | 3854 |
| 6 | 3 | 61.0 | 67.9 | 4 / 35 | 3892 |
| 7 | 3 | 63.0 | 71.7 | 5 / 35 | 4275 |
| 8 | 3 | 59.5 | 63.2 | 4 / 35 | 3585 |
| 9 | 3 | 59.4 | 67.3 | 4 / 35 | 3367 |
| 10 | 3 | 62.8 | 74.0 | 4 / 35 | 3993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 60 | 37% |
| kid.Gladiator .7.2 | 30 | 10% |
| jcs.Seth 1.8 | 8 | 75% |
| tcf.Reach 3 | 6 | 83% |
| cli.Dancer 1.1 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 312 of 350 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 128 | 41% | 149 |
| kid.Gladiator .7.2 | 97 | 31% | 99 |
| tcf.Reach 3 | 27 | 9% | 32 |
| jcs.Seth 1.8 | 26 | 8% | 33 |
| cli.Dancer 1.1 | 18 | 6% | 21 |
| ratosh.Wesco 1.4 | 11 | 4% | 11 |
| sample.VelociRobot 1.0 | 3 | 1% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 1 |
| sample.RamFire 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 62.3 | 7 / 350 | 4.40 | 11.5% | 28351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.8% | 285 |
| gh.mini.Gruwel 0.9 | 2.4 | 13.6% | 32 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.4 | 12.3% | 20 |
| rz.HawkOnFire 0.1 | 3.5 | 12.5% | 6 |
| hadur117.nano.SanaroL10 0.1 | 4.7 | 11.5% | 7 |
| myl.nano.KomoriNinja 1.1 | 6.9 | 6.8% | 0 |
| wit.Chuliath 1.0 | 6.9 | 6.8% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.6 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.4 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.4 | 62.2 | 1 / 35 | 2961 |
| 2 | 5 | 57.1 | 62.5 | 0 / 35 | 2919 |
| 3 | 5 | 56.6 | 60.6 | 0 / 35 | 2995 |
| 4 | 3 | 59.3 | 69.2 | 1 / 35 | 2885 |
| 5 | 4 | 55.9 | 61.0 | 1 / 35 | 2820 |
| 6 | 5 | 55.8 | 59.7 | 0 / 35 | 2863 |
| 7 | 5 | 55.9 | 61.9 | 1 / 35 | 2628 |
| 8 | 5 | 56.3 | 61.6 | 0 / 35 | 2811 |
| 9 | 5 | 57.4 | 65.1 | 2 / 35 | 2787 |
| 10 | 5 | 55.6 | 58.7 | 1 / 35 | 2682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 33 | 3% |
| gh.mini.Gruwel 0.9 | 5 | 20% |
| rz.HawkOnFire 0.1 | 4 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 50% |

Hadur died in 343 of 350 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 124 | 36% | 126 |
| gh.mini.Gruwel 0.9 | 82 | 24% | 82 |
| rz.HawkOnFire 0.1 | 56 | 16% | 60 |
| dmh.robocode.robot.BlackDeath 9.2 | 40 | 12% | 41 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 12 | 3% | 12 |
| stelo.MyAgileRobot 0.2 | 9 | 3% | 9 |
| wit.Chuliath 1.0 | 9 | 3% | 9 |
| myl.nano.KomoriNinja 1.1 | 9 | 3% | 9 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 64.2 | 58 / 350 | 4.23 | 12.7% | 33015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bzdp.Pansy 2.1 | 1.7 | 13.5% | 70 |
| hadur117.nano.SanaroL10 0.1 | 2.3 | 12.7% | 58 |
| alpha.RainingFire 1.0 | 2.9 | 12.6% | 60 |
| mz.Cork 0.1 | 4.0 | 11.6% | 45 |
| bvh.micro.Freya 0.3 | 4.9 | 11.2% | 36 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.9% | 28 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.6% | 13 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 7.5% | 11 |
| dl.BetterWalls 1.0 | 8.5 | 7.4% | 15 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.0% | 16 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 53.9 | 55.9 | 3 / 35 | 2958 |
| 2 | 2 | 58.9 | 66.3 | 8 / 35 | 3324 |
| 3 | 1 | 59.6 | 70.8 | 5 / 35 | 3376 |
| 4 | 1 | 59.8 | 71.4 | 4 / 35 | 3331 |
| 5 | 1 | 58.3 | 63.8 | 7 / 35 | 3564 |
| 6 | 3 | 56.9 | 60.3 | 7 / 35 | 3182 |
| 7 | 3 | 56.2 | 60.0 | 5 / 35 | 3149 |
| 8 | 2 | 59.3 | 67.9 | 9 / 35 | 3165 |
| 9 | 1 | 59.4 | 66.0 | 6 / 35 | 3650 |
| 10 | 3 | 55.8 | 59.0 | 4 / 35 | 3316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 34 | 62% |
| bvh.micro.Freya 0.3 | 15 | 47% |
| bvh.mini.Fenrir 0.39 | 15 | 87% |
| alpha.RainingFire 1.0 | 15 | 60% |
| dl.BetterWalls 1.0 | 9 | 22% |
| mz.Cork 0.1 | 9 | 44% |
| m3thos.Eva02 0.7.1 | 7 | 14% |
| sample.MyFirstRobot 1.0 | 5 | 20% |
| squidM.TentalceMeleeNano 1.1 | 3 | 0% |

Hadur died in 292 of 350 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 52 | 18% | 74 |
| alpha.RainingFire 1.0 | 39 | 13% | 47 |
| bvh.micro.Freya 0.3 | 39 | 13% | 45 |
| m3thos.Eva02 0.7.1 | 39 | 13% | 42 |
| mz.Cork 0.1 | 37 | 13% | 45 |
| bvh.mini.Fenrir 0.39 | 32 | 11% | 36 |
| dl.BetterWalls 1.0 | 27 | 9% | 29 |
| squidM.TentalceMeleeNano 1.1 | 16 | 5% | 20 |
| sample.MyFirstRobot 1.0 | 11 | 4% | 12 |

## Melee bench: F37

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 75.8 | 111 / 350 | 3.17 | 14.9% | 42209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroL10 0.1 | 1.0 | 14.9% | 111 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 10.9% | 37 |
| germ.TheMind .2 | 3.4 | 10.9% | 42 |
| EBBU.Sim2 1.02 | 4.3 | 10.3% | 19 |
| agrach.Dalek 1.0 | 4.6 | 9.9% | 44 |
| mb.Beast 0.1 | 7.1 | 8.9% | 32 |
| stelo.UntouchableNano 1.3 | 7.1 | 9.0% | 28 |
| lmk.ACPFinal 0.1 | 7.3 | 8.8% | 16 |
| skm.Ryubot 1.0 | 8.4 | 8.1% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 8.6 | 8.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.4 | 74.0 | 8 / 35 | 4162 |
| 2 | 1 | 64.5 | 83.5 | 16 / 35 | 4500 |
| 3 | 1 | 61.2 | 76.5 | 9 / 35 | 4045 |
| 4 | 1 | 62.1 | 76.8 | 12 / 35 | 4500 |
| 5 | 1 | 61.0 | 75.2 | 11 / 35 | 4126 |
| 6 | 1 | 58.5 | 70.2 | 7 / 35 | 3774 |
| 7 | 1 | 61.9 | 76.5 | 15 / 35 | 4110 |
| 8 | 1 | 62.6 | 79.0 | 14 / 35 | 4384 |
| 9 | 1 | 60.7 | 72.4 | 11 / 35 | 4127 |
| 10 | 1 | 61.1 | 74.3 | 8 / 35 | 4481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 29 | 45% |
| agrach.Dalek 1.0 | 28 | 57% |
| germ.TheMind .2 | 27 | 74% |
| EBBU.Sim2 1.02 | 26 | 69% |
| stelo.UntouchableNano 1.3 | 21 | 67% |
| lmk.ACPFinal 0.1 | 19 | 58% |
| mb.Beast 0.1 | 18 | 61% |
| skm.Ryubot 1.0 | 13 | 38% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 50% |

Hadur died in 242 of 350 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 40 | 17% | 56 |
| agrach.Dalek 1.0 | 36 | 15% | 56 |
| germ.TheMind .2 | 34 | 14% | 51 |
| EBBU.Sim2 1.02 | 30 | 12% | 45 |
| lmk.ACPFinal 0.1 | 27 | 11% | 37 |
| mb.Beast 0.1 | 23 | 10% | 36 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 8% | 22 |
| stelo.UntouchableNano 1.3 | 19 | 8% | 28 |
| skm.Ryubot 1.0 | 13 | 5% | 19 |

## Melee bench: F38

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.3 | 57.2 | 19 / 350 | 4.85 | 10.8% | 28426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.2% | 174 |
| bvh.mini.Freya 0.55 | 2.3 | 13.3% | 49 |
| bts.mega.Gnarly 1.4 | 4.1 | 11.5% | 48 |
| cs.Wren 1.0 | 4.2 | 11.4% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.9 | 11.1% | 21 |
| hadur117.nano.SanaroL10 0.1 | 5.0 | 10.8% | 19 |
| kdf.KoulDestroyer 1.0 | 6.5 | 9.4% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.5% | 3 |
| bzdp.BoxCar 2.0 | 9.4 | 4.6% | 0 |
| matt.UnderDark3 2.4.34 | 9.6 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.8 | 60.3 | 2 / 35 | 3004 |
| 2 | 4 | 54.0 | 57.5 | 0 / 35 | 2782 |
| 3 | 5 | 56.3 | 61.9 | 1 / 35 | 2982 |
| 4 | 5 | 54.7 | 57.8 | 4 / 35 | 2885 |
| 5 | 6 | 51.3 | 49.5 | 3 / 35 | 2764 |
| 6 | 5 | 54.5 | 59.4 | 1 / 35 | 2743 |
| 7 | 6 | 53.0 | 55.2 | 1 / 35 | 2861 |
| 8 | 6 | 52.3 | 54.3 | 1 / 35 | 2492 |
| 9 | 5 | 54.5 | 56.8 | 4 / 35 | 2780 |
| 10 | 4 | 56.5 | 59.7 | 2 / 35 | 3133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 20 | 25% |
| bvh.mini.Freya 0.55 | 10 | 40% |
| bts.mega.Gnarly 1.4 | 9 | 22% |
| cs.Wren 1.0 | 8 | 50% |
| kdf.KoulDestroyer 1.0 | 4 | 25% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 25% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |

Hadur died in 332 of 350 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 78 | 23% | 82 |
| bvh.mini.Freya 0.55 | 77 | 23% | 81 |
| cs.Wren 1.0 | 45 | 14% | 46 |
| bts.mega.Gnarly 1.4 | 42 | 13% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 11% | 38 |
| kdf.KoulDestroyer 1.0 | 33 | 10% | 34 |
| kawigi.spare.SpareParts 0.7.6nosnd | 12 | 4% | 14 |
| bzdp.BoxCar 2.0 | 7 | 2% | 7 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.5 | 58.4 | 22 / 350 | 4.75 | 11.2% | 31893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.3 | 15.8% | 78 |
| az.Ololobot 0.2.4 | 1.8 | 14.3% | 130 |
| catcat20.Lambda 0.024 | 3.3 | 11.9% | 62 |
| hadur117.nano.SanaroL10 0.1 | 3.7 | 11.2% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.6% | 36 |
| winamp32.micro.MicroMacro 1.0 | 6.6 | 8.8% | 13 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.3% | 2 |
| gimp.GimpBot 0.1 | 7.0 | 8.2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.3% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.3 | 54.0 | 1 / 35 | 2901 |
| 2 | 3 | 55.7 | 61.9 | 0 / 35 | 3355 |
| 3 | 4 | 54.3 | 58.7 | 2 / 35 | 3030 |
| 4 | 4 | 55.4 | 61.0 | 4 / 35 | 3233 |
| 5 | 4 | 54.2 | 57.1 | 2 / 35 | 3179 |
| 6 | 3 | 53.3 | 53.7 | 3 / 35 | 3362 |
| 7 | 3 | 54.6 | 56.5 | 2 / 35 | 3528 |
| 8 | 4 | 55.8 | 60.3 | 3 / 35 | 3263 |
| 9 | 4 | 52.4 | 55.9 | 2 / 35 | 2758 |
| 10 | 3 | 56.6 | 64.8 | 3 / 35 | 3284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 18 | 39% |
| az.Ololobot 0.2.4 | 15 | 53% |
| catcat20.Lambda 0.024 | 9 | 67% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 0% |
| gimp.GimpBot 0.1 | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 0% |

Hadur died in 329 of 350 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 100 | 30% | 105 |
| catcat20.Lambda 0.024 | 53 | 16% | 60 |
| az.Ololobot 0.2.4 | 47 | 14% | 53 |
| stelo.SoRobotNanoMelee 1.2 | 43 | 13% | 43 |
| apollokidd.ApolloKidd 0.9 | 29 | 9% | 30 |
| winamp32.micro.MicroMacro 1.0 | 21 | 6% | 22 |
| gimp.GimpBot 0.1 | 20 | 6% | 20 |
| dcs.Eater_of_Worlds 1.1.3-A | 10 | 3% | 11 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 2% | 6 |

## Melee bench: F41

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 64.2 | 35 / 350 | 4.23 | 12.2% | 29809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.2 | 16.9% | 172 |
| ary.Swarm 1.1 | 2.4 | 14.1% | 41 |
| lessonz.robocode.Oz 0.5.0 | 3.1 | 13.2% | 45 |
| hadur117.nano.SanaroL10 0.1 | 3.9 | 12.2% | 35 |
| simonton.nano.MeleeSeed 1.8 | 4.4 | 11.7% | 36 |
| shrub.Silver v048 | 6.1 | 9.0% | 6 |
| zyx.nano.Ant 1.1 | 6.9 | 8.1% | 1 |
| stelo.Mirror 1.1 | 8.5 | 6.0% | 4 |
| jsal.Jsalbot 1.0 | 8.5 | 6.0% | 11 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.1 | 61.6 | 5 / 35 | 2945 |
| 2 | 3 | 60.2 | 70.2 | 5 / 35 | 3249 |
| 3 | 4 | 56.6 | 60.6 | 4 / 35 | 2978 |
| 4 | 4 | 58.8 | 67.0 | 4 / 35 | 3103 |
| 5 | 5 | 55.8 | 59.7 | 1 / 35 | 2804 |
| 6 | 3 | 58.5 | 65.4 | 2 / 35 | 3112 |
| 7 | 4 | 57.7 | 63.2 | 2 / 35 | 3095 |
| 8 | 4 | 55.2 | 59.0 | 2 / 35 | 2480 |
| 9 | 4 | 59.2 | 65.7 | 6 / 35 | 3065 |
| 10 | 3 | 59.0 | 69.2 | 4 / 35 | 2978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 38 | 24% |
| ary.Swarm 1.1 | 12 | 58% |
| lessonz.robocode.Oz 0.5.0 | 12 | 58% |
| simonton.nano.MeleeSeed 1.8 | 11 | 64% |
| shrub.Silver v048 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 0% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 315 of 350 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ary.Swarm 1.1 | 93 | 30% | 101 |
| eem.EvBotNG v12.8 | 89 | 28% | 101 |
| lessonz.robocode.Oz 0.5.0 | 49 | 16% | 55 |
| simonton.nano.MeleeSeed 1.8 | 39 | 12% | 44 |
| shrub.Silver v048 | 18 | 6% | 21 |
| zyx.nano.Ant 1.1 | 11 | 3% | 12 |
| stelo.Mirror 1.1 | 8 | 3% | 8 |
| jsal.Jsalbot 1.0 | 4 | 1% | 4 |
| acogdev.alpha 0.2 | 4 | 1% | 4 |

## Melee bench: F42

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 64.0 | 25 / 350 | 4.24 | 12.3% | 34840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.4% | 202 |
| maribo.mini.MiniQuester 0.1 | 2.5 | 14.0% | 33 |
| ara.Shera 0.88 | 2.8 | 13.7% | 66 |
| hadur117.nano.SanaroL10 0.1 | 3.7 | 12.3% | 25 |
| amz.NanoClone 1.41 | 5.1 | 9.4% | 6 |
| maribo.IotaCT 1.1 | 6.5 | 7.6% | 2 |
| dsw.StaticD 1.0 | 6.5 | 7.9% | 13 |
| stelo.MirrorMicro 1.0 | 8.6 | 5.9% | 1 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.9 | 68.9 | 4 / 35 | 3582 |
| 2 | 4 | 57.2 | 64.8 | 0 / 35 | 3182 |
| 3 | 3 | 58.8 | 66.7 | 3 / 35 | 3596 |
| 4 | 4 | 59.5 | 67.0 | 3 / 35 | 3699 |
| 5 | 3 | 59.2 | 66.0 | 5 / 35 | 3875 |
| 6 | 4 | 57.0 | 61.6 | 2 / 35 | 3293 |
| 7 | 4 | 58.4 | 65.4 | 2 / 35 | 3726 |
| 8 | 3 | 58.0 | 63.8 | 2 / 35 | 3716 |
| 9 | 4 | 53.6 | 54.3 | 1 / 35 | 3005 |
| 10 | 4 | 56.6 | 61.3 | 3 / 35 | 3166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 47 | 32% |
| ara.Shera 0.88 | 16 | 38% |
| maribo.mini.MiniQuester 0.1 | 3 | 67% |
| maribo.IotaCT 1.1 | 1 | 0% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 325 of 350 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 107 | 33% | 121 |
| ara.Shera 0.88 | 81 | 25% | 87 |
| maribo.mini.MiniQuester 0.1 | 69 | 21% | 71 |
| amz.NanoClone 1.41 | 29 | 9% | 29 |
| maribo.IotaCT 1.1 | 16 | 5% | 17 |
| dsw.StaticD 1.0 | 11 | 3% | 12 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8 | 2% | 9 |
| stelo.MirrorMicro 1.0 | 3 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 0% | 1 |

## Melee bench: F43

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 58.2 | 11 / 350 | 4.77 | 11.2% | 31170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.6% | 281 |
| brainfade.melee.Dusk 0.44 | 2.9 | 12.7% | 30 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.5% | 13 |
| wcsv.melee.EngineerMelee 0.1 | 3.8 | 11.8% | 9 |
| hadur117.nano.SanaroL10 0.1 | 4.5 | 11.2% | 11 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 10.1% | 4 |
| jab.DiamondStealer 5 | 7.3 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.5% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.2 | 57.8 | 1 / 35 | 3129 |
| 2 | 5 | 56.4 | 56.2 | 1 / 35 | 3066 |
| 3 | 5 | 56.0 | 55.6 | 1 / 35 | 2985 |
| 4 | 5 | 55.8 | 55.9 | 0 / 35 | 2615 |
| 5 | 5 | 57.7 | 58.4 | 2 / 35 | 3140 |
| 6 | 3 | 57.5 | 57.8 | 1 / 35 | 3264 |
| 7 | 2 | 59.4 | 64.8 | 1 / 35 | 3259 |
| 8 | 5 | 57.3 | 57.5 | 2 / 35 | 3257 |
| 9 | 5 | 57.6 | 58.4 | 1 / 35 | 3177 |
| 10 | 5 | 57.9 | 59.4 | 1 / 35 | 3278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 28 | 11% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 71% |
| brainfade.melee.Dusk 0.44 | 2 | 100% |
| dummy.micro.Sparrow 2.5 | 2 | 0% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |

Hadur died in 339 of 350 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 145 | 43% | 148 |
| wcsv.melee.EngineerMelee 0.1 | 46 | 14% | 49 |
| brainfade.melee.Dusk 0.44 | 43 | 13% | 45 |
| dummy.micro.Sparrow 2.5 | 38 | 11% | 40 |
| mz.NanoGod 2.02 | 23 | 7% | 23 |
| jab.DiamondStealer 5 | 23 | 7% | 23 |
| Krabb.akim2.Akim2 1.1b | 16 | 5% | 17 |
| cvt.Firsty 1.0 | 5 | 1% | 5 |

## Melee bench: F44

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 62.7 | 30 / 350 | 4.36 | 12.5% | 35688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 17.7% | 174 |
| tzu.TheArtOfWar 1.2 | 1.9 | 15.7% | 91 |
| hadur117.nano.SanaroL10 0.1 | 3.2 | 12.5% | 30 |
| wompi.Quokka 1.6 | 4.3 | 10.6% | 15 |
| jwirde.Gort 2.0 | 4.6 | 10.6% | 27 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.1 | 8.9% | 0 |
| disan.Chair 2.2.0 | 7.0 | 7.8% | 10 |
| stf.PanzerGeneral 0.1 | 7.9 | 7.1% | 3 |
| sample.Crazy 1.0 | 9.1 | 4.9% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 64.1 | 4 / 35 | 3292 |
| 2 | 3 | 59.1 | 67.0 | 1 / 35 | 3694 |
| 3 | 3 | 60.3 | 68.6 | 3 / 35 | 3685 |
| 4 | 3 | 62.0 | 75.2 | 3 / 35 | 3753 |
| 5 | 3 | 57.2 | 59.0 | 5 / 35 | 3294 |
| 6 | 3 | 56.7 | 59.7 | 3 / 35 | 3360 |
| 7 | 3 | 56.8 | 56.5 | 2 / 35 | 3963 |
| 8 | 3 | 60.0 | 64.8 | 5 / 35 | 3791 |
| 9 | 5 | 53.3 | 50.8 | 2 / 35 | 3324 |
| 10 | 3 | 57.7 | 61.0 | 2 / 35 | 3532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 48 | 21% |
| tzu.TheArtOfWar 1.2 | 29 | 28% |
| wompi.Quokka 1.6 | 7 | 43% |
| disan.Chair 2.2.0 | 6 | 33% |
| jwirde.Gort 2.0 | 6 | 17% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 321 of 350 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 99 | 31% | 112 |
| tzu.TheArtOfWar 1.2 | 96 | 30% | 102 |
| jwirde.Gort 2.0 | 32 | 10% | 35 |
| wompi.Quokka 1.6 | 30 | 9% | 30 |
| disan.Chair 2.2.0 | 21 | 7% | 21 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 18 | 6% | 21 |
| stf.PanzerGeneral 0.1 | 15 | 5% | 17 |
| sample.Crazy 1.0 | 6 | 2% | 8 |
| amk.jointstrike.JointStrike 0.2 | 4 | 1% | 4 |

## Melee bench: F45

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 63.4 | 39 / 350 | 4.29 | 13.0% | 36667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroL10 0.1 | 2.1 | 13.0% | 39 |
| jje.BagPuss 1.2 | 2.3 | 13.2% | 35 |
| eem.IWillFireNoBullet v2.8 | 2.4 | 13.2% | 192 |
| sul.Lunar 1.1 | 4.1 | 11.4% | 30 |
| myl.nano.Graviton 1.10 | 5.0 | 10.6% | 17 |
| hvilela.HVilela 0.9 | 5.7 | 9.8% | 5 |
| pez.mini.ChironexFleckeri 0.5 | 6.7 | 8.9% | 10 |
| fm.claire 1.7 | 7.8 | 8.1% | 1 |
| wit.Deep7 2.0 | 9.1 | 6.6% | 20 |
| abud.ThirdRobo 1.0 | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.5 | 65.1 | 7 / 35 | 3657 |
| 2 | 3 | 55.1 | 57.5 | 3 / 35 | 3307 |
| 3 | 4 | 57.4 | 62.2 | 3 / 35 | 3494 |
| 4 | 2 | 57.0 | 62.9 | 3 / 35 | 3330 |
| 5 | 1 | 61.5 | 70.5 | 7 / 35 | 3913 |
| 6 | 2 | 58.2 | 65.1 | 1 / 35 | 3776 |
| 7 | 2 | 58.0 | 61.9 | 2 / 35 | 3934 |
| 8 | 1 | 58.1 | 63.8 | 4 / 35 | 3671 |
| 9 | 3 | 58.0 | 61.0 | 3 / 35 | 3777 |
| 10 | 1 | 58.6 | 64.1 | 6 / 35 | 3808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 59 | 37% |
| sul.Lunar 1.1 | 14 | 64% |
| myl.nano.Graviton 1.10 | 11 | 36% |
| jje.BagPuss 1.2 | 9 | 33% |
| wit.Deep7 2.0 | 4 | 0% |
| pez.mini.ChironexFleckeri 0.5 | 3 | 33% |
| fm.claire 1.7 | 1 | 0% |
| hvilela.HVilela 0.9 | 1 | 0% |

Hadur died in 311 of 350 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 78 | 25% | 95 |
| hvilela.HVilela 0.9 | 45 | 14% | 50 |
| myl.nano.Graviton 1.10 | 44 | 14% | 55 |
| eem.IWillFireNoBullet v2.8 | 44 | 14% | 0 |
| sul.Lunar 1.1 | 28 | 9% | 54 |
| fm.claire 1.7 | 28 | 9% | 34 |
| pez.mini.ChironexFleckeri 0.5 | 18 | 6% | 27 |
| wit.Deep7 2.0 | 18 | 6% | 23 |
| abud.ThirdRobo 1.0 | 8 | 3% | 12 |

## Melee bench: F46

hadur117.nano.SanaroL10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 62.9 | 18 / 350 | 4.34 | 11.4% | 27169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 18.4% | 158 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.3% | 148 |
| hadur117.nano.SanaroL10 0.1 | 3.4 | 11.4% | 18 |
| mz.MicroSheep 1.0 | 3.9 | 11.0% | 6 |
| cx.Princess 1.0 | 5.0 | 10.3% | 15 |
| sadoner.killer 0.2 | 5.8 | 9.5% | 4 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.5% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.0% | 0 |
| kurios.DOSexe .9a | 8.9 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.0 | 58.1 | 1 / 35 | 2492 |
| 2 | 3 | 56.5 | 65.4 | 1 / 35 | 2559 |
| 3 | 3 | 57.2 | 64.4 | 2 / 35 | 2809 |
| 4 | 3 | 56.5 | 63.8 | 1 / 35 | 2753 |
| 5 | 3 | 59.1 | 68.9 | 3 / 35 | 3040 |
| 6 | 3 | 56.6 | 63.8 | 1 / 35 | 2876 |
| 7 | 5 | 54.8 | 58.4 | 1 / 35 | 2648 |
| 8 | 3 | 55.5 | 61.3 | 1 / 35 | 2653 |
| 9 | 4 | 55.2 | 60.3 | 3 / 35 | 2389 |
| 10 | 3 | 57.8 | 64.8 | 4 / 35 | 2950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 27 | 22% |
| rsalesc.melee.Medina 0.4.5 | 15 | 27% |
| cx.Princess 1.0 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| mz.MicroSheep 1.0 | 2 | 100% |

Hadur died in 332 of 350 rounds, at a mean tick of 585. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 128 | 39% | 136 |
| rsalesc.melee.Medina 0.4.5 | 83 | 25% | 89 |
| mz.MicroSheep 1.0 | 36 | 11% | 38 |
| sadoner.killer 0.2 | 32 | 10% | 33 |
| arthord.NanoSatanMelee Beta | 25 | 8% | 26 |
| cx.Princess 1.0 | 23 | 7% | 23 |
| jeremyreeder.collective.Prophet 5 | 5 | 2% | 5 |

