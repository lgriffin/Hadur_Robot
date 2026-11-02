# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 79.5 | 79 / 350 | 2.85 | 14.7% | 34890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 212 |
| hadur117.nano.SanaroS3 0.3 | 2.0 | 14.7% | 79 |
| mz.MicroGodMelee 1 | 4.0 | 11.2% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.4% | 10 |
| sgp.JollyNinja 3.53 | 4.3 | 10.9% | 20 |
| lorneswork.Predator 1.0 | 5.5 | 10.2% | 12 |
| adt.Ar2 1.0 | 7.1 | 7.6% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 7.9 | 5.8% | 3 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 82.5 | 12 / 35 | 3562 |
| 2 | 2 | 63.2 | 77.1 | 10 / 35 | 3801 |
| 3 | 2 | 62.8 | 75.6 | 6 / 35 | 3865 |
| 4 | 2 | 64.9 | 85.1 | 10 / 35 | 3518 |
| 5 | 2 | 62.9 | 80.0 | 6 / 35 | 3654 |
| 6 | 2 | 62.5 | 81.6 | 6 / 35 | 2983 |
| 7 | 2 | 60.1 | 73.0 | 5 / 35 | 3159 |
| 8 | 2 | 62.2 | 75.9 | 6 / 35 | 3745 |
| 9 | 2 | 64.0 | 83.5 | 8 / 35 | 3524 |
| 10 | 2 | 63.0 | 80.3 | 10 / 35 | 3079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 157 | 21% |
| mz.MicroGodMelee 1 | 23 | 83% |
| sgp.JollyNinja 3.53 | 23 | 65% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 64% |
| lorneswork.Predator 1.0 | 8 | 50% |
| adt.Ar2 1.0 | 2 | 50% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |

Hadur died in 271 of 350 rounds, at a mean tick of 1086. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 148 | 55% | 185 |
| sgp.JollyNinja 3.53 | 35 | 13% | 46 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 8% | 28 |
| mz.MicroGodMelee 1 | 21 | 8% | 40 |
| lorneswork.Predator 1.0 | 21 | 8% | 26 |
| adt.Ar2 1.0 | 15 | 6% | 17 |
| kawigi.sbf.FloodSonnet 0.9 | 7 | 3% | 7 |
| skm.butterfly 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 71.0 | 76 / 350 | 3.61 | 14.0% | 35796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.6 | 15.2% | 88 |
| pulsar.PulsarMax 0.8.9 | 1.8 | 15.1% | 100 |
| hadur117.nano.SanaroS3 0.3 | 2.6 | 14.0% | 76 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 11.5% | 7 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.9 | 10.0% | 28 |
| sch.Simone 0.3d | 6.5 | 8.1% | 27 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.9% | 5 |
| Noran.BitchingElk 0.054 | 7.8 | 7.3% | 13 |
| stelo.PatternRobot 1.0 | 8.4 | 6.5% | 5 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 69.2 | 7 / 35 | 3328 |
| 2 | 3 | 62.6 | 75.6 | 10 / 35 | 3667 |
| 3 | 3 | 60.8 | 70.2 | 8 / 35 | 3485 |
| 4 | 1 | 62.3 | 74.3 | 10 / 35 | 3922 |
| 5 | 3 | 60.2 | 67.6 | 8 / 35 | 3522 |
| 6 | 3 | 57.6 | 62.2 | 8 / 35 | 3346 |
| 7 | 3 | 61.3 | 72.4 | 6 / 35 | 3731 |
| 8 | 3 | 57.8 | 65.7 | 5 / 35 | 3146 |
| 9 | 1 | 62.5 | 75.9 | 7 / 35 | 3894 |
| 10 | 3 | 62.8 | 77.5 | 7 / 35 | 3755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 60 | 30% |
| pulsar.PulsarMax 0.8.9 | 53 | 47% |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 85% |
| sch.Simone 0.3d | 13 | 8% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| Noran.BitchingElk 0.054 | 4 | 0% |
| fullsail.SweetTea 1.1 | 2 | 0% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |
| stelo.PatternRobot 1.0 | 2 | 50% |

Hadur died in 277 of 350 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 80 | 29% | 100 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 72 | 26% | 95 |
| sch.Simone 0.3d | 31 | 11% | 38 |
| lrem.micro.SpikeSoldier 0.4 | 27 | 10% | 31 |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 8% | 35 |
| stelo.PatternRobot 1.0 | 15 | 5% | 17 |
| fnc.bandit.Bandit 5.2.0 | 14 | 5% | 15 |
| Noran.BitchingElk 0.054 | 8 | 3% | 10 |
| fullsail.SweetTea 1.1 | 8 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 79.8 | 82 / 350 | 2.82 | 15.0% | 38650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.8 | 15.0% | 91 |
| hadur117.nano.SanaroS3 0.3 | 2.0 | 15.0% | 82 |
| kawigi.nano.Lib 1.0 | 2.4 | 14.7% | 85 |
| vuen.Cake 2.51 | 3.8 | 13.3% | 67 |
| urdos.URDOS 1.3 | 5.0 | 10.7% | 18 |
| adt.Ar1 2.1 | 6.1 | 7.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.9% | 4 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.5% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 79.4 | 9 / 35 | 3696 |
| 2 | 3 | 62.9 | 79.7 | 8 / 35 | 3740 |
| 3 | 1 | 64.7 | 82.9 | 11 / 35 | 4434 |
| 4 | 1 | 64.1 | 82.9 | 6 / 35 | 4323 |
| 5 | 1 | 63.4 | 79.0 | 8 / 35 | 4371 |
| 6 | 3 | 62.9 | 81.0 | 8 / 35 | 3786 |
| 7 | 1 | 62.8 | 80.3 | 12 / 35 | 3559 |
| 8 | 2 | 63.4 | 82.2 | 7 / 35 | 3981 |
| 9 | 3 | 59.3 | 72.4 | 5 / 35 | 3316 |
| 10 | 3 | 61.6 | 78.1 | 8 / 35 | 3444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 64 | 47% |
| vuen.Cake 2.51 | 57 | 54% |
| kawigi.nano.Lib 1.0 | 54 | 9% |
| urdos.URDOS 1.3 | 18 | 61% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 0% |

Hadur died in 268 of 350 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 95 | 35% | 103 |
| radnor.DoctorBob 1.42 | 61 | 23% | 81 |
| urdos.URDOS 1.3 | 44 | 16% | 54 |
| vuen.Cake 2.51 | 41 | 15% | 74 |
| adt.Ar1 2.1 | 12 | 4% | 13 |
| ghent.ArthurPanzergon 1.0.0 | 7 | 3% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 1% | 3 |
| oa.weak.FlyMk1 0.1 | 3 | 1% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% | 4 |

## Melee bench: F04

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 76.6 | 16 / 350 | 3.10 | 14.5% | 42566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.2% | 316 |
| hadur117.nano.SanaroS3 0.3 | 2.2 | 14.5% | 16 |
| apc.LeeroyJenkins2 1.0 | 2.8 | 13.7% | 8 |
| TNT.TNT 0.99.1 | 4.2 | 10.6% | 8 |
| josago.Jorgito 0.16 | 4.9 | 9.4% | 2 |
| css.Delitioner 0.11 | 6.4 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.1 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 76.5 | 3 / 35 | 4368 |
| 2 | 2 | 64.3 | 81.0 | 2 / 35 | 4121 |
| 3 | 2 | 63.0 | 74.6 | 1 / 35 | 4354 |
| 4 | 3 | 60.8 | 69.2 | 0 / 35 | 3891 |
| 5 | 2 | 63.4 | 78.1 | 1 / 35 | 4021 |
| 6 | 3 | 63.2 | 74.9 | 0 / 35 | 4215 |
| 7 | 2 | 64.6 | 80.3 | 2 / 35 | 4374 |
| 8 | 2 | 64.3 | 76.5 | 3 / 35 | 4671 |
| 9 | 2 | 64.3 | 79.0 | 4 / 35 | 4371 |
| 10 | 2 | 63.4 | 76.2 | 0 / 35 | 4180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 178 | 3% |
| apc.LeeroyJenkins2 1.0 | 6 | 67% |
| TNT.TNT 0.99.1 | 6 | 50% |
| josago.Jorgito 0.16 | 2 | 50% |
| rampancy.Durandal 2.1d | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 334 of 350 rounds, at a mean tick of 1290. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 234 | 70% | 238 |
| apc.LeeroyJenkins2 1.0 | 43 | 13% | 49 |
| josago.Jorgito 0.16 | 31 | 9% | 32 |
| TNT.TNT 0.99.1 | 13 | 4% | 16 |
| css.Delitioner 0.11 | 5 | 1% | 5 |
| rampancy.Durandal 2.1d | 4 | 1% | 5 |
| tj.zombie1n 1.0.1 | 3 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 2 |

## Melee bench: F06

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 75.7 | 110 / 350 | 3.19 | 14.7% | 33540 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.6 | 15.2% | 67 |
| hadur117.nano.SanaroS3 0.3 | 2.1 | 14.7% | 110 |
| origin.SleepSiphon 1.7b | 2.5 | 14.3% | 100 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 12.0% | 40 |
| mld.Wisdom 1.0 | 5.1 | 10.4% | 6 |
| gg.Wolverine 2.0 | 6.2 | 8.7% | 8 |
| spinnercat.Omen 1.0 | 7.4 | 7.6% | 5 |
| DBall.NUKE 0.1 | 7.5 | 7.6% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 8.7 | 6.4% | 8 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 81.3 | 10 / 35 | 3490 |
| 2 | 2 | 62.2 | 74.3 | 9 / 35 | 3711 |
| 3 | 3 | 60.5 | 71.1 | 10 / 35 | 3293 |
| 4 | 1 | 64.5 | 82.2 | 16 / 35 | 3454 |
| 5 | 3 | 60.4 | 71.1 | 8 / 35 | 3162 |
| 6 | 3 | 60.9 | 70.8 | 6 / 35 | 3548 |
| 7 | 2 | 63.5 | 78.4 | 14 / 35 | 3420 |
| 8 | 2 | 61.6 | 74.0 | 11 / 35 | 3075 |
| 9 | 2 | 60.9 | 69.8 | 13 / 35 | 3279 |
| 10 | 2 | 64.1 | 83.5 | 13 / 35 | 3108 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 56 | 46% |
| jekl.StoneGhost 0.7 | 49 | 59% |
| pe.minimelee.SandboxMiniMelee 1.1 | 33 | 67% |
| DBall.NUKE 0.1 | 13 | 77% |
| mld.Wisdom 1.0 | 8 | 100% |
| gg.Wolverine 2.0 | 8 | 63% |
| spinnercat.Omen 1.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 100% |

Hadur died in 240 of 350 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 77 | 32% | 104 |
| origin.SleepSiphon 1.7b | 75 | 31% | 104 |
| pe.minimelee.SandboxMiniMelee 1.1 | 40 | 17% | 62 |
| mld.Wisdom 1.0 | 19 | 8% | 26 |
| spinnercat.Omen 1.0 | 8 | 3% | 11 |
| DBall.NUKE 0.1 | 7 | 3% | 20 |
| gg.Wolverine 2.0 | 7 | 3% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 2% | 8 |
| sample.Fire 1.0 | 2 | 1% | 2 |

## Melee bench: F07

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.2 | 111 / 350 | 2.33 | 16.8% | 45424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.6 | 17.6% | 85 |
| rsalesc.melee.Monk 0.3.6c | 2.1 | 17.1% | 78 |
| hadur117.nano.SanaroS3 0.3 | 2.3 | 16.8% | 111 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.7% | 24 |
| franzor.Lizt 1.3.1 | 4.5 | 11.4% | 53 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.8% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.5 | 84.4 | 10 / 35 | 4764 |
| 2 | 3 | 66.5 | 83.5 | 9 / 35 | 4265 |
| 3 | 2 | 68.5 | 85.7 | 12 / 35 | 5142 |
| 4 | 2 | 67.7 | 85.4 | 15 / 35 | 4490 |
| 5 | 2 | 67.3 | 84.1 | 11 / 35 | 4578 |
| 6 | 2 | 66.6 | 85.1 | 9 / 35 | 4272 |
| 7 | 2 | 67.9 | 87.0 | 15 / 35 | 4266 |
| 8 | 1 | 68.3 | 87.9 | 12 / 35 | 4677 |
| 9 | 3 | 66.9 | 84.4 | 10 / 35 | 4541 |
| 10 | 3 | 66.7 | 84.4 | 8 / 35 | 4429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 120 | 61% |
| rsalesc.melee.Monk 0.3.6c | 51 | 18% |
| franzor.Lizt 1.3.1 | 35 | 26% |
| oog.melee.CapuletDroid 1.1 | 30 | 53% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 240 of 350 rounds, at a mean tick of 1522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 104 | 43% | 199 |
| rsalesc.melee.Monk 0.3.6c | 69 | 29% | 88 |
| franzor.Lizt 1.3.1 | 30 | 13% | 1 |
| oog.melee.CapuletDroid 1.1 | 26 | 11% | 50 |
| exauge.GateKeeper 1.1.121g | 7 | 3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 72.7 | 100 / 350 | 3.46 | 14.1% | 32508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.7 | 14.4% | 89 |
| hadur117.nano.SanaroS3 0.3 | 1.7 | 14.1% | 100 |
| shrub.Vapour v159 | 2.7 | 13.3% | 82 |
| Krabb.sliNk.Garm 0.9u | 4.6 | 10.3% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 5.7 | 9.2% | 24 |
| m3thos.Eva00 1.1 | 5.8 | 9.1% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.6% | 15 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 7.3% | 4 |
| SHAM.WOW 1.4 | 8.4 | 7.2% | 8 |
| zyx.nano.BacillusComma 1.0 | 9.6 | 6.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.8 | 69.5 | 10 / 35 | 3086 |
| 2 | 1 | 61.7 | 75.2 | 12 / 35 | 3410 |
| 3 | 2 | 60.4 | 72.1 | 11 / 35 | 3294 |
| 4 | 1 | 63.2 | 79.4 | 11 / 35 | 3583 |
| 5 | 2 | 60.8 | 74.6 | 7 / 35 | 3481 |
| 6 | 1 | 61.2 | 75.6 | 11 / 35 | 3099 |
| 7 | 2 | 59.3 | 70.8 | 8 / 35 | 2985 |
| 8 | 3 | 57.1 | 66.0 | 8 / 35 | 2838 |
| 9 | 2 | 59.0 | 68.6 | 11 / 35 | 3119 |
| 10 | 1 | 62.0 | 75.2 | 11 / 35 | 3613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 67 | 60% |
| shrub.Vapour v159 | 36 | 31% |
| Krabb.sliNk.Garm 0.9u | 21 | 86% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 64% |
| com.spp.robocode.MostlyHarmless 010 | 13 | 62% |
| m3thos.Eva00 1.1 | 10 | 60% |
| SHAM.WOW 1.4 | 9 | 67% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 253 of 350 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 65 | 26% | 113 |
| shrub.Vapour v159 | 62 | 25% | 73 |
| com.spp.robocode.MostlyHarmless 010 | 33 | 13% | 41 |
| Krabb.sliNk.Garm 0.9u | 31 | 12% | 39 |
| m3thos.Eva00 1.1 | 19 | 8% | 27 |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 6% | 25 |
| SHAM.WOW 1.4 | 11 | 4% | 16 |
| zyx.nano.BacillusComma 1.0 | 11 | 4% | 12 |
| qualidafial.MajorDick 1.0.1 | 3 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 62.9 | 44 / 350 | 4.34 | 11.9% | 26720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.7% | 187 |
| kc.micro.Figment 1.0 | 2.0 | 14.7% | 66 |
| hadur117.nano.SanaroS3 0.3 | 3.7 | 11.9% | 44 |
| yagami.Tidus 0.11 | 4.3 | 11.2% | 3 |
| pedersen.Grishnakh 1.0 | 4.3 | 11.1% | 30 |
| mc2.enemy.Original 0.9 | 5.8 | 9.7% | 12 |
| dft.Calliope 5.6 | 6.9 | 7.8% | 7 |
| step.nanoPri 1.0 | 8.6 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.9 | 5.3% | 1 |
| rdm.Dueler 0.4x | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.9 | 61.6 | 3 / 35 | 2474 |
| 2 | 4 | 58.0 | 62.5 | 6 / 35 | 2899 |
| 3 | 4 | 56.8 | 63.8 | 4 / 35 | 2569 |
| 4 | 5 | 54.9 | 61.3 | 3 / 35 | 2422 |
| 5 | 3 | 58.5 | 67.9 | 8 / 35 | 2684 |
| 6 | 3 | 60.7 | 72.1 | 6 / 35 | 3153 |
| 7 | 3 | 55.5 | 58.7 | 3 / 35 | 2825 |
| 8 | 5 | 53.9 | 55.9 | 2 / 35 | 2466 |
| 9 | 3 | 57.4 | 65.7 | 5 / 35 | 2562 |
| 10 | 4 | 56.0 | 59.7 | 4 / 35 | 2666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 59 | 22% |
| kc.micro.Figment 1.0 | 39 | 41% |
| yagami.Tidus 0.11 | 7 | 100% |
| pedersen.Grishnakh 1.0 | 5 | 60% |
| mc2.enemy.Original 0.9 | 4 | 100% |
| dft.Calliope 5.6 | 3 | 33% |

Hadur died in 306 of 350 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 93 | 30% | 106 |
| kc.micro.Figment 1.0 | 73 | 24% | 89 |
| yagami.Tidus 0.11 | 48 | 16% | 54 |
| pedersen.Grishnakh 1.0 | 30 | 10% | 34 |
| mc2.enemy.Original 0.9 | 25 | 8% | 29 |
| robar.nano.Assertive_Melee 0.2 | 17 | 6% | 17 |
| step.nanoPri 1.0 | 8 | 3% | 8 |
| dft.Calliope 5.6 | 6 | 2% | 7 |
| rdm.Dueler 0.4x | 6 | 2% | 6 |

## Melee bench: F10

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 84.3 | 131 / 350 | 2.41 | 16.2% | 39451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.2 | 16.2% | 131 |
| DTF.Kludgy 1.2b | 2.1 | 14.9% | 84 |
| ejb.Polaris 1.0.1 | 3.1 | 13.4% | 41 |
| ne.Chimera 1.2 | 3.7 | 12.6% | 27 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.9% | 42 |
| vStar.RAFzilla 2.15 | 5.7 | 10.4% | 11 |
| sam.Samspin 1.0 | 7.7 | 5.8% | 4 |
| kurios.DOSexe .9b | 8.3 | 5.5% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.7% | 1 |
| donjezza.Muncho 1.0 | 9.7 | 4.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 88.6 | 15 / 35 | 3921 |
| 2 | 2 | 63.7 | 82.5 | 10 / 35 | 3827 |
| 3 | 1 | 65.2 | 86.3 | 14 / 35 | 3776 |
| 4 | 1 | 64.7 | 84.8 | 11 / 35 | 3994 |
| 5 | 1 | 65.2 | 82.9 | 16 / 35 | 4077 |
| 6 | 1 | 63.9 | 83.2 | 10 / 35 | 3655 |
| 7 | 1 | 65.0 | 83.2 | 13 / 35 | 4296 |
| 8 | 1 | 65.4 | 83.2 | 17 / 35 | 4038 |
| 9 | 1 | 65.0 | 82.5 | 13 / 35 | 4179 |
| 10 | 2 | 64.9 | 86.0 | 12 / 35 | 3688 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 77 | 43% |
| ejb.Polaris 1.0.1 | 55 | 84% |
| tvv.micro.Antares 1.1.1 | 29 | 31% |
| ne.Chimera 1.2 | 28 | 71% |
| vStar.RAFzilla 2.15 | 22 | 77% |
| kurios.DOSexe .9b | 5 | 60% |
| donjezza.Muncho 1.0 | 5 | 40% |
| sam.Samspin 1.0 | 3 | 0% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 50% |

Hadur died in 219 of 350 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 85 | 39% | 120 |
| ne.Chimera 1.2 | 50 | 23% | 66 |
| tvv.micro.Antares 1.1.1 | 29 | 13% | 31 |
| ejb.Polaris 1.0.1 | 24 | 11% | 78 |
| vStar.RAFzilla 2.15 | 15 | 7% | 31 |
| sam.Samspin 1.0 | 7 | 3% | 8 |
| donjezza.Muncho 1.0 | 4 | 2% | 6 |
| kurios.DOSexe .9b | 3 | 1% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 1% | 2 |

## Melee bench: F11

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 68.2 | 64 / 350 | 3.86 | 13.1% | 30726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.3% | 145 |
| hadur117.nano.SanaroS3 0.3 | 2.5 | 13.1% | 64 |
| cx.mini.Nimrod 0.55 | 3.1 | 12.2% | 39 |
| djc.DynaBot 0.1.1 | 3.9 | 11.3% | 19 |
| br2.MobyDickBot 1.6 | 5.3 | 9.6% | 19 |
| rdt199.Warlord 0.73 | 5.8 | 9.5% | 28 |
| uji.YellohFellah 1.0 | 6.5 | 9.1% | 36 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.2% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 73.7 | 12 / 35 | 3773 |
| 2 | 2 | 58.9 | 67.0 | 8 / 35 | 3214 |
| 3 | 3 | 57.0 | 63.8 | 6 / 35 | 2780 |
| 4 | 2 | 59.9 | 73.3 | 7 / 35 | 2759 |
| 5 | 2 | 60.5 | 72.1 | 7 / 35 | 3050 |
| 6 | 2 | 59.4 | 71.4 | 6 / 35 | 3090 |
| 7 | 4 | 56.3 | 61.3 | 3 / 35 | 3115 |
| 8 | 3 | 57.1 | 61.9 | 4 / 35 | 3028 |
| 9 | 3 | 56.1 | 62.2 | 6 / 35 | 2665 |
| 10 | 2 | 60.8 | 75.2 | 5 / 35 | 3252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 72 | 33% |
| cx.mini.Nimrod 0.55 | 19 | 58% |
| uji.YellohFellah 1.0 | 18 | 33% |
| djc.DynaBot 0.1.1 | 12 | 83% |
| rdt199.Warlord 0.73 | 10 | 70% |
| br2.MobyDickBot 1.6 | 8 | 63% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 116 | 40% | 137 |
| cx.mini.Nimrod 0.55 | 59 | 21% | 69 |
| uji.YellohFellah 1.0 | 26 | 9% | 31 |
| rdt199.Warlord 0.73 | 24 | 8% | 37 |
| br2.MobyDickBot 1.6 | 21 | 7% | 29 |
| djc.DynaBot 0.1.1 | 16 | 6% | 21 |
| KiraNL.Chupacabra 0.4 | 11 | 4% | 11 |
| stelo.MirrorNano 1.3 | 9 | 3% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 2% | 5 |

## Melee bench: F12

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 70.3 | 70 / 350 | 3.67 | 13.2% | 26970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.7 | 14.9% | 83 |
| nat.PallasHawk 1.0 | 2.0 | 14.5% | 97 |
| darkcanuck.Leon 1.01 | 3.1 | 13.1% | 67 |
| hadur117.nano.SanaroS3 0.3 | 3.2 | 13.2% | 70 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.2% | 20 |
| jrm.Test0 1.0 | 6.6 | 8.1% | 2 |
| cs.sheldor.Talon 1.1 | 7.1 | 7.3% | 1 |
| jp.Perpy 16.0 | 7.5 | 7.1% | 2 |
| stuff.Vlad 0.1 | 9.3 | 5.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.8% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 72.7 | 4 / 35 | 2745 |
| 2 | 4 | 57.4 | 67.0 | 4 / 35 | 2623 |
| 3 | 4 | 55.0 | 60.0 | 5 / 35 | 2605 |
| 4 | 1 | 59.8 | 73.0 | 9 / 35 | 2635 |
| 5 | 3 | 60.0 | 72.1 | 7 / 35 | 2745 |
| 6 | 4 | 58.9 | 69.5 | 8 / 35 | 2505 |
| 7 | 4 | 57.7 | 65.4 | 8 / 35 | 2672 |
| 8 | 2 | 63.3 | 78.7 | 12 / 35 | 3152 |
| 9 | 3 | 60.1 | 73.3 | 8 / 35 | 2620 |
| 10 | 4 | 59.2 | 71.4 | 5 / 35 | 2668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 58 | 21% |
| bts.wiki.RipCurl 0.9b | 57 | 49% |
| darkcanuck.Leon 1.01 | 45 | 42% |
| brainfade.melee.Genghis 0.36 | 10 | 60% |
| jaybot.bots.Oddball 4.0 | 5 | 20% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 280 of 350 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 77 | 28% | 93 |
| bts.wiki.RipCurl 0.9b | 61 | 22% | 85 |
| darkcanuck.Leon 1.01 | 54 | 19% | 76 |
| brainfade.melee.Genghis 0.36 | 32 | 11% | 35 |
| jrm.Test0 1.0 | 16 | 6% | 16 |
| jaybot.bots.Oddball 4.0 | 15 | 5% | 15 |
| cs.sheldor.Talon 1.1 | 10 | 4% | 13 |
| jp.Perpy 16.0 | 8 | 3% | 9 |
| stuff.Vlad 0.1 | 7 | 3% | 7 |

## Melee bench: F13

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 72.9 | 55 / 350 | 3.44 | 13.1% | 30019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.6% | 165 |
| ags.Glacier 0.2.11 | 1.7 | 16.7% | 78 |
| hadur117.nano.SanaroS3 0.3 | 3.1 | 13.1% | 55 |
| shinh.Entangled 0.3 | 4.2 | 12.3% | 30 |
| gh.micro.Gruweltje 0.7 | 4.7 | 12.0% | 17 |
| apc.Colossus2 0.17 | 6.1 | 8.1% | 1 |
| stelo.Wang 1.0 | 6.9 | 7.2% | 4 |
| ayk.WallHugger 1.0 | 8.2 | 4.9% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 74.9 | 7 / 35 | 2883 |
| 2 | 3 | 60.8 | 74.0 | 5 / 35 | 3150 |
| 3 | 3 | 61.2 | 75.6 | 5 / 35 | 2905 |
| 4 | 4 | 58.1 | 68.6 | 6 / 35 | 2401 |
| 5 | 3 | 62.7 | 79.7 | 8 / 35 | 3298 |
| 6 | 3 | 60.1 | 72.1 | 7 / 35 | 2784 |
| 7 | 3 | 60.4 | 73.0 | 2 / 35 | 3208 |
| 8 | 3 | 60.5 | 70.8 | 7 / 35 | 3167 |
| 9 | 3 | 59.5 | 68.9 | 6 / 35 | 3056 |
| 10 | 3 | 59.8 | 71.4 | 2 / 35 | 3167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 81 | 31% |
| ags.Glacier 0.2.11 | 46 | 20% |
| shinh.Entangled 0.3 | 21 | 52% |
| gh.micro.Gruweltje 0.7 | 11 | 73% |
| stelo.Wang 1.0 | 2 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 295 of 350 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 103 | 35% | 112 |
| mn.Combat 3.25.0 | 93 | 32% | 119 |
| shinh.Entangled 0.3 | 42 | 14% | 52 |
| gh.micro.Gruweltje 0.7 | 25 | 8% | 32 |
| stelo.Wang 1.0 | 16 | 5% | 17 |
| maribo.FollowFire 1 | 9 | 3% | 10 |
| apc.Colossus2 0.17 | 4 | 1% | 5 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |

## Melee bench: F14

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 75.3 | 103 / 350 | 3.23 | 14.3% | 33256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.8% | 136 |
| hadur117.nano.SanaroS3 0.3 | 2.1 | 14.3% | 103 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.7% | 60 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.9 | 10.6% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 10.1% | 11 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.9% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 6.4 | 9.2% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.6 | 7.9% | 14 |
| pa.Improved 1.0 | 9.0 | 5.4% | 3 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 72.4 | 9 / 35 | 2933 |
| 2 | 2 | 63.2 | 78.7 | 13 / 35 | 3516 |
| 3 | 2 | 63.3 | 76.8 | 13 / 35 | 3818 |
| 4 | 2 | 62.2 | 74.3 | 9 / 35 | 3277 |
| 5 | 2 | 62.7 | 79.0 | 11 / 35 | 2991 |
| 6 | 2 | 62.1 | 75.9 | 9 / 35 | 3405 |
| 7 | 2 | 61.9 | 74.9 | 10 / 35 | 3437 |
| 8 | 3 | 61.4 | 74.0 | 8 / 35 | 3331 |
| 9 | 2 | 63.5 | 78.4 | 13 / 35 | 3450 |
| 10 | 2 | 59.7 | 68.3 | 8 / 35 | 3098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 104 | 57% |
| catcat20.shape.Theta 0.018 | 45 | 42% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 63% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 50% |
| sanyi.mikrobi.Roberto 1.0 | 6 | 83% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 60% |

Hadur died in 247 of 350 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 111 | 45% | 168 |
| catcat20.shape.Theta 0.018 | 52 | 21% | 69 |
| dmh.robocode.robot.RedDwarf 0.4 | 19 | 8% | 23 |
| sanyi.mikrobi.Roberto 1.0 | 17 | 7% | 30 |
| co.edu.usb.rc.LidisTron 1.0 | 17 | 7% | 14 |
| Lo_Ian.Gandalf_V4 4.0 | 16 | 6% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 6% | 20 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 66.0 | 66 / 350 | 4.06 | 12.9% | 33347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.6 | 14.7% | 70 |
| emp.Yngwie 1.11 | 2.2 | 13.8% | 100 |
| hadur117.nano.SanaroS3 0.3 | 3.2 | 12.9% | 66 |
| mld.DustBunny 3.8 | 3.2 | 13.1% | 36 |
| cb.nano.Insomnia 1.0 | 5.3 | 11.3% | 22 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.8% | 46 |
| Grystrion.TrackerWO 1.0 | 7.4 | 7.0% | 3 |
| lambdaxy.TBot 0.1 | 7.8 | 6.9% | 1 |
| divineomega.TrialBot 0.003 | 9.1 | 5.2% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 68.3 | 5 / 35 | 3477 |
| 2 | 4 | 58.6 | 64.1 | 6 / 35 | 3550 |
| 3 | 3 | 59.7 | 68.9 | 9 / 35 | 3215 |
| 4 | 4 | 57.3 | 62.5 | 8 / 35 | 3028 |
| 5 | 3 | 59.0 | 63.2 | 7 / 35 | 3852 |
| 6 | 3 | 58.6 | 68.6 | 3 / 35 | 3127 |
| 7 | 3 | 59.9 | 67.3 | 7 / 35 | 3478 |
| 8 | 3 | 57.9 | 62.9 | 5 / 35 | 3256 |
| 9 | 3 | 60.0 | 69.5 | 7 / 35 | 3316 |
| 10 | 3 | 57.9 | 64.4 | 9 / 35 | 3048 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 42 | 60% |
| cb.nano.Insomnia 1.0 | 22 | 59% |
| kawigi.micro.Shiz 1.1 | 22 | 32% |
| kawigi.robot.Girl 1.2 | 20 | 70% |
| mld.DustBunny 3.8 | 11 | 27% |
| divineomega.TrialBot 0.003 | 4 | 75% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 60 | 21% | 67 |
| emp.Yngwie 1.11 | 56 | 20% | 84 |
| mld.DustBunny 3.8 | 51 | 18% | 70 |
| cb.nano.Insomnia 1.0 | 44 | 15% | 36 |
| kawigi.robot.Girl 1.2 | 34 | 12% | 47 |
| Grystrion.TrackerWO 1.0 | 14 | 5% | 15 |
| lambdaxy.TBot 0.1 | 13 | 5% | 13 |
| divineomega.TrialBot 0.003 | 10 | 4% | 14 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 1% | 4 |

## Melee bench: F16

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.3 | 55 / 350 | 3.86 | 13.5% | 36602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.9% | 159 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.3 | 14.6% | 23 |
| hadur117.nano.SanaroS3 0.3 | 2.8 | 13.5% | 55 |
| techdude.forest.FlamingForest 1.1 | 3.9 | 11.5% | 81 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.7% | 17 |
| bvh.fnr.Fenrir 0.36l | 6.1 | 8.9% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 8.3% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.9 | 5.4% | 8 |
| asd.Cthulhu 1.3 | 9.0 | 5.0% | 1 |
| repositorio.NanoStep 1.0 | 9.1 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 66.3 | 8 / 35 | 3649 |
| 2 | 2 | 63.2 | 74.6 | 7 / 35 | 4075 |
| 3 | 2 | 62.4 | 73.0 | 8 / 35 | 3913 |
| 4 | 3 | 56.6 | 61.3 | 4 / 35 | 3001 |
| 5 | 3 | 58.5 | 61.6 | 4 / 35 | 3708 |
| 6 | 4 | 58.2 | 66.0 | 5 / 35 | 3025 |
| 7 | 2 | 63.9 | 79.4 | 5 / 35 | 4195 |
| 8 | 3 | 56.5 | 60.0 | 1 / 35 | 3512 |
| 9 | 3 | 60.1 | 67.9 | 3 / 35 | 3694 |
| 10 | 3 | 62.5 | 72.4 | 10 / 35 | 3830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 77 | 21% |
| techdude.forest.FlamingForest 1.1 | 26 | 42% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 100% |
| tvv.nano.Polaris 1.2 | 8 | 25% |
| stelo.IntrinsicVolatility 1.4 | 8 | 88% |
| divineomega.DivineBot 1.9.4.5 | 5 | 80% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| asd.Cthulhu 1.3 | 1 | 0% |
| repositorio.NanoStep 1.0 | 1 | 0% |

Hadur died in 295 of 350 rounds, at a mean tick of 1284. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 131 | 44% | 152 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 49 | 17% | 55 |
| bvh.fnr.Fenrir 0.36l | 35 | 12% | 37 |
| techdude.forest.FlamingForest 1.1 | 31 | 11% | 43 |
| tvv.nano.Polaris 1.2 | 18 | 6% | 21 |
| stelo.IntrinsicVolatility 1.4 | 13 | 4% | 17 |
| divineomega.DivineBot 1.9.4.5 | 8 | 3% | 14 |
| asd.Cthulhu 1.3 | 8 | 3% | 9 |
| repositorio.NanoStep 1.0 | 2 | 1% | 2 |

## Melee bench: F17

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 67.5 | 78 / 350 | 3.92 | 13.2% | 33204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.8 | 14.4% | 82 |
| cx.BlestPain 1.41 | 2.7 | 13.4% | 71 |
| hadur117.nano.SanaroS3 0.3 | 3.0 | 13.2% | 78 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.9% | 49 |
| nic.Nicator 2.4 | 5.2 | 11.4% | 38 |
| ahf.NanoAndrew .4 | 5.3 | 10.9% | 24 |
| maribo.melee.BMV 0.1 | 6.7 | 9.6% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 8.4 | 5.7% | 2 |
| tex.Longbot 0.4 | 8.6 | 5.7% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.0 | 62.5 | 7 / 35 | 2956 |
| 2 | 1 | 62.0 | 73.0 | 13 / 35 | 3413 |
| 3 | 5 | 58.4 | 65.1 | 6 / 35 | 3144 |
| 4 | 4 | 59.2 | 68.9 | 6 / 35 | 3023 |
| 5 | 4 | 58.2 | 63.5 | 6 / 35 | 3330 |
| 6 | 2 | 60.6 | 71.4 | 10 / 35 | 3145 |
| 7 | 2 | 61.6 | 73.3 | 7 / 35 | 3697 |
| 8 | 1 | 63.7 | 75.2 | 14 / 35 | 3841 |
| 9 | 1 | 60.3 | 69.8 | 7 / 35 | 3541 |
| 10 | 6 | 53.5 | 52.4 | 2 / 35 | 3114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 46 | 24% |
| oog.melee.Mercutio 1.0 | 34 | 74% |
| cx.BlestPain 1.41 | 31 | 81% |
| nic.Nicator 2.4 | 19 | 42% |
| ahf.NanoAndrew .4 | 9 | 44% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 273 of 350 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 66 | 24% | 82 |
| cx.BlestPain 1.41 | 52 | 19% | 76 |
| nic.Nicator 2.4 | 44 | 16% | 49 |
| ahf.NanoAndrew .4 | 42 | 15% | 46 |
| oog.melee.Mercutio 1.0 | 38 | 14% | 60 |
| maribo.melee.BMV 0.1 | 24 | 9% | 27 |
| tex.Longbot 0.4 | 4 | 1% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 0% | 3 |
| goblin.Bender 2.4 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 73.7 | 129 / 350 | 3.37 | 14.5% | 32299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.5 | 14.5% | 129 |
| morbid.MorbidPriest 1.0 | 1.7 | 14.2% | 86 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.4% | 52 |
| spinnercat.Robovirus 2.718 | 4.6 | 10.7% | 14 |
| uji.DBH 1.1 | 4.7 | 10.7% | 27 |
| ratosh.Nobo 0.21 | 5.5 | 10.2% | 8 |
| sigterm.Sigterm 1.0 | 6.9 | 8.9% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 8.4 | 6.9% | 4 |
| stelo.WangRobot 1.0 | 8.5 | 6.7% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 74.3 | 15 / 35 | 3284 |
| 2 | 1 | 64.0 | 83.5 | 17 / 35 | 3188 |
| 3 | 3 | 59.7 | 67.0 | 8 / 35 | 3479 |
| 4 | 1 | 61.6 | 73.3 | 13 / 35 | 3370 |
| 5 | 1 | 62.9 | 77.8 | 13 / 35 | 3436 |
| 6 | 2 | 58.4 | 66.0 | 11 / 35 | 2971 |
| 7 | 1 | 62.5 | 76.2 | 16 / 35 | 3288 |
| 8 | 2 | 58.3 | 68.3 | 11 / 35 | 2694 |
| 9 | 1 | 64.0 | 81.6 | 16 / 35 | 3357 |
| 10 | 2 | 59.3 | 68.6 | 9 / 35 | 3232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 61 | 66% |
| agd.Mooserwirt2 2.7 | 36 | 72% |
| spinnercat.Robovirus 2.718 | 23 | 96% |
| uji.DBH 1.1 | 21 | 76% |
| sigterm.Sigterm 1.0 | 11 | 82% |
| ratosh.Nobo 0.21 | 11 | 73% |
| stelo.WangRobot 1.0 | 6 | 67% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 60% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 222 of 350 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 85 | 38% | 130 |
| agd.Mooserwirt2 2.7 | 34 | 15% | 64 |
| ratosh.Nobo 0.21 | 30 | 14% | 41 |
| uji.DBH 1.1 | 22 | 10% | 31 |
| stelo.WangRobot 1.0 | 14 | 6% | 19 |
| spinnercat.Robovirus 2.718 | 13 | 6% | 23 |
| sigterm.Sigterm 1.0 | 12 | 5% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 5% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 3 |

## Melee bench: F19

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 81.7 | 123 / 350 | 2.65 | 15.9% | 36814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.7 | 15.9% | 83 |
| mld.Infinity 2.2 | 2.1 | 16.0% | 118 |
| hadur117.nano.SanaroS3 0.3 | 2.2 | 15.9% | 123 |
| krillr.mini.JointStrike 2.0.0 | 4.4 | 11.4% | 8 |
| erdnis.Rover 0.3 | 4.7 | 10.6% | 4 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.9% | 7 |
| pac.ABC 2.1 | 7.5 | 7.2% | 8 |
| mbh.Mbh 0.1 | 7.5 | 7.2% | 1 |
| pbg.R2D2 1.0 | 8.9 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 84.1 | 16 / 35 | 3451 |
| 2 | 1 | 66.3 | 83.5 | 14 / 35 | 4076 |
| 3 | 2 | 66.7 | 86.3 | 11 / 35 | 4025 |
| 4 | 2 | 66.2 | 81.3 | 13 / 35 | 4234 |
| 5 | 3 | 64.4 | 79.7 | 13 / 35 | 3585 |
| 6 | 3 | 64.9 | 82.9 | 11 / 35 | 3241 |
| 7 | 3 | 62.8 | 76.2 | 10 / 35 | 3294 |
| 8 | 2 | 64.7 | 81.9 | 11 / 35 | 3499 |
| 9 | 1 | 66.2 | 85.7 | 14 / 35 | 3927 |
| 10 | 3 | 63.3 | 74.9 | 10 / 35 | 3482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 118 | 58% |
| davidalves.net.DuelistMiniMelee 1.2 | 79 | 43% |
| krillr.mini.JointStrike 2.0.0 | 12 | 75% |
| pac.ABC 2.1 | 6 | 50% |
| erdnis.Rover 0.3 | 5 | 100% |
| patson.PatsonTestBot 1.0 | 4 | 50% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 228 of 350 rounds, at a mean tick of 1070. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 92 | 40% | 173 |
| mld.Infinity 2.2 | 70 | 31% | 38 |
| krillr.mini.JointStrike 2.0.0 | 21 | 9% | 41 |
| patson.PatsonTestBot 1.0 | 16 | 7% | 26 |
| pac.ABC 2.1 | 11 | 5% | 18 |
| erdnis.Rover 0.3 | 8 | 4% | 24 |
| mbh.Mbh 0.1 | 5 | 2% | 11 |
| pbg.R2D2 1.0 | 4 | 2% | 11 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 70.9 | 94 / 350 | 3.62 | 13.7% | 32170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.4% | 136 |
| hadur117.nano.SanaroS3 0.3 | 2.3 | 13.7% | 94 |
| fwb.Nine 1.0.1 | 3.4 | 12.3% | 45 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 12.1% | 23 |
| catcat20.Rabbit 0.001 | 4.8 | 10.4% | 30 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 8.3% | 7 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 8.4% | 4 |
| bayen.nut.Squirrel 1.615 | 7.4 | 8.0% | 9 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 78.4 | 11 / 35 | 3129 |
| 2 | 2 | 61.2 | 74.6 | 8 / 35 | 3284 |
| 3 | 4 | 57.3 | 63.8 | 6 / 35 | 2917 |
| 4 | 2 | 59.1 | 65.7 | 8 / 35 | 3341 |
| 5 | 2 | 59.3 | 69.5 | 10 / 35 | 2840 |
| 6 | 2 | 60.3 | 70.2 | 10 / 35 | 3255 |
| 7 | 3 | 60.9 | 69.8 | 9 / 35 | 3475 |
| 8 | 2 | 62.4 | 72.7 | 14 / 35 | 3497 |
| 9 | 2 | 60.2 | 71.4 | 7 / 35 | 3235 |
| 10 | 2 | 61.3 | 72.4 | 11 / 35 | 3197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 69 | 43% |
| fwb.Nine 1.0.1 | 35 | 89% |
| catcat20.Rabbit 0.001 | 22 | 73% |
| nz.jdc.nano.GridFu 1.0 | 11 | 64% |
| bayen.nut.Squirrel 1.615 | 9 | 78% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 0% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 256 of 350 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 105 | 41% | 132 |
| fwb.Nine 1.0.1 | 39 | 15% | 55 |
| nz.jdc.nano.GridFu 1.0 | 32 | 13% | 45 |
| catcat20.Rabbit 0.001 | 27 | 11% | 49 |
| djdjdj.NanoSkunk10 1.0 | 19 | 7% | 25 |
| bayen.nut.Squirrel 1.615 | 14 | 5% | 20 |
| m3thos.mini.Eva01 0.5.5 | 11 | 4% | 15 |
| ntc.ControlledChaos 1.1.4 | 7 | 3% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 2 |

## Melee bench: F21

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 82.5 | 112 / 350 | 2.57 | 16.6% | 44483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.1 | 18.3% | 181 |
| hadur117.nano.SanaroS3 0.3 | 1.9 | 16.6% | 112 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 28 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 14 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.6% | 0 |
| eld.Hmm 1.0 | 5.7 | 8.5% | 14 |
| el.JumpShoot 0.2 | 7.4 | 6.3% | 1 |
| fire219.CatBot 1.0 | 8.0 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 81.6 | 11 / 35 | 4753 |
| 2 | 2 | 66.5 | 84.1 | 14 / 35 | 4323 |
| 3 | 2 | 67.1 | 83.5 | 12 / 35 | 4878 |
| 4 | 2 | 64.8 | 80.6 | 8 / 35 | 4080 |
| 5 | 2 | 64.9 | 78.7 | 10 / 35 | 4584 |
| 6 | 2 | 66.5 | 82.9 | 11 / 35 | 4569 |
| 7 | 2 | 65.0 | 80.6 | 12 / 35 | 4315 |
| 8 | 2 | 66.2 | 85.4 | 12 / 35 | 4146 |
| 9 | 2 | 64.9 | 80.6 | 9 / 35 | 4212 |
| 10 | 1 | 67.5 | 87.0 | 13 / 35 | 4623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 157 | 34% |
| dummy.mini.Scimitar 1.01 | 43 | 77% |
| cf.RiO.RiOx 4.2.1 | 24 | 71% |
| eld.Hmm 1.0 | 8 | 50% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 238 of 350 rounds, at a mean tick of 1338. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 130 | 55% | 176 |
| dummy.mini.Scimitar 1.01 | 51 | 21% | 92 |
| cf.RiO.RiOx 4.2.1 | 31 | 13% | 39 |
| eld.Hmm 1.0 | 9 | 4% | 19 |
| oa.weak.BotherBot 0.1 | 7 | 3% | 11 |
| fire219.CatBot 1.0 | 4 | 2% | 5 |
| PSW.Relentless 0.1 | 4 | 2% | 4 |
| el.JumpShoot 0.2 | 2 | 1% | 4 |

## Melee bench: F23

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.7 | 128 / 350 | 2.38 | 16.5% | 37848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.8% | 141 |
| hadur117.nano.SanaroS3 0.3 | 2.1 | 16.5% | 128 |
| cre.Karolos 0.32 | 2.8 | 14.9% | 53 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.5% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.6 | 8.9% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.9 | 8.8% | 2 |
| cw.megas.Blade 0.8 | 6.9 | 8.1% | 0 |
| sample.Walls 1.0 | 7.6 | 7.9% | 4 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.6 | 14 / 35 | 3910 |
| 2 | 2 | 66.6 | 84.1 | 13 / 35 | 4015 |
| 3 | 2 | 65.4 | 80.3 | 15 / 35 | 3566 |
| 4 | 2 | 66.9 | 86.3 | 12 / 35 | 3520 |
| 5 | 2 | 66.9 | 86.0 | 10 / 35 | 3983 |
| 6 | 2 | 67.4 | 87.0 | 13 / 35 | 3624 |
| 7 | 3 | 66.0 | 81.3 | 11 / 35 | 3764 |
| 8 | 3 | 64.1 | 77.1 | 11 / 35 | 3649 |
| 9 | 2 | 66.2 | 84.1 | 12 / 35 | 3629 |
| 10 | 2 | 68.8 | 93.0 | 17 / 35 | 4188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 132 | 50% |
| cre.Karolos 0.32 | 51 | 49% |
| stelo.AreaTargetingBot 1.1 | 28 | 54% |
| sample.Walls 1.0 | 17 | 94% |
| stelo.RamTrackSurfer 1.2 | 5 | 80% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 50% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 222 of 350 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 112 | 50% | 188 |
| cre.Karolos 0.32 | 49 | 22% | 75 |
| stelo.AreaTargetingBot 1.1 | 36 | 16% | 45 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 13 | 6% | 14 |
| stelo.RamTrackSurfer 1.2 | 5 | 2% | 11 |
| sample.Walls 1.0 | 3 | 1% | 8 |
| cw.megas.Blade 0.8 | 2 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 2 | 1% | 2 |

## Melee bench: F24

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.0 | 57.8 | 47 / 350 | 4.80 | 10.8% | 24176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.6 | 14.7% | 71 |
| florent.XSeries.X2 0.12 | 2.0 | 14.3% | 75 |
| davidalves.Phoenix 0.54 | 2.6 | 13.8% | 81 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.2% | 42 |
| hadur117.nano.SanaroS3 0.3 | 5.1 | 10.8% | 47 |
| oog.melee.Corsair 1.0 | 6.0 | 9.3% | 9 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.3% | 18 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.9% | 6 |
| as.FrankTheTank 1.3 | 9.1 | 5.1% | 1 |
| evd.X1 0.01 | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.2 | 56.2 | 7 / 35 | 2129 |
| 2 | 5 | 55.4 | 60.0 | 5 / 35 | 2527 |
| 3 | 4 | 55.6 | 61.3 | 7 / 35 | 2420 |
| 4 | 5 | 54.6 | 59.7 | 5 / 35 | 2378 |
| 5 | 5 | 54.3 | 58.4 | 7 / 35 | 2281 |
| 6 | 5 | 55.0 | 62.5 | 3 / 35 | 2453 |
| 7 | 5 | 54.6 | 59.4 | 2 / 35 | 2551 |
| 8 | 5 | 52.4 | 51.7 | 5 / 35 | 2699 |
| 9 | 7 | 51.1 | 52.7 | 3 / 35 | 2214 |
| 10 | 5 | 53.4 | 55.9 | 3 / 35 | 2524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 32 | 63% |
| rz.GlowBlowMelee 1.4 | 24 | 54% |
| davidalves.Phoenix 0.54 | 12 | 42% |
| pedersen.Ugluk 1.1.1 | 6 | 67% |
| stelo.SoJNanoMelee 1.1 | 5 | 40% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 0% |
| as.FrankTheTank 1.3 | 1 | 0% |

Hadur died in 303 of 350 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 66 | 22% | 88 |
| rz.GlowBlowMelee 1.4 | 64 | 21% | 75 |
| davidalves.Phoenix 0.54 | 61 | 20% | 66 |
| pedersen.Ugluk 1.1.1 | 54 | 18% | 57 |
| oog.melee.Corsair 1.0 | 16 | 5% | 22 |
| stelo.SoJNanoMelee 1.1 | 13 | 4% | 13 |
| lunchie.Lunchbox 0.93 | 13 | 4% | 13 |
| evd.X1 0.01 | 8 | 3% | 8 |
| as.FrankTheTank 1.3 | 8 | 3% | 8 |

## Melee bench: F25

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 67.6 | 70 / 350 | 3.91 | 13.0% | 28235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.8 | 14.3% | 76 |
| voidious.micro.BlitzBat 1.05 | 2.1 | 13.9% | 69 |
| hadur117.nano.SanaroS3 0.3 | 2.6 | 13.0% | 70 |
| jdw.Hurricane 1.4 | 3.5 | 12.1% | 51 |
| ds.Oo 2.2 | 5.4 | 9.9% | 35 |
| gre.svman4.Morfeas 1.4.1 | 5.9 | 9.8% | 20 |
| gjr.Cephalosporin 0.1 | 7.1 | 8.6% | 21 |
| awesomeness.Elite 1.0 | 7.9 | 7.3% | 7 |
| adt.Ar2 1.1 | 8.7 | 6.7% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 74.3 | 8 / 35 | 2816 |
| 2 | 4 | 56.4 | 63.8 | 3 / 35 | 2642 |
| 3 | 2 | 59.0 | 70.2 | 8 / 35 | 2582 |
| 4 | 3 | 58.6 | 67.3 | 7 / 35 | 2954 |
| 5 | 2 | 60.0 | 72.7 | 7 / 35 | 2912 |
| 6 | 3 | 59.7 | 68.9 | 8 / 35 | 3050 |
| 7 | 3 | 58.3 | 64.4 | 9 / 35 | 2869 |
| 8 | 2 | 58.4 | 67.0 | 8 / 35 | 2894 |
| 9 | 3 | 55.2 | 58.4 | 5 / 35 | 2774 |
| 10 | 2 | 58.6 | 69.2 | 7 / 35 | 2742 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 51 | 33% |
| voidious.mini.BrokenSword 2.0.3 | 49 | 29% |
| jdw.Hurricane 1.4 | 20 | 90% |
| gjr.Cephalosporin 0.1 | 19 | 42% |
| ds.Oo 2.2 | 14 | 43% |
| gre.svman4.Morfeas 1.4.1 | 7 | 57% |
| awesomeness.Elite 1.0 | 3 | 67% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 280 of 350 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 68 | 24% | 87 |
| voidious.mini.BrokenSword 2.0.3 | 66 | 24% | 84 |
| jdw.Hurricane 1.4 | 33 | 12% | 47 |
| ds.Oo 2.2 | 26 | 9% | 33 |
| gre.svman4.Morfeas 1.4.1 | 25 | 9% | 29 |
| gjr.Cephalosporin 0.1 | 24 | 9% | 29 |
| adt.Ar2 1.1 | 19 | 7% | 20 |
| awesomeness.Elite 1.0 | 12 | 4% | 14 |
| amk.ChumbaMini 0.2 | 7 | 3% | 7 |

## Melee bench: F26

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 70.2 | 55 / 350 | 3.68 | 13.1% | 32891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.5% | 126 |
| lrem.Spectre 0.4.4 | 2.7 | 13.2% | 63 |
| hadur117.nano.SanaroS3 0.3 | 3.1 | 13.1% | 55 |
| shu.nitro.LENIN .T34 | 3.7 | 12.6% | 57 |
| gh.mini.GrubbmOne 1.0 | 4.9 | 11.2% | 17 |
| js.PinBall 1.6 | 5.6 | 11.0% | 25 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 8.9% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.5% | 4 |
| sample.SpinBot 1.0 | 8.9 | 5.5% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 72.7 | 7 / 35 | 3228 |
| 2 | 4 | 59.2 | 67.6 | 4 / 35 | 3485 |
| 3 | 3 | 60.3 | 71.1 | 5 / 35 | 3283 |
| 4 | 4 | 58.6 | 66.0 | 4 / 35 | 3140 |
| 5 | 5 | 58.6 | 67.0 | 4 / 35 | 3005 |
| 6 | 2 | 62.2 | 76.2 | 8 / 35 | 3537 |
| 7 | 4 | 58.4 | 67.0 | 5 / 35 | 3024 |
| 8 | 2 | 60.9 | 72.4 | 5 / 35 | 3507 |
| 9 | 2 | 61.2 | 71.1 | 9 / 35 | 3556 |
| 10 | 3 | 59.8 | 70.8 | 4 / 35 | 3126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 59 | 39% |
| shu.nitro.LENIN .T34 | 28 | 32% |
| lrem.Spectre 0.4.4 | 27 | 41% |
| js.PinBall 1.6 | 9 | 67% |
| gh.mini.GrubbmOne 1.0 | 6 | 33% |
| jaybot.adv.bots.JayBot 2.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 0% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 295 of 350 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 97 | 33% | 119 |
| lrem.Spectre 0.4.4 | 49 | 17% | 59 |
| shu.nitro.LENIN .T34 | 45 | 15% | 55 |
| gh.mini.GrubbmOne 1.0 | 41 | 14% | 44 |
| js.PinBall 1.6 | 25 | 8% | 31 |
| sample.SpinBot 1.0 | 14 | 5% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 13 | 4% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 11 | 4% | 12 |

## Melee bench: F27

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 74.5 | 106 / 350 | 3.30 | 14.0% | 27873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.8 | 14.6% | 101 |
| hadur117.nano.SanaroS3 0.3 | 1.9 | 14.0% | 106 |
| wee.Gem 1.8.4 | 3.3 | 12.5% | 68 |
| sheldor.melee.nano.TestMelee 0.1 | 3.8 | 11.9% | 38 |
| EH.Eagle 1.0.6 | 5.1 | 10.4% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 9.3% | 11 |
| joe.ADinosaur 1.0 | 7.0 | 8.7% | 3 |
| throxbot.ThroxBot 0.1 | 7.6 | 7.7% | 9 |
| caimano.Furia_Ceca 0.22 | 8.8 | 5.6% | 2 |
| cs.Grudge 1.0 | 9.4 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.3 | 72.7 | 9 / 35 | 2639 |
| 2 | 3 | 59.9 | 69.2 | 13 / 35 | 2865 |
| 3 | 4 | 57.8 | 70.2 | 4 / 35 | 2560 |
| 4 | 1 | 63.3 | 78.7 | 15 / 35 | 3309 |
| 5 | 1 | 61.4 | 77.1 | 10 / 35 | 2832 |
| 6 | 2 | 60.4 | 74.6 | 9 / 35 | 2735 |
| 7 | 1 | 63.0 | 78.7 | 18 / 35 | 2934 |
| 8 | 2 | 60.8 | 76.5 | 9 / 35 | 2567 |
| 9 | 2 | 59.0 | 71.4 | 6 / 35 | 2583 |
| 10 | 2 | 61.7 | 75.6 | 13 / 35 | 2849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 70 | 61% |
| wee.Gem 1.8.4 | 43 | 49% |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 63% |
| EH.Eagle 1.0.6 | 16 | 81% |
| throxbot.ThroxBot 0.1 | 10 | 70% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 56% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| joe.ADinosaur 1.0 | 2 | 50% |

Hadur died in 244 of 350 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 68 | 28% | 111 |
| wee.Gem 1.8.4 | 43 | 18% | 65 |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 17% | 57 |
| EH.Eagle 1.0.6 | 26 | 11% | 40 |
| joe.ADinosaur 1.0 | 26 | 11% | 26 |
| techdude.kombat.FlamingKombat 1.5 | 16 | 7% | 20 |
| throxbot.ThroxBot 0.1 | 13 | 5% | 19 |
| caimano.Furia_Ceca 0.22 | 9 | 4% | 10 |
| cs.Grudge 1.0 | 1 | 0% | 1 |

## Melee bench: F28

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 82.1 | 125 / 350 | 2.61 | 15.7% | 31793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.1% | 103 |
| hadur117.nano.SanaroS3 0.3 | 1.7 | 15.7% | 125 |
| uji.Antique 1.0 | 3.0 | 12.8% | 55 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 11.1% | 36 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.3% | 13 |
| ahr.ice.Ice 1.0.2 | 6.4 | 8.2% | 9 |
| amk.ChumbaWumba 0.3 | 6.6 | 8.1% | 6 |
| matt.advanced.Katana 1.0 | 8.3 | 6.5% | 2 |
| stelo.Lifestealer 1.0 | 9.3 | 5.3% | 1 |
| stelo.PianistNano 1.2 | 9.4 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 84.8 | 12 / 35 | 3241 |
| 2 | 2 | 61.9 | 79.4 | 9 / 35 | 2843 |
| 3 | 2 | 64.2 | 83.2 | 14 / 35 | 3171 |
| 4 | 1 | 63.7 | 80.0 | 15 / 35 | 3353 |
| 5 | 2 | 64.1 | 82.5 | 11 / 35 | 3260 |
| 6 | 1 | 64.4 | 85.1 | 15 / 35 | 3066 |
| 7 | 2 | 62.6 | 80.6 | 10 / 35 | 3167 |
| 8 | 2 | 63.2 | 80.6 | 10 / 35 | 3054 |
| 9 | 1 | 65.1 | 84.4 | 16 / 35 | 3297 |
| 10 | 2 | 63.9 | 80.0 | 13 / 35 | 3341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 138 | 53% |
| uji.Antique 1.0 | 46 | 57% |
| qohnil.blot.BlotBot 3.61 | 19 | 32% |
| ahr.ice.Ice 1.0.2 | 12 | 58% |
| amk.ChumbaWumba 0.3 | 10 | 70% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| matt.advanced.Katana 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 226 of 350 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 102 | 45% | 158 |
| uji.Antique 1.0 | 42 | 19% | 74 |
| pfvicm.Sobieski 7.2.3b | 27 | 12% | 32 |
| qohnil.blot.BlotBot 3.61 | 23 | 10% | 30 |
| amk.ChumbaWumba 0.3 | 16 | 7% | 22 |
| ahr.ice.Ice 1.0.2 | 8 | 4% | 17 |
| matt.advanced.Katana 1.0 | 3 | 1% | 8 |
| stelo.PianistNano 1.2 | 3 | 1% | 5 |
| stelo.Lifestealer 1.0 | 1 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 67.0 | 61 / 350 | 3.97 | 13.1% | 30436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.3 | 16.4% | 120 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 15.9% | 104 |
| hadur117.nano.SanaroS3 0.3 | 3.5 | 13.1% | 61 |
| myl.micro.Troodon 1.10 | 3.6 | 12.9% | 18 |
| jok.PheonixM 0.1.2 | 4.9 | 11.1% | 14 |
| DBall.Anarchy 0.1 | 6.2 | 8.6% | 27 |
| ph.melee.ArcherME 0.3 | 6.7 | 8.1% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.5% | 0 |
| ap.Frederick 1.1 | 8.9 | 4.6% | 1 |
| jangs.ns51 1.0 | 9.9 | 3.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 61.6 | 3 / 35 | 3082 |
| 2 | 3 | 57.7 | 62.5 | 4 / 35 | 3012 |
| 3 | 5 | 58.6 | 65.1 | 4 / 35 | 2808 |
| 4 | 3 | 62.9 | 73.0 | 10 / 35 | 3498 |
| 5 | 3 | 60.6 | 70.5 | 5 / 35 | 2928 |
| 6 | 4 | 60.0 | 66.0 | 8 / 35 | 2995 |
| 7 | 3 | 61.3 | 69.2 | 9 / 35 | 3217 |
| 8 | 2 | 62.3 | 73.3 | 8 / 35 | 3297 |
| 9 | 4 | 58.1 | 63.5 | 6 / 35 | 2732 |
| 10 | 4 | 58.7 | 64.8 | 4 / 35 | 2867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 11% |
| zyx.mega.YersiniaPestis 3.1 | 47 | 62% |
| myl.micro.Troodon 1.10 | 12 | 83% |
| DBall.Anarchy 0.1 | 10 | 50% |
| jok.PheonixM 0.1.2 | 8 | 75% |
| ap.Frederick 1.1 | 2 | 50% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 291 of 350 rounds, at a mean tick of 1105. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 122 | 42% | 131 |
| zyx.mega.YersiniaPestis 3.1 | 55 | 19% | 84 |
| jok.PheonixM 0.1.2 | 39 | 13% | 42 |
| myl.micro.Troodon 1.10 | 38 | 13% | 48 |
| ph.melee.ArcherME 0.3 | 18 | 6% | 19 |
| DBall.Anarchy 0.1 | 10 | 3% | 16 |
| fullsail.TimbotNoPrediction 1.0 | 6 | 2% | 6 |
| jangs.ns51 1.0 | 2 | 1% | 4 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F30

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.2 | 58.2 | 24 / 350 | 4.77 | 10.8% | 25682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.8 | 14.5% | 97 |
| darkcanuck.B26354 1.06 | 2.6 | 13.8% | 92 |
| oog.melee.Capulet 1.2 | 2.7 | 13.7% | 52 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.3% | 55 |
| hadur117.nano.SanaroS3 0.3 | 4.9 | 10.8% | 24 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.9% | 11 |
| ntc.Opposite 1.5 | 7.4 | 8.0% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.9 | 7.6% | 13 |
| tripphippy.Alice 1.1 | 8.4 | 6.9% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.8 | 54.0 | 2 / 35 | 2555 |
| 2 | 5 | 54.6 | 59.4 | 3 / 35 | 2567 |
| 3 | 5 | 54.7 | 61.3 | 0 / 35 | 2551 |
| 4 | 5 | 54.7 | 61.0 | 2 / 35 | 2566 |
| 5 | 5 | 55.0 | 59.7 | 2 / 35 | 2677 |
| 6 | 5 | 51.8 | 51.7 | 3 / 35 | 2275 |
| 7 | 5 | 52.7 | 55.2 | 2 / 35 | 2502 |
| 8 | 4 | 54.8 | 57.8 | 4 / 35 | 2871 |
| 9 | 5 | 56.2 | 62.2 | 3 / 35 | 2523 |
| 10 | 5 | 54.9 | 59.4 | 3 / 35 | 2595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 31 | 10% |
| darkcanuck.B26354 1.06 | 26 | 23% |
| stelo.PastFuture 2.3.2 | 12 | 58% |
| oog.melee.Capulet 1.2 | 12 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 33% |
| tripphippy.Alice 1.1 | 2 | 0% |
| intruder.PrairieWolf 2.61 | 1 | 100% |

Hadur died in 326 of 350 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 76 | 23% | 79 |
| stelo.PastFuture 2.3.2 | 65 | 20% | 73 |
| darkcanuck.B26354 1.06 | 64 | 20% | 69 |
| oog.melee.Capulet 1.2 | 30 | 9% | 38 |
| ntc.Opposite 1.5 | 27 | 8% | 27 |
| fowl3628800.LightningBolt 2.6.0 | 23 | 7% | 23 |
| intruder.PrairieWolf 2.61 | 22 | 7% | 22 |
| tripphippy.Alice 1.1 | 18 | 6% | 18 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |

## Melee bench: F31

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 59.4 | 31 / 350 | 4.65 | 10.8% | 23011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 173 |
| gh.mini.Griezel 0.2 | 2.1 | 13.9% | 83 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 12.4% | 23 |
| d414.nano.Quantum 1.0.0 | 3.9 | 11.9% | 22 |
| hadur117.nano.SanaroS3 0.3 | 4.7 | 10.8% | 31 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.6% | 11 |
| fm.mammillarias 1.3 | 7.5 | 6.8% | 2 |
| timmit.nano.TimDog 0.33 | 7.8 | 6.6% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.9 | 56.2 | 5 / 35 | 2236 |
| 2 | 5 | 55.9 | 63.5 | 4 / 35 | 2310 |
| 3 | 5 | 52.6 | 54.9 | 4 / 35 | 2287 |
| 4 | 5 | 53.2 | 56.8 | 3 / 35 | 2108 |
| 5 | 5 | 54.9 | 62.5 | 0 / 35 | 2437 |
| 6 | 4 | 57.9 | 66.3 | 4 / 35 | 2468 |
| 7 | 4 | 55.7 | 62.2 | 5 / 35 | 2370 |
| 8 | 6 | 51.3 | 52.1 | 1 / 35 | 2298 |
| 9 | 3 | 56.2 | 64.1 | 3 / 35 | 2415 |
| 10 | 5 | 52.4 | 55.6 | 2 / 35 | 2082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 48 | 27% |
| abc.Shadow 3.84i | 42 | 40% |
| d414.nano.Quantum 1.0.0 | 5 | 0% |
| spinnercat.micro.Tyger 0.1 | 5 | 0% |
| gh.nano.Grofvuil 0.2 | 2 | 0% |

Hadur died in 320 of 350 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 81 | 25% | 94 |
| abc.Shadow 3.84i | 76 | 24% | 93 |
| d414.nano.Quantum 1.0.0 | 46 | 14% | 47 |
| spinnercat.micro.Tyger 0.1 | 40 | 13% | 40 |
| fm.mammillarias 1.3 | 26 | 8% | 26 |
| gh.nano.Grofvuil 0.2 | 24 | 8% | 24 |
| timmit.nano.TimDog 0.33 | 17 | 5% | 17 |
| Gecko.ultimateGeckoBot 1.0 | 8 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 77.9 | 141 / 350 | 2.99 | 15.2% | 33682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.5 | 15.5% | 91 |
| hadur117.nano.SanaroS3 0.3 | 1.5 | 15.2% | 141 |
| apc.botM 3.0 | 3.2 | 12.3% | 47 |
| vjik.UnViolation 1.1 | 4.6 | 10.7% | 29 |
| lxx.ConceptA 0.8 | 4.6 | 10.8% | 9 |
| bayen.UbaMicro 1.4 | 6.0 | 8.9% | 7 |
| panzer.Panzer 0.2 | 7.1 | 7.9% | 2 |
| yk.JahMicro 1.0 | 8.3 | 6.9% | 12 |
| conscience.Electron 1.3g | 8.8 | 6.2% | 2 |
| donjezza.Jezza 1.0 | 9.4 | 5.8% | 10 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 74.6 | 14 / 35 | 2916 |
| 2 | 1 | 63.7 | 79.7 | 13 / 35 | 3809 |
| 3 | 2 | 62.7 | 75.2 | 15 / 35 | 3532 |
| 4 | 2 | 63.1 | 77.8 | 12 / 35 | 3583 |
| 5 | 2 | 62.1 | 77.8 | 10 / 35 | 3571 |
| 6 | 2 | 63.1 | 80.0 | 15 / 35 | 3220 |
| 7 | 1 | 61.8 | 77.5 | 11 / 35 | 3059 |
| 8 | 1 | 65.1 | 83.5 | 18 / 35 | 3669 |
| 9 | 1 | 62.7 | 78.4 | 17 / 35 | 3208 |
| 10 | 1 | 61.5 | 74.9 | 16 / 35 | 3115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 101 | 65% |
| apc.botM 3.0 | 39 | 67% |
| vjik.UnViolation 1.1 | 24 | 67% |
| lxx.ConceptA 0.8 | 19 | 89% |
| donjezza.Jezza 1.0 | 9 | 44% |
| yk.JahMicro 1.0 | 7 | 43% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| conscience.Electron 1.3g | 3 | 100% |
| panzer.Panzer 0.2 | 3 | 67% |

Hadur died in 211 of 350 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 64 | 30% | 124 |
| lxx.ConceptA 0.8 | 50 | 24% | 64 |
| apc.botM 3.0 | 27 | 13% | 53 |
| bayen.UbaMicro 1.4 | 15 | 7% | 20 |
| vjik.UnViolation 1.1 | 14 | 7% | 40 |
| panzer.Panzer 0.2 | 13 | 6% | 16 |
| conscience.Electron 1.3g | 11 | 5% | 12 |
| donjezza.Jezza 1.0 | 9 | 4% | 11 |
| yk.JahMicro 1.0 | 8 | 4% | 8 |

## Melee bench: F33

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 73.3 | 83 / 350 | 3.40 | 14.6% | 36338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.3% | 112 |
| hadur117.nano.SanaroS3 0.3 | 2.3 | 14.6% | 83 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 14.0% | 77 |
| labg.Cataclysm 2.05 | 4.5 | 10.9% | 32 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.2% | 30 |
| baal.nano.N 1.42 | 6.3 | 8.7% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.3% | 11 |
| zyx.micro.Ant 1.1 | 8.5 | 5.8% | 1 |
| sanja.First 0.1 | 9.0 | 4.8% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 73.0 | 5 / 35 | 3826 |
| 2 | 2 | 64.5 | 80.0 | 10 / 35 | 3613 |
| 3 | 3 | 59.6 | 65.7 | 8 / 35 | 3446 |
| 4 | 3 | 60.8 | 69.2 | 8 / 35 | 3329 |
| 5 | 2 | 63.1 | 74.9 | 9 / 35 | 3793 |
| 6 | 3 | 60.6 | 68.9 | 4 / 35 | 3572 |
| 7 | 2 | 59.8 | 67.9 | 8 / 35 | 3217 |
| 8 | 2 | 62.8 | 72.1 | 11 / 35 | 3804 |
| 9 | 2 | 64.6 | 80.3 | 9 / 35 | 4030 |
| 10 | 2 | 64.8 | 81.3 | 11 / 35 | 3708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 74 | 64% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 58 | 19% |
| labg.Cataclysm 2.05 | 20 | 50% |
| gre.svman4.Leonidas 1.3.2 | 18 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 33% |
| baal.nano.N 1.42 | 2 | 50% |

Hadur died in 268 of 350 rounds, at a mean tick of 1230. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 96 | 36% | 142 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 76 | 28% | 91 |
| gre.svman4.Leonidas 1.3.2 | 33 | 12% | 41 |
| labg.Cataclysm 2.05 | 23 | 9% | 31 |
| kinsen.melee.Angsaichmophobia 1.8c | 18 | 7% | 20 |
| baal.nano.N 1.42 | 11 | 4% | 15 |
| zyx.micro.Ant 1.1 | 6 | 2% | 5 |
| sanja.First 0.1 | 4 | 1% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 0% | 1 |

## Melee bench: F34

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 71.2 | 55 / 350 | 3.59 | 13.5% | 34250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.3 | 17.8% | 131 |
| stelo.Spread 0.9 | 1.7 | 17.3% | 122 |
| hadur117.nano.SanaroS3 0.3 | 3.1 | 13.5% | 55 |
| jcs.Seth 1.8 | 4.4 | 11.5% | 23 |
| tcf.Reach 3 | 4.6 | 11.2% | 9 |
| cli.Dancer 1.1 | 5.9 | 9.9% | 8 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.8% | 1 |
| sample.VelociRobot 1.0 | 8.8 | 3.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 73.3 | 7 / 35 | 3845 |
| 2 | 3 | 61.9 | 72.1 | 6 / 35 | 3470 |
| 3 | 3 | 63.0 | 75.9 | 7 / 35 | 3487 |
| 4 | 3 | 58.9 | 65.7 | 2 / 35 | 3227 |
| 5 | 3 | 63.0 | 74.6 | 5 / 35 | 3826 |
| 6 | 3 | 61.9 | 71.4 | 5 / 35 | 3591 |
| 7 | 3 | 60.5 | 66.7 | 8 / 35 | 3150 |
| 8 | 3 | 63.0 | 73.7 | 7 / 35 | 3752 |
| 9 | 3 | 61.4 | 73.3 | 7 / 35 | 2966 |
| 10 | 4 | 58.5 | 65.1 | 1 / 35 | 2936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 60 | 20% |
| stelo.Spread 0.9 | 53 | 49% |
| jcs.Seth 1.8 | 12 | 58% |
| tcf.Reach 3 | 9 | 67% |
| cli.Dancer 1.1 | 3 | 67% |
| ratosh.Wesco 1.4 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 0% |

Hadur died in 295 of 350 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 120 | 41% | 125 |
| stelo.Spread 0.9 | 95 | 32% | 124 |
| jcs.Seth 1.8 | 31 | 11% | 39 |
| tcf.Reach 3 | 21 | 7% | 29 |
| ratosh.Wesco 1.4 | 14 | 5% | 17 |
| cli.Dancer 1.1 | 12 | 4% | 14 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |

## Melee bench: F35

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 67.1 | 24 / 350 | 3.96 | 12.0% | 24338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 269 |
| gh.mini.Gruwel 0.9 | 2.0 | 13.4% | 35 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.0% | 12 |
| rz.HawkOnFire 0.1 | 3.9 | 12.2% | 5 |
| hadur117.nano.SanaroS3 0.3 | 4.3 | 12.0% | 24 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 7.1% | 2 |
| wit.Chuliath 1.0 | 6.8 | 6.8% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.9% | 1 |
| dans.Cinnamon 1.2 | 9.2 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.4 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.4 | 63.5 | 3 / 35 | 2466 |
| 2 | 5 | 55.5 | 61.9 | 4 / 35 | 2000 |
| 3 | 3 | 58.0 | 69.5 | 1 / 35 | 2478 |
| 4 | 5 | 58.1 | 68.9 | 0 / 35 | 2723 |
| 5 | 5 | 55.2 | 61.9 | 0 / 35 | 2140 |
| 6 | 3 | 60.0 | 71.7 | 4 / 35 | 2764 |
| 7 | 4 | 58.4 | 69.8 | 4 / 35 | 2328 |
| 8 | 5 | 57.9 | 67.3 | 2 / 35 | 2488 |
| 9 | 5 | 56.4 | 63.8 | 2 / 35 | 2319 |
| 10 | 3 | 59.8 | 72.4 | 4 / 35 | 2632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 91 | 3% |
| gh.mini.Gruwel 0.9 | 20 | 50% |
| rz.HawkOnFire 0.1 | 10 | 90% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 0% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 326 of 350 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 134 | 41% | 136 |
| gh.mini.Gruwel 0.9 | 59 | 18% | 72 |
| rz.HawkOnFire 0.1 | 50 | 15% | 58 |
| dmh.robocode.robot.BlackDeath 9.2 | 46 | 14% | 46 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 13 | 4% | 13 |
| wit.Chuliath 1.0 | 10 | 3% | 10 |
| myl.nano.KomoriNinja 1.1 | 9 | 3% | 9 |
| dans.Cinnamon 1.2 | 3 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 3 |

## Melee bench: F36

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 73.2 | 115 / 350 | 3.41 | 14.7% | 35439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.1 | 14.7% | 115 |
| bzdp.Pansy 2.1 | 2.8 | 12.4% | 57 |
| alpha.RainingFire 1.0 | 3.4 | 12.4% | 47 |
| mz.Cork 0.1 | 3.5 | 11.7% | 44 |
| bvh.micro.Freya 0.3 | 5.1 | 10.9% | 36 |
| bvh.mini.Fenrir 0.39 | 5.9 | 10.2% | 15 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.7% | 18 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.0% | 5 |
| dl.BetterWalls 1.0 | 8.7 | 6.3% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.5% | 15 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.4 | 74.6 | 8 / 35 | 3428 |
| 2 | 1 | 64.3 | 78.7 | 15 / 35 | 4015 |
| 3 | 1 | 60.7 | 70.5 | 12 / 35 | 3204 |
| 4 | 1 | 62.3 | 75.2 | 10 / 35 | 3679 |
| 5 | 1 | 61.9 | 73.3 | 11 / 35 | 3706 |
| 6 | 1 | 62.6 | 77.1 | 13 / 35 | 3282 |
| 7 | 2 | 59.7 | 66.7 | 10 / 35 | 3602 |
| 8 | 1 | 61.4 | 71.1 | 14 / 35 | 3369 |
| 9 | 1 | 61.7 | 72.7 | 12 / 35 | 3489 |
| 10 | 1 | 61.6 | 72.1 | 10 / 35 | 3665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 60% |
| mz.Cork 0.1 | 35 | 80% |
| bvh.micro.Freya 0.3 | 26 | 69% |
| alpha.RainingFire 1.0 | 20 | 60% |
| m3thos.Eva02 0.7.1 | 19 | 63% |
| bvh.mini.Fenrir 0.39 | 12 | 75% |
| sample.MyFirstRobot 1.0 | 9 | 33% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 237 of 350 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 52 | 22% | 84 |
| alpha.RainingFire 1.0 | 45 | 19% | 53 |
| bvh.mini.Fenrir 0.39 | 33 | 14% | 38 |
| bvh.micro.Freya 0.3 | 32 | 14% | 48 |
| mz.Cork 0.1 | 28 | 12% | 59 |
| m3thos.Eva02 0.7.1 | 22 | 9% | 34 |
| sample.MyFirstRobot 1.0 | 11 | 5% | 13 |
| squidM.TentalceMeleeNano 1.1 | 11 | 5% | 13 |
| dl.BetterWalls 1.0 | 2 | 1% | 8 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 80.0 | 147 / 350 | 2.80 | 16.1% | 44889 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.0 | 16.1% | 147 |
| germ.TheMind .2 | 3.1 | 11.3% | 45 |
| EBBU.Sim2 1.02 | 3.6 | 10.7% | 38 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.9 | 10.6% | 25 |
| agrach.Dalek 1.0 | 5.9 | 9.3% | 27 |
| stelo.UntouchableNano 1.3 | 6.4 | 9.0% | 13 |
| lmk.ACPFinal 0.1 | 6.6 | 8.7% | 21 |
| mb.Beast 0.1 | 7.4 | 8.4% | 17 |
| skm.Ryubot 1.0 | 8.2 | 8.1% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 8.9 | 7.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 83.8 | 19 / 35 | 4376 |
| 2 | 1 | 64.8 | 79.7 | 19 / 35 | 4693 |
| 3 | 1 | 63.6 | 77.8 | 14 / 35 | 4670 |
| 4 | 1 | 63.9 | 80.3 | 14 / 35 | 4787 |
| 5 | 1 | 64.0 | 81.9 | 17 / 35 | 4369 |
| 6 | 1 | 61.4 | 74.0 | 8 / 35 | 4629 |
| 7 | 1 | 65.2 | 85.4 | 18 / 35 | 4469 |
| 8 | 1 | 63.5 | 82.2 | 13 / 35 | 4305 |
| 9 | 1 | 62.3 | 78.1 | 12 / 35 | 4248 |
| 10 | 1 | 62.4 | 76.8 | 13 / 35 | 4343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 43 | 53% |
| germ.TheMind .2 | 43 | 65% |
| stelo.UntouchableNano 1.3 | 32 | 88% |
| skm.Ryubot 1.0 | 22 | 64% |
| agrach.Dalek 1.0 | 21 | 67% |
| lmk.ACPFinal 0.1 | 19 | 63% |
| mb.Beast 0.1 | 17 | 76% |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 76% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 203 of 350 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 44 | 22% | 68 |
| germ.TheMind .2 | 44 | 22% | 61 |
| agrach.Dalek 1.0 | 24 | 12% | 47 |
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 11% | 39 |
| lmk.ACPFinal 0.1 | 22 | 11% | 36 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 7% | 16 |
| stelo.UntouchableNano 1.3 | 13 | 6% | 36 |
| mb.Beast 0.1 | 11 | 5% | 27 |
| skm.Ryubot 1.0 | 9 | 4% | 18 |

## Melee bench: F38

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 64.0 | 47 / 350 | 4.24 | 11.9% | 27293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.6% | 145 |
| bvh.mini.Freya 0.55 | 2.8 | 13.4% | 35 |
| bts.mega.Gnarly 1.4 | 3.7 | 11.9% | 51 |
| hadur117.nano.SanaroS3 0.3 | 3.8 | 11.9% | 47 |
| cs.Wren 1.0 | 5.0 | 11.0% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 11.1% | 24 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.1% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.5% | 8 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.5% | 2 |
| bzdp.BoxCar 2.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.6 | 57.8 | 2 / 35 | 2285 |
| 2 | 3 | 56.7 | 63.5 | 7 / 35 | 2562 |
| 3 | 5 | 54.1 | 56.8 | 3 / 35 | 2525 |
| 4 | 3 | 57.5 | 66.0 | 4 / 35 | 2872 |
| 5 | 4 | 57.1 | 63.5 | 4 / 35 | 2925 |
| 6 | 2 | 59.9 | 73.3 | 6 / 35 | 3010 |
| 7 | 4 | 54.5 | 59.4 | 2 / 35 | 2717 |
| 8 | 5 | 56.2 | 63.2 | 4 / 35 | 2615 |
| 9 | 3 | 58.4 | 65.7 | 7 / 35 | 2984 |
| 10 | 4 | 59.2 | 70.5 | 8 / 35 | 2798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 57 | 53% |
| bts.mega.Gnarly 1.4 | 20 | 25% |
| bvh.mini.Freya 0.55 | 12 | 58% |
| cs.Wren 1.0 | 8 | 25% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 0% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 25% |
| kdf.KoulDestroyer 1.0 | 3 | 67% |

Hadur died in 303 of 350 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 92 | 30% | 122 |
| bvh.mini.Freya 0.55 | 53 | 17% | 56 |
| bts.mega.Gnarly 1.4 | 45 | 15% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 12% | 37 |
| kdf.KoulDestroyer 1.0 | 32 | 11% | 34 |
| cs.Wren 1.0 | 30 | 10% | 32 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 3% | 10 |
| matt.UnderDark3 2.4.34 | 4 | 1% | 5 |
| bzdp.BoxCar 2.0 | 3 | 1% | 4 |

## Melee bench: F39

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 64.2 | 32 / 350 | 4.22 | 12.0% | 30792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.3 | 15.1% | 68 |
| az.Ololobot 0.2.4 | 2.2 | 13.8% | 130 |
| hadur117.nano.SanaroS3 0.3 | 3.3 | 12.0% | 32 |
| catcat20.Lambda 0.024 | 3.5 | 11.6% | 56 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 10.3% | 38 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.7% | 11 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.9% | 6 |
| gimp.GimpBot 0.1 | 7.1 | 8.5% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 6.0% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 52.6 | 54.6 | 3 / 35 | 3018 |
| 2 | 4 | 56.0 | 62.5 | 2 / 35 | 3111 |
| 3 | 2 | 59.8 | 75.2 | 3 / 35 | 3252 |
| 4 | 3 | 58.4 | 69.8 | 1 / 35 | 3353 |
| 5 | 4 | 54.1 | 59.4 | 3 / 35 | 2831 |
| 6 | 4 | 53.1 | 59.0 | 2 / 35 | 2509 |
| 7 | 3 | 55.9 | 62.2 | 1 / 35 | 3311 |
| 8 | 3 | 56.7 | 62.5 | 6 / 35 | 3170 |
| 9 | 4 | 56.1 | 63.2 | 4 / 35 | 2904 |
| 10 | 2 | 60.3 | 73.3 | 7 / 35 | 3333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 52 | 8% |
| bvh.fry.Freya 0.82 | 27 | 26% |
| catcat20.Lambda 0.024 | 21 | 48% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 25% |
| gimp.GimpBot 0.1 | 5 | 60% |
| winamp32.micro.MicroMacro 1.0 | 5 | 40% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |

Hadur died in 318 of 350 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 84 | 26% | 95 |
| az.Ololobot 0.2.4 | 70 | 22% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 46 | 14% | 47 |
| catcat20.Lambda 0.024 | 38 | 12% | 46 |
| apollokidd.ApolloKidd 0.9 | 32 | 10% | 34 |
| gimp.GimpBot 0.1 | 20 | 6% | 24 |
| winamp32.micro.MicroMacro 1.0 | 15 | 5% | 19 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 3% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 4 | 1% | 4 |

## Melee bench: F41

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 71.8 | 102 / 350 | 3.54 | 13.9% | 30455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.9% | 141 |
| hadur117.nano.SanaroS3 0.3 | 2.8 | 13.9% | 102 |
| ary.Swarm 1.1 | 2.9 | 13.6% | 25 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 13.1% | 37 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.5% | 34 |
| shrub.Silver v048 | 6.1 | 8.8% | 6 |
| zyx.nano.Ant 1.1 | 7.0 | 8.2% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.0% | 3 |
| stelo.Mirror 1.1 | 8.7 | 5.7% | 3 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 78.1 | 11 / 35 | 3278 |
| 2 | 4 | 59.6 | 65.7 | 8 / 35 | 2907 |
| 3 | 2 | 63.6 | 76.5 | 13 / 35 | 3355 |
| 4 | 4 | 58.6 | 64.8 | 10 / 35 | 2770 |
| 5 | 2 | 61.5 | 72.1 | 11 / 35 | 2968 |
| 6 | 2 | 60.9 | 70.8 | 9 / 35 | 3088 |
| 7 | 5 | 58.5 | 63.2 | 8 / 35 | 2852 |
| 8 | 3 | 61.2 | 73.3 | 9 / 35 | 2891 |
| 9 | 2 | 63.4 | 77.8 | 12 / 35 | 3158 |
| 10 | 2 | 62.2 | 75.9 | 11 / 35 | 3188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 70 | 57% |
| ary.Swarm 1.1 | 29 | 83% |
| lessonz.robocode.Oz 0.5.0 | 24 | 71% |
| simonton.nano.MeleeSeed 1.8 | 19 | 68% |
| shrub.Silver v048 | 4 | 75% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 2 | 50% |

Hadur died in 248 of 350 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 71 | 29% | 107 |
| ary.Swarm 1.1 | 64 | 26% | 88 |
| lessonz.robocode.Oz 0.5.0 | 41 | 17% | 56 |
| simonton.nano.MeleeSeed 1.8 | 37 | 15% | 52 |
| zyx.nano.Ant 1.1 | 12 | 5% | 14 |
| stelo.Mirror 1.1 | 9 | 4% | 8 |
| shrub.Silver v048 | 8 | 3% | 13 |
| jsal.Jsalbot 1.0 | 4 | 2% | 9 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 72.7 | 77 / 350 | 3.46 | 13.9% | 33925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.3% | 154 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 14.3% | 43 |
| hadur117.nano.SanaroS3 0.3 | 3.1 | 13.9% | 77 |
| ara.Shera 0.88 | 3.1 | 14.0% | 64 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 5 |
| maribo.IotaCT 1.1 | 6.3 | 7.6% | 2 |
| dsw.StaticD 1.0 | 6.8 | 7.3% | 6 |
| mme.NikeEnhanced 2.0 | 8.9 | 5.3% | 0 |
| stelo.MirrorMicro 1.0 | 8.9 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.1 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.6 | 76.8 | 8 / 35 | 3594 |
| 2 | 2 | 61.9 | 74.6 | 10 / 35 | 3499 |
| 3 | 4 | 60.0 | 69.8 | 6 / 35 | 3482 |
| 4 | 4 | 59.7 | 69.8 | 6 / 35 | 3134 |
| 5 | 2 | 63.6 | 77.8 | 12 / 35 | 3686 |
| 6 | 3 | 61.4 | 73.3 | 7 / 35 | 3536 |
| 7 | 4 | 58.5 | 65.4 | 7 / 35 | 3150 |
| 8 | 4 | 58.1 | 68.3 | 3 / 35 | 2977 |
| 9 | 3 | 61.4 | 73.0 | 9 / 35 | 3410 |
| 10 | 2 | 62.9 | 78.1 | 9 / 35 | 3457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 79 | 43% |
| ara.Shera 0.88 | 37 | 54% |
| maribo.mini.MiniQuester 0.1 | 26 | 62% |
| dsw.StaticD 1.0 | 6 | 83% |
| amz.NanoClone 1.41 | 2 | 50% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 274 of 350 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 106 | 39% | 137 |
| ara.Shera 0.88 | 60 | 22% | 82 |
| maribo.mini.MiniQuester 0.1 | 57 | 21% | 75 |
| amz.NanoClone 1.41 | 24 | 9% | 24 |
| dsw.StaticD 1.0 | 8 | 3% | 13 |
| maribo.IotaCT 1.1 | 8 | 3% | 9 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 6 | 2% | 6 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 60.1 | 20 / 350 | 4.59 | 11.1% | 26757 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.9% | 273 |
| brainfade.melee.Dusk 0.44 | 2.6 | 13.1% | 32 |
| dummy.micro.Sparrow 2.5 | 2.9 | 12.2% | 10 |
| wcsv.melee.EngineerMelee 0.1 | 4.2 | 11.2% | 9 |
| hadur117.nano.SanaroS3 0.3 | 4.8 | 11.1% | 20 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 10.1% | 4 |
| mz.NanoGod 2.02 | 7.4 | 8.0% | 1 |
| jab.DiamondStealer 5 | 7.6 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 56.3 | 58.7 | 1 / 35 | 2617 |
| 2 | 5 | 55.8 | 55.9 | 2 / 35 | 2710 |
| 3 | 6 | 55.1 | 56.5 | 1 / 35 | 2270 |
| 4 | 5 | 56.2 | 59.4 | 1 / 35 | 2370 |
| 5 | 4 | 59.4 | 64.8 | 4 / 35 | 2997 |
| 6 | 6 | 55.9 | 57.1 | 0 / 35 | 2448 |
| 7 | 4 | 57.9 | 62.2 | 1 / 35 | 2956 |
| 8 | 4 | 57.2 | 57.8 | 3 / 35 | 2977 |
| 9 | 4 | 59.9 | 67.6 | 3 / 35 | 2795 |
| 10 | 4 | 57.8 | 60.6 | 4 / 35 | 2617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 76 | 14% |
| brainfade.melee.Dusk 0.44 | 10 | 70% |
| dummy.micro.Sparrow 2.5 | 5 | 40% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 0% |

Hadur died in 330 of 350 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 160 | 48% | 171 |
| brainfade.melee.Dusk 0.44 | 41 | 12% | 47 |
| wcsv.melee.EngineerMelee 0.1 | 40 | 12% | 40 |
| dummy.micro.Sparrow 2.5 | 38 | 12% | 41 |
| mz.NanoGod 2.02 | 19 | 6% | 19 |
| jab.DiamondStealer 5 | 15 | 5% | 15 |
| Krabb.akim2.Akim2 1.1b | 12 | 4% | 12 |
| cvt.Firsty 1.0 | 5 | 2% | 5 |

## Melee bench: F44

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 71.7 | 87 / 350 | 3.55 | 14.2% | 35178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 1.6 | 16.2% | 104 |
| stelo.Liblix 0.3.1 | 1.6 | 16.1% | 116 |
| hadur117.nano.SanaroS3 0.3 | 2.8 | 14.2% | 87 |
| wompi.Quokka 1.6 | 4.3 | 11.0% | 13 |
| jwirde.Gort 2.0 | 4.9 | 10.3% | 20 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 9.3% | 6 |
| disan.Chair 2.2.0 | 7.2 | 7.7% | 4 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.4% | 3 |
| sample.Crazy 1.0 | 9.3 | 4.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 79.7 | 12 / 35 | 3705 |
| 2 | 3 | 62.2 | 73.3 | 11 / 35 | 3288 |
| 3 | 3 | 61.8 | 71.4 | 9 / 35 | 3662 |
| 4 | 3 | 60.1 | 65.4 | 8 / 35 | 3729 |
| 5 | 3 | 61.2 | 71.4 | 9 / 35 | 3490 |
| 6 | 3 | 58.6 | 64.1 | 6 / 35 | 3432 |
| 7 | 3 | 60.2 | 68.6 | 3 / 35 | 3334 |
| 8 | 3 | 60.9 | 70.8 | 9 / 35 | 3151 |
| 9 | 3 | 63.8 | 77.8 | 8 / 35 | 3745 |
| 10 | 3 | 63.2 | 74.6 | 12 / 35 | 3642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 70 | 60% |
| tzu.TheArtOfWar 1.2 | 60 | 30% |
| jwirde.Gort 2.0 | 16 | 56% |
| wompi.Quokka 1.6 | 11 | 82% |
| disan.Chair 2.2.0 | 4 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 67% |

Hadur died in 263 of 350 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 87 | 33% | 131 |
| tzu.TheArtOfWar 1.2 | 81 | 31% | 102 |
| jwirde.Gort 2.0 | 26 | 10% | 38 |
| wompi.Quokka 1.6 | 24 | 9% | 27 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 17 | 6% | 18 |
| stf.PanzerGeneral 0.1 | 16 | 6% | 19 |
| disan.Chair 2.2.0 | 6 | 2% | 8 |
| amk.jointstrike.JointStrike 0.2 | 5 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 0% | 2 |

## Melee bench: F45

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 71.2 | 61 / 350 | 3.59 | 14.4% | 37452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.3 | 14.4% | 61 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.1% | 184 |
| jje.BagPuss 1.2 | 2.5 | 12.8% | 22 |
| sul.Lunar 1.1 | 4.3 | 11.2% | 32 |
| myl.nano.Graviton 1.10 | 4.8 | 11.0% | 21 |
| hvilela.HVilela 0.9 | 6.6 | 9.2% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.4% | 12 |
| fm.claire 1.7 | 7.4 | 8.5% | 2 |
| wit.Deep7 2.0 | 9.0 | 6.3% | 14 |
| abud.ThirdRobo 1.0 | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 72.4 | 5 / 35 | 4032 |
| 2 | 2 | 58.8 | 65.1 | 5 / 35 | 3318 |
| 3 | 2 | 58.1 | 64.4 | 2 / 35 | 3610 |
| 4 | 1 | 59.5 | 67.6 | 5 / 35 | 3645 |
| 5 | 1 | 60.5 | 71.4 | 6 / 35 | 3582 |
| 6 | 2 | 61.8 | 72.7 | 9 / 35 | 3638 |
| 7 | 1 | 61.0 | 70.2 | 7 / 35 | 3890 |
| 8 | 1 | 62.8 | 78.4 | 6 / 35 | 3558 |
| 9 | 1 | 60.4 | 69.2 | 6 / 35 | 3755 |
| 10 | 1 | 65.1 | 81.0 | 10 / 35 | 4424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 96 | 34% |
| sul.Lunar 1.1 | 19 | 16% |
| jje.BagPuss 1.2 | 15 | 40% |
| myl.nano.Graviton 1.10 | 14 | 50% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 75% |
| wit.Deep7 2.0 | 5 | 60% |
| fm.claire 1.7 | 3 | 67% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 290 of 350 rounds, at a mean tick of 1353. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 78 | 27% | 0 |
| jje.BagPuss 1.2 | 58 | 20% | 92 |
| myl.nano.Graviton 1.10 | 46 | 16% | 76 |
| sul.Lunar 1.1 | 43 | 15% | 82 |
| hvilela.HVilela 0.9 | 24 | 8% | 31 |
| fm.claire 1.7 | 21 | 7% | 25 |
| pez.mini.ChironexFleckeri 0.5 | 11 | 4% | 20 |
| wit.Deep7 2.0 | 5 | 2% | 14 |
| abud.ThirdRobo 1.0 | 4 | 1% | 8 |

## Melee bench: F46

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 71.9 | 50 / 350 | 3.53 | 13.0% | 28088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.8% | 128 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.1% | 140 |
| hadur117.nano.SanaroS3 0.3 | 3.0 | 13.0% | 50 |
| mz.MicroSheep 1.0 | 4.5 | 10.6% | 6 |
| cx.Princess 1.0 | 5.0 | 9.9% | 20 |
| sadoner.killer 0.2 | 5.5 | 9.6% | 5 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.4% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.0% | 0 |
| kurios.DOSexe .9a | 8.9 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.7 | 66.0 | 3 / 35 | 2708 |
| 2 | 3 | 60.5 | 74.9 | 4 / 35 | 2758 |
| 3 | 3 | 60.3 | 71.7 | 7 / 35 | 3124 |
| 4 | 3 | 57.6 | 68.9 | 2 / 35 | 2493 |
| 5 | 3 | 59.7 | 70.2 | 7 / 35 | 2850 |
| 6 | 3 | 61.5 | 74.0 | 8 / 35 | 3093 |
| 7 | 3 | 60.9 | 75.9 | 6 / 35 | 2725 |
| 8 | 3 | 59.3 | 70.2 | 6 / 35 | 2802 |
| 9 | 3 | 59.8 | 73.3 | 4 / 35 | 2734 |
| 10 | 3 | 60.2 | 73.7 | 3 / 35 | 2801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 79 | 46% |
| rsalesc.melee.Medina 0.4.5 | 40 | 18% |
| cx.Princess 1.0 | 6 | 67% |
| mz.MicroSheep 1.0 | 5 | 20% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| sadoner.killer 0.2 | 2 | 0% |

Hadur died in 300 of 350 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 120 | 40% | 156 |
| rsalesc.melee.Medina 0.4.5 | 90 | 30% | 98 |
| mz.MicroSheep 1.0 | 30 | 10% | 32 |
| sadoner.killer 0.2 | 25 | 8% | 25 |
| cx.Princess 1.0 | 17 | 6% | 18 |
| arthord.NanoSatanMelee Beta | 6 | 2% | 8 |
| jeremyreeder.collective.Prophet 5 | 6 | 2% | 6 |
| kurios.DOSexe .9a | 5 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 2 |

