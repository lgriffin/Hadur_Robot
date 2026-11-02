# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 76.8 | 70 / 350 | 3.09 | 14.2% | 34456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 225 |
| hadur117.nano.SanaroHL2 0.3 | 2.2 | 14.2% | 70 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.9 | 11.5% | 8 |
| mz.MicroGodMelee 1 | 4.1 | 11.2% | 9 |
| sgp.JollyNinja 3.53 | 4.6 | 11.3% | 18 |
| lorneswork.Predator 1.0 | 5.2 | 10.0% | 15 |
| adt.Ar2 1.0 | 7.0 | 7.5% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.4 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.6 | 5.1% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 74.9 | 5 / 35 | 3418 |
| 2 | 2 | 58.5 | 67.9 | 5 / 35 | 3168 |
| 3 | 2 | 62.7 | 78.4 | 7 / 35 | 3599 |
| 4 | 4 | 57.0 | 63.5 | 3 / 35 | 3043 |
| 5 | 2 | 63.4 | 80.0 | 8 / 35 | 3770 |
| 6 | 2 | 63.6 | 82.2 | 7 / 35 | 3257 |
| 7 | 2 | 64.0 | 82.5 | 8 / 35 | 3656 |
| 8 | 2 | 63.0 | 78.7 | 8 / 35 | 3487 |
| 9 | 2 | 62.8 | 77.1 | 7 / 35 | 3665 |
| 10 | 2 | 64.1 | 82.9 | 12 / 35 | 3393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 157 | 16% |
| mz.MicroGodMelee 1 | 26 | 85% |
| sgp.JollyNinja 3.53 | 13 | 85% |
| lorneswork.Predator 1.0 | 9 | 56% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 2 | 50% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 280 of 350 rounds, at a mean tick of 1056. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 165 | 59% | 194 |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 10% | 30 |
| lorneswork.Predator 1.0 | 26 | 9% | 32 |
| sgp.JollyNinja 3.53 | 23 | 8% | 29 |
| adt.Ar2 1.0 | 16 | 6% | 18 |
| mz.MicroGodMelee 1 | 13 | 5% | 36 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 2% | 5 |
| skm.butterfly 1.0 | 4 | 1% | 5 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 69.5 | 78 / 350 | 3.75 | 13.9% | 36659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 14.6% | 83 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.9% | 102 |
| hadur117.nano.SanaroHL2 0.3 | 2.4 | 13.9% | 78 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 10.8% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.2% | 25 |
| sch.Simone 0.3d | 6.9 | 8.4% | 23 |
| fnc.bandit.Bandit 5.2.0 | 7.1 | 8.0% | 5 |
| Noran.BitchingElk 0.054 | 7.4 | 7.7% | 16 |
| stelo.PatternRobot 1.0 | 8.4 | 6.7% | 11 |
| fullsail.SweetTea 1.1 | 9.9 | 4.8% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 77.1 | 11 / 35 | 3611 |
| 2 | 4 | 56.1 | 60.3 | 5 / 35 | 3151 |
| 3 | 2 | 62.3 | 75.2 | 8 / 35 | 3891 |
| 4 | 2 | 63.6 | 78.1 | 11 / 35 | 3944 |
| 5 | 3 | 57.6 | 63.8 | 4 / 35 | 3564 |
| 6 | 4 | 53.7 | 54.6 | 6 / 35 | 2905 |
| 7 | 2 | 61.2 | 70.2 | 8 / 35 | 3960 |
| 8 | 2 | 61.1 | 69.8 | 9 / 35 | 3973 |
| 9 | 2 | 60.8 | 68.6 | 8 / 35 | 3964 |
| 10 | 2 | 62.7 | 76.8 | 8 / 35 | 3696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 62 | 26% |
| pulsar.PulsarMax 0.8.9 | 49 | 51% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 94% |
| sch.Simone 0.3d | 10 | 40% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| stelo.PatternRobot 1.0 | 9 | 33% |
| fnc.bandit.Bandit 5.2.0 | 5 | 40% |
| Noran.BitchingElk 0.054 | 4 | 75% |
| fullsail.SweetTea 1.1 | 3 | 0% |

Hadur died in 272 of 350 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 80 | 29% | 96 |
| pulsar.PulsarMax 0.8.9 | 68 | 25% | 89 |
| stelo.PatternRobot 1.0 | 25 | 9% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 24 | 9% | 29 |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 8% | 39 |
| sch.Simone 0.3d | 19 | 7% | 23 |
| fnc.bandit.Bandit 5.2.0 | 15 | 6% | 19 |
| fullsail.SweetTea 1.1 | 11 | 4% | 13 |
| Noran.BitchingElk 0.054 | 8 | 3% | 15 |

## Melee bench: F03

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 79.7 | 103 / 350 | 2.83 | 15.0% | 37529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.8 | 15.2% | 85 |
| hadur117.nano.SanaroHL2 0.3 | 2.0 | 15.0% | 103 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.8% | 90 |
| vuen.Cake 2.51 | 4.0 | 12.9% | 63 |
| urdos.URDOS 1.3 | 5.0 | 10.3% | 6 |
| adt.Ar1 2.1 | 6.2 | 7.6% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.4 | 6.9% | 3 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 6.0% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 74.0 | 7 / 35 | 3762 |
| 2 | 3 | 62.9 | 80.6 | 9 / 35 | 3550 |
| 3 | 1 | 63.3 | 84.4 | 11 / 35 | 3374 |
| 4 | 1 | 64.6 | 84.1 | 15 / 35 | 3913 |
| 5 | 1 | 65.0 | 85.7 | 18 / 35 | 3822 |
| 6 | 3 | 60.6 | 71.4 | 8 / 35 | 3702 |
| 7 | 2 | 62.1 | 79.7 | 8 / 35 | 3598 |
| 8 | 2 | 62.5 | 79.4 | 9 / 35 | 3778 |
| 9 | 2 | 63.2 | 80.3 | 8 / 35 | 3993 |
| 10 | 2 | 63.0 | 77.5 | 10 / 35 | 4037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 80 | 54% |
| vuen.Cake 2.51 | 62 | 63% |
| kawigi.nano.Lib 1.0 | 46 | 17% |
| urdos.URDOS 1.3 | 11 | 73% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 0% |

Hadur died in 250 of 350 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 79 | 32% | 88 |
| radnor.DoctorBob 1.42 | 76 | 30% | 111 |
| vuen.Cake 2.51 | 39 | 16% | 81 |
| urdos.URDOS 1.3 | 25 | 10% | 34 |
| adt.Ar1 2.1 | 10 | 4% | 11 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 4% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 3% | 7 |
| oa.weak.FlyMk1 0.1 | 2 | 1% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 2 |

## Melee bench: F04

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 74.8 | 10 / 350 | 3.27 | 14.0% | 39936 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 321 |
| hadur117.nano.SanaroHL2 0.3 | 2.3 | 14.0% | 10 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.7% | 12 |
| TNT.TNT 0.99.1 | 4.1 | 10.6% | 6 |
| josago.Jorgito 0.16 | 4.9 | 9.6% | 0 |
| css.Delitioner 0.11 | 6.3 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 7.1% | 1 |
| rampancy.Durandal 2.1d | 8.1 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.1% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 72.7 | 2 / 35 | 3749 |
| 2 | 2 | 62.7 | 74.9 | 0 / 35 | 4183 |
| 3 | 2 | 64.6 | 80.3 | 2 / 35 | 4219 |
| 4 | 3 | 60.5 | 68.3 | 1 / 35 | 3958 |
| 5 | 3 | 62.2 | 74.6 | 1 / 35 | 3830 |
| 6 | 2 | 62.8 | 76.2 | 0 / 35 | 3993 |
| 7 | 2 | 62.8 | 76.2 | 1 / 35 | 3860 |
| 8 | 2 | 64.3 | 78.7 | 1 / 35 | 4250 |
| 9 | 2 | 63.4 | 76.8 | 2 / 35 | 4144 |
| 10 | 2 | 60.8 | 69.5 | 0 / 35 | 3750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 169 | 3% |
| apc.LeeroyJenkins2 1.0 | 6 | 50% |
| TNT.TNT 0.99.1 | 2 | 0% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 340 of 350 rounds, at a mean tick of 1210. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 225 | 66% | 231 |
| apc.LeeroyJenkins2 1.0 | 49 | 14% | 53 |
| josago.Jorgito 0.16 | 21 | 6% | 21 |
| TNT.TNT 0.99.1 | 16 | 5% | 16 |
| css.Delitioner 0.11 | 11 | 3% | 11 |
| tj.zombie1n 1.0.1 | 9 | 3% | 9 |
| rampancy.Durandal 2.1d | 7 | 2% | 7 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 73.3 | 90 / 350 | 3.40 | 13.9% | 31241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.1 | 15.5% | 85 |
| origin.SleepSiphon 1.7b | 2.5 | 14.0% | 91 |
| hadur117.nano.SanaroHL2 0.3 | 3.0 | 13.9% | 90 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 13.0% | 50 |
| mld.Wisdom 1.0 | 5.0 | 11.1% | 12 |
| gg.Wolverine 2.0 | 6.3 | 8.6% | 6 |
| spinnercat.Omen 1.0 | 7.5 | 7.5% | 5 |
| DBall.NUKE 0.1 | 7.7 | 7.0% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 8.4 | 6.4% | 8 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 77.8 | 8 / 35 | 2853 |
| 2 | 4 | 58.2 | 67.9 | 6 / 35 | 2647 |
| 3 | 3 | 61.8 | 74.6 | 11 / 35 | 3054 |
| 4 | 3 | 60.0 | 70.8 | 9 / 35 | 2869 |
| 5 | 3 | 60.2 | 70.5 | 9 / 35 | 3252 |
| 6 | 3 | 62.1 | 76.8 | 10 / 35 | 3237 |
| 7 | 4 | 59.4 | 66.7 | 9 / 35 | 3253 |
| 8 | 2 | 64.2 | 81.0 | 12 / 35 | 3517 |
| 9 | 3 | 61.2 | 73.3 | 9 / 35 | 3098 |
| 10 | 2 | 61.5 | 74.0 | 7 / 35 | 3461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 57 | 61% |
| origin.SleepSiphon 1.7b | 46 | 46% |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 60% |
| gg.Wolverine 2.0 | 8 | 63% |
| mld.Wisdom 1.0 | 6 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| spinnercat.Omen 1.0 | 4 | 50% |
| DBall.NUKE 0.1 | 3 | 67% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 262 of 350 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 91 | 35% | 117 |
| origin.SleepSiphon 1.7b | 60 | 23% | 84 |
| pe.minimelee.SandboxMiniMelee 1.1 | 49 | 19% | 66 |
| mld.Wisdom 1.0 | 26 | 10% | 31 |
| spinnercat.Omen 1.0 | 12 | 5% | 15 |
| gg.Wolverine 2.0 | 10 | 4% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 3% | 12 |
| DBall.NUKE 0.1 | 5 | 2% | 6 |
| sample.Fire 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.8 | 114 / 350 | 2.37 | 16.7% | 44108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.7 | 17.7% | 94 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.6% | 85 |
| hadur117.nano.SanaroHL2 0.3 | 2.5 | 16.7% | 114 |
| oog.melee.CapuletDroid 1.1 | 4.4 | 11.7% | 23 |
| franzor.Lizt 1.3.1 | 4.6 | 11.1% | 33 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.8% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.1 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 89.8 | 16 / 35 | 4779 |
| 2 | 3 | 66.5 | 82.5 | 12 / 35 | 4060 |
| 3 | 3 | 68.1 | 86.0 | 11 / 35 | 4844 |
| 4 | 3 | 67.3 | 86.0 | 9 / 35 | 4332 |
| 5 | 3 | 66.3 | 82.2 | 8 / 35 | 4283 |
| 6 | 2 | 67.0 | 84.4 | 10 / 35 | 4522 |
| 7 | 3 | 67.2 | 85.1 | 10 / 35 | 4346 |
| 8 | 3 | 66.9 | 81.0 | 11 / 35 | 4416 |
| 9 | 3 | 67.2 | 83.8 | 14 / 35 | 4243 |
| 10 | 1 | 67.6 | 86.7 | 13 / 35 | 4283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 109 | 55% |
| rsalesc.melee.Monk 0.3.6c | 60 | 25% |
| oog.melee.CapuletDroid 1.1 | 43 | 63% |
| franzor.Lizt 1.3.1 | 20 | 50% |
| skm.PateranBotlock2 1.0 | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 236 of 350 rounds, at a mean tick of 1526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 113 | 48% | 187 |
| rsalesc.melee.Monk 0.3.6c | 71 | 30% | 96 |
| oog.melee.CapuletDroid 1.1 | 31 | 13% | 55 |
| franzor.Lizt 1.3.1 | 13 | 6% | 2 |
| exauge.GateKeeper 1.1.121g | 6 | 3% | 6 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% | 2 |

