# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 73.3 | 70 / 350 | 3.41 | 13.6% | 33648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 211 |
| hadur117.nano.SanaroCL12 0.1 | 2.3 | 13.6% | 70 |
| sgp.JollyNinja 3.53 | 3.4 | 12.0% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.5% | 10 |
| mz.MicroGodMelee 1 | 4.5 | 11.3% | 11 |
| lorneswork.Predator 1.0 | 5.5 | 10.6% | 8 |
| adt.Ar2 1.0 | 7.1 | 7.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.6% | 1 |
| skm.butterfly 1.0 | 8.9 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 9.9 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.8 | 69.5 | 4 / 35 | 2889 |
| 2 | 2 | 62.9 | 79.0 | 11 / 35 | 3585 |
| 3 | 2 | 62.8 | 77.8 | 10 / 35 | 3513 |
| 4 | 2 | 62.0 | 77.8 | 5 / 35 | 3453 |
| 5 | 2 | 62.4 | 78.7 | 5 / 35 | 3343 |
| 6 | 2 | 59.1 | 66.3 | 5 / 35 | 3388 |
| 7 | 2 | 61.2 | 72.4 | 10 / 35 | 3499 |
| 8 | 3 | 60.4 | 71.1 | 7 / 35 | 3106 |
| 9 | 2 | 60.7 | 71.7 | 7 / 35 | 3567 |
| 10 | 2 | 59.5 | 68.3 | 6 / 35 | 3305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 23% |
| sgp.JollyNinja 3.53 | 31 | 65% |
| mz.MicroGodMelee 1 | 13 | 85% |
| lorneswork.Predator 1.0 | 9 | 56% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 88% |

Hadur died in 281 of 350 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 123 | 44% | 151 |
| sgp.JollyNinja 3.53 | 42 | 15% | 55 |
| simonton.nano.WeekendObsession_Melee 1.0 | 38 | 14% | 44 |
| lorneswork.Predator 1.0 | 34 | 12% | 41 |
| mz.MicroGodMelee 1 | 22 | 8% | 38 |
| adt.Ar2 1.0 | 15 | 5% | 15 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 65.2 | 67 / 350 | 4.13 | 13.0% | 34973 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.3 | 15.6% | 116 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.8 | 14.5% | 64 |
| hadur117.nano.SanaroCL12 0.1 | 3.2 | 13.0% | 67 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.4% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.9 | 10.2% | 31 |
| Noran.BitchingElk 0.054 | 6.9 | 8.1% | 20 |
| sch.Simone 0.3d | 7.0 | 8.5% | 27 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.8% | 6 |
| stelo.PatternRobot 1.0 | 8.7 | 6.4% | 10 |
| fullsail.SweetTea 1.1 | 9.9 | 4.6% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 66.3 | 7 / 35 | 3503 |
| 2 | 3 | 58.1 | 63.2 | 5 / 35 | 3384 |
| 3 | 3 | 59.1 | 65.4 | 8 / 35 | 3639 |
| 4 | 3 | 59.8 | 67.3 | 6 / 35 | 3663 |
| 5 | 5 | 55.9 | 58.4 | 4 / 35 | 3202 |
| 6 | 3 | 60.0 | 67.6 | 9 / 35 | 3299 |
| 7 | 4 | 57.9 | 62.5 | 6 / 35 | 3416 |
| 8 | 3 | 58.1 | 63.8 | 8 / 35 | 3401 |
| 9 | 3 | 59.2 | 66.3 | 7 / 35 | 3652 |
| 10 | 2 | 60.7 | 70.8 | 7 / 35 | 3814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 56 | 46% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 33 | 55% |
| sch.Simone 0.3d | 14 | 29% |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 78% |
| Noran.BitchingElk 0.054 | 8 | 63% |
| stelo.PatternRobot 1.0 | 4 | 50% |
| fnc.bandit.Bandit 5.2.0 | 3 | 33% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 2 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 69 | 24% | 83 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 56 | 20% | 76 |
| sch.Simone 0.3d | 38 | 13% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 38 | 13% | 40 |
| stelo.PatternRobot 1.0 | 26 | 9% | 29 |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 7% | 31 |
| fnc.bandit.Bandit 5.2.0 | 17 | 6% | 19 |
| Noran.BitchingElk 0.054 | 12 | 4% | 16 |
| fullsail.SweetTea 1.1 | 7 | 2% | 11 |

## Melee bench: F03

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 75.8 | 54 / 350 | 3.18 | 14.0% | 36162 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.7 | 15.8% | 129 |
| kawigi.nano.Lib 1.0 | 2.0 | 15.0% | 88 |
| hadur117.nano.SanaroCL12 0.1 | 2.8 | 14.0% | 54 |
| vuen.Cake 2.51 | 3.5 | 13.3% | 56 |
| urdos.URDOS 1.3 | 5.0 | 10.6% | 19 |
| adt.Ar1 2.1 | 6.3 | 7.7% | 3 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 83.8 | 11 / 35 | 4015 |
| 2 | 4 | 59.0 | 69.5 | 5 / 35 | 3437 |
| 3 | 2 | 62.2 | 80.6 | 7 / 35 | 3676 |
| 4 | 2 | 63.1 | 81.6 | 6 / 35 | 3840 |
| 5 | 2 | 60.9 | 76.8 | 4 / 35 | 3545 |
| 6 | 3 | 59.7 | 70.2 | 3 / 35 | 3907 |
| 7 | 3 | 61.2 | 77.8 | 8 / 35 | 3229 |
| 8 | 3 | 61.1 | 72.7 | 4 / 35 | 3896 |
| 9 | 4 | 59.3 | 71.1 | 3 / 35 | 3520 |
| 10 | 4 | 59.4 | 74.0 | 3 / 35 | 3097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 63 | 27% |
| vuen.Cake 2.51 | 42 | 50% |
| kawigi.nano.Lib 1.0 | 39 | 13% |
| urdos.URDOS 1.3 | 13 | 54% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 0% |

Hadur died in 297 of 350 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 95 | 32% | 104 |
| kawigi.nano.Lib 1.0 | 92 | 31% | 100 |
| vuen.Cake 2.51 | 41 | 14% | 67 |
| urdos.URDOS 1.3 | 36 | 12% | 44 |
| adt.Ar1 2.1 | 13 | 4% | 14 |
| oa.weak.FlyMk1 0.1 | 7 | 2% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 5 | 2% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 71.7 | 18 / 350 | 3.55 | 13.7% | 40868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.2% | 316 |
| hadur117.nano.SanaroCL12 0.1 | 2.5 | 13.7% | 18 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 13.7% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 11.1% | 6 |
| josago.Jorgito 0.16 | 5.2 | 9.0% | 1 |
| css.Delitioner 0.11 | 6.2 | 7.5% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 7.1% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.1 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 69.2 | 2 / 35 | 4177 |
| 2 | 2 | 64.5 | 79.0 | 6 / 35 | 4062 |
| 3 | 3 | 60.3 | 65.4 | 2 / 35 | 4203 |
| 4 | 2 | 61.8 | 71.7 | 0 / 35 | 4308 |
| 5 | 2 | 62.4 | 73.7 | 0 / 35 | 4319 |
| 6 | 3 | 61.1 | 67.9 | 2 / 35 | 3988 |
| 7 | 3 | 62.0 | 73.3 | 3 / 35 | 3729 |
| 8 | 3 | 62.3 | 73.7 | 0 / 35 | 4163 |
| 9 | 2 | 61.7 | 70.8 | 1 / 35 | 4063 |
| 10 | 3 | 61.7 | 72.1 | 2 / 35 | 3856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 147 | 7% |
| TNT.TNT 0.99.1 | 4 | 75% |
| apc.LeeroyJenkins2 1.0 | 2 | 50% |
| josago.Jorgito 0.16 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 332 of 350 rounds, at a mean tick of 1210. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 212 | 64% | 223 |
| apc.LeeroyJenkins2 1.0 | 47 | 14% | 50 |
| josago.Jorgito 0.16 | 29 | 9% | 30 |
| TNT.TNT 0.99.1 | 24 | 7% | 27 |
| css.Delitioner 0.11 | 10 | 3% | 10 |
| tj.zombie1n 1.0.1 | 7 | 2% | 7 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 65.7 | 57 / 350 | 4.08 | 12.4% | 28543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.1 | 16.5% | 106 |
| origin.SleepSiphon 1.7b | 2.5 | 14.0% | 100 |
| pe.minimelee.SandboxMiniMelee 1.1 | 2.8 | 12.8% | 54 |
| hadur117.nano.SanaroCL12 0.1 | 3.6 | 12.4% | 57 |
| mld.Wisdom 1.0 | 5.1 | 11.0% | 9 |
| gg.Wolverine 2.0 | 6.2 | 8.8% | 12 |
| spinnercat.Omen 1.0 | 6.8 | 8.1% | 3 |
| DBall.NUKE 0.1 | 8.3 | 6.9% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.6% | 7 |
| sample.Fire 1.0 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.6 | 63.5 | 6 / 35 | 2917 |
| 2 | 4 | 57.4 | 62.9 | 7 / 35 | 2844 |
| 3 | 3 | 58.6 | 68.6 | 7 / 35 | 2667 |
| 4 | 3 | 60.2 | 70.5 | 11 / 35 | 2932 |
| 5 | 3 | 56.8 | 64.8 | 2 / 35 | 2884 |
| 6 | 4 | 56.6 | 61.3 | 3 / 35 | 3188 |
| 7 | 4 | 58.3 | 67.9 | 4 / 35 | 2828 |
| 8 | 4 | 59.3 | 68.9 | 5 / 35 | 3065 |
| 9 | 4 | 54.5 | 57.8 | 4 / 35 | 2620 |
| 10 | 3 | 59.9 | 71.4 | 8 / 35 | 2598 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 45 | 58% |
| origin.SleepSiphon 1.7b | 23 | 43% |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 39% |
| mld.Wisdom 1.0 | 9 | 67% |
| gg.Wolverine 2.0 | 3 | 67% |
| DBall.NUKE 0.1 | 2 | 50% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |
| spinnercat.Omen 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 90 | 30% | 110 |
| pe.minimelee.SandboxMiniMelee 1.1 | 65 | 22% | 72 |
| origin.SleepSiphon 1.7b | 57 | 19% | 70 |
| mld.Wisdom 1.0 | 43 | 14% | 49 |
| gg.Wolverine 2.0 | 14 | 5% | 16 |
| spinnercat.Omen 1.0 | 11 | 4% | 13 |
| DBall.NUKE 0.1 | 7 | 2% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 2% | 8 |
| sample.Fire 1.0 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 81.2 | 79 / 350 | 2.69 | 15.8% | 42888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.3 | 18.1% | 103 |
| rsalesc.melee.Monk 0.3.6c | 1.9 | 17.5% | 93 |
| hadur117.nano.SanaroCL12 0.1 | 2.8 | 15.8% | 79 |
| franzor.Lizt 1.3.1 | 4.4 | 11.6% | 49 |
| oog.melee.CapuletDroid 1.1 | 4.6 | 11.8% | 24 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.0% | 1 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.8% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.1 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.2 | 83.8 | 11 / 35 | 4627 |
| 2 | 3 | 65.6 | 78.7 | 10 / 35 | 4198 |
| 3 | 3 | 65.1 | 81.6 | 5 / 35 | 3705 |
| 4 | 3 | 66.4 | 83.5 | 7 / 35 | 4368 |
| 5 | 3 | 64.6 | 76.5 | 6 / 35 | 4127 |
| 6 | 3 | 66.3 | 83.2 | 8 / 35 | 4479 |
| 7 | 3 | 63.9 | 74.3 | 2 / 35 | 4318 |
| 8 | 2 | 67.2 | 83.5 | 12 / 35 | 4392 |
| 9 | 3 | 65.4 | 81.6 | 6 / 35 | 4016 |
| 10 | 2 | 67.9 | 85.7 | 12 / 35 | 4658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 106 | 46% |
| rsalesc.melee.Monk 0.3.6c | 44 | 7% |
| oog.melee.CapuletDroid 1.1 | 27 | 67% |
| franzor.Lizt 1.3.1 | 25 | 32% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 271 of 350 rounds, at a mean tick of 1299. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 122 | 45% | 190 |
| rsalesc.melee.Monk 0.3.6c | 81 | 30% | 89 |
| oog.melee.CapuletDroid 1.1 | 32 | 12% | 48 |
| franzor.Lizt 1.3.1 | 24 | 9% | 4 |
| exauge.GateKeeper 1.1.121g | 6 | 2% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6 | 2% | 8 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 10 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 71.3 | 86 / 350 | 3.59 | 13.9% | 33428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.8 | 14.4% | 95 |
| shrub.Vapour v159 | 2.0 | 14.3% | 93 |
| hadur117.nano.SanaroCL12 0.1 | 2.2 | 13.9% | 86 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.6% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.7% | 28 |
| m3thos.Eva00 1.1 | 6.0 | 8.8% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 6.6 | 8.5% | 14 |
| qualidafial.MajorDick 1.0.1 | 8.1 | 7.0% | 4 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 6.4% | 1 |
| SHAM.WOW 1.4 | 9.3 | 6.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 71.7 | 9 / 35 | 3090 |
| 2 | 3 | 59.2 | 72.1 | 5 / 35 | 3102 |
| 3 | 1 | 62.4 | 72.4 | 14 / 35 | 3810 |
| 4 | 2 | 60.3 | 69.8 | 13 / 35 | 3403 |
| 5 | 1 | 62.0 | 76.8 | 10 / 35 | 3583 |
| 6 | 3 | 57.5 | 64.1 | 6 / 35 | 3177 |
| 7 | 3 | 60.3 | 69.2 | 8 / 35 | 3591 |
| 8 | 2 | 61.8 | 76.8 | 6 / 35 | 3580 |
| 9 | 2 | 58.5 | 69.5 | 8 / 35 | 2964 |
| 10 | 2 | 59.0 | 70.2 | 7 / 35 | 3128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 62 | 55% |
| shrub.Vapour v159 | 34 | 32% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 47% |
| Krabb.sliNk.Garm 0.9u | 13 | 85% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 80% |
| m3thos.Eva00 1.1 | 9 | 67% |
| SHAM.WOW 1.4 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 25% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 265 of 350 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 72 | 27% | 81 |
| tm.Yuugao 1.0 | 71 | 27% | 111 |
| com.spp.robocode.MostlyHarmless 010 | 32 | 12% | 44 |
| Krabb.sliNk.Garm 0.9u | 27 | 10% | 32 |
| m3thos.Eva00 1.1 | 22 | 8% | 28 |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 6% | 20 |
| zyx.nano.BacillusComma 1.0 | 9 | 3% | 13 |
| qualidafial.MajorDick 1.0.1 | 9 | 3% | 8 |
| SHAM.WOW 1.4 | 8 | 3% | 13 |

## Melee bench: F09

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.2 | 58.9 | 34 / 350 | 4.70 | 11.2% | 27171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.1% | 193 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 63 |
| yagami.Tidus 0.11 | 3.8 | 11.3% | 3 |
| hadur117.nano.SanaroCL12 0.1 | 4.1 | 11.2% | 34 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.5% | 30 |
| mc2.enemy.Original 0.9 | 5.3 | 9.8% | 23 |
| dft.Calliope 5.6 | 7.1 | 7.7% | 4 |
| step.nanoPri 1.0 | 8.2 | 6.3% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.2% | 1 |
| rdm.Dueler 0.4x | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.6 | 60.3 | 4 / 35 | 2675 |
| 2 | 3 | 58.9 | 68.6 | 1 / 35 | 3044 |
| 3 | 5 | 54.2 | 56.2 | 2 / 35 | 2471 |
| 4 | 3 | 57.2 | 63.5 | 4 / 35 | 2939 |
| 5 | 5 | 54.5 | 58.1 | 1 / 35 | 2666 |
| 6 | 5 | 53.2 | 53.0 | 5 / 35 | 2569 |
| 7 | 4 | 53.7 | 54.6 | 5 / 35 | 2793 |
| 8 | 4 | 54.3 | 56.5 | 5 / 35 | 2416 |
| 9 | 4 | 57.2 | 63.8 | 5 / 35 | 2664 |
| 10 | 4 | 53.5 | 54.0 | 2 / 35 | 2934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 48 | 27% |
| kc.micro.Figment 1.0 | 30 | 43% |
| mc2.enemy.Original 0.9 | 6 | 83% |
| pedersen.Grishnakh 1.0 | 6 | 0% |
| yagami.Tidus 0.11 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 0% |
| step.nanoPri 1.0 | 1 | 100% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 318 of 350 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 80 | 25% | 94 |
| kc.micro.Figment 1.0 | 72 | 23% | 87 |
| yagami.Tidus 0.11 | 48 | 15% | 49 |
| mc2.enemy.Original 0.9 | 43 | 14% | 49 |
| pedersen.Grishnakh 1.0 | 38 | 12% | 36 |
| dft.Calliope 5.6 | 12 | 4% | 13 |
| robar.nano.Assertive_Melee 0.2 | 11 | 3% | 11 |
| step.nanoPri 1.0 | 6 | 2% | 6 |
| rdm.Dueler 0.4x | 6 | 2% | 5 |
2 death(s) with no robot to name.

## Melee bench: F10

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 78.8 | 108 / 350 | 2.91 | 15.1% | 38205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL12 0.1 | 1.6 | 15.1% | 108 |
| DTF.Kludgy 1.2b | 1.7 | 14.9% | 93 |
| ne.Chimera 1.2 | 3.0 | 13.9% | 48 |
| ejb.Polaris 1.0.1 | 3.9 | 12.8% | 34 |
| tvv.micro.Antares 1.1.1 | 5.1 | 11.1% | 46 |
| vStar.RAFzilla 2.15 | 5.7 | 10.1% | 13 |
| sam.Samspin 1.0 | 7.8 | 5.9% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.1 | 5.9% | 1 |
| kurios.DOSexe .9b | 8.4 | 5.6% | 4 |
| donjezza.Muncho 1.0 | 9.7 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 84.1 | 14 / 35 | 4201 |
| 2 | 2 | 63.7 | 80.3 | 9 / 35 | 3789 |
| 3 | 1 | 62.1 | 76.8 | 9 / 35 | 3728 |
| 4 | 1 | 64.1 | 80.3 | 12 / 35 | 3968 |
| 5 | 2 | 61.4 | 73.3 | 9 / 35 | 3569 |
| 6 | 2 | 61.6 | 76.2 | 8 / 35 | 3610 |
| 7 | 2 | 61.4 | 74.6 | 10 / 35 | 3746 |
| 8 | 1 | 65.3 | 84.8 | 16 / 35 | 4102 |
| 9 | 1 | 62.8 | 79.4 | 11 / 35 | 3657 |
| 10 | 2 | 63.2 | 78.1 | 10 / 35 | 3835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 60 | 80% |
| DTF.Kludgy 1.2b | 59 | 53% |
| tvv.micro.Antares 1.1.1 | 32 | 13% |
| ne.Chimera 1.2 | 28 | 43% |
| vStar.RAFzilla 2.15 | 13 | 69% |
| kurios.DOSexe .9b | 3 | 33% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| donjezza.Muncho 1.0 | 2 | 50% |

Hadur died in 243 of 350 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 78 | 32% | 99 |
| ne.Chimera 1.2 | 68 | 28% | 92 |
| tvv.micro.Antares 1.1.1 | 41 | 17% | 39 |
| ejb.Polaris 1.0.1 | 29 | 12% | 80 |
| vStar.RAFzilla 2.15 | 13 | 5% | 21 |
| sam.Samspin 1.0 | 6 | 2% | 6 |
| kurios.DOSexe .9b | 4 | 2% | 7 |
| donjezza.Muncho 1.0 | 2 | 1% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 64.5 | 58 / 350 | 4.19 | 12.4% | 29705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.8% | 168 |
| cx.mini.Nimrod 0.55 | 2.3 | 13.0% | 51 |
| hadur117.nano.SanaroCL12 0.1 | 2.9 | 12.4% | 58 |
| djc.DynaBot 0.1.1 | 4.2 | 10.5% | 19 |
| rdt199.Warlord 0.73 | 5.2 | 9.8% | 27 |
| br2.MobyDickBot 1.6 | 6.2 | 9.1% | 17 |
| uji.YellohFellah 1.0 | 6.8 | 8.5% | 15 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.8% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.0 | 61.0 | 2 / 35 | 3099 |
| 2 | 2 | 57.9 | 63.2 | 7 / 35 | 3352 |
| 3 | 3 | 56.8 | 62.5 | 8 / 35 | 2833 |
| 4 | 3 | 57.5 | 64.4 | 10 / 35 | 2675 |
| 5 | 2 | 59.3 | 69.2 | 5 / 35 | 3204 |
| 6 | 4 | 55.0 | 59.4 | 3 / 35 | 2853 |
| 7 | 2 | 57.5 | 66.0 | 5 / 35 | 2899 |
| 8 | 3 | 58.9 | 69.5 | 7 / 35 | 2918 |
| 9 | 3 | 58.3 | 67.3 | 6 / 35 | 3068 |
| 10 | 3 | 56.0 | 62.5 | 5 / 35 | 2804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 56 | 36% |
| cx.mini.Nimrod 0.55 | 16 | 50% |
| br2.MobyDickBot 1.6 | 12 | 75% |
| rdt199.Warlord 0.73 | 11 | 100% |
| uji.YellohFellah 1.0 | 7 | 100% |
| djc.DynaBot 0.1.1 | 5 | 60% |

Hadur died in 295 of 350 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 114 | 39% | 130 |
| cx.mini.Nimrod 0.55 | 51 | 17% | 59 |
| rdt199.Warlord 0.73 | 39 | 13% | 51 |
| djc.DynaBot 0.1.1 | 19 | 6% | 24 |
| uji.YellohFellah 1.0 | 18 | 6% | 27 |
| br2.MobyDickBot 1.6 | 17 | 6% | 25 |
| KiraNL.Chupacabra 0.4 | 17 | 6% | 17 |
| stelo.MirrorNano 1.3 | 11 | 4% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 2% | 6 |
2 death(s) with no robot to name.

## Melee bench: F12

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 65.8 | 61 / 350 | 4.07 | 12.4% | 26693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.7 | 14.6% | 107 |
| bts.wiki.RipCurl 0.9b | 1.9 | 14.6% | 80 |
| darkcanuck.Leon 1.01 | 2.7 | 13.6% | 62 |
| hadur117.nano.SanaroCL12 0.1 | 3.7 | 12.4% | 61 |
| brainfade.melee.Genghis 0.36 | 5.1 | 9.9% | 17 |
| jrm.Test0 1.0 | 6.3 | 8.6% | 7 |
| jp.Perpy 16.0 | 7.1 | 7.8% | 5 |
| cs.sheldor.Talon 1.1 | 7.6 | 7.4% | 2 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.7% | 8 |
| stuff.Vlad 0.1 | 9.7 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.2 | 60.3 | 7 / 35 | 2522 |
| 2 | 4 | 58.4 | 68.6 | 7 / 35 | 2493 |
| 3 | 4 | 55.3 | 60.6 | 5 / 35 | 2544 |
| 4 | 4 | 57.0 | 64.1 | 8 / 35 | 2653 |
| 5 | 4 | 57.5 | 65.4 | 6 / 35 | 2663 |
| 6 | 3 | 57.9 | 66.3 | 4 / 35 | 2856 |
| 7 | 4 | 57.5 | 66.0 | 5 / 35 | 2581 |
| 8 | 4 | 57.0 | 65.4 | 4 / 35 | 2679 |
| 9 | 4 | 58.7 | 69.2 | 6 / 35 | 2653 |
| 10 | 2 | 60.7 | 72.4 | 9 / 35 | 3049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 43 | 28% |
| darkcanuck.Leon 1.01 | 39 | 38% |
| bts.wiki.RipCurl 0.9b | 36 | 53% |
| brainfade.melee.Genghis 0.36 | 13 | 69% |
| jrm.Test0 1.0 | 4 | 75% |
| jaybot.bots.Oddball 4.0 | 3 | 33% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 289 of 350 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 69 | 24% | 85 |
| bts.wiki.RipCurl 0.9b | 60 | 21% | 78 |
| darkcanuck.Leon 1.01 | 57 | 20% | 76 |
| jrm.Test0 1.0 | 42 | 15% | 42 |
| brainfade.melee.Genghis 0.36 | 30 | 10% | 33 |
| cs.sheldor.Talon 1.1 | 15 | 5% | 16 |
| jaybot.bots.Oddball 4.0 | 8 | 3% | 9 |
| jp.Perpy 16.0 | 6 | 2% | 8 |
| stuff.Vlad 0.1 | 2 | 1% | 3 |

## Melee bench: F13

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 70.3 | 35 / 350 | 3.67 | 12.6% | 29419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.6% | 163 |
| ags.Glacier 0.2.11 | 1.6 | 17.5% | 96 |
| hadur117.nano.SanaroCL12 0.1 | 3.7 | 12.6% | 35 |
| gh.micro.Gruweltje 0.7 | 4.0 | 12.3% | 24 |
| shinh.Entangled 0.3 | 4.3 | 12.2% | 30 |
| apc.Colossus2 0.17 | 6.1 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.2 | 6.5% | 2 |
| ayk.WallHugger 1.0 | 7.9 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.8 | 71.1 | 0 / 35 | 2859 |
| 2 | 4 | 58.5 | 69.8 | 3 / 35 | 2498 |
| 3 | 3 | 60.4 | 75.6 | 4 / 35 | 2677 |
| 4 | 4 | 58.5 | 66.7 | 2 / 35 | 2990 |
| 5 | 3 | 61.0 | 74.6 | 7 / 35 | 2958 |
| 6 | 3 | 58.8 | 69.8 | 0 / 35 | 2925 |
| 7 | 3 | 61.4 | 73.7 | 9 / 35 | 2970 |
| 8 | 5 | 59.3 | 68.3 | 2 / 35 | 3029 |
| 9 | 4 | 59.5 | 66.7 | 5 / 35 | 3210 |
| 10 | 3 | 58.9 | 67.0 | 3 / 35 | 3303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 55 | 35% |
| ags.Glacier 0.2.11 | 46 | 11% |
| shinh.Entangled 0.3 | 21 | 33% |
| gh.micro.Gruweltje 0.7 | 7 | 29% |
| stelo.Wang 1.0 | 3 | 67% |

Hadur died in 315 of 350 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 105 | 33% | 114 |
| mn.Combat 3.25.0 | 79 | 25% | 95 |
| shinh.Entangled 0.3 | 52 | 17% | 59 |
| gh.micro.Gruweltje 0.7 | 38 | 12% | 39 |
| stelo.Wang 1.0 | 18 | 6% | 20 |
| apc.Colossus2 0.17 | 11 | 3% | 11 |
| maribo.FollowFire 1 | 7 | 2% | 7 |
| ayk.WallHugger 1.0 | 4 | 1% | 4 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 75.8 | 85 / 350 | 3.17 | 14.2% | 33131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.1 | 17.1% | 123 |
| hadur117.nano.SanaroCL12 0.1 | 2.0 | 14.2% | 85 |
| catcat20.shape.Theta 0.018 | 3.0 | 13.1% | 77 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.9 | 10.7% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.9% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.9% | 19 |
| sanyi.mikrobi.Roberto 1.0 | 6.3 | 9.4% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.4% | 17 |
| pa.Improved 1.0 | 9.0 | 5.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 77.1 | 10 / 35 | 3427 |
| 2 | 2 | 62.8 | 76.5 | 11 / 35 | 3506 |
| 3 | 2 | 63.5 | 78.7 | 8 / 35 | 3792 |
| 4 | 2 | 62.3 | 76.8 | 7 / 35 | 3548 |
| 5 | 2 | 62.4 | 76.5 | 10 / 35 | 3311 |
| 6 | 2 | 60.3 | 73.0 | 10 / 35 | 2760 |
| 7 | 3 | 59.4 | 70.8 | 7 / 35 | 2840 |
| 8 | 2 | 61.0 | 72.7 | 4 / 35 | 3428 |
| 9 | 1 | 63.1 | 81.0 | 10 / 35 | 3232 |
| 10 | 2 | 61.5 | 75.2 | 8 / 35 | 3287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 84 | 49% |
| catcat20.shape.Theta 0.018 | 48 | 46% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 47% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 58% |
| Lo_Ian.Gandalf_V4 4.0 | 10 | 20% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 50% |

Hadur died in 265 of 350 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 102 | 38% | 149 |
| catcat20.shape.Theta 0.018 | 51 | 19% | 63 |
| sanyi.mikrobi.Roberto 1.0 | 26 | 10% | 33 |
| Lo_Ian.Gandalf_V4 4.0 | 23 | 9% | 26 |
| dmh.robocode.robot.RedDwarf 0.4 | 22 | 8% | 26 |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 8% | 28 |
| co.edu.usb.rc.LidisTron 1.0 | 18 | 7% | 20 |
| pa.Improved 1.0 | 2 | 1% | 4 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |

## Melee bench: F15

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 62.9 | 48 / 350 | 4.34 | 12.3% | 33118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.7 | 15.0% | 79 |
| emp.Yngwie 1.11 | 2.2 | 14.3% | 122 |
| mld.DustBunny 3.8 | 3.0 | 13.2% | 33 |
| hadur117.nano.SanaroCL12 0.1 | 3.9 | 12.3% | 48 |
| cb.nano.Insomnia 1.0 | 4.5 | 11.9% | 26 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.6% | 36 |
| lambdaxy.TBot 0.1 | 7.2 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.8% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 70.8 | 5 / 35 | 3472 |
| 2 | 4 | 58.2 | 65.7 | 3 / 35 | 3333 |
| 3 | 4 | 57.3 | 59.7 | 6 / 35 | 3289 |
| 4 | 4 | 58.5 | 64.4 | 5 / 35 | 3334 |
| 5 | 6 | 55.9 | 59.4 | 3 / 35 | 3023 |
| 6 | 4 | 55.9 | 58.4 | 2 / 35 | 3399 |
| 7 | 3 | 59.3 | 67.3 | 4 / 35 | 3456 |
| 8 | 3 | 59.5 | 66.7 | 7 / 35 | 3464 |
| 9 | 4 | 56.8 | 59.4 | 10 / 35 | 3065 |
| 10 | 5 | 55.9 | 57.1 | 3 / 35 | 3283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 34 | 56% |
| kawigi.micro.Shiz 1.1 | 20 | 30% |
| cb.nano.Insomnia 1.0 | 15 | 60% |
| mld.DustBunny 3.8 | 13 | 15% |
| kawigi.robot.Girl 1.2 | 10 | 90% |
| divineomega.TrialBot 0.003 | 4 | 75% |

Hadur died in 302 of 350 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 75 | 25% | 100 |
| kawigi.micro.Shiz 1.1 | 65 | 22% | 73 |
| mld.DustBunny 3.8 | 58 | 19% | 63 |
| cb.nano.Insomnia 1.0 | 48 | 16% | 43 |
| kawigi.robot.Girl 1.2 | 21 | 7% | 32 |
| Grystrion.TrackerWO 1.0 | 14 | 5% | 14 |
| divineomega.TrialBot 0.003 | 9 | 3% | 13 |
| lambdaxy.TBot 0.1 | 9 | 3% | 9 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 1% | 3 |

## Melee bench: F16

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 66.2 | 51 / 350 | 4.04 | 13.2% | 36903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.0% | 149 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.2 | 14.9% | 26 |
| hadur117.nano.SanaroCL12 0.1 | 3.2 | 13.2% | 51 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.5% | 73 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.9% | 29 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.5% | 7 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.5% | 6 |
| asd.Cthulhu 1.3 | 8.7 | 5.5% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.9 | 5.1% | 9 |
| repositorio.NanoStep 1.0 | 9.4 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.0 | 57.5 | 1 / 35 | 3074 |
| 2 | 3 | 60.9 | 69.2 | 5 / 35 | 3750 |
| 3 | 3 | 60.4 | 67.9 | 5 / 35 | 3970 |
| 4 | 3 | 59.9 | 69.5 | 3 / 35 | 3593 |
| 5 | 4 | 57.5 | 58.4 | 4 / 35 | 3623 |
| 6 | 3 | 60.6 | 64.8 | 7 / 35 | 4159 |
| 7 | 3 | 60.4 | 68.3 | 5 / 35 | 3748 |
| 8 | 3 | 61.5 | 70.2 | 7 / 35 | 3859 |
| 9 | 3 | 63.0 | 73.7 | 11 / 35 | 3771 |
| 10 | 4 | 58.2 | 62.5 | 3 / 35 | 3356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 69 | 35% |
| techdude.forest.FlamingForest 1.1 | 19 | 11% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 89% |
| tvv.nano.Polaris 1.2 | 8 | 25% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| divineomega.DivineBot 1.9.4.5 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 116 | 39% | 146 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 60 | 20% | 70 |
| bvh.fnr.Fenrir 0.36l | 39 | 13% | 40 |
| techdude.forest.FlamingForest 1.1 | 35 | 12% | 39 |
| tvv.nano.Polaris 1.2 | 17 | 6% | 19 |
| stelo.IntrinsicVolatility 1.4 | 14 | 5% | 15 |
| divineomega.DivineBot 1.9.4.5 | 8 | 3% | 10 |
| asd.Cthulhu 1.3 | 8 | 3% | 8 |
| repositorio.NanoStep 1.0 | 3 | 1% | 2 |

## Melee bench: F17

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 62.8 | 51 / 350 | 4.35 | 12.2% | 32013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.8 | 14.2% | 61 |
| cx.BlestPain 1.41 | 1.8 | 13.9% | 98 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.6% | 72 |
| hadur117.nano.SanaroCL12 0.1 | 4.2 | 12.2% | 51 |
| ahf.NanoAndrew .4 | 5.2 | 11.3% | 38 |
| nic.Nicator 2.4 | 5.3 | 11.4% | 25 |
| maribo.melee.BMV 0.1 | 6.9 | 9.2% | 2 |
| tex.Longbot 0.4 | 8.1 | 6.0% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.9 | 5.3% | 2 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 61.6 | 8 / 35 | 3385 |
| 2 | 5 | 56.4 | 59.7 | 3 / 35 | 3094 |
| 3 | 5 | 57.2 | 59.0 | 6 / 35 | 3313 |
| 4 | 5 | 54.8 | 58.1 | 2 / 35 | 2887 |
| 5 | 4 | 58.9 | 65.7 | 5 / 35 | 3543 |
| 6 | 4 | 57.0 | 61.6 | 4 / 35 | 3236 |
| 7 | 3 | 58.2 | 64.4 | 5 / 35 | 3279 |
| 8 | 5 | 58.0 | 66.0 | 5 / 35 | 2826 |
| 9 | 3 | 58.3 | 66.0 | 6 / 35 | 3100 |
| 10 | 4 | 59.2 | 65.7 | 7 / 35 | 3350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 28 | 43% |
| cx.BlestPain 1.41 | 24 | 58% |
| oog.melee.Mercutio 1.0 | 20 | 80% |
| ahf.NanoAndrew .4 | 14 | 29% |
| nic.Nicator 2.4 | 6 | 17% |
| maribo.melee.BMV 0.1 | 4 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 63 | 21% | 77 |
| cx.BlestPain 1.41 | 60 | 20% | 73 |
| ahf.NanoAndrew .4 | 58 | 19% | 62 |
| oog.melee.Mercutio 1.0 | 54 | 18% | 69 |
| nic.Nicator 2.4 | 33 | 11% | 36 |
| maribo.melee.BMV 0.1 | 23 | 8% | 25 |
| tex.Longbot 0.4 | 4 | 1% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 1% | 3 |
| goblin.Bender 2.4 | 2 | 1% | 1 |

## Melee bench: F18

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 66.0 | 60 / 350 | 4.06 | 12.6% | 29210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.0 | 14.2% | 94 |
| agd.Mooserwirt2 2.7 | 3.1 | 12.3% | 63 |
| hadur117.nano.SanaroCL12 0.1 | 3.1 | 12.6% | 60 |
| uji.DBH 1.1 | 3.8 | 11.8% | 45 |
| ratosh.Nobo 0.21 | 4.9 | 10.8% | 14 |
| spinnercat.Robovirus 2.718 | 5.4 | 10.5% | 22 |
| sigterm.Sigterm 1.0 | 6.9 | 9.2% | 33 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 7.2% | 7 |
| stelo.WangRobot 1.0 | 8.8 | 6.1% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.5 | 67.9 | 7 / 35 | 2795 |
| 2 | 4 | 54.7 | 61.3 | 2 / 35 | 2551 |
| 3 | 3 | 57.6 | 67.3 | 5 / 35 | 2912 |
| 4 | 2 | 57.3 | 66.3 | 6 / 35 | 2724 |
| 5 | 2 | 60.1 | 69.8 | 6 / 35 | 3577 |
| 6 | 5 | 54.7 | 61.3 | 5 / 35 | 2449 |
| 7 | 3 | 58.0 | 66.7 | 10 / 35 | 2836 |
| 8 | 5 | 54.9 | 58.4 | 5 / 35 | 2944 |
| 9 | 2 | 59.0 | 69.2 | 5 / 35 | 3247 |
| 10 | 2 | 60.2 | 72.1 | 9 / 35 | 3175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 38 | 39% |
| agd.Mooserwirt2 2.7 | 30 | 53% |
| uji.DBH 1.1 | 17 | 41% |
| spinnercat.Robovirus 2.718 | 14 | 64% |
| stelo.WangRobot 1.0 | 10 | 50% |
| sigterm.Sigterm 1.0 | 9 | 44% |
| ratosh.Nobo 0.21 | 3 | 67% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 33% |

Hadur died in 291 of 350 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 88 | 30% | 103 |
| agd.Mooserwirt2 2.7 | 46 | 16% | 63 |
| ratosh.Nobo 0.21 | 35 | 12% | 41 |
| uji.DBH 1.1 | 34 | 12% | 39 |
| spinnercat.Robovirus 2.718 | 22 | 8% | 26 |
| sigterm.Sigterm 1.0 | 21 | 7% | 27 |
| kawigi.mini.Fhqwhgads 1.1 | 21 | 7% | 24 |
| stelo.WangRobot 1.0 | 12 | 4% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 11 | 4% | 11 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 80.5 | 111 / 350 | 2.76 | 15.8% | 38802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.7 | 16.2% | 113 |
| hadur117.nano.SanaroCL12 0.1 | 2.0 | 15.8% | 111 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 16.2% | 86 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.8% | 12 |
| erdnis.Rover 0.3 | 4.7 | 10.5% | 8 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.3% | 6 |
| pac.ABC 2.1 | 7.2 | 7.4% | 13 |
| mbh.Mbh 0.1 | 7.6 | 7.2% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.7% | 1 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.8 | 12 / 35 | 4374 |
| 2 | 1 | 65.0 | 80.3 | 10 / 35 | 3949 |
| 3 | 3 | 64.4 | 78.4 | 12 / 35 | 3593 |
| 4 | 3 | 65.6 | 82.2 | 14 / 35 | 3571 |
| 5 | 2 | 65.0 | 79.4 | 13 / 35 | 3904 |
| 6 | 2 | 64.5 | 79.4 | 10 / 35 | 3592 |
| 7 | 3 | 64.5 | 78.4 | 9 / 35 | 3698 |
| 8 | 1 | 65.9 | 81.0 | 13 / 35 | 4119 |
| 9 | 1 | 65.8 | 84.1 | 12 / 35 | 3647 |
| 10 | 3 | 64.5 | 77.8 | 6 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 89 | 53% |
| davidalves.net.DuelistMiniMelee 1.2 | 74 | 55% |
| krillr.mini.JointStrike 2.0.0 | 14 | 79% |
| erdnis.Rover 0.3 | 7 | 71% |
| pac.ABC 2.1 | 7 | 43% |
| patson.PatsonTestBot 1.0 | 3 | 67% |
| pbg.R2D2 1.0 | 2 | 50% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 239 of 350 rounds, at a mean tick of 1025. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 84 | 35% | 156 |
| mld.Infinity 2.2 | 66 | 28% | 41 |
| krillr.mini.JointStrike 2.0.0 | 30 | 13% | 51 |
| erdnis.Rover 0.3 | 27 | 11% | 37 |
| pac.ABC 2.1 | 15 | 6% | 22 |
| patson.PatsonTestBot 1.0 | 12 | 5% | 27 |
| pbg.R2D2 1.0 | 3 | 1% | 8 |
| mbh.Mbh 0.1 | 2 | 1% | 6 |

## Melee bench: F20

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 69.9 | 68 / 350 | 3.71 | 13.5% | 33146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.4% | 146 |
| hadur117.nano.SanaroCL12 0.1 | 2.2 | 13.5% | 68 |
| fwb.Nine 1.0.1 | 3.0 | 12.1% | 44 |
| nz.jdc.nano.GridFu 1.0 | 3.9 | 11.4% | 19 |
| catcat20.Rabbit 0.001 | 5.5 | 10.1% | 28 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 9.0% | 11 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 8.7% | 16 |
| bayen.nut.Squirrel 1.615 | 7.4 | 8.1% | 14 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 68.9 | 7 / 35 | 3618 |
| 2 | 2 | 60.9 | 74.6 | 6 / 35 | 3318 |
| 3 | 2 | 58.3 | 67.3 | 5 / 35 | 3086 |
| 4 | 2 | 60.8 | 72.1 | 6 / 35 | 3493 |
| 5 | 2 | 60.8 | 71.4 | 8 / 35 | 3397 |
| 6 | 2 | 60.6 | 70.8 | 11 / 35 | 3302 |
| 7 | 2 | 59.4 | 68.3 | 5 / 35 | 3321 |
| 8 | 3 | 58.5 | 65.4 | 7 / 35 | 3112 |
| 9 | 2 | 61.1 | 75.6 | 7 / 35 | 3346 |
| 10 | 3 | 58.4 | 65.1 | 6 / 35 | 3153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 77 | 40% |
| fwb.Nine 1.0.1 | 34 | 56% |
| nz.jdc.nano.GridFu 1.0 | 11 | 64% |
| catcat20.Rabbit 0.001 | 7 | 71% |
| m3thos.mini.Eva01 0.5.5 | 3 | 33% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 283 of 350 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 129 | 46% | 150 |
| fwb.Nine 1.0.1 | 44 | 16% | 44 |
| nz.jdc.nano.GridFu 1.0 | 39 | 14% | 53 |
| bayen.nut.Squirrel 1.615 | 18 | 6% | 22 |
| catcat20.Rabbit 0.001 | 17 | 6% | 32 |
| djdjdj.NanoSkunk10 1.0 | 12 | 4% | 19 |
| m3thos.mini.Eva01 0.5.5 | 12 | 4% | 16 |
| ntc.ControlledChaos 1.1.4 | 9 | 3% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 1% | 5 |

## Melee bench: F21

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.2 | 104 / 350 | 2.87 | 16.1% | 43561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.1 | 17.8% | 171 |
| hadur117.nano.SanaroCL12 0.1 | 2.3 | 16.1% | 104 |
| dummy.mini.Scimitar 1.01 | 2.6 | 15.0% | 29 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 16 |
| eld.Hmm 1.0 | 5.3 | 9.0% | 24 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.5% | 5 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 1 |
| fire219.CatBot 1.0 | 7.8 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.6 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 82.5 | 9 / 35 | 4344 |
| 2 | 1 | 67.0 | 83.5 | 13 / 35 | 4695 |
| 3 | 3 | 63.2 | 74.9 | 7 / 35 | 4071 |
| 4 | 3 | 65.5 | 79.7 | 12 / 35 | 4487 |
| 5 | 2 | 65.1 | 78.4 | 12 / 35 | 4246 |
| 6 | 2 | 66.5 | 83.5 | 13 / 35 | 4414 |
| 7 | 3 | 63.8 | 76.2 | 10 / 35 | 4173 |
| 8 | 2 | 66.2 | 80.3 | 9 / 35 | 4928 |
| 9 | 3 | 63.9 | 76.2 | 10 / 35 | 4079 |
| 10 | 2 | 64.0 | 76.5 | 9 / 35 | 4124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 123 | 41% |
| dummy.mini.Scimitar 1.01 | 40 | 85% |
| cf.RiO.RiOx 4.2.1 | 16 | 50% |
| eld.Hmm 1.0 | 14 | 64% |
| oa.weak.BotherBot 0.1 | 4 | 50% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 246 of 350 rounds, at a mean tick of 1188. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 99 | 40% | 136 |
| dummy.mini.Scimitar 1.01 | 62 | 25% | 102 |
| cf.RiO.RiOx 4.2.1 | 41 | 17% | 46 |
| oa.weak.BotherBot 0.1 | 13 | 5% | 18 |
| eld.Hmm 1.0 | 12 | 5% | 28 |
| el.JumpShoot 0.2 | 6 | 2% | 6 |
| fire219.CatBot 1.0 | 6 | 2% | 6 |
| PSW.Relentless 0.1 | 5 | 2% | 5 |
| arthord.MannyPacquiao Beta | 2 | 1% | 3 |

## Melee bench: F23

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.9 | 91 / 350 | 2.72 | 15.7% | 37897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.5% | 156 |
| cre.Karolos 0.32 | 2.4 | 15.1% | 66 |
| hadur117.nano.SanaroCL12 0.1 | 2.5 | 15.7% | 91 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.4% | 24 |
| stelo.RamTrackSurfer 1.2 | 6.1 | 9.0% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 9.0% | 3 |
| cw.megas.Blade 0.8 | 6.3 | 8.8% | 2 |
| sample.Walls 1.0 | 7.4 | 8.2% | 3 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.4 | 80.0 | 8 / 35 | 3892 |
| 2 | 2 | 65.8 | 81.3 | 8 / 35 | 4216 |
| 3 | 2 | 63.8 | 77.5 | 10 / 35 | 3491 |
| 4 | 3 | 65.8 | 82.2 | 10 / 35 | 3727 |
| 5 | 3 | 64.2 | 79.0 | 10 / 35 | 3101 |
| 6 | 3 | 66.0 | 82.2 | 8 / 35 | 3852 |
| 7 | 2 | 66.7 | 83.8 | 12 / 35 | 3736 |
| 8 | 3 | 63.6 | 75.9 | 6 / 35 | 3685 |
| 9 | 2 | 66.3 | 82.9 | 9 / 35 | 4259 |
| 10 | 2 | 66.8 | 84.1 | 10 / 35 | 3938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 110 | 29% |
| cre.Karolos 0.32 | 57 | 49% |
| stelo.AreaTargetingBot 1.1 | 30 | 53% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 40% |
| sample.Walls 1.0 | 4 | 75% |
| cw.megas.Blade 0.8 | 4 | 100% |

Hadur died in 259 of 350 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 133 | 51% | 168 |
| cre.Karolos 0.32 | 63 | 24% | 87 |
| stelo.AreaTargetingBot 1.1 | 35 | 14% | 45 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 11 | 4% | 17 |
| stelo.RamTrackSurfer 1.2 | 8 | 3% | 18 |
| sample.Walls 1.0 | 5 | 2% | 6 |
| cw.megas.Blade 0.8 | 4 | 2% | 8 |

## Melee bench: F24

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.0 | 60.0 | 47 / 350 | 4.60 | 11.2% | 25136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.7 | 14.7% | 73 |
| florent.XSeries.X2 0.12 | 2.5 | 13.8% | 77 |
| davidalves.Phoenix 0.54 | 2.9 | 13.2% | 74 |
| pedersen.Ugluk 1.1.1 | 3.2 | 12.9% | 46 |
| hadur117.nano.SanaroCL12 0.1 | 4.8 | 11.2% | 47 |
| oog.melee.Corsair 1.0 | 6.0 | 9.5% | 7 |
| stelo.SoJNanoMelee 1.1 | 6.9 | 8.5% | 19 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.5% | 3 |
| as.FrankTheTank 1.3 | 9.2 | 5.3% | 4 |
| evd.X1 0.01 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.5 | 52.7 | 4 / 35 | 2435 |
| 2 | 6 | 52.4 | 54.3 | 4 / 35 | 2238 |
| 3 | 4 | 57.2 | 63.8 | 6 / 35 | 2729 |
| 4 | 5 | 54.4 | 57.1 | 5 / 35 | 2376 |
| 5 | 5 | 57.9 | 65.4 | 7 / 35 | 2578 |
| 6 | 4 | 56.3 | 61.9 | 5 / 35 | 2913 |
| 7 | 5 | 54.1 | 60.3 | 4 / 35 | 2217 |
| 8 | 4 | 55.2 | 61.3 | 4 / 35 | 2535 |
| 9 | 5 | 52.9 | 54.6 | 2 / 35 | 2463 |
| 10 | 5 | 58.2 | 68.3 | 6 / 35 | 2652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 22 | 50% |
| pedersen.Ugluk 1.1.1 | 19 | 74% |
| davidalves.Phoenix 0.54 | 15 | 47% |
| florent.XSeries.X2 0.12 | 14 | 71% |
| stelo.SoJNanoMelee 1.1 | 6 | 17% |
| lunchie.Lunchbox 0.93 | 4 | 25% |
| oog.melee.Corsair 1.0 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 0% |

Hadur died in 303 of 350 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 61 | 20% | 69 |
| rz.GlowBlowMelee 1.4 | 60 | 20% | 72 |
| pedersen.Ugluk 1.1.1 | 59 | 19% | 65 |
| davidalves.Phoenix 0.54 | 57 | 19% | 67 |
| stelo.SoJNanoMelee 1.1 | 24 | 8% | 27 |
| oog.melee.Corsair 1.0 | 20 | 7% | 26 |
| lunchie.Lunchbox 0.93 | 11 | 4% | 12 |
| evd.X1 0.01 | 7 | 2% | 7 |
| as.FrankTheTank 1.3 | 4 | 1% | 5 |

## Melee bench: F25

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 68.1 | 77 / 350 | 3.87 | 13.3% | 29667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.4 | 14.9% | 94 |
| voidious.micro.BlitzBat 1.05 | 2.4 | 13.5% | 58 |
| hadur117.nano.SanaroCL12 0.1 | 2.5 | 13.3% | 77 |
| jdw.Hurricane 1.4 | 3.8 | 12.0% | 51 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 10.0% | 26 |
| ds.Oo 2.2 | 6.0 | 9.3% | 22 |
| gjr.Cephalosporin 0.1 | 7.4 | 8.1% | 15 |
| awesomeness.Elite 1.0 | 7.6 | 7.7% | 7 |
| adt.Ar2 1.1 | 8.7 | 6.8% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.0 | 61.0 | 5 / 35 | 2653 |
| 2 | 2 | 60.6 | 70.8 | 11 / 35 | 2889 |
| 3 | 1 | 63.3 | 77.1 | 12 / 35 | 3500 |
| 4 | 3 | 59.3 | 67.0 | 8 / 35 | 3058 |
| 5 | 4 | 54.7 | 60.6 | 2 / 35 | 2644 |
| 6 | 1 | 61.0 | 72.4 | 11 / 35 | 3033 |
| 7 | 2 | 58.8 | 69.2 | 5 / 35 | 2957 |
| 8 | 3 | 58.0 | 66.3 | 7 / 35 | 2808 |
| 9 | 3 | 58.3 | 67.3 | 7 / 35 | 3010 |
| 10 | 2 | 60.2 | 69.5 | 9 / 35 | 3115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 53 | 42% |
| voidious.micro.BlitzBat 1.05 | 38 | 39% |
| jdw.Hurricane 1.4 | 31 | 77% |
| gjr.Cephalosporin 0.1 | 7 | 57% |
| gre.svman4.Morfeas 1.4.1 | 7 | 71% |
| ds.Oo 2.2 | 6 | 50% |
| awesomeness.Elite 1.0 | 5 | 80% |

Hadur died in 274 of 350 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 73 | 27% | 100 |
| voidious.micro.BlitzBat 1.05 | 62 | 23% | 81 |
| jdw.Hurricane 1.4 | 43 | 16% | 59 |
| ds.Oo 2.2 | 27 | 10% | 30 |
| gre.svman4.Morfeas 1.4.1 | 20 | 7% | 27 |
| gjr.Cephalosporin 0.1 | 20 | 7% | 22 |
| adt.Ar2 1.1 | 12 | 4% | 12 |
| awesomeness.Elite 1.0 | 11 | 4% | 14 |
| amk.ChumbaMini 0.2 | 5 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 66.2 | 42 / 350 | 4.04 | 12.3% | 31497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.2 | 16.1% | 122 |
| shu.nitro.LENIN .T34 | 2.0 | 13.6% | 85 |
| lrem.Spectre 0.4.4 | 3.5 | 12.7% | 40 |
| hadur117.nano.SanaroCL12 0.1 | 3.9 | 12.3% | 42 |
| js.PinBall 1.6 | 4.9 | 11.6% | 22 |
| gh.mini.GrubbmOne 1.0 | 5.5 | 10.8% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 9.1% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 7.0% | 11 |
| sample.SpinBot 1.0 | 8.9 | 5.3% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 67.9 | 4 / 35 | 3096 |
| 2 | 5 | 57.2 | 62.9 | 2 / 35 | 2989 |
| 3 | 3 | 59.9 | 69.2 | 7 / 35 | 3370 |
| 4 | 4 | 58.5 | 67.3 | 3 / 35 | 3050 |
| 5 | 5 | 56.7 | 61.0 | 5 / 35 | 3233 |
| 6 | 5 | 58.0 | 64.8 | 4 / 35 | 3209 |
| 7 | 2 | 60.1 | 68.3 | 7 / 35 | 3504 |
| 8 | 3 | 59.6 | 71.4 | 4 / 35 | 2888 |
| 9 | 5 | 57.6 | 66.3 | 2 / 35 | 2960 |
| 10 | 3 | 57.3 | 62.9 | 4 / 35 | 3198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 46 | 22% |
| shu.nitro.LENIN .T34 | 27 | 11% |
| lrem.Spectre 0.4.4 | 24 | 75% |
| js.PinBall 1.6 | 7 | 29% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 80% |
| gh.mini.GrubbmOne 1.0 | 4 | 75% |
| jaybot.adv.bots.JayBot 2.0 | 2 | 50% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 309 of 350 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 94 | 30% | 105 |
| shu.nitro.LENIN .T34 | 59 | 19% | 65 |
| lrem.Spectre 0.4.4 | 43 | 14% | 56 |
| js.PinBall 1.6 | 36 | 12% | 40 |
| gh.mini.GrubbmOne 1.0 | 36 | 12% | 39 |
| jaybot.adv.bots.JayBot 2.0 | 25 | 8% | 26 |
| fullsail.LaxativeTeaTwo 1.0 | 11 | 4% | 15 |
| sample.SpinBot 1.0 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 66.3 | 79 / 350 | 4.03 | 12.8% | 29559 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.2 | 15.7% | 129 |
| wee.Gem 1.8.4 | 2.7 | 13.0% | 68 |
| hadur117.nano.SanaroCL12 0.1 | 2.8 | 12.8% | 79 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.5% | 30 |
| EH.Eagle 1.0.6 | 4.3 | 11.0% | 21 |
| throxbot.ThroxBot 0.1 | 7.1 | 8.2% | 10 |
| joe.ADinosaur 1.0 | 7.4 | 7.9% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 7.4 | 8.4% | 11 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.9% | 2 |
| cs.Grudge 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 72.7 | 12 / 35 | 2886 |
| 2 | 2 | 61.0 | 76.5 | 12 / 35 | 2552 |
| 3 | 2 | 60.1 | 75.6 | 9 / 35 | 2520 |
| 4 | 5 | 50.8 | 40.3 | 3 / 35 | 3662 |
| 5 | 1 | 62.5 | 73.7 | 11 / 35 | 3551 |
| 6 | 2 | 59.4 | 71.4 | 8 / 35 | 2776 |
| 7 | 2 | 59.4 | 71.4 | 10 / 35 | 2742 |
| 8 | 4 | 55.0 | 62.5 | 5 / 35 | 2334 |
| 9 | 3 | 57.5 | 70.2 | 3 / 35 | 2429 |
| 10 | 5 | 55.8 | 48.9 | 6 / 35 | 4107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 64 | 67% |
| wee.Gem 1.8.4 | 25 | 48% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 69% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 40% |
| EH.Eagle 1.0.6 | 9 | 67% |
| throxbot.ThroxBot 0.1 | 4 | 75% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |

Hadur died in 272 of 350 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 88 | 32% | 130 |
| wee.Gem 1.8.4 | 46 | 17% | 59 |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 14% | 49 |
| EH.Eagle 1.0.6 | 21 | 8% | 29 |
| joe.ADinosaur 1.0 | 20 | 7% | 20 |
| throxbot.ThroxBot 0.1 | 17 | 6% | 20 |
| cs.Grudge 1.0 | 16 | 6% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 15 | 6% | 14 |
| caimano.Furia_Ceca 0.22 | 11 | 4% | 12 |

## Melee bench: F28

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 79.2 | 130 / 350 | 2.87 | 15.3% | 31318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.4 | 15.7% | 89 |
| hadur117.nano.SanaroCL12 0.1 | 1.6 | 15.3% | 130 |
| uji.Antique 1.0 | 3.3 | 13.0% | 60 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.8% | 34 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.4% | 11 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.1% | 9 |
| ahr.ice.Ice 1.0.2 | 6.6 | 8.2% | 9 |
| matt.advanced.Katana 1.0 | 8.4 | 6.2% | 7 |
| stelo.PianistNano 1.2 | 8.9 | 5.9% | 2 |
| stelo.Lifestealer 1.0 | 9.6 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 79.0 | 16 / 35 | 2987 |
| 2 | 2 | 63.5 | 80.0 | 10 / 35 | 3442 |
| 3 | 1 | 64.7 | 85.1 | 17 / 35 | 3047 |
| 4 | 1 | 63.3 | 79.4 | 17 / 35 | 3030 |
| 5 | 1 | 64.0 | 81.3 | 13 / 35 | 3256 |
| 6 | 2 | 63.0 | 77.5 | 12 / 35 | 3124 |
| 7 | 2 | 63.9 | 81.0 | 14 / 35 | 3100 |
| 8 | 2 | 61.3 | 74.6 | 9 / 35 | 3145 |
| 9 | 2 | 62.6 | 78.1 | 12 / 35 | 3129 |
| 10 | 2 | 61.6 | 75.9 | 10 / 35 | 3058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 109 | 66% |
| uji.Antique 1.0 | 44 | 55% |
| qohnil.blot.BlotBot 3.61 | 32 | 47% |
| ahr.ice.Ice 1.0.2 | 11 | 73% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| matt.advanced.Katana 1.0 | 2 | 0% |
| amk.ChumbaWumba 0.3 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 220 of 350 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 68 | 31% | 116 |
| uji.Antique 1.0 | 38 | 17% | 71 |
| qohnil.blot.BlotBot 3.61 | 35 | 16% | 53 |
| pfvicm.Sobieski 7.2.3b | 35 | 16% | 41 |
| amk.ChumbaWumba 0.3 | 20 | 9% | 23 |
| ahr.ice.Ice 1.0.2 | 10 | 5% | 24 |
| stelo.PianistNano 1.2 | 6 | 3% | 8 |
| stelo.Lifestealer 1.0 | 4 | 2% | 7 |
| matt.advanced.Katana 1.0 | 4 | 2% | 6 |

## Melee bench: F29

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 62.9 | 44 / 350 | 4.34 | 12.3% | 30522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.5 | 16.0% | 108 |
| deewiant.Anomaly 0.2 | 1.5 | 16.0% | 114 |
| myl.micro.Troodon 1.10 | 3.5 | 12.9% | 21 |
| hadur117.nano.SanaroCL12 0.1 | 4.0 | 12.3% | 44 |
| jok.PheonixM 0.1.2 | 4.5 | 11.3% | 24 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.3% | 4 |
| DBall.Anarchy 0.1 | 6.7 | 8.1% | 27 |
| fullsail.TimbotNoPrediction 1.0 | 7.9 | 6.2% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.6% | 5 |
| jangs.ns51 1.0 | 9.6 | 4.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.5 | 63.2 | 4 / 35 | 2753 |
| 2 | 5 | 57.2 | 61.0 | 4 / 35 | 2867 |
| 3 | 3 | 58.6 | 65.4 | 4 / 35 | 3283 |
| 4 | 3 | 60.6 | 67.0 | 7 / 35 | 3332 |
| 5 | 5 | 55.0 | 57.5 | 2 / 35 | 2707 |
| 6 | 4 | 59.0 | 62.2 | 8 / 35 | 3331 |
| 7 | 3 | 58.4 | 64.1 | 4 / 35 | 2989 |
| 8 | 4 | 57.3 | 60.6 | 2 / 35 | 3188 |
| 9 | 3 | 61.1 | 72.1 | 7 / 35 | 3067 |
| 10 | 5 | 55.2 | 55.9 | 2 / 35 | 3005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 41 | 22% |
| zyx.mega.YersiniaPestis 3.1 | 33 | 58% |
| myl.micro.Troodon 1.10 | 13 | 62% |
| DBall.Anarchy 0.1 | 9 | 56% |
| jok.PheonixM 0.1.2 | 5 | 40% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 114 | 37% | 123 |
| zyx.mega.YersiniaPestis 3.1 | 68 | 22% | 84 |
| myl.micro.Troodon 1.10 | 52 | 17% | 61 |
| jok.PheonixM 0.1.2 | 39 | 13% | 41 |
| ph.melee.ArcherME 0.3 | 15 | 5% | 15 |
| DBall.Anarchy 0.1 | 11 | 4% | 16 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 2% | 6 |
| jangs.ns51 1.0 | 4 | 1% | 4 |

## Melee bench: F30

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.7 | 54.5 | 27 / 350 | 5.10 | 10.2% | 25117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 2.1 | 14.0% | 91 |
| oog.melee.Capulet 1.2 | 2.3 | 14.0% | 61 |
| catcat20.Matcha 0.006 | 2.3 | 14.2% | 91 |
| stelo.PastFuture 2.3.2 | 3.3 | 13.1% | 50 |
| hadur117.nano.SanaroCL12 0.1 | 5.2 | 10.2% | 27 |
| intruder.PrairieWolf 2.61 | 5.8 | 9.2% | 14 |
| ntc.Opposite 1.5 | 7.6 | 8.0% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.4% | 9 |
| tripphippy.Alice 1.1 | 8.2 | 7.4% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.0 | 57.5 | 4 / 35 | 2454 |
| 2 | 5 | 54.2 | 56.5 | 3 / 35 | 2665 |
| 3 | 5 | 51.6 | 52.4 | 1 / 35 | 2639 |
| 4 | 5 | 52.4 | 53.3 | 3 / 35 | 2534 |
| 5 | 6 | 49.8 | 48.9 | 1 / 35 | 2315 |
| 6 | 5 | 55.4 | 59.0 | 5 / 35 | 2728 |
| 7 | 6 | 49.4 | 47.0 | 4 / 35 | 2229 |
| 8 | 5 | 52.6 | 54.9 | 2 / 35 | 2523 |
| 9 | 5 | 51.4 | 51.4 | 1 / 35 | 2354 |
| 10 | 5 | 56.6 | 63.8 | 3 / 35 | 2676 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 20 | 25% |
| darkcanuck.B26354 1.06 | 15 | 47% |
| oog.melee.Capulet 1.2 | 12 | 42% |
| stelo.PastFuture 2.3.2 | 9 | 44% |
| intruder.PrairieWolf 2.61 | 7 | 71% |
| tripphippy.Alice 1.1 | 3 | 33% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |

Hadur died in 324 of 350 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 68 | 21% | 72 |
| catcat20.Matcha 0.006 | 55 | 17% | 61 |
| oog.melee.Capulet 1.2 | 52 | 16% | 58 |
| darkcanuck.B26354 1.06 | 50 | 15% | 55 |
| intruder.PrairieWolf 2.61 | 32 | 10% | 36 |
| fowl3628800.LightningBolt 2.6.0 | 23 | 7% | 23 |
| tripphippy.Alice 1.1 | 22 | 7% | 23 |
| ntc.Opposite 1.5 | 18 | 6% | 18 |
| GarmBox.Anger 1.0 | 4 | 1% | 4 |

## Melee bench: F31

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.9 | 56.0 | 19 / 350 | 4.96 | 10.3% | 22857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.6% | 184 |
| gh.mini.Griezel 0.2 | 2.2 | 13.8% | 75 |
| d414.nano.Quantum 1.0.0 | 3.6 | 12.1% | 26 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 12.0% | 25 |
| hadur117.nano.SanaroCL12 0.1 | 4.9 | 10.3% | 19 |
| gh.nano.Grofvuil 0.2 | 5.6 | 9.5% | 14 |
| fm.mammillarias 1.3 | 7.4 | 6.8% | 2 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.6% | 2 |
| tlp.ThreeLeggedPig 1 | 9.4 | 5.2% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 49.9 | 50.2 | 0 / 35 | 2196 |
| 2 | 4 | 56.0 | 64.8 | 1 / 35 | 2387 |
| 3 | 6 | 47.8 | 44.8 | 1 / 35 | 2023 |
| 4 | 4 | 55.5 | 60.6 | 3 / 35 | 2440 |
| 5 | 5 | 53.2 | 55.2 | 2 / 35 | 2368 |
| 6 | 5 | 52.5 | 54.3 | 1 / 35 | 2449 |
| 7 | 5 | 53.4 | 56.5 | 5 / 35 | 2166 |
| 8 | 5 | 53.9 | 59.4 | 1 / 35 | 2204 |
| 9 | 4 | 56.4 | 62.9 | 5 / 35 | 2516 |
| 10 | 6 | 50.4 | 51.4 | 0 / 35 | 2108 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 26 | 42% |
| gh.mini.Griezel 0.2 | 24 | 17% |
| spinnercat.micro.Tyger 0.1 | 8 | 13% |
| d414.nano.Quantum 1.0.0 | 7 | 29% |
| gh.nano.Grofvuil 0.2 | 5 | 20% |

Hadur died in 331 of 350 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 75 | 23% | 79 |
| abc.Shadow 3.84i | 74 | 22% | 85 |
| spinnercat.micro.Tyger 0.1 | 62 | 19% | 62 |
| d414.nano.Quantum 1.0.0 | 49 | 15% | 51 |
| gh.nano.Grofvuil 0.2 | 30 | 9% | 32 |
| fm.mammillarias 1.3 | 19 | 6% | 19 |
| timmit.nano.TimDog 0.33 | 8 | 2% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 7 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 7 | 2% | 7 |

## Melee bench: F32

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 76.5 | 122 / 350 | 3.12 | 14.7% | 32364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.0% | 99 |
| hadur117.nano.SanaroCL12 0.1 | 1.9 | 14.7% | 122 |
| apc.botM 3.0 | 3.0 | 12.8% | 59 |
| lxx.ConceptA 0.8 | 4.4 | 10.8% | 5 |
| vjik.UnViolation 1.1 | 4.8 | 10.8% | 31 |
| bayen.UbaMicro 1.4 | 5.7 | 9.3% | 13 |
| panzer.Panzer 0.2 | 7.4 | 7.6% | 1 |
| yk.JahMicro 1.0 | 8.2 | 6.9% | 12 |
| conscience.Electron 1.3g | 8.4 | 6.9% | 1 |
| donjezza.Jezza 1.0 | 9.9 | 5.2% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 76.2 | 14 / 35 | 3417 |
| 2 | 3 | 60.0 | 73.0 | 8 / 35 | 3040 |
| 3 | 2 | 61.2 | 75.6 | 12 / 35 | 3163 |
| 4 | 1 | 64.3 | 82.2 | 15 / 35 | 3719 |
| 5 | 2 | 64.4 | 84.4 | 14 / 35 | 3355 |
| 6 | 1 | 61.4 | 75.9 | 11 / 35 | 3444 |
| 7 | 2 | 59.4 | 71.7 | 9 / 35 | 3040 |
| 8 | 2 | 60.3 | 74.3 | 10 / 35 | 2917 |
| 9 | 2 | 61.0 | 74.0 | 14 / 35 | 2982 |
| 10 | 2 | 62.7 | 77.5 | 15 / 35 | 3287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 79 | 61% |
| apc.botM 3.0 | 36 | 64% |
| vjik.UnViolation 1.1 | 21 | 52% |
| yk.JahMicro 1.0 | 16 | 50% |
| bayen.UbaMicro 1.4 | 15 | 60% |
| lxx.ConceptA 0.8 | 13 | 92% |
| panzer.Panzer 0.2 | 10 | 90% |
| donjezza.Jezza 1.0 | 5 | 40% |

Hadur died in 229 of 350 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 69 | 30% | 123 |
| lxx.ConceptA 0.8 | 38 | 17% | 43 |
| apc.botM 3.0 | 32 | 14% | 54 |
| vjik.UnViolation 1.1 | 26 | 11% | 44 |
| bayen.UbaMicro 1.4 | 22 | 10% | 30 |
| panzer.Panzer 0.2 | 15 | 7% | 17 |
| conscience.Electron 1.3g | 12 | 5% | 14 |
| yk.JahMicro 1.0 | 10 | 4% | 15 |
| donjezza.Jezza 1.0 | 5 | 2% | 8 |

## Melee bench: F33

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 65.9 | 47 / 350 | 4.07 | 13.0% | 33524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.9% | 140 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 14.2% | 69 |
| hadur117.nano.SanaroCL12 0.1 | 3.1 | 13.0% | 47 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.5% | 37 |
| labg.Cataclysm 2.05 | 4.4 | 11.3% | 40 |
| baal.nano.N 1.42 | 6.4 | 8.6% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.6% | 9 |
| zyx.micro.Ant 1.1 | 8.3 | 5.7% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.6% | 4 |
| sanja.First 0.1 | 9.4 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 66.0 | 5 / 35 | 3221 |
| 2 | 4 | 59.4 | 65.4 | 5 / 35 | 3435 |
| 3 | 2 | 61.9 | 71.1 | 7 / 35 | 3898 |
| 4 | 3 | 58.4 | 64.8 | 2 / 35 | 3313 |
| 5 | 2 | 59.3 | 66.7 | 5 / 35 | 3358 |
| 6 | 3 | 58.9 | 63.8 | 6 / 35 | 3432 |
| 7 | 3 | 59.8 | 67.0 | 4 / 35 | 3349 |
| 8 | 3 | 60.5 | 68.3 | 5 / 35 | 3349 |
| 9 | 5 | 54.3 | 55.2 | 2 / 35 | 2894 |
| 10 | 3 | 60.9 | 70.8 | 6 / 35 | 3275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 45 | 36% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 20% |
| gre.svman4.Leonidas 1.3.2 | 19 | 63% |
| labg.Cataclysm 2.05 | 14 | 57% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 43% |
| baal.nano.N 1.42 | 2 | 50% |

Hadur died in 305 of 350 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 111 | 36% | 124 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 68 | 22% | 74 |
| gre.svman4.Leonidas 1.3.2 | 39 | 13% | 51 |
| labg.Cataclysm 2.05 | 29 | 10% | 39 |
| baal.nano.N 1.42 | 23 | 8% | 25 |
| kinsen.melee.Angsaichmophobia 1.8c | 19 | 6% | 21 |
| zyx.micro.Ant 1.1 | 12 | 4% | 12 |
| sanja.First 0.1 | 4 | 1% | 4 |

## Melee bench: F34

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 73.1 | 63 / 350 | 3.42 | 13.8% | 33632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.3 | 17.8% | 141 |
| kid.Gladiator .7.2 | 1.7 | 16.9% | 95 |
| hadur117.nano.SanaroCL12 0.1 | 3.0 | 13.8% | 63 |
| tcf.Reach 3 | 4.5 | 11.3% | 14 |
| jcs.Seth 1.8 | 4.5 | 11.4% | 29 |
| cli.Dancer 1.1 | 6.0 | 9.5% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 7 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.9 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 78.1 | 8 / 35 | 3413 |
| 2 | 3 | 60.7 | 67.9 | 5 / 35 | 3407 |
| 3 | 3 | 63.5 | 78.4 | 7 / 35 | 3369 |
| 4 | 3 | 60.2 | 68.9 | 6 / 35 | 3326 |
| 5 | 3 | 63.7 | 80.0 | 7 / 35 | 3244 |
| 6 | 3 | 60.3 | 69.2 | 5 / 35 | 3180 |
| 7 | 3 | 63.3 | 77.5 | 6 / 35 | 3844 |
| 8 | 3 | 59.3 | 67.9 | 5 / 35 | 3017 |
| 9 | 3 | 60.9 | 69.5 | 5 / 35 | 3384 |
| 10 | 3 | 62.7 | 73.3 | 9 / 35 | 3448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 69 | 48% |
| kid.Gladiator .7.2 | 49 | 41% |
| jcs.Seth 1.8 | 8 | 38% |
| tcf.Reach 3 | 8 | 63% |
| cli.Dancer 1.1 | 3 | 67% |
| ratosh.Wesco 1.4 | 2 | 0% |

Hadur died in 289 of 350 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 100 | 35% | 105 |
| stelo.Spread 0.9 | 95 | 33% | 136 |
| jcs.Seth 1.8 | 33 | 11% | 39 |
| tcf.Reach 3 | 25 | 9% | 32 |
| cli.Dancer 1.1 | 15 | 5% | 18 |
| ratosh.Wesco 1.4 | 12 | 4% | 13 |
| amk.Punbot.Punbot 0.01 | 6 | 2% | 6 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 64.8 | 27 / 350 | 4.17 | 11.6% | 23408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.7% | 272 |
| gh.mini.Gruwel 0.9 | 2.3 | 13.3% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.6 | 12.1% | 14 |
| rz.HawkOnFire 0.1 | 3.7 | 12.2% | 12 |
| hadur117.nano.SanaroCL12 0.1 | 4.4 | 11.6% | 27 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.2% | 0 |
| wit.Chuliath 1.0 | 6.7 | 7.1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.5 | 61.3 | 2 / 35 | 2392 |
| 2 | 4 | 56.8 | 65.7 | 3 / 35 | 2222 |
| 3 | 4 | 59.6 | 70.8 | 6 / 35 | 2351 |
| 4 | 3 | 60.7 | 75.6 | 4 / 35 | 2482 |
| 5 | 5 | 56.8 | 65.1 | 1 / 35 | 2480 |
| 6 | 4 | 56.6 | 65.7 | 4 / 35 | 2174 |
| 7 | 5 | 53.3 | 56.5 | 1 / 35 | 2176 |
| 8 | 5 | 55.5 | 59.4 | 4 / 35 | 2409 |
| 9 | 4 | 57.9 | 67.6 | 0 / 35 | 2535 |
| 10 | 5 | 54.4 | 60.0 | 2 / 35 | 2187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 68 | 3% |
| gh.mini.Gruwel 0.9 | 23 | 57% |
| rz.HawkOnFire 0.1 | 11 | 64% |
| dmh.robocode.robot.BlackDeath 9.2 | 5 | 60% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 323 of 350 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 132 | 41% | 134 |
| gh.mini.Gruwel 0.9 | 56 | 17% | 70 |
| dmh.robocode.robot.BlackDeath 9.2 | 53 | 16% | 58 |
| rz.HawkOnFire 0.1 | 50 | 15% | 54 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 12 | 4% | 12 |
| myl.nano.KomoriNinja 1.1 | 8 | 2% | 9 |
| wit.Chuliath 1.0 | 5 | 2% | 6 |
| stelo.MyAgileRobot 0.2 | 5 | 2% | 5 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 73.5 | 120 / 350 | 3.38 | 15.0% | 36574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL12 0.1 | 1.1 | 15.0% | 120 |
| alpha.RainingFire 1.0 | 2.4 | 13.0% | 61 |
| bzdp.Pansy 2.1 | 2.9 | 12.7% | 49 |
| mz.Cork 0.1 | 3.9 | 11.7% | 32 |
| bvh.micro.Freya 0.3 | 5.3 | 10.5% | 25 |
| m3thos.Eva02 0.7.1 | 6.1 | 10.0% | 26 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.8% | 15 |
| dl.BetterWalls 1.0 | 8.4 | 6.7% | 7 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.4% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.3% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 75.9 | 14 / 35 | 4069 |
| 2 | 1 | 61.8 | 72.7 | 14 / 35 | 3559 |
| 3 | 1 | 61.9 | 72.1 | 9 / 35 | 3870 |
| 4 | 1 | 62.5 | 74.0 | 14 / 35 | 3624 |
| 5 | 1 | 63.3 | 76.8 | 14 / 35 | 3592 |
| 6 | 2 | 59.5 | 68.9 | 7 / 35 | 3307 |
| 7 | 1 | 61.8 | 74.0 | 9 / 35 | 3495 |
| 8 | 1 | 64.5 | 78.4 | 16 / 35 | 3907 |
| 9 | 1 | 62.5 | 74.9 | 12 / 35 | 3551 |
| 10 | 1 | 60.2 | 67.6 | 11 / 35 | 3600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 41 | 61% |
| alpha.RainingFire 1.0 | 37 | 43% |
| mz.Cork 0.1 | 37 | 78% |
| bvh.micro.Freya 0.3 | 22 | 91% |
| m3thos.Eva02 0.7.1 | 19 | 63% |
| bvh.mini.Fenrir 0.39 | 16 | 75% |
| squidM.TentalceMeleeNano 1.1 | 5 | 60% |
| dl.BetterWalls 1.0 | 4 | 75% |
| sample.MyFirstRobot 1.0 | 3 | 0% |

Hadur died in 230 of 350 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 54 | 23% | 71 |
| bzdp.Pansy 2.1 | 46 | 20% | 80 |
| bvh.mini.Fenrir 0.39 | 38 | 17% | 40 |
| mz.Cork 0.1 | 30 | 13% | 58 |
| m3thos.Eva02 0.7.1 | 21 | 9% | 34 |
| bvh.micro.Freya 0.3 | 19 | 8% | 28 |
| squidM.TentalceMeleeNano 1.1 | 9 | 4% | 13 |
| dl.BetterWalls 1.0 | 8 | 3% | 18 |
| sample.MyFirstRobot 1.0 | 5 | 2% | 7 |

## Melee bench: F37

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 76.7 | 134 / 350 | 3.10 | 15.4% | 42836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL12 0.1 | 1.0 | 15.4% | 134 |
| germ.TheMind .2 | 2.7 | 11.4% | 36 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.1 | 11.2% | 34 |
| EBBU.Sim2 1.02 | 3.4 | 10.7% | 28 |
| agrach.Dalek 1.0 | 6.5 | 9.0% | 33 |
| stelo.UntouchableNano 1.3 | 6.5 | 9.1% | 26 |
| lmk.ACPFinal 0.1 | 7.1 | 8.9% | 11 |
| mb.Beast 0.1 | 7.4 | 8.5% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 8.5 | 7.9% | 1 |
| skm.Ryubot 1.0 | 8.8 | 7.8% | 17 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 74.6 | 10 / 35 | 4809 |
| 2 | 1 | 63.2 | 81.0 | 15 / 35 | 4122 |
| 3 | 1 | 63.6 | 80.6 | 19 / 35 | 4134 |
| 4 | 1 | 62.0 | 75.9 | 14 / 35 | 4208 |
| 5 | 1 | 62.6 | 78.1 | 12 / 35 | 4322 |
| 6 | 1 | 56.9 | 61.3 | 10 / 35 | 3848 |
| 7 | 1 | 60.6 | 73.7 | 8 / 35 | 4186 |
| 8 | 1 | 62.9 | 75.9 | 12 / 35 | 4665 |
| 9 | 1 | 63.7 | 81.3 | 17 / 35 | 4263 |
| 10 | 1 | 64.8 | 84.8 | 17 / 35 | 4279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 42 | 74% |
| EBBU.Sim2 1.02 | 31 | 58% |
| stelo.UntouchableNano 1.3 | 24 | 71% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 65% |
| skm.Ryubot 1.0 | 21 | 62% |
| lmk.ACPFinal 0.1 | 19 | 89% |
| agrach.Dalek 1.0 | 18 | 56% |
| mb.Beast 0.1 | 17 | 59% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 75% |

Hadur died in 218 of 350 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 41 | 19% | 63 |
| germ.TheMind .2 | 39 | 18% | 66 |
| EBBU.Sim2 1.02 | 31 | 14% | 44 |
| mb.Beast 0.1 | 23 | 11% | 37 |
| stelo.UntouchableNano 1.3 | 22 | 10% | 37 |
| agrach.Dalek 1.0 | 20 | 9% | 35 |
| lmk.ACPFinal 0.1 | 19 | 9% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 6% | 15 |
| skm.Ryubot 1.0 | 11 | 5% | 20 |

## Melee bench: F38

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 62.4 | 46 / 350 | 4.39 | 11.7% | 28173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.2% | 141 |
| bvh.mini.Freya 0.55 | 2.3 | 13.4% | 42 |
| bts.mega.Gnarly 1.4 | 4.1 | 11.7% | 51 |
| hadur117.nano.SanaroCL12 0.1 | 4.3 | 11.7% | 46 |
| cs.Wren 1.0 | 4.6 | 11.6% | 33 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.9 | 10.8% | 17 |
| kdf.KoulDestroyer 1.0 | 6.9 | 9.6% | 14 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.2% | 5 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.6% | 2 |
| bzdp.BoxCar 2.0 | 9.6 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 65.7 | 5 / 35 | 2991 |
| 2 | 2 | 60.1 | 73.0 | 8 / 35 | 2940 |
| 3 | 4 | 57.4 | 67.0 | 3 / 35 | 2894 |
| 4 | 4 | 57.7 | 64.4 | 6 / 35 | 2909 |
| 5 | 4 | 53.5 | 56.8 | 3 / 35 | 2761 |
| 6 | 5 | 56.3 | 60.6 | 5 / 35 | 2658 |
| 7 | 5 | 55.9 | 60.0 | 3 / 35 | 2898 |
| 8 | 5 | 55.1 | 59.0 | 5 / 35 | 2895 |
| 9 | 4 | 56.6 | 63.2 | 4 / 35 | 2619 |
| 10 | 7 | 53.2 | 54.0 | 4 / 35 | 2608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 40 | 53% |
| bts.mega.Gnarly 1.4 | 15 | 47% |
| bvh.mini.Freya 0.55 | 12 | 58% |
| cs.Wren 1.0 | 11 | 45% |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 83% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 0% |
| kdf.KoulDestroyer 1.0 | 3 | 33% |

Hadur died in 304 of 350 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 64 | 21% | 83 |
| bvh.mini.Freya 0.55 | 57 | 19% | 62 |
| cs.Wren 1.0 | 47 | 15% | 51 |
| bts.mega.Gnarly 1.4 | 40 | 13% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 13% | 41 |
| kdf.KoulDestroyer 1.0 | 35 | 12% | 38 |
| bzdp.BoxCar 2.0 | 12 | 4% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 2% | 12 |
| matt.UnderDark3 2.4.34 | 4 | 1% | 5 |

## Melee bench: F39

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.5 | 62.2 | 33 / 350 | 4.40 | 11.6% | 29515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.3 | 15.7% | 66 |
| az.Ololobot 0.2.4 | 1.8 | 14.3% | 135 |
| hadur117.nano.SanaroCL12 0.1 | 3.5 | 11.6% | 33 |
| catcat20.Lambda 0.024 | 3.5 | 11.7% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 5.9 | 9.1% | 29 |
| apollokidd.ApolloKidd 0.9 | 6.2 | 9.1% | 5 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.7% | 12 |
| gimp.GimpBot 0.1 | 7.1 | 8.5% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.8 | 62.2 | 3 / 35 | 3112 |
| 2 | 3 | 59.2 | 70.2 | 4 / 35 | 3549 |
| 3 | 3 | 58.6 | 71.4 | 4 / 35 | 2952 |
| 4 | 3 | 55.2 | 61.6 | 3 / 35 | 2884 |
| 5 | 3 | 56.8 | 64.4 | 5 / 35 | 2895 |
| 6 | 4 | 52.1 | 56.2 | 5 / 35 | 2371 |
| 7 | 5 | 50.9 | 49.8 | 1 / 35 | 2960 |
| 8 | 4 | 54.3 | 61.3 | 2 / 35 | 2598 |
| 9 | 3 | 55.6 | 61.6 | 2 / 35 | 3148 |
| 10 | 4 | 56.2 | 63.5 | 4 / 35 | 3046 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 38 | 13% |
| bvh.fry.Freya 0.82 | 27 | 37% |
| catcat20.Lambda 0.024 | 16 | 44% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 42% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| gimp.GimpBot 0.1 | 3 | 67% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 317 of 350 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 99 | 31% | 104 |
| az.Ololobot 0.2.4 | 66 | 21% | 71 |
| catcat20.Lambda 0.024 | 42 | 13% | 50 |
| stelo.SoRobotNanoMelee 1.2 | 35 | 11% | 40 |
| apollokidd.ApolloKidd 0.9 | 22 | 7% | 24 |
| gimp.GimpBot 0.1 | 19 | 6% | 22 |
| winamp32.micro.MicroMacro 1.0 | 16 | 5% | 20 |
| dcs.Eater_of_Worlds 1.1.3-A | 10 | 3% | 10 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8 | 3% | 9 |

## Melee bench: F41

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 69.8 | 94 / 350 | 3.72 | 13.5% | 30136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.2 | 15.9% | 132 |
| ary.Swarm 1.1 | 2.7 | 13.8% | 29 |
| hadur117.nano.SanaroCL12 0.1 | 3.0 | 13.5% | 94 |
| lessonz.robocode.Oz 0.5.0 | 3.4 | 12.9% | 42 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.8% | 39 |
| shrub.Silver v048 | 6.2 | 9.5% | 9 |
| zyx.nano.Ant 1.1 | 6.7 | 8.2% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.1% | 5 |
| stelo.Mirror 1.1 | 8.7 | 5.4% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 73.3 | 14 / 35 | 3098 |
| 2 | 2 | 61.2 | 73.3 | 11 / 35 | 2862 |
| 3 | 4 | 60.1 | 67.0 | 11 / 35 | 2909 |
| 4 | 3 | 60.7 | 72.1 | 5 / 35 | 3109 |
| 5 | 4 | 59.8 | 66.3 | 9 / 35 | 3177 |
| 6 | 4 | 59.8 | 69.5 | 9 / 35 | 2818 |
| 7 | 2 | 61.0 | 71.7 | 10 / 35 | 2799 |
| 8 | 4 | 60.3 | 69.2 | 9 / 35 | 3349 |
| 9 | 2 | 60.3 | 70.5 | 8 / 35 | 3176 |
| 10 | 3 | 58.5 | 64.8 | 8 / 35 | 2839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 76 | 63% |
| ary.Swarm 1.1 | 26 | 77% |
| lessonz.robocode.Oz 0.5.0 | 18 | 72% |
| simonton.nano.MeleeSeed 1.8 | 8 | 88% |
| shrub.Silver v048 | 6 | 50% |
| stelo.Mirror 1.1 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 257 of 350 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 66 | 26% | 117 |
| ary.Swarm 1.1 | 62 | 24% | 83 |
| simonton.nano.MeleeSeed 1.8 | 37 | 14% | 46 |
| lessonz.robocode.Oz 0.5.0 | 37 | 14% | 44 |
| shrub.Silver v048 | 24 | 9% | 26 |
| zyx.nano.Ant 1.1 | 17 | 7% | 17 |
| jsal.Jsalbot 1.0 | 5 | 2% | 5 |
| stelo.Mirror 1.1 | 4 | 2% | 7 |
| acogdev.alpha 0.2 | 4 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 68.7 | 46 / 350 | 3.81 | 13.1% | 34291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.8% | 184 |
| maribo.mini.MiniQuester 0.1 | 2.2 | 14.5% | 41 |
| ara.Shera 0.88 | 3.0 | 13.9% | 66 |
| hadur117.nano.SanaroCL12 0.1 | 3.8 | 13.1% | 46 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 8 |
| dsw.StaticD 1.0 | 6.4 | 7.3% | 6 |
| maribo.IotaCT 1.1 | 6.7 | 7.0% | 0 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.4% | 0 |
| mme.NikeEnhanced 2.0 | 9.1 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 67.6 | 4 / 35 | 3240 |
| 2 | 4 | 59.1 | 68.9 | 2 / 35 | 3340 |
| 3 | 4 | 59.0 | 64.8 | 4 / 35 | 3633 |
| 4 | 4 | 59.6 | 70.2 | 5 / 35 | 3014 |
| 5 | 4 | 59.5 | 67.9 | 6 / 35 | 3441 |
| 6 | 3 | 60.1 | 70.2 | 5 / 35 | 3475 |
| 7 | 4 | 59.4 | 67.3 | 4 / 35 | 3538 |
| 8 | 3 | 60.3 | 70.8 | 7 / 35 | 3446 |
| 9 | 4 | 60.7 | 69.5 | 6 / 35 | 3858 |
| 10 | 4 | 59.5 | 70.2 | 3 / 35 | 3306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 72 | 28% |
| ara.Shera 0.88 | 26 | 35% |
| maribo.mini.MiniQuester 0.1 | 21 | 67% |
| amz.NanoClone 1.41 | 2 | 0% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 304 of 350 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 105 | 35% | 124 |
| ara.Shera 0.88 | 84 | 28% | 94 |
| maribo.mini.MiniQuester 0.1 | 61 | 20% | 76 |
| amz.NanoClone 1.41 | 22 | 7% | 22 |
| maribo.IotaCT 1.1 | 10 | 3% | 10 |
| dsw.StaticD 1.0 | 9 | 3% | 9 |
| stelo.MirrorMicro 1.0 | 6 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 2% | 6 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 59.1 | 20 / 350 | 4.68 | 10.9% | 25216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.5% | 262 |
| brainfade.melee.Dusk 0.44 | 2.4 | 13.0% | 39 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.5% | 12 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.5% | 10 |
| hadur117.nano.SanaroCL12 0.1 | 4.7 | 10.9% | 20 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.0% | 5 |
| mz.NanoGod 2.02 | 7.0 | 8.2% | 0 |
| jab.DiamondStealer 5 | 8.0 | 7.2% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.6% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 57.1 | 2 / 35 | 2615 |
| 2 | 5 | 55.7 | 58.4 | 2 / 35 | 2406 |
| 3 | 5 | 58.5 | 64.1 | 3 / 35 | 2548 |
| 4 | 6 | 53.3 | 51.1 | 3 / 35 | 2483 |
| 5 | 5 | 54.2 | 53.3 | 0 / 35 | 2439 |
| 6 | 3 | 58.6 | 63.2 | 3 / 35 | 2724 |
| 7 | 4 | 57.3 | 60.6 | 1 / 35 | 2642 |
| 8 | 6 | 56.7 | 60.0 | 2 / 35 | 2464 |
| 9 | 4 | 57.3 | 62.5 | 3 / 35 | 2540 |
| 10 | 5 | 56.6 | 60.3 | 1 / 35 | 2355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 53 | 11% |
| brainfade.melee.Dusk 0.44 | 12 | 92% |
| dummy.micro.Sparrow 2.5 | 3 | 67% |
| Krabb.akim2.Akim2 1.1b | 3 | 0% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |

Hadur died in 330 of 350 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 146 | 44% | 152 |
| dummy.micro.Sparrow 2.5 | 47 | 14% | 49 |
| brainfade.melee.Dusk 0.44 | 41 | 12% | 52 |
| wcsv.melee.EngineerMelee 0.1 | 40 | 12% | 40 |
| mz.NanoGod 2.02 | 23 | 7% | 23 |
| Krabb.akim2.Akim2 1.1b | 21 | 6% | 21 |
| jab.DiamondStealer 5 | 8 | 2% | 9 |
| cvt.Firsty 1.0 | 4 | 1% | 4 |

## Melee bench: F44

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 65.5 | 50 / 350 | 4.11 | 12.7% | 32370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 17.0% | 147 |
| tzu.TheArtOfWar 1.2 | 1.8 | 15.6% | 99 |
| hadur117.nano.SanaroCL12 0.1 | 3.1 | 12.7% | 50 |
| jwirde.Gort 2.0 | 4.4 | 10.6% | 25 |
| wompi.Quokka 1.6 | 5.0 | 10.3% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.6 | 9.6% | 7 |
| disan.Chair 2.2.0 | 7.4 | 7.3% | 4 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.2% | 5 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 5.0% | 1 |
| sample.Crazy 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.5 | 62.9 | 5 / 35 | 3002 |
| 2 | 3 | 58.4 | 66.0 | 4 / 35 | 3210 |
| 3 | 3 | 60.9 | 70.2 | 9 / 35 | 3443 |
| 4 | 3 | 55.5 | 60.6 | 2 / 35 | 2910 |
| 5 | 3 | 58.9 | 66.3 | 4 / 35 | 3423 |
| 6 | 3 | 59.6 | 68.9 | 6 / 35 | 3113 |
| 7 | 3 | 56.8 | 60.0 | 4 / 35 | 3288 |
| 8 | 3 | 60.1 | 68.6 | 6 / 35 | 3524 |
| 9 | 3 | 56.7 | 60.3 | 6 / 35 | 2932 |
| 10 | 3 | 60.6 | 70.8 | 4 / 35 | 3525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 61 | 46% |
| tzu.TheArtOfWar 1.2 | 39 | 18% |
| jwirde.Gort 2.0 | 12 | 33% |
| wompi.Quokka 1.6 | 8 | 63% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 50% |
| disan.Chair 2.2.0 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 0% |

Hadur died in 301 of 350 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 108 | 36% | 138 |
| tzu.TheArtOfWar 1.2 | 78 | 26% | 86 |
| jwirde.Gort 2.0 | 33 | 11% | 37 |
| wompi.Quokka 1.6 | 32 | 11% | 33 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 21 | 7% | 21 |
| stf.PanzerGeneral 0.1 | 11 | 4% | 11 |
| disan.Chair 2.2.0 | 9 | 3% | 11 |
| amk.jointstrike.JointStrike 0.2 | 6 | 2% | 8 |
| sample.Crazy 1.0 | 3 | 1% | 5 |

## Melee bench: F45

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 68.9 | 50 / 350 | 3.80 | 13.9% | 37182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL12 0.1 | 1.7 | 13.9% | 50 |
| eem.IWillFireNoBullet v2.8 | 2.6 | 13.2% | 191 |
| jje.BagPuss 1.2 | 2.6 | 12.7% | 23 |
| sul.Lunar 1.1 | 3.4 | 12.0% | 47 |
| myl.nano.Graviton 1.10 | 4.7 | 10.7% | 14 |
| hvilela.HVilela 0.9 | 6.8 | 8.8% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.1 | 8.7% | 8 |
| fm.claire 1.7 | 7.3 | 8.7% | 2 |
| wit.Deep7 2.0 | 9.1 | 6.4% | 13 |
| abud.ThirdRobo 1.0 | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.2 | 65.4 | 7 / 35 | 3652 |
| 2 | 2 | 59.2 | 68.3 | 4 / 35 | 3471 |
| 3 | 3 | 60.9 | 69.8 | 6 / 35 | 3819 |
| 4 | 3 | 57.8 | 62.5 | 4 / 35 | 3640 |
| 5 | 1 | 61.8 | 73.7 | 6 / 35 | 3808 |
| 6 | 1 | 61.4 | 71.1 | 4 / 35 | 4145 |
| 7 | 1 | 59.8 | 68.9 | 4 / 35 | 3723 |
| 8 | 2 | 59.0 | 66.0 | 3 / 35 | 3563 |
| 9 | 1 | 61.6 | 71.7 | 7 / 35 | 3854 |
| 10 | 1 | 60.6 | 71.7 | 5 / 35 | 3507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 74 | 31% |
| sul.Lunar 1.1 | 16 | 19% |
| jje.BagPuss 1.2 | 15 | 33% |
| wit.Deep7 2.0 | 9 | 67% |
| myl.nano.Graviton 1.10 | 8 | 63% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 71% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 1210. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 65 | 22% | 0 |
| jje.BagPuss 1.2 | 62 | 21% | 91 |
| myl.nano.Graviton 1.10 | 51 | 17% | 69 |
| sul.Lunar 1.1 | 44 | 15% | 76 |
| fm.claire 1.7 | 24 | 8% | 31 |
| hvilela.HVilela 0.9 | 22 | 7% | 30 |
| pez.mini.ChironexFleckeri 0.5 | 18 | 6% | 30 |
| wit.Deep7 2.0 | 9 | 3% | 17 |
| abud.ThirdRobo 1.0 | 5 | 2% | 6 |

## Melee bench: F46

hadur117.nano.SanaroCL12 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 69.0 | 34 / 350 | 3.79 | 12.4% | 28051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 17.8% | 127 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 17.3% | 149 |
| hadur117.nano.SanaroCL12 0.1 | 3.2 | 12.4% | 34 |
| mz.MicroSheep 1.0 | 4.2 | 11.0% | 15 |
| cx.Princess 1.0 | 4.9 | 10.1% | 20 |
| sadoner.killer 0.2 | 5.7 | 9.3% | 5 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.5% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.9 | 6.1% | 0 |
| kurios.DOSexe .9a | 8.9 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 67.9 | 3 / 35 | 2691 |
| 2 | 3 | 58.2 | 67.9 | 3 / 35 | 2766 |
| 3 | 3 | 58.8 | 71.4 | 3 / 35 | 2631 |
| 4 | 3 | 61.3 | 75.9 | 7 / 35 | 2926 |
| 5 | 3 | 58.4 | 68.9 | 6 / 35 | 2754 |
| 6 | 3 | 58.7 | 70.5 | 3 / 35 | 2610 |
| 7 | 3 | 59.0 | 69.5 | 3 / 35 | 2817 |
| 8 | 3 | 56.6 | 64.8 | 1 / 35 | 2829 |
| 9 | 3 | 60.0 | 71.7 | 5 / 35 | 3003 |
| 10 | 5 | 56.0 | 61.3 | 0 / 35 | 3024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 50 | 46% |
| rsalesc.melee.Medina 0.4.5 | 37 | 11% |
| cx.Princess 1.0 | 8 | 50% |
| mz.MicroSheep 1.0 | 7 | 14% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 317 of 350 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 123 | 39% | 146 |
| rsalesc.melee.Medina 0.4.5 | 91 | 29% | 95 |
| mz.MicroSheep 1.0 | 29 | 9% | 30 |
| arthord.NanoSatanMelee Beta | 22 | 7% | 23 |
| sadoner.killer 0.2 | 18 | 6% | 18 |
| cx.Princess 1.0 | 17 | 5% | 21 |
| jeremyreeder.collective.Prophet 5 | 9 | 3% | 9 |
| kurios.DOSexe .9a | 4 | 1% | 4 |
| mbro.Detektor3 0.1.1 | 3 | 1% | 4 |
1 death(s) with no robot to name.

