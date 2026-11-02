# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 74.5 | 44 / 350 | 3.29 | 14.0% | 38093 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 232 |
| hadur117.nano.SanaroDE 0.3 | 2.1 | 14.0% | 44 |
| sgp.JollyNinja 3.53 | 3.4 | 12.1% | 34 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.5% | 16 |
| mz.MicroGodMelee 1 | 4.8 | 11.0% | 14 |
| lorneswork.Predator 1.0 | 5.4 | 10.3% | 10 |
| adt.Ar2 1.0 | 7.2 | 7.4% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 7.9 | 5.8% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 70.2 | 4 / 35 | 3429 |
| 2 | 2 | 63.0 | 80.3 | 5 / 35 | 3580 |
| 3 | 2 | 62.5 | 78.7 | 4 / 35 | 3696 |
| 4 | 2 | 62.9 | 77.1 | 3 / 35 | 4099 |
| 5 | 2 | 61.8 | 73.3 | 9 / 35 | 3598 |
| 6 | 2 | 61.4 | 73.0 | 4 / 35 | 3984 |
| 7 | 2 | 61.4 | 74.0 | 4 / 35 | 3887 |
| 8 | 2 | 58.8 | 66.0 | 2 / 35 | 3721 |
| 9 | 2 | 62.3 | 75.9 | 4 / 35 | 3756 |
| 10 | 2 | 63.3 | 76.8 | 5 / 35 | 4343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 132 | 6% |
| sgp.JollyNinja 3.53 | 23 | 61% |
| mz.MicroGodMelee 1 | 14 | 64% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 82% |
| lorneswork.Predator 1.0 | 9 | 44% |

Hadur died in 308 of 350 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 165 | 54% | 173 |
| sgp.JollyNinja 3.53 | 46 | 15% | 57 |
| simonton.nano.WeekendObsession_Melee 1.0 | 27 | 9% | 35 |
| mz.MicroGodMelee 1 | 25 | 8% | 35 |
| lorneswork.Predator 1.0 | 24 | 8% | 28 |
| adt.Ar2 1.0 | 10 | 3% | 12 |
| skm.butterfly 1.0 | 4 | 1% | 4 |
| mym.EdgeStalker 1.0 | 4 | 1% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 66.1 | 55 / 350 | 4.05 | 13.5% | 39334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.7 | 14.6% | 88 |
| pulsar.PulsarMax 0.8.9 | 1.9 | 14.5% | 95 |
| hadur117.nano.SanaroDE 0.3 | 2.5 | 13.5% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.2% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 10.2% | 31 |
| sch.Simone 0.3d | 6.7 | 8.8% | 38 |
| Noran.BitchingElk 0.054 | 7.0 | 8.3% | 24 |
| fnc.bandit.Bandit 5.2.0 | 7.1 | 8.4% | 6 |
| stelo.PatternRobot 1.0 | 8.8 | 6.2% | 7 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 73.0 | 7 / 35 | 4391 |
| 2 | 3 | 60.4 | 66.7 | 6 / 35 | 4110 |
| 3 | 1 | 62.2 | 71.7 | 7 / 35 | 4268 |
| 4 | 3 | 58.9 | 65.7 | 3 / 35 | 3556 |
| 5 | 3 | 59.2 | 64.8 | 6 / 35 | 3873 |
| 6 | 3 | 58.5 | 64.1 | 4 / 35 | 3859 |
| 7 | 4 | 56.0 | 58.1 | 3 / 35 | 3536 |
| 8 | 2 | 60.7 | 68.6 | 7 / 35 | 3899 |
| 9 | 3 | 58.8 | 63.2 | 6 / 35 | 3925 |
| 10 | 1 | 58.7 | 65.1 | 6 / 35 | 3917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 23% |
| pulsar.PulsarMax 0.8.9 | 43 | 47% |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 47% |
| sch.Simone 0.3d | 12 | 25% |
| Noran.BitchingElk 0.054 | 9 | 33% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| stelo.PatternRobot 1.0 | 4 | 50% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |
| fullsail.SweetTea 1.1 | 1 | 0% |

Hadur died in 295 of 350 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 73 | 25% | 83 |
| pulsar.PulsarMax 0.8.9 | 65 | 22% | 76 |
| com.cohesiva.robocode.ManOwaR 1.0 | 31 | 11% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 31 | 11% | 38 |
| sch.Simone 0.3d | 24 | 8% | 29 |
| Noran.BitchingElk 0.054 | 21 | 7% | 24 |
| stelo.PatternRobot 1.0 | 21 | 7% | 22 |
| fnc.bandit.Bandit 5.2.0 | 16 | 5% | 19 |
| fullsail.SweetTea 1.1 | 13 | 4% | 14 |

## Melee bench: F03

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 77.8 | 73 / 350 | 2.99 | 14.7% | 39701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.8 | 15.2% | 99 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.5% | 81 |
| hadur117.nano.SanaroDE 0.3 | 2.5 | 14.7% | 73 |
| vuen.Cake 2.51 | 3.5 | 13.7% | 83 |
| urdos.URDOS 1.3 | 5.0 | 10.3% | 12 |
| adt.Ar1 2.1 | 6.0 | 8.3% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.4 | 6.8% | 0 |
| oa.weak.FlyMk1 0.1 | 8.1 | 6.1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 81.3 | 9 / 35 | 3654 |
| 2 | 2 | 62.8 | 80.6 | 8 / 35 | 3940 |
| 3 | 2 | 63.4 | 81.6 | 6 / 35 | 4084 |
| 4 | 4 | 60.8 | 74.9 | 7 / 35 | 3490 |
| 5 | 1 | 64.1 | 81.6 | 9 / 35 | 4267 |
| 6 | 2 | 63.3 | 79.0 | 11 / 35 | 4303 |
| 7 | 3 | 61.9 | 75.9 | 8 / 35 | 3709 |
| 8 | 4 | 61.0 | 71.7 | 4 / 35 | 4177 |
| 9 | 3 | 60.7 | 73.7 | 5 / 35 | 3947 |
| 10 | 2 | 62.7 | 78.1 | 6 / 35 | 4130 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 61 | 44% |
| vuen.Cake 2.51 | 52 | 52% |
| kawigi.nano.Lib 1.0 | 45 | 7% |
| urdos.URDOS 1.3 | 15 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 67% |

Hadur died in 277 of 350 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 96 | 35% | 97 |
| radnor.DoctorBob 1.42 | 76 | 27% | 101 |
| vuen.Cake 2.51 | 40 | 14% | 69 |
| urdos.URDOS 1.3 | 38 | 14% | 47 |
| adt.Ar1 2.1 | 13 | 5% | 13 |
| ghent.ArthurPanzergon 1.0.0 | 5 | 2% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 1% | 4 |
| oa.weak.FlyMk1 0.1 | 3 | 1% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 3 |

## Melee bench: F04

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 71.3 | 11 / 350 | 3.59 | 13.8% | 42591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.1% | 321 |
| hadur117.nano.SanaroDE 0.3 | 2.3 | 13.8% | 11 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.5% | 12 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 2 |
| josago.Jorgito 0.16 | 5.1 | 9.1% | 2 |
| tj.zombie1n 1.0.1 | 6.4 | 7.2% | 1 |
| css.Delitioner 0.11 | 6.5 | 7.5% | 1 |
| rampancy.Durandal 2.1d | 8.1 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.1 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 77.8 | 3 / 35 | 4453 |
| 2 | 2 | 61.7 | 68.6 | 1 / 35 | 4486 |
| 3 | 2 | 61.4 | 69.8 | 0 / 35 | 4116 |
| 4 | 3 | 60.6 | 65.1 | 2 / 35 | 4457 |
| 5 | 2 | 60.7 | 68.6 | 1 / 35 | 3990 |
| 6 | 3 | 61.6 | 71.7 | 1 / 35 | 3938 |
| 7 | 2 | 63.8 | 77.1 | 1 / 35 | 4434 |
| 8 | 2 | 63.4 | 77.1 | 1 / 35 | 4209 |
| 9 | 2 | 62.0 | 69.2 | 1 / 35 | 4438 |
| 10 | 3 | 60.7 | 67.6 | 0 / 35 | 4070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 132 | 2% |
| apc.LeeroyJenkins2 1.0 | 8 | 63% |
| josago.Jorgito 0.16 | 2 | 50% |
| TNT.TNT 0.99.1 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 0% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 339 of 350 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 206 | 61% | 209 |
| apc.LeeroyJenkins2 1.0 | 56 | 17% | 60 |
| josago.Jorgito 0.16 | 29 | 9% | 31 |
| TNT.TNT 0.99.1 | 25 | 7% | 27 |
| css.Delitioner 0.11 | 12 | 4% | 12 |
| tj.zombie1n 1.0.1 | 6 | 2% | 6 |
| rampancy.Durandal 2.1d | 4 | 1% | 4 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 70.0 | 77 / 350 | 3.70 | 13.5% | 32445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.6% | 77 |
| origin.SleepSiphon 1.7b | 1.9 | 15.0% | 122 |
| hadur117.nano.SanaroDE 0.3 | 3.1 | 13.5% | 77 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.5% | 39 |
| mld.Wisdom 1.0 | 5.0 | 10.6% | 11 |
| gg.Wolverine 2.0 | 6.5 | 8.5% | 11 |
| spinnercat.Omen 1.0 | 7.3 | 7.8% | 4 |
| DBall.NUKE 0.1 | 7.6 | 7.4% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.3% | 5 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.8 | 62.9 | 5 / 35 | 2943 |
| 2 | 2 | 62.1 | 75.6 | 9 / 35 | 3504 |
| 3 | 3 | 59.5 | 67.9 | 7 / 35 | 3161 |
| 4 | 3 | 58.8 | 67.0 | 7 / 35 | 3069 |
| 5 | 4 | 59.5 | 66.3 | 6 / 35 | 3317 |
| 6 | 3 | 60.0 | 71.4 | 7 / 35 | 2922 |
| 7 | 3 | 60.6 | 69.8 | 11 / 35 | 3122 |
| 8 | 3 | 61.3 | 72.1 | 9 / 35 | 3368 |
| 9 | 3 | 62.3 | 74.6 | 10 / 35 | 3412 |
| 10 | 3 | 61.7 | 72.7 | 6 / 35 | 3627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 47 | 17% |
| jekl.StoneGhost 0.7 | 46 | 70% |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 68% |
| gg.Wolverine 2.0 | 7 | 71% |
| DBall.NUKE 0.1 | 7 | 86% |
| mld.Wisdom 1.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 274 of 350 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 94 | 34% | 106 |
| jekl.StoneGhost 0.7 | 64 | 23% | 90 |
| pe.minimelee.SandboxMiniMelee 1.1 | 45 | 16% | 61 |
| mld.Wisdom 1.0 | 30 | 11% | 35 |
| spinnercat.Omen 1.0 | 17 | 6% | 19 |
| gg.Wolverine 2.0 | 13 | 5% | 18 |
| DBall.NUKE 0.1 | 5 | 2% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 1% | 8 |
| sample.Fire 1.0 | 2 | 1% | 2 |

## Melee bench: F07

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.9 | 49 / 350 | 2.72 | 15.9% | 46772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.3 | 18.2% | 125 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.2% | 78 |
| hadur117.nano.SanaroDE 0.3 | 2.9 | 15.9% | 49 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 12.0% | 42 |
| franzor.Lizt 1.3.1 | 4.5 | 11.8% | 55 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.4% | 2 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.5 | 79.7 | 2 / 35 | 4586 |
| 2 | 3 | 65.0 | 78.1 | 2 / 35 | 4448 |
| 3 | 3 | 65.0 | 76.5 | 5 / 35 | 4525 |
| 4 | 3 | 67.7 | 85.1 | 5 / 35 | 5020 |
| 5 | 3 | 67.0 | 82.5 | 10 / 35 | 4610 |
| 6 | 3 | 66.1 | 80.0 | 5 / 35 | 4671 |
| 7 | 2 | 66.8 | 80.6 | 5 / 35 | 4975 |
| 8 | 3 | 66.9 | 81.9 | 5 / 35 | 4903 |
| 9 | 3 | 66.8 | 83.8 | 5 / 35 | 4854 |
| 10 | 3 | 65.0 | 80.6 | 5 / 35 | 4180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 97 | 34% |
| rsalesc.melee.Monk 0.3.6c | 41 | 5% |
| oog.melee.CapuletDroid 1.1 | 30 | 27% |
| franzor.Lizt 1.3.1 | 24 | 17% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 0% |

Hadur died in 301 of 350 rounds, at a mean tick of 1282. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 160 | 53% | 211 |
| rsalesc.melee.Monk 0.3.6c | 69 | 23% | 82 |
| oog.melee.CapuletDroid 1.1 | 37 | 12% | 42 |
| franzor.Lizt 1.3.1 | 25 | 8% | 0 |
| exauge.GateKeeper 1.1.121g | 5 | 2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 6 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 2 |

## Melee bench: F08

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 10 battles (0.4 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 67.7 | 77 / 350 | 3.90 | 13.2% | 31958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| shrub.Vapour v159 | 1.8 | 13.9% | 86 |
| hadur117.nano.SanaroDE 0.3 | 2.4 | 13.2% | 77 |
| tm.Yuugao 1.0 | 2.4 | 13.7% | 102 |
| Krabb.sliNk.Garm 0.9u | 4.1 | 10.7% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 4.4 | 10.5% | 33 |
| m3thos.Eva00 1.1 | 6.4 | 8.8% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.6 | 8.6% | 16 |
| SHAM.WOW 1.4 | 8.7 | 7.1% | 5 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.7% | 2 |
| qualidafial.MajorDick 1.0.1 | 9.2 | 6.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.0 | 69.5 | 8 / 35 | 3114 |
| 2 | 3 | 57.3 | 64.4 | 4 / 35 | 3192 |
| 3 | 2 | 61.2 | 75.9 | 8 / 35 | 3418 |
| 4 | 3 | 59.3 | 68.6 | 9 / 35 | 3316 |
| 5 | 3 | 55.3 | 61.3 | 4 / 35 | 2865 |
| 6 | 2 | 58.0 | 66.3 | 8 / 35 | 3064 |
| 7 | 2 | 58.9 | 67.9 | 13 / 35 | 2933 |
| 8 | 2 | 58.4 | 65.4 | 8 / 35 | 3489 |
| 9 | 2 | 59.6 | 70.8 | 6 / 35 | 3448 |
| 10 | 3 | 58.6 | 67.3 | 9 / 35 | 3119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 42 | 31% |
| shrub.Vapour v159 | 35 | 37% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 71% |
| Krabb.sliNk.Garm 0.9u | 19 | 95% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 82% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| m3thos.Eva00 1.1 | 5 | 80% |
| SHAM.WOW 1.4 | 1 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 0% |

Hadur died in 277 of 350 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 88 | 32% | 104 |
| tm.Yuugao 1.0 | 69 | 25% | 84 |
| com.spp.robocode.MostlyHarmless 010 | 29 | 10% | 41 |
| Krabb.sliNk.Garm 0.9u | 26 | 9% | 36 |
| jwst.DAD.DarkAndDarker 1.1 | 19 | 7% | 26 |
| m3thos.Eva00 1.1 | 13 | 5% | 19 |
| SHAM.WOW 1.4 | 12 | 4% | 16 |
| zyx.nano.BacillusComma 1.0 | 11 | 4% | 17 |
| qualidafial.MajorDick 1.0.1 | 7 | 3% | 7 |
3 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 62.4 | 35 / 350 | 4.38 | 12.0% | 29717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.7% | 180 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 62 |
| hadur117.nano.SanaroDE 0.3 | 3.4 | 12.0% | 35 |
| pedersen.Grishnakh 1.0 | 4.4 | 11.0% | 33 |
| yagami.Tidus 0.11 | 4.7 | 10.9% | 4 |
| mc2.enemy.Original 0.9 | 5.5 | 10.0% | 29 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 6 |
| step.nanoPri 1.0 | 8.2 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 61.6 | 3 / 35 | 2976 |
| 2 | 5 | 54.6 | 56.2 | 1 / 35 | 2787 |
| 3 | 4 | 56.9 | 62.2 | 4 / 35 | 2739 |
| 4 | 3 | 58.2 | 65.1 | 1 / 35 | 3220 |
| 5 | 3 | 55.8 | 58.4 | 6 / 35 | 2910 |
| 6 | 3 | 58.3 | 64.8 | 3 / 35 | 3190 |
| 7 | 4 | 55.5 | 59.4 | 2 / 35 | 2750 |
| 8 | 3 | 58.6 | 64.8 | 5 / 35 | 3179 |
| 9 | 3 | 58.2 | 63.8 | 4 / 35 | 3069 |
| 10 | 3 | 59.1 | 68.3 | 6 / 35 | 2897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 48 | 4% |
| kc.micro.Figment 1.0 | 24 | 75% |
| mc2.enemy.Original 0.9 | 10 | 40% |
| yagami.Tidus 0.11 | 10 | 90% |
| pedersen.Grishnakh 1.0 | 7 | 29% |

Hadur died in 315 of 350 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 100 | 32% | 103 |
| kc.micro.Figment 1.0 | 62 | 20% | 84 |
| yagami.Tidus 0.11 | 42 | 13% | 48 |
| mc2.enemy.Original 0.9 | 38 | 12% | 43 |
| pedersen.Grishnakh 1.0 | 34 | 11% | 34 |
| robar.nano.Assertive_Melee 0.2 | 15 | 5% | 15 |
| step.nanoPri 1.0 | 11 | 3% | 11 |
| rdm.Dueler 0.4x | 7 | 2% | 6 |
| dft.Calliope 5.6 | 6 | 2% | 6 |

## Melee bench: F10

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 77.3 | 92 / 350 | 3.05 | 14.9% | 38675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.4 | 15.8% | 105 |
| hadur117.nano.SanaroDE 0.3 | 2.1 | 14.9% | 92 |
| ne.Chimera 1.2 | 3.1 | 13.6% | 41 |
| ejb.Polaris 1.0.1 | 3.5 | 12.7% | 49 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.7% | 37 |
| vStar.RAFzilla 2.15 | 5.6 | 10.7% | 15 |
| sam.Samspin 1.0 | 7.6 | 6.1% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.5% | 1 |
| kurios.DOSexe .9b | 8.3 | 5.7% | 5 |
| donjezza.Muncho 1.0 | 9.9 | 4.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.5 | 68.9 | 8 / 35 | 3364 |
| 2 | 2 | 62.5 | 75.2 | 9 / 35 | 4084 |
| 3 | 1 | 65.6 | 85.7 | 15 / 35 | 3925 |
| 4 | 2 | 64.0 | 80.3 | 9 / 35 | 4076 |
| 5 | 1 | 64.3 | 80.6 | 14 / 35 | 4024 |
| 6 | 2 | 60.6 | 71.7 | 5 / 35 | 3695 |
| 7 | 4 | 59.3 | 69.8 | 7 / 35 | 3166 |
| 8 | 1 | 64.2 | 81.0 | 10 / 35 | 4304 |
| 9 | 2 | 62.9 | 80.0 | 5 / 35 | 3921 |
| 10 | 2 | 64.1 | 79.4 | 10 / 35 | 4116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 67 | 39% |
| ejb.Polaris 1.0.1 | 50 | 52% |
| ne.Chimera 1.2 | 31 | 68% |
| tvv.micro.Antares 1.1.1 | 19 | 26% |
| vStar.RAFzilla 2.15 | 17 | 65% |
| donjezza.Muncho 1.0 | 3 | 67% |
| kurios.DOSexe .9b | 2 | 50% |
| sam.Samspin 1.0 | 1 | 0% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 0% |

Hadur died in 258 of 350 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 98 | 38% | 120 |
| ne.Chimera 1.2 | 50 | 19% | 73 |
| ejb.Polaris 1.0.1 | 41 | 16% | 70 |
| tvv.micro.Antares 1.1.1 | 30 | 12% | 27 |
| vStar.RAFzilla 2.15 | 14 | 5% | 24 |
| sam.Samspin 1.0 | 10 | 4% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 3% | 8 |
| donjezza.Muncho 1.0 | 4 | 2% | 5 |
| kurios.DOSexe .9b | 3 | 1% | 12 |

## Melee bench: F11

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 66.1 | 43 / 350 | 4.05 | 12.8% | 32477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.3% | 153 |
| hadur117.nano.SanaroDE 0.3 | 2.5 | 12.8% | 43 |
| cx.mini.Nimrod 0.55 | 2.7 | 13.1% | 49 |
| djc.DynaBot 0.1.1 | 4.0 | 11.2% | 24 |
| rdt199.Warlord 0.73 | 5.6 | 9.7% | 37 |
| br2.MobyDickBot 1.6 | 6.0 | 9.5% | 22 |
| uji.YellohFellah 1.0 | 6.5 | 8.7% | 24 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.5% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.2 | 63.5 | 6 / 35 | 3382 |
| 2 | 2 | 57.4 | 67.0 | 3 / 35 | 2832 |
| 3 | 3 | 58.3 | 63.8 | 5 / 35 | 3172 |
| 4 | 3 | 57.2 | 60.6 | 5 / 35 | 3291 |
| 5 | 2 | 62.7 | 77.8 | 5 / 35 | 3707 |
| 6 | 3 | 57.0 | 65.1 | 1 / 35 | 3011 |
| 7 | 3 | 56.7 | 60.6 | 4 / 35 | 3292 |
| 8 | 2 | 57.8 | 66.3 | 2 / 35 | 3140 |
| 9 | 2 | 61.8 | 72.1 | 6 / 35 | 3812 |
| 10 | 3 | 57.1 | 63.8 | 6 / 35 | 2838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 50 | 20% |
| djc.DynaBot 0.1.1 | 20 | 85% |
| cx.mini.Nimrod 0.55 | 16 | 31% |
| rdt199.Warlord 0.73 | 11 | 45% |
| uji.YellohFellah 1.0 | 10 | 40% |
| br2.MobyDickBot 1.6 | 6 | 17% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 114 | 37% | 125 |
| cx.mini.Nimrod 0.55 | 68 | 22% | 74 |
| rdt199.Warlord 0.73 | 35 | 11% | 41 |
| djc.DynaBot 0.1.1 | 33 | 11% | 43 |
| uji.YellohFellah 1.0 | 29 | 9% | 35 |
| br2.MobyDickBot 1.6 | 10 | 3% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 3% | 8 |
| stelo.MirrorNano 1.3 | 5 | 2% | 5 |
| KiraNL.Chupacabra 0.4 | 5 | 2% | 5 |

## Melee bench: F12

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 71.7 | 67 / 350 | 3.54 | 13.7% | 30496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.7 | 14.9% | 92 |
| nat.PallasHawk 1.0 | 2.0 | 14.4% | 95 |
| hadur117.nano.SanaroDE 0.3 | 2.9 | 13.7% | 67 |
| darkcanuck.Leon 1.01 | 3.4 | 13.3% | 59 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 29 |
| jrm.Test0 1.0 | 6.7 | 7.9% | 3 |
| cs.sheldor.Talon 1.1 | 7.1 | 7.4% | 4 |
| jp.Perpy 16.0 | 7.2 | 7.3% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.5% | 0 |
| jaybot.bots.Oddball 4.0 | 9.7 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 77.8 | 8 / 35 | 2824 |
| 2 | 4 | 59.1 | 69.5 | 5 / 35 | 2918 |
| 3 | 4 | 60.1 | 70.2 | 8 / 35 | 2959 |
| 4 | 4 | 57.8 | 64.8 | 4 / 35 | 3100 |
| 5 | 3 | 61.5 | 74.6 | 6 / 35 | 3195 |
| 6 | 2 | 61.3 | 75.6 | 9 / 35 | 2930 |
| 7 | 1 | 61.3 | 73.3 | 7 / 35 | 3455 |
| 8 | 2 | 61.5 | 75.2 | 6 / 35 | 3234 |
| 9 | 3 | 58.4 | 67.3 | 6 / 35 | 2737 |
| 10 | 3 | 59.9 | 69.2 | 8 / 35 | 3144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 54 | 44% |
| nat.PallasHawk 1.0 | 52 | 37% |
| darkcanuck.Leon 1.01 | 44 | 39% |
| brainfade.melee.Genghis 0.36 | 7 | 29% |
| cs.sheldor.Talon 1.1 | 4 | 50% |
| jrm.Test0 1.0 | 4 | 75% |

Hadur died in 287 of 350 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 78 | 27% | 97 |
| bts.wiki.RipCurl 0.9b | 69 | 24% | 89 |
| darkcanuck.Leon 1.01 | 56 | 20% | 76 |
| brainfade.melee.Genghis 0.36 | 35 | 12% | 35 |
| cs.sheldor.Talon 1.1 | 16 | 6% | 19 |
| jrm.Test0 1.0 | 13 | 5% | 13 |
| jp.Perpy 16.0 | 9 | 3% | 10 |
| jaybot.bots.Oddball 4.0 | 7 | 2% | 7 |
| stuff.Vlad 0.1 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 70.8 | 25 / 350 | 3.63 | 12.8% | 31325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.0 | 17.9% | 183 |
| ags.Glacier 0.2.11 | 2.0 | 16.3% | 79 |
| hadur117.nano.SanaroDE 0.3 | 3.5 | 12.8% | 25 |
| shinh.Entangled 0.3 | 4.0 | 12.7% | 37 |
| gh.micro.Gruweltje 0.7 | 4.5 | 12.0% | 24 |
| apc.Colossus2 0.17 | 6.0 | 8.2% | 0 |
| stelo.Wang 1.0 | 7.1 | 7.0% | 2 |
| ayk.WallHugger 1.0 | 8.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 70.8 | 2 / 35 | 2958 |
| 2 | 3 | 61.4 | 77.1 | 4 / 35 | 3019 |
| 3 | 3 | 61.4 | 75.9 | 1 / 35 | 3347 |
| 4 | 4 | 59.1 | 67.0 | 3 / 35 | 3279 |
| 5 | 4 | 58.0 | 67.6 | 1 / 35 | 3033 |
| 6 | 3 | 61.0 | 73.3 | 5 / 35 | 3157 |
| 7 | 3 | 60.6 | 72.4 | 1 / 35 | 3397 |
| 8 | 4 | 59.0 | 69.2 | 1 / 35 | 3201 |
| 9 | 5 | 56.7 | 61.6 | 3 / 35 | 2955 |
| 10 | 3 | 60.2 | 73.0 | 4 / 35 | 2979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 72 | 13% |
| ags.Glacier 0.2.11 | 44 | 20% |
| shinh.Entangled 0.3 | 18 | 28% |
| gh.micro.Gruweltje 0.7 | 3 | 33% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 325 of 350 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 118 | 36% | 126 |
| ags.Glacier 0.2.11 | 83 | 26% | 94 |
| shinh.Entangled 0.3 | 50 | 15% | 54 |
| gh.micro.Gruweltje 0.7 | 38 | 12% | 40 |
| stelo.Wang 1.0 | 14 | 4% | 14 |
| apc.Colossus2 0.17 | 12 | 4% | 12 |
| maribo.FollowFire 1 | 6 | 2% | 6 |
| ayk.WallHugger 1.0 | 4 | 1% | 4 |

## Melee bench: F14

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 74.0 | 71 / 350 | 3.34 | 13.9% | 33679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.4% | 136 |
| hadur117.nano.SanaroDE 0.3 | 2.4 | 13.9% | 71 |
| catcat20.shape.Theta 0.018 | 2.6 | 13.4% | 90 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 10.3% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.1 | 10.2% | 20 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 9.4% | 5 |
| sanyi.mikrobi.Roberto 1.0 | 6.5 | 9.4% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.6 | 8.2% | 12 |
| pa.Improved 1.0 | 9.0 | 5.7% | 2 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 82.2 | 13 / 35 | 3442 |
| 2 | 3 | 57.8 | 65.4 | 3 / 35 | 3008 |
| 3 | 3 | 62.6 | 78.4 | 5 / 35 | 3724 |
| 4 | 2 | 59.5 | 68.3 | 6 / 35 | 3257 |
| 5 | 2 | 60.6 | 72.4 | 9 / 35 | 3179 |
| 6 | 3 | 58.6 | 67.6 | 4 / 35 | 3106 |
| 7 | 3 | 61.1 | 74.6 | 7 / 35 | 3295 |
| 8 | 2 | 62.2 | 75.9 | 9 / 35 | 3446 |
| 9 | 2 | 62.9 | 78.4 | 7 / 35 | 3434 |
| 10 | 2 | 62.3 | 76.5 | 8 / 35 | 3788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 41% |
| catcat20.shape.Theta 0.018 | 41 | 24% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 62% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 85% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 25% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 103 | 37% | 140 |
| catcat20.shape.Theta 0.018 | 66 | 23% | 77 |
| dmh.robocode.robot.RedDwarf 0.4 | 29 | 10% | 32 |
| sanyi.mikrobi.Roberto 1.0 | 25 | 9% | 35 |
| co.edu.usb.rc.LidisTron 1.0 | 20 | 7% | 15 |
| Lo_Ian.Gandalf_V4 4.0 | 17 | 6% | 20 |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 5% | 22 |
| pa.Improved 1.0 | 4 | 1% | 5 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 63.4 | 27 / 350 | 4.29 | 12.5% | 35373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.0 | 15.1% | 76 |
| emp.Yngwie 1.11 | 2.9 | 13.4% | 102 |
| mld.DustBunny 3.8 | 3.6 | 12.9% | 40 |
| hadur117.nano.SanaroDE 0.3 | 3.8 | 12.5% | 27 |
| cb.nano.Insomnia 1.0 | 4.0 | 12.2% | 41 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.7% | 57 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.0% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.5% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.2 | 62.2 | 1 / 35 | 3092 |
| 2 | 5 | 55.2 | 60.3 | 2 / 35 | 2923 |
| 3 | 2 | 60.5 | 68.9 | 5 / 35 | 3931 |
| 4 | 5 | 55.7 | 58.4 | 2 / 35 | 3415 |
| 5 | 3 | 59.3 | 64.8 | 2 / 35 | 3920 |
| 6 | 3 | 59.5 | 67.0 | 3 / 35 | 3771 |
| 7 | 4 | 57.9 | 64.8 | 0 / 35 | 3584 |
| 8 | 5 | 55.7 | 56.2 | 3 / 35 | 3420 |
| 9 | 4 | 58.7 | 65.1 | 2 / 35 | 3740 |
| 10 | 3 | 59.7 | 66.7 | 7 / 35 | 3577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 28 | 21% |
| kawigi.micro.Shiz 1.1 | 22 | 18% |
| cb.nano.Insomnia 1.0 | 17 | 18% |
| mld.DustBunny 3.8 | 14 | 29% |
| kawigi.robot.Girl 1.2 | 13 | 46% |
| divineomega.TrialBot 0.003 | 4 | 50% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 324 of 350 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 80 | 25% | 86 |
| emp.Yngwie 1.11 | 68 | 21% | 81 |
| mld.DustBunny 3.8 | 49 | 15% | 56 |
| cb.nano.Insomnia 1.0 | 48 | 15% | 34 |
| kawigi.robot.Girl 1.2 | 41 | 13% | 48 |
| divineomega.TrialBot 0.003 | 12 | 4% | 15 |
| lambdaxy.TBot 0.1 | 12 | 4% | 13 |
| Grystrion.TrackerWO 1.0 | 11 | 3% | 14 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 1% | 3 |

## Melee bench: F16

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 67.5 | 35 / 350 | 3.93 | 13.5% | 39112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.0% | 161 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.4 | 14.4% | 20 |
| hadur117.nano.SanaroDE 0.3 | 2.7 | 13.5% | 35 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.4% | 80 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.8% | 28 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.7% | 10 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.8% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.6 | 5.4% | 10 |
| repositorio.NanoStep 1.0 | 8.8 | 5.3% | 3 |
| asd.Cthulhu 1.3 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 64.8 | 2 / 35 | 3452 |
| 2 | 3 | 62.1 | 73.0 | 4 / 35 | 3836 |
| 3 | 3 | 61.2 | 67.6 | 5 / 35 | 4150 |
| 4 | 3 | 59.1 | 64.1 | 3 / 35 | 3829 |
| 5 | 3 | 57.1 | 59.0 | 3 / 35 | 3665 |
| 6 | 3 | 58.5 | 63.5 | 2 / 35 | 3646 |
| 7 | 3 | 59.1 | 63.8 | 4 / 35 | 4016 |
| 8 | 2 | 61.8 | 72.1 | 4 / 35 | 3980 |
| 9 | 2 | 63.3 | 74.6 | 4 / 35 | 4305 |
| 10 | 2 | 62.1 | 72.1 | 4 / 35 | 4233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 75 | 8% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 90% |
| techdude.forest.FlamingForest 1.1 | 17 | 18% |
| tvv.nano.Polaris 1.2 | 8 | 0% |
| divineomega.DivineBot 1.9.4.5 | 7 | 29% |
| bvh.fnr.Fenrir 0.36l | 6 | 50% |
| repositorio.NanoStep 1.0 | 2 | 50% |
| stelo.IntrinsicVolatility 1.4 | 2 | 50% |

Hadur died in 315 of 350 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 140 | 44% | 147 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 50 | 16% | 66 |
| techdude.forest.FlamingForest 1.1 | 40 | 13% | 43 |
| bvh.fnr.Fenrir 0.36l | 30 | 10% | 30 |
| tvv.nano.Polaris 1.2 | 24 | 8% | 24 |
| stelo.IntrinsicVolatility 1.4 | 16 | 5% | 19 |
| divineomega.DivineBot 1.9.4.5 | 11 | 3% | 16 |
| repositorio.NanoStep 1.0 | 3 | 1% | 4 |
| asd.Cthulhu 1.3 | 1 | 0% | 1 |

## Melee bench: F17

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 65.8 | 35 / 350 | 4.08 | 12.8% | 35212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.9 | 14.4% | 79 |
| oog.melee.Mercutio 1.0 | 2.6 | 13.9% | 96 |
| cx.BlestPain 1.41 | 3.5 | 12.6% | 67 |
| hadur117.nano.SanaroDE 0.3 | 3.5 | 12.8% | 35 |
| nic.Nicator 2.4 | 4.3 | 12.2% | 37 |
| ahf.NanoAndrew .4 | 5.3 | 11.0% | 28 |
| maribo.melee.BMV 0.1 | 6.9 | 9.4% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 8.4 | 5.4% | 1 |
| tex.Longbot 0.4 | 8.6 | 5.3% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 54.8 | 56.2 | 2 / 35 | 3193 |
| 2 | 5 | 58.5 | 65.4 | 3 / 35 | 3382 |
| 3 | 5 | 57.4 | 61.6 | 2 / 35 | 3475 |
| 4 | 3 | 59.4 | 65.4 | 6 / 35 | 3617 |
| 5 | 5 | 55.1 | 54.9 | 2 / 35 | 3217 |
| 6 | 2 | 62.9 | 76.2 | 5 / 35 | 3941 |
| 7 | 1 | 61.8 | 73.7 | 5 / 35 | 3642 |
| 8 | 2 | 60.2 | 70.5 | 3 / 35 | 3760 |
| 9 | 4 | 57.9 | 63.5 | 3 / 35 | 3263 |
| 10 | 2 | 60.0 | 70.5 | 4 / 35 | 3722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 39 | 21% |
| oog.melee.Mercutio 1.0 | 28 | 43% |
| cx.BlestPain 1.41 | 23 | 22% |
| nic.Nicator 2.4 | 15 | 33% |
| ahf.NanoAndrew .4 | 5 | 60% |
| maribo.melee.BMV 0.1 | 3 | 67% |

Hadur died in 315 of 350 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 78 | 25% | 88 |
| nic.Nicator 2.4 | 58 | 18% | 64 |
| oog.melee.Mercutio 1.0 | 48 | 15% | 61 |
| cx.BlestPain 1.41 | 47 | 15% | 49 |
| ahf.NanoAndrew .4 | 43 | 14% | 45 |
| maribo.melee.BMV 0.1 | 23 | 7% | 23 |
| tex.Longbot 0.4 | 11 | 3% | 12 |
| edu.otg.spr.TheTeacher 1.2 | 6 | 2% | 7 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 67.6 | 63 / 350 | 3.92 | 13.2% | 32776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.5 | 14.3% | 90 |
| agd.Mooserwirt2 2.7 | 2.4 | 13.0% | 79 |
| hadur117.nano.SanaroDE 0.3 | 2.7 | 13.2% | 63 |
| uji.DBH 1.1 | 4.5 | 11.3% | 38 |
| ratosh.Nobo 0.21 | 5.0 | 10.7% | 15 |
| spinnercat.Robovirus 2.718 | 5.0 | 10.6% | 31 |
| sigterm.Sigterm 1.0 | 7.1 | 8.8% | 22 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.3% | 3 |
| stelo.WangRobot 1.0 | 9.0 | 5.8% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 54.9 | 60.0 | 4 / 35 | 2915 |
| 2 | 2 | 60.8 | 72.1 | 10 / 35 | 3306 |
| 3 | 3 | 57.3 | 63.5 | 4 / 35 | 3332 |
| 4 | 2 | 61.6 | 73.7 | 9 / 35 | 3582 |
| 5 | 3 | 58.7 | 66.7 | 7 / 35 | 3310 |
| 6 | 2 | 59.2 | 68.3 | 8 / 35 | 3274 |
| 7 | 1 | 61.5 | 75.9 | 6 / 35 | 3466 |
| 8 | 2 | 58.7 | 66.3 | 7 / 35 | 3233 |
| 9 | 6 | 55.3 | 59.7 | 2 / 35 | 3021 |
| 10 | 3 | 59.9 | 69.8 | 6 / 35 | 3337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 47% |
| agd.Mooserwirt2 2.7 | 31 | 32% |
| spinnercat.Robovirus 2.718 | 20 | 40% |
| uji.DBH 1.1 | 19 | 42% |
| sigterm.Sigterm 1.0 | 9 | 33% |
| ratosh.Nobo 0.21 | 9 | 67% |
| stelo.WangRobot 1.0 | 7 | 57% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |

Hadur died in 288 of 350 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 77 | 27% | 100 |
| agd.Mooserwirt2 2.7 | 68 | 24% | 78 |
| uji.DBH 1.1 | 36 | 13% | 43 |
| spinnercat.Robovirus 2.718 | 33 | 11% | 34 |
| ratosh.Nobo 0.21 | 31 | 11% | 39 |
| sigterm.Sigterm 1.0 | 17 | 6% | 19 |
| stelo.WangRobot 1.0 | 13 | 5% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 2% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 2% | 7 |

## Melee bench: F19

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 78.3 | 81 / 350 | 2.95 | 15.3% | 39163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.7 | 15.9% | 128 |
| davidalves.net.DuelistMiniMelee 1.2 | 1.7 | 16.3% | 106 |
| hadur117.nano.SanaroDE 0.3 | 2.6 | 15.3% | 81 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.6% | 8 |
| erdnis.Rover 0.3 | 4.7 | 10.6% | 9 |
| patson.PatsonTestBot 1.0 | 6.1 | 8.7% | 5 |
| pac.ABC 2.1 | 7.3 | 7.6% | 12 |
| mbh.Mbh 0.1 | 7.7 | 7.0% | 0 |
| pbg.R2D2 1.0 | 8.9 | 5.9% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 76.2 | 5 / 35 | 3974 |
| 2 | 2 | 65.7 | 81.6 | 11 / 35 | 4105 |
| 3 | 2 | 65.7 | 81.6 | 10 / 35 | 4269 |
| 4 | 3 | 63.8 | 77.8 | 8 / 35 | 3539 |
| 5 | 3 | 62.4 | 73.3 | 5 / 35 | 3821 |
| 6 | 2 | 63.9 | 75.9 | 10 / 35 | 3974 |
| 7 | 2 | 64.4 | 79.7 | 7 / 35 | 3818 |
| 8 | 3 | 64.2 | 79.4 | 9 / 35 | 3833 |
| 9 | 3 | 65.4 | 80.0 | 8 / 35 | 4049 |
| 10 | 3 | 64.1 | 78.1 | 8 / 35 | 3781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 84 | 33% |
| davidalves.net.DuelistMiniMelee 1.2 | 78 | 27% |
| krillr.mini.JointStrike 2.0.0 | 16 | 88% |
| erdnis.Rover 0.3 | 9 | 78% |
| pac.ABC 2.1 | 9 | 67% |
| patson.PatsonTestBot 1.0 | 6 | 83% |

Hadur died in 269 of 350 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 129 | 48% | 173 |
| mld.Infinity 2.2 | 77 | 29% | 33 |
| erdnis.Rover 0.3 | 19 | 7% | 36 |
| patson.PatsonTestBot 1.0 | 17 | 6% | 33 |
| krillr.mini.JointStrike 2.0.0 | 14 | 5% | 28 |
| pac.ABC 2.1 | 10 | 4% | 20 |
| mbh.Mbh 0.1 | 2 | 1% | 10 |
| pbg.R2D2 1.0 | 1 | 0% | 10 |

## Melee bench: F20

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 64.9 | 50 / 350 | 4.16 | 12.7% | 33654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.8% | 140 |
| fwb.Nine 1.0.1 | 2.8 | 12.5% | 56 |
| hadur117.nano.SanaroDE 0.3 | 3.0 | 12.7% | 50 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.2% | 29 |
| catcat20.Rabbit 0.001 | 5.3 | 10.4% | 35 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.5% | 12 |
| djdjdj.NanoSkunk10 1.0 | 6.9 | 8.5% | 10 |
| bayen.nut.Squirrel 1.615 | 7.1 | 7.8% | 15 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 66.0 | 5 / 35 | 3124 |
| 2 | 3 | 58.3 | 65.1 | 6 / 35 | 3382 |
| 3 | 2 | 60.9 | 71.4 | 5 / 35 | 3685 |
| 4 | 3 | 58.2 | 64.4 | 5 / 35 | 3368 |
| 5 | 2 | 60.2 | 67.9 | 4 / 35 | 3745 |
| 6 | 3 | 57.1 | 62.5 | 4 / 35 | 3332 |
| 7 | 4 | 57.1 | 59.0 | 4 / 35 | 3397 |
| 8 | 2 | 57.6 | 64.8 | 6 / 35 | 3189 |
| 9 | 4 | 58.9 | 64.8 | 7 / 35 | 3402 |
| 10 | 4 | 57.1 | 63.2 | 4 / 35 | 3030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 65 | 51% |
| catcat20.Rabbit 0.001 | 13 | 31% |
| bayen.nut.Squirrel 1.615 | 8 | 63% |
| nz.jdc.nano.GridFu 1.0 | 7 | 43% |
| fwb.Nine 1.0.1 | 5 | 40% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |
| m3thos.mini.Eva01 0.5.5 | 1 | 0% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 114 | 38% | 137 |
| fwb.Nine 1.0.1 | 62 | 21% | 67 |
| nz.jdc.nano.GridFu 1.0 | 44 | 15% | 50 |
| catcat20.Rabbit 0.001 | 22 | 7% | 26 |
| djdjdj.NanoSkunk10 1.0 | 22 | 7% | 23 |
| bayen.nut.Squirrel 1.615 | 17 | 6% | 20 |
| m3thos.mini.Eva01 0.5.5 | 9 | 3% | 11 |
| ntc.ControlledChaos 1.1.4 | 8 | 3% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 1% | 6 |

## Melee bench: F21

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 79.3 | 95 / 350 | 2.86 | 16.5% | 48178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.2 | 17.5% | 177 |
| hadur117.nano.SanaroDE 0.3 | 1.9 | 16.5% | 95 |
| dummy.mini.Scimitar 1.01 | 2.9 | 14.8% | 35 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 17 |
| eld.Hmm 1.0 | 5.1 | 9.1% | 29 |
| oa.weak.BotherBot 0.1 | 5.9 | 8.2% | 2 |
| fire219.CatBot 1.0 | 7.7 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 1 |
| PSW.Relentless 0.1 | 8.7 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 77.1 | 7 / 35 | 4138 |
| 2 | 2 | 65.5 | 78.4 | 8 / 35 | 4733 |
| 3 | 2 | 65.1 | 74.9 | 8 / 35 | 5166 |
| 4 | 2 | 67.5 | 83.5 | 13 / 35 | 5060 |
| 5 | 1 | 66.1 | 80.6 | 10 / 35 | 5050 |
| 6 | 2 | 67.2 | 84.1 | 11 / 35 | 5067 |
| 7 | 2 | 66.7 | 81.9 | 11 / 35 | 5003 |
| 8 | 1 | 66.0 | 81.9 | 12 / 35 | 4745 |
| 9 | 2 | 62.9 | 71.4 | 6 / 35 | 4439 |
| 10 | 2 | 65.4 | 79.4 | 9 / 35 | 4777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 124 | 44% |
| dummy.mini.Scimitar 1.01 | 36 | 67% |
| cf.RiO.RiOx 4.2.1 | 16 | 69% |
| eld.Hmm 1.0 | 11 | 18% |
| oa.weak.BotherBot 0.1 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 258 of 350 rounds, at a mean tick of 1082. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 124 | 48% | 157 |
| dummy.mini.Scimitar 1.01 | 55 | 21% | 88 |
| cf.RiO.RiOx 4.2.1 | 30 | 12% | 41 |
| eld.Hmm 1.0 | 21 | 8% | 32 |
| oa.weak.BotherBot 0.1 | 7 | 3% | 10 |
| PSW.Relentless 0.1 | 7 | 3% | 7 |
| fire219.CatBot 1.0 | 5 | 2% | 6 |
| arthord.MannyPacquiao Beta | 4 | 2% | 6 |
| el.JumpShoot 0.2 | 2 | 1% | 3 |
3 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.0 | 100 / 350 | 2.62 | 16.3% | 41512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.7% | 158 |
| hadur117.nano.SanaroDE 0.3 | 2.0 | 16.3% | 100 |
| cre.Karolos 0.32 | 2.9 | 14.9% | 58 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 11.1% | 18 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.1% | 4 |
| stelo.RamTrackSurfer 1.2 | 6.1 | 9.1% | 7 |
| cw.megas.Blade 0.8 | 6.9 | 8.2% | 0 |
| sample.Walls 1.0 | 7.2 | 8.3% | 5 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 77.5 | 7 / 35 | 4224 |
| 2 | 2 | 66.5 | 82.5 | 6 / 35 | 4297 |
| 3 | 2 | 65.7 | 83.2 | 7 / 35 | 4035 |
| 4 | 2 | 65.8 | 77.8 | 13 / 35 | 4143 |
| 5 | 2 | 66.8 | 83.8 | 12 / 35 | 4102 |
| 6 | 2 | 66.4 | 82.9 | 7 / 35 | 4227 |
| 7 | 3 | 65.4 | 81.0 | 9 / 35 | 3577 |
| 8 | 1 | 68.1 | 87.3 | 18 / 35 | 4115 |
| 9 | 2 | 67.0 | 84.1 | 10 / 35 | 4322 |
| 10 | 2 | 66.1 | 79.7 | 11 / 35 | 4470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 112 | 38% |
| cre.Karolos 0.32 | 52 | 44% |
| stelo.AreaTargetingBot 1.1 | 23 | 52% |
| sample.Walls 1.0 | 11 | 82% |
| stelo.RamTrackSurfer 1.2 | 9 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |

Hadur died in 250 of 350 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 126 | 50% | 173 |
| cre.Karolos 0.32 | 60 | 24% | 80 |
| stelo.AreaTargetingBot 1.1 | 40 | 16% | 50 |
| sample.Walls 1.0 | 9 | 4% | 13 |
| stelo.RamTrackSurfer 1.2 | 7 | 3% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 2% | 9 |
| cw.megas.Blade 0.8 | 2 | 1% | 3 |

## Melee bench: F24

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.8 | 57.3 | 25 / 350 | 4.84 | 10.7% | 25834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 2.0 | 14.6% | 90 |
| florent.XSeries.X2 0.12 | 2.2 | 14.1% | 71 |
| davidalves.Phoenix 0.54 | 2.5 | 13.8% | 95 |
| pedersen.Ugluk 1.1.1 | 3.6 | 12.5% | 44 |
| hadur117.nano.SanaroDE 0.3 | 4.8 | 10.7% | 25 |
| oog.melee.Corsair 1.0 | 6.1 | 9.4% | 5 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.3% | 18 |
| lunchie.Lunchbox 0.93 | 8.1 | 6.8% | 2 |
| evd.X1 0.01 | 9.3 | 4.9% | 0 |
| as.FrankTheTank 1.3 | 9.6 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.4 | 61.6 | 3 / 35 | 2567 |
| 2 | 5 | 53.4 | 57.1 | 3 / 35 | 2467 |
| 3 | 4 | 54.8 | 59.0 | 1 / 35 | 2915 |
| 4 | 5 | 55.0 | 60.3 | 2 / 35 | 2479 |
| 5 | 5 | 53.2 | 53.7 | 2 / 35 | 2748 |
| 6 | 5 | 53.4 | 58.7 | 3 / 35 | 2258 |
| 7 | 6 | 50.0 | 49.5 | 0 / 35 | 2417 |
| 8 | 4 | 57.5 | 62.9 | 6 / 35 | 2933 |
| 9 | 5 | 54.5 | 58.7 | 5 / 35 | 2507 |
| 10 | 5 | 51.2 | 51.4 | 0 / 35 | 2543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 21 | 10% |
| florent.XSeries.X2 0.12 | 18 | 67% |
| rz.GlowBlowMelee 1.4 | 16 | 19% |
| pedersen.Ugluk 1.1.1 | 12 | 33% |
| stelo.SoJNanoMelee 1.1 | 6 | 17% |
| oog.melee.Corsair 1.0 | 3 | 67% |

Hadur died in 325 of 350 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 72 | 22% | 75 |
| rz.GlowBlowMelee 1.4 | 71 | 22% | 77 |
| pedersen.Ugluk 1.1.1 | 60 | 18% | 61 |
| florent.XSeries.X2 0.12 | 54 | 17% | 65 |
| oog.melee.Corsair 1.0 | 26 | 8% | 29 |
| stelo.SoJNanoMelee 1.1 | 20 | 6% | 21 |
| lunchie.Lunchbox 0.93 | 11 | 3% | 11 |
| evd.X1 0.01 | 9 | 3% | 9 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |

## Melee bench: F25

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 69.1 | 68 / 350 | 3.78 | 13.4% | 29711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.6 | 14.4% | 84 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.9% | 71 |
| hadur117.nano.SanaroDE 0.3 | 2.5 | 13.4% | 68 |
| jdw.Hurricane 1.4 | 4.1 | 11.9% | 43 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 10.3% | 36 |
| ds.Oo 2.2 | 5.8 | 9.5% | 23 |
| gjr.Cephalosporin 0.1 | 6.9 | 8.7% | 18 |
| awesomeness.Elite 1.0 | 8.3 | 7.3% | 5 |
| adt.Ar2 1.1 | 8.6 | 6.7% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 70.5 | 7 / 35 | 2992 |
| 2 | 3 | 59.3 | 70.2 | 5 / 35 | 2874 |
| 3 | 1 | 61.7 | 74.3 | 11 / 35 | 3011 |
| 4 | 3 | 58.8 | 68.3 | 5 / 35 | 3005 |
| 5 | 4 | 57.1 | 63.8 | 5 / 35 | 2853 |
| 6 | 3 | 60.0 | 71.4 | 5 / 35 | 2956 |
| 7 | 3 | 57.5 | 64.1 | 6 / 35 | 2794 |
| 8 | 2 | 60.2 | 70.5 | 8 / 35 | 3188 |
| 9 | 2 | 59.7 | 68.3 | 9 / 35 | 2905 |
| 10 | 2 | 60.0 | 69.8 | 7 / 35 | 3133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 56 | 36% |
| voidious.micro.BlitzBat 1.05 | 46 | 28% |
| jdw.Hurricane 1.4 | 24 | 75% |
| ds.Oo 2.2 | 9 | 67% |
| gre.svman4.Morfeas 1.4.1 | 9 | 11% |
| adt.Ar2 1.1 | 6 | 100% |
| gjr.Cephalosporin 0.1 | 5 | 20% |
| awesomeness.Elite 1.0 | 4 | 75% |

Hadur died in 283 of 350 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 75 | 27% | 93 |
| voidious.mini.BrokenSword 2.0.3 | 73 | 26% | 86 |
| jdw.Hurricane 1.4 | 36 | 13% | 52 |
| ds.Oo 2.2 | 25 | 9% | 33 |
| gre.svman4.Morfeas 1.4.1 | 24 | 8% | 27 |
| gjr.Cephalosporin 0.1 | 21 | 7% | 24 |
| awesomeness.Elite 1.0 | 15 | 5% | 17 |
| adt.Ar2 1.1 | 11 | 4% | 15 |
| amk.ChumbaMini 0.2 | 3 | 1% | 3 |

## Melee bench: F26

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 69.2 | 37 / 350 | 3.77 | 12.9% | 33867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.0% | 131 |
| shu.nitro.LENIN .T34 | 2.9 | 13.3% | 75 |
| hadur117.nano.SanaroDE 0.3 | 3.1 | 12.9% | 37 |
| lrem.Spectre 0.4.4 | 3.5 | 12.5% | 50 |
| gh.mini.GrubbmOne 1.0 | 5.1 | 11.7% | 20 |
| js.PinBall 1.6 | 5.5 | 11.2% | 21 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 8.9% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 8 |
| sample.SpinBot 1.0 | 9.0 | 5.4% | 3 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 70.8 | 7 / 35 | 3358 |
| 2 | 3 | 59.6 | 68.6 | 6 / 35 | 3372 |
| 3 | 3 | 61.1 | 73.7 | 7 / 35 | 3286 |
| 4 | 5 | 57.0 | 63.2 | 0 / 35 | 3238 |
| 5 | 2 | 59.5 | 69.8 | 4 / 35 | 3373 |
| 6 | 3 | 59.3 | 67.6 | 5 / 35 | 3409 |
| 7 | 4 | 57.7 | 64.8 | 1 / 35 | 3248 |
| 8 | 3 | 59.6 | 70.8 | 1 / 35 | 3130 |
| 9 | 3 | 61.5 | 73.7 | 5 / 35 | 3692 |
| 10 | 2 | 60.0 | 69.5 | 1 / 35 | 3761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 44 | 16% |
| shu.nitro.LENIN .T34 | 35 | 20% |
| lrem.Spectre 0.4.4 | 26 | 42% |
| gh.mini.GrubbmOne 1.0 | 10 | 50% |
| js.PinBall 1.6 | 7 | 71% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 33% |
| jaybot.adv.bots.JayBot 2.0 | 2 | 50% |
| sample.SpinBot 1.0 | 1 | 0% |

Hadur died in 314 of 350 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 95 | 30% | 101 |
| shu.nitro.LENIN .T34 | 53 | 17% | 61 |
| gh.mini.GrubbmOne 1.0 | 48 | 15% | 52 |
| lrem.Spectre 0.4.4 | 46 | 15% | 52 |
| js.PinBall 1.6 | 35 | 11% | 42 |
| jaybot.adv.bots.JayBot 2.0 | 15 | 5% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 11 | 4% | 14 |
| sample.SpinBot 1.0 | 10 | 3% | 10 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 69.8 | 90 / 350 | 3.72 | 13.5% | 31140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.8 | 14.6% | 105 |
| hadur117.nano.SanaroDE 0.3 | 2.4 | 13.5% | 90 |
| wee.Gem 1.8.4 | 3.2 | 12.4% | 64 |
| sheldor.melee.nano.TestMelee 0.1 | 3.4 | 12.2% | 41 |
| EH.Eagle 1.0.6 | 4.2 | 11.5% | 27 |
| joe.ADinosaur 1.0 | 7.0 | 8.6% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 7.1 | 8.3% | 9 |
| throxbot.ThroxBot 0.1 | 7.6 | 7.8% | 6 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.4% | 5 |
| cs.Grudge 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 76.5 | 14 / 35 | 3530 |
| 2 | 2 | 59.7 | 71.1 | 9 / 35 | 2885 |
| 3 | 2 | 61.6 | 76.2 | 9 / 35 | 3082 |
| 4 | 2 | 59.2 | 71.4 | 8 / 35 | 3020 |
| 5 | 2 | 60.5 | 72.7 | 9 / 35 | 3053 |
| 6 | 2 | 61.4 | 76.5 | 7 / 35 | 2829 |
| 7 | 5 | 53.3 | 43.2 | 7 / 35 | 3989 |
| 8 | 2 | 61.2 | 75.6 | 9 / 35 | 3245 |
| 9 | 4 | 56.9 | 64.1 | 7 / 35 | 2635 |
| 10 | 2 | 59.4 | 70.8 | 11 / 35 | 2872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 67 | 67% |
| wee.Gem 1.8.4 | 21 | 33% |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 58% |
| EH.Eagle 1.0.6 | 16 | 81% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 67% |
| caimano.Furia_Ceca 0.22 | 4 | 50% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 261 of 350 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 71 | 27% | 112 |
| wee.Gem 1.8.4 | 46 | 18% | 55 |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 17% | 55 |
| EH.Eagle 1.0.6 | 26 | 10% | 43 |
| joe.ADinosaur 1.0 | 20 | 8% | 22 |
| throxbot.ThroxBot 0.1 | 16 | 6% | 17 |
| caimano.Furia_Ceca 0.22 | 14 | 5% | 15 |
| cs.Grudge 1.0 | 12 | 5% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 11 | 4% | 18 |

## Melee bench: F28

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 79.5 | 102 / 350 | 2.84 | 15.4% | 33861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.3% | 119 |
| hadur117.nano.SanaroDE 0.3 | 1.7 | 15.4% | 102 |
| uji.Antique 1.0 | 3.1 | 12.8% | 70 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 11.0% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.7% | 15 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.2% | 9 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.1% | 12 |
| matt.advanced.Katana 1.0 | 8.5 | 6.2% | 0 |
| stelo.PianistNano 1.2 | 8.9 | 5.8% | 1 |
| stelo.Lifestealer 1.0 | 9.6 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 74.0 | 11 / 35 | 3446 |
| 2 | 2 | 61.9 | 77.8 | 8 / 35 | 3099 |
| 3 | 2 | 62.0 | 76.5 | 7 / 35 | 3585 |
| 4 | 2 | 63.6 | 81.0 | 9 / 35 | 3419 |
| 5 | 2 | 60.9 | 75.2 | 7 / 35 | 2998 |
| 6 | 2 | 62.1 | 76.2 | 9 / 35 | 3290 |
| 7 | 1 | 64.9 | 83.5 | 15 / 35 | 3445 |
| 8 | 1 | 66.5 | 88.3 | 13 / 35 | 3791 |
| 9 | 2 | 64.3 | 83.5 | 11 / 35 | 3349 |
| 10 | 1 | 63.4 | 79.4 | 12 / 35 | 3439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 110 | 45% |
| uji.Antique 1.0 | 57 | 53% |
| pfvicm.Sobieski 7.2.3b | 14 | 43% |
| qohnil.blot.BlotBot 3.61 | 13 | 46% |
| amk.ChumbaWumba 0.3 | 7 | 86% |
| ahr.ice.Ice 1.0.2 | 6 | 67% |

Hadur died in 249 of 350 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 109 | 44% | 142 |
| uji.Antique 1.0 | 53 | 21% | 89 |
| pfvicm.Sobieski 7.2.3b | 33 | 13% | 39 |
| qohnil.blot.BlotBot 3.61 | 23 | 9% | 28 |
| amk.ChumbaWumba 0.3 | 13 | 5% | 17 |
| ahr.ice.Ice 1.0.2 | 11 | 4% | 19 |
| matt.advanced.Katana 1.0 | 4 | 2% | 6 |
| stelo.PianistNano 1.2 | 2 | 1% | 3 |
| stelo.Lifestealer 1.0 | 1 | 0% | 3 |

## Melee bench: F29

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 64.9 | 52 / 350 | 4.16 | 13.0% | 33215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.5 | 16.4% | 131 |
| zyx.mega.YersiniaPestis 3.1 | 1.7 | 15.8% | 108 |
| hadur117.nano.SanaroDE 0.3 | 3.5 | 13.0% | 52 |
| myl.micro.Troodon 1.10 | 3.9 | 12.5% | 15 |
| jok.PheonixM 0.1.2 | 4.4 | 11.6% | 23 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.2% | 0 |
| DBall.Anarchy 0.1 | 6.9 | 7.5% | 13 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.7% | 7 |
| jangs.ns51 1.0 | 9.5 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.3 | 59.4 | 7 / 35 | 3278 |
| 2 | 5 | 58.6 | 63.2 | 4 / 35 | 3238 |
| 3 | 4 | 60.6 | 67.3 | 4 / 35 | 3335 |
| 4 | 3 | 59.2 | 62.9 | 3 / 35 | 3623 |
| 5 | 3 | 61.8 | 70.8 | 8 / 35 | 3702 |
| 6 | 3 | 59.1 | 64.4 | 6 / 35 | 3183 |
| 7 | 4 | 58.6 | 63.8 | 5 / 35 | 2997 |
| 8 | 3 | 59.2 | 64.4 | 4 / 35 | 3267 |
| 9 | 3 | 62.1 | 72.7 | 7 / 35 | 3450 |
| 10 | 3 | 57.3 | 59.7 | 4 / 35 | 3142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 8% |
| zyx.mega.YersiniaPestis 3.1 | 35 | 51% |
| myl.micro.Troodon 1.10 | 23 | 91% |
| jok.PheonixM 0.1.2 | 12 | 58% |
| DBall.Anarchy 0.1 | 2 | 50% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 124 | 42% | 129 |
| zyx.mega.YersiniaPestis 3.1 | 64 | 21% | 78 |
| myl.micro.Troodon 1.10 | 39 | 13% | 60 |
| jok.PheonixM 0.1.2 | 39 | 13% | 48 |
| fullsail.TimbotNoPrediction 1.0 | 9 | 3% | 9 |
| jangs.ns51 1.0 | 8 | 3% | 9 |
| DBall.Anarchy 0.1 | 8 | 3% | 9 |
| ph.melee.ArcherME 0.3 | 7 | 2% | 8 |

## Melee bench: F30

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 56.9 | 23 / 350 | 4.88 | 10.9% | 28616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.6 | 14.3% | 96 |
| darkcanuck.B26354 1.06 | 2.1 | 14.0% | 98 |
| stelo.PastFuture 2.3.2 | 3.1 | 13.1% | 39 |
| oog.melee.Capulet 1.2 | 3.2 | 13.2% | 62 |
| hadur117.nano.SanaroDE 0.3 | 5.2 | 10.9% | 23 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.5% | 25 |
| ntc.Opposite 1.5 | 7.6 | 7.8% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 7.4% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 8.1 | 7.3% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.0 | 57.5 | 2 / 35 | 2816 |
| 2 | 6 | 53.2 | 54.6 | 2 / 35 | 2618 |
| 3 | 5 | 52.3 | 53.7 | 1 / 35 | 2500 |
| 4 | 5 | 53.7 | 53.7 | 4 / 35 | 2905 |
| 5 | 6 | 52.9 | 53.7 | 1 / 35 | 2753 |
| 6 | 5 | 53.4 | 53.7 | 1 / 35 | 2994 |
| 7 | 5 | 57.1 | 62.5 | 3 / 35 | 3084 |
| 8 | 5 | 53.5 | 54.6 | 3 / 35 | 2848 |
| 9 | 5 | 57.2 | 63.8 | 2 / 35 | 3287 |
| 10 | 5 | 56.3 | 61.0 | 4 / 35 | 2811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 23 | 17% |
| catcat20.Matcha 0.006 | 17 | 29% |
| stelo.PastFuture 2.3.2 | 10 | 70% |
| oog.melee.Capulet 1.2 | 9 | 11% |
| intruder.PrairieWolf 2.61 | 4 | 25% |
| tripphippy.Alice 1.1 | 4 | 75% |
| ntc.Opposite 1.5 | 1 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 327 of 350 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 73 | 22% | 78 |
| stelo.PastFuture 2.3.2 | 63 | 19% | 68 |
| oog.melee.Capulet 1.2 | 59 | 18% | 62 |
| catcat20.Matcha 0.006 | 52 | 16% | 57 |
| intruder.PrairieWolf 2.61 | 22 | 7% | 22 |
| tripphippy.Alice 1.1 | 20 | 6% | 22 |
| fowl3628800.LightningBolt 2.6.0 | 18 | 6% | 20 |
| ntc.Opposite 1.5 | 15 | 5% | 16 |
| GarmBox.Anger 1.0 | 5 | 2% | 5 |

## Melee bench: F31

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.3 | 58.9 | 15 / 350 | 4.70 | 10.8% | 24408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.6% | 186 |
| gh.mini.Griezel 0.2 | 2.0 | 14.2% | 90 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 12.0% | 24 |
| d414.nano.Quantum 1.0.0 | 4.1 | 11.2% | 18 |
| hadur117.nano.SanaroDE 0.3 | 4.6 | 10.8% | 15 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.3% | 11 |
| timmit.nano.TimDog 0.33 | 7.5 | 7.1% | 3 |
| fm.mammillarias 1.3 | 7.5 | 7.0% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.0% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 65.1 | 0 / 35 | 2615 |
| 2 | 6 | 51.0 | 52.1 | 2 / 35 | 2119 |
| 3 | 5 | 55.0 | 58.7 | 2 / 35 | 2550 |
| 4 | 4 | 54.6 | 60.3 | 1 / 35 | 2522 |
| 5 | 4 | 55.8 | 61.9 | 2 / 35 | 2575 |
| 6 | 5 | 54.8 | 61.0 | 2 / 35 | 2492 |
| 7 | 6 | 49.7 | 48.6 | 1 / 35 | 2114 |
| 8 | 3 | 57.4 | 65.1 | 3 / 35 | 2626 |
| 9 | 4 | 55.6 | 60.6 | 0 / 35 | 2623 |
| 10 | 5 | 52.5 | 55.2 | 2 / 35 | 2172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 38 | 13% |
| abc.Shadow 3.84i | 37 | 22% |
| spinnercat.micro.Tyger 0.1 | 7 | 14% |
| gh.nano.Grofvuil 0.2 | 2 | 0% |
| d414.nano.Quantum 1.0.0 | 1 | 100% |

Hadur died in 335 of 350 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 93 | 28% | 97 |
| abc.Shadow 3.84i | 78 | 23% | 86 |
| spinnercat.micro.Tyger 0.1 | 54 | 16% | 54 |
| d414.nano.Quantum 1.0.0 | 46 | 14% | 48 |
| fm.mammillarias 1.3 | 23 | 7% | 23 |
| timmit.nano.TimDog 0.33 | 16 | 5% | 16 |
| gh.nano.Grofvuil 0.2 | 15 | 4% | 16 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 2% | 6 |
| tlp.ThreeLeggedPig 1 | 4 | 1% | 4 |

## Melee bench: F32

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 75.0 | 112 / 350 | 3.25 | 14.5% | 33414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.0% | 99 |
| hadur117.nano.SanaroDE 0.3 | 1.6 | 14.5% | 112 |
| apc.botM 3.0 | 3.6 | 11.7% | 46 |
| vjik.UnViolation 1.1 | 4.1 | 11.4% | 34 |
| lxx.ConceptA 0.8 | 4.4 | 11.3% | 14 |
| bayen.UbaMicro 1.4 | 6.0 | 9.0% | 14 |
| panzer.Panzer 0.2 | 7.5 | 7.7% | 4 |
| yk.JahMicro 1.0 | 7.9 | 7.3% | 17 |
| conscience.Electron 1.3g | 8.7 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.5% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 72.7 | 10 / 35 | 2798 |
| 2 | 1 | 61.6 | 75.2 | 12 / 35 | 3589 |
| 3 | 1 | 62.6 | 77.5 | 10 / 35 | 3893 |
| 4 | 1 | 62.4 | 78.1 | 12 / 35 | 3432 |
| 5 | 2 | 60.7 | 74.3 | 9 / 35 | 3137 |
| 6 | 2 | 60.8 | 74.3 | 10 / 35 | 3137 |
| 7 | 2 | 62.0 | 75.6 | 11 / 35 | 3483 |
| 8 | 2 | 60.9 | 72.1 | 14 / 35 | 3329 |
| 9 | 1 | 62.2 | 76.8 | 14 / 35 | 3273 |
| 10 | 2 | 60.4 | 73.0 | 10 / 35 | 3343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 94 | 55% |
| apc.botM 3.0 | 29 | 52% |
| vjik.UnViolation 1.1 | 28 | 68% |
| lxx.ConceptA 0.8 | 15 | 80% |
| yk.JahMicro 1.0 | 9 | 56% |
| donjezza.Jezza 1.0 | 7 | 57% |
| panzer.Panzer 0.2 | 3 | 67% |
| bayen.UbaMicro 1.4 | 2 | 50% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 239 of 350 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 78 | 33% | 130 |
| lxx.ConceptA 0.8 | 52 | 22% | 55 |
| apc.botM 3.0 | 30 | 13% | 47 |
| vjik.UnViolation 1.1 | 21 | 9% | 41 |
| bayen.UbaMicro 1.4 | 18 | 8% | 22 |
| yk.JahMicro 1.0 | 12 | 5% | 16 |
| panzer.Panzer 0.2 | 12 | 5% | 13 |
| donjezza.Jezza 1.0 | 8 | 3% | 14 |
| conscience.Electron 1.3g | 8 | 3% | 12 |

## Melee bench: F33

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 72.2 | 72 / 350 | 3.50 | 14.6% | 38951 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.2% | 119 |
| hadur117.nano.SanaroDE 0.3 | 2.2 | 14.6% | 72 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 49 |
| labg.Cataclysm 2.05 | 4.2 | 11.5% | 56 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 11.0% | 28 |
| baal.nano.N 1.42 | 6.3 | 8.6% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.6% | 15 |
| zyx.micro.Ant 1.1 | 8.7 | 5.4% | 2 |
| sanja.First 0.1 | 9.1 | 5.2% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.2 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 74.3 | 7 / 35 | 3768 |
| 2 | 2 | 62.3 | 71.7 | 9 / 35 | 3909 |
| 3 | 2 | 64.1 | 75.9 | 7 / 35 | 4466 |
| 4 | 2 | 62.0 | 73.3 | 5 / 35 | 3809 |
| 5 | 3 | 60.1 | 66.7 | 6 / 35 | 3675 |
| 6 | 2 | 61.9 | 68.3 | 10 / 35 | 4194 |
| 7 | 3 | 61.1 | 70.2 | 6 / 35 | 3663 |
| 8 | 2 | 62.5 | 72.4 | 7 / 35 | 3839 |
| 9 | 2 | 63.2 | 74.9 | 8 / 35 | 3760 |
| 10 | 2 | 62.9 | 74.6 | 7 / 35 | 3868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 63 | 41% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 58% |
| gre.svman4.Leonidas 1.3.2 | 21 | 76% |
| labg.Cataclysm 2.05 | 18 | 11% |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 55% |
| sanja.First 0.1 | 6 | 33% |
| baal.nano.N 1.42 | 2 | 50% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 279 of 350 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 100 | 36% | 128 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 18% | 67 |
| labg.Cataclysm 2.05 | 41 | 15% | 45 |
| gre.svman4.Leonidas 1.3.2 | 36 | 13% | 48 |
| kinsen.melee.Angsaichmophobia 1.8c | 25 | 9% | 27 |
| baal.nano.N 1.42 | 10 | 4% | 14 |
| zyx.micro.Ant 1.1 | 10 | 4% | 10 |
| sanja.First 0.1 | 8 | 3% | 11 |

## Melee bench: F34

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 67.8 | 29 / 350 | 3.90 | 12.9% | 34624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.3 | 17.9% | 161 |
| kid.Gladiator .7.2 | 1.7 | 17.6% | 105 |
| hadur117.nano.SanaroDE 0.3 | 3.1 | 12.9% | 29 |
| tcf.Reach 3 | 4.6 | 11.2% | 14 |
| jcs.Seth 1.8 | 4.6 | 11.6% | 34 |
| cli.Dancer 1.1 | 5.7 | 10.0% | 6 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 1 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 62.9 | 0 / 35 | 3100 |
| 2 | 3 | 61.4 | 70.2 | 4 / 35 | 3499 |
| 3 | 3 | 60.3 | 66.7 | 6 / 35 | 3488 |
| 4 | 3 | 58.6 | 64.8 | 3 / 35 | 3220 |
| 5 | 3 | 62.4 | 73.3 | 5 / 35 | 3662 |
| 6 | 3 | 61.5 | 71.7 | 2 / 35 | 3623 |
| 7 | 3 | 58.8 | 60.6 | 2 / 35 | 3638 |
| 8 | 3 | 61.5 | 67.9 | 3 / 35 | 3985 |
| 9 | 3 | 60.5 | 69.5 | 2 / 35 | 3290 |
| 10 | 3 | 60.5 | 70.2 | 2 / 35 | 3119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 37 | 35% |
| kid.Gladiator .7.2 | 34 | 35% |
| jcs.Seth 1.8 | 12 | 17% |
| tcf.Reach 3 | 4 | 0% |
| cli.Dancer 1.1 | 4 | 25% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 321 of 350 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 118 | 37% | 126 |
| stelo.Spread 0.9 | 112 | 35% | 128 |
| jcs.Seth 1.8 | 37 | 12% | 39 |
| tcf.Reach 3 | 22 | 7% | 22 |
| cli.Dancer 1.1 | 16 | 5% | 18 |
| ratosh.Wesco 1.4 | 12 | 4% | 13 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.RamFire 1.0 | 1 | 0% | 1 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 65.6 | 14 / 350 | 4.10 | 11.8% | 25337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 275 |
| gh.mini.Gruwel 0.9 | 2.4 | 13.4% | 34 |
| rz.HawkOnFire 0.1 | 3.4 | 12.5% | 8 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.7 | 12.2% | 17 |
| hadur117.nano.SanaroDE 0.3 | 4.5 | 11.8% | 14 |
| myl.nano.KomoriNinja 1.1 | 6.2 | 7.3% | 2 |
| wit.Chuliath 1.0 | 6.8 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.4 | 5.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.1 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.4 | 65.1 | 1 / 35 | 2631 |
| 2 | 5 | 55.4 | 62.9 | 2 / 35 | 2253 |
| 3 | 5 | 57.3 | 65.4 | 0 / 35 | 2765 |
| 4 | 4 | 57.3 | 67.3 | 2 / 35 | 2492 |
| 5 | 5 | 56.9 | 61.6 | 2 / 35 | 2619 |
| 6 | 5 | 57.7 | 66.0 | 1 / 35 | 2724 |
| 7 | 4 | 58.2 | 68.6 | 1 / 35 | 2538 |
| 8 | 4 | 58.7 | 69.5 | 2 / 35 | 2779 |
| 9 | 4 | 57.1 | 67.0 | 1 / 35 | 2230 |
| 10 | 5 | 56.0 | 62.2 | 2 / 35 | 2306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 68 | 3% |
| gh.mini.Gruwel 0.9 | 15 | 27% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 29% |
| rz.HawkOnFire 0.1 | 7 | 86% |

Hadur died in 336 of 350 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 116 | 35% | 116 |
| gh.mini.Gruwel 0.9 | 65 | 19% | 68 |
| rz.HawkOnFire 0.1 | 58 | 17% | 66 |
| dmh.robocode.robot.BlackDeath 9.2 | 57 | 17% | 60 |
| wit.Chuliath 1.0 | 11 | 3% | 11 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 11 | 3% | 11 |
| myl.nano.KomoriNinja 1.1 | 10 | 3% | 10 |
| stelo.MyAgileRobot 0.2 | 5 | 1% | 5 |
| dans.Cinnamon 1.2 | 3 | 1% | 3 |

## Melee bench: F36

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 73.4 | 106 / 350 | 3.40 | 14.8% | 36153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroDE 0.3 | 1.4 | 14.8% | 106 |
| bzdp.Pansy 2.1 | 2.5 | 13.1% | 56 |
| alpha.RainingFire 1.0 | 2.7 | 13.0% | 71 |
| mz.Cork 0.1 | 4.4 | 11.3% | 39 |
| bvh.micro.Freya 0.3 | 4.7 | 10.8% | 32 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.8% | 8 |
| m3thos.Eva02 0.7.1 | 6.5 | 9.4% | 17 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 7 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.6% | 8 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.3% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.9 | 72.4 | 9 / 35 | 3172 |
| 2 | 1 | 63.1 | 76.8 | 10 / 35 | 3754 |
| 3 | 2 | 62.1 | 74.3 | 9 / 35 | 3651 |
| 4 | 1 | 62.1 | 73.0 | 9 / 35 | 3771 |
| 5 | 1 | 62.7 | 72.4 | 15 / 35 | 3602 |
| 6 | 1 | 60.6 | 69.8 | 8 / 35 | 3471 |
| 7 | 3 | 58.9 | 66.0 | 7 / 35 | 3424 |
| 8 | 1 | 64.4 | 80.0 | 14 / 35 | 3988 |
| 9 | 1 | 63.2 | 76.5 | 14 / 35 | 3708 |
| 10 | 1 | 61.8 | 72.4 | 11 / 35 | 3612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 43 | 56% |
| alpha.RainingFire 1.0 | 34 | 15% |
| mz.Cork 0.1 | 26 | 69% |
| bvh.mini.Fenrir 0.39 | 25 | 88% |
| bvh.micro.Freya 0.3 | 23 | 74% |
| m3thos.Eva02 0.7.1 | 14 | 93% |
| dl.BetterWalls 1.0 | 6 | 50% |
| sample.MyFirstRobot 1.0 | 4 | 50% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |

Hadur died in 246 of 350 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 68 | 28% | 75 |
| bzdp.Pansy 2.1 | 46 | 19% | 77 |
| bvh.micro.Freya 0.3 | 30 | 12% | 49 |
| bvh.mini.Fenrir 0.39 | 30 | 12% | 37 |
| mz.Cork 0.1 | 27 | 11% | 41 |
| m3thos.Eva02 0.7.1 | 17 | 7% | 33 |
| squidM.TentalceMeleeNano 1.1 | 12 | 5% | 15 |
| dl.BetterWalls 1.0 | 9 | 4% | 15 |
| sample.MyFirstRobot 1.0 | 6 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 78.9 | 128 / 350 | 2.90 | 15.7% | 44861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroDE 0.3 | 1.0 | 15.7% | 128 |
| EBBU.Sim2 1.02 | 2.8 | 11.5% | 44 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 11.3% | 28 |
| germ.TheMind .2 | 3.2 | 11.2% | 46 |
| agrach.Dalek 1.0 | 6.0 | 9.3% | 30 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.9% | 28 |
| mb.Beast 0.1 | 7.1 | 8.6% | 17 |
| lmk.ACPFinal 0.1 | 7.9 | 8.2% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 8.7 | 7.7% | 2 |
| skm.Ryubot 1.0 | 8.8 | 7.6% | 19 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 83.2 | 18 / 35 | 5028 |
| 2 | 1 | 61.4 | 76.2 | 14 / 35 | 4119 |
| 3 | 1 | 63.7 | 82.5 | 13 / 35 | 4478 |
| 4 | 1 | 66.3 | 87.6 | 16 / 35 | 5232 |
| 5 | 1 | 62.5 | 77.8 | 10 / 35 | 4590 |
| 6 | 1 | 63.2 | 80.3 | 14 / 35 | 4260 |
| 7 | 1 | 64.7 | 81.3 | 17 / 35 | 4646 |
| 8 | 1 | 63.2 | 81.0 | 12 / 35 | 4553 |
| 9 | 1 | 59.1 | 67.9 | 9 / 35 | 4189 |
| 10 | 1 | 58.5 | 71.4 | 5 / 35 | 3766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 47 | 57% |
| EBBU.Sim2 1.02 | 46 | 37% |
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 70% |
| stelo.UntouchableNano 1.3 | 22 | 73% |
| mb.Beast 0.1 | 22 | 95% |
| skm.Ryubot 1.0 | 19 | 37% |
| agrach.Dalek 1.0 | 15 | 67% |
| lmk.ACPFinal 0.1 | 13 | 69% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 224 of 350 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 52 | 23% | 66 |
| com.syncleus.robocode.Dreadnaught 0.1 | 39 | 17% | 60 |
| germ.TheMind .2 | 37 | 17% | 59 |
| agrach.Dalek 1.0 | 25 | 11% | 41 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 8% | 22 |
| lmk.ACPFinal 0.1 | 17 | 8% | 28 |
| skm.Ryubot 1.0 | 14 | 6% | 20 |
| stelo.UntouchableNano 1.3 | 12 | 5% | 22 |
| mb.Beast 0.1 | 9 | 4% | 31 |

## Melee bench: F38

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 64.9 | 37 / 350 | 4.16 | 12.1% | 28995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.2% | 144 |
| bvh.mini.Freya 0.55 | 2.4 | 13.1% | 39 |
| hadur117.nano.SanaroDE 0.3 | 3.9 | 12.1% | 37 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.5% | 48 |
| cs.Wren 1.0 | 4.5 | 11.7% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 11.7% | 33 |
| kdf.KoulDestroyer 1.0 | 6.9 | 9.2% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.1% | 6 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.3% | 2 |
| bzdp.BoxCar 2.0 | 9.6 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 54.5 | 58.1 | 3 / 35 | 2618 |
| 2 | 6 | 55.4 | 60.0 | 1 / 35 | 2790 |
| 3 | 3 | 58.2 | 67.9 | 3 / 35 | 2993 |
| 4 | 3 | 59.8 | 70.5 | 5 / 35 | 3050 |
| 5 | 2 | 59.4 | 71.1 | 6 / 35 | 2843 |
| 6 | 3 | 59.0 | 66.3 | 6 / 35 | 3083 |
| 7 | 3 | 58.7 | 68.6 | 3 / 35 | 3256 |
| 8 | 3 | 59.4 | 70.8 | 4 / 35 | 2973 |
| 9 | 4 | 57.1 | 65.1 | 4 / 35 | 2769 |
| 10 | 6 | 50.9 | 50.2 | 2 / 35 | 2620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 39 | 44% |
| bts.mega.Gnarly 1.4 | 25 | 24% |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 8% |
| bvh.mini.Freya 0.55 | 12 | 58% |
| cs.Wren 1.0 | 11 | 27% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |
| kdf.KoulDestroyer 1.0 | 2 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 79 | 25% | 96 |
| cs.Wren 1.0 | 51 | 16% | 55 |
| bts.mega.Gnarly 1.4 | 49 | 16% | 52 |
| bvh.mini.Freya 0.55 | 49 | 16% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 16% | 51 |
| kdf.KoulDestroyer 1.0 | 22 | 7% | 25 |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 2% | 10 |
| matt.UnderDark3 2.4.34 | 6 | 2% | 6 |
| bzdp.BoxCar 2.0 | 2 | 1% | 3 |

## Melee bench: F39

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 64.0 | 43 / 350 | 4.24 | 12.2% | 31929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 16.1% | 83 |
| az.Ololobot 0.2.4 | 2.2 | 14.0% | 122 |
| hadur117.nano.SanaroDE 0.3 | 3.0 | 12.2% | 43 |
| catcat20.Lambda 0.024 | 3.7 | 11.6% | 57 |
| stelo.SoRobotNanoMelee 1.2 | 5.9 | 9.2% | 32 |
| apollokidd.ApolloKidd 0.9 | 6.1 | 9.0% | 2 |
| gimp.GimpBot 0.1 | 6.9 | 8.4% | 4 |
| winamp32.micro.MicroMacro 1.0 | 7.1 | 8.2% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.1 | 62.2 | 5 / 35 | 3481 |
| 2 | 3 | 56.3 | 63.5 | 4 / 35 | 3019 |
| 3 | 3 | 57.3 | 65.1 | 3 / 35 | 3221 |
| 4 | 3 | 56.2 | 63.2 | 2 / 35 | 3113 |
| 5 | 3 | 58.1 | 66.0 | 4 / 35 | 3462 |
| 6 | 4 | 54.1 | 57.5 | 3 / 35 | 3040 |
| 7 | 2 | 59.0 | 72.4 | 4 / 35 | 3055 |
| 8 | 4 | 55.4 | 59.0 | 5 / 35 | 3071 |
| 9 | 2 | 58.9 | 69.2 | 7 / 35 | 3191 |
| 10 | 3 | 56.6 | 62.2 | 6 / 35 | 3276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 34 | 59% |
| az.Ololobot 0.2.4 | 34 | 9% |
| catcat20.Lambda 0.024 | 24 | 25% |
| stelo.SoRobotNanoMelee 1.2 | 11 | 55% |
| winamp32.micro.MicroMacro 1.0 | 4 | 50% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 93 | 30% | 112 |
| az.Ololobot 0.2.4 | 55 | 18% | 58 |
| catcat20.Lambda 0.024 | 44 | 14% | 50 |
| apollokidd.ApolloKidd 0.9 | 39 | 13% | 42 |
| stelo.SoRobotNanoMelee 1.2 | 30 | 10% | 32 |
| gimp.GimpBot 0.1 | 17 | 6% | 19 |
| winamp32.micro.MicroMacro 1.0 | 12 | 4% | 17 |
| whitesquare.robots.SkynetAdvanced 1.1 | 12 | 4% | 13 |
| dcs.Eater_of_Worlds 1.1.3-A | 6 | 2% | 6 |

## Melee bench: F41

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 67.5 | 54 / 350 | 3.93 | 12.9% | 30790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.2% | 169 |
| ary.Swarm 1.1 | 3.0 | 13.4% | 32 |
| lessonz.robocode.Oz 0.5.0 | 3.2 | 13.3% | 40 |
| hadur117.nano.SanaroDE 0.3 | 3.4 | 12.9% | 54 |
| simonton.nano.MeleeSeed 1.8 | 4.4 | 12.0% | 40 |
| shrub.Silver v048 | 6.1 | 8.6% | 2 |
| zyx.nano.Ant 1.1 | 6.9 | 7.8% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.3% | 12 |
| stelo.Mirror 1.1 | 8.7 | 5.9% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.4 | 70.5 | 7 / 35 | 3043 |
| 2 | 4 | 60.0 | 69.5 | 7 / 35 | 2987 |
| 3 | 4 | 57.8 | 62.9 | 3 / 35 | 3087 |
| 4 | 4 | 56.4 | 59.7 | 3 / 35 | 2934 |
| 5 | 2 | 61.9 | 75.6 | 6 / 35 | 3153 |
| 6 | 2 | 62.0 | 73.0 | 8 / 35 | 3448 |
| 7 | 4 | 57.6 | 62.2 | 4 / 35 | 3027 |
| 8 | 3 | 59.2 | 67.0 | 7 / 35 | 2871 |
| 9 | 3 | 59.5 | 67.9 | 4 / 35 | 3402 |
| 10 | 4 | 58.6 | 66.3 | 5 / 35 | 2838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 70 | 10% |
| ary.Swarm 1.1 | 23 | 70% |
| lessonz.robocode.Oz 0.5.0 | 21 | 67% |
| simonton.nano.MeleeSeed 1.8 | 20 | 45% |
| shrub.Silver v048 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| zyx.nano.Ant 1.1 | 2 | 50% |

Hadur died in 299 of 350 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 107 | 36% | 117 |
| ary.Swarm 1.1 | 57 | 19% | 73 |
| simonton.nano.MeleeSeed 1.8 | 42 | 14% | 53 |
| lessonz.robocode.Oz 0.5.0 | 40 | 13% | 48 |
| shrub.Silver v048 | 18 | 6% | 19 |
| zyx.nano.Ant 1.1 | 15 | 5% | 16 |
| stelo.Mirror 1.1 | 8 | 3% | 8 |
| jsal.Jsalbot 1.0 | 7 | 2% | 11 |
| acogdev.alpha 0.2 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 71.9 | 51 / 350 | 3.53 | 13.9% | 38256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.6% | 175 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 14.1% | 43 |
| ara.Shera 0.88 | 3.1 | 14.3% | 75 |
| hadur117.nano.SanaroDE 0.3 | 3.1 | 13.9% | 51 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 3 |
| maribo.IotaCT 1.1 | 6.4 | 7.5% | 1 |
| dsw.StaticD 1.0 | 6.6 | 7.1% | 2 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.2% | 0 |
| stelo.MirrorMicro 1.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 72.4 | 7 / 35 | 4196 |
| 2 | 2 | 62.8 | 75.9 | 8 / 35 | 3744 |
| 3 | 3 | 61.3 | 74.3 | 4 / 35 | 3711 |
| 4 | 4 | 60.0 | 68.9 | 1 / 35 | 3742 |
| 5 | 2 | 62.1 | 75.6 | 6 / 35 | 3829 |
| 6 | 4 | 58.1 | 62.5 | 3 / 35 | 3635 |
| 7 | 3 | 61.5 | 71.1 | 8 / 35 | 3976 |
| 8 | 3 | 62.7 | 76.2 | 5 / 35 | 4074 |
| 9 | 4 | 61.1 | 72.7 | 3 / 35 | 3784 |
| 10 | 3 | 60.5 | 69.2 | 6 / 35 | 3565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 69 | 30% |
| ara.Shera 0.88 | 39 | 38% |
| maribo.mini.MiniQuester 0.1 | 29 | 41% |
| dsw.StaticD 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 1 | 0% |

Hadur died in 300 of 350 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 107 | 36% | 129 |
| ara.Shera 0.88 | 82 | 27% | 95 |
| maribo.mini.MiniQuester 0.1 | 68 | 23% | 79 |
| amz.NanoClone 1.41 | 21 | 7% | 21 |
| maribo.IotaCT 1.1 | 9 | 3% | 10 |
| dsw.StaticD 1.0 | 4 | 1% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 4 | 1% | 4 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 3 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 60.6 | 15 / 350 | 4.55 | 11.3% | 27997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.5% | 272 |
| brainfade.melee.Dusk 0.44 | 2.4 | 13.2% | 37 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.3% | 13 |
| wcsv.melee.EngineerMelee 0.1 | 4.2 | 11.4% | 6 |
| hadur117.nano.SanaroDE 0.3 | 4.4 | 11.3% | 15 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 10.3% | 6 |
| jab.DiamondStealer 5 | 7.4 | 7.5% | 0 |
| mz.NanoGod 2.02 | 7.6 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 71.7 | 3 / 35 | 2991 |
| 2 | 4 | 57.3 | 60.3 | 0 / 35 | 2717 |
| 3 | 5 | 55.0 | 55.2 | 0 / 35 | 2426 |
| 4 | 4 | 58.1 | 60.0 | 1 / 35 | 3202 |
| 5 | 5 | 58.6 | 64.8 | 2 / 35 | 2501 |
| 6 | 5 | 56.5 | 56.5 | 2 / 35 | 2918 |
| 7 | 5 | 57.8 | 60.3 | 1 / 35 | 2859 |
| 8 | 5 | 57.4 | 59.4 | 1 / 35 | 2924 |
| 9 | 3 | 59.4 | 64.1 | 2 / 35 | 3178 |
| 10 | 6 | 54.3 | 53.7 | 3 / 35 | 2281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 60 | 13% |
| brainfade.melee.Dusk 0.44 | 7 | 14% |
| dummy.micro.Sparrow 2.5 | 5 | 80% |
| Krabb.akim2.Akim2 1.1b | 4 | 25% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 33% |

Hadur died in 335 of 350 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 158 | 47% | 164 |
| brainfade.melee.Dusk 0.44 | 50 | 15% | 52 |
| dummy.micro.Sparrow 2.5 | 46 | 14% | 52 |
| wcsv.melee.EngineerMelee 0.1 | 40 | 12% | 40 |
| Krabb.akim2.Akim2 1.1b | 21 | 6% | 22 |
| jab.DiamondStealer 5 | 10 | 3% | 10 |
| mz.NanoGod 2.02 | 7 | 2% | 7 |
| cvt.Firsty 1.0 | 3 | 1% | 3 |

## Melee bench: F44

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 68.7 | 67 / 350 | 3.82 | 13.7% | 36003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 17.1% | 161 |
| tzu.TheArtOfWar 1.2 | 2.2 | 15.0% | 71 |
| hadur117.nano.SanaroDE 0.3 | 2.7 | 13.7% | 67 |
| wompi.Quokka 1.6 | 4.6 | 10.5% | 13 |
| jwirde.Gort 2.0 | 4.7 | 10.5% | 27 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 9.0% | 6 |
| disan.Chair 2.2.0 | 7.1 | 7.5% | 3 |
| stf.PanzerGeneral 0.1 | 7.6 | 7.4% | 3 |
| sample.Crazy 1.0 | 9.2 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 67.6 | 5 / 35 | 3347 |
| 2 | 2 | 60.8 | 67.9 | 10 / 35 | 3621 |
| 3 | 2 | 61.1 | 69.2 | 12 / 35 | 3899 |
| 4 | 3 | 61.4 | 72.7 | 5 / 35 | 3645 |
| 5 | 3 | 61.3 | 70.8 | 4 / 35 | 3660 |
| 6 | 3 | 62.3 | 71.1 | 7 / 35 | 3921 |
| 7 | 3 | 56.0 | 58.7 | 5 / 35 | 3219 |
| 8 | 3 | 61.2 | 70.8 | 6 / 35 | 3548 |
| 9 | 3 | 59.5 | 64.4 | 8 / 35 | 3350 |
| 10 | 2 | 61.6 | 73.7 | 5 / 35 | 3793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 67 | 45% |
| tzu.TheArtOfWar 1.2 | 33 | 42% |
| jwirde.Gort 2.0 | 10 | 60% |
| disan.Chair 2.2.0 | 9 | 89% |
| wompi.Quokka 1.6 | 7 | 86% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 0% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 116 | 41% | 146 |
| tzu.TheArtOfWar 1.2 | 77 | 27% | 91 |
| wompi.Quokka 1.6 | 29 | 10% | 33 |
| jwirde.Gort 2.0 | 22 | 8% | 29 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 18 | 6% | 20 |
| stf.PanzerGeneral 0.1 | 9 | 3% | 9 |
| amk.jointstrike.JointStrike 0.2 | 5 | 2% | 6 |
| sample.Crazy 1.0 | 5 | 2% | 6 |
| disan.Chair 2.2.0 | 3 | 1% | 10 |

## Melee bench: F45

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 66.0 | 19 / 350 | 4.06 | 13.4% | 38713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 1.8 | 13.9% | 213 |
| hadur117.nano.SanaroDE 0.3 | 2.3 | 13.4% | 19 |
| jje.BagPuss 1.2 | 2.5 | 13.0% | 28 |
| sul.Lunar 1.1 | 3.8 | 11.7% | 49 |
| myl.nano.Graviton 1.10 | 4.7 | 10.8% | 16 |
| hvilela.HVilela 0.9 | 6.3 | 9.3% | 1 |
| fm.claire 1.7 | 7.0 | 8.5% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 8.0% | 7 |
| wit.Deep7 2.0 | 8.9 | 6.5% | 14 |
| abud.ThirdRobo 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 72.4 | 2 / 35 | 4303 |
| 2 | 1 | 61.4 | 73.7 | 2 / 35 | 4011 |
| 3 | 3 | 57.6 | 59.7 | 2 / 35 | 4187 |
| 4 | 2 | 59.1 | 67.0 | 2 / 35 | 3746 |
| 5 | 1 | 59.1 | 67.6 | 4 / 35 | 3488 |
| 6 | 3 | 58.8 | 65.1 | 1 / 35 | 3722 |
| 7 | 3 | 59.7 | 66.3 | 1 / 35 | 3932 |
| 8 | 3 | 58.7 | 63.8 | 3 / 35 | 3908 |
| 9 | 4 | 54.9 | 57.1 | 1 / 35 | 3427 |
| 10 | 2 | 60.1 | 67.6 | 1 / 35 | 3989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 69 | 6% |
| sul.Lunar 1.1 | 16 | 0% |
| jje.BagPuss 1.2 | 9 | 44% |
| myl.nano.Graviton 1.10 | 9 | 33% |
| fm.claire 1.7 | 3 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 3 | 100% |
| wit.Deep7 2.0 | 3 | 67% |

Hadur died in 331 of 350 rounds, at a mean tick of 1061. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 86 | 26% | 117 |
| eem.IWillFireNoBullet v2.8 | 74 | 22% | 0 |
| sul.Lunar 1.1 | 73 | 22% | 90 |
| myl.nano.Graviton 1.10 | 34 | 10% | 52 |
| hvilela.HVilela 0.9 | 21 | 6% | 26 |
| fm.claire 1.7 | 19 | 6% | 21 |
| wit.Deep7 2.0 | 10 | 3% | 19 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 3% | 18 |
| abud.ThirdRobo 1.0 | 5 | 2% | 6 |

## Melee bench: F46

hadur117.nano.SanaroDE 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 71.9 | 32 / 350 | 3.53 | 13.0% | 30087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.1 | 17.9% | 154 |
| rsalesc.melee.Medina 0.4.5 | 1.9 | 16.7% | 135 |
| hadur117.nano.SanaroDE 0.3 | 3.0 | 13.0% | 32 |
| mz.MicroSheep 1.0 | 4.2 | 10.7% | 8 |
| cx.Princess 1.0 | 4.9 | 10.2% | 18 |
| sadoner.killer 0.2 | 5.9 | 9.3% | 2 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.4% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.3% | 0 |
| kurios.DOSexe .9a | 8.9 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 72.1 | 4 / 35 | 3106 |
| 2 | 3 | 60.3 | 74.0 | 3 / 35 | 2996 |
| 3 | 3 | 60.8 | 75.2 | 1 / 35 | 3189 |
| 4 | 3 | 58.7 | 68.9 | 5 / 35 | 2747 |
| 5 | 3 | 61.0 | 74.9 | 5 / 35 | 3126 |
| 6 | 3 | 59.5 | 71.1 | 2 / 35 | 3097 |
| 7 | 3 | 59.5 | 71.1 | 3 / 35 | 2866 |
| 8 | 3 | 59.1 | 70.2 | 4 / 35 | 2874 |
| 9 | 3 | 59.4 | 70.5 | 2 / 35 | 3087 |
| 10 | 3 | 59.7 | 70.8 | 3 / 35 | 2999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 67 | 25% |
| rsalesc.melee.Medina 0.4.5 | 44 | 18% |
| cx.Princess 1.0 | 10 | 50% |
| mz.MicroSheep 1.0 | 4 | 25% |
| sadoner.killer 0.2 | 1 | 0% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 319 of 350 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 142 | 45% | 163 |
| rsalesc.melee.Medina 0.4.5 | 85 | 27% | 91 |
| mz.MicroSheep 1.0 | 36 | 11% | 36 |
| cx.Princess 1.0 | 18 | 6% | 20 |
| sadoner.killer 0.2 | 13 | 4% | 13 |
| arthord.NanoSatanMelee Beta | 12 | 4% | 14 |
| jeremyreeder.collective.Prophet 5 | 6 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 3 | 1% | 3 |
| kurios.DOSexe .9a | 3 | 1% | 3 |
1 death(s) with no robot to name.

