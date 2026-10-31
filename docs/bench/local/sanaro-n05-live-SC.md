# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 78.4 | 69 / 350 | 2.94 | 14.8% | 37938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 233 |
| hadur117.nano.SanaroSC 0.2 | 2.0 | 14.8% | 69 |
| mz.MicroGodMelee 1 | 4.0 | 11.4% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.4 | 11.0% | 5 |
| sgp.JollyNinja 3.53 | 4.5 | 10.9% | 27 |
| lorneswork.Predator 1.0 | 5.2 | 10.4% | 7 |
| adt.Ar2 1.0 | 6.9 | 7.5% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.8% | 1 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 9.9 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 76.5 | 8 / 35 | 3726 |
| 2 | 2 | 61.4 | 70.5 | 8 / 35 | 3858 |
| 3 | 2 | 63.7 | 81.3 | 7 / 35 | 3764 |
| 4 | 2 | 63.4 | 79.0 | 9 / 35 | 3854 |
| 5 | 2 | 65.0 | 82.2 | 8 / 35 | 4084 |
| 6 | 2 | 61.4 | 75.6 | 5 / 35 | 3389 |
| 7 | 2 | 64.6 | 82.2 | 5 / 35 | 3917 |
| 8 | 2 | 64.3 | 82.2 | 7 / 35 | 3834 |
| 9 | 2 | 61.4 | 72.4 | 5 / 35 | 3765 |
| 10 | 2 | 64.4 | 82.5 | 7 / 35 | 3747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 157 | 16% |
| mz.MicroGodMelee 1 | 23 | 87% |
| sgp.JollyNinja 3.53 | 18 | 56% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 100% |
| lorneswork.Predator 1.0 | 6 | 67% |
| adt.Ar2 1.0 | 3 | 67% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 282 of 350 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 160 | 57% | 190 |
| sgp.JollyNinja 3.53 | 31 | 11% | 39 |
| mz.MicroGodMelee 1 | 30 | 11% | 51 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 9% | 32 |
| lorneswork.Predator 1.0 | 19 | 7% | 23 |
| adt.Ar2 1.0 | 9 | 3% | 10 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 2% | 4 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 66.2 | 61 / 350 | 4.04 | 13.5% | 38388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.8 | 14.5% | 77 |
| pulsar.PulsarMax 0.8.9 | 1.8 | 14.8% | 101 |
| hadur117.nano.SanaroSC 0.2 | 2.5 | 13.5% | 61 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 10.9% | 6 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.0% | 29 |
| Noran.BitchingElk 0.054 | 6.9 | 8.4% | 32 |
| sch.Simone 0.3d | 6.9 | 8.5% | 24 |
| fnc.bandit.Bandit 5.2.0 | 7.4 | 7.9% | 6 |
| stelo.PatternRobot 1.0 | 8.7 | 6.8% | 11 |
| fullsail.SweetTea 1.1 | 9.9 | 4.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 69.2 | 3 / 35 | 4341 |
| 2 | 3 | 57.9 | 64.1 | 4 / 35 | 3494 |
| 3 | 3 | 58.7 | 61.9 | 8 / 35 | 3846 |
| 4 | 3 | 58.1 | 61.0 | 7 / 35 | 3633 |
| 5 | 4 | 55.6 | 58.1 | 5 / 35 | 3487 |
| 6 | 1 | 63.1 | 74.0 | 10 / 35 | 4342 |
| 7 | 2 | 60.6 | 68.6 | 7 / 35 | 4077 |
| 8 | 2 | 60.9 | 71.7 | 6 / 35 | 3888 |
| 9 | 3 | 56.2 | 60.0 | 4 / 35 | 3319 |
| 10 | 2 | 62.3 | 73.7 | 7 / 35 | 3961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 37% |
| pulsar.PulsarMax 0.8.9 | 37 | 35% |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 56% |
| sch.Simone 0.3d | 12 | 33% |
| Noran.BitchingElk 0.054 | 11 | 36% |
| stelo.PatternRobot 1.0 | 9 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 33% |
| fullsail.SweetTea 1.1 | 2 | 50% |

Hadur died in 290 of 350 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 77 | 27% | 89 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 60 | 21% | 76 |
| lrem.micro.SpikeSoldier 0.4 | 32 | 11% | 36 |
| sch.Simone 0.3d | 30 | 10% | 35 |
| com.cohesiva.robocode.ManOwaR 1.0 | 27 | 9% | 37 |
| stelo.PatternRobot 1.0 | 23 | 8% | 27 |
| fnc.bandit.Bandit 5.2.0 | 16 | 6% | 18 |
| Noran.BitchingElk 0.054 | 14 | 5% | 19 |
| fullsail.SweetTea 1.1 | 10 | 3% | 13 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 78.8 | 67 / 350 | 2.91 | 14.8% | 39543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.6 | 15.4% | 102 |
| kawigi.nano.Lib 1.0 | 2.0 | 15.2% | 103 |
| hadur117.nano.SanaroSC 0.2 | 2.6 | 14.8% | 67 |
| vuen.Cake 2.51 | 3.8 | 13.0% | 57 |
| urdos.URDOS 1.3 | 5.0 | 10.6% | 18 |
| ghent.ArthurPanzergon 1.0.0 | 6.7 | 7.2% | 2 |
| adt.Ar1 2.1 | 6.8 | 7.2% | 1 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 77.8 | 4 / 35 | 3808 |
| 2 | 2 | 63.3 | 80.6 | 10 / 35 | 3956 |
| 3 | 4 | 60.8 | 71.7 | 4 / 35 | 4200 |
| 4 | 2 | 63.9 | 82.5 | 8 / 35 | 4066 |
| 5 | 3 | 63.2 | 81.0 | 8 / 35 | 3644 |
| 6 | 3 | 61.7 | 73.0 | 7 / 35 | 4246 |
| 7 | 3 | 63.0 | 80.6 | 6 / 35 | 3934 |
| 8 | 2 | 63.3 | 83.2 | 7 / 35 | 3922 |
| 9 | 3 | 62.0 | 76.8 | 6 / 35 | 3773 |
| 10 | 2 | 63.4 | 81.0 | 7 / 35 | 3994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 69 | 43% |
| kawigi.nano.Lib 1.0 | 55 | 7% |
| vuen.Cake 2.51 | 53 | 45% |
| urdos.URDOS 1.3 | 12 | 42% |
| adt.Ar1 2.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 0% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 96 | 34% | 102 |
| radnor.DoctorBob 1.42 | 80 | 28% | 109 |
| vuen.Cake 2.51 | 44 | 15% | 67 |
| urdos.URDOS 1.3 | 43 | 15% | 50 |
| adt.Ar1 2.1 | 7 | 2% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 6 | 2% | 6 |
| oa.weak.FlyMk1 0.1 | 5 | 2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 1% | 1 |

## Melee bench: F04

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 71.7 | 8 / 350 | 3.55 | 13.7% | 41235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 319 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 13.8% | 15 |
| hadur117.nano.SanaroSC 0.2 | 2.5 | 13.7% | 8 |
| TNT.TNT 0.99.1 | 4.1 | 10.8% | 5 |
| josago.Jorgito 0.16 | 4.9 | 9.4% | 3 |
| css.Delitioner 0.11 | 6.4 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 6.9 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 70.2 | 1 / 35 | 3667 |
| 2 | 2 | 60.9 | 67.9 | 0 / 35 | 4384 |
| 3 | 3 | 62.1 | 74.0 | 1 / 35 | 3808 |
| 4 | 3 | 59.7 | 64.1 | 1 / 35 | 4014 |
| 5 | 3 | 61.7 | 70.5 | 0 / 35 | 4211 |
| 6 | 2 | 62.4 | 73.7 | 2 / 35 | 4098 |
| 7 | 2 | 61.8 | 71.1 | 0 / 35 | 4097 |
| 8 | 2 | 64.3 | 79.0 | 1 / 35 | 4317 |
| 9 | 2 | 63.9 | 76.2 | 2 / 35 | 4431 |
| 10 | 3 | 61.9 | 70.2 | 0 / 35 | 4208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 146 | 2% |
| apc.LeeroyJenkins2 1.0 | 7 | 43% |
| TNT.TNT 0.99.1 | 5 | 40% |
| josago.Jorgito 0.16 | 2 | 0% |

Hadur died in 342 of 350 rounds, at a mean tick of 1114. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 233 | 68% | 236 |
| apc.LeeroyJenkins2 1.0 | 47 | 14% | 50 |
| josago.Jorgito 0.16 | 24 | 7% | 24 |
| TNT.TNT 0.99.1 | 13 | 4% | 15 |
| css.Delitioner 0.11 | 9 | 3% | 9 |
| tj.zombie1n 1.0.1 | 8 | 2% | 8 |
| rampancy.Durandal 2.1d | 6 | 2% | 6 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 71.6 | 97 / 350 | 3.56 | 14.0% | 33791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.3 | 15.1% | 82 |
| hadur117.nano.SanaroSC 0.2 | 2.4 | 14.0% | 97 |
| origin.SleepSiphon 1.7b | 2.7 | 14.2% | 91 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 13.0% | 48 |
| mld.Wisdom 1.0 | 4.8 | 11.3% | 10 |
| gg.Wolverine 2.0 | 6.4 | 8.3% | 7 |
| DBall.NUKE 0.1 | 7.6 | 7.4% | 3 |
| spinnercat.Omen 1.0 | 7.9 | 7.0% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.6% | 11 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 68.6 | 7 / 35 | 3283 |
| 2 | 3 | 61.4 | 73.7 | 9 / 35 | 2978 |
| 3 | 1 | 60.8 | 70.5 | 11 / 35 | 3364 |
| 4 | 2 | 61.9 | 72.7 | 10 / 35 | 3656 |
| 5 | 2 | 62.1 | 74.6 | 10 / 35 | 3689 |
| 6 | 2 | 61.6 | 73.0 | 10 / 35 | 3478 |
| 7 | 3 | 60.8 | 71.4 | 12 / 35 | 2978 |
| 8 | 2 | 62.3 | 74.0 | 11 / 35 | 3452 |
| 9 | 3 | 60.6 | 67.3 | 9 / 35 | 3754 |
| 10 | 3 | 60.1 | 69.8 | 8 / 35 | 3159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 44 | 48% |
| jekl.StoneGhost 0.7 | 39 | 62% |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 84% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 90% |
| gg.Wolverine 2.0 | 10 | 80% |
| mld.Wisdom 1.0 | 8 | 63% |
| DBall.NUKE 0.1 | 5 | 80% |
| spinnercat.Omen 1.0 | 3 | 0% |

Hadur died in 255 of 350 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 81 | 32% | 94 |
| origin.SleepSiphon 1.7b | 60 | 24% | 87 |
| pe.minimelee.SandboxMiniMelee 1.1 | 40 | 16% | 69 |
| mld.Wisdom 1.0 | 36 | 14% | 42 |
| spinnercat.Omen 1.0 | 14 | 5% | 15 |
| DBall.NUKE 0.1 | 9 | 4% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 3% | 16 |
| gg.Wolverine 2.0 | 7 | 3% | 14 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.5 | 87 / 350 | 2.67 | 16.4% | 47849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.5 | 17.8% | 106 |
| rsalesc.melee.Monk 0.3.6c | 1.7 | 17.7% | 94 |
| hadur117.nano.SanaroSC 0.2 | 2.8 | 16.4% | 87 |
| franzor.Lizt 1.3.1 | 4.5 | 11.3% | 43 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.7% | 21 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.8% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.5 | 86.7 | 15 / 35 | 5449 |
| 2 | 3 | 67.0 | 82.9 | 8 / 35 | 4875 |
| 3 | 3 | 65.5 | 76.2 | 7 / 35 | 4689 |
| 4 | 3 | 66.7 | 82.5 | 5 / 35 | 4630 |
| 5 | 3 | 66.8 | 83.2 | 7 / 35 | 4529 |
| 6 | 3 | 66.5 | 76.5 | 9 / 35 | 5035 |
| 7 | 3 | 68.3 | 86.7 | 11 / 35 | 4906 |
| 8 | 2 | 65.2 | 78.1 | 6 / 35 | 4568 |
| 9 | 3 | 66.9 | 80.3 | 11 / 35 | 4822 |
| 10 | 3 | 66.1 | 81.9 | 8 / 35 | 4346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 97 | 54% |
| rsalesc.melee.Monk 0.3.6c | 48 | 10% |
| oog.melee.CapuletDroid 1.1 | 26 | 73% |
| franzor.Lizt 1.3.1 | 18 | 28% |
| exauge.GateKeeper 1.1.121g | 5 | 80% |
| skm.PateranBotlock2 1.0 | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 1373. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 131 | 50% | 199 |
| rsalesc.melee.Monk 0.3.6c | 80 | 30% | 95 |
| oog.melee.CapuletDroid 1.1 | 28 | 11% | 45 |
| franzor.Lizt 1.3.1 | 19 | 7% | 2 |
| exauge.GateKeeper 1.1.121g | 4 | 2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 10 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 69.7 | 99 / 350 | 3.73 | 13.8% | 33365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.8 | 14.4% | 87 |
| shrub.Vapour v159 | 2.0 | 13.9% | 81 |
| hadur117.nano.SanaroSC 0.2 | 2.4 | 13.8% | 99 |
| Krabb.sliNk.Garm 0.9u | 3.9 | 11.2% | 38 |
| com.spp.robocode.MostlyHarmless 010 | 5.4 | 9.5% | 16 |
| m3thos.Eva00 1.1 | 5.8 | 9.4% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 6.9 | 8.3% | 17 |
| zyx.nano.BacillusComma 1.0 | 8.6 | 6.6% | 1 |
| SHAM.WOW 1.4 | 8.8 | 6.6% | 1 |
| qualidafial.MajorDick 1.0.1 | 9.4 | 6.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.1 | 61.9 | 5 / 35 | 3063 |
| 2 | 4 | 56.3 | 61.6 | 8 / 35 | 3111 |
| 3 | 3 | 57.6 | 64.8 | 7 / 35 | 3119 |
| 4 | 2 | 61.9 | 74.6 | 12 / 35 | 3522 |
| 5 | 2 | 59.8 | 68.3 | 10 / 35 | 3364 |
| 6 | 1 | 62.9 | 75.2 | 16 / 35 | 3574 |
| 7 | 3 | 59.9 | 66.0 | 10 / 35 | 3619 |
| 8 | 3 | 60.0 | 72.1 | 8 / 35 | 3227 |
| 9 | 1 | 62.6 | 77.1 | 13 / 35 | 3513 |
| 10 | 2 | 61.5 | 75.6 | 10 / 35 | 3253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 53 | 64% |
| shrub.Vapour v159 | 34 | 41% |
| Krabb.sliNk.Garm 0.9u | 30 | 80% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 86% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 73% |
| m3thos.Eva00 1.1 | 5 | 40% |
| SHAM.WOW 1.4 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 0% |

Hadur died in 252 of 350 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 74 | 29% | 86 |
| tm.Yuugao 1.0 | 56 | 22% | 92 |
| Krabb.sliNk.Garm 0.9u | 25 | 10% | 38 |
| m3thos.Eva00 1.1 | 22 | 9% | 27 |
| com.spp.robocode.MostlyHarmless 010 | 19 | 8% | 27 |
| zyx.nano.BacillusComma 1.0 | 19 | 8% | 20 |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 7% | 33 |
| qualidafial.MajorDick 1.0.1 | 12 | 5% | 13 |
| SHAM.WOW 1.4 | 8 | 3% | 13 |

## Melee bench: F09

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 61.5 | 27 / 350 | 4.46 | 11.8% | 29246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.6% | 189 |
| kc.micro.Figment 1.0 | 1.9 | 15.5% | 77 |
| hadur117.nano.SanaroSC 0.2 | 3.3 | 11.8% | 27 |
| yagami.Tidus 0.11 | 4.3 | 11.1% | 5 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.8% | 30 |
| mc2.enemy.Original 0.9 | 5.8 | 9.6% | 19 |
| dft.Calliope 5.6 | 6.9 | 7.8% | 2 |
| step.nanoPri 1.0 | 8.6 | 5.7% | 1 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.0 | 60.6 | 3 / 35 | 2982 |
| 2 | 3 | 57.7 | 64.1 | 2 / 35 | 3126 |
| 3 | 4 | 58.1 | 63.2 | 4 / 35 | 3067 |
| 4 | 4 | 54.3 | 57.5 | 0 / 35 | 2822 |
| 5 | 3 | 57.5 | 64.1 | 3 / 35 | 3088 |
| 6 | 4 | 56.3 | 61.9 | 4 / 35 | 2703 |
| 7 | 3 | 56.9 | 62.2 | 3 / 35 | 2856 |
| 8 | 3 | 57.8 | 63.5 | 4 / 35 | 2843 |
| 9 | 3 | 55.9 | 59.4 | 3 / 35 | 2905 |
| 10 | 3 | 55.1 | 58.7 | 1 / 35 | 2854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 56 | 9% |
| kc.micro.Figment 1.0 | 27 | 33% |
| pedersen.Grishnakh 1.0 | 10 | 50% |
| mc2.enemy.Original 0.9 | 7 | 57% |
| yagami.Tidus 0.11 | 5 | 80% |

Hadur died in 323 of 350 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 101 | 31% | 106 |
| kc.micro.Figment 1.0 | 73 | 23% | 82 |
| yagami.Tidus 0.11 | 41 | 13% | 47 |
| mc2.enemy.Original 0.9 | 35 | 11% | 41 |
| pedersen.Grishnakh 1.0 | 30 | 9% | 31 |
| dft.Calliope 5.6 | 15 | 5% | 15 |
| robar.nano.Assertive_Melee 0.2 | 14 | 4% | 14 |
| rdm.Dueler 0.4x | 9 | 3% | 9 |
| step.nanoPri 1.0 | 5 | 2% | 5 |

## Melee bench: F10

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 81.0 | 115 / 350 | 2.71 | 15.5% | 37976 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroSC 0.2 | 1.6 | 15.5% | 115 |
| DTF.Kludgy 1.2b | 2.0 | 14.8% | 85 |
| ejb.Polaris 1.0.1 | 3.1 | 13.2% | 38 |
| ne.Chimera 1.2 | 3.4 | 12.9% | 37 |
| tvv.micro.Antares 1.1.1 | 5.1 | 11.1% | 46 |
| vStar.RAFzilla 2.15 | 5.8 | 10.2% | 15 |
| sam.Samspin 1.0 | 7.5 | 6.4% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 6.0% | 1 |
| kurios.DOSexe .9b | 8.9 | 5.3% | 5 |
| donjezza.Muncho 1.0 | 9.8 | 4.5% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 81.9 | 11 / 35 | 3874 |
| 2 | 2 | 64.0 | 81.3 | 9 / 35 | 3815 |
| 3 | 1 | 64.3 | 80.6 | 15 / 35 | 3906 |
| 4 | 2 | 64.0 | 81.6 | 9 / 35 | 4030 |
| 5 | 1 | 65.5 | 84.1 | 14 / 35 | 4202 |
| 6 | 2 | 62.7 | 77.8 | 10 / 35 | 3822 |
| 7 | 1 | 62.9 | 81.0 | 10 / 35 | 3500 |
| 8 | 1 | 62.4 | 79.0 | 10 / 35 | 3448 |
| 9 | 3 | 62.8 | 77.1 | 11 / 35 | 3642 |
| 10 | 1 | 64.8 | 85.4 | 16 / 35 | 3737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 45% |
| ejb.Polaris 1.0.1 | 56 | 82% |
| tvv.micro.Antares 1.1.1 | 32 | 19% |
| ne.Chimera 1.2 | 18 | 50% |
| vStar.RAFzilla 2.15 | 17 | 88% |
| donjezza.Muncho 1.0 | 8 | 63% |
| kurios.DOSexe .9b | 4 | 75% |
| sam.Samspin 1.0 | 2 | 50% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 50% |

Hadur died in 235 of 350 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 88 | 37% | 110 |
| ne.Chimera 1.2 | 48 | 20% | 61 |
| tvv.micro.Antares 1.1.1 | 37 | 16% | 37 |
| ejb.Polaris 1.0.1 | 27 | 11% | 79 |
| vStar.RAFzilla 2.15 | 16 | 7% | 29 |
| sam.Samspin 1.0 | 8 | 3% | 9 |
| donjezza.Muncho 1.0 | 5 | 2% | 11 |
| kurios.DOSexe .9b | 4 | 2% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 1% | 3 |

## Melee bench: F11

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 62.9 | 53 / 350 | 4.34 | 12.1% | 29484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.5% | 159 |
| cx.mini.Nimrod 0.55 | 2.4 | 13.6% | 51 |
| hadur117.nano.SanaroSC 0.2 | 2.8 | 12.1% | 53 |
| djc.DynaBot 0.1.1 | 4.5 | 10.8% | 26 |
| br2.MobyDickBot 1.6 | 5.5 | 9.5% | 26 |
| rdt199.Warlord 0.73 | 5.7 | 9.2% | 16 |
| uji.YellohFellah 1.0 | 6.6 | 8.9% | 20 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.9% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.6 | 66.3 | 3 / 35 | 2832 |
| 2 | 2 | 56.6 | 63.8 | 4 / 35 | 2860 |
| 3 | 3 | 55.6 | 60.0 | 2 / 35 | 3072 |
| 4 | 3 | 57.8 | 64.1 | 4 / 35 | 3205 |
| 5 | 3 | 57.1 | 63.2 | 7 / 35 | 2651 |
| 6 | 2 | 57.2 | 61.6 | 6 / 35 | 3239 |
| 7 | 4 | 54.2 | 56.8 | 3 / 35 | 2618 |
| 8 | 3 | 57.8 | 63.2 | 8 / 35 | 3189 |
| 9 | 2 | 59.2 | 67.6 | 10 / 35 | 3067 |
| 10 | 3 | 56.0 | 61.9 | 6 / 35 | 2751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 49 | 37% |
| cx.mini.Nimrod 0.55 | 17 | 59% |
| br2.MobyDickBot 1.6 | 11 | 45% |
| djc.DynaBot 0.1.1 | 11 | 82% |
| rdt199.Warlord 0.73 | 10 | 90% |
| uji.YellohFellah 1.0 | 8 | 25% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 299 of 350 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 115 | 38% | 132 |
| cx.mini.Nimrod 0.55 | 67 | 22% | 76 |
| rdt199.Warlord 0.73 | 23 | 8% | 32 |
| KiraNL.Chupacabra 0.4 | 22 | 7% | 22 |
| djc.DynaBot 0.1.1 | 19 | 6% | 26 |
| br2.MobyDickBot 1.6 | 17 | 6% | 21 |
| uji.YellohFellah 1.0 | 15 | 5% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 4% | 11 |
| stelo.MirrorNano 1.3 | 8 | 3% | 8 |
2 death(s) with no robot to name.

## Melee bench: F12

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 67.6 | 75 / 350 | 3.92 | 12.8% | 26628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.9 | 14.5% | 81 |
| nat.PallasHawk 1.0 | 1.9 | 14.6% | 102 |
| darkcanuck.Leon 1.01 | 2.8 | 13.3% | 56 |
| hadur117.nano.SanaroSC 0.2 | 3.4 | 12.8% | 75 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 20 |
| jrm.Test0 1.0 | 6.3 | 8.4% | 4 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.4% | 2 |
| jp.Perpy 16.0 | 7.7 | 7.2% | 4 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 6 |
| stuff.Vlad 0.1 | 9.4 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 69.8 | 9 / 35 | 2731 |
| 2 | 4 | 56.4 | 62.2 | 6 / 35 | 2602 |
| 3 | 3 | 61.0 | 74.9 | 9 / 35 | 2867 |
| 4 | 2 | 60.6 | 71.4 | 12 / 35 | 2771 |
| 5 | 4 | 56.2 | 64.4 | 7 / 35 | 2204 |
| 6 | 4 | 54.8 | 58.4 | 6 / 35 | 2598 |
| 7 | 4 | 59.2 | 69.5 | 6 / 35 | 3101 |
| 8 | 3 | 59.1 | 69.5 | 8 / 35 | 2618 |
| 9 | 3 | 58.3 | 66.7 | 9 / 35 | 2680 |
| 10 | 4 | 57.7 | 68.9 | 3 / 35 | 2456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 49 | 51% |
| nat.PallasHawk 1.0 | 46 | 33% |
| darkcanuck.Leon 1.01 | 41 | 49% |
| brainfade.melee.Genghis 0.36 | 10 | 80% |
| jrm.Test0 1.0 | 4 | 75% |
| jaybot.bots.Oddball 4.0 | 4 | 25% |
| stuff.Vlad 0.1 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 69 | 25% | 84 |
| bts.wiki.RipCurl 0.9b | 62 | 22% | 86 |
| darkcanuck.Leon 1.01 | 49 | 18% | 71 |
| brainfade.melee.Genghis 0.36 | 35 | 13% | 40 |
| jrm.Test0 1.0 | 23 | 8% | 27 |
| cs.sheldor.Talon 1.1 | 13 | 5% | 13 |
| jp.Perpy 16.0 | 10 | 4% | 12 |
| stuff.Vlad 0.1 | 9 | 3% | 10 |
| jaybot.bots.Oddball 4.0 | 7 | 3% | 7 |

## Melee bench: F13

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 72.8 | 52 / 350 | 3.45 | 13.3% | 31136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.7% | 88 |
| mn.Combat 3.25.0 | 1.5 | 17.0% | 148 |
| hadur117.nano.SanaroSC 0.2 | 3.5 | 13.3% | 52 |
| shinh.Entangled 0.3 | 3.9 | 12.6% | 39 |
| gh.micro.Gruweltje 0.7 | 4.6 | 12.2% | 21 |
| apc.Colossus2 0.17 | 6.1 | 8.3% | 0 |
| stelo.Wang 1.0 | 6.9 | 6.6% | 2 |
| maribo.FollowFire 1 | 8.5 | 4.9% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 5.1% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 76.5 | 6 / 35 | 3247 |
| 2 | 5 | 57.7 | 65.4 | 3 / 35 | 2887 |
| 3 | 4 | 58.6 | 68.9 | 5 / 35 | 2700 |
| 4 | 3 | 61.0 | 73.0 | 3 / 35 | 3323 |
| 5 | 4 | 61.2 | 75.2 | 7 / 35 | 3128 |
| 6 | 4 | 59.8 | 69.5 | 5 / 35 | 3177 |
| 7 | 3 | 60.9 | 71.4 | 6 / 35 | 3407 |
| 8 | 3 | 62.9 | 78.4 | 7 / 35 | 3288 |
| 9 | 3 | 60.2 | 72.4 | 3 / 35 | 3165 |
| 10 | 3 | 61.2 | 76.8 | 7 / 35 | 2814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 65 | 48% |
| ags.Glacier 0.2.11 | 59 | 17% |
| shinh.Entangled 0.3 | 22 | 32% |
| gh.micro.Gruweltje 0.7 | 12 | 25% |
| stelo.Wang 1.0 | 2 | 50% |

Hadur died in 298 of 350 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 104 | 35% | 116 |
| mn.Combat 3.25.0 | 76 | 26% | 106 |
| shinh.Entangled 0.3 | 54 | 18% | 60 |
| gh.micro.Gruweltje 0.7 | 40 | 13% | 44 |
| stelo.Wang 1.0 | 9 | 3% | 9 |
| apc.Colossus2 0.17 | 7 | 2% | 7 |
| maribo.FollowFire 1 | 4 | 1% | 4 |
| sample.Tracker 1.0 | 3 | 1% | 3 |
| ayk.WallHugger 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 77.5 | 110 / 350 | 3.03 | 14.8% | 34002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.2% | 126 |
| hadur117.nano.SanaroSC 0.2 | 2.0 | 14.8% | 110 |
| catcat20.shape.Theta 0.018 | 3.3 | 12.4% | 56 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.9 | 10.5% | 9 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 10.1% | 12 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 10.2% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 6.5 | 9.3% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.5% | 16 |
| pa.Improved 1.0 | 9.0 | 5.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 74.6 | 12 / 35 | 3430 |
| 2 | 2 | 63.4 | 79.4 | 12 / 35 | 3217 |
| 3 | 2 | 63.4 | 77.5 | 14 / 35 | 3387 |
| 4 | 2 | 63.3 | 79.4 | 7 / 35 | 3528 |
| 5 | 2 | 62.0 | 75.2 | 8 / 35 | 3368 |
| 6 | 2 | 61.2 | 72.7 | 9 / 35 | 3386 |
| 7 | 2 | 63.8 | 82.5 | 14 / 35 | 3128 |
| 8 | 2 | 63.8 | 79.4 | 13 / 35 | 3742 |
| 9 | 2 | 62.3 | 77.5 | 8 / 35 | 3371 |
| 10 | 2 | 63.3 | 76.5 | 13 / 35 | 3445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 94 | 57% |
| catcat20.shape.Theta 0.018 | 35 | 51% |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 53% |
| Lo_Ian.Gandalf_V4 4.0 | 11 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 55% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 78% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 50% |
| pa.Improved 1.0 | 3 | 67% |

Hadur died in 240 of 350 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 95 | 40% | 149 |
| catcat20.shape.Theta 0.018 | 36 | 15% | 46 |
| co.edu.usb.rc.LidisTron 1.0 | 27 | 11% | 28 |
| dmh.robocode.robot.RedDwarf 0.4 | 20 | 8% | 31 |
| Lo_Ian.Gandalf_V4 4.0 | 20 | 8% | 30 |
| sanyi.mikrobi.Roberto 1.0 | 19 | 8% | 26 |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 7% | 31 |
| pa.Improved 1.0 | 5 | 2% | 8 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |

## Melee bench: F15

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 65.8 | 50 / 350 | 4.08 | 13.0% | 35777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.5 | 15.1% | 81 |
| mld.DustBunny 3.8 | 2.5 | 13.8% | 44 |
| emp.Yngwie 1.11 | 2.8 | 13.8% | 111 |
| hadur117.nano.SanaroSC 0.2 | 3.3 | 13.0% | 50 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.7% | 15 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.0% | 39 |
| Grystrion.TrackerWO 1.0 | 7.4 | 7.1% | 3 |
| lambdaxy.TBot 0.1 | 7.7 | 6.9% | 1 |
| divineomega.TrialBot 0.003 | 9.0 | 5.3% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.8 | 60.0 | 4 / 35 | 3461 |
| 2 | 4 | 58.3 | 63.2 | 4 / 35 | 3636 |
| 3 | 1 | 63.2 | 73.3 | 7 / 35 | 4549 |
| 4 | 3 | 59.8 | 66.7 | 8 / 35 | 3505 |
| 5 | 4 | 59.5 | 66.0 | 6 / 35 | 3493 |
| 6 | 4 | 58.1 | 63.5 | 3 / 35 | 3553 |
| 7 | 4 | 56.4 | 61.6 | 2 / 35 | 3104 |
| 8 | 5 | 55.9 | 62.2 | 2 / 35 | 3100 |
| 9 | 3 | 60.2 | 68.6 | 7 / 35 | 3589 |
| 10 | 1 | 61.4 | 72.7 | 7 / 35 | 3787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 41 | 56% |
| mld.DustBunny 3.8 | 21 | 10% |
| kawigi.micro.Shiz 1.1 | 21 | 38% |
| cb.nano.Insomnia 1.0 | 10 | 60% |
| kawigi.robot.Girl 1.2 | 10 | 60% |
| Grystrion.TrackerWO 1.0 | 3 | 33% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 69 | 23% | 77 |
| kawigi.micro.Shiz 1.1 | 62 | 21% | 70 |
| emp.Yngwie 1.11 | 61 | 20% | 89 |
| cb.nano.Insomnia 1.0 | 33 | 11% | 29 |
| kawigi.robot.Girl 1.2 | 27 | 9% | 30 |
| Grystrion.TrackerWO 1.0 | 22 | 7% | 23 |
| lambdaxy.TBot 0.1 | 13 | 4% | 13 |
| divineomega.TrialBot 0.003 | 11 | 4% | 17 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 1% | 2 |

## Melee bench: F16

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 65.0 | 52 / 350 | 4.15 | 13.2% | 38361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.2% | 164 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.2 | 14.4% | 9 |
| hadur117.nano.SanaroSC 0.2 | 3.0 | 13.2% | 52 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.6% | 81 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.8% | 29 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.4% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.5% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.6% | 6 |
| repositorio.NanoStep 1.0 | 9.2 | 5.1% | 1 |
| asd.Cthulhu 1.3 | 9.3 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.8 | 58.7 | 4 / 35 | 3207 |
| 2 | 3 | 61.0 | 70.2 | 2 / 35 | 3955 |
| 3 | 2 | 62.7 | 68.9 | 9 / 35 | 4479 |
| 4 | 4 | 56.1 | 56.8 | 4 / 35 | 3269 |
| 5 | 4 | 57.8 | 60.3 | 2 / 35 | 3552 |
| 6 | 3 | 60.0 | 63.8 | 6 / 35 | 4193 |
| 7 | 2 | 62.4 | 70.2 | 6 / 35 | 4367 |
| 8 | 3 | 59.9 | 63.8 | 7 / 35 | 3860 |
| 9 | 3 | 59.6 | 66.3 | 4 / 35 | 3665 |
| 10 | 3 | 61.4 | 70.8 | 8 / 35 | 3814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 68 | 21% |
| techdude.forest.FlamingForest 1.1 | 23 | 17% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 94% |
| tvv.nano.Polaris 1.2 | 9 | 44% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |
| asd.Cthulhu 1.3 | 1 | 0% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 1108. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 133 | 44% | 151 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 43 | 14% | 55 |
| bvh.fnr.Fenrir 0.36l | 40 | 13% | 42 |
| techdude.forest.FlamingForest 1.1 | 30 | 10% | 36 |
| stelo.IntrinsicVolatility 1.4 | 16 | 5% | 19 |
| tvv.nano.Polaris 1.2 | 15 | 5% | 19 |
| divineomega.DivineBot 1.9.4.5 | 14 | 5% | 19 |
| asd.Cthulhu 1.3 | 6 | 2% | 6 |
| repositorio.NanoStep 1.0 | 2 | 1% | 3 |

## Melee bench: F17

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 65.5 | 65 / 350 | 4.10 | 12.9% | 35147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.9 | 14.1% | 71 |
| oog.melee.Mercutio 1.0 | 2.2 | 13.8% | 80 |
| cx.BlestPain 1.41 | 2.7 | 13.3% | 78 |
| hadur117.nano.SanaroSC 0.2 | 3.6 | 12.9% | 65 |
| nic.Nicator 2.4 | 4.8 | 12.0% | 25 |
| ahf.NanoAndrew .4 | 5.8 | 10.8% | 24 |
| maribo.melee.BMV 0.1 | 7.0 | 9.1% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 2 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 1 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.3 | 58.4 | 2 / 35 | 3504 |
| 2 | 4 | 58.7 | 64.4 | 6 / 35 | 3527 |
| 3 | 3 | 61.1 | 69.2 | 9 / 35 | 3680 |
| 4 | 4 | 57.2 | 63.8 | 3 / 35 | 3297 |
| 5 | 3 | 59.3 | 63.5 | 10 / 35 | 3455 |
| 6 | 3 | 58.7 | 65.4 | 4 / 35 | 3626 |
| 7 | 5 | 60.0 | 65.7 | 7 / 35 | 3587 |
| 8 | 2 | 60.3 | 68.3 | 7 / 35 | 3599 |
| 9 | 2 | 61.9 | 72.4 | 12 / 35 | 3500 |
| 10 | 5 | 58.0 | 64.1 | 5 / 35 | 3372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 37 | 41% |
| oog.melee.Mercutio 1.0 | 29 | 66% |
| cx.BlestPain 1.41 | 26 | 77% |
| nic.Nicator 2.4 | 14 | 43% |
| ahf.NanoAndrew .4 | 6 | 50% |
| maribo.melee.BMV 0.1 | 2 | 50% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |
| tex.Longbot 0.4 | 1 | 0% |

Hadur died in 285 of 350 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 67 | 24% | 81 |
| cx.BlestPain 1.41 | 54 | 19% | 73 |
| oog.melee.Mercutio 1.0 | 49 | 17% | 69 |
| nic.Nicator 2.4 | 38 | 13% | 44 |
| ahf.NanoAndrew .4 | 32 | 11% | 35 |
| maribo.melee.BMV 0.1 | 26 | 9% | 27 |
| tex.Longbot 0.4 | 10 | 4% | 10 |
| edu.otg.spr.TheTeacher 1.2 | 6 | 2% | 7 |
| goblin.Bender 2.4 | 3 | 1% | 4 |

## Melee bench: F18

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 67.8 | 85 / 350 | 3.90 | 13.4% | 33107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.6 | 14.0% | 86 |
| hadur117.nano.SanaroSC 0.2 | 2.0 | 13.4% | 85 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.5% | 62 |
| uji.DBH 1.1 | 4.3 | 11.4% | 36 |
| spinnercat.Robovirus 2.718 | 5.0 | 10.7% | 21 |
| ratosh.Nobo 0.21 | 5.4 | 10.6% | 17 |
| sigterm.Sigterm 1.0 | 6.5 | 9.0% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.6% | 9 |
| stelo.WangRobot 1.0 | 9.3 | 5.8% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.1 | 62.5 | 9 / 35 | 3138 |
| 2 | 2 | 58.9 | 67.0 | 9 / 35 | 3130 |
| 3 | 3 | 60.2 | 69.2 | 7 / 35 | 3596 |
| 4 | 2 | 58.0 | 64.8 | 7 / 35 | 3319 |
| 5 | 1 | 60.9 | 70.5 | 15 / 35 | 3154 |
| 6 | 1 | 59.8 | 69.8 | 9 / 35 | 3274 |
| 7 | 1 | 61.3 | 70.8 | 13 / 35 | 3740 |
| 8 | 5 | 55.2 | 59.4 | 4 / 35 | 3145 |
| 9 | 2 | 58.6 | 67.9 | 5 / 35 | 3198 |
| 10 | 1 | 61.7 | 76.2 | 7 / 35 | 3413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 38 | 50% |
| agd.Mooserwirt2 2.7 | 30 | 63% |
| spinnercat.Robovirus 2.718 | 25 | 76% |
| uji.DBH 1.1 | 19 | 47% |
| sigterm.Sigterm 1.0 | 10 | 60% |
| ratosh.Nobo 0.21 | 8 | 75% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 71% |
| stelo.WangRobot 1.0 | 6 | 17% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 265 of 350 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 74 | 28% | 94 |
| agd.Mooserwirt2 2.7 | 44 | 17% | 65 |
| uji.DBH 1.1 | 38 | 14% | 47 |
| spinnercat.Robovirus 2.718 | 31 | 12% | 43 |
| ratosh.Nobo 0.21 | 23 | 9% | 30 |
| kawigi.mini.Fhqwhgads 1.1 | 19 | 7% | 24 |
| sigterm.Sigterm 1.0 | 17 | 6% | 22 |
| stelo.WangRobot 1.0 | 12 | 5% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7 | 3% | 10 |

## Melee bench: F19

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.4 | 101 / 350 | 2.67 | 15.9% | 39764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.7 | 16.4% | 97 |
| mld.Infinity 2.2 | 2.1 | 16.0% | 114 |
| hadur117.nano.SanaroSC 0.2 | 2.2 | 15.9% | 101 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.3% | 10 |
| erdnis.Rover 0.3 | 4.8 | 10.6% | 11 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.6% | 5 |
| mbh.Mbh 0.1 | 7.4 | 7.3% | 0 |
| pac.ABC 2.1 | 7.5 | 7.1% | 13 |
| pbg.R2D2 1.0 | 9.0 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.2 | 78.7 | 5 / 35 | 4107 |
| 2 | 3 | 64.5 | 80.3 | 10 / 35 | 3537 |
| 3 | 3 | 63.8 | 78.7 | 11 / 35 | 3450 |
| 4 | 3 | 64.2 | 77.5 | 10 / 35 | 3741 |
| 5 | 1 | 65.7 | 84.4 | 11 / 35 | 3919 |
| 6 | 2 | 66.3 | 83.5 | 12 / 35 | 4251 |
| 7 | 2 | 66.1 | 81.6 | 10 / 35 | 4385 |
| 8 | 3 | 63.5 | 75.2 | 7 / 35 | 3804 |
| 9 | 1 | 67.8 | 87.0 | 14 / 35 | 4435 |
| 10 | 1 | 66.9 | 87.0 | 11 / 35 | 4135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 96 | 49% |
| davidalves.net.DuelistMiniMelee 1.2 | 87 | 33% |
| erdnis.Rover 0.3 | 10 | 60% |
| krillr.mini.JointStrike 2.0.0 | 10 | 80% |
| pac.ABC 2.1 | 7 | 29% |
| pbg.R2D2 1.0 | 4 | 100% |
| patson.PatsonTestBot 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 251 of 350 rounds, at a mean tick of 1061. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 106 | 42% | 184 |
| mld.Infinity 2.2 | 68 | 27% | 28 |
| erdnis.Rover 0.3 | 24 | 10% | 37 |
| krillr.mini.JointStrike 2.0.0 | 24 | 10% | 35 |
| pac.ABC 2.1 | 11 | 4% | 12 |
| patson.PatsonTestBot 1.0 | 10 | 4% | 25 |
| pbg.R2D2 1.0 | 5 | 2% | 16 |
| mbh.Mbh 0.1 | 2 | 1% | 10 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 70.6 | 73 / 350 | 3.65 | 13.8% | 35417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.4% | 141 |
| hadur117.nano.SanaroSC 0.2 | 2.2 | 13.8% | 73 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.5% | 29 |
| fwb.Nine 1.0.1 | 3.9 | 11.6% | 42 |
| catcat20.Rabbit 0.001 | 5.0 | 10.5% | 34 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.9% | 12 |
| m3thos.mini.Eva01 0.5.5 | 7.1 | 8.0% | 7 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.5% | 13 |
| ntc.ControlledChaos 1.1.4 | 8.9 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.4 | 62.5 | 8 / 35 | 3517 |
| 2 | 2 | 61.4 | 73.3 | 9 / 35 | 3369 |
| 3 | 2 | 59.4 | 68.9 | 6 / 35 | 3115 |
| 4 | 2 | 61.8 | 74.0 | 5 / 35 | 3889 |
| 5 | 2 | 62.4 | 75.6 | 10 / 35 | 3680 |
| 6 | 2 | 61.2 | 71.7 | 6 / 35 | 3764 |
| 7 | 3 | 59.4 | 67.0 | 7 / 35 | 3455 |
| 8 | 3 | 57.0 | 63.5 | 2 / 35 | 3215 |
| 9 | 2 | 63.8 | 78.4 | 12 / 35 | 3717 |
| 10 | 2 | 61.2 | 71.1 | 8 / 35 | 3696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 79 | 41% |
| fwb.Nine 1.0.1 | 33 | 42% |
| catcat20.Rabbit 0.001 | 19 | 58% |
| nz.jdc.nano.GridFu 1.0 | 9 | 33% |
| djdjdj.NanoSkunk10 1.0 | 7 | 43% |
| bayen.nut.Squirrel 1.615 | 5 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 125 | 45% | 151 |
| fwb.Nine 1.0.1 | 39 | 14% | 24 |
| nz.jdc.nano.GridFu 1.0 | 33 | 12% | 46 |
| catcat20.Rabbit 0.001 | 30 | 11% | 48 |
| bayen.nut.Squirrel 1.615 | 18 | 6% | 30 |
| djdjdj.NanoSkunk10 1.0 | 12 | 4% | 20 |
| m3thos.mini.Eva01 0.5.5 | 8 | 3% | 13 |
| ntc.ControlledChaos 1.1.4 | 7 | 3% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 2% | 8 |

## Melee bench: F21

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.3 | 121 / 350 | 2.60 | 16.8% | 45365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroSC 0.2 | 1.5 | 16.8% | 121 |
| eem.EvBot v4.6.16 | 1.5 | 17.0% | 152 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.7% | 28 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 23 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.7% | 4 |
| eld.Hmm 1.0 | 5.5 | 8.9% | 22 |
| el.JumpShoot 0.2 | 7.6 | 6.5% | 1 |
| fire219.CatBot 1.0 | 7.7 | 6.4% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.1% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 14 / 35 | 5117 |
| 2 | 1 | 66.5 | 83.2 | 13 / 35 | 4720 |
| 3 | 1 | 67.8 | 86.3 | 14 / 35 | 4705 |
| 4 | 2 | 65.3 | 81.6 | 10 / 35 | 4139 |
| 5 | 2 | 64.5 | 78.1 | 10 / 35 | 4276 |
| 6 | 2 | 65.6 | 81.3 | 11 / 35 | 4599 |
| 7 | 2 | 65.2 | 81.0 | 10 / 35 | 4181 |
| 8 | 1 | 66.4 | 84.1 | 13 / 35 | 4580 |
| 9 | 2 | 65.7 | 78.4 | 11 / 35 | 4538 |
| 10 | 1 | 67.1 | 85.1 | 15 / 35 | 4510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 126 | 48% |
| dummy.mini.Scimitar 1.01 | 40 | 78% |
| cf.RiO.RiOx 4.2.1 | 21 | 38% |
| eld.Hmm 1.0 | 18 | 67% |
| oa.weak.BotherBot 0.1 | 8 | 75% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 50% |

Hadur died in 229 of 350 rounds, at a mean tick of 1195. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 93 | 41% | 132 |
| dummy.mini.Scimitar 1.01 | 54 | 24% | 99 |
| cf.RiO.RiOx 4.2.1 | 49 | 21% | 53 |
| eld.Hmm 1.0 | 12 | 5% | 29 |
| oa.weak.BotherBot 0.1 | 10 | 4% | 21 |
| el.JumpShoot 0.2 | 7 | 3% | 8 |
| PSW.Relentless 0.1 | 3 | 1% | 4 |
| arthord.MannyPacquiao Beta | 1 | 0% | 3 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 79.3 | 88 / 350 | 2.86 | 15.5% | 38169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 19.0% | 166 |
| hadur117.nano.SanaroSC 0.2 | 2.4 | 15.5% | 88 |
| cre.Karolos 0.32 | 2.6 | 14.6% | 55 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.6% | 26 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.1 | 9.1% | 4 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.8% | 6 |
| cw.megas.Blade 0.8 | 6.8 | 8.3% | 0 |
| sample.Walls 1.0 | 6.9 | 8.5% | 5 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 79.7 | 12 / 35 | 3518 |
| 2 | 3 | 64.6 | 77.8 | 13 / 35 | 3531 |
| 3 | 2 | 65.9 | 82.2 | 8 / 35 | 4071 |
| 4 | 2 | 67.4 | 85.7 | 9 / 35 | 4440 |
| 5 | 3 | 62.9 | 75.6 | 8 / 35 | 3386 |
| 6 | 3 | 65.5 | 80.6 | 7 / 35 | 3684 |
| 7 | 2 | 63.8 | 76.2 | 8 / 35 | 3799 |
| 8 | 2 | 64.6 | 80.3 | 10 / 35 | 3889 |
| 9 | 3 | 63.3 | 74.6 | 6 / 35 | 3652 |
| 10 | 2 | 66.0 | 80.3 | 7 / 35 | 4199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 128 | 33% |
| cre.Karolos 0.32 | 36 | 36% |
| stelo.AreaTargetingBot 1.1 | 18 | 50% |
| sample.Walls 1.0 | 14 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 75% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 262 of 350 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 149 | 57% | 193 |
| cre.Karolos 0.32 | 56 | 21% | 69 |
| stelo.AreaTargetingBot 1.1 | 28 | 11% | 35 |
| stelo.RamTrackSurfer 1.2 | 8 | 3% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 3% | 11 |
| sample.Walls 1.0 | 6 | 2% | 13 |
| cw.megas.Blade 0.8 | 6 | 2% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 2 |

## Melee bench: F24

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 58.9 | 32 / 350 | 4.70 | 11.0% | 25703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.5 | 14.7% | 95 |
| davidalves.Phoenix 0.54 | 2.3 | 13.6% | 80 |
| florent.XSeries.X2 0.12 | 2.3 | 13.5% | 68 |
| pedersen.Ugluk 1.1.1 | 4.1 | 12.2% | 44 |
| hadur117.nano.SanaroSC 0.2 | 4.8 | 11.0% | 32 |
| oog.melee.Corsair 1.0 | 6.1 | 9.7% | 9 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.7% | 16 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.9% | 4 |
| as.FrankTheTank 1.3 | 9.3 | 5.0% | 2 |
| evd.X1 0.01 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.6 | 62.2 | 6 / 35 | 2892 |
| 2 | 5 | 53.1 | 55.9 | 2 / 35 | 2534 |
| 3 | 5 | 54.1 | 58.7 | 3 / 35 | 2529 |
| 4 | 5 | 53.7 | 57.8 | 2 / 35 | 2491 |
| 5 | 4 | 55.8 | 62.2 | 3 / 35 | 2703 |
| 6 | 5 | 52.6 | 54.9 | 2 / 35 | 2423 |
| 7 | 5 | 54.5 | 59.0 | 4 / 35 | 2450 |
| 8 | 5 | 54.1 | 59.7 | 2 / 35 | 2537 |
| 9 | 5 | 52.8 | 55.9 | 1 / 35 | 2480 |
| 10 | 5 | 57.0 | 62.5 | 7 / 35 | 2664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 22 | 18% |
| davidalves.Phoenix 0.54 | 15 | 60% |
| florent.XSeries.X2 0.12 | 15 | 53% |
| pedersen.Ugluk 1.1.1 | 13 | 46% |
| stelo.SoJNanoMelee 1.1 | 10 | 40% |
| oog.melee.Corsair 1.0 | 2 | 50% |

Hadur died in 318 of 350 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 80 | 25% | 85 |
| pedersen.Ugluk 1.1.1 | 66 | 21% | 71 |
| florent.XSeries.X2 0.12 | 60 | 19% | 66 |
| davidalves.Phoenix 0.54 | 49 | 15% | 56 |
| stelo.SoJNanoMelee 1.1 | 34 | 11% | 39 |
| oog.melee.Corsair 1.0 | 15 | 5% | 18 |
| lunchie.Lunchbox 0.93 | 10 | 3% | 10 |
| as.FrankTheTank 1.3 | 3 | 1% | 4 |
| evd.X1 0.01 | 1 | 0% | 1 |

## Melee bench: F25

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 67.2 | 63 / 350 | 3.95 | 13.1% | 30131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 14.7% | 84 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.8% | 64 |
| hadur117.nano.SanaroSC 0.2 | 2.7 | 13.1% | 63 |
| jdw.Hurricane 1.4 | 4.0 | 11.6% | 44 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 10.3% | 27 |
| ds.Oo 2.2 | 5.9 | 9.7% | 29 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.3% | 26 |
| awesomeness.Elite 1.0 | 8.2 | 7.2% | 7 |
| adt.Ar2 1.1 | 8.6 | 6.6% | 6 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 66.3 | 6 / 35 | 2776 |
| 2 | 3 | 58.4 | 67.0 | 7 / 35 | 2884 |
| 3 | 3 | 58.2 | 64.8 | 6 / 35 | 3149 |
| 4 | 2 | 59.6 | 69.2 | 6 / 35 | 3215 |
| 5 | 1 | 61.9 | 75.2 | 11 / 35 | 2976 |
| 6 | 4 | 56.0 | 62.5 | 3 / 35 | 2659 |
| 7 | 3 | 57.6 | 63.5 | 4 / 35 | 3008 |
| 8 | 1 | 63.3 | 77.1 | 12 / 35 | 3467 |
| 9 | 4 | 56.7 | 60.6 | 4 / 35 | 3120 |
| 10 | 3 | 57.7 | 65.7 | 4 / 35 | 2877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 27% |
| voidious.mini.BrokenSword 2.0.3 | 43 | 42% |
| jdw.Hurricane 1.4 | 22 | 68% |
| ds.Oo 2.2 | 15 | 27% |
| gjr.Cephalosporin 0.1 | 13 | 15% |
| gre.svman4.Morfeas 1.4.1 | 12 | 67% |
| awesomeness.Elite 1.0 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 76 | 26% | 90 |
| voidious.mini.BrokenSword 2.0.3 | 62 | 22% | 80 |
| jdw.Hurricane 1.4 | 42 | 15% | 54 |
| gjr.Cephalosporin 0.1 | 31 | 11% | 33 |
| ds.Oo 2.2 | 26 | 9% | 33 |
| gre.svman4.Morfeas 1.4.1 | 21 | 7% | 27 |
| adt.Ar2 1.1 | 12 | 4% | 13 |
| amk.ChumbaMini 0.2 | 11 | 4% | 11 |
| awesomeness.Elite 1.0 | 6 | 2% | 9 |

## Melee bench: F26

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 69.8 | 58 / 350 | 3.72 | 13.3% | 36147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.5% | 119 |
| hadur117.nano.SanaroSC 0.2 | 2.9 | 13.3% | 58 |
| shu.nitro.LENIN .T34 | 3.2 | 12.9% | 77 |
| lrem.Spectre 0.4.4 | 3.4 | 12.6% | 50 |
| js.PinBall 1.6 | 5.0 | 11.2% | 20 |
| gh.mini.GrubbmOne 1.0 | 5.7 | 10.4% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 9.3% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 3 |
| sample.SpinBot 1.0 | 9.0 | 5.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 74.0 | 6 / 35 | 3659 |
| 2 | 4 | 58.2 | 66.3 | 4 / 35 | 3016 |
| 3 | 3 | 59.4 | 62.9 | 6 / 35 | 3727 |
| 4 | 3 | 62.6 | 75.2 | 7 / 35 | 3869 |
| 5 | 2 | 61.9 | 72.4 | 8 / 35 | 4074 |
| 6 | 2 | 61.8 | 73.0 | 7 / 35 | 3816 |
| 7 | 3 | 59.5 | 67.6 | 5 / 35 | 3397 |
| 8 | 3 | 57.6 | 64.8 | 5 / 35 | 3044 |
| 9 | 3 | 61.6 | 72.4 | 8 / 35 | 3926 |
| 10 | 3 | 60.1 | 69.2 | 2 / 35 | 3619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 49 | 37% |
| shu.nitro.LENIN .T34 | 34 | 21% |
| lrem.Spectre 0.4.4 | 29 | 41% |
| js.PinBall 1.6 | 13 | 69% |
| gh.mini.GrubbmOne 1.0 | 8 | 50% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 60% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 80% |

Hadur died in 293 of 350 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 86 | 29% | 100 |
| shu.nitro.LENIN .T34 | 53 | 18% | 63 |
| lrem.Spectre 0.4.4 | 53 | 18% | 62 |
| gh.mini.GrubbmOne 1.0 | 31 | 11% | 38 |
| js.PinBall 1.6 | 28 | 10% | 38 |
| jaybot.adv.bots.JayBot 2.0 | 19 | 6% | 23 |
| fullsail.LaxativeTeaTwo 1.0 | 15 | 5% | 18 |
| sample.SpinBot 1.0 | 8 | 3% | 8 |

## Melee bench: F27

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 62.7 | 89 / 350 | 4.36 | 13.0% | 34603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.7 | 14.6% | 114 |
| wee.Gem 1.8.4 | 2.8 | 13.2% | 66 |
| hadur117.nano.SanaroSC 0.2 | 2.9 | 13.0% | 89 |
| sheldor.melee.nano.TestMelee 0.1 | 3.8 | 11.8% | 40 |
| EH.Eagle 1.0.6 | 4.1 | 11.4% | 21 |
| techdude.kombat.FlamingKombat 1.5 | 6.6 | 8.8% | 10 |
| joe.ADinosaur 1.0 | 6.7 | 8.8% | 5 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.2% | 5 |
| caimano.Furia_Ceca 0.22 | 8.9 | 6.8% | 3 |
| cs.Grudge 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.5 | 54.9 | 11 / 35 | 4506 |
| 2 | 1 | 60.3 | 69.8 | 11 / 35 | 3141 |
| 3 | 5 | 54.1 | 45.4 | 4 / 35 | 4199 |
| 4 | 1 | 61.6 | 77.1 | 10 / 35 | 2975 |
| 5 | 4 | 56.1 | 61.9 | 6 / 35 | 2557 |
| 6 | 5 | 56.1 | 50.2 | 6 / 35 | 4127 |
| 7 | 2 | 62.2 | 77.1 | 14 / 35 | 2929 |
| 8 | 6 | 50.4 | 37.8 | 4 / 35 | 3809 |
| 9 | 2 | 60.4 | 73.0 | 9 / 35 | 2920 |
| 10 | 1 | 63.3 | 79.4 | 14 / 35 | 3440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 59 | 66% |
| wee.Gem 1.8.4 | 36 | 67% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 41% |
| EH.Eagle 1.0.6 | 10 | 80% |
| joe.ADinosaur 1.0 | 5 | 80% |
| throxbot.ThroxBot 0.1 | 4 | 75% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 261 of 350 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 66 | 25% | 102 |
| wee.Gem 1.8.4 | 45 | 17% | 76 |
| sheldor.melee.nano.TestMelee 0.1 | 37 | 14% | 44 |
| joe.ADinosaur 1.0 | 29 | 11% | 30 |
| cs.Grudge 1.0 | 25 | 10% | 22 |
| caimano.Furia_Ceca 0.22 | 19 | 7% | 22 |
| EH.Eagle 1.0.6 | 17 | 7% | 26 |
| throxbot.ThroxBot 0.1 | 12 | 5% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 11 | 4% | 12 |

## Melee bench: F28

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 79.1 | 110 / 350 | 2.88 | 15.5% | 34562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.4 | 16.1% | 113 |
| hadur117.nano.SanaroSC 0.2 | 1.7 | 15.5% | 110 |
| uji.Antique 1.0 | 3.1 | 12.7% | 60 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.4% | 37 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.4% | 12 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.1% | 6 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.9% | 6 |
| matt.advanced.Katana 1.0 | 8.1 | 6.8% | 6 |
| stelo.Lifestealer 1.0 | 9.2 | 5.5% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 79.0 | 10 / 35 | 3757 |
| 2 | 3 | 60.3 | 70.2 | 9 / 35 | 3120 |
| 3 | 1 | 62.8 | 79.7 | 11 / 35 | 3309 |
| 4 | 1 | 65.1 | 83.2 | 14 / 35 | 3727 |
| 5 | 2 | 65.0 | 82.2 | 14 / 35 | 3718 |
| 6 | 2 | 63.7 | 80.6 | 9 / 35 | 3535 |
| 7 | 2 | 63.8 | 79.7 | 9 / 35 | 3891 |
| 8 | 2 | 60.8 | 73.7 | 9 / 35 | 3093 |
| 9 | 2 | 63.8 | 82.2 | 13 / 35 | 3170 |
| 10 | 1 | 63.4 | 80.3 | 12 / 35 | 3242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 111 | 49% |
| qohnil.blot.BlotBot 3.61 | 38 | 37% |
| uji.Antique 1.0 | 34 | 56% |
| amk.ChumbaWumba 0.3 | 12 | 83% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| matt.advanced.Katana 1.0 | 5 | 60% |
| ahr.ice.Ice 1.0.2 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 242 of 350 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 94 | 39% | 131 |
| uji.Antique 1.0 | 47 | 19% | 74 |
| pfvicm.Sobieski 7.2.3b | 35 | 14% | 43 |
| qohnil.blot.BlotBot 3.61 | 33 | 14% | 49 |
| amk.ChumbaWumba 0.3 | 15 | 6% | 20 |
| ahr.ice.Ice 1.0.2 | 6 | 2% | 13 |
| matt.advanced.Katana 1.0 | 5 | 2% | 12 |
| stelo.PianistNano 1.2 | 4 | 2% | 4 |
| stelo.Lifestealer 1.0 | 3 | 1% | 4 |

## Melee bench: F29

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 65.0 | 50 / 350 | 4.15 | 12.8% | 31078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.5 | 16.3% | 132 |
| deewiant.Anomaly 0.2 | 1.6 | 15.9% | 105 |
| hadur117.nano.SanaroSC 0.2 | 3.3 | 12.8% | 50 |
| myl.micro.Troodon 1.10 | 3.6 | 12.7% | 28 |
| jok.PheonixM 0.1.2 | 5.0 | 11.4% | 18 |
| DBall.Anarchy 0.1 | 6.4 | 7.9% | 14 |
| ph.melee.ArcherME 0.3 | 6.6 | 8.2% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.4 | 5.6% | 0 |
| ap.Frederick 1.1 | 8.9 | 4.9% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.6 | 56.8 | 2 / 35 | 2772 |
| 2 | 3 | 59.9 | 67.0 | 6 / 35 | 3062 |
| 3 | 4 | 57.7 | 61.6 | 4 / 35 | 3136 |
| 4 | 4 | 58.3 | 63.8 | 5 / 35 | 2725 |
| 5 | 3 | 59.2 | 67.0 | 4 / 35 | 3323 |
| 6 | 3 | 61.0 | 70.5 | 5 / 35 | 3522 |
| 7 | 3 | 58.2 | 63.8 | 5 / 35 | 2832 |
| 8 | 4 | 58.4 | 62.5 | 6 / 35 | 3129 |
| 9 | 2 | 62.2 | 73.3 | 8 / 35 | 3293 |
| 10 | 3 | 59.1 | 63.5 | 5 / 35 | 3284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 49 | 8% |
| zyx.mega.YersiniaPestis 3.1 | 36 | 61% |
| myl.micro.Troodon 1.10 | 22 | 68% |
| jok.PheonixM 0.1.2 | 9 | 56% |
| DBall.Anarchy 0.1 | 8 | 50% |

Hadur died in 300 of 350 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 108 | 36% | 112 |
| zyx.mega.YersiniaPestis 3.1 | 59 | 20% | 82 |
| myl.micro.Troodon 1.10 | 54 | 18% | 69 |
| jok.PheonixM 0.1.2 | 42 | 14% | 46 |
| DBall.Anarchy 0.1 | 13 | 4% | 17 |
| ph.melee.ArcherME 0.3 | 12 | 4% | 12 |
| fullsail.TimbotNoPrediction 1.0 | 9 | 3% | 9 |
| jangs.ns51 1.0 | 3 | 1% | 3 |

## Melee bench: F30

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.5 | 53.2 | 21 / 350 | 5.21 | 10.1% | 26462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.8 | 14.4% | 104 |
| catcat20.Matcha 0.006 | 2.2 | 14.1% | 88 |
| oog.melee.Capulet 1.2 | 2.6 | 13.6% | 55 |
| stelo.PastFuture 2.3.2 | 3.4 | 13.0% | 46 |
| hadur117.nano.SanaroSC 0.2 | 5.3 | 10.1% | 21 |
| intruder.PrairieWolf 2.61 | 5.9 | 9.3% | 19 |
| ntc.Opposite 1.5 | 7.5 | 8.0% | 2 |
| tripphippy.Alice 1.1 | 8.1 | 7.5% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.3% | 9 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.4 | 54.0 | 5 / 35 | 2695 |
| 2 | 5 | 54.9 | 58.4 | 1 / 35 | 2891 |
| 3 | 6 | 50.6 | 48.6 | 1 / 35 | 2625 |
| 4 | 5 | 55.0 | 57.5 | 2 / 35 | 3200 |
| 5 | 6 | 48.9 | 46.0 | 1 / 35 | 2370 |
| 6 | 5 | 50.9 | 51.1 | 2 / 35 | 2498 |
| 7 | 5 | 53.3 | 57.5 | 2 / 35 | 2431 |
| 8 | 5 | 52.8 | 51.7 | 2 / 35 | 2701 |
| 9 | 5 | 53.9 | 57.1 | 2 / 35 | 2596 |
| 10 | 6 | 51.3 | 50.5 | 3 / 35 | 2455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 23 | 26% |
| oog.melee.Capulet 1.2 | 15 | 27% |
| catcat20.Matcha 0.006 | 14 | 7% |
| stelo.PastFuture 2.3.2 | 7 | 86% |
| intruder.PrairieWolf 2.61 | 6 | 33% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 329 of 350 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 73 | 22% | 79 |
| oog.melee.Capulet 1.2 | 62 | 19% | 67 |
| stelo.PastFuture 2.3.2 | 54 | 16% | 60 |
| catcat20.Matcha 0.006 | 52 | 16% | 54 |
| ntc.Opposite 1.5 | 27 | 8% | 27 |
| intruder.PrairieWolf 2.61 | 24 | 7% | 25 |
| tripphippy.Alice 1.1 | 19 | 6% | 20 |
| fowl3628800.LightningBolt 2.6.0 | 14 | 4% | 14 |
| GarmBox.Anger 1.0 | 4 | 1% | 4 |

## Melee bench: F31

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.6 | 58.2 | 30 / 350 | 4.76 | 10.9% | 25347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.6% | 184 |
| gh.mini.Griezel 0.2 | 2.0 | 13.9% | 74 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 11.5% | 24 |
| d414.nano.Quantum 1.0.0 | 3.7 | 11.8% | 24 |
| hadur117.nano.SanaroSC 0.2 | 4.6 | 10.9% | 30 |
| gh.nano.Grofvuil 0.2 | 6.1 | 9.6% | 13 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.3% | 0 |
| fm.mammillarias 1.3 | 7.7 | 6.7% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.2 | 61.0 | 1 / 35 | 2364 |
| 2 | 5 | 54.9 | 58.1 | 5 / 35 | 2553 |
| 3 | 4 | 54.1 | 56.8 | 3 / 35 | 2488 |
| 4 | 4 | 56.3 | 61.3 | 5 / 35 | 2797 |
| 5 | 4 | 56.7 | 61.9 | 3 / 35 | 2590 |
| 6 | 5 | 56.6 | 63.2 | 3 / 35 | 2640 |
| 7 | 5 | 51.3 | 51.4 | 2 / 35 | 2282 |
| 8 | 5 | 52.6 | 54.3 | 3 / 35 | 2448 |
| 9 | 5 | 53.9 | 58.1 | 1 / 35 | 2456 |
| 10 | 5 | 54.1 | 55.9 | 4 / 35 | 2729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 43 | 30% |
| gh.mini.Griezel 0.2 | 33 | 45% |
| d414.nano.Quantum 1.0.0 | 8 | 13% |
| spinnercat.micro.Tyger 0.1 | 5 | 20% |
| gh.nano.Grofvuil 0.2 | 2 | 0% |

Hadur died in 321 of 350 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 85 | 26% | 100 |
| abc.Shadow 3.84i | 80 | 25% | 92 |
| spinnercat.micro.Tyger 0.1 | 53 | 17% | 54 |
| d414.nano.Quantum 1.0.0 | 45 | 14% | 47 |
| gh.nano.Grofvuil 0.2 | 23 | 7% | 23 |
| fm.mammillarias 1.3 | 18 | 6% | 18 |
| Gecko.ultimateGeckoBot 1.0 | 9 | 3% | 9 |
| timmit.nano.TimDog 0.33 | 5 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 75.3 | 126 / 350 | 3.22 | 14.7% | 34761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.4% | 104 |
| hadur117.nano.SanaroSC 0.2 | 1.6 | 14.7% | 126 |
| apc.botM 3.0 | 3.4 | 12.5% | 48 |
| lxx.ConceptA 0.8 | 4.1 | 11.4% | 11 |
| vjik.UnViolation 1.1 | 4.6 | 10.9% | 33 |
| bayen.UbaMicro 1.4 | 5.9 | 9.2% | 14 |
| panzer.Panzer 0.2 | 7.5 | 7.3% | 2 |
| conscience.Electron 1.3g | 8.3 | 6.6% | 1 |
| yk.JahMicro 1.0 | 8.5 | 6.7% | 5 |
| donjezza.Jezza 1.0 | 9.7 | 5.2% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 82.5 | 15 / 35 | 3456 |
| 2 | 1 | 62.3 | 80.0 | 14 / 35 | 2943 |
| 3 | 2 | 63.1 | 76.8 | 11 / 35 | 3801 |
| 4 | 2 | 59.2 | 67.3 | 9 / 35 | 3458 |
| 5 | 2 | 60.1 | 70.8 | 11 / 35 | 3329 |
| 6 | 1 | 62.0 | 74.9 | 15 / 35 | 3497 |
| 7 | 2 | 62.5 | 73.7 | 14 / 35 | 3805 |
| 8 | 2 | 61.5 | 72.4 | 16 / 35 | 3427 |
| 9 | 2 | 60.1 | 72.1 | 7 / 35 | 3378 |
| 10 | 1 | 64.2 | 82.5 | 14 / 35 | 3667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 89 | 53% |
| apc.botM 3.0 | 40 | 68% |
| vjik.UnViolation 1.1 | 25 | 64% |
| lxx.ConceptA 0.8 | 21 | 86% |
| donjezza.Jezza 1.0 | 6 | 83% |
| yk.JahMicro 1.0 | 6 | 67% |
| bayen.UbaMicro 1.4 | 6 | 50% |
| panzer.Panzer 0.2 | 5 | 80% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 225 of 350 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 64 | 28% | 116 |
| lxx.ConceptA 0.8 | 44 | 20% | 52 |
| apc.botM 3.0 | 36 | 16% | 68 |
| vjik.UnViolation 1.1 | 21 | 9% | 39 |
| bayen.UbaMicro 1.4 | 21 | 9% | 26 |
| panzer.Panzer 0.2 | 17 | 8% | 18 |
| conscience.Electron 1.3g | 12 | 5% | 14 |
| yk.JahMicro 1.0 | 8 | 4% | 11 |
| donjezza.Jezza 1.0 | 2 | 1% | 6 |

## Melee bench: F33

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 69.6 | 63 / 350 | 3.74 | 14.0% | 36838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.6% | 134 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.6% | 68 |
| hadur117.nano.SanaroSC 0.2 | 2.6 | 14.0% | 63 |
| labg.Cataclysm 2.05 | 4.4 | 11.0% | 39 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 11.2% | 34 |
| baal.nano.N 1.42 | 6.2 | 9.2% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.2% | 9 |
| zyx.micro.Ant 1.1 | 8.2 | 5.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.4 | 4.7% | 2 |
| sanja.First 0.1 | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 70.5 | 4 / 35 | 4097 |
| 2 | 3 | 61.4 | 69.8 | 6 / 35 | 3485 |
| 3 | 3 | 61.5 | 70.8 | 10 / 35 | 3489 |
| 4 | 2 | 62.7 | 72.4 | 7 / 35 | 4154 |
| 5 | 2 | 59.9 | 67.0 | 6 / 35 | 3586 |
| 6 | 3 | 61.2 | 72.1 | 4 / 35 | 3713 |
| 7 | 2 | 61.8 | 72.1 | 7 / 35 | 3474 |
| 8 | 2 | 63.8 | 78.7 | 8 / 35 | 3772 |
| 9 | 3 | 57.9 | 60.0 | 6 / 35 | 3511 |
| 10 | 3 | 58.5 | 62.2 | 5 / 35 | 3557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 55 | 42% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 17% |
| labg.Cataclysm 2.05 | 16 | 38% |
| gre.svman4.Leonidas 1.3.2 | 14 | 86% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 60% |
| baal.nano.N 1.42 | 5 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 1084. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 113 | 39% | 140 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 75 | 26% | 85 |
| gre.svman4.Leonidas 1.3.2 | 34 | 12% | 45 |
| labg.Cataclysm 2.05 | 22 | 8% | 29 |
| kinsen.melee.Angsaichmophobia 1.8c | 20 | 7% | 21 |
| baal.nano.N 1.42 | 14 | 5% | 17 |
| sanja.First 0.1 | 4 | 1% | 6 |
| zyx.micro.Ant 1.1 | 3 | 1% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 1% | 2 |

## Melee bench: F34

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 73.1 | 42 / 350 | 3.42 | 13.7% | 34490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.3 | 17.8% | 128 |
| stelo.Spread 0.9 | 1.7 | 17.1% | 129 |
| hadur117.nano.SanaroSC 0.2 | 3.0 | 13.7% | 42 |
| tcf.Reach 3 | 4.5 | 11.0% | 10 |
| jcs.Seth 1.8 | 4.7 | 11.6% | 33 |
| cli.Dancer 1.1 | 5.8 | 9.6% | 8 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 8.8 | 4.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 76.2 | 5 / 35 | 3518 |
| 2 | 3 | 60.9 | 68.9 | 3 / 35 | 3786 |
| 3 | 3 | 60.3 | 69.2 | 4 / 35 | 3467 |
| 4 | 3 | 61.1 | 72.4 | 4 / 35 | 3196 |
| 5 | 3 | 60.6 | 68.6 | 3 / 35 | 3440 |
| 6 | 3 | 61.0 | 74.6 | 4 / 35 | 3105 |
| 7 | 3 | 61.7 | 72.7 | 2 / 35 | 3540 |
| 8 | 3 | 59.8 | 68.6 | 1 / 35 | 3165 |
| 9 | 3 | 64.3 | 81.0 | 8 / 35 | 3792 |
| 10 | 3 | 64.0 | 79.0 | 8 / 35 | 3481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 61 | 13% |
| stelo.Spread 0.9 | 53 | 40% |
| jcs.Seth 1.8 | 12 | 42% |
| tcf.Reach 3 | 10 | 40% |
| cli.Dancer 1.1 | 4 | 50% |
| ratosh.Wesco 1.4 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 309 of 350 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 136 | 44% | 140 |
| stelo.Spread 0.9 | 93 | 30% | 112 |
| jcs.Seth 1.8 | 27 | 9% | 36 |
| tcf.Reach 3 | 19 | 6% | 24 |
| cli.Dancer 1.1 | 17 | 6% | 21 |
| ratosh.Wesco 1.4 | 13 | 4% | 14 |
| sample.VelociRobot 1.0 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 67.0 | 21 / 350 | 3.97 | 12.1% | 25904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.3% | 263 |
| gh.mini.Gruwel 0.9 | 2.2 | 13.8% | 41 |
| rz.HawkOnFire 0.1 | 3.8 | 12.2% | 9 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.9 | 11.8% | 17 |
| hadur117.nano.SanaroSC 0.2 | 4.1 | 12.1% | 21 |
| wit.Chuliath 1.0 | 6.8 | 7.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.9 | 6.9% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 8.9 | 5.2% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.9 | 69.8 | 3 / 35 | 2392 |
| 2 | 4 | 58.6 | 68.9 | 1 / 35 | 2731 |
| 3 | 5 | 58.9 | 70.2 | 3 / 35 | 2557 |
| 4 | 4 | 58.8 | 67.6 | 2 / 35 | 2805 |
| 5 | 5 | 55.8 | 62.9 | 0 / 35 | 2283 |
| 6 | 5 | 57.5 | 64.1 | 3 / 35 | 2719 |
| 7 | 4 | 57.4 | 67.0 | 0 / 35 | 2567 |
| 8 | 4 | 57.3 | 66.0 | 3 / 35 | 2609 |
| 9 | 3 | 57.6 | 65.7 | 3 / 35 | 2790 |
| 10 | 4 | 58.2 | 67.9 | 3 / 35 | 2451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 68 | 0% |
| gh.mini.Gruwel 0.9 | 25 | 44% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 56% |
| rz.HawkOnFire 0.1 | 7 | 57% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 330 of 350 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 156 | 47% | 157 |
| gh.mini.Gruwel 0.9 | 62 | 19% | 72 |
| rz.HawkOnFire 0.1 | 47 | 14% | 51 |
| dmh.robocode.robot.BlackDeath 9.2 | 31 | 9% | 36 |
| dans.Cinnamon 1.2 | 9 | 3% | 9 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8 | 2% | 8 |
| myl.nano.KomoriNinja 1.1 | 6 | 2% | 6 |
| stelo.MyAgileRobot 0.2 | 6 | 2% | 6 |
| wit.Chuliath 1.0 | 4 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 73.7 | 109 / 350 | 3.36 | 14.8% | 35503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroSC 0.2 | 1.1 | 14.8% | 109 |
| bzdp.Pansy 2.1 | 2.6 | 13.0% | 68 |
| alpha.RainingFire 1.0 | 2.9 | 12.5% | 55 |
| mz.Cork 0.1 | 4.3 | 11.4% | 30 |
| bvh.micro.Freya 0.3 | 4.6 | 10.9% | 30 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.8% | 20 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.4% | 11 |
| squidM.TentalceMeleeNano 1.1 | 8.4 | 6.9% | 10 |
| dl.BetterWalls 1.0 | 8.6 | 6.7% | 2 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.8% | 15 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 79.4 | 14 / 35 | 3696 |
| 2 | 1 | 62.6 | 75.9 | 15 / 35 | 3385 |
| 3 | 1 | 62.0 | 75.2 | 9 / 35 | 3620 |
| 4 | 1 | 60.9 | 71.4 | 9 / 35 | 3648 |
| 5 | 1 | 62.0 | 74.0 | 11 / 35 | 3466 |
| 6 | 1 | 59.9 | 69.5 | 6 / 35 | 3687 |
| 7 | 1 | 62.1 | 74.9 | 12 / 35 | 3467 |
| 8 | 2 | 58.8 | 67.0 | 6 / 35 | 3459 |
| 9 | 1 | 62.1 | 74.3 | 12 / 35 | 3434 |
| 10 | 1 | 63.2 | 75.9 | 15 / 35 | 3641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 39% |
| bvh.micro.Freya 0.3 | 32 | 75% |
| mz.Cork 0.1 | 28 | 82% |
| alpha.RainingFire 1.0 | 26 | 38% |
| m3thos.Eva02 0.7.1 | 21 | 71% |
| bvh.mini.Fenrir 0.39 | 14 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 14% |
| squidM.TentalceMeleeNano 1.1 | 5 | 20% |
| dl.BetterWalls 1.0 | 4 | 100% |

Hadur died in 241 of 350 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 52 | 22% | 76 |
| alpha.RainingFire 1.0 | 49 | 20% | 59 |
| bvh.mini.Fenrir 0.39 | 35 | 15% | 38 |
| bvh.micro.Freya 0.3 | 26 | 11% | 44 |
| m3thos.Eva02 0.7.1 | 25 | 10% | 41 |
| mz.Cork 0.1 | 22 | 9% | 44 |
| squidM.TentalceMeleeNano 1.1 | 18 | 7% | 20 |
| dl.BetterWalls 1.0 | 7 | 3% | 17 |
| sample.MyFirstRobot 1.0 | 7 | 3% | 11 |

## Melee bench: F37

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 76.8 | 118 / 350 | 3.09 | 15.1% | 41542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroSC 0.2 | 1.0 | 15.1% | 118 |
| germ.TheMind .2 | 2.9 | 11.7% | 52 |
| EBBU.Sim2 1.02 | 3.5 | 10.9% | 32 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.1 | 10.8% | 32 |
| agrach.Dalek 1.0 | 5.6 | 9.4% | 35 |
| lmk.ACPFinal 0.1 | 6.5 | 8.9% | 18 |
| stelo.UntouchableNano 1.3 | 6.8 | 9.0% | 27 |
| mb.Beast 0.1 | 7.6 | 8.5% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.1% | 3 |
| skm.Ryubot 1.0 | 9.0 | 7.7% | 19 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 75.9 | 12 / 35 | 4416 |
| 2 | 1 | 61.3 | 76.8 | 11 / 35 | 3990 |
| 3 | 1 | 64.0 | 83.8 | 17 / 35 | 4057 |
| 4 | 1 | 58.8 | 68.3 | 8 / 35 | 3951 |
| 5 | 1 | 62.8 | 78.4 | 15 / 35 | 4397 |
| 6 | 1 | 63.8 | 81.0 | 15 / 35 | 4282 |
| 7 | 1 | 60.8 | 73.3 | 8 / 35 | 4490 |
| 8 | 1 | 60.0 | 73.7 | 8 / 35 | 4005 |
| 9 | 1 | 61.7 | 79.0 | 12 / 35 | 3805 |
| 10 | 1 | 61.9 | 77.5 | 12 / 35 | 4149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 43 | 49% |
| EBBU.Sim2 1.02 | 33 | 48% |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 56% |
| agrach.Dalek 1.0 | 24 | 71% |
| stelo.UntouchableNano 1.3 | 20 | 65% |
| mb.Beast 0.1 | 18 | 78% |
| lmk.ACPFinal 0.1 | 18 | 67% |
| skm.Ryubot 1.0 | 16 | 44% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 100% |

Hadur died in 239 of 350 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 53 | 22% | 62 |
| germ.TheMind .2 | 50 | 21% | 70 |
| com.syncleus.robocode.Dreadnaught 0.1 | 31 | 13% | 46 |
| lmk.ACPFinal 0.1 | 23 | 10% | 29 |
| agrach.Dalek 1.0 | 21 | 9% | 41 |
| stelo.UntouchableNano 1.3 | 21 | 9% | 29 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 6% | 23 |
| skm.Ryubot 1.0 | 13 | 5% | 20 |
| mb.Beast 0.1 | 12 | 5% | 26 |
1 death(s) with no robot to name.

## Melee bench: F38

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 61.9 | 43 / 350 | 4.43 | 11.5% | 27070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.7% | 148 |
| bvh.mini.Freya 0.55 | 2.3 | 13.2% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.4% | 24 |
| cs.Wren 1.0 | 4.5 | 11.5% | 26 |
| hadur117.nano.SanaroSC 0.2 | 4.6 | 11.5% | 43 |
| bts.mega.Gnarly 1.4 | 4.7 | 11.4% | 55 |
| kdf.KoulDestroyer 1.0 | 6.6 | 9.5% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.3% | 3 |
| bzdp.BoxCar 2.0 | 9.2 | 4.4% | 0 |
| matt.UnderDark3 2.4.34 | 9.7 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 68.6 | 8 / 35 | 3263 |
| 2 | 7 | 51.4 | 51.4 | 2 / 35 | 2547 |
| 3 | 5 | 56.3 | 62.9 | 4 / 35 | 2690 |
| 4 | 3 | 57.3 | 65.7 | 4 / 35 | 2829 |
| 5 | 6 | 55.3 | 62.5 | 4 / 35 | 2284 |
| 6 | 5 | 55.7 | 61.3 | 6 / 35 | 2559 |
| 7 | 3 | 57.2 | 64.1 | 4 / 35 | 3079 |
| 8 | 6 | 56.1 | 62.2 | 3 / 35 | 2580 |
| 9 | 5 | 53.4 | 56.2 | 3 / 35 | 2463 |
| 10 | 4 | 57.2 | 63.8 | 5 / 35 | 2776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 46 | 41% |
| bts.mega.Gnarly 1.4 | 18 | 33% |
| bvh.mini.Freya 0.55 | 13 | 69% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 18% |
| cs.Wren 1.0 | 7 | 71% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 33% |
| kdf.KoulDestroyer 1.0 | 1 | 100% |

Hadur died in 309 of 350 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 85 | 28% | 107 |
| kdf.KoulDestroyer 1.0 | 47 | 15% | 47 |
| bvh.mini.Freya 0.55 | 43 | 14% | 50 |
| bts.mega.Gnarly 1.4 | 43 | 14% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 14% | 44 |
| cs.Wren 1.0 | 31 | 10% | 37 |
| matt.UnderDark3 2.4.34 | 7 | 2% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 2% | 6 |
| bzdp.BoxCar 2.0 | 4 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 66.1 | 42 / 350 | 4.05 | 12.6% | 32834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.3% | 74 |
| az.Ololobot 0.2.4 | 2.0 | 14.0% | 136 |
| hadur117.nano.SanaroSC 0.2 | 2.8 | 12.6% | 42 |
| catcat20.Lambda 0.024 | 4.1 | 11.2% | 45 |
| stelo.SoRobotNanoMelee 1.2 | 5.4 | 9.8% | 30 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.9% | 10 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.8% | 7 |
| gimp.GimpBot 0.1 | 7.7 | 8.0% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 6.5% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.4 | 61.3 | 4 / 35 | 3015 |
| 2 | 3 | 57.3 | 64.1 | 6 / 35 | 3308 |
| 3 | 3 | 60.0 | 71.1 | 5 / 35 | 3667 |
| 4 | 3 | 58.0 | 67.6 | 4 / 35 | 3320 |
| 5 | 2 | 57.9 | 68.3 | 6 / 35 | 3115 |
| 6 | 3 | 58.0 | 68.6 | 4 / 35 | 3186 |
| 7 | 2 | 59.2 | 70.8 | 4 / 35 | 3456 |
| 8 | 3 | 55.6 | 60.6 | 4 / 35 | 3202 |
| 9 | 3 | 56.7 | 63.5 | 3 / 35 | 3216 |
| 10 | 3 | 57.0 | 64.8 | 2 / 35 | 3349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 46 | 15% |
| bvh.fry.Freya 0.82 | 35 | 34% |
| catcat20.Lambda 0.024 | 21 | 52% |
| stelo.SoRobotNanoMelee 1.2 | 11 | 55% |
| winamp32.micro.MicroMacro 1.0 | 6 | 50% |
| apollokidd.ApolloKidd 0.9 | 4 | 0% |
| gimp.GimpBot 0.1 | 3 | 67% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 50% |

Hadur died in 308 of 350 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 98 | 32% | 106 |
| az.Ololobot 0.2.4 | 66 | 21% | 72 |
| apollokidd.ApolloKidd 0.9 | 40 | 13% | 40 |
| stelo.SoRobotNanoMelee 1.2 | 34 | 11% | 37 |
| catcat20.Lambda 0.024 | 31 | 10% | 45 |
| winamp32.micro.MicroMacro 1.0 | 13 | 4% | 19 |
| gimp.GimpBot 0.1 | 9 | 3% | 12 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 3% | 10 |
| dcs.Eater_of_Worlds 1.1.3-A | 8 | 3% | 8 |

## Melee bench: F41

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 68.5 | 80 / 350 | 3.83 | 13.2% | 30415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.9% | 154 |
| ary.Swarm 1.1 | 2.7 | 13.5% | 27 |
| hadur117.nano.SanaroSC 0.2 | 3.0 | 13.2% | 80 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 13.1% | 40 |
| simonton.nano.MeleeSeed 1.8 | 4.6 | 12.0% | 34 |
| shrub.Silver v048 | 6.2 | 8.8% | 7 |
| zyx.nano.Ant 1.1 | 6.9 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.3% | 8 |
| stelo.Mirror 1.1 | 8.7 | 5.8% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 68.9 | 10 / 35 | 3330 |
| 2 | 3 | 59.4 | 68.6 | 8 / 35 | 2802 |
| 3 | 4 | 58.9 | 66.7 | 5 / 35 | 2958 |
| 4 | 2 | 61.1 | 73.0 | 11 / 35 | 2682 |
| 5 | 2 | 61.9 | 74.0 | 10 / 35 | 3134 |
| 6 | 3 | 59.9 | 68.6 | 6 / 35 | 2962 |
| 7 | 5 | 57.9 | 64.4 | 6 / 35 | 2839 |
| 8 | 3 | 59.2 | 63.5 | 10 / 35 | 3232 |
| 9 | 2 | 61.2 | 70.2 | 11 / 35 | 3368 |
| 10 | 3 | 59.0 | 67.6 | 3 / 35 | 3108 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 81 | 47% |
| lessonz.robocode.Oz 0.5.0 | 22 | 64% |
| ary.Swarm 1.1 | 21 | 62% |
| simonton.nano.MeleeSeed 1.8 | 12 | 75% |
| shrub.Silver v048 | 3 | 33% |
| stelo.Mirror 1.1 | 2 | 100% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 270 of 350 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 98 | 36% | 133 |
| ary.Swarm 1.1 | 65 | 24% | 83 |
| lessonz.robocode.Oz 0.5.0 | 36 | 13% | 43 |
| simonton.nano.MeleeSeed 1.8 | 28 | 10% | 38 |
| shrub.Silver v048 | 20 | 7% | 23 |
| zyx.nano.Ant 1.1 | 12 | 4% | 12 |
| stelo.Mirror 1.1 | 6 | 2% | 10 |
| jsal.Jsalbot 1.0 | 3 | 1% | 6 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 70.5 | 62 / 350 | 3.65 | 13.6% | 35430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.3% | 163 |
| ara.Shera 0.88 | 2.7 | 14.3% | 74 |
| maribo.mini.MiniQuester 0.1 | 2.7 | 14.2% | 36 |
| hadur117.nano.SanaroSC 0.2 | 3.5 | 13.6% | 62 |
| amz.NanoClone 1.41 | 5.0 | 9.4% | 7 |
| maribo.IotaCT 1.1 | 6.4 | 7.5% | 2 |
| dsw.StaticD 1.0 | 6.9 | 7.2% | 6 |
| stelo.MirrorMicro 1.0 | 8.3 | 6.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.9 | 5.5% | 1 |
| mme.NikeEnhanced 2.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 70.5 | 6 / 35 | 3428 |
| 2 | 4 | 58.0 | 63.8 | 3 / 35 | 3460 |
| 3 | 4 | 59.7 | 67.3 | 7 / 35 | 3491 |
| 4 | 4 | 58.9 | 67.0 | 5 / 35 | 3263 |
| 5 | 2 | 60.9 | 71.1 | 8 / 35 | 3825 |
| 6 | 4 | 61.3 | 74.0 | 7 / 35 | 3510 |
| 7 | 4 | 61.2 | 73.0 | 7 / 35 | 3459 |
| 8 | 2 | 63.7 | 77.1 | 8 / 35 | 4164 |
| 9 | 4 | 60.8 | 71.4 | 4 / 35 | 3475 |
| 10 | 4 | 59.9 | 69.8 | 7 / 35 | 3355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 77 | 45% |
| ara.Shera 0.88 | 30 | 37% |
| maribo.mini.MiniQuester 0.1 | 18 | 67% |
| maribo.IotaCT 1.1 | 3 | 67% |
| dsw.StaticD 1.0 | 2 | 100% |

Hadur died in 288 of 350 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 93 | 32% | 125 |
| ara.Shera 0.88 | 86 | 30% | 96 |
| maribo.mini.MiniQuester 0.1 | 68 | 24% | 83 |
| amz.NanoClone 1.41 | 14 | 5% | 14 |
| maribo.IotaCT 1.1 | 10 | 3% | 12 |
| dsw.StaticD 1.0 | 7 | 2% | 10 |
| mme.NikeEnhanced 2.0 | 5 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 1% | 3 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 64.3 | 18 / 350 | 4.22 | 12.0% | 29266 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.0% | 276 |
| brainfade.melee.Dusk 0.44 | 2.4 | 12.9% | 29 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.3% | 18 |
| hadur117.nano.SanaroSC 0.2 | 3.8 | 12.0% | 18 |
| wcsv.melee.EngineerMelee 0.1 | 4.9 | 11.1% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.8% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.7% | 2 |
| jab.DiamondStealer 5 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 67.6 | 1 / 35 | 3247 |
| 2 | 4 | 58.5 | 64.4 | 1 / 35 | 2790 |
| 3 | 4 | 61.4 | 67.0 | 4 / 35 | 3525 |
| 4 | 4 | 58.4 | 62.9 | 1 / 35 | 2875 |
| 5 | 4 | 57.4 | 61.9 | 0 / 35 | 2800 |
| 6 | 4 | 58.0 | 61.0 | 0 / 35 | 2888 |
| 7 | 2 | 62.4 | 73.0 | 6 / 35 | 3170 |
| 8 | 4 | 58.3 | 61.9 | 1 / 35 | 2944 |
| 9 | 4 | 58.8 | 65.7 | 2 / 35 | 2517 |
| 10 | 5 | 56.4 | 57.1 | 2 / 35 | 2510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 64 | 13% |
| brainfade.melee.Dusk 0.44 | 13 | 46% |
| dummy.micro.Sparrow 2.5 | 10 | 30% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 20% |
| mz.NanoGod 2.02 | 1 | 0% |

Hadur died in 332 of 350 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 161 | 48% | 168 |
| dummy.micro.Sparrow 2.5 | 54 | 16% | 59 |
| brainfade.melee.Dusk 0.44 | 47 | 14% | 52 |
| wcsv.melee.EngineerMelee 0.1 | 30 | 9% | 31 |
| mz.NanoGod 2.02 | 15 | 5% | 15 |
| jab.DiamondStealer 5 | 11 | 3% | 11 |
| Krabb.akim2.Akim2 1.1b | 9 | 3% | 9 |
| cvt.Firsty 1.0 | 5 | 2% | 5 |

## Melee bench: F44

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 69.0 | 63 / 350 | 3.79 | 13.7% | 35839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 16.9% | 154 |
| tzu.TheArtOfWar 1.2 | 2.2 | 14.8% | 83 |
| hadur117.nano.SanaroSC 0.2 | 2.7 | 13.7% | 63 |
| wompi.Quokka 1.6 | 4.5 | 11.3% | 19 |
| jwirde.Gort 2.0 | 4.6 | 10.8% | 24 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 9.1% | 5 |
| disan.Chair 2.2.0 | 7.5 | 7.2% | 3 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.6% | 1 |
| sample.Crazy 1.0 | 9.1 | 5.0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 74.3 | 6 / 35 | 3563 |
| 2 | 2 | 61.4 | 70.8 | 8 / 35 | 3631 |
| 3 | 3 | 60.5 | 67.9 | 6 / 35 | 3564 |
| 4 | 3 | 60.0 | 66.3 | 6 / 35 | 3604 |
| 5 | 3 | 60.7 | 68.3 | 6 / 35 | 3814 |
| 6 | 3 | 59.8 | 68.6 | 7 / 35 | 3349 |
| 7 | 2 | 62.2 | 73.7 | 10 / 35 | 3579 |
| 8 | 3 | 58.9 | 64.1 | 4 / 35 | 3668 |
| 9 | 2 | 61.7 | 74.9 | 5 / 35 | 3689 |
| 10 | 3 | 57.6 | 61.6 | 5 / 35 | 3378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 68 | 47% |
| tzu.TheArtOfWar 1.2 | 47 | 19% |
| jwirde.Gort 2.0 | 15 | 73% |
| wompi.Quokka 1.6 | 11 | 55% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 60% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 287 of 350 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 90 | 31% | 127 |
| tzu.TheArtOfWar 1.2 | 79 | 28% | 91 |
| jwirde.Gort 2.0 | 31 | 11% | 40 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 31 | 11% | 33 |
| wompi.Quokka 1.6 | 30 | 10% | 32 |
| stf.PanzerGeneral 0.1 | 13 | 5% | 13 |
| disan.Chair 2.2.0 | 7 | 2% | 8 |
| sample.Crazy 1.0 | 3 | 1% | 3 |
| amk.jointstrike.JointStrike 0.2 | 3 | 1% | 3 |

## Melee bench: F45

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 71.2 | 68 / 350 | 3.59 | 14.7% | 39625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroSC 0.2 | 1.3 | 14.7% | 68 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 13.1% | 180 |
| jje.BagPuss 1.2 | 2.7 | 12.6% | 29 |
| sul.Lunar 1.1 | 4.0 | 11.6% | 39 |
| myl.nano.Graviton 1.10 | 4.8 | 10.6% | 11 |
| hvilela.HVilela 0.9 | 6.5 | 8.8% | 1 |
| fm.claire 1.7 | 6.9 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 8.2% | 8 |
| wit.Deep7 2.0 | 9.1 | 6.6% | 13 |
| abud.ThirdRobo 1.0 | 9.9 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 65.1 | 5 / 35 | 3610 |
| 2 | 1 | 60.8 | 68.9 | 9 / 35 | 3927 |
| 3 | 1 | 60.7 | 68.6 | 8 / 35 | 3783 |
| 4 | 1 | 63.2 | 76.2 | 7 / 35 | 4276 |
| 5 | 1 | 62.5 | 72.1 | 9 / 35 | 4260 |
| 6 | 1 | 62.5 | 76.8 | 6 / 35 | 3721 |
| 7 | 2 | 61.5 | 69.5 | 5 / 35 | 4130 |
| 8 | 1 | 63.2 | 77.1 | 7 / 35 | 4060 |
| 9 | 2 | 59.8 | 66.3 | 5 / 35 | 3910 |
| 10 | 1 | 61.9 | 71.4 | 7 / 35 | 3948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 98 | 34% |
| sul.Lunar 1.1 | 24 | 25% |
| jje.BagPuss 1.2 | 20 | 50% |
| myl.nano.Graviton 1.10 | 9 | 78% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 78% |
| wit.Deep7 2.0 | 6 | 67% |
| hvilela.HVilela 0.9 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 0% |

Hadur died in 282 of 350 rounds, at a mean tick of 1246. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 73 | 26% | 0 |
| sul.Lunar 1.1 | 49 | 17% | 98 |
| myl.nano.Graviton 1.10 | 40 | 14% | 63 |
| jje.BagPuss 1.2 | 37 | 13% | 76 |
| fm.claire 1.7 | 31 | 11% | 36 |
| hvilela.HVilela 0.9 | 23 | 8% | 26 |
| wit.Deep7 2.0 | 14 | 5% | 18 |
| pez.mini.ChironexFleckeri 0.5 | 10 | 4% | 21 |
| abud.ThirdRobo 1.0 | 5 | 2% | 9 |

## Melee bench: F46

hadur117.nano.SanaroSC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 69.0 | 38 / 350 | 3.79 | 12.6% | 28923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.9% | 139 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.0% | 131 |
| hadur117.nano.SanaroSC 0.2 | 3.1 | 12.6% | 38 |
| mz.MicroSheep 1.0 | 4.4 | 11.1% | 9 |
| cx.Princess 1.0 | 4.5 | 10.7% | 26 |
| sadoner.killer 0.2 | 6.0 | 9.3% | 3 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.0% | 4 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.3% | 0 |
| kurios.DOSexe .9a | 9.1 | 4.4% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 66.7 | 1 / 35 | 2907 |
| 2 | 4 | 58.1 | 67.6 | 4 / 35 | 2736 |
| 3 | 3 | 62.4 | 75.6 | 5 / 35 | 3675 |
| 4 | 3 | 61.8 | 75.2 | 7 / 35 | 3073 |
| 5 | 3 | 58.4 | 67.0 | 5 / 35 | 2834 |
| 6 | 3 | 60.1 | 74.0 | 5 / 35 | 2651 |
| 7 | 3 | 57.7 | 64.1 | 2 / 35 | 2925 |
| 8 | 3 | 57.2 | 65.1 | 3 / 35 | 2640 |
| 9 | 3 | 57.6 | 66.3 | 2 / 35 | 2731 |
| 10 | 3 | 58.2 | 67.9 | 4 / 35 | 2751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 67 | 31% |
| rsalesc.melee.Medina 0.4.5 | 39 | 21% |
| cx.Princess 1.0 | 8 | 50% |
| mz.MicroSheep 1.0 | 7 | 14% |
| arthord.NanoSatanMelee Beta | 4 | 75% |
| sadoner.killer 0.2 | 2 | 50% |

Hadur died in 312 of 350 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 104 | 33% | 125 |
| rsalesc.melee.Medina 0.4.5 | 91 | 29% | 99 |
| mz.MicroSheep 1.0 | 35 | 11% | 37 |
| sadoner.killer 0.2 | 29 | 9% | 30 |
| cx.Princess 1.0 | 25 | 8% | 30 |
| arthord.NanoSatanMelee Beta | 17 | 5% | 18 |
| jeremyreeder.collective.Prophet 5 | 9 | 3% | 9 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |
| kurios.DOSexe .9a | 1 | 0% | 1 |

