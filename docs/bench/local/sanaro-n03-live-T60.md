# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 72.2 | 39 / 350 | 3.51 | 13.5% | 36234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 245 |
| hadur117.nano.SanaroT60 0.1 | 2.0 | 13.5% | 39 |
| sgp.JollyNinja 3.53 | 3.4 | 12.2% | 36 |
| mz.MicroGodMelee 1 | 4.4 | 11.5% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.8% | 6 |
| lorneswork.Predator 1.0 | 5.9 | 10.0% | 7 |
| adt.Ar2 1.0 | 6.9 | 7.9% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.7% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 75.6 | 1 / 35 | 3555 |
| 2 | 2 | 62.7 | 78.1 | 4 / 35 | 3753 |
| 3 | 2 | 59.4 | 67.3 | 2 / 35 | 3567 |
| 4 | 2 | 61.5 | 73.7 | 3 / 35 | 3692 |
| 5 | 2 | 61.1 | 72.1 | 4 / 35 | 3698 |
| 6 | 2 | 61.0 | 71.4 | 3 / 35 | 3895 |
| 7 | 2 | 58.2 | 67.6 | 6 / 35 | 2927 |
| 8 | 2 | 60.0 | 67.9 | 7 / 35 | 3579 |
| 9 | 2 | 62.3 | 76.8 | 6 / 35 | 3785 |
| 10 | 2 | 60.8 | 71.1 | 3 / 35 | 3783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 128 | 9% |
| sgp.JollyNinja 3.53 | 28 | 50% |
| mz.MicroGodMelee 1 | 12 | 50% |
| lorneswork.Predator 1.0 | 6 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |
| adt.Ar2 1.0 | 1 | 0% |

Hadur died in 311 of 350 rounds, at a mean tick of 1102. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 157 | 50% | 170 |
| sgp.JollyNinja 3.53 | 43 | 14% | 53 |
| lorneswork.Predator 1.0 | 34 | 11% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 27 | 9% | 29 |
| mz.MicroGodMelee 1 | 23 | 7% | 32 |
| adt.Ar2 1.0 | 17 | 5% | 17 |
| kawigi.sbf.FloodSonnet 0.9 | 8 | 3% | 9 |
| skm.butterfly 1.0 | 2 | 1% | 2 |

## Melee bench: F02

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 65.4 | 53 / 350 | 4.11 | 13.7% | 42901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.5 | 14.7% | 87 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.0% | 86 |
| hadur117.nano.SanaroT60 0.1 | 2.5 | 13.7% | 53 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.3% | 6 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 11.0% | 43 |
| sch.Simone 0.3d | 6.8 | 8.5% | 29 |
| Noran.BitchingElk 0.054 | 7.2 | 7.9% | 28 |
| fnc.bandit.Bandit 5.2.0 | 7.8 | 7.5% | 3 |
| stelo.PatternRobot 1.0 | 8.2 | 6.8% | 11 |
| fullsail.SweetTea 1.1 | 10.0 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 71.1 | 7 / 35 | 4334 |
| 2 | 3 | 57.5 | 61.3 | 2 / 35 | 3939 |
| 3 | 3 | 59.5 | 65.1 | 6 / 35 | 4110 |
| 4 | 3 | 58.0 | 59.4 | 7 / 35 | 3997 |
| 5 | 3 | 59.4 | 62.5 | 7 / 35 | 4182 |
| 6 | 3 | 57.8 | 58.7 | 5 / 35 | 4234 |
| 7 | 1 | 61.0 | 68.9 | 6 / 35 | 4351 |
| 8 | 3 | 59.1 | 62.2 | 5 / 35 | 4247 |
| 9 | 1 | 61.9 | 69.2 | 5 / 35 | 4762 |
| 10 | 2 | 63.3 | 75.6 | 3 / 35 | 4745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 17% |
| pulsar.PulsarMax 0.8.9 | 41 | 59% |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 33% |
| Noran.BitchingElk 0.054 | 7 | 0% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 86% |
| stelo.PatternRobot 1.0 | 7 | 57% |
| sch.Simone 0.3d | 6 | 67% |
| fullsail.SweetTea 1.1 | 3 | 33% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |

Hadur died in 297 of 350 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 77 | 26% | 86 |
| pulsar.PulsarMax 0.8.9 | 72 | 24% | 95 |
| com.cohesiva.robocode.ManOwaR 1.0 | 43 | 14% | 49 |
| lrem.micro.SpikeSoldier 0.4 | 36 | 12% | 39 |
| stelo.PatternRobot 1.0 | 25 | 8% | 30 |
| fnc.bandit.Bandit 5.2.0 | 16 | 5% | 18 |
| Noran.BitchingElk 0.054 | 11 | 4% | 12 |
| sch.Simone 0.3d | 10 | 3% | 13 |
| fullsail.SweetTea 1.1 | 7 | 2% | 7 |

## Melee bench: F03

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 76.0 | 58 / 350 | 3.16 | 14.5% | 41701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.9 | 14.9% | 95 |
| hadur117.nano.SanaroT60 0.1 | 1.9 | 14.5% | 58 |
| kawigi.nano.Lib 1.0 | 2.5 | 14.7% | 101 |
| vuen.Cake 2.51 | 3.7 | 13.4% | 79 |
| urdos.URDOS 1.3 | 5.0 | 10.5% | 7 |
| adt.Ar1 2.1 | 6.3 | 8.0% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 7.4 | 7.1% | 0 |
| oa.weak.FlyMk1 0.1 | 7.9 | 6.5% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.6 | 5.8% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 74.6 | 7 / 35 | 3894 |
| 2 | 2 | 64.0 | 82.5 | 9 / 35 | 4144 |
| 3 | 3 | 60.7 | 73.0 | 4 / 35 | 4028 |
| 4 | 1 | 61.6 | 72.4 | 8 / 35 | 4418 |
| 5 | 3 | 61.1 | 74.9 | 4 / 35 | 3972 |
| 6 | 3 | 58.9 | 67.6 | 5 / 35 | 3958 |
| 7 | 2 | 63.0 | 79.4 | 3 / 35 | 4297 |
| 8 | 1 | 63.1 | 80.3 | 4 / 35 | 4334 |
| 9 | 1 | 63.4 | 80.0 | 5 / 35 | 4585 |
| 10 | 1 | 61.9 | 75.6 | 9 / 35 | 4071 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 65 | 37% |
| vuen.Cake 2.51 | 57 | 40% |
| kawigi.nano.Lib 1.0 | 47 | 9% |
| urdos.URDOS 1.3 | 4 | 75% |
| adt.Ar1 2.1 | 3 | 67% |
| oa.weak.FlyMk1 0.1 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% |

Hadur died in 294 of 350 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 90 | 31% | 97 |
| radnor.DoctorBob 1.42 | 76 | 26% | 99 |
| vuen.Cake 2.51 | 50 | 17% | 70 |
| urdos.URDOS 1.3 | 33 | 11% | 36 |
| adt.Ar1 2.1 | 17 | 6% | 18 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 3% | 10 |
| oa.weak.FlyMk1 0.1 | 8 | 3% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 1% | 4 |

## Melee bench: F04

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 70.7 | 9 / 350 | 3.64 | 13.9% | 44512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.8% | 313 |
| apc.LeeroyJenkins2 1.0 | 2.4 | 14.0% | 16 |
| hadur117.nano.SanaroT60 0.1 | 2.6 | 13.9% | 9 |
| TNT.TNT 0.99.1 | 4.1 | 10.6% | 7 |
| josago.Jorgito 0.16 | 5.2 | 9.0% | 1 |
| css.Delitioner 0.11 | 6.1 | 7.8% | 3 |
| tj.zombie1n 1.0.1 | 6.7 | 7.2% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.9% | 1 |
| sp.Nanos.Ember 1.1 | 9.1 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.9 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 68.6 | 2 / 35 | 4555 |
| 2 | 3 | 62.5 | 72.7 | 2 / 35 | 4421 |
| 3 | 3 | 62.5 | 72.1 | 1 / 35 | 4309 |
| 4 | 2 | 64.6 | 75.2 | 1 / 35 | 5147 |
| 5 | 3 | 63.2 | 74.9 | 0 / 35 | 4287 |
| 6 | 3 | 61.1 | 68.3 | 0 / 35 | 4284 |
| 7 | 2 | 63.1 | 73.0 | 2 / 35 | 4398 |
| 8 | 2 | 62.0 | 70.8 | 0 / 35 | 4396 |
| 9 | 3 | 58.6 | 62.2 | 0 / 35 | 3839 |
| 10 | 2 | 62.7 | 69.2 | 1 / 35 | 4876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 132 | 3% |
| apc.LeeroyJenkins2 1.0 | 7 | 43% |
| TNT.TNT 0.99.1 | 2 | 50% |
| rampancy.Durandal 2.1d | 1 | 100% |
| css.Delitioner 0.11 | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 341 of 350 rounds, at a mean tick of 1084. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 223 | 65% | 227 |
| apc.LeeroyJenkins2 1.0 | 50 | 15% | 53 |
| josago.Jorgito 0.16 | 32 | 9% | 32 |
| TNT.TNT 0.99.1 | 13 | 4% | 14 |
| css.Delitioner 0.11 | 11 | 3% | 11 |
| tj.zombie1n 1.0.1 | 5 | 1% | 5 |
| rampancy.Durandal 2.1d | 4 | 1% | 5 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 67.8 | 63 / 350 | 3.90 | 13.1% | 32757 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.3 | 15.5% | 93 |
| origin.SleepSiphon 1.7b | 2.1 | 14.9% | 106 |
| hadur117.nano.SanaroT60 0.1 | 3.2 | 13.1% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.2% | 42 |
| mld.Wisdom 1.0 | 4.6 | 11.2% | 18 |
| gg.Wolverine 2.0 | 6.3 | 8.4% | 13 |
| DBall.NUKE 0.1 | 7.5 | 7.7% | 6 |
| spinnercat.Omen 1.0 | 7.6 | 7.4% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.6% | 8 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.9 | 62.5 | 5 / 35 | 2924 |
| 2 | 3 | 59.3 | 68.6 | 4 / 35 | 3261 |
| 3 | 3 | 58.2 | 63.5 | 7 / 35 | 3169 |
| 4 | 3 | 60.4 | 70.8 | 5 / 35 | 3475 |
| 5 | 3 | 61.6 | 71.1 | 9 / 35 | 3577 |
| 6 | 5 | 57.2 | 65.4 | 3 / 35 | 2662 |
| 7 | 3 | 61.0 | 72.1 | 7 / 35 | 3297 |
| 8 | 3 | 60.0 | 68.3 | 7 / 35 | 3480 |
| 9 | 2 | 62.0 | 73.7 | 11 / 35 | 3415 |
| 10 | 3 | 58.0 | 61.9 | 5 / 35 | 3497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 47 | 53% |
| origin.SleepSiphon 1.7b | 40 | 30% |
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 68% |
| mld.Wisdom 1.0 | 6 | 33% |
| gg.Wolverine 2.0 | 4 | 100% |
| DBall.NUKE 0.1 | 2 | 0% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |

Hadur died in 289 of 350 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 84 | 29% | 101 |
| origin.SleepSiphon 1.7b | 74 | 26% | 91 |
| mld.Wisdom 1.0 | 55 | 19% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 37 | 13% | 55 |
| gg.Wolverine 2.0 | 19 | 7% | 22 |
| spinnercat.Omen 1.0 | 8 | 3% | 10 |
| DBall.NUKE 0.1 | 7 | 2% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.7 | 88 / 350 | 2.73 | 16.5% | 49577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 18.3% | 114 |
| rtk.Tachikoma 1.0 | 1.7 | 17.3% | 99 |
| hadur117.nano.SanaroT60 0.1 | 2.8 | 16.5% | 88 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.8% | 23 |
| franzor.Lizt 1.3.1 | 4.8 | 10.8% | 26 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.1% | 1 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.1 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.7 | 79.4 | 6 / 35 | 4531 |
| 2 | 2 | 67.9 | 85.1 | 9 / 35 | 5083 |
| 3 | 3 | 66.3 | 79.0 | 6 / 35 | 4910 |
| 4 | 3 | 68.6 | 82.5 | 14 / 35 | 5372 |
| 5 | 3 | 67.9 | 83.2 | 10 / 35 | 5152 |
| 6 | 2 | 66.7 | 77.8 | 12 / 35 | 4803 |
| 7 | 3 | 66.8 | 78.4 | 7 / 35 | 5260 |
| 8 | 3 | 66.9 | 80.3 | 9 / 35 | 4979 |
| 9 | 3 | 66.4 | 80.0 | 8 / 35 | 4547 |
| 10 | 3 | 67.0 | 81.6 | 7 / 35 | 4940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 97 | 60% |
| rsalesc.melee.Monk 0.3.6c | 60 | 12% |
| oog.melee.CapuletDroid 1.1 | 29 | 62% |
| franzor.Lizt 1.3.1 | 8 | 25% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 262 of 350 rounds, at a mean tick of 1246. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 120 | 46% | 185 |
| rsalesc.melee.Monk 0.3.6c | 95 | 36% | 105 |
| oog.melee.CapuletDroid 1.1 | 26 | 10% | 42 |
| franzor.Lizt 1.3.1 | 9 | 3% | 2 |
| exauge.GateKeeper 1.1.121g | 7 | 3% | 9 |
| lrem.micro.MoggFanatic 0.2 | 5 | 2% | 6 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.4 | 73 / 350 | 3.93 | 13.3% | 33569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| shrub.Vapour v159 | 1.6 | 14.1% | 92 |
| hadur117.nano.SanaroT60 0.1 | 2.2 | 13.3% | 73 |
| tm.Yuugao 1.0 | 2.2 | 13.8% | 90 |
| Krabb.sliNk.Garm 0.9u | 4.6 | 10.5% | 33 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.8% | 32 |
| m3thos.Eva00 1.1 | 5.8 | 9.4% | 16 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.5% | 14 |
| SHAM.WOW 1.4 | 8.7 | 7.1% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.9 | 6.9% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 6.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 67.3 | 7 / 35 | 3419 |
| 2 | 2 | 57.5 | 65.7 | 5 / 35 | 3236 |
| 3 | 3 | 58.1 | 65.7 | 9 / 35 | 3117 |
| 4 | 1 | 60.5 | 70.2 | 13 / 35 | 3457 |
| 5 | 3 | 58.2 | 64.4 | 4 / 35 | 3411 |
| 6 | 3 | 54.6 | 58.4 | 4 / 35 | 3071 |
| 7 | 2 | 59.3 | 69.8 | 6 / 35 | 3418 |
| 8 | 1 | 62.2 | 75.2 | 12 / 35 | 3811 |
| 9 | 3 | 59.4 | 68.3 | 7 / 35 | 3450 |
| 10 | 2 | 58.3 | 68.9 | 6 / 35 | 3179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 49 | 47% |
| shrub.Vapour v159 | 31 | 26% |
| Krabb.sliNk.Garm 0.9u | 18 | 78% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 77% |
| m3thos.Eva00 1.1 | 11 | 55% |
| com.spp.robocode.MostlyHarmless 010 | 8 | 38% |
| SHAM.WOW 1.4 | 7 | 71% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 282 of 350 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 68 | 24% | 80 |
| tm.Yuugao 1.0 | 66 | 23% | 92 |
| com.spp.robocode.MostlyHarmless 010 | 43 | 15% | 50 |
| m3thos.Eva00 1.1 | 26 | 9% | 30 |
| Krabb.sliNk.Garm 0.9u | 23 | 8% | 29 |
| jwst.DAD.DarkAndDarker 1.1 | 22 | 8% | 32 |
| zyx.nano.BacillusComma 1.0 | 15 | 5% | 17 |
| SHAM.WOW 1.4 | 11 | 4% | 15 |
| qualidafial.MajorDick 1.0.1 | 5 | 2% | 5 |
3 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 60.7 | 26 / 350 | 4.54 | 11.8% | 30718 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.1% | 198 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 60 |
| hadur117.nano.SanaroT60 0.1 | 3.6 | 11.8% | 26 |
| pedersen.Grishnakh 1.0 | 4.4 | 11.1% | 27 |
| yagami.Tidus 0.11 | 4.4 | 11.3% | 6 |
| mc2.enemy.Original 0.9 | 5.6 | 9.6% | 28 |
| dft.Calliope 5.6 | 7.1 | 7.7% | 3 |
| step.nanoPri 1.0 | 8.0 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.0% | 1 |
| rdm.Dueler 0.4x | 9.6 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 64.1 | 1 / 35 | 3266 |
| 2 | 3 | 57.1 | 60.6 | 3 / 35 | 3430 |
| 3 | 3 | 58.3 | 65.4 | 4 / 35 | 3078 |
| 4 | 3 | 55.6 | 60.3 | 2 / 35 | 3017 |
| 5 | 3 | 59.1 | 67.6 | 4 / 35 | 2989 |
| 6 | 4 | 56.6 | 57.1 | 3 / 35 | 3251 |
| 7 | 3 | 56.9 | 60.0 | 3 / 35 | 3174 |
| 8 | 4 | 55.8 | 57.1 | 3 / 35 | 2853 |
| 9 | 5 | 54.3 | 56.2 | 1 / 35 | 2720 |
| 10 | 5 | 55.5 | 58.4 | 2 / 35 | 2940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 36 | 28% |
| kc.micro.Figment 1.0 | 32 | 22% |
| mc2.enemy.Original 0.9 | 8 | 38% |
| yagami.Tidus 0.11 | 5 | 100% |
| pedersen.Grishnakh 1.0 | 3 | 33% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 324 of 350 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 97 | 30% | 107 |
| kc.micro.Figment 1.0 | 83 | 26% | 91 |
| yagami.Tidus 0.11 | 42 | 13% | 47 |
| mc2.enemy.Original 0.9 | 37 | 11% | 40 |
| pedersen.Grishnakh 1.0 | 37 | 11% | 37 |
| robar.nano.Assertive_Melee 0.2 | 10 | 3% | 10 |
| step.nanoPri 1.0 | 9 | 3% | 9 |
| dft.Calliope 5.6 | 8 | 2% | 8 |
| rdm.Dueler 0.4x | 1 | 0% | 1 |

## Melee bench: F10

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 75.8 | 81 / 350 | 3.17 | 14.9% | 42613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.4 | 15.3% | 113 |
| hadur117.nano.SanaroT60 0.1 | 1.8 | 14.9% | 81 |
| ne.Chimera 1.2 | 3.5 | 12.6% | 44 |
| ejb.Polaris 1.0.1 | 3.5 | 12.8% | 45 |
| vStar.RAFzilla 2.15 | 5.3 | 10.8% | 25 |
| tvv.micro.Antares 1.1.1 | 5.5 | 11.0% | 33 |
| sam.Samspin 1.0 | 7.4 | 7.1% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 6.0% | 0 |
| kurios.DOSexe .9b | 8.6 | 5.5% | 2 |
| donjezza.Muncho 1.0 | 9.8 | 3.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 79.4 | 9 / 35 | 4328 |
| 2 | 1 | 62.3 | 76.8 | 7 / 35 | 3992 |
| 3 | 2 | 62.9 | 75.6 | 8 / 35 | 4427 |
| 4 | 1 | 63.2 | 77.1 | 7 / 35 | 4478 |
| 5 | 2 | 63.4 | 75.9 | 9 / 35 | 4457 |
| 6 | 2 | 61.9 | 72.1 | 11 / 35 | 4067 |
| 7 | 2 | 63.1 | 75.6 | 9 / 35 | 4472 |
| 8 | 3 | 62.2 | 75.6 | 5 / 35 | 4011 |
| 9 | 2 | 62.9 | 75.9 | 8 / 35 | 4133 |
| 10 | 2 | 62.0 | 74.6 | 8 / 35 | 4248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 62 | 26% |
| ejb.Polaris 1.0.1 | 41 | 66% |
| ne.Chimera 1.2 | 26 | 27% |
| tvv.micro.Antares 1.1.1 | 22 | 50% |
| vStar.RAFzilla 2.15 | 20 | 60% |
| sam.Samspin 1.0 | 5 | 60% |
| donjezza.Muncho 1.0 | 4 | 50% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 270 of 350 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 95 | 35% | 109 |
| ne.Chimera 1.2 | 71 | 26% | 81 |
| ejb.Polaris 1.0.1 | 34 | 13% | 69 |
| tvv.micro.Antares 1.1.1 | 27 | 10% | 30 |
| vStar.RAFzilla 2.15 | 16 | 6% | 27 |
| sam.Samspin 1.0 | 14 | 5% | 17 |
| donjezza.Muncho 1.0 | 5 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 2% | 6 |
| kurios.DOSexe .9b | 3 | 1% | 5 |

## Melee bench: F11

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 59.9 | 36 / 350 | 4.61 | 11.8% | 31370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.7% | 163 |
| cx.mini.Nimrod 0.55 | 2.1 | 13.2% | 54 |
| hadur117.nano.SanaroT60 0.1 | 3.1 | 11.8% | 36 |
| djc.DynaBot 0.1.1 | 3.9 | 10.8% | 20 |
| br2.MobyDickBot 1.6 | 5.6 | 9.6% | 22 |
| rdt199.Warlord 0.73 | 5.8 | 9.6% | 23 |
| uji.YellohFellah 1.0 | 7.0 | 8.8% | 28 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.9% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.9 | 6.2% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.0 | 60.3 | 4 / 35 | 2972 |
| 2 | 3 | 53.9 | 58.1 | 1 / 35 | 2768 |
| 3 | 2 | 59.8 | 68.6 | 6 / 35 | 3372 |
| 4 | 3 | 55.6 | 58.7 | 3 / 35 | 3239 |
| 5 | 3 | 57.9 | 62.5 | 2 / 35 | 3600 |
| 6 | 3 | 55.7 | 59.0 | 3 / 35 | 3188 |
| 7 | 4 | 51.9 | 51.7 | 3 / 35 | 2707 |
| 8 | 3 | 55.7 | 57.5 | 6 / 35 | 3073 |
| 9 | 4 | 54.1 | 53.7 | 1 / 35 | 3382 |
| 10 | 3 | 59.5 | 69.2 | 7 / 35 | 3069 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 48 | 29% |
| cx.mini.Nimrod 0.55 | 21 | 29% |
| uji.YellohFellah 1.0 | 9 | 11% |
| rdt199.Warlord 0.73 | 9 | 78% |
| br2.MobyDickBot 1.6 | 8 | 38% |
| djc.DynaBot 0.1.1 | 7 | 71% |
| KiraNL.Chupacabra 0.4 | 2 | 0% |

Hadur died in 314 of 350 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 108 | 34% | 120 |
| cx.mini.Nimrod 0.55 | 75 | 24% | 80 |
| rdt199.Warlord 0.73 | 35 | 11% | 43 |
| djc.DynaBot 0.1.1 | 24 | 8% | 27 |
| br2.MobyDickBot 1.6 | 20 | 6% | 24 |
| KiraNL.Chupacabra 0.4 | 19 | 6% | 19 |
| uji.YellohFellah 1.0 | 16 | 5% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 3% | 10 |
| stelo.MirrorNano 1.3 | 7 | 2% | 7 |

## Melee bench: F12

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 65.0 | 52 / 350 | 4.15 | 12.5% | 29441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.5 | 14.5% | 95 |
| nat.PallasHawk 1.0 | 2.2 | 14.1% | 88 |
| darkcanuck.Leon 1.01 | 2.7 | 13.2% | 62 |
| hadur117.nano.SanaroT60 0.1 | 3.8 | 12.5% | 52 |
| brainfade.melee.Genghis 0.36 | 4.9 | 11.1% | 31 |
| jrm.Test0 1.0 | 6.7 | 7.9% | 6 |
| jp.Perpy 16.0 | 7.1 | 7.4% | 5 |
| cs.sheldor.Talon 1.1 | 7.6 | 7.2% | 1 |
| jaybot.bots.Oddball 4.0 | 8.8 | 6.4% | 10 |
| stuff.Vlad 0.1 | 9.7 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.2 | 61.0 | 6 / 35 | 2748 |
| 2 | 3 | 59.2 | 66.7 | 8 / 35 | 3171 |
| 3 | 4 | 55.9 | 61.0 | 3 / 35 | 2917 |
| 4 | 4 | 55.6 | 61.6 | 4 / 35 | 2783 |
| 5 | 4 | 58.5 | 65.7 | 8 / 35 | 2915 |
| 6 | 1 | 61.8 | 75.9 | 9 / 35 | 3280 |
| 7 | 4 | 57.6 | 65.7 | 2 / 35 | 3121 |
| 8 | 4 | 58.3 | 68.3 | 5 / 35 | 2823 |
| 9 | 5 | 54.0 | 58.4 | 3 / 35 | 2524 |
| 10 | 4 | 58.4 | 65.7 | 4 / 35 | 3159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 42 | 38% |
| nat.PallasHawk 1.0 | 35 | 23% |
| darkcanuck.Leon 1.01 | 31 | 32% |
| brainfade.melee.Genghis 0.36 | 19 | 63% |
| cs.sheldor.Talon 1.1 | 5 | 80% |
| jrm.Test0 1.0 | 4 | 25% |
| jaybot.bots.Oddball 4.0 | 3 | 0% |
| jp.Perpy 16.0 | 3 | 33% |

Hadur died in 298 of 350 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 71 | 24% | 86 |
| nat.PallasHawk 1.0 | 63 | 21% | 74 |
| darkcanuck.Leon 1.01 | 49 | 16% | 64 |
| brainfade.melee.Genghis 0.36 | 39 | 13% | 44 |
| jrm.Test0 1.0 | 23 | 8% | 26 |
| jp.Perpy 16.0 | 18 | 6% | 17 |
| jaybot.bots.Oddball 4.0 | 17 | 6% | 18 |
| cs.sheldor.Talon 1.1 | 12 | 4% | 14 |
| stuff.Vlad 0.1 | 6 | 2% | 6 |

## Melee bench: F13

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 69.0 | 28 / 350 | 3.79 | 12.7% | 32931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.4% | 164 |
| ags.Glacier 0.2.11 | 1.6 | 17.3% | 95 |
| hadur117.nano.SanaroT60 0.1 | 3.6 | 12.7% | 28 |
| shinh.Entangled 0.3 | 3.7 | 12.6% | 42 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.8% | 20 |
| apc.Colossus2 0.17 | 6.1 | 8.1% | 0 |
| stelo.Wang 1.0 | 6.9 | 6.8% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 66.0 | 5 / 35 | 3036 |
| 2 | 5 | 57.3 | 65.7 | 1 / 35 | 2653 |
| 3 | 4 | 58.3 | 64.8 | 3 / 35 | 3264 |
| 4 | 3 | 60.2 | 70.8 | 3 / 35 | 3325 |
| 5 | 4 | 59.2 | 68.3 | 2 / 35 | 3329 |
| 6 | 3 | 58.6 | 67.0 | 1 / 35 | 3431 |
| 7 | 3 | 63.0 | 78.1 | 5 / 35 | 3847 |
| 8 | 3 | 61.2 | 72.7 | 3 / 35 | 3580 |
| 9 | 4 | 58.7 | 67.6 | 1 / 35 | 3028 |
| 10 | 3 | 59.9 | 69.2 | 4 / 35 | 3438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 51 | 14% |
| mn.Combat 3.25.0 | 47 | 23% |
| shinh.Entangled 0.3 | 20 | 30% |
| gh.micro.Gruweltje 0.7 | 2 | 0% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 118 | 37% | 124 |
| mn.Combat 3.25.0 | 89 | 28% | 100 |
| shinh.Entangled 0.3 | 41 | 13% | 47 |
| gh.micro.Gruweltje 0.7 | 33 | 10% | 33 |
| stelo.Wang 1.0 | 21 | 7% | 23 |
| apc.Colossus2 0.17 | 7 | 2% | 8 |
| maribo.FollowFire 1 | 7 | 2% | 7 |
| ayk.WallHugger 1.0 | 6 | 2% | 7 |

## Melee bench: F14

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 72.4 | 63 / 350 | 3.49 | 13.7% | 35098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.4% | 149 |
| hadur117.nano.SanaroT60 0.1 | 2.0 | 13.7% | 63 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.5% | 77 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 10.5% | 7 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 10.4% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 10.1% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 6.2 | 9.8% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 8.2% | 17 |
| pa.Improved 1.0 | 9.0 | 5.5% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 76.8 | 7 / 35 | 3796 |
| 2 | 2 | 60.1 | 70.2 | 7 / 35 | 3398 |
| 3 | 2 | 60.0 | 70.8 | 7 / 35 | 3066 |
| 4 | 2 | 59.6 | 71.1 | 6 / 35 | 3159 |
| 5 | 2 | 60.1 | 70.5 | 4 / 35 | 3352 |
| 6 | 2 | 60.1 | 70.2 | 8 / 35 | 3241 |
| 7 | 2 | 60.7 | 70.5 | 6 / 35 | 3670 |
| 8 | 2 | 63.0 | 77.5 | 8 / 35 | 3827 |
| 9 | 2 | 61.2 | 73.7 | 6 / 35 | 3716 |
| 10 | 2 | 61.4 | 72.7 | 4 / 35 | 3873 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 19% |
| catcat20.shape.Theta 0.018 | 41 | 49% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 93% |
| Lo_Ian.Gandalf_V4 4.0 | 11 | 36% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 60% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 38% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 67% |

Hadur died in 288 of 350 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 123 | 43% | 132 |
| catcat20.shape.Theta 0.018 | 49 | 17% | 68 |
| Lo_Ian.Gandalf_V4 4.0 | 28 | 10% | 32 |
| sanyi.mikrobi.Roberto 1.0 | 27 | 9% | 35 |
| dmh.robocode.robot.RedDwarf 0.4 | 23 | 8% | 32 |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 7% | 26 |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 5% | 18 |
| pa.Improved 1.0 | 2 | 1% | 5 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 63.2 | 46 / 350 | 4.31 | 12.8% | 37293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.1 | 15.5% | 90 |
| mld.DustBunny 3.8 | 2.9 | 13.0% | 38 |
| emp.Yngwie 1.11 | 2.9 | 13.7% | 110 |
| hadur117.nano.SanaroT60 0.1 | 3.4 | 12.8% | 46 |
| cb.nano.Insomnia 1.0 | 4.9 | 11.3% | 21 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.2% | 41 |
| Grystrion.TrackerWO 1.0 | 7.6 | 7.0% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.5% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.1 | 66.7 | 3 / 35 | 3753 |
| 2 | 5 | 53.6 | 51.7 | 4 / 35 | 3241 |
| 3 | 3 | 60.6 | 67.9 | 7 / 35 | 3730 |
| 4 | 3 | 59.3 | 64.4 | 4 / 35 | 3895 |
| 5 | 4 | 59.4 | 64.1 | 8 / 35 | 3721 |
| 6 | 3 | 59.0 | 63.5 | 4 / 35 | 3860 |
| 7 | 2 | 59.7 | 66.0 | 3 / 35 | 3911 |
| 8 | 4 | 58.7 | 63.5 | 5 / 35 | 3576 |
| 9 | 4 | 57.9 | 60.3 | 5 / 35 | 3663 |
| 10 | 4 | 58.8 | 64.1 | 3 / 35 | 3943 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 42 | 33% |
| emp.Yngwie 1.11 | 28 | 36% |
| mld.DustBunny 3.8 | 14 | 21% |
| cb.nano.Insomnia 1.0 | 13 | 77% |
| kawigi.robot.Girl 1.2 | 12 | 42% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 67 | 22% | 80 |
| kawigi.micro.Shiz 1.1 | 64 | 21% | 81 |
| mld.DustBunny 3.8 | 58 | 19% | 67 |
| cb.nano.Insomnia 1.0 | 47 | 15% | 45 |
| kawigi.robot.Girl 1.2 | 33 | 11% | 38 |
| divineomega.TrialBot 0.003 | 11 | 4% | 14 |
| lambdaxy.TBot 0.1 | 11 | 4% | 11 |
| Grystrion.TrackerWO 1.0 | 11 | 4% | 11 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 1% | 3 |

## Melee bench: F16

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 63.0 | 23 / 350 | 4.33 | 12.9% | 40551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.3% | 173 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 15.1% | 41 |
| hadur117.nano.SanaroT60 0.1 | 3.0 | 12.9% | 23 |
| techdude.forest.FlamingForest 1.1 | 4.4 | 10.5% | 64 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.7% | 24 |
| bvh.fnr.Fenrir 0.36l | 5.4 | 9.7% | 7 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 8.4% | 7 |
| repositorio.NanoStep 1.0 | 8.5 | 5.4% | 2 |
| asd.Cthulhu 1.3 | 9.1 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.4 | 4.9% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 63.8 | 0 / 35 | 4173 |
| 2 | 3 | 57.2 | 58.7 | 2 / 35 | 3749 |
| 3 | 3 | 60.3 | 64.1 | 3 / 35 | 4409 |
| 4 | 3 | 57.4 | 60.3 | 2 / 35 | 3818 |
| 5 | 3 | 62.1 | 70.5 | 5 / 35 | 4338 |
| 6 | 3 | 59.3 | 62.5 | 0 / 35 | 4211 |
| 7 | 3 | 59.0 | 63.5 | 4 / 35 | 4051 |
| 8 | 3 | 59.0 | 63.2 | 2 / 35 | 4075 |
| 9 | 3 | 59.9 | 65.1 | 3 / 35 | 4133 |
| 10 | 3 | 56.5 | 57.8 | 2 / 35 | 3594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 67 | 4% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 45% |
| tvv.nano.Polaris 1.2 | 12 | 25% |
| techdude.forest.FlamingForest 1.1 | 8 | 38% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |
| bvh.fnr.Fenrir 0.36l | 2 | 50% |
| divineomega.DivineBot 1.9.4.5 | 2 | 50% |
| repositorio.NanoStep 1.0 | 2 | 50% |

Hadur died in 327 of 350 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 137 | 42% | 141 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 72 | 22% | 80 |
| bvh.fnr.Fenrir 0.36l | 36 | 11% | 38 |
| techdude.forest.FlamingForest 1.1 | 24 | 7% | 27 |
| stelo.IntrinsicVolatility 1.4 | 22 | 7% | 23 |
| tvv.nano.Polaris 1.2 | 22 | 7% | 22 |
| divineomega.DivineBot 1.9.4.5 | 7 | 2% | 10 |
| asd.Cthulhu 1.3 | 4 | 1% | 4 |
| repositorio.NanoStep 1.0 | 3 | 1% | 4 |

## Melee bench: F17

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 62.6 | 51 / 350 | 4.37 | 12.6% | 36241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 1.7 | 14.4% | 97 |
| et.Predator 1.8 | 2.5 | 13.9% | 65 |
| hadur117.nano.SanaroT60 0.1 | 3.3 | 12.6% | 51 |
| cx.BlestPain 1.41 | 3.6 | 12.6% | 61 |
| ahf.NanoAndrew .4 | 4.6 | 11.7% | 38 |
| nic.Nicator 2.4 | 5.4 | 11.3% | 31 |
| maribo.melee.BMV 0.1 | 6.9 | 9.0% | 5 |
| tex.Longbot 0.4 | 8.5 | 5.9% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 2 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.3 | 54.0 | 8 / 35 | 3258 |
| 2 | 3 | 58.3 | 64.1 | 2 / 35 | 3766 |
| 3 | 4 | 58.6 | 64.4 | 3 / 35 | 3581 |
| 4 | 3 | 58.2 | 64.4 | 3 / 35 | 3310 |
| 5 | 1 | 60.4 | 66.7 | 9 / 35 | 3864 |
| 6 | 2 | 60.9 | 68.9 | 6 / 35 | 4038 |
| 7 | 2 | 60.0 | 65.4 | 5 / 35 | 3884 |
| 8 | 5 | 59.0 | 62.5 | 6 / 35 | 3618 |
| 9 | 4 | 56.4 | 56.2 | 4 / 35 | 3740 |
| 10 | 5 | 56.6 | 59.0 | 5 / 35 | 3182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 38 | 42% |
| et.Predator 1.8 | 34 | 15% |
| cx.BlestPain 1.41 | 24 | 92% |
| nic.Nicator 2.4 | 16 | 31% |
| ahf.NanoAndrew .4 | 11 | 27% |
| maribo.melee.BMV 0.1 | 1 | 0% |

Hadur died in 299 of 350 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 70 | 23% | 77 |
| oog.melee.Mercutio 1.0 | 54 | 18% | 71 |
| ahf.NanoAndrew .4 | 52 | 17% | 55 |
| nic.Nicator 2.4 | 39 | 13% | 43 |
| cx.BlestPain 1.41 | 36 | 12% | 55 |
| maribo.melee.BMV 0.1 | 26 | 9% | 27 |
| tex.Longbot 0.4 | 13 | 4% | 13 |
| goblin.Bender 2.4 | 5 | 2% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 1% | 4 |

## Melee bench: F18

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 68.5 | 64 / 350 | 3.83 | 13.6% | 35846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.4 | 14.5% | 93 |
| hadur117.nano.SanaroT60 0.1 | 2.3 | 13.6% | 64 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.3% | 70 |
| uji.DBH 1.1 | 3.7 | 11.6% | 48 |
| spinnercat.Robovirus 2.718 | 5.2 | 10.4% | 21 |
| ratosh.Nobo 0.21 | 5.3 | 10.6% | 15 |
| sigterm.Sigterm 1.0 | 7.0 | 8.5% | 21 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.2% | 11 |
| stelo.WangRobot 1.0 | 9.2 | 5.8% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 73.7 | 6 / 35 | 3669 |
| 2 | 3 | 58.2 | 65.7 | 2 / 35 | 3591 |
| 3 | 2 | 60.5 | 70.8 | 7 / 35 | 3568 |
| 4 | 3 | 58.8 | 66.7 | 6 / 35 | 3446 |
| 5 | 1 | 61.3 | 71.1 | 10 / 35 | 3816 |
| 6 | 1 | 63.2 | 78.7 | 11 / 35 | 3738 |
| 7 | 1 | 61.4 | 74.3 | 6 / 35 | 3796 |
| 8 | 2 | 58.1 | 63.5 | 6 / 35 | 3729 |
| 9 | 5 | 53.3 | 53.7 | 4 / 35 | 3080 |
| 10 | 3 | 59.2 | 67.3 | 6 / 35 | 3413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 44 | 36% |
| agd.Mooserwirt2 2.7 | 28 | 46% |
| uji.DBH 1.1 | 21 | 38% |
| spinnercat.Robovirus 2.718 | 16 | 75% |
| ratosh.Nobo 0.21 | 14 | 29% |
| sigterm.Sigterm 1.0 | 14 | 43% |
| stelo.WangRobot 1.0 | 5 | 60% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 50% |

Hadur died in 286 of 350 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 95 | 33% | 114 |
| agd.Mooserwirt2 2.7 | 44 | 15% | 56 |
| ratosh.Nobo 0.21 | 36 | 13% | 42 |
| uji.DBH 1.1 | 36 | 13% | 41 |
| sigterm.Sigterm 1.0 | 21 | 7% | 30 |
| spinnercat.Robovirus 2.718 | 19 | 7% | 26 |
| kawigi.mini.Fhqwhgads 1.1 | 16 | 6% | 19 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10 | 3% | 10 |
| stelo.WangRobot 1.0 | 9 | 3% | 12 |

## Melee bench: F19

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.0 | 84 / 350 | 2.89 | 15.7% | 42445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.4 | 17.0% | 125 |
| hadur117.nano.SanaroT60 0.1 | 2.2 | 15.7% | 84 |
| mld.Infinity 2.2 | 2.4 | 16.1% | 110 |
| krillr.mini.JointStrike 2.0.0 | 4.1 | 11.2% | 8 |
| erdnis.Rover 0.3 | 4.9 | 10.3% | 7 |
| patson.PatsonTestBot 1.0 | 6.1 | 8.7% | 7 |
| mbh.Mbh 0.1 | 7.2 | 7.3% | 1 |
| pac.ABC 2.1 | 7.9 | 6.7% | 8 |
| pbg.R2D2 1.0 | 8.8 | 6.0% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 79.7 | 7 / 35 | 4921 |
| 2 | 2 | 64.9 | 78.4 | 8 / 35 | 4214 |
| 3 | 2 | 64.9 | 79.0 | 9 / 35 | 4096 |
| 4 | 2 | 65.5 | 82.5 | 7 / 35 | 4367 |
| 5 | 3 | 64.4 | 76.5 | 6 / 35 | 4120 |
| 6 | 3 | 65.7 | 81.3 | 10 / 35 | 4007 |
| 7 | 3 | 64.6 | 75.9 | 9 / 35 | 4164 |
| 8 | 1 | 66.6 | 83.5 | 14 / 35 | 4341 |
| 9 | 2 | 64.4 | 76.2 | 10 / 35 | 4221 |
| 10 | 3 | 64.0 | 77.1 | 4 / 35 | 3994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 92 | 60% |
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 16% |
| erdnis.Rover 0.3 | 9 | 67% |
| patson.PatsonTestBot 1.0 | 5 | 40% |
| krillr.mini.JointStrike 2.0.0 | 5 | 80% |
| pac.ABC 2.1 | 3 | 33% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 266 of 350 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 124 | 47% | 182 |
| mld.Infinity 2.2 | 58 | 22% | 32 |
| erdnis.Rover 0.3 | 24 | 9% | 35 |
| krillr.mini.JointStrike 2.0.0 | 23 | 9% | 34 |
| patson.PatsonTestBot 1.0 | 21 | 8% | 28 |
| mbh.Mbh 0.1 | 7 | 3% | 13 |
| pac.ABC 2.1 | 6 | 2% | 7 |
| pbg.R2D2 1.0 | 3 | 1% | 13 |

## Melee bench: F20

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 63.7 | 51 / 350 | 4.27 | 12.7% | 35615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.6% | 145 |
| hadur117.nano.SanaroT60 0.1 | 2.8 | 12.7% | 51 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.0% | 36 |
| fwb.Nine 1.0.1 | 3.9 | 11.6% | 45 |
| catcat20.Rabbit 0.001 | 4.9 | 10.3% | 37 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.8% | 8 |
| m3thos.mini.Eva01 0.5.5 | 6.6 | 9.0% | 10 |
| bayen.nut.Squirrel 1.615 | 7.3 | 8.2% | 17 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 66.0 | 5 / 35 | 3937 |
| 2 | 2 | 61.6 | 72.4 | 7 / 35 | 3889 |
| 3 | 4 | 58.4 | 63.5 | 5 / 35 | 3497 |
| 4 | 2 | 62.4 | 73.0 | 11 / 35 | 3880 |
| 5 | 3 | 55.7 | 58.7 | 3 / 35 | 3325 |
| 6 | 4 | 55.5 | 56.5 | 4 / 35 | 3408 |
| 7 | 4 | 55.3 | 57.8 | 4 / 35 | 3088 |
| 8 | 2 | 58.3 | 63.8 | 6 / 35 | 3502 |
| 9 | 2 | 58.4 | 65.1 | 4 / 35 | 3687 |
| 10 | 3 | 56.2 | 59.7 | 2 / 35 | 3402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 54 | 31% |
| catcat20.Rabbit 0.001 | 18 | 56% |
| fwb.Nine 1.0.1 | 10 | 80% |
| nz.jdc.nano.GridFu 1.0 | 10 | 40% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 5 | 60% |
| m3thos.mini.Eva01 0.5.5 | 4 | 75% |

Hadur died in 299 of 350 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 116 | 39% | 126 |
| fwb.Nine 1.0.1 | 51 | 17% | 57 |
| nz.jdc.nano.GridFu 1.0 | 45 | 15% | 51 |
| catcat20.Rabbit 0.001 | 24 | 8% | 38 |
| bayen.nut.Squirrel 1.615 | 23 | 8% | 26 |
| djdjdj.NanoSkunk10 1.0 | 16 | 5% | 21 |
| m3thos.mini.Eva01 0.5.5 | 14 | 5% | 20 |
| ntc.ControlledChaos 1.1.4 | 8 | 3% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 3 |

## Melee bench: F21

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 81.1 | 117 / 350 | 2.70 | 16.9% | 48145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroT60 0.1 | 1.5 | 16.9% | 117 |
| eem.EvBot v4.6.16 | 1.7 | 16.9% | 138 |
| dummy.mini.Scimitar 1.01 | 2.8 | 14.8% | 39 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.2% | 27 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.5% | 6 |
| eld.Hmm 1.0 | 5.5 | 8.4% | 22 |
| fire219.CatBot 1.0 | 7.2 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 1 |
| PSW.Relentless 0.1 | 8.9 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 87.9 | 16 / 35 | 4419 |
| 2 | 1 | 65.6 | 78.4 | 14 / 35 | 4768 |
| 3 | 3 | 64.9 | 77.1 | 8 / 35 | 4828 |
| 4 | 1 | 66.3 | 83.2 | 11 / 35 | 4671 |
| 5 | 2 | 65.5 | 78.7 | 13 / 35 | 4704 |
| 6 | 1 | 67.8 | 83.2 | 12 / 35 | 5534 |
| 7 | 1 | 66.1 | 81.3 | 14 / 35 | 4524 |
| 8 | 1 | 67.9 | 82.5 | 11 / 35 | 5444 |
| 9 | 2 | 66.4 | 80.6 | 11 / 35 | 4922 |
| 10 | 2 | 65.0 | 78.4 | 7 / 35 | 4331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 129 | 51% |
| dummy.mini.Scimitar 1.01 | 40 | 75% |
| cf.RiO.RiOx 4.2.1 | 27 | 37% |
| eld.Hmm 1.0 | 8 | 63% |
| oa.weak.BotherBot 0.1 | 8 | 75% |

Hadur died in 233 of 350 rounds, at a mean tick of 1072. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 97 | 42% | 137 |
| dummy.mini.Scimitar 1.01 | 49 | 21% | 91 |
| cf.RiO.RiOx 4.2.1 | 46 | 20% | 55 |
| oa.weak.BotherBot 0.1 | 14 | 6% | 25 |
| eld.Hmm 1.0 | 11 | 5% | 23 |
| el.JumpShoot 0.2 | 6 | 3% | 9 |
| fire219.CatBot 1.0 | 5 | 2% | 5 |
| PSW.Relentless 0.1 | 3 | 1% | 3 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |

## Melee bench: F23

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.4 | 101 / 350 | 2.86 | 15.7% | 39344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.4% | 148 |
| hadur117.nano.SanaroT60 0.1 | 2.3 | 15.7% | 101 |
| cre.Karolos 0.32 | 2.7 | 14.5% | 55 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 11.5% | 16 |
| stelo.RamTrackSurfer 1.2 | 5.9 | 9.4% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.9% | 2 |
| sample.Walls 1.0 | 6.4 | 8.8% | 13 |
| cw.megas.Blade 0.8 | 7.2 | 8.1% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 78.4 | 12 / 35 | 3869 |
| 2 | 2 | 66.0 | 83.8 | 11 / 35 | 3938 |
| 3 | 2 | 63.1 | 72.1 | 9 / 35 | 4030 |
| 4 | 2 | 67.6 | 86.3 | 12 / 35 | 4040 |
| 5 | 3 | 64.4 | 75.9 | 9 / 35 | 3939 |
| 6 | 2 | 65.3 | 80.6 | 11 / 35 | 3821 |
| 7 | 3 | 63.4 | 75.9 | 8 / 35 | 3620 |
| 8 | 2 | 65.9 | 82.9 | 8 / 35 | 4113 |
| 9 | 3 | 65.0 | 76.5 | 7 / 35 | 3997 |
| 10 | 2 | 66.5 | 81.3 | 14 / 35 | 3977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 111 | 43% |
| cre.Karolos 0.32 | 44 | 45% |
| sample.Walls 1.0 | 22 | 77% |
| stelo.AreaTargetingBot 1.1 | 13 | 46% |
| stelo.RamTrackSurfer 1.2 | 11 | 64% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 67% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 250 of 350 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 132 | 53% | 182 |
| cre.Karolos 0.32 | 61 | 24% | 81 |
| stelo.AreaTargetingBot 1.1 | 18 | 7% | 30 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 12 | 5% | 14 |
| stelo.RamTrackSurfer 1.2 | 11 | 4% | 17 |
| sample.Walls 1.0 | 9 | 4% | 18 |
| cw.megas.Blade 0.8 | 7 | 3% | 7 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.9 | 59.6 | 52 / 350 | 4.64 | 11.7% | 29912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.6 | 14.5% | 89 |
| florent.XSeries.X2 0.12 | 2.4 | 13.8% | 67 |
| davidalves.Phoenix 0.54 | 2.8 | 13.1% | 68 |
| pedersen.Ugluk 1.1.1 | 3.8 | 12.2% | 43 |
| hadur117.nano.SanaroT60 0.1 | 4.5 | 11.7% | 52 |
| oog.melee.Corsair 1.0 | 6.1 | 9.4% | 9 |
| stelo.SoJNanoMelee 1.1 | 6.9 | 8.4% | 19 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.8% | 4 |
| as.FrankTheTank 1.3 | 9.4 | 5.1% | 0 |
| evd.X1 0.01 | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.7 | 62.2 | 3 / 35 | 2948 |
| 2 | 5 | 55.9 | 59.7 | 5 / 35 | 2815 |
| 3 | 4 | 58.0 | 66.3 | 7 / 35 | 2971 |
| 4 | 4 | 56.1 | 59.4 | 5 / 35 | 3150 |
| 5 | 4 | 55.0 | 59.7 | 3 / 35 | 2989 |
| 6 | 5 | 54.4 | 53.7 | 5 / 35 | 3113 |
| 7 | 4 | 55.8 | 59.4 | 7 / 35 | 2871 |
| 8 | 4 | 58.7 | 66.7 | 5 / 35 | 3139 |
| 9 | 5 | 54.3 | 54.6 | 6 / 35 | 2874 |
| 10 | 5 | 54.3 | 54.0 | 6 / 35 | 3042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 36 | 33% |
| davidalves.Phoenix 0.54 | 23 | 61% |
| florent.XSeries.X2 0.12 | 18 | 72% |
| pedersen.Ugluk 1.1.1 | 15 | 53% |
| stelo.SoJNanoMelee 1.1 | 6 | 50% |
| oog.melee.Corsair 1.0 | 3 | 67% |
| lunchie.Lunchbox 0.93 | 1 | 0% |

Hadur died in 298 of 350 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 72 | 24% | 86 |
| florent.XSeries.X2 0.12 | 54 | 18% | 67 |
| davidalves.Phoenix 0.54 | 50 | 17% | 60 |
| pedersen.Ugluk 1.1.1 | 50 | 17% | 53 |
| stelo.SoJNanoMelee 1.1 | 26 | 9% | 27 |
| oog.melee.Corsair 1.0 | 23 | 8% | 30 |
| lunchie.Lunchbox 0.93 | 12 | 4% | 14 |
| evd.X1 0.01 | 8 | 3% | 9 |
| as.FrankTheTank 1.3 | 3 | 1% | 4 |

## Melee bench: F25

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.1 | 60 / 350 | 3.96 | 13.1% | 30553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.4 | 14.4% | 79 |
| hadur117.nano.SanaroT60 0.1 | 2.7 | 13.1% | 60 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.1% | 58 |
| jdw.Hurricane 1.4 | 3.2 | 12.6% | 62 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 10.6% | 46 |
| ds.Oo 2.2 | 6.2 | 9.2% | 19 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.8% | 19 |
| awesomeness.Elite 1.0 | 8.4 | 7.1% | 5 |
| adt.Ar2 1.1 | 8.5 | 6.6% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.0 | 58.4 | 7 / 35 | 2579 |
| 2 | 4 | 56.8 | 63.2 | 5 / 35 | 2721 |
| 3 | 1 | 59.8 | 67.6 | 10 / 35 | 3183 |
| 4 | 2 | 61.4 | 70.8 | 9 / 35 | 3529 |
| 5 | 3 | 57.7 | 65.1 | 4 / 35 | 2953 |
| 6 | 3 | 57.2 | 65.1 | 4 / 35 | 2741 |
| 7 | 2 | 60.4 | 72.4 | 6 / 35 | 3086 |
| 8 | 3 | 59.4 | 69.2 | 3 / 35 | 3405 |
| 9 | 2 | 60.2 | 71.7 | 6 / 35 | 3275 |
| 10 | 3 | 59.0 | 67.9 | 6 / 35 | 3081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 40 | 33% |
| jdw.Hurricane 1.4 | 34 | 65% |
| voidious.micro.BlitzBat 1.05 | 23 | 17% |
| gre.svman4.Morfeas 1.4.1 | 14 | 29% |
| gjr.Cephalosporin 0.1 | 10 | 40% |
| awesomeness.Elite 1.0 | 7 | 100% |
| ds.Oo 2.2 | 6 | 33% |
| adt.Ar2 1.1 | 4 | 75% |

Hadur died in 292 of 350 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 72 | 25% | 78 |
| voidious.mini.BrokenSword 2.0.3 | 67 | 23% | 80 |
| jdw.Hurricane 1.4 | 48 | 16% | 66 |
| gre.svman4.Morfeas 1.4.1 | 36 | 12% | 41 |
| ds.Oo 2.2 | 25 | 9% | 29 |
| gjr.Cephalosporin 0.1 | 19 | 7% | 25 |
| adt.Ar2 1.1 | 15 | 5% | 18 |
| awesomeness.Elite 1.0 | 8 | 3% | 12 |
| amk.ChumbaMini 0.2 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 69.4 | 50 / 350 | 3.75 | 13.6% | 40074 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.1 | 16.1% | 124 |
| hadur117.nano.SanaroT60 0.1 | 2.6 | 13.6% | 50 |
| shu.nitro.LENIN .T34 | 2.9 | 13.1% | 75 |
| lrem.Spectre 0.4.4 | 4.0 | 12.3% | 48 |
| js.PinBall 1.6 | 4.9 | 11.3% | 17 |
| gh.mini.GrubbmOne 1.0 | 5.8 | 10.5% | 23 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.2% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.6% | 5 |
| sample.SpinBot 1.0 | 8.9 | 5.6% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 63.8 | 4 / 35 | 4068 |
| 2 | 3 | 60.0 | 71.1 | 5 / 35 | 3634 |
| 3 | 4 | 60.5 | 68.9 | 3 / 35 | 3863 |
| 4 | 2 | 63.2 | 75.6 | 8 / 35 | 4282 |
| 5 | 4 | 58.5 | 64.4 | 2 / 35 | 3794 |
| 6 | 2 | 61.3 | 70.2 | 5 / 35 | 4308 |
| 7 | 2 | 59.4 | 68.3 | 5 / 35 | 3672 |
| 8 | 3 | 58.9 | 65.1 | 5 / 35 | 3708 |
| 9 | 2 | 60.6 | 66.3 | 4 / 35 | 4395 |
| 10 | 1 | 64.6 | 80.3 | 9 / 35 | 4350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 51 | 20% |
| shu.nitro.LENIN .T34 | 37 | 32% |
| lrem.Spectre 0.4.4 | 33 | 39% |
| gh.mini.GrubbmOne 1.0 | 15 | 33% |
| js.PinBall 1.6 | 7 | 57% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 57% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| sample.SpinBot 1.0 | 1 | 0% |

Hadur died in 302 of 350 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 88 | 29% | 97 |
| shu.nitro.LENIN .T34 | 61 | 20% | 79 |
| lrem.Spectre 0.4.4 | 56 | 19% | 62 |
| gh.mini.GrubbmOne 1.0 | 40 | 13% | 46 |
| jaybot.adv.bots.JayBot 2.0 | 21 | 7% | 23 |
| js.PinBall 1.6 | 17 | 6% | 22 |
| fullsail.LaxativeTeaTwo 1.0 | 11 | 4% | 12 |
| sample.SpinBot 1.0 | 8 | 3% | 9 |

## Melee bench: F27

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 69.7 | 66 / 350 | 3.73 | 13.4% | 32708 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.7 | 15.1% | 131 |
| hadur117.nano.SanaroT60 0.1 | 2.2 | 13.4% | 66 |
| wee.Gem 1.8.4 | 3.6 | 11.9% | 64 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.9% | 44 |
| EH.Eagle 1.0.6 | 4.7 | 10.8% | 27 |
| techdude.kombat.FlamingKombat 1.5 | 5.4 | 9.8% | 15 |
| throxbot.ThroxBot 0.1 | 7.6 | 8.0% | 3 |
| joe.ADinosaur 1.0 | 7.9 | 7.2% | 2 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.2% | 1 |
| cs.Grudge 1.0 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 72.4 | 7 / 35 | 3457 |
| 2 | 2 | 60.9 | 72.1 | 8 / 35 | 3453 |
| 3 | 2 | 59.1 | 67.6 | 9 / 35 | 3057 |
| 4 | 1 | 60.4 | 73.7 | 7 / 35 | 3300 |
| 5 | 3 | 58.1 | 64.1 | 5 / 35 | 3418 |
| 6 | 2 | 59.1 | 70.2 | 5 / 35 | 3247 |
| 7 | 3 | 56.7 | 63.2 | 3 / 35 | 3119 |
| 8 | 2 | 60.1 | 75.2 | 7 / 35 | 3087 |
| 9 | 2 | 58.7 | 67.6 | 5 / 35 | 3277 |
| 10 | 3 | 60.8 | 71.1 | 10 / 35 | 3293 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 65 | 48% |
| wee.Gem 1.8.4 | 25 | 24% |
| EH.Eagle 1.0.6 | 21 | 67% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 46% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 86% |
| throxbot.ThroxBot 0.1 | 2 | 50% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 94 | 33% | 123 |
| sheldor.melee.nano.TestMelee 0.1 | 44 | 15% | 51 |
| wee.Gem 1.8.4 | 41 | 14% | 49 |
| EH.Eagle 1.0.6 | 24 | 8% | 38 |
| caimano.Furia_Ceca 0.22 | 22 | 8% | 22 |
| joe.ADinosaur 1.0 | 20 | 7% | 21 |
| techdude.kombat.FlamingKombat 1.5 | 18 | 6% | 25 |
| throxbot.ThroxBot 0.1 | 17 | 6% | 17 |
| cs.Grudge 1.0 | 4 | 1% | 4 |
3 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 77.9 | 100 / 350 | 2.99 | 15.5% | 37483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.4 | 15.6% | 106 |
| hadur117.nano.SanaroT60 0.1 | 1.8 | 15.5% | 100 |
| uji.Antique 1.0 | 2.8 | 13.1% | 72 |
| qohnil.blot.BlotBot 3.61 | 4.4 | 10.8% | 32 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.9% | 13 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.2% | 7 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.1% | 10 |
| matt.advanced.Katana 1.0 | 7.9 | 6.8% | 7 |
| stelo.PianistNano 1.2 | 9.3 | 5.6% | 1 |
| stelo.Lifestealer 1.0 | 9.7 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 71.4 | 9 / 35 | 3623 |
| 2 | 2 | 63.7 | 78.7 | 9 / 35 | 4086 |
| 3 | 2 | 64.2 | 79.7 | 10 / 35 | 3831 |
| 4 | 1 | 64.5 | 83.5 | 11 / 35 | 3549 |
| 5 | 2 | 62.6 | 78.1 | 8 / 35 | 3549 |
| 6 | 1 | 65.3 | 85.1 | 12 / 35 | 3730 |
| 7 | 2 | 62.1 | 77.5 | 6 / 35 | 3625 |
| 8 | 2 | 60.7 | 69.8 | 10 / 35 | 3598 |
| 9 | 2 | 64.7 | 81.3 | 13 / 35 | 3879 |
| 10 | 2 | 63.1 | 74.0 | 12 / 35 | 4013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 111 | 50% |
| uji.Antique 1.0 | 52 | 54% |
| qohnil.blot.BlotBot 3.61 | 20 | 30% |
| ahr.ice.Ice 1.0.2 | 8 | 38% |
| pfvicm.Sobieski 7.2.3b | 5 | 40% |
| amk.ChumbaWumba 0.3 | 3 | 100% |
| matt.advanced.Katana 1.0 | 2 | 50% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 250 of 350 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 94 | 38% | 126 |
| uji.Antique 1.0 | 50 | 20% | 83 |
| pfvicm.Sobieski 7.2.3b | 39 | 16% | 40 |
| qohnil.blot.BlotBot 3.61 | 26 | 10% | 39 |
| amk.ChumbaWumba 0.3 | 14 | 6% | 17 |
| ahr.ice.Ice 1.0.2 | 10 | 4% | 16 |
| stelo.Lifestealer 1.0 | 10 | 4% | 12 |
| matt.advanced.Katana 1.0 | 4 | 2% | 9 |
| stelo.PianistNano 1.2 | 3 | 1% | 6 |

## Melee bench: F29

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 64.2 | 54 / 350 | 4.23 | 13.1% | 35126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.2 | 16.4% | 137 |
| deewiant.Anomaly 0.2 | 1.9 | 15.4% | 89 |
| hadur117.nano.SanaroT60 0.1 | 3.5 | 13.1% | 54 |
| myl.micro.Troodon 1.10 | 3.6 | 13.0% | 27 |
| jok.PheonixM 0.1.2 | 4.8 | 11.3% | 17 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.0% | 2 |
| DBall.Anarchy 0.1 | 6.5 | 8.0% | 18 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.8% | 5 |
| jangs.ns51 1.0 | 9.7 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.1 | 69.8 | 9 / 35 | 3702 |
| 2 | 4 | 58.9 | 63.8 | 5 / 35 | 3329 |
| 3 | 3 | 59.3 | 63.8 | 5 / 35 | 3586 |
| 4 | 3 | 61.2 | 67.9 | 6 / 35 | 3758 |
| 5 | 4 | 60.4 | 64.8 | 4 / 35 | 3730 |
| 6 | 3 | 58.3 | 60.3 | 6 / 35 | 3417 |
| 7 | 3 | 57.8 | 60.6 | 3 / 35 | 3502 |
| 8 | 3 | 61.9 | 67.9 | 9 / 35 | 3938 |
| 9 | 5 | 56.6 | 57.5 | 4 / 35 | 2996 |
| 10 | 4 | 58.8 | 65.1 | 3 / 35 | 3168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 39 | 31% |
| zyx.mega.YersiniaPestis 3.1 | 33 | 45% |
| myl.micro.Troodon 1.10 | 22 | 64% |
| DBall.Anarchy 0.1 | 7 | 71% |
| jok.PheonixM 0.1.2 | 7 | 43% |
| ap.Frederick 1.1 | 6 | 67% |
| ph.melee.ArcherME 0.3 | 1 | 0% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 105 | 35% | 120 |
| zyx.mega.YersiniaPestis 3.1 | 66 | 22% | 79 |
| myl.micro.Troodon 1.10 | 63 | 21% | 74 |
| jok.PheonixM 0.1.2 | 37 | 12% | 43 |
| ph.melee.ArcherME 0.3 | 8 | 3% | 8 |
| DBall.Anarchy 0.1 | 7 | 2% | 13 |
| jangs.ns51 1.0 | 7 | 2% | 9 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 1% | 3 |
| ap.Frederick 1.1 | 2 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.0 | 54.0 | 16 / 350 | 5.14 | 10.3% | 27462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 2.1 | 13.8% | 62 |
| darkcanuck.B26354 1.06 | 2.4 | 13.8% | 87 |
| catcat20.Matcha 0.006 | 2.7 | 13.8% | 80 |
| oog.melee.Capulet 1.2 | 2.8 | 13.4% | 60 |
| hadur117.nano.SanaroT60 0.1 | 5.4 | 10.3% | 16 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.5% | 22 |
| ntc.Opposite 1.5 | 7.4 | 8.4% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.7% | 16 |
| tripphippy.Alice 1.1 | 8.5 | 6.8% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.1 | 58.7 | 0 / 35 | 3107 |
| 2 | 5 | 56.7 | 61.9 | 3 / 35 | 3012 |
| 3 | 5 | 54.3 | 57.1 | 2 / 35 | 2875 |
| 4 | 5 | 52.1 | 50.2 | 3 / 35 | 2618 |
| 5 | 6 | 54.3 | 56.8 | 2 / 35 | 2675 |
| 6 | 7 | 49.4 | 49.2 | 1 / 35 | 2225 |
| 7 | 5 | 53.1 | 52.4 | 0 / 35 | 2936 |
| 8 | 5 | 52.8 | 54.6 | 3 / 35 | 2600 |
| 9 | 5 | 51.9 | 52.4 | 2 / 35 | 2678 |
| 10 | 6 | 49.7 | 47.0 | 0 / 35 | 2736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 17 | 24% |
| darkcanuck.B26354 1.06 | 15 | 7% |
| stelo.PastFuture 2.3.2 | 9 | 44% |
| intruder.PrairieWolf 2.61 | 8 | 63% |
| oog.melee.Capulet 1.2 | 8 | 0% |
| tripphippy.Alice 1.1 | 3 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 0% |

Hadur died in 334 of 350 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 65 | 19% | 67 |
| oog.melee.Capulet 1.2 | 62 | 19% | 62 |
| catcat20.Matcha 0.006 | 58 | 17% | 61 |
| stelo.PastFuture 2.3.2 | 57 | 17% | 64 |
| ntc.Opposite 1.5 | 27 | 8% | 27 |
| intruder.PrairieWolf 2.61 | 26 | 8% | 28 |
| tripphippy.Alice 1.1 | 22 | 7% | 24 |
| fowl3628800.LightningBolt 2.6.0 | 16 | 5% | 16 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |

## Melee bench: F31

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.2 | 58.0 | 21 / 350 | 4.78 | 11.1% | 28532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.9% | 200 |
| gh.mini.Griezel 0.2 | 2.1 | 14.0% | 82 |
| spinnercat.micro.Tyger 0.1 | 3.6 | 11.9% | 24 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.4% | 13 |
| hadur117.nano.SanaroT60 0.1 | 4.5 | 11.1% | 21 |
| gh.nano.Grofvuil 0.2 | 5.6 | 9.3% | 8 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.4% | 3 |
| fm.mammillarias 1.3 | 7.8 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.3% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.0 | 54.3 | 2 / 35 | 2945 |
| 2 | 5 | 54.7 | 56.5 | 1 / 35 | 2862 |
| 3 | 6 | 53.9 | 56.8 | 1 / 35 | 2700 |
| 4 | 4 | 55.8 | 60.3 | 3 / 35 | 2802 |
| 5 | 5 | 54.6 | 55.6 | 3 / 35 | 2829 |
| 6 | 5 | 54.2 | 54.9 | 2 / 35 | 2862 |
| 7 | 3 | 58.6 | 65.4 | 2 / 35 | 3338 |
| 8 | 4 | 56.3 | 60.0 | 5 / 35 | 2506 |
| 9 | 5 | 54.1 | 55.2 | 1 / 35 | 2860 |
| 10 | 4 | 56.0 | 61.0 | 1 / 35 | 2828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 48 | 27% |
| gh.mini.Griezel 0.2 | 25 | 12% |
| spinnercat.micro.Tyger 0.1 | 6 | 17% |
| d414.nano.Quantum 1.0.0 | 4 | 50% |
| gh.nano.Grofvuil 0.2 | 3 | 33% |
| timmit.nano.TimDog 0.33 | 1 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 329 of 350 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 95 | 29% | 107 |
| gh.mini.Griezel 0.2 | 69 | 21% | 73 |
| spinnercat.micro.Tyger 0.1 | 65 | 20% | 67 |
| d414.nano.Quantum 1.0.0 | 43 | 13% | 43 |
| timmit.nano.TimDog 0.33 | 19 | 6% | 20 |
| gh.nano.Grofvuil 0.2 | 16 | 5% | 18 |
| fm.mammillarias 1.3 | 14 | 4% | 14 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 2% | 6 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 73.0 | 76 / 350 | 3.43 | 14.2% | 36045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.1 | 15.7% | 133 |
| hadur117.nano.SanaroT60 0.1 | 2.0 | 14.2% | 76 |
| apc.botM 3.0 | 3.4 | 12.0% | 53 |
| lxx.ConceptA 0.8 | 3.7 | 11.6% | 8 |
| vjik.UnViolation 1.1 | 5.2 | 10.4% | 32 |
| bayen.UbaMicro 1.4 | 5.8 | 9.8% | 13 |
| panzer.Panzer 0.2 | 7.8 | 7.3% | 2 |
| yk.JahMicro 1.0 | 8.0 | 7.2% | 19 |
| conscience.Electron 1.3g | 8.5 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 9.5 | 5.5% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.7 | 71.7 | 7 / 35 | 3098 |
| 2 | 2 | 63.2 | 79.4 | 6 / 35 | 4201 |
| 3 | 2 | 61.2 | 72.7 | 8 / 35 | 3830 |
| 4 | 1 | 63.4 | 79.7 | 11 / 35 | 3941 |
| 5 | 2 | 59.3 | 70.2 | 7 / 35 | 3278 |
| 6 | 3 | 56.4 | 63.2 | 6 / 35 | 2989 |
| 7 | 2 | 62.5 | 75.6 | 11 / 35 | 3734 |
| 8 | 2 | 59.7 | 70.5 | 8 / 35 | 3347 |
| 9 | 2 | 61.5 | 75.6 | 5 / 35 | 3852 |
| 10 | 2 | 60.4 | 71.1 | 7 / 35 | 3775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 93 | 33% |
| lxx.ConceptA 0.8 | 20 | 90% |
| apc.botM 3.0 | 19 | 37% |
| vjik.UnViolation 1.1 | 15 | 47% |
| yk.JahMicro 1.0 | 14 | 21% |
| bayen.UbaMicro 1.4 | 9 | 44% |
| donjezza.Jezza 1.0 | 8 | 13% |
| panzer.Panzer 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 274 of 350 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 99 | 36% | 132 |
| lxx.ConceptA 0.8 | 58 | 21% | 70 |
| apc.botM 3.0 | 27 | 10% | 39 |
| bayen.UbaMicro 1.4 | 24 | 9% | 29 |
| vjik.UnViolation 1.1 | 20 | 7% | 30 |
| yk.JahMicro 1.0 | 19 | 7% | 18 |
| panzer.Panzer 0.2 | 11 | 4% | 13 |
| donjezza.Jezza 1.0 | 8 | 3% | 10 |
| conscience.Electron 1.3g | 8 | 3% | 9 |

## Melee bench: F33

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 65.4 | 46 / 350 | 4.11 | 13.2% | 36720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.2% | 152 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.6% | 48 |
| hadur117.nano.SanaroT60 0.1 | 2.6 | 13.2% | 46 |
| labg.Cataclysm 2.05 | 4.4 | 11.4% | 50 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 11.7% | 42 |
| baal.nano.N 1.42 | 6.2 | 8.6% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.0% | 7 |
| sanja.First 0.1 | 8.6 | 5.1% | 2 |
| zyx.micro.Ant 1.1 | 8.7 | 5.6% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 62.5 | 6 / 35 | 3805 |
| 2 | 2 | 63.6 | 77.8 | 7 / 35 | 3920 |
| 3 | 2 | 60.3 | 67.6 | 6 / 35 | 3744 |
| 4 | 3 | 57.9 | 61.0 | 4 / 35 | 3397 |
| 5 | 2 | 61.4 | 69.5 | 5 / 35 | 3729 |
| 6 | 2 | 60.7 | 67.3 | 6 / 35 | 3691 |
| 7 | 4 | 59.1 | 64.8 | 3 / 35 | 3413 |
| 8 | 3 | 57.1 | 60.0 | 4 / 35 | 3541 |
| 9 | 3 | 60.1 | 65.7 | 3 / 35 | 3887 |
| 10 | 2 | 56.7 | 58.1 | 2 / 35 | 3593 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 53 | 21% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 44% |
| gre.svman4.Leonidas 1.3.2 | 18 | 56% |
| labg.Cataclysm 2.05 | 9 | 56% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 75% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 100% |
| sanja.First 0.1 | 1 | 0% |
| baal.nano.N 1.42 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 0% |

Hadur died in 304 of 350 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 131 | 43% | 146 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 16% | 63 |
| gre.svman4.Leonidas 1.3.2 | 45 | 15% | 49 |
| labg.Cataclysm 2.05 | 24 | 8% | 32 |
| baal.nano.N 1.42 | 21 | 7% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 16 | 5% | 18 |
| zyx.micro.Ant 1.1 | 14 | 5% | 15 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 1% | 4 |
| sanja.First 0.1 | 1 | 0% | 1 |

## Melee bench: F34

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 70.9 | 50 / 350 | 3.62 | 14.1% | 40836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.3 | 17.4% | 135 |
| kid.Gladiator .7.2 | 1.7 | 17.0% | 116 |
| hadur117.nano.SanaroT60 0.1 | 3.0 | 14.1% | 50 |
| jcs.Seth 1.8 | 4.4 | 11.3% | 29 |
| tcf.Reach 3 | 4.8 | 11.1% | 15 |
| cli.Dancer 1.1 | 5.8 | 9.6% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.4% | 1 |
| sample.VelociRobot 1.0 | 9.1 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.9 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.7 | 74.9 | 6 / 35 | 3806 |
| 2 | 3 | 62.8 | 72.1 | 4 / 35 | 4129 |
| 3 | 3 | 62.8 | 72.4 | 3 / 35 | 4314 |
| 4 | 3 | 64.7 | 76.2 | 8 / 35 | 4469 |
| 5 | 3 | 63.6 | 75.9 | 5 / 35 | 4267 |
| 6 | 3 | 60.7 | 66.3 | 8 / 35 | 3804 |
| 7 | 3 | 59.4 | 62.9 | 3 / 35 | 3960 |
| 8 | 3 | 62.7 | 70.2 | 7 / 35 | 4257 |
| 9 | 3 | 59.8 | 66.7 | 2 / 35 | 3557 |
| 10 | 3 | 62.9 | 71.1 | 4 / 35 | 4273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 64 | 48% |
| kid.Gladiator .7.2 | 59 | 10% |
| jcs.Seth 1.8 | 11 | 55% |
| tcf.Reach 3 | 7 | 29% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 121 | 40% | 125 |
| stelo.Spread 0.9 | 92 | 31% | 124 |
| jcs.Seth 1.8 | 26 | 9% | 31 |
| tcf.Reach 3 | 25 | 8% | 30 |
| ratosh.Wesco 1.4 | 17 | 6% | 20 |
| cli.Dancer 1.1 | 12 | 4% | 13 |
| amk.Punbot.Punbot 0.01 | 4 | 1% | 4 |
| sample.VelociRobot 1.0 | 3 | 1% | 3 |

## Melee bench: F35

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 64.3 | 11 / 350 | 4.21 | 11.9% | 28386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 273 |
| gh.mini.Gruwel 0.9 | 2.9 | 13.1% | 36 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.4 | 12.5% | 21 |
| rz.HawkOnFire 0.1 | 3.7 | 12.4% | 7 |
| hadur117.nano.SanaroT60 0.1 | 4.0 | 11.9% | 11 |
| myl.nano.KomoriNinja 1.1 | 6.9 | 6.9% | 1 |
| wit.Chuliath 1.0 | 6.9 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.3% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 1 |
| stelo.MyAgileRobot 0.2 | 9.4 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 66.7 | 0 / 35 | 3093 |
| 2 | 5 | 56.5 | 61.0 | 2 / 35 | 2874 |
| 3 | 5 | 55.0 | 57.5 | 1 / 35 | 2706 |
| 4 | 3 | 59.6 | 69.5 | 2 / 35 | 3001 |
| 5 | 4 | 56.7 | 61.0 | 0 / 35 | 2969 |
| 6 | 4 | 59.5 | 69.5 | 1 / 35 | 2848 |
| 7 | 3 | 58.4 | 66.3 | 3 / 35 | 2872 |
| 8 | 3 | 57.4 | 67.0 | 1 / 35 | 2571 |
| 9 | 5 | 55.8 | 61.3 | 1 / 35 | 2701 |
| 10 | 5 | 56.7 | 63.5 | 0 / 35 | 2751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 70 | 3% |
| gh.mini.Gruwel 0.9 | 11 | 0% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 9% |
| rz.HawkOnFire 0.1 | 9 | 78% |
| dans.Cinnamon 1.2 | 1 | 0% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 339 of 350 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 130 | 38% | 133 |
| gh.mini.Gruwel 0.9 | 61 | 18% | 62 |
| rz.HawkOnFire 0.1 | 59 | 17% | 63 |
| dmh.robocode.robot.BlackDeath 9.2 | 57 | 17% | 59 |
| dans.Cinnamon 1.2 | 9 | 3% | 9 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 2% | 7 |
| myl.nano.KomoriNinja 1.1 | 6 | 2% | 6 |
| stelo.MyAgileRobot 0.2 | 6 | 2% | 6 |
| wit.Chuliath 1.0 | 5 | 1% | 5 |

## Melee bench: F36

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 68.4 | 96 / 350 | 3.84 | 14.2% | 37850 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroT60 0.1 | 1.4 | 14.2% | 96 |
| alpha.RainingFire 1.0 | 2.1 | 12.8% | 60 |
| bzdp.Pansy 2.1 | 3.1 | 12.2% | 47 |
| mz.Cork 0.1 | 3.7 | 11.4% | 41 |
| bvh.micro.Freya 0.3 | 5.8 | 10.4% | 28 |
| m3thos.Eva02 0.7.1 | 5.9 | 10.3% | 36 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.7% | 13 |
| dl.BetterWalls 1.0 | 8.2 | 7.4% | 11 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.9% | 5 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.7% | 16 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 68.9 | 11 / 35 | 3829 |
| 2 | 2 | 58.9 | 65.4 | 5 / 35 | 3581 |
| 3 | 1 | 61.8 | 71.4 | 9 / 35 | 4038 |
| 4 | 1 | 58.2 | 65.1 | 6 / 35 | 3456 |
| 5 | 1 | 60.5 | 67.3 | 10 / 35 | 3987 |
| 6 | 1 | 63.0 | 75.9 | 12 / 35 | 3895 |
| 7 | 1 | 63.6 | 75.6 | 14 / 35 | 3990 |
| 8 | 1 | 62.8 | 73.0 | 14 / 35 | 4170 |
| 9 | 3 | 58.7 | 63.8 | 8 / 35 | 3516 |
| 10 | 2 | 56.1 | 58.1 | 7 / 35 | 3388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 33 | 58% |
| alpha.RainingFire 1.0 | 32 | 59% |
| bvh.micro.Freya 0.3 | 23 | 78% |
| m3thos.Eva02 0.7.1 | 21 | 43% |
| mz.Cork 0.1 | 17 | 76% |
| bvh.mini.Fenrir 0.39 | 14 | 86% |
| sample.MyFirstRobot 1.0 | 8 | 13% |
| dl.BetterWalls 1.0 | 5 | 60% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 255 of 350 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 52 | 20% | 65 |
| bzdp.Pansy 2.1 | 48 | 19% | 69 |
| mz.Cork 0.1 | 35 | 14% | 49 |
| m3thos.Eva02 0.7.1 | 33 | 13% | 43 |
| bvh.mini.Fenrir 0.39 | 30 | 12% | 36 |
| bvh.micro.Freya 0.3 | 22 | 9% | 34 |
| dl.BetterWalls 1.0 | 13 | 5% | 24 |
| squidM.TentalceMeleeNano 1.1 | 13 | 5% | 17 |
| sample.MyFirstRobot 1.0 | 9 | 4% | 12 |

## Melee bench: F37

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 76.0 | 100 / 350 | 3.16 | 15.2% | 44855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroT60 0.1 | 1.0 | 15.2% | 100 |
| germ.TheMind .2 | 3.2 | 11.3% | 45 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.4 | 11.1% | 35 |
| EBBU.Sim2 1.02 | 4.4 | 10.1% | 24 |
| agrach.Dalek 1.0 | 4.5 | 10.0% | 44 |
| mb.Beast 0.1 | 6.8 | 9.0% | 43 |
| stelo.UntouchableNano 1.3 | 7.1 | 9.0% | 25 |
| lmk.ACPFinal 0.1 | 7.3 | 8.7% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 7.9% | 3 |
| skm.Ryubot 1.0 | 9.2 | 7.7% | 16 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 81.0 | 9 / 35 | 4878 |
| 2 | 1 | 60.8 | 74.6 | 9 / 35 | 4211 |
| 3 | 1 | 61.5 | 74.6 | 9 / 35 | 4634 |
| 4 | 1 | 60.5 | 71.7 | 8 / 35 | 4297 |
| 5 | 1 | 58.8 | 66.7 | 9 / 35 | 4214 |
| 6 | 1 | 63.7 | 79.4 | 15 / 35 | 4523 |
| 7 | 1 | 62.9 | 81.3 | 10 / 35 | 4313 |
| 8 | 1 | 61.3 | 73.3 | 11 / 35 | 4275 |
| 9 | 1 | 63.8 | 80.6 | 11 / 35 | 4818 |
| 10 | 1 | 62.0 | 77.1 | 9 / 35 | 4692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 32 | 41% |
| agrach.Dalek 1.0 | 30 | 47% |
| mb.Beast 0.1 | 24 | 54% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 67% |
| stelo.UntouchableNano 1.3 | 22 | 59% |
| EBBU.Sim2 1.02 | 21 | 43% |
| lmk.ACPFinal 0.1 | 19 | 74% |
| skm.Ryubot 1.0 | 16 | 38% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 254 of 350 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 56 | 22% | 70 |
| com.syncleus.robocode.Dreadnaught 0.1 | 33 | 13% | 54 |
| EBBU.Sim2 1.02 | 33 | 13% | 41 |
| agrach.Dalek 1.0 | 31 | 12% | 48 |
| mb.Beast 0.1 | 28 | 11% | 41 |
| stelo.UntouchableNano 1.3 | 22 | 9% | 29 |
| lmk.ACPFinal 0.1 | 21 | 8% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 7% | 18 |
| skm.Ryubot 1.0 | 13 | 5% | 15 |

## Melee bench: F38

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 60.5 | 28 / 350 | 4.55 | 11.7% | 32018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.6% | 175 |
| bvh.mini.Freya 0.55 | 2.2 | 13.3% | 34 |
| hadur117.nano.SanaroT60 0.1 | 3.9 | 11.7% | 28 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.4% | 42 |
| cs.Wren 1.0 | 4.8 | 11.5% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.1 | 10.9% | 22 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.1% | 14 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.0% | 5 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.4% | 0 |
| bzdp.BoxCar 2.0 | 9.6 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.2 | 59.4 | 2 / 35 | 3273 |
| 2 | 7 | 51.8 | 51.1 | 1 / 35 | 2750 |
| 3 | 2 | 59.7 | 67.6 | 4 / 35 | 3477 |
| 4 | 4 | 57.2 | 62.5 | 3 / 35 | 3145 |
| 5 | 2 | 57.5 | 61.6 | 5 / 35 | 3160 |
| 6 | 3 | 58.7 | 63.5 | 6 / 35 | 3570 |
| 7 | 5 | 55.9 | 58.7 | 1 / 35 | 3345 |
| 8 | 5 | 51.9 | 51.4 | 2 / 35 | 2739 |
| 9 | 3 | 58.5 | 65.7 | 2 / 35 | 3413 |
| 10 | 3 | 57.4 | 63.5 | 2 / 35 | 3146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 48 | 23% |
| bvh.mini.Freya 0.55 | 12 | 50% |
| bts.mega.Gnarly 1.4 | 11 | 45% |
| cs.Wren 1.0 | 9 | 22% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 13% |
| kdf.KoulDestroyer 1.0 | 4 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 322 of 350 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 107 | 33% | 122 |
| davidalves.net.DuelistNanoMelee 1.01 | 50 | 16% | 51 |
| cs.Wren 1.0 | 48 | 15% | 50 |
| bvh.mini.Freya 0.55 | 43 | 13% | 45 |
| bts.mega.Gnarly 1.4 | 38 | 12% | 45 |
| kdf.KoulDestroyer 1.0 | 22 | 7% | 23 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 2% | 7 |
| bzdp.BoxCar 2.0 | 5 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 63.6 | 41 / 350 | 4.27 | 12.3% | 34233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 15.9% | 89 |
| az.Ololobot 0.2.4 | 2.4 | 13.7% | 121 |
| hadur117.nano.SanaroT60 0.1 | 2.8 | 12.3% | 41 |
| catcat20.Lambda 0.024 | 3.9 | 11.4% | 45 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.7% | 32 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 9.0% | 10 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.5% | 4 |
| gimp.GimpBot 0.1 | 7.5 | 8.1% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.2% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.3 | 59.7 | 4 / 35 | 3512 |
| 2 | 4 | 53.2 | 54.9 | 2 / 35 | 3255 |
| 3 | 2 | 58.7 | 69.5 | 5 / 35 | 3157 |
| 4 | 3 | 56.4 | 62.2 | 3 / 35 | 3307 |
| 5 | 2 | 58.0 | 64.8 | 4 / 35 | 3693 |
| 6 | 3 | 55.4 | 59.0 | 1 / 35 | 3510 |
| 7 | 4 | 55.5 | 60.6 | 6 / 35 | 2894 |
| 8 | 2 | 60.9 | 73.3 | 7 / 35 | 3784 |
| 9 | 3 | 58.3 | 65.4 | 5 / 35 | 3700 |
| 10 | 2 | 57.9 | 66.7 | 4 / 35 | 3421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 40 | 23% |
| bvh.fry.Freya 0.82 | 34 | 26% |
| catcat20.Lambda 0.024 | 22 | 73% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 40% |
| winamp32.micro.MicroMacro 1.0 | 3 | 33% |
| apollokidd.ApolloKidd 0.9 | 3 | 33% |
| gimp.GimpBot 0.1 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 0% |

Hadur died in 310 of 350 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 116 | 37% | 124 |
| az.Ololobot 0.2.4 | 53 | 17% | 62 |
| stelo.SoRobotNanoMelee 1.2 | 38 | 12% | 41 |
| apollokidd.ApolloKidd 0.9 | 32 | 10% | 34 |
| catcat20.Lambda 0.024 | 30 | 10% | 45 |
| gimp.GimpBot 0.1 | 14 | 5% | 16 |
| winamp32.micro.MicroMacro 1.0 | 11 | 4% | 12 |
| whitesquare.robots.SkynetAdvanced 1.1 | 10 | 3% | 10 |
| dcs.Eater_of_Worlds 1.1.3-A | 6 | 2% | 6 |

## Melee bench: F41

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 65.6 | 56 / 350 | 4.09 | 12.7% | 31206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.3% | 178 |
| ary.Swarm 1.1 | 2.6 | 13.3% | 30 |
| hadur117.nano.SanaroT60 0.1 | 3.4 | 12.7% | 56 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.5% | 44 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 12.1% | 25 |
| shrub.Silver v048 | 6.1 | 9.3% | 10 |
| zyx.nano.Ant 1.1 | 7.1 | 7.7% | 1 |
| stelo.Mirror 1.1 | 8.3 | 6.2% | 1 |
| jsal.Jsalbot 1.0 | 8.5 | 6.1% | 5 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 67.9 | 4 / 35 | 3390 |
| 2 | 2 | 62.0 | 73.0 | 10 / 35 | 3417 |
| 3 | 5 | 55.7 | 57.5 | 4 / 35 | 2920 |
| 4 | 3 | 60.9 | 72.1 | 6 / 35 | 3276 |
| 5 | 3 | 59.1 | 67.3 | 6 / 35 | 2969 |
| 6 | 4 | 58.4 | 64.1 | 6 / 35 | 2905 |
| 7 | 3 | 57.0 | 62.2 | 3 / 35 | 3059 |
| 8 | 5 | 58.4 | 64.4 | 6 / 35 | 2989 |
| 9 | 3 | 58.1 | 64.1 | 4 / 35 | 3067 |
| 10 | 3 | 58.3 | 63.5 | 7 / 35 | 3214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 57 | 30% |
| lessonz.robocode.Oz 0.5.0 | 25 | 40% |
| ary.Swarm 1.1 | 21 | 62% |
| simonton.nano.MeleeSeed 1.8 | 14 | 64% |
| shrub.Silver v048 | 3 | 33% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 89 | 30% | 106 |
| ary.Swarm 1.1 | 64 | 22% | 77 |
| lessonz.robocode.Oz 0.5.0 | 53 | 18% | 60 |
| simonton.nano.MeleeSeed 1.8 | 39 | 13% | 48 |
| zyx.nano.Ant 1.1 | 17 | 6% | 19 |
| shrub.Silver v048 | 16 | 5% | 21 |
| stelo.Mirror 1.1 | 12 | 4% | 13 |
| jsal.Jsalbot 1.0 | 4 | 1% | 6 |

## Melee bench: F42

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 69.2 | 51 / 350 | 3.77 | 13.5% | 36700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.8% | 186 |
| maribo.mini.MiniQuester 0.1 | 2.5 | 14.3% | 42 |
| hadur117.nano.SanaroT60 0.1 | 3.2 | 13.5% | 51 |
| ara.Shera 0.88 | 3.3 | 13.8% | 61 |
| amz.NanoClone 1.41 | 5.2 | 9.1% | 1 |
| maribo.IotaCT 1.1 | 6.1 | 7.9% | 2 |
| dsw.StaticD 1.0 | 7.1 | 7.1% | 7 |
| stelo.MirrorMicro 1.0 | 8.3 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.8 | 65.7 | 4 / 35 | 3471 |
| 2 | 4 | 57.3 | 61.3 | 4 / 35 | 3667 |
| 3 | 4 | 58.1 | 64.8 | 4 / 35 | 3275 |
| 4 | 4 | 60.1 | 70.8 | 3 / 35 | 3597 |
| 5 | 2 | 60.3 | 68.9 | 6 / 35 | 3770 |
| 6 | 4 | 58.1 | 63.2 | 5 / 35 | 3577 |
| 7 | 4 | 61.4 | 71.7 | 7 / 35 | 3529 |
| 8 | 2 | 63.0 | 76.2 | 5 / 35 | 4047 |
| 9 | 2 | 62.0 | 74.3 | 7 / 35 | 3710 |
| 10 | 2 | 62.9 | 75.2 | 6 / 35 | 4057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 69 | 32% |
| ara.Shera 0.88 | 27 | 26% |
| maribo.mini.MiniQuester 0.1 | 25 | 76% |
| amz.NanoClone 1.41 | 3 | 100% |
| maribo.IotaCT 1.1 | 2 | 0% |

Hadur died in 301 of 350 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 103 | 34% | 125 |
| ara.Shera 0.88 | 84 | 28% | 90 |
| maribo.mini.MiniQuester 0.1 | 65 | 22% | 84 |
| amz.NanoClone 1.41 | 17 | 6% | 19 |
| maribo.IotaCT 1.1 | 12 | 4% | 12 |
| dsw.StaticD 1.0 | 9 | 3% | 9 |
| stelo.MirrorMicro 1.0 | 6 | 2% | 6 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 62.9 | 26 / 350 | 4.34 | 12.2% | 33153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.9% | 274 |
| brainfade.melee.Dusk 0.44 | 2.9 | 12.6% | 28 |
| hadur117.nano.SanaroT60 0.1 | 3.1 | 12.2% | 26 |
| dummy.micro.Sparrow 2.5 | 3.9 | 11.7% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.2 | 11.3% | 10 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 10.0% | 4 |
| mz.NanoGod 2.02 | 7.2 | 8.1% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.9 | 61.0 | 2 / 35 | 3349 |
| 2 | 3 | 58.8 | 62.5 | 2 / 35 | 3112 |
| 3 | 2 | 61.9 | 69.8 | 3 / 35 | 3648 |
| 4 | 4 | 58.1 | 58.4 | 3 / 35 | 3207 |
| 5 | 4 | 59.2 | 61.6 | 1 / 35 | 3300 |
| 6 | 3 | 58.0 | 59.0 | 3 / 35 | 3133 |
| 7 | 2 | 60.2 | 64.4 | 3 / 35 | 3413 |
| 8 | 3 | 60.5 | 64.4 | 4 / 35 | 3494 |
| 9 | 3 | 59.6 | 64.4 | 2 / 35 | 3149 |
| 10 | 3 | 59.9 | 62.9 | 3 / 35 | 3348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 15% |
| brainfade.melee.Dusk 0.44 | 12 | 67% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| Krabb.akim2.Akim2 1.1b | 2 | 0% |

Hadur died in 325 of 350 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 150 | 46% | 163 |
| wcsv.melee.EngineerMelee 0.1 | 51 | 16% | 51 |
| dummy.micro.Sparrow 2.5 | 44 | 14% | 47 |
| brainfade.melee.Dusk 0.44 | 35 | 11% | 42 |
| Krabb.akim2.Akim2 1.1b | 23 | 7% | 24 |
| mz.NanoGod 2.02 | 11 | 3% | 12 |
| jab.DiamondStealer 5 | 9 | 3% | 9 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 67.0 | 72 / 350 | 3.97 | 13.7% | 38259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.0 | 17.3% | 146 |
| tzu.TheArtOfWar 1.2 | 2.2 | 15.1% | 83 |
| hadur117.nano.SanaroT60 0.1 | 2.8 | 13.7% | 72 |
| wompi.Quokka 1.6 | 4.4 | 11.0% | 13 |
| jwirde.Gort 2.0 | 5.0 | 10.4% | 20 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.6 | 9.2% | 5 |
| disan.Chair 2.2.0 | 7.3 | 7.3% | 6 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.1% | 6 |
| sample.Crazy 1.0 | 9.4 | 4.7% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 61.0 | 4 / 35 | 3795 |
| 2 | 3 | 61.4 | 67.3 | 7 / 35 | 3975 |
| 3 | 3 | 59.1 | 65.1 | 5 / 35 | 3600 |
| 4 | 3 | 62.4 | 71.4 | 11 / 35 | 3664 |
| 5 | 3 | 56.1 | 57.1 | 4 / 35 | 3349 |
| 6 | 2 | 63.3 | 75.6 | 11 / 35 | 3947 |
| 7 | 2 | 64.1 | 75.2 | 11 / 35 | 4202 |
| 8 | 3 | 61.9 | 69.2 | 8 / 35 | 4071 |
| 9 | 3 | 60.8 | 67.0 | 5 / 35 | 3853 |
| 10 | 3 | 58.9 | 61.6 | 6 / 35 | 3803 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 78 | 60% |
| tzu.TheArtOfWar 1.2 | 37 | 24% |
| jwirde.Gort 2.0 | 11 | 45% |
| wompi.Quokka 1.6 | 7 | 43% |
| disan.Chair 2.2.0 | 4 | 50% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 67% |
| sample.Crazy 1.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 50% |

Hadur died in 280 of 350 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 87 | 31% | 133 |
| tzu.TheArtOfWar 1.2 | 85 | 30% | 93 |
| jwirde.Gort 2.0 | 34 | 12% | 41 |
| wompi.Quokka 1.6 | 23 | 8% | 25 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 22 | 8% | 23 |
| stf.PanzerGeneral 0.1 | 12 | 4% | 15 |
| disan.Chair 2.2.0 | 10 | 4% | 10 |
| sample.Crazy 1.0 | 3 | 1% | 7 |
| amk.jointstrike.JointStrike 0.2 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 66.4 | 56 / 350 | 4.02 | 13.8% | 39137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 1.8 | 13.3% | 197 |
| hadur117.nano.SanaroT60 0.1 | 2.0 | 13.8% | 56 |
| jje.BagPuss 1.2 | 2.5 | 12.7% | 23 |
| myl.nano.Graviton 1.10 | 4.4 | 11.1% | 18 |
| sul.Lunar 1.1 | 4.6 | 11.0% | 26 |
| hvilela.HVilela 0.9 | 6.6 | 9.4% | 4 |
| fm.claire 1.7 | 7.1 | 8.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.5% | 13 |
| wit.Deep7 2.0 | 8.8 | 6.5% | 13 |
| abud.ThirdRobo 1.0 | 9.9 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.6 | 67.0 | 7 / 35 | 4072 |
| 2 | 4 | 57.1 | 62.2 | 3 / 35 | 3374 |
| 3 | 3 | 58.9 | 63.5 | 5 / 35 | 3815 |
| 4 | 1 | 61.3 | 70.8 | 8 / 35 | 4070 |
| 5 | 1 | 62.1 | 70.8 | 9 / 35 | 4168 |
| 6 | 3 | 58.0 | 62.9 | 3 / 35 | 3634 |
| 7 | 3 | 56.0 | 56.8 | 2 / 35 | 3834 |
| 8 | 2 | 59.1 | 65.1 | 5 / 35 | 3682 |
| 9 | 1 | 61.0 | 69.5 | 4 / 35 | 4056 |
| 10 | 1 | 64.0 | 75.9 | 10 / 35 | 4432 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 78 | 29% |
| sul.Lunar 1.1 | 19 | 53% |
| jje.BagPuss 1.2 | 14 | 64% |
| myl.nano.Graviton 1.10 | 10 | 70% |
| wit.Deep7 2.0 | 4 | 50% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 50% |
| hvilela.HVilela 0.9 | 3 | 67% |
| abud.ThirdRobo 1.0 | 2 | 0% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 60 | 20% | 0 |
| jje.BagPuss 1.2 | 59 | 20% | 89 |
| myl.nano.Graviton 1.10 | 46 | 16% | 63 |
| sul.Lunar 1.1 | 32 | 11% | 63 |
| fm.claire 1.7 | 32 | 11% | 44 |
| hvilela.HVilela 0.9 | 29 | 10% | 40 |
| pez.mini.ChironexFleckeri 0.5 | 15 | 5% | 21 |
| wit.Deep7 2.0 | 14 | 5% | 19 |
| abud.ThirdRobo 1.0 | 7 | 2% | 9 |

## Melee bench: F46

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 64.9 | 26 / 350 | 4.16 | 11.9% | 28770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.0% | 147 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.8% | 135 |
| hadur117.nano.SanaroT60 0.1 | 3.2 | 11.9% | 26 |
| mz.MicroSheep 1.0 | 4.4 | 10.9% | 9 |
| cx.Princess 1.0 | 4.7 | 10.7% | 27 |
| sadoner.killer 0.2 | 5.8 | 9.3% | 2 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.1% | 3 |
| jeremyreeder.collective.Prophet 5 | 7.6 | 6.6% | 1 |
| kurios.DOSexe .9a | 9.2 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 72.7 | 1 / 35 | 2950 |
| 2 | 4 | 55.1 | 57.1 | 2 / 35 | 3005 |
| 3 | 3 | 60.0 | 73.0 | 2 / 35 | 2971 |
| 4 | 3 | 55.9 | 63.8 | 0 / 35 | 2807 |
| 5 | 3 | 57.3 | 64.1 | 3 / 35 | 2916 |
| 6 | 3 | 57.2 | 62.5 | 5 / 35 | 2987 |
| 7 | 3 | 56.0 | 63.2 | 2 / 35 | 2543 |
| 8 | 3 | 57.0 | 63.2 | 3 / 35 | 2741 |
| 9 | 3 | 58.1 | 66.3 | 6 / 35 | 2983 |
| 10 | 4 | 56.7 | 62.5 | 2 / 35 | 2867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 57 | 25% |
| rsalesc.melee.Medina 0.4.5 | 23 | 30% |
| cx.Princess 1.0 | 7 | 57% |
| mz.MicroSheep 1.0 | 6 | 17% |
| arthord.NanoSatanMelee Beta | 1 | 0% |

Hadur died in 326 of 350 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 134 | 41% | 150 |
| rsalesc.melee.Medina 0.4.5 | 67 | 21% | 74 |
| mz.MicroSheep 1.0 | 37 | 11% | 37 |
| cx.Princess 1.0 | 26 | 8% | 27 |
| sadoner.killer 0.2 | 26 | 8% | 26 |
| jeremyreeder.collective.Prophet 5 | 16 | 5% | 16 |
| arthord.NanoSatanMelee Beta | 14 | 4% | 14 |
| kurios.DOSexe .9a | 6 | 2% | 6 |

