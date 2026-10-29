# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 74.2 | 49 / 350 | 3.33 | 14.0% | 38360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 236 |
| hadur117.nano.SanaroD10 0.1 | 2.2 | 14.0% | 49 |
| mz.MicroGodMelee 1 | 3.8 | 11.3% | 13 |
| sgp.JollyNinja 3.53 | 3.9 | 11.8% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.2% | 11 |
| lorneswork.Predator 1.0 | 5.9 | 9.7% | 10 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.8% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 70.2 | 5 / 35 | 3618 |
| 2 | 2 | 61.5 | 72.7 | 7 / 35 | 3637 |
| 3 | 2 | 62.5 | 75.2 | 2 / 35 | 4137 |
| 4 | 2 | 61.7 | 77.5 | 3 / 35 | 3597 |
| 5 | 3 | 59.1 | 67.0 | 3 / 35 | 3681 |
| 6 | 2 | 62.6 | 77.1 | 7 / 35 | 3953 |
| 7 | 2 | 62.8 | 77.8 | 5 / 35 | 3893 |
| 8 | 2 | 63.8 | 78.1 | 9 / 35 | 4214 |
| 9 | 2 | 62.5 | 76.5 | 4 / 35 | 3892 |
| 10 | 3 | 60.3 | 69.5 | 4 / 35 | 3738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 139 | 12% |
| mz.MicroGodMelee 1 | 17 | 76% |
| sgp.JollyNinja 3.53 | 14 | 64% |
| lorneswork.Predator 1.0 | 9 | 56% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 56% |
| adt.Ar2 1.0 | 1 | 0% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 1124. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 174 | 58% | 192 |
| sgp.JollyNinja 3.53 | 38 | 13% | 46 |
| lorneswork.Predator 1.0 | 30 | 10% | 35 |
| mz.MicroGodMelee 1 | 23 | 8% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 8% | 27 |
| adt.Ar2 1.0 | 7 | 2% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 5 |
| mym.EdgeStalker 1.0 | 2 | 1% | 3 |
| skm.butterfly 1.0 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 66.9 | 66 / 350 | 3.98 | 14.1% | 43504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.8 | 15.0% | 106 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.9 | 14.6% | 77 |
| hadur117.nano.SanaroD10 0.1 | 2.3 | 14.1% | 66 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 11.0% | 8 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.9 | 10.4% | 34 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.3% | 4 |
| sch.Simone 0.3d | 7.3 | 8.0% | 20 |
| Noran.BitchingElk 0.054 | 7.7 | 7.5% | 19 |
| stelo.PatternRobot 1.0 | 8.6 | 6.6% | 14 |
| fullsail.SweetTea 1.1 | 9.9 | 4.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 69.5 | 11 / 35 | 4201 |
| 2 | 2 | 61.4 | 67.9 | 10 / 35 | 4178 |
| 3 | 2 | 61.8 | 69.2 | 7 / 35 | 4526 |
| 4 | 3 | 56.5 | 58.7 | 2 / 35 | 3885 |
| 5 | 2 | 61.1 | 67.0 | 5 / 35 | 4499 |
| 6 | 3 | 59.3 | 62.5 | 6 / 35 | 4139 |
| 7 | 1 | 63.6 | 77.5 | 7 / 35 | 4613 |
| 8 | 1 | 62.3 | 71.4 | 8 / 35 | 4511 |
| 9 | 3 | 60.6 | 64.1 | 5 / 35 | 4540 |
| 10 | 3 | 59.2 | 61.3 | 5 / 35 | 4412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 55 | 55% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 34 | 29% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 50% |
| sch.Simone 0.3d | 11 | 45% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 78% |
| Noran.BitchingElk 0.054 | 8 | 50% |
| stelo.PatternRobot 1.0 | 5 | 20% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |
| fullsail.SweetTea 1.1 | 2 | 0% |

Hadur died in 286 of 350 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 80 | 28% | 91 |
| pulsar.PulsarMax 0.8.9 | 64 | 22% | 91 |
| com.cohesiva.robocode.ManOwaR 1.0 | 31 | 11% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 31 | 11% | 35 |
| sch.Simone 0.3d | 25 | 9% | 33 |
| stelo.PatternRobot 1.0 | 20 | 7% | 21 |
| fnc.bandit.Bandit 5.2.0 | 14 | 5% | 15 |
| Noran.BitchingElk 0.054 | 11 | 4% | 16 |
| fullsail.SweetTea 1.1 | 9 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 78.8 | 74 / 350 | 2.91 | 15.0% | 40501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.9 | 15.1% | 97 |
| hadur117.nano.SanaroD10 0.1 | 2.0 | 15.0% | 74 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.8% | 70 |
| vuen.Cake 2.51 | 3.1 | 13.9% | 93 |
| urdos.URDOS 1.3 | 5.0 | 10.4% | 12 |
| adt.Ar1 2.1 | 6.6 | 7.5% | 2 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.9% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 7.1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.6 | 5.9% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 81.6 | 6 / 35 | 3817 |
| 2 | 2 | 62.7 | 79.7 | 9 / 35 | 3860 |
| 3 | 1 | 64.0 | 79.7 | 11 / 35 | 4329 |
| 4 | 1 | 63.4 | 79.4 | 8 / 35 | 4467 |
| 5 | 3 | 62.1 | 76.5 | 8 / 35 | 3932 |
| 6 | 2 | 63.5 | 80.0 | 9 / 35 | 4188 |
| 7 | 2 | 62.3 | 78.1 | 6 / 35 | 3991 |
| 8 | 3 | 61.8 | 76.2 | 6 / 35 | 3881 |
| 9 | 3 | 61.2 | 77.8 | 4 / 35 | 3772 |
| 10 | 2 | 63.5 | 78.7 | 7 / 35 | 4264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 64 | 47% |
| vuen.Cake 2.51 | 63 | 40% |
| kawigi.nano.Lib 1.0 | 37 | 19% |
| urdos.URDOS 1.3 | 10 | 60% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 0% |
| adt.Ar1 2.1 | 1 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 80 | 29% | 101 |
| kawigi.nano.Lib 1.0 | 80 | 29% | 91 |
| vuen.Cake 2.51 | 50 | 18% | 74 |
| urdos.URDOS 1.3 | 38 | 14% | 44 |
| adt.Ar1 2.1 | 9 | 3% | 10 |
| oa.weak.FlyMk1 0.1 | 6 | 2% | 9 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 5 | 2% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 4 | 1% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 72.6 | 7 / 350 | 3.47 | 14.2% | 45372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.1% | 325 |
| hadur117.nano.SanaroD10 0.1 | 2.5 | 14.2% | 7 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 14.1% | 11 |
| TNT.TNT 0.99.1 | 4.1 | 10.3% | 3 |
| josago.Jorgito 0.16 | 4.9 | 9.1% | 2 |
| css.Delitioner 0.11 | 6.2 | 7.6% | 2 |
| tj.zombie1n 1.0.1 | 6.8 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 74.6 | 1 / 35 | 4589 |
| 2 | 3 | 63.0 | 72.4 | 1 / 35 | 4476 |
| 3 | 3 | 62.9 | 73.7 | 1 / 35 | 4207 |
| 4 | 2 | 63.6 | 73.0 | 2 / 35 | 4875 |
| 5 | 2 | 63.1 | 73.3 | 0 / 35 | 4550 |
| 6 | 2 | 62.8 | 71.7 | 0 / 35 | 4689 |
| 7 | 3 | 63.5 | 74.0 | 1 / 35 | 4636 |
| 8 | 3 | 61.5 | 67.6 | 1 / 35 | 4249 |
| 9 | 2 | 63.5 | 74.6 | 0 / 35 | 4718 |
| 10 | 3 | 61.9 | 71.1 | 0 / 35 | 4383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 139 | 1% |
| apc.LeeroyJenkins2 1.0 | 5 | 40% |
| css.Delitioner 0.11 | 2 | 50% |
| josago.Jorgito 0.16 | 1 | 100% |
| TNT.TNT 0.99.1 | 1 | 100% |

Hadur died in 343 of 350 rounds, at a mean tick of 1198. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 217 | 63% | 219 |
| apc.LeeroyJenkins2 1.0 | 54 | 16% | 56 |
| josago.Jorgito 0.16 | 26 | 8% | 26 |
| TNT.TNT 0.99.1 | 19 | 6% | 21 |
| css.Delitioner 0.11 | 12 | 3% | 13 |
| rampancy.Durandal 2.1d | 6 | 2% | 6 |
| tj.zombie1n 1.0.1 | 6 | 2% | 6 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 67.3 | 64 / 350 | 3.94 | 13.1% | 33719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.6% | 89 |
| origin.SleepSiphon 1.7b | 2.2 | 14.3% | 106 |
| hadur117.nano.SanaroD10 0.1 | 3.2 | 13.1% | 64 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.4 | 13.0% | 49 |
| mld.Wisdom 1.0 | 5.0 | 10.8% | 19 |
| gg.Wolverine 2.0 | 6.2 | 8.9% | 14 |
| spinnercat.Omen 1.0 | 7.1 | 7.7% | 1 |
| DBall.NUKE 0.1 | 8.0 | 7.1% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.7 | 6.5% | 5 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 70.2 | 7 / 35 | 3661 |
| 2 | 2 | 60.2 | 68.9 | 8 / 35 | 3415 |
| 3 | 3 | 58.6 | 66.0 | 6 / 35 | 3232 |
| 4 | 4 | 60.1 | 69.2 | 7 / 35 | 3258 |
| 5 | 3 | 57.8 | 63.5 | 5 / 35 | 3288 |
| 6 | 3 | 59.0 | 66.0 | 7 / 35 | 3180 |
| 7 | 4 | 58.1 | 63.5 | 6 / 35 | 3227 |
| 8 | 3 | 58.2 | 63.2 | 4 / 35 | 3693 |
| 9 | 4 | 59.7 | 70.8 | 6 / 35 | 3070 |
| 10 | 3 | 61.5 | 71.7 | 8 / 35 | 3695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 41 | 49% |
| origin.SleepSiphon 1.7b | 35 | 46% |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 52% |
| mld.Wisdom 1.0 | 11 | 27% |
| gg.Wolverine 2.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 288 of 350 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 73 | 25% | 88 |
| origin.SleepSiphon 1.7b | 59 | 20% | 81 |
| pe.minimelee.SandboxMiniMelee 1.1 | 56 | 19% | 68 |
| mld.Wisdom 1.0 | 56 | 19% | 59 |
| gg.Wolverine 2.0 | 14 | 5% | 18 |
| spinnercat.Omen 1.0 | 12 | 4% | 12 |
| DBall.NUKE 0.1 | 9 | 3% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 3% | 13 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.5 | 110 / 350 | 2.85 | 16.3% | 47943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.4 | 17.9% | 101 |
| rtk.Tachikoma 1.0 | 1.8 | 17.3% | 81 |
| hadur117.nano.SanaroD10 0.1 | 2.8 | 16.3% | 110 |
| oog.melee.CapuletDroid 1.1 | 4.4 | 12.0% | 21 |
| franzor.Lizt 1.3.1 | 4.6 | 11.6% | 37 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.4% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.8 | 71.4 | 6 / 35 | 4450 |
| 2 | 3 | 66.9 | 81.0 | 8 / 35 | 5356 |
| 3 | 3 | 67.1 | 80.6 | 10 / 35 | 4959 |
| 4 | 3 | 67.7 | 81.9 | 16 / 35 | 4768 |
| 5 | 3 | 66.1 | 77.8 | 13 / 35 | 4386 |
| 6 | 1 | 67.9 | 81.9 | 14 / 35 | 5151 |
| 7 | 3 | 66.7 | 80.0 | 12 / 35 | 4605 |
| 8 | 3 | 66.2 | 79.4 | 9 / 35 | 4645 |
| 9 | 3 | 66.5 | 77.5 | 12 / 35 | 4982 |
| 10 | 3 | 67.4 | 83.5 | 10 / 35 | 4641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 102 | 68% |
| rsalesc.melee.Monk 0.3.6c | 44 | 14% |
| oog.melee.CapuletDroid 1.1 | 30 | 73% |
| franzor.Lizt 1.3.1 | 13 | 85% |
| exauge.GateKeeper 1.1.121g | 2 | 50% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 240 of 350 rounds, at a mean tick of 1156. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 94 | 39% | 169 |
| rsalesc.melee.Monk 0.3.6c | 93 | 39% | 102 |
| oog.melee.CapuletDroid 1.1 | 28 | 12% | 48 |
| franzor.Lizt 1.3.1 | 9 | 4% | 8 |
| lrem.micro.MoggFanatic 0.2 | 8 | 3% | 10 |
| exauge.GateKeeper 1.1.121g | 5 | 2% | 7 |
| skm.PateranBotlock2 1.0 | 3 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 63.9 | 63 / 350 | 4.25 | 12.6% | 32492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.1 | 15.3% | 130 |
| shrub.Vapour v159 | 2.3 | 13.7% | 74 |
| hadur117.nano.SanaroD10 0.1 | 2.8 | 12.6% | 63 |
| Krabb.sliNk.Garm 0.9u | 4.6 | 10.7% | 31 |
| com.spp.robocode.MostlyHarmless 010 | 5.1 | 10.0% | 23 |
| m3thos.Eva00 1.1 | 5.9 | 9.3% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.7% | 15 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 6.8% | 4 |
| SHAM.WOW 1.4 | 9.0 | 6.6% | 3 |
| qualidafial.MajorDick 1.0.1 | 9.2 | 6.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.2 | 61.3 | 6 / 35 | 3039 |
| 2 | 2 | 60.0 | 68.9 | 8 / 35 | 3572 |
| 3 | 3 | 54.9 | 59.0 | 3 / 35 | 3041 |
| 4 | 3 | 56.4 | 59.4 | 5 / 35 | 3324 |
| 5 | 2 | 58.7 | 65.7 | 10 / 35 | 3435 |
| 6 | 4 | 56.9 | 64.1 | 5 / 35 | 3030 |
| 7 | 3 | 57.5 | 65.1 | 4 / 35 | 3224 |
| 8 | 3 | 56.9 | 61.0 | 10 / 35 | 3214 |
| 9 | 3 | 58.7 | 66.7 | 7 / 35 | 3211 |
| 10 | 2 | 58.4 | 67.6 | 5 / 35 | 3402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 45 | 42% |
| shrub.Vapour v159 | 24 | 42% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 53% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 82% |
| Krabb.sliNk.Garm 0.9u | 10 | 80% |
| m3thos.Eva00 1.1 | 8 | 50% |
| SHAM.WOW 1.4 | 5 | 60% |
| qualidafial.MajorDick 1.0.1 | 3 | 33% |

Hadur died in 287 of 350 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 78 | 27% | 102 |
| shrub.Vapour v159 | 67 | 23% | 73 |
| com.spp.robocode.MostlyHarmless 010 | 35 | 12% | 48 |
| jwst.DAD.DarkAndDarker 1.1 | 23 | 8% | 29 |
| Krabb.sliNk.Garm 0.9u | 23 | 8% | 28 |
| m3thos.Eva00 1.1 | 23 | 8% | 27 |
| zyx.nano.BacillusComma 1.0 | 20 | 7% | 22 |
| qualidafial.MajorDick 1.0.1 | 12 | 4% | 12 |
| SHAM.WOW 1.4 | 6 | 2% | 9 |

## Melee bench: F09

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 60.2 | 40 / 350 | 4.59 | 11.7% | 29338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.4% | 180 |
| kc.micro.Figment 1.0 | 1.9 | 15.1% | 75 |
| hadur117.nano.SanaroD10 0.1 | 3.7 | 11.7% | 40 |
| yagami.Tidus 0.11 | 4.0 | 11.2% | 2 |
| pedersen.Grishnakh 1.0 | 4.6 | 10.7% | 28 |
| mc2.enemy.Original 0.9 | 5.8 | 9.4% | 22 |
| dft.Calliope 5.6 | 7.0 | 8.1% | 3 |
| step.nanoPri 1.0 | 8.1 | 6.1% | 0 |
| rdm.Dueler 0.4x | 9.3 | 5.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 61.6 | 2 / 35 | 3023 |
| 2 | 3 | 58.3 | 64.4 | 4 / 35 | 3066 |
| 3 | 4 | 54.6 | 55.2 | 3 / 35 | 3022 |
| 4 | 5 | 53.8 | 54.9 | 5 / 35 | 2670 |
| 5 | 5 | 53.9 | 54.0 | 6 / 35 | 2619 |
| 6 | 4 | 57.8 | 61.9 | 4 / 35 | 3326 |
| 7 | 3 | 56.5 | 59.4 | 3 / 35 | 2932 |
| 8 | 3 | 57.3 | 63.8 | 2 / 35 | 2973 |
| 9 | 3 | 57.0 | 61.3 | 3 / 35 | 2930 |
| 10 | 3 | 58.1 | 65.1 | 8 / 35 | 2777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 42 | 38% |
| kc.micro.Figment 1.0 | 35 | 29% |
| mc2.enemy.Original 0.9 | 10 | 10% |
| pedersen.Grishnakh 1.0 | 8 | 75% |
| yagami.Tidus 0.11 | 5 | 100% |
| dft.Calliope 5.6 | 3 | 33% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 310 of 350 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 84 | 27% | 95 |
| positive.Portia 1.26e | 78 | 25% | 95 |
| yagami.Tidus 0.11 | 49 | 16% | 55 |
| mc2.enemy.Original 0.9 | 35 | 11% | 36 |
| pedersen.Grishnakh 1.0 | 27 | 9% | 29 |
| robar.nano.Assertive_Melee 0.2 | 13 | 4% | 13 |
| step.nanoPri 1.0 | 11 | 4% | 12 |
| dft.Calliope 5.6 | 8 | 3% | 10 |
| rdm.Dueler 0.4x | 5 | 2% | 5 |

## Melee bench: F10

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 77.0 | 89 / 350 | 3.07 | 15.2% | 42631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.5 | 15.7% | 107 |
| hadur117.nano.SanaroD10 0.1 | 1.7 | 15.2% | 89 |
| ne.Chimera 1.2 | 3.5 | 13.0% | 44 |
| ejb.Polaris 1.0.1 | 3.7 | 12.8% | 50 |
| tvv.micro.Antares 1.1.1 | 5.1 | 10.8% | 33 |
| vStar.RAFzilla 2.15 | 5.5 | 10.6% | 19 |
| sam.Samspin 1.0 | 7.6 | 6.3% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.7% | 1 |
| kurios.DOSexe .9b | 8.7 | 5.4% | 4 |
| donjezza.Muncho 1.0 | 9.5 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 74.3 | 11 / 35 | 4057 |
| 2 | 3 | 62.0 | 74.0 | 9 / 35 | 3722 |
| 3 | 2 | 64.3 | 79.4 | 8 / 35 | 4579 |
| 4 | 2 | 64.2 | 80.0 | 9 / 35 | 4468 |
| 5 | 1 | 64.8 | 81.0 | 11 / 35 | 4536 |
| 6 | 1 | 63.4 | 77.1 | 7 / 35 | 4288 |
| 7 | 2 | 61.9 | 73.3 | 8 / 35 | 3962 |
| 8 | 2 | 61.1 | 68.9 | 9 / 35 | 4145 |
| 9 | 1 | 65.2 | 83.5 | 8 / 35 | 4604 |
| 10 | 2 | 63.6 | 78.1 | 9 / 35 | 4270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 57 | 30% |
| ejb.Polaris 1.0.1 | 45 | 78% |
| ne.Chimera 1.2 | 28 | 32% |
| vStar.RAFzilla 2.15 | 22 | 68% |
| tvv.micro.Antares 1.1.1 | 19 | 37% |
| donjezza.Muncho 1.0 | 5 | 60% |
| kurios.DOSexe .9b | 4 | 25% |
| sam.Samspin 1.0 | 3 | 67% |

Hadur died in 261 of 350 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 89 | 34% | 102 |
| ne.Chimera 1.2 | 70 | 27% | 80 |
| ejb.Polaris 1.0.1 | 32 | 12% | 69 |
| tvv.micro.Antares 1.1.1 | 28 | 11% | 30 |
| vStar.RAFzilla 2.15 | 18 | 7% | 35 |
| sam.Samspin 1.0 | 8 | 3% | 12 |
| kurios.DOSexe .9b | 6 | 2% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 2% | 6 |
| donjezza.Muncho 1.0 | 4 | 2% | 6 |

## Melee bench: F11

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 60.8 | 40 / 350 | 4.53 | 12.0% | 31710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.6% | 160 |
| cx.mini.Nimrod 0.55 | 2.2 | 13.2% | 54 |
| hadur117.nano.SanaroD10 0.1 | 3.1 | 12.0% | 40 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 23 |
| br2.MobyDickBot 1.6 | 5.9 | 9.5% | 23 |
| rdt199.Warlord 0.73 | 5.9 | 9.4% | 20 |
| uji.YellohFellah 1.0 | 6.0 | 9.2% | 30 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.5% | 3 |
| stelo.MirrorNano 1.3 | 9.5 | 5.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.2 | 60.6 | 6 / 35 | 2939 |
| 2 | 3 | 57.6 | 64.4 | 6 / 35 | 2874 |
| 3 | 2 | 59.3 | 68.3 | 3 / 35 | 3424 |
| 4 | 6 | 51.7 | 52.1 | 0 / 35 | 2809 |
| 5 | 2 | 56.2 | 61.0 | 5 / 35 | 3137 |
| 6 | 3 | 57.3 | 59.7 | 6 / 35 | 3344 |
| 7 | 3 | 57.1 | 62.9 | 4 / 35 | 3117 |
| 8 | 3 | 55.0 | 55.9 | 2 / 35 | 3444 |
| 9 | 3 | 56.9 | 59.7 | 5 / 35 | 3320 |
| 10 | 3 | 57.3 | 63.5 | 3 / 35 | 3302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 45 | 49% |
| cx.mini.Nimrod 0.55 | 13 | 38% |
| uji.YellohFellah 1.0 | 11 | 0% |
| djc.DynaBot 0.1.1 | 9 | 56% |
| br2.MobyDickBot 1.6 | 6 | 33% |
| rdt199.Warlord 0.73 | 5 | 80% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 310 of 350 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 107 | 35% | 128 |
| cx.mini.Nimrod 0.55 | 56 | 18% | 58 |
| djc.DynaBot 0.1.1 | 31 | 10% | 36 |
| uji.YellohFellah 1.0 | 31 | 10% | 32 |
| rdt199.Warlord 0.73 | 27 | 9% | 33 |
| br2.MobyDickBot 1.6 | 22 | 7% | 25 |
| KiraNL.Chupacabra 0.4 | 13 | 4% | 15 |
| stelo.MirrorNano 1.3 | 13 | 4% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 3% | 9 |

## Melee bench: F12

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 63.2 | 45 / 350 | 4.31 | 12.2% | 29775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.5 | 14.5% | 106 |
| bts.wiki.RipCurl 0.9b | 2.1 | 14.4% | 77 |
| darkcanuck.Leon 1.01 | 2.5 | 13.7% | 73 |
| hadur117.nano.SanaroD10 0.1 | 4.1 | 12.2% | 45 |
| brainfade.melee.Genghis 0.36 | 4.8 | 11.0% | 26 |
| jrm.Test0 1.0 | 6.9 | 7.7% | 2 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.6% | 2 |
| jp.Perpy 16.0 | 7.4 | 7.3% | 7 |
| jaybot.bots.Oddball 4.0 | 8.6 | 6.4% | 12 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.2 | 63.8 | 4 / 35 | 3104 |
| 2 | 4 | 53.6 | 55.6 | 3 / 35 | 2741 |
| 3 | 4 | 57.1 | 62.5 | 6 / 35 | 3057 |
| 4 | 3 | 59.7 | 70.2 | 5 / 35 | 3028 |
| 5 | 4 | 56.9 | 64.4 | 3 / 35 | 2811 |
| 6 | 4 | 56.0 | 60.3 | 3 / 35 | 2876 |
| 7 | 4 | 58.9 | 68.3 | 5 / 35 | 3161 |
| 8 | 5 | 55.5 | 57.8 | 3 / 35 | 3236 |
| 9 | 4 | 57.5 | 64.1 | 7 / 35 | 2767 |
| 10 | 5 | 58.0 | 64.8 | 6 / 35 | 2994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 33 | 24% |
| darkcanuck.Leon 1.01 | 27 | 22% |
| bts.wiki.RipCurl 0.9b | 27 | 41% |
| brainfade.melee.Genghis 0.36 | 14 | 64% |
| jaybot.bots.Oddball 4.0 | 5 | 40% |
| cs.sheldor.Talon 1.1 | 5 | 80% |
| jp.Perpy 16.0 | 3 | 100% |
| jrm.Test0 1.0 | 2 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 78 | 26% | 90 |
| bts.wiki.RipCurl 0.9b | 63 | 21% | 72 |
| darkcanuck.Leon 1.01 | 51 | 17% | 59 |
| brainfade.melee.Genghis 0.36 | 37 | 12% | 42 |
| cs.sheldor.Talon 1.1 | 24 | 8% | 27 |
| jrm.Test0 1.0 | 15 | 5% | 19 |
| jp.Perpy 16.0 | 15 | 5% | 16 |
| jaybot.bots.Oddball 4.0 | 14 | 5% | 17 |
| stuff.Vlad 0.1 | 8 | 3% | 8 |

## Melee bench: F13

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 70.5 | 38 / 350 | 3.65 | 13.1% | 34295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.0% | 158 |
| ags.Glacier 0.2.11 | 1.5 | 16.8% | 91 |
| hadur117.nano.SanaroD10 0.1 | 3.4 | 13.1% | 38 |
| shinh.Entangled 0.3 | 4.2 | 12.5% | 38 |
| gh.micro.Gruweltje 0.7 | 4.4 | 12.2% | 24 |
| apc.Colossus2 0.17 | 6.2 | 8.5% | 1 |
| stelo.Wang 1.0 | 7.0 | 6.7% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 67.0 | 8 / 35 | 3531 |
| 2 | 4 | 60.0 | 72.1 | 3 / 35 | 3284 |
| 3 | 4 | 57.8 | 64.4 | 4 / 35 | 2961 |
| 4 | 3 | 60.8 | 72.1 | 2 / 35 | 3763 |
| 5 | 3 | 59.8 | 69.2 | 3 / 35 | 3440 |
| 6 | 3 | 59.7 | 72.1 | 2 / 35 | 3092 |
| 7 | 3 | 61.4 | 72.7 | 3 / 35 | 3527 |
| 8 | 4 | 59.3 | 66.0 | 4 / 35 | 3640 |
| 9 | 3 | 61.6 | 75.2 | 4 / 35 | 3450 |
| 10 | 4 | 61.4 | 74.6 | 5 / 35 | 3607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 61 | 25% |
| ags.Glacier 0.2.11 | 47 | 13% |
| shinh.Entangled 0.3 | 26 | 35% |
| gh.micro.Gruweltje 0.7 | 8 | 50% |
| stelo.Wang 1.0 | 3 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 103 | 33% | 108 |
| mn.Combat 3.25.0 | 94 | 30% | 108 |
| shinh.Entangled 0.3 | 40 | 13% | 52 |
| gh.micro.Gruweltje 0.7 | 38 | 12% | 41 |
| stelo.Wang 1.0 | 20 | 6% | 23 |
| maribo.FollowFire 1 | 7 | 2% | 7 |
| apc.Colossus2 0.17 | 6 | 2% | 7 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 75.2 | 79 / 350 | 3.23 | 14.2% | 34762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.6% | 151 |
| hadur117.nano.SanaroD10 0.1 | 2.0 | 14.2% | 79 |
| catcat20.shape.Theta 0.018 | 3.3 | 12.5% | 58 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.1 | 10.4% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 5.4 | 10.2% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.7% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 5.9 | 9.8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.1% | 18 |
| pa.Improved 1.0 | 9.0 | 5.3% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 75.6 | 8 / 35 | 3424 |
| 2 | 2 | 61.4 | 72.7 | 5 / 35 | 3736 |
| 3 | 2 | 62.1 | 74.9 | 8 / 35 | 3514 |
| 4 | 2 | 63.5 | 78.1 | 12 / 35 | 3498 |
| 5 | 2 | 62.8 | 77.8 | 9 / 35 | 3602 |
| 6 | 2 | 60.2 | 72.4 | 6 / 35 | 3344 |
| 7 | 2 | 62.1 | 74.9 | 11 / 35 | 3561 |
| 8 | 2 | 60.9 | 73.0 | 7 / 35 | 3343 |
| 9 | 2 | 62.9 | 78.1 | 7 / 35 | 3468 |
| 10 | 2 | 61.3 | 74.9 | 6 / 35 | 3272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 99 | 33% |
| catcat20.shape.Theta 0.018 | 42 | 64% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 44% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 78% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 71% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 25% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 33% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 271 of 350 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 124 | 46% | 157 |
| catcat20.shape.Theta 0.018 | 39 | 14% | 62 |
| dmh.robocode.robot.RedDwarf 0.4 | 29 | 11% | 32 |
| sanyi.mikrobi.Roberto 1.0 | 25 | 9% | 32 |
| sheldor.micro.PointInLineRRAL 1.0 | 23 | 8% | 29 |
| Lo_Ian.Gandalf_V4 4.0 | 18 | 7% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 4% | 14 |
| pa.Improved 1.0 | 1 | 0% | 3 |

## Melee bench: F15

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 60.4 | 35 / 350 | 4.56 | 12.1% | 35923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.5 | 15.2% | 84 |
| emp.Yngwie 1.11 | 2.2 | 13.9% | 108 |
| mld.DustBunny 3.8 | 3.0 | 13.1% | 44 |
| hadur117.nano.SanaroD10 0.1 | 3.8 | 12.1% | 35 |
| cb.nano.Insomnia 1.0 | 5.1 | 11.0% | 21 |
| kawigi.robot.Girl 1.2 | 5.4 | 10.7% | 50 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.1% | 2 |
| lambdaxy.TBot 0.1 | 7.6 | 6.9% | 0 |
| divineomega.TrialBot 0.003 | 8.9 | 5.9% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.2 | 58.1 | 3 / 35 | 3579 |
| 2 | 4 | 58.5 | 62.5 | 4 / 35 | 3924 |
| 3 | 5 | 54.6 | 54.9 | 3 / 35 | 3371 |
| 4 | 4 | 57.0 | 62.2 | 3 / 35 | 3349 |
| 5 | 4 | 57.9 | 61.0 | 5 / 35 | 3686 |
| 6 | 5 | 54.3 | 55.2 | 3 / 35 | 3064 |
| 7 | 2 | 58.5 | 65.4 | 2 / 35 | 3822 |
| 8 | 4 | 56.8 | 58.7 | 5 / 35 | 3425 |
| 9 | 3 | 59.0 | 61.3 | 4 / 35 | 4243 |
| 10 | 3 | 58.0 | 65.1 | 3 / 35 | 3460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 34 | 12% |
| emp.Yngwie 1.11 | 26 | 42% |
| cb.nano.Insomnia 1.0 | 15 | 53% |
| mld.DustBunny 3.8 | 10 | 40% |
| kawigi.robot.Girl 1.2 | 10 | 70% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 315 of 350 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 85 | 27% | 90 |
| emp.Yngwie 1.11 | 64 | 20% | 79 |
| mld.DustBunny 3.8 | 55 | 17% | 64 |
| cb.nano.Insomnia 1.0 | 40 | 13% | 34 |
| kawigi.robot.Girl 1.2 | 33 | 10% | 41 |
| Grystrion.TrackerWO 1.0 | 19 | 6% | 20 |
| divineomega.TrialBot 0.003 | 9 | 3% | 10 |
| lambdaxy.TBot 0.1 | 6 | 2% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 4 | 1% | 4 |

## Melee bench: F16

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 61.7 | 22 / 350 | 4.45 | 12.6% | 39758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.5% | 186 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.1 | 15.1% | 30 |
| hadur117.nano.SanaroD10 0.1 | 3.0 | 12.6% | 22 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.1% | 68 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.6% | 25 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.1% | 7 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.6% | 2 |
| asd.Cthulhu 1.3 | 8.9 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.9 | 5.7% | 8 |
| repositorio.NanoStep 1.0 | 9.1 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 61.0 | 2 / 35 | 4213 |
| 2 | 3 | 56.7 | 56.2 | 0 / 35 | 3998 |
| 3 | 4 | 56.7 | 57.1 | 1 / 35 | 3906 |
| 4 | 3 | 57.3 | 61.0 | 2 / 35 | 3608 |
| 5 | 2 | 61.3 | 67.6 | 6 / 35 | 4385 |
| 6 | 3 | 60.3 | 67.6 | 3 / 35 | 3855 |
| 7 | 3 | 57.9 | 61.9 | 1 / 35 | 3698 |
| 8 | 3 | 58.9 | 61.6 | 3 / 35 | 4090 |
| 9 | 3 | 58.1 | 62.5 | 2 / 35 | 3839 |
| 10 | 3 | 59.1 | 60.6 | 2 / 35 | 4166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 70 | 6% |
| techdude.forest.FlamingForest 1.1 | 14 | 29% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 57% |
| tvv.nano.Polaris 1.2 | 8 | 38% |
| stelo.IntrinsicVolatility 1.4 | 2 | 50% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| bvh.fnr.Fenrir 0.36l | 1 | 0% |

Hadur died in 328 of 350 rounds, at a mean tick of 1082. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 148 | 45% | 155 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 71 | 22% | 77 |
| bvh.fnr.Fenrir 0.36l | 37 | 11% | 37 |
| techdude.forest.FlamingForest 1.1 | 29 | 9% | 31 |
| tvv.nano.Polaris 1.2 | 14 | 4% | 16 |
| stelo.IntrinsicVolatility 1.4 | 12 | 4% | 15 |
| asd.Cthulhu 1.3 | 9 | 3% | 9 |
| divineomega.DivineBot 1.9.4.5 | 6 | 2% | 8 |
| repositorio.NanoStep 1.0 | 2 | 1% | 2 |

## Melee bench: F17

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 61.0 | 49 / 350 | 4.51 | 12.4% | 36663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.0 | 13.9% | 70 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.0% | 84 |
| cx.BlestPain 1.41 | 2.6 | 13.6% | 75 |
| hadur117.nano.SanaroD10 0.1 | 4.1 | 12.4% | 49 |
| nic.Nicator 2.4 | 5.0 | 11.9% | 35 |
| ahf.NanoAndrew .4 | 5.3 | 11.3% | 33 |
| maribo.melee.BMV 0.1 | 7.0 | 8.6% | 2 |
| tex.Longbot 0.4 | 8.2 | 5.8% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 68.9 | 4 / 35 | 4085 |
| 2 | 3 | 57.9 | 61.0 | 5 / 35 | 3757 |
| 3 | 5 | 57.2 | 58.4 | 4 / 35 | 3796 |
| 4 | 6 | 56.3 | 55.6 | 5 / 35 | 3572 |
| 5 | 5 | 59.2 | 62.2 | 6 / 35 | 4041 |
| 6 | 2 | 61.4 | 70.5 | 5 / 35 | 3973 |
| 7 | 6 | 52.5 | 49.8 | 4 / 35 | 3023 |
| 8 | 3 | 58.6 | 61.6 | 6 / 35 | 3743 |
| 9 | 4 | 59.3 | 65.1 | 6 / 35 | 3486 |
| 10 | 5 | 55.5 | 57.1 | 4 / 35 | 3187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 43% |
| et.Predator 1.8 | 27 | 26% |
| cx.BlestPain 1.41 | 24 | 67% |
| nic.Nicator 2.4 | 14 | 50% |
| ahf.NanoAndrew .4 | 10 | 20% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| goblin.Bender 2.4 | 1 | 0% |

Hadur died in 301 of 350 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 65 | 22% | 72 |
| cx.BlestPain 1.41 | 52 | 17% | 69 |
| oog.melee.Mercutio 1.0 | 52 | 17% | 68 |
| ahf.NanoAndrew .4 | 51 | 17% | 54 |
| nic.Nicator 2.4 | 37 | 12% | 40 |
| maribo.melee.BMV 0.1 | 25 | 8% | 26 |
| edu.otg.spr.TheTeacher 1.2 | 7 | 2% | 8 |
| tex.Longbot 0.4 | 7 | 2% | 7 |
| goblin.Bender 2.4 | 5 | 2% | 6 |

## Melee bench: F18

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 66.9 | 70 / 350 | 3.98 | 13.5% | 36612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.7 | 13.8% | 77 |
| hadur117.nano.SanaroD10 0.1 | 2.1 | 13.5% | 70 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.4% | 66 |
| uji.DBH 1.1 | 3.5 | 12.0% | 39 |
| spinnercat.Robovirus 2.718 | 5.2 | 10.8% | 26 |
| ratosh.Nobo 0.21 | 5.5 | 10.5% | 15 |
| sigterm.Sigterm 1.0 | 7.1 | 9.0% | 33 |
| kawigi.mini.Fhqwhgads 1.1 | 8.1 | 7.2% | 5 |
| stelo.WangRobot 1.0 | 9.2 | 5.9% | 18 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.6 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 72.7 | 11 / 35 | 4022 |
| 2 | 1 | 62.5 | 72.7 | 11 / 35 | 4067 |
| 3 | 4 | 56.3 | 58.4 | 5 / 35 | 3642 |
| 4 | 2 | 58.7 | 66.7 | 4 / 35 | 3500 |
| 5 | 2 | 58.0 | 66.7 | 6 / 35 | 3313 |
| 6 | 1 | 58.7 | 64.4 | 7 / 35 | 3688 |
| 7 | 2 | 60.8 | 71.7 | 6 / 35 | 3747 |
| 8 | 3 | 58.6 | 62.9 | 7 / 35 | 3757 |
| 9 | 2 | 60.1 | 68.6 | 8 / 35 | 3600 |
| 10 | 3 | 57.4 | 63.8 | 5 / 35 | 3276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 43 | 60% |
| agd.Mooserwirt2 2.7 | 26 | 42% |
| spinnercat.Robovirus 2.718 | 23 | 70% |
| uji.DBH 1.1 | 23 | 30% |
| sigterm.Sigterm 1.0 | 15 | 47% |
| ratosh.Nobo 0.21 | 8 | 13% |
| stelo.WangRobot 1.0 | 5 | 0% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 50% |

Hadur died in 280 of 350 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 79 | 28% | 105 |
| uji.DBH 1.1 | 43 | 15% | 50 |
| ratosh.Nobo 0.21 | 38 | 14% | 41 |
| agd.Mooserwirt2 2.7 | 37 | 13% | 48 |
| spinnercat.Robovirus 2.718 | 29 | 10% | 40 |
| sigterm.Sigterm 1.0 | 26 | 9% | 32 |
| kawigi.mini.Fhqwhgads 1.1 | 13 | 5% | 18 |
| stelo.WangRobot 1.0 | 10 | 4% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 2% | 6 |

## Melee bench: F19

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.8 | 84 / 350 | 2.91 | 15.7% | 42149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.7 | 16.6% | 111 |
| mld.Infinity 2.2 | 2.1 | 15.9% | 116 |
| hadur117.nano.SanaroD10 0.1 | 2.2 | 15.7% | 84 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.0% | 12 |
| erdnis.Rover 0.3 | 4.8 | 10.4% | 6 |
| patson.PatsonTestBot 1.0 | 5.9 | 8.9% | 6 |
| pac.ABC 2.1 | 7.5 | 7.4% | 13 |
| mbh.Mbh 0.1 | 7.8 | 7.2% | 0 |
| pbg.R2D2 1.0 | 8.7 | 6.1% | 2 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.3 | 76.8 | 8 / 35 | 4259 |
| 2 | 3 | 63.5 | 76.8 | 5 / 35 | 3861 |
| 3 | 2 | 65.3 | 78.4 | 10 / 35 | 4390 |
| 4 | 1 | 65.7 | 77.5 | 12 / 35 | 4658 |
| 5 | 3 | 64.9 | 79.0 | 8 / 35 | 4130 |
| 6 | 2 | 64.5 | 79.0 | 6 / 35 | 4156 |
| 7 | 2 | 65.9 | 82.2 | 11 / 35 | 4280 |
| 8 | 3 | 61.6 | 71.4 | 2 / 35 | 3741 |
| 9 | 2 | 66.1 | 84.4 | 10 / 35 | 4051 |
| 10 | 1 | 66.7 | 82.2 | 12 / 35 | 4623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 88 | 53% |
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 15% |
| krillr.mini.JointStrike 2.0.0 | 9 | 67% |
| erdnis.Rover 0.3 | 7 | 86% |
| patson.PatsonTestBot 1.0 | 5 | 80% |
| mbh.Mbh 0.1 | 4 | 100% |
| pac.ABC 2.1 | 2 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 266 of 350 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 117 | 44% | 161 |
| mld.Infinity 2.2 | 69 | 26% | 41 |
| krillr.mini.JointStrike 2.0.0 | 26 | 10% | 42 |
| erdnis.Rover 0.3 | 21 | 8% | 33 |
| patson.PatsonTestBot 1.0 | 15 | 6% | 24 |
| pac.ABC 2.1 | 10 | 4% | 14 |
| pbg.R2D2 1.0 | 5 | 2% | 13 |
| mbh.Mbh 0.1 | 3 | 1% | 17 |

## Melee bench: F20

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.3 | 59 / 350 | 3.85 | 13.6% | 37392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.3% | 144 |
| hadur117.nano.SanaroD10 0.1 | 2.1 | 13.6% | 59 |
| fwb.Nine 1.0.1 | 3.6 | 12.0% | 54 |
| nz.jdc.nano.GridFu 1.0 | 3.6 | 12.3% | 27 |
| catcat20.Rabbit 0.001 | 5.4 | 10.0% | 28 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 9.0% | 10 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.7% | 12 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.6% | 14 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.6 | 64.1 | 7 / 35 | 3484 |
| 2 | 2 | 60.0 | 68.9 | 5 / 35 | 3672 |
| 3 | 2 | 61.6 | 72.1 | 10 / 35 | 3596 |
| 4 | 2 | 58.2 | 60.6 | 8 / 35 | 3757 |
| 5 | 2 | 60.9 | 72.1 | 2 / 35 | 3743 |
| 6 | 3 | 61.4 | 73.0 | 6 / 35 | 3620 |
| 7 | 2 | 61.0 | 69.8 | 7 / 35 | 4025 |
| 8 | 2 | 60.3 | 69.2 | 2 / 35 | 4097 |
| 9 | 2 | 58.8 | 62.2 | 7 / 35 | 3687 |
| 10 | 2 | 60.9 | 71.4 | 5 / 35 | 3711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 70 | 39% |
| fwb.Nine 1.0.1 | 32 | 50% |
| nz.jdc.nano.GridFu 1.0 | 15 | 13% |
| catcat20.Rabbit 0.001 | 11 | 45% |
| djdjdj.NanoSkunk10 1.0 | 6 | 67% |
| m3thos.mini.Eva01 0.5.5 | 3 | 67% |
| bayen.nut.Squirrel 1.615 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 291 of 350 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 116 | 40% | 135 |
| nz.jdc.nano.GridFu 1.0 | 54 | 19% | 64 |
| fwb.Nine 1.0.1 | 45 | 15% | 41 |
| catcat20.Rabbit 0.001 | 24 | 8% | 32 |
| bayen.nut.Squirrel 1.615 | 19 | 7% | 27 |
| m3thos.mini.Eva01 0.5.5 | 14 | 5% | 21 |
| djdjdj.NanoSkunk10 1.0 | 11 | 4% | 18 |
| ntc.ControlledChaos 1.1.4 | 7 | 2% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% | 4 |

## Melee bench: F21

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 76.2 | 97 / 350 | 3.14 | 15.7% | 44838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.0 | 17.7% | 159 |
| hadur117.nano.SanaroD10 0.1 | 2.3 | 15.7% | 97 |
| dummy.mini.Scimitar 1.01 | 2.7 | 14.8% | 30 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 22 |
| eld.Hmm 1.0 | 5.5 | 8.7% | 29 |
| oa.weak.BotherBot 0.1 | 5.6 | 8.7% | 10 |
| fire219.CatBot 1.0 | 7.7 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 5 |
| PSW.Relentless 0.1 | 8.5 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 75.6 | 12 / 35 | 4818 |
| 2 | 2 | 62.5 | 71.7 | 5 / 35 | 4404 |
| 3 | 3 | 63.4 | 74.3 | 10 / 35 | 4136 |
| 4 | 2 | 64.1 | 76.2 | 10 / 35 | 4218 |
| 5 | 3 | 64.0 | 74.0 | 8 / 35 | 4497 |
| 6 | 3 | 63.6 | 74.9 | 9 / 35 | 4104 |
| 7 | 2 | 65.8 | 82.2 | 9 / 35 | 4524 |
| 8 | 2 | 66.9 | 81.0 | 14 / 35 | 4885 |
| 9 | 2 | 65.1 | 78.1 | 9 / 35 | 4652 |
| 10 | 2 | 64.3 | 74.0 | 11 / 35 | 4600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 111 | 49% |
| dummy.mini.Scimitar 1.01 | 32 | 75% |
| cf.RiO.RiOx 4.2.1 | 14 | 57% |
| eld.Hmm 1.0 | 14 | 36% |
| oa.weak.BotherBot 0.1 | 7 | 71% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 253 of 350 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 85 | 34% | 125 |
| dummy.mini.Scimitar 1.01 | 62 | 25% | 94 |
| cf.RiO.RiOx 4.2.1 | 49 | 19% | 55 |
| oa.weak.BotherBot 0.1 | 16 | 6% | 23 |
| eld.Hmm 1.0 | 13 | 5% | 20 |
| el.JumpShoot 0.2 | 12 | 5% | 14 |
| PSW.Relentless 0.1 | 11 | 4% | 11 |
| fire219.CatBot 1.0 | 4 | 2% | 6 |
| arthord.MannyPacquiao Beta | 1 | 0% | 2 |

## Melee bench: F23

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 80.9 | 95 / 350 | 2.72 | 15.9% | 39603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.7% | 157 |
| hadur117.nano.SanaroD10 0.1 | 2.1 | 15.9% | 95 |
| cre.Karolos 0.32 | 3.1 | 13.8% | 46 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 12.0% | 27 |
| sample.Walls 1.0 | 5.7 | 8.9% | 11 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 9.0% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.4 | 8.8% | 5 |
| cw.megas.Blade 0.8 | 7.9 | 8.1% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 76.8 | 10 / 35 | 3923 |
| 2 | 2 | 66.0 | 80.3 | 10 / 35 | 4259 |
| 3 | 2 | 66.7 | 84.1 | 11 / 35 | 4175 |
| 4 | 2 | 67.3 | 86.0 | 11 / 35 | 4173 |
| 5 | 2 | 63.5 | 77.1 | 6 / 35 | 3881 |
| 6 | 2 | 65.0 | 80.0 | 10 / 35 | 4063 |
| 7 | 2 | 65.3 | 79.7 | 10 / 35 | 4244 |
| 8 | 3 | 64.2 | 78.7 | 6 / 35 | 3360 |
| 9 | 2 | 65.6 | 82.5 | 10 / 35 | 3681 |
| 10 | 2 | 66.0 | 83.2 | 11 / 35 | 3844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 114 | 34% |
| cre.Karolos 0.32 | 28 | 39% |
| sample.Walls 1.0 | 27 | 74% |
| stelo.AreaTargetingBot 1.1 | 23 | 52% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 63% |
| cw.megas.Blade 0.8 | 6 | 83% |
| stelo.RamTrackSurfer 1.2 | 4 | 75% |

Hadur died in 257 of 350 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 139 | 54% | 183 |
| cre.Karolos 0.32 | 44 | 17% | 61 |
| stelo.AreaTargetingBot 1.1 | 35 | 14% | 42 |
| sample.Walls 1.0 | 13 | 5% | 15 |
| stelo.RamTrackSurfer 1.2 | 12 | 5% | 23 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 12 | 5% | 15 |
| cw.megas.Blade 0.8 | 2 | 1% | 8 |

## Melee bench: F24

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.5 | 59.4 | 57 / 350 | 4.65 | 11.5% | 28485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.3 | 14.8% | 97 |
| florent.XSeries.X2 0.12 | 2.5 | 13.5% | 53 |
| davidalves.Phoenix 0.54 | 2.6 | 13.4% | 77 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.0% | 39 |
| hadur117.nano.SanaroD10 0.1 | 4.5 | 11.5% | 57 |
| oog.melee.Corsair 1.0 | 6.3 | 9.4% | 10 |
| stelo.SoJNanoMelee 1.1 | 6.6 | 8.9% | 13 |
| lunchie.Lunchbox 0.93 | 8.1 | 6.3% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 5.5% | 3 |
| evd.X1 0.01 | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 67.3 | 7 / 35 | 2820 |
| 2 | 5 | 55.5 | 59.7 | 5 / 35 | 2935 |
| 3 | 6 | 51.3 | 50.5 | 5 / 35 | 2453 |
| 4 | 4 | 56.7 | 61.6 | 7 / 35 | 3040 |
| 5 | 5 | 56.2 | 60.0 | 4 / 35 | 3061 |
| 6 | 5 | 52.1 | 53.7 | 3 / 35 | 2602 |
| 7 | 5 | 55.0 | 58.4 | 5 / 35 | 2694 |
| 8 | 5 | 54.7 | 58.4 | 3 / 35 | 2861 |
| 9 | 4 | 54.4 | 54.6 | 8 / 35 | 2761 |
| 10 | 3 | 60.4 | 69.8 | 10 / 35 | 3258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 43% |
| davidalves.Phoenix 0.54 | 22 | 55% |
| florent.XSeries.X2 0.12 | 21 | 76% |
| pedersen.Ugluk 1.1.1 | 17 | 47% |
| stelo.SoJNanoMelee 1.1 | 8 | 38% |
| oog.melee.Corsair 1.0 | 5 | 80% |
| as.FrankTheTank 1.3 | 2 | 50% |

Hadur died in 293 of 350 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 73 | 25% | 86 |
| davidalves.Phoenix 0.54 | 58 | 20% | 68 |
| pedersen.Ugluk 1.1.1 | 49 | 17% | 55 |
| florent.XSeries.X2 0.12 | 37 | 13% | 54 |
| stelo.SoJNanoMelee 1.1 | 28 | 10% | 33 |
| oog.melee.Corsair 1.0 | 24 | 8% | 29 |
| as.FrankTheTank 1.3 | 9 | 3% | 9 |
| lunchie.Lunchbox 0.93 | 8 | 3% | 9 |
| evd.X1 0.01 | 7 | 2% | 7 |

## Melee bench: F25

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 64.9 | 49 / 350 | 4.16 | 12.7% | 30204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.4 | 14.4% | 78 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.5% | 58 |
| hadur117.nano.SanaroD10 0.1 | 3.3 | 12.7% | 49 |
| jdw.Hurricane 1.4 | 3.6 | 12.2% | 62 |
| gre.svman4.Morfeas 1.4.1 | 4.5 | 11.3% | 45 |
| ds.Oo 2.2 | 6.4 | 9.2% | 24 |
| gjr.Cephalosporin 0.1 | 6.9 | 8.6% | 27 |
| awesomeness.Elite 1.0 | 8.2 | 7.2% | 3 |
| adt.Ar2 1.1 | 8.5 | 6.6% | 7 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 67.0 | 4 / 35 | 2727 |
| 2 | 4 | 58.5 | 64.8 | 6 / 35 | 3136 |
| 3 | 2 | 59.4 | 67.0 | 7 / 35 | 3191 |
| 4 | 3 | 58.6 | 66.7 | 5 / 35 | 3123 |
| 5 | 4 | 55.9 | 60.0 | 2 / 35 | 3113 |
| 6 | 5 | 53.8 | 56.5 | 3 / 35 | 2538 |
| 7 | 2 | 58.4 | 66.0 | 4 / 35 | 3278 |
| 8 | 4 | 57.6 | 63.8 | 6 / 35 | 2866 |
| 9 | 3 | 59.6 | 68.3 | 5 / 35 | 3166 |
| 10 | 2 | 59.2 | 68.6 | 7 / 35 | 3066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 36 | 22% |
| voidious.mini.BrokenSword 2.0.3 | 34 | 26% |
| jdw.Hurricane 1.4 | 23 | 74% |
| gjr.Cephalosporin 0.1 | 11 | 18% |
| gre.svman4.Morfeas 1.4.1 | 10 | 60% |
| ds.Oo 2.2 | 10 | 40% |
| awesomeness.Elite 1.0 | 5 | 60% |
| adt.Ar2 1.1 | 2 | 0% |

Hadur died in 302 of 350 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 76 | 25% | 83 |
| voidious.micro.BlitzBat 1.05 | 67 | 22% | 77 |
| jdw.Hurricane 1.4 | 44 | 15% | 61 |
| gre.svman4.Morfeas 1.4.1 | 35 | 12% | 40 |
| ds.Oo 2.2 | 22 | 7% | 28 |
| gjr.Cephalosporin 0.1 | 20 | 7% | 22 |
| adt.Ar2 1.1 | 19 | 6% | 19 |
| awesomeness.Elite 1.0 | 13 | 4% | 13 |
| amk.ChumbaMini 0.2 | 6 | 2% | 6 |

## Melee bench: F26

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 69.5 | 51 / 350 | 3.75 | 13.6% | 40299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.7% | 142 |
| hadur117.nano.SanaroD10 0.1 | 2.7 | 13.6% | 51 |
| shu.nitro.LENIN .T34 | 3.2 | 12.8% | 63 |
| lrem.Spectre 0.4.4 | 3.9 | 12.2% | 46 |
| js.PinBall 1.6 | 4.6 | 11.6% | 25 |
| gh.mini.GrubbmOne 1.0 | 5.7 | 10.6% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 9.2% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 1 |
| sample.SpinBot 1.0 | 9.0 | 5.3% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 63.8 | 4 / 35 | 3909 |
| 2 | 2 | 60.3 | 68.9 | 5 / 35 | 3986 |
| 3 | 2 | 62.1 | 71.1 | 8 / 35 | 4207 |
| 4 | 4 | 59.1 | 67.0 | 2 / 35 | 3592 |
| 5 | 4 | 60.0 | 66.7 | 7 / 35 | 3887 |
| 6 | 2 | 62.9 | 73.3 | 6 / 35 | 4253 |
| 7 | 3 | 61.1 | 69.2 | 4 / 35 | 3967 |
| 8 | 2 | 64.1 | 78.1 | 9 / 35 | 4303 |
| 9 | 3 | 60.3 | 67.3 | 3 / 35 | 4193 |
| 10 | 2 | 60.8 | 69.2 | 3 / 35 | 4002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 54 | 28% |
| shu.nitro.LENIN .T34 | 40 | 40% |
| lrem.Spectre 0.4.4 | 29 | 34% |
| js.PinBall 1.6 | 13 | 54% |
| gh.mini.GrubbmOne 1.0 | 7 | 0% |
| sample.SpinBot 1.0 | 2 | 50% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 1 | 0% |

Hadur died in 301 of 350 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 101 | 34% | 114 |
| shu.nitro.LENIN .T34 | 58 | 19% | 72 |
| lrem.Spectre 0.4.4 | 42 | 14% | 48 |
| js.PinBall 1.6 | 33 | 11% | 42 |
| gh.mini.GrubbmOne 1.0 | 31 | 10% | 33 |
| jaybot.adv.bots.JayBot 2.0 | 23 | 8% | 24 |
| sample.SpinBot 1.0 | 7 | 2% | 10 |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 64.8 | 58 / 350 | 4.17 | 12.7% | 32613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.9 | 14.9% | 115 |
| wee.Gem 1.8.4 | 3.0 | 12.8% | 86 |
| hadur117.nano.SanaroD10 0.1 | 3.1 | 12.7% | 58 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 12.0% | 43 |
| EH.Eagle 1.0.6 | 4.3 | 11.4% | 29 |
| techdude.kombat.FlamingKombat 1.5 | 6.1 | 9.1% | 9 |
| joe.ADinosaur 1.0 | 6.7 | 8.7% | 5 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.2% | 5 |
| caimano.Furia_Ceca 0.22 | 8.9 | 6.6% | 3 |
| cs.Grudge 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.2 | 45.1 | 3 / 35 | 4379 |
| 2 | 2 | 59.8 | 70.8 | 8 / 35 | 3002 |
| 3 | 2 | 59.4 | 70.5 | 7 / 35 | 3018 |
| 4 | 2 | 59.3 | 68.9 | 9 / 35 | 2958 |
| 5 | 4 | 57.1 | 67.0 | 4 / 35 | 2845 |
| 6 | 7 | 50.7 | 39.7 | 0 / 35 | 3826 |
| 7 | 2 | 59.2 | 73.7 | 7 / 35 | 2832 |
| 8 | 3 | 58.7 | 66.7 | 3 / 35 | 3348 |
| 9 | 2 | 60.9 | 72.1 | 9 / 35 | 3306 |
| 10 | 2 | 60.5 | 73.3 | 8 / 35 | 3099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 44 | 50% |
| wee.Gem 1.8.4 | 27 | 33% |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 57% |
| EH.Eagle 1.0.6 | 14 | 57% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 67% |
| throxbot.ThroxBot 0.1 | 4 | 75% |
| joe.ADinosaur 1.0 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 296 of 350 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 79 | 27% | 101 |
| wee.Gem 1.8.4 | 51 | 17% | 59 |
| sheldor.melee.nano.TestMelee 0.1 | 44 | 15% | 53 |
| joe.ADinosaur 1.0 | 34 | 11% | 35 |
| EH.Eagle 1.0.6 | 26 | 9% | 33 |
| throxbot.ThroxBot 0.1 | 20 | 7% | 20 |
| techdude.kombat.FlamingKombat 1.5 | 15 | 5% | 23 |
| caimano.Furia_Ceca 0.22 | 13 | 4% | 14 |
| cs.Grudge 1.0 | 11 | 4% | 11 |
3 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 75.0 | 100 / 350 | 3.25 | 14.9% | 35858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.2 | 16.0% | 120 |
| hadur117.nano.SanaroD10 0.1 | 1.9 | 14.9% | 100 |
| uji.Antique 1.0 | 3.0 | 13.0% | 63 |
| qohnil.blot.BlotBot 3.61 | 4.4 | 11.0% | 29 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.9% | 16 |
| ahr.ice.Ice 1.0.2 | 6.2 | 8.6% | 15 |
| amk.ChumbaWumba 0.3 | 6.8 | 8.2% | 2 |
| matt.advanced.Katana 1.0 | 8.5 | 6.4% | 4 |
| stelo.PianistNano 1.2 | 8.9 | 5.6% | 1 |
| stelo.Lifestealer 1.0 | 9.4 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 84.4 | 12 / 35 | 3569 |
| 2 | 1 | 65.5 | 82.2 | 13 / 35 | 4048 |
| 3 | 2 | 60.7 | 68.6 | 8 / 35 | 3628 |
| 4 | 2 | 60.5 | 70.5 | 6 / 35 | 3550 |
| 5 | 2 | 58.9 | 67.9 | 9 / 35 | 3011 |
| 6 | 2 | 62.6 | 74.9 | 11 / 35 | 3602 |
| 7 | 2 | 64.2 | 80.3 | 12 / 35 | 3643 |
| 8 | 2 | 64.4 | 80.6 | 12 / 35 | 3634 |
| 9 | 3 | 59.9 | 67.9 | 6 / 35 | 3560 |
| 10 | 2 | 61.6 | 72.1 | 11 / 35 | 3613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 103 | 45% |
| uji.Antique 1.0 | 43 | 60% |
| qohnil.blot.BlotBot 3.61 | 21 | 57% |
| ahr.ice.Ice 1.0.2 | 8 | 50% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| amk.ChumbaWumba 0.3 | 7 | 71% |
| matt.advanced.Katana 1.0 | 3 | 33% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 252 of 350 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 97 | 38% | 122 |
| uji.Antique 1.0 | 40 | 16% | 74 |
| pfvicm.Sobieski 7.2.3b | 40 | 16% | 45 |
| qohnil.blot.BlotBot 3.61 | 24 | 10% | 42 |
| amk.ChumbaWumba 0.3 | 17 | 7% | 18 |
| ahr.ice.Ice 1.0.2 | 13 | 5% | 23 |
| matt.advanced.Katana 1.0 | 9 | 4% | 11 |
| stelo.Lifestealer 1.0 | 6 | 2% | 6 |
| stelo.PianistNano 1.2 | 6 | 2% | 6 |

## Melee bench: F29

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 62.3 | 46 / 350 | 4.39 | 12.6% | 33306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.5 | 16.2% | 113 |
| zyx.mega.YersiniaPestis 3.1 | 1.7 | 15.4% | 104 |
| myl.micro.Troodon 1.10 | 3.1 | 13.4% | 34 |
| hadur117.nano.SanaroD10 0.1 | 4.0 | 12.6% | 46 |
| jok.PheonixM 0.1.2 | 4.7 | 11.5% | 18 |
| DBall.Anarchy 0.1 | 6.5 | 8.2% | 27 |
| ph.melee.ArcherME 0.3 | 6.5 | 7.9% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.9% | 9 |
| jangs.ns51 1.0 | 9.8 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.3 | 64.8 | 4 / 35 | 3652 |
| 2 | 5 | 57.6 | 59.0 | 3 / 35 | 3336 |
| 3 | 4 | 55.8 | 55.6 | 3 / 35 | 3041 |
| 4 | 3 | 60.5 | 68.6 | 8 / 35 | 3222 |
| 5 | 3 | 61.7 | 70.8 | 8 / 35 | 3567 |
| 6 | 5 | 56.6 | 57.8 | 5 / 35 | 3252 |
| 7 | 4 | 58.3 | 63.5 | 3 / 35 | 3313 |
| 8 | 4 | 58.9 | 63.2 | 4 / 35 | 3546 |
| 9 | 3 | 60.7 | 67.9 | 5 / 35 | 3395 |
| 10 | 5 | 55.0 | 52.4 | 3 / 35 | 2982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 36 | 25% |
| zyx.mega.YersiniaPestis 3.1 | 28 | 54% |
| myl.micro.Troodon 1.10 | 21 | 57% |
| jok.PheonixM 0.1.2 | 8 | 88% |
| DBall.Anarchy 0.1 | 7 | 43% |

Hadur died in 308 of 350 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 106 | 34% | 117 |
| myl.micro.Troodon 1.10 | 63 | 20% | 72 |
| zyx.mega.YersiniaPestis 3.1 | 57 | 19% | 71 |
| jok.PheonixM 0.1.2 | 41 | 13% | 46 |
| ph.melee.ArcherME 0.3 | 15 | 5% | 15 |
| DBall.Anarchy 0.1 | 12 | 4% | 15 |
| fullsail.TimbotNoPrediction 1.0 | 9 | 3% | 9 |
| jangs.ns51 1.0 | 5 | 2% | 5 |

## Melee bench: F30

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.6 | 54.0 | 29 / 350 | 5.14 | 10.6% | 29244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 2.4 | 13.7% | 64 |
| darkcanuck.B26354 1.06 | 2.4 | 13.6% | 79 |
| catcat20.Matcha 0.006 | 2.5 | 14.0% | 80 |
| oog.melee.Capulet 1.2 | 2.9 | 13.1% | 54 |
| hadur117.nano.SanaroD10 0.1 | 5.2 | 10.6% | 29 |
| intruder.PrairieWolf 2.61 | 5.7 | 9.3% | 23 |
| ntc.Opposite 1.5 | 7.7 | 7.8% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.1 | 7.7% | 8 |
| tripphippy.Alice 1.1 | 8.1 | 7.7% | 11 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.6 | 56.2 | 2 / 35 | 2771 |
| 2 | 5 | 54.6 | 57.1 | 2 / 35 | 3011 |
| 3 | 6 | 51.9 | 50.2 | 4 / 35 | 2671 |
| 4 | 5 | 51.3 | 47.9 | 1 / 35 | 2937 |
| 5 | 5 | 52.8 | 51.7 | 1 / 35 | 2949 |
| 6 | 6 | 52.5 | 51.7 | 2 / 35 | 3186 |
| 7 | 5 | 55.8 | 61.0 | 3 / 35 | 2917 |
| 8 | 5 | 54.7 | 54.6 | 4 / 35 | 3027 |
| 9 | 5 | 56.1 | 57.5 | 7 / 35 | 2864 |
| 10 | 5 | 52.9 | 52.1 | 3 / 35 | 2911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 19 | 32% |
| catcat20.Matcha 0.006 | 17 | 59% |
| oog.melee.Capulet 1.2 | 14 | 21% |
| stelo.PastFuture 2.3.2 | 11 | 36% |
| intruder.PrairieWolf 2.61 | 5 | 60% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |
| tripphippy.Alice 1.1 | 2 | 50% |

Hadur died in 321 of 350 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 61 | 19% | 66 |
| stelo.PastFuture 2.3.2 | 60 | 19% | 63 |
| catcat20.Matcha 0.006 | 57 | 18% | 69 |
| oog.melee.Capulet 1.2 | 54 | 17% | 59 |
| intruder.PrairieWolf 2.61 | 26 | 8% | 27 |
| tripphippy.Alice 1.1 | 25 | 8% | 27 |
| ntc.Opposite 1.5 | 19 | 6% | 19 |
| fowl3628800.LightningBolt 2.6.0 | 16 | 5% | 17 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.0 | 53.2 | 17 / 350 | 5.21 | 10.3% | 27221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 186 |
| gh.mini.Griezel 0.2 | 2.1 | 14.1% | 84 |
| spinnercat.micro.Tyger 0.1 | 3.1 | 12.7% | 30 |
| d414.nano.Quantum 1.0.0 | 3.8 | 11.3% | 18 |
| hadur117.nano.SanaroD10 0.1 | 5.2 | 10.3% | 17 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.5% | 10 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.3% | 6 |
| fm.mammillarias 1.3 | 7.8 | 6.5% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.5 | 49.5 | 2 / 35 | 2773 |
| 2 | 5 | 54.4 | 57.8 | 1 / 35 | 2718 |
| 3 | 5 | 53.8 | 55.2 | 1 / 35 | 2775 |
| 4 | 5 | 53.8 | 53.3 | 2 / 35 | 2776 |
| 5 | 5 | 54.3 | 55.2 | 1 / 35 | 2803 |
| 6 | 5 | 52.4 | 52.7 | 1 / 35 | 2956 |
| 7 | 5 | 55.2 | 55.6 | 6 / 35 | 2786 |
| 8 | 6 | 51.5 | 50.5 | 1 / 35 | 2489 |
| 9 | 6 | 50.5 | 50.2 | 0 / 35 | 2374 |
| 10 | 5 | 52.7 | 52.1 | 2 / 35 | 2771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 33 | 30% |
| gh.mini.Griezel 0.2 | 27 | 15% |
| spinnercat.micro.Tyger 0.1 | 10 | 10% |
| d414.nano.Quantum 1.0.0 | 4 | 25% |
| gh.nano.Grofvuil 0.2 | 3 | 33% |

Hadur died in 333 of 350 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 89 | 27% | 92 |
| abc.Shadow 3.84i | 70 | 21% | 81 |
| spinnercat.micro.Tyger 0.1 | 65 | 20% | 66 |
| d414.nano.Quantum 1.0.0 | 35 | 11% | 36 |
| gh.nano.Grofvuil 0.2 | 27 | 8% | 28 |
| fm.mammillarias 1.3 | 21 | 6% | 21 |
| timmit.nano.TimDog 0.33 | 13 | 4% | 13 |
| Gecko.ultimateGeckoBot 1.0 | 9 | 3% | 9 |
| tlp.ThreeLeggedPig 1 | 4 | 1% | 4 |

## Melee bench: F32

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 73.9 | 91 / 350 | 3.35 | 14.6% | 37798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.2 | 15.5% | 123 |
| hadur117.nano.SanaroD10 0.1 | 1.8 | 14.6% | 91 |
| apc.botM 3.0 | 3.3 | 12.3% | 53 |
| lxx.ConceptA 0.8 | 4.3 | 11.0% | 9 |
| vjik.UnViolation 1.1 | 4.7 | 10.9% | 34 |
| bayen.UbaMicro 1.4 | 5.7 | 9.5% | 17 |
| panzer.Panzer 0.2 | 7.5 | 7.4% | 0 |
| yk.JahMicro 1.0 | 7.8 | 7.0% | 15 |
| conscience.Electron 1.3g | 8.7 | 6.4% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 5.3% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 75.6 | 10 / 35 | 3694 |
| 2 | 2 | 61.9 | 76.2 | 9 / 35 | 3446 |
| 3 | 1 | 64.0 | 80.6 | 8 / 35 | 4244 |
| 4 | 2 | 62.8 | 77.1 | 11 / 35 | 3957 |
| 5 | 2 | 59.9 | 69.5 | 7 / 35 | 3536 |
| 6 | 2 | 59.3 | 67.3 | 6 / 35 | 3918 |
| 7 | 2 | 60.4 | 67.9 | 12 / 35 | 3589 |
| 8 | 2 | 60.9 | 72.7 | 9 / 35 | 3723 |
| 9 | 2 | 63.4 | 75.6 | 11 / 35 | 4022 |
| 10 | 1 | 62.0 | 76.5 | 8 / 35 | 3669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 27% |
| apc.botM 3.0 | 35 | 60% |
| vjik.UnViolation 1.1 | 32 | 56% |
| lxx.ConceptA 0.8 | 14 | 86% |
| bayen.UbaMicro 1.4 | 10 | 50% |
| yk.JahMicro 1.0 | 8 | 25% |
| panzer.Panzer 0.2 | 8 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 0% |

Hadur died in 261 of 350 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 33% | 115 |
| lxx.ConceptA 0.8 | 51 | 20% | 56 |
| apc.botM 3.0 | 33 | 13% | 56 |
| vjik.UnViolation 1.1 | 31 | 12% | 49 |
| bayen.UbaMicro 1.4 | 25 | 10% | 29 |
| panzer.Panzer 0.2 | 12 | 5% | 16 |
| yk.JahMicro 1.0 | 11 | 4% | 12 |
| conscience.Electron 1.3g | 8 | 3% | 10 |
| donjezza.Jezza 1.0 | 4 | 2% | 7 |

## Melee bench: F33

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 64.6 | 41 / 350 | 4.19 | 13.1% | 37083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.2 | 17.9% | 154 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.2% | 51 |
| hadur117.nano.SanaroD10 0.1 | 2.8 | 13.1% | 41 |
| gre.svman4.Leonidas 1.3.2 | 3.9 | 11.7% | 42 |
| labg.Cataclysm 2.05 | 4.4 | 11.2% | 45 |
| baal.nano.N 1.42 | 6.4 | 8.7% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.0% | 8 |
| zyx.micro.Ant 1.1 | 8.3 | 6.0% | 1 |
| sanja.First 0.1 | 9.2 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.2 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.5 | 54.9 | 2 / 35 | 3406 |
| 2 | 5 | 55.6 | 57.5 | 0 / 35 | 3371 |
| 3 | 3 | 62.0 | 71.1 | 5 / 35 | 3994 |
| 4 | 2 | 59.6 | 64.4 | 5 / 35 | 3697 |
| 5 | 3 | 57.4 | 61.6 | 3 / 35 | 3198 |
| 6 | 2 | 62.3 | 70.5 | 9 / 35 | 4132 |
| 7 | 2 | 61.1 | 68.3 | 4 / 35 | 3939 |
| 8 | 2 | 59.5 | 65.4 | 4 / 35 | 3666 |
| 9 | 2 | 61.6 | 67.9 | 8 / 35 | 4164 |
| 10 | 3 | 58.2 | 64.1 | 1 / 35 | 3516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 58 | 17% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 48% |
| gre.svman4.Leonidas 1.3.2 | 13 | 46% |
| labg.Cataclysm 2.05 | 8 | 63% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 75% |
| baal.nano.N 1.42 | 3 | 33% |
| zyx.micro.Ant 1.1 | 3 | 67% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 310 of 350 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 115 | 37% | 126 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 17% | 66 |
| gre.svman4.Leonidas 1.3.2 | 41 | 13% | 46 |
| labg.Cataclysm 2.05 | 33 | 11% | 37 |
| kinsen.melee.Angsaichmophobia 1.8c | 32 | 10% | 33 |
| baal.nano.N 1.42 | 17 | 5% | 19 |
| zyx.micro.Ant 1.1 | 7 | 2% | 9 |
| sanja.First 0.1 | 7 | 2% | 8 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 6 | 2% | 6 |

## Melee bench: F34

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 70.0 | 53 / 350 | 3.70 | 13.9% | 40584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.3 | 17.9% | 127 |
| stelo.Spread 0.9 | 1.7 | 17.3% | 117 |
| hadur117.nano.SanaroD10 0.1 | 3.1 | 13.9% | 53 |
| jcs.Seth 1.8 | 4.6 | 11.3% | 35 |
| tcf.Reach 3 | 4.7 | 11.1% | 17 |
| cli.Dancer 1.1 | 5.6 | 9.6% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.9 | 71.4 | 8 / 35 | 4001 |
| 2 | 3 | 62.0 | 70.2 | 5 / 35 | 3963 |
| 3 | 3 | 61.2 | 67.9 | 3 / 35 | 3950 |
| 4 | 3 | 62.3 | 67.6 | 5 / 35 | 4270 |
| 5 | 3 | 65.3 | 77.1 | 9 / 35 | 4381 |
| 6 | 3 | 64.2 | 75.2 | 8 / 35 | 4427 |
| 7 | 4 | 58.0 | 62.2 | 3 / 35 | 3383 |
| 8 | 3 | 61.1 | 67.3 | 2 / 35 | 4093 |
| 9 | 3 | 63.6 | 74.6 | 6 / 35 | 4290 |
| 10 | 3 | 60.8 | 66.0 | 4 / 35 | 3826 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 63 | 19% |
| stelo.Spread 0.9 | 48 | 60% |
| jcs.Seth 1.8 | 15 | 67% |
| tcf.Reach 3 | 7 | 14% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 130 | 43% | 134 |
| stelo.Spread 0.9 | 84 | 28% | 121 |
| tcf.Reach 3 | 28 | 9% | 28 |
| jcs.Seth 1.8 | 27 | 9% | 36 |
| cli.Dancer 1.1 | 12 | 4% | 13 |
| ratosh.Wesco 1.4 | 11 | 4% | 13 |
| amk.Punbot.Punbot 0.01 | 5 | 2% | 5 |
2 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 66.1 | 22 / 350 | 4.05 | 12.2% | 27764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.7% | 279 |
| rz.HawkOnFire 0.1 | 3.1 | 12.6% | 7 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.6% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.0% | 17 |
| hadur117.nano.SanaroD10 0.1 | 3.9 | 12.2% | 22 |
| wit.Chuliath 1.0 | 6.6 | 7.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 7.0% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.4 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.1 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 66.0 | 0 / 35 | 2861 |
| 2 | 4 | 57.0 | 63.5 | 2 / 35 | 2636 |
| 3 | 4 | 56.8 | 63.8 | 1 / 35 | 2641 |
| 4 | 2 | 59.3 | 69.5 | 3 / 35 | 2919 |
| 5 | 5 | 57.8 | 67.9 | 3 / 35 | 2412 |
| 6 | 4 | 57.7 | 66.0 | 1 / 35 | 2898 |
| 7 | 5 | 57.3 | 64.4 | 3 / 35 | 2558 |
| 8 | 2 | 59.1 | 67.0 | 2 / 35 | 3204 |
| 9 | 5 | 58.4 | 66.3 | 3 / 35 | 2740 |
| 10 | 4 | 58.4 | 66.7 | 4 / 35 | 2895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 76 | 4% |
| gh.mini.Gruwel 0.9 | 14 | 29% |
| rz.HawkOnFire 0.1 | 10 | 80% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 50% |
| myl.nano.KomoriNinja 1.1 | 2 | 50% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 328 of 350 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 131 | 40% | 134 |
| dmh.robocode.robot.BlackDeath 9.2 | 57 | 17% | 62 |
| rz.HawkOnFire 0.1 | 52 | 16% | 59 |
| gh.mini.Gruwel 0.9 | 49 | 15% | 53 |
| myl.nano.KomoriNinja 1.1 | 13 | 4% | 14 |
| wit.Chuliath 1.0 | 9 | 3% | 11 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 9 | 3% | 9 |
| stelo.MyAgileRobot 0.2 | 6 | 2% | 6 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 68.7 | 98 / 350 | 3.82 | 14.1% | 36880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroD10 0.1 | 1.2 | 14.1% | 98 |
| alpha.RainingFire 1.0 | 2.3 | 12.4% | 55 |
| bzdp.Pansy 2.1 | 2.9 | 12.5% | 51 |
| bvh.micro.Freya 0.3 | 4.5 | 11.2% | 38 |
| mz.Cork 0.1 | 4.9 | 10.9% | 36 |
| bvh.mini.Fenrir 0.39 | 6.0 | 10.3% | 16 |
| m3thos.Eva02 0.7.1 | 6.2 | 10.2% | 27 |
| dl.BetterWalls 1.0 | 8.5 | 7.0% | 15 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 7.0% | 7 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.4% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.4 | 67.6 | 10 / 35 | 3803 |
| 2 | 1 | 57.9 | 61.3 | 8 / 35 | 3544 |
| 3 | 2 | 57.3 | 63.2 | 5 / 35 | 3274 |
| 4 | 1 | 58.3 | 62.9 | 7 / 35 | 3708 |
| 5 | 1 | 59.1 | 63.5 | 11 / 35 | 3562 |
| 6 | 1 | 63.0 | 74.0 | 14 / 35 | 3941 |
| 7 | 2 | 61.4 | 73.3 | 8 / 35 | 3482 |
| 8 | 1 | 63.2 | 74.6 | 12 / 35 | 3988 |
| 9 | 1 | 63.5 | 76.8 | 13 / 35 | 3772 |
| 10 | 1 | 61.0 | 69.5 | 10 / 35 | 3806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 35 | 54% |
| alpha.RainingFire 1.0 | 24 | 83% |
| bvh.micro.Freya 0.3 | 23 | 74% |
| bvh.mini.Fenrir 0.39 | 21 | 81% |
| m3thos.Eva02 0.7.1 | 20 | 50% |
| mz.Cork 0.1 | 14 | 71% |
| sample.MyFirstRobot 1.0 | 4 | 50% |
| dl.BetterWalls 1.0 | 3 | 67% |
| squidM.TentalceMeleeNano 1.1 | 3 | 33% |

Hadur died in 253 of 350 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 47 | 19% | 65 |
| bzdp.Pansy 2.1 | 46 | 18% | 69 |
| mz.Cork 0.1 | 33 | 13% | 45 |
| m3thos.Eva02 0.7.1 | 33 | 13% | 44 |
| bvh.mini.Fenrir 0.39 | 31 | 12% | 40 |
| bvh.micro.Freya 0.3 | 28 | 11% | 38 |
| squidM.TentalceMeleeNano 1.1 | 16 | 6% | 19 |
| dl.BetterWalls 1.0 | 12 | 5% | 17 |
| sample.MyFirstRobot 1.0 | 7 | 3% | 12 |

## Melee bench: F37

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 75.2 | 114 / 350 | 3.23 | 14.9% | 42421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroD10 0.1 | 1.0 | 14.9% | 114 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.1 | 11.2% | 35 |
| germ.TheMind .2 | 3.2 | 11.3% | 47 |
| EBBU.Sim2 1.02 | 4.0 | 10.5% | 25 |
| agrach.Dalek 1.0 | 4.9 | 10.1% | 38 |
| stelo.UntouchableNano 1.3 | 6.7 | 9.1% | 26 |
| mb.Beast 0.1 | 7.2 | 8.6% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.2% | 4 |
| lmk.ACPFinal 0.1 | 7.9 | 8.4% | 17 |
| skm.Ryubot 1.0 | 9.3 | 7.7% | 14 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.1 | 69.8 | 9 / 35 | 4293 |
| 2 | 1 | 61.2 | 74.3 | 12 / 35 | 4164 |
| 3 | 1 | 61.0 | 73.7 | 9 / 35 | 4413 |
| 4 | 1 | 62.1 | 74.9 | 12 / 35 | 4450 |
| 5 | 1 | 59.9 | 73.0 | 10 / 35 | 3896 |
| 6 | 1 | 60.6 | 75.6 | 7 / 35 | 4002 |
| 7 | 1 | 62.6 | 77.5 | 17 / 35 | 4132 |
| 8 | 1 | 60.2 | 73.0 | 11 / 35 | 4004 |
| 9 | 1 | 62.2 | 76.5 | 12 / 35 | 4490 |
| 10 | 1 | 64.4 | 83.5 | 15 / 35 | 4577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 32 | 59% |
| germ.TheMind .2 | 31 | 48% |
| EBBU.Sim2 1.02 | 26 | 73% |
| agrach.Dalek 1.0 | 22 | 64% |
| stelo.UntouchableNano 1.3 | 20 | 75% |
| mb.Beast 0.1 | 18 | 72% |
| skm.Ryubot 1.0 | 15 | 53% |
| lmk.ACPFinal 0.1 | 14 | 79% |

Hadur died in 241 of 350 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 41 | 17% | 64 |
| germ.TheMind .2 | 41 | 17% | 53 |
| agrach.Dalek 1.0 | 37 | 15% | 55 |
| EBBU.Sim2 1.02 | 31 | 13% | 49 |
| mb.Beast 0.1 | 23 | 10% | 36 |
| lmk.ACPFinal 0.1 | 23 | 10% | 30 |
| stelo.UntouchableNano 1.3 | 20 | 8% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 6% | 18 |
| skm.Ryubot 1.0 | 10 | 4% | 15 |

## Melee bench: F38

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.4 | 59.3 | 23 / 350 | 4.67 | 11.3% | 30307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.0% | 175 |
| bvh.mini.Freya 0.55 | 2.6 | 12.9% | 30 |
| cs.Wren 1.0 | 3.7 | 11.9% | 32 |
| bts.mega.Gnarly 1.4 | 4.1 | 11.8% | 51 |
| hadur117.nano.SanaroD10 0.1 | 4.4 | 11.3% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.7 | 10.5% | 15 |
| kdf.KoulDestroyer 1.0 | 6.5 | 9.4% | 14 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.6% | 10 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 9.6 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 52.6 | 51.1 | 2 / 35 | 3051 |
| 2 | 6 | 53.2 | 54.9 | 1 / 35 | 2685 |
| 3 | 3 | 57.4 | 65.4 | 5 / 35 | 2938 |
| 4 | 7 | 53.2 | 53.7 | 2 / 35 | 2899 |
| 5 | 2 | 58.6 | 64.1 | 5 / 35 | 3516 |
| 6 | 5 | 55.7 | 60.6 | 4 / 35 | 3030 |
| 7 | 3 | 55.1 | 58.7 | 1 / 35 | 2859 |
| 8 | 3 | 57.1 | 64.8 | 1 / 35 | 3212 |
| 9 | 4 | 55.5 | 58.4 | 0 / 35 | 3339 |
| 10 | 5 | 55.4 | 61.0 | 2 / 35 | 2778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 35 | 26% |
| bts.mega.Gnarly 1.4 | 15 | 13% |
| cs.Wren 1.0 | 13 | 23% |
| bvh.mini.Freya 0.55 | 12 | 33% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 13% |
| kdf.KoulDestroyer 1.0 | 6 | 67% |

Hadur died in 327 of 350 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 88 | 27% | 97 |
| bvh.mini.Freya 0.55 | 60 | 18% | 64 |
| cs.Wren 1.0 | 47 | 14% | 49 |
| bts.mega.Gnarly 1.4 | 45 | 14% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 11% | 35 |
| kdf.KoulDestroyer 1.0 | 32 | 10% | 34 |
| kawigi.spare.SpareParts 0.7.6nosnd | 12 | 4% | 13 |
| bzdp.BoxCar 2.0 | 6 | 2% | 6 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 62.2 | 35 / 350 | 4.40 | 12.0% | 33547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 16.0% | 92 |
| az.Ololobot 0.2.4 | 2.2 | 13.8% | 121 |
| hadur117.nano.SanaroD10 0.1 | 3.5 | 12.0% | 35 |
| catcat20.Lambda 0.024 | 3.7 | 11.2% | 49 |
| stelo.SoRobotNanoMelee 1.2 | 4.9 | 10.3% | 35 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.7% | 8 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.3% | 2 |
| gimp.GimpBot 0.1 | 7.1 | 8.1% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.4% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.1 | 64.8 | 3 / 35 | 3281 |
| 2 | 3 | 55.8 | 62.5 | 4 / 35 | 3117 |
| 3 | 5 | 51.8 | 51.4 | 1 / 35 | 3124 |
| 4 | 4 | 54.6 | 59.4 | 1 / 35 | 3214 |
| 5 | 3 | 61.1 | 72.1 | 5 / 35 | 3857 |
| 6 | 4 | 54.3 | 57.5 | 3 / 35 | 3185 |
| 7 | 3 | 57.9 | 66.0 | 3 / 35 | 3626 |
| 8 | 4 | 55.6 | 60.6 | 2 / 35 | 3160 |
| 9 | 4 | 54.9 | 58.4 | 5 / 35 | 3285 |
| 10 | 2 | 59.8 | 69.2 | 8 / 35 | 3698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 32 | 41% |
| az.Ololobot 0.2.4 | 31 | 13% |
| catcat20.Lambda 0.024 | 20 | 50% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 19% |
| winamp32.micro.MicroMacro 1.0 | 4 | 50% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 100% |
| gimp.GimpBot 0.1 | 1 | 0% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 316 of 350 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 102 | 32% | 114 |
| az.Ololobot 0.2.4 | 57 | 18% | 62 |
| stelo.SoRobotNanoMelee 1.2 | 50 | 16% | 51 |
| catcat20.Lambda 0.024 | 28 | 9% | 34 |
| apollokidd.ApolloKidd 0.9 | 22 | 7% | 25 |
| gimp.GimpBot 0.1 | 20 | 6% | 23 |
| winamp32.micro.MicroMacro 1.0 | 17 | 5% | 20 |
| whitesquare.robots.SkynetAdvanced 1.1 | 11 | 3% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 9 | 3% | 10 |

## Melee bench: F41

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 65.1 | 40 / 350 | 4.14 | 12.4% | 30427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.9% | 188 |
| ary.Swarm 1.1 | 2.5 | 13.6% | 26 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 13.3% | 42 |
| hadur117.nano.SanaroD10 0.1 | 3.9 | 12.4% | 40 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 12.2% | 42 |
| shrub.Silver v048 | 6.0 | 9.0% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.0% | 5 |
| stelo.Mirror 1.1 | 8.8 | 5.3% | 3 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 59.2 | 65.1 | 6 / 35 | 3096 |
| 2 | 4 | 58.1 | 64.1 | 0 / 35 | 3144 |
| 3 | 4 | 56.6 | 61.3 | 1 / 35 | 2696 |
| 4 | 4 | 59.4 | 66.3 | 3 / 35 | 3410 |
| 5 | 4 | 58.9 | 67.6 | 4 / 35 | 2701 |
| 6 | 3 | 60.3 | 69.5 | 5 / 35 | 3036 |
| 7 | 3 | 60.8 | 70.2 | 7 / 35 | 3184 |
| 8 | 5 | 55.7 | 58.1 | 3 / 35 | 2827 |
| 9 | 2 | 61.3 | 71.7 | 7 / 35 | 3291 |
| 10 | 5 | 56.0 | 56.8 | 4 / 35 | 3042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 63 | 27% |
| lessonz.robocode.Oz 0.5.0 | 27 | 48% |
| simonton.nano.MeleeSeed 1.8 | 11 | 18% |
| ary.Swarm 1.1 | 9 | 78% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 310 of 350 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 102 | 33% | 120 |
| ary.Swarm 1.1 | 61 | 20% | 68 |
| lessonz.robocode.Oz 0.5.0 | 55 | 18% | 64 |
| simonton.nano.MeleeSeed 1.8 | 47 | 15% | 50 |
| shrub.Silver v048 | 19 | 6% | 20 |
| zyx.nano.Ant 1.1 | 11 | 4% | 11 |
| jsal.Jsalbot 1.0 | 9 | 3% | 10 |
| stelo.Mirror 1.1 | 5 | 2% | 6 |
| acogdev.alpha 0.2 | 1 | 0% | 1 |

## Melee bench: F42

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 68.1 | 53 / 350 | 3.87 | 13.2% | 36251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.7% | 180 |
| maribo.mini.MiniQuester 0.1 | 2.7 | 14.5% | 47 |
| ara.Shera 0.88 | 2.8 | 13.9% | 56 |
| hadur117.nano.SanaroD10 0.1 | 3.4 | 13.2% | 53 |
| amz.NanoClone 1.41 | 5.1 | 9.2% | 2 |
| maribo.IotaCT 1.1 | 6.0 | 7.9% | 1 |
| dsw.StaticD 1.0 | 7.0 | 7.0% | 8 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.7% | 1 |
| stelo.MirrorMicro 1.0 | 9.0 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 70.2 | 7 / 35 | 3879 |
| 2 | 4 | 59.3 | 68.3 | 5 / 35 | 3260 |
| 3 | 4 | 58.3 | 64.4 | 4 / 35 | 3563 |
| 4 | 2 | 61.6 | 73.0 | 8 / 35 | 3743 |
| 5 | 3 | 58.9 | 65.7 | 3 / 35 | 3665 |
| 6 | 4 | 58.9 | 65.4 | 4 / 35 | 3551 |
| 7 | 4 | 59.1 | 65.1 | 5 / 35 | 3788 |
| 8 | 3 | 60.5 | 71.1 | 4 / 35 | 3599 |
| 9 | 3 | 62.3 | 74.9 | 10 / 35 | 3600 |
| 10 | 4 | 57.9 | 62.5 | 3 / 35 | 3603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 76 | 37% |
| maribo.mini.MiniQuester 0.1 | 26 | 54% |
| ara.Shera 0.88 | 25 | 36% |
| dsw.StaticD 1.0 | 3 | 33% |
| maribo.IotaCT 1.1 | 1 | 0% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 103 | 35% | 131 |
| ara.Shera 0.88 | 73 | 24% | 82 |
| maribo.mini.MiniQuester 0.1 | 64 | 21% | 76 |
| amz.NanoClone 1.41 | 16 | 5% | 16 |
| maribo.IotaCT 1.1 | 15 | 5% | 16 |
| dsw.StaticD 1.0 | 9 | 3% | 11 |
| mme.NikeEnhanced 2.0 | 8 | 3% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 6 | 2% | 6 |
| stelo.MirrorMicro 1.0 | 4 | 1% | 4 |

## Melee bench: F43

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 61.5 | 24 / 350 | 4.46 | 11.9% | 32322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.6% | 272 |
| brainfade.melee.Dusk 0.44 | 2.2 | 13.3% | 32 |
| dummy.micro.Sparrow 2.5 | 3.6 | 11.9% | 7 |
| hadur117.nano.SanaroD10 0.1 | 3.9 | 11.9% | 24 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.0% | 8 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.0% | 4 |
| mz.NanoGod 2.02 | 7.3 | 7.9% | 2 |
| jab.DiamondStealer 5 | 7.6 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.5% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 58.7 | 2 / 35 | 3297 |
| 2 | 5 | 55.3 | 55.2 | 1 / 35 | 2653 |
| 3 | 5 | 57.6 | 58.1 | 0 / 35 | 3050 |
| 4 | 4 | 60.2 | 65.1 | 1 / 35 | 3165 |
| 5 | 3 | 60.5 | 65.7 | 3 / 35 | 3493 |
| 6 | 4 | 60.3 | 63.5 | 3 / 35 | 3637 |
| 7 | 4 | 57.8 | 60.0 | 1 / 35 | 3290 |
| 8 | 4 | 57.4 | 57.1 | 4 / 35 | 3123 |
| 9 | 3 | 60.1 | 64.8 | 3 / 35 | 3310 |
| 10 | 3 | 60.8 | 67.0 | 6 / 35 | 3304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 57 | 19% |
| brainfade.melee.Dusk 0.44 | 21 | 48% |
| dummy.micro.Sparrow 2.5 | 5 | 40% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 0% |
| mz.NanoGod 2.02 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 326 of 350 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 147 | 45% | 158 |
| brainfade.melee.Dusk 0.44 | 53 | 16% | 62 |
| dummy.micro.Sparrow 2.5 | 41 | 13% | 43 |
| wcsv.melee.EngineerMelee 0.1 | 32 | 10% | 32 |
| Krabb.akim2.Akim2 1.1b | 21 | 6% | 21 |
| mz.NanoGod 2.02 | 16 | 5% | 17 |
| jab.DiamondStealer 5 | 11 | 3% | 11 |
| cvt.Firsty 1.0 | 5 | 2% | 5 |

## Melee bench: F44

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 69.9 | 72 / 350 | 3.71 | 14.2% | 38859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 17.0% | 157 |
| tzu.TheArtOfWar 1.2 | 2.1 | 15.2% | 78 |
| hadur117.nano.SanaroD10 0.1 | 2.8 | 14.2% | 72 |
| jwirde.Gort 2.0 | 4.5 | 10.7% | 25 |
| wompi.Quokka 1.6 | 4.7 | 10.4% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 9.0% | 2 |
| disan.Chair 2.2.0 | 6.9 | 7.6% | 0 |
| stf.PanzerGeneral 0.1 | 8.2 | 6.3% | 0 |
| sample.Crazy 1.0 | 9.4 | 4.7% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 69.2 | 9 / 35 | 3800 |
| 2 | 3 | 60.8 | 67.9 | 8 / 35 | 3826 |
| 3 | 3 | 62.6 | 72.7 | 10 / 35 | 3881 |
| 4 | 3 | 61.6 | 69.8 | 6 / 35 | 4060 |
| 5 | 3 | 60.4 | 67.6 | 4 / 35 | 3724 |
| 6 | 3 | 62.2 | 72.1 | 5 / 35 | 3784 |
| 7 | 2 | 63.9 | 74.9 | 9 / 35 | 4243 |
| 8 | 3 | 60.0 | 65.1 | 7 / 35 | 3926 |
| 9 | 2 | 61.4 | 68.9 | 7 / 35 | 4053 |
| 10 | 3 | 60.7 | 70.5 | 7 / 35 | 3562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 71 | 44% |
| tzu.TheArtOfWar 1.2 | 43 | 30% |
| jwirde.Gort 2.0 | 13 | 62% |
| disan.Chair 2.2.0 | 10 | 100% |
| wompi.Quokka 1.6 | 8 | 75% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 50% |

Hadur died in 279 of 350 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 103 | 37% | 134 |
| tzu.TheArtOfWar 1.2 | 74 | 27% | 92 |
| jwirde.Gort 2.0 | 31 | 11% | 38 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 22 | 8% | 24 |
| wompi.Quokka 1.6 | 21 | 8% | 25 |
| disan.Chair 2.2.0 | 12 | 4% | 15 |
| stf.PanzerGeneral 0.1 | 10 | 4% | 11 |
| sample.Crazy 1.0 | 4 | 1% | 6 |
| amk.jointstrike.JointStrike 0.2 | 2 | 1% | 5 |

## Melee bench: F45

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 68.4 | 52 / 350 | 3.85 | 14.2% | 40642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroD10 0.1 | 1.1 | 14.2% | 52 |
| eem.IWillFireNoBullet v2.8 | 2.4 | 13.0% | 182 |
| jje.BagPuss 1.2 | 3.0 | 12.7% | 33 |
| sul.Lunar 1.1 | 4.1 | 11.3% | 31 |
| myl.nano.Graviton 1.10 | 4.6 | 10.8% | 21 |
| hvilela.HVilela 0.9 | 5.9 | 9.6% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.4% | 6 |
| fm.claire 1.7 | 7.8 | 8.1% | 2 |
| wit.Deep7 2.0 | 9.0 | 6.6% | 19 |
| abud.ThirdRobo 1.0 | 9.9 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 70.5 | 6 / 35 | 4141 |
| 2 | 1 | 59.1 | 63.5 | 5 / 35 | 4114 |
| 3 | 1 | 61.6 | 70.8 | 5 / 35 | 4196 |
| 4 | 1 | 62.2 | 73.0 | 9 / 35 | 4028 |
| 5 | 1 | 61.5 | 73.0 | 6 / 35 | 3906 |
| 6 | 1 | 59.7 | 65.7 | 4 / 35 | 4035 |
| 7 | 1 | 59.8 | 66.0 | 5 / 35 | 4063 |
| 8 | 2 | 58.6 | 64.4 | 1 / 35 | 3947 |
| 9 | 1 | 62.4 | 70.2 | 5 / 35 | 4442 |
| 10 | 1 | 59.7 | 66.7 | 6 / 35 | 3770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 73 | 36% |
| sul.Lunar 1.1 | 21 | 71% |
| jje.BagPuss 1.2 | 17 | 18% |
| myl.nano.Graviton 1.10 | 9 | 33% |
| wit.Deep7 2.0 | 6 | 0% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 80% |
| hvilela.HVilela 0.9 | 2 | 0% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 1134. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 60 | 20% | 91 |
| eem.IWillFireNoBullet v2.8 | 59 | 20% | 0 |
| sul.Lunar 1.1 | 48 | 16% | 93 |
| myl.nano.Graviton 1.10 | 44 | 15% | 53 |
| hvilela.HVilela 0.9 | 36 | 12% | 41 |
| fm.claire 1.7 | 16 | 5% | 24 |
| pez.mini.ChironexFleckeri 0.5 | 15 | 5% | 23 |
| wit.Deep7 2.0 | 13 | 4% | 17 |
| abud.ThirdRobo 1.0 | 7 | 2% | 8 |

## Melee bench: F46

hadur117.nano.SanaroD10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 68.1 | 30 / 350 | 3.87 | 12.4% | 29238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.9% | 150 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.3% | 139 |
| hadur117.nano.SanaroD10 0.1 | 3.1 | 12.4% | 30 |
| mz.MicroSheep 1.0 | 4.5 | 10.5% | 3 |
| cx.Princess 1.0 | 4.5 | 10.7% | 22 |
| sadoner.killer 0.2 | 5.9 | 9.3% | 2 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.6% | 3 |
| jeremyreeder.collective.Prophet 5 | 8.1 | 6.1% | 1 |
| kurios.DOSexe .9a | 8.9 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 68.3 | 3 / 35 | 2909 |
| 2 | 3 | 58.8 | 70.2 | 4 / 35 | 2705 |
| 3 | 3 | 57.5 | 63.8 | 4 / 35 | 2754 |
| 4 | 3 | 58.8 | 70.5 | 4 / 35 | 2805 |
| 5 | 3 | 61.6 | 74.9 | 5 / 35 | 3333 |
| 6 | 3 | 57.7 | 64.8 | 0 / 35 | 3074 |
| 7 | 4 | 56.4 | 61.3 | 4 / 35 | 2564 |
| 8 | 3 | 59.7 | 71.1 | 3 / 35 | 3019 |
| 9 | 3 | 58.7 | 68.3 | 3 / 35 | 2895 |
| 10 | 3 | 59.0 | 68.3 | 0 / 35 | 3180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 63 | 22% |
| rsalesc.melee.Medina 0.4.5 | 31 | 23% |
| cx.Princess 1.0 | 8 | 63% |
| sadoner.killer 0.2 | 3 | 67% |
| mz.MicroSheep 1.0 | 2 | 50% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 320 of 350 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 138 | 43% | 154 |
| rsalesc.melee.Medina 0.4.5 | 85 | 27% | 92 |
| mz.MicroSheep 1.0 | 28 | 9% | 31 |
| cx.Princess 1.0 | 25 | 8% | 27 |
| sadoner.killer 0.2 | 19 | 6% | 19 |
| arthord.NanoSatanMelee Beta | 15 | 5% | 16 |
| jeremyreeder.collective.Prophet 5 | 7 | 2% | 8 |
| kurios.DOSexe .9a | 3 | 1% | 3 |