## Melee bench: F08

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 73.2 | 111 / 350 | 3.41 | 14.3% | 32387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| shrub.Vapour v159 | 1.9 | 13.8% | 85 |
| hadur117.nano.SanaroHL2 0.3 | 2.0 | 14.3% | 111 |
| tm.Yuugao 1.0 | 2.3 | 13.9% | 78 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.3% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 4.9 | 9.9% | 26 |
| m3thos.Eva00 1.1 | 5.8 | 9.3% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.3% | 9 |
| qualidafial.MajorDick 1.0.1 | 8.9 | 6.8% | 6 |
| SHAM.WOW 1.4 | 8.9 | 6.6% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 73.7 | 13 / 35 | 3190 |
| 2 | 2 | 60.3 | 73.7 | 10 / 35 | 3084 |
| 3 | 2 | 62.0 | 74.0 | 11 / 35 | 3683 |
| 4 | 2 | 61.4 | 75.6 | 12 / 35 | 3232 |
| 5 | 3 | 57.9 | 67.9 | 8 / 35 | 2832 |
| 6 | 3 | 56.9 | 63.5 | 7 / 35 | 2932 |
| 7 | 1 | 62.9 | 77.5 | 17 / 35 | 3415 |
| 8 | 3 | 59.8 | 71.4 | 11 / 35 | 3105 |
| 9 | 1 | 62.4 | 78.4 | 12 / 35 | 3436 |
| 10 | 2 | 62.1 | 76.5 | 10 / 35 | 3478 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 60 | 57% |
| shrub.Vapour v159 | 47 | 40% |
| com.spp.robocode.MostlyHarmless 010 | 26 | 77% |
| Krabb.sliNk.Garm 0.9u | 20 | 85% |
| m3thos.Eva00 1.1 | 12 | 58% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 89% |
| SHAM.WOW 1.4 | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |

Hadur died in 239 of 350 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 66 | 28% | 101 |
| shrub.Vapour v159 | 58 | 24% | 77 |
| com.spp.robocode.MostlyHarmless 010 | 29 | 12% | 49 |
| Krabb.sliNk.Garm 0.9u | 22 | 9% | 33 |
| m3thos.Eva00 1.1 | 20 | 8% | 27 |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 7% | 29 |
| zyx.nano.BacillusComma 1.0 | 14 | 6% | 15 |
| SHAM.WOW 1.4 | 7 | 3% | 12 |
| qualidafial.MajorDick 1.0.1 | 7 | 3% | 7 |

## Melee bench: F09

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 63.7 | 45 / 350 | 4.27 | 12.0% | 26066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.7% | 203 |
| kc.micro.Figment 1.0 | 2.0 | 14.9% | 57 |
| hadur117.nano.SanaroHL2 0.3 | 3.2 | 12.0% | 45 |
| yagami.Tidus 0.11 | 4.4 | 10.7% | 5 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.5% | 20 |
| mc2.enemy.Original 0.9 | 5.8 | 9.3% | 15 |
| dft.Calliope 5.6 | 6.9 | 8.4% | 5 |
| step.nanoPri 1.0 | 8.4 | 5.7% | 1 |
| robar.nano.Assertive_Melee 0.2 | 8.7 | 5.4% | 0 |
| rdm.Dueler 0.4x | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 66.7 | 5 / 35 | 2784 |
| 2 | 3 | 58.9 | 68.6 | 6 / 35 | 2573 |
| 3 | 3 | 56.2 | 59.4 | 3 / 35 | 2694 |
| 4 | 3 | 55.5 | 59.7 | 3 / 35 | 2361 |
| 5 | 3 | 57.2 | 62.5 | 4 / 35 | 2650 |
| 6 | 3 | 58.2 | 66.3 | 6 / 35 | 2486 |
| 7 | 3 | 57.9 | 67.3 | 2 / 35 | 2741 |
| 8 | 3 | 59.8 | 67.3 | 8 / 35 | 3052 |
| 9 | 5 | 52.6 | 54.6 | 2 / 35 | 2382 |
| 10 | 3 | 56.9 | 64.1 | 6 / 35 | 2343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 82 | 24% |
| kc.micro.Figment 1.0 | 20 | 55% |
| mc2.enemy.Original 0.9 | 8 | 75% |
| yagami.Tidus 0.11 | 3 | 100% |
| pedersen.Grishnakh 1.0 | 3 | 100% |
| step.nanoPri 1.0 | 2 | 50% |
| dft.Calliope 5.6 | 2 | 0% |
| rdm.Dueler 0.4x | 1 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 109 | 36% | 129 |
| kc.micro.Figment 1.0 | 62 | 20% | 76 |
| yagami.Tidus 0.11 | 46 | 15% | 50 |
| pedersen.Grishnakh 1.0 | 24 | 8% | 25 |
| mc2.enemy.Original 0.9 | 23 | 8% | 28 |
| robar.nano.Assertive_Melee 0.2 | 16 | 5% | 16 |
| dft.Calliope 5.6 | 13 | 4% | 14 |
| step.nanoPri 1.0 | 8 | 3% | 8 |
| rdm.Dueler 0.4x | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 83.7 | 139 / 350 | 2.46 | 16.2% | 39290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHL2 0.3 | 1.3 | 16.2% | 139 |
| DTF.Kludgy 1.2b | 1.8 | 15.2% | 92 |
| ne.Chimera 1.2 | 3.4 | 13.0% | 34 |
| ejb.Polaris 1.0.1 | 4.0 | 12.1% | 27 |
| tvv.micro.Antares 1.1.1 | 5.0 | 11.0% | 42 |
| vStar.RAFzilla 2.15 | 5.5 | 10.6% | 14 |
| sam.Samspin 1.0 | 7.8 | 6.2% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 6.1% | 0 |
| kurios.DOSexe .9b | 8.7 | 5.5% | 2 |
| donjezza.Muncho 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 87.0 | 19 / 35 | 4007 |
| 2 | 1 | 66.9 | 89.5 | 18 / 35 | 4103 |
| 3 | 2 | 65.8 | 87.0 | 15 / 35 | 3923 |
| 4 | 2 | 62.9 | 78.7 | 9 / 35 | 3990 |
| 5 | 1 | 65.0 | 84.1 | 13 / 35 | 3899 |
| 6 | 1 | 66.5 | 89.2 | 18 / 35 | 4047 |
| 7 | 1 | 63.0 | 77.5 | 11 / 35 | 3940 |
| 8 | 1 | 64.1 | 82.5 | 14 / 35 | 3688 |
| 9 | 2 | 62.2 | 76.5 | 9 / 35 | 3653 |
| 10 | 1 | 65.5 | 85.4 | 13 / 35 | 4040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 86 | 43% |
| ejb.Polaris 1.0.1 | 61 | 89% |
| tvv.micro.Antares 1.1.1 | 33 | 27% |
| ne.Chimera 1.2 | 27 | 56% |
| vStar.RAFzilla 2.15 | 24 | 75% |
| donjezza.Muncho 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 2 | 50% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 211 of 350 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 85 | 40% | 117 |
| ne.Chimera 1.2 | 45 | 21% | 69 |
| tvv.micro.Antares 1.1.1 | 35 | 17% | 37 |
| ejb.Polaris 1.0.1 | 21 | 10% | 76 |
| vStar.RAFzilla 2.15 | 11 | 5% | 27 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 2% | 7 |
| sam.Samspin 1.0 | 5 | 2% | 7 |
| kurios.DOSexe .9b | 3 | 1% | 6 |
| donjezza.Muncho 1.0 | 1 | 0% | 4 |

## Melee bench: F11

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.7 | 74 / 350 | 3.91 | 13.0% | 29580 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.2% | 141 |
| hadur117.nano.SanaroHL2 0.3 | 2.5 | 13.0% | 74 |
| cx.mini.Nimrod 0.55 | 2.6 | 13.1% | 55 |
| djc.DynaBot 0.1.1 | 3.9 | 11.2% | 25 |
| rdt199.Warlord 0.73 | 5.7 | 9.5% | 18 |
| br2.MobyDickBot 1.6 | 6.0 | 9.1% | 15 |
| uji.YellohFellah 1.0 | 6.9 | 8.5% | 21 |
| KiraNL.Chupacabra 0.4 | 7.4 | 8.0% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.4% | 1 |
| stelo.MirrorNano 1.3 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.8 | 69.5 | 6 / 35 | 2881 |
| 2 | 2 | 58.4 | 66.7 | 11 / 35 | 2701 |
| 3 | 3 | 58.8 | 67.3 | 6 / 35 | 3026 |
| 4 | 2 | 58.8 | 69.5 | 6 / 35 | 2707 |
| 5 | 3 | 56.0 | 59.0 | 8 / 35 | 2845 |
| 6 | 3 | 58.4 | 65.7 | 6 / 35 | 3085 |
| 7 | 2 | 60.9 | 73.3 | 9 / 35 | 3136 |
| 8 | 2 | 59.8 | 69.8 | 9 / 35 | 3180 |
| 9 | 3 | 58.4 | 69.2 | 6 / 35 | 2880 |
| 10 | 3 | 58.8 | 66.7 | 7 / 35 | 3139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 82 | 44% |
| cx.mini.Nimrod 0.55 | 14 | 50% |
| djc.DynaBot 0.1.1 | 14 | 93% |
| br2.MobyDickBot 1.6 | 11 | 64% |
| uji.YellohFellah 1.0 | 10 | 40% |
| rdt199.Warlord 0.73 | 7 | 86% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 276 of 350 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 108 | 39% | 133 |
| cx.mini.Nimrod 0.55 | 53 | 19% | 60 |
| rdt199.Warlord 0.73 | 28 | 10% | 40 |
| djc.DynaBot 0.1.1 | 25 | 9% | 36 |
| KiraNL.Chupacabra 0.4 | 21 | 8% | 22 |
| uji.YellohFellah 1.0 | 13 | 5% | 21 |
| br2.MobyDickBot 1.6 | 10 | 4% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 3% | 10 |
| stelo.MirrorNano 1.3 | 9 | 3% | 9 |

## Melee bench: F12

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 71.2 | 70 / 350 | 3.59 | 13.3% | 26803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 2.0 | 14.2% | 69 |
| nat.PallasHawk 1.0 | 2.1 | 14.3% | 93 |
| darkcanuck.Leon 1.01 | 2.8 | 13.8% | 77 |
| hadur117.nano.SanaroHL2 0.3 | 3.1 | 13.3% | 70 |
| brainfade.melee.Genghis 0.36 | 5.1 | 10.5% | 23 |
| jrm.Test0 1.0 | 6.3 | 8.4% | 3 |
| jp.Perpy 16.0 | 7.4 | 7.2% | 2 |
| cs.sheldor.Talon 1.1 | 7.4 | 7.2% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 10 |
| stuff.Vlad 0.1 | 9.5 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.7 | 69.2 | 8 / 35 | 2992 |
| 2 | 4 | 56.1 | 63.8 | 5 / 35 | 2466 |
| 3 | 2 | 59.5 | 70.8 | 9 / 35 | 2755 |
| 4 | 3 | 59.1 | 72.4 | 6 / 35 | 2588 |
| 5 | 4 | 59.0 | 70.8 | 8 / 35 | 2501 |
| 6 | 3 | 58.8 | 69.8 | 6 / 35 | 2641 |
| 7 | 4 | 58.0 | 67.6 | 5 / 35 | 2666 |
| 8 | 1 | 62.4 | 79.4 | 12 / 35 | 2690 |
| 9 | 4 | 61.7 | 78.4 | 7 / 35 | 2673 |
| 10 | 4 | 58.8 | 69.8 | 4 / 35 | 2831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 10% |
| bts.wiki.RipCurl 0.9b | 51 | 55% |
| darkcanuck.Leon 1.01 | 44 | 45% |
| brainfade.melee.Genghis 0.36 | 17 | 76% |
| jaybot.bots.Oddball 4.0 | 4 | 0% |
| jp.Perpy 16.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |
| jrm.Test0 1.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 83 | 30% | 91 |
| bts.wiki.RipCurl 0.9b | 60 | 21% | 87 |
| darkcanuck.Leon 1.01 | 50 | 18% | 73 |
| brainfade.melee.Genghis 0.36 | 27 | 10% | 35 |
| jrm.Test0 1.0 | 21 | 7% | 21 |
| cs.sheldor.Talon 1.1 | 19 | 7% | 21 |
| jp.Perpy 16.0 | 14 | 5% | 14 |
| jaybot.bots.Oddball 4.0 | 6 | 2% | 6 |
| stuff.Vlad 0.1 | 1 | 0% | 2 |

## Melee bench: F13

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 74.3 | 56 / 350 | 3.31 | 13.4% | 30401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.3% | 168 |
| ags.Glacier 0.2.11 | 1.7 | 16.4% | 77 |
| hadur117.nano.SanaroHL2 0.3 | 3.3 | 13.4% | 56 |
| shinh.Entangled 0.3 | 4.0 | 12.5% | 37 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.8% | 11 |
| apc.Colossus2 0.17 | 6.0 | 8.3% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.4% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.7 | 68.3 | 3 / 35 | 2930 |
| 2 | 3 | 61.3 | 77.1 | 6 / 35 | 2761 |
| 3 | 3 | 61.0 | 77.1 | 6 / 35 | 2772 |
| 4 | 3 | 60.4 | 72.4 | 7 / 35 | 3110 |
| 5 | 3 | 61.5 | 80.0 | 5 / 35 | 2704 |
| 6 | 4 | 60.6 | 72.4 | 5 / 35 | 3161 |
| 7 | 3 | 63.6 | 80.0 | 11 / 35 | 3417 |
| 8 | 3 | 60.8 | 73.0 | 5 / 35 | 3235 |
| 9 | 4 | 59.9 | 69.5 | 3 / 35 | 3235 |
| 10 | 3 | 60.7 | 73.3 | 5 / 35 | 3076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 82 | 33% |
| ags.Glacier 0.2.11 | 59 | 15% |
| shinh.Entangled 0.3 | 27 | 52% |
| gh.micro.Gruweltje 0.7 | 7 | 71% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 93 | 32% | 103 |
| mn.Combat 3.25.0 | 92 | 31% | 119 |
| gh.micro.Gruweltje 0.7 | 38 | 13% | 43 |
| shinh.Entangled 0.3 | 34 | 12% | 47 |
| stelo.Wang 1.0 | 22 | 7% | 23 |
| apc.Colossus2 0.17 | 8 | 3% | 8 |
| maribo.FollowFire 1 | 4 | 1% | 4 |
| sample.Tracker 1.0 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 78.9 | 118 / 350 | 2.90 | 14.8% | 31622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.6% | 127 |
| hadur117.nano.SanaroHL2 0.3 | 2.0 | 14.8% | 118 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.5% | 63 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.5 | 10.4% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.6 | 9.9% | 8 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 10.0% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 6.4 | 9.3% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 8.0% | 12 |
| pa.Improved 1.0 | 9.0 | 5.5% | 3 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 79.7 | 9 / 35 | 3470 |
| 2 | 2 | 62.9 | 78.1 | 15 / 35 | 3108 |
| 3 | 2 | 62.3 | 77.5 | 15 / 35 | 2702 |
| 4 | 2 | 60.5 | 72.1 | 9 / 35 | 2956 |
| 5 | 2 | 62.1 | 78.4 | 8 / 35 | 3153 |
| 6 | 2 | 62.1 | 78.1 | 9 / 35 | 3028 |
| 7 | 2 | 64.3 | 82.2 | 16 / 35 | 3353 |
| 8 | 2 | 64.4 | 82.5 | 14 / 35 | 3574 |
| 9 | 2 | 63.5 | 80.0 | 12 / 35 | 3248 |
| 10 | 2 | 62.8 | 80.0 | 11 / 35 | 3030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 110 | 54% |
| catcat20.shape.Theta 0.018 | 45 | 42% |
| sheldor.micro.PointInLineRRAL 1.0 | 23 | 83% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 64% |
| sanyi.mikrobi.Roberto 1.0 | 8 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 50% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 233 of 350 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 111 | 48% | 167 |
| catcat20.shape.Theta 0.018 | 44 | 19% | 64 |
| dmh.robocode.robot.RedDwarf 0.4 | 21 | 9% | 27 |
| sanyi.mikrobi.Roberto 1.0 | 15 | 6% | 24 |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 6% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 6% | 30 |
| Lo_Ian.Gandalf_V4 4.0 | 10 | 4% | 16 |
| pa.Improved 1.0 | 5 | 2% | 8 |

## Melee bench: F15

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 66.1 | 59 / 350 | 4.05 | 12.9% | 33436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.4 | 15.0% | 76 |
| emp.Yngwie 1.11 | 2.1 | 14.0% | 100 |
| mld.DustBunny 3.8 | 3.2 | 12.8% | 33 |
| hadur117.nano.SanaroHL2 0.3 | 3.5 | 12.9% | 59 |
| cb.nano.Insomnia 1.0 | 5.1 | 11.6% | 30 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.6% | 44 |
| Grystrion.TrackerWO 1.0 | 7.6 | 6.8% | 1 |
| lambdaxy.TBot 0.1 | 7.6 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.1 | 5.2% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.7 | 65.4 | 6 / 35 | 3303 |
| 2 | 5 | 54.0 | 56.5 | 3 / 35 | 2838 |
| 3 | 4 | 59.3 | 65.4 | 5 / 35 | 3410 |
| 4 | 5 | 56.5 | 59.0 | 3 / 35 | 3494 |
| 5 | 3 | 60.4 | 72.1 | 7 / 35 | 3404 |
| 6 | 4 | 60.3 | 68.9 | 7 / 35 | 3322 |
| 7 | 2 | 61.6 | 71.1 | 10 / 35 | 3636 |
| 8 | 2 | 58.6 | 67.3 | 8 / 35 | 3062 |
| 9 | 4 | 56.1 | 60.3 | 4 / 35 | 3033 |
| 10 | 2 | 62.2 | 74.6 | 6 / 35 | 3934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 44 | 52% |
| kawigi.micro.Shiz 1.1 | 33 | 39% |
| cb.nano.Insomnia 1.0 | 21 | 48% |
| kawigi.robot.Girl 1.2 | 12 | 75% |
| mld.DustBunny 3.8 | 11 | 9% |
| divineomega.TrialBot 0.003 | 3 | 100% |

Hadur died in 291 of 350 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 71 | 24% | 85 |
| mld.DustBunny 3.8 | 65 | 22% | 73 |
| emp.Yngwie 1.11 | 59 | 20% | 84 |
| cb.nano.Insomnia 1.0 | 36 | 12% | 32 |
| kawigi.robot.Girl 1.2 | 28 | 10% | 39 |
| Grystrion.TrackerWO 1.0 | 14 | 5% | 14 |
| divineomega.TrialBot 0.003 | 8 | 3% | 11 |
| lambdaxy.TBot 0.1 | 8 | 3% | 10 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 1% | 2 |

## Melee bench: F16

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.2 | 63 / 350 | 3.86 | 13.4% | 35650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.3% | 164 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.3 | 14.3% | 18 |
| hadur117.nano.SanaroHL2 0.3 | 2.8 | 13.4% | 63 |
| techdude.forest.FlamingForest 1.1 | 3.9 | 11.6% | 66 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 9.4% | 5 |
| tvv.nano.Polaris 1.2 | 5.8 | 9.6% | 22 |
| stelo.IntrinsicVolatility 1.4 | 6.6 | 8.1% | 3 |
| repositorio.NanoStep 1.0 | 8.7 | 5.3% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.2% | 9 |
| asd.Cthulhu 1.3 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 67.0 | 6 / 35 | 3588 |
| 2 | 2 | 61.7 | 73.3 | 5 / 35 | 3861 |
| 3 | 3 | 59.3 | 66.0 | 5 / 35 | 3458 |
| 4 | 2 | 63.2 | 75.2 | 11 / 35 | 3733 |
| 5 | 3 | 60.8 | 68.3 | 8 / 35 | 3748 |
| 6 | 3 | 60.2 | 67.9 | 5 / 35 | 3679 |
| 7 | 4 | 56.2 | 58.7 | 4 / 35 | 3166 |
| 8 | 3 | 60.3 | 66.3 | 6 / 35 | 3645 |
| 9 | 3 | 59.2 | 66.0 | 6 / 35 | 3300 |
| 10 | 2 | 61.0 | 73.0 | 7 / 35 | 3472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 82 | 28% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 95% |
| techdude.forest.FlamingForest 1.1 | 19 | 37% |
| tvv.nano.Polaris 1.2 | 9 | 22% |
| divineomega.DivineBot 1.9.4.5 | 5 | 60% |
| bvh.fnr.Fenrir 0.36l | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 288 of 350 rounds, at a mean tick of 1192. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 137 | 48% | 166 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 36 | 13% | 49 |
| bvh.fnr.Fenrir 0.36l | 36 | 13% | 41 |
| techdude.forest.FlamingForest 1.1 | 22 | 8% | 28 |
| tvv.nano.Polaris 1.2 | 21 | 7% | 23 |
| stelo.IntrinsicVolatility 1.4 | 15 | 5% | 18 |
| divineomega.DivineBot 1.9.4.5 | 11 | 4% | 14 |
| asd.Cthulhu 1.3 | 7 | 2% | 7 |
| repositorio.NanoStep 1.0 | 2 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 67.9 | 67 / 350 | 3.89 | 13.1% | 32733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.0 | 14.0% | 72 |
| oog.melee.Mercutio 1.0 | 2.6 | 13.8% | 73 |
| hadur117.nano.SanaroHL2 0.3 | 3.1 | 13.1% | 67 |
| cx.BlestPain 1.41 | 3.2 | 12.9% | 60 |
| nic.Nicator 2.4 | 4.8 | 11.7% | 37 |
| ahf.NanoAndrew .4 | 5.3 | 11.5% | 37 |
| maribo.melee.BMV 0.1 | 7.0 | 9.0% | 4 |
| tex.Longbot 0.4 | 8.4 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.6 | 5.6% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.9 | 63.2 | 8 / 35 | 3416 |
| 2 | 2 | 60.8 | 71.7 | 8 / 35 | 3413 |
| 3 | 5 | 56.2 | 61.3 | 3 / 35 | 2876 |
| 4 | 2 | 61.0 | 71.4 | 6 / 35 | 3586 |
| 5 | 4 | 56.0 | 60.3 | 6 / 35 | 2975 |
| 6 | 2 | 61.6 | 73.7 | 7 / 35 | 3532 |
| 7 | 4 | 58.4 | 64.8 | 7 / 35 | 3030 |
| 8 | 3 | 59.2 | 68.6 | 6 / 35 | 2961 |
| 9 | 3 | 59.7 | 68.9 | 5 / 35 | 3353 |
| 10 | 1 | 62.7 | 75.2 | 11 / 35 | 3591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 41 | 63% |
| et.Predator 1.8 | 35 | 23% |
| cx.BlestPain 1.41 | 22 | 82% |
| nic.Nicator 2.4 | 19 | 42% |
| ahf.NanoAndrew .4 | 18 | 39% |
| maribo.melee.BMV 0.1 | 3 | 0% |

Hadur died in 283 of 350 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 70 | 25% | 79 |
| oog.melee.Mercutio 1.0 | 49 | 17% | 73 |
| cx.BlestPain 1.41 | 49 | 17% | 66 |
| ahf.NanoAndrew .4 | 48 | 17% | 56 |
| nic.Nicator 2.4 | 35 | 12% | 42 |
| maribo.melee.BMV 0.1 | 20 | 7% | 21 |
| tex.Longbot 0.4 | 8 | 3% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 1% | 3 |
| goblin.Bender 2.4 | 2 | 1% | 2 |

