# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 75.0 | 50 / 350 | 3.25 | 13.9% | 36562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 234 |
| hadur117.nano.SanaroCL 0.1 | 2.0 | 13.9% | 50 |
| sgp.JollyNinja 3.53 | 3.5 | 12.1% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.2% | 7 |
| mz.MicroGodMelee 1 | 4.5 | 11.1% | 9 |
| lorneswork.Predator 1.0 | 5.7 | 9.8% | 6 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.7% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 78.1 | 2 / 35 | 4068 |
| 2 | 2 | 61.6 | 72.1 | 7 / 35 | 3744 |
| 3 | 2 | 60.1 | 69.2 | 6 / 35 | 3556 |
| 4 | 2 | 59.4 | 69.2 | 4 / 35 | 3253 |
| 5 | 2 | 63.0 | 78.4 | 5 / 35 | 3836 |
| 6 | 2 | 63.3 | 80.0 | 9 / 35 | 3492 |
| 7 | 2 | 61.8 | 74.3 | 5 / 35 | 4004 |
| 8 | 2 | 61.3 | 75.6 | 2 / 35 | 3466 |
| 9 | 2 | 61.8 | 75.6 | 3 / 35 | 3661 |
| 10 | 2 | 62.3 | 77.5 | 7 / 35 | 3482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 153 | 15% |
| sgp.JollyNinja 3.53 | 17 | 24% |
| mz.MicroGodMelee 1 | 14 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 89% |
| lorneswork.Predator 1.0 | 4 | 50% |
| adt.Ar2 1.0 | 3 | 67% |

Hadur died in 300 of 350 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 172 | 57% | 194 |
| sgp.JollyNinja 3.53 | 37 | 12% | 41 |
| lorneswork.Predator 1.0 | 31 | 10% | 32 |
| mz.MicroGodMelee 1 | 24 | 8% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 6% | 25 |
| adt.Ar2 1.0 | 11 | 4% | 14 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 1% | 5 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |
| skm.butterfly 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 67.9 | 72 / 350 | 3.89 | 13.9% | 39261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.9 | 14.3% | 76 |
| hadur117.nano.SanaroCL 0.1 | 2.0 | 13.9% | 72 |
| pulsar.PulsarMax 0.8.9 | 2.1 | 14.3% | 97 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.6% | 9 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 10.1% | 27 |
| sch.Simone 0.3d | 6.4 | 8.7% | 34 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.8% | 6 |
| Noran.BitchingElk 0.054 | 7.7 | 7.7% | 18 |
| stelo.PatternRobot 1.0 | 8.1 | 7.1% | 10 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 62.9 | 8 / 35 | 3885 |
| 2 | 2 | 60.7 | 69.8 | 7 / 35 | 3820 |
| 3 | 3 | 60.7 | 69.8 | 7 / 35 | 4009 |
| 4 | 3 | 58.5 | 61.6 | 6 / 35 | 3738 |
| 5 | 3 | 54.7 | 56.2 | 2 / 35 | 3485 |
| 6 | 1 | 63.1 | 74.3 | 10 / 35 | 4166 |
| 7 | 1 | 63.1 | 76.5 | 10 / 35 | 4069 |
| 8 | 1 | 60.8 | 68.6 | 7 / 35 | 4006 |
| 9 | 2 | 60.1 | 66.3 | 7 / 35 | 3989 |
| 10 | 1 | 62.0 | 73.0 | 8 / 35 | 4094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 36% |
| pulsar.PulsarMax 0.8.9 | 39 | 46% |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 70% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 77% |
| Noran.BitchingElk 0.054 | 9 | 44% |
| stelo.PatternRobot 1.0 | 9 | 44% |
| fnc.bandit.Bandit 5.2.0 | 7 | 29% |
| sch.Simone 0.3d | 7 | 43% |
| fullsail.SweetTea 1.1 | 2 | 50% |

Hadur died in 279 of 350 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 75 | 27% | 94 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 70 | 25% | 88 |
| lrem.micro.SpikeSoldier 0.4 | 37 | 13% | 42 |
| sch.Simone 0.3d | 26 | 9% | 32 |
| com.cohesiva.robocode.ManOwaR 1.0 | 23 | 8% | 36 |
| fnc.bandit.Bandit 5.2.0 | 18 | 6% | 19 |
| stelo.PatternRobot 1.0 | 15 | 5% | 19 |
| fullsail.SweetTea 1.1 | 7 | 3% | 11 |
| Noran.BitchingElk 0.054 | 7 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 76.1 | 76 / 350 | 3.15 | 14.4% | 38356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.5 | 15.3% | 112 |
| hadur117.nano.SanaroCL 0.1 | 2.3 | 14.4% | 76 |
| kawigi.nano.Lib 1.0 | 2.3 | 14.7% | 79 |
| vuen.Cake 2.51 | 3.9 | 13.1% | 67 |
| urdos.URDOS 1.3 | 5.0 | 10.7% | 9 |
| adt.Ar1 2.1 | 6.3 | 7.7% | 1 |
| oa.weak.FlyMk1 0.1 | 7.4 | 6.6% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.7% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.9 | 5.8% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 80.3 | 9 / 35 | 4231 |
| 2 | 3 | 59.6 | 70.2 | 3 / 35 | 3940 |
| 3 | 1 | 63.5 | 80.3 | 12 / 35 | 3886 |
| 4 | 2 | 62.0 | 78.4 | 8 / 35 | 3806 |
| 5 | 2 | 60.8 | 74.3 | 6 / 35 | 3817 |
| 6 | 3 | 61.7 | 74.9 | 8 / 35 | 4020 |
| 7 | 3 | 59.8 | 69.8 | 5 / 35 | 3732 |
| 8 | 2 | 62.6 | 79.7 | 6 / 35 | 3886 |
| 9 | 2 | 63.3 | 81.0 | 10 / 35 | 3702 |
| 10 | 3 | 60.1 | 72.4 | 9 / 35 | 3336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 62 | 56% |
| radnor.DoctorBob 1.42 | 59 | 51% |
| kawigi.nano.Lib 1.0 | 41 | 10% |
| urdos.URDOS 1.3 | 7 | 57% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 0% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 50% |

Hadur died in 275 of 350 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 82 | 30% | 92 |
| radnor.DoctorBob 1.42 | 66 | 24% | 85 |
| urdos.URDOS 1.3 | 54 | 20% | 58 |
| vuen.Cake 2.51 | 42 | 15% | 78 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 4% | 11 |
| adt.Ar1 2.1 | 9 | 3% | 9 |
| oa.weak.FlyMk1 0.1 | 7 | 3% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 5 |

## Melee bench: F04

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 70.7 | 16 / 350 | 3.64 | 13.6% | 41432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.8% | 306 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 13.6% | 15 |
| hadur117.nano.SanaroCL 0.1 | 2.5 | 13.6% | 16 |
| TNT.TNT 0.99.1 | 4.1 | 10.6% | 5 |
| josago.Jorgito 0.16 | 4.9 | 9.5% | 5 |
| css.Delitioner 0.11 | 6.1 | 7.8% | 2 |
| tj.zombie1n 1.0.1 | 7.0 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 67.6 | 2 / 35 | 4379 |
| 2 | 3 | 60.8 | 67.6 | 0 / 35 | 4125 |
| 3 | 2 | 62.7 | 73.0 | 2 / 35 | 4204 |
| 4 | 3 | 59.4 | 67.6 | 0 / 35 | 3565 |
| 5 | 2 | 62.5 | 75.6 | 2 / 35 | 3900 |
| 6 | 2 | 62.1 | 74.3 | 2 / 35 | 3956 |
| 7 | 2 | 63.4 | 74.9 | 3 / 35 | 4510 |
| 8 | 3 | 63.0 | 73.3 | 0 / 35 | 4460 |
| 9 | 2 | 62.7 | 71.7 | 4 / 35 | 4330 |
| 10 | 3 | 58.9 | 61.0 | 1 / 35 | 4003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 129 | 5% |
| apc.LeeroyJenkins2 1.0 | 8 | 63% |
| josago.Jorgito 0.16 | 4 | 50% |
| TNT.TNT 0.99.1 | 3 | 33% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 334 of 350 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 201 | 60% | 206 |
| apc.LeeroyJenkins2 1.0 | 53 | 16% | 60 |
| josago.Jorgito 0.16 | 35 | 10% | 37 |
| TNT.TNT 0.99.1 | 18 | 5% | 19 |
| css.Delitioner 0.11 | 14 | 4% | 14 |
| tj.zombie1n 1.0.1 | 7 | 2% | 7 |
| rampancy.Durandal 2.1d | 4 | 1% | 4 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 3 |
| spin.Bugstard 0.012b | 1 | 0% | 0 |

## Melee bench: F06

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 69.5 | 79 / 350 | 3.75 | 13.5% | 33468 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.5 | 15.5% | 89 |
| origin.SleepSiphon 1.7b | 2.2 | 14.4% | 108 |
| hadur117.nano.SanaroCL 0.1 | 2.7 | 13.5% | 79 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 12.4% | 38 |
| mld.Wisdom 1.0 | 4.7 | 11.0% | 10 |
| gg.Wolverine 2.0 | 6.4 | 8.6% | 7 |
| spinnercat.Omen 1.0 | 7.3 | 7.8% | 5 |
| DBall.NUKE 0.1 | 7.8 | 7.2% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.4% | 8 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 73.0 | 10 / 35 | 3222 |
| 2 | 3 | 60.6 | 71.1 | 8 / 35 | 3352 |
| 3 | 3 | 58.8 | 65.1 | 7 / 35 | 3386 |
| 4 | 4 | 56.9 | 62.5 | 3 / 35 | 2999 |
| 5 | 2 | 61.3 | 73.3 | 9 / 35 | 3339 |
| 6 | 1 | 63.1 | 76.5 | 11 / 35 | 3726 |
| 7 | 3 | 60.4 | 71.7 | 9 / 35 | 3144 |
| 8 | 3 | 58.6 | 63.8 | 8 / 35 | 3331 |
| 9 | 1 | 62.6 | 76.8 | 10 / 35 | 3680 |
| 10 | 5 | 57.1 | 61.0 | 4 / 35 | 3289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 52 | 42% |
| jekl.StoneGhost 0.7 | 47 | 64% |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 48% |
| gg.Wolverine 2.0 | 9 | 78% |
| DBall.NUKE 0.1 | 6 | 67% |
| mld.Wisdom 1.0 | 4 | 50% |
| spinnercat.Omen 1.0 | 4 | 50% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 33% |

Hadur died in 272 of 350 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 72 | 26% | 97 |
| jekl.StoneGhost 0.7 | 66 | 24% | 92 |
| pe.minimelee.SandboxMiniMelee 1.1 | 51 | 19% | 65 |
| mld.Wisdom 1.0 | 40 | 15% | 40 |
| spinnercat.Omen 1.0 | 20 | 7% | 22 |
| gg.Wolverine 2.0 | 10 | 4% | 12 |
| DBall.NUKE 0.1 | 9 | 3% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.3 | 84 / 350 | 2.68 | 16.2% | 45896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.6 | 18.1% | 102 |
| rtk.Tachikoma 1.0 | 1.6 | 17.8% | 104 |
| hadur117.nano.SanaroCL 0.1 | 2.8 | 16.2% | 84 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.6% | 22 |
| franzor.Lizt 1.3.1 | 4.8 | 11.4% | 39 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.2% | 0 |
| sample.Target 1.0 | 9.5 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.8 | 80.0 | 5 / 35 | 4826 |
| 2 | 3 | 65.7 | 79.4 | 8 / 35 | 4413 |
| 3 | 3 | 67.7 | 81.6 | 11 / 35 | 5105 |
| 4 | 3 | 66.5 | 79.7 | 11 / 35 | 4366 |
| 5 | 3 | 65.4 | 79.4 | 7 / 35 | 4058 |
| 6 | 3 | 66.1 | 80.3 | 7 / 35 | 4566 |
| 7 | 3 | 66.3 | 80.6 | 8 / 35 | 4822 |
| 8 | 3 | 65.9 | 81.0 | 5 / 35 | 4396 |
| 9 | 3 | 66.5 | 82.9 | 8 / 35 | 4377 |
| 10 | 1 | 68.9 | 88.6 | 14 / 35 | 4967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 97 | 52% |
| rsalesc.melee.Monk 0.3.6c | 53 | 19% |
| franzor.Lizt 1.3.1 | 28 | 32% |
| oog.melee.CapuletDroid 1.1 | 21 | 62% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 266 of 350 rounds, at a mean tick of 1309. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 126 | 47% | 193 |
| rsalesc.melee.Monk 0.3.6c | 79 | 30% | 93 |
| oog.melee.CapuletDroid 1.1 | 28 | 11% | 49 |
| franzor.Lizt 1.3.1 | 24 | 9% | 3 |
| exauge.GateKeeper 1.1.121g | 5 | 2% | 6 |
| drd.Dreadknoght 0.9 | 2 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% | 3 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 73.5 | 115 / 350 | 3.38 | 14.6% | 34282 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL 0.1 | 1.6 | 14.6% | 115 |
| tm.Yuugao 1.0 | 2.1 | 13.6% | 81 |
| shrub.Vapour v159 | 2.3 | 13.3% | 75 |
| Krabb.sliNk.Garm 0.9u | 4.4 | 10.9% | 20 |
| com.spp.robocode.MostlyHarmless 010 | 5.1 | 10.0% | 27 |
| m3thos.Eva00 1.1 | 6.3 | 9.3% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 6.4 | 8.8% | 18 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 7.0% | 3 |
| SHAM.WOW 1.4 | 8.7 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.9 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 74.9 | 10 / 35 | 3727 |
| 2 | 1 | 61.7 | 75.2 | 12 / 35 | 3365 |
| 3 | 2 | 62.0 | 74.9 | 13 / 35 | 3317 |
| 4 | 2 | 58.2 | 65.7 | 7 / 35 | 3344 |
| 5 | 1 | 63.6 | 80.6 | 16 / 35 | 3226 |
| 6 | 1 | 64.9 | 84.4 | 14 / 35 | 3796 |
| 7 | 3 | 58.0 | 64.8 | 8 / 35 | 3186 |
| 8 | 3 | 55.9 | 61.0 | 9 / 35 | 2904 |
| 9 | 1 | 62.8 | 77.1 | 14 / 35 | 3777 |
| 10 | 1 | 62.9 | 76.5 | 12 / 35 | 3640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 62 | 65% |
| shrub.Vapour v159 | 41 | 49% |
| Krabb.sliNk.Garm 0.9u | 25 | 92% |
| com.spp.robocode.MostlyHarmless 010 | 20 | 65% |
| m3thos.Eva00 1.1 | 14 | 64% |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 71% |
| SHAM.WOW 1.4 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |
| qualidafial.MajorDick 1.0.1 | 1 | 0% |

Hadur died in 235 of 350 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 59 | 25% | 78 |
| tm.Yuugao 1.0 | 57 | 24% | 104 |
| com.spp.robocode.MostlyHarmless 010 | 32 | 14% | 46 |
| Krabb.sliNk.Garm 0.9u | 27 | 11% | 37 |
| m3thos.Eva00 1.1 | 21 | 9% | 31 |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 7% | 26 |
| zyx.nano.BacillusComma 1.0 | 13 | 6% | 16 |
| qualidafial.MajorDick 1.0.1 | 7 | 3% | 6 |
| SHAM.WOW 1.4 | 2 | 1% | 6 |

## Melee bench: F09

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 62.1 | 37 / 350 | 4.41 | 11.9% | 28778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.3% | 201 |
| kc.micro.Figment 1.0 | 2.0 | 14.6% | 55 |
| hadur117.nano.SanaroCL 0.1 | 3.6 | 11.9% | 37 |
| yagami.Tidus 0.11 | 4.2 | 11.1% | 4 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.9% | 27 |
| mc2.enemy.Original 0.9 | 5.7 | 9.6% | 20 |
| dft.Calliope 5.6 | 7.1 | 7.8% | 6 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.9 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 70.2 | 4 / 35 | 2918 |
| 2 | 3 | 57.3 | 63.5 | 4 / 35 | 2865 |
| 3 | 4 | 58.2 | 63.8 | 5 / 35 | 3027 |
| 4 | 4 | 56.2 | 60.3 | 6 / 35 | 2636 |
| 5 | 4 | 54.5 | 58.7 | 3 / 35 | 2481 |
| 6 | 5 | 54.9 | 57.5 | 3 / 35 | 2807 |
| 7 | 3 | 58.5 | 66.7 | 2 / 35 | 2982 |
| 8 | 3 | 58.0 | 65.7 | 5 / 35 | 2807 |
| 9 | 4 | 54.4 | 55.6 | 1 / 35 | 3039 |
| 10 | 3 | 57.0 | 58.7 | 4 / 35 | 3216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 59 | 19% |
| kc.micro.Figment 1.0 | 27 | 41% |
| yagami.Tidus 0.11 | 9 | 100% |
| mc2.enemy.Original 0.9 | 7 | 71% |
| pedersen.Grishnakh 1.0 | 4 | 25% |
| dft.Calliope 5.6 | 2 | 0% |

Hadur died in 313 of 350 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 110 | 35% | 120 |
| kc.micro.Figment 1.0 | 68 | 22% | 82 |
| yagami.Tidus 0.11 | 41 | 13% | 49 |
| mc2.enemy.Original 0.9 | 29 | 9% | 34 |
| pedersen.Grishnakh 1.0 | 27 | 9% | 27 |
| dft.Calliope 5.6 | 13 | 4% | 13 |
| robar.nano.Assertive_Melee 0.2 | 12 | 4% | 12 |
| rdm.Dueler 0.4x | 7 | 2% | 7 |
| step.nanoPri 1.0 | 6 | 2% | 6 |

## Melee bench: F10

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 77.8 | 99 / 350 | 3.00 | 15.0% | 39640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL 0.1 | 1.6 | 15.0% | 99 |
| DTF.Kludgy 1.2b | 1.8 | 14.6% | 77 |
| ejb.Polaris 1.0.1 | 3.1 | 12.9% | 48 |
| ne.Chimera 1.2 | 3.8 | 12.9% | 42 |
| tvv.micro.Antares 1.1.1 | 5.0 | 11.3% | 46 |
| vStar.RAFzilla 2.15 | 5.7 | 10.9% | 27 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 6.0% | 0 |
| sam.Samspin 1.0 | 8.0 | 6.2% | 4 |
| kurios.DOSexe .9b | 8.4 | 5.7% | 4 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 73.3 | 9 / 35 | 3787 |
| 2 | 1 | 61.8 | 74.3 | 12 / 35 | 3825 |
| 3 | 1 | 63.7 | 80.3 | 12 / 35 | 3973 |
| 4 | 2 | 61.4 | 75.2 | 9 / 35 | 3641 |
| 5 | 3 | 61.1 | 72.7 | 7 / 35 | 3786 |
| 6 | 2 | 62.9 | 79.0 | 8 / 35 | 3747 |
| 7 | 1 | 63.9 | 81.3 | 11 / 35 | 3990 |
| 8 | 1 | 65.8 | 85.7 | 14 / 35 | 4585 |
| 9 | 1 | 62.7 | 77.5 | 7 / 35 | 4195 |
| 10 | 1 | 63.4 | 78.7 | 10 / 35 | 4111 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 43% |
| ejb.Polaris 1.0.1 | 49 | 88% |
| tvv.micro.Antares 1.1.1 | 30 | 17% |
| ne.Chimera 1.2 | 22 | 23% |
| vStar.RAFzilla 2.15 | 21 | 67% |
| kurios.DOSexe .9b | 8 | 50% |
| donjezza.Muncho 1.0 | 5 | 60% |
| sam.Samspin 1.0 | 2 | 0% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 251 of 350 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 79 | 31% | 100 |
| ne.Chimera 1.2 | 61 | 24% | 71 |
| tvv.micro.Antares 1.1.1 | 39 | 16% | 38 |
| ejb.Polaris 1.0.1 | 27 | 11% | 72 |
| vStar.RAFzilla 2.15 | 20 | 8% | 35 |
| kurios.DOSexe .9b | 9 | 4% | 14 |
| sam.Samspin 1.0 | 8 | 3% | 8 |
| donjezza.Muncho 1.0 | 5 | 2% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 1% | 4 |

## Melee bench: F11

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 62.8 | 55 / 350 | 4.35 | 12.2% | 30474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 16.9% | 140 |
| cx.mini.Nimrod 0.55 | 2.4 | 13.0% | 49 |
| hadur117.nano.SanaroCL 0.1 | 3.0 | 12.2% | 55 |
| djc.DynaBot 0.1.1 | 4.3 | 11.0% | 29 |
| rdt199.Warlord 0.73 | 5.1 | 10.1% | 29 |
| br2.MobyDickBot 1.6 | 5.5 | 9.8% | 26 |
| uji.YellohFellah 1.0 | 6.8 | 8.9% | 20 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.7% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.2 | 56.2 | 5 / 35 | 2920 |
| 2 | 3 | 55.7 | 59.4 | 6 / 35 | 2855 |
| 3 | 4 | 54.3 | 56.5 | 4 / 35 | 2883 |
| 4 | 2 | 59.1 | 66.7 | 7 / 35 | 3421 |
| 5 | 3 | 55.8 | 58.7 | 7 / 35 | 3028 |
| 6 | 3 | 58.0 | 65.4 | 7 / 35 | 2848 |
| 7 | 2 | 61.6 | 75.6 | 6 / 35 | 3438 |
| 8 | 3 | 57.8 | 65.7 | 5 / 35 | 3105 |
| 9 | 2 | 58.6 | 67.0 | 5 / 35 | 3137 |
| 10 | 4 | 54.3 | 57.1 | 3 / 35 | 2839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 48 | 35% |
| cx.mini.Nimrod 0.55 | 16 | 50% |
| rdt199.Warlord 0.73 | 15 | 53% |
| djc.DynaBot 0.1.1 | 13 | 69% |
| br2.MobyDickBot 1.6 | 13 | 62% |
| uji.YellohFellah 1.0 | 10 | 30% |
| KiraNL.Chupacabra 0.4 | 3 | 67% |

Hadur died in 295 of 350 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 105 | 36% | 121 |
| cx.mini.Nimrod 0.55 | 44 | 15% | 52 |
| rdt199.Warlord 0.73 | 35 | 12% | 42 |
| djc.DynaBot 0.1.1 | 30 | 10% | 36 |
| br2.MobyDickBot 1.6 | 21 | 7% | 31 |
| uji.YellohFellah 1.0 | 20 | 7% | 25 |
| KiraNL.Chupacabra 0.4 | 18 | 6% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 4% | 12 |
| stelo.MirrorNano 1.3 | 10 | 3% | 10 |

## Melee bench: F12

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 71.6 | 76 / 350 | 3.56 | 13.6% | 28524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.8 | 14.5% | 103 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.9% | 64 |
| hadur117.nano.SanaroCL 0.1 | 2.6 | 13.6% | 76 |
| darkcanuck.Leon 1.01 | 3.2 | 13.2% | 67 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.6% | 27 |
| jrm.Test0 1.0 | 6.1 | 9.0% | 3 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.3% | 2 |
| jp.Perpy 16.0 | 8.0 | 6.8% | 2 |
| jaybot.bots.Oddball 4.0 | 8.9 | 5.6% | 5 |
| stuff.Vlad 0.1 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 69.8 | 7 / 35 | 3093 |
| 2 | 3 | 60.4 | 72.1 | 9 / 35 | 2829 |
| 3 | 1 | 61.7 | 75.9 | 12 / 35 | 2763 |
| 4 | 2 | 61.6 | 73.3 | 12 / 35 | 3167 |
| 5 | 2 | 60.0 | 72.7 | 7 / 35 | 2699 |
| 6 | 2 | 63.4 | 79.4 | 12 / 35 | 3027 |
| 7 | 4 | 54.4 | 60.3 | 1 / 35 | 2499 |
| 8 | 4 | 56.9 | 67.3 | 3 / 35 | 2516 |
| 9 | 1 | 63.0 | 79.7 | 9 / 35 | 3246 |
| 10 | 4 | 57.5 | 65.4 | 4 / 35 | 2685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 61 | 30% |
| bts.wiki.RipCurl 0.9b | 43 | 53% |
| darkcanuck.Leon 1.01 | 38 | 32% |
| brainfade.melee.Genghis 0.36 | 16 | 88% |
| jrm.Test0 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 275 of 350 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 82 | 30% | 100 |
| darkcanuck.Leon 1.01 | 58 | 21% | 76 |
| bts.wiki.RipCurl 0.9b | 56 | 20% | 80 |
| brainfade.melee.Genghis 0.36 | 26 | 9% | 32 |
| jrm.Test0 1.0 | 17 | 6% | 19 |
| cs.sheldor.Talon 1.1 | 14 | 5% | 17 |
| jp.Perpy 16.0 | 13 | 5% | 14 |
| stuff.Vlad 0.1 | 5 | 2% | 6 |
| jaybot.bots.Oddball 4.0 | 4 | 1% | 4 |

## Melee bench: F13

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 71.6 | 44 / 350 | 3.56 | 12.9% | 30547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.9% | 179 |
| ags.Glacier 0.2.11 | 1.8 | 16.3% | 62 |
| hadur117.nano.SanaroCL 0.1 | 3.3 | 12.9% | 44 |
| shinh.Entangled 0.3 | 4.3 | 12.2% | 42 |
| gh.micro.Gruweltje 0.7 | 4.4 | 12.3% | 20 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 1 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 2 |
| ayk.WallHugger 1.0 | 8.3 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.9 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.0 | 71.1 | 6 / 35 | 2803 |
| 2 | 3 | 60.8 | 74.6 | 3 / 35 | 3359 |
| 3 | 3 | 60.4 | 71.7 | 5 / 35 | 3127 |
| 4 | 3 | 59.4 | 68.6 | 3 / 35 | 3135 |
| 5 | 4 | 59.0 | 71.4 | 4 / 35 | 2635 |
| 6 | 3 | 61.6 | 74.6 | 8 / 35 | 3261 |
| 7 | 3 | 61.6 | 74.3 | 6 / 35 | 3295 |
| 8 | 3 | 58.0 | 68.3 | 2 / 35 | 2999 |
| 9 | 3 | 59.3 | 71.4 | 4 / 35 | 2770 |
| 10 | 4 | 59.2 | 69.5 | 3 / 35 | 3163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 67 | 30% |
| ags.Glacier 0.2.11 | 37 | 19% |
| shinh.Entangled 0.3 | 25 | 40% |
| gh.micro.Gruweltje 0.7 | 10 | 60% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 90 | 29% | 96 |
| mn.Combat 3.25.0 | 86 | 28% | 106 |
| shinh.Entangled 0.3 | 47 | 15% | 57 |
| gh.micro.Gruweltje 0.7 | 44 | 14% | 50 |
| stelo.Wang 1.0 | 20 | 7% | 21 |
| apc.Colossus2 0.17 | 11 | 4% | 11 |
| maribo.FollowFire 1 | 6 | 2% | 6 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |

## Melee bench: F14

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.5 | 97 / 350 | 3.11 | 14.4% | 33007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.1 | 17.0% | 125 |
| hadur117.nano.SanaroCL 0.1 | 1.9 | 14.4% | 97 |
| catcat20.shape.Theta 0.018 | 3.2 | 12.6% | 64 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.4 | 10.8% | 7 |
| Lo_Ian.Gandalf_V4 4.0 | 5.6 | 10.0% | 15 |
| sanyi.mikrobi.Roberto 1.0 | 5.9 | 9.6% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 6.1 | 9.8% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.2% | 14 |
| pa.Improved 1.0 | 9.0 | 5.8% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 78.7 | 14 / 35 | 3206 |
| 2 | 2 | 61.5 | 77.1 | 6 / 35 | 3258 |
| 3 | 2 | 62.6 | 75.6 | 11 / 35 | 3479 |
| 4 | 1 | 62.4 | 75.6 | 11 / 35 | 3633 |
| 5 | 2 | 61.9 | 76.5 | 10 / 35 | 3350 |
| 6 | 2 | 61.0 | 75.6 | 6 / 35 | 3020 |
| 7 | 2 | 62.8 | 78.1 | 12 / 35 | 3410 |
| 8 | 2 | 61.4 | 74.6 | 8 / 35 | 3107 |
| 9 | 2 | 63.7 | 80.6 | 10 / 35 | 3527 |
| 10 | 2 | 60.5 | 72.7 | 9 / 35 | 3017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 88 | 49% |
| catcat20.shape.Theta 0.018 | 39 | 31% |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 75% |
| sanyi.mikrobi.Roberto 1.0 | 16 | 63% |
| Lo_Ian.Gandalf_V4 4.0 | 12 | 67% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 55% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 67% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 254 of 350 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 100 | 39% | 139 |
| catcat20.shape.Theta 0.018 | 53 | 21% | 66 |
| dmh.robocode.robot.RedDwarf 0.4 | 24 | 9% | 31 |
| Lo_Ian.Gandalf_V4 4.0 | 22 | 9% | 28 |
| sanyi.mikrobi.Roberto 1.0 | 19 | 7% | 32 |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 7% | 34 |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 6% | 13 |
| pa.Improved 1.0 | 2 | 1% | 4 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 66.3 | 64 / 350 | 4.03 | 13.2% | 36036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.0 | 15.7% | 96 |
| emp.Yngwie 1.11 | 2.5 | 13.7% | 98 |
| hadur117.nano.SanaroCL 0.1 | 3.0 | 13.2% | 64 |
| mld.DustBunny 3.8 | 3.5 | 12.9% | 31 |
| cb.nano.Insomnia 1.0 | 5.4 | 11.0% | 18 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.4% | 41 |
| lambdaxy.TBot 0.1 | 7.4 | 7.2% | 0 |
| Grystrion.TrackerWO 1.0 | 7.6 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 9.1 | 5.1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.4 | 60.6 | 3 / 35 | 3716 |
| 2 | 2 | 60.9 | 68.9 | 6 / 35 | 3997 |
| 3 | 2 | 59.5 | 67.9 | 7 / 35 | 3445 |
| 4 | 4 | 59.6 | 63.5 | 5 / 35 | 3893 |
| 5 | 3 | 59.9 | 68.9 | 6 / 35 | 3531 |
| 6 | 4 | 57.5 | 60.3 | 7 / 35 | 3352 |
| 7 | 3 | 60.0 | 69.2 | 7 / 35 | 3299 |
| 8 | 2 | 60.5 | 69.5 | 7 / 35 | 3518 |
| 9 | 2 | 62.0 | 71.1 | 11 / 35 | 3964 |
| 10 | 4 | 57.9 | 63.2 | 5 / 35 | 3321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 39 | 59% |
| kawigi.micro.Shiz 1.1 | 34 | 41% |
| cb.nano.Insomnia 1.0 | 21 | 67% |
| kawigi.robot.Girl 1.2 | 14 | 71% |
| mld.DustBunny 3.8 | 5 | 40% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 63 | 22% | 96 |
| kawigi.micro.Shiz 1.1 | 63 | 22% | 79 |
| mld.DustBunny 3.8 | 57 | 20% | 67 |
| cb.nano.Insomnia 1.0 | 40 | 14% | 34 |
| kawigi.robot.Girl 1.2 | 31 | 11% | 37 |
| lambdaxy.TBot 0.1 | 11 | 4% | 12 |
| divineomega.TrialBot 0.003 | 7 | 2% | 10 |
| Grystrion.TrackerWO 1.0 | 7 | 2% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 7 | 2% | 7 |

## Melee bench: F16

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 70.0 | 53 / 350 | 3.70 | 14.0% | 39211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.3% | 167 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.3 | 14.7% | 24 |
| hadur117.nano.SanaroCL 0.1 | 2.7 | 14.0% | 53 |
| techdude.forest.FlamingForest 1.1 | 4.4 | 10.7% | 60 |
| tvv.nano.Polaris 1.2 | 5.1 | 9.7% | 24 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.5% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.1 | 7.3% | 7 |
| divineomega.DivineBot 1.9.4.5 | 8.2 | 5.9% | 11 |
| asd.Cthulhu 1.3 | 9.2 | 4.8% | 2 |
| repositorio.NanoStep 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 64.8 | 4 / 35 | 3938 |
| 2 | 3 | 59.9 | 66.3 | 1 / 35 | 3847 |
| 3 | 3 | 61.3 | 70.5 | 7 / 35 | 3664 |
| 4 | 2 | 61.4 | 70.5 | 6 / 35 | 3726 |
| 5 | 2 | 63.8 | 76.2 | 7 / 35 | 4282 |
| 6 | 2 | 64.5 | 76.8 | 9 / 35 | 4456 |
| 7 | 3 | 60.7 | 68.9 | 4 / 35 | 3700 |
| 8 | 3 | 58.5 | 64.1 | 3 / 35 | 3590 |
| 9 | 3 | 61.6 | 71.7 | 7 / 35 | 3800 |
| 10 | 3 | 61.6 | 69.8 | 5 / 35 | 4208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 99 | 32% |
| techdude.forest.FlamingForest 1.1 | 14 | 21% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 77% |
| tvv.nano.Polaris 1.2 | 9 | 22% |
| divineomega.DivineBot 1.9.4.5 | 6 | 67% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |

Hadur died in 297 of 350 rounds, at a mean tick of 1191. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 121 | 41% | 155 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 53 | 18% | 59 |
| bvh.fnr.Fenrir 0.36l | 33 | 11% | 34 |
| techdude.forest.FlamingForest 1.1 | 29 | 10% | 33 |
| tvv.nano.Polaris 1.2 | 25 | 8% | 26 |
| divineomega.DivineBot 1.9.4.5 | 13 | 4% | 19 |
| stelo.IntrinsicVolatility 1.4 | 13 | 4% | 14 |
| asd.Cthulhu 1.3 | 6 | 2% | 6 |
| repositorio.NanoStep 1.0 | 4 | 1% | 4 |

## Melee bench: F17

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 68.1 | 74 / 350 | 3.87 | 13.4% | 35722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 1.7 | 13.8% | 82 |
| et.Predator 1.8 | 2.1 | 14.2% | 70 |
| hadur117.nano.SanaroCL 0.1 | 2.6 | 13.4% | 74 |
| cx.BlestPain 1.41 | 4.0 | 12.5% | 57 |
| nic.Nicator 2.4 | 4.8 | 11.6% | 39 |
| ahf.NanoAndrew .4 | 5.8 | 11.0% | 25 |
| maribo.melee.BMV 0.1 | 7.0 | 9.1% | 2 |
| tex.Longbot 0.4 | 8.1 | 6.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.9 | 5.3% | 3 |
| goblin.Bender 2.4 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 74.3 | 10 / 35 | 3363 |
| 2 | 2 | 61.1 | 70.8 | 9 / 35 | 3557 |
| 3 | 2 | 61.5 | 71.4 | 10 / 35 | 3676 |
| 4 | 3 | 59.7 | 67.6 | 4 / 35 | 3700 |
| 5 | 4 | 56.3 | 61.6 | 4 / 35 | 3244 |
| 6 | 3 | 59.1 | 64.4 | 5 / 35 | 3730 |
| 7 | 4 | 58.9 | 63.5 | 7 / 35 | 3661 |
| 8 | 3 | 59.6 | 66.3 | 8 / 35 | 3449 |
| 9 | 1 | 62.2 | 74.0 | 8 / 35 | 3828 |
| 10 | 2 | 59.8 | 67.3 | 9 / 35 | 3514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 56% |
| et.Predator 1.8 | 38 | 26% |
| cx.BlestPain 1.41 | 29 | 90% |
| ahf.NanoAndrew .4 | 14 | 64% |
| nic.Nicator 2.4 | 13 | 31% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |
| goblin.Bender 2.4 | 1 | 100% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 65 | 23% | 74 |
| oog.melee.Mercutio 1.0 | 61 | 22% | 83 |
| ahf.NanoAndrew .4 | 46 | 17% | 51 |
| cx.BlestPain 1.41 | 39 | 14% | 68 |
| nic.Nicator 2.4 | 35 | 13% | 40 |
| maribo.melee.BMV 0.1 | 16 | 6% | 16 |
| tex.Longbot 0.4 | 11 | 4% | 12 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 1% | 4 |
| goblin.Bender 2.4 | 1 | 0% | 2 |

## Melee bench: F18

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 71.2 | 94 / 350 | 3.59 | 14.1% | 34151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.6 | 14.2% | 93 |
| hadur117.nano.SanaroCL 0.1 | 1.9 | 14.1% | 94 |
| agd.Mooserwirt2 2.7 | 2.9 | 12.6% | 53 |
| uji.DBH 1.1 | 4.0 | 11.8% | 35 |
| spinnercat.Robovirus 2.718 | 5.1 | 10.3% | 20 |
| ratosh.Nobo 0.21 | 5.6 | 10.4% | 13 |
| sigterm.Sigterm 1.0 | 7.1 | 8.2% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 8.1 | 7.0% | 4 |
| stelo.WangRobot 1.0 | 8.8 | 6.2% | 18 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.9 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 79.4 | 11 / 35 | 3743 |
| 2 | 1 | 61.7 | 74.3 | 11 / 35 | 3501 |
| 3 | 4 | 57.4 | 62.5 | 7 / 35 | 3112 |
| 4 | 1 | 60.9 | 71.4 | 11 / 35 | 3309 |
| 5 | 1 | 62.7 | 76.5 | 11 / 35 | 3584 |
| 6 | 1 | 63.9 | 80.0 | 13 / 35 | 3779 |
| 7 | 2 | 61.3 | 72.1 | 10 / 35 | 3543 |
| 8 | 2 | 59.2 | 67.9 | 7 / 35 | 3373 |
| 9 | 3 | 58.1 | 66.3 | 4 / 35 | 3465 |
| 10 | 3 | 55.9 | 61.3 | 9 / 35 | 2742 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 42 | 50% |
| agd.Mooserwirt2 2.7 | 33 | 64% |
| uji.DBH 1.1 | 25 | 60% |
| sigterm.Sigterm 1.0 | 18 | 56% |
| spinnercat.Robovirus 2.718 | 15 | 87% |
| ratosh.Nobo 0.21 | 9 | 78% |
| stelo.WangRobot 1.0 | 8 | 25% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 257 of 350 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 72 | 28% | 96 |
| agd.Mooserwirt2 2.7 | 45 | 18% | 72 |
| uji.DBH 1.1 | 35 | 14% | 46 |
| ratosh.Nobo 0.21 | 27 | 11% | 34 |
| spinnercat.Robovirus 2.718 | 22 | 9% | 31 |
| sigterm.Sigterm 1.0 | 19 | 7% | 24 |
| stelo.WangRobot 1.0 | 19 | 7% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 4% | 17 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8 | 3% | 9 |

## Melee bench: F19

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 79.9 | 111 / 350 | 2.81 | 15.6% | 37665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.7 | 16.2% | 78 |
| mld.Infinity 2.2 | 2.0 | 16.2% | 120 |
| hadur117.nano.SanaroCL 0.1 | 2.3 | 15.6% | 111 |
| krillr.mini.JointStrike 2.0.0 | 4.4 | 11.7% | 12 |
| erdnis.Rover 0.3 | 4.7 | 10.5% | 5 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.6% | 7 |
| pac.ABC 2.1 | 7.1 | 7.6% | 15 |
| mbh.Mbh 0.1 | 7.6 | 7.1% | 1 |
| pbg.R2D2 1.0 | 8.9 | 5.7% | 1 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 82.9 | 13 / 35 | 4027 |
| 2 | 3 | 62.6 | 73.0 | 10 / 35 | 3402 |
| 3 | 2 | 65.2 | 79.4 | 13 / 35 | 3821 |
| 4 | 2 | 66.2 | 84.1 | 10 / 35 | 3947 |
| 5 | 2 | 63.8 | 78.1 | 7 / 35 | 3684 |
| 6 | 3 | 63.8 | 76.5 | 11 / 35 | 3549 |
| 7 | 2 | 66.1 | 81.9 | 13 / 35 | 4013 |
| 8 | 3 | 63.1 | 75.9 | 9 / 35 | 3416 |
| 9 | 3 | 65.5 | 82.9 | 11 / 35 | 3777 |
| 10 | 2 | 66.3 | 84.1 | 14 / 35 | 4029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 101 | 50% |
| davidalves.net.DuelistMiniMelee 1.2 | 76 | 50% |
| krillr.mini.JointStrike 2.0.0 | 18 | 67% |
| erdnis.Rover 0.3 | 6 | 100% |
| pac.ABC 2.1 | 5 | 0% |
| patson.PatsonTestBot 1.0 | 3 | 67% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 0% |

Hadur died in 239 of 350 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 93 | 39% | 184 |
| mld.Infinity 2.2 | 75 | 31% | 41 |
| krillr.mini.JointStrike 2.0.0 | 28 | 12% | 41 |
| patson.PatsonTestBot 1.0 | 13 | 5% | 25 |
| erdnis.Rover 0.3 | 13 | 5% | 22 |
| pac.ABC 2.1 | 10 | 4% | 16 |
| mbh.Mbh 0.1 | 4 | 2% | 8 |
| pbg.R2D2 1.0 | 3 | 1% | 8 |

## Melee bench: F20

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 70.0 | 69 / 350 | 3.70 | 13.7% | 35030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.4% | 135 |
| hadur117.nano.SanaroCL 0.1 | 2.2 | 13.7% | 69 |
| fwb.Nine 1.0.1 | 3.6 | 11.9% | 52 |
| nz.jdc.nano.GridFu 1.0 | 3.9 | 11.5% | 25 |
| catcat20.Rabbit 0.001 | 4.3 | 11.0% | 38 |
| djdjdj.NanoSkunk10 1.0 | 6.6 | 8.7% | 4 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 8.4% | 8 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.5% | 14 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 78.1 | 11 / 35 | 3916 |
| 2 | 2 | 60.1 | 69.8 | 7 / 35 | 3489 |
| 3 | 3 | 59.8 | 70.8 | 7 / 35 | 3209 |
| 4 | 2 | 61.1 | 71.1 | 9 / 35 | 3493 |
| 5 | 2 | 61.3 | 73.3 | 8 / 35 | 3377 |
| 6 | 2 | 58.7 | 64.4 | 6 / 35 | 3639 |
| 7 | 3 | 57.3 | 62.2 | 3 / 35 | 3572 |
| 8 | 2 | 58.2 | 66.3 | 3 / 35 | 3250 |
| 9 | 2 | 60.0 | 70.2 | 6 / 35 | 3182 |
| 10 | 2 | 62.2 | 74.0 | 9 / 35 | 3903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 65 | 51% |
| catcat20.Rabbit 0.001 | 26 | 54% |
| fwb.Nine 1.0.1 | 18 | 56% |
| nz.jdc.nano.GridFu 1.0 | 15 | 27% |
| m3thos.mini.Eva01 0.5.5 | 5 | 40% |
| bayen.nut.Squirrel 1.615 | 3 | 67% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 50% |

Hadur died in 281 of 350 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 110 | 39% | 132 |
| fwb.Nine 1.0.1 | 47 | 17% | 53 |
| nz.jdc.nano.GridFu 1.0 | 45 | 16% | 54 |
| catcat20.Rabbit 0.001 | 32 | 11% | 49 |
| bayen.nut.Squirrel 1.615 | 15 | 5% | 18 |
| m3thos.mini.Eva01 0.5.5 | 13 | 5% | 17 |
| djdjdj.NanoSkunk10 1.0 | 9 | 3% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 7 | 2% | 10 |
| ntc.ControlledChaos 1.1.4 | 3 | 1% | 3 |

## Melee bench: F21

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 82.2 | 128 / 350 | 2.60 | 16.7% | 44066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.2 | 17.3% | 154 |
| hadur117.nano.SanaroCL 0.1 | 1.8 | 16.7% | 128 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.7% | 28 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.2% | 21 |
| eld.Hmm 1.0 | 5.4 | 8.4% | 19 |
| oa.weak.BotherBot 0.1 | 5.6 | 8.2% | 1 |
| fire219.CatBot 1.0 | 7.5 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 2 |
| PSW.Relentless 0.1 | 8.6 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 83.5 | 13 / 35 | 4011 |
| 2 | 1 | 66.5 | 86.0 | 14 / 35 | 4227 |
| 3 | 2 | 64.7 | 76.8 | 11 / 35 | 4410 |
| 4 | 1 | 65.9 | 81.6 | 12 / 35 | 4721 |
| 5 | 2 | 65.4 | 81.6 | 12 / 35 | 4422 |
| 6 | 2 | 66.3 | 82.9 | 14 / 35 | 4424 |
| 7 | 2 | 65.5 | 79.0 | 12 / 35 | 4232 |
| 8 | 2 | 67.0 | 83.2 | 17 / 35 | 4654 |
| 9 | 2 | 67.0 | 84.8 | 12 / 35 | 4589 |
| 10 | 2 | 65.8 | 82.5 | 11 / 35 | 4376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 121 | 51% |
| dummy.mini.Scimitar 1.01 | 50 | 84% |
| cf.RiO.RiOx 4.2.1 | 24 | 58% |
| eld.Hmm 1.0 | 17 | 35% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| arthord.MannyPacquiao Beta | 1 | 0% |

Hadur died in 222 of 350 rounds, at a mean tick of 1179. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 92 | 41% | 146 |
| dummy.mini.Scimitar 1.01 | 51 | 23% | 99 |
| cf.RiO.RiOx 4.2.1 | 40 | 18% | 50 |
| eld.Hmm 1.0 | 16 | 7% | 26 |
| oa.weak.BotherBot 0.1 | 6 | 3% | 11 |
| el.JumpShoot 0.2 | 6 | 3% | 6 |
| fire219.CatBot 1.0 | 5 | 2% | 5 |
| PSW.Relentless 0.1 | 4 | 2% | 4 |
| arthord.MannyPacquiao Beta | 2 | 1% | 3 |

## Melee bench: F23

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.6 | 103 / 350 | 2.74 | 16.0% | 40649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.3% | 144 |
| hadur117.nano.SanaroCL 0.1 | 2.1 | 16.0% | 103 |
| cre.Karolos 0.32 | 3.0 | 14.6% | 67 |
| stelo.AreaTargetingBot 1.1 | 3.9 | 11.9% | 26 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.3% | 2 |
| sample.Walls 1.0 | 6.3 | 8.7% | 5 |
| stelo.RamTrackSurfer 1.2 | 6.8 | 8.4% | 3 |
| cw.megas.Blade 0.8 | 7.4 | 8.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 85.4 | 10 / 35 | 3948 |
| 2 | 3 | 64.5 | 76.5 | 8 / 35 | 3883 |
| 3 | 2 | 65.9 | 81.0 | 13 / 35 | 4276 |
| 4 | 2 | 64.8 | 78.1 | 8 / 35 | 4343 |
| 5 | 2 | 66.7 | 83.5 | 10 / 35 | 4325 |
| 6 | 2 | 65.8 | 80.6 | 12 / 35 | 4115 |
| 7 | 2 | 66.3 | 82.9 | 10 / 35 | 4080 |
| 8 | 2 | 65.4 | 77.8 | 11 / 35 | 3954 |
| 9 | 2 | 64.9 | 78.7 | 11 / 35 | 3684 |
| 10 | 2 | 65.7 | 81.9 | 10 / 35 | 4041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 94 | 37% |
| cre.Karolos 0.32 | 43 | 44% |
| stelo.AreaTargetingBot 1.1 | 32 | 56% |
| sample.Walls 1.0 | 14 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 88% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 80% |
| cw.megas.Blade 0.8 | 5 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 247 of 350 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 117 | 47% | 161 |
| cre.Karolos 0.32 | 70 | 28% | 85 |
| stelo.AreaTargetingBot 1.1 | 37 | 15% | 44 |
| stelo.RamTrackSurfer 1.2 | 7 | 3% | 19 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 3% | 13 |
| sample.Walls 1.0 | 5 | 2% | 16 |
| cw.megas.Blade 0.8 | 4 | 2% | 9 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.3 | 56.3 | 39 / 350 | 4.93 | 10.6% | 24691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.7 | 14.9% | 90 |
| davidalves.Phoenix 0.54 | 2.4 | 13.5% | 85 |
| pedersen.Ugluk 1.1.1 | 2.9 | 12.8% | 51 |
| florent.XSeries.X2 0.12 | 3.0 | 13.1% | 62 |
| hadur117.nano.SanaroCL 0.1 | 5.1 | 10.6% | 39 |
| oog.melee.Corsair 1.0 | 6.1 | 9.6% | 5 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.7% | 17 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.5% | 1 |
| evd.X1 0.01 | 9.5 | 5.1% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.5 | 60.0 | 2 / 35 | 2562 |
| 2 | 5 | 55.4 | 60.6 | 3 / 35 | 2595 |
| 3 | 5 | 53.1 | 54.9 | 3 / 35 | 2575 |
| 4 | 5 | 51.8 | 52.4 | 5 / 35 | 2359 |
| 5 | 5 | 53.8 | 56.8 | 5 / 35 | 2335 |
| 6 | 5 | 53.2 | 57.1 | 4 / 35 | 2324 |
| 7 | 5 | 54.7 | 59.7 | 4 / 35 | 2481 |
| 8 | 5 | 55.2 | 60.3 | 6 / 35 | 2635 |
| 9 | 6 | 48.7 | 47.3 | 3 / 35 | 2178 |
| 10 | 5 | 52.5 | 53.7 | 4 / 35 | 2647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 32 | 47% |
| davidalves.Phoenix 0.54 | 19 | 42% |
| pedersen.Ugluk 1.1.1 | 10 | 60% |
| florent.XSeries.X2 0.12 | 9 | 67% |
| stelo.SoJNanoMelee 1.1 | 6 | 50% |
| oog.melee.Corsair 1.0 | 2 | 50% |

Hadur died in 312 of 350 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 69 | 22% | 85 |
| davidalves.Phoenix 0.54 | 57 | 18% | 63 |
| pedersen.Ugluk 1.1.1 | 55 | 18% | 61 |
| florent.XSeries.X2 0.12 | 49 | 16% | 55 |
| stelo.SoJNanoMelee 1.1 | 26 | 8% | 27 |
| oog.melee.Corsair 1.0 | 22 | 7% | 25 |
| lunchie.Lunchbox 0.93 | 15 | 5% | 15 |
| evd.X1 0.01 | 10 | 3% | 10 |
| as.FrankTheTank 1.3 | 8 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 71.4 | 75 / 350 | 3.58 | 13.8% | 30251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.6 | 14.7% | 92 |
| hadur117.nano.SanaroCL 0.1 | 2.1 | 13.8% | 75 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.4% | 60 |
| jdw.Hurricane 1.4 | 3.8 | 11.6% | 45 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 10.6% | 31 |
| ds.Oo 2.2 | 6.5 | 8.8% | 17 |
| gjr.Cephalosporin 0.1 | 6.6 | 8.8% | 20 |
| awesomeness.Elite 1.0 | 7.8 | 7.1% | 5 |
| adt.Ar2 1.1 | 8.7 | 6.5% | 6 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 66.3 | 6 / 35 | 3463 |
| 2 | 1 | 60.9 | 73.7 | 11 / 35 | 2881 |
| 3 | 1 | 62.8 | 80.0 | 8 / 35 | 3173 |
| 4 | 1 | 60.5 | 72.7 | 8 / 35 | 3148 |
| 5 | 1 | 61.6 | 76.2 | 9 / 35 | 2951 |
| 6 | 3 | 58.5 | 66.7 | 4 / 35 | 3254 |
| 7 | 2 | 59.1 | 67.6 | 7 / 35 | 2857 |
| 8 | 4 | 57.1 | 62.5 | 8 / 35 | 2466 |
| 9 | 3 | 59.8 | 72.4 | 6 / 35 | 2809 |
| 10 | 2 | 62.0 | 75.6 | 8 / 35 | 3249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 59 | 39% |
| voidious.micro.BlitzBat 1.05 | 39 | 31% |
| jdw.Hurricane 1.4 | 26 | 69% |
| gre.svman4.Morfeas 1.4.1 | 13 | 62% |
| gjr.Cephalosporin 0.1 | 8 | 38% |
| ds.Oo 2.2 | 7 | 43% |
| awesomeness.Elite 1.0 | 6 | 100% |
| adt.Ar2 1.1 | 3 | 67% |

Hadur died in 275 of 350 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 77 | 28% | 105 |
| voidious.micro.BlitzBat 1.05 | 77 | 28% | 90 |
| jdw.Hurricane 1.4 | 38 | 14% | 54 |
| gjr.Cephalosporin 0.1 | 22 | 8% | 25 |
| gre.svman4.Morfeas 1.4.1 | 21 | 8% | 27 |
| adt.Ar2 1.1 | 15 | 5% | 18 |
| ds.Oo 2.2 | 13 | 5% | 17 |
| awesomeness.Elite 1.0 | 6 | 2% | 8 |
| amk.ChumbaMini 0.2 | 6 | 2% | 6 |

## Melee bench: F26

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 69.3 | 56 / 350 | 3.76 | 13.2% | 35669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.2 | 16.6% | 117 |
| hadur117.nano.SanaroCL 0.1 | 2.5 | 13.2% | 56 |
| shu.nitro.LENIN .T34 | 2.7 | 13.3% | 78 |
| lrem.Spectre 0.4.4 | 4.0 | 12.5% | 43 |
| js.PinBall 1.6 | 5.3 | 10.9% | 25 |
| gh.mini.GrubbmOne 1.0 | 5.6 | 10.9% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.4% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.5% | 9 |
| sample.SpinBot 1.0 | 8.8 | 5.2% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.9 | 71.1 | 4 / 35 | 3639 |
| 2 | 4 | 59.3 | 67.0 | 4 / 35 | 3490 |
| 3 | 1 | 61.9 | 73.3 | 8 / 35 | 3912 |
| 4 | 3 | 60.8 | 67.6 | 9 / 35 | 3607 |
| 5 | 2 | 61.8 | 72.1 | 7 / 35 | 3809 |
| 6 | 2 | 61.7 | 75.9 | 5 / 35 | 3517 |
| 7 | 4 | 57.7 | 62.9 | 2 / 35 | 3387 |
| 8 | 2 | 60.4 | 70.2 | 8 / 35 | 3450 |
| 9 | 3 | 57.4 | 63.2 | 2 / 35 | 3316 |
| 10 | 2 | 60.8 | 69.8 | 7 / 35 | 3542 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 49 | 31% |
| lrem.Spectre 0.4.4 | 35 | 57% |
| shu.nitro.LENIN .T34 | 35 | 26% |
| gh.mini.GrubbmOne 1.0 | 16 | 56% |
| js.PinBall 1.6 | 6 | 33% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 33% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 0% |

Hadur died in 295 of 350 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 92 | 31% | 106 |
| shu.nitro.LENIN .T34 | 57 | 19% | 70 |
| lrem.Spectre 0.4.4 | 42 | 14% | 54 |
| gh.mini.GrubbmOne 1.0 | 32 | 11% | 41 |
| js.PinBall 1.6 | 31 | 11% | 36 |
| jaybot.adv.bots.JayBot 2.0 | 21 | 7% | 23 |
| fullsail.LaxativeTeaTwo 1.0 | 12 | 4% | 12 |
| sample.SpinBot 1.0 | 7 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 64.8 | 86 / 350 | 4.17 | 13.0% | 32536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.5 | 15.2% | 134 |
| hadur117.nano.SanaroCL 0.1 | 2.5 | 13.0% | 86 |
| wee.Gem 1.8.4 | 3.3 | 12.1% | 55 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 12.0% | 38 |
| EH.Eagle 1.0.6 | 4.5 | 11.1% | 18 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.3% | 10 |
| joe.ADinosaur 1.0 | 7.6 | 8.1% | 4 |
| throxbot.ThroxBot 0.1 | 7.7 | 8.2% | 6 |
| caimano.Furia_Ceca 0.22 | 8.9 | 6.2% | 3 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 51.2 | 39.7 | 7 / 35 | 3596 |
| 2 | 2 | 59.2 | 69.8 | 10 / 35 | 2638 |
| 3 | 1 | 62.2 | 77.8 | 12 / 35 | 2964 |
| 4 | 4 | 52.3 | 42.2 | 6 / 35 | 3936 |
| 5 | 2 | 59.5 | 70.2 | 8 / 35 | 2916 |
| 6 | 2 | 60.2 | 73.0 | 7 / 35 | 3103 |
| 7 | 2 | 60.9 | 74.6 | 11 / 35 | 2968 |
| 8 | 1 | 61.0 | 74.6 | 10 / 35 | 3058 |
| 9 | 2 | 60.5 | 74.9 | 9 / 35 | 2913 |
| 10 | 3 | 57.2 | 51.4 | 6 / 35 | 4444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 75 | 57% |
| wee.Gem 1.8.4 | 30 | 50% |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 45% |
| EH.Eagle 1.0.6 | 13 | 92% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 60% |
| joe.ADinosaur 1.0 | 3 | 67% |
| throxbot.ThroxBot 0.1 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 266 of 350 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 70 | 26% | 111 |
| sheldor.melee.nano.TestMelee 0.1 | 44 | 17% | 53 |
| wee.Gem 1.8.4 | 41 | 15% | 58 |
| techdude.kombat.FlamingKombat 1.5 | 22 | 8% | 24 |
| joe.ADinosaur 1.0 | 20 | 8% | 20 |
| cs.Grudge 1.0 | 20 | 8% | 19 |
| throxbot.ThroxBot 0.1 | 18 | 7% | 19 |
| EH.Eagle 1.0.6 | 16 | 6% | 31 |
| caimano.Furia_Ceca 0.22 | 14 | 5% | 15 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 76.9 | 93 / 350 | 3.08 | 14.8% | 32844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.0 | 17.4% | 146 |
| hadur117.nano.SanaroCL 0.1 | 2.0 | 14.8% | 93 |
| uji.Antique 1.0 | 3.2 | 12.6% | 47 |
| qohnil.blot.BlotBot 3.61 | 4.1 | 11.3% | 35 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.6% | 12 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.1% | 4 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.6% | 8 |
| matt.advanced.Katana 1.0 | 7.8 | 6.7% | 4 |
| stelo.PianistNano 1.2 | 9.4 | 5.5% | 0 |
| stelo.Lifestealer 1.0 | 9.6 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 77.8 | 7 / 35 | 3304 |
| 2 | 2 | 61.8 | 74.9 | 12 / 35 | 3135 |
| 3 | 2 | 63.0 | 80.3 | 9 / 35 | 3233 |
| 4 | 2 | 63.5 | 81.6 | 8 / 35 | 3264 |
| 5 | 2 | 61.9 | 74.6 | 9 / 35 | 3377 |
| 6 | 2 | 63.1 | 76.5 | 8 / 35 | 3622 |
| 7 | 2 | 60.8 | 74.9 | 6 / 35 | 2943 |
| 8 | 2 | 62.0 | 75.9 | 11 / 35 | 3239 |
| 9 | 2 | 61.3 | 73.7 | 11 / 35 | 3119 |
| 10 | 2 | 63.7 | 78.4 | 12 / 35 | 3608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 136 | 33% |
| uji.Antique 1.0 | 33 | 76% |
| qohnil.blot.BlotBot 3.61 | 14 | 36% |
| pfvicm.Sobieski 7.2.3b | 8 | 50% |
| matt.advanced.Katana 1.0 | 8 | 100% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| ahr.ice.Ice 1.0.2 | 4 | 0% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 258 of 350 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 132 | 51% | 161 |
| uji.Antique 1.0 | 36 | 14% | 70 |
| pfvicm.Sobieski 7.2.3b | 31 | 12% | 34 |
| amk.ChumbaWumba 0.3 | 21 | 8% | 24 |
| qohnil.blot.BlotBot 3.61 | 18 | 7% | 24 |
| ahr.ice.Ice 1.0.2 | 10 | 4% | 12 |
| stelo.Lifestealer 1.0 | 5 | 2% | 7 |
| matt.advanced.Katana 1.0 | 4 | 2% | 15 |
| stelo.PianistNano 1.2 | 1 | 0% | 3 |

## Melee bench: F29

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 64.9 | 45 / 350 | 4.16 | 12.9% | 32722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.2 | 16.6% | 127 |
| zyx.mega.YersiniaPestis 3.1 | 1.9 | 15.2% | 98 |
| hadur117.nano.SanaroCL 0.1 | 3.6 | 12.9% | 45 |
| myl.micro.Troodon 1.10 | 3.6 | 13.0% | 32 |
| jok.PheonixM 0.1.2 | 4.8 | 11.1% | 18 |
| DBall.Anarchy 0.1 | 6.4 | 8.2% | 26 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.1% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.4 | 4.4% | 3 |
| jangs.ns51 1.0 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 64.1 | 5 / 35 | 3366 |
| 2 | 4 | 60.3 | 68.3 | 4 / 35 | 3162 |
| 3 | 3 | 60.7 | 69.2 | 6 / 35 | 3226 |
| 4 | 3 | 59.9 | 65.1 | 5 / 35 | 3632 |
| 5 | 5 | 56.8 | 59.0 | 2 / 35 | 3278 |
| 6 | 5 | 56.5 | 58.7 | 3 / 35 | 2925 |
| 7 | 4 | 57.6 | 62.5 | 5 / 35 | 2940 |
| 8 | 3 | 59.9 | 65.1 | 6 / 35 | 3358 |
| 9 | 3 | 58.3 | 63.2 | 5 / 35 | 3124 |
| 10 | 3 | 62.4 | 73.3 | 4 / 35 | 3711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 8% |
| zyx.mega.YersiniaPestis 3.1 | 29 | 52% |
| myl.micro.Troodon 1.10 | 18 | 56% |
| DBall.Anarchy 0.1 | 10 | 70% |
| jok.PheonixM 0.1.2 | 9 | 89% |
| jangs.ns51 1.0 | 1 | 0% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 107 | 35% | 111 |
| zyx.mega.YersiniaPestis 3.1 | 74 | 24% | 89 |
| myl.micro.Troodon 1.10 | 52 | 17% | 60 |
| jok.PheonixM 0.1.2 | 35 | 11% | 40 |
| fullsail.TimbotNoPrediction 1.0 | 13 | 4% | 14 |
| DBall.Anarchy 0.1 | 12 | 4% | 21 |
| ph.melee.ArcherME 0.3 | 11 | 4% | 11 |
| jangs.ns51 1.0 | 2 | 1% | 4 |

## Melee bench: F30

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.0 | 56.4 | 26 / 350 | 4.92 | 10.7% | 27366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.7 | 14.4% | 101 |
| darkcanuck.B26354 1.06 | 2.4 | 13.8% | 79 |
| oog.melee.Capulet 1.2 | 2.5 | 13.9% | 62 |
| stelo.PastFuture 2.3.2 | 3.5 | 12.9% | 47 |
| hadur117.nano.SanaroCL 0.1 | 5.0 | 10.7% | 26 |
| intruder.PrairieWolf 2.61 | 6.4 | 9.2% | 18 |
| ntc.Opposite 1.5 | 7.6 | 7.7% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.4% | 9 |
| tripphippy.Alice 1.1 | 8.1 | 7.3% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.1 | 54.3 | 2 / 35 | 2617 |
| 2 | 5 | 54.7 | 60.6 | 4 / 35 | 2532 |
| 3 | 5 | 53.0 | 54.6 | 4 / 35 | 2428 |
| 4 | 5 | 53.3 | 54.9 | 2 / 35 | 2763 |
| 5 | 5 | 54.1 | 56.8 | 2 / 35 | 2751 |
| 6 | 5 | 53.5 | 54.0 | 1 / 35 | 3010 |
| 7 | 5 | 56.5 | 62.9 | 5 / 35 | 2713 |
| 8 | 4 | 55.9 | 58.4 | 3 / 35 | 3169 |
| 9 | 5 | 53.3 | 54.9 | 2 / 35 | 2566 |
| 10 | 6 | 52.2 | 52.7 | 1 / 35 | 2817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 29 | 41% |
| catcat20.Matcha 0.006 | 25 | 32% |
| oog.melee.Capulet 1.2 | 11 | 9% |
| stelo.PastFuture 2.3.2 | 9 | 22% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |
| intruder.PrairieWolf 2.61 | 1 | 0% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 325 of 350 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 65 | 20% | 75 |
| catcat20.Matcha 0.006 | 60 | 18% | 65 |
| stelo.PastFuture 2.3.2 | 60 | 18% | 62 |
| oog.melee.Capulet 1.2 | 52 | 16% | 59 |
| ntc.Opposite 1.5 | 26 | 8% | 26 |
| intruder.PrairieWolf 2.61 | 23 | 7% | 24 |
| tripphippy.Alice 1.1 | 21 | 6% | 21 |
| fowl3628800.LightningBolt 2.6.0 | 13 | 4% | 13 |
| GarmBox.Anger 1.0 | 5 | 2% | 5 |

## Melee bench: F31

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 58.3 | 22 / 350 | 4.75 | 10.9% | 25191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 170 |
| gh.mini.Griezel 0.2 | 2.2 | 13.9% | 87 |
| spinnercat.micro.Tyger 0.1 | 3.6 | 12.2% | 26 |
| d414.nano.Quantum 1.0.0 | 3.8 | 11.8% | 28 |
| hadur117.nano.SanaroCL 0.1 | 4.6 | 10.9% | 22 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.3% | 10 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.9% | 8 |
| fm.mammillarias 1.3 | 7.9 | 6.5% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.4 | 58.7 | 0 / 35 | 2728 |
| 2 | 5 | 54.8 | 59.0 | 2 / 35 | 2472 |
| 3 | 4 | 57.7 | 64.4 | 4 / 35 | 2934 |
| 4 | 5 | 52.2 | 52.4 | 3 / 35 | 2396 |
| 5 | 6 | 49.3 | 46.3 | 1 / 35 | 2397 |
| 6 | 3 | 59.0 | 68.6 | 3 / 35 | 2915 |
| 7 | 4 | 53.6 | 58.4 | 2 / 35 | 2104 |
| 8 | 4 | 57.4 | 67.6 | 3 / 35 | 2309 |
| 9 | 5 | 53.4 | 54.6 | 2 / 35 | 2614 |
| 10 | 5 | 51.9 | 52.7 | 2 / 35 | 2322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 38 | 26% |
| gh.mini.Griezel 0.2 | 32 | 28% |
| spinnercat.micro.Tyger 0.1 | 9 | 11% |
| d414.nano.Quantum 1.0.0 | 4 | 25% |
| timmit.nano.TimDog 0.33 | 2 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 328 of 350 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 96 | 29% | 105 |
| abc.Shadow 3.84i | 74 | 23% | 83 |
| spinnercat.micro.Tyger 0.1 | 62 | 19% | 63 |
| d414.nano.Quantum 1.0.0 | 40 | 12% | 42 |
| fm.mammillarias 1.3 | 18 | 5% | 18 |
| gh.nano.Grofvuil 0.2 | 15 | 5% | 16 |
| timmit.nano.TimDog 0.33 | 14 | 4% | 14 |
| Gecko.ultimateGeckoBot 1.0 | 7 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 76.6 | 129 / 350 | 3.10 | 15.0% | 35117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.3% | 91 |
| hadur117.nano.SanaroCL 0.1 | 1.6 | 15.0% | 129 |
| apc.botM 3.0 | 3.3 | 12.2% | 54 |
| lxx.ConceptA 0.8 | 4.3 | 10.9% | 12 |
| vjik.UnViolation 1.1 | 4.8 | 10.7% | 30 |
| bayen.UbaMicro 1.4 | 5.9 | 9.4% | 12 |
| panzer.Panzer 0.2 | 7.0 | 8.1% | 2 |
| yk.JahMicro 1.0 | 7.9 | 7.1% | 14 |
| conscience.Electron 1.3g | 8.9 | 6.1% | 1 |
| donjezza.Jezza 1.0 | 9.9 | 5.2% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 74.9 | 13 / 35 | 3117 |
| 2 | 1 | 63.3 | 78.7 | 14 / 35 | 3776 |
| 3 | 2 | 62.3 | 74.6 | 13 / 35 | 3655 |
| 4 | 2 | 64.2 | 81.0 | 15 / 35 | 3744 |
| 5 | 2 | 61.4 | 74.6 | 12 / 35 | 3311 |
| 6 | 1 | 63.9 | 80.3 | 14 / 35 | 3738 |
| 7 | 2 | 60.7 | 73.3 | 10 / 35 | 3276 |
| 8 | 2 | 62.1 | 77.8 | 10 / 35 | 3354 |
| 9 | 1 | 63.4 | 78.4 | 16 / 35 | 3559 |
| 10 | 1 | 61.4 | 72.7 | 12 / 35 | 3587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 95 | 63% |
| apc.botM 3.0 | 34 | 74% |
| vjik.UnViolation 1.1 | 22 | 64% |
| lxx.ConceptA 0.8 | 19 | 84% |
| yk.JahMicro 1.0 | 11 | 36% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| panzer.Panzer 0.2 | 6 | 83% |
| donjezza.Jezza 1.0 | 5 | 20% |

Hadur died in 224 of 350 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 66 | 29% | 135 |
| lxx.ConceptA 0.8 | 39 | 17% | 48 |
| apc.botM 3.0 | 30 | 13% | 52 |
| bayen.UbaMicro 1.4 | 29 | 13% | 32 |
| vjik.UnViolation 1.1 | 17 | 8% | 35 |
| yk.JahMicro 1.0 | 14 | 6% | 14 |
| conscience.Electron 1.3g | 13 | 6% | 14 |
| panzer.Panzer 0.2 | 11 | 5% | 12 |
| donjezza.Jezza 1.0 | 4 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F33

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 68.5 | 56 / 350 | 3.83 | 13.6% | 35949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.8% | 139 |
| hadur117.nano.SanaroCL 0.1 | 2.6 | 13.6% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.9% | 71 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.6% | 34 |
| labg.Cataclysm 2.05 | 4.4 | 11.5% | 39 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.0% | 7 |
| zyx.micro.Ant 1.1 | 8.6 | 5.2% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.1 | 4.7% | 0 |
| sanja.First 0.1 | 9.3 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 72.1 | 6 / 35 | 3425 |
| 2 | 3 | 62.5 | 72.4 | 7 / 35 | 3587 |
| 3 | 2 | 61.2 | 69.8 | 8 / 35 | 3667 |
| 4 | 3 | 60.2 | 68.9 | 3 / 35 | 3363 |
| 5 | 2 | 60.1 | 68.3 | 4 / 35 | 3652 |
| 6 | 3 | 59.1 | 65.4 | 3 / 35 | 3629 |
| 7 | 3 | 59.4 | 62.9 | 7 / 35 | 3520 |
| 8 | 3 | 61.0 | 67.6 | 5 / 35 | 3728 |
| 9 | 2 | 61.1 | 71.1 | 5 / 35 | 3545 |
| 10 | 2 | 60.7 | 66.7 | 8 / 35 | 3833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 48 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 17% |
| labg.Cataclysm 2.05 | 22 | 68% |
| gre.svman4.Leonidas 1.3.2 | 14 | 36% |
| baal.nano.N 1.42 | 3 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 33% |
| sanja.First 0.1 | 1 | 0% |

Hadur died in 294 of 350 rounds, at a mean tick of 1070. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 108 | 37% | 131 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 79 | 27% | 90 |
| gre.svman4.Leonidas 1.3.2 | 41 | 14% | 46 |
| kinsen.melee.Angsaichmophobia 1.8c | 25 | 9% | 25 |
| labg.Cataclysm 2.05 | 20 | 7% | 35 |
| baal.nano.N 1.42 | 10 | 3% | 12 |
| zyx.micro.Ant 1.1 | 5 | 2% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 1% | 3 |
| sanja.First 0.1 | 3 | 1% | 3 |

## Melee bench: F34

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 70.5 | 44 / 350 | 3.65 | 13.5% | 35679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.4 | 17.5% | 137 |
| kid.Gladiator .7.2 | 1.6 | 17.4% | 112 |
| hadur117.nano.SanaroCL 0.1 | 3.1 | 13.5% | 44 |
| jcs.Seth 1.8 | 4.5 | 11.2% | 29 |
| tcf.Reach 3 | 4.7 | 11.0% | 16 |
| cli.Dancer 1.1 | 5.7 | 10.1% | 8 |
| ratosh.Wesco 1.4 | 7.0 | 7.9% | 5 |
| amk.Punbot.Punbot 0.01 | 8.1 | 5.4% | 0 |
| sample.VelociRobot 1.0 | 8.9 | 3.4% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 74.3 | 7 / 35 | 3675 |
| 2 | 3 | 63.1 | 74.9 | 6 / 35 | 3682 |
| 3 | 3 | 60.8 | 69.8 | 3 / 35 | 3437 |
| 4 | 4 | 58.5 | 63.5 | 4 / 35 | 3203 |
| 5 | 3 | 60.8 | 70.5 | 2 / 35 | 3614 |
| 6 | 3 | 59.8 | 66.7 | 3 / 35 | 3654 |
| 7 | 3 | 62.5 | 73.3 | 5 / 35 | 3782 |
| 8 | 3 | 60.3 | 65.1 | 3 / 35 | 3838 |
| 9 | 3 | 61.6 | 71.7 | 6 / 35 | 3348 |
| 10 | 3 | 62.8 | 75.6 | 5 / 35 | 3446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 53 | 42% |
| kid.Gladiator .7.2 | 42 | 17% |
| jcs.Seth 1.8 | 12 | 50% |
| tcf.Reach 3 | 9 | 22% |
| cli.Dancer 1.1 | 5 | 60% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 129 | 42% | 131 |
| stelo.Spread 0.9 | 105 | 34% | 129 |
| jcs.Seth 1.8 | 19 | 6% | 28 |
| tcf.Reach 3 | 18 | 6% | 22 |
| cli.Dancer 1.1 | 16 | 5% | 19 |
| ratosh.Wesco 1.4 | 14 | 5% | 16 |
| amk.Punbot.Punbot 0.01 | 4 | 1% | 4 |
| sample.RamFire 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 69.1 | 16 / 350 | 3.78 | 12.4% | 27014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.3% | 268 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.1% | 37 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.5 | 12.6% | 19 |
| rz.HawkOnFire 0.1 | 3.8 | 12.2% | 3 |
| hadur117.nano.SanaroCL 0.1 | 3.9 | 12.4% | 16 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 7.2% | 2 |
| wit.Chuliath 1.0 | 6.6 | 7.1% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.1 | 5.8% | 1 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.2 | 64.8 | 2 / 35 | 2458 |
| 2 | 2 | 60.1 | 74.0 | 2 / 35 | 2746 |
| 3 | 4 | 58.6 | 68.6 | 0 / 35 | 2813 |
| 4 | 2 | 60.7 | 75.6 | 2 / 35 | 2842 |
| 5 | 5 | 57.3 | 64.8 | 3 / 35 | 2720 |
| 6 | 2 | 61.1 | 76.8 | 1 / 35 | 2875 |
| 7 | 5 | 58.5 | 68.6 | 1 / 35 | 2700 |
| 8 | 4 | 56.6 | 64.8 | 0 / 35 | 2484 |
| 9 | 5 | 57.3 | 64.8 | 1 / 35 | 2716 |
| 10 | 5 | 58.8 | 68.6 | 4 / 35 | 2660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 84 | 1% |
| gh.mini.Gruwel 0.9 | 21 | 38% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 43% |
| rz.HawkOnFire 0.1 | 6 | 67% |
| wit.Chuliath 1.0 | 2 | 0% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 0% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 334 of 350 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 153 | 46% | 154 |
| gh.mini.Gruwel 0.9 | 55 | 16% | 63 |
| dmh.robocode.robot.BlackDeath 9.2 | 49 | 15% | 52 |
| rz.HawkOnFire 0.1 | 41 | 12% | 45 |
| wit.Chuliath 1.0 | 12 | 4% | 12 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 11 | 3% | 11 |
| myl.nano.KomoriNinja 1.1 | 7 | 2% | 7 |
| stelo.MyAgileRobot 0.2 | 4 | 1% | 4 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 69.7 | 112 / 350 | 3.73 | 14.3% | 35879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL 0.1 | 1.3 | 14.3% | 112 |
| bzdp.Pansy 2.1 | 2.4 | 13.1% | 67 |
| alpha.RainingFire 1.0 | 2.8 | 12.8% | 58 |
| mz.Cork 0.1 | 3.9 | 11.9% | 37 |
| bvh.micro.Freya 0.3 | 5.1 | 10.8% | 28 |
| m3thos.Eva02 0.7.1 | 5.9 | 10.1% | 23 |
| bvh.mini.Fenrir 0.39 | 6.7 | 9.4% | 7 |
| dl.BetterWalls 1.0 | 8.1 | 7.0% | 10 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 6.5% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 70.8 | 11 / 35 | 3580 |
| 2 | 1 | 61.0 | 71.1 | 10 / 35 | 3659 |
| 3 | 1 | 61.6 | 71.7 | 13 / 35 | 3421 |
| 4 | 1 | 61.4 | 72.1 | 13 / 35 | 3319 |
| 5 | 1 | 61.9 | 72.1 | 13 / 35 | 3464 |
| 6 | 2 | 61.3 | 70.5 | 8 / 35 | 3861 |
| 7 | 2 | 59.5 | 65.7 | 9 / 35 | 3368 |
| 8 | 2 | 59.6 | 64.8 | 10 / 35 | 3780 |
| 9 | 1 | 60.7 | 68.9 | 12 / 35 | 3443 |
| 10 | 1 | 61.9 | 69.5 | 13 / 35 | 3984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 50% |
| bvh.micro.Freya 0.3 | 28 | 82% |
| mz.Cork 0.1 | 27 | 85% |
| alpha.RainingFire 1.0 | 24 | 63% |
| m3thos.Eva02 0.7.1 | 13 | 77% |
| bvh.mini.Fenrir 0.39 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 57% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 239 of 350 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 59 | 25% | 86 |
| alpha.RainingFire 1.0 | 51 | 21% | 67 |
| bvh.mini.Fenrir 0.39 | 31 | 13% | 36 |
| bvh.micro.Freya 0.3 | 29 | 12% | 43 |
| m3thos.Eva02 0.7.1 | 28 | 12% | 44 |
| mz.Cork 0.1 | 16 | 7% | 41 |
| squidM.TentalceMeleeNano 1.1 | 14 | 6% | 16 |
| dl.BetterWalls 1.0 | 6 | 3% | 8 |
| sample.MyFirstRobot 1.0 | 5 | 2% | 9 |

## Melee bench: F37

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 77.8 | 130 / 350 | 2.99 | 15.4% | 43099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL 0.1 | 1.0 | 15.4% | 130 |
| germ.TheMind .2 | 2.7 | 11.7% | 48 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.9 | 11.7% | 32 |
| EBBU.Sim2 1.02 | 4.6 | 10.4% | 26 |
| agrach.Dalek 1.0 | 5.0 | 9.8% | 35 |
| stelo.UntouchableNano 1.3 | 6.5 | 9.0% | 21 |
| lmk.ACPFinal 0.1 | 6.7 | 8.7% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 7.9 | 7.9% | 0 |
| mb.Beast 0.1 | 8.5 | 7.9% | 21 |
| skm.Ryubot 1.0 | 9.2 | 7.5% | 19 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.3 | 71.7 | 12 / 35 | 4132 |
| 2 | 1 | 63.3 | 79.7 | 14 / 35 | 4380 |
| 3 | 1 | 62.9 | 80.6 | 12 / 35 | 4238 |
| 4 | 1 | 61.2 | 74.6 | 13 / 35 | 4056 |
| 5 | 1 | 63.7 | 82.9 | 15 / 35 | 4180 |
| 6 | 1 | 61.9 | 77.1 | 12 / 35 | 4177 |
| 7 | 1 | 61.4 | 74.0 | 11 / 35 | 4430 |
| 8 | 1 | 63.2 | 78.4 | 10 / 35 | 4800 |
| 9 | 1 | 61.0 | 73.3 | 13 / 35 | 4124 |
| 10 | 1 | 65.5 | 86.0 | 18 / 35 | 4582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 39 | 59% |
| EBBU.Sim2 1.02 | 32 | 56% |
| stelo.UntouchableNano 1.3 | 30 | 90% |
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 52% |
| agrach.Dalek 1.0 | 27 | 63% |
| mb.Beast 0.1 | 22 | 55% |
| skm.Ryubot 1.0 | 14 | 71% |
| lmk.ACPFinal 0.1 | 10 | 80% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 224 of 350 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 44 | 20% | 72 |
| com.syncleus.robocode.Dreadnaught 0.1 | 37 | 17% | 57 |
| EBBU.Sim2 1.02 | 37 | 17% | 51 |
| agrach.Dalek 1.0 | 24 | 11% | 50 |
| mn.nano.perceptual.Impact 1.3.0 | 24 | 11% | 24 |
| lmk.ACPFinal 0.1 | 21 | 9% | 28 |
| mb.Beast 0.1 | 20 | 9% | 29 |
| stelo.UntouchableNano 1.3 | 9 | 4% | 25 |
| skm.Ryubot 1.0 | 8 | 4% | 13 |

## Melee bench: F38

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 60.6 | 41 / 350 | 4.55 | 11.5% | 28686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.0% | 159 |
| bvh.mini.Freya 0.55 | 2.2 | 13.5% | 43 |
| cs.Wren 1.0 | 4.1 | 11.8% | 29 |
| hadur117.nano.SanaroCL 0.1 | 4.3 | 11.5% | 41 |
| bts.mega.Gnarly 1.4 | 4.6 | 11.6% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 11.1% | 24 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.4% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.0% | 6 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.6 | 56.2 | 4 / 35 | 2833 |
| 2 | 5 | 55.6 | 59.0 | 2 / 35 | 2804 |
| 3 | 4 | 56.4 | 62.2 | 2 / 35 | 3110 |
| 4 | 3 | 58.3 | 65.7 | 7 / 35 | 3025 |
| 5 | 7 | 51.3 | 48.9 | 4 / 35 | 2565 |
| 6 | 3 | 58.1 | 64.4 | 5 / 35 | 3007 |
| 7 | 5 | 54.6 | 58.4 | 3 / 35 | 2674 |
| 8 | 3 | 58.1 | 65.7 | 6 / 35 | 2870 |
| 9 | 5 | 55.5 | 59.4 | 2 / 35 | 2740 |
| 10 | 4 | 58.5 | 65.7 | 6 / 35 | 3058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 41 | 51% |
| bvh.mini.Freya 0.55 | 13 | 54% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 9% |
| cs.Wren 1.0 | 10 | 50% |
| bts.mega.Gnarly 1.4 | 10 | 50% |
| kdf.KoulDestroyer 1.0 | 2 | 50% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 310 of 350 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 81 | 26% | 105 |
| bvh.mini.Freya 0.55 | 64 | 21% | 68 |
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 14% | 45 |
| kdf.KoulDestroyer 1.0 | 42 | 14% | 43 |
| bts.mega.Gnarly 1.4 | 36 | 12% | 42 |
| cs.Wren 1.0 | 34 | 11% | 36 |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 2% | 6 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 1 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 64.7 | 41 / 350 | 4.18 | 12.1% | 30397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.8% | 75 |
| az.Ololobot 0.2.4 | 2.4 | 13.4% | 116 |
| hadur117.nano.SanaroCL 0.1 | 3.2 | 12.1% | 41 |
| catcat20.Lambda 0.024 | 3.3 | 11.6% | 60 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.1% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 5.9 | 9.5% | 33 |
| gimp.GimpBot 0.1 | 6.9 | 8.4% | 4 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 8.2% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 6.7% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.5 | 63.5 | 3 / 35 | 3028 |
| 2 | 3 | 56.7 | 62.2 | 5 / 35 | 3282 |
| 3 | 2 | 59.0 | 73.7 | 6 / 35 | 2765 |
| 4 | 3 | 55.8 | 64.1 | 4 / 35 | 2821 |
| 5 | 3 | 57.2 | 64.4 | 4 / 35 | 3383 |
| 6 | 4 | 55.7 | 63.2 | 2 / 35 | 3041 |
| 7 | 3 | 55.4 | 59.7 | 5 / 35 | 3193 |
| 8 | 4 | 55.3 | 63.5 | 3 / 35 | 2701 |
| 9 | 3 | 56.6 | 66.0 | 3 / 35 | 2991 |
| 10 | 3 | 57.9 | 66.7 | 6 / 35 | 3192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 43 | 19% |
| bvh.fry.Freya 0.82 | 33 | 36% |
| catcat20.Lambda 0.024 | 24 | 29% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 36% |
| winamp32.micro.MicroMacro 1.0 | 6 | 50% |
| gimp.GimpBot 0.1 | 4 | 75% |
| apollokidd.ApolloKidd 0.9 | 4 | 25% |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 67% |

Hadur died in 310 of 350 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 108 | 35% | 119 |
| az.Ololobot 0.2.4 | 54 | 17% | 65 |
| catcat20.Lambda 0.024 | 46 | 15% | 52 |
| stelo.SoRobotNanoMelee 1.2 | 34 | 11% | 34 |
| apollokidd.ApolloKidd 0.9 | 24 | 8% | 26 |
| winamp32.micro.MicroMacro 1.0 | 17 | 5% | 19 |
| gimp.GimpBot 0.1 | 16 | 5% | 23 |
| dcs.Eater_of_Worlds 1.1.3-A | 6 | 2% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 5 | 2% | 7 |

## Melee bench: F41

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 69.2 | 90 / 350 | 3.77 | 13.5% | 32068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.9% | 158 |
| ary.Swarm 1.1 | 3.0 | 13.3% | 28 |
| hadur117.nano.SanaroCL 0.1 | 3.0 | 13.5% | 90 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 13.0% | 36 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 12.1% | 33 |
| shrub.Silver v048 | 6.1 | 9.2% | 6 |
| zyx.nano.Ant 1.1 | 6.9 | 7.7% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.0% | 0 |
| stelo.Mirror 1.1 | 8.7 | 5.5% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 69.8 | 9 / 35 | 3286 |
| 2 | 2 | 60.1 | 67.9 | 8 / 35 | 3067 |
| 3 | 2 | 63.9 | 75.6 | 11 / 35 | 3801 |
| 4 | 2 | 60.9 | 70.2 | 10 / 35 | 3136 |
| 5 | 4 | 59.1 | 67.3 | 8 / 35 | 2718 |
| 6 | 2 | 63.8 | 78.4 | 14 / 35 | 3210 |
| 7 | 3 | 59.5 | 66.7 | 8 / 35 | 3081 |
| 8 | 3 | 61.8 | 73.0 | 8 / 35 | 3167 |
| 9 | 4 | 58.8 | 63.8 | 9 / 35 | 3444 |
| 10 | 5 | 56.7 | 59.4 | 5 / 35 | 3158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 74 | 47% |
| ary.Swarm 1.1 | 24 | 75% |
| simonton.nano.MeleeSeed 1.8 | 22 | 77% |
| lessonz.robocode.Oz 0.5.0 | 15 | 87% |
| shrub.Silver v048 | 4 | 50% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 264 of 350 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 63 | 24% | 96 |
| ary.Swarm 1.1 | 60 | 23% | 79 |
| simonton.nano.MeleeSeed 1.8 | 45 | 17% | 67 |
| lessonz.robocode.Oz 0.5.0 | 45 | 17% | 54 |
| shrub.Silver v048 | 18 | 7% | 20 |
| zyx.nano.Ant 1.1 | 15 | 6% | 16 |
| stelo.Mirror 1.1 | 7 | 3% | 7 |
| jsal.Jsalbot 1.0 | 6 | 2% | 7 |
| acogdev.alpha 0.2 | 3 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 71.4 | 62 / 350 | 3.57 | 13.6% | 35240 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.8% | 183 |
| maribo.mini.MiniQuester 0.1 | 2.6 | 14.1% | 30 |
| hadur117.nano.SanaroCL 0.1 | 3.1 | 13.6% | 62 |
| ara.Shera 0.88 | 3.3 | 13.8% | 58 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 8 |
| maribo.IotaCT 1.1 | 6.4 | 7.6% | 3 |
| dsw.StaticD 1.0 | 6.7 | 7.4% | 6 |
| stelo.MirrorMicro 1.0 | 8.4 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 75.2 | 9 / 35 | 3899 |
| 2 | 2 | 62.9 | 79.7 | 9 / 35 | 3393 |
| 3 | 3 | 60.2 | 71.4 | 4 / 35 | 3367 |
| 4 | 4 | 59.0 | 65.7 | 5 / 35 | 3684 |
| 5 | 4 | 57.4 | 63.2 | 4 / 35 | 3162 |
| 6 | 4 | 60.2 | 72.1 | 4 / 35 | 3313 |
| 7 | 4 | 58.9 | 67.9 | 5 / 35 | 3290 |
| 8 | 3 | 59.7 | 67.6 | 8 / 35 | 3511 |
| 9 | 3 | 61.1 | 71.7 | 6 / 35 | 3727 |
| 10 | 2 | 63.9 | 79.4 | 8 / 35 | 3894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 80 | 38% |
| ara.Shera 0.88 | 27 | 56% |
| maribo.mini.MiniQuester 0.1 | 20 | 70% |
| amz.NanoClone 1.41 | 3 | 67% |
| dsw.StaticD 1.0 | 3 | 33% |

Hadur died in 289 of 350 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 109 | 38% | 140 |
| ara.Shera 0.88 | 74 | 26% | 88 |
| maribo.mini.MiniQuester 0.1 | 56 | 19% | 70 |
| amz.NanoClone 1.41 | 27 | 9% | 28 |
| dsw.StaticD 1.0 | 7 | 2% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 6 | 2% | 6 |
| stelo.MirrorMicro 1.0 | 5 | 2% | 5 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 3 |
| maribo.IotaCT 1.1 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 64.4 | 23 / 350 | 4.21 | 12.1% | 30250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.2% | 253 |
| brainfade.melee.Dusk 0.44 | 2.4 | 13.3% | 38 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.6% | 22 |
| hadur117.nano.SanaroCL 0.1 | 3.7 | 12.1% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.2% | 5 |
| Krabb.akim2.Akim2 1.1b | 6.1 | 9.8% | 8 |
| jab.DiamondStealer 5 | 7.3 | 7.3% | 0 |
| mz.NanoGod 2.02 | 7.6 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.6% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.5 | 61.6 | 2 / 35 | 2967 |
| 2 | 5 | 55.9 | 56.2 | 2 / 35 | 2722 |
| 3 | 3 | 60.3 | 66.0 | 3 / 35 | 3218 |
| 4 | 4 | 57.5 | 61.3 | 1 / 35 | 2787 |
| 5 | 5 | 60.0 | 66.0 | 4 / 35 | 3089 |
| 6 | 4 | 58.7 | 63.2 | 1 / 35 | 3016 |
| 7 | 3 | 60.2 | 65.7 | 4 / 35 | 3185 |
| 8 | 2 | 61.5 | 70.8 | 1 / 35 | 3423 |
| 9 | 3 | 61.5 | 70.2 | 4 / 35 | 3200 |
| 10 | 4 | 57.3 | 62.9 | 1 / 35 | 2643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 67 | 16% |
| dummy.micro.Sparrow 2.5 | 14 | 29% |
| brainfade.melee.Dusk 0.44 | 10 | 50% |
| Krabb.akim2.Akim2 1.1b | 3 | 0% |
| mz.NanoGod 2.02 | 2 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 0% |
| cvt.Firsty 1.0 | 1 | 0% |

Hadur died in 327 of 350 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 153 | 47% | 163 |
| dummy.micro.Sparrow 2.5 | 47 | 14% | 51 |
| brainfade.melee.Dusk 0.44 | 44 | 13% | 50 |
| wcsv.melee.EngineerMelee 0.1 | 43 | 13% | 43 |
| Krabb.akim2.Akim2 1.1b | 15 | 5% | 15 |
| jab.DiamondStealer 5 | 12 | 4% | 13 |
| mz.NanoGod 2.02 | 11 | 3% | 12 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 70.5 | 71 / 350 | 3.65 | 14.0% | 36775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 16.9% | 140 |
| tzu.TheArtOfWar 1.2 | 2.0 | 15.3% | 86 |
| hadur117.nano.SanaroCL 0.1 | 2.8 | 14.0% | 71 |
| jwirde.Gort 2.0 | 4.4 | 10.7% | 23 |
| wompi.Quokka 1.6 | 4.7 | 10.9% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 8.5% | 5 |
| disan.Chair 2.2.0 | 7.5 | 7.0% | 5 |
| stf.PanzerGeneral 0.1 | 7.6 | 7.1% | 5 |
| sample.Crazy 1.0 | 9.2 | 4.9% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 70.8 | 10 / 35 | 3493 |
| 2 | 3 | 61.4 | 71.7 | 7 / 35 | 3398 |
| 3 | 3 | 60.6 | 68.3 | 7 / 35 | 3763 |
| 4 | 2 | 63.4 | 75.6 | 9 / 35 | 4192 |
| 5 | 3 | 60.5 | 68.3 | 5 / 35 | 3735 |
| 6 | 3 | 62.7 | 76.5 | 6 / 35 | 3506 |
| 7 | 2 | 59.5 | 67.0 | 6 / 35 | 3531 |
| 8 | 3 | 62.9 | 73.7 | 8 / 35 | 3981 |
| 9 | 3 | 58.7 | 63.8 | 5 / 35 | 3528 |
| 10 | 3 | 61.3 | 69.8 | 8 / 35 | 3648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 81 | 49% |
| tzu.TheArtOfWar 1.2 | 39 | 31% |
| jwirde.Gort 2.0 | 11 | 64% |
| wompi.Quokka 1.6 | 11 | 82% |
| disan.Chair 2.2.0 | 4 | 50% |
| stf.PanzerGeneral 0.1 | 2 | 0% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 279 of 350 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 98 | 35% | 139 |
| tzu.TheArtOfWar 1.2 | 83 | 30% | 98 |
| wompi.Quokka 1.6 | 37 | 13% | 40 |
| jwirde.Gort 2.0 | 26 | 9% | 34 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 4% | 12 |
| stf.PanzerGeneral 0.1 | 9 | 3% | 9 |
| disan.Chair 2.2.0 | 7 | 3% | 8 |
| amk.jointstrike.JointStrike 0.2 | 4 | 1% | 5 |
| sample.Crazy 1.0 | 4 | 1% | 5 |

## Melee bench: F45

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 70.5 | 69 / 350 | 3.65 | 14.5% | 38992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroCL 0.1 | 1.0 | 14.5% | 69 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 12.8% | 172 |
| jje.BagPuss 1.2 | 2.9 | 12.7% | 26 |
| sul.Lunar 1.1 | 4.0 | 11.7% | 45 |
| myl.nano.Graviton 1.10 | 4.7 | 10.4% | 8 |
| fm.claire 1.7 | 6.8 | 9.0% | 4 |
| hvilela.HVilela 0.9 | 7.0 | 8.5% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 8.1% | 4 |
| wit.Deep7 2.0 | 8.6 | 7.0% | 17 |
| abud.ThirdRobo 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 58.5 | 64.8 | 4 / 35 | 3718 |
| 2 | 1 | 59.3 | 66.7 | 5 / 35 | 3613 |
| 3 | 1 | 61.4 | 70.8 | 4 / 35 | 4044 |
| 4 | 1 | 62.2 | 72.4 | 10 / 35 | 3948 |
| 5 | 1 | 59.2 | 67.3 | 4 / 35 | 3789 |
| 6 | 1 | 59.8 | 66.0 | 7 / 35 | 3677 |
| 7 | 1 | 60.6 | 68.6 | 5 / 35 | 3839 |
| 8 | 1 | 63.3 | 74.6 | 8 / 35 | 4391 |
| 9 | 1 | 65.1 | 81.9 | 12 / 35 | 4149 |
| 10 | 1 | 61.9 | 72.1 | 10 / 35 | 3824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 88 | 44% |
| sul.Lunar 1.1 | 27 | 30% |
| wit.Deep7 2.0 | 12 | 58% |
| jje.BagPuss 1.2 | 12 | 33% |
| myl.nano.Graviton 1.10 | 8 | 63% |
| fm.claire 1.7 | 4 | 25% |
| hvilela.HVilela 0.9 | 4 | 50% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 75% |

Hadur died in 281 of 350 rounds, at a mean tick of 1224. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 59 | 21% | 92 |
| eem.IWillFireNoBullet v2.8 | 59 | 21% | 0 |
| sul.Lunar 1.1 | 51 | 18% | 88 |
| myl.nano.Graviton 1.10 | 37 | 13% | 53 |
| hvilela.HVilela 0.9 | 27 | 10% | 35 |
| fm.claire 1.7 | 20 | 7% | 27 |
| wit.Deep7 2.0 | 17 | 6% | 27 |
| pez.mini.ChironexFleckeri 0.5 | 10 | 4% | 21 |
| abud.ThirdRobo 1.0 | 1 | 0% | 6 |

## Melee bench: F46

hadur117.nano.SanaroCL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 69.6 | 33 / 350 | 3.74 | 12.6% | 29001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.1 | 18.2% | 154 |
| rsalesc.melee.Medina 0.4.5 | 1.9 | 16.8% | 129 |
| hadur117.nano.SanaroCL 0.1 | 3.3 | 12.6% | 33 |
| cx.Princess 1.0 | 4.4 | 10.8% | 24 |
| mz.MicroSheep 1.0 | 4.5 | 10.7% | 8 |
| sadoner.killer 0.2 | 6.1 | 8.8% | 1 |
| arthord.NanoSatanMelee Beta | 6.7 | 7.6% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.0% | 0 |
| kurios.DOSexe .9a | 9.3 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 70.8 | 1 / 35 | 3245 |
| 2 | 3 | 62.0 | 78.7 | 5 / 35 | 3069 |
| 3 | 3 | 59.1 | 70.8 | 5 / 35 | 2711 |
| 4 | 3 | 57.3 | 66.3 | 1 / 35 | 2788 |
| 5 | 3 | 58.6 | 69.2 | 7 / 35 | 2731 |
| 6 | 3 | 59.6 | 72.7 | 2 / 35 | 2836 |
| 7 | 3 | 60.2 | 70.5 | 4 / 35 | 3145 |
| 8 | 3 | 60.8 | 74.6 | 5 / 35 | 2926 |
| 9 | 4 | 57.0 | 62.5 | 1 / 35 | 2803 |
| 10 | 5 | 55.4 | 59.7 | 2 / 35 | 2747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 80 | 30% |
| rsalesc.melee.Medina 0.4.5 | 38 | 13% |
| cx.Princess 1.0 | 9 | 33% |
| mz.MicroSheep 1.0 | 3 | 0% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| sadoner.killer 0.2 | 1 | 0% |

Hadur died in 318 of 350 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 140 | 44% | 165 |
| rsalesc.melee.Medina 0.4.5 | 80 | 25% | 84 |
| cx.Princess 1.0 | 29 | 9% | 32 |
| mz.MicroSheep 1.0 | 29 | 9% | 30 |
| arthord.NanoSatanMelee Beta | 17 | 5% | 17 |
| sadoner.killer 0.2 | 15 | 5% | 15 |
| jeremyreeder.collective.Prophet 5 | 4 | 1% | 4 |
| kurios.DOSexe .9a | 3 | 1% | 3 |
1 death(s) with no robot to name.

