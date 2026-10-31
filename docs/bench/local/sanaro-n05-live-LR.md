# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.1 | 44 / 350 | 3.15 | 14.1% | 37189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 21.1% | 261 |
| hadur117.nano.SanaroLR 0.2 | 2.0 | 14.1% | 44 |
| sgp.JollyNinja 3.53 | 3.7 | 11.7% | 23 |
| mz.MicroGodMelee 1 | 4.2 | 11.4% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.6 | 11.1% | 5 |
| lorneswork.Predator 1.0 | 5.5 | 10.3% | 5 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 78.4 | 8 / 35 | 3772 |
| 2 | 2 | 61.1 | 70.8 | 3 / 35 | 3833 |
| 3 | 2 | 61.8 | 75.9 | 5 / 35 | 3677 |
| 4 | 2 | 62.0 | 75.9 | 3 / 35 | 3753 |
| 5 | 2 | 60.9 | 73.3 | 1 / 35 | 3697 |
| 6 | 2 | 62.4 | 76.5 | 1 / 35 | 3846 |
| 7 | 2 | 62.0 | 75.2 | 5 / 35 | 3670 |
| 8 | 2 | 61.4 | 73.3 | 4 / 35 | 3618 |
| 9 | 2 | 64.2 | 83.2 | 7 / 35 | 3678 |
| 10 | 2 | 63.2 | 78.7 | 7 / 35 | 3645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 160 | 4% |
| mz.MicroGodMelee 1 | 20 | 75% |
| sgp.JollyNinja 3.53 | 13 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 2 | 50% |

Hadur died in 306 of 350 rounds, at a mean tick of 1047. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 188 | 61% | 195 |
| lorneswork.Predator 1.0 | 30 | 10% | 36 |
| sgp.JollyNinja 3.53 | 29 | 9% | 37 |
| mz.MicroGodMelee 1 | 22 | 7% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 7% | 26 |
| adt.Ar2 1.0 | 8 | 3% | 9 |
| skm.butterfly 1.0 | 6 | 2% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 62.8 | 47 / 350 | 4.35 | 12.9% | 38356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.5 | 15.1% | 94 |
| pulsar.PulsarMax 0.8.9 | 1.9 | 14.2% | 101 |
| hadur117.nano.SanaroLR 0.2 | 3.1 | 12.9% | 47 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 11.9% | 7 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.1% | 30 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.2% | 7 |
| sch.Simone 0.3d | 7.1 | 8.3% | 20 |
| Noran.BitchingElk 0.054 | 7.5 | 7.9% | 29 |
| stelo.PatternRobot 1.0 | 8.1 | 6.8% | 12 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 66.3 | 6 / 35 | 4027 |
| 2 | 2 | 58.4 | 63.5 | 3 / 35 | 4126 |
| 3 | 3 | 59.4 | 66.0 | 5 / 35 | 3692 |
| 4 | 4 | 57.9 | 60.0 | 6 / 35 | 3838 |
| 5 | 3 | 58.9 | 63.5 | 3 / 35 | 4020 |
| 6 | 4 | 58.3 | 61.9 | 3 / 35 | 3864 |
| 7 | 3 | 60.5 | 67.6 | 5 / 35 | 3953 |
| 8 | 3 | 57.5 | 61.6 | 4 / 35 | 3732 |
| 9 | 2 | 55.5 | 58.1 | 7 / 35 | 3311 |
| 10 | 4 | 57.2 | 59.0 | 5 / 35 | 3793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 56 | 30% |
| pulsar.PulsarMax 0.8.9 | 39 | 23% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| sch.Simone 0.3d | 7 | 29% |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 43% |
| stelo.PatternRobot 1.0 | 7 | 29% |
| Noran.BitchingElk 0.054 | 5 | 40% |
| fnc.bandit.Bandit 5.2.0 | 4 | 50% |
| fullsail.SweetTea 1.1 | 2 | 0% |

Hadur died in 303 of 350 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 82 | 27% | 102 |
| pulsar.PulsarMax 0.8.9 | 76 | 25% | 87 |
| lrem.micro.SpikeSoldier 0.4 | 41 | 14% | 45 |
| stelo.PatternRobot 1.0 | 30 | 10% | 31 |
| com.cohesiva.robocode.ManOwaR 1.0 | 24 | 8% | 29 |
| sch.Simone 0.3d | 20 | 7% | 22 |
| fnc.bandit.Bandit 5.2.0 | 15 | 5% | 16 |
| Noran.BitchingElk 0.054 | 10 | 3% | 13 |
| fullsail.SweetTea 1.1 | 5 | 2% | 5 |

## Melee bench: F03

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 79.0 | 83 / 350 | 2.89 | 15.2% | 42826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLR 0.2 | 1.8 | 15.2% | 83 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.8% | 86 |
| radnor.DoctorBob 1.42 | 2.3 | 15.1% | 89 |
| vuen.Cake 2.51 | 3.7 | 13.2% | 79 |
| urdos.URDOS 1.3 | 5.2 | 10.0% | 7 |
| adt.Ar1 2.1 | 6.7 | 7.5% | 4 |
| oa.weak.FlyMk1 0.1 | 7.1 | 7.1% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.6% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.4 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 82.5 | 8 / 35 | 4596 |
| 2 | 1 | 64.2 | 81.3 | 9 / 35 | 4674 |
| 3 | 1 | 63.6 | 83.5 | 9 / 35 | 3939 |
| 4 | 4 | 61.1 | 72.4 | 5 / 35 | 4009 |
| 5 | 2 | 63.6 | 80.3 | 8 / 35 | 4532 |
| 6 | 2 | 62.8 | 78.7 | 6 / 35 | 3971 |
| 7 | 1 | 65.2 | 83.5 | 10 / 35 | 4766 |
| 8 | 3 | 61.3 | 71.4 | 7 / 35 | 4151 |
| 9 | 1 | 63.1 | 78.7 | 10 / 35 | 4332 |
| 10 | 2 | 63.0 | 78.1 | 11 / 35 | 3856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 69 | 46% |
| radnor.DoctorBob 1.42 | 62 | 50% |
| kawigi.nano.Lib 1.0 | 47 | 13% |
| urdos.URDOS 1.3 | 8 | 75% |
| oa.weak.FlyMk1 0.1 | 3 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 270 of 350 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 75 | 28% | 103 |
| kawigi.nano.Lib 1.0 | 75 | 28% | 80 |
| vuen.Cake 2.51 | 59 | 22% | 96 |
| urdos.URDOS 1.3 | 37 | 14% | 41 |
| ghent.ArthurPanzergon 1.0.0 | 7 | 3% | 8 |
| oa.weak.FlyMk1 0.1 | 5 | 2% | 7 |
| adt.Ar1 2.1 | 5 | 2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 73.8 | 7 / 350 | 3.36 | 14.3% | 44816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.2% | 318 |
| hadur117.nano.SanaroLR 0.2 | 2.2 | 14.3% | 7 |
| apc.LeeroyJenkins2 1.0 | 2.8 | 13.5% | 15 |
| TNT.TNT 0.99.1 | 4.1 | 10.6% | 7 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 2 |
| css.Delitioner 0.11 | 6.1 | 7.8% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 8.7 | 4.7% | 0 |
| spin.Bugstard 0.012b | 9.9 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 76.2 | 0 / 35 | 4501 |
| 2 | 3 | 63.7 | 74.6 | 2 / 35 | 4329 |
| 3 | 2 | 64.8 | 80.0 | 0 / 35 | 4403 |
| 4 | 3 | 60.8 | 67.0 | 0 / 35 | 4199 |
| 5 | 2 | 64.3 | 75.9 | 0 / 35 | 5008 |
| 6 | 2 | 63.7 | 75.9 | 1 / 35 | 4521 |
| 7 | 2 | 62.5 | 72.1 | 2 / 35 | 4550 |
| 8 | 2 | 61.4 | 69.5 | 0 / 35 | 4376 |
| 9 | 2 | 61.9 | 70.8 | 0 / 35 | 4169 |
| 10 | 2 | 64.1 | 76.2 | 2 / 35 | 4760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 164 | 2% |
| apc.LeeroyJenkins2 1.0 | 6 | 33% |
| TNT.TNT 0.99.1 | 2 | 50% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 343 of 350 rounds, at a mean tick of 1086. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 235 | 69% | 238 |
| apc.LeeroyJenkins2 1.0 | 55 | 16% | 57 |
| josago.Jorgito 0.16 | 24 | 7% | 24 |
| TNT.TNT 0.99.1 | 12 | 3% | 13 |
| css.Delitioner 0.11 | 10 | 3% | 11 |
| tj.zombie1n 1.0.1 | 4 | 1% | 4 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 67.9 | 77 / 350 | 3.89 | 13.3% | 33516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.4 | 15.3% | 90 |
| origin.SleepSiphon 1.7b | 2.2 | 14.3% | 97 |
| hadur117.nano.SanaroLR 0.2 | 3.0 | 13.3% | 77 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.2% | 47 |
| mld.Wisdom 1.0 | 4.6 | 11.3% | 11 |
| gg.Wolverine 2.0 | 6.4 | 8.5% | 9 |
| spinnercat.Omen 1.0 | 7.5 | 7.9% | 2 |
| DBall.NUKE 0.1 | 7.8 | 7.4% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 7.0% | 8 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 65.7 | 7 / 35 | 3730 |
| 2 | 3 | 60.8 | 71.7 | 8 / 35 | 3264 |
| 3 | 3 | 60.6 | 71.1 | 6 / 35 | 3297 |
| 4 | 3 | 61.5 | 73.7 | 9 / 35 | 3420 |
| 5 | 3 | 59.0 | 66.0 | 6 / 35 | 3380 |
| 6 | 4 | 57.8 | 63.5 | 5 / 35 | 3346 |
| 7 | 3 | 58.8 | 64.1 | 7 / 35 | 3409 |
| 8 | 2 | 61.2 | 71.1 | 9 / 35 | 3419 |
| 9 | 4 | 57.2 | 61.9 | 8 / 35 | 2954 |
| 10 | 2 | 60.8 | 70.2 | 12 / 35 | 3297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 49 | 55% |
| origin.SleepSiphon 1.7b | 44 | 41% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 52% |
| mld.Wisdom 1.0 | 9 | 89% |
| gg.Wolverine 2.0 | 7 | 43% |
| DBall.NUKE 0.1 | 5 | 60% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 275 of 350 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 88 | 32% | 107 |
| origin.SleepSiphon 1.7b | 64 | 23% | 87 |
| pe.minimelee.SandboxMiniMelee 1.1 | 46 | 17% | 59 |
| mld.Wisdom 1.0 | 39 | 14% | 46 |
| gg.Wolverine 2.0 | 13 | 5% | 17 |
| DBall.NUKE 0.1 | 9 | 3% | 14 |
| spinnercat.Omen 1.0 | 9 | 3% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.1 | 88 / 350 | 2.61 | 16.5% | 48139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.5 | 17.9% | 110 |
| rsalesc.melee.Monk 0.3.6c | 1.7 | 17.8% | 98 |
| hadur117.nano.SanaroLR 0.2 | 2.8 | 16.5% | 88 |
| franzor.Lizt 1.3.1 | 4.5 | 11.1% | 32 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.5% | 24 |
| lrem.micro.MoggFanatic 0.2 | 6.1 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.9 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.3 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.8 | 77.8 | 7 / 35 | 4890 |
| 2 | 3 | 67.3 | 82.9 | 11 / 35 | 4607 |
| 3 | 3 | 67.9 | 85.4 | 10 / 35 | 4857 |
| 4 | 3 | 66.1 | 81.0 | 7 / 35 | 4557 |
| 5 | 2 | 68.3 | 85.1 | 10 / 35 | 5263 |
| 6 | 2 | 69.1 | 86.3 | 14 / 35 | 5138 |
| 7 | 3 | 65.7 | 78.4 | 4 / 35 | 4680 |
| 8 | 3 | 66.6 | 80.0 | 6 / 35 | 4997 |
| 9 | 3 | 66.5 | 81.3 | 10 / 35 | 4661 |
| 10 | 3 | 66.9 | 83.2 | 9 / 35 | 4489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 106 | 51% |
| rsalesc.melee.Monk 0.3.6c | 48 | 6% |
| oog.melee.CapuletDroid 1.1 | 40 | 68% |
| franzor.Lizt 1.3.1 | 14 | 29% |

Hadur died in 262 of 350 rounds, at a mean tick of 1284. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 124 | 47% | 183 |
| rsalesc.melee.Monk 0.3.6c | 90 | 34% | 100 |
| oog.melee.CapuletDroid 1.1 | 23 | 9% | 51 |
| franzor.Lizt 1.3.1 | 13 | 5% | 2 |
| exauge.GateKeeper 1.1.121g | 9 | 3% | 9 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 70.4 | 85 / 350 | 3.67 | 13.9% | 34348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLR 0.2 | 1.9 | 13.9% | 85 |
| tm.Yuugao 1.0 | 2.1 | 14.1% | 91 |
| shrub.Vapour v159 | 2.4 | 13.5% | 89 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 11.5% | 34 |
| com.spp.robocode.MostlyHarmless 010 | 5.4 | 9.6% | 24 |
| m3thos.Eva00 1.1 | 5.8 | 9.2% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 7.1 | 8.1% | 12 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 6.8% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.9 | 6.8% | 1 |
| SHAM.WOW 1.4 | 9.0 | 6.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.8 | 62.9 | 9 / 35 | 2872 |
| 2 | 3 | 59.4 | 70.2 | 5 / 35 | 3440 |
| 3 | 3 | 60.4 | 68.9 | 9 / 35 | 3542 |
| 4 | 1 | 63.3 | 82.5 | 10 / 35 | 3298 |
| 5 | 2 | 58.9 | 67.0 | 3 / 35 | 3740 |
| 6 | 2 | 59.6 | 68.6 | 9 / 35 | 3551 |
| 7 | 1 | 60.7 | 70.8 | 12 / 35 | 3387 |
| 8 | 1 | 60.2 | 70.8 | 10 / 35 | 3288 |
| 9 | 1 | 60.2 | 70.8 | 8 / 35 | 3675 |
| 10 | 2 | 60.5 | 71.4 | 10 / 35 | 3555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 51% |
| shrub.Vapour v159 | 35 | 34% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 64% |
| Krabb.sliNk.Garm 0.9u | 14 | 86% |
| m3thos.Eva00 1.1 | 11 | 45% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 78% |
| SHAM.WOW 1.4 | 7 | 57% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 267 of 350 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 78 | 29% | 87 |
| tm.Yuugao 1.0 | 58 | 22% | 90 |
| Krabb.sliNk.Garm 0.9u | 31 | 12% | 40 |
| m3thos.Eva00 1.1 | 27 | 10% | 34 |
| com.spp.robocode.MostlyHarmless 010 | 22 | 8% | 31 |
| zyx.nano.BacillusComma 1.0 | 18 | 7% | 18 |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 5% | 22 |
| qualidafial.MajorDick 1.0.1 | 10 | 4% | 10 |
| SHAM.WOW 1.4 | 9 | 3% | 16 |

## Melee bench: F09

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 64.2 | 40 / 350 | 4.23 | 12.3% | 29814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.0% | 189 |
| kc.micro.Figment 1.0 | 2.1 | 15.0% | 68 |
| hadur117.nano.SanaroLR 0.2 | 3.3 | 12.3% | 40 |
| yagami.Tidus 0.11 | 4.4 | 11.2% | 7 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.7% | 31 |
| mc2.enemy.Original 0.9 | 5.8 | 9.4% | 13 |
| dft.Calliope 5.6 | 6.9 | 7.7% | 2 |
| step.nanoPri 1.0 | 8.3 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.5 | 62.5 | 2 / 35 | 3182 |
| 2 | 3 | 58.5 | 64.4 | 6 / 35 | 3013 |
| 3 | 5 | 56.8 | 59.7 | 8 / 35 | 2664 |
| 4 | 3 | 58.4 | 64.4 | 1 / 35 | 3326 |
| 5 | 3 | 59.7 | 68.6 | 5 / 35 | 2859 |
| 6 | 3 | 57.4 | 65.1 | 1 / 35 | 2926 |
| 7 | 2 | 58.1 | 66.7 | 3 / 35 | 3123 |
| 8 | 4 | 56.1 | 60.0 | 4 / 35 | 2744 |
| 9 | 3 | 60.1 | 68.3 | 7 / 35 | 3323 |
| 10 | 4 | 56.9 | 61.9 | 3 / 35 | 2654 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 71 | 25% |
| kc.micro.Figment 1.0 | 29 | 24% |
| pedersen.Grishnakh 1.0 | 11 | 27% |
| yagami.Tidus 0.11 | 8 | 88% |
| mc2.enemy.Original 0.9 | 7 | 57% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 310 of 350 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 113 | 36% | 132 |
| kc.micro.Figment 1.0 | 76 | 25% | 83 |
| yagami.Tidus 0.11 | 35 | 11% | 42 |
| pedersen.Grishnakh 1.0 | 33 | 11% | 35 |
| mc2.enemy.Original 0.9 | 23 | 7% | 27 |
| dft.Calliope 5.6 | 13 | 4% | 13 |
| step.nanoPri 1.0 | 9 | 3% | 10 |
| robar.nano.Assertive_Melee 0.2 | 4 | 1% | 4 |
| rdm.Dueler 0.4x | 4 | 1% | 4 |

## Melee bench: F10

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 77.7 | 87 / 350 | 3.00 | 15.2% | 41874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLR 0.2 | 1.4 | 15.2% | 87 |
| DTF.Kludgy 1.2b | 1.8 | 14.8% | 99 |
| ne.Chimera 1.2 | 3.3 | 13.3% | 45 |
| ejb.Polaris 1.0.1 | 3.5 | 13.0% | 51 |
| tvv.micro.Antares 1.1.1 | 5.3 | 11.0% | 35 |
| vStar.RAFzilla 2.15 | 5.7 | 10.5% | 21 |
| sam.Samspin 1.0 | 7.8 | 6.3% | 3 |
| kurios.DOSexe .9b | 8.0 | 5.8% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.9% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 79.4 | 10 / 35 | 4391 |
| 2 | 1 | 63.9 | 79.7 | 9 / 35 | 4292 |
| 3 | 1 | 64.6 | 81.3 | 10 / 35 | 4506 |
| 4 | 2 | 62.8 | 76.5 | 10 / 35 | 4092 |
| 5 | 1 | 64.8 | 82.2 | 9 / 35 | 4279 |
| 6 | 2 | 61.3 | 72.1 | 7 / 35 | 4034 |
| 7 | 1 | 64.2 | 79.0 | 11 / 35 | 4517 |
| 8 | 2 | 61.4 | 75.9 | 6 / 35 | 3623 |
| 9 | 1 | 62.9 | 76.5 | 10 / 35 | 4127 |
| 10 | 2 | 61.7 | 74.9 | 5 / 35 | 4013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 71 | 24% |
| ejb.Polaris 1.0.1 | 45 | 73% |
| ne.Chimera 1.2 | 26 | 31% |
| tvv.micro.Antares 1.1.1 | 23 | 35% |
| vStar.RAFzilla 2.15 | 21 | 71% |
| kurios.DOSexe .9b | 6 | 67% |
| donjezza.Muncho 1.0 | 5 | 20% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 87 | 33% | 100 |
| ne.Chimera 1.2 | 69 | 26% | 78 |
| ejb.Polaris 1.0.1 | 36 | 14% | 76 |
| tvv.micro.Antares 1.1.1 | 26 | 10% | 28 |
| vStar.RAFzilla 2.15 | 16 | 6% | 29 |
| sam.Samspin 1.0 | 8 | 3% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 3% | 9 |
| kurios.DOSexe .9b | 7 | 3% | 14 |
| donjezza.Muncho 1.0 | 6 | 2% | 7 |

## Melee bench: F11

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 64.0 | 46 / 350 | 4.24 | 12.5% | 31513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.2% | 146 |
| cx.mini.Nimrod 0.55 | 2.2 | 13.7% | 58 |
| hadur117.nano.SanaroLR 0.2 | 3.0 | 12.5% | 46 |
| djc.DynaBot 0.1.1 | 3.9 | 11.6% | 30 |
| uji.YellohFellah 1.0 | 5.3 | 9.4% | 30 |
| br2.MobyDickBot 1.6 | 6.0 | 9.0% | 18 |
| rdt199.Warlord 0.73 | 6.9 | 8.1% | 22 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.1 | 5.9% | 0 |
| stelo.MirrorNano 1.3 | 9.9 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.5 | 66.3 | 3 / 35 | 3170 |
| 2 | 2 | 59.2 | 68.6 | 6 / 35 | 3300 |
| 3 | 3 | 58.4 | 64.8 | 4 / 35 | 3284 |
| 4 | 3 | 57.3 | 62.9 | 4 / 35 | 3110 |
| 5 | 3 | 58.9 | 65.4 | 6 / 35 | 3457 |
| 6 | 3 | 57.7 | 65.1 | 7 / 35 | 2827 |
| 7 | 3 | 57.9 | 64.8 | 6 / 35 | 3053 |
| 8 | 4 | 56.1 | 59.7 | 5 / 35 | 2963 |
| 9 | 4 | 55.0 | 59.7 | 2 / 35 | 3043 |
| 10 | 3 | 57.2 | 62.5 | 3 / 35 | 3306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 53 | 42% |
| cx.mini.Nimrod 0.55 | 21 | 33% |
| uji.YellohFellah 1.0 | 15 | 7% |
| djc.DynaBot 0.1.1 | 11 | 73% |
| br2.MobyDickBot 1.6 | 5 | 60% |
| rdt199.Warlord 0.73 | 4 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 304 of 350 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 111 | 37% | 132 |
| cx.mini.Nimrod 0.55 | 69 | 23% | 73 |
| uji.YellohFellah 1.0 | 26 | 9% | 30 |
| rdt199.Warlord 0.73 | 24 | 8% | 29 |
| djc.DynaBot 0.1.1 | 23 | 8% | 31 |
| stelo.MirrorNano 1.3 | 15 | 5% | 15 |
| br2.MobyDickBot 1.6 | 13 | 4% | 17 |
| KiraNL.Chupacabra 0.4 | 13 | 4% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 3% | 10 |

## Melee bench: F12

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 67.6 | 59 / 350 | 3.91 | 12.9% | 28878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 2.0 | 14.1% | 76 |
| nat.PallasHawk 1.0 | 2.1 | 14.5% | 115 |
| darkcanuck.Leon 1.01 | 2.4 | 13.5% | 65 |
| hadur117.nano.SanaroLR 0.2 | 3.6 | 12.9% | 59 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.6% | 18 |
| jrm.Test0 1.0 | 6.4 | 8.1% | 3 |
| jp.Perpy 16.0 | 7.2 | 7.6% | 4 |
| cs.sheldor.Talon 1.1 | 7.6 | 7.5% | 4 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.7% | 7 |
| stuff.Vlad 0.1 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 75.2 | 9 / 35 | 3177 |
| 2 | 4 | 57.9 | 65.7 | 7 / 35 | 2844 |
| 3 | 3 | 58.1 | 65.1 | 6 / 35 | 3269 |
| 4 | 5 | 55.9 | 60.3 | 3 / 35 | 2679 |
| 5 | 3 | 57.4 | 67.3 | 5 / 35 | 2671 |
| 6 | 4 | 57.6 | 63.5 | 8 / 35 | 2817 |
| 7 | 4 | 59.4 | 69.8 | 6 / 35 | 2861 |
| 8 | 4 | 58.4 | 68.6 | 4 / 35 | 2907 |
| 9 | 3 | 59.4 | 70.2 | 5 / 35 | 2854 |
| 10 | 4 | 58.7 | 70.5 | 6 / 35 | 2799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 51 | 12% |
| darkcanuck.Leon 1.01 | 41 | 34% |
| bts.wiki.RipCurl 0.9b | 37 | 46% |
| brainfade.melee.Genghis 0.36 | 12 | 83% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 67% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 291 of 350 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 83 | 29% | 88 |
| bts.wiki.RipCurl 0.9b | 68 | 23% | 87 |
| darkcanuck.Leon 1.01 | 47 | 16% | 63 |
| brainfade.melee.Genghis 0.36 | 30 | 10% | 35 |
| jrm.Test0 1.0 | 22 | 8% | 23 |
| jp.Perpy 16.0 | 16 | 5% | 19 |
| cs.sheldor.Talon 1.1 | 13 | 4% | 17 |
| jaybot.bots.Oddball 4.0 | 8 | 3% | 11 |
| stuff.Vlad 0.1 | 4 | 1% | 7 |

## Melee bench: F13

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 72.0 | 43 / 350 | 3.52 | 13.1% | 31931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.8% | 166 |
| ags.Glacier 0.2.11 | 1.6 | 17.0% | 90 |
| hadur117.nano.SanaroLR 0.2 | 3.4 | 13.1% | 43 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.0% | 19 |
| shinh.Entangled 0.3 | 4.4 | 12.0% | 31 |
| apc.Colossus2 0.17 | 6.1 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.9 | 6.9% | 2 |
| ayk.WallHugger 1.0 | 8.1 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.4% | 0 |
| sample.Tracker 1.0 | 9.9 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.9 | 60.6 | 4 / 35 | 2884 |
| 2 | 3 | 62.7 | 79.7 | 8 / 35 | 3109 |
| 3 | 4 | 58.9 | 69.8 | 1 / 35 | 3087 |
| 4 | 3 | 59.1 | 69.5 | 5 / 35 | 2866 |
| 5 | 3 | 60.0 | 69.8 | 4 / 35 | 3134 |
| 6 | 3 | 61.1 | 72.7 | 7 / 35 | 3319 |
| 7 | 3 | 61.2 | 73.0 | 2 / 35 | 3446 |
| 8 | 3 | 62.5 | 78.7 | 5 / 35 | 3459 |
| 9 | 3 | 61.4 | 76.2 | 3 / 35 | 3463 |
| 10 | 4 | 59.9 | 70.2 | 4 / 35 | 3164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 84 | 37% |
| ags.Glacier 0.2.11 | 44 | 9% |
| shinh.Entangled 0.3 | 24 | 17% |
| gh.micro.Gruweltje 0.7 | 8 | 38% |
| stelo.Wang 1.0 | 2 | 50% |

Hadur died in 307 of 350 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 103 | 34% | 133 |
| ags.Glacier 0.2.11 | 100 | 33% | 104 |
| shinh.Entangled 0.3 | 41 | 13% | 45 |
| gh.micro.Gruweltje 0.7 | 31 | 10% | 35 |
| stelo.Wang 1.0 | 16 | 5% | 16 |
| maribo.FollowFire 1 | 7 | 2% | 6 |
| apc.Colossus2 0.17 | 5 | 2% | 7 |
| ayk.WallHugger 1.0 | 4 | 1% | 4 |

## Melee bench: F14

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 75.5 | 79 / 350 | 3.20 | 14.2% | 33549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.8% | 138 |
| hadur117.nano.SanaroLR 0.2 | 2.2 | 14.2% | 79 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.5% | 68 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.6 | 10.5% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 4.9 | 10.2% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.9% | 10 |
| sanyi.mikrobi.Roberto 1.0 | 6.5 | 9.6% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 8.1% | 18 |
| pa.Improved 1.0 | 9.0 | 5.4% | 3 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 78.7 | 9 / 35 | 3400 |
| 2 | 2 | 60.9 | 74.6 | 7 / 35 | 3057 |
| 3 | 2 | 60.8 | 72.4 | 6 / 35 | 3271 |
| 4 | 3 | 60.6 | 71.7 | 9 / 35 | 3206 |
| 5 | 3 | 59.9 | 70.2 | 4 / 35 | 3336 |
| 6 | 2 | 64.7 | 83.2 | 10 / 35 | 3791 |
| 7 | 2 | 63.6 | 79.4 | 11 / 35 | 3559 |
| 8 | 2 | 61.2 | 75.2 | 7 / 35 | 3286 |
| 9 | 2 | 59.6 | 70.8 | 6 / 35 | 3177 |
| 10 | 2 | 63.6 | 79.0 | 10 / 35 | 3466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 98 | 44% |
| catcat20.shape.Theta 0.018 | 38 | 32% |
| co.edu.usb.rc.LidisTron 1.0 | 17 | 65% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 60% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 25% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 43% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 50% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 272 of 350 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 112 | 41% | 147 |
| catcat20.shape.Theta 0.018 | 54 | 20% | 67 |
| dmh.robocode.robot.RedDwarf 0.4 | 27 | 10% | 30 |
| co.edu.usb.rc.LidisTron 1.0 | 22 | 8% | 25 |
| sanyi.mikrobi.Roberto 1.0 | 20 | 7% | 29 |
| Lo_Ian.Gandalf_V4 4.0 | 17 | 6% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 6% | 26 |
| pa.Improved 1.0 | 4 | 1% | 4 |

## Melee bench: F15

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 63.8 | 48 / 350 | 4.25 | 12.8% | 36727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.2 | 15.3% | 85 |
| mld.DustBunny 3.8 | 2.9 | 13.3% | 41 |
| emp.Yngwie 1.11 | 3.0 | 13.3% | 100 |
| hadur117.nano.SanaroLR 0.2 | 3.7 | 12.8% | 48 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.3% | 30 |
| kawigi.robot.Girl 1.2 | 5.4 | 10.2% | 41 |
| Grystrion.TrackerWO 1.0 | 7.6 | 7.1% | 1 |
| lambdaxy.TBot 0.1 | 7.6 | 6.9% | 0 |
| divineomega.TrialBot 0.003 | 9.1 | 5.5% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.5 | 62.5 | 5 / 35 | 3219 |
| 2 | 5 | 57.0 | 61.0 | 3 / 35 | 3549 |
| 3 | 4 | 57.9 | 62.2 | 6 / 35 | 3533 |
| 4 | 4 | 56.8 | 59.7 | 3 / 35 | 3573 |
| 5 | 4 | 57.5 | 62.9 | 2 / 35 | 3604 |
| 6 | 4 | 58.7 | 63.2 | 5 / 35 | 3758 |
| 7 | 4 | 57.7 | 58.1 | 6 / 35 | 4045 |
| 8 | 3 | 61.4 | 71.4 | 4 / 35 | 3990 |
| 9 | 2 | 61.1 | 71.1 | 8 / 35 | 3590 |
| 10 | 3 | 59.8 | 66.3 | 6 / 35 | 3866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 30 | 17% |
| emp.Yngwie 1.11 | 27 | 59% |
| cb.nano.Insomnia 1.0 | 19 | 58% |
| mld.DustBunny 3.8 | 18 | 33% |
| kawigi.robot.Girl 1.2 | 13 | 62% |
| Grystrion.TrackerWO 1.0 | 2 | 50% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 0% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 303 of 350 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 68 | 22% | 80 |
| mld.DustBunny 3.8 | 67 | 22% | 75 |
| emp.Yngwie 1.11 | 50 | 17% | 69 |
| cb.nano.Insomnia 1.0 | 50 | 17% | 44 |
| kawigi.robot.Girl 1.2 | 29 | 10% | 36 |
| lambdaxy.TBot 0.1 | 13 | 4% | 13 |
| Grystrion.TrackerWO 1.0 | 11 | 4% | 12 |
| divineomega.TrialBot 0.003 | 10 | 3% | 16 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 5 | 2% | 5 |

## Melee bench: F16

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 66.9 | 37 / 350 | 3.98 | 13.4% | 38589 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.6% | 184 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.1 | 14.7% | 22 |
| hadur117.nano.SanaroLR 0.2 | 2.9 | 13.4% | 37 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 11.0% | 57 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.9% | 23 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.3% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.9% | 9 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.4% | 13 |
| repositorio.NanoStep 1.0 | 8.9 | 5.0% | 0 |
| asd.Cthulhu 1.3 | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 67.6 | 1 / 35 | 4055 |
| 2 | 3 | 58.8 | 62.9 | 4 / 35 | 3693 |
| 3 | 2 | 60.3 | 66.0 | 9 / 35 | 3866 |
| 4 | 3 | 57.6 | 61.3 | 3 / 35 | 3419 |
| 5 | 3 | 61.3 | 68.9 | 5 / 35 | 4066 |
| 6 | 3 | 62.9 | 73.0 | 6 / 35 | 4014 |
| 7 | 3 | 61.5 | 69.8 | 5 / 35 | 4175 |
| 8 | 3 | 60.7 | 70.2 | 2 / 35 | 3912 |
| 9 | 3 | 60.2 | 66.0 | 1 / 35 | 3980 |
| 10 | 3 | 57.7 | 63.5 | 1 / 35 | 3409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 84 | 4% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 75% |
| techdude.forest.FlamingForest 1.1 | 9 | 56% |
| divineomega.DivineBot 1.9.4.5 | 7 | 86% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| stelo.IntrinsicVolatility 1.4 | 7 | 57% |
| tvv.nano.Polaris 1.2 | 5 | 0% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 314 of 350 rounds, at a mean tick of 1313. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 143 | 46% | 151 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 61 | 19% | 71 |
| bvh.fnr.Fenrir 0.36l | 31 | 10% | 35 |
| tvv.nano.Polaris 1.2 | 21 | 7% | 21 |
| techdude.forest.FlamingForest 1.1 | 20 | 6% | 25 |
| stelo.IntrinsicVolatility 1.4 | 15 | 5% | 17 |
| divineomega.DivineBot 1.9.4.5 | 12 | 4% | 17 |
| asd.Cthulhu 1.3 | 6 | 2% | 6 |
| repositorio.NanoStep 1.0 | 5 | 2% | 7 |

## Melee bench: F17

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 68.2 | 70 / 350 | 3.86 | 13.7% | 37883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 1.5 | 14.5% | 93 |
| et.Predator 1.8 | 2.3 | 13.7% | 64 |
| hadur117.nano.SanaroLR 0.2 | 2.4 | 13.7% | 70 |
| cx.BlestPain 1.41 | 4.3 | 11.9% | 54 |
| ahf.NanoAndrew .4 | 5.2 | 11.2% | 25 |
| nic.Nicator 2.4 | 5.3 | 11.5% | 37 |
| maribo.melee.BMV 0.1 | 7.0 | 9.3% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 8.4 | 5.7% | 2 |
| tex.Longbot 0.4 | 8.6 | 5.7% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 65.4 | 6 / 35 | 3654 |
| 2 | 3 | 59.8 | 66.3 | 7 / 35 | 3688 |
| 3 | 1 | 61.7 | 73.0 | 8 / 35 | 3753 |
| 4 | 2 | 60.9 | 66.3 | 11 / 35 | 3907 |
| 5 | 4 | 57.5 | 58.7 | 7 / 35 | 3789 |
| 6 | 2 | 62.2 | 74.6 | 6 / 35 | 3857 |
| 7 | 2 | 62.2 | 74.6 | 6 / 35 | 3795 |
| 8 | 2 | 61.2 | 70.2 | 7 / 35 | 3808 |
| 9 | 3 | 60.1 | 66.3 | 5 / 35 | 3867 |
| 10 | 3 | 60.4 | 66.7 | 7 / 35 | 3765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 38 | 18% |
| oog.melee.Mercutio 1.0 | 37 | 59% |
| cx.BlestPain 1.41 | 28 | 75% |
| nic.Nicator 2.4 | 20 | 35% |
| ahf.NanoAndrew .4 | 11 | 91% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |
| tex.Longbot 0.4 | 1 | 0% |

Hadur died in 280 of 350 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 67 | 24% | 75 |
| oog.melee.Mercutio 1.0 | 52 | 19% | 73 |
| nic.Nicator 2.4 | 48 | 17% | 53 |
| cx.BlestPain 1.41 | 45 | 16% | 65 |
| ahf.NanoAndrew .4 | 27 | 10% | 36 |
| maribo.melee.BMV 0.1 | 25 | 9% | 28 |
| tex.Longbot 0.4 | 9 | 3% | 9 |
| edu.otg.spr.TheTeacher 1.2 | 7 | 3% | 10 |

## Melee bench: F18

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 67.1 | 72 / 350 | 3.96 | 13.3% | 33706 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.7 | 14.0% | 85 |
| agd.Mooserwirt2 2.7 | 2.2 | 13.1% | 79 |
| hadur117.nano.SanaroLR 0.2 | 2.4 | 13.3% | 72 |
| uji.DBH 1.1 | 3.9 | 11.7% | 45 |
| ratosh.Nobo 0.21 | 5.5 | 10.2% | 11 |
| spinnercat.Robovirus 2.718 | 5.5 | 10.2% | 13 |
| sigterm.Sigterm 1.0 | 7.2 | 8.6% | 25 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.3% | 5 |
| stelo.WangRobot 1.0 | 8.8 | 6.2% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.6 | 61.9 | 5 / 35 | 3190 |
| 2 | 3 | 58.1 | 64.8 | 7 / 35 | 3274 |
| 3 | 4 | 58.8 | 67.0 | 7 / 35 | 3265 |
| 4 | 2 | 58.6 | 66.3 | 8 / 35 | 3424 |
| 5 | 3 | 57.8 | 63.5 | 6 / 35 | 3481 |
| 6 | 2 | 59.5 | 67.9 | 9 / 35 | 3324 |
| 7 | 3 | 57.8 | 66.0 | 7 / 35 | 3056 |
| 8 | 1 | 61.6 | 72.7 | 9 / 35 | 3732 |
| 9 | 1 | 60.9 | 73.3 | 8 / 35 | 3518 |
| 10 | 2 | 59.4 | 67.9 | 6 / 35 | 3442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 41 | 39% |
| morbid.MorbidPriest 1.0 | 38 | 53% |
| uji.DBH 1.1 | 16 | 50% |
| sigterm.Sigterm 1.0 | 14 | 64% |
| spinnercat.Robovirus 2.718 | 13 | 69% |
| stelo.WangRobot 1.0 | 8 | 0% |
| ratosh.Nobo 0.21 | 8 | 63% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 67% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 280 of 350 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 84 | 30% | 99 |
| agd.Mooserwirt2 2.7 | 54 | 19% | 71 |
| ratosh.Nobo 0.21 | 39 | 14% | 46 |
| uji.DBH 1.1 | 36 | 13% | 44 |
| spinnercat.Robovirus 2.718 | 20 | 7% | 27 |
| sigterm.Sigterm 1.0 | 15 | 5% | 23 |
| stelo.WangRobot 1.0 | 15 | 5% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 4% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 2% | 8 |

## Melee bench: F19

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.5 | 101 / 350 | 2.48 | 16.4% | 41883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.7 | 16.4% | 119 |
| hadur117.nano.SanaroLR 0.2 | 1.8 | 16.4% | 101 |
| mld.Infinity 2.2 | 2.5 | 15.4% | 98 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.6% | 12 |
| erdnis.Rover 0.3 | 4.8 | 10.6% | 10 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.5% | 2 |
| mbh.Mbh 0.1 | 7.3 | 7.3% | 1 |
| pac.ABC 2.1 | 7.4 | 7.3% | 7 |
| pbg.R2D2 1.0 | 9.0 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 84.8 | 8 / 35 | 4434 |
| 2 | 1 | 66.7 | 84.1 | 12 / 35 | 4555 |
| 3 | 3 | 66.1 | 82.9 | 12 / 35 | 3929 |
| 4 | 1 | 67.3 | 89.5 | 12 / 35 | 4042 |
| 5 | 3 | 64.2 | 77.5 | 6 / 35 | 4051 |
| 6 | 1 | 66.7 | 86.7 | 12 / 35 | 3950 |
| 7 | 2 | 65.2 | 81.6 | 10 / 35 | 3875 |
| 8 | 1 | 67.9 | 87.0 | 17 / 35 | 4471 |
| 9 | 2 | 64.1 | 78.1 | 3 / 35 | 4187 |
| 10 | 2 | 66.3 | 83.2 | 9 / 35 | 4389 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 102 | 52% |
| davidalves.net.DuelistMiniMelee 1.2 | 91 | 15% |
| krillr.mini.JointStrike 2.0.0 | 23 | 87% |
| erdnis.Rover 0.3 | 11 | 64% |
| patson.PatsonTestBot 1.0 | 4 | 50% |
| pac.ABC 2.1 | 4 | 75% |
| mbh.Mbh 0.1 | 3 | 67% |

Hadur died in 250 of 350 rounds, at a mean tick of 1118. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 122 | 49% | 191 |
| mld.Infinity 2.2 | 60 | 24% | 27 |
| erdnis.Rover 0.3 | 24 | 10% | 36 |
| krillr.mini.JointStrike 2.0.0 | 20 | 8% | 39 |
| patson.PatsonTestBot 1.0 | 11 | 4% | 20 |
| pbg.R2D2 1.0 | 5 | 2% | 11 |
| mbh.Mbh 0.1 | 4 | 2% | 11 |
| pac.ABC 2.1 | 4 | 2% | 9 |

## Melee bench: F20

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 72.0 | 77 / 350 | 3.52 | 14.1% | 35935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.1 | 17.5% | 152 |
| hadur117.nano.SanaroLR 0.2 | 2.1 | 14.1% | 77 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.3% | 22 |
| fwb.Nine 1.0.1 | 3.8 | 11.4% | 42 |
| catcat20.Rabbit 0.001 | 4.7 | 10.7% | 32 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 9.2% | 13 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 8.7% | 5 |
| bayen.nut.Squirrel 1.615 | 7.8 | 7.5% | 5 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.6% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 71.4 | 7 / 35 | 3157 |
| 2 | 1 | 64.0 | 77.5 | 11 / 35 | 4125 |
| 3 | 2 | 61.0 | 68.9 | 8 / 35 | 4039 |
| 4 | 2 | 62.6 | 76.5 | 7 / 35 | 3700 |
| 5 | 2 | 60.7 | 69.2 | 9 / 35 | 3761 |
| 6 | 2 | 59.0 | 68.3 | 5 / 35 | 3263 |
| 7 | 2 | 60.8 | 70.8 | 7 / 35 | 3529 |
| 8 | 4 | 55.5 | 59.0 | 3 / 35 | 3102 |
| 9 | 2 | 64.4 | 82.2 | 10 / 35 | 3755 |
| 10 | 2 | 62.5 | 75.9 | 10 / 35 | 3504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 77 | 42% |
| fwb.Nine 1.0.1 | 25 | 48% |
| catcat20.Rabbit 0.001 | 18 | 61% |
| nz.jdc.nano.GridFu 1.0 | 16 | 25% |
| m3thos.mini.Eva01 0.5.5 | 8 | 100% |
| bayen.nut.Squirrel 1.615 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 6 | 67% |
| ntc.ControlledChaos 1.1.4 | 1 | 0% |

Hadur died in 273 of 350 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 112 | 41% | 132 |
| fwb.Nine 1.0.1 | 54 | 20% | 49 |
| nz.jdc.nano.GridFu 1.0 | 38 | 14% | 54 |
| catcat20.Rabbit 0.001 | 24 | 9% | 42 |
| djdjdj.NanoSkunk10 1.0 | 14 | 5% | 18 |
| bayen.nut.Squirrel 1.615 | 13 | 5% | 19 |
| ntc.ControlledChaos 1.1.4 | 7 | 3% | 7 |
| m3thos.mini.Eva01 0.5.5 | 6 | 2% | 22 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 2% | 7 |

## Melee bench: F21

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 82.6 | 121 / 350 | 2.57 | 16.9% | 46268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLR 0.2 | 1.5 | 16.9% | 121 |
| eem.EvBot v4.6.16 | 1.6 | 17.1% | 138 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.5% | 30 |
| cf.RiO.RiOx 4.2.1 | 3.9 | 12.3% | 27 |
| eld.Hmm 1.0 | 5.3 | 8.8% | 27 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.4% | 6 |
| fire219.CatBot 1.0 | 7.9 | 6.2% | 0 |
| el.JumpShoot 0.2 | 7.9 | 6.1% | 2 |
| PSW.Relentless 0.1 | 8.2 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 78.1 | 9 / 35 | 4701 |
| 2 | 2 | 66.5 | 81.0 | 10 / 35 | 4975 |
| 3 | 1 | 67.0 | 85.4 | 16 / 35 | 4343 |
| 4 | 2 | 65.7 | 79.7 | 9 / 35 | 4871 |
| 5 | 2 | 65.7 | 80.0 | 13 / 35 | 4286 |
| 6 | 1 | 67.9 | 86.7 | 15 / 35 | 4792 |
| 7 | 1 | 68.1 | 88.3 | 14 / 35 | 4785 |
| 8 | 1 | 65.6 | 80.0 | 12 / 35 | 4586 |
| 9 | 1 | 66.4 | 84.1 | 11 / 35 | 4624 |
| 10 | 2 | 65.6 | 82.9 | 12 / 35 | 4305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 132 | 49% |
| dummy.mini.Scimitar 1.01 | 45 | 78% |
| cf.RiO.RiOx 4.2.1 | 22 | 64% |
| eld.Hmm 1.0 | 21 | 29% |
| oa.weak.BotherBot 0.1 | 4 | 25% |

Hadur died in 230 of 350 rounds, at a mean tick of 1305. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 95 | 41% | 142 |
| dummy.mini.Scimitar 1.01 | 48 | 21% | 94 |
| cf.RiO.RiOx 4.2.1 | 44 | 19% | 59 |
| eld.Hmm 1.0 | 21 | 9% | 28 |
| oa.weak.BotherBot 0.1 | 10 | 4% | 12 |
| PSW.Relentless 0.1 | 5 | 2% | 4 |
| el.JumpShoot 0.2 | 3 | 1% | 7 |
| fire219.CatBot 1.0 | 3 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 0% | 1 |

## Melee bench: F23

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 81.9 | 128 / 350 | 2.63 | 16.4% | 40916 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.1% | 122 |
| hadur117.nano.SanaroLR 0.2 | 2.0 | 16.4% | 128 |
| cre.Karolos 0.32 | 3.1 | 14.0% | 53 |
| stelo.AreaTargetingBot 1.1 | 3.9 | 11.8% | 25 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 9.3% | 10 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 9.0% | 4 |
| sample.Walls 1.0 | 6.6 | 8.7% | 7 |
| cw.megas.Blade 0.8 | 7.3 | 8.0% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 78.7 | 14 / 35 | 4007 |
| 2 | 2 | 65.5 | 80.0 | 10 / 35 | 4213 |
| 3 | 2 | 66.8 | 83.5 | 12 / 35 | 4579 |
| 4 | 2 | 66.7 | 84.1 | 15 / 35 | 3926 |
| 5 | 2 | 63.9 | 76.5 | 10 / 35 | 3432 |
| 6 | 2 | 67.8 | 85.7 | 14 / 35 | 4067 |
| 7 | 2 | 66.3 | 83.5 | 11 / 35 | 3945 |
| 8 | 2 | 66.1 | 79.4 | 12 / 35 | 4326 |
| 9 | 2 | 67.1 | 84.8 | 14 / 35 | 4069 |
| 10 | 2 | 67.4 | 83.2 | 16 / 35 | 4352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 100 | 51% |
| cre.Karolos 0.32 | 50 | 46% |
| stelo.AreaTargetingBot 1.1 | 32 | 66% |
| sample.Walls 1.0 | 22 | 86% |
| stelo.RamTrackSurfer 1.2 | 10 | 70% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 80% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 222 of 350 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 94 | 42% | 151 |
| cre.Karolos 0.32 | 60 | 27% | 86 |
| stelo.AreaTargetingBot 1.1 | 32 | 14% | 44 |
| sample.Walls 1.0 | 12 | 5% | 20 |
| stelo.RamTrackSurfer 1.2 | 9 | 4% | 22 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 3% | 13 |
| cw.megas.Blade 0.8 | 6 | 3% | 12 |
| rrh.Iwillfindyou 2.0 | 2 | 1% | 2 |

## Melee bench: F24

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.6 | 58.5 | 46 / 350 | 4.73 | 11.1% | 26048 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.3 | 15.4% | 93 |
| davidalves.Phoenix 0.54 | 2.7 | 13.4% | 70 |
| florent.XSeries.X2 0.12 | 2.8 | 13.6% | 65 |
| pedersen.Ugluk 1.1.1 | 3.9 | 12.2% | 46 |
| hadur117.nano.SanaroLR 0.2 | 4.5 | 11.1% | 46 |
| oog.melee.Corsair 1.0 | 5.9 | 9.7% | 13 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.4% | 16 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.7% | 3 |
| as.FrankTheTank 1.3 | 9.5 | 5.0% | 0 |
| evd.X1 0.01 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.6 | 57.1 | 5 / 35 | 2851 |
| 2 | 5 | 54.2 | 56.5 | 5 / 35 | 2693 |
| 3 | 5 | 53.3 | 58.7 | 0 / 35 | 2374 |
| 4 | 6 | 50.5 | 49.8 | 3 / 35 | 2233 |
| 5 | 4 | 55.3 | 59.7 | 4 / 35 | 2593 |
| 6 | 4 | 54.4 | 57.5 | 6 / 35 | 2558 |
| 7 | 5 | 53.8 | 57.1 | 6 / 35 | 2414 |
| 8 | 5 | 56.2 | 61.0 | 6 / 35 | 2826 |
| 9 | 5 | 53.3 | 56.2 | 4 / 35 | 2398 |
| 10 | 2 | 60.1 | 71.7 | 7 / 35 | 3108 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 36 | 58% |
| davidalves.Phoenix 0.54 | 17 | 41% |
| florent.XSeries.X2 0.12 | 11 | 64% |
| pedersen.Ugluk 1.1.1 | 7 | 71% |
| oog.melee.Corsair 1.0 | 5 | 60% |
| stelo.SoJNanoMelee 1.1 | 3 | 33% |
| as.FrankTheTank 1.3 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 76 | 25% | 94 |
| davidalves.Phoenix 0.54 | 70 | 23% | 72 |
| florent.XSeries.X2 0.12 | 49 | 16% | 62 |
| pedersen.Ugluk 1.1.1 | 48 | 16% | 51 |
| oog.melee.Corsair 1.0 | 20 | 6% | 24 |
| stelo.SoJNanoMelee 1.1 | 17 | 6% | 20 |
| lunchie.Lunchbox 0.93 | 12 | 4% | 13 |
| evd.X1 0.01 | 9 | 3% | 8 |
| as.FrankTheTank 1.3 | 5 | 2% | 6 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 67.3 | 63 / 350 | 3.94 | 13.2% | 31456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 14.5% | 77 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.9% | 76 |
| hadur117.nano.SanaroLR 0.2 | 2.8 | 13.2% | 63 |
| jdw.Hurricane 1.4 | 3.6 | 12.3% | 54 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 10.5% | 27 |
| ds.Oo 2.2 | 6.5 | 8.9% | 21 |
| gjr.Cephalosporin 0.1 | 6.7 | 8.4% | 20 |
| awesomeness.Elite 1.0 | 8.3 | 7.1% | 8 |
| adt.Ar2 1.1 | 8.3 | 6.9% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 67.3 | 7 / 35 | 3083 |
| 2 | 3 | 58.3 | 66.3 | 4 / 35 | 3218 |
| 3 | 2 | 61.2 | 69.5 | 10 / 35 | 3418 |
| 4 | 2 | 62.2 | 74.0 | 9 / 35 | 3456 |
| 5 | 1 | 62.2 | 74.9 | 8 / 35 | 3398 |
| 6 | 4 | 54.9 | 60.3 | 4 / 35 | 2485 |
| 7 | 2 | 60.9 | 74.6 | 7 / 35 | 3024 |
| 8 | 4 | 57.0 | 61.6 | 4 / 35 | 3253 |
| 9 | 2 | 59.8 | 67.6 | 6 / 35 | 3355 |
| 10 | 5 | 54.8 | 57.1 | 4 / 35 | 2766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 53 | 36% |
| voidious.micro.BlitzBat 1.05 | 35 | 11% |
| jdw.Hurricane 1.4 | 24 | 79% |
| gjr.Cephalosporin 0.1 | 13 | 54% |
| gre.svman4.Morfeas 1.4.1 | 10 | 50% |
| adt.Ar2 1.1 | 7 | 57% |
| ds.Oo 2.2 | 7 | 29% |
| awesomeness.Elite 1.0 | 4 | 75% |
| amk.ChumbaMini 0.2 | 1 | 0% |

Hadur died in 288 of 350 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 72 | 25% | 92 |
| voidious.micro.BlitzBat 1.05 | 71 | 25% | 78 |
| jdw.Hurricane 1.4 | 48 | 17% | 61 |
| gjr.Cephalosporin 0.1 | 26 | 9% | 30 |
| gre.svman4.Morfeas 1.4.1 | 21 | 7% | 31 |
| ds.Oo 2.2 | 19 | 7% | 24 |
| awesomeness.Elite 1.0 | 15 | 5% | 15 |
| adt.Ar2 1.1 | 10 | 3% | 13 |
| amk.ChumbaMini 0.2 | 6 | 2% | 6 |

## Melee bench: F26

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 70.2 | 49 / 350 | 3.68 | 13.4% | 36562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.8% | 136 |
| shu.nitro.LENIN .T34 | 2.8 | 13.2% | 69 |
| hadur117.nano.SanaroLR 0.2 | 2.9 | 13.4% | 49 |
| lrem.Spectre 0.4.4 | 3.5 | 12.5% | 47 |
| js.PinBall 1.6 | 5.1 | 11.3% | 15 |
| gh.mini.GrubbmOne 1.0 | 5.7 | 10.5% | 13 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 9.1% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.5% | 7 |
| sample.SpinBot 1.0 | 8.8 | 5.3% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 75.2 | 10 / 35 | 4077 |
| 2 | 4 | 57.0 | 63.2 | 0 / 35 | 3420 |
| 3 | 3 | 59.6 | 66.7 | 4 / 35 | 3528 |
| 4 | 2 | 63.3 | 77.5 | 8 / 35 | 3908 |
| 5 | 5 | 55.8 | 61.9 | 1 / 35 | 2891 |
| 6 | 3 | 60.1 | 68.3 | 4 / 35 | 3649 |
| 7 | 3 | 61.6 | 74.9 | 4 / 35 | 3532 |
| 8 | 2 | 61.6 | 71.4 | 5 / 35 | 4145 |
| 9 | 3 | 60.5 | 67.6 | 5 / 35 | 3840 |
| 10 | 2 | 62.1 | 75.6 | 8 / 35 | 3572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 56 | 29% |
| lrem.Spectre 0.4.4 | 34 | 38% |
| shu.nitro.LENIN .T34 | 34 | 38% |
| gh.mini.GrubbmOne 1.0 | 9 | 11% |
| js.PinBall 1.6 | 5 | 60% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| jaybot.adv.bots.JayBot 2.0 | 1 | 0% |
| sample.SpinBot 1.0 | 1 | 0% |

Hadur died in 303 of 350 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 90 | 30% | 104 |
| lrem.Spectre 0.4.4 | 55 | 18% | 62 |
| shu.nitro.LENIN .T34 | 46 | 15% | 59 |
| gh.mini.GrubbmOne 1.0 | 39 | 13% | 42 |
| js.PinBall 1.6 | 29 | 10% | 35 |
| jaybot.adv.bots.JayBot 2.0 | 20 | 7% | 21 |
| fullsail.LaxativeTeaTwo 1.0 | 19 | 6% | 22 |
| sample.SpinBot 1.0 | 5 | 2% | 5 |

## Melee bench: F27

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 71.5 | 80 / 350 | 3.56 | 13.5% | 28892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.9 | 14.7% | 110 |
| hadur117.nano.SanaroLR 0.2 | 2.3 | 13.5% | 80 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 12.4% | 50 |
| wee.Gem 1.8.4 | 3.8 | 11.9% | 61 |
| EH.Eagle 1.0.6 | 4.0 | 11.4% | 28 |
| joe.ADinosaur 1.0 | 6.9 | 8.2% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 7.1 | 8.3% | 10 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.1% | 9 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 70.2 | 11 / 35 | 3024 |
| 2 | 2 | 58.7 | 68.6 | 6 / 35 | 3052 |
| 3 | 2 | 59.2 | 70.5 | 11 / 35 | 2537 |
| 4 | 1 | 62.1 | 78.1 | 8 / 35 | 3285 |
| 5 | 2 | 58.9 | 71.1 | 4 / 35 | 2929 |
| 6 | 5 | 55.6 | 62.5 | 5 / 35 | 2581 |
| 7 | 3 | 58.8 | 72.1 | 4 / 35 | 2820 |
| 8 | 2 | 60.7 | 74.6 | 11 / 35 | 2738 |
| 9 | 2 | 61.3 | 74.6 | 12 / 35 | 2973 |
| 10 | 2 | 60.1 | 73.0 | 8 / 35 | 2953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 55 | 64% |
| EH.Eagle 1.0.6 | 27 | 85% |
| wee.Gem 1.8.4 | 24 | 33% |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 18% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 50% |
| joe.ADinosaur 1.0 | 4 | 75% |
| throxbot.ThroxBot 0.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 272 of 350 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 83 | 31% | 117 |
| sheldor.melee.nano.TestMelee 0.1 | 53 | 19% | 56 |
| wee.Gem 1.8.4 | 40 | 15% | 52 |
| EH.Eagle 1.0.6 | 25 | 9% | 48 |
| joe.ADinosaur 1.0 | 23 | 8% | 25 |
| throxbot.ThroxBot 0.1 | 21 | 8% | 21 |
| techdude.kombat.FlamingKombat 1.5 | 14 | 5% | 19 |
| caimano.Furia_Ceca 0.22 | 12 | 4% | 12 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 79.1 | 109 / 350 | 2.88 | 15.4% | 34445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.1 | 16.6% | 127 |
| hadur117.nano.SanaroLR 0.2 | 1.9 | 15.4% | 109 |
| uji.Antique 1.0 | 3.1 | 13.2% | 65 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.9% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.4% | 8 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.7% | 4 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.2% | 6 |
| matt.advanced.Katana 1.0 | 8.0 | 6.7% | 9 |
| stelo.Lifestealer 1.0 | 9.1 | 5.4% | 1 |
| stelo.PianistNano 1.2 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 79.7 | 11 / 35 | 3543 |
| 2 | 2 | 64.0 | 82.9 | 13 / 35 | 3057 |
| 3 | 2 | 63.6 | 80.6 | 11 / 35 | 3447 |
| 4 | 2 | 61.1 | 74.0 | 9 / 35 | 3047 |
| 5 | 2 | 63.5 | 78.7 | 8 / 35 | 3786 |
| 6 | 2 | 63.2 | 79.0 | 10 / 35 | 3460 |
| 7 | 2 | 62.6 | 78.1 | 10 / 35 | 3354 |
| 8 | 2 | 64.4 | 81.0 | 11 / 35 | 3590 |
| 9 | 1 | 64.8 | 81.3 | 14 / 35 | 3790 |
| 10 | 2 | 62.5 | 75.9 | 12 / 35 | 3371 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 119 | 50% |
| uji.Antique 1.0 | 44 | 50% |
| qohnil.blot.BlotBot 3.61 | 14 | 50% |
| pfvicm.Sobieski 7.2.3b | 10 | 80% |
| amk.ChumbaWumba 0.3 | 8 | 75% |
| matt.advanced.Katana 1.0 | 6 | 50% |
| ahr.ice.Ice 1.0.2 | 4 | 75% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 243 of 350 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 97 | 40% | 137 |
| uji.Antique 1.0 | 49 | 20% | 76 |
| pfvicm.Sobieski 7.2.3b | 38 | 16% | 46 |
| qohnil.blot.BlotBot 3.61 | 17 | 7% | 28 |
| amk.ChumbaWumba 0.3 | 16 | 7% | 23 |
| matt.advanced.Katana 1.0 | 10 | 4% | 14 |
| stelo.Lifestealer 1.0 | 8 | 3% | 10 |
| ahr.ice.Ice 1.0.2 | 7 | 3% | 14 |
| stelo.PianistNano 1.2 | 1 | 0% | 2 |

## Melee bench: F29

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 66.2 | 44 / 350 | 4.04 | 13.0% | 32550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.6 | 16.0% | 119 |
| deewiant.Anomaly 0.2 | 1.8 | 15.8% | 114 |
| hadur117.nano.SanaroLR 0.2 | 3.3 | 13.0% | 44 |
| myl.micro.Troodon 1.10 | 3.5 | 12.8% | 25 |
| jok.PheonixM 0.1.2 | 4.8 | 11.3% | 18 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.3% | 2 |
| DBall.Anarchy 0.1 | 6.8 | 8.1% | 24 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.5% | 2 |
| jangs.ns51 1.0 | 9.7 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.7 | 73.3 | 8 / 35 | 3672 |
| 2 | 4 | 57.3 | 63.5 | 0 / 35 | 3052 |
| 3 | 3 | 60.1 | 71.1 | 3 / 35 | 2941 |
| 4 | 4 | 59.3 | 65.7 | 4 / 35 | 3125 |
| 5 | 3 | 60.4 | 67.6 | 7 / 35 | 3335 |
| 6 | 4 | 56.0 | 57.1 | 3 / 35 | 2949 |
| 7 | 3 | 59.2 | 64.4 | 4 / 35 | 3414 |
| 8 | 3 | 60.7 | 69.2 | 8 / 35 | 3307 |
| 9 | 3 | 57.6 | 61.3 | 2 / 35 | 3371 |
| 10 | 3 | 60.9 | 68.6 | 5 / 35 | 3384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 46 | 37% |
| deewiant.Anomaly 0.2 | 41 | 7% |
| myl.micro.Troodon 1.10 | 23 | 74% |
| DBall.Anarchy 0.1 | 8 | 25% |
| jok.PheonixM 0.1.2 | 7 | 57% |
| ph.melee.ArcherME 0.3 | 1 | 0% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 118 | 39% | 122 |
| zyx.mega.YersiniaPestis 3.1 | 64 | 21% | 82 |
| myl.micro.Troodon 1.10 | 49 | 16% | 63 |
| jok.PheonixM 0.1.2 | 34 | 11% | 40 |
| DBall.Anarchy 0.1 | 14 | 5% | 16 |
| ph.melee.ArcherME 0.3 | 11 | 4% | 11 |
| fullsail.TimbotNoPrediction 1.0 | 11 | 4% | 11 |
| jangs.ns51 1.0 | 5 | 2% | 5 |

## Melee bench: F30

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.3 | 59.7 | 21 / 350 | 4.63 | 11.3% | 29099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.2 | 13.9% | 94 |
| darkcanuck.B26354 1.06 | 2.2 | 14.2% | 102 |
| oog.melee.Capulet 1.2 | 2.7 | 13.4% | 56 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.3% | 44 |
| hadur117.nano.SanaroLR 0.2 | 4.9 | 11.3% | 21 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.0% | 20 |
| ntc.Opposite 1.5 | 7.4 | 7.9% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.6% | 6 |
| tripphippy.Alice 1.1 | 8.5 | 6.7% | 8 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.0 | 57.5 | 1 / 35 | 2921 |
| 2 | 5 | 57.9 | 65.1 | 3 / 35 | 3077 |
| 3 | 5 | 54.1 | 55.9 | 1 / 35 | 2828 |
| 4 | 5 | 55.2 | 61.0 | 2 / 35 | 2863 |
| 5 | 5 | 57.0 | 61.9 | 5 / 35 | 3132 |
| 6 | 4 | 56.0 | 62.2 | 3 / 35 | 3028 |
| 7 | 5 | 55.0 | 60.6 | 0 / 35 | 2864 |
| 8 | 5 | 52.0 | 52.1 | 2 / 35 | 2453 |
| 9 | 5 | 55.5 | 60.0 | 2 / 35 | 2949 |
| 10 | 5 | 55.6 | 61.0 | 2 / 35 | 2984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 24 | 8% |
| darkcanuck.B26354 1.06 | 23 | 13% |
| oog.melee.Capulet 1.2 | 21 | 19% |
| stelo.PastFuture 2.3.2 | 16 | 38% |
| intruder.PrairieWolf 2.61 | 4 | 100% |
| tripphippy.Alice 1.1 | 2 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 329 of 350 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 66 | 20% | 74 |
| darkcanuck.B26354 1.06 | 65 | 20% | 68 |
| catcat20.Matcha 0.006 | 65 | 20% | 67 |
| oog.melee.Capulet 1.2 | 55 | 17% | 59 |
| ntc.Opposite 1.5 | 24 | 7% | 24 |
| tripphippy.Alice 1.1 | 21 | 6% | 22 |
| intruder.PrairieWolf 2.61 | 16 | 5% | 18 |
| fowl3628800.LightningBolt 2.6.0 | 13 | 4% | 14 |
| GarmBox.Anger 1.0 | 4 | 1% | 4 |

## Melee bench: F31

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.2 | 59.4 | 19 / 350 | 4.65 | 11.1% | 26800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.1% | 179 |
| gh.mini.Griezel 0.2 | 2.1 | 14.0% | 83 |
| d414.nano.Quantum 1.0.0 | 3.6 | 11.9% | 23 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 12.1% | 27 |
| hadur117.nano.SanaroLR 0.2 | 4.8 | 11.1% | 19 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.6% | 12 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.9% | 3 |
| fm.mammillarias 1.3 | 8.0 | 6.3% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.6 | 59.0 | 2 / 35 | 2947 |
| 2 | 6 | 51.0 | 49.5 | 3 / 35 | 2565 |
| 3 | 4 | 57.4 | 65.1 | 4 / 35 | 2751 |
| 4 | 6 | 54.6 | 58.7 | 2 / 35 | 2316 |
| 5 | 4 | 55.8 | 61.0 | 1 / 35 | 2852 |
| 6 | 5 | 55.6 | 60.0 | 3 / 35 | 2690 |
| 7 | 5 | 53.3 | 55.2 | 1 / 35 | 2504 |
| 8 | 5 | 56.4 | 62.5 | 1 / 35 | 2703 |
| 9 | 5 | 56.0 | 60.6 | 1 / 35 | 2787 |
| 10 | 4 | 56.0 | 62.2 | 1 / 35 | 2685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 39 | 15% |
| abc.Shadow 3.84i | 34 | 21% |
| spinnercat.micro.Tyger 0.1 | 9 | 0% |
| gh.nano.Grofvuil 0.2 | 6 | 67% |
| d414.nano.Quantum 1.0.0 | 4 | 25% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 331 of 350 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 88 | 27% | 93 |
| abc.Shadow 3.84i | 71 | 21% | 79 |
| spinnercat.micro.Tyger 0.1 | 64 | 19% | 64 |
| d414.nano.Quantum 1.0.0 | 37 | 11% | 38 |
| gh.nano.Grofvuil 0.2 | 33 | 10% | 37 |
| fm.mammillarias 1.3 | 14 | 4% | 15 |
| timmit.nano.TimDog 0.33 | 12 | 4% | 12 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 2% | 6 |
| tlp.ThreeLeggedPig 1 | 6 | 2% | 6 |

## Melee bench: F32

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.1 | 114 / 350 | 3.15 | 14.9% | 35566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.2 | 16.2% | 131 |
| hadur117.nano.SanaroLR 0.2 | 1.8 | 14.9% | 114 |
| apc.botM 3.0 | 3.3 | 12.2% | 43 |
| lxx.ConceptA 0.8 | 4.2 | 11.0% | 14 |
| vjik.UnViolation 1.1 | 4.8 | 10.4% | 24 |
| bayen.UbaMicro 1.4 | 5.7 | 9.4% | 8 |
| panzer.Panzer 0.2 | 7.4 | 7.7% | 0 |
| yk.JahMicro 1.0 | 8.1 | 6.8% | 7 |
| conscience.Electron 1.3g | 8.8 | 6.0% | 2 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 72.4 | 8 / 35 | 3491 |
| 2 | 2 | 62.8 | 78.7 | 11 / 35 | 3582 |
| 3 | 2 | 60.1 | 70.8 | 8 / 35 | 3478 |
| 4 | 1 | 63.3 | 76.2 | 14 / 35 | 3910 |
| 5 | 2 | 62.8 | 76.2 | 15 / 35 | 3543 |
| 6 | 2 | 60.2 | 70.5 | 12 / 35 | 3281 |
| 7 | 2 | 63.9 | 79.4 | 14 / 35 | 3673 |
| 8 | 2 | 64.1 | 82.5 | 12 / 35 | 3729 |
| 9 | 1 | 62.6 | 78.7 | 12 / 35 | 3326 |
| 10 | 2 | 61.7 | 75.9 | 8 / 35 | 3553 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 108 | 42% |
| apc.botM 3.0 | 38 | 74% |
| lxx.ConceptA 0.8 | 18 | 89% |
| vjik.UnViolation 1.1 | 15 | 60% |
| yk.JahMicro 1.0 | 8 | 75% |
| donjezza.Jezza 1.0 | 5 | 60% |
| panzer.Panzer 0.2 | 5 | 100% |
| bayen.UbaMicro 1.4 | 3 | 67% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 236 of 350 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 100 | 42% | 147 |
| lxx.ConceptA 0.8 | 35 | 15% | 43 |
| apc.botM 3.0 | 27 | 11% | 56 |
| bayen.UbaMicro 1.4 | 21 | 9% | 26 |
| panzer.Panzer 0.2 | 18 | 8% | 19 |
| vjik.UnViolation 1.1 | 11 | 5% | 24 |
| yk.JahMicro 1.0 | 10 | 4% | 15 |
| donjezza.Jezza 1.0 | 7 | 3% | 11 |
| conscience.Electron 1.3g | 7 | 3% | 9 |

## Melee bench: F33

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 65.3 | 55 / 350 | 4.13 | 13.2% | 36293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.6% | 118 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.7% | 72 |
| hadur117.nano.SanaroLR 0.2 | 2.9 | 13.2% | 55 |
| labg.Cataclysm 2.05 | 4.4 | 11.9% | 54 |
| gre.svman4.Leonidas 1.3.2 | 4.4 | 11.9% | 39 |
| baal.nano.N 1.42 | 5.9 | 8.9% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.9 | 8.0% | 6 |
| zyx.micro.Ant 1.1 | 8.6 | 5.4% | 0 |
| sanja.First 0.1 | 8.9 | 5.1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 65.1 | 7 / 35 | 3682 |
| 2 | 3 | 59.2 | 66.3 | 5 / 35 | 3391 |
| 3 | 2 | 62.0 | 71.7 | 7 / 35 | 3723 |
| 4 | 4 | 58.7 | 62.5 | 4 / 35 | 3629 |
| 5 | 4 | 59.2 | 63.2 | 2 / 35 | 3712 |
| 6 | 3 | 61.1 | 67.0 | 9 / 35 | 3688 |
| 7 | 3 | 58.6 | 61.0 | 6 / 35 | 3843 |
| 8 | 3 | 59.4 | 63.8 | 6 / 35 | 3518 |
| 9 | 3 | 59.6 | 64.4 | 5 / 35 | 3714 |
| 10 | 2 | 59.6 | 67.6 | 4 / 35 | 3393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 50 | 48% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 20% |
| gre.svman4.Leonidas 1.3.2 | 17 | 59% |
| labg.Cataclysm 2.05 | 14 | 50% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 60% |
| sanja.First 0.1 | 2 | 50% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 113 | 38% | 140 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 72 | 24% | 82 |
| gre.svman4.Leonidas 1.3.2 | 34 | 11% | 40 |
| labg.Cataclysm 2.05 | 33 | 11% | 42 |
| baal.nano.N 1.42 | 14 | 5% | 15 |
| kinsen.melee.Angsaichmophobia 1.8c | 14 | 5% | 14 |
| zyx.micro.Ant 1.1 | 10 | 3% | 9 |
| sanja.First 0.1 | 4 | 1% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 1% | 3 |

## Melee bench: F34

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 71.2 | 50 / 350 | 3.59 | 13.8% | 38111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.2 | 17.9% | 125 |
| stelo.Spread 0.9 | 1.8 | 17.2% | 127 |
| hadur117.nano.SanaroLR 0.2 | 3.0 | 13.8% | 50 |
| jcs.Seth 1.8 | 4.2 | 11.4% | 26 |
| tcf.Reach 3 | 5.0 | 10.7% | 17 |
| cli.Dancer 1.1 | 5.8 | 9.9% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 1 |
| sample.VelociRobot 1.0 | 9.1 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.9 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 62.5 | 6 / 35 | 3656 |
| 2 | 3 | 64.7 | 76.2 | 10 / 35 | 4393 |
| 3 | 3 | 61.0 | 68.3 | 5 / 35 | 3413 |
| 4 | 3 | 62.1 | 71.1 | 5 / 35 | 3864 |
| 5 | 3 | 61.1 | 69.5 | 2 / 35 | 3752 |
| 6 | 3 | 63.6 | 76.5 | 6 / 35 | 3913 |
| 7 | 3 | 60.9 | 70.8 | 3 / 35 | 3611 |
| 8 | 3 | 61.0 | 67.9 | 6 / 35 | 3876 |
| 9 | 3 | 62.2 | 72.4 | 4 / 35 | 3770 |
| 10 | 3 | 63.4 | 77.1 | 3 / 35 | 3863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 59 | 15% |
| stelo.Spread 0.9 | 57 | 54% |
| jcs.Seth 1.8 | 14 | 43% |
| tcf.Reach 3 | 5 | 20% |
| ratosh.Wesco 1.4 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 0% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 141 | 47% | 146 |
| stelo.Spread 0.9 | 74 | 25% | 106 |
| jcs.Seth 1.8 | 30 | 10% | 39 |
| tcf.Reach 3 | 25 | 8% | 26 |
| ratosh.Wesco 1.4 | 17 | 6% | 19 |
| cli.Dancer 1.1 | 10 | 3% | 10 |
| sample.VelociRobot 1.0 | 2 | 1% | 3 |
| sample.RamFire 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 67.0 | 14 / 350 | 3.97 | 12.1% | 26415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 269 |
| gh.mini.Gruwel 0.9 | 2.2 | 13.3% | 34 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.4 | 12.4% | 25 |
| hadur117.nano.SanaroLR 0.2 | 4.1 | 12.1% | 14 |
| rz.HawkOnFire 0.1 | 4.3 | 11.8% | 5 |
| wit.Chuliath 1.0 | 6.3 | 7.5% | 2 |
| myl.nano.KomoriNinja 1.1 | 7.2 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.2% | 1 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.8 | 69.2 | 4 / 35 | 2639 |
| 2 | 5 | 58.2 | 67.6 | 0 / 35 | 2815 |
| 3 | 4 | 57.9 | 67.9 | 0 / 35 | 2677 |
| 4 | 5 | 57.7 | 66.3 | 4 / 35 | 2742 |
| 5 | 3 | 59.9 | 70.2 | 2 / 35 | 3071 |
| 6 | 3 | 58.9 | 70.8 | 2 / 35 | 2586 |
| 7 | 3 | 57.8 | 68.9 | 1 / 35 | 2224 |
| 8 | 5 | 54.5 | 58.7 | 1 / 35 | 2598 |
| 9 | 5 | 56.9 | 65.4 | 0 / 35 | 2581 |
| 10 | 4 | 56.8 | 65.4 | 0 / 35 | 2482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 78 | 1% |
| gh.mini.Gruwel 0.9 | 24 | 17% |
| rz.HawkOnFire 0.1 | 9 | 78% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 33% |
| wit.Chuliath 1.0 | 1 | 0% |

Hadur died in 336 of 350 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 144 | 43% | 146 |
| gh.mini.Gruwel 0.9 | 61 | 18% | 65 |
| rz.HawkOnFire 0.1 | 44 | 13% | 49 |
| dmh.robocode.robot.BlackDeath 9.2 | 42 | 13% | 44 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 13 | 4% | 13 |
| myl.nano.KomoriNinja 1.1 | 12 | 4% | 12 |
| wit.Chuliath 1.0 | 11 | 3% | 12 |
| dans.Cinnamon 1.2 | 5 | 1% | 5 |
| stelo.MyAgileRobot 0.2 | 4 | 1% | 4 |

## Melee bench: F36

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 73.9 | 105 / 350 | 3.35 | 14.9% | 36680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLR 0.2 | 1.1 | 14.9% | 105 |
| alpha.RainingFire 1.0 | 2.9 | 12.6% | 62 |
| bzdp.Pansy 2.1 | 2.9 | 12.4% | 61 |
| bvh.micro.Freya 0.3 | 4.2 | 11.3% | 35 |
| mz.Cork 0.1 | 5.1 | 10.6% | 25 |
| m3thos.Eva02 0.7.1 | 5.7 | 10.3% | 25 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.8% | 15 |
| dl.BetterWalls 1.0 | 8.4 | 6.9% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.5% | 4 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.7% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 72.4 | 10 / 35 | 3870 |
| 2 | 1 | 61.5 | 73.3 | 10 / 35 | 3533 |
| 3 | 1 | 60.4 | 68.9 | 10 / 35 | 3503 |
| 4 | 1 | 64.9 | 81.6 | 16 / 35 | 3986 |
| 5 | 1 | 62.3 | 75.9 | 8 / 35 | 3704 |
| 6 | 2 | 60.4 | 68.9 | 9 / 35 | 3621 |
| 7 | 1 | 61.6 | 70.5 | 12 / 35 | 3670 |
| 8 | 1 | 62.3 | 76.8 | 10 / 35 | 3411 |
| 9 | 1 | 62.3 | 75.9 | 8 / 35 | 4021 |
| 10 | 1 | 62.1 | 74.6 | 12 / 35 | 3361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 43 | 28% |
| alpha.RainingFire 1.0 | 40 | 45% |
| bvh.micro.Freya 0.3 | 36 | 86% |
| mz.Cork 0.1 | 21 | 76% |
| bvh.mini.Fenrir 0.39 | 19 | 79% |
| m3thos.Eva02 0.7.1 | 10 | 70% |
| sample.MyFirstRobot 1.0 | 6 | 17% |
| dl.BetterWalls 1.0 | 4 | 75% |
| squidM.TentalceMeleeNano 1.1 | 3 | 67% |

Hadur died in 246 of 350 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 59 | 24% | 76 |
| bzdp.Pansy 2.1 | 53 | 22% | 70 |
| bvh.mini.Fenrir 0.39 | 33 | 13% | 38 |
| m3thos.Eva02 0.7.1 | 26 | 11% | 32 |
| bvh.micro.Freya 0.3 | 24 | 10% | 49 |
| mz.Cork 0.1 | 20 | 8% | 38 |
| sample.MyFirstRobot 1.0 | 13 | 5% | 15 |
| dl.BetterWalls 1.0 | 11 | 4% | 18 |
| squidM.TentalceMeleeNano 1.1 | 7 | 3% | 13 |

## Melee bench: F37

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 78.9 | 127 / 350 | 2.90 | 15.8% | 45491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLR 0.2 | 1.0 | 15.8% | 127 |
| germ.TheMind .2 | 3.2 | 10.9% | 43 |
| EBBU.Sim2 1.02 | 3.6 | 10.6% | 28 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.6 | 10.8% | 28 |
| agrach.Dalek 1.0 | 5.5 | 9.9% | 44 |
| mb.Beast 0.1 | 6.0 | 9.3% | 24 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.8% | 21 |
| lmk.ACPFinal 0.1 | 7.8 | 8.3% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 7.9 | 8.1% | 0 |
| skm.Ryubot 1.0 | 9.4 | 7.4% | 18 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 86.7 | 18 / 35 | 4498 |
| 2 | 1 | 57.6 | 67.0 | 6 / 35 | 3909 |
| 3 | 1 | 64.2 | 83.5 | 15 / 35 | 4275 |
| 4 | 1 | 63.9 | 79.0 | 13 / 35 | 5215 |
| 5 | 1 | 64.1 | 82.2 | 11 / 35 | 4837 |
| 6 | 1 | 63.0 | 80.0 | 14 / 35 | 4226 |
| 7 | 1 | 63.5 | 80.6 | 14 / 35 | 4568 |
| 8 | 1 | 63.8 | 79.0 | 14 / 35 | 4777 |
| 9 | 1 | 60.8 | 72.7 | 10 / 35 | 4319 |
| 10 | 1 | 63.2 | 77.8 | 12 / 35 | 4867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 32 | 53% |
| agrach.Dalek 1.0 | 29 | 55% |
| mb.Beast 0.1 | 26 | 69% |
| germ.TheMind .2 | 25 | 48% |
| stelo.UntouchableNano 1.3 | 25 | 80% |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 64% |
| skm.Ryubot 1.0 | 23 | 61% |
| lmk.ACPFinal 0.1 | 17 | 59% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 100% |

Hadur died in 226 of 350 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 39 | 17% | 52 |
| germ.TheMind .2 | 39 | 17% | 48 |
| com.syncleus.robocode.Dreadnaught 0.1 | 36 | 16% | 58 |
| agrach.Dalek 1.0 | 35 | 15% | 61 |
| lmk.ACPFinal 0.1 | 26 | 12% | 36 |
| mb.Beast 0.1 | 18 | 8% | 34 |
| skm.Ryubot 1.0 | 14 | 6% | 24 |
| stelo.UntouchableNano 1.3 | 13 | 6% | 26 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 3% | 8 |

## Melee bench: F38

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 63.3 | 37 / 350 | 4.30 | 11.9% | 29401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.4% | 152 |
| bvh.mini.Freya 0.55 | 2.9 | 12.9% | 36 |
| bts.mega.Gnarly 1.4 | 3.6 | 12.1% | 55 |
| hadur117.nano.SanaroLR 0.2 | 3.9 | 11.9% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 11.1% | 29 |
| cs.Wren 1.0 | 4.9 | 11.2% | 26 |
| kdf.KoulDestroyer 1.0 | 6.9 | 9.1% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.4% | 4 |
| bzdp.BoxCar 2.0 | 9.4 | 4.3% | 0 |
| matt.UnderDark3 2.4.34 | 9.4 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.7 | 64.8 | 2 / 35 | 2911 |
| 2 | 4 | 58.5 | 65.1 | 7 / 35 | 3062 |
| 3 | 4 | 56.9 | 63.5 | 3 / 35 | 2868 |
| 4 | 5 | 54.8 | 59.0 | 4 / 35 | 2706 |
| 5 | 3 | 57.1 | 64.8 | 2 / 35 | 3053 |
| 6 | 6 | 55.9 | 61.6 | 3 / 35 | 2839 |
| 7 | 2 | 59.6 | 70.5 | 5 / 35 | 3265 |
| 8 | 5 | 54.9 | 60.0 | 2 / 35 | 2766 |
| 9 | 4 | 56.4 | 61.3 | 3 / 35 | 3114 |
| 10 | 3 | 56.4 | 62.5 | 6 / 35 | 2817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 45 | 33% |
| bts.mega.Gnarly 1.4 | 20 | 30% |
| bvh.mini.Freya 0.55 | 16 | 44% |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 0% |
| cs.Wren 1.0 | 10 | 50% |
| kdf.KoulDestroyer 1.0 | 3 | 67% |
| matt.UnderDark3 2.4.34 | 2 | 50% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |

Hadur died in 314 of 350 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 82 | 26% | 97 |
| bvh.mini.Freya 0.55 | 49 | 16% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 15% | 49 |
| bts.mega.Gnarly 1.4 | 47 | 15% | 53 |
| cs.Wren 1.0 | 43 | 14% | 49 |
| kdf.KoulDestroyer 1.0 | 30 | 10% | 31 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 3% | 9 |
| bzdp.BoxCar 2.0 | 4 | 1% | 4 |
| matt.UnderDark3 2.4.34 | 3 | 1% | 4 |

## Melee bench: F39

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 65.8 | 38 / 350 | 4.08 | 12.4% | 32295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 16.1% | 86 |
| az.Ololobot 0.2.4 | 2.3 | 13.8% | 123 |
| hadur117.nano.SanaroLR 0.2 | 3.1 | 12.4% | 38 |
| catcat20.Lambda 0.024 | 3.8 | 11.4% | 55 |
| stelo.SoRobotNanoMelee 1.2 | 5.1 | 9.8% | 29 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 8.8% | 8 |
| winamp32.micro.MicroMacro 1.0 | 6.9 | 8.3% | 7 |
| gimp.GimpBot 0.1 | 7.3 | 8.0% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.1 | 57.1 | 2 / 35 | 3108 |
| 2 | 3 | 55.5 | 61.9 | 2 / 35 | 3110 |
| 3 | 3 | 57.2 | 66.3 | 3 / 35 | 3194 |
| 4 | 2 | 60.2 | 74.9 | 7 / 35 | 3030 |
| 5 | 2 | 60.4 | 74.3 | 2 / 35 | 3742 |
| 6 | 3 | 56.7 | 64.1 | 4 / 35 | 3131 |
| 7 | 4 | 56.6 | 62.9 | 5 / 35 | 3217 |
| 8 | 3 | 57.4 | 66.7 | 2 / 35 | 3119 |
| 9 | 3 | 59.1 | 68.9 | 4 / 35 | 3574 |
| 10 | 3 | 56.2 | 61.0 | 7 / 35 | 3070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 42 | 7% |
| bvh.fry.Freya 0.82 | 39 | 38% |
| catcat20.Lambda 0.024 | 23 | 43% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 43% |
| apollokidd.ApolloKidd 0.9 | 4 | 0% |
| gimp.GimpBot 0.1 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 120 | 38% | 134 |
| az.Ololobot 0.2.4 | 60 | 19% | 64 |
| stelo.SoRobotNanoMelee 1.2 | 34 | 11% | 36 |
| catcat20.Lambda 0.024 | 32 | 10% | 40 |
| apollokidd.ApolloKidd 0.9 | 30 | 10% | 31 |
| winamp32.micro.MicroMacro 1.0 | 15 | 5% | 17 |
| gimp.GimpBot 0.1 | 11 | 4% | 15 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 2% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 5 | 2% | 5 |

## Melee bench: F41

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 69.7 | 70 / 350 | 3.73 | 13.5% | 32991 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 16.8% | 158 |
| ary.Swarm 1.1 | 2.6 | 13.8% | 31 |
| hadur117.nano.SanaroLR 0.2 | 2.9 | 13.5% | 70 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.9% | 43 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.8% | 32 |
| shrub.Silver v048 | 6.3 | 8.7% | 7 |
| zyx.nano.Ant 1.1 | 6.8 | 7.8% | 1 |
| stelo.Mirror 1.1 | 8.4 | 5.8% | 2 |
| jsal.Jsalbot 1.0 | 8.4 | 6.2% | 7 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 74.3 | 9 / 35 | 3398 |
| 2 | 3 | 61.6 | 74.0 | 7 / 35 | 3321 |
| 3 | 2 | 60.7 | 69.5 | 7 / 35 | 3385 |
| 4 | 4 | 59.8 | 66.7 | 5 / 35 | 3399 |
| 5 | 3 | 61.6 | 72.7 | 9 / 35 | 3354 |
| 6 | 3 | 58.5 | 65.7 | 4 / 35 | 3193 |
| 7 | 4 | 57.7 | 61.3 | 6 / 35 | 3009 |
| 8 | 3 | 61.6 | 72.4 | 7 / 35 | 3269 |
| 9 | 2 | 60.8 | 69.8 | 7 / 35 | 3429 |
| 10 | 3 | 61.1 | 70.8 | 9 / 35 | 3234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 63 | 32% |
| simonton.nano.MeleeSeed 1.8 | 30 | 67% |
| lessonz.robocode.Oz 0.5.0 | 23 | 61% |
| ary.Swarm 1.1 | 19 | 63% |
| shrub.Silver v048 | 5 | 20% |
| stelo.Mirror 1.1 | 4 | 50% |
| jsal.Jsalbot 1.0 | 3 | 33% |

Hadur died in 282 of 350 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 84 | 30% | 102 |
| ary.Swarm 1.1 | 67 | 24% | 82 |
| lessonz.robocode.Oz 0.5.0 | 43 | 15% | 53 |
| simonton.nano.MeleeSeed 1.8 | 38 | 13% | 56 |
| shrub.Silver v048 | 19 | 7% | 21 |
| zyx.nano.Ant 1.1 | 16 | 6% | 16 |
| stelo.Mirror 1.1 | 7 | 2% | 9 |
| jsal.Jsalbot 1.0 | 6 | 2% | 9 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 72.1 | 67 / 350 | 3.51 | 14.0% | 37549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.2% | 173 |
| hadur117.nano.SanaroLR 0.2 | 2.9 | 14.0% | 67 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.9% | 42 |
| ara.Shera 0.88 | 3.1 | 14.0% | 55 |
| amz.NanoClone 1.41 | 5.4 | 9.0% | 3 |
| dsw.StaticD 1.0 | 6.4 | 7.6% | 9 |
| maribo.IotaCT 1.1 | 6.5 | 7.4% | 1 |
| stelo.MirrorMicro 1.0 | 8.3 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 75.9 | 4 / 35 | 4040 |
| 2 | 2 | 62.7 | 73.7 | 7 / 35 | 4274 |
| 3 | 2 | 63.0 | 75.9 | 10 / 35 | 3899 |
| 4 | 4 | 61.0 | 70.5 | 8 / 35 | 3631 |
| 5 | 2 | 62.8 | 77.5 | 8 / 35 | 3866 |
| 6 | 3 | 59.7 | 70.5 | 7 / 35 | 3237 |
| 7 | 4 | 58.4 | 65.1 | 3 / 35 | 3571 |
| 8 | 4 | 56.9 | 61.3 | 4 / 35 | 3273 |
| 9 | 2 | 63.6 | 77.5 | 9 / 35 | 4119 |
| 10 | 4 | 61.6 | 73.3 | 7 / 35 | 3639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 65 | 28% |
| ara.Shera 0.88 | 34 | 68% |
| maribo.mini.MiniQuester 0.1 | 27 | 67% |
| dsw.StaticD 1.0 | 5 | 20% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 98 | 35% | 118 |
| ara.Shera 0.88 | 68 | 24% | 92 |
| maribo.mini.MiniQuester 0.1 | 62 | 22% | 79 |
| amz.NanoClone 1.41 | 25 | 9% | 25 |
| maribo.IotaCT 1.1 | 10 | 4% | 11 |
| dsw.StaticD 1.0 | 9 | 3% | 10 |
| stelo.MirrorMicro 1.0 | 6 | 2% | 7 |
| mme.NikeEnhanced 2.0 | 4 | 1% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 0% | 3 |

## Melee bench: F43

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 61.3 | 17 / 350 | 4.49 | 11.6% | 29869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.6% | 272 |
| brainfade.melee.Dusk 0.44 | 2.2 | 13.0% | 30 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.3% | 19 |
| hadur117.nano.SanaroLR 0.2 | 4.1 | 11.6% | 17 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.2% | 10 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.8% | 3 |
| mz.NanoGod 2.02 | 7.2 | 8.1% | 2 |
| jab.DiamondStealer 5 | 7.7 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.2 | 60.3 | 0 / 35 | 2776 |
| 2 | 4 | 58.4 | 60.0 | 4 / 35 | 3059 |
| 3 | 4 | 57.1 | 58.1 | 1 / 35 | 3023 |
| 4 | 4 | 58.3 | 62.9 | 2 / 35 | 2757 |
| 5 | 4 | 56.7 | 58.7 | 1 / 35 | 2775 |
| 6 | 3 | 59.5 | 65.4 | 2 / 35 | 3162 |
| 7 | 5 | 57.5 | 58.7 | 2 / 35 | 2899 |
| 8 | 4 | 60.7 | 66.7 | 3 / 35 | 3286 |
| 9 | 4 | 59.6 | 64.4 | 0 / 35 | 3310 |
| 10 | 4 | 56.5 | 57.5 | 2 / 35 | 2822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 57 | 4% |
| brainfade.melee.Dusk 0.44 | 11 | 55% |
| dummy.micro.Sparrow 2.5 | 10 | 70% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 33% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 333 of 350 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 161 | 48% | 164 |
| brainfade.melee.Dusk 0.44 | 43 | 13% | 49 |
| dummy.micro.Sparrow 2.5 | 41 | 12% | 49 |
| wcsv.melee.EngineerMelee 0.1 | 33 | 10% | 33 |
| mz.NanoGod 2.02 | 26 | 8% | 26 |
| Krabb.akim2.Akim2 1.1b | 18 | 5% | 18 |
| jab.DiamondStealer 5 | 11 | 3% | 11 |

## Melee bench: F44

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 69.3 | 50 / 350 | 3.77 | 13.7% | 37054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.4 | 17.3% | 169 |
| tzu.TheArtOfWar 1.2 | 1.8 | 15.4% | 81 |
| hadur117.nano.SanaroLR 0.2 | 2.9 | 13.7% | 50 |
| jwirde.Gort 2.0 | 4.5 | 10.7% | 22 |
| wompi.Quokka 1.6 | 4.5 | 10.6% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 9.3% | 7 |
| disan.Chair 2.2.0 | 7.4 | 6.7% | 2 |
| stf.PanzerGeneral 0.1 | 7.6 | 6.7% | 3 |
| amk.jointstrike.JointStrike 0.2 | 9.4 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.6 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 65.1 | 5 / 35 | 3511 |
| 2 | 3 | 58.4 | 64.1 | 4 / 35 | 3366 |
| 3 | 3 | 61.5 | 72.1 | 5 / 35 | 3871 |
| 4 | 2 | 61.0 | 72.4 | 3 / 35 | 3611 |
| 5 | 3 | 62.5 | 74.9 | 5 / 35 | 3728 |
| 6 | 3 | 59.8 | 66.3 | 4 / 35 | 3782 |
| 7 | 3 | 61.5 | 71.4 | 5 / 35 | 3967 |
| 8 | 2 | 62.3 | 71.4 | 9 / 35 | 4075 |
| 9 | 3 | 63.3 | 76.2 | 8 / 35 | 3933 |
| 10 | 4 | 56.0 | 58.7 | 2 / 35 | 3210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 72 | 28% |
| tzu.TheArtOfWar 1.2 | 52 | 29% |
| wompi.Quokka 1.6 | 12 | 50% |
| jwirde.Gort 2.0 | 11 | 55% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 33% |
| disan.Chair 2.2.0 | 2 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 104 | 34% | 126 |
| tzu.TheArtOfWar 1.2 | 93 | 31% | 108 |
| wompi.Quokka 1.6 | 26 | 9% | 30 |
| jwirde.Gort 2.0 | 24 | 8% | 28 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 21 | 7% | 24 |
| stf.PanzerGeneral 0.1 | 13 | 4% | 13 |
| disan.Chair 2.2.0 | 10 | 3% | 10 |
| sample.Crazy 1.0 | 6 | 2% | 6 |
| amk.jointstrike.JointStrike 0.2 | 5 | 2% | 5 |

## Melee bench: F45

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 68.6 | 60 / 350 | 3.83 | 14.2% | 39669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLR 0.2 | 1.2 | 14.2% | 60 |
| eem.IWillFireNoBullet v2.8 | 2.4 | 13.1% | 178 |
| jje.BagPuss 1.2 | 3.1 | 12.5% | 29 |
| sul.Lunar 1.1 | 4.2 | 11.4% | 39 |
| myl.nano.Graviton 1.10 | 4.5 | 11.1% | 17 |
| hvilela.HVilela 0.9 | 6.2 | 9.2% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.6% | 10 |
| fm.claire 1.7 | 7.4 | 8.1% | 1 |
| wit.Deep7 2.0 | 8.8 | 6.7% | 16 |
| abud.ThirdRobo 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.4 | 68.3 | 7 / 35 | 3772 |
| 2 | 1 | 60.7 | 67.6 | 7 / 35 | 4020 |
| 3 | 1 | 60.5 | 69.2 | 5 / 35 | 3856 |
| 4 | 1 | 62.2 | 75.6 | 5 / 35 | 3895 |
| 5 | 1 | 62.3 | 71.7 | 5 / 35 | 4350 |
| 6 | 1 | 58.8 | 62.9 | 6 / 35 | 3875 |
| 7 | 3 | 59.1 | 62.9 | 4 / 35 | 4004 |
| 8 | 1 | 59.4 | 63.2 | 6 / 35 | 4061 |
| 9 | 1 | 63.2 | 75.6 | 8 / 35 | 4190 |
| 10 | 1 | 60.4 | 68.9 | 7 / 35 | 3646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 77 | 40% |
| jje.BagPuss 1.2 | 21 | 52% |
| sul.Lunar 1.1 | 20 | 15% |
| myl.nano.Graviton 1.10 | 16 | 56% |
| wit.Deep7 2.0 | 6 | 33% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 33% |
| hvilela.HVilela 0.9 | 3 | 67% |

Hadur died in 290 of 350 rounds, at a mean tick of 1278. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 56 | 19% | 0 |
| jje.BagPuss 1.2 | 54 | 19% | 85 |
| myl.nano.Graviton 1.10 | 46 | 16% | 63 |
| sul.Lunar 1.1 | 45 | 16% | 75 |
| hvilela.HVilela 0.9 | 29 | 10% | 37 |
| pez.mini.ChironexFleckeri 0.5 | 21 | 7% | 32 |
| fm.claire 1.7 | 20 | 7% | 26 |
| wit.Deep7 2.0 | 13 | 4% | 21 |
| abud.ThirdRobo 1.0 | 6 | 2% | 11 |

## Melee bench: F46

hadur117.nano.SanaroLR 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 69.7 | 46 / 350 | 3.73 | 12.7% | 28704 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.9% | 144 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 16.8% | 133 |
| hadur117.nano.SanaroLR 0.2 | 3.1 | 12.7% | 46 |
| mz.MicroSheep 1.0 | 4.5 | 10.7% | 9 |
| cx.Princess 1.0 | 4.9 | 10.2% | 16 |
| sadoner.killer 0.2 | 5.5 | 9.6% | 0 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.4% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.3% | 0 |
| kurios.DOSexe .9a | 8.9 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 64.4 | 7 / 35 | 2882 |
| 2 | 3 | 60.9 | 74.3 | 8 / 35 | 2894 |
| 3 | 3 | 58.9 | 70.8 | 2 / 35 | 2669 |
| 4 | 3 | 61.1 | 76.2 | 6 / 35 | 3007 |
| 5 | 3 | 57.3 | 64.1 | 3 / 35 | 2767 |
| 6 | 3 | 59.2 | 70.5 | 5 / 35 | 2915 |
| 7 | 3 | 58.4 | 68.3 | 1 / 35 | 2802 |
| 8 | 3 | 59.4 | 67.9 | 7 / 35 | 3197 |
| 9 | 4 | 56.3 | 63.2 | 1 / 35 | 2588 |
| 10 | 3 | 61.9 | 77.5 | 6 / 35 | 2983 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 68 | 38% |
| rsalesc.melee.Medina 0.4.5 | 39 | 26% |
| cx.Princess 1.0 | 10 | 50% |
| mz.MicroSheep 1.0 | 5 | 20% |
| sadoner.killer 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 0% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 304 of 350 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 120 | 39% | 147 |
| rsalesc.melee.Medina 0.4.5 | 83 | 27% | 91 |
| mz.MicroSheep 1.0 | 29 | 10% | 29 |
| sadoner.killer 0.2 | 25 | 8% | 29 |
| cx.Princess 1.0 | 25 | 8% | 29 |
| arthord.NanoSatanMelee Beta | 12 | 4% | 14 |
| jeremyreeder.collective.Prophet 5 | 6 | 2% | 6 |
| kurios.DOSexe .9a | 2 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |

