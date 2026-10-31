# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 75.4 | 63 / 350 | 3.22 | 14.2% | 37865 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 224 |
| hadur117.nano.SanaroL18 0.2 | 2.0 | 14.2% | 63 |
| sgp.JollyNinja 3.53 | 3.6 | 11.7% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.1% | 10 |
| mz.MicroGodMelee 1 | 4.6 | 11.3% | 8 |
| lorneswork.Predator 1.0 | 5.5 | 10.3% | 7 |
| adt.Ar2 1.0 | 7.2 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.9% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 77.1 | 3 / 35 | 4055 |
| 2 | 2 | 62.5 | 76.2 | 6 / 35 | 3870 |
| 3 | 2 | 63.1 | 77.5 | 9 / 35 | 4020 |
| 4 | 2 | 62.6 | 76.2 | 10 / 35 | 3557 |
| 5 | 2 | 62.0 | 74.6 | 7 / 35 | 3826 |
| 6 | 2 | 61.9 | 74.6 | 4 / 35 | 3936 |
| 7 | 2 | 62.4 | 77.8 | 6 / 35 | 3701 |
| 8 | 2 | 60.8 | 72.1 | 6 / 35 | 3543 |
| 9 | 2 | 62.1 | 74.0 | 7 / 35 | 3866 |
| 10 | 2 | 61.2 | 73.7 | 5 / 35 | 3491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 150 | 12% |
| sgp.JollyNinja 3.53 | 24 | 58% |
| mz.MicroGodMelee 1 | 24 | 92% |
| lorneswork.Predator 1.0 | 8 | 63% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 170 | 59% | 190 |
| sgp.JollyNinja 3.53 | 35 | 12% | 48 |
| lorneswork.Predator 1.0 | 24 | 8% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 8% | 25 |
| mz.MicroGodMelee 1 | 20 | 7% | 41 |
| adt.Ar2 1.0 | 7 | 2% | 9 |
| mym.EdgeStalker 1.0 | 5 | 2% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 69.0 | 64 / 350 | 3.79 | 14.0% | 39491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.7 | 14.8% | 101 |
| hadur117.nano.SanaroL18 0.2 | 2.1 | 14.0% | 64 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.2 | 14.6% | 93 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.0% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.4% | 28 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.2% | 6 |
| sch.Simone 0.3d | 6.9 | 8.1% | 19 |
| Noran.BitchingElk 0.054 | 7.4 | 7.9% | 20 |
| stelo.PatternRobot 1.0 | 8.9 | 6.5% | 13 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 67.3 | 4 / 35 | 3625 |
| 2 | 2 | 58.5 | 62.9 | 6 / 35 | 3854 |
| 3 | 3 | 57.9 | 62.9 | 4 / 35 | 3731 |
| 4 | 3 | 58.1 | 63.5 | 2 / 35 | 3951 |
| 5 | 3 | 60.1 | 67.0 | 9 / 35 | 3893 |
| 6 | 2 | 62.0 | 74.6 | 6 / 35 | 3921 |
| 7 | 1 | 61.8 | 71.1 | 8 / 35 | 4157 |
| 8 | 1 | 61.8 | 70.5 | 7 / 35 | 4225 |
| 9 | 1 | 63.2 | 76.5 | 9 / 35 | 4246 |
| 10 | 2 | 62.5 | 73.3 | 9 / 35 | 3888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 58 | 24% |
| pulsar.PulsarMax 0.8.9 | 48 | 38% |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 61% |
| Noran.BitchingElk 0.054 | 14 | 43% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| sch.Simone 0.3d | 9 | 22% |
| stelo.PatternRobot 1.0 | 5 | 40% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |
| fullsail.SweetTea 1.1 | 1 | 0% |

Hadur died in 286 of 350 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 79 | 28% | 97 |
| pulsar.PulsarMax 0.8.9 | 63 | 22% | 81 |
| lrem.micro.SpikeSoldier 0.4 | 30 | 10% | 32 |
| com.cohesiva.robocode.ManOwaR 1.0 | 28 | 10% | 40 |
| stelo.PatternRobot 1.0 | 24 | 8% | 27 |
| sch.Simone 0.3d | 20 | 7% | 23 |
| Noran.BitchingElk 0.054 | 16 | 6% | 23 |
| fnc.bandit.Bandit 5.2.0 | 15 | 5% | 16 |
| fullsail.SweetTea 1.1 | 11 | 4% | 11 |

## Melee bench: F03

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 78.7 | 79 / 350 | 2.92 | 15.0% | 41390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 1.5 | 15.1% | 90 |
| hadur117.nano.SanaroL18 0.2 | 2.1 | 15.0% | 79 |
| radnor.DoctorBob 1.42 | 2.4 | 14.7% | 96 |
| vuen.Cake 2.51 | 4.1 | 12.9% | 69 |
| urdos.URDOS 1.3 | 4.9 | 10.5% | 13 |
| adt.Ar1 2.1 | 6.7 | 7.5% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 6.9 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.9 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 77.5 | 9 / 35 | 4445 |
| 2 | 2 | 63.4 | 77.1 | 9 / 35 | 4494 |
| 3 | 1 | 62.6 | 79.4 | 8 / 35 | 3928 |
| 4 | 2 | 62.6 | 80.0 | 7 / 35 | 4010 |
| 5 | 2 | 63.5 | 81.6 | 11 / 35 | 3797 |
| 6 | 2 | 62.7 | 77.5 | 9 / 35 | 4390 |
| 7 | 3 | 62.8 | 77.1 | 7 / 35 | 4198 |
| 8 | 3 | 63.1 | 80.6 | 8 / 35 | 4038 |
| 9 | 3 | 60.8 | 74.3 | 6 / 35 | 3828 |
| 10 | 2 | 63.7 | 81.9 | 5 / 35 | 4262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 67 | 42% |
| vuen.Cake 2.51 | 58 | 50% |
| kawigi.nano.Lib 1.0 | 54 | 13% |
| urdos.URDOS 1.3 | 15 | 60% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 273 of 350 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 97 | 36% | 106 |
| radnor.DoctorBob 1.42 | 70 | 26% | 89 |
| vuen.Cake 2.51 | 49 | 18% | 80 |
| urdos.URDOS 1.3 | 40 | 15% | 49 |
| adt.Ar1 2.1 | 9 | 3% | 10 |
| ghent.ArthurPanzergon 1.0.0 | 5 | 2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 6 |

## Melee bench: F04

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 69.3 | 3 / 350 | 3.76 | 13.2% | 40078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 327 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 13.6% | 17 |
| hadur117.nano.SanaroL18 0.2 | 2.5 | 13.2% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 11.1% | 2 |
| josago.Jorgito 0.16 | 5.0 | 9.5% | 0 |
| tj.zombie1n 1.0.1 | 6.6 | 7.4% | 0 |
| css.Delitioner 0.11 | 6.6 | 7.4% | 1 |
| rampancy.Durandal 2.1d | 7.9 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.4 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 67.0 | 0 / 35 | 3783 |
| 2 | 2 | 62.2 | 74.6 | 0 / 35 | 3925 |
| 3 | 2 | 59.6 | 68.6 | 1 / 35 | 3530 |
| 4 | 2 | 64.0 | 74.3 | 1 / 35 | 4783 |
| 5 | 3 | 62.1 | 70.8 | 0 / 35 | 4148 |
| 6 | 2 | 61.1 | 69.8 | 0 / 35 | 3958 |
| 7 | 3 | 58.2 | 63.5 | 0 / 35 | 3495 |
| 8 | 2 | 61.8 | 69.8 | 0 / 35 | 4215 |
| 9 | 3 | 60.4 | 67.6 | 0 / 35 | 3952 |
| 10 | 3 | 60.8 | 67.0 | 1 / 35 | 4289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 124 | 2% |
| apc.LeeroyJenkins2 1.0 | 4 | 0% |
| css.Delitioner 0.11 | 1 | 0% |

Hadur died in 347 of 350 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 221 | 64% | 222 |
| apc.LeeroyJenkins2 1.0 | 47 | 14% | 49 |
| josago.Jorgito 0.16 | 40 | 12% | 40 |
| TNT.TNT 0.99.1 | 16 | 5% | 16 |
| css.Delitioner 0.11 | 9 | 3% | 9 |
| tj.zombie1n 1.0.1 | 9 | 3% | 9 |
| rampancy.Durandal 2.1d | 5 | 1% | 5 |

## Melee bench: F06

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 71.3 | 82 / 350 | 3.58 | 13.9% | 34771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.6 | 14.9% | 61 |
| origin.SleepSiphon 1.7b | 2.1 | 14.5% | 112 |
| hadur117.nano.SanaroL18 0.2 | 2.7 | 13.9% | 82 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.7% | 59 |
| mld.Wisdom 1.0 | 4.8 | 10.7% | 13 |
| gg.Wolverine 2.0 | 6.4 | 8.6% | 11 |
| spinnercat.Omen 1.0 | 7.4 | 7.7% | 3 |
| DBall.NUKE 0.1 | 7.7 | 7.3% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.8% | 2 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.4 | 71.4 | 6 / 35 | 3894 |
| 2 | 3 | 60.4 | 71.4 | 8 / 35 | 3061 |
| 3 | 2 | 62.4 | 74.6 | 12 / 35 | 3397 |
| 4 | 3 | 59.5 | 68.3 | 8 / 35 | 3372 |
| 5 | 2 | 62.2 | 75.9 | 8 / 35 | 3370 |
| 6 | 3 | 61.1 | 73.7 | 5 / 35 | 3536 |
| 7 | 2 | 59.6 | 66.0 | 8 / 35 | 3555 |
| 8 | 2 | 60.5 | 69.2 | 9 / 35 | 3487 |
| 9 | 2 | 61.9 | 72.1 | 11 / 35 | 3616 |
| 10 | 4 | 60.8 | 70.8 | 7 / 35 | 3483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 51 | 33% |
| jekl.StoneGhost 0.7 | 50 | 70% |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 38% |
| gg.Wolverine 2.0 | 7 | 43% |
| DBall.NUKE 0.1 | 7 | 71% |
| mld.Wisdom 1.0 | 6 | 83% |
| spinnercat.Omen 1.0 | 4 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 100% |

Hadur died in 268 of 350 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 78 | 29% | 98 |
| jekl.StoneGhost 0.7 | 74 | 28% | 103 |
| pe.minimelee.SandboxMiniMelee 1.1 | 56 | 21% | 69 |
| mld.Wisdom 1.0 | 26 | 10% | 31 |
| gg.Wolverine 2.0 | 12 | 4% | 15 |
| spinnercat.Omen 1.0 | 11 | 4% | 12 |
| DBall.NUKE 0.1 | 7 | 3% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 1% | 8 |
| sample.Fire 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.6 | 85 / 350 | 2.66 | 16.3% | 47430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.4 | 18.1% | 107 |
| rsalesc.melee.Monk 0.3.6c | 1.9 | 17.8% | 89 |
| hadur117.nano.SanaroL18 0.2 | 2.7 | 16.3% | 85 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.7% | 20 |
| franzor.Lizt 1.3.1 | 4.7 | 11.3% | 49 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.6 | 76.8 | 7 / 35 | 4699 |
| 2 | 3 | 66.3 | 78.4 | 7 / 35 | 4884 |
| 3 | 3 | 67.4 | 82.5 | 9 / 35 | 5145 |
| 4 | 2 | 67.3 | 83.5 | 10 / 35 | 4743 |
| 5 | 2 | 66.9 | 84.1 | 7 / 35 | 4699 |
| 6 | 3 | 65.8 | 79.0 | 7 / 35 | 4395 |
| 7 | 3 | 68.2 | 84.8 | 10 / 35 | 4821 |
| 8 | 3 | 67.4 | 85.1 | 9 / 35 | 4610 |
| 9 | 2 | 67.4 | 84.1 | 13 / 35 | 4490 |
| 10 | 3 | 65.7 | 77.1 | 6 / 35 | 4944 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 104 | 50% |
| rsalesc.melee.Monk 0.3.6c | 55 | 24% |
| franzor.Lizt 1.3.1 | 24 | 38% |
| oog.melee.CapuletDroid 1.1 | 19 | 58% |

Hadur died in 265 of 350 rounds, at a mean tick of 1351. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 127 | 48% | 191 |
| rsalesc.melee.Monk 0.3.6c | 84 | 32% | 101 |
| franzor.Lizt 1.3.1 | 24 | 9% | 6 |
| oog.melee.CapuletDroid 1.1 | 23 | 9% | 40 |
| lrem.micro.MoggFanatic 0.2 | 6 | 2% | 7 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 10 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 70.4 | 90 / 350 | 3.66 | 13.8% | 32710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| shrub.Vapour v159 | 2.0 | 13.9% | 86 |
| tm.Yuugao 1.0 | 2.0 | 14.5% | 95 |
| hadur117.nano.SanaroL18 0.2 | 2.1 | 13.8% | 90 |
| Krabb.sliNk.Garm 0.9u | 4.7 | 10.5% | 22 |
| com.spp.robocode.MostlyHarmless 010 | 4.9 | 9.8% | 23 |
| m3thos.Eva00 1.1 | 6.3 | 8.7% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.5% | 19 |
| SHAM.WOW 1.4 | 8.4 | 7.0% | 6 |
| zyx.nano.BacillusComma 1.0 | 8.9 | 6.9% | 2 |
| qualidafial.MajorDick 1.0.1 | 9.2 | 6.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.6 | 69.2 | 10 / 35 | 3386 |
| 2 | 2 | 58.9 | 67.6 | 8 / 35 | 3385 |
| 3 | 2 | 58.8 | 69.5 | 6 / 35 | 3189 |
| 4 | 3 | 56.8 | 61.9 | 7 / 35 | 3083 |
| 5 | 3 | 58.6 | 68.6 | 8 / 35 | 2919 |
| 6 | 3 | 61.0 | 73.3 | 8 / 35 | 3464 |
| 7 | 1 | 60.7 | 74.9 | 9 / 35 | 3032 |
| 8 | 2 | 59.1 | 67.9 | 7 / 35 | 3327 |
| 9 | 1 | 62.2 | 76.2 | 14 / 35 | 3415 |
| 10 | 2 | 62.3 | 75.2 | 13 / 35 | 3510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 65 | 57% |
| shrub.Vapour v159 | 30 | 33% |
| Krabb.sliNk.Garm 0.9u | 19 | 74% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 69% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 79% |
| m3thos.Eva00 1.1 | 7 | 57% |
| SHAM.WOW 1.4 | 3 | 33% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 261 of 350 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 76 | 29% | 90 |
| tm.Yuugao 1.0 | 59 | 23% | 98 |
| Krabb.sliNk.Garm 0.9u | 29 | 11% | 35 |
| com.spp.robocode.MostlyHarmless 010 | 27 | 10% | 37 |
| m3thos.Eva00 1.1 | 21 | 8% | 22 |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 7% | 30 |
| zyx.nano.BacillusComma 1.0 | 15 | 6% | 18 |
| SHAM.WOW 1.4 | 12 | 5% | 15 |
| qualidafial.MajorDick 1.0.1 | 5 | 2% | 5 |

## Melee bench: F09

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 63.7 | 53 / 350 | 4.26 | 12.3% | 29134 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.2% | 196 |
| kc.micro.Figment 1.0 | 2.0 | 14.9% | 50 |
| hadur117.nano.SanaroL18 0.2 | 3.4 | 12.3% | 53 |
| yagami.Tidus 0.11 | 3.7 | 11.8% | 7 |
| pedersen.Grishnakh 1.0 | 4.9 | 10.4% | 29 |
| mc2.enemy.Original 0.9 | 6.1 | 8.8% | 10 |
| dft.Calliope 5.6 | 6.9 | 7.8% | 6 |
| step.nanoPri 1.0 | 8.1 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.1 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.1 | 58.4 | 2 / 35 | 2596 |
| 2 | 4 | 56.6 | 60.3 | 4 / 35 | 2776 |
| 3 | 3 | 55.9 | 59.0 | 4 / 35 | 2994 |
| 4 | 3 | 59.4 | 68.9 | 6 / 35 | 3280 |
| 5 | 4 | 58.8 | 67.6 | 5 / 35 | 2793 |
| 6 | 4 | 57.4 | 61.3 | 6 / 35 | 2862 |
| 7 | 3 | 58.2 | 64.4 | 5 / 35 | 3007 |
| 8 | 3 | 60.0 | 67.3 | 8 / 35 | 3156 |
| 9 | 3 | 57.1 | 63.2 | 3 / 35 | 2776 |
| 10 | 3 | 59.2 | 67.0 | 10 / 35 | 2894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 57 | 26% |
| kc.micro.Figment 1.0 | 27 | 85% |
| pedersen.Grishnakh 1.0 | 10 | 30% |
| yagami.Tidus 0.11 | 8 | 88% |
| mc2.enemy.Original 0.9 | 6 | 67% |
| dft.Calliope 5.6 | 3 | 33% |

Hadur died in 298 of 350 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 97 | 33% | 112 |
| kc.micro.Figment 1.0 | 74 | 25% | 99 |
| yagami.Tidus 0.11 | 44 | 15% | 52 |
| pedersen.Grishnakh 1.0 | 32 | 11% | 32 |
| mc2.enemy.Original 0.9 | 20 | 7% | 24 |
| robar.nano.Assertive_Melee 0.2 | 10 | 3% | 10 |
| step.nanoPri 1.0 | 10 | 3% | 10 |
| dft.Calliope 5.6 | 5 | 2% | 6 |
| rdm.Dueler 0.4x | 5 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 79.7 | 110 / 350 | 2.83 | 15.4% | 40175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroL18 0.2 | 1.3 | 15.4% | 110 |
| DTF.Kludgy 1.2b | 2.3 | 14.6% | 78 |
| ejb.Polaris 1.0.1 | 3.2 | 13.4% | 53 |
| ne.Chimera 1.2 | 3.4 | 13.2% | 44 |
| tvv.micro.Antares 1.1.1 | 5.4 | 10.5% | 37 |
| vStar.RAFzilla 2.15 | 5.5 | 10.6% | 18 |
| sam.Samspin 1.0 | 7.2 | 6.8% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.4 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.6 | 5.3% | 4 |
| donjezza.Muncho 1.0 | 9.7 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 79.4 | 13 / 35 | 4064 |
| 2 | 2 | 64.0 | 81.9 | 12 / 35 | 3920 |
| 3 | 2 | 64.2 | 80.6 | 11 / 35 | 4018 |
| 4 | 2 | 61.8 | 74.9 | 7 / 35 | 3926 |
| 5 | 1 | 64.5 | 81.0 | 11 / 35 | 4416 |
| 6 | 1 | 63.0 | 79.4 | 10 / 35 | 3823 |
| 7 | 1 | 62.8 | 79.4 | 8 / 35 | 3910 |
| 8 | 1 | 63.7 | 76.2 | 14 / 35 | 4167 |
| 9 | 1 | 63.8 | 81.0 | 10 / 35 | 4110 |
| 10 | 1 | 64.4 | 83.5 | 14 / 35 | 3821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 52 | 77% |
| DTF.Kludgy 1.2b | 47 | 43% |
| ne.Chimera 1.2 | 40 | 53% |
| tvv.micro.Antares 1.1.1 | 23 | 26% |
| vStar.RAFzilla 2.15 | 18 | 78% |
| sam.Samspin 1.0 | 4 | 50% |
| donjezza.Muncho 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 50% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 242 of 350 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 87 | 36% | 107 |
| ne.Chimera 1.2 | 60 | 25% | 77 |
| ejb.Polaris 1.0.1 | 37 | 15% | 81 |
| tvv.micro.Antares 1.1.1 | 24 | 10% | 25 |
| vStar.RAFzilla 2.15 | 14 | 6% | 26 |
| sam.Samspin 1.0 | 13 | 5% | 17 |
| kurios.DOSexe .9b | 4 | 2% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 1% | 3 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 62.6 | 44 / 350 | 4.37 | 12.1% | 30316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.4% | 157 |
| cx.mini.Nimrod 0.55 | 2.5 | 12.9% | 43 |
| hadur117.nano.SanaroL18 0.2 | 3.2 | 12.1% | 44 |
| djc.DynaBot 0.1.1 | 3.7 | 11.2% | 33 |
| rdt199.Warlord 0.73 | 5.4 | 9.8% | 29 |
| br2.MobyDickBot 1.6 | 5.8 | 9.2% | 22 |
| uji.YellohFellah 1.0 | 6.9 | 8.6% | 18 |
| KiraNL.Chupacabra 0.4 | 7.5 | 8.1% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 9.1 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 69.2 | 7 / 35 | 3279 |
| 2 | 4 | 55.1 | 62.2 | 1 / 35 | 2689 |
| 3 | 2 | 56.5 | 61.0 | 4 / 35 | 3064 |
| 4 | 3 | 58.6 | 66.7 | 7 / 35 | 3147 |
| 5 | 4 | 55.9 | 59.7 | 4 / 35 | 3103 |
| 6 | 4 | 53.8 | 55.6 | 5 / 35 | 2740 |
| 7 | 3 | 58.8 | 67.0 | 7 / 35 | 3199 |
| 8 | 2 | 58.0 | 65.4 | 5 / 35 | 3146 |
| 9 | 3 | 56.8 | 64.4 | 3 / 35 | 2851 |
| 10 | 4 | 53.2 | 54.6 | 1 / 35 | 3098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 52 | 23% |
| cx.mini.Nimrod 0.55 | 16 | 50% |
| djc.DynaBot 0.1.1 | 13 | 54% |
| rdt199.Warlord 0.73 | 13 | 69% |
| br2.MobyDickBot 1.6 | 6 | 100% |
| uji.YellohFellah 1.0 | 6 | 0% |
| KiraNL.Chupacabra 0.4 | 4 | 50% |

Hadur died in 307 of 350 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 111 | 36% | 125 |
| cx.mini.Nimrod 0.55 | 53 | 17% | 58 |
| rdt199.Warlord 0.73 | 42 | 14% | 51 |
| djc.DynaBot 0.1.1 | 29 | 9% | 36 |
| KiraNL.Chupacabra 0.4 | 25 | 8% | 26 |
| br2.MobyDickBot 1.6 | 12 | 4% | 20 |
| uji.YellohFellah 1.0 | 12 | 4% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 4% | 12 |
| stelo.MirrorNano 1.3 | 10 | 3% | 10 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 69.9 | 61 / 350 | 3.71 | 13.3% | 28728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.8 | 14.6% | 106 |
| bts.wiki.RipCurl 0.9b | 1.9 | 14.4% | 72 |
| darkcanuck.Leon 1.01 | 3.0 | 13.3% | 67 |
| hadur117.nano.SanaroL18 0.2 | 3.3 | 13.3% | 61 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.7% | 25 |
| jrm.Test0 1.0 | 6.5 | 8.3% | 1 |
| jp.Perpy 16.0 | 7.3 | 7.3% | 3 |
| cs.sheldor.Talon 1.1 | 7.4 | 7.0% | 4 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.9% | 10 |
| stuff.Vlad 0.1 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 72.7 | 6 / 35 | 3058 |
| 2 | 4 | 57.1 | 65.4 | 4 / 35 | 2719 |
| 3 | 4 | 57.9 | 64.8 | 7 / 35 | 2651 |
| 4 | 2 | 62.4 | 78.4 | 7 / 35 | 3132 |
| 5 | 4 | 59.0 | 70.2 | 6 / 35 | 2740 |
| 6 | 2 | 61.8 | 74.0 | 11 / 35 | 3042 |
| 7 | 4 | 58.2 | 67.0 | 3 / 35 | 2949 |
| 8 | 4 | 58.5 | 67.9 | 6 / 35 | 2879 |
| 9 | 4 | 57.9 | 68.3 | 4 / 35 | 2693 |
| 10 | 3 | 59.6 | 70.5 | 7 / 35 | 2865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 17% |
| bts.wiki.RipCurl 0.9b | 48 | 54% |
| darkcanuck.Leon 1.01 | 45 | 31% |
| brainfade.melee.Genghis 0.36 | 12 | 67% |
| jaybot.bots.Oddball 4.0 | 5 | 0% |
| jrm.Test0 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 0% |

Hadur died in 291 of 350 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 86 | 30% | 99 |
| bts.wiki.RipCurl 0.9b | 64 | 22% | 84 |
| darkcanuck.Leon 1.01 | 56 | 19% | 72 |
| jrm.Test0 1.0 | 29 | 10% | 32 |
| brainfade.melee.Genghis 0.36 | 25 | 9% | 27 |
| jaybot.bots.Oddball 4.0 | 11 | 4% | 13 |
| jp.Perpy 16.0 | 10 | 3% | 11 |
| cs.sheldor.Talon 1.1 | 9 | 3% | 9 |
| stuff.Vlad 0.1 | 1 | 0% | 3 |

## Melee bench: F13

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 70.4 | 55 / 350 | 3.66 | 13.0% | 32080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.0% | 146 |
| ags.Glacier 0.2.11 | 1.6 | 17.0% | 94 |
| hadur117.nano.SanaroL18 0.2 | 3.4 | 13.0% | 55 |
| gh.micro.Gruweltje 0.7 | 4.3 | 12.0% | 24 |
| shinh.Entangled 0.3 | 4.3 | 12.4% | 27 |
| apc.Colossus2 0.17 | 6.0 | 8.2% | 0 |
| stelo.Wang 1.0 | 7.1 | 7.0% | 3 |
| ayk.WallHugger 1.0 | 8.0 | 5.5% | 1 |
| maribo.FollowFire 1 | 8.9 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.2 | 69.5 | 6 / 35 | 3358 |
| 2 | 3 | 60.5 | 70.5 | 9 / 35 | 3129 |
| 3 | 3 | 59.3 | 67.9 | 5 / 35 | 3201 |
| 4 | 5 | 58.4 | 67.0 | 2 / 35 | 2973 |
| 5 | 4 | 59.7 | 67.9 | 6 / 35 | 3378 |
| 6 | 3 | 62.8 | 75.2 | 8 / 35 | 3752 |
| 7 | 3 | 58.7 | 68.6 | 2 / 35 | 2967 |
| 8 | 3 | 61.7 | 76.8 | 6 / 35 | 3228 |
| 9 | 3 | 59.4 | 69.5 | 5 / 35 | 2972 |
| 10 | 3 | 60.0 | 71.4 | 6 / 35 | 3122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 66 | 38% |
| ags.Glacier 0.2.11 | 48 | 23% |
| shinh.Entangled 0.3 | 22 | 64% |
| gh.micro.Gruweltje 0.7 | 8 | 38% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 296 of 350 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 99 | 33% | 109 |
| mn.Combat 3.25.0 | 91 | 31% | 118 |
| shinh.Entangled 0.3 | 40 | 14% | 50 |
| gh.micro.Gruweltje 0.7 | 31 | 10% | 36 |
| stelo.Wang 1.0 | 15 | 5% | 17 |
| maribo.FollowFire 1 | 9 | 3% | 8 |
| apc.Colossus2 0.17 | 8 | 3% | 9 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |

## Melee bench: F14

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 77.5 | 109 / 350 | 3.03 | 14.7% | 33827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.2% | 127 |
| hadur117.nano.SanaroL18 0.2 | 2.1 | 14.7% | 109 |
| catcat20.shape.Theta 0.018 | 3.1 | 12.6% | 68 |
| co.edu.usb.rc.LidisTron 1.0 | 4.6 | 10.3% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.6 | 10.8% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 6.3 | 9.4% | 5 |
| sanyi.mikrobi.Roberto 1.0 | 6.3 | 9.4% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 8.3% | 15 |
| pa.Improved 1.0 | 9.0 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 74.9 | 8 / 35 | 3626 |
| 2 | 2 | 61.6 | 76.2 | 12 / 35 | 2887 |
| 3 | 2 | 62.0 | 75.2 | 9 / 35 | 3344 |
| 4 | 2 | 62.7 | 77.5 | 12 / 35 | 3476 |
| 5 | 2 | 62.7 | 76.8 | 14 / 35 | 3081 |
| 6 | 2 | 64.0 | 81.6 | 12 / 35 | 3685 |
| 7 | 2 | 64.2 | 79.0 | 13 / 35 | 3702 |
| 8 | 2 | 62.4 | 78.4 | 9 / 35 | 3158 |
| 9 | 2 | 63.3 | 79.4 | 12 / 35 | 3447 |
| 10 | 3 | 62.3 | 75.9 | 8 / 35 | 3421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 99 | 63% |
| catcat20.shape.Theta 0.018 | 45 | 44% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 69% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 40% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 56% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 67% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 243 of 350 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 99 | 41% | 159 |
| catcat20.shape.Theta 0.018 | 49 | 20% | 66 |
| dmh.robocode.robot.RedDwarf 0.4 | 31 | 13% | 34 |
| co.edu.usb.rc.LidisTron 1.0 | 19 | 8% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 7% | 26 |
| Lo_Ian.Gandalf_V4 4.0 | 13 | 5% | 20 |
| sanyi.mikrobi.Roberto 1.0 | 11 | 5% | 24 |
| pa.Improved 1.0 | 1 | 0% | 2 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F15

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 67.0 | 62 / 350 | 3.97 | 13.4% | 37132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.2 | 14.6% | 81 |
| hadur117.nano.SanaroL18 0.2 | 2.4 | 13.4% | 62 |
| emp.Yngwie 1.11 | 3.0 | 13.1% | 90 |
| mld.DustBunny 3.8 | 3.5 | 12.8% | 38 |
| cb.nano.Insomnia 1.0 | 5.1 | 11.6% | 28 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.5% | 43 |
| lambdaxy.TBot 0.1 | 7.6 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 7.6 | 7.0% | 1 |
| divineomega.TrialBot 0.003 | 8.8 | 5.7% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 69.8 | 10 / 35 | 4116 |
| 2 | 4 | 57.0 | 59.7 | 5 / 35 | 3486 |
| 3 | 3 | 59.3 | 66.3 | 5 / 35 | 3630 |
| 4 | 2 | 59.2 | 66.7 | 4 / 35 | 3603 |
| 5 | 2 | 61.6 | 71.7 | 2 / 35 | 4297 |
| 6 | 4 | 57.0 | 60.3 | 6 / 35 | 3488 |
| 7 | 2 | 59.6 | 67.3 | 8 / 35 | 3748 |
| 8 | 1 | 60.8 | 70.5 | 10 / 35 | 3623 |
| 9 | 3 | 59.0 | 65.7 | 6 / 35 | 3476 |
| 10 | 2 | 61.5 | 71.7 | 6 / 35 | 3665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 37 | 49% |
| kawigi.micro.Shiz 1.1 | 31 | 26% |
| kawigi.robot.Girl 1.2 | 22 | 77% |
| cb.nano.Insomnia 1.0 | 19 | 68% |
| mld.DustBunny 3.8 | 14 | 21% |
| lambdaxy.TBot 0.1 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 288 of 350 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 71 | 25% | 82 |
| emp.Yngwie 1.11 | 54 | 19% | 76 |
| mld.DustBunny 3.8 | 49 | 17% | 58 |
| cb.nano.Insomnia 1.0 | 46 | 16% | 45 |
| kawigi.robot.Girl 1.2 | 28 | 10% | 44 |
| lambdaxy.TBot 0.1 | 14 | 5% | 15 |
| divineomega.TrialBot 0.003 | 13 | 5% | 16 |
| Grystrion.TrackerWO 1.0 | 10 | 3% | 11 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 1% | 3 |

## Melee bench: F16

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 66.3 | 50 / 350 | 4.03 | 13.4% | 38406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.9% | 155 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.2 | 14.3% | 20 |
| hadur117.nano.SanaroL18 0.2 | 2.9 | 13.4% | 50 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 11.2% | 71 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.8% | 25 |
| bvh.fnr.Fenrir 0.36l | 5.4 | 9.5% | 8 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 8.1% | 9 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.7% | 12 |
| repositorio.NanoStep 1.0 | 9.1 | 5.3% | 1 |
| asd.Cthulhu 1.3 | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 67.3 | 3 / 35 | 3883 |
| 2 | 2 | 64.0 | 77.1 | 9 / 35 | 4358 |
| 3 | 3 | 60.9 | 68.6 | 6 / 35 | 3975 |
| 4 | 3 | 61.3 | 69.2 | 5 / 35 | 4050 |
| 5 | 3 | 60.5 | 69.2 | 3 / 35 | 3719 |
| 6 | 2 | 61.4 | 68.3 | 8 / 35 | 4037 |
| 7 | 3 | 58.8 | 63.8 | 4 / 35 | 3748 |
| 8 | 3 | 58.9 | 63.5 | 5 / 35 | 3597 |
| 9 | 3 | 57.8 | 60.0 | 4 / 35 | 3529 |
| 10 | 4 | 56.1 | 56.5 | 3 / 35 | 3510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 83 | 24% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 86% |
| techdude.forest.FlamingForest 1.1 | 20 | 20% |
| bvh.fnr.Fenrir 0.36l | 6 | 67% |
| tvv.nano.Polaris 1.2 | 5 | 0% |
| divineomega.DivineBot 1.9.4.5 | 4 | 50% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 1152. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 138 | 46% | 163 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 41 | 14% | 54 |
| bvh.fnr.Fenrir 0.36l | 38 | 13% | 40 |
| techdude.forest.FlamingForest 1.1 | 31 | 10% | 37 |
| tvv.nano.Polaris 1.2 | 17 | 6% | 17 |
| stelo.IntrinsicVolatility 1.4 | 14 | 5% | 13 |
| divineomega.DivineBot 1.9.4.5 | 13 | 4% | 16 |
| asd.Cthulhu 1.3 | 5 | 2% | 5 |
| repositorio.NanoStep 1.0 | 3 | 1% | 5 |

## Melee bench: F17

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 65.3 | 55 / 350 | 4.12 | 12.9% | 35169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.4 | 14.5% | 78 |
| oog.melee.Mercutio 1.0 | 2.3 | 13.8% | 72 |
| cx.BlestPain 1.41 | 3.3 | 13.0% | 70 |
| hadur117.nano.SanaroL18 0.2 | 3.5 | 12.9% | 55 |
| nic.Nicator 2.4 | 5.1 | 11.8% | 29 |
| ahf.NanoAndrew .4 | 5.4 | 11.3% | 40 |
| maribo.melee.BMV 0.1 | 7.0 | 8.9% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 6.0% | 4 |
| tex.Longbot 0.4 | 8.8 | 5.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 70.8 | 5 / 35 | 4033 |
| 2 | 3 | 59.4 | 64.4 | 5 / 35 | 3718 |
| 3 | 4 | 58.7 | 65.7 | 8 / 35 | 3160 |
| 4 | 2 | 60.5 | 68.9 | 4 / 35 | 3833 |
| 5 | 4 | 58.2 | 62.9 | 4 / 35 | 3590 |
| 6 | 3 | 60.1 | 68.3 | 6 / 35 | 3431 |
| 7 | 5 | 57.0 | 59.7 | 5 / 35 | 3250 |
| 8 | 5 | 56.7 | 62.5 | 4 / 35 | 2950 |
| 9 | 5 | 58.3 | 62.5 | 3 / 35 | 3563 |
| 10 | 2 | 60.9 | 67.3 | 11 / 35 | 3641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 44 | 27% |
| oog.melee.Mercutio 1.0 | 26 | 62% |
| cx.BlestPain 1.41 | 20 | 70% |
| ahf.NanoAndrew .4 | 14 | 29% |
| nic.Nicator 2.4 | 13 | 46% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| maribo.melee.BMV 0.1 | 2 | 50% |

Hadur died in 295 of 350 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 75 | 25% | 89 |
| ahf.NanoAndrew .4 | 60 | 20% | 62 |
| oog.melee.Mercutio 1.0 | 41 | 14% | 57 |
| nic.Nicator 2.4 | 40 | 14% | 43 |
| cx.BlestPain 1.41 | 39 | 13% | 55 |
| maribo.melee.BMV 0.1 | 18 | 6% | 20 |
| tex.Longbot 0.4 | 11 | 4% | 11 |
| edu.otg.spr.TheTeacher 1.2 | 9 | 3% | 11 |
| goblin.Bender 2.4 | 2 | 1% | 2 |

## Melee bench: F18

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 67.1 | 79 / 350 | 3.96 | 13.4% | 34888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.5 | 14.0% | 81 |
| hadur117.nano.SanaroL18 0.2 | 2.2 | 13.4% | 79 |
| agd.Mooserwirt2 2.7 | 2.7 | 12.8% | 72 |
| uji.DBH 1.1 | 3.9 | 11.6% | 38 |
| ratosh.Nobo 0.21 | 5.4 | 10.4% | 13 |
| spinnercat.Robovirus 2.718 | 5.5 | 10.3% | 19 |
| sigterm.Sigterm 1.0 | 6.8 | 9.0% | 30 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.4% | 5 |
| stelo.WangRobot 1.0 | 9.3 | 5.8% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 62.9 | 7 / 35 | 3197 |
| 2 | 1 | 61.9 | 74.0 | 9 / 35 | 3973 |
| 3 | 2 | 59.4 | 66.3 | 11 / 35 | 3649 |
| 4 | 1 | 60.4 | 70.2 | 9 / 35 | 3705 |
| 5 | 3 | 58.0 | 64.1 | 3 / 35 | 3433 |
| 6 | 1 | 61.1 | 71.7 | 12 / 35 | 3287 |
| 7 | 3 | 57.5 | 61.9 | 6 / 35 | 3575 |
| 8 | 3 | 57.8 | 62.2 | 8 / 35 | 3281 |
| 9 | 3 | 58.4 | 65.7 | 5 / 35 | 3385 |
| 10 | 2 | 60.5 | 71.7 | 9 / 35 | 3403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 56% |
| agd.Mooserwirt2 2.7 | 33 | 39% |
| spinnercat.Robovirus 2.718 | 18 | 83% |
| sigterm.Sigterm 1.0 | 14 | 64% |
| uji.DBH 1.1 | 13 | 46% |
| stelo.WangRobot 1.0 | 8 | 38% |
| ratosh.Nobo 0.21 | 6 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 100% |

Hadur died in 273 of 350 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 71 | 26% | 96 |
| agd.Mooserwirt2 2.7 | 54 | 20% | 67 |
| uji.DBH 1.1 | 37 | 14% | 43 |
| ratosh.Nobo 0.21 | 34 | 12% | 42 |
| spinnercat.Robovirus 2.718 | 26 | 10% | 35 |
| sigterm.Sigterm 1.0 | 25 | 9% | 34 |
| stelo.WangRobot 1.0 | 13 | 5% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 3% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 2% | 6 |

## Melee bench: F19

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 80.0 | 99 / 350 | 2.80 | 15.6% | 38594 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.6 | 16.5% | 95 |
| mld.Infinity 2.2 | 2.1 | 15.8% | 123 |
| hadur117.nano.SanaroL18 0.2 | 2.3 | 15.6% | 99 |
| krillr.mini.JointStrike 2.0.0 | 4.4 | 11.2% | 8 |
| erdnis.Rover 0.3 | 4.8 | 10.1% | 7 |
| patson.PatsonTestBot 1.0 | 5.9 | 8.8% | 7 |
| mbh.Mbh 0.1 | 7.2 | 7.4% | 0 |
| pac.ABC 2.1 | 7.7 | 7.3% | 9 |
| pbg.R2D2 1.0 | 9.0 | 6.1% | 2 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.9 | 74.3 | 10 / 35 | 3528 |
| 2 | 1 | 65.6 | 82.5 | 12 / 35 | 3937 |
| 3 | 2 | 63.3 | 76.8 | 8 / 35 | 3698 |
| 4 | 3 | 64.6 | 81.9 | 9 / 35 | 3634 |
| 5 | 3 | 63.4 | 75.9 | 9 / 35 | 3677 |
| 6 | 2 | 65.8 | 81.9 | 11 / 35 | 4094 |
| 7 | 2 | 65.4 | 80.0 | 10 / 35 | 4446 |
| 8 | 1 | 67.2 | 88.9 | 12 / 35 | 3968 |
| 9 | 3 | 64.7 | 80.3 | 9 / 35 | 3905 |
| 10 | 3 | 63.7 | 77.1 | 9 / 35 | 3707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 91 | 42% |
| mld.Infinity 2.2 | 87 | 41% |
| krillr.mini.JointStrike 2.0.0 | 14 | 79% |
| patson.PatsonTestBot 1.0 | 7 | 71% |
| erdnis.Rover 0.3 | 5 | 100% |
| pac.ABC 2.1 | 5 | 60% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 251 of 350 rounds, at a mean tick of 1073. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 112 | 45% | 195 |
| mld.Infinity 2.2 | 72 | 29% | 41 |
| krillr.mini.JointStrike 2.0.0 | 24 | 10% | 37 |
| patson.PatsonTestBot 1.0 | 14 | 6% | 27 |
| erdnis.Rover 0.3 | 14 | 6% | 21 |
| mbh.Mbh 0.1 | 7 | 3% | 9 |
| pbg.R2D2 1.0 | 6 | 2% | 9 |
| pac.ABC 2.1 | 2 | 1% | 8 |

## Melee bench: F20

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 72.1 | 84 / 350 | 3.51 | 14.1% | 35616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 18.0% | 157 |
| hadur117.nano.SanaroL18 0.2 | 2.0 | 14.1% | 84 |
| fwb.Nine 1.0.1 | 3.3 | 12.1% | 48 |
| nz.jdc.nano.GridFu 1.0 | 3.9 | 11.2% | 20 |
| catcat20.Rabbit 0.001 | 5.2 | 9.7% | 23 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 9.0% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.6% | 9 |
| bayen.nut.Squirrel 1.615 | 7.8 | 7.4% | 6 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 73.0 | 12 / 35 | 3450 |
| 2 | 2 | 58.9 | 66.3 | 7 / 35 | 3358 |
| 3 | 2 | 61.5 | 75.9 | 7 / 35 | 3346 |
| 4 | 2 | 57.5 | 63.2 | 4 / 35 | 3291 |
| 5 | 2 | 61.9 | 75.2 | 8 / 35 | 3410 |
| 6 | 2 | 63.5 | 76.8 | 10 / 35 | 4045 |
| 7 | 2 | 63.0 | 76.5 | 10 / 35 | 3749 |
| 8 | 2 | 60.7 | 68.6 | 10 / 35 | 3561 |
| 9 | 2 | 62.6 | 74.3 | 11 / 35 | 3989 |
| 10 | 2 | 60.0 | 70.8 | 5 / 35 | 3417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 75 | 48% |
| fwb.Nine 1.0.1 | 36 | 64% |
| catcat20.Rabbit 0.001 | 15 | 47% |
| bayen.nut.Squirrel 1.615 | 8 | 100% |
| nz.jdc.nano.GridFu 1.0 | 6 | 50% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 267 of 350 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 116 | 43% | 139 |
| fwb.Nine 1.0.1 | 44 | 16% | 52 |
| nz.jdc.nano.GridFu 1.0 | 25 | 9% | 36 |
| catcat20.Rabbit 0.001 | 24 | 9% | 38 |
| djdjdj.NanoSkunk10 1.0 | 19 | 7% | 23 |
| bayen.nut.Squirrel 1.615 | 15 | 6% | 25 |
| ntc.ControlledChaos 1.1.4 | 11 | 4% | 12 |
| m3thos.mini.Eva01 0.5.5 | 9 | 3% | 17 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.3 | 155 / 350 | 2.42 | 17.5% | 46271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroL18 0.2 | 1.2 | 17.5% | 155 |
| eem.EvBot v4.6.16 | 1.9 | 16.4% | 123 |
| dummy.mini.Scimitar 1.01 | 2.9 | 14.8% | 25 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 22 |
| oa.weak.BotherBot 0.1 | 5.4 | 8.8% | 2 |
| eld.Hmm 1.0 | 5.6 | 8.5% | 20 |
| el.JumpShoot 0.2 | 7.4 | 6.5% | 5 |
| fire219.CatBot 1.0 | 8.0 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.6 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.6 | 19 / 35 | 4847 |
| 2 | 1 | 67.8 | 87.9 | 16 / 35 | 4690 |
| 3 | 1 | 65.9 | 78.1 | 14 / 35 | 4776 |
| 4 | 2 | 65.6 | 82.5 | 11 / 35 | 4188 |
| 5 | 1 | 68.0 | 87.0 | 16 / 35 | 4841 |
| 6 | 1 | 67.2 | 84.4 | 16 / 35 | 4415 |
| 7 | 1 | 67.5 | 86.3 | 17 / 35 | 4590 |
| 8 | 1 | 68.4 | 88.6 | 18 / 35 | 4705 |
| 9 | 2 | 65.0 | 75.2 | 12 / 35 | 4766 |
| 10 | 1 | 67.0 | 83.8 | 16 / 35 | 4453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 141 | 62% |
| dummy.mini.Scimitar 1.01 | 50 | 82% |
| cf.RiO.RiOx 4.2.1 | 20 | 45% |
| eld.Hmm 1.0 | 17 | 53% |
| el.JumpShoot 0.2 | 5 | 80% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 195 of 350 rounds, at a mean tick of 1176. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 79 | 41% | 142 |
| dummy.mini.Scimitar 1.01 | 48 | 25% | 107 |
| cf.RiO.RiOx 4.2.1 | 36 | 18% | 43 |
| eld.Hmm 1.0 | 12 | 6% | 27 |
| oa.weak.BotherBot 0.1 | 8 | 4% | 16 |
| fire219.CatBot 1.0 | 5 | 3% | 5 |
| el.JumpShoot 0.2 | 3 | 2% | 6 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

## Melee bench: F23

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 79.3 | 103 / 350 | 2.86 | 15.8% | 40709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.3% | 139 |
| hadur117.nano.SanaroL18 0.2 | 2.0 | 15.8% | 103 |
| cre.Karolos 0.32 | 3.0 | 14.3% | 61 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.7% | 24 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.2% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.1 | 9.3% | 4 |
| cw.megas.Blade 0.8 | 7.1 | 8.4% | 2 |
| sample.Walls 1.0 | 7.2 | 8.5% | 4 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 78.7 | 10 / 35 | 3739 |
| 2 | 2 | 65.4 | 77.1 | 11 / 35 | 4298 |
| 3 | 2 | 65.1 | 76.5 | 11 / 35 | 4312 |
| 4 | 2 | 64.3 | 79.4 | 9 / 35 | 3865 |
| 5 | 2 | 66.0 | 79.7 | 11 / 35 | 4063 |
| 6 | 2 | 66.6 | 82.5 | 13 / 35 | 3921 |
| 7 | 2 | 64.6 | 76.2 | 8 / 35 | 4437 |
| 8 | 2 | 63.6 | 75.2 | 7 / 35 | 4065 |
| 9 | 2 | 65.8 | 83.5 | 9 / 35 | 3937 |
| 10 | 2 | 67.1 | 84.4 | 14 / 35 | 4072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 112 | 45% |
| cre.Karolos 0.32 | 41 | 49% |
| stelo.AreaTargetingBot 1.1 | 22 | 45% |
| sample.Walls 1.0 | 11 | 91% |
| stelo.RamTrackSurfer 1.2 | 7 | 57% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 247 of 350 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 120 | 49% | 176 |
| cre.Karolos 0.32 | 56 | 23% | 75 |
| stelo.AreaTargetingBot 1.1 | 36 | 15% | 42 |
| stelo.RamTrackSurfer 1.2 | 11 | 4% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 11 | 4% | 17 |
| cw.megas.Blade 0.8 | 7 | 3% | 9 |
| sample.Walls 1.0 | 6 | 2% | 11 |

## Melee bench: F24

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 58.7 | 38 / 350 | 4.72 | 11.0% | 25852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 2.0 | 14.4% | 82 |
| florent.XSeries.X2 0.12 | 2.5 | 13.4% | 70 |
| davidalves.Phoenix 0.54 | 2.6 | 13.3% | 81 |
| pedersen.Ugluk 1.1.1 | 3.2 | 12.9% | 45 |
| hadur117.nano.SanaroL18 0.2 | 4.8 | 11.0% | 38 |
| oog.melee.Corsair 1.0 | 6.1 | 9.5% | 8 |
| stelo.SoJNanoMelee 1.1 | 6.9 | 8.6% | 22 |
| lunchie.Lunchbox 0.93 | 7.9 | 7.0% | 3 |
| as.FrankTheTank 1.3 | 9.3 | 5.2% | 1 |
| evd.X1 0.01 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 62.9 | 3 / 35 | 2944 |
| 2 | 5 | 54.0 | 59.4 | 1 / 35 | 2625 |
| 3 | 5 | 54.1 | 60.0 | 4 / 35 | 2302 |
| 4 | 5 | 54.0 | 56.5 | 2 / 35 | 2795 |
| 5 | 5 | 50.4 | 49.2 | 2 / 35 | 2589 |
| 6 | 6 | 52.7 | 55.9 | 2 / 35 | 2177 |
| 7 | 5 | 55.1 | 58.7 | 8 / 35 | 2512 |
| 8 | 5 | 54.3 | 58.1 | 5 / 35 | 2701 |
| 9 | 4 | 55.1 | 61.0 | 5 / 35 | 2358 |
| 10 | 4 | 57.5 | 65.1 | 6 / 35 | 2849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 19 | 32% |
| florent.XSeries.X2 0.12 | 16 | 63% |
| pedersen.Ugluk 1.1.1 | 16 | 38% |
| davidalves.Phoenix 0.54 | 16 | 50% |
| stelo.SoJNanoMelee 1.1 | 7 | 29% |
| oog.melee.Corsair 1.0 | 6 | 83% |
| lunchie.Lunchbox 0.93 | 2 | 0% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 70 | 22% | 79 |
| pedersen.Ugluk 1.1.1 | 64 | 21% | 72 |
| davidalves.Phoenix 0.54 | 64 | 21% | 68 |
| florent.XSeries.X2 0.12 | 48 | 15% | 56 |
| oog.melee.Corsair 1.0 | 24 | 8% | 31 |
| stelo.SoJNanoMelee 1.1 | 19 | 6% | 19 |
| lunchie.Lunchbox 0.93 | 11 | 4% | 11 |
| as.FrankTheTank 1.3 | 7 | 2% | 9 |
| evd.X1 0.01 | 5 | 2% | 5 |

## Melee bench: F25

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 70.0 | 73 / 350 | 3.70 | 13.6% | 30070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.4 | 14.9% | 86 |
| hadur117.nano.SanaroL18 0.2 | 2.2 | 13.6% | 73 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.5% | 62 |
| gre.svman4.Morfeas 1.4.1 | 4.4 | 11.1% | 37 |
| jdw.Hurricane 1.4 | 4.7 | 11.2% | 41 |
| ds.Oo 2.2 | 6.2 | 9.2% | 21 |
| gjr.Cephalosporin 0.1 | 6.7 | 8.7% | 25 |
| adt.Ar2 1.1 | 8.4 | 6.7% | 4 |
| awesomeness.Elite 1.0 | 8.5 | 6.6% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.1 | 60.3 | 3 / 35 | 2839 |
| 2 | 2 | 61.2 | 76.5 | 4 / 35 | 2991 |
| 3 | 2 | 59.5 | 67.6 | 9 / 35 | 3180 |
| 4 | 2 | 60.5 | 70.8 | 9 / 35 | 3150 |
| 5 | 2 | 61.1 | 73.0 | 9 / 35 | 3044 |
| 6 | 1 | 62.9 | 80.3 | 9 / 35 | 3207 |
| 7 | 2 | 58.1 | 65.7 | 8 / 35 | 2772 |
| 8 | 2 | 59.1 | 67.6 | 7 / 35 | 3095 |
| 9 | 3 | 58.2 | 66.0 | 7 / 35 | 2813 |
| 10 | 2 | 60.4 | 71.7 | 8 / 35 | 2979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 58 | 38% |
| voidious.micro.BlitzBat 1.05 | 38 | 16% |
| gre.svman4.Morfeas 1.4.1 | 21 | 57% |
| gjr.Cephalosporin 0.1 | 21 | 43% |
| jdw.Hurricane 1.4 | 20 | 70% |
| ds.Oo 2.2 | 8 | 75% |
| awesomeness.Elite 1.0 | 3 | 100% |
| adt.Ar2 1.1 | 2 | 50% |

Hadur died in 278 of 350 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 75 | 27% | 83 |
| voidious.mini.BrokenSword 2.0.3 | 71 | 26% | 90 |
| jdw.Hurricane 1.4 | 34 | 12% | 47 |
| gre.svman4.Morfeas 1.4.1 | 26 | 9% | 39 |
| gjr.Cephalosporin 0.1 | 23 | 8% | 30 |
| ds.Oo 2.2 | 21 | 8% | 28 |
| adt.Ar2 1.1 | 12 | 4% | 13 |
| awesomeness.Elite 1.0 | 11 | 4% | 12 |
| amk.ChumbaMini 0.2 | 5 | 2% | 5 |

## Melee bench: F26

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 70.3 | 59 / 350 | 3.67 | 13.4% | 36303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.1 | 15.8% | 119 |
| hadur117.nano.SanaroL18 0.2 | 2.6 | 13.4% | 59 |
| shu.nitro.LENIN .T34 | 3.4 | 13.1% | 66 |
| lrem.Spectre 0.4.4 | 3.6 | 12.7% | 53 |
| gh.mini.GrubbmOne 1.0 | 5.0 | 11.3% | 24 |
| js.PinBall 1.6 | 5.6 | 11.0% | 21 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.3% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 8.3 | 6.3% | 5 |
| sample.SpinBot 1.0 | 8.7 | 5.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.4 | 58.7 | 3 / 35 | 2928 |
| 2 | 4 | 59.8 | 70.5 | 5 / 35 | 3355 |
| 3 | 2 | 62.8 | 75.6 | 9 / 35 | 3915 |
| 4 | 3 | 61.0 | 74.0 | 4 / 35 | 3631 |
| 5 | 2 | 60.7 | 69.8 | 7 / 35 | 3817 |
| 6 | 2 | 61.3 | 70.5 | 5 / 35 | 3868 |
| 7 | 1 | 62.0 | 73.3 | 7 / 35 | 3852 |
| 8 | 2 | 61.6 | 71.1 | 10 / 35 | 3811 |
| 9 | 2 | 59.9 | 68.9 | 3 / 35 | 3645 |
| 10 | 3 | 60.7 | 70.8 | 6 / 35 | 3481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 51 | 31% |
| lrem.Spectre 0.4.4 | 37 | 43% |
| shu.nitro.LENIN .T34 | 28 | 36% |
| gh.mini.GrubbmOne 1.0 | 12 | 25% |
| js.PinBall 1.6 | 9 | 56% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 0% |

Hadur died in 292 of 350 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 96 | 33% | 114 |
| shu.nitro.LENIN .T34 | 48 | 16% | 60 |
| lrem.Spectre 0.4.4 | 46 | 16% | 59 |
| gh.mini.GrubbmOne 1.0 | 39 | 13% | 42 |
| js.PinBall 1.6 | 25 | 9% | 31 |
| jaybot.adv.bots.JayBot 2.0 | 18 | 6% | 23 |
| sample.SpinBot 1.0 | 10 | 3% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 66.8 | 81 / 350 | 3.99 | 13.0% | 30943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.8 | 15.5% | 123 |
| hadur117.nano.SanaroL18 0.2 | 2.5 | 13.0% | 81 |
| wee.Gem 1.8.4 | 2.9 | 12.8% | 73 |
| sheldor.melee.nano.TestMelee 0.1 | 4.1 | 11.4% | 39 |
| EH.Eagle 1.0.6 | 4.9 | 10.2% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 9.2% | 10 |
| joe.ADinosaur 1.0 | 6.9 | 8.6% | 4 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.3% | 6 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.8% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 75.9 | 12 / 35 | 2956 |
| 2 | 1 | 61.0 | 75.2 | 10 / 35 | 3111 |
| 3 | 5 | 54.6 | 45.4 | 4 / 35 | 4189 |
| 4 | 3 | 58.3 | 69.8 | 6 / 35 | 2613 |
| 5 | 2 | 61.6 | 76.8 | 10 / 35 | 3031 |
| 6 | 4 | 51.5 | 41.9 | 3 / 35 | 3713 |
| 7 | 2 | 60.1 | 72.4 | 11 / 35 | 2635 |
| 8 | 3 | 58.6 | 69.5 | 7 / 35 | 2704 |
| 9 | 2 | 59.4 | 70.5 | 11 / 35 | 2569 |
| 10 | 1 | 60.3 | 70.8 | 7 / 35 | 3422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 66 | 59% |
| wee.Gem 1.8.4 | 36 | 36% |
| EH.Eagle 1.0.6 | 14 | 86% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 62% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 60% |
| throxbot.ThroxBot 0.1 | 5 | 60% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 270 of 350 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 86 | 32% | 122 |
| sheldor.melee.nano.TestMelee 0.1 | 46 | 17% | 56 |
| wee.Gem 1.8.4 | 42 | 16% | 55 |
| joe.ADinosaur 1.0 | 23 | 9% | 23 |
| throxbot.ThroxBot 0.1 | 22 | 8% | 24 |
| EH.Eagle 1.0.6 | 18 | 7% | 35 |
| techdude.kombat.FlamingKombat 1.5 | 11 | 4% | 13 |
| caimano.Furia_Ceca 0.22 | 11 | 4% | 11 |
| cs.Grudge 1.0 | 11 | 4% | 11 |

## Melee bench: F28

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 78.4 | 103 / 350 | 2.94 | 15.3% | 35182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.2 | 16.6% | 120 |
| hadur117.nano.SanaroL18 0.2 | 1.8 | 15.3% | 103 |
| uji.Antique 1.0 | 3.1 | 12.5% | 60 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 11.0% | 35 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.3% | 14 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.2% | 6 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.2% | 9 |
| matt.advanced.Katana 1.0 | 8.4 | 6.5% | 3 |
| stelo.Lifestealer 1.0 | 9.0 | 6.0% | 0 |
| stelo.PianistNano 1.2 | 9.6 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 81.6 | 10 / 35 | 3363 |
| 2 | 2 | 62.3 | 74.6 | 11 / 35 | 3588 |
| 3 | 2 | 64.5 | 79.4 | 16 / 35 | 3554 |
| 4 | 2 | 63.1 | 76.2 | 9 / 35 | 3677 |
| 5 | 1 | 63.6 | 82.2 | 7 / 35 | 3703 |
| 6 | 2 | 62.6 | 78.1 | 8 / 35 | 3418 |
| 7 | 2 | 60.6 | 70.8 | 9 / 35 | 3356 |
| 8 | 2 | 63.1 | 79.0 | 8 / 35 | 3482 |
| 9 | 2 | 63.6 | 78.7 | 14 / 35 | 3560 |
| 10 | 1 | 64.5 | 83.5 | 11 / 35 | 3481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 119 | 43% |
| uji.Antique 1.0 | 35 | 54% |
| qohnil.blot.BlotBot 3.61 | 21 | 52% |
| amk.ChumbaWumba 0.3 | 8 | 88% |
| ahr.ice.Ice 1.0.2 | 6 | 50% |
| pfvicm.Sobieski 7.2.3b | 5 | 60% |
| matt.advanced.Katana 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 2 | 100% |

Hadur died in 249 of 350 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 107 | 43% | 152 |
| uji.Antique 1.0 | 46 | 18% | 74 |
| pfvicm.Sobieski 7.2.3b | 30 | 12% | 32 |
| amk.ChumbaWumba 0.3 | 26 | 10% | 31 |
| qohnil.blot.BlotBot 3.61 | 14 | 6% | 22 |
| ahr.ice.Ice 1.0.2 | 10 | 4% | 15 |
| stelo.Lifestealer 1.0 | 9 | 4% | 10 |
| matt.advanced.Katana 1.0 | 5 | 2% | 9 |
| stelo.PianistNano 1.2 | 2 | 1% | 4 |

## Melee bench: F29

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 64.7 | 48 / 350 | 4.18 | 12.9% | 33415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.3 | 16.1% | 119 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 15.3% | 104 |
| myl.micro.Troodon 1.10 | 3.5 | 12.8% | 21 |
| hadur117.nano.SanaroL18 0.2 | 3.5 | 12.9% | 48 |
| jok.PheonixM 0.1.2 | 5.0 | 11.1% | 18 |
| DBall.Anarchy 0.1 | 6.3 | 8.7% | 31 |
| ph.melee.ArcherME 0.3 | 6.6 | 8.1% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.7% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.8% | 5 |
| jangs.ns51 1.0 | 9.5 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.6 | 63.5 | 6 / 35 | 3500 |
| 2 | 3 | 60.6 | 67.6 | 6 / 35 | 3451 |
| 3 | 4 | 57.4 | 60.6 | 6 / 35 | 3056 |
| 4 | 4 | 58.3 | 62.2 | 2 / 35 | 3321 |
| 5 | 3 | 59.3 | 67.3 | 4 / 35 | 3269 |
| 6 | 3 | 59.2 | 63.8 | 4 / 35 | 3278 |
| 7 | 3 | 62.2 | 70.8 | 9 / 35 | 3566 |
| 8 | 4 | 58.6 | 63.2 | 3 / 35 | 3450 |
| 9 | 3 | 58.0 | 63.2 | 3 / 35 | 3299 |
| 10 | 4 | 58.9 | 64.8 | 5 / 35 | 3225 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 54 | 6% |
| zyx.mega.YersiniaPestis 3.1 | 33 | 48% |
| myl.micro.Troodon 1.10 | 23 | 87% |
| DBall.Anarchy 0.1 | 12 | 25% |
| jok.PheonixM 0.1.2 | 8 | 50% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 112 | 37% | 117 |
| zyx.mega.YersiniaPestis 3.1 | 51 | 17% | 65 |
| myl.micro.Troodon 1.10 | 50 | 17% | 70 |
| jok.PheonixM 0.1.2 | 45 | 15% | 48 |
| DBall.Anarchy 0.1 | 17 | 6% | 22 |
| ph.melee.ArcherME 0.3 | 13 | 4% | 13 |
| fullsail.TimbotNoPrediction 1.0 | 7 | 2% | 8 |
| jangs.ns51 1.0 | 7 | 2% | 7 |

## Melee bench: F30

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.7 | 55.4 | 29 / 350 | 5.02 | 10.5% | 27168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.9 | 14.2% | 94 |
| darkcanuck.B26354 1.06 | 2.2 | 14.0% | 96 |
| oog.melee.Capulet 1.2 | 2.2 | 14.0% | 58 |
| stelo.PastFuture 2.3.2 | 3.7 | 12.8% | 40 |
| hadur117.nano.SanaroL18 0.2 | 5.4 | 10.5% | 29 |
| intruder.PrairieWolf 2.61 | 5.8 | 9.6% | 20 |
| ntc.Opposite 1.5 | 7.6 | 7.7% | 1 |
| tripphippy.Alice 1.1 | 7.8 | 7.5% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 8.4 | 7.2% | 7 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.0 | 57.1 | 3 / 35 | 2591 |
| 2 | 5 | 55.0 | 57.1 | 2 / 35 | 2935 |
| 3 | 5 | 57.2 | 60.6 | 4 / 35 | 3097 |
| 4 | 5 | 54.2 | 59.7 | 4 / 35 | 2294 |
| 5 | 5 | 52.3 | 51.1 | 4 / 35 | 2729 |
| 6 | 6 | 54.0 | 54.3 | 2 / 35 | 2949 |
| 7 | 5 | 52.6 | 53.0 | 2 / 35 | 2553 |
| 8 | 6 | 50.8 | 50.2 | 1 / 35 | 2490 |
| 9 | 7 | 49.9 | 48.9 | 2 / 35 | 2508 |
| 10 | 5 | 56.7 | 61.6 | 5 / 35 | 3022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 25 | 32% |
| darkcanuck.B26354 1.06 | 15 | 27% |
| oog.melee.Capulet 1.2 | 13 | 23% |
| stelo.PastFuture 2.3.2 | 11 | 55% |
| intruder.PrairieWolf 2.61 | 6 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 321 of 350 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 72 | 22% | 79 |
| darkcanuck.B26354 1.06 | 67 | 21% | 72 |
| oog.melee.Capulet 1.2 | 58 | 18% | 64 |
| stelo.PastFuture 2.3.2 | 43 | 13% | 50 |
| ntc.Opposite 1.5 | 26 | 8% | 27 |
| intruder.PrairieWolf 2.61 | 20 | 6% | 22 |
| tripphippy.Alice 1.1 | 17 | 5% | 18 |
| fowl3628800.LightningBolt 2.6.0 | 12 | 4% | 12 |
| GarmBox.Anger 1.0 | 6 | 2% | 6 |

## Melee bench: F31

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.6 | 59.6 | 36 / 350 | 4.64 | 11.3% | 26730 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 166 |
| gh.mini.Griezel 0.2 | 2.3 | 14.3% | 90 |
| d414.nano.Quantum 1.0.0 | 3.7 | 11.8% | 23 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 12.2% | 27 |
| hadur117.nano.SanaroL18 0.2 | 4.2 | 11.3% | 36 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 5 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.3% | 3 |
| fm.mammillarias 1.3 | 7.9 | 6.4% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.0 | 62.5 | 3 / 35 | 2728 |
| 2 | 5 | 53.8 | 56.8 | 2 / 35 | 2460 |
| 3 | 3 | 58.0 | 65.4 | 3 / 35 | 2786 |
| 4 | 5 | 53.3 | 55.2 | 3 / 35 | 2483 |
| 5 | 5 | 54.5 | 54.0 | 5 / 35 | 2919 |
| 6 | 3 | 57.9 | 66.0 | 5 / 35 | 2861 |
| 7 | 5 | 54.9 | 57.8 | 3 / 35 | 2627 |
| 8 | 4 | 57.3 | 62.9 | 5 / 35 | 2641 |
| 9 | 5 | 52.8 | 53.7 | 3 / 35 | 2449 |
| 10 | 3 | 56.5 | 61.6 | 4 / 35 | 2776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 44 | 34% |
| abc.Shadow 3.84i | 37 | 32% |
| spinnercat.micro.Tyger 0.1 | 9 | 0% |
| d414.nano.Quantum 1.0.0 | 7 | 29% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 314 of 350 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 101 | 32% | 117 |
| abc.Shadow 3.84i | 66 | 21% | 78 |
| spinnercat.micro.Tyger 0.1 | 48 | 15% | 49 |
| d414.nano.Quantum 1.0.0 | 39 | 12% | 42 |
| gh.nano.Grofvuil 0.2 | 26 | 8% | 30 |
| fm.mammillarias 1.3 | 18 | 6% | 18 |
| timmit.nano.TimDog 0.33 | 9 | 3% | 9 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 74.4 | 113 / 350 | 3.30 | 14.5% | 33844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.2 | 15.2% | 99 |
| hadur117.nano.SanaroL18 0.2 | 1.9 | 14.5% | 113 |
| apc.botM 3.0 | 3.2 | 12.6% | 56 |
| vjik.UnViolation 1.1 | 4.3 | 11.5% | 37 |
| lxx.ConceptA 0.8 | 4.6 | 10.7% | 14 |
| bayen.UbaMicro 1.4 | 5.8 | 9.4% | 10 |
| panzer.Panzer 0.2 | 7.9 | 7.3% | 5 |
| yk.JahMicro 1.0 | 8.0 | 7.1% | 6 |
| conscience.Electron 1.3g | 8.3 | 6.5% | 3 |
| donjezza.Jezza 1.0 | 9.8 | 5.1% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.2 | 65.4 | 10 / 35 | 3213 |
| 2 | 2 | 62.4 | 79.0 | 10 / 35 | 3341 |
| 3 | 1 | 63.1 | 79.0 | 15 / 35 | 3523 |
| 4 | 3 | 59.2 | 67.9 | 9 / 35 | 3257 |
| 5 | 2 | 62.4 | 78.1 | 9 / 35 | 3465 |
| 6 | 2 | 59.6 | 69.8 | 14 / 35 | 2910 |
| 7 | 2 | 59.2 | 68.3 | 7 / 35 | 3555 |
| 8 | 2 | 61.5 | 75.2 | 8 / 35 | 3564 |
| 9 | 2 | 62.3 | 77.5 | 13 / 35 | 3241 |
| 10 | 1 | 65.3 | 84.1 | 18 / 35 | 3775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 85 | 61% |
| apc.botM 3.0 | 37 | 46% |
| vjik.UnViolation 1.1 | 23 | 61% |
| lxx.ConceptA 0.8 | 22 | 82% |
| yk.JahMicro 1.0 | 9 | 44% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 50% |
| panzer.Panzer 0.2 | 3 | 67% |

Hadur died in 237 of 350 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 82 | 35% | 141 |
| apc.botM 3.0 | 43 | 18% | 62 |
| lxx.ConceptA 0.8 | 31 | 13% | 39 |
| bayen.UbaMicro 1.4 | 24 | 10% | 28 |
| vjik.UnViolation 1.1 | 18 | 8% | 34 |
| panzer.Panzer 0.2 | 15 | 6% | 17 |
| yk.JahMicro 1.0 | 11 | 5% | 10 |
| donjezza.Jezza 1.0 | 8 | 3% | 13 |
| conscience.Electron 1.3g | 5 | 2% | 6 |

## Melee bench: F33

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 66.1 | 59 / 350 | 4.05 | 13.2% | 34583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.2% | 118 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.2% | 77 |
| hadur117.nano.SanaroL18 0.2 | 2.8 | 13.2% | 59 |
| labg.Cataclysm 2.05 | 4.3 | 11.5% | 48 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 11.1% | 28 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 5 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.4% | 15 |
| zyx.micro.Ant 1.1 | 8.3 | 5.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.2 | 4.8% | 0 |
| sanja.First 0.1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 67.3 | 5 / 35 | 3067 |
| 2 | 3 | 58.3 | 64.1 | 5 / 35 | 3392 |
| 3 | 2 | 61.2 | 70.2 | 8 / 35 | 3705 |
| 4 | 4 | 58.3 | 62.5 | 7 / 35 | 3236 |
| 5 | 3 | 59.5 | 65.4 | 5 / 35 | 3542 |
| 6 | 3 | 60.6 | 67.3 | 7 / 35 | 3590 |
| 7 | 2 | 61.4 | 71.4 | 6 / 35 | 3653 |
| 8 | 3 | 59.8 | 66.7 | 6 / 35 | 3537 |
| 9 | 3 | 56.0 | 57.5 | 6 / 35 | 3057 |
| 10 | 3 | 60.9 | 68.3 | 4 / 35 | 3804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 17% |
| maribo.Quester 0.3 | 36 | 56% |
| labg.Cataclysm 2.05 | 19 | 37% |
| gre.svman4.Leonidas 1.3.2 | 16 | 81% |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 75% |
| baal.nano.N 1.42 | 4 | 50% |

Hadur died in 291 of 350 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 86 | 30% | 112 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 85 | 29% | 96 |
| gre.svman4.Leonidas 1.3.2 | 40 | 14% | 49 |
| labg.Cataclysm 2.05 | 33 | 11% | 42 |
| kinsen.melee.Angsaichmophobia 1.8c | 25 | 9% | 25 |
| zyx.micro.Ant 1.1 | 9 | 3% | 9 |
| baal.nano.N 1.42 | 7 | 2% | 9 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 1% | 4 |
| sanja.First 0.1 | 2 | 1% | 4 |

## Melee bench: F34

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 70.9 | 52 / 350 | 3.62 | 13.6% | 35433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.3% | 132 |
| kid.Gladiator .7.2 | 1.5 | 17.0% | 105 |
| hadur117.nano.SanaroL18 0.2 | 3.1 | 13.6% | 52 |
| jcs.Seth 1.8 | 4.0 | 12.0% | 37 |
| tcf.Reach 3 | 5.3 | 10.8% | 15 |
| cli.Dancer 1.1 | 5.6 | 10.2% | 6 |
| ratosh.Wesco 1.4 | 7.0 | 7.7% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 62.5 | 3 / 35 | 3162 |
| 2 | 3 | 59.2 | 66.3 | 5 / 35 | 3284 |
| 3 | 3 | 60.6 | 69.8 | 2 / 35 | 3285 |
| 4 | 3 | 61.0 | 67.9 | 6 / 35 | 3404 |
| 5 | 3 | 65.1 | 81.0 | 7 / 35 | 3909 |
| 6 | 3 | 60.9 | 70.2 | 6 / 35 | 3550 |
| 7 | 3 | 62.2 | 71.7 | 8 / 35 | 3416 |
| 8 | 3 | 63.2 | 75.9 | 5 / 35 | 4019 |
| 9 | 3 | 64.3 | 76.5 | 8 / 35 | 4347 |
| 10 | 3 | 59.2 | 67.0 | 2 / 35 | 3057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 51 | 53% |
| kid.Gladiator .7.2 | 43 | 14% |
| jcs.Seth 1.8 | 20 | 55% |
| tcf.Reach 3 | 11 | 45% |
| cli.Dancer 1.1 | 3 | 33% |
| ratosh.Wesco 1.4 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 117 | 39% | 121 |
| stelo.Spread 0.9 | 96 | 32% | 122 |
| jcs.Seth 1.8 | 31 | 10% | 43 |
| tcf.Reach 3 | 24 | 8% | 29 |
| cli.Dancer 1.1 | 19 | 6% | 21 |
| ratosh.Wesco 1.4 | 6 | 2% | 7 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 4 |
| sample.VelociRobot 1.0 | 2 | 1% | 2 |

## Melee bench: F35

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 68.3 | 21 / 350 | 3.86 | 12.3% | 26790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.7% | 277 |
| gh.mini.Gruwel 0.9 | 2.3 | 13.6% | 36 |
| rz.HawkOnFire 0.1 | 3.5 | 12.1% | 3 |
| hadur117.nano.SanaroL18 0.2 | 3.8 | 12.3% | 21 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.4 | 11.5% | 11 |
| wit.Chuliath 1.0 | 6.4 | 7.3% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.9 | 6.9% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.4 | 5.5% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.7 | 67.0 | 1 / 35 | 2682 |
| 2 | 3 | 59.3 | 70.8 | 4 / 35 | 2518 |
| 3 | 3 | 60.5 | 73.3 | 3 / 35 | 2809 |
| 4 | 5 | 58.4 | 67.3 | 4 / 35 | 2544 |
| 5 | 3 | 60.3 | 72.4 | 3 / 35 | 2757 |
| 6 | 5 | 56.0 | 60.6 | 1 / 35 | 2789 |
| 7 | 4 | 56.6 | 64.4 | 0 / 35 | 2565 |
| 8 | 3 | 59.5 | 71.4 | 3 / 35 | 2883 |
| 9 | 4 | 57.4 | 67.6 | 1 / 35 | 2404 |
| 10 | 4 | 58.4 | 67.6 | 1 / 35 | 2839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 94 | 1% |
| gh.mini.Gruwel 0.9 | 21 | 52% |
| rz.HawkOnFire 0.1 | 5 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 3 | 67% |
| wit.Chuliath 1.0 | 2 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 329 of 350 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 157 | 48% | 157 |
| rz.HawkOnFire 0.1 | 52 | 16% | 57 |
| gh.mini.Gruwel 0.9 | 49 | 15% | 61 |
| dmh.robocode.robot.BlackDeath 9.2 | 38 | 12% | 40 |
| myl.nano.KomoriNinja 1.1 | 8 | 2% | 8 |
| stelo.MyAgileRobot 0.2 | 7 | 2% | 7 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 2% | 7 |
| wit.Chuliath 1.0 | 6 | 2% | 8 |
| dans.Cinnamon 1.2 | 5 | 2% | 5 |

## Melee bench: F36

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 74.0 | 123 / 350 | 3.34 | 15.0% | 36350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroL18 0.2 | 1.2 | 15.0% | 123 |
| bzdp.Pansy 2.1 | 2.7 | 12.7% | 61 |
| alpha.RainingFire 1.0 | 2.8 | 12.8% | 66 |
| mz.Cork 0.1 | 3.7 | 11.8% | 43 |
| bvh.micro.Freya 0.3 | 5.3 | 10.7% | 21 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.9% | 10 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.8% | 14 |
| dl.BetterWalls 1.0 | 8.4 | 6.9% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.6% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.7% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 74.3 | 12 / 35 | 4047 |
| 2 | 1 | 64.3 | 77.8 | 18 / 35 | 3634 |
| 3 | 3 | 58.3 | 62.5 | 10 / 35 | 3362 |
| 4 | 1 | 64.5 | 80.3 | 16 / 35 | 3652 |
| 5 | 1 | 60.7 | 67.9 | 12 / 35 | 3793 |
| 6 | 1 | 61.1 | 73.0 | 9 / 35 | 3299 |
| 7 | 1 | 64.5 | 80.3 | 16 / 35 | 3658 |
| 8 | 1 | 62.5 | 74.9 | 11 / 35 | 3546 |
| 9 | 1 | 62.0 | 73.3 | 8 / 35 | 3726 |
| 10 | 1 | 62.8 | 75.9 | 11 / 35 | 3633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 51% |
| mz.Cork 0.1 | 34 | 65% |
| alpha.RainingFire 1.0 | 29 | 52% |
| bvh.micro.Freya 0.3 | 24 | 83% |
| m3thos.Eva02 0.7.1 | 23 | 78% |
| bvh.mini.Fenrir 0.39 | 14 | 93% |
| sample.MyFirstRobot 1.0 | 7 | 29% |
| dl.BetterWalls 1.0 | 5 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 75% |

Hadur died in 227 of 350 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 57 | 25% | 87 |
| alpha.RainingFire 1.0 | 43 | 19% | 62 |
| mz.Cork 0.1 | 32 | 14% | 55 |
| bvh.micro.Freya 0.3 | 29 | 13% | 44 |
| bvh.mini.Fenrir 0.39 | 20 | 9% | 25 |
| m3thos.Eva02 0.7.1 | 16 | 7% | 35 |
| squidM.TentalceMeleeNano 1.1 | 13 | 6% | 15 |
| dl.BetterWalls 1.0 | 10 | 4% | 18 |
| sample.MyFirstRobot 1.0 | 7 | 3% | 9 |

## Melee bench: F37

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 80.3 | 151 / 350 | 2.77 | 16.2% | 45412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroL18 0.2 | 1.0 | 16.2% | 151 |
| germ.TheMind .2 | 2.6 | 11.3% | 42 |
| EBBU.Sim2 1.02 | 3.6 | 10.7% | 30 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.9 | 10.7% | 31 |
| agrach.Dalek 1.0 | 5.7 | 9.7% | 27 |
| stelo.UntouchableNano 1.3 | 6.1 | 8.8% | 27 |
| mb.Beast 0.1 | 6.6 | 8.7% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.1% | 2 |
| lmk.ACPFinal 0.1 | 8.4 | 8.1% | 11 |
| skm.Ryubot 1.0 | 9.1 | 7.6% | 10 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 75.6 | 15 / 35 | 4345 |
| 2 | 1 | 64.6 | 83.5 | 15 / 35 | 4872 |
| 3 | 1 | 64.0 | 78.7 | 16 / 35 | 4986 |
| 4 | 1 | 64.1 | 83.8 | 14 / 35 | 4307 |
| 5 | 1 | 63.9 | 80.0 | 17 / 35 | 4526 |
| 6 | 1 | 65.0 | 83.2 | 17 / 35 | 4639 |
| 7 | 1 | 64.6 | 83.2 | 15 / 35 | 4552 |
| 8 | 1 | 63.4 | 79.0 | 15 / 35 | 4537 |
| 9 | 1 | 62.0 | 74.3 | 11 / 35 | 4624 |
| 10 | 1 | 63.4 | 81.9 | 16 / 35 | 4024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 40 | 60% |
| EBBU.Sim2 1.02 | 33 | 52% |
| agrach.Dalek 1.0 | 29 | 66% |
| mb.Beast 0.1 | 28 | 89% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 58% |
| stelo.UntouchableNano 1.3 | 23 | 83% |
| skm.Ryubot 1.0 | 22 | 86% |
| lmk.ACPFinal 0.1 | 12 | 83% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 100% |

Hadur died in 205 of 350 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 43 | 21% | 53 |
| germ.TheMind .2 | 37 | 18% | 62 |
| agrach.Dalek 1.0 | 27 | 13% | 61 |
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 13% | 48 |
| lmk.ACPFinal 0.1 | 22 | 11% | 34 |
| stelo.UntouchableNano 1.3 | 16 | 8% | 26 |
| mb.Beast 0.1 | 13 | 6% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 5% | 11 |
| skm.Ryubot 1.0 | 9 | 4% | 20 |
1 death(s) with no robot to name.

## Melee bench: F38

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 62.2 | 33 / 350 | 4.40 | 11.5% | 27503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.1 | 16.9% | 155 |
| bvh.mini.Freya 0.55 | 1.9 | 13.9% | 41 |
| bts.mega.Gnarly 1.4 | 4.1 | 11.5% | 50 |
| hadur117.nano.SanaroL18 0.2 | 4.3 | 11.5% | 33 |
| cs.Wren 1.0 | 4.8 | 11.2% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.2 | 10.9% | 25 |
| kdf.KoulDestroyer 1.0 | 6.6 | 9.4% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.3% | 5 |
| bzdp.BoxCar 2.0 | 9.4 | 4.4% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 53.2 | 55.6 | 1 / 35 | 2592 |
| 2 | 5 | 56.1 | 61.9 | 3 / 35 | 2696 |
| 3 | 5 | 54.5 | 58.7 | 3 / 35 | 2803 |
| 4 | 3 | 58.4 | 67.9 | 5 / 35 | 2880 |
| 5 | 4 | 53.8 | 58.7 | 1 / 35 | 2463 |
| 6 | 3 | 60.7 | 73.0 | 7 / 35 | 3029 |
| 7 | 3 | 58.0 | 65.1 | 6 / 35 | 3027 |
| 8 | 6 | 54.4 | 59.0 | 1 / 35 | 2544 |
| 9 | 5 | 55.4 | 61.0 | 3 / 35 | 2472 |
| 10 | 3 | 56.6 | 61.0 | 3 / 35 | 2997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 53 | 45% |
| bts.mega.Gnarly 1.4 | 15 | 0% |
| bvh.mini.Freya 0.55 | 13 | 54% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 0% |
| cs.Wren 1.0 | 6 | 33% |
| kdf.KoulDestroyer 1.0 | 2 | 0% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 317 of 350 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 82 | 26% | 106 |
| bvh.mini.Freya 0.55 | 59 | 19% | 63 |
| bts.mega.Gnarly 1.4 | 46 | 15% | 48 |
| cs.Wren 1.0 | 41 | 13% | 42 |
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 13% | 43 |
| kdf.KoulDestroyer 1.0 | 28 | 9% | 27 |
| bzdp.BoxCar 2.0 | 9 | 3% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 2% | 7 |
| matt.UnderDark3 2.4.34 | 5 | 2% | 5 |

## Melee bench: F39

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 66.1 | 39 / 350 | 4.05 | 12.5% | 32060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 15.9% | 96 |
| az.Ololobot 0.2.4 | 2.1 | 14.4% | 128 |
| hadur117.nano.SanaroL18 0.2 | 2.9 | 12.5% | 39 |
| catcat20.Lambda 0.024 | 4.2 | 11.0% | 36 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.5% | 39 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.3% | 3 |
| apollokidd.ApolloKidd 0.9 | 6.9 | 8.2% | 4 |
| gimp.GimpBot 0.1 | 7.3 | 7.9% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 67.9 | 1 / 35 | 3353 |
| 2 | 3 | 58.1 | 66.0 | 6 / 35 | 3491 |
| 3 | 3 | 57.5 | 66.3 | 3 / 35 | 3184 |
| 4 | 4 | 51.4 | 52.7 | 1 / 35 | 2698 |
| 5 | 1 | 61.7 | 74.9 | 9 / 35 | 3786 |
| 6 | 3 | 57.4 | 66.0 | 4 / 35 | 3212 |
| 7 | 3 | 59.2 | 70.2 | 4 / 35 | 3329 |
| 8 | 3 | 56.8 | 66.3 | 3 / 35 | 3050 |
| 9 | 3 | 56.9 | 66.7 | 3 / 35 | 3026 |
| 10 | 3 | 56.1 | 64.1 | 5 / 35 | 2931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 48 | 4% |
| bvh.fry.Freya 0.82 | 39 | 31% |
| catcat20.Lambda 0.024 | 20 | 55% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 39% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| gimp.GimpBot 0.1 | 3 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 0% |

Hadur died in 313 of 350 rounds, at a mean tick of 961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 104 | 33% | 114 |
| az.Ololobot 0.2.4 | 64 | 20% | 68 |
| stelo.SoRobotNanoMelee 1.2 | 44 | 14% | 46 |
| catcat20.Lambda 0.024 | 41 | 13% | 50 |
| apollokidd.ApolloKidd 0.9 | 22 | 7% | 24 |
| winamp32.micro.MicroMacro 1.0 | 14 | 4% | 18 |
| gimp.GimpBot 0.1 | 13 | 4% | 17 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 3% | 10 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 3 |

## Melee bench: F41

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 72.3 | 110 / 350 | 3.49 | 14.2% | 31818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.7 | 15.4% | 129 |
| ary.Swarm 1.1 | 2.4 | 14.3% | 38 |
| hadur117.nano.SanaroL18 0.2 | 2.4 | 14.2% | 110 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 13.1% | 37 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.8% | 26 |
| shrub.Silver v048 | 6.1 | 8.8% | 2 |
| zyx.nano.Ant 1.1 | 6.8 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.1 | 6.2% | 6 |
| stelo.Mirror 1.1 | 8.9 | 5.4% | 3 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.4 | 64.1 | 9 / 35 | 3238 |
| 2 | 2 | 62.3 | 74.3 | 11 / 35 | 3194 |
| 3 | 2 | 62.8 | 73.0 | 14 / 35 | 3373 |
| 4 | 3 | 61.0 | 70.8 | 9 / 35 | 3155 |
| 5 | 1 | 64.1 | 79.7 | 14 / 35 | 3207 |
| 6 | 1 | 63.0 | 77.8 | 15 / 35 | 2948 |
| 7 | 3 | 60.1 | 68.3 | 10 / 35 | 2965 |
| 8 | 4 | 58.0 | 64.1 | 4 / 35 | 2888 |
| 9 | 1 | 64.1 | 78.4 | 11 / 35 | 3764 |
| 10 | 3 | 62.1 | 72.7 | 13 / 35 | 3086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 59 | 44% |
| lessonz.robocode.Oz 0.5.0 | 35 | 89% |
| ary.Swarm 1.1 | 32 | 81% |
| simonton.nano.MeleeSeed 1.8 | 21 | 95% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| shrub.Silver v048 | 3 | 100% |
| stelo.Mirror 1.1 | 1 | 0% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 241 of 350 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 68 | 28% | 96 |
| ary.Swarm 1.1 | 61 | 25% | 89 |
| lessonz.robocode.Oz 0.5.0 | 36 | 15% | 55 |
| simonton.nano.MeleeSeed 1.8 | 29 | 12% | 52 |
| zyx.nano.Ant 1.1 | 15 | 6% | 16 |
| shrub.Silver v048 | 14 | 6% | 16 |
| acogdev.alpha 0.2 | 8 | 3% | 8 |
| stelo.Mirror 1.1 | 6 | 2% | 7 |
| jsal.Jsalbot 1.0 | 4 | 2% | 10 |

## Melee bench: F42

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 70.2 | 61 / 350 | 3.69 | 13.6% | 36328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.5% | 158 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 14.3% | 45 |
| ara.Shera 0.88 | 2.9 | 13.9% | 63 |
| hadur117.nano.SanaroL18 0.2 | 3.3 | 13.6% | 61 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 6 |
| maribo.IotaCT 1.1 | 6.4 | 7.8% | 3 |
| dsw.StaticD 1.0 | 6.6 | 7.4% | 14 |
| mme.NikeEnhanced 2.0 | 8.6 | 5.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.6 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.5 | 67.9 | 3 / 35 | 3047 |
| 2 | 4 | 60.6 | 69.2 | 7 / 35 | 3652 |
| 3 | 2 | 64.9 | 80.6 | 11 / 35 | 4205 |
| 4 | 4 | 61.6 | 72.1 | 6 / 35 | 3806 |
| 5 | 3 | 59.6 | 69.2 | 5 / 35 | 3358 |
| 6 | 2 | 61.5 | 72.4 | 4 / 35 | 4119 |
| 7 | 4 | 59.0 | 65.1 | 4 / 35 | 3579 |
| 8 | 4 | 58.7 | 66.7 | 6 / 35 | 3290 |
| 9 | 3 | 60.5 | 70.5 | 4 / 35 | 3770 |
| 10 | 3 | 60.7 | 67.9 | 11 / 35 | 3502 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 75 | 47% |
| ara.Shera 0.88 | 26 | 35% |
| maribo.mini.MiniQuester 0.1 | 22 | 59% |
| dsw.StaticD 1.0 | 5 | 40% |
| amz.NanoClone 1.41 | 4 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 0% |

Hadur died in 289 of 350 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 89 | 31% | 125 |
| ara.Shera 0.88 | 69 | 24% | 77 |
| maribo.mini.MiniQuester 0.1 | 59 | 20% | 72 |
| amz.NanoClone 1.41 | 32 | 11% | 33 |
| maribo.IotaCT 1.1 | 13 | 4% | 13 |
| dsw.StaticD 1.0 | 9 | 3% | 12 |
| stelo.MirrorMicro 1.0 | 8 | 3% | 8 |
| mme.NikeEnhanced 2.0 | 7 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 1% | 3 |

## Melee bench: F43

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 60.9 | 15 / 350 | 4.52 | 11.3% | 28044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.4% | 267 |
| brainfade.melee.Dusk 0.44 | 2.5 | 13.1% | 38 |
| dummy.micro.Sparrow 2.5 | 2.6 | 12.9% | 17 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.0% | 7 |
| hadur117.nano.SanaroL18 0.2 | 4.6 | 11.3% | 15 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.9% | 3 |
| mz.NanoGod 2.02 | 7.3 | 7.8% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 3 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.8 | 56.8 | 0 / 35 | 2778 |
| 2 | 4 | 57.5 | 60.3 | 0 / 35 | 2808 |
| 3 | 4 | 58.5 | 63.8 | 3 / 35 | 2944 |
| 4 | 4 | 61.7 | 71.1 | 4 / 35 | 3062 |
| 5 | 5 | 55.6 | 56.2 | 0 / 35 | 2673 |
| 6 | 5 | 56.8 | 61.0 | 1 / 35 | 2389 |
| 7 | 5 | 58.5 | 62.5 | 2 / 35 | 2901 |
| 8 | 4 | 57.9 | 60.6 | 2 / 35 | 2861 |
| 9 | 5 | 55.9 | 56.5 | 2 / 35 | 2641 |
| 10 | 5 | 57.7 | 59.7 | 1 / 35 | 2987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 52 | 15% |
| brainfade.melee.Dusk 0.44 | 13 | 31% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 40% |
| dummy.micro.Sparrow 2.5 | 3 | 0% |
| cvt.Firsty 1.0 | 2 | 0% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 335 of 350 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 149 | 44% | 157 |
| dummy.micro.Sparrow 2.5 | 51 | 15% | 51 |
| brainfade.melee.Dusk 0.44 | 46 | 14% | 50 |
| wcsv.melee.EngineerMelee 0.1 | 40 | 12% | 41 |
| mz.NanoGod 2.02 | 18 | 5% | 18 |
| Krabb.akim2.Akim2 1.1b | 15 | 4% | 17 |
| jab.DiamondStealer 5 | 11 | 3% | 11 |
| cvt.Firsty 1.0 | 5 | 1% | 5 |

## Melee bench: F44

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 69.7 | 67 / 350 | 3.73 | 13.9% | 37573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.3 | 16.6% | 136 |
| tzu.TheArtOfWar 1.2 | 1.7 | 15.4% | 95 |
| hadur117.nano.SanaroL18 0.2 | 3.0 | 13.9% | 67 |
| wompi.Quokka 1.6 | 4.2 | 11.3% | 17 |
| jwirde.Gort 2.0 | 4.9 | 10.3% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.1 | 8.9% | 11 |
| disan.Chair 2.2.0 | 7.0 | 7.8% | 7 |
| stf.PanzerGeneral 0.1 | 7.9 | 6.6% | 0 |
| sample.Crazy 1.0 | 9.1 | 4.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 70.8 | 7 / 35 | 3846 |
| 2 | 3 | 61.0 | 70.8 | 6 / 35 | 3637 |
| 3 | 3 | 60.1 | 64.8 | 9 / 35 | 3638 |
| 4 | 3 | 59.2 | 65.7 | 5 / 35 | 3627 |
| 5 | 3 | 60.6 | 67.9 | 7 / 35 | 3704 |
| 6 | 3 | 62.8 | 74.0 | 6 / 35 | 3855 |
| 7 | 3 | 60.5 | 69.2 | 7 / 35 | 3484 |
| 8 | 3 | 60.9 | 70.2 | 6 / 35 | 3776 |
| 9 | 3 | 62.5 | 73.0 | 8 / 35 | 3862 |
| 10 | 3 | 62.0 | 70.5 | 6 / 35 | 4144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 51 | 53% |
| tzu.TheArtOfWar 1.2 | 45 | 31% |
| wompi.Quokka 1.6 | 14 | 71% |
| jwirde.Gort 2.0 | 10 | 70% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 50% |
| disan.Chair 2.2.0 | 4 | 75% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 94 | 33% | 105 |
| stelo.Liblix 0.3.1 | 83 | 29% | 114 |
| jwirde.Gort 2.0 | 34 | 12% | 42 |
| wompi.Quokka 1.6 | 27 | 10% | 36 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 16 | 6% | 17 |
| disan.Chair 2.2.0 | 13 | 5% | 16 |
| stf.PanzerGeneral 0.1 | 9 | 3% | 10 |
| amk.jointstrike.JointStrike 0.2 | 4 | 1% | 4 |
| sample.Crazy 1.0 | 3 | 1% | 6 |

## Melee bench: F45

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 72.0 | 64 / 350 | 3.52 | 14.8% | 40646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroL18 0.2 | 1.0 | 14.8% | 64 |
| jje.BagPuss 1.2 | 2.6 | 12.2% | 30 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 12.4% | 154 |
| sul.Lunar 1.1 | 3.9 | 11.3% | 45 |
| myl.nano.Graviton 1.10 | 4.9 | 10.7% | 16 |
| hvilela.HVilela 0.9 | 6.9 | 9.1% | 4 |
| fm.claire 1.7 | 7.0 | 8.8% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 7.1 | 8.6% | 9 |
| wit.Deep7 2.0 | 9.0 | 6.5% | 23 |
| abud.ThirdRobo 1.0 | 9.9 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 72.7 | 9 / 35 | 4270 |
| 2 | 1 | 60.6 | 69.2 | 4 / 35 | 4087 |
| 3 | 1 | 60.7 | 69.5 | 7 / 35 | 3918 |
| 4 | 1 | 63.1 | 73.3 | 9 / 35 | 4298 |
| 5 | 1 | 61.6 | 70.5 | 4 / 35 | 4228 |
| 6 | 1 | 59.2 | 67.9 | 6 / 35 | 3583 |
| 7 | 1 | 62.9 | 76.5 | 7 / 35 | 4047 |
| 8 | 1 | 59.4 | 67.3 | 5 / 35 | 3689 |
| 9 | 1 | 63.8 | 77.1 | 8 / 35 | 4374 |
| 10 | 1 | 62.6 | 76.2 | 5 / 35 | 4152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 83 | 48% |
| sul.Lunar 1.1 | 27 | 7% |
| jje.BagPuss 1.2 | 26 | 35% |
| wit.Deep7 2.0 | 10 | 10% |
| myl.nano.Graviton 1.10 | 8 | 50% |
| hvilela.HVilela 0.9 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 2 | 50% |

Hadur died in 288 of 350 rounds, at a mean tick of 1278. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sul.Lunar 1.1 | 54 | 19% | 83 |
| myl.nano.Graviton 1.10 | 54 | 19% | 70 |
| eem.IWillFireNoBullet v2.8 | 52 | 18% | 0 |
| jje.BagPuss 1.2 | 50 | 17% | 81 |
| fm.claire 1.7 | 24 | 8% | 29 |
| hvilela.HVilela 0.9 | 20 | 7% | 30 |
| wit.Deep7 2.0 | 16 | 6% | 20 |
| pez.mini.ChironexFleckeri 0.5 | 15 | 5% | 24 |
| abud.ThirdRobo 1.0 | 3 | 1% | 11 |

## Melee bench: F46

hadur117.nano.SanaroL18 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 69.4 | 42 / 350 | 3.75 | 12.7% | 29261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.1 | 17.9% | 139 |
| rsalesc.melee.Medina 0.4.5 | 1.9 | 16.7% | 140 |
| hadur117.nano.SanaroL18 0.2 | 3.0 | 12.7% | 42 |
| mz.MicroSheep 1.0 | 4.4 | 10.5% | 5 |
| cx.Princess 1.0 | 4.8 | 10.4% | 19 |
| sadoner.killer 0.2 | 5.8 | 9.3% | 4 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.4% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.4% | 0 |
| kurios.DOSexe .9a | 9.2 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 64.4 | 5 / 35 | 2848 |
| 2 | 3 | 60.0 | 72.4 | 6 / 35 | 2905 |
| 3 | 3 | 60.0 | 73.3 | 5 / 35 | 2745 |
| 4 | 3 | 58.7 | 70.2 | 1 / 35 | 2921 |
| 5 | 3 | 58.6 | 67.3 | 2 / 35 | 3013 |
| 6 | 3 | 58.9 | 69.2 | 5 / 35 | 2854 |
| 7 | 3 | 57.9 | 67.0 | 3 / 35 | 2692 |
| 8 | 3 | 60.7 | 75.9 | 5 / 35 | 2903 |
| 9 | 3 | 56.9 | 60.6 | 2 / 35 | 3251 |
| 10 | 3 | 61.5 | 74.0 | 8 / 35 | 3129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 74 | 35% |
| rsalesc.melee.Medina 0.4.5 | 36 | 19% |
| cx.Princess 1.0 | 11 | 36% |
| mz.MicroSheep 1.0 | 6 | 67% |
| sadoner.killer 0.2 | 3 | 33% |

Hadur died in 308 of 350 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 125 | 41% | 153 |
| rsalesc.melee.Medina 0.4.5 | 78 | 25% | 84 |
| sadoner.killer 0.2 | 33 | 11% | 34 |
| mz.MicroSheep 1.0 | 21 | 7% | 24 |
| cx.Princess 1.0 | 18 | 6% | 20 |
| jeremyreeder.collective.Prophet 5 | 15 | 5% | 16 |
| arthord.NanoSatanMelee Beta | 13 | 4% | 14 |
| kurios.DOSexe .9a | 3 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |

