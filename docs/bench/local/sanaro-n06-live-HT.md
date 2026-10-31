# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 76.9 | 67 / 350 | 3.08 | 14.1% | 34484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 221 |
| hadur117.nano.SanaroHT 0.2 | 2.2 | 14.1% | 67 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.9 | 11.5% | 17 |
| sgp.JollyNinja 3.53 | 4.1 | 11.7% | 28 |
| mz.MicroGodMelee 1 | 4.3 | 11.4% | 13 |
| lorneswork.Predator 1.0 | 5.5 | 10.2% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 75.9 | 5 / 35 | 3221 |
| 2 | 2 | 61.9 | 74.9 | 10 / 35 | 3380 |
| 3 | 2 | 61.4 | 74.9 | 5 / 35 | 3735 |
| 4 | 3 | 59.9 | 68.6 | 4 / 35 | 3592 |
| 5 | 2 | 63.0 | 79.7 | 7 / 35 | 3435 |
| 6 | 2 | 63.2 | 79.0 | 10 / 35 | 3467 |
| 7 | 2 | 63.9 | 85.1 | 6 / 35 | 3414 |
| 8 | 2 | 62.6 | 77.1 | 7 / 35 | 3593 |
| 9 | 2 | 61.2 | 73.7 | 6 / 35 | 3407 |
| 10 | 2 | 62.9 | 80.3 | 7 / 35 | 3240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 142 | 14% |
| sgp.JollyNinja 3.53 | 21 | 57% |
| mz.MicroGodMelee 1 | 20 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 77% |
| adt.Ar2 1.0 | 7 | 100% |
| lorneswork.Predator 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 145 | 51% | 167 |
| sgp.JollyNinja 3.53 | 37 | 13% | 50 |
| lorneswork.Predator 1.0 | 31 | 11% | 34 |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 10% | 35 |
| mz.MicroGodMelee 1 | 21 | 7% | 36 |
| adt.Ar2 1.0 | 14 | 5% | 19 |
| skm.butterfly 1.0 | 3 | 1% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 3 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 71.3 | 91 / 350 | 3.58 | 14.3% | 37636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.7 | 15.1% | 77 |
| pulsar.PulsarMax 0.8.9 | 2.1 | 14.8% | 98 |
| hadur117.nano.SanaroHT 0.2 | 2.2 | 14.3% | 91 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.8% | 8 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.9% | 20 |
| sch.Simone 0.3d | 6.5 | 8.6% | 28 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.1% | 4 |
| Noran.BitchingElk 0.054 | 7.7 | 7.4% | 14 |
| stelo.PatternRobot 1.0 | 8.7 | 6.6% | 9 |
| fullsail.SweetTea 1.1 | 10.0 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 71.4 | 8 / 35 | 3782 |
| 2 | 1 | 63.7 | 79.0 | 8 / 35 | 4123 |
| 3 | 3 | 58.1 | 62.9 | 8 / 35 | 3536 |
| 4 | 3 | 59.8 | 67.0 | 8 / 35 | 3643 |
| 5 | 2 | 63.8 | 74.9 | 15 / 35 | 4122 |
| 6 | 1 | 61.1 | 72.1 | 9 / 35 | 3682 |
| 7 | 3 | 61.0 | 69.5 | 9 / 35 | 3839 |
| 8 | 3 | 61.3 | 72.1 | 6 / 35 | 3590 |
| 9 | 3 | 58.0 | 65.1 | 7 / 35 | 3022 |
| 10 | 1 | 64.9 | 79.4 | 13 / 35 | 4297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 56 | 63% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 50 | 46% |
| sch.Simone 0.3d | 16 | 56% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 67% |
| Noran.BitchingElk 0.054 | 11 | 73% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 67% |
| fnc.bandit.Bandit 5.2.0 | 4 | 25% |
| stelo.PatternRobot 1.0 | 4 | 75% |
| fullsail.SweetTea 1.1 | 1 | 0% |

Hadur died in 259 of 350 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 72 | 28% | 94 |
| pulsar.PulsarMax 0.8.9 | 71 | 27% | 99 |
| lrem.micro.SpikeSoldier 0.4 | 26 | 10% | 33 |
| sch.Simone 0.3d | 23 | 9% | 32 |
| stelo.PatternRobot 1.0 | 20 | 8% | 22 |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 7% | 32 |
| fnc.bandit.Bandit 5.2.0 | 13 | 5% | 16 |
| Noran.BitchingElk 0.054 | 8 | 3% | 14 |
| fullsail.SweetTea 1.1 | 7 | 3% | 8 |

## Melee bench: F03

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 78.3 | 89 / 350 | 2.95 | 14.8% | 38941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.6 | 15.0% | 93 |
| hadur117.nano.SanaroHT 0.2 | 2.2 | 14.8% | 89 |
| kawigi.nano.Lib 1.0 | 2.5 | 14.5% | 75 |
| vuen.Cake 2.51 | 3.7 | 13.8% | 75 |
| urdos.URDOS 1.3 | 5.0 | 10.8% | 13 |
| adt.Ar1 2.1 | 6.6 | 7.2% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 6.7 | 7.1% | 2 |
| oa.weak.FlyMk1 0.1 | 7.9 | 6.4% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.7% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 79.0 | 12 / 35 | 3993 |
| 2 | 3 | 61.6 | 77.1 | 8 / 35 | 3731 |
| 3 | 2 | 63.1 | 81.0 | 8 / 35 | 3820 |
| 4 | 1 | 62.9 | 79.0 | 10 / 35 | 4126 |
| 5 | 3 | 60.8 | 73.3 | 6 / 35 | 3918 |
| 6 | 2 | 62.8 | 78.7 | 12 / 35 | 3830 |
| 7 | 2 | 62.9 | 79.4 | 7 / 35 | 4041 |
| 8 | 2 | 64.1 | 82.9 | 8 / 35 | 4015 |
| 9 | 2 | 62.8 | 79.7 | 11 / 35 | 3652 |
| 10 | 4 | 61.2 | 72.7 | 7 / 35 | 3815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 67 | 60% |
| radnor.DoctorBob 1.42 | 63 | 46% |
| kawigi.nano.Lib 1.0 | 47 | 21% |
| urdos.URDOS 1.3 | 11 | 45% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 81 | 31% | 90 |
| radnor.DoctorBob 1.42 | 71 | 27% | 97 |
| vuen.Cake 2.51 | 45 | 17% | 84 |
| urdos.URDOS 1.3 | 34 | 13% | 40 |
| ghent.ArthurPanzergon 1.0.0 | 12 | 5% | 12 |
| adt.Ar1 2.1 | 7 | 3% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 2% | 7 |
| oa.weak.FlyMk1 0.1 | 3 | 1% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 72.5 | 13 / 350 | 3.47 | 13.8% | 40942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.1% | 315 |
| apc.LeeroyJenkins2 1.0 | 2.4 | 13.7% | 9 |
| hadur117.nano.SanaroHT 0.2 | 2.6 | 13.8% | 13 |
| TNT.TNT 0.99.1 | 4.1 | 10.8% | 4 |
| josago.Jorgito 0.16 | 5.2 | 9.0% | 4 |
| css.Delitioner 0.11 | 6.0 | 7.9% | 3 |
| tj.zombie1n 1.0.1 | 6.8 | 7.2% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.1 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.9 | 3.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 69.2 | 1 / 35 | 3813 |
| 2 | 3 | 58.5 | 63.5 | 1 / 35 | 3663 |
| 3 | 2 | 64.7 | 80.6 | 2 / 35 | 4175 |
| 4 | 3 | 61.5 | 71.7 | 0 / 35 | 3860 |
| 5 | 2 | 62.4 | 73.0 | 0 / 35 | 4265 |
| 6 | 3 | 63.5 | 75.6 | 2 / 35 | 4424 |
| 7 | 2 | 65.2 | 80.3 | 3 / 35 | 4651 |
| 8 | 3 | 61.2 | 71.4 | 0 / 35 | 3723 |
| 9 | 3 | 60.9 | 66.0 | 3 / 35 | 4282 |
| 10 | 2 | 62.1 | 74.0 | 1 / 35 | 4086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 151 | 3% |
| apc.LeeroyJenkins2 1.0 | 6 | 50% |
| TNT.TNT 0.99.1 | 6 | 67% |
| josago.Jorgito 0.16 | 2 | 50% |

Hadur died in 337 of 350 rounds, at a mean tick of 1195. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 217 | 64% | 222 |
| apc.LeeroyJenkins2 1.0 | 54 | 16% | 57 |
| josago.Jorgito 0.16 | 21 | 6% | 22 |
| TNT.TNT 0.99.1 | 18 | 5% | 22 |
| css.Delitioner 0.11 | 13 | 4% | 13 |
| rampancy.Durandal 2.1d | 6 | 2% | 6 |
| tj.zombie1n 1.0.1 | 5 | 1% | 5 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 71.3 | 91 / 350 | 3.58 | 13.8% | 31953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.4 | 15.8% | 93 |
| origin.SleepSiphon 1.7b | 2.3 | 14.3% | 93 |
| hadur117.nano.SanaroHT 0.2 | 2.6 | 13.8% | 91 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 12.2% | 41 |
| mld.Wisdom 1.0 | 4.8 | 11.0% | 12 |
| gg.Wolverine 2.0 | 6.5 | 8.3% | 6 |
| spinnercat.Omen 1.0 | 7.2 | 7.9% | 4 |
| DBall.NUKE 0.1 | 7.8 | 7.2% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.5% | 4 |
| sample.Fire 1.0 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 78.4 | 15 / 35 | 2832 |
| 2 | 3 | 58.2 | 67.0 | 4 / 35 | 2985 |
| 3 | 2 | 60.2 | 70.8 | 7 / 35 | 3242 |
| 4 | 3 | 61.7 | 73.0 | 9 / 35 | 3437 |
| 5 | 2 | 62.1 | 75.9 | 8 / 35 | 3481 |
| 6 | 3 | 58.9 | 67.0 | 6 / 35 | 3215 |
| 7 | 2 | 63.1 | 76.5 | 13 / 35 | 3486 |
| 8 | 4 | 54.8 | 58.4 | 7 / 35 | 2430 |
| 9 | 4 | 59.9 | 66.7 | 8 / 35 | 3323 |
| 10 | 1 | 63.8 | 79.4 | 14 / 35 | 3522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 60 | 50% |
| jekl.StoneGhost 0.7 | 42 | 57% |
| pe.minimelee.SandboxMiniMelee 1.1 | 17 | 59% |
| gg.Wolverine 2.0 | 13 | 92% |
| DBall.NUKE 0.1 | 8 | 75% |
| mld.Wisdom 1.0 | 7 | 71% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 100% |
| spinnercat.Omen 1.0 | 1 | 0% |

Hadur died in 260 of 350 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 93 | 36% | 110 |
| origin.SleepSiphon 1.7b | 65 | 25% | 99 |
| pe.minimelee.SandboxMiniMelee 1.1 | 36 | 14% | 50 |
| mld.Wisdom 1.0 | 32 | 12% | 37 |
| gg.Wolverine 2.0 | 13 | 5% | 18 |
| spinnercat.Omen 1.0 | 9 | 3% | 12 |
| DBall.NUKE 0.1 | 6 | 2% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 2% | 9 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 83.6 | 111 / 350 | 2.47 | 16.5% | 44353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.6 | 17.7% | 84 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.6% | 85 |
| hadur117.nano.SanaroHT 0.2 | 2.6 | 16.5% | 111 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.8% | 26 |
| franzor.Lizt 1.3.1 | 4.8 | 11.4% | 46 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.7% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 86.7 | 15 / 35 | 4784 |
| 2 | 2 | 67.7 | 84.4 | 14 / 35 | 4607 |
| 3 | 3 | 67.1 | 82.9 | 10 / 35 | 4208 |
| 4 | 3 | 67.0 | 84.8 | 10 / 35 | 4452 |
| 5 | 3 | 65.6 | 79.0 | 9 / 35 | 4286 |
| 6 | 2 | 67.3 | 84.8 | 13 / 35 | 4447 |
| 7 | 3 | 66.7 | 82.2 | 10 / 35 | 4470 |
| 8 | 3 | 66.1 | 80.0 | 10 / 35 | 4364 |
| 9 | 2 | 68.3 | 88.9 | 13 / 35 | 4574 |
| 10 | 3 | 66.0 | 82.5 | 7 / 35 | 4161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 102 | 59% |
| rsalesc.melee.Monk 0.3.6c | 54 | 24% |
| oog.melee.CapuletDroid 1.1 | 36 | 75% |
| franzor.Lizt 1.3.1 | 17 | 53% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 240 of 350 rounds, at a mean tick of 1467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 117 | 49% | 187 |
| rsalesc.melee.Monk 0.3.6c | 79 | 33% | 100 |
| oog.melee.CapuletDroid 1.1 | 20 | 8% | 51 |
| franzor.Lizt 1.3.1 | 15 | 6% | 2 |
| exauge.GateKeeper 1.1.121g | 4 | 2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 3 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 70.6 | 88 / 350 | 3.65 | 13.6% | 31049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHT 0.2 | 2.0 | 13.6% | 88 |
| shrub.Vapour v159 | 2.3 | 13.8% | 91 |
| tm.Yuugao 1.0 | 2.3 | 13.4% | 81 |
| Krabb.sliNk.Garm 0.9u | 4.4 | 10.7% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 10.5% | 29 |
| m3thos.Eva00 1.1 | 5.6 | 9.7% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.5% | 22 |
| SHAM.WOW 1.4 | 8.7 | 6.8% | 4 |
| zyx.nano.BacillusComma 1.0 | 9.1 | 6.4% | 1 |
| qualidafial.MajorDick 1.0.1 | 9.1 | 6.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 77.1 | 11 / 35 | 3334 |
| 2 | 4 | 53.4 | 54.9 | 7 / 35 | 2747 |
| 3 | 3 | 57.9 | 65.7 | 8 / 35 | 3116 |
| 4 | 2 | 59.5 | 70.2 | 9 / 35 | 3165 |
| 5 | 4 | 56.9 | 63.8 | 4 / 35 | 3185 |
| 6 | 1 | 62.0 | 77.5 | 10 / 35 | 3250 |
| 7 | 1 | 60.9 | 74.6 | 10 / 35 | 3299 |
| 8 | 1 | 60.5 | 74.3 | 8 / 35 | 2978 |
| 9 | 1 | 61.9 | 77.8 | 13 / 35 | 3034 |
| 10 | 2 | 58.6 | 70.2 | 8 / 35 | 2941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 40 | 53% |
| shrub.Vapour v159 | 36 | 36% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 71% |
| Krabb.sliNk.Garm 0.9u | 17 | 59% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 76% |
| m3thos.Eva00 1.1 | 12 | 75% |
| SHAM.WOW 1.4 | 5 | 80% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |

Hadur died in 262 of 350 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 66 | 25% | 82 |
| tm.Yuugao 1.0 | 59 | 23% | 87 |
| Krabb.sliNk.Garm 0.9u | 37 | 14% | 43 |
| com.spp.robocode.MostlyHarmless 010 | 25 | 10% | 40 |
| m3thos.Eva00 1.1 | 25 | 10% | 30 |
| jwst.DAD.DarkAndDarker 1.1 | 22 | 8% | 33 |
| zyx.nano.BacillusComma 1.0 | 14 | 5% | 15 |
| SHAM.WOW 1.4 | 8 | 3% | 12 |
| qualidafial.MajorDick 1.0.1 | 6 | 2% | 7 |

## Melee bench: F09

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 61.8 | 43 / 350 | 4.44 | 11.7% | 26992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.4% | 174 |
| kc.micro.Figment 1.0 | 1.9 | 15.0% | 69 |
| hadur117.nano.SanaroHT 0.2 | 3.6 | 11.7% | 43 |
| pedersen.Grishnakh 1.0 | 4.1 | 11.1% | 33 |
| yagami.Tidus 0.11 | 4.8 | 10.7% | 5 |
| mc2.enemy.Original 0.9 | 5.5 | 9.8% | 19 |
| dft.Calliope 5.6 | 7.0 | 8.1% | 7 |
| step.nanoPri 1.0 | 8.4 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.5% | 0 |
| rdm.Dueler 0.4x | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 52.2 | 51.7 | 4 / 35 | 2325 |
| 2 | 3 | 59.7 | 69.2 | 9 / 35 | 2839 |
| 3 | 4 | 54.9 | 56.5 | 5 / 35 | 2831 |
| 4 | 3 | 56.5 | 63.2 | 3 / 35 | 2572 |
| 5 | 3 | 57.6 | 64.8 | 3 / 35 | 2992 |
| 6 | 4 | 55.9 | 61.6 | 2 / 35 | 2538 |
| 7 | 3 | 57.1 | 63.5 | 4 / 35 | 2815 |
| 8 | 4 | 53.9 | 57.1 | 2 / 35 | 2471 |
| 9 | 3 | 55.9 | 60.3 | 6 / 35 | 2612 |
| 10 | 3 | 59.8 | 70.2 | 5 / 35 | 2997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 57 | 28% |
| kc.micro.Figment 1.0 | 35 | 31% |
| mc2.enemy.Original 0.9 | 15 | 53% |
| pedersen.Grishnakh 1.0 | 8 | 38% |
| yagami.Tidus 0.11 | 3 | 100% |
| dft.Calliope 5.6 | 3 | 67% |

Hadur died in 307 of 350 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 108 | 35% | 124 |
| kc.micro.Figment 1.0 | 75 | 24% | 88 |
| yagami.Tidus 0.11 | 36 | 12% | 39 |
| pedersen.Grishnakh 1.0 | 28 | 9% | 29 |
| mc2.enemy.Original 0.9 | 22 | 7% | 30 |
| robar.nano.Assertive_Melee 0.2 | 13 | 4% | 13 |
| step.nanoPri 1.0 | 11 | 4% | 11 |
| dft.Calliope 5.6 | 10 | 3% | 12 |
| rdm.Dueler 0.4x | 4 | 1% | 4 |

## Melee bench: F10

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 80.4 | 130 / 350 | 2.76 | 15.6% | 38876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHT 0.2 | 1.3 | 15.6% | 130 |
| DTF.Kludgy 1.2b | 2.3 | 14.8% | 77 |
| ne.Chimera 1.2 | 2.9 | 13.8% | 43 |
| ejb.Polaris 1.0.1 | 3.5 | 13.0% | 47 |
| tvv.micro.Antares 1.1.1 | 5.4 | 10.8% | 32 |
| vStar.RAFzilla 2.15 | 5.6 | 10.4% | 9 |
| sam.Samspin 1.0 | 7.3 | 6.3% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.1 | 5.7% | 0 |
| kurios.DOSexe .9b | 8.6 | 5.3% | 5 |
| donjezza.Muncho 1.0 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 78.4 | 15 / 35 | 4109 |
| 2 | 1 | 66.0 | 85.1 | 15 / 35 | 4091 |
| 3 | 1 | 64.6 | 84.1 | 13 / 35 | 3988 |
| 4 | 3 | 63.5 | 76.8 | 13 / 35 | 3827 |
| 5 | 2 | 63.1 | 77.1 | 10 / 35 | 3832 |
| 6 | 1 | 63.9 | 81.0 | 14 / 35 | 3858 |
| 7 | 1 | 64.7 | 84.4 | 14 / 35 | 3722 |
| 8 | 1 | 64.0 | 79.7 | 14 / 35 | 3881 |
| 9 | 1 | 64.2 | 82.2 | 11 / 35 | 3928 |
| 10 | 1 | 62.0 | 75.6 | 11 / 35 | 3640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 60 | 52% |
| ejb.Polaris 1.0.1 | 52 | 85% |
| ne.Chimera 1.2 | 38 | 63% |
| tvv.micro.Antares 1.1.1 | 24 | 33% |
| vStar.RAFzilla 2.15 | 18 | 89% |
| kurios.DOSexe .9b | 8 | 63% |
| sam.Samspin 1.0 | 3 | 0% |
| donjezza.Muncho 1.0 | 2 | 100% |

Hadur died in 220 of 350 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 68 | 31% | 100 |
| ne.Chimera 1.2 | 65 | 30% | 90 |
| tvv.micro.Antares 1.1.1 | 30 | 14% | 36 |
| ejb.Polaris 1.0.1 | 25 | 11% | 69 |
| sam.Samspin 1.0 | 14 | 6% | 14 |
| kurios.DOSexe .9b | 8 | 4% | 12 |
| vStar.RAFzilla 2.15 | 6 | 3% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 1% | 4 |
| donjezza.Muncho 1.0 | 1 | 0% | 3 |

## Melee bench: F11

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 67.6 | 83 / 350 | 3.92 | 13.1% | 30482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.4% | 133 |
| hadur117.nano.SanaroHT 0.2 | 2.5 | 13.1% | 83 |
| cx.mini.Nimrod 0.55 | 2.6 | 12.8% | 37 |
| djc.DynaBot 0.1.1 | 4.4 | 10.5% | 23 |
| br2.MobyDickBot 1.6 | 5.6 | 9.5% | 26 |
| rdt199.Warlord 0.73 | 5.8 | 9.5% | 24 |
| uji.YellohFellah 1.0 | 6.4 | 8.9% | 24 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.5% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.9 | 5.9% | 0 |
| stelo.MirrorNano 1.3 | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 68.6 | 8 / 35 | 3150 |
| 2 | 2 | 60.2 | 70.2 | 10 / 35 | 3066 |
| 3 | 2 | 59.0 | 68.3 | 9 / 35 | 2981 |
| 4 | 2 | 60.9 | 72.4 | 7 / 35 | 3176 |
| 5 | 3 | 59.2 | 67.9 | 11 / 35 | 2845 |
| 6 | 3 | 54.6 | 55.6 | 5 / 35 | 3172 |
| 7 | 3 | 57.7 | 62.9 | 9 / 35 | 3085 |
| 8 | 3 | 58.7 | 68.6 | 9 / 35 | 2966 |
| 9 | 3 | 58.1 | 66.0 | 8 / 35 | 2882 |
| 10 | 2 | 61.5 | 75.2 | 7 / 35 | 3159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 69 | 49% |
| djc.DynaBot 0.1.1 | 20 | 75% |
| cx.mini.Nimrod 0.55 | 17 | 65% |
| rdt199.Warlord 0.73 | 13 | 100% |
| uji.YellohFellah 1.0 | 11 | 27% |
| br2.MobyDickBot 1.6 | 8 | 63% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 267 of 350 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 102 | 38% | 140 |
| cx.mini.Nimrod 0.55 | 48 | 18% | 59 |
| rdt199.Warlord 0.73 | 30 | 11% | 39 |
| br2.MobyDickBot 1.6 | 22 | 8% | 30 |
| djc.DynaBot 0.1.1 | 21 | 8% | 30 |
| KiraNL.Chupacabra 0.4 | 17 | 6% | 18 |
| uji.YellohFellah 1.0 | 15 | 6% | 22 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 3% | 9 |
| stelo.MirrorNano 1.3 | 3 | 1% | 3 |

## Melee bench: F12

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 70.9 | 80 / 350 | 3.62 | 13.4% | 27510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 2.0 | 14.3% | 82 |
| nat.PallasHawk 1.0 | 2.2 | 14.4% | 97 |
| darkcanuck.Leon 1.01 | 2.9 | 13.3% | 58 |
| hadur117.nano.SanaroHT 0.2 | 3.0 | 13.4% | 80 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.7% | 22 |
| jrm.Test0 1.0 | 6.2 | 8.9% | 3 |
| jp.Perpy 16.0 | 7.5 | 7.3% | 1 |
| cs.sheldor.Talon 1.1 | 7.6 | 7.1% | 3 |
| stuff.Vlad 0.1 | 9.2 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 67.3 | 6 / 35 | 2731 |
| 2 | 1 | 62.6 | 77.8 | 12 / 35 | 2978 |
| 3 | 4 | 58.0 | 68.6 | 7 / 35 | 2534 |
| 4 | 3 | 59.4 | 71.4 | 6 / 35 | 2820 |
| 5 | 3 | 60.0 | 70.5 | 10 / 35 | 2697 |
| 6 | 4 | 58.9 | 69.5 | 6 / 35 | 2684 |
| 7 | 2 | 61.7 | 74.6 | 7 / 35 | 3369 |
| 8 | 3 | 60.2 | 71.7 | 11 / 35 | 2700 |
| 9 | 3 | 59.7 | 71.1 | 10 / 35 | 2509 |
| 10 | 4 | 57.6 | 66.7 | 5 / 35 | 2488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 64 | 27% |
| bts.wiki.RipCurl 0.9b | 54 | 56% |
| darkcanuck.Leon 1.01 | 50 | 42% |
| brainfade.melee.Genghis 0.36 | 12 | 75% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| jp.Perpy 16.0 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 271 of 350 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 82 | 30% | 101 |
| bts.wiki.RipCurl 0.9b | 58 | 21% | 76 |
| darkcanuck.Leon 1.01 | 49 | 18% | 79 |
| jrm.Test0 1.0 | 26 | 10% | 26 |
| brainfade.melee.Genghis 0.36 | 23 | 8% | 30 |
| cs.sheldor.Talon 1.1 | 12 | 4% | 13 |
| jp.Perpy 16.0 | 11 | 4% | 12 |
| jaybot.bots.Oddball 4.0 | 8 | 3% | 10 |
| stuff.Vlad 0.1 | 2 | 1% | 3 |

## Melee bench: F13

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 70.5 | 55 / 350 | 3.65 | 12.8% | 30186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.0% | 140 |
| ags.Glacier 0.2.11 | 1.6 | 17.2% | 98 |
| hadur117.nano.SanaroHT 0.2 | 3.3 | 12.8% | 55 |
| shinh.Entangled 0.3 | 4.1 | 12.2% | 37 |
| gh.micro.Gruweltje 0.7 | 4.6 | 11.9% | 17 |
| apc.Colossus2 0.17 | 6.1 | 8.3% | 1 |
| stelo.Wang 1.0 | 7.0 | 6.9% | 2 |
| maribo.FollowFire 1 | 8.4 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 5.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 77.5 | 7 / 35 | 2808 |
| 2 | 3 | 59.9 | 70.8 | 7 / 35 | 3233 |
| 3 | 3 | 60.6 | 74.3 | 4 / 35 | 2960 |
| 4 | 3 | 58.0 | 66.0 | 3 / 35 | 3116 |
| 5 | 4 | 59.5 | 69.2 | 6 / 35 | 3164 |
| 6 | 4 | 59.7 | 67.3 | 7 / 35 | 3185 |
| 7 | 3 | 59.7 | 72.4 | 5 / 35 | 2723 |
| 8 | 4 | 59.3 | 68.6 | 9 / 35 | 2769 |
| 9 | 3 | 59.6 | 71.4 | 5 / 35 | 2907 |
| 10 | 3 | 58.3 | 67.6 | 2 / 35 | 3321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 70 | 44% |
| ags.Glacier 0.2.11 | 42 | 14% |
| shinh.Entangled 0.3 | 28 | 43% |
| gh.micro.Gruweltje 0.7 | 7 | 71% |
| stelo.Wang 1.0 | 1 | 0% |

Hadur died in 296 of 350 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 92 | 31% | 101 |
| mn.Combat 3.25.0 | 68 | 23% | 92 |
| shinh.Entangled 0.3 | 57 | 19% | 69 |
| gh.micro.Gruweltje 0.7 | 38 | 13% | 44 |
| stelo.Wang 1.0 | 16 | 5% | 16 |
| apc.Colossus2 0.17 | 13 | 4% | 13 |
| maribo.FollowFire 1 | 8 | 3% | 8 |
| ayk.WallHugger 1.0 | 3 | 1% | 5 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 78.4 | 114 / 350 | 2.94 | 14.9% | 33806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.4% | 115 |
| hadur117.nano.SanaroHT 0.2 | 2.1 | 14.9% | 114 |
| catcat20.shape.Theta 0.018 | 3.1 | 12.2% | 65 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.7 | 10.4% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 5.4 | 9.9% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 5.6 | 9.8% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 6.3 | 9.5% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.2% | 19 |
| pa.Improved 1.0 | 9.0 | 5.7% | 5 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 83.5 | 14 / 35 | 3371 |
| 2 | 2 | 64.7 | 82.9 | 17 / 35 | 3406 |
| 3 | 2 | 62.1 | 77.5 | 13 / 35 | 3110 |
| 4 | 3 | 61.5 | 75.6 | 8 / 35 | 3486 |
| 5 | 2 | 63.0 | 78.7 | 10 / 35 | 3331 |
| 6 | 2 | 62.5 | 74.9 | 12 / 35 | 3428 |
| 7 | 2 | 62.8 | 80.0 | 9 / 35 | 3305 |
| 8 | 2 | 61.6 | 75.2 | 10 / 35 | 3284 |
| 9 | 2 | 63.2 | 77.1 | 13 / 35 | 3623 |
| 10 | 2 | 63.2 | 79.0 | 8 / 35 | 3462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 109 | 61% |
| catcat20.shape.Theta 0.018 | 42 | 31% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 78% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 50% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 55% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 238 of 350 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 107 | 45% | 174 |
| catcat20.shape.Theta 0.018 | 42 | 18% | 56 |
| sanyi.mikrobi.Roberto 1.0 | 22 | 9% | 32 |
| dmh.robocode.robot.RedDwarf 0.4 | 21 | 9% | 28 |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 6% | 25 |
| Lo_Ian.Gandalf_V4 4.0 | 13 | 5% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 5% | 9 |
| pa.Improved 1.0 | 5 | 2% | 6 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 67.9 | 66 / 350 | 3.89 | 13.4% | 34907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.7 | 15.2% | 70 |
| emp.Yngwie 1.11 | 2.1 | 14.1% | 113 |
| hadur117.nano.SanaroHT 0.2 | 2.7 | 13.4% | 66 |
| mld.DustBunny 3.8 | 3.9 | 12.7% | 31 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.3% | 20 |
| kawigi.robot.Girl 1.2 | 5.9 | 10.2% | 40 |
| lambdaxy.TBot 0.1 | 7.7 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.7% | 1 |
| divineomega.TrialBot 0.003 | 8.5 | 5.8% | 9 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 68.6 | 5 / 35 | 3420 |
| 2 | 2 | 60.3 | 68.6 | 9 / 35 | 3527 |
| 3 | 3 | 58.3 | 64.1 | 5 / 35 | 3390 |
| 4 | 2 | 60.1 | 69.2 | 5 / 35 | 3611 |
| 5 | 3 | 56.9 | 62.5 | 5 / 35 | 3038 |
| 6 | 3 | 60.8 | 72.1 | 7 / 35 | 3435 |
| 7 | 1 | 62.1 | 73.3 | 10 / 35 | 3769 |
| 8 | 1 | 63.2 | 75.6 | 11 / 35 | 3764 |
| 9 | 4 | 58.0 | 61.9 | 6 / 35 | 3608 |
| 10 | 5 | 57.4 | 63.2 | 3 / 35 | 3345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 46 | 46% |
| kawigi.micro.Shiz 1.1 | 38 | 47% |
| cb.nano.Insomnia 1.0 | 14 | 79% |
| mld.DustBunny 3.8 | 12 | 0% |
| kawigi.robot.Girl 1.2 | 11 | 73% |
| divineomega.TrialBot 0.003 | 8 | 88% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 68 | 24% | 83 |
| emp.Yngwie 1.11 | 66 | 23% | 92 |
| mld.DustBunny 3.8 | 61 | 21% | 71 |
| cb.nano.Insomnia 1.0 | 37 | 13% | 35 |
| kawigi.robot.Girl 1.2 | 21 | 7% | 29 |
| Grystrion.TrackerWO 1.0 | 12 | 4% | 13 |
| divineomega.TrialBot 0.003 | 9 | 3% | 16 |
| lambdaxy.TBot 0.1 | 8 | 3% | 9 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 1% | 2 |

## Melee bench: F16

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 67.9 | 55 / 350 | 3.89 | 13.6% | 37624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.6% | 166 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.2 | 14.2% | 14 |
| hadur117.nano.SanaroHT 0.2 | 2.8 | 13.6% | 55 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 11.1% | 62 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.8% | 30 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 9.3% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.9% | 10 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.4% | 10 |
| repositorio.NanoStep 1.0 | 8.9 | 5.1% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 65.1 | 8 / 35 | 3422 |
| 2 | 2 | 61.4 | 69.2 | 5 / 35 | 4132 |
| 3 | 3 | 63.4 | 73.7 | 8 / 35 | 4226 |
| 4 | 3 | 60.2 | 67.0 | 4 / 35 | 3807 |
| 5 | 3 | 56.1 | 57.8 | 3 / 35 | 3314 |
| 6 | 3 | 58.9 | 65.4 | 4 / 35 | 3690 |
| 7 | 3 | 62.2 | 72.1 | 7 / 35 | 3960 |
| 8 | 3 | 59.5 | 67.0 | 4 / 35 | 3460 |
| 9 | 2 | 60.1 | 69.5 | 5 / 35 | 3651 |
| 10 | 3 | 62.6 | 72.4 | 7 / 35 | 3962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 91 | 32% |
| techdude.forest.FlamingForest 1.1 | 22 | 41% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 92% |
| tvv.nano.Polaris 1.2 | 10 | 0% |
| stelo.IntrinsicVolatility 1.4 | 4 | 50% |
| bvh.fnr.Fenrir 0.36l | 3 | 67% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |

Hadur died in 295 of 350 rounds, at a mean tick of 1278. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 122 | 41% | 155 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 52 | 18% | 59 |
| techdude.forest.FlamingForest 1.1 | 37 | 13% | 47 |
| tvv.nano.Polaris 1.2 | 23 | 8% | 23 |
| bvh.fnr.Fenrir 0.36l | 21 | 7% | 22 |
| stelo.IntrinsicVolatility 1.4 | 16 | 5% | 18 |
| asd.Cthulhu 1.3 | 12 | 4% | 11 |
| divineomega.DivineBot 1.9.4.5 | 10 | 3% | 13 |
| repositorio.NanoStep 1.0 | 2 | 1% | 2 |

## Melee bench: F17

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 68.8 | 86 / 350 | 3.81 | 13.6% | 35147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 2.2 | 14.0% | 76 |
| hadur117.nano.SanaroHT 0.2 | 2.5 | 13.6% | 86 |
| et.Predator 1.8 | 2.6 | 13.8% | 62 |
| cx.BlestPain 1.41 | 3.0 | 13.4% | 66 |
| ahf.NanoAndrew .4 | 5.4 | 11.1% | 26 |
| nic.Nicator 2.4 | 5.4 | 11.1% | 24 |
| maribo.melee.BMV 0.1 | 7.1 | 9.0% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.6% | 3 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 74.6 | 11 / 35 | 3238 |
| 2 | 2 | 60.8 | 69.5 | 8 / 35 | 3738 |
| 3 | 3 | 60.6 | 67.9 | 9 / 35 | 3638 |
| 4 | 3 | 60.6 | 68.9 | 9 / 35 | 3486 |
| 5 | 1 | 63.7 | 76.2 | 10 / 35 | 3777 |
| 6 | 4 | 57.9 | 60.3 | 9 / 35 | 3238 |
| 7 | 2 | 60.5 | 68.3 | 7 / 35 | 3609 |
| 8 | 4 | 58.7 | 65.4 | 6 / 35 | 3397 |
| 9 | 1 | 61.6 | 72.4 | 9 / 35 | 3576 |
| 10 | 4 | 58.8 | 64.1 | 8 / 35 | 3450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 43 | 65% |
| et.Predator 1.8 | 37 | 32% |
| cx.BlestPain 1.41 | 32 | 94% |
| nic.Nicator 2.4 | 15 | 67% |
| ahf.NanoAndrew .4 | 10 | 30% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 264 of 350 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 58 | 22% | 73 |
| oog.melee.Mercutio 1.0 | 51 | 19% | 80 |
| ahf.NanoAndrew .4 | 46 | 17% | 49 |
| nic.Nicator 2.4 | 40 | 15% | 46 |
| cx.BlestPain 1.41 | 33 | 13% | 64 |
| maribo.melee.BMV 0.1 | 21 | 8% | 22 |
| tex.Longbot 0.4 | 10 | 4% | 10 |
| edu.otg.spr.TheTeacher 1.2 | 5 | 2% | 6 |

## Melee bench: F18

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 70.3 | 85 / 350 | 3.67 | 13.6% | 31128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHT 0.2 | 1.7 | 13.6% | 85 |
| morbid.MorbidPriest 1.0 | 1.8 | 13.9% | 66 |
| agd.Mooserwirt2 2.7 | 3.1 | 12.4% | 75 |
| uji.DBH 1.1 | 4.5 | 11.7% | 37 |
| ratosh.Nobo 0.21 | 4.6 | 10.9% | 15 |
| spinnercat.Robovirus 2.718 | 5.9 | 9.8% | 18 |
| sigterm.Sigterm 1.0 | 6.6 | 9.1% | 28 |
| kawigi.mini.Fhqwhgads 1.1 | 8.1 | 7.4% | 11 |
| stelo.WangRobot 1.0 | 8.9 | 5.9% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.6 | 66.3 | 8 / 35 | 3215 |
| 2 | 2 | 59.3 | 67.6 | 8 / 35 | 3326 |
| 3 | 3 | 58.1 | 67.9 | 7 / 35 | 2680 |
| 4 | 1 | 60.3 | 76.5 | 8 / 35 | 2678 |
| 5 | 1 | 60.2 | 71.7 | 12 / 35 | 3051 |
| 6 | 1 | 61.5 | 73.7 | 12 / 35 | 3405 |
| 7 | 3 | 57.0 | 63.8 | 5 / 35 | 3206 |
| 8 | 1 | 58.9 | 69.5 | 9 / 35 | 3043 |
| 9 | 1 | 62.1 | 77.5 | 9 / 35 | 3346 |
| 10 | 2 | 59.1 | 68.9 | 7 / 35 | 3178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 67% |
| agd.Mooserwirt2 2.7 | 37 | 38% |
| uji.DBH 1.1 | 28 | 46% |
| sigterm.Sigterm 1.0 | 18 | 50% |
| spinnercat.Robovirus 2.718 | 14 | 64% |
| stelo.WangRobot 1.0 | 9 | 11% |
| ratosh.Nobo 0.21 | 9 | 67% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 40% |

Hadur died in 266 of 350 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 66 | 25% | 96 |
| agd.Mooserwirt2 2.7 | 54 | 20% | 72 |
| uji.DBH 1.1 | 38 | 14% | 47 |
| ratosh.Nobo 0.21 | 32 | 12% | 41 |
| spinnercat.Robovirus 2.718 | 25 | 9% | 29 |
| sigterm.Sigterm 1.0 | 22 | 8% | 31 |
| stelo.WangRobot 1.0 | 14 | 5% | 15 |
| kawigi.mini.Fhqwhgads 1.1 | 11 | 4% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 2% | 5 |

## Melee bench: F19

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 80.3 | 109 / 350 | 2.77 | 15.7% | 38255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.7 | 16.4% | 74 |
| mld.Infinity 2.2 | 2.0 | 16.2% | 128 |
| hadur117.nano.SanaroHT 0.2 | 2.3 | 15.7% | 109 |
| krillr.mini.JointStrike 2.0.0 | 4.4 | 11.2% | 11 |
| erdnis.Rover 0.3 | 4.6 | 11.0% | 12 |
| patson.PatsonTestBot 1.0 | 6.1 | 8.8% | 6 |
| mbh.Mbh 0.1 | 7.3 | 7.3% | 0 |
| pac.ABC 2.1 | 7.6 | 7.1% | 11 |
| pbg.R2D2 1.0 | 9.0 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 85.1 | 14 / 35 | 3800 |
| 2 | 3 | 64.4 | 76.8 | 11 / 35 | 3916 |
| 3 | 3 | 63.2 | 74.9 | 12 / 35 | 3431 |
| 4 | 2 | 66.3 | 81.6 | 13 / 35 | 4241 |
| 5 | 1 | 65.1 | 81.3 | 9 / 35 | 4119 |
| 6 | 2 | 64.8 | 78.7 | 14 / 35 | 3598 |
| 7 | 3 | 63.7 | 77.8 | 6 / 35 | 3650 |
| 8 | 3 | 64.3 | 81.0 | 8 / 35 | 3426 |
| 9 | 2 | 66.5 | 83.2 | 11 / 35 | 4228 |
| 10 | 2 | 66.0 | 83.2 | 11 / 35 | 3846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 108 | 45% |
| davidalves.net.DuelistMiniMelee 1.2 | 68 | 56% |
| krillr.mini.JointStrike 2.0.0 | 15 | 87% |
| patson.PatsonTestBot 1.0 | 8 | 38% |
| pac.ABC 2.1 | 7 | 43% |
| erdnis.Rover 0.3 | 6 | 50% |

Hadur died in 241 of 350 rounds, at a mean tick of 1053. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 86 | 36% | 37 |
| davidalves.net.DuelistMiniMelee 1.2 | 76 | 32% | 170 |
| patson.PatsonTestBot 1.0 | 23 | 10% | 28 |
| erdnis.Rover 0.3 | 21 | 9% | 32 |
| krillr.mini.JointStrike 2.0.0 | 20 | 8% | 39 |
| pac.ABC 2.1 | 7 | 3% | 11 |
| mbh.Mbh 0.1 | 6 | 2% | 16 |
| pbg.R2D2 1.0 | 2 | 1% | 11 |

## Melee bench: F20

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 70.2 | 84 / 350 | 3.69 | 13.7% | 32759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.6% | 136 |
| hadur117.nano.SanaroHT 0.2 | 2.0 | 13.7% | 84 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.7% | 15 |
| fwb.Nine 1.0.1 | 3.9 | 11.3% | 43 |
| catcat20.Rabbit 0.001 | 5.0 | 10.2% | 30 |
| m3thos.mini.Eva01 0.5.5 | 6.6 | 8.9% | 10 |
| djdjdj.NanoSkunk10 1.0 | 6.9 | 8.6% | 8 |
| bayen.nut.Squirrel 1.615 | 7.3 | 8.2% | 22 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.2 | 68.3 | 8 / 35 | 2989 |
| 2 | 2 | 59.6 | 67.9 | 8 / 35 | 3318 |
| 3 | 2 | 61.9 | 75.9 | 7 / 35 | 3307 |
| 4 | 2 | 59.6 | 67.9 | 8 / 35 | 3307 |
| 5 | 2 | 61.0 | 74.0 | 8 / 35 | 3255 |
| 6 | 2 | 59.0 | 65.4 | 10 / 35 | 3304 |
| 7 | 2 | 61.1 | 71.4 | 11 / 35 | 3426 |
| 8 | 2 | 59.4 | 68.3 | 6 / 35 | 3456 |
| 9 | 2 | 60.4 | 69.5 | 11 / 35 | 3222 |
| 10 | 2 | 60.4 | 73.0 | 7 / 35 | 3175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 77 | 40% |
| catcat20.Rabbit 0.001 | 21 | 71% |
| nz.jdc.nano.GridFu 1.0 | 18 | 67% |
| fwb.Nine 1.0.1 | 11 | 82% |
| bayen.nut.Squirrel 1.615 | 10 | 80% |
| djdjdj.NanoSkunk10 1.0 | 7 | 86% |
| m3thos.mini.Eva01 0.5.5 | 6 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 266 of 350 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 117 | 44% | 145 |
| fwb.Nine 1.0.1 | 40 | 15% | 49 |
| nz.jdc.nano.GridFu 1.0 | 35 | 13% | 52 |
| catcat20.Rabbit 0.001 | 26 | 10% | 43 |
| djdjdj.NanoSkunk10 1.0 | 15 | 6% | 20 |
| bayen.nut.Squirrel 1.615 | 15 | 6% | 20 |
| m3thos.mini.Eva01 0.5.5 | 11 | 4% | 12 |
| ntc.ControlledChaos 1.1.4 | 4 | 2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 1% | 5 |

## Melee bench: F21

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.5 | 148 / 350 | 2.48 | 17.2% | 45392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHT 0.2 | 1.3 | 17.2% | 148 |
| eem.EvBot v4.6.16 | 1.7 | 16.8% | 140 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 24 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 22 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.7% | 0 |
| eld.Hmm 1.0 | 5.7 | 8.3% | 17 |
| el.JumpShoot 0.2 | 7.7 | 6.3% | 3 |
| fire219.CatBot 1.0 | 8.3 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 91.1 | 17 / 35 | 4463 |
| 2 | 2 | 66.5 | 85.1 | 12 / 35 | 4418 |
| 3 | 1 | 67.2 | 85.7 | 11 / 35 | 5008 |
| 4 | 1 | 66.7 | 82.5 | 15 / 35 | 4812 |
| 5 | 2 | 65.1 | 77.8 | 16 / 35 | 4310 |
| 6 | 1 | 67.1 | 86.3 | 16 / 35 | 4494 |
| 7 | 1 | 65.8 | 82.5 | 15 / 35 | 4140 |
| 8 | 1 | 66.2 | 79.7 | 16 / 35 | 4650 |
| 9 | 1 | 66.8 | 83.2 | 14 / 35 | 4609 |
| 10 | 2 | 66.3 | 81.3 | 16 / 35 | 4488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 147 | 56% |
| dummy.mini.Scimitar 1.01 | 44 | 86% |
| cf.RiO.RiOx 4.2.1 | 18 | 39% |
| eld.Hmm 1.0 | 16 | 81% |
| el.JumpShoot 0.2 | 4 | 50% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 202 of 350 rounds, at a mean tick of 1265. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 87 | 43% | 148 |
| dummy.mini.Scimitar 1.01 | 49 | 24% | 96 |
| cf.RiO.RiOx 4.2.1 | 35 | 17% | 43 |
| eld.Hmm 1.0 | 8 | 4% | 29 |
| oa.weak.BotherBot 0.1 | 7 | 3% | 15 |
| fire219.CatBot 1.0 | 6 | 3% | 6 |
| el.JumpShoot 0.2 | 5 | 2% | 7 |
| PSW.Relentless 0.1 | 4 | 2% | 4 |
| arthord.MannyPacquiao Beta | 1 | 0% | 1 |

## Melee bench: F23

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.4 | 143 / 350 | 2.41 | 16.8% | 40243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.2 | 18.5% | 146 |
| hadur117.nano.SanaroHT 0.2 | 1.9 | 16.8% | 143 |
| cre.Karolos 0.32 | 2.9 | 14.4% | 38 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 10.7% | 13 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.4% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.9 | 9.0% | 2 |
| sample.Walls 1.0 | 6.8 | 8.5% | 3 |
| cw.megas.Blade 0.8 | 7.6 | 7.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.1 | 78.4 | 12 / 35 | 3687 |
| 2 | 2 | 67.5 | 87.0 | 16 / 35 | 4320 |
| 3 | 1 | 68.1 | 88.9 | 17 / 35 | 4077 |
| 4 | 2 | 66.0 | 82.5 | 14 / 35 | 3651 |
| 5 | 2 | 68.5 | 90.8 | 13 / 35 | 4273 |
| 6 | 2 | 67.1 | 84.4 | 14 / 35 | 4149 |
| 7 | 1 | 67.6 | 86.7 | 19 / 35 | 4402 |
| 8 | 2 | 66.6 | 86.3 | 15 / 35 | 3388 |
| 9 | 2 | 66.4 | 78.7 | 14 / 35 | 4346 |
| 10 | 2 | 65.3 | 80.0 | 9 / 35 | 3950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 124 | 50% |
| cre.Karolos 0.32 | 46 | 65% |
| stelo.AreaTargetingBot 1.1 | 26 | 65% |
| sample.Walls 1.0 | 18 | 100% |
| stelo.RamTrackSurfer 1.2 | 9 | 89% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 208 of 350 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 113 | 54% | 177 |
| cre.Karolos 0.32 | 48 | 23% | 79 |
| stelo.AreaTargetingBot 1.1 | 24 | 12% | 40 |
| stelo.RamTrackSurfer 1.2 | 9 | 4% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 3% | 15 |
| cw.megas.Blade 0.8 | 4 | 2% | 8 |
| sample.Walls 1.0 | 2 | 1% | 8 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 2 |

## Melee bench: F24

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 59.1 | 50 / 350 | 4.68 | 11.0% | 23889 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.6 | 15.2% | 92 |
| florent.XSeries.X2 0.12 | 2.2 | 13.8% | 74 |
| davidalves.Phoenix 0.54 | 2.5 | 13.5% | 66 |
| pedersen.Ugluk 1.1.1 | 4.1 | 11.9% | 36 |
| hadur117.nano.SanaroHT 0.2 | 5.2 | 11.0% | 50 |
| oog.melee.Corsair 1.0 | 6.1 | 9.3% | 13 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 9.1% | 17 |
| lunchie.Lunchbox 0.93 | 8.1 | 6.5% | 1 |
| as.FrankTheTank 1.3 | 9.4 | 5.0% | 2 |
| evd.X1 0.01 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 52.8 | 56.5 | 4 / 35 | 2141 |
| 2 | 5 | 57.1 | 65.1 | 8 / 35 | 2415 |
| 3 | 4 | 55.9 | 59.4 | 6 / 35 | 2976 |
| 4 | 4 | 56.3 | 62.5 | 6 / 35 | 2591 |
| 5 | 7 | 51.5 | 52.1 | 4 / 35 | 2328 |
| 6 | 6 | 51.8 | 53.7 | 5 / 35 | 1928 |
| 7 | 5 | 55.5 | 63.2 | 5 / 35 | 2297 |
| 8 | 5 | 54.2 | 58.1 | 4 / 35 | 2391 |
| 9 | 4 | 57.1 | 66.3 | 5 / 35 | 2559 |
| 10 | 6 | 51.9 | 54.3 | 3 / 35 | 2263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 23 | 61% |
| davidalves.Phoenix 0.54 | 21 | 43% |
| florent.XSeries.X2 0.12 | 19 | 63% |
| pedersen.Ugluk 1.1.1 | 12 | 75% |
| stelo.SoJNanoMelee 1.1 | 8 | 25% |
| oog.melee.Corsair 1.0 | 4 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 71 | 24% | 82 |
| rz.GlowBlowMelee 1.4 | 61 | 20% | 73 |
| florent.XSeries.X2 0.12 | 54 | 18% | 65 |
| pedersen.Ugluk 1.1.1 | 47 | 16% | 53 |
| stelo.SoJNanoMelee 1.1 | 23 | 8% | 23 |
| oog.melee.Corsair 1.0 | 19 | 6% | 26 |
| lunchie.Lunchbox 0.93 | 11 | 4% | 13 |
| evd.X1 0.01 | 9 | 3% | 9 |
| as.FrankTheTank 1.3 | 5 | 2% | 6 |

## Melee bench: F25

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 68.6 | 68 / 350 | 3.82 | 13.3% | 29225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.2 | 15.0% | 101 |
| hadur117.nano.SanaroHT 0.2 | 2.3 | 13.3% | 68 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.7% | 52 |
| jdw.Hurricane 1.4 | 4.4 | 11.6% | 48 |
| gre.svman4.Morfeas 1.4.1 | 5.1 | 10.6% | 27 |
| ds.Oo 2.2 | 6.2 | 9.1% | 24 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.4% | 16 |
| awesomeness.Elite 1.0 | 8.1 | 7.4% | 6 |
| adt.Ar2 1.1 | 8.4 | 6.8% | 7 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 73.7 | 3 / 35 | 2951 |
| 2 | 3 | 57.7 | 67.0 | 4 / 35 | 2889 |
| 3 | 2 | 59.2 | 72.4 | 4 / 35 | 2751 |
| 4 | 2 | 58.5 | 65.4 | 6 / 35 | 3270 |
| 5 | 3 | 56.3 | 61.0 | 5 / 35 | 2921 |
| 6 | 1 | 62.3 | 72.7 | 13 / 35 | 3270 |
| 7 | 3 | 59.3 | 66.7 | 10 / 35 | 2719 |
| 8 | 2 | 61.8 | 74.3 | 12 / 35 | 2859 |
| 9 | 2 | 60.6 | 71.1 | 7 / 35 | 3046 |
| 10 | 3 | 55.6 | 62.2 | 4 / 35 | 2549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 63 | 32% |
| voidious.micro.BlitzBat 1.05 | 37 | 32% |
| jdw.Hurricane 1.4 | 20 | 75% |
| gre.svman4.Morfeas 1.4.1 | 16 | 56% |
| gjr.Cephalosporin 0.1 | 8 | 38% |
| ds.Oo 2.2 | 8 | 50% |
| awesomeness.Elite 1.0 | 3 | 100% |
| adt.Ar2 1.1 | 3 | 67% |

Hadur died in 282 of 350 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 83 | 29% | 102 |
| voidious.micro.BlitzBat 1.05 | 68 | 24% | 78 |
| gjr.Cephalosporin 0.1 | 27 | 10% | 30 |
| jdw.Hurricane 1.4 | 26 | 9% | 40 |
| gre.svman4.Morfeas 1.4.1 | 25 | 9% | 35 |
| ds.Oo 2.2 | 20 | 7% | 25 |
| awesomeness.Elite 1.0 | 17 | 6% | 21 |
| adt.Ar2 1.1 | 12 | 4% | 15 |
| amk.ChumbaMini 0.2 | 4 | 1% | 4 |

## Melee bench: F26

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 71.5 | 63 / 350 | 3.56 | 13.3% | 32210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.1% | 129 |
| hadur117.nano.SanaroHT 0.2 | 2.9 | 13.3% | 63 |
| shu.nitro.LENIN .T34 | 3.0 | 13.1% | 62 |
| lrem.Spectre 0.4.4 | 3.7 | 12.4% | 36 |
| js.PinBall 1.6 | 5.1 | 11.3% | 23 |
| gh.mini.GrubbmOne 1.0 | 5.4 | 11.0% | 19 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 9.4% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.7% | 4 |
| sample.SpinBot 1.0 | 8.9 | 5.3% | 3 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.2 | 70.5 | 4 / 35 | 2836 |
| 2 | 4 | 60.3 | 70.5 | 7 / 35 | 3054 |
| 3 | 4 | 57.7 | 67.0 | 2 / 35 | 2927 |
| 4 | 2 | 59.2 | 69.2 | 5 / 35 | 3056 |
| 5 | 2 | 59.8 | 71.7 | 7 / 35 | 3102 |
| 6 | 3 | 59.6 | 69.8 | 7 / 35 | 3110 |
| 7 | 2 | 61.1 | 72.1 | 9 / 35 | 3499 |
| 8 | 3 | 60.3 | 72.1 | 6 / 35 | 3246 |
| 9 | 2 | 63.4 | 77.8 | 10 / 35 | 3884 |
| 10 | 3 | 61.7 | 74.6 | 6 / 35 | 3496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 54 | 30% |
| shu.nitro.LENIN .T34 | 37 | 41% |
| lrem.Spectre 0.4.4 | 30 | 47% |
| gh.mini.GrubbmOne 1.0 | 12 | 33% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 57% |
| js.PinBall 1.6 | 6 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 50% |
| sample.SpinBot 1.0 | 4 | 75% |

Hadur died in 289 of 350 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 79 | 27% | 92 |
| lrem.Spectre 0.4.4 | 46 | 16% | 57 |
| shu.nitro.LENIN .T34 | 45 | 16% | 61 |
| gh.mini.GrubbmOne 1.0 | 38 | 13% | 43 |
| js.PinBall 1.6 | 35 | 12% | 42 |
| jaybot.adv.bots.JayBot 2.0 | 25 | 9% | 31 |
| fullsail.LaxativeTeaTwo 1.0 | 13 | 4% | 14 |
| sample.SpinBot 1.0 | 7 | 2% | 9 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 71.3 | 107 / 350 | 3.59 | 13.8% | 29952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 2.0 | 14.3% | 95 |
| hadur117.nano.SanaroHT 0.2 | 2.0 | 13.8% | 107 |
| wee.Gem 1.8.4 | 3.1 | 12.5% | 68 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 11.8% | 41 |
| EH.Eagle 1.0.6 | 4.8 | 10.8% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 6.4 | 9.4% | 12 |
| joe.ADinosaur 1.0 | 7.0 | 8.7% | 6 |
| throxbot.ThroxBot 0.1 | 7.9 | 7.8% | 3 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.6% | 6 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 75.6 | 13 / 35 | 3199 |
| 2 | 1 | 62.5 | 80.3 | 16 / 35 | 2680 |
| 3 | 2 | 59.8 | 74.0 | 12 / 35 | 2472 |
| 4 | 2 | 58.2 | 66.0 | 11 / 35 | 2953 |
| 5 | 2 | 60.1 | 69.5 | 6 / 35 | 3443 |
| 6 | 2 | 60.8 | 74.3 | 10 / 35 | 2884 |
| 7 | 2 | 59.8 | 71.1 | 11 / 35 | 2900 |
| 8 | 2 | 60.0 | 74.0 | 11 / 35 | 2495 |
| 9 | 2 | 61.6 | 77.5 | 10 / 35 | 2632 |
| 10 | 3 | 56.8 | 50.5 | 7 / 35 | 4294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 65 | 66% |
| wee.Gem 1.8.4 | 42 | 57% |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 53% |
| EH.Eagle 1.0.6 | 15 | 87% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 67% |
| joe.ADinosaur 1.0 | 6 | 67% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 243 of 350 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 66 | 27% | 108 |
| sheldor.melee.nano.TestMelee 0.1 | 51 | 21% | 63 |
| wee.Gem 1.8.4 | 40 | 16% | 68 |
| joe.ADinosaur 1.0 | 22 | 9% | 24 |
| throxbot.ThroxBot 0.1 | 16 | 7% | 20 |
| EH.Eagle 1.0.6 | 14 | 6% | 29 |
| caimano.Furia_Ceca 0.22 | 14 | 6% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 13 | 5% | 16 |
| cs.Grudge 1.0 | 7 | 3% | 6 |

## Melee bench: F28

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 81.1 | 134 / 350 | 2.70 | 15.7% | 32293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.5 | 15.9% | 97 |
| hadur117.nano.SanaroHT 0.2 | 1.6 | 15.7% | 134 |
| uji.Antique 1.0 | 3.0 | 12.8% | 56 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 11.3% | 32 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.8% | 10 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.1% | 6 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.8% | 11 |
| matt.advanced.Katana 1.0 | 8.5 | 6.2% | 4 |
| stelo.PianistNano 1.2 | 9.2 | 5.7% | 1 |
| stelo.Lifestealer 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 81.6 | 13 / 35 | 2930 |
| 2 | 2 | 63.5 | 81.3 | 11 / 35 | 3272 |
| 3 | 1 | 66.0 | 86.3 | 19 / 35 | 3254 |
| 4 | 2 | 63.1 | 79.4 | 12 / 35 | 3220 |
| 5 | 1 | 63.9 | 82.5 | 11 / 35 | 3294 |
| 6 | 3 | 61.0 | 72.4 | 12 / 35 | 3044 |
| 7 | 1 | 62.3 | 75.9 | 13 / 35 | 3110 |
| 8 | 2 | 64.6 | 84.4 | 14 / 35 | 3277 |
| 9 | 1 | 64.7 | 82.9 | 12 / 35 | 3583 |
| 10 | 1 | 65.2 | 84.1 | 17 / 35 | 3309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 118 | 59% |
| uji.Antique 1.0 | 55 | 73% |
| pfvicm.Sobieski 7.2.3b | 14 | 71% |
| qohnil.blot.BlotBot 3.61 | 14 | 43% |
| amk.ChumbaWumba 0.3 | 5 | 60% |
| ahr.ice.Ice 1.0.2 | 5 | 40% |
| matt.advanced.Katana 1.0 | 2 | 50% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 218 of 350 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 90 | 41% | 145 |
| pfvicm.Sobieski 7.2.3b | 34 | 16% | 40 |
| uji.Antique 1.0 | 30 | 14% | 72 |
| qohnil.blot.BlotBot 3.61 | 23 | 11% | 34 |
| amk.ChumbaWumba 0.3 | 21 | 10% | 28 |
| ahr.ice.Ice 1.0.2 | 11 | 5% | 15 |
| matt.advanced.Katana 1.0 | 5 | 2% | 9 |
| stelo.Lifestealer 1.0 | 3 | 1% | 4 |
| stelo.PianistNano 1.2 | 1 | 0% | 1 |

## Melee bench: F29

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 67.8 | 50 / 350 | 3.89 | 13.1% | 30696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.4 | 16.2% | 113 |
| deewiant.Anomaly 0.2 | 1.6 | 16.1% | 115 |
| hadur117.nano.SanaroHT 0.2 | 3.2 | 13.1% | 50 |
| myl.micro.Troodon 1.10 | 3.9 | 12.3% | 21 |
| jok.PheonixM 0.1.2 | 4.9 | 11.1% | 22 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.5% | 1 |
| DBall.Anarchy 0.1 | 6.6 | 8.2% | 25 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.6% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.4% | 2 |
| jangs.ns51 1.0 | 9.5 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 68.3 | 5 / 35 | 2782 |
| 2 | 5 | 54.8 | 56.5 | 1 / 35 | 2803 |
| 3 | 3 | 61.9 | 74.3 | 6 / 35 | 3059 |
| 4 | 3 | 58.1 | 61.9 | 2 / 35 | 3189 |
| 5 | 3 | 60.0 | 68.6 | 6 / 35 | 2835 |
| 6 | 3 | 59.4 | 64.4 | 9 / 35 | 3178 |
| 7 | 3 | 61.4 | 70.8 | 5 / 35 | 3424 |
| 8 | 3 | 59.7 | 68.9 | 6 / 35 | 2881 |
| 9 | 3 | 63.7 | 76.8 | 7 / 35 | 3827 |
| 10 | 3 | 59.1 | 67.9 | 3 / 35 | 2718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 49 | 8% |
| zyx.mega.YersiniaPestis 3.1 | 46 | 37% |
| myl.micro.Troodon 1.10 | 19 | 89% |
| DBall.Anarchy 0.1 | 12 | 42% |
| jok.PheonixM 0.1.2 | 7 | 71% |
| jangs.ns51 1.0 | 2 | 50% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 1021. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 116 | 39% | 121 |
| zyx.mega.YersiniaPestis 3.1 | 79 | 26% | 96 |
| myl.micro.Troodon 1.10 | 32 | 11% | 47 |
| jok.PheonixM 0.1.2 | 32 | 11% | 36 |
| DBall.Anarchy 0.1 | 18 | 6% | 23 |
| ph.melee.ArcherME 0.3 | 12 | 4% | 14 |
| fullsail.TimbotNoPrediction 1.0 | 7 | 2% | 7 |
| jangs.ns51 1.0 | 4 | 1% | 5 |

## Melee bench: F30

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.4 | 55.8 | 30 / 350 | 4.98 | 10.5% | 25788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.0 | 14.1% | 88 |
| darkcanuck.B26354 1.06 | 2.1 | 14.1% | 97 |
| oog.melee.Capulet 1.2 | 2.6 | 13.9% | 62 |
| stelo.PastFuture 2.3.2 | 3.3 | 13.2% | 47 |
| hadur117.nano.SanaroHT 0.2 | 5.2 | 10.5% | 30 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.3% | 17 |
| ntc.Opposite 1.5 | 7.4 | 7.9% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 8.1 | 7.4% | 2 |
| tripphippy.Alice 1.1 | 8.3 | 6.9% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.3 | 56.5 | 3 / 35 | 2338 |
| 2 | 6 | 49.4 | 49.8 | 0 / 35 | 2336 |
| 3 | 5 | 54.6 | 59.0 | 3 / 35 | 2610 |
| 4 | 5 | 53.7 | 56.8 | 1 / 35 | 2582 |
| 5 | 6 | 49.5 | 45.7 | 1 / 35 | 2548 |
| 6 | 5 | 52.6 | 55.6 | 3 / 35 | 2259 |
| 7 | 5 | 58.3 | 64.8 | 7 / 35 | 2930 |
| 8 | 5 | 53.1 | 54.6 | 4 / 35 | 2562 |
| 9 | 5 | 54.8 | 58.7 | 2 / 35 | 2717 |
| 10 | 5 | 55.2 | 56.2 | 6 / 35 | 2906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 20 | 25% |
| oog.melee.Capulet 1.2 | 19 | 21% |
| darkcanuck.B26354 1.06 | 16 | 38% |
| stelo.PastFuture 2.3.2 | 14 | 43% |
| intruder.PrairieWolf 2.61 | 6 | 100% |
| tripphippy.Alice 1.1 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 320 of 350 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 63 | 20% | 67 |
| oog.melee.Capulet 1.2 | 61 | 19% | 69 |
| stelo.PastFuture 2.3.2 | 59 | 18% | 66 |
| catcat20.Matcha 0.006 | 51 | 16% | 56 |
| ntc.Opposite 1.5 | 32 | 10% | 32 |
| fowl3628800.LightningBolt 2.6.0 | 27 | 8% | 27 |
| intruder.PrairieWolf 2.61 | 11 | 3% | 15 |
| tripphippy.Alice 1.1 | 11 | 3% | 13 |
| GarmBox.Anger 1.0 | 5 | 2% | 5 |

## Melee bench: F31

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.7 | 57.4 | 30 / 350 | 4.83 | 10.6% | 23104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.7% | 180 |
| gh.mini.Griezel 0.2 | 2.4 | 13.6% | 84 |
| spinnercat.micro.Tyger 0.1 | 3.1 | 12.5% | 30 |
| d414.nano.Quantum 1.0.0 | 3.8 | 11.6% | 15 |
| hadur117.nano.SanaroHT 0.2 | 5.0 | 10.6% | 30 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.4% | 9 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.9% | 2 |
| fm.mammillarias 1.3 | 7.8 | 6.7% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.2 | 52.1 | 5 / 35 | 2214 |
| 2 | 6 | 53.3 | 55.6 | 3 / 35 | 2227 |
| 3 | 5 | 53.6 | 58.7 | 2 / 35 | 2121 |
| 4 | 5 | 52.6 | 54.3 | 1 / 35 | 2384 |
| 5 | 6 | 50.3 | 51.7 | 0 / 35 | 2125 |
| 6 | 4 | 56.9 | 65.1 | 7 / 35 | 2333 |
| 7 | 5 | 54.6 | 58.1 | 3 / 35 | 2521 |
| 8 | 3 | 58.4 | 66.7 | 4 / 35 | 2757 |
| 9 | 5 | 55.6 | 62.9 | 3 / 35 | 2375 |
| 10 | 6 | 49.6 | 49.2 | 2 / 35 | 2047 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 42 | 36% |
| gh.mini.Griezel 0.2 | 32 | 34% |
| spinnercat.micro.Tyger 0.1 | 6 | 33% |
| d414.nano.Quantum 1.0.0 | 6 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 320 of 350 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 86 | 27% | 101 |
| gh.mini.Griezel 0.2 | 68 | 21% | 80 |
| spinnercat.micro.Tyger 0.1 | 58 | 18% | 60 |
| d414.nano.Quantum 1.0.0 | 46 | 14% | 47 |
| gh.nano.Grofvuil 0.2 | 27 | 8% | 27 |
| fm.mammillarias 1.3 | 14 | 4% | 14 |
| timmit.nano.TimDog 0.33 | 11 | 3% | 11 |
| Gecko.ultimateGeckoBot 1.0 | 7 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 3 |

## Melee bench: F32

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 73.9 | 129 / 350 | 3.35 | 14.3% | 31395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.1 | 15.4% | 104 |
| hadur117.nano.SanaroHT 0.2 | 2.0 | 14.3% | 129 |
| apc.botM 3.0 | 3.4 | 12.2% | 48 |
| vjik.UnViolation 1.1 | 4.4 | 10.8% | 28 |
| lxx.ConceptA 0.8 | 5.1 | 10.4% | 5 |
| bayen.UbaMicro 1.4 | 5.2 | 9.9% | 15 |
| panzer.Panzer 0.2 | 7.2 | 7.9% | 2 |
| yk.JahMicro 1.0 | 8.1 | 7.1% | 11 |
| conscience.Electron 1.3g | 8.9 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 9.6 | 5.5% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 70.5 | 13 / 35 | 3066 |
| 2 | 2 | 62.8 | 79.7 | 12 / 35 | 3175 |
| 3 | 2 | 61.2 | 74.6 | 14 / 35 | 2950 |
| 4 | 2 | 60.1 | 72.4 | 13 / 35 | 3024 |
| 5 | 2 | 62.0 | 76.2 | 16 / 35 | 3042 |
| 6 | 2 | 60.0 | 72.4 | 10 / 35 | 3264 |
| 7 | 1 | 61.4 | 75.6 | 11 / 35 | 3331 |
| 8 | 2 | 61.7 | 75.6 | 15 / 35 | 3068 |
| 9 | 2 | 64.2 | 81.0 | 17 / 35 | 3644 |
| 10 | 3 | 55.8 | 61.6 | 8 / 35 | 2831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 97 | 59% |
| apc.botM 3.0 | 33 | 79% |
| vjik.UnViolation 1.1 | 20 | 90% |
| lxx.ConceptA 0.8 | 19 | 84% |
| bayen.UbaMicro 1.4 | 8 | 38% |
| yk.JahMicro 1.0 | 8 | 50% |
| donjezza.Jezza 1.0 | 7 | 57% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 221 of 350 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 76 | 34% | 134 |
| lxx.ConceptA 0.8 | 41 | 19% | 52 |
| apc.botM 3.0 | 26 | 12% | 54 |
| vjik.UnViolation 1.1 | 24 | 11% | 44 |
| bayen.UbaMicro 1.4 | 23 | 10% | 27 |
| panzer.Panzer 0.2 | 10 | 5% | 10 |
| conscience.Electron 1.3g | 9 | 4% | 12 |
| yk.JahMicro 1.0 | 8 | 4% | 8 |
| donjezza.Jezza 1.0 | 4 | 2% | 9 |

## Melee bench: F33

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 73.5 | 80 / 350 | 3.38 | 14.6% | 35944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.1% | 136 |
| hadur117.nano.SanaroHT 0.2 | 2.2 | 14.6% | 80 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 13.1% | 46 |
| labg.Cataclysm 2.05 | 4.3 | 11.5% | 41 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.0% | 28 |
| baal.nano.N 1.42 | 6.2 | 9.1% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.1% | 14 |
| sanja.First 0.1 | 8.6 | 5.0% | 1 |
| zyx.micro.Ant 1.1 | 8.9 | 5.1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 72.1 | 9 / 35 | 3603 |
| 2 | 2 | 60.5 | 68.9 | 8 / 35 | 3215 |
| 3 | 3 | 60.0 | 67.3 | 6 / 35 | 3288 |
| 4 | 3 | 61.3 | 71.1 | 5 / 35 | 3743 |
| 5 | 2 | 61.8 | 70.5 | 9 / 35 | 3571 |
| 6 | 2 | 65.0 | 79.7 | 10 / 35 | 3766 |
| 7 | 2 | 64.0 | 76.5 | 7 / 35 | 4127 |
| 8 | 2 | 62.3 | 75.6 | 7 / 35 | 3339 |
| 9 | 2 | 61.8 | 72.1 | 8 / 35 | 3499 |
| 10 | 2 | 64.9 | 81.6 | 11 / 35 | 3793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 71 | 54% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 12% |
| labg.Cataclysm 2.05 | 29 | 48% |
| gre.svman4.Leonidas 1.3.2 | 18 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 14 | 71% |
| baal.nano.N 1.42 | 2 | 50% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 270 of 350 rounds, at a mean tick of 1094. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 105 | 39% | 151 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 62 | 23% | 71 |
| gre.svman4.Leonidas 1.3.2 | 35 | 13% | 45 |
| labg.Cataclysm 2.05 | 26 | 10% | 38 |
| kinsen.melee.Angsaichmophobia 1.8c | 19 | 7% | 20 |
| baal.nano.N 1.42 | 12 | 4% | 12 |
| zyx.micro.Ant 1.1 | 4 | 1% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 1% | 4 |
| sanja.First 0.1 | 3 | 1% | 4 |

## Melee bench: F34

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 73.1 | 72 / 350 | 3.42 | 13.9% | 33417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.4 | 17.7% | 134 |
| kid.Gladiator .7.2 | 1.6 | 16.9% | 97 |
| hadur117.nano.SanaroHT 0.2 | 3.1 | 13.9% | 72 |
| jcs.Seth 1.8 | 4.4 | 12.0% | 28 |
| tcf.Reach 3 | 4.9 | 11.3% | 14 |
| cli.Dancer 1.1 | 5.6 | 9.7% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.2 | 73.0 | 6 / 35 | 3202 |
| 2 | 3 | 63.5 | 75.6 | 6 / 35 | 3768 |
| 3 | 3 | 62.3 | 74.3 | 6 / 35 | 3370 |
| 4 | 3 | 63.2 | 74.9 | 8 / 35 | 3529 |
| 5 | 3 | 62.6 | 77.8 | 8 / 35 | 3206 |
| 6 | 3 | 62.1 | 71.4 | 9 / 35 | 3419 |
| 7 | 3 | 59.7 | 68.3 | 4 / 35 | 2806 |
| 8 | 3 | 60.3 | 66.7 | 5 / 35 | 3253 |
| 9 | 3 | 61.3 | 69.8 | 8 / 35 | 3226 |
| 10 | 3 | 64.7 | 79.4 | 12 / 35 | 3638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 62 | 65% |
| kid.Gladiator .7.2 | 43 | 26% |
| jcs.Seth 1.8 | 25 | 64% |
| tcf.Reach 3 | 12 | 33% |
| cli.Dancer 1.1 | 5 | 20% |

Hadur died in 278 of 350 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 103 | 37% | 107 |
| stelo.Spread 0.9 | 91 | 33% | 136 |
| jcs.Seth 1.8 | 27 | 10% | 45 |
| tcf.Reach 3 | 24 | 9% | 28 |
| cli.Dancer 1.1 | 16 | 6% | 17 |
| ratosh.Wesco 1.4 | 12 | 4% | 12 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 3 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |
| sample.RamFire 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 70.3 | 24 / 350 | 3.67 | 12.5% | 25775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 260 |
| gh.mini.Gruwel 0.9 | 2.3 | 13.5% | 44 |
| hadur117.nano.SanaroHT 0.2 | 3.6 | 12.5% | 24 |
| rz.HawkOnFire 0.1 | 4.0 | 12.0% | 5 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.1 | 11.8% | 15 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.0% | 1 |
| wit.Chuliath 1.0 | 6.5 | 7.2% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.0% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 74.9 | 2 / 35 | 2876 |
| 2 | 5 | 57.0 | 65.7 | 2 / 35 | 2346 |
| 3 | 4 | 57.5 | 67.0 | 1 / 35 | 2681 |
| 4 | 5 | 57.0 | 64.8 | 2 / 35 | 2349 |
| 5 | 4 | 59.5 | 69.5 | 3 / 35 | 2836 |
| 6 | 2 | 60.4 | 74.6 | 4 / 35 | 2651 |
| 7 | 3 | 59.4 | 74.0 | 1 / 35 | 2501 |
| 8 | 3 | 59.6 | 74.3 | 3 / 35 | 2449 |
| 9 | 4 | 57.4 | 69.5 | 1 / 35 | 2290 |
| 10 | 3 | 58.9 | 68.6 | 5 / 35 | 2796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 89 | 2% |
| gh.mini.Gruwel 0.9 | 34 | 41% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 43% |
| rz.HawkOnFire 0.1 | 4 | 75% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 326 of 350 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 154 | 47% | 157 |
| gh.mini.Gruwel 0.9 | 61 | 19% | 74 |
| rz.HawkOnFire 0.1 | 44 | 13% | 46 |
| dmh.robocode.robot.BlackDeath 9.2 | 38 | 12% | 40 |
| myl.nano.KomoriNinja 1.1 | 7 | 2% | 10 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 2% | 8 |
| wit.Chuliath 1.0 | 7 | 2% | 7 |
| stelo.MyAgileRobot 0.2 | 5 | 2% | 5 |
| dans.Cinnamon 1.2 | 3 | 1% | 3 |

## Melee bench: F36

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 73.3 | 128 / 350 | 3.41 | 14.8% | 34807 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHT 0.2 | 1.2 | 14.8% | 128 |
| bzdp.Pansy 2.1 | 2.5 | 12.6% | 58 |
| alpha.RainingFire 1.0 | 2.8 | 12.9% | 56 |
| mz.Cork 0.1 | 4.4 | 11.3% | 35 |
| bvh.micro.Freya 0.3 | 4.9 | 10.6% | 17 |
| bvh.mini.Fenrir 0.39 | 6.1 | 9.7% | 12 |
| m3thos.Eva02 0.7.1 | 6.2 | 10.0% | 25 |
| dl.BetterWalls 1.0 | 8.3 | 7.0% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.7% | 5 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.5% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 75.2 | 16 / 35 | 3490 |
| 2 | 1 | 62.4 | 74.0 | 14 / 35 | 3760 |
| 3 | 1 | 62.7 | 74.9 | 15 / 35 | 3504 |
| 4 | 1 | 62.9 | 74.9 | 17 / 35 | 3396 |
| 5 | 1 | 62.8 | 76.5 | 11 / 35 | 3413 |
| 6 | 1 | 63.7 | 77.5 | 16 / 35 | 3635 |
| 7 | 2 | 60.0 | 71.1 | 7 / 35 | 3400 |
| 8 | 1 | 61.2 | 71.7 | 13 / 35 | 3223 |
| 9 | 1 | 60.3 | 69.5 | 10 / 35 | 3614 |
| 10 | 2 | 59.9 | 67.3 | 9 / 35 | 3372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 51% |
| mz.Cork 0.1 | 32 | 75% |
| alpha.RainingFire 1.0 | 30 | 77% |
| bvh.micro.Freya 0.3 | 24 | 92% |
| bvh.mini.Fenrir 0.39 | 19 | 89% |
| m3thos.Eva02 0.7.1 | 15 | 67% |
| sample.MyFirstRobot 1.0 | 7 | 29% |
| squidM.TentalceMeleeNano 1.1 | 6 | 33% |
| dl.BetterWalls 1.0 | 4 | 75% |

Hadur died in 223 of 350 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 48 | 22% | 77 |
| alpha.RainingFire 1.0 | 40 | 18% | 59 |
| bvh.micro.Freya 0.3 | 27 | 12% | 40 |
| m3thos.Eva02 0.7.1 | 26 | 12% | 41 |
| mz.Cork 0.1 | 25 | 11% | 48 |
| bvh.mini.Fenrir 0.39 | 23 | 10% | 39 |
| squidM.TentalceMeleeNano 1.1 | 17 | 8% | 18 |
| dl.BetterWalls 1.0 | 9 | 4% | 16 |
| sample.MyFirstRobot 1.0 | 7 | 3% | 12 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 80.2 | 150 / 350 | 2.79 | 16.1% | 44328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHT 0.2 | 1.0 | 16.1% | 150 |
| germ.TheMind .2 | 2.8 | 11.1% | 44 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.9 | 10.2% | 20 |
| EBBU.Sim2 1.02 | 4.0 | 10.6% | 27 |
| stelo.UntouchableNano 1.3 | 5.5 | 9.5% | 33 |
| agrach.Dalek 1.0 | 5.6 | 9.6% | 25 |
| lmk.ACPFinal 0.1 | 7.2 | 8.6% | 14 |
| mb.Beast 0.1 | 7.5 | 8.7% | 25 |
| skm.Ryubot 1.0 | 8.6 | 7.9% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 8.9 | 7.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 73.7 | 11 / 35 | 4479 |
| 2 | 1 | 63.6 | 79.0 | 17 / 35 | 4398 |
| 3 | 1 | 63.6 | 81.6 | 17 / 35 | 4074 |
| 4 | 1 | 63.4 | 79.4 | 15 / 35 | 4682 |
| 5 | 1 | 62.7 | 80.0 | 16 / 35 | 3949 |
| 6 | 1 | 64.2 | 83.5 | 15 / 35 | 4427 |
| 7 | 1 | 67.1 | 90.2 | 20 / 35 | 4763 |
| 8 | 1 | 63.2 | 78.7 | 14 / 35 | 4627 |
| 9 | 1 | 63.7 | 82.2 | 14 / 35 | 4420 |
| 10 | 1 | 61.5 | 73.3 | 11 / 35 | 4509 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 38 | 61% |
| agrach.Dalek 1.0 | 33 | 76% |
| stelo.UntouchableNano 1.3 | 32 | 69% |
| EBBU.Sim2 1.02 | 32 | 53% |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 80% |
| mb.Beast 0.1 | 23 | 70% |
| lmk.ACPFinal 0.1 | 16 | 81% |
| skm.Ryubot 1.0 | 16 | 75% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 202 of 350 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 47 | 23% | 70 |
| EBBU.Sim2 1.02 | 33 | 16% | 44 |
| stelo.UntouchableNano 1.3 | 27 | 13% | 49 |
| lmk.ACPFinal 0.1 | 22 | 11% | 33 |
| agrach.Dalek 1.0 | 20 | 10% | 47 |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 10% | 47 |
| mb.Beast 0.1 | 17 | 8% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 5% | 12 |
| skm.Ryubot 1.0 | 6 | 3% | 15 |

## Melee bench: F38

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 63.9 | 44 / 350 | 4.25 | 11.9% | 28029 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.1% | 149 |
| bvh.mini.Freya 0.55 | 2.0 | 13.6% | 50 |
| hadur117.nano.SanaroHT 0.2 | 4.1 | 11.9% | 44 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.3% | 46 |
| cs.Wren 1.0 | 5.0 | 11.1% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.1 | 10.9% | 22 |
| kdf.KoulDestroyer 1.0 | 6.3 | 9.5% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.2% | 4 |
| matt.UnderDark3 2.4.34 | 9.1 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 9.6 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 53.0 | 56.2 | 3 / 35 | 2392 |
| 2 | 3 | 58.6 | 68.3 | 4 / 35 | 2841 |
| 3 | 7 | 52.7 | 54.9 | 2 / 35 | 2682 |
| 4 | 3 | 58.9 | 68.6 | 7 / 35 | 2683 |
| 5 | 3 | 56.9 | 62.9 | 6 / 35 | 2732 |
| 6 | 4 | 58.6 | 68.9 | 6 / 35 | 2774 |
| 7 | 3 | 58.8 | 66.0 | 5 / 35 | 3211 |
| 8 | 3 | 58.8 | 68.6 | 6 / 35 | 3126 |
| 9 | 6 | 54.9 | 58.7 | 1 / 35 | 2748 |
| 10 | 3 | 57.2 | 65.7 | 4 / 35 | 2840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 56 | 52% |
| bts.mega.Gnarly 1.4 | 22 | 18% |
| bvh.mini.Freya 0.55 | 13 | 23% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 8% |
| cs.Wren 1.0 | 9 | 44% |
| kdf.KoulDestroyer 1.0 | 5 | 40% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 96 | 31% | 124 |
| bvh.mini.Freya 0.55 | 48 | 16% | 51 |
| bts.mega.Gnarly 1.4 | 39 | 13% | 44 |
| cs.Wren 1.0 | 39 | 13% | 42 |
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 13% | 41 |
| kdf.KoulDestroyer 1.0 | 30 | 10% | 30 |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 2% | 8 |
| bzdp.BoxCar 2.0 | 6 | 2% | 6 |
| matt.UnderDark3 2.4.34 | 3 | 1% | 3 |

## Melee bench: F39

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 65.5 | 48 / 350 | 4.11 | 12.2% | 29358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.7% | 66 |
| az.Ololobot 0.2.4 | 1.8 | 14.3% | 137 |
| hadur117.nano.SanaroHT 0.2 | 3.2 | 12.2% | 48 |
| catcat20.Lambda 0.024 | 4.3 | 11.2% | 53 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.6% | 28 |
| apollokidd.ApolloKidd 0.9 | 6.4 | 8.6% | 6 |
| winamp32.micro.MicroMacro 1.0 | 6.6 | 8.5% | 7 |
| gimp.GimpBot 0.1 | 7.4 | 8.0% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.9 | 60.6 | 2 / 35 | 2980 |
| 2 | 3 | 58.9 | 69.8 | 6 / 35 | 3087 |
| 3 | 3 | 57.6 | 67.6 | 6 / 35 | 2786 |
| 4 | 3 | 57.1 | 65.1 | 9 / 35 | 2730 |
| 5 | 3 | 56.5 | 65.1 | 6 / 35 | 2762 |
| 6 | 3 | 54.8 | 61.9 | 3 / 35 | 2775 |
| 7 | 3 | 57.7 | 67.9 | 6 / 35 | 2782 |
| 8 | 3 | 56.5 | 61.0 | 7 / 35 | 3256 |
| 9 | 3 | 57.7 | 67.9 | 1 / 35 | 3062 |
| 10 | 4 | 57.5 | 67.6 | 2 / 35 | 3138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 51 | 12% |
| catcat20.Lambda 0.024 | 28 | 32% |
| bvh.fry.Freya 0.82 | 28 | 50% |
| stelo.SoRobotNanoMelee 1.2 | 11 | 45% |
| winamp32.micro.MicroMacro 1.0 | 8 | 75% |
| apollokidd.ApolloKidd 0.9 | 5 | 80% |
| gimp.GimpBot 0.1 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 303 of 350 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 92 | 30% | 102 |
| az.Ololobot 0.2.4 | 65 | 21% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 46 | 15% | 48 |
| catcat20.Lambda 0.024 | 37 | 12% | 48 |
| apollokidd.ApolloKidd 0.9 | 27 | 9% | 30 |
| gimp.GimpBot 0.1 | 16 | 5% | 20 |
| winamp32.micro.MicroMacro 1.0 | 8 | 3% | 15 |
| dcs.Eater_of_Worlds 1.1.3-A | 8 | 3% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 4 | 1% | 5 |

## Melee bench: F41

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 75.4 | 109 / 350 | 3.21 | 14.5% | 31413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 16.6% | 138 |
| hadur117.nano.SanaroHT 0.2 | 2.2 | 14.5% | 109 |
| ary.Swarm 1.1 | 3.3 | 13.4% | 23 |
| lessonz.robocode.Oz 0.5.0 | 3.4 | 13.2% | 40 |
| simonton.nano.MeleeSeed 1.8 | 5.1 | 11.4% | 28 |
| shrub.Silver v048 | 6.0 | 9.2% | 6 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 3 |
| jsal.Jsalbot 1.0 | 8.4 | 5.9% | 6 |
| stelo.Mirror 1.1 | 8.5 | 5.6% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 71.7 | 11 / 35 | 3188 |
| 2 | 2 | 62.8 | 75.6 | 14 / 35 | 3127 |
| 3 | 2 | 60.4 | 72.1 | 9 / 35 | 2737 |
| 4 | 1 | 65.0 | 82.9 | 13 / 35 | 3587 |
| 5 | 2 | 65.2 | 82.9 | 13 / 35 | 3436 |
| 6 | 4 | 59.1 | 66.3 | 7 / 35 | 2773 |
| 7 | 2 | 61.7 | 73.7 | 9 / 35 | 3137 |
| 8 | 2 | 61.8 | 74.0 | 9 / 35 | 3161 |
| 9 | 2 | 63.1 | 77.5 | 13 / 35 | 2920 |
| 10 | 2 | 63.3 | 77.5 | 11 / 35 | 3347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 90 | 42% |
| ary.Swarm 1.1 | 36 | 92% |
| lessonz.robocode.Oz 0.5.0 | 30 | 67% |
| simonton.nano.MeleeSeed 1.8 | 15 | 87% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| shrub.Silver v048 | 3 | 33% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 242 of 350 rounds, at a mean tick of 1079. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 86 | 36% | 128 |
| ary.Swarm 1.1 | 59 | 24% | 91 |
| lessonz.robocode.Oz 0.5.0 | 37 | 15% | 50 |
| simonton.nano.MeleeSeed 1.8 | 24 | 10% | 37 |
| zyx.nano.Ant 1.1 | 14 | 6% | 16 |
| shrub.Silver v048 | 10 | 4% | 11 |
| stelo.Mirror 1.1 | 6 | 2% | 8 |
| jsal.Jsalbot 1.0 | 4 | 2% | 8 |
| acogdev.alpha 0.2 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 75.0 | 89 / 350 | 3.25 | 14.5% | 35677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.2% | 151 |
| ara.Shera 0.88 | 2.8 | 14.4% | 60 |
| hadur117.nano.SanaroHT 0.2 | 3.0 | 14.5% | 89 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.8% | 43 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 1 |
| maribo.IotaCT 1.1 | 6.6 | 7.1% | 0 |
| dsw.StaticD 1.0 | 7.0 | 7.0% | 6 |
| stelo.MirrorMicro 1.0 | 8.3 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.2 | 69.2 | 9 / 35 | 3203 |
| 2 | 2 | 65.5 | 81.9 | 14 / 35 | 4145 |
| 3 | 4 | 59.8 | 69.8 | 7 / 35 | 3053 |
| 4 | 2 | 61.8 | 72.4 | 12 / 35 | 3644 |
| 5 | 3 | 63.1 | 76.5 | 9 / 35 | 3859 |
| 6 | 3 | 61.0 | 74.0 | 4 / 35 | 3603 |
| 7 | 2 | 64.2 | 82.9 | 10 / 35 | 3653 |
| 8 | 4 | 61.3 | 71.1 | 7 / 35 | 3623 |
| 9 | 4 | 58.2 | 69.2 | 5 / 35 | 2931 |
| 10 | 2 | 65.0 | 83.2 | 12 / 35 | 3963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 82 | 48% |
| ara.Shera 0.88 | 41 | 61% |
| maribo.mini.MiniQuester 0.1 | 27 | 70% |
| dsw.StaticD 1.0 | 5 | 80% |
| amz.NanoClone 1.41 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 261 of 350 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 94 | 36% | 133 |
| ara.Shera 0.88 | 74 | 28% | 97 |
| maribo.mini.MiniQuester 0.1 | 56 | 21% | 77 |
| amz.NanoClone 1.41 | 16 | 6% | 17 |
| stelo.MirrorMicro 1.0 | 8 | 3% | 8 |
| maribo.IotaCT 1.1 | 8 | 3% | 8 |
| dsw.StaticD 1.0 | 4 | 2% | 7 |
| mme.NikeEnhanced 2.0 | 1 | 0% | 3 |

## Melee bench: F43

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 64.7 | 26 / 350 | 4.18 | 12.0% | 27891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 275 |
| brainfade.melee.Dusk 0.44 | 2.5 | 13.0% | 32 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.3% | 8 |
| hadur117.nano.SanaroHT 0.2 | 3.7 | 12.0% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 5.1 | 10.8% | 8 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.0% | 3 |
| mz.NanoGod 2.02 | 7.3 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.6% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 65.4 | 3 / 35 | 2680 |
| 2 | 5 | 57.8 | 62.9 | 3 / 35 | 2652 |
| 3 | 4 | 57.5 | 60.3 | 1 / 35 | 2891 |
| 4 | 4 | 57.7 | 62.9 | 1 / 35 | 2567 |
| 5 | 3 | 60.9 | 68.6 | 4 / 35 | 2963 |
| 6 | 3 | 60.6 | 69.5 | 2 / 35 | 2991 |
| 7 | 3 | 60.7 | 68.3 | 4 / 35 | 2942 |
| 8 | 4 | 58.2 | 61.0 | 2 / 35 | 2930 |
| 9 | 4 | 57.5 | 63.5 | 3 / 35 | 2270 |
| 10 | 4 | 59.5 | 64.8 | 3 / 35 | 3005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 74 | 20% |
| brainfade.melee.Dusk 0.44 | 11 | 55% |
| Krabb.akim2.Akim2 1.1b | 4 | 50% |
| dummy.micro.Sparrow 2.5 | 3 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 0% |

Hadur died in 324 of 350 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 157 | 48% | 168 |
| brainfade.melee.Dusk 0.44 | 49 | 15% | 59 |
| wcsv.melee.EngineerMelee 0.1 | 35 | 11% | 35 |
| dummy.micro.Sparrow 2.5 | 34 | 10% | 37 |
| Krabb.akim2.Akim2 1.1b | 22 | 7% | 24 |
| jab.DiamondStealer 5 | 14 | 4% | 14 |
| mz.NanoGod 2.02 | 11 | 3% | 11 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 71.8 | 86 / 350 | 3.53 | 14.1% | 34565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 16.7% | 130 |
| tzu.TheArtOfWar 1.2 | 2.0 | 15.2% | 89 |
| hadur117.nano.SanaroHT 0.2 | 2.9 | 14.1% | 86 |
| wompi.Quokka 1.6 | 4.6 | 10.6% | 13 |
| jwirde.Gort 2.0 | 4.7 | 10.3% | 23 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 9.3% | 3 |
| stf.PanzerGeneral 0.1 | 7.4 | 7.2% | 2 |
| disan.Chair 2.2.0 | 7.5 | 7.5% | 3 |
| sample.Crazy 1.0 | 9.2 | 4.7% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.6 | 63.5 | 6 / 35 | 3029 |
| 2 | 3 | 60.5 | 69.8 | 6 / 35 | 3629 |
| 3 | 3 | 59.8 | 68.9 | 4 / 35 | 3328 |
| 4 | 3 | 60.3 | 71.1 | 7 / 35 | 3167 |
| 5 | 3 | 62.9 | 74.9 | 8 / 35 | 3857 |
| 6 | 3 | 62.6 | 73.3 | 10 / 35 | 3692 |
| 7 | 2 | 64.2 | 80.0 | 11 / 35 | 3614 |
| 8 | 3 | 62.0 | 70.8 | 11 / 35 | 3632 |
| 9 | 3 | 61.5 | 72.7 | 10 / 35 | 3458 |
| 10 | 3 | 62.3 | 73.3 | 13 / 35 | 3159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 85 | 61% |
| tzu.TheArtOfWar 1.2 | 52 | 29% |
| jwirde.Gort 2.0 | 15 | 40% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 88% |
| wompi.Quokka 1.6 | 7 | 71% |
| sample.Crazy 1.0 | 2 | 0% |
| stf.PanzerGeneral 0.1 | 1 | 0% |

Hadur died in 264 of 350 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 94 | 36% | 151 |
| tzu.TheArtOfWar 1.2 | 86 | 33% | 99 |
| jwirde.Gort 2.0 | 24 | 9% | 30 |
| wompi.Quokka 1.6 | 20 | 8% | 24 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 18 | 7% | 19 |
| disan.Chair 2.2.0 | 9 | 3% | 11 |
| stf.PanzerGeneral 0.1 | 8 | 3% | 8 |
| sample.Crazy 1.0 | 3 | 1% | 4 |
| amk.jointstrike.JointStrike 0.2 | 2 | 1% | 4 |

## Melee bench: F45

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 70.5 | 71 / 350 | 3.65 | 14.3% | 36835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHT 0.2 | 1.4 | 14.3% | 71 |
| eem.IWillFireNoBullet v2.8 | 1.8 | 13.6% | 188 |
| jje.BagPuss 1.2 | 3.1 | 12.7% | 24 |
| sul.Lunar 1.1 | 4.0 | 11.4% | 35 |
| myl.nano.Graviton 1.10 | 5.6 | 10.0% | 6 |
| hvilela.HVilela 0.9 | 5.9 | 9.2% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.2% | 6 |
| fm.claire 1.7 | 7.4 | 8.5% | 1 |
| wit.Deep7 2.0 | 8.9 | 6.7% | 14 |
| abud.ThirdRobo 1.0 | 9.7 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 75.2 | 10 / 35 | 3645 |
| 2 | 1 | 62.2 | 74.3 | 10 / 35 | 3678 |
| 3 | 1 | 61.3 | 69.5 | 6 / 35 | 4201 |
| 4 | 2 | 58.9 | 65.7 | 7 / 35 | 3292 |
| 5 | 2 | 60.1 | 67.6 | 6 / 35 | 3676 |
| 6 | 2 | 57.8 | 62.5 | 5 / 35 | 3583 |
| 7 | 1 | 58.6 | 67.3 | 4 / 35 | 3472 |
| 8 | 2 | 60.1 | 71.4 | 3 / 35 | 3444 |
| 9 | 1 | 62.2 | 74.3 | 8 / 35 | 3753 |
| 10 | 1 | 64.1 | 77.1 | 12 / 35 | 4091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 105 | 45% |
| jje.BagPuss 1.2 | 19 | 47% |
| sul.Lunar 1.1 | 13 | 0% |
| wit.Deep7 2.0 | 8 | 38% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 86% |
| myl.nano.Graviton 1.10 | 5 | 100% |
| fm.claire 1.7 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 0% |

Hadur died in 279 of 350 rounds, at a mean tick of 1196. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 67 | 24% | 0 |
| jje.BagPuss 1.2 | 63 | 23% | 110 |
| sul.Lunar 1.1 | 38 | 14% | 64 |
| myl.nano.Graviton 1.10 | 31 | 11% | 60 |
| hvilela.HVilela 0.9 | 22 | 8% | 28 |
| fm.claire 1.7 | 19 | 7% | 22 |
| wit.Deep7 2.0 | 17 | 6% | 27 |
| pez.mini.ChironexFleckeri 0.5 | 16 | 6% | 24 |
| abud.ThirdRobo 1.0 | 6 | 2% | 12 |

## Melee bench: F46

hadur117.nano.SanaroHT 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 71.8 | 61 / 350 | 3.53 | 13.0% | 27659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.4 | 17.9% | 137 |
| rsalesc.melee.Medina 0.4.5 | 1.6 | 16.8% | 128 |
| hadur117.nano.SanaroHT 0.2 | 3.0 | 13.0% | 61 |
| cx.Princess 1.0 | 4.7 | 10.5% | 19 |
| mz.MicroSheep 1.0 | 4.9 | 10.4% | 5 |
| sadoner.killer 0.2 | 5.5 | 9.5% | 1 |
| arthord.NanoSatanMelee Beta | 6.9 | 7.6% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.1 | 5.8% | 1 |
| kurios.DOSexe .9a | 9.1 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 75.9 | 7 / 35 | 2609 |
| 2 | 3 | 59.7 | 71.4 | 6 / 35 | 2866 |
| 3 | 3 | 58.9 | 68.9 | 10 / 35 | 2608 |
| 4 | 3 | 59.2 | 72.4 | 4 / 35 | 2537 |
| 5 | 3 | 59.0 | 68.9 | 5 / 35 | 2907 |
| 6 | 3 | 60.9 | 76.2 | 6 / 35 | 2992 |
| 7 | 3 | 58.2 | 66.7 | 4 / 35 | 2708 |
| 8 | 3 | 60.1 | 72.4 | 10 / 35 | 2595 |
| 9 | 3 | 60.1 | 71.1 | 5 / 35 | 2734 |
| 10 | 3 | 61.4 | 74.6 | 4 / 35 | 3103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 87 | 46% |
| rsalesc.melee.Medina 0.4.5 | 43 | 23% |
| cx.Princess 1.0 | 11 | 64% |
| mz.MicroSheep 1.0 | 6 | 33% |
| arthord.NanoSatanMelee Beta | 1 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 125 | 43% | 170 |
| rsalesc.melee.Medina 0.4.5 | 87 | 30% | 92 |
| cx.Princess 1.0 | 24 | 8% | 29 |
| mz.MicroSheep 1.0 | 19 | 6% | 20 |
| sadoner.killer 0.2 | 14 | 5% | 15 |
| arthord.NanoSatanMelee Beta | 11 | 4% | 11 |
| kurios.DOSexe .9a | 5 | 2% | 4 |
| jeremyreeder.collective.Prophet 5 | 4 | 1% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 2 |
3 death(s) with no robot to name.