## Melee bench: F18

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 69.3 | 91 / 350 | 3.76 | 13.5% | 30691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.2 | 14.6% | 94 |
| hadur117.nano.SanaroHL2 0.3 | 2.2 | 13.5% | 91 |
| agd.Mooserwirt2 2.7 | 2.9 | 12.8% | 59 |
| uji.DBH 1.1 | 3.9 | 11.6% | 32 |
| ratosh.Nobo 0.21 | 5.4 | 10.4% | 6 |
| spinnercat.Robovirus 2.718 | 6.1 | 9.8% | 27 |
| sigterm.Sigterm 1.0 | 6.6 | 9.0% | 22 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.3% | 6 |
| stelo.WangRobot 1.0 | 9.0 | 5.9% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 68.3 | 7 / 35 | 2694 |
| 2 | 2 | 59.0 | 67.9 | 9 / 35 | 3056 |
| 3 | 2 | 59.4 | 70.2 | 9 / 35 | 2803 |
| 4 | 2 | 59.6 | 68.6 | 9 / 35 | 3265 |
| 5 | 1 | 60.5 | 72.7 | 9 / 35 | 3250 |
| 6 | 2 | 59.1 | 68.6 | 8 / 35 | 3190 |
| 7 | 3 | 55.9 | 63.2 | 7 / 35 | 2612 |
| 8 | 2 | 60.6 | 73.7 | 10 / 35 | 2931 |
| 9 | 3 | 60.9 | 69.2 | 12 / 35 | 3587 |
| 10 | 2 | 60.8 | 71.1 | 11 / 35 | 3303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 47 | 62% |
| agd.Mooserwirt2 2.7 | 39 | 62% |
| sigterm.Sigterm 1.0 | 20 | 60% |
| uji.DBH 1.1 | 18 | 50% |
| spinnercat.Robovirus 2.718 | 14 | 86% |
| ratosh.Nobo 0.21 | 6 | 83% |
| stelo.WangRobot 1.0 | 3 | 0% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 0% |

Hadur died in 259 of 350 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 79 | 31% | 109 |
| agd.Mooserwirt2 2.7 | 43 | 17% | 69 |
| sigterm.Sigterm 1.0 | 30 | 12% | 42 |
| uji.DBH 1.1 | 28 | 11% | 31 |
| ratosh.Nobo 0.21 | 22 | 8% | 30 |
| kawigi.mini.Fhqwhgads 1.1 | 20 | 8% | 20 |
| spinnercat.Robovirus 2.718 | 17 | 7% | 28 |
| stelo.WangRobot 1.0 | 13 | 5% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7 | 3% | 7 |

## Melee bench: F19

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 81.0 | 117 / 350 | 2.71 | 15.8% | 37347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.4 | 16.3% | 85 |
| hadur117.nano.SanaroHL2 0.3 | 2.2 | 15.8% | 117 |
| mld.Infinity 2.2 | 2.4 | 15.6% | 110 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.3% | 6 |
| erdnis.Rover 0.3 | 5.1 | 10.2% | 6 |
| patson.PatsonTestBot 1.0 | 5.8 | 9.1% | 12 |
| pac.ABC 2.1 | 7.3 | 7.7% | 12 |
| mbh.Mbh 0.1 | 7.7 | 7.1% | 0 |
| pbg.R2D2 1.0 | 8.9 | 5.9% | 2 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 77.8 | 10 / 35 | 3954 |
| 2 | 2 | 65.1 | 80.6 | 10 / 35 | 3762 |
| 3 | 2 | 64.3 | 78.1 | 12 / 35 | 3610 |
| 4 | 1 | 66.2 | 84.1 | 16 / 35 | 3887 |
| 5 | 2 | 66.9 | 87.3 | 13 / 35 | 4030 |
| 6 | 3 | 64.3 | 80.6 | 9 / 35 | 3593 |
| 7 | 2 | 66.1 | 83.5 | 14 / 35 | 3871 |
| 8 | 3 | 64.0 | 79.7 | 10 / 35 | 3351 |
| 9 | 2 | 65.5 | 82.9 | 12 / 35 | 3766 |
| 10 | 2 | 63.3 | 75.9 | 11 / 35 | 3523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 90 | 54% |
| davidalves.net.DuelistMiniMelee 1.2 | 81 | 44% |
| krillr.mini.JointStrike 2.0.0 | 20 | 75% |
| erdnis.Rover 0.3 | 10 | 90% |
| patson.PatsonTestBot 1.0 | 8 | 63% |
| pac.ABC 2.1 | 6 | 17% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 234 of 350 rounds, at a mean tick of 1047. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 107 | 46% | 179 |
| mld.Infinity 2.2 | 60 | 26% | 37 |
| krillr.mini.JointStrike 2.0.0 | 23 | 10% | 40 |
| erdnis.Rover 0.3 | 18 | 8% | 36 |
| patson.PatsonTestBot 1.0 | 13 | 6% | 32 |
| pac.ABC 2.1 | 8 | 3% | 14 |
| pbg.R2D2 1.0 | 3 | 1% | 7 |
| mbh.Mbh 0.1 | 2 | 1% | 3 |

## Melee bench: F20

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 76.8 | 95 / 350 | 3.09 | 14.8% | 34840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.1 | 17.0% | 121 |
| hadur117.nano.SanaroHL2 0.3 | 1.9 | 14.8% | 95 |
| fwb.Nine 1.0.1 | 3.4 | 11.9% | 54 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.7% | 22 |
| catcat20.Rabbit 0.001 | 4.9 | 10.2% | 33 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 9.0% | 8 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.6% | 5 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.4% | 12 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 82.2 | 8 / 35 | 3606 |
| 2 | 2 | 61.6 | 74.3 | 7 / 35 | 3654 |
| 3 | 2 | 61.5 | 74.6 | 7 / 35 | 3491 |
| 4 | 2 | 63.2 | 80.0 | 11 / 35 | 3316 |
| 5 | 2 | 59.7 | 68.9 | 6 / 35 | 3308 |
| 6 | 2 | 62.0 | 74.0 | 12 / 35 | 3552 |
| 7 | 2 | 63.2 | 78.7 | 8 / 35 | 3765 |
| 8 | 2 | 62.5 | 78.1 | 11 / 35 | 3058 |
| 9 | 1 | 64.3 | 79.4 | 14 / 35 | 3866 |
| 10 | 2 | 62.6 | 78.1 | 11 / 35 | 3224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 108 | 41% |
| fwb.Nine 1.0.1 | 52 | 46% |
| catcat20.Rabbit 0.001 | 16 | 63% |
| nz.jdc.nano.GridFu 1.0 | 14 | 50% |
| djdjdj.NanoSkunk10 1.0 | 6 | 67% |
| bayen.nut.Squirrel 1.615 | 5 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 0% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 255 of 350 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 120 | 47% | 167 |
| fwb.Nine 1.0.1 | 42 | 16% | 22 |
| nz.jdc.nano.GridFu 1.0 | 37 | 15% | 59 |
| catcat20.Rabbit 0.001 | 19 | 7% | 33 |
| bayen.nut.Squirrel 1.615 | 15 | 6% | 23 |
| djdjdj.NanoSkunk10 1.0 | 11 | 4% | 26 |
| ntc.ControlledChaos 1.1.4 | 5 | 2% | 6 |
| m3thos.mini.Eva01 0.5.5 | 4 | 2% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 5 |

## Melee bench: F21

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.3 | 148 / 350 | 2.42 | 17.3% | 45493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHL2 0.3 | 1.4 | 17.3% | 148 |
| eem.EvBot v4.6.16 | 1.7 | 17.1% | 135 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 27 |
| cf.RiO.RiOx 4.2.1 | 3.9 | 12.2% | 28 |
| oa.weak.BotherBot 0.1 | 5.2 | 8.9% | 1 |
| eld.Hmm 1.0 | 5.8 | 8.4% | 13 |
| fire219.CatBot 1.0 | 7.6 | 6.1% | 0 |
| el.JumpShoot 0.2 | 7.6 | 6.1% | 2 |
| PSW.Relentless 0.1 | 8.9 | 5.1% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 87.0 | 13 / 35 | 4804 |
| 2 | 1 | 67.0 | 86.0 | 13 / 35 | 4619 |
| 3 | 2 | 65.3 | 81.0 | 11 / 35 | 4229 |
| 4 | 1 | 66.8 | 86.3 | 18 / 35 | 4117 |
| 5 | 1 | 66.4 | 81.9 | 15 / 35 | 4654 |
| 6 | 1 | 68.0 | 86.0 | 19 / 35 | 4823 |
| 7 | 2 | 66.2 | 81.3 | 13 / 35 | 4561 |
| 8 | 1 | 68.6 | 89.2 | 20 / 35 | 4489 |
| 9 | 2 | 65.9 | 79.4 | 12 / 35 | 4799 |
| 10 | 2 | 66.8 | 84.4 | 14 / 35 | 4398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 154 | 55% |
| dummy.mini.Scimitar 1.01 | 37 | 86% |
| cf.RiO.RiOx 4.2.1 | 26 | 62% |
| eld.Hmm 1.0 | 13 | 62% |
| oa.weak.BotherBot 0.1 | 7 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 204 of 350 rounds, at a mean tick of 1331. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 94 | 46% | 155 |
| cf.RiO.RiOx 4.2.1 | 42 | 21% | 56 |
| dummy.mini.Scimitar 1.01 | 41 | 20% | 85 |
| oa.weak.BotherBot 0.1 | 9 | 4% | 22 |
| eld.Hmm 1.0 | 8 | 4% | 23 |
| fire219.CatBot 1.0 | 4 | 2% | 3 |
| el.JumpShoot 0.2 | 2 | 1% | 3 |
| PSW.Relentless 0.1 | 1 | 0% | 2 |
| arthord.MannyPacquiao Beta | 1 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.6 | 143 / 350 | 2.39 | 16.8% | 39238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.2% | 138 |
| hadur117.nano.SanaroHL2 0.3 | 1.9 | 16.8% | 143 |
| cre.Karolos 0.32 | 3.0 | 14.2% | 43 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 11.7% | 15 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 9.1% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.7% | 2 |
| cw.megas.Blade 0.8 | 6.8 | 8.3% | 2 |
| sample.Walls 1.0 | 6.9 | 8.5% | 1 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 85.4 | 13 / 35 | 4317 |
| 2 | 2 | 66.3 | 82.9 | 15 / 35 | 3712 |
| 3 | 2 | 67.8 | 88.3 | 16 / 35 | 3814 |
| 4 | 2 | 66.9 | 84.1 | 13 / 35 | 4002 |
| 5 | 2 | 68.3 | 87.6 | 16 / 35 | 4401 |
| 6 | 2 | 66.0 | 82.5 | 12 / 35 | 3761 |
| 7 | 2 | 64.6 | 75.6 | 13 / 35 | 3698 |
| 8 | 2 | 66.4 | 83.8 | 12 / 35 | 3730 |
| 9 | 2 | 68.3 | 88.3 | 16 / 35 | 3967 |
| 10 | 1 | 67.2 | 87.6 | 17 / 35 | 3836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 120 | 55% |
| cre.Karolos 0.32 | 53 | 60% |
| stelo.AreaTargetingBot 1.1 | 22 | 73% |
| sample.Walls 1.0 | 16 | 100% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 2 | 50% |

Hadur died in 207 of 350 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 111 | 54% | 182 |
| cre.Karolos 0.32 | 50 | 24% | 85 |
| stelo.AreaTargetingBot 1.1 | 26 | 13% | 37 |
| stelo.RamTrackSurfer 1.2 | 9 | 4% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 3% | 10 |
| cw.megas.Blade 0.8 | 3 | 1% | 5 |
| sample.Walls 1.0 | 1 | 0% | 9 |

## Melee bench: F24

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.5 | 59.3 | 52 / 350 | 4.67 | 11.0% | 23694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.5 | 14.6% | 76 |
| davidalves.Phoenix 0.54 | 2.3 | 13.9% | 88 |
| florent.XSeries.X2 0.12 | 2.5 | 13.7% | 62 |
| pedersen.Ugluk 1.1.1 | 3.9 | 12.4% | 41 |
| hadur117.nano.SanaroHL2 0.3 | 4.9 | 11.0% | 52 |
| oog.melee.Corsair 1.0 | 6.4 | 9.3% | 6 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.8% | 21 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.6% | 5 |
| as.FrankTheTank 1.3 | 9.2 | 5.1% | 1 |
| evd.X1 0.01 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 51.2 | 52.4 | 2 / 35 | 2454 |
| 2 | 5 | 56.1 | 62.9 | 5 / 35 | 2439 |
| 3 | 5 | 55.3 | 62.5 | 5 / 35 | 2338 |
| 4 | 5 | 52.3 | 52.1 | 4 / 35 | 2598 |
| 5 | 4 | 55.6 | 62.9 | 6 / 35 | 2200 |
| 6 | 5 | 56.2 | 62.2 | 10 / 35 | 2213 |
| 7 | 4 | 55.4 | 61.0 | 4 / 35 | 2502 |
| 8 | 5 | 52.2 | 54.6 | 7 / 35 | 2037 |
| 9 | 5 | 55.8 | 60.3 | 6 / 35 | 2427 |
| 10 | 5 | 55.6 | 61.9 | 3 / 35 | 2486 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 67% |
| pedersen.Ugluk 1.1.1 | 19 | 47% |
| florent.XSeries.X2 0.12 | 15 | 53% |
| davidalves.Phoenix 0.54 | 14 | 43% |
| stelo.SoJNanoMelee 1.1 | 12 | 33% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pedersen.Ugluk 1.1.1 | 72 | 24% | 78 |
| davidalves.Phoenix 0.54 | 60 | 20% | 65 |
| florent.XSeries.X2 0.12 | 54 | 18% | 66 |
| rz.GlowBlowMelee 1.4 | 46 | 15% | 65 |
| stelo.SoJNanoMelee 1.1 | 23 | 8% | 25 |
| oog.melee.Corsair 1.0 | 18 | 6% | 23 |
| lunchie.Lunchbox 0.93 | 13 | 4% | 15 |
| as.FrankTheTank 1.3 | 7 | 2% | 8 |
| evd.X1 0.01 | 5 | 2% | 5 |

## Melee bench: F25

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 67.1 | 84 / 350 | 3.96 | 13.1% | 28276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 1.9 | 13.8% | 67 |
| voidious.mini.BrokenSword 2.0.3 | 1.9 | 13.8% | 74 |
| hadur117.nano.SanaroHL2 0.3 | 2.6 | 13.1% | 84 |
| jdw.Hurricane 1.4 | 4.0 | 11.9% | 50 |
| gre.svman4.Morfeas 1.4.1 | 4.8 | 10.4% | 22 |
| ds.Oo 2.2 | 6.0 | 9.3% | 21 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.7% | 23 |
| adt.Ar2 1.1 | 8.5 | 7.1% | 7 |
| awesomeness.Elite 1.0 | 8.5 | 7.2% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 73.0 | 10 / 35 | 2780 |
| 2 | 1 | 59.8 | 69.2 | 10 / 35 | 2929 |
| 3 | 3 | 59.0 | 68.6 | 6 / 35 | 2910 |
| 4 | 2 | 61.2 | 74.0 | 11 / 35 | 3050 |
| 5 | 3 | 58.8 | 67.6 | 10 / 35 | 2541 |
| 6 | 2 | 59.8 | 70.8 | 8 / 35 | 2964 |
| 7 | 4 | 56.8 | 63.2 | 6 / 35 | 2605 |
| 8 | 3 | 55.8 | 60.0 | 11 / 35 | 2621 |
| 9 | 4 | 55.1 | 57.5 | 4 / 35 | 3013 |
| 10 | 2 | 58.4 | 67.6 | 8 / 35 | 2863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 44 | 52% |
| voidious.micro.BlitzBat 1.05 | 43 | 30% |
| jdw.Hurricane 1.4 | 24 | 83% |
| gre.svman4.Morfeas 1.4.1 | 17 | 59% |
| ds.Oo 2.2 | 11 | 36% |
| gjr.Cephalosporin 0.1 | 7 | 86% |
| adt.Ar2 1.1 | 4 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 266 of 350 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 57 | 21% | 83 |
| voidious.micro.BlitzBat 1.05 | 56 | 21% | 72 |
| jdw.Hurricane 1.4 | 38 | 14% | 54 |
| ds.Oo 2.2 | 28 | 11% | 33 |
| gre.svman4.Morfeas 1.4.1 | 22 | 8% | 29 |
| gjr.Cephalosporin 0.1 | 22 | 8% | 27 |
| adt.Ar2 1.1 | 21 | 8% | 25 |
| amk.ChumbaMini 0.2 | 14 | 5% | 15 |
| awesomeness.Elite 1.0 | 8 | 3% | 12 |

## Melee bench: F26

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 69.6 | 59 / 350 | 3.74 | 13.1% | 33987 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.7% | 135 |
| hadur117.nano.SanaroHL2 0.3 | 2.7 | 13.1% | 59 |
| shu.nitro.LENIN .T34 | 3.3 | 12.8% | 63 |
| lrem.Spectre 0.4.4 | 3.6 | 12.4% | 45 |
| gh.mini.GrubbmOne 1.0 | 5.0 | 11.1% | 22 |
| js.PinBall 1.6 | 5.4 | 10.8% | 13 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 9.2% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.8% | 6 |
| sample.SpinBot 1.0 | 8.8 | 5.4% | 3 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 69.2 | 5 / 35 | 3428 |
| 2 | 3 | 58.5 | 64.4 | 4 / 35 | 3308 |
| 3 | 3 | 57.8 | 65.4 | 4 / 35 | 3197 |
| 4 | 2 | 59.3 | 69.2 | 7 / 35 | 3220 |
| 5 | 2 | 63.9 | 77.8 | 12 / 35 | 3910 |
| 6 | 3 | 59.9 | 71.4 | 7 / 35 | 2964 |
| 7 | 3 | 58.8 | 67.6 | 5 / 35 | 3154 |
| 8 | 2 | 61.7 | 74.0 | 4 / 35 | 3610 |
| 9 | 2 | 62.3 | 74.3 | 8 / 35 | 3934 |
| 10 | 4 | 57.6 | 62.5 | 3 / 35 | 3262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 50 | 24% |
| shu.nitro.LENIN .T34 | 30 | 33% |
| lrem.Spectre 0.4.4 | 24 | 54% |
| gh.mini.GrubbmOne 1.0 | 16 | 50% |
| js.PinBall 1.6 | 12 | 75% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 50% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 50% |

Hadur died in 291 of 350 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 89 | 31% | 105 |
| shu.nitro.LENIN .T34 | 46 | 16% | 58 |
| gh.mini.GrubbmOne 1.0 | 43 | 15% | 51 |
| lrem.Spectre 0.4.4 | 40 | 14% | 48 |
| js.PinBall 1.6 | 25 | 9% | 31 |
| jaybot.adv.bots.JayBot 2.0 | 22 | 8% | 28 |
| sample.SpinBot 1.0 | 16 | 5% | 17 |
| fullsail.LaxativeTeaTwo 1.0 | 10 | 3% | 12 |

## Melee bench: F27

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 73.5 | 122 / 350 | 3.38 | 14.1% | 29112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.8 | 14.4% | 89 |
| hadur117.nano.SanaroHL2 0.3 | 1.9 | 14.1% | 122 |
| wee.Gem 1.8.4 | 2.9 | 12.7% | 68 |
| sheldor.melee.nano.TestMelee 0.1 | 3.7 | 12.0% | 31 |
| EH.Eagle 1.0.6 | 5.2 | 10.2% | 15 |
| joe.ADinosaur 1.0 | 6.6 | 9.2% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 7.1 | 8.4% | 8 |
| throxbot.ThroxBot 0.1 | 7.6 | 8.1% | 6 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.2% | 2 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.3 | 74.9 | 13 / 35 | 2929 |
| 2 | 3 | 59.2 | 72.1 | 12 / 35 | 2389 |
| 3 | 1 | 62.5 | 80.3 | 15 / 35 | 2685 |
| 4 | 1 | 63.7 | 80.6 | 18 / 35 | 3058 |
| 5 | 1 | 62.1 | 78.4 | 14 / 35 | 3103 |
| 6 | 3 | 56.4 | 63.2 | 7 / 35 | 2459 |
| 7 | 3 | 58.0 | 55.2 | 6 / 35 | 4328 |
| 8 | 2 | 62.1 | 78.4 | 12 / 35 | 2867 |
| 9 | 2 | 60.1 | 72.7 | 11 / 35 | 2832 |
| 10 | 2 | 61.9 | 79.4 | 14 / 35 | 2462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 79 | 73% |
| wee.Gem 1.8.4 | 53 | 51% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 65% |
| EH.Eagle 1.0.6 | 13 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 70% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| joe.ADinosaur 1.0 | 4 | 0% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 231 of 350 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 58 | 25% | 114 |
| wee.Gem 1.8.4 | 49 | 21% | 75 |
| sheldor.melee.nano.TestMelee 0.1 | 39 | 17% | 56 |
| joe.ADinosaur 1.0 | 37 | 16% | 38 |
| EH.Eagle 1.0.6 | 13 | 6% | 26 |
| techdude.kombat.FlamingKombat 1.5 | 11 | 5% | 12 |
| throxbot.ThroxBot 0.1 | 10 | 4% | 15 |
| caimano.Furia_Ceca 0.22 | 7 | 3% | 8 |
| cs.Grudge 1.0 | 6 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 79.0 | 120 / 350 | 2.89 | 15.2% | 31525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.4 | 16.0% | 107 |
| hadur117.nano.SanaroHL2 0.3 | 1.6 | 15.2% | 120 |
| uji.Antique 1.0 | 3.3 | 12.7% | 52 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 11.6% | 37 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 10.4% | 11 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.2% | 9 |
| amk.ChumbaWumba 0.3 | 6.8 | 8.1% | 10 |
| matt.advanced.Katana 1.0 | 8.6 | 6.2% | 4 |
| stelo.PianistNano 1.2 | 9.0 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 74.0 | 10 / 35 | 2851 |
| 2 | 2 | 62.0 | 76.5 | 8 / 35 | 3372 |
| 3 | 1 | 63.7 | 80.0 | 15 / 35 | 3092 |
| 4 | 1 | 62.6 | 78.7 | 12 / 35 | 3152 |
| 5 | 2 | 62.2 | 80.3 | 7 / 35 | 2928 |
| 6 | 2 | 62.2 | 74.9 | 12 / 35 | 3284 |
| 7 | 1 | 64.7 | 83.5 | 18 / 35 | 3304 |
| 8 | 2 | 62.7 | 77.8 | 12 / 35 | 2971 |
| 9 | 1 | 64.3 | 82.2 | 14 / 35 | 3378 |
| 10 | 2 | 63.6 | 81.6 | 12 / 35 | 3193 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 109 | 55% |
| uji.Antique 1.0 | 40 | 63% |
| qohnil.blot.BlotBot 3.61 | 31 | 45% |
| ahr.ice.Ice 1.0.2 | 9 | 67% |
| pfvicm.Sobieski 7.2.3b | 9 | 67% |
| amk.ChumbaWumba 0.3 | 6 | 83% |
| matt.advanced.Katana 1.0 | 4 | 75% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 230 of 350 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 85 | 37% | 128 |
| uji.Antique 1.0 | 35 | 15% | 71 |
| qohnil.blot.BlotBot 3.61 | 31 | 13% | 48 |
| pfvicm.Sobieski 7.2.3b | 31 | 13% | 36 |
| amk.ChumbaWumba 0.3 | 23 | 10% | 28 |
| ahr.ice.Ice 1.0.2 | 13 | 6% | 19 |
| matt.advanced.Katana 1.0 | 5 | 2% | 11 |
| stelo.Lifestealer 1.0 | 4 | 2% | 4 |
| stelo.PianistNano 1.2 | 3 | 1% | 4 |

## Melee bench: F29

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 69.6 | 76 / 350 | 3.74 | 13.7% | 31579 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.3 | 16.2% | 106 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 15.7% | 105 |
| hadur117.nano.SanaroHL2 0.3 | 3.0 | 13.7% | 76 |
| myl.micro.Troodon 1.10 | 4.0 | 12.5% | 20 |
| jok.PheonixM 0.1.2 | 4.9 | 10.9% | 11 |
| DBall.Anarchy 0.1 | 6.4 | 8.3% | 26 |
| ph.melee.ArcherME 0.3 | 6.6 | 8.0% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.8% | 0 |
| jangs.ns51 1.0 | 9.4 | 4.4% | 2 |
| ap.Frederick 1.1 | 9.6 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.4 | 62.5 | 4 / 35 | 2714 |
| 2 | 3 | 61.7 | 70.2 | 11 / 35 | 3149 |
| 3 | 3 | 61.5 | 69.8 | 10 / 35 | 3167 |
| 4 | 3 | 62.0 | 74.3 | 7 / 35 | 3131 |
| 5 | 3 | 58.9 | 64.4 | 7 / 35 | 3026 |
| 6 | 2 | 62.3 | 72.4 | 10 / 35 | 3470 |
| 7 | 3 | 61.0 | 71.7 | 7 / 35 | 3071 |
| 8 | 3 | 62.3 | 74.9 | 8 / 35 | 3236 |
| 9 | 3 | 61.3 | 69.2 | 8 / 35 | 3415 |
| 10 | 3 | 59.4 | 66.3 | 4 / 35 | 3200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 58 | 57% |
| deewiant.Anomaly 0.2 | 56 | 18% |
| myl.micro.Troodon 1.10 | 21 | 95% |
| DBall.Anarchy 0.1 | 15 | 40% |
| jok.PheonixM 0.1.2 | 8 | 75% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 276 of 350 rounds, at a mean tick of 1062. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 119 | 43% | 131 |
| zyx.mega.YersiniaPestis 3.1 | 61 | 22% | 92 |
| myl.micro.Troodon 1.10 | 34 | 12% | 53 |
| jok.PheonixM 0.1.2 | 31 | 11% | 35 |
| DBall.Anarchy 0.1 | 15 | 5% | 22 |
| ph.melee.ArcherME 0.3 | 13 | 5% | 13 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 1% | 2 |
| jangs.ns51 1.0 | 1 | 0% | 2 |

## Melee bench: F30

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.2 | 55.6 | 19 / 350 | 4.99 | 10.4% | 25948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.9 | 14.2% | 97 |
| darkcanuck.B26354 1.06 | 2.2 | 13.8% | 82 |
| stelo.PastFuture 2.3.2 | 2.7 | 13.7% | 66 |
| oog.melee.Capulet 1.2 | 3.2 | 13.4% | 53 |
| hadur117.nano.SanaroHL2 0.3 | 5.0 | 10.4% | 19 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.3% | 18 |
| ntc.Opposite 1.5 | 7.7 | 7.9% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.7% | 8 |
| tripphippy.Alice 1.1 | 8.5 | 7.1% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.0 | 56.8 | 1 / 35 | 2660 |
| 2 | 5 | 50.1 | 49.2 | 1 / 35 | 2342 |
| 3 | 5 | 54.7 | 60.0 | 4 / 35 | 2593 |
| 4 | 5 | 53.0 | 55.9 | 2 / 35 | 2520 |
| 5 | 5 | 54.3 | 57.5 | 1 / 35 | 2887 |
| 6 | 5 | 53.7 | 57.5 | 2 / 35 | 2466 |
| 7 | 5 | 52.2 | 52.7 | 2 / 35 | 2715 |
| 8 | 5 | 53.0 | 56.5 | 2 / 35 | 2455 |
| 9 | 5 | 53.7 | 53.7 | 1 / 35 | 2878 |
| 10 | 5 | 53.5 | 56.5 | 3 / 35 | 2432 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 23 | 22% |
| oog.melee.Capulet 1.2 | 15 | 7% |
| catcat20.Matcha 0.006 | 12 | 25% |
| stelo.PastFuture 2.3.2 | 11 | 45% |
| intruder.PrairieWolf 2.61 | 5 | 40% |
| tripphippy.Alice 1.1 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 331 of 350 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 68 | 21% | 73 |
| oog.melee.Capulet 1.2 | 65 | 20% | 67 |
| stelo.PastFuture 2.3.2 | 60 | 18% | 67 |
| catcat20.Matcha 0.006 | 45 | 14% | 47 |
| ntc.Opposite 1.5 | 25 | 8% | 26 |
| intruder.PrairieWolf 2.61 | 23 | 7% | 24 |
| fowl3628800.LightningBolt 2.6.0 | 22 | 7% | 22 |
| tripphippy.Alice 1.1 | 21 | 6% | 22 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |

## Melee bench: F31

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.0 | 55.6 | 27 / 350 | 5.00 | 10.3% | 23553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 180 |
| gh.mini.Griezel 0.2 | 2.0 | 14.2% | 85 |
| d414.nano.Quantum 1.0.0 | 3.4 | 12.4% | 33 |
| spinnercat.micro.Tyger 0.1 | 3.9 | 11.5% | 18 |
| hadur117.nano.SanaroHL2 0.3 | 5.0 | 10.3% | 27 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.5% | 6 |
| timmit.nano.TimDog 0.33 | 7.6 | 6.5% | 2 |
| fm.mammillarias 1.3 | 7.7 | 7.0% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.1 | 5.3% | 2 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.2 | 55.6 | 2 / 35 | 2465 |
| 2 | 5 | 55.4 | 60.3 | 4 / 35 | 2321 |
| 3 | 6 | 49.2 | 46.7 | 2 / 35 | 2171 |
| 4 | 5 | 51.7 | 53.3 | 2 / 35 | 2175 |
| 5 | 6 | 49.3 | 47.6 | 2 / 35 | 2077 |
| 6 | 4 | 56.0 | 60.3 | 5 / 35 | 2847 |
| 7 | 5 | 54.4 | 58.4 | 4 / 35 | 2368 |
| 8 | 4 | 56.3 | 63.8 | 3 / 35 | 2512 |
| 9 | 4 | 55.9 | 62.2 | 3 / 35 | 2476 |
| 10 | 6 | 49.2 | 47.6 | 0 / 35 | 2141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 38 | 32% |
| abc.Shadow 3.84i | 30 | 33% |
| d414.nano.Quantum 1.0.0 | 12 | 25% |
| spinnercat.micro.Tyger 0.1 | 5 | 20% |
| fm.mammillarias 1.3 | 2 | 50% |

Hadur died in 323 of 350 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 103 | 32% | 115 |
| abc.Shadow 3.84i | 56 | 17% | 67 |
| d414.nano.Quantum 1.0.0 | 50 | 15% | 52 |
| spinnercat.micro.Tyger 0.1 | 40 | 12% | 40 |
| fm.mammillarias 1.3 | 27 | 8% | 27 |
| gh.nano.Grofvuil 0.2 | 27 | 8% | 27 |
| timmit.nano.TimDog 0.33 | 9 | 3% | 9 |
| Gecko.ultimateGeckoBot 1.0 | 7 | 2% | 9 |
| tlp.ThreeLeggedPig 1 | 4 | 1% | 4 |

## Melee bench: F32

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 78.2 | 131 / 350 | 2.96 | 15.0% | 32510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.6% | 104 |
| hadur117.nano.SanaroHL2 0.3 | 1.7 | 15.0% | 131 |
| apc.botM 3.0 | 3.4 | 12.3% | 51 |
| vjik.UnViolation 1.1 | 3.8 | 11.5% | 34 |
| lxx.ConceptA 0.8 | 4.8 | 10.6% | 2 |
| bayen.UbaMicro 1.4 | 6.0 | 9.1% | 8 |
| panzer.Panzer 0.2 | 7.6 | 7.4% | 0 |
| yk.JahMicro 1.0 | 8.0 | 7.0% | 11 |
| conscience.Electron 1.3g | 8.5 | 6.4% | 3 |
| donjezza.Jezza 1.0 | 9.8 | 5.2% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 78.7 | 13 / 35 | 3262 |
| 2 | 3 | 58.4 | 68.9 | 8 / 35 | 2957 |
| 3 | 2 | 62.0 | 75.6 | 15 / 35 | 3291 |
| 4 | 1 | 64.6 | 82.5 | 18 / 35 | 3520 |
| 5 | 2 | 60.6 | 74.0 | 9 / 35 | 3189 |
| 6 | 2 | 61.9 | 79.0 | 12 / 35 | 2794 |
| 7 | 1 | 63.1 | 78.4 | 13 / 35 | 3433 |
| 8 | 1 | 65.1 | 83.2 | 18 / 35 | 3819 |
| 9 | 2 | 63.5 | 82.5 | 13 / 35 | 3150 |
| 10 | 2 | 62.0 | 79.0 | 12 / 35 | 3095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 100 | 57% |
| apc.botM 3.0 | 42 | 76% |
| vjik.UnViolation 1.1 | 30 | 60% |
| lxx.ConceptA 0.8 | 14 | 100% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| yk.JahMicro 1.0 | 4 | 25% |
| donjezza.Jezza 1.0 | 4 | 50% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 219 of 350 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 71 | 32% | 124 |
| lxx.ConceptA 0.8 | 42 | 19% | 50 |
| apc.botM 3.0 | 39 | 18% | 75 |
| vjik.UnViolation 1.1 | 23 | 11% | 48 |
| bayen.UbaMicro 1.4 | 21 | 10% | 26 |
| yk.JahMicro 1.0 | 10 | 5% | 12 |
| conscience.Electron 1.3g | 5 | 2% | 5 |
| donjezza.Jezza 1.0 | 5 | 2% | 5 |
| panzer.Panzer 0.2 | 3 | 1% | 5 |

## Melee bench: F33

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 70.1 | 78 / 350 | 3.69 | 13.9% | 34038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.1% | 100 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.9% | 78 |
| hadur117.nano.SanaroHL2 0.3 | 2.6 | 13.9% | 78 |
| labg.Cataclysm 2.05 | 4.4 | 11.4% | 46 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.3% | 28 |
| baal.nano.N 1.42 | 6.4 | 8.9% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.6% | 15 |
| zyx.micro.Ant 1.1 | 8.5 | 5.5% | 0 |
| sanja.First 0.1 | 8.9 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.6 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 69.5 | 9 / 35 | 3395 |
| 2 | 3 | 59.6 | 66.0 | 8 / 35 | 3318 |
| 3 | 3 | 60.3 | 67.9 | 5 / 35 | 3505 |
| 4 | 3 | 60.9 | 69.5 | 7 / 35 | 3347 |
| 5 | 3 | 60.4 | 68.9 | 10 / 35 | 3094 |
| 6 | 3 | 59.2 | 68.9 | 4 / 35 | 3167 |
| 7 | 2 | 63.0 | 75.2 | 8 / 35 | 3612 |
| 8 | 2 | 62.1 | 71.4 | 11 / 35 | 3716 |
| 9 | 2 | 61.2 | 70.2 | 9 / 35 | 3438 |
| 10 | 2 | 62.1 | 73.3 | 7 / 35 | 3446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 58 | 62% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 21% |
| gre.svman4.Leonidas 1.3.2 | 17 | 76% |
| labg.Cataclysm 2.05 | 17 | 53% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 88% |
| baal.nano.N 1.42 | 3 | 33% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 0% |

Hadur died in 274 of 350 rounds, at a mean tick of 1138. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 81 | 30% | 119 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 74 | 27% | 87 |
| gre.svman4.Leonidas 1.3.2 | 29 | 11% | 41 |
| labg.Cataclysm 2.05 | 28 | 10% | 34 |
| kinsen.melee.Angsaichmophobia 1.8c | 28 | 10% | 31 |
| baal.nano.N 1.42 | 19 | 7% | 21 |
| zyx.micro.Ant 1.1 | 7 | 3% | 10 |
| sanja.First 0.1 | 4 | 1% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 1% | 2 |

## Melee bench: F34

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 72.7 | 55 / 350 | 3.46 | 13.5% | 32650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.4 | 17.7% | 115 |
| stelo.Spread 0.9 | 1.6 | 17.7% | 137 |
| hadur117.nano.SanaroHL2 0.3 | 3.0 | 13.5% | 55 |
| tcf.Reach 3 | 4.4 | 11.2% | 16 |
| jcs.Seth 1.8 | 4.7 | 11.1% | 20 |
| cli.Dancer 1.1 | 5.9 | 9.8% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 74.9 | 8 / 35 | 3308 |
| 2 | 3 | 59.8 | 68.3 | 6 / 35 | 2769 |
| 3 | 3 | 62.7 | 76.8 | 5 / 35 | 3329 |
| 4 | 3 | 61.2 | 71.4 | 4 / 35 | 3277 |
| 5 | 3 | 63.6 | 79.7 | 7 / 35 | 3261 |
| 6 | 3 | 62.8 | 74.0 | 6 / 35 | 3727 |
| 7 | 3 | 58.8 | 64.8 | 6 / 35 | 2933 |
| 8 | 3 | 63.3 | 76.8 | 4 / 35 | 3725 |
| 9 | 3 | 59.7 | 67.6 | 5 / 35 | 3065 |
| 10 | 3 | 60.7 | 72.4 | 4 / 35 | 3256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 55 | 51% |
| kid.Gladiator .7.2 | 53 | 21% |
| jcs.Seth 1.8 | 18 | 56% |
| tcf.Reach 3 | 8 | 50% |
| ratosh.Wesco 1.4 | 2 | 50% |
| cli.Dancer 1.1 | 2 | 0% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 296 of 350 rounds, at a mean tick of 961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 121 | 41% | 126 |
| stelo.Spread 0.9 | 82 | 28% | 114 |
| jcs.Seth 1.8 | 32 | 11% | 42 |
| tcf.Reach 3 | 32 | 11% | 37 |
| cli.Dancer 1.1 | 12 | 4% | 13 |
| ratosh.Wesco 1.4 | 9 | 3% | 10 |
| amk.Punbot.Punbot 0.01 | 7 | 2% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 66.4 | 15 / 350 | 4.02 | 11.9% | 25334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 259 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.6% | 41 |
| rz.HawkOnFire 0.1 | 3.4 | 12.3% | 10 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.7 | 12.2% | 25 |
| hadur117.nano.SanaroHL2 0.3 | 4.4 | 11.9% | 15 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.7% | 0 |
| wit.Chuliath 1.0 | 6.8 | 6.9% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 9.1 | 5.3% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.0 | 63.5 | 0 / 35 | 2598 |
| 2 | 5 | 54.7 | 57.5 | 2 / 35 | 2756 |
| 3 | 5 | 57.0 | 66.3 | 0 / 35 | 2444 |
| 4 | 5 | 56.2 | 62.9 | 1 / 35 | 2325 |
| 5 | 3 | 59.7 | 73.7 | 1 / 35 | 2435 |
| 6 | 3 | 60.6 | 76.5 | 3 / 35 | 2620 |
| 7 | 5 | 59.0 | 67.9 | 3 / 35 | 2803 |
| 8 | 4 | 57.9 | 66.0 | 2 / 35 | 2938 |
| 9 | 5 | 55.9 | 62.2 | 3 / 35 | 2302 |
| 10 | 4 | 56.7 | 67.6 | 0 / 35 | 2113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 80 | 3% |
| gh.mini.Gruwel 0.9 | 14 | 50% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 29% |
| rz.HawkOnFire 0.1 | 5 | 40% |

Hadur died in 335 of 350 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 148 | 44% | 148 |
| rz.HawkOnFire 0.1 | 51 | 15% | 55 |
| dmh.robocode.robot.BlackDeath 9.2 | 51 | 15% | 53 |
| gh.mini.Gruwel 0.9 | 47 | 14% | 56 |
| myl.nano.KomoriNinja 1.1 | 15 | 4% | 15 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8 | 2% | 8 |
| stelo.MyAgileRobot 0.2 | 6 | 2% | 6 |
| wit.Chuliath 1.0 | 5 | 1% | 5 |
| dans.Cinnamon 1.2 | 4 | 1% | 4 |

## Melee bench: F36

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 73.7 | 131 / 350 | 3.36 | 14.8% | 34282 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHL2 0.3 | 1.2 | 14.8% | 131 |
| alpha.RainingFire 1.0 | 2.6 | 13.1% | 62 |
| bzdp.Pansy 2.1 | 3.7 | 12.3% | 44 |
| mz.Cork 0.1 | 4.1 | 11.7% | 36 |
| bvh.micro.Freya 0.3 | 4.5 | 11.3% | 25 |
| m3thos.Eva02 0.7.1 | 5.7 | 10.3% | 30 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.7% | 12 |
| dl.BetterWalls 1.0 | 8.3 | 6.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 6.3% | 1 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.0% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 81.0 | 16 / 35 | 3619 |
| 2 | 1 | 60.0 | 67.3 | 10 / 35 | 3378 |
| 3 | 1 | 62.2 | 73.3 | 15 / 35 | 3183 |
| 4 | 1 | 60.5 | 69.5 | 13 / 35 | 3035 |
| 5 | 1 | 62.6 | 76.8 | 14 / 35 | 3243 |
| 6 | 1 | 62.8 | 75.2 | 16 / 35 | 3302 |
| 7 | 2 | 62.3 | 75.2 | 8 / 35 | 3823 |
| 8 | 2 | 62.1 | 73.3 | 14 / 35 | 3336 |
| 9 | 1 | 63.1 | 74.3 | 15 / 35 | 3909 |
| 10 | 1 | 60.9 | 71.4 | 10 / 35 | 3454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| alpha.RainingFire 1.0 | 35 | 51% |
| bzdp.Pansy 2.1 | 35 | 60% |
| bvh.micro.Freya 0.3 | 35 | 94% |
| mz.Cork 0.1 | 28 | 86% |
| bvh.mini.Fenrir 0.39 | 20 | 90% |
| m3thos.Eva02 0.7.1 | 17 | 53% |
| dl.BetterWalls 1.0 | 4 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 25% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 220 of 350 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 55 | 25% | 68 |
| bzdp.Pansy 2.1 | 42 | 19% | 73 |
| mz.Cork 0.1 | 27 | 12% | 61 |
| bvh.mini.Fenrir 0.39 | 27 | 12% | 33 |
| bvh.micro.Freya 0.3 | 24 | 11% | 42 |
| m3thos.Eva02 0.7.1 | 24 | 11% | 36 |
| squidM.TentalceMeleeNano 1.1 | 10 | 5% | 15 |
| sample.MyFirstRobot 1.0 | 7 | 3% | 9 |
| dl.BetterWalls 1.0 | 4 | 2% | 13 |

## Melee bench: F37

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 79.3 | 145 / 350 | 2.86 | 16.0% | 44803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHL2 0.3 | 1.0 | 16.0% | 145 |
| germ.TheMind .2 | 2.4 | 11.5% | 44 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 11.0% | 30 |
| EBBU.Sim2 1.02 | 4.7 | 10.2% | 27 |
| agrach.Dalek 1.0 | 5.8 | 9.4% | 26 |
| stelo.UntouchableNano 1.3 | 6.2 | 9.1% | 27 |
| mb.Beast 0.1 | 7.3 | 8.6% | 16 |
| lmk.ACPFinal 0.1 | 7.4 | 8.5% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 7.6 | 8.3% | 3 |
| skm.Ryubot 1.0 | 9.3 | 7.5% | 15 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 83.8 | 16 / 35 | 4079 |
| 2 | 1 | 63.4 | 78.4 | 14 / 35 | 4738 |
| 3 | 1 | 58.4 | 67.0 | 7 / 35 | 4040 |
| 4 | 1 | 62.7 | 79.4 | 13 / 35 | 4059 |
| 5 | 1 | 64.4 | 80.0 | 17 / 35 | 5078 |
| 6 | 1 | 63.1 | 79.4 | 16 / 35 | 4175 |
| 7 | 1 | 64.1 | 78.7 | 15 / 35 | 4932 |
| 8 | 1 | 63.5 | 80.3 | 14 / 35 | 4509 |
| 9 | 1 | 63.9 | 84.1 | 15 / 35 | 4208 |
| 10 | 1 | 65.0 | 82.2 | 18 / 35 | 4985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 41 | 71% |
| EBBU.Sim2 1.02 | 38 | 55% |
| mb.Beast 0.1 | 27 | 78% |
| stelo.UntouchableNano 1.3 | 27 | 67% |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 68% |
| agrach.Dalek 1.0 | 22 | 82% |
| lmk.ACPFinal 0.1 | 18 | 67% |
| skm.Ryubot 1.0 | 15 | 60% |

Hadur died in 206 of 350 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 37 | 18% | 62 |
| com.syncleus.robocode.Dreadnaught 0.1 | 34 | 17% | 57 |
| EBBU.Sim2 1.02 | 30 | 15% | 44 |
| lmk.ACPFinal 0.1 | 26 | 13% | 38 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 9% | 21 |
| agrach.Dalek 1.0 | 18 | 9% | 44 |
| stelo.UntouchableNano 1.3 | 17 | 8% | 33 |
| mb.Beast 0.1 | 13 | 6% | 32 |
| skm.Ryubot 1.0 | 12 | 6% | 18 |

## Melee bench: F38

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 65.5 | 50 / 350 | 4.10 | 12.1% | 27179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.6% | 151 |
| bvh.mini.Freya 0.55 | 2.4 | 13.2% | 39 |
| hadur117.nano.SanaroHL2 0.3 | 3.8 | 12.1% | 50 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.5% | 48 |
| cs.Wren 1.0 | 4.7 | 11.2% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.4 | 10.9% | 24 |
| kdf.KoulDestroyer 1.0 | 6.4 | 9.8% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.4% | 7 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 52.4 | 55.2 | 2 / 35 | 2316 |
| 2 | 3 | 58.4 | 69.2 | 4 / 35 | 2783 |
| 3 | 3 | 58.5 | 67.3 | 6 / 35 | 2882 |
| 4 | 5 | 54.8 | 58.7 | 4 / 35 | 2743 |
| 5 | 2 | 60.1 | 72.7 | 8 / 35 | 2860 |
| 6 | 3 | 58.0 | 66.3 | 6 / 35 | 2948 |
| 7 | 3 | 56.6 | 62.5 | 4 / 35 | 2631 |
| 8 | 6 | 55.5 | 61.6 | 4 / 35 | 2660 |
| 9 | 4 | 56.3 | 65.1 | 4 / 35 | 2497 |
| 10 | 2 | 60.9 | 76.5 | 8 / 35 | 2859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 51 | 49% |
| bts.mega.Gnarly 1.4 | 20 | 35% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 7% |
| cs.Wren 1.0 | 12 | 58% |
| bvh.mini.Freya 0.55 | 8 | 63% |
| kdf.KoulDestroyer 1.0 | 5 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 302 of 350 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 69 | 23% | 97 |
| bvh.mini.Freya 0.55 | 52 | 17% | 54 |
| bts.mega.Gnarly 1.4 | 50 | 17% | 57 |
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 16% | 49 |
| cs.Wren 1.0 | 41 | 14% | 48 |
| kdf.KoulDestroyer 1.0 | 29 | 10% | 30 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 2% | 7 |
| bzdp.BoxCar 2.0 | 5 | 2% | 6 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 64.4 | 42 / 350 | 4.20 | 12.0% | 29418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.4 | 15.5% | 71 |
| az.Ololobot 0.2.4 | 1.7 | 14.4% | 144 |
| hadur117.nano.SanaroHL2 0.3 | 3.4 | 12.0% | 42 |
| catcat20.Lambda 0.024 | 3.7 | 11.6% | 48 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.8% | 31 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.5% | 8 |
| apollokidd.ApolloKidd 0.9 | 6.9 | 8.6% | 3 |
| gimp.GimpBot 0.1 | 7.2 | 8.2% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.2% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.9 | 69.2 | 4 / 35 | 3042 |
| 2 | 2 | 58.5 | 71.1 | 4 / 35 | 3013 |
| 3 | 4 | 53.8 | 58.4 | 4 / 35 | 2654 |
| 4 | 4 | 54.8 | 58.4 | 5 / 35 | 2940 |
| 5 | 4 | 55.4 | 63.2 | 2 / 35 | 2900 |
| 6 | 3 | 58.0 | 68.9 | 2 / 35 | 3166 |
| 7 | 4 | 56.0 | 61.0 | 6 / 35 | 3051 |
| 8 | 4 | 56.9 | 62.9 | 4 / 35 | 3165 |
| 9 | 3 | 55.9 | 62.9 | 7 / 35 | 2768 |
| 10 | 3 | 56.9 | 68.3 | 4 / 35 | 2719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 44 | 7% |
| catcat20.Lambda 0.024 | 29 | 55% |
| bvh.fry.Freya 0.82 | 28 | 36% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 64% |
| gimp.GimpBot 0.1 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 1 | 0% |

Hadur died in 308 of 350 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 110 | 36% | 122 |
| az.Ololobot 0.2.4 | 63 | 20% | 66 |
| catcat20.Lambda 0.024 | 38 | 12% | 49 |
| stelo.SoRobotNanoMelee 1.2 | 32 | 10% | 38 |
| apollokidd.ApolloKidd 0.9 | 26 | 8% | 28 |
| gimp.GimpBot 0.1 | 13 | 4% | 19 |
| winamp32.micro.MicroMacro 1.0 | 12 | 4% | 12 |
| whitesquare.robots.SkynetAdvanced 1.1 | 11 | 4% | 12 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 1% | 4 |

## Melee bench: F41

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 75.0 | 100 / 350 | 3.25 | 14.3% | 30894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.8% | 146 |
| hadur117.nano.SanaroHL2 0.3 | 2.3 | 14.3% | 100 |
| ary.Swarm 1.1 | 3.2 | 13.4% | 24 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.9% | 43 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.8% | 27 |
| shrub.Silver v048 | 6.3 | 8.8% | 6 |
| zyx.nano.Ant 1.1 | 6.7 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.0% | 2 |
| stelo.Mirror 1.1 | 8.8 | 5.6% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 73.0 | 8 / 35 | 3198 |
| 2 | 2 | 62.2 | 76.8 | 13 / 35 | 2844 |
| 3 | 2 | 63.1 | 77.1 | 13 / 35 | 2932 |
| 4 | 3 | 60.8 | 72.7 | 8 / 35 | 2654 |
| 5 | 3 | 61.3 | 71.4 | 10 / 35 | 3000 |
| 6 | 2 | 63.4 | 76.8 | 13 / 35 | 3320 |
| 7 | 2 | 62.5 | 74.0 | 10 / 35 | 3362 |
| 8 | 2 | 62.9 | 78.7 | 9 / 35 | 3258 |
| 9 | 3 | 61.1 | 72.4 | 7 / 35 | 3063 |
| 10 | 2 | 63.0 | 76.5 | 9 / 35 | 3263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 94 | 43% |
| ary.Swarm 1.1 | 28 | 75% |
| lessonz.robocode.Oz 0.5.0 | 25 | 64% |
| simonton.nano.MeleeSeed 1.8 | 19 | 68% |
| jsal.Jsalbot 1.0 | 7 | 71% |
| stelo.Mirror 1.1 | 3 | 100% |
| shrub.Silver v048 | 2 | 0% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 250 of 350 rounds, at a mean tick of 1078. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 100 | 40% | 140 |
| ary.Swarm 1.1 | 45 | 18% | 69 |
| simonton.nano.MeleeSeed 1.8 | 38 | 15% | 52 |
| lessonz.robocode.Oz 0.5.0 | 36 | 14% | 45 |
| shrub.Silver v048 | 12 | 5% | 14 |
| zyx.nano.Ant 1.1 | 11 | 4% | 13 |
| jsal.Jsalbot 1.0 | 4 | 2% | 8 |
| stelo.Mirror 1.1 | 2 | 1% | 7 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 70.7 | 69 / 350 | 3.64 | 13.5% | 33668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.6% | 178 |
| ara.Shera 0.88 | 2.9 | 14.3% | 63 |
| maribo.mini.MiniQuester 0.1 | 2.9 | 13.8% | 28 |
| hadur117.nano.SanaroHL2 0.3 | 3.2 | 13.5% | 69 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 5 |
| dsw.StaticD 1.0 | 6.4 | 7.6% | 7 |
| maribo.IotaCT 1.1 | 6.7 | 7.5% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.4 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 74.0 | 11 / 35 | 3585 |
| 2 | 3 | 60.2 | 70.5 | 8 / 35 | 3238 |
| 3 | 3 | 60.0 | 73.3 | 4 / 35 | 3304 |
| 4 | 4 | 61.2 | 71.1 | 8 / 35 | 3604 |
| 5 | 3 | 61.2 | 72.7 | 7 / 35 | 3536 |
| 6 | 4 | 58.2 | 65.7 | 5 / 35 | 3001 |
| 7 | 3 | 58.4 | 66.0 | 7 / 35 | 3065 |
| 8 | 3 | 60.8 | 71.4 | 6 / 35 | 3432 |
| 9 | 4 | 60.3 | 70.2 | 5 / 35 | 3435 |
| 10 | 3 | 60.8 | 72.1 | 8 / 35 | 3468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 73 | 30% |
| ara.Shera 0.88 | 34 | 65% |
| maribo.mini.MiniQuester 0.1 | 20 | 80% |
| amz.NanoClone 1.41 | 5 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| dsw.StaticD 1.0 | 2 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 98 | 35% | 121 |
| ara.Shera 0.88 | 70 | 25% | 89 |
| maribo.mini.MiniQuester 0.1 | 62 | 22% | 82 |
| amz.NanoClone 1.41 | 24 | 9% | 25 |
| maribo.IotaCT 1.1 | 13 | 5% | 15 |
| dsw.StaticD 1.0 | 6 | 2% | 8 |
| stelo.MirrorMicro 1.0 | 4 | 1% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 61.9 | 19 / 350 | 4.43 | 11.4% | 26849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 259 |
| brainfade.melee.Dusk 0.44 | 2.4 | 13.1% | 42 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.6% | 18 |
| wcsv.melee.EngineerMelee 0.1 | 4.0 | 11.5% | 9 |
| hadur117.nano.SanaroHL2 0.3 | 4.6 | 11.4% | 19 |
| Krabb.akim2.Akim2 1.1b | 6.1 | 9.7% | 3 |
| mz.NanoGod 2.02 | 7.1 | 8.0% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.9 | 59.7 | 3 / 35 | 2491 |
| 2 | 4 | 57.2 | 61.9 | 2 / 35 | 2700 |
| 3 | 4 | 58.6 | 65.4 | 2 / 35 | 2860 |
| 4 | 5 | 58.7 | 65.1 | 1 / 35 | 2637 |
| 5 | 4 | 58.4 | 64.4 | 1 / 35 | 2605 |
| 6 | 5 | 57.6 | 61.9 | 1 / 35 | 2546 |
| 7 | 5 | 56.8 | 59.0 | 2 / 35 | 2769 |
| 8 | 4 | 57.2 | 61.9 | 0 / 35 | 2620 |
| 9 | 5 | 58.1 | 59.0 | 5 / 35 | 3066 |
| 10 | 5 | 56.9 | 60.6 | 2 / 35 | 2555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 68 | 12% |
| dummy.micro.Sparrow 2.5 | 11 | 45% |
| brainfade.melee.Dusk 0.44 | 11 | 27% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 50% |
| mz.NanoGod 2.02 | 1 | 0% |

Hadur died in 332 of 350 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 135 | 41% | 143 |
| dummy.micro.Sparrow 2.5 | 50 | 15% | 56 |
| brainfade.melee.Dusk 0.44 | 46 | 14% | 48 |
| wcsv.melee.EngineerMelee 0.1 | 45 | 14% | 48 |
| Krabb.akim2.Akim2 1.1b | 21 | 6% | 21 |
| mz.NanoGod 2.02 | 19 | 6% | 19 |
| jab.DiamondStealer 5 | 13 | 4% | 13 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 72.4 | 85 / 350 | 3.48 | 14.2% | 34003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.7 | 16.4% | 121 |
| tzu.TheArtOfWar 1.2 | 1.8 | 15.9% | 100 |
| hadur117.nano.SanaroHL2 0.3 | 2.5 | 14.2% | 85 |
| jwirde.Gort 2.0 | 4.4 | 10.4% | 24 |
| wompi.Quokka 1.6 | 4.7 | 10.3% | 10 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 8.9% | 3 |
| stf.PanzerGeneral 0.1 | 7.3 | 7.5% | 2 |
| disan.Chair 2.2.0 | 7.6 | 7.2% | 3 |
| sample.Crazy 1.0 | 9.4 | 4.8% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 78.4 | 8 / 35 | 3843 |
| 2 | 3 | 60.3 | 67.9 | 8 / 35 | 3564 |
| 3 | 2 | 64.8 | 82.2 | 14 / 35 | 3688 |
| 4 | 3 | 59.7 | 67.9 | 8 / 35 | 3155 |
| 5 | 3 | 59.4 | 66.0 | 7 / 35 | 3231 |
| 6 | 2 | 63.1 | 78.4 | 8 / 35 | 3669 |
| 7 | 3 | 59.8 | 70.5 | 10 / 35 | 2849 |
| 8 | 1 | 64.6 | 79.7 | 13 / 35 | 3812 |
| 9 | 3 | 60.3 | 70.5 | 6 / 35 | 3140 |
| 10 | 3 | 58.0 | 62.9 | 3 / 35 | 3052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 76 | 58% |
| tzu.TheArtOfWar 1.2 | 49 | 31% |
| jwirde.Gort 2.0 | 19 | 74% |
| wompi.Quokka 1.6 | 10 | 70% |
| disan.Chair 2.2.0 | 3 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 67% |

Hadur died in 265 of 350 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 100 | 38% | 113 |
| stelo.Liblix 0.3.1 | 84 | 32% | 134 |
| wompi.Quokka 1.6 | 22 | 8% | 26 |
| jwirde.Gort 2.0 | 20 | 8% | 36 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 15 | 6% | 15 |
| stf.PanzerGeneral 0.1 | 7 | 3% | 8 |
| amk.jointstrike.JointStrike 0.2 | 6 | 2% | 8 |
| sample.Crazy 1.0 | 6 | 2% | 5 |
| disan.Chair 2.2.0 | 5 | 2% | 5 |

## Melee bench: F45

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 75.7 | 91 / 350 | 3.19 | 15.3% | 37097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHL2 0.3 | 1.1 | 15.3% | 91 |
| eem.IWillFireNoBullet v2.8 | 2.6 | 13.2% | 172 |
| jje.BagPuss 1.2 | 3.1 | 12.4% | 19 |
| sul.Lunar 1.1 | 4.3 | 11.0% | 32 |
| myl.nano.Graviton 1.10 | 4.6 | 10.5% | 10 |
| hvilela.HVilela 0.9 | 6.3 | 9.3% | 5 |
| pez.mini.ChironexFleckeri 0.5 | 7.1 | 8.4% | 7 |
| fm.claire 1.7 | 7.1 | 8.7% | 2 |
| wit.Deep7 2.0 | 8.8 | 6.4% | 12 |
| abud.ThirdRobo 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 77.1 | 11 / 35 | 4340 |
| 2 | 1 | 62.8 | 76.5 | 11 / 35 | 3509 |
| 3 | 1 | 62.7 | 78.7 | 8 / 35 | 3422 |
| 4 | 1 | 61.0 | 69.5 | 8 / 35 | 3789 |
| 5 | 1 | 64.5 | 82.9 | 12 / 35 | 3777 |
| 6 | 1 | 61.6 | 73.0 | 10 / 35 | 3568 |
| 7 | 1 | 62.2 | 74.9 | 7 / 35 | 3815 |
| 8 | 1 | 63.4 | 79.0 | 9 / 35 | 3673 |
| 9 | 1 | 62.5 | 74.6 | 9 / 35 | 3625 |
| 10 | 2 | 60.9 | 70.5 | 6 / 35 | 3579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 108 | 47% |
| jje.BagPuss 1.2 | 19 | 53% |
| pez.mini.ChironexFleckeri 0.5 | 15 | 80% |
| sul.Lunar 1.1 | 15 | 20% |
| myl.nano.Graviton 1.10 | 13 | 62% |
| wit.Deep7 2.0 | 7 | 57% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 0% |

Hadur died in 260 of 350 rounds, at a mean tick of 1351. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 68 | 26% | 0 |
| jje.BagPuss 1.2 | 46 | 18% | 97 |
| sul.Lunar 1.1 | 45 | 17% | 71 |
| myl.nano.Graviton 1.10 | 33 | 13% | 62 |
| fm.claire 1.7 | 19 | 7% | 29 |
| hvilela.HVilela 0.9 | 17 | 7% | 26 |
| wit.Deep7 2.0 | 15 | 6% | 23 |
| pez.mini.ChironexFleckeri 0.5 | 14 | 5% | 34 |
| abud.ThirdRobo 1.0 | 2 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.nano.SanaroHL2 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 72.8 | 44 / 350 | 3.45 | 13.2% | 28614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.1 | 18.2% | 154 |
| rsalesc.melee.Medina 0.4.5 | 1.9 | 16.7% | 122 |
| hadur117.nano.SanaroHL2 0.3 | 3.0 | 13.2% | 44 |
| mz.MicroSheep 1.0 | 4.4 | 10.8% | 11 |
| cx.Princess 1.0 | 5.3 | 9.8% | 16 |
| sadoner.killer 0.2 | 5.5 | 9.4% | 2 |
| arthord.NanoSatanMelee Beta | 6.9 | 7.6% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.9 | 6.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 75.2 | 3 / 35 | 3088 |
| 2 | 3 | 59.3 | 69.8 | 5 / 35 | 2649 |
| 3 | 3 | 59.1 | 70.5 | 4 / 35 | 2906 |
| 4 | 3 | 56.7 | 65.4 | 3 / 35 | 2407 |
| 5 | 3 | 62.5 | 77.8 | 8 / 35 | 3042 |
| 6 | 3 | 62.2 | 79.7 | 6 / 35 | 2966 |
| 7 | 3 | 60.8 | 73.7 | 4 / 35 | 3294 |
| 8 | 3 | 59.7 | 72.4 | 4 / 35 | 2790 |
| 9 | 3 | 58.9 | 69.8 | 4 / 35 | 2706 |
| 10 | 3 | 60.1 | 73.3 | 3 / 35 | 2766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 85 | 32% |
| rsalesc.melee.Medina 0.4.5 | 38 | 24% |
| cx.Princess 1.0 | 14 | 36% |
| mz.MicroSheep 1.0 | 8 | 25% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 141 | 46% | 168 |
| rsalesc.melee.Medina 0.4.5 | 78 | 25% | 87 |
| mz.MicroSheep 1.0 | 26 | 8% | 28 |
| cx.Princess 1.0 | 24 | 8% | 28 |
| sadoner.killer 0.2 | 18 | 6% | 19 |
| arthord.NanoSatanMelee Beta | 12 | 4% | 13 |
| jeremyreeder.collective.Prophet 5 | 4 | 1% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |

