# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 75.9 | 54 / 350 | 3.17 | 14.1% | 36789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 231 |
| hadur117.nano.SanaroCL22 0.1 | 2.0 | 14.1% | 54 |
| sgp.JollyNinja 3.53 | 4.0 | 11.4% | 37 |
| mz.MicroGodMelee 1 | 4.0 | 11.4% | 10 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.3% | 8 |
| lorneswork.Predator 1.0 | 5.7 | 9.9% | 10 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.9% | 1 |
| skm.butterfly 1.0 | 8.9 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 73.0 | 4 / 35 | 3441 |
| 2 | 2 | 63.2 | 79.4 | 7 / 35 | 3713 |
| 3 | 2 | 61.0 | 73.0 | 5 / 35 | 3537 |
| 4 | 2 | 64.1 | 82.2 | 7 / 35 | 3701 |
| 5 | 2 | 62.0 | 74.6 | 5 / 35 | 4024 |
| 6 | 2 | 62.6 | 75.9 | 7 / 35 | 3836 |
| 7 | 2 | 61.4 | 76.2 | 2 / 35 | 3579 |
| 8 | 2 | 62.3 | 77.5 | 5 / 35 | 4035 |
| 9 | 2 | 62.0 | 74.0 | 7 / 35 | 3631 |
| 10 | 2 | 61.4 | 73.7 | 5 / 35 | 3292 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 128 | 11% |
| mz.MicroGodMelee 1 | 24 | 83% |
| sgp.JollyNinja 3.53 | 19 | 47% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 80% |
| lorneswork.Predator 1.0 | 7 | 29% |
| adt.Ar2 1.0 | 2 | 50% |

Hadur died in 297 of 350 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 155 | 52% | 170 |
| sgp.JollyNinja 3.53 | 40 | 13% | 45 |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 9% | 29 |
| mz.MicroGodMelee 1 | 26 | 9% | 49 |
| lorneswork.Predator 1.0 | 25 | 8% | 26 |
| adt.Ar2 1.0 | 15 | 5% | 20 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 2% | 8 |
| skm.butterfly 1.0 | 1 | 0% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 69.0 | 70 / 350 | 3.79 | 14.2% | 41542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL22 0.1 | 1.9 | 14.2% | 70 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 14.2% | 74 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.4% | 103 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 11.2% | 8 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.9 | 10.4% | 26 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.3% | 10 |
| sch.Simone 0.3d | 7.3 | 8.0% | 24 |
| Noran.BitchingElk 0.054 | 7.5 | 7.9% | 24 |
| stelo.PatternRobot 1.0 | 8.3 | 7.1% | 11 |
| fullsail.SweetTea 1.1 | 10.0 | 4.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.6 | 67.3 | 10 / 35 | 3966 |
| 2 | 1 | 63.2 | 73.0 | 12 / 35 | 4343 |
| 3 | 2 | 59.6 | 65.4 | 8 / 35 | 4047 |
| 4 | 2 | 61.3 | 68.6 | 3 / 35 | 4360 |
| 5 | 2 | 62.7 | 76.2 | 7 / 35 | 3897 |
| 6 | 2 | 58.9 | 63.5 | 6 / 35 | 3965 |
| 7 | 3 | 55.2 | 57.5 | 1 / 35 | 3445 |
| 8 | 2 | 61.8 | 69.8 | 6 / 35 | 4494 |
| 9 | 3 | 61.6 | 69.5 | 6 / 35 | 4501 |
| 10 | 1 | 64.8 | 79.4 | 11 / 35 | 4524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 48 | 29% |
| pulsar.PulsarMax 0.8.9 | 46 | 30% |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 67% |
| sch.Simone 0.3d | 14 | 50% |
| Noran.BitchingElk 0.054 | 11 | 45% |
| fnc.bandit.Bandit 5.2.0 | 10 | 40% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| stelo.PatternRobot 1.0 | 6 | 67% |
| fullsail.SweetTea 1.1 | 3 | 33% |

Hadur died in 281 of 350 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 74 | 26% | 95 |
| pulsar.PulsarMax 0.8.9 | 69 | 25% | 79 |
| lrem.micro.SpikeSoldier 0.4 | 39 | 14% | 42 |
| com.cohesiva.robocode.ManOwaR 1.0 | 25 | 9% | 38 |
| sch.Simone 0.3d | 25 | 9% | 32 |
| stelo.PatternRobot 1.0 | 17 | 6% | 22 |
| fnc.bandit.Bandit 5.2.0 | 14 | 5% | 18 |
| Noran.BitchingElk 0.054 | 12 | 4% | 18 |
| fullsail.SweetTea 1.1 | 5 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 78.7 | 66 / 350 | 2.92 | 14.9% | 40982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.7 | 15.4% | 103 |
| kawigi.nano.Lib 1.0 | 2.1 | 15.0% | 91 |
| hadur117.nano.SanaroCL22 0.1 | 2.2 | 14.9% | 66 |
| vuen.Cake 2.51 | 4.0 | 13.0% | 67 |
| urdos.URDOS 1.3 | 5.0 | 10.6% | 19 |
| adt.Ar1 2.1 | 6.5 | 7.6% | 1 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.9% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.9 | 5.7% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 73.0 | 4 / 35 | 4288 |
| 2 | 2 | 64.1 | 81.9 | 10 / 35 | 4215 |
| 3 | 1 | 63.7 | 81.9 | 9 / 35 | 3954 |
| 4 | 3 | 61.7 | 74.9 | 5 / 35 | 3964 |
| 5 | 2 | 63.1 | 80.0 | 8 / 35 | 4133 |
| 6 | 3 | 61.4 | 77.1 | 4 / 35 | 3810 |
| 7 | 2 | 63.4 | 79.7 | 7 / 35 | 4353 |
| 8 | 2 | 63.7 | 83.2 | 8 / 35 | 4012 |
| 9 | 3 | 62.1 | 76.8 | 6 / 35 | 4108 |
| 10 | 2 | 62.5 | 78.1 | 5 / 35 | 4145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 71 | 38% |
| kawigi.nano.Lib 1.0 | 55 | 9% |
| vuen.Cake 2.51 | 43 | 53% |
| urdos.URDOS 1.3 | 18 | 50% |
| adt.Ar1 2.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 103 | 36% | 112 |
| radnor.DoctorBob 1.42 | 81 | 29% | 102 |
| urdos.URDOS 1.3 | 47 | 17% | 57 |
| vuen.Cake 2.51 | 35 | 12% | 56 |
| adt.Ar1 2.1 | 7 | 2% | 8 |
| oa.weak.FlyMk1 0.1 | 4 | 1% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 0% | 3 |

## Melee bench: F04

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 71.5 | 7 / 350 | 3.57 | 13.7% | 42580 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.1% | 323 |
| apc.LeeroyJenkins2 1.0 | 2.4 | 13.6% | 12 |
| hadur117.nano.SanaroCL22 0.1 | 2.6 | 13.7% | 7 |
| TNT.TNT 0.99.1 | 4.1 | 10.5% | 5 |
| josago.Jorgito 0.16 | 5.2 | 9.2% | 2 |
| css.Delitioner 0.11 | 6.3 | 8.0% | 1 |
| tj.zombie1n 1.0.1 | 6.4 | 7.3% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 76.8 | 1 / 35 | 4370 |
| 2 | 2 | 65.1 | 78.7 | 0 / 35 | 5048 |
| 3 | 3 | 62.6 | 73.0 | 2 / 35 | 4443 |
| 4 | 2 | 63.4 | 75.9 | 0 / 35 | 4344 |
| 5 | 3 | 59.6 | 65.1 | 0 / 35 | 3956 |
| 6 | 2 | 61.9 | 72.4 | 1 / 35 | 4154 |
| 7 | 3 | 61.7 | 73.3 | 1 / 35 | 3570 |
| 8 | 3 | 61.5 | 67.3 | 0 / 35 | 4399 |
| 9 | 3 | 58.9 | 61.6 | 2 / 35 | 4016 |
| 10 | 3 | 61.7 | 70.8 | 0 / 35 | 4280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 150 | 1% |
| apc.LeeroyJenkins2 1.0 | 4 | 50% |
| TNT.TNT 0.99.1 | 3 | 100% |

Hadur died in 343 of 350 rounds, at a mean tick of 1049. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 226 | 66% | 227 |
| apc.LeeroyJenkins2 1.0 | 44 | 13% | 48 |
| josago.Jorgito 0.16 | 24 | 7% | 24 |
| TNT.TNT 0.99.1 | 15 | 4% | 17 |
| tj.zombie1n 1.0.1 | 13 | 4% | 13 |
| css.Delitioner 0.11 | 11 | 3% | 11 |
| rampancy.Durandal 2.1d | 6 | 2% | 6 |
| sp.Nanos.Ember 1.1 | 4 | 1% | 4 |

## Melee bench: F06

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 71.6 | 83 / 350 | 3.56 | 13.9% | 34187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.6 | 15.3% | 82 |
| origin.SleepSiphon 1.7b | 2.2 | 14.2% | 100 |
| hadur117.nano.SanaroCL22 0.1 | 2.5 | 13.9% | 83 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.3% | 45 |
| mld.Wisdom 1.0 | 4.9 | 11.5% | 12 |
| gg.Wolverine 2.0 | 6.8 | 8.2% | 7 |
| spinnercat.Omen 1.0 | 7.0 | 7.9% | 8 |
| DBall.NUKE 0.1 | 7.4 | 7.3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 8.8 | 6.3% | 7 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 78.7 | 11 / 35 | 3655 |
| 2 | 2 | 62.5 | 74.6 | 11 / 35 | 3720 |
| 3 | 2 | 60.9 | 73.7 | 7 / 35 | 3145 |
| 4 | 3 | 57.7 | 64.4 | 6 / 35 | 3155 |
| 5 | 3 | 61.8 | 73.0 | 8 / 35 | 3573 |
| 6 | 2 | 62.5 | 75.6 | 9 / 35 | 3537 |
| 7 | 3 | 58.0 | 64.1 | 8 / 35 | 2942 |
| 8 | 3 | 60.9 | 70.2 | 8 / 35 | 3428 |
| 9 | 3 | 62.2 | 74.0 | 9 / 35 | 3584 |
| 10 | 3 | 59.6 | 67.3 | 6 / 35 | 3448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 54 | 46% |
| origin.SleepSiphon 1.7b | 42 | 38% |
| pe.minimelee.SandboxMiniMelee 1.1 | 32 | 59% |
| gg.Wolverine 2.0 | 8 | 50% |
| mld.Wisdom 1.0 | 8 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 67% |
| spinnercat.Omen 1.0 | 6 | 67% |
| DBall.NUKE 0.1 | 4 | 100% |

Hadur died in 267 of 350 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 80 | 30% | 99 |
| origin.SleepSiphon 1.7b | 58 | 22% | 79 |
| mld.Wisdom 1.0 | 47 | 18% | 52 |
| pe.minimelee.SandboxMiniMelee 1.1 | 41 | 15% | 67 |
| spinnercat.Omen 1.0 | 17 | 6% | 18 |
| gg.Wolverine 2.0 | 11 | 4% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 2% | 10 |
| DBall.NUKE 0.1 | 5 | 2% | 7 |
| sample.Fire 1.0 | 3 | 1% | 3 |

## Melee bench: F07

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.6 | 85 / 350 | 2.66 | 16.3% | 47774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.6 | 18.0% | 98 |
| rtk.Tachikoma 1.0 | 1.6 | 17.7% | 105 |
| hadur117.nano.SanaroCL22 0.1 | 2.8 | 16.3% | 85 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.5% | 32 |
| franzor.Lizt 1.3.1 | 4.7 | 11.1% | 31 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.3 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.4 | 79.4 | 7 / 35 | 5099 |
| 2 | 2 | 67.9 | 82.9 | 12 / 35 | 4954 |
| 3 | 3 | 67.9 | 84.4 | 10 / 35 | 5008 |
| 4 | 3 | 66.8 | 82.2 | 8 / 35 | 4580 |
| 5 | 3 | 66.5 | 79.7 | 11 / 35 | 4505 |
| 6 | 3 | 66.2 | 81.3 | 6 / 35 | 4903 |
| 7 | 3 | 66.4 | 81.0 | 6 / 35 | 4875 |
| 8 | 2 | 67.3 | 84.1 | 8 / 35 | 5142 |
| 9 | 3 | 66.7 | 84.1 | 10 / 35 | 4301 |
| 10 | 3 | 65.2 | 76.5 | 7 / 35 | 4407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 96 | 51% |
| rsalesc.melee.Monk 0.3.6c | 55 | 24% |
| oog.melee.CapuletDroid 1.1 | 31 | 52% |
| franzor.Lizt 1.3.1 | 15 | 47% |

Hadur died in 265 of 350 rounds, at a mean tick of 1402. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 128 | 48% | 187 |
| rsalesc.melee.Monk 0.3.6c | 82 | 31% | 97 |
| oog.melee.CapuletDroid 1.1 | 33 | 12% | 49 |
| franzor.Lizt 1.3.1 | 12 | 5% | 2 |
| lrem.micro.MoggFanatic 0.2 | 6 | 2% | 7 |
| exauge.GateKeeper 1.1.121g | 3 | 1% | 5 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 71.5 | 96 / 350 | 3.57 | 14.0% | 33315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL22 0.1 | 1.7 | 14.0% | 96 |
| shrub.Vapour v159 | 2.2 | 13.4% | 83 |
| tm.Yuugao 1.0 | 2.5 | 13.6% | 81 |
| Krabb.sliNk.Garm 0.9u | 4.1 | 10.9% | 33 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.9% | 23 |
| m3thos.Eva00 1.1 | 5.8 | 9.1% | 19 |
| jwst.DAD.DarkAndDarker 1.1 | 6.9 | 8.3% | 17 |
| qualidafial.MajorDick 1.0.1 | 8.9 | 6.8% | 2 |
| SHAM.WOW 1.4 | 8.9 | 7.1% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 7.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.0 | 66.7 | 12 / 35 | 3199 |
| 2 | 2 | 58.1 | 67.0 | 7 / 35 | 3277 |
| 3 | 1 | 62.6 | 79.4 | 11 / 35 | 3456 |
| 4 | 2 | 57.6 | 66.3 | 7 / 35 | 3017 |
| 5 | 2 | 62.7 | 76.2 | 11 / 35 | 3758 |
| 6 | 2 | 58.3 | 67.3 | 8 / 35 | 3198 |
| 7 | 1 | 60.4 | 72.4 | 11 / 35 | 3162 |
| 8 | 2 | 59.8 | 70.8 | 10 / 35 | 3278 |
| 9 | 1 | 62.5 | 78.4 | 11 / 35 | 3516 |
| 10 | 2 | 59.6 | 70.2 | 8 / 35 | 3454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 53 | 64% |
| shrub.Vapour v159 | 37 | 27% |
| Krabb.sliNk.Garm 0.9u | 19 | 74% |
| m3thos.Eva00 1.1 | 17 | 47% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 58% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 82% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| SHAM.WOW 1.4 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |

Hadur died in 255 of 350 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 75 | 29% | 89 |
| tm.Yuugao 1.0 | 54 | 21% | 95 |
| Krabb.sliNk.Garm 0.9u | 29 | 11% | 38 |
| com.spp.robocode.MostlyHarmless 010 | 25 | 10% | 33 |
| m3thos.Eva00 1.1 | 24 | 9% | 30 |
| jwst.DAD.DarkAndDarker 1.1 | 20 | 8% | 28 |
| zyx.nano.BacillusComma 1.0 | 12 | 5% | 14 |
| SHAM.WOW 1.4 | 8 | 3% | 13 |
| qualidafial.MajorDick 1.0.1 | 7 | 3% | 8 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 60.8 | 35 / 350 | 4.53 | 11.7% | 28601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.1% | 186 |
| kc.micro.Figment 1.0 | 2.0 | 15.3% | 65 |
| hadur117.nano.SanaroCL22 0.1 | 3.7 | 11.7% | 35 |
| yagami.Tidus 0.11 | 4.1 | 11.3% | 7 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.6% | 29 |
| mc2.enemy.Original 0.9 | 5.4 | 9.9% | 25 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 3 |
| step.nanoPri 1.0 | 8.2 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.2 | 60.6 | 1 / 35 | 2882 |
| 2 | 3 | 55.8 | 59.0 | 3 / 35 | 2903 |
| 3 | 4 | 57.9 | 62.5 | 5 / 35 | 2835 |
| 4 | 4 | 57.6 | 64.4 | 4 / 35 | 2764 |
| 5 | 6 | 53.1 | 54.3 | 2 / 35 | 2369 |
| 6 | 3 | 56.5 | 60.6 | 4 / 35 | 2741 |
| 7 | 4 | 55.3 | 59.0 | 3 / 35 | 2746 |
| 8 | 3 | 58.1 | 63.2 | 4 / 35 | 3265 |
| 9 | 3 | 57.7 | 62.9 | 4 / 35 | 2956 |
| 10 | 3 | 57.0 | 61.3 | 5 / 35 | 3140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 52 | 25% |
| kc.micro.Figment 1.0 | 22 | 45% |
| pedersen.Grishnakh 1.0 | 9 | 22% |
| yagami.Tidus 0.11 | 8 | 75% |
| mc2.enemy.Original 0.9 | 8 | 38% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 315 of 350 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 91 | 29% | 105 |
| kc.micro.Figment 1.0 | 68 | 22% | 79 |
| yagami.Tidus 0.11 | 61 | 19% | 68 |
| mc2.enemy.Original 0.9 | 30 | 10% | 33 |
| pedersen.Grishnakh 1.0 | 30 | 10% | 30 |
| robar.nano.Assertive_Melee 0.2 | 14 | 4% | 14 |
| step.nanoPri 1.0 | 11 | 3% | 11 |
| dft.Calliope 5.6 | 7 | 2% | 7 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |

## Melee bench: F10

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 78.9 | 109 / 350 | 2.90 | 15.4% | 40738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL22 0.1 | 1.4 | 15.4% | 109 |
| DTF.Kludgy 1.2b | 2.0 | 14.8% | 84 |
| ne.Chimera 1.2 | 3.2 | 13.4% | 40 |
| ejb.Polaris 1.0.1 | 3.4 | 13.0% | 51 |
| tvv.micro.Antares 1.1.1 | 5.3 | 11.1% | 37 |
| vStar.RAFzilla 2.15 | 5.7 | 10.5% | 16 |
| sam.Samspin 1.0 | 7.6 | 6.4% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.9% | 1 |
| kurios.DOSexe .9b | 8.6 | 5.1% | 1 |
| donjezza.Muncho 1.0 | 9.5 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 74.9 | 10 / 35 | 3489 |
| 2 | 1 | 61.9 | 73.0 | 12 / 35 | 3724 |
| 3 | 2 | 63.1 | 78.4 | 11 / 35 | 3806 |
| 4 | 1 | 63.9 | 78.7 | 8 / 35 | 4287 |
| 5 | 1 | 63.5 | 81.3 | 12 / 35 | 3865 |
| 6 | 2 | 64.4 | 80.0 | 12 / 35 | 4269 |
| 7 | 1 | 64.0 | 79.7 | 10 / 35 | 4432 |
| 8 | 2 | 62.7 | 77.5 | 8 / 35 | 4135 |
| 9 | 1 | 65.6 | 82.5 | 14 / 35 | 4535 |
| 10 | 1 | 64.9 | 82.9 | 12 / 35 | 4196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 58 | 47% |
| ejb.Polaris 1.0.1 | 52 | 79% |
| ne.Chimera 1.2 | 31 | 48% |
| tvv.micro.Antares 1.1.1 | 22 | 36% |
| vStar.RAFzilla 2.15 | 17 | 76% |
| sam.Samspin 1.0 | 5 | 20% |
| kurios.DOSexe .9b | 3 | 100% |
| donjezza.Muncho 1.0 | 3 | 33% |

Hadur died in 244 of 350 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 78 | 32% | 105 |
| ne.Chimera 1.2 | 65 | 27% | 83 |
| tvv.micro.Antares 1.1.1 | 39 | 16% | 38 |
| ejb.Polaris 1.0.1 | 29 | 12% | 69 |
| sam.Samspin 1.0 | 12 | 5% | 13 |
| vStar.RAFzilla 2.15 | 11 | 5% | 24 |
| donjezza.Muncho 1.0 | 4 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 2% | 5 |
| kurios.DOSexe .9b | 2 | 1% | 7 |

## Melee bench: F11

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 61.7 | 37 / 350 | 4.45 | 11.9% | 30196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.0% | 141 |
| cx.mini.Nimrod 0.55 | 2.7 | 12.9% | 52 |
| hadur117.nano.SanaroCL22 0.1 | 3.3 | 11.9% | 37 |
| djc.DynaBot 0.1.1 | 3.6 | 11.3% | 31 |
| rdt199.Warlord 0.73 | 5.5 | 9.8% | 27 |
| br2.MobyDickBot 1.6 | 5.6 | 9.8% | 29 |
| uji.YellohFellah 1.0 | 6.5 | 9.2% | 30 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.4% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.7% | 2 |
| stelo.MirrorNano 1.3 | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.3 | 61.3 | 3 / 35 | 2783 |
| 2 | 2 | 58.7 | 66.7 | 4 / 35 | 3465 |
| 3 | 4 | 55.0 | 61.6 | 3 / 35 | 2496 |
| 4 | 4 | 54.4 | 56.5 | 2 / 35 | 3139 |
| 5 | 2 | 57.0 | 64.8 | 5 / 35 | 2862 |
| 6 | 3 | 57.6 | 64.1 | 4 / 35 | 3145 |
| 7 | 7 | 47.6 | 43.2 | 0 / 35 | 2802 |
| 8 | 3 | 56.5 | 61.9 | 5 / 35 | 2859 |
| 9 | 2 | 60.2 | 68.9 | 6 / 35 | 3400 |
| 10 | 3 | 59.1 | 68.3 | 5 / 35 | 3245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 58 | 29% |
| cx.mini.Nimrod 0.55 | 14 | 43% |
| uji.YellohFellah 1.0 | 13 | 31% |
| djc.DynaBot 0.1.1 | 9 | 78% |
| br2.MobyDickBot 1.6 | 6 | 17% |
| KiraNL.Chupacabra 0.4 | 3 | 33% |
| rdt199.Warlord 0.73 | 1 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 114 | 36% | 127 |
| cx.mini.Nimrod 0.55 | 56 | 18% | 60 |
| rdt199.Warlord 0.73 | 31 | 10% | 35 |
| uji.YellohFellah 1.0 | 26 | 8% | 31 |
| djc.DynaBot 0.1.1 | 25 | 8% | 31 |
| br2.MobyDickBot 1.6 | 24 | 8% | 27 |
| KiraNL.Chupacabra 0.4 | 17 | 5% | 19 |
| jeremyreeder.Vincent 2011.12.09 | 13 | 4% | 13 |
| stelo.MirrorNano 1.3 | 7 | 2% | 7 |

## Melee bench: F12

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 70.6 | 61 / 350 | 3.65 | 13.4% | 28857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.8 | 14.6% | 103 |
| bts.wiki.RipCurl 0.9b | 2.1 | 14.1% | 79 |
| darkcanuck.Leon 1.01 | 2.9 | 13.4% | 68 |
| hadur117.nano.SanaroCL22 0.1 | 3.2 | 13.4% | 61 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 22 |
| jrm.Test0 1.0 | 6.5 | 8.1% | 1 |
| jp.Perpy 16.0 | 7.2 | 7.5% | 5 |
| cs.sheldor.Talon 1.1 | 7.6 | 7.1% | 2 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.9% | 6 |
| stuff.Vlad 0.1 | 9.6 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.9 | 68.3 | 6 / 35 | 2869 |
| 2 | 2 | 63.4 | 79.0 | 9 / 35 | 3338 |
| 3 | 4 | 58.4 | 66.7 | 7 / 35 | 2820 |
| 4 | 4 | 57.3 | 65.7 | 4 / 35 | 2664 |
| 5 | 4 | 59.6 | 72.7 | 2 / 35 | 2948 |
| 6 | 3 | 59.7 | 71.7 | 5 / 35 | 2900 |
| 7 | 1 | 61.3 | 75.9 | 10 / 35 | 2845 |
| 8 | 4 | 58.5 | 67.9 | 6 / 35 | 2858 |
| 9 | 4 | 59.3 | 69.2 | 7 / 35 | 2838 |
| 10 | 3 | 57.8 | 68.6 | 5 / 35 | 2777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 55 | 18% |
| darkcanuck.Leon 1.01 | 54 | 26% |
| bts.wiki.RipCurl 0.9b | 39 | 51% |
| brainfade.melee.Genghis 0.36 | 14 | 71% |
| jaybot.bots.Oddball 4.0 | 4 | 25% |
| jrm.Test0 1.0 | 3 | 100% |
| jp.Perpy 16.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 0% |

Hadur died in 289 of 350 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 79 | 27% | 91 |
| darkcanuck.Leon 1.01 | 65 | 22% | 83 |
| bts.wiki.RipCurl 0.9b | 54 | 19% | 72 |
| brainfade.melee.Genghis 0.36 | 37 | 13% | 40 |
| cs.sheldor.Talon 1.1 | 18 | 6% | 18 |
| jrm.Test0 1.0 | 14 | 5% | 16 |
| jaybot.bots.Oddball 4.0 | 9 | 3% | 10 |
| jp.Perpy 16.0 | 8 | 3% | 11 |
| stuff.Vlad 0.1 | 5 | 2% | 8 |

## Melee bench: F13

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 73.3 | 47 / 350 | 3.41 | 13.3% | 32547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.5% | 169 |
| ags.Glacier 0.2.11 | 1.8 | 17.0% | 89 |
| hadur117.nano.SanaroCL22 0.1 | 3.1 | 13.3% | 47 |
| shinh.Entangled 0.3 | 3.9 | 12.5% | 33 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.5% | 11 |
| apc.Colossus2 0.17 | 6.2 | 7.9% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.0% | 1 |
| ayk.WallHugger 1.0 | 8.1 | 5.5% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 71.7 | 5 / 35 | 3190 |
| 2 | 3 | 59.1 | 68.6 | 4 / 35 | 3300 |
| 3 | 3 | 60.1 | 73.0 | 6 / 35 | 3086 |
| 4 | 3 | 59.6 | 70.8 | 6 / 35 | 2909 |
| 5 | 4 | 59.9 | 70.5 | 1 / 35 | 3462 |
| 6 | 3 | 61.3 | 74.9 | 5 / 35 | 3144 |
| 7 | 3 | 63.8 | 81.3 | 7 / 35 | 3568 |
| 8 | 3 | 62.4 | 77.8 | 7 / 35 | 3162 |
| 9 | 3 | 62.0 | 76.5 | 4 / 35 | 3417 |
| 10 | 3 | 59.4 | 67.6 | 2 / 35 | 3309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 79 | 33% |
| ags.Glacier 0.2.11 | 50 | 20% |
| shinh.Entangled 0.3 | 20 | 35% |
| gh.micro.Gruweltje 0.7 | 5 | 40% |
| apc.Colossus2 0.17 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 303 of 350 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 112 | 37% | 121 |
| mn.Combat 3.25.0 | 89 | 29% | 114 |
| shinh.Entangled 0.3 | 45 | 15% | 54 |
| gh.micro.Gruweltje 0.7 | 30 | 10% | 32 |
| stelo.Wang 1.0 | 15 | 5% | 16 |
| maribo.FollowFire 1 | 5 | 2% | 5 |
| ayk.WallHugger 1.0 | 5 | 2% | 5 |
| apc.Colossus2 0.17 | 2 | 1% | 3 |

## Melee bench: F14

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 76.4 | 104 / 350 | 3.13 | 14.7% | 35158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.5% | 133 |
| hadur117.nano.SanaroCL22 0.1 | 2.0 | 14.7% | 104 |
| catcat20.shape.Theta 0.018 | 3.1 | 12.1% | 56 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.3% | 7 |
| Lo_Ian.Gandalf_V4 4.0 | 5.1 | 10.1% | 16 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 9.9% | 13 |
| sanyi.mikrobi.Roberto 1.0 | 6.4 | 9.7% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.0% | 11 |
| pa.Improved 1.0 | 9.0 | 5.4% | 2 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 81.0 | 10 / 35 | 3259 |
| 2 | 2 | 61.6 | 69.5 | 10 / 35 | 3796 |
| 3 | 2 | 61.5 | 74.0 | 9 / 35 | 3366 |
| 4 | 2 | 64.2 | 82.2 | 12 / 35 | 3793 |
| 5 | 2 | 61.5 | 72.4 | 11 / 35 | 3389 |
| 6 | 2 | 60.2 | 69.8 | 8 / 35 | 3485 |
| 7 | 2 | 64.0 | 80.3 | 9 / 35 | 3785 |
| 8 | 2 | 63.2 | 78.7 | 11 / 35 | 3427 |
| 9 | 2 | 64.7 | 84.4 | 12 / 35 | 3456 |
| 10 | 2 | 61.0 | 71.4 | 12 / 35 | 3402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 107 | 63% |
| catcat20.shape.Theta 0.018 | 38 | 34% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 67% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 75% |
| sanyi.mikrobi.Roberto 1.0 | 6 | 33% |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 40% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 246 of 350 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 108 | 44% | 171 |
| catcat20.shape.Theta 0.018 | 45 | 18% | 55 |
| Lo_Ian.Gandalf_V4 4.0 | 23 | 9% | 29 |
| dmh.robocode.robot.RedDwarf 0.4 | 21 | 9% | 26 |
| co.edu.usb.rc.LidisTron 1.0 | 19 | 8% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 18 | 7% | 26 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 3% | 20 |
| sample.TrackFire 1.0 | 3 | 1% | 4 |
| pa.Improved 1.0 | 1 | 0% | 2 |

## Melee bench: F15

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 66.2 | 55 / 350 | 4.04 | 13.2% | 36707 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.5 | 14.9% | 82 |
| emp.Yngwie 1.11 | 2.6 | 13.6% | 99 |
| hadur117.nano.SanaroCL22 0.1 | 2.9 | 13.2% | 55 |
| mld.DustBunny 3.8 | 3.3 | 12.9% | 36 |
| cb.nano.Insomnia 1.0 | 5.1 | 11.2% | 26 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.5% | 47 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.2% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 7.0% | 1 |
| divineomega.TrialBot 0.003 | 9.2 | 5.4% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 67.9 | 4 / 35 | 3764 |
| 2 | 2 | 61.7 | 68.9 | 7 / 35 | 4128 |
| 3 | 4 | 56.7 | 61.0 | 5 / 35 | 3333 |
| 4 | 3 | 58.7 | 65.4 | 4 / 35 | 3503 |
| 5 | 4 | 57.9 | 61.9 | 6 / 35 | 3489 |
| 6 | 2 | 62.9 | 74.6 | 8 / 35 | 4016 |
| 7 | 4 | 58.6 | 63.5 | 8 / 35 | 3473 |
| 8 | 1 | 60.4 | 71.1 | 5 / 35 | 3697 |
| 9 | 4 | 56.3 | 58.4 | 3 / 35 | 3347 |
| 10 | 2 | 61.3 | 69.5 | 5 / 35 | 3957 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 36 | 67% |
| kawigi.micro.Shiz 1.1 | 29 | 17% |
| mld.DustBunny 3.8 | 18 | 39% |
| cb.nano.Insomnia 1.0 | 16 | 56% |
| kawigi.robot.Girl 1.2 | 12 | 58% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 295 of 350 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 67 | 23% | 76 |
| mld.DustBunny 3.8 | 62 | 21% | 73 |
| emp.Yngwie 1.11 | 53 | 18% | 79 |
| cb.nano.Insomnia 1.0 | 45 | 15% | 38 |
| kawigi.robot.Girl 1.2 | 30 | 10% | 39 |
| Grystrion.TrackerWO 1.0 | 16 | 5% | 17 |
| divineomega.TrialBot 0.003 | 12 | 4% | 17 |
| lambdaxy.TBot 0.1 | 10 | 3% | 11 |

## Melee bench: F16

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 63.5 | 36 / 350 | 4.29 | 12.8% | 38090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.0% | 176 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.1 | 15.1% | 19 |
| hadur117.nano.SanaroCL22 0.1 | 3.1 | 12.8% | 36 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.3% | 82 |
| bvh.fnr.Fenrir 0.36l | 5.4 | 9.7% | 6 |
| tvv.nano.Polaris 1.2 | 5.4 | 9.7% | 18 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.7% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 5.2% | 1 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.4% | 7 |
| asd.Cthulhu 1.3 | 9.2 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.5 | 61.9 | 5 / 35 | 3639 |
| 2 | 3 | 59.4 | 65.1 | 4 / 35 | 3768 |
| 3 | 3 | 59.5 | 65.1 | 4 / 35 | 3913 |
| 4 | 3 | 57.8 | 58.4 | 5 / 35 | 4037 |
| 5 | 3 | 59.2 | 66.3 | 1 / 35 | 3680 |
| 6 | 4 | 57.6 | 60.6 | 4 / 35 | 3605 |
| 7 | 2 | 61.8 | 70.2 | 5 / 35 | 4264 |
| 8 | 3 | 58.1 | 63.2 | 2 / 35 | 3610 |
| 9 | 4 | 57.3 | 59.7 | 2 / 35 | 3472 |
| 10 | 3 | 59.9 | 64.1 | 4 / 35 | 4102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 65 | 14% |
| techdude.forest.FlamingForest 1.1 | 18 | 33% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 79% |
| tvv.nano.Polaris 1.2 | 7 | 0% |
| divineomega.DivineBot 1.9.4.5 | 6 | 83% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| bvh.fnr.Fenrir 0.36l | 2 | 100% |

Hadur died in 315 of 350 rounds, at a mean tick of 1120. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 133 | 42% | 143 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 57 | 18% | 68 |
| bvh.fnr.Fenrir 0.36l | 42 | 13% | 42 |
| techdude.forest.FlamingForest 1.1 | 26 | 8% | 32 |
| tvv.nano.Polaris 1.2 | 23 | 7% | 24 |
| stelo.IntrinsicVolatility 1.4 | 14 | 4% | 17 |
| divineomega.DivineBot 1.9.4.5 | 13 | 4% | 17 |
| asd.Cthulhu 1.3 | 4 | 1% | 4 |
| repositorio.NanoStep 1.0 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 65.4 | 58 / 350 | 4.11 | 13.0% | 36469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.0 | 14.4% | 74 |
| oog.melee.Mercutio 1.0 | 2.1 | 13.7% | 79 |
| hadur117.nano.SanaroCL22 0.1 | 3.2 | 13.0% | 58 |
| cx.BlestPain 1.41 | 3.2 | 13.2% | 75 |
| nic.Nicator 2.4 | 5.3 | 11.3% | 28 |
| ahf.NanoAndrew .4 | 5.4 | 10.9% | 33 |
| maribo.melee.BMV 0.1 | 6.8 | 9.4% | 3 |
| tex.Longbot 0.4 | 8.2 | 5.7% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.3% | 2 |
| goblin.Bender 2.4 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 66.3 | 7 / 35 | 4284 |
| 2 | 5 | 57.1 | 61.3 | 6 / 35 | 3190 |
| 3 | 2 | 61.4 | 71.1 | 8 / 35 | 3740 |
| 4 | 1 | 61.9 | 74.6 | 4 / 35 | 3977 |
| 5 | 5 | 54.0 | 52.7 | 2 / 35 | 3504 |
| 6 | 3 | 61.0 | 68.6 | 7 / 35 | 3752 |
| 7 | 4 | 60.9 | 68.3 | 8 / 35 | 3679 |
| 8 | 3 | 58.3 | 65.1 | 8 / 35 | 3116 |
| 9 | 3 | 59.0 | 66.3 | 4 / 35 | 3352 |
| 10 | 4 | 58.0 | 60.0 | 4 / 35 | 3875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 38 | 39% |
| cx.BlestPain 1.41 | 29 | 55% |
| oog.melee.Mercutio 1.0 | 23 | 61% |
| nic.Nicator 2.4 | 13 | 38% |
| ahf.NanoAndrew .4 | 10 | 50% |
| maribo.melee.BMV 0.1 | 3 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 72 | 25% | 85 |
| cx.BlestPain 1.41 | 57 | 20% | 73 |
| oog.melee.Mercutio 1.0 | 45 | 15% | 62 |
| ahf.NanoAndrew .4 | 38 | 13% | 42 |
| nic.Nicator 2.4 | 37 | 13% | 43 |
| maribo.melee.BMV 0.1 | 28 | 10% | 30 |
| tex.Longbot 0.4 | 9 | 3% | 9 |
| edu.otg.spr.TheTeacher 1.2 | 5 | 2% | 5 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 73.3 | 91 / 350 | 3.40 | 14.7% | 38087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL22 0.1 | 1.3 | 14.7% | 91 |
| morbid.MorbidPriest 1.0 | 1.7 | 13.9% | 80 |
| agd.Mooserwirt2 2.7 | 3.3 | 12.1% | 57 |
| uji.DBH 1.1 | 4.1 | 11.4% | 37 |
| ratosh.Nobo 0.21 | 5.1 | 10.6% | 14 |
| spinnercat.Robovirus 2.718 | 5.8 | 10.1% | 19 |
| sigterm.Sigterm 1.0 | 6.8 | 9.1% | 28 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 7.0% | 8 |
| stelo.WangRobot 1.0 | 8.8 | 5.9% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 73.7 | 7 / 35 | 3978 |
| 2 | 1 | 62.0 | 73.0 | 14 / 35 | 3786 |
| 3 | 1 | 63.5 | 76.2 | 13 / 35 | 3910 |
| 4 | 2 | 60.9 | 71.7 | 7 / 35 | 3903 |
| 5 | 2 | 60.1 | 71.7 | 6 / 35 | 3389 |
| 6 | 1 | 60.7 | 69.5 | 8 / 35 | 3905 |
| 7 | 1 | 63.3 | 75.6 | 12 / 35 | 3915 |
| 8 | 1 | 60.9 | 73.0 | 6 / 35 | 3798 |
| 9 | 1 | 61.8 | 74.3 | 12 / 35 | 3632 |
| 10 | 2 | 61.4 | 74.3 | 6 / 35 | 3871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 53 | 45% |
| agd.Mooserwirt2 2.7 | 29 | 41% |
| spinnercat.Robovirus 2.718 | 26 | 81% |
| sigterm.Sigterm 1.0 | 23 | 87% |
| uji.DBH 1.1 | 20 | 40% |
| ratosh.Nobo 0.21 | 8 | 50% |
| stelo.WangRobot 1.0 | 7 | 0% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 50% |

Hadur died in 260 of 350 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 77 | 30% | 102 |
| ratosh.Nobo 0.21 | 43 | 17% | 50 |
| uji.DBH 1.1 | 39 | 15% | 46 |
| agd.Mooserwirt2 2.7 | 35 | 13% | 52 |
| spinnercat.Robovirus 2.718 | 24 | 9% | 33 |
| stelo.WangRobot 1.0 | 13 | 5% | 13 |
| sigterm.Sigterm 1.0 | 12 | 5% | 33 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 3% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8 | 3% | 10 |

## Melee bench: F19

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.1 | 108 / 350 | 2.70 | 16.2% | 42640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.7 | 16.4% | 106 |
| hadur117.nano.SanaroCL22 0.1 | 1.9 | 16.2% | 108 |
| mld.Infinity 2.2 | 2.4 | 15.1% | 99 |
| krillr.mini.JointStrike 2.0.0 | 4.1 | 11.4% | 9 |
| erdnis.Rover 0.3 | 5.0 | 10.3% | 7 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.9% | 7 |
| mbh.Mbh 0.1 | 7.6 | 7.2% | 0 |
| pac.ABC 2.1 | 7.6 | 7.3% | 13 |
| pbg.R2D2 1.0 | 8.7 | 6.0% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.4 | 11 / 35 | 4615 |
| 2 | 2 | 65.3 | 79.4 | 10 / 35 | 4394 |
| 3 | 1 | 66.3 | 85.7 | 12 / 35 | 3830 |
| 4 | 2 | 66.0 | 83.8 | 12 / 35 | 4215 |
| 5 | 2 | 64.0 | 75.6 | 11 / 35 | 4244 |
| 6 | 2 | 64.6 | 77.5 | 8 / 35 | 4367 |
| 7 | 3 | 65.5 | 80.3 | 11 / 35 | 4221 |
| 8 | 3 | 65.2 | 79.0 | 11 / 35 | 3996 |
| 9 | 1 | 67.2 | 85.7 | 12 / 35 | 4535 |
| 10 | 2 | 64.8 | 79.0 | 10 / 35 | 4223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 87 | 37% |
| mld.Infinity 2.2 | 78 | 49% |
| krillr.mini.JointStrike 2.0.0 | 14 | 71% |
| pac.ABC 2.1 | 12 | 50% |
| erdnis.Rover 0.3 | 11 | 73% |
| patson.PatsonTestBot 1.0 | 10 | 70% |
| pbg.R2D2 1.0 | 6 | 83% |
| mbh.Mbh 0.1 | 1 | 100% |
| pedersen.Moron 2.0 | 1 | 100% |

Hadur died in 244 of 350 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 113 | 46% | 175 |
| mld.Infinity 2.2 | 55 | 23% | 37 |
| krillr.mini.JointStrike 2.0.0 | 24 | 10% | 37 |
| erdnis.Rover 0.3 | 22 | 9% | 29 |
| patson.PatsonTestBot 1.0 | 16 | 7% | 34 |
| pac.ABC 2.1 | 9 | 4% | 14 |
| mbh.Mbh 0.1 | 3 | 1% | 6 |
| pbg.R2D2 1.0 | 2 | 1% | 14 |

## Melee bench: F20

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 70.5 | 76 / 350 | 3.66 | 14.0% | 36692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.5% | 139 |
| hadur117.nano.SanaroCL22 0.1 | 2.3 | 14.0% | 76 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.3% | 29 |
| fwb.Nine 1.0.1 | 4.0 | 11.2% | 37 |
| catcat20.Rabbit 0.001 | 4.9 | 10.1% | 31 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 9.0% | 16 |
| djdjdj.NanoSkunk10 1.0 | 6.4 | 9.1% | 14 |
| bayen.nut.Squirrel 1.615 | 7.9 | 7.7% | 7 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 4.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 70.2 | 7 / 35 | 3566 |
| 2 | 2 | 61.9 | 73.3 | 10 / 35 | 3859 |
| 3 | 2 | 62.3 | 74.6 | 10 / 35 | 3513 |
| 4 | 3 | 57.6 | 61.3 | 5 / 35 | 3506 |
| 5 | 2 | 60.1 | 69.8 | 7 / 35 | 3430 |
| 6 | 2 | 61.5 | 71.1 | 9 / 35 | 3662 |
| 7 | 2 | 64.3 | 79.4 | 6 / 35 | 4414 |
| 8 | 3 | 59.1 | 66.0 | 6 / 35 | 3520 |
| 9 | 2 | 62.5 | 73.7 | 10 / 35 | 3799 |
| 10 | 3 | 58.8 | 65.4 | 6 / 35 | 3423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 69 | 42% |
| fwb.Nine 1.0.1 | 26 | 88% |
| nz.jdc.nano.GridFu 1.0 | 13 | 31% |
| catcat20.Rabbit 0.001 | 12 | 58% |
| djdjdj.NanoSkunk10 1.0 | 9 | 44% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| m3thos.mini.Eva01 0.5.5 | 6 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 275 of 350 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 115 | 42% | 133 |
| nz.jdc.nano.GridFu 1.0 | 50 | 18% | 61 |
| fwb.Nine 1.0.1 | 30 | 11% | 37 |
| catcat20.Rabbit 0.001 | 25 | 9% | 38 |
| djdjdj.NanoSkunk10 1.0 | 19 | 7% | 25 |
| m3thos.mini.Eva01 0.5.5 | 15 | 5% | 21 |
| bayen.nut.Squirrel 1.615 | 11 | 4% | 22 |
| ntc.ControlledChaos 1.1.4 | 8 | 3% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.1 | 136 / 350 | 2.61 | 16.8% | 45683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.4 | 17.3% | 141 |
| hadur117.nano.SanaroCL22 0.1 | 1.7 | 16.8% | 136 |
| dummy.mini.Scimitar 1.01 | 2.9 | 14.7% | 25 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 21 |
| eld.Hmm 1.0 | 5.5 | 8.5% | 18 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.4% | 7 |
| fire219.CatBot 1.0 | 7.6 | 6.1% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.2% | 3 |
| PSW.Relentless 0.1 | 8.8 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 79.4 | 12 / 35 | 4610 |
| 2 | 2 | 65.3 | 79.7 | 11 / 35 | 4598 |
| 3 | 1 | 67.5 | 84.4 | 15 / 35 | 5018 |
| 4 | 1 | 66.9 | 86.0 | 16 / 35 | 4613 |
| 5 | 1 | 66.4 | 82.9 | 14 / 35 | 4540 |
| 6 | 2 | 65.4 | 80.3 | 14 / 35 | 4425 |
| 7 | 2 | 65.9 | 82.2 | 15 / 35 | 4270 |
| 8 | 2 | 65.8 | 79.4 | 12 / 35 | 4790 |
| 9 | 1 | 68.3 | 87.0 | 17 / 35 | 4718 |
| 10 | 3 | 64.3 | 80.0 | 10 / 35 | 4101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 125 | 54% |
| dummy.mini.Scimitar 1.01 | 46 | 83% |
| cf.RiO.RiOx 4.2.1 | 27 | 56% |
| eld.Hmm 1.0 | 16 | 81% |
| oa.weak.BotherBot 0.1 | 4 | 25% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 215 of 350 rounds, at a mean tick of 1153. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 92 | 43% | 139 |
| dummy.mini.Scimitar 1.01 | 42 | 20% | 93 |
| cf.RiO.RiOx 4.2.1 | 42 | 20% | 52 |
| oa.weak.BotherBot 0.1 | 11 | 5% | 14 |
| eld.Hmm 1.0 | 9 | 4% | 33 |
| arthord.MannyPacquiao Beta | 5 | 2% | 6 |
| PSW.Relentless 0.1 | 5 | 2% | 5 |
| fire219.CatBot 1.0 | 4 | 2% | 4 |
| el.JumpShoot 0.2 | 4 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.9 | 119 / 350 | 2.72 | 16.1% | 39383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.2% | 135 |
| hadur117.nano.SanaroCL22 0.1 | 2.0 | 16.1% | 119 |
| cre.Karolos 0.32 | 2.9 | 14.5% | 59 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.2% | 17 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.9% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 9.1% | 3 |
| sample.Walls 1.0 | 6.5 | 8.9% | 7 |
| cw.megas.Blade 0.8 | 7.1 | 8.5% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 83.5 | 11 / 35 | 4122 |
| 2 | 3 | 66.4 | 82.5 | 11 / 35 | 4180 |
| 3 | 2 | 64.4 | 77.1 | 9 / 35 | 3699 |
| 4 | 2 | 64.1 | 77.5 | 10 / 35 | 3694 |
| 5 | 2 | 65.8 | 82.5 | 14 / 35 | 3790 |
| 6 | 2 | 65.9 | 81.9 | 13 / 35 | 3713 |
| 7 | 1 | 66.9 | 83.8 | 15 / 35 | 4090 |
| 8 | 2 | 65.3 | 79.0 | 12 / 35 | 4051 |
| 9 | 2 | 66.4 | 82.2 | 13 / 35 | 3951 |
| 10 | 2 | 65.7 | 79.0 | 11 / 35 | 4093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 102 | 46% |
| cre.Karolos 0.32 | 41 | 56% |
| stelo.AreaTargetingBot 1.1 | 29 | 62% |
| sample.Walls 1.0 | 23 | 83% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 75% |
| cw.megas.Blade 0.8 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 231 of 350 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 108 | 47% | 165 |
| cre.Karolos 0.32 | 56 | 24% | 75 |
| stelo.AreaTargetingBot 1.1 | 24 | 10% | 36 |
| sample.Walls 1.0 | 14 | 6% | 22 |
| stelo.RamTrackSurfer 1.2 | 11 | 5% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 11 | 5% | 14 |
| cw.megas.Blade 0.8 | 5 | 2% | 13 |
| rrh.Iwillfindyou 2.0 | 2 | 1% | 2 |

## Melee bench: F24

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.4 | 60.3 | 45 / 350 | 4.58 | 11.5% | 27143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.3 | 14.8% | 83 |
| davidalves.Phoenix 0.54 | 2.8 | 13.4% | 79 |
| florent.XSeries.X2 0.12 | 3.2 | 12.8% | 66 |
| pedersen.Ugluk 1.1.1 | 3.5 | 12.5% | 44 |
| hadur117.nano.SanaroCL22 0.1 | 4.6 | 11.5% | 45 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 8.9% | 25 |
| oog.melee.Corsair 1.0 | 6.3 | 9.5% | 5 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.9% | 2 |
| as.FrankTheTank 1.3 | 9.5 | 5.0% | 1 |
| evd.X1 0.01 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.4 | 57.1 | 2 / 35 | 2665 |
| 2 | 5 | 55.7 | 61.6 | 4 / 35 | 2759 |
| 3 | 3 | 58.2 | 69.5 | 5 / 35 | 2759 |
| 4 | 5 | 56.7 | 60.3 | 4 / 35 | 3132 |
| 5 | 5 | 54.4 | 56.8 | 4 / 35 | 2844 |
| 6 | 6 | 51.9 | 53.7 | 2 / 35 | 2218 |
| 7 | 5 | 51.7 | 52.4 | 3 / 35 | 2331 |
| 8 | 4 | 57.7 | 62.9 | 10 / 35 | 2823 |
| 9 | 4 | 57.0 | 63.5 | 7 / 35 | 2729 |
| 10 | 4 | 57.4 | 64.8 | 4 / 35 | 2883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 29 | 62% |
| davidalves.Phoenix 0.54 | 20 | 35% |
| florent.XSeries.X2 0.12 | 16 | 50% |
| pedersen.Ugluk 1.1.1 | 16 | 44% |
| stelo.SoJNanoMelee 1.1 | 5 | 20% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 75 | 25% | 89 |
| davidalves.Phoenix 0.54 | 57 | 19% | 60 |
| florent.XSeries.X2 0.12 | 55 | 18% | 66 |
| pedersen.Ugluk 1.1.1 | 48 | 16% | 56 |
| stelo.SoJNanoMelee 1.1 | 26 | 9% | 27 |
| oog.melee.Corsair 1.0 | 14 | 5% | 19 |
| lunchie.Lunchbox 0.93 | 14 | 5% | 16 |
| evd.X1 0.01 | 12 | 4% | 12 |
| as.FrankTheTank 1.3 | 4 | 1% | 4 |

## Melee bench: F25

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 65.5 | 38 / 350 | 4.11 | 12.6% | 29120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.4 | 14.3% | 84 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.8% | 62 |
| hadur117.nano.SanaroCL22 0.1 | 3.1 | 12.6% | 38 |
| jdw.Hurricane 1.4 | 3.5 | 12.3% | 63 |
| gre.svman4.Morfeas 1.4.1 | 4.9 | 11.1% | 50 |
| ds.Oo 2.2 | 6.1 | 9.5% | 25 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.3% | 14 |
| awesomeness.Elite 1.0 | 8.0 | 7.4% | 6 |
| adt.Ar2 1.1 | 8.9 | 6.5% | 7 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 69.5 | 6 / 35 | 3045 |
| 2 | 4 | 54.0 | 58.7 | 1 / 35 | 2516 |
| 3 | 5 | 56.4 | 59.0 | 5 / 35 | 3143 |
| 4 | 3 | 58.7 | 68.3 | 2 / 35 | 3024 |
| 5 | 1 | 60.0 | 73.0 | 5 / 35 | 2998 |
| 6 | 2 | 60.2 | 71.7 | 7 / 35 | 2946 |
| 7 | 4 | 55.6 | 61.3 | 2 / 35 | 2649 |
| 8 | 2 | 58.8 | 68.9 | 3 / 35 | 3080 |
| 9 | 3 | 56.7 | 62.9 | 4 / 35 | 2857 |
| 10 | 4 | 56.1 | 61.6 | 3 / 35 | 2862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 45 | 18% |
| voidious.micro.BlitzBat 1.05 | 36 | 11% |
| jdw.Hurricane 1.4 | 25 | 44% |
| gre.svman4.Morfeas 1.4.1 | 17 | 47% |
| gjr.Cephalosporin 0.1 | 7 | 14% |
| ds.Oo 2.2 | 6 | 33% |
| awesomeness.Elite 1.0 | 5 | 60% |
| adt.Ar2 1.1 | 4 | 25% |

Hadur died in 312 of 350 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 85 | 27% | 90 |
| voidious.mini.BrokenSword 2.0.3 | 75 | 24% | 85 |
| jdw.Hurricane 1.4 | 48 | 15% | 55 |
| gre.svman4.Morfeas 1.4.1 | 38 | 12% | 45 |
| ds.Oo 2.2 | 21 | 7% | 25 |
| gjr.Cephalosporin 0.1 | 18 | 6% | 19 |
| adt.Ar2 1.1 | 14 | 4% | 15 |
| awesomeness.Elite 1.0 | 8 | 3% | 11 |
| amk.ChumbaMini 0.2 | 5 | 2% | 5 |

## Melee bench: F26

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 70.9 | 56 / 350 | 3.62 | 13.7% | 38331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.3% | 114 |
| hadur117.nano.SanaroCL22 0.1 | 2.5 | 13.7% | 56 |
| shu.nitro.LENIN .T34 | 3.0 | 13.1% | 70 |
| lrem.Spectre 0.4.4 | 3.7 | 12.6% | 50 |
| gh.mini.GrubbmOne 1.0 | 5.5 | 11.0% | 20 |
| js.PinBall 1.6 | 5.5 | 11.0% | 20 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 9.3% | 10 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 9 |
| sample.SpinBot 1.0 | 8.9 | 4.9% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.2 | 68.3 | 6 / 35 | 3365 |
| 2 | 2 | 63.8 | 75.2 | 7 / 35 | 4632 |
| 3 | 3 | 61.6 | 72.4 | 6 / 35 | 3786 |
| 4 | 3 | 59.6 | 67.9 | 5 / 35 | 3520 |
| 5 | 2 | 61.8 | 73.7 | 2 / 35 | 3976 |
| 6 | 3 | 60.1 | 67.0 | 7 / 35 | 3458 |
| 7 | 2 | 62.0 | 73.3 | 7 / 35 | 3934 |
| 8 | 2 | 62.1 | 74.9 | 4 / 35 | 3969 |
| 9 | 2 | 60.5 | 66.7 | 8 / 35 | 3991 |
| 10 | 2 | 60.3 | 69.2 | 4 / 35 | 3700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lrem.Spectre 0.4.4 | 42 | 50% |
| ak.Fermat 2.0 | 41 | 22% |
| shu.nitro.LENIN .T34 | 37 | 35% |
| gh.mini.GrubbmOne 1.0 | 15 | 20% |
| js.PinBall 1.6 | 8 | 50% |
| sample.SpinBot 1.0 | 3 | 33% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 67% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 88 | 30% | 100 |
| shu.nitro.LENIN .T34 | 56 | 19% | 73 |
| lrem.Spectre 0.4.4 | 51 | 17% | 62 |
| gh.mini.GrubbmOne 1.0 | 37 | 13% | 39 |
| js.PinBall 1.6 | 23 | 8% | 27 |
| jaybot.adv.bots.JayBot 2.0 | 21 | 7% | 26 |
| fullsail.LaxativeTeaTwo 1.0 | 10 | 3% | 14 |
| sample.SpinBot 1.0 | 8 | 3% | 9 |

## Melee bench: F27

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 66.1 | 87 / 350 | 4.05 | 13.2% | 33171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.1 | 15.8% | 121 |
| hadur117.nano.SanaroCL22 0.1 | 2.4 | 13.2% | 87 |
| wee.Gem 1.8.4 | 3.4 | 11.8% | 54 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 12.1% | 44 |
| EH.Eagle 1.0.6 | 4.6 | 11.2% | 20 |
| joe.ADinosaur 1.0 | 7.1 | 8.5% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 7.1 | 8.5% | 9 |
| throxbot.ThroxBot 0.1 | 7.5 | 7.8% | 4 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.7% | 3 |
| cs.Grudge 1.0 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.0 | 48.3 | 7 / 35 | 4372 |
| 2 | 2 | 61.8 | 79.4 | 11 / 35 | 2551 |
| 3 | 2 | 60.2 | 71.7 | 12 / 35 | 2952 |
| 4 | 2 | 61.8 | 76.5 | 12 / 35 | 3013 |
| 5 | 1 | 63.9 | 83.2 | 14 / 35 | 3249 |
| 6 | 2 | 58.7 | 69.2 | 5 / 35 | 2934 |
| 7 | 3 | 58.4 | 69.2 | 7 / 35 | 2747 |
| 8 | 4 | 54.6 | 46.0 | 7 / 35 | 3997 |
| 9 | 2 | 60.0 | 72.4 | 6 / 35 | 3149 |
| 10 | 3 | 54.5 | 45.1 | 6 / 35 | 4207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 69 | 67% |
| sheldor.melee.nano.TestMelee 0.1 | 23 | 52% |
| wee.Gem 1.8.4 | 21 | 48% |
| EH.Eagle 1.0.6 | 12 | 92% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 71% |
| joe.ADinosaur 1.0 | 3 | 33% |
| throxbot.ThroxBot 0.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 263 of 350 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 86 | 33% | 131 |
| sheldor.melee.nano.TestMelee 0.1 | 47 | 18% | 59 |
| wee.Gem 1.8.4 | 32 | 12% | 41 |
| joe.ADinosaur 1.0 | 25 | 10% | 26 |
| caimano.Furia_Ceca 0.22 | 19 | 7% | 19 |
| cs.Grudge 1.0 | 17 | 6% | 17 |
| EH.Eagle 1.0.6 | 13 | 5% | 29 |
| throxbot.ThroxBot 0.1 | 13 | 5% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 11 | 4% | 15 |

## Melee bench: F28

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 77.9 | 109 / 350 | 2.99 | 15.2% | 34349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.1 | 16.2% | 114 |
| hadur117.nano.SanaroCL22 0.1 | 1.9 | 15.2% | 109 |
| uji.Antique 1.0 | 3.1 | 12.6% | 58 |
| qohnil.blot.BlotBot 3.61 | 4.1 | 11.0% | 40 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.1% | 5 |
| ahr.ice.Ice 1.0.2 | 6.6 | 8.0% | 6 |
| amk.ChumbaWumba 0.3 | 6.6 | 8.6% | 11 |
| matt.advanced.Katana 1.0 | 8.0 | 6.9% | 7 |
| stelo.PianistNano 1.2 | 9.2 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.4 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 78.1 | 10 / 35 | 3419 |
| 2 | 2 | 62.6 | 75.9 | 10 / 35 | 3546 |
| 3 | 2 | 63.7 | 81.3 | 11 / 35 | 3384 |
| 4 | 2 | 63.1 | 78.4 | 12 / 35 | 3461 |
| 5 | 2 | 62.4 | 76.8 | 13 / 35 | 3295 |
| 6 | 2 | 62.5 | 76.2 | 9 / 35 | 3621 |
| 7 | 1 | 61.5 | 73.3 | 13 / 35 | 3327 |
| 8 | 2 | 62.6 | 78.4 | 11 / 35 | 3165 |
| 9 | 2 | 64.5 | 81.9 | 12 / 35 | 3534 |
| 10 | 2 | 62.8 | 79.0 | 8 / 35 | 3597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 118 | 49% |
| uji.Antique 1.0 | 39 | 56% |
| qohnil.blot.BlotBot 3.61 | 17 | 53% |
| matt.advanced.Katana 1.0 | 7 | 86% |
| amk.ChumbaWumba 0.3 | 6 | 83% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| ahr.ice.Ice 1.0.2 | 4 | 75% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 244 of 350 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 104 | 43% | 146 |
| pfvicm.Sobieski 7.2.3b | 37 | 15% | 40 |
| uji.Antique 1.0 | 33 | 14% | 68 |
| qohnil.blot.BlotBot 3.61 | 29 | 12% | 39 |
| amk.ChumbaWumba 0.3 | 20 | 8% | 23 |
| ahr.ice.Ice 1.0.2 | 7 | 3% | 15 |
| matt.advanced.Katana 1.0 | 6 | 2% | 12 |
| stelo.Lifestealer 1.0 | 6 | 2% | 4 |
| stelo.PianistNano 1.2 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 65.3 | 39 / 350 | 4.12 | 12.8% | 31441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.3 | 16.2% | 123 |
| deewiant.Anomaly 0.2 | 1.7 | 16.0% | 111 |
| myl.micro.Troodon 1.10 | 3.8 | 12.6% | 28 |
| hadur117.nano.SanaroCL22 0.1 | 4.0 | 12.8% | 39 |
| jok.PheonixM 0.1.2 | 4.2 | 11.6% | 23 |
| ph.melee.ArcherME 0.3 | 6.4 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 6.7 | 8.1% | 27 |
| fullsail.TimbotNoPrediction 1.0 | 7.9 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.4 | 4.3% | 2 |
| jangs.ns51 1.0 | 9.6 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.7 | 65.1 | 5 / 35 | 2701 |
| 2 | 4 | 59.7 | 66.0 | 4 / 35 | 3248 |
| 3 | 3 | 63.1 | 75.6 | 8 / 35 | 3497 |
| 4 | 3 | 61.0 | 70.2 | 6 / 35 | 3016 |
| 5 | 4 | 58.6 | 65.1 | 2 / 35 | 3076 |
| 6 | 5 | 56.8 | 60.0 | 0 / 35 | 3135 |
| 7 | 3 | 60.3 | 68.6 | 4 / 35 | 3209 |
| 8 | 5 | 56.8 | 58.7 | 3 / 35 | 3181 |
| 9 | 5 | 59.2 | 63.5 | 2 / 35 | 3233 |
| 10 | 4 | 57.5 | 60.6 | 5 / 35 | 3145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 45 | 9% |
| zyx.mega.YersiniaPestis 3.1 | 43 | 49% |
| myl.micro.Troodon 1.10 | 12 | 67% |
| jok.PheonixM 0.1.2 | 9 | 33% |
| DBall.Anarchy 0.1 | 6 | 0% |
| ap.Frederick 1.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 108 | 35% | 112 |
| zyx.mega.YersiniaPestis 3.1 | 81 | 26% | 102 |
| myl.micro.Troodon 1.10 | 54 | 17% | 61 |
| jok.PheonixM 0.1.2 | 37 | 12% | 42 |
| ph.melee.ArcherME 0.3 | 12 | 4% | 12 |
| DBall.Anarchy 0.1 | 10 | 3% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 10 | 3% | 10 |

## Melee bench: F30

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.2 | 55.7 | 23 / 350 | 4.99 | 10.8% | 29445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.1 | 14.3% | 105 |
| oog.melee.Capulet 1.2 | 2.5 | 13.8% | 57 |
| darkcanuck.B26354 1.06 | 2.5 | 13.7% | 86 |
| stelo.PastFuture 2.3.2 | 2.9 | 13.3% | 52 |
| hadur117.nano.SanaroCL22 0.1 | 5.1 | 10.8% | 23 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.1% | 17 |
| ntc.Opposite 1.5 | 7.7 | 7.6% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.8% | 5 |
| tripphippy.Alice 1.1 | 8.2 | 7.1% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.6 | 56.2 | 4 / 35 | 2842 |
| 2 | 5 | 53.2 | 52.4 | 2 / 35 | 2897 |
| 3 | 5 | 50.9 | 47.9 | 3 / 35 | 2576 |
| 4 | 5 | 57.3 | 62.2 | 3 / 35 | 3331 |
| 5 | 5 | 53.8 | 57.8 | 1 / 35 | 2500 |
| 6 | 5 | 52.9 | 51.1 | 1 / 35 | 3116 |
| 7 | 5 | 54.9 | 61.0 | 1 / 35 | 2964 |
| 8 | 5 | 55.3 | 57.5 | 4 / 35 | 2955 |
| 9 | 5 | 55.7 | 58.7 | 3 / 35 | 3222 |
| 10 | 6 | 53.2 | 52.4 | 1 / 35 | 3042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 28 | 14% |
| stelo.PastFuture 2.3.2 | 16 | 31% |
| darkcanuck.B26354 1.06 | 15 | 27% |
| oog.melee.Capulet 1.2 | 12 | 17% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 80% |
| intruder.PrairieWolf 2.61 | 4 | 25% |
| tripphippy.Alice 1.1 | 2 | 50% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 327 of 350 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 65 | 20% | 69 |
| darkcanuck.B26354 1.06 | 60 | 18% | 63 |
| oog.melee.Capulet 1.2 | 52 | 16% | 54 |
| stelo.PastFuture 2.3.2 | 50 | 15% | 59 |
| ntc.Opposite 1.5 | 29 | 9% | 30 |
| fowl3628800.LightningBolt 2.6.0 | 28 | 9% | 29 |
| intruder.PrairieWolf 2.61 | 24 | 7% | 24 |
| tripphippy.Alice 1.1 | 18 | 6% | 21 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |

## Melee bench: F31

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.9 | 58.5 | 25 / 350 | 4.73 | 11.0% | 26147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 200 |
| gh.mini.Griezel 0.2 | 2.5 | 13.6% | 69 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 12.6% | 25 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.4% | 17 |
| hadur117.nano.SanaroCL22 0.1 | 4.9 | 11.0% | 25 |
| gh.nano.Grofvuil 0.2 | 5.6 | 9.9% | 11 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.0% | 3 |
| fm.mammillarias 1.3 | 7.9 | 6.2% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.4 | 5.1% | 1 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.0 | 56.8 | 1 / 35 | 2655 |
| 2 | 5 | 54.7 | 58.1 | 2 / 35 | 2750 |
| 3 | 5 | 54.8 | 57.5 | 4 / 35 | 2495 |
| 4 | 5 | 53.0 | 54.9 | 1 / 35 | 2485 |
| 5 | 4 | 59.2 | 67.3 | 4 / 35 | 3118 |
| 6 | 5 | 54.4 | 58.1 | 2 / 35 | 2492 |
| 7 | 4 | 55.4 | 60.0 | 3 / 35 | 2429 |
| 8 | 5 | 54.6 | 58.4 | 2 / 35 | 2720 |
| 9 | 5 | 56.2 | 60.3 | 4 / 35 | 2535 |
| 10 | 6 | 52.8 | 54.0 | 2 / 35 | 2468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 33 | 18% |
| gh.mini.Griezel 0.2 | 32 | 38% |
| d414.nano.Quantum 1.0.0 | 6 | 33% |
| spinnercat.micro.Tyger 0.1 | 5 | 0% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 325 of 350 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 89 | 27% | 101 |
| abc.Shadow 3.84i | 82 | 25% | 88 |
| spinnercat.micro.Tyger 0.1 | 53 | 16% | 54 |
| d414.nano.Quantum 1.0.0 | 50 | 15% | 52 |
| gh.nano.Grofvuil 0.2 | 18 | 6% | 22 |
| timmit.nano.TimDog 0.33 | 12 | 4% | 12 |
| fm.mammillarias 1.3 | 11 | 3% | 11 |
| Gecko.ultimateGeckoBot 1.0 | 10 | 3% | 10 |

## Melee bench: F32

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 75.0 | 117 / 350 | 3.25 | 14.6% | 33971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.2% | 106 |
| hadur117.nano.SanaroCL22 0.1 | 1.7 | 14.6% | 117 |
| apc.botM 3.0 | 3.3 | 12.2% | 45 |
| vjik.UnViolation 1.1 | 4.3 | 11.0% | 37 |
| lxx.ConceptA 0.8 | 4.3 | 11.1% | 8 |
| bayen.UbaMicro 1.4 | 6.0 | 9.1% | 14 |
| panzer.Panzer 0.2 | 7.3 | 7.9% | 1 |
| yk.JahMicro 1.0 | 8.3 | 6.9% | 14 |
| conscience.Electron 1.3g | 8.5 | 6.8% | 1 |
| donjezza.Jezza 1.0 | 9.9 | 5.3% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 81.6 | 13 / 35 | 3819 |
| 2 | 2 | 62.1 | 75.2 | 10 / 35 | 3839 |
| 3 | 1 | 63.2 | 80.6 | 14 / 35 | 3310 |
| 4 | 2 | 62.1 | 77.5 | 12 / 35 | 3338 |
| 5 | 3 | 60.1 | 70.5 | 10 / 35 | 3327 |
| 6 | 1 | 62.9 | 78.1 | 15 / 35 | 3461 |
| 7 | 2 | 59.4 | 67.3 | 9 / 35 | 3507 |
| 8 | 2 | 61.7 | 74.0 | 12 / 35 | 3451 |
| 9 | 2 | 57.7 | 68.9 | 7 / 35 | 2843 |
| 10 | 1 | 61.8 | 76.5 | 15 / 35 | 3076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 58% |
| apc.botM 3.0 | 39 | 56% |
| vjik.UnViolation 1.1 | 19 | 58% |
| lxx.ConceptA 0.8 | 17 | 82% |
| yk.JahMicro 1.0 | 10 | 60% |
| bayen.UbaMicro 1.4 | 7 | 57% |
| panzer.Panzer 0.2 | 6 | 100% |
| conscience.Electron 1.3g | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 50% |

Hadur died in 234 of 350 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 65 | 28% | 113 |
| lxx.ConceptA 0.8 | 48 | 21% | 56 |
| apc.botM 3.0 | 41 | 18% | 71 |
| bayen.UbaMicro 1.4 | 23 | 10% | 28 |
| vjik.UnViolation 1.1 | 22 | 9% | 37 |
| yk.JahMicro 1.0 | 13 | 6% | 15 |
| panzer.Panzer 0.2 | 11 | 5% | 14 |
| conscience.Electron 1.3g | 8 | 3% | 12 |
| donjezza.Jezza 1.0 | 3 | 1% | 4 |

## Melee bench: F33

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 65.9 | 47 / 350 | 4.07 | 13.2% | 35872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.3% | 149 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.3% | 58 |
| hadur117.nano.SanaroCL22 0.1 | 2.8 | 13.2% | 47 |
| gre.svman4.Leonidas 1.3.2 | 4.1 | 11.6% | 27 |
| labg.Cataclysm 2.05 | 4.7 | 11.0% | 49 |
| baal.nano.N 1.42 | 6.2 | 8.9% | 7 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.3% | 11 |
| zyx.micro.Ant 1.1 | 8.3 | 6.1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.8% | 1 |
| sanja.First 0.1 | 9.4 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.7 | 67.0 | 4 / 35 | 3397 |
| 2 | 3 | 58.4 | 63.2 | 7 / 35 | 3313 |
| 3 | 2 | 60.5 | 70.8 | 1 / 35 | 3664 |
| 4 | 2 | 60.8 | 67.9 | 8 / 35 | 3673 |
| 5 | 3 | 60.8 | 68.6 | 4 / 35 | 3731 |
| 6 | 3 | 59.3 | 64.4 | 4 / 35 | 3749 |
| 7 | 3 | 60.4 | 66.7 | 6 / 35 | 3707 |
| 8 | 5 | 57.6 | 59.4 | 4 / 35 | 3480 |
| 9 | 2 | 61.0 | 69.2 | 6 / 35 | 3614 |
| 10 | 3 | 58.3 | 62.2 | 3 / 35 | 3544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 60 | 38% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 12% |
| gre.svman4.Leonidas 1.3.2 | 15 | 47% |
| labg.Cataclysm 2.05 | 15 | 33% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 304 of 350 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 113 | 37% | 135 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 18% | 61 |
| gre.svman4.Leonidas 1.3.2 | 47 | 15% | 53 |
| labg.Cataclysm 2.05 | 42 | 14% | 47 |
| kinsen.melee.Angsaichmophobia 1.8c | 17 | 6% | 17 |
| zyx.micro.Ant 1.1 | 16 | 5% | 17 |
| baal.nano.N 1.42 | 9 | 3% | 11 |
| sanja.First 0.1 | 5 | 2% | 8 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 0% | 1 |

## Melee bench: F34

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 71.6 | 44 / 350 | 3.56 | 13.6% | 35897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.1 | 17.7% | 127 |
| stelo.Spread 0.9 | 1.9 | 17.1% | 134 |
| hadur117.nano.SanaroCL22 0.1 | 3.0 | 13.6% | 44 |
| tcf.Reach 3 | 4.6 | 11.1% | 12 |
| jcs.Seth 1.8 | 4.6 | 11.2% | 25 |
| cli.Dancer 1.1 | 5.8 | 9.6% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.8% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.9% | 1 |
| sample.RamFire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 70.5 | 3 / 35 | 3592 |
| 2 | 3 | 62.0 | 71.4 | 5 / 35 | 3921 |
| 3 | 3 | 59.9 | 68.6 | 3 / 35 | 3572 |
| 4 | 3 | 63.5 | 76.2 | 6 / 35 | 3933 |
| 5 | 3 | 62.0 | 71.7 | 7 / 35 | 3642 |
| 6 | 3 | 59.2 | 66.3 | 3 / 35 | 3131 |
| 7 | 3 | 60.4 | 68.6 | 3 / 35 | 3586 |
| 8 | 3 | 62.5 | 75.9 | 3 / 35 | 3762 |
| 9 | 3 | 62.4 | 74.9 | 7 / 35 | 3274 |
| 10 | 3 | 61.5 | 71.4 | 4 / 35 | 3484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 59 | 37% |
| kid.Gladiator .7.2 | 41 | 17% |
| jcs.Seth 1.8 | 15 | 60% |
| tcf.Reach 3 | 11 | 36% |
| cli.Dancer 1.1 | 3 | 33% |
| sample.VelociRobot 1.0 | 1 | 0% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 121 | 40% | 124 |
| stelo.Spread 0.9 | 106 | 35% | 130 |
| tcf.Reach 3 | 28 | 9% | 32 |
| jcs.Seth 1.8 | 24 | 8% | 33 |
| cli.Dancer 1.1 | 14 | 5% | 15 |
| ratosh.Wesco 1.4 | 8 | 3% | 11 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 3 |
| sample.VelociRobot 1.0 | 2 | 1% | 2 |

## Melee bench: F35

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 68.5 | 24 / 350 | 3.83 | 12.5% | 28065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 266 |
| gh.mini.Gruwel 0.9 | 2.2 | 13.5% | 32 |
| rz.HawkOnFire 0.1 | 3.6 | 12.4% | 8 |
| hadur117.nano.SanaroCL22 0.1 | 3.8 | 12.5% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.4 | 11.8% | 18 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 7.1% | 1 |
| wit.Chuliath 1.0 | 7.0 | 6.7% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.4 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.7 | 64.8 | 4 / 35 | 3145 |
| 2 | 3 | 59.7 | 70.5 | 3 / 35 | 2796 |
| 3 | 5 | 57.1 | 65.1 | 1 / 35 | 2535 |
| 4 | 3 | 57.8 | 64.1 | 2 / 35 | 2915 |
| 5 | 3 | 59.5 | 72.7 | 3 / 35 | 2571 |
| 6 | 5 | 57.7 | 63.5 | 2 / 35 | 2935 |
| 7 | 3 | 59.5 | 71.4 | 2 / 35 | 2757 |
| 8 | 4 | 59.9 | 69.5 | 3 / 35 | 3006 |
| 9 | 3 | 59.8 | 73.3 | 4 / 35 | 2694 |
| 10 | 4 | 58.9 | 70.5 | 0 / 35 | 2711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 84 | 2% |
| gh.mini.Gruwel 0.9 | 19 | 53% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 55% |
| rz.HawkOnFire 0.1 | 10 | 60% |

Hadur died in 326 of 350 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 155 | 48% | 156 |
| gh.mini.Gruwel 0.9 | 55 | 17% | 65 |
| dmh.robocode.robot.BlackDeath 9.2 | 49 | 15% | 58 |
| rz.HawkOnFire 0.1 | 35 | 11% | 40 |
| myl.nano.KomoriNinja 1.1 | 9 | 3% | 9 |
| wit.Chuliath 1.0 | 7 | 2% | 7 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 2% | 7 |
| dans.Cinnamon 1.2 | 5 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 4 | 1% | 4 |

## Melee bench: F36

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 69.3 | 91 / 350 | 3.76 | 13.9% | 34493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL22 0.1 | 1.4 | 13.9% | 91 |
| alpha.RainingFire 1.0 | 3.1 | 12.4% | 58 |
| bzdp.Pansy 2.1 | 3.2 | 12.3% | 49 |
| mz.Cork 0.1 | 3.8 | 11.8% | 41 |
| bvh.micro.Freya 0.3 | 4.0 | 11.5% | 35 |
| m3thos.Eva02 0.7.1 | 6.0 | 10.2% | 35 |
| bvh.mini.Fenrir 0.39 | 6.6 | 9.5% | 12 |
| dl.BetterWalls 1.0 | 8.1 | 7.1% | 12 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 6.8% | 8 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.4% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 86.3 | 15 / 35 | 3946 |
| 2 | 2 | 59.4 | 66.3 | 7 / 35 | 3500 |
| 3 | 1 | 60.7 | 70.8 | 9 / 35 | 3464 |
| 4 | 1 | 58.2 | 65.7 | 8 / 35 | 3195 |
| 5 | 1 | 60.1 | 69.2 | 9 / 35 | 3314 |
| 6 | 1 | 60.0 | 68.9 | 10 / 35 | 3441 |
| 7 | 2 | 58.2 | 62.9 | 8 / 35 | 3553 |
| 8 | 1 | 60.8 | 72.7 | 8 / 35 | 3413 |
| 9 | 3 | 57.2 | 62.2 | 5 / 35 | 3360 |
| 10 | 1 | 60.2 | 68.3 | 12 / 35 | 3307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 34 | 74% |
| bzdp.Pansy 2.1 | 31 | 45% |
| mz.Cork 0.1 | 27 | 56% |
| alpha.RainingFire 1.0 | 24 | 46% |
| bvh.mini.Fenrir 0.39 | 16 | 75% |
| m3thos.Eva02 0.7.1 | 15 | 53% |
| sample.MyFirstRobot 1.0 | 5 | 20% |
| dl.BetterWalls 1.0 | 4 | 75% |
| squidM.TentalceMeleeNano 1.1 | 3 | 67% |

Hadur died in 260 of 350 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 48 | 18% | 63 |
| alpha.RainingFire 1.0 | 41 | 16% | 50 |
| m3thos.Eva02 0.7.1 | 36 | 14% | 46 |
| bvh.micro.Freya 0.3 | 34 | 13% | 52 |
| bvh.mini.Fenrir 0.39 | 33 | 13% | 35 |
| mz.Cork 0.1 | 32 | 12% | 52 |
| dl.BetterWalls 1.0 | 15 | 6% | 27 |
| squidM.TentalceMeleeNano 1.1 | 15 | 6% | 17 |
| sample.MyFirstRobot 1.0 | 6 | 2% | 8 |

## Melee bench: F37

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 75.9 | 119 / 350 | 3.17 | 15.0% | 41767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL22 0.1 | 1.0 | 15.0% | 119 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 11.4% | 34 |
| germ.TheMind .2 | 3.0 | 11.2% | 47 |
| EBBU.Sim2 1.02 | 4.0 | 10.7% | 37 |
| agrach.Dalek 1.0 | 5.5 | 9.6% | 31 |
| stelo.UntouchableNano 1.3 | 6.4 | 9.0% | 19 |
| mb.Beast 0.1 | 7.1 | 8.6% | 23 |
| lmk.ACPFinal 0.1 | 7.4 | 8.6% | 18 |
| skm.Ryubot 1.0 | 8.4 | 8.1% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 7.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.7 | 69.8 | 8 / 35 | 4314 |
| 2 | 1 | 62.3 | 81.6 | 14 / 35 | 3551 |
| 3 | 1 | 62.0 | 75.2 | 15 / 35 | 4233 |
| 4 | 1 | 58.9 | 68.9 | 11 / 35 | 3844 |
| 5 | 1 | 64.1 | 81.6 | 15 / 35 | 4514 |
| 6 | 1 | 62.7 | 79.0 | 11 / 35 | 4396 |
| 7 | 1 | 62.1 | 76.5 | 12 / 35 | 4250 |
| 8 | 1 | 59.9 | 71.7 | 7 / 35 | 4148 |
| 9 | 1 | 59.5 | 69.8 | 11 / 35 | 3988 |
| 10 | 1 | 64.7 | 85.1 | 15 / 35 | 4529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 33 | 39% |
| germ.TheMind .2 | 28 | 50% |
| agrach.Dalek 1.0 | 25 | 72% |
| stelo.UntouchableNano 1.3 | 24 | 88% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 78% |
| lmk.ACPFinal 0.1 | 20 | 60% |
| mb.Beast 0.1 | 17 | 88% |
| skm.Ryubot 1.0 | 14 | 50% |

Hadur died in 236 of 350 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 39 | 17% | 47 |
| germ.TheMind .2 | 38 | 16% | 50 |
| com.syncleus.robocode.Dreadnaught 0.1 | 32 | 14% | 53 |
| mn.nano.perceptual.Impact 1.3.0 | 29 | 12% | 31 |
| agrach.Dalek 1.0 | 27 | 11% | 47 |
| stelo.UntouchableNano 1.3 | 21 | 9% | 34 |
| lmk.ACPFinal 0.1 | 20 | 8% | 31 |
| mb.Beast 0.1 | 16 | 7% | 32 |
| skm.Ryubot 1.0 | 14 | 6% | 23 |

## Melee bench: F38

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.9 | 61.6 | 34 / 350 | 4.46 | 11.5% | 27692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.2% | 165 |
| bvh.mini.Freya 0.55 | 2.3 | 13.3% | 43 |
| cs.Wren 1.0 | 4.1 | 11.6% | 20 |
| hadur117.nano.SanaroCL22 0.1 | 4.4 | 11.5% | 34 |
| bts.mega.Gnarly 1.4 | 4.7 | 11.1% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.9 | 11.0% | 21 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.3% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.4% | 7 |
| bzdp.BoxCar 2.0 | 9.1 | 4.3% | 0 |
| matt.UnderDark3 2.4.34 | 9.6 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.1 | 63.5 | 1 / 35 | 2762 |
| 2 | 3 | 55.3 | 60.0 | 5 / 35 | 2631 |
| 3 | 6 | 53.9 | 58.4 | 3 / 35 | 2286 |
| 4 | 4 | 57.8 | 67.3 | 2 / 35 | 3050 |
| 5 | 6 | 52.2 | 52.4 | 2 / 35 | 2630 |
| 6 | 3 | 60.3 | 71.1 | 9 / 35 | 2938 |
| 7 | 5 | 53.6 | 55.9 | 1 / 35 | 2898 |
| 8 | 4 | 55.9 | 61.6 | 4 / 35 | 2646 |
| 9 | 3 | 58.8 | 67.0 | 5 / 35 | 3222 |
| 10 | 5 | 54.6 | 58.7 | 2 / 35 | 2629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 46 | 46% |
| bts.mega.Gnarly 1.4 | 15 | 33% |
| bvh.mini.Freya 0.55 | 14 | 29% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 0% |
| kdf.KoulDestroyer 1.0 | 4 | 25% |
| cs.Wren 1.0 | 4 | 25% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 316 of 350 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 90 | 28% | 111 |
| bvh.mini.Freya 0.55 | 56 | 18% | 56 |
| cs.Wren 1.0 | 41 | 13% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 12% | 41 |
| bts.mega.Gnarly 1.4 | 37 | 12% | 43 |
| kdf.KoulDestroyer 1.0 | 37 | 12% | 37 |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 2% | 8 |
| matt.UnderDark3 2.4.34 | 6 | 2% | 7 |
| bzdp.BoxCar 2.0 | 4 | 1% | 4 |

## Melee bench: F39

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 63.0 | 34 / 350 | 4.33 | 12.0% | 31561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 16.1% | 90 |
| az.Ololobot 0.2.4 | 2.0 | 14.0% | 127 |
| hadur117.nano.SanaroCL22 0.1 | 3.3 | 12.0% | 34 |
| catcat20.Lambda 0.024 | 4.1 | 11.3% | 47 |
| stelo.SoRobotNanoMelee 1.2 | 5.1 | 9.8% | 30 |
| apollokidd.ApolloKidd 0.9 | 6.6 | 8.7% | 9 |
| gimp.GimpBot 0.1 | 7.0 | 8.3% | 2 |
| winamp32.micro.MicroMacro 1.0 | 7.1 | 8.5% | 10 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.2 | 63.8 | 3 / 35 | 3165 |
| 2 | 3 | 54.2 | 57.5 | 3 / 35 | 3161 |
| 3 | 4 | 54.7 | 60.6 | 2 / 35 | 3008 |
| 4 | 4 | 57.2 | 64.1 | 4 / 35 | 3242 |
| 5 | 3 | 55.7 | 60.0 | 6 / 35 | 3033 |
| 6 | 3 | 58.7 | 66.3 | 5 / 35 | 3541 |
| 7 | 3 | 56.6 | 64.4 | 4 / 35 | 3031 |
| 8 | 3 | 56.9 | 66.7 | 2 / 35 | 3125 |
| 9 | 3 | 56.6 | 63.8 | 3 / 35 | 3157 |
| 10 | 4 | 56.1 | 62.9 | 2 / 35 | 3098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 40 | 5% |
| bvh.fry.Freya 0.82 | 30 | 30% |
| catcat20.Lambda 0.024 | 24 | 50% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 29% |
| apollokidd.ApolloKidd 0.9 | 6 | 33% |
| winamp32.micro.MicroMacro 1.0 | 4 | 50% |
| gimp.GimpBot 0.1 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 317 of 350 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 98 | 31% | 106 |
| az.Ololobot 0.2.4 | 62 | 20% | 64 |
| stelo.SoRobotNanoMelee 1.2 | 42 | 13% | 44 |
| catcat20.Lambda 0.024 | 38 | 12% | 49 |
| apollokidd.ApolloKidd 0.9 | 29 | 9% | 30 |
| gimp.GimpBot 0.1 | 19 | 6% | 23 |
| winamp32.micro.MicroMacro 1.0 | 13 | 4% | 15 |
| dcs.Eater_of_Worlds 1.1.3-A | 10 | 3% | 11 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 2% | 8 |

## Melee bench: F41

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 67.2 | 64 / 350 | 3.95 | 13.0% | 31061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 16.6% | 158 |
| ary.Swarm 1.1 | 2.5 | 13.9% | 36 |
| lessonz.robocode.Oz 0.5.0 | 3.1 | 13.4% | 43 |
| hadur117.nano.SanaroCL22 0.1 | 3.4 | 13.0% | 64 |
| simonton.nano.MeleeSeed 1.8 | 4.9 | 11.4% | 30 |
| shrub.Silver v048 | 6.0 | 9.0% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 3 |
| stelo.Mirror 1.1 | 8.5 | 6.0% | 4 |
| jsal.Jsalbot 1.0 | 8.5 | 6.2% | 7 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 70.8 | 7 / 35 | 2957 |
| 2 | 5 | 59.3 | 66.0 | 6 / 35 | 3009 |
| 3 | 4 | 58.9 | 65.1 | 3 / 35 | 3239 |
| 4 | 3 | 57.6 | 64.1 | 5 / 35 | 2940 |
| 5 | 3 | 60.8 | 69.2 | 9 / 35 | 3301 |
| 6 | 3 | 60.4 | 69.2 | 9 / 35 | 3106 |
| 7 | 4 | 60.0 | 67.6 | 7 / 35 | 3135 |
| 8 | 3 | 59.7 | 69.2 | 4 / 35 | 3110 |
| 9 | 4 | 57.3 | 62.2 | 6 / 35 | 3060 |
| 10 | 2 | 60.1 | 68.6 | 8 / 35 | 3204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 66 | 30% |
| ary.Swarm 1.1 | 29 | 69% |
| lessonz.robocode.Oz 0.5.0 | 23 | 65% |
| simonton.nano.MeleeSeed 1.8 | 15 | 47% |
| shrub.Silver v048 | 2 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 93 | 33% | 116 |
| ary.Swarm 1.1 | 67 | 23% | 90 |
| lessonz.robocode.Oz 0.5.0 | 43 | 15% | 54 |
| simonton.nano.MeleeSeed 1.8 | 36 | 13% | 39 |
| shrub.Silver v048 | 22 | 8% | 23 |
| zyx.nano.Ant 1.1 | 15 | 5% | 15 |
| acogdev.alpha 0.2 | 6 | 2% | 7 |
| stelo.Mirror 1.1 | 4 | 1% | 5 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |

## Melee bench: F42

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 71.6 | 65 / 350 | 3.56 | 13.8% | 35445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.7% | 176 |
| maribo.mini.MiniQuester 0.1 | 2.4 | 14.7% | 46 |
| hadur117.nano.SanaroCL22 0.1 | 3.2 | 13.8% | 65 |
| ara.Shera 0.88 | 3.4 | 13.7% | 52 |
| amz.NanoClone 1.41 | 5.2 | 8.9% | 1 |
| maribo.IotaCT 1.1 | 6.1 | 7.7% | 0 |
| dsw.StaticD 1.0 | 6.9 | 7.0% | 10 |
| mme.NikeEnhanced 2.0 | 8.6 | 5.7% | 0 |
| stelo.MirrorMicro 1.0 | 8.9 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.6 | 68.6 | 5 / 35 | 3497 |
| 2 | 2 | 61.8 | 72.7 | 9 / 35 | 3686 |
| 3 | 2 | 61.6 | 72.1 | 10 / 35 | 3578 |
| 4 | 3 | 61.3 | 73.3 | 7 / 35 | 3337 |
| 5 | 3 | 62.4 | 76.8 | 7 / 35 | 3749 |
| 6 | 4 | 56.9 | 61.6 | 5 / 35 | 3067 |
| 7 | 3 | 62.0 | 75.9 | 4 / 35 | 3777 |
| 8 | 4 | 58.1 | 66.0 | 4 / 35 | 3007 |
| 9 | 3 | 62.8 | 74.6 | 7 / 35 | 3984 |
| 10 | 4 | 62.0 | 74.3 | 7 / 35 | 3763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 89 | 33% |
| ara.Shera 0.88 | 30 | 40% |
| maribo.mini.MiniQuester 0.1 | 25 | 76% |
| dsw.StaticD 1.0 | 5 | 40% |
| amz.NanoClone 1.41 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 110 | 38% | 140 |
| maribo.mini.MiniQuester 0.1 | 64 | 22% | 82 |
| ara.Shera 0.88 | 61 | 21% | 73 |
| amz.NanoClone 1.41 | 18 | 6% | 18 |
| dsw.StaticD 1.0 | 10 | 3% | 11 |
| maribo.IotaCT 1.1 | 9 | 3% | 11 |
| stelo.MirrorMicro 1.0 | 6 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 4 | 1% | 5 |
| mme.NikeEnhanced 2.0 | 4 | 1% | 4 |

## Melee bench: F43

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 61.1 | 12 / 350 | 4.50 | 11.6% | 30503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.9% | 281 |
| brainfade.melee.Dusk 0.44 | 2.3 | 12.8% | 31 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.2% | 13 |
| hadur117.nano.SanaroCL22 0.1 | 4.2 | 11.6% | 12 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.6% | 7 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.9% | 2 |
| jab.DiamondStealer 5 | 7.3 | 7.4% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.7% | 3 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.6 | 54.6 | 1 / 35 | 2842 |
| 2 | 4 | 59.2 | 65.4 | 0 / 35 | 2969 |
| 3 | 5 | 58.0 | 61.3 | 1 / 35 | 2956 |
| 4 | 3 | 59.7 | 66.3 | 2 / 35 | 2942 |
| 5 | 5 | 55.6 | 54.6 | 0 / 35 | 2783 |
| 6 | 5 | 56.2 | 56.8 | 1 / 35 | 3075 |
| 7 | 5 | 57.6 | 58.1 | 3 / 35 | 3203 |
| 8 | 4 | 58.1 | 61.6 | 1 / 35 | 2936 |
| 9 | 3 | 60.4 | 64.4 | 1 / 35 | 3507 |
| 10 | 3 | 61.1 | 67.6 | 2 / 35 | 3290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 68 | 6% |
| brainfade.melee.Dusk 0.44 | 16 | 50% |
| mz.NanoGod 2.02 | 1 | 0% |
| dummy.micro.Sparrow 2.5 | 1 | 0% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 0% |

Hadur died in 338 of 350 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 159 | 47% | 161 |
| brainfade.melee.Dusk 0.44 | 50 | 15% | 58 |
| dummy.micro.Sparrow 2.5 | 43 | 13% | 44 |
| wcsv.melee.EngineerMelee 0.1 | 36 | 11% | 36 |
| mz.NanoGod 2.02 | 21 | 6% | 21 |
| Krabb.akim2.Akim2 1.1b | 15 | 4% | 16 |
| jab.DiamondStealer 5 | 13 | 4% | 13 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |

## Melee bench: F44

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 68.9 | 46 / 350 | 3.80 | 13.6% | 37038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 17.4% | 163 |
| tzu.TheArtOfWar 1.2 | 2.0 | 15.3% | 96 |
| hadur117.nano.SanaroCL22 0.1 | 2.9 | 13.6% | 46 |
| wompi.Quokka 1.6 | 4.7 | 10.3% | 18 |
| jwirde.Gort 2.0 | 4.7 | 10.2% | 18 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.6 | 9.2% | 7 |
| disan.Chair 2.2.0 | 7.3 | 7.5% | 2 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.9% | 2 |
| sample.Crazy 1.0 | 9.3 | 4.9% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 66.7 | 5 / 35 | 3447 |
| 2 | 3 | 58.7 | 67.6 | 2 / 35 | 3192 |
| 3 | 3 | 57.6 | 63.2 | 3 / 35 | 3343 |
| 4 | 3 | 62.8 | 74.0 | 6 / 35 | 3954 |
| 5 | 3 | 59.3 | 65.4 | 6 / 35 | 3401 |
| 6 | 2 | 62.6 | 74.9 | 6 / 35 | 4034 |
| 7 | 3 | 59.8 | 68.3 | 3 / 35 | 3854 |
| 8 | 3 | 62.2 | 72.4 | 7 / 35 | 3870 |
| 9 | 3 | 61.1 | 69.5 | 4 / 35 | 4098 |
| 10 | 3 | 60.2 | 67.0 | 4 / 35 | 3845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 67 | 34% |
| tzu.TheArtOfWar 1.2 | 55 | 20% |
| jwirde.Gort 2.0 | 13 | 69% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 25% |
| wompi.Quokka 1.6 | 4 | 25% |
| disan.Chair 2.2.0 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 304 of 350 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 104 | 34% | 126 |
| tzu.TheArtOfWar 1.2 | 96 | 32% | 105 |
| wompi.Quokka 1.6 | 27 | 9% | 28 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 21 | 7% | 21 |
| jwirde.Gort 2.0 | 19 | 6% | 32 |
| stf.PanzerGeneral 0.1 | 12 | 4% | 12 |
| disan.Chair 2.2.0 | 12 | 4% | 12 |
| amk.jointstrike.JointStrike 0.2 | 8 | 3% | 8 |
| sample.Crazy 1.0 | 5 | 2% | 6 |

## Melee bench: F45

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 69.9 | 58 / 350 | 3.71 | 14.3% | 38835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL22 0.1 | 1.1 | 14.3% | 58 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 13.2% | 181 |
| jje.BagPuss 1.2 | 2.6 | 12.8% | 27 |
| sul.Lunar 1.1 | 4.5 | 10.9% | 31 |
| myl.nano.Graviton 1.10 | 4.9 | 10.6% | 13 |
| hvilela.HVilela 0.9 | 5.9 | 9.6% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 8.1% | 10 |
| fm.claire 1.7 | 7.5 | 8.2% | 4 |
| wit.Deep7 2.0 | 8.8 | 6.9% | 21 |
| abud.ThirdRobo 1.0 | 9.9 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.5 | 63.8 | 4 / 35 | 3715 |
| 2 | 1 | 59.0 | 65.1 | 7 / 35 | 3595 |
| 3 | 1 | 61.2 | 71.1 | 4 / 35 | 3937 |
| 4 | 1 | 59.7 | 70.2 | 4 / 35 | 3480 |
| 5 | 1 | 60.3 | 69.5 | 8 / 35 | 3734 |
| 6 | 1 | 61.6 | 72.1 | 7 / 35 | 3971 |
| 7 | 1 | 59.9 | 66.7 | 3 / 35 | 4051 |
| 8 | 1 | 61.4 | 71.4 | 5 / 35 | 3944 |
| 9 | 1 | 62.5 | 72.4 | 8 / 35 | 4349 |
| 10 | 1 | 63.3 | 76.5 | 8 / 35 | 4059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 85 | 40% |
| sul.Lunar 1.1 | 20 | 25% |
| jje.BagPuss 1.2 | 18 | 39% |
| myl.nano.Graviton 1.10 | 7 | 43% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 83% |
| wit.Deep7 2.0 | 6 | 17% |
| abud.ThirdRobo 1.0 | 3 | 67% |
| fm.claire 1.7 | 2 | 50% |
| hvilela.HVilela 0.9 | 1 | 0% |

Hadur died in 293 of 350 rounds, at a mean tick of 1168. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 60 | 20% | 89 |
| eem.IWillFireNoBullet v2.8 | 56 | 19% | 0 |
| myl.nano.Graviton 1.10 | 44 | 15% | 63 |
| sul.Lunar 1.1 | 42 | 14% | 69 |
| hvilela.HVilela 0.9 | 36 | 12% | 43 |
| fm.claire 1.7 | 17 | 6% | 21 |
| wit.Deep7 2.0 | 15 | 5% | 23 |
| abud.ThirdRobo 1.0 | 12 | 4% | 19 |
| pez.mini.ChironexFleckeri 0.5 | 11 | 4% | 23 |

## Melee bench: F46

hadur117.nano.SanaroCL22 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 69.3 | 34 / 350 | 3.77 | 12.5% | 28427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.4 | 17.7% | 144 |
| rsalesc.melee.Medina 0.4.5 | 1.6 | 16.6% | 128 |
| hadur117.nano.SanaroCL22 0.1 | 3.1 | 12.5% | 34 |
| cx.Princess 1.0 | 4.6 | 10.6% | 27 |
| mz.MicroSheep 1.0 | 4.6 | 10.7% | 10 |
| sadoner.killer 0.2 | 5.8 | 9.3% | 6 |
| arthord.NanoSatanMelee Beta | 6.9 | 7.9% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.5% | 0 |
| kurios.DOSexe .9a | 9.1 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 68.3 | 3 / 35 | 2769 |
| 2 | 3 | 56.6 | 66.0 | 3 / 35 | 2484 |
| 3 | 3 | 60.5 | 76.2 | 4 / 35 | 2602 |
| 4 | 3 | 60.4 | 74.0 | 6 / 35 | 2731 |
| 5 | 4 | 55.2 | 61.0 | 3 / 35 | 2565 |
| 6 | 3 | 58.1 | 67.3 | 2 / 35 | 2913 |
| 7 | 3 | 58.3 | 67.3 | 3 / 35 | 3182 |
| 8 | 3 | 59.2 | 70.8 | 3 / 35 | 2730 |
| 9 | 3 | 59.4 | 67.6 | 3 / 35 | 3341 |
| 10 | 3 | 60.8 | 74.3 | 4 / 35 | 3110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 53 | 26% |
| rsalesc.melee.Medina 0.4.5 | 38 | 24% |
| cx.Princess 1.0 | 12 | 50% |
| mz.MicroSheep 1.0 | 8 | 25% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| sadoner.killer 0.2 | 2 | 0% |

Hadur died in 316 of 350 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 127 | 40% | 144 |
| rsalesc.melee.Medina 0.4.5 | 83 | 26% | 88 |
| mz.MicroSheep 1.0 | 32 | 10% | 34 |
| cx.Princess 1.0 | 28 | 9% | 33 |
| sadoner.killer 0.2 | 22 | 7% | 24 |
| arthord.NanoSatanMelee Beta | 16 | 5% | 17 |
| jeremyreeder.collective.Prophet 5 | 4 | 1% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |

