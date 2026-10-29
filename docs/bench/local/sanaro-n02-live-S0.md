# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 74.1 | 39 / 350 | 3.33 | 13.9% | 38368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 243 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 13.9% | 39 |
| sgp.JollyNinja 3.53 | 3.9 | 11.4% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 11.0% | 6 |
| mz.MicroGodMelee 1 | 4.7 | 11.1% | 17 |
| lorneswork.Predator 1.0 | 5.1 | 10.3% | 7 |
| adt.Ar2 1.0 | 6.9 | 8.1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.9% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 9.9 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 75.2 | 6 / 35 | 3498 |
| 2 | 2 | 63.0 | 77.5 | 6 / 35 | 4100 |
| 3 | 2 | 59.8 | 69.2 | 2 / 35 | 3845 |
| 4 | 2 | 60.5 | 70.8 | 1 / 35 | 3895 |
| 5 | 2 | 61.9 | 76.2 | 4 / 35 | 3570 |
| 6 | 2 | 62.7 | 78.1 | 3 / 35 | 4139 |
| 7 | 2 | 60.1 | 69.2 | 4 / 35 | 3859 |
| 8 | 2 | 62.6 | 78.1 | 5 / 35 | 3724 |
| 9 | 2 | 63.1 | 76.8 | 4 / 35 | 4180 |
| 10 | 2 | 59.7 | 69.8 | 4 / 35 | 3558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 144 | 9% |
| sgp.JollyNinja 3.53 | 19 | 32% |
| mz.MicroGodMelee 1 | 11 | 55% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |
| lorneswork.Predator 1.0 | 4 | 75% |
| adt.Ar2 1.0 | 2 | 50% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 311 of 350 rounds, at a mean tick of 1115. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 164 | 53% | 179 |
| sgp.JollyNinja 3.53 | 38 | 12% | 43 |
| mz.MicroGodMelee 1 | 31 | 10% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 30 | 10% | 34 |
| lorneswork.Predator 1.0 | 26 | 8% | 29 |
| adt.Ar2 1.0 | 16 | 5% | 18 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 4 |
| mym.EdgeStalker 1.0 | 2 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 0% | 3 |

## Melee bench: F02

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 66.1 | 60 / 350 | 4.05 | 13.8% | 41003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.7 | 14.5% | 94 |
| pulsar.PulsarMax 0.8.9 | 1.8 | 14.8% | 112 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 13.8% | 60 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.3% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.8% | 25 |
| sch.Simone 0.3d | 6.7 | 8.2% | 17 |
| Noran.BitchingElk 0.054 | 6.9 | 8.0% | 22 |
| fnc.bandit.Bandit 5.2.0 | 7.1 | 8.5% | 5 |
| stelo.PatternRobot 1.0 | 9.0 | 6.4% | 6 |
| fullsail.SweetTea 1.1 | 9.9 | 4.9% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 74.0 | 6 / 35 | 4618 |
| 2 | 4 | 59.1 | 62.2 | 4 / 35 | 4145 |
| 3 | 3 | 57.2 | 59.0 | 6 / 35 | 3876 |
| 4 | 2 | 63.3 | 75.6 | 10 / 35 | 4183 |
| 5 | 3 | 58.1 | 59.4 | 6 / 35 | 3912 |
| 6 | 2 | 60.8 | 68.6 | 4 / 35 | 4358 |
| 7 | 3 | 58.9 | 64.1 | 4 / 35 | 3856 |
| 8 | 3 | 60.2 | 65.4 | 6 / 35 | 4159 |
| 9 | 2 | 61.2 | 68.3 | 8 / 35 | 4068 |
| 10 | 3 | 58.8 | 64.1 | 6 / 35 | 3828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 52 | 46% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 15% |
| sch.Simone 0.3d | 11 | 64% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 50% |
| Noran.BitchingElk 0.054 | 9 | 56% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 86% |
| stelo.PatternRobot 1.0 | 6 | 83% |
| fullsail.SweetTea 1.1 | 4 | 25% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |

Hadur died in 290 of 350 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 83 | 29% | 99 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 76 | 26% | 86 |
| lrem.micro.SpikeSoldier 0.4 | 38 | 13% | 42 |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 8% | 27 |
| stelo.PatternRobot 1.0 | 21 | 7% | 26 |
| sch.Simone 0.3d | 20 | 7% | 30 |
| fnc.bandit.Bandit 5.2.0 | 12 | 4% | 13 |
| Noran.BitchingElk 0.054 | 10 | 3% | 18 |
| fullsail.SweetTea 1.1 | 8 | 3% | 9 |

## Melee bench: F03

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 76.0 | 60 / 350 | 3.16 | 14.5% | 41404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.6 | 15.5% | 104 |
| kawigi.nano.Lib 1.0 | 2.3 | 14.7% | 91 |
| hadur117.nano.SanaroS0 0.1 | 2.4 | 14.5% | 60 |
| vuen.Cake 2.51 | 3.7 | 13.4% | 73 |
| urdos.URDOS 1.3 | 5.0 | 10.6% | 14 |
| adt.Ar1 2.1 | 6.4 | 7.4% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 7.1 | 7.0% | 2 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.5% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.6 | 5.8% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 80.0 | 7 / 35 | 4048 |
| 2 | 2 | 64.1 | 79.7 | 7 / 35 | 4714 |
| 3 | 3 | 60.2 | 71.4 | 6 / 35 | 3962 |
| 4 | 1 | 64.2 | 82.5 | 10 / 35 | 4452 |
| 5 | 3 | 61.4 | 75.9 | 3 / 35 | 3943 |
| 6 | 3 | 61.5 | 74.3 | 3 / 35 | 4230 |
| 7 | 2 | 61.8 | 74.9 | 8 / 35 | 4113 |
| 8 | 2 | 61.8 | 77.5 | 4 / 35 | 3936 |
| 9 | 3 | 61.5 | 72.7 | 8 / 35 | 4046 |
| 10 | 4 | 60.5 | 70.8 | 4 / 35 | 3960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 66 | 47% |
| vuen.Cake 2.51 | 55 | 36% |
| kawigi.nano.Lib 1.0 | 40 | 5% |
| urdos.URDOS 1.3 | 13 | 46% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 50% |
| adt.Ar1 2.1 | 2 | 0% |

Hadur died in 290 of 350 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 86 | 30% | 90 |
| radnor.DoctorBob 1.42 | 77 | 27% | 108 |
| vuen.Cake 2.51 | 51 | 18% | 69 |
| urdos.URDOS 1.3 | 45 | 16% | 50 |
| adt.Ar1 2.1 | 13 | 4% | 13 |
| ghent.ArthurPanzergon 1.0.0 | 7 | 2% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 2% | 6 |
| oa.weak.FlyMk1 0.1 | 3 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 3 |

## Melee bench: F04

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 72.2 | 8 / 350 | 3.50 | 14.1% | 44432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.4% | 325 |
| hadur117.nano.SanaroS0 0.1 | 2.2 | 14.1% | 8 |
| apc.LeeroyJenkins2 1.0 | 2.8 | 13.3% | 11 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 3 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 1 |
| css.Delitioner 0.11 | 6.2 | 7.7% | 2 |
| tj.zombie1n 1.0.1 | 6.8 | 7.2% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 73.7 | 0 / 35 | 4629 |
| 2 | 2 | 63.8 | 76.2 | 0 / 35 | 4531 |
| 3 | 2 | 63.2 | 74.3 | 1 / 35 | 4524 |
| 4 | 3 | 62.1 | 68.6 | 2 / 35 | 4715 |
| 5 | 2 | 63.7 | 73.7 | 2 / 35 | 4650 |
| 6 | 2 | 63.2 | 72.7 | 1 / 35 | 4573 |
| 7 | 2 | 62.6 | 76.2 | 0 / 35 | 3970 |
| 8 | 2 | 62.9 | 71.7 | 0 / 35 | 4749 |
| 9 | 2 | 63.2 | 75.2 | 1 / 35 | 4470 |
| 10 | 3 | 57.9 | 60.0 | 1 / 35 | 3621 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 142 | 4% |
| apc.LeeroyJenkins2 1.0 | 3 | 0% |
| TNT.TNT 0.99.1 | 3 | 67% |
| josago.Jorgito 0.16 | 1 | 0% |
| css.Delitioner 0.11 | 1 | 0% |

Hadur died in 342 of 350 rounds, at a mean tick of 1195. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 223 | 65% | 229 |
| apc.LeeroyJenkins2 1.0 | 39 | 11% | 39 |
| josago.Jorgito 0.16 | 37 | 11% | 37 |
| TNT.TNT 0.99.1 | 15 | 4% | 17 |
| css.Delitioner 0.11 | 11 | 3% | 11 |
| tj.zombie1n 1.0.1 | 10 | 3% | 10 |
| rampancy.Durandal 2.1d | 6 | 2% | 6 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.0 | 55 / 350 | 3.97 | 12.8% | 31057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.8% | 97 |
| origin.SleepSiphon 1.7b | 2.5 | 14.3% | 99 |
| hadur117.nano.SanaroS0 0.1 | 3.3 | 12.8% | 55 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 12.2% | 50 |
| mld.Wisdom 1.0 | 4.1 | 11.9% | 19 |
| gg.Wolverine 2.0 | 6.4 | 8.9% | 10 |
| spinnercat.Omen 1.0 | 6.7 | 8.3% | 7 |
| DBall.NUKE 0.1 | 8.3 | 6.5% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.4% | 7 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.3 | 69.2 | 4 / 35 | 3168 |
| 2 | 3 | 59.7 | 68.6 | 6 / 35 | 3378 |
| 3 | 3 | 59.0 | 68.6 | 3 / 35 | 3128 |
| 4 | 5 | 54.0 | 56.8 | 3 / 35 | 2526 |
| 5 | 3 | 56.8 | 61.9 | 4 / 35 | 2917 |
| 6 | 2 | 62.0 | 75.6 | 9 / 35 | 3469 |
| 7 | 4 | 58.5 | 65.7 | 5 / 35 | 3006 |
| 8 | 4 | 58.3 | 66.0 | 8 / 35 | 2696 |
| 9 | 2 | 61.7 | 72.4 | 9 / 35 | 3477 |
| 10 | 3 | 58.1 | 64.8 | 4 / 35 | 3292 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 42 | 40% |
| origin.SleepSiphon 1.7b | 41 | 46% |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 55% |
| mld.Wisdom 1.0 | 8 | 13% |
| gg.Wolverine 2.0 | 4 | 100% |
| spinnercat.Omen 1.0 | 3 | 0% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| DBall.NUKE 0.1 | 2 | 50% |

Hadur died in 295 of 350 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 90 | 31% | 102 |
| mld.Wisdom 1.0 | 60 | 20% | 63 |
| origin.SleepSiphon 1.7b | 58 | 20% | 85 |
| pe.minimelee.SandboxMiniMelee 1.1 | 44 | 15% | 52 |
| spinnercat.Omen 1.0 | 17 | 6% | 17 |
| gg.Wolverine 2.0 | 11 | 4% | 13 |
| DBall.NUKE 0.1 | 7 | 2% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 2% | 7 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.7 | 97 / 350 | 2.65 | 16.6% | 49049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.4 | 18.0% | 109 |
| rtk.Tachikoma 1.0 | 1.9 | 17.2% | 80 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 16.6% | 97 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 12.1% | 28 |
| franzor.Lizt 1.3.1 | 4.7 | 11.4% | 36 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| sample.Target 1.0 | 9.2 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.8 | 82.2 | 12 / 35 | 4935 |
| 2 | 2 | 67.5 | 81.9 | 11 / 35 | 4929 |
| 3 | 3 | 66.3 | 76.8 | 6 / 35 | 4928 |
| 4 | 3 | 67.0 | 81.6 | 9 / 35 | 4871 |
| 5 | 3 | 67.3 | 81.3 | 11 / 35 | 5045 |
| 6 | 3 | 67.5 | 81.3 | 13 / 35 | 5038 |
| 7 | 3 | 66.5 | 81.9 | 8 / 35 | 4447 |
| 8 | 2 | 67.8 | 83.5 | 9 / 35 | 4970 |
| 9 | 2 | 67.6 | 84.1 | 6 / 35 | 5045 |
| 10 | 3 | 67.5 | 82.2 | 12 / 35 | 4841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 91 | 69% |
| rsalesc.melee.Monk 0.3.6c | 48 | 4% |
| oog.melee.CapuletDroid 1.1 | 37 | 62% |
| franzor.Lizt 1.3.1 | 13 | 54% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 254 of 350 rounds, at a mean tick of 1308. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 111 | 44% | 180 |
| rsalesc.melee.Monk 0.3.6c | 88 | 35% | 97 |
| oog.melee.CapuletDroid 1.1 | 36 | 14% | 55 |
| franzor.Lizt 1.3.1 | 8 | 3% | 4 |
| exauge.GateKeeper 1.1.121g | 6 | 2% | 8 |
| skm.PateranBotlock2 1.0 | 3 | 1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 2 |

## Melee bench: F08

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 71.9 | 79 / 350 | 3.53 | 14.0% | 33804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.9 | 13.9% | 96 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 14.0% | 79 |
| shrub.Vapour v159 | 2.2 | 13.4% | 75 |
| Krabb.sliNk.Garm 0.9u | 4.6 | 10.7% | 29 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.6% | 30 |
| m3thos.Eva00 1.1 | 5.6 | 9.4% | 20 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.4% | 20 |
| qualidafial.MajorDick 1.0.1 | 8.4 | 7.1% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.8% | 2 |
| SHAM.WOW 1.4 | 9.1 | 6.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 70.2 | 5 / 35 | 3228 |
| 2 | 2 | 59.9 | 72.1 | 6 / 35 | 3343 |
| 3 | 2 | 60.5 | 71.1 | 9 / 35 | 3512 |
| 4 | 3 | 57.5 | 64.8 | 6 / 35 | 3248 |
| 5 | 2 | 60.6 | 73.7 | 9 / 35 | 3218 |
| 6 | 1 | 61.8 | 76.8 | 10 / 35 | 3563 |
| 7 | 3 | 57.8 | 65.4 | 7 / 35 | 3191 |
| 8 | 2 | 61.7 | 75.2 | 7 / 35 | 3777 |
| 9 | 1 | 61.1 | 73.7 | 10 / 35 | 3567 |
| 10 | 1 | 60.7 | 75.9 | 10 / 35 | 3157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 63 | 43% |
| shrub.Vapour v159 | 40 | 33% |
| Krabb.sliNk.Garm 0.9u | 24 | 63% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 58% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 55% |
| m3thos.Eva00 1.1 | 9 | 44% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 275 of 350 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 73 | 27% | 101 |
| shrub.Vapour v159 | 66 | 24% | 80 |
| Krabb.sliNk.Garm 0.9u | 39 | 14% | 47 |
| com.spp.robocode.MostlyHarmless 010 | 27 | 10% | 35 |
| jwst.DAD.DarkAndDarker 1.1 | 20 | 7% | 27 |
| m3thos.Eva00 1.1 | 18 | 7% | 19 |
| zyx.nano.BacillusComma 1.0 | 16 | 6% | 22 |
| qualidafial.MajorDick 1.0.1 | 10 | 4% | 12 |
| SHAM.WOW 1.4 | 5 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.2 | 57.1 | 26 / 350 | 4.86 | 11.2% | 29379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.3% | 195 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 58 |
| hadur117.nano.SanaroS0 0.1 | 3.9 | 11.2% | 26 |
| yagami.Tidus 0.11 | 4.1 | 11.0% | 9 |
| pedersen.Grishnakh 1.0 | 4.3 | 11.3% | 35 |
| mc2.enemy.Original 0.9 | 5.7 | 9.5% | 20 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 6 |
| step.nanoPri 1.0 | 8.3 | 5.8% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.5 | 58.4 | 3 / 35 | 2919 |
| 2 | 4 | 56.3 | 61.3 | 3 / 35 | 2846 |
| 3 | 5 | 52.3 | 51.4 | 1 / 35 | 2818 |
| 4 | 4 | 55.5 | 59.7 | 3 / 35 | 2818 |
| 5 | 3 | 57.2 | 60.0 | 5 / 35 | 3000 |
| 6 | 3 | 55.5 | 58.1 | 2 / 35 | 3029 |
| 7 | 3 | 58.0 | 61.6 | 4 / 35 | 3292 |
| 8 | 4 | 54.0 | 54.3 | 2 / 35 | 2870 |
| 9 | 5 | 53.1 | 53.0 | 0 / 35 | 2924 |
| 10 | 4 | 54.1 | 53.7 | 3 / 35 | 2863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 40 | 25% |
| kc.micro.Figment 1.0 | 24 | 21% |
| pedersen.Grishnakh 1.0 | 6 | 50% |
| mc2.enemy.Original 0.9 | 5 | 40% |
| yagami.Tidus 0.11 | 3 | 100% |
| dft.Calliope 5.6 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 0% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 324 of 350 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 88 | 27% | 97 |
| kc.micro.Figment 1.0 | 69 | 21% | 75 |
| yagami.Tidus 0.11 | 49 | 15% | 55 |
| mc2.enemy.Original 0.9 | 45 | 14% | 46 |
| pedersen.Grishnakh 1.0 | 31 | 10% | 33 |
| robar.nano.Assertive_Melee 0.2 | 16 | 5% | 16 |
| dft.Calliope 5.6 | 12 | 4% | 14 |
| step.nanoPri 1.0 | 10 | 3% | 10 |
| rdm.Dueler 0.4x | 4 | 1% | 4 |

## Melee bench: F10

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 77.0 | 98 / 350 | 3.07 | 15.1% | 41088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.7 | 15.1% | 98 |
| DTF.Kludgy 1.2b | 2.0 | 15.0% | 94 |
| ejb.Polaris 1.0.1 | 3.2 | 13.1% | 47 |
| ne.Chimera 1.2 | 3.2 | 13.4% | 52 |
| tvv.micro.Antares 1.1.1 | 5.4 | 10.6% | 30 |
| vStar.RAFzilla 2.15 | 5.5 | 10.5% | 19 |
| sam.Samspin 1.0 | 7.6 | 6.2% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.8 | 5.4% | 2 |
| donjezza.Muncho 1.0 | 9.4 | 4.9% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 84.8 | 14 / 35 | 4522 |
| 2 | 1 | 62.3 | 73.7 | 8 / 35 | 4263 |
| 3 | 2 | 62.8 | 75.2 | 7 / 35 | 4285 |
| 4 | 2 | 61.6 | 74.9 | 7 / 35 | 3859 |
| 5 | 2 | 61.6 | 74.6 | 12 / 35 | 3595 |
| 6 | 3 | 62.0 | 74.6 | 7 / 35 | 3972 |
| 7 | 1 | 62.4 | 75.9 | 8 / 35 | 4370 |
| 8 | 1 | 66.8 | 87.3 | 19 / 35 | 4206 |
| 9 | 2 | 62.0 | 74.6 | 9 / 35 | 3912 |
| 10 | 2 | 62.0 | 74.9 | 7 / 35 | 4104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 66 | 77% |
| DTF.Kludgy 1.2b | 46 | 35% |
| vStar.RAFzilla 2.15 | 24 | 75% |
| ne.Chimera 1.2 | 23 | 22% |
| tvv.micro.Antares 1.1.1 | 13 | 15% |
| donjezza.Muncho 1.0 | 7 | 43% |
| sam.Samspin 1.0 | 4 | 75% |
| kurios.DOSexe .9b | 1 | 0% |

Hadur died in 253 of 350 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 83 | 33% | 98 |
| ne.Chimera 1.2 | 69 | 27% | 79 |
| ejb.Polaris 1.0.1 | 36 | 14% | 90 |
| tvv.micro.Antares 1.1.1 | 23 | 9% | 22 |
| vStar.RAFzilla 2.15 | 13 | 5% | 27 |
| sam.Samspin 1.0 | 9 | 4% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 3% | 9 |
| donjezza.Muncho 1.0 | 6 | 2% | 9 |
| kurios.DOSexe .9b | 6 | 2% | 7 |

## Melee bench: F11

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 65.1 | 46 / 350 | 4.14 | 12.7% | 32623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.2% | 153 |
| cx.mini.Nimrod 0.55 | 2.2 | 13.1% | 47 |
| hadur117.nano.SanaroS0 0.1 | 2.9 | 12.7% | 46 |
| djc.DynaBot 0.1.1 | 4.2 | 11.0% | 23 |
| br2.MobyDickBot 1.6 | 5.5 | 9.6% | 33 |
| rdt199.Warlord 0.73 | 6.2 | 9.3% | 16 |
| uji.YellohFellah 1.0 | 6.3 | 8.8% | 30 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.5% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.9% | 2 |
| stelo.MirrorNano 1.3 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 65.1 | 2 / 35 | 3549 |
| 2 | 3 | 58.0 | 65.4 | 4 / 35 | 3198 |
| 3 | 3 | 58.3 | 63.5 | 4 / 35 | 3482 |
| 4 | 3 | 57.3 | 63.5 | 4 / 35 | 3278 |
| 5 | 3 | 58.8 | 66.0 | 5 / 35 | 3475 |
| 6 | 3 | 60.2 | 72.4 | 8 / 35 | 2940 |
| 7 | 2 | 58.9 | 67.9 | 5 / 35 | 3297 |
| 8 | 4 | 55.2 | 58.4 | 5 / 35 | 3046 |
| 9 | 2 | 58.7 | 67.3 | 6 / 35 | 3304 |
| 10 | 3 | 56.1 | 61.3 | 3 / 35 | 3054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 51 | 49% |
| cx.mini.Nimrod 0.55 | 20 | 50% |
| djc.DynaBot 0.1.1 | 13 | 54% |
| br2.MobyDickBot 1.6 | 9 | 11% |
| uji.YellohFellah 1.0 | 9 | 11% |
| rdt199.Warlord 0.73 | 3 | 67% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 304 of 350 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 100 | 33% | 121 |
| cx.mini.Nimrod 0.55 | 53 | 17% | 63 |
| rdt199.Warlord 0.73 | 39 | 13% | 43 |
| djc.DynaBot 0.1.1 | 29 | 10% | 35 |
| uji.YellohFellah 1.0 | 27 | 9% | 27 |
| br2.MobyDickBot 1.6 | 22 | 7% | 23 |
| KiraNL.Chupacabra 0.4 | 17 | 6% | 19 |
| stelo.MirrorNano 1.3 | 12 | 4% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 2% | 6 |

## Melee bench: F12

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 68.8 | 54 / 350 | 3.81 | 13.2% | 30476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.5 | 14.7% | 87 |
| nat.PallasHawk 1.0 | 2.4 | 14.0% | 97 |
| darkcanuck.Leon 1.01 | 2.9 | 13.5% | 72 |
| hadur117.nano.SanaroS0 0.1 | 3.2 | 13.2% | 54 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.4% | 27 |
| jrm.Test0 1.0 | 6.5 | 8.5% | 2 |
| jp.Perpy 16.0 | 7.1 | 7.6% | 2 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.2% | 2 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 5 |
| stuff.Vlad 0.1 | 9.6 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 73.3 | 9 / 35 | 3549 |
| 2 | 4 | 57.7 | 65.4 | 3 / 35 | 2902 |
| 3 | 2 | 61.4 | 75.9 | 6 / 35 | 3061 |
| 4 | 4 | 58.2 | 68.3 | 5 / 35 | 2834 |
| 5 | 3 | 59.2 | 69.2 | 5 / 35 | 3142 |
| 6 | 4 | 59.3 | 68.6 | 5 / 35 | 2982 |
| 7 | 4 | 59.2 | 68.6 | 5 / 35 | 3091 |
| 8 | 4 | 54.7 | 58.1 | 4 / 35 | 2889 |
| 9 | 3 | 60.2 | 71.4 | 7 / 35 | 3085 |
| 10 | 3 | 58.9 | 69.2 | 5 / 35 | 2941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 44 | 45% |
| nat.PallasHawk 1.0 | 41 | 22% |
| darkcanuck.Leon 1.01 | 37 | 27% |
| brainfade.melee.Genghis 0.36 | 16 | 63% |
| jaybot.bots.Oddball 4.0 | 5 | 20% |
| cs.sheldor.Talon 1.1 | 3 | 67% |
| jrm.Test0 1.0 | 2 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 80 | 27% | 93 |
| bts.wiki.RipCurl 0.9b | 66 | 22% | 79 |
| darkcanuck.Leon 1.01 | 58 | 19% | 71 |
| brainfade.melee.Genghis 0.36 | 36 | 12% | 38 |
| jrm.Test0 1.0 | 18 | 6% | 23 |
| cs.sheldor.Talon 1.1 | 17 | 6% | 19 |
| jp.Perpy 16.0 | 10 | 3% | 10 |
| jaybot.bots.Oddball 4.0 | 9 | 3% | 10 |
| stuff.Vlad 0.1 | 4 | 1% | 6 |

## Melee bench: F13

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 68.4 | 31 / 350 | 3.84 | 12.6% | 32723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 17.2% | 108 |
| mn.Combat 3.25.0 | 1.5 | 17.2% | 163 |
| hadur117.nano.SanaroS0 0.1 | 3.4 | 12.6% | 31 |
| shinh.Entangled 0.3 | 3.9 | 12.1% | 32 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.8% | 13 |
| apc.Colossus2 0.17 | 6.0 | 8.4% | 1 |
| stelo.Wang 1.0 | 7.1 | 6.9% | 2 |
| ayk.WallHugger 1.0 | 8.0 | 5.7% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 66.3 | 1 / 35 | 3505 |
| 2 | 3 | 57.9 | 66.3 | 2 / 35 | 3045 |
| 3 | 4 | 59.5 | 67.0 | 5 / 35 | 3623 |
| 4 | 3 | 60.2 | 71.7 | 5 / 35 | 3028 |
| 5 | 3 | 61.3 | 71.7 | 5 / 35 | 3467 |
| 6 | 3 | 58.5 | 68.9 | 3 / 35 | 2977 |
| 7 | 3 | 59.6 | 70.2 | 2 / 35 | 3278 |
| 8 | 3 | 59.8 | 68.3 | 5 / 35 | 3389 |
| 9 | 4 | 57.8 | 66.3 | 1 / 35 | 3137 |
| 10 | 5 | 59.1 | 67.6 | 2 / 35 | 3274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 59 | 31% |
| ags.Glacier 0.2.11 | 51 | 6% |
| shinh.Entangled 0.3 | 20 | 35% |
| gh.micro.Gruweltje 0.7 | 6 | 33% |
| stelo.Wang 1.0 | 2 | 50% |

Hadur died in 320 of 350 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 117 | 37% | 119 |
| mn.Combat 3.25.0 | 83 | 26% | 101 |
| shinh.Entangled 0.3 | 51 | 16% | 57 |
| gh.micro.Gruweltje 0.7 | 34 | 11% | 39 |
| stelo.Wang 1.0 | 16 | 5% | 17 |
| apc.Colossus2 0.17 | 7 | 2% | 7 |
| maribo.FollowFire 1 | 6 | 2% | 6 |
| ayk.WallHugger 1.0 | 5 | 2% | 3 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 73.5 | 79 / 350 | 3.39 | 14.0% | 34713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 18.0% | 153 |
| hadur117.nano.SanaroS0 0.1 | 2.1 | 14.0% | 79 |
| catcat20.shape.Theta 0.018 | 2.9 | 12.6% | 56 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 10.1% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 10.0% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 10.1% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 6.3 | 9.3% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.6% | 15 |
| pa.Improved 1.0 | 9.0 | 5.4% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 67.3 | 5 / 35 | 3216 |
| 2 | 3 | 59.7 | 71.7 | 3 / 35 | 2933 |
| 3 | 2 | 61.0 | 72.1 | 11 / 35 | 3123 |
| 4 | 2 | 63.4 | 77.5 | 10 / 35 | 3654 |
| 5 | 2 | 60.5 | 70.8 | 5 / 35 | 3310 |
| 6 | 2 | 62.0 | 73.7 | 10 / 35 | 3568 |
| 7 | 2 | 64.6 | 80.3 | 13 / 35 | 4009 |
| 8 | 2 | 61.3 | 75.6 | 5 / 35 | 3360 |
| 9 | 2 | 64.3 | 78.7 | 11 / 35 | 4033 |
| 10 | 2 | 59.7 | 67.0 | 6 / 35 | 3507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 85 | 31% |
| catcat20.shape.Theta 0.018 | 38 | 63% |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 38% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 43% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 43% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 272 of 350 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 125 | 46% | 151 |
| catcat20.shape.Theta 0.018 | 42 | 15% | 62 |
| dmh.robocode.robot.RedDwarf 0.4 | 25 | 9% | 31 |
| co.edu.usb.rc.LidisTron 1.0 | 22 | 8% | 23 |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 7% | 28 |
| Lo_Ian.Gandalf_V4 4.0 | 19 | 7% | 26 |
| sanyi.mikrobi.Roberto 1.0 | 15 | 6% | 23 |
| sample.TrackFire 1.0 | 2 | 1% | 3 |
| pa.Improved 1.0 | 2 | 1% | 2 |

## Melee bench: F15

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 62.2 | 41 / 350 | 4.40 | 12.6% | 37457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.4 | 15.1% | 89 |
| mld.DustBunny 3.8 | 2.2 | 13.7% | 52 |
| emp.Yngwie 1.11 | 2.9 | 13.3% | 89 |
| hadur117.nano.SanaroS0 0.1 | 3.8 | 12.6% | 41 |
| cb.nano.Insomnia 1.0 | 5.3 | 11.0% | 20 |
| kawigi.robot.Girl 1.2 | 5.4 | 10.6% | 56 |
| Grystrion.TrackerWO 1.0 | 7.1 | 7.5% | 0 |
| lambdaxy.TBot 0.1 | 8.3 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.8% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 68.9 | 9 / 35 | 3975 |
| 2 | 5 | 56.7 | 59.4 | 2 / 35 | 3507 |
| 3 | 5 | 57.2 | 60.0 | 5 / 35 | 3496 |
| 4 | 4 | 57.7 | 60.3 | 1 / 35 | 4060 |
| 5 | 4 | 57.4 | 62.9 | 5 / 35 | 3425 |
| 6 | 3 | 56.9 | 60.3 | 4 / 35 | 3491 |
| 7 | 4 | 57.1 | 60.3 | 3 / 35 | 3625 |
| 8 | 4 | 59.7 | 64.4 | 6 / 35 | 3953 |
| 9 | 3 | 58.5 | 63.8 | 3 / 35 | 3915 |
| 10 | 4 | 58.9 | 61.9 | 3 / 35 | 4010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 29 | 28% |
| emp.Yngwie 1.11 | 28 | 57% |
| mld.DustBunny 3.8 | 20 | 15% |
| kawigi.robot.Girl 1.2 | 14 | 43% |
| cb.nano.Insomnia 1.0 | 9 | 44% |
| divineomega.TrialBot 0.003 | 4 | 75% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 310 of 350 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 77 | 25% | 85 |
| kawigi.micro.Shiz 1.1 | 71 | 23% | 75 |
| emp.Yngwie 1.11 | 59 | 19% | 77 |
| cb.nano.Insomnia 1.0 | 45 | 15% | 42 |
| kawigi.robot.Girl 1.2 | 24 | 8% | 32 |
| Grystrion.TrackerWO 1.0 | 16 | 5% | 17 |
| divineomega.TrialBot 0.003 | 9 | 3% | 13 |
| lambdaxy.TBot 0.1 | 6 | 2% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 1% | 3 |

## Melee bench: F16

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 67.1 | 34 / 350 | 3.96 | 13.6% | 41267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.4% | 187 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.1 | 15.1% | 33 |
| hadur117.nano.SanaroS0 0.1 | 2.9 | 13.6% | 34 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.8% | 60 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.6% | 18 |
| bvh.fnr.Fenrir 0.36l | 5.4 | 9.2% | 6 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.3% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.8% | 7 |
| repositorio.NanoStep 1.0 | 9.0 | 5.2% | 0 |
| asd.Cthulhu 1.3 | 9.4 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 63.8 | 6 / 35 | 3817 |
| 2 | 3 | 60.9 | 69.2 | 6 / 35 | 3891 |
| 3 | 3 | 60.5 | 65.4 | 3 / 35 | 4373 |
| 4 | 3 | 57.7 | 60.0 | 3 / 35 | 3706 |
| 5 | 3 | 62.1 | 70.5 | 3 / 35 | 4276 |
| 6 | 3 | 62.7 | 72.1 | 4 / 35 | 4525 |
| 7 | 3 | 58.9 | 62.2 | 1 / 35 | 4103 |
| 8 | 3 | 62.1 | 72.1 | 2 / 35 | 4259 |
| 9 | 3 | 60.4 | 67.3 | 3 / 35 | 4106 |
| 10 | 2 | 61.1 | 68.3 | 3 / 35 | 4211 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 73 | 5% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 57% |
| techdude.forest.FlamingForest 1.1 | 19 | 21% |
| tvv.nano.Polaris 1.2 | 14 | 50% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 316 of 350 rounds, at a mean tick of 1132. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 135 | 43% | 142 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 65 | 21% | 78 |
| bvh.fnr.Fenrir 0.36l | 31 | 10% | 34 |
| techdude.forest.FlamingForest 1.1 | 30 | 9% | 35 |
| tvv.nano.Polaris 1.2 | 18 | 6% | 20 |
| stelo.IntrinsicVolatility 1.4 | 16 | 5% | 20 |
| asd.Cthulhu 1.3 | 10 | 3% | 10 |
| divineomega.DivineBot 1.9.4.5 | 9 | 3% | 10 |
| repositorio.NanoStep 1.0 | 2 | 1% | 1 |

## Melee bench: F17

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 66.7 | 55 / 350 | 3.99 | 13.4% | 38792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.1 | 14.2% | 83 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.5% | 76 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 13.4% | 55 |
| cx.BlestPain 1.41 | 3.1 | 13.3% | 66 |
| nic.Nicator 2.4 | 4.9 | 11.7% | 35 |
| ahf.NanoAndrew .4 | 5.2 | 11.4% | 31 |
| maribo.melee.BMV 0.1 | 7.0 | 8.6% | 2 |
| tex.Longbot 0.4 | 8.3 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.5% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.4 | 59.7 | 5 / 35 | 3468 |
| 2 | 1 | 65.0 | 80.0 | 12 / 35 | 4471 |
| 3 | 3 | 58.1 | 60.3 | 3 / 35 | 3852 |
| 4 | 4 | 60.2 | 68.6 | 3 / 35 | 3904 |
| 5 | 3 | 60.0 | 66.0 | 5 / 35 | 3855 |
| 6 | 3 | 60.1 | 66.3 | 5 / 35 | 3837 |
| 7 | 6 | 56.4 | 55.9 | 3 / 35 | 3550 |
| 8 | 2 | 61.6 | 72.4 | 3 / 35 | 3944 |
| 9 | 2 | 60.7 | 69.2 | 8 / 35 | 3720 |
| 10 | 1 | 61.4 | 68.9 | 8 / 35 | 4191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 47 | 23% |
| cx.BlestPain 1.41 | 30 | 77% |
| oog.melee.Mercutio 1.0 | 27 | 44% |
| ahf.NanoAndrew .4 | 12 | 58% |
| nic.Nicator 2.4 | 11 | 18% |
| goblin.Bender 2.4 | 1 | 0% |

Hadur died in 295 of 350 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 81 | 27% | 93 |
| oog.melee.Mercutio 1.0 | 53 | 18% | 65 |
| ahf.NanoAndrew .4 | 52 | 18% | 58 |
| cx.BlestPain 1.41 | 38 | 13% | 61 |
| nic.Nicator 2.4 | 37 | 13% | 39 |
| maribo.melee.BMV 0.1 | 18 | 6% | 18 |
| tex.Longbot 0.4 | 10 | 3% | 10 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 1% | 4 |
| goblin.Bender 2.4 | 2 | 1% | 2 |

## Melee bench: F18

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 63.5 | 57 / 350 | 4.29 | 12.7% | 33794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.3 | 14.4% | 96 |
| hadur117.nano.SanaroS0 0.1 | 2.5 | 12.7% | 57 |
| agd.Mooserwirt2 2.7 | 2.7 | 12.7% | 73 |
| uji.DBH 1.1 | 3.7 | 11.8% | 37 |
| ratosh.Nobo 0.21 | 5.4 | 10.5% | 17 |
| spinnercat.Robovirus 2.718 | 5.6 | 10.2% | 21 |
| sigterm.Sigterm 1.0 | 6.9 | 8.9% | 22 |
| kawigi.mini.Fhqwhgads 1.1 | 8.1 | 7.6% | 11 |
| stelo.WangRobot 1.0 | 8.9 | 6.4% | 17 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.6 | 61.9 | 6 / 35 | 3406 |
| 2 | 3 | 57.3 | 63.5 | 6 / 35 | 3195 |
| 3 | 1 | 60.1 | 68.6 | 6 / 35 | 3846 |
| 4 | 2 | 56.6 | 61.9 | 3 / 35 | 3334 |
| 5 | 3 | 56.0 | 61.6 | 2 / 35 | 3220 |
| 6 | 3 | 57.3 | 62.9 | 7 / 35 | 3227 |
| 7 | 3 | 57.5 | 63.8 | 6 / 35 | 3120 |
| 8 | 3 | 56.9 | 59.4 | 6 / 35 | 3547 |
| 9 | 3 | 57.4 | 62.9 | 7 / 35 | 3187 |
| 10 | 2 | 59.9 | 68.6 | 8 / 35 | 3712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 35 | 43% |
| agd.Mooserwirt2 2.7 | 25 | 48% |
| spinnercat.Robovirus 2.718 | 18 | 67% |
| uji.DBH 1.1 | 16 | 69% |
| sigterm.Sigterm 1.0 | 11 | 27% |
| stelo.WangRobot 1.0 | 8 | 0% |
| ratosh.Nobo 0.21 | 8 | 50% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 0% |

Hadur died in 293 of 350 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 97 | 33% | 113 |
| agd.Mooserwirt2 2.7 | 46 | 16% | 57 |
| ratosh.Nobo 0.21 | 35 | 12% | 37 |
| spinnercat.Robovirus 2.718 | 31 | 11% | 40 |
| uji.DBH 1.1 | 27 | 9% | 37 |
| sigterm.Sigterm 1.0 | 17 | 6% | 20 |
| stelo.WangRobot 1.0 | 17 | 6% | 18 |
| kawigi.mini.Fhqwhgads 1.1 | 16 | 5% | 19 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7 | 2% | 9 |

## Melee bench: F19

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.5 | 87 / 350 | 2.85 | 15.8% | 42098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.4 | 16.8% | 122 |
| hadur117.nano.SanaroS0 0.1 | 2.1 | 15.8% | 87 |
| mld.Infinity 2.2 | 2.5 | 15.4% | 105 |
| erdnis.Rover 0.3 | 4.5 | 10.7% | 16 |
| krillr.mini.JointStrike 2.0.0 | 4.6 | 11.2% | 7 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.7% | 5 |
| mbh.Mbh 0.1 | 7.4 | 7.2% | 0 |
| pac.ABC 2.1 | 7.6 | 7.3% | 8 |
| pbg.R2D2 1.0 | 8.9 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 81.0 | 10 / 35 | 4086 |
| 2 | 2 | 65.1 | 79.4 | 10 / 35 | 4111 |
| 3 | 1 | 67.1 | 86.0 | 12 / 35 | 4260 |
| 4 | 2 | 64.4 | 78.7 | 8 / 35 | 4135 |
| 5 | 2 | 65.0 | 80.6 | 6 / 35 | 4153 |
| 6 | 2 | 64.7 | 77.8 | 10 / 35 | 4134 |
| 7 | 2 | 65.6 | 79.7 | 7 / 35 | 4500 |
| 8 | 2 | 65.2 | 77.1 | 10 / 35 | 4310 |
| 9 | 3 | 65.6 | 80.0 | 9 / 35 | 4426 |
| 10 | 3 | 62.7 | 74.6 | 5 / 35 | 3983 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 91 | 48% |
| davidalves.net.DuelistMiniMelee 1.2 | 81 | 15% |
| krillr.mini.JointStrike 2.0.0 | 13 | 77% |
| pac.ABC 2.1 | 11 | 82% |
| erdnis.Rover 0.3 | 10 | 70% |
| patson.PatsonTestBot 1.0 | 4 | 50% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 121 | 46% | 180 |
| mld.Infinity 2.2 | 69 | 26% | 33 |
| erdnis.Rover 0.3 | 29 | 11% | 40 |
| patson.PatsonTestBot 1.0 | 16 | 6% | 28 |
| krillr.mini.JointStrike 2.0.0 | 12 | 5% | 31 |
| pac.ABC 2.1 | 7 | 3% | 15 |
| pbg.R2D2 1.0 | 6 | 2% | 13 |
| mbh.Mbh 0.1 | 3 | 1% | 8 |

## Melee bench: F20

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 68.2 | 53 / 350 | 3.86 | 13.5% | 36726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 18.2% | 164 |
| hadur117.nano.SanaroS0 0.1 | 2.3 | 13.5% | 53 |
| fwb.Nine 1.0.1 | 3.3 | 11.7% | 41 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.6% | 20 |
| catcat20.Rabbit 0.001 | 4.8 | 10.4% | 46 |
| m3thos.mini.Eva01 0.5.5 | 6.4 | 9.1% | 12 |
| djdjdj.NanoSkunk10 1.0 | 6.6 | 8.7% | 5 |
| bayen.nut.Squirrel 1.615 | 7.9 | 7.4% | 7 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 75.2 | 8 / 35 | 3723 |
| 2 | 2 | 59.4 | 67.6 | 4 / 35 | 3630 |
| 3 | 3 | 57.5 | 61.6 | 4 / 35 | 3538 |
| 4 | 2 | 59.6 | 64.8 | 6 / 35 | 3897 |
| 5 | 2 | 61.0 | 72.1 | 7 / 35 | 3616 |
| 6 | 4 | 56.6 | 59.4 | 3 / 35 | 3498 |
| 7 | 2 | 60.0 | 71.7 | 2 / 35 | 3404 |
| 8 | 2 | 60.4 | 70.8 | 5 / 35 | 3601 |
| 9 | 2 | 62.5 | 72.1 | 7 / 35 | 4223 |
| 10 | 2 | 59.9 | 67.0 | 7 / 35 | 3596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 66 | 38% |
| fwb.Nine 1.0.1 | 20 | 45% |
| catcat20.Rabbit 0.001 | 17 | 41% |
| nz.jdc.nano.GridFu 1.0 | 11 | 36% |
| m3thos.mini.Eva01 0.5.5 | 8 | 25% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 129 | 43% | 147 |
| catcat20.Rabbit 0.001 | 42 | 14% | 51 |
| nz.jdc.nano.GridFu 1.0 | 35 | 12% | 45 |
| fwb.Nine 1.0.1 | 31 | 10% | 33 |
| bayen.nut.Squirrel 1.615 | 18 | 6% | 21 |
| djdjdj.NanoSkunk10 1.0 | 17 | 6% | 19 |
| m3thos.mini.Eva01 0.5.5 | 16 | 5% | 19 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 2% | 9 |
| ntc.ControlledChaos 1.1.4 | 3 | 1% | 5 |

## Melee bench: F21

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 80.5 | 123 / 350 | 2.76 | 16.7% | 46915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.4 | 17.3% | 149 |
| hadur117.nano.SanaroS0 0.1 | 1.8 | 16.7% | 123 |
| dummy.mini.Scimitar 1.01 | 2.8 | 14.7% | 29 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 19 |
| eld.Hmm 1.0 | 5.5 | 8.6% | 20 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.6% | 6 |
| el.JumpShoot 0.2 | 7.5 | 6.5% | 4 |
| fire219.CatBot 1.0 | 7.7 | 6.5% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.3 | 13 / 35 | 5029 |
| 2 | 2 | 65.9 | 79.0 | 14 / 35 | 4712 |
| 3 | 2 | 68.5 | 87.0 | 14 / 35 | 5096 |
| 4 | 2 | 65.2 | 81.9 | 12 / 35 | 3952 |
| 5 | 2 | 66.0 | 81.3 | 9 / 35 | 4805 |
| 6 | 3 | 62.7 | 71.7 | 7 / 35 | 4430 |
| 7 | 2 | 63.9 | 75.6 | 12 / 35 | 4385 |
| 8 | 1 | 67.0 | 84.4 | 16 / 35 | 4629 |
| 9 | 1 | 67.3 | 83.2 | 17 / 35 | 4871 |
| 10 | 2 | 66.4 | 79.4 | 9 / 35 | 5006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 129 | 54% |
| dummy.mini.Scimitar 1.01 | 40 | 80% |
| cf.RiO.RiOx 4.2.1 | 20 | 55% |
| oa.weak.BotherBot 0.1 | 8 | 63% |
| eld.Hmm 1.0 | 8 | 50% |
| el.JumpShoot 0.2 | 1 | 0% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 227 of 350 rounds, at a mean tick of 1076. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 93 | 41% | 136 |
| dummy.mini.Scimitar 1.01 | 52 | 23% | 97 |
| cf.RiO.RiOx 4.2.1 | 43 | 19% | 60 |
| oa.weak.BotherBot 0.1 | 15 | 7% | 21 |
| el.JumpShoot 0.2 | 8 | 4% | 8 |
| fire219.CatBot 1.0 | 8 | 4% | 8 |
| eld.Hmm 1.0 | 6 | 3% | 17 |
| arthord.MannyPacquiao Beta | 1 | 0% | 2 |
| PSW.Relentless 0.1 | 1 | 0% | 1 |

## Melee bench: F23

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 77.3 | 78 / 350 | 3.04 | 14.9% | 36478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.4% | 151 |
| cre.Karolos 0.32 | 2.5 | 14.5% | 58 |
| hadur117.nano.SanaroS0 0.1 | 2.6 | 14.9% | 78 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 11.3% | 29 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.1 | 9.4% | 4 |
| stelo.RamTrackSurfer 1.2 | 6.1 | 9.2% | 11 |
| sample.Walls 1.0 | 6.2 | 9.0% | 18 |
| cw.megas.Blade 0.8 | 7.4 | 8.3% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 71.7 | 9 / 35 | 3501 |
| 2 | 2 | 66.5 | 86.7 | 10 / 35 | 3964 |
| 3 | 3 | 61.6 | 71.7 | 5 / 35 | 3444 |
| 4 | 3 | 64.4 | 77.8 | 10 / 35 | 3642 |
| 5 | 3 | 62.4 | 71.1 | 6 / 35 | 3680 |
| 6 | 2 | 66.2 | 83.2 | 9 / 35 | 4035 |
| 7 | 3 | 64.5 | 79.0 | 7 / 35 | 3641 |
| 8 | 3 | 62.5 | 74.9 | 6 / 35 | 3541 |
| 9 | 3 | 63.5 | 74.9 | 6 / 35 | 3731 |
| 10 | 2 | 64.6 | 81.9 | 10 / 35 | 3299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 80 | 39% |
| cre.Karolos 0.32 | 36 | 36% |
| sample.Walls 1.0 | 27 | 70% |
| stelo.AreaTargetingBot 1.1 | 21 | 29% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 71% |
| stelo.RamTrackSurfer 1.2 | 4 | 25% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 272 of 350 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 105 | 39% | 145 |
| cre.Karolos 0.32 | 70 | 26% | 80 |
| stelo.AreaTargetingBot 1.1 | 48 | 18% | 52 |
| sample.Walls 1.0 | 18 | 7% | 24 |
| cw.megas.Blade 0.8 | 11 | 4% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 3% | 18 |
| stelo.RamTrackSurfer 1.2 | 9 | 3% | 14 |
| rrh.Iwillfindyou 2.0 | 2 | 1% | 4 |

## Melee bench: F24

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.1 | 56.7 | 47 / 350 | 4.90 | 10.9% | 26882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.3 | 14.9% | 90 |
| davidalves.Phoenix 0.54 | 2.4 | 13.6% | 83 |
| florent.XSeries.X2 0.12 | 2.7 | 13.3% | 58 |
| pedersen.Ugluk 1.1.1 | 3.9 | 12.0% | 36 |
| hadur117.nano.SanaroS0 0.1 | 5.1 | 10.9% | 47 |
| oog.melee.Corsair 1.0 | 6.2 | 9.6% | 7 |
| stelo.SoJNanoMelee 1.1 | 6.4 | 9.2% | 26 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.6% | 4 |
| as.FrankTheTank 1.3 | 9.4 | 5.1% | 0 |
| evd.X1 0.01 | 9.6 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.7 | 58.1 | 5 / 35 | 2737 |
| 2 | 5 | 53.6 | 54.3 | 4 / 35 | 2800 |
| 3 | 6 | 51.4 | 49.5 | 5 / 35 | 2698 |
| 4 | 5 | 54.1 | 56.8 | 5 / 35 | 2728 |
| 5 | 5 | 55.5 | 59.7 | 4 / 35 | 2821 |
| 6 | 6 | 52.0 | 53.3 | 2 / 35 | 2632 |
| 7 | 4 | 56.6 | 62.5 | 9 / 35 | 2591 |
| 8 | 6 | 50.2 | 50.5 | 1 / 35 | 2153 |
| 9 | 4 | 55.3 | 58.1 | 7 / 35 | 2595 |
| 10 | 5 | 57.3 | 64.1 | 5 / 35 | 3127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 31 | 45% |
| florent.XSeries.X2 0.12 | 18 | 78% |
| stelo.SoJNanoMelee 1.1 | 14 | 14% |
| davidalves.Phoenix 0.54 | 13 | 77% |
| pedersen.Ugluk 1.1.1 | 9 | 56% |
| oog.melee.Corsair 1.0 | 2 | 50% |
| lunchie.Lunchbox 0.93 | 1 | 0% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 66 | 22% | 78 |
| florent.XSeries.X2 0.12 | 62 | 20% | 71 |
| pedersen.Ugluk 1.1.1 | 44 | 14% | 50 |
| stelo.SoJNanoMelee 1.1 | 41 | 13% | 43 |
| davidalves.Phoenix 0.54 | 40 | 13% | 47 |
| oog.melee.Corsair 1.0 | 29 | 9% | 35 |
| lunchie.Lunchbox 0.93 | 13 | 4% | 16 |
| evd.X1 0.01 | 8 | 3% | 8 |
| as.FrankTheTank 1.3 | 1 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 64.0 | 41 / 350 | 4.24 | 12.3% | 28779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.3 | 14.6% | 80 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.5% | 69 |
| jdw.Hurricane 1.4 | 2.9 | 13.2% | 76 |
| hadur117.nano.SanaroS0 0.1 | 3.6 | 12.3% | 41 |
| gre.svman4.Morfeas 1.4.1 | 5.1 | 10.9% | 38 |
| ds.Oo 2.2 | 6.5 | 8.9% | 21 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.4% | 16 |
| awesomeness.Elite 1.0 | 8.1 | 7.2% | 7 |
| adt.Ar2 1.1 | 8.5 | 6.7% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 53.9 | 55.9 | 4 / 35 | 2639 |
| 2 | 3 | 57.8 | 64.8 | 2 / 35 | 3263 |
| 3 | 4 | 56.8 | 63.5 | 2 / 35 | 2898 |
| 4 | 3 | 59.8 | 71.7 | 3 / 35 | 3000 |
| 5 | 3 | 59.9 | 70.2 | 5 / 35 | 3232 |
| 6 | 4 | 54.7 | 59.4 | 5 / 35 | 2402 |
| 7 | 3 | 56.7 | 62.5 | 5 / 35 | 2843 |
| 8 | 4 | 58.3 | 62.9 | 7 / 35 | 3261 |
| 9 | 4 | 57.8 | 66.3 | 6 / 35 | 2654 |
| 10 | 4 | 55.7 | 62.5 | 2 / 35 | 2587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 35 | 23% |
| voidious.micro.BlitzBat 1.05 | 28 | 11% |
| jdw.Hurricane 1.4 | 26 | 62% |
| gre.svman4.Morfeas 1.4.1 | 12 | 50% |
| ds.Oo 2.2 | 8 | 38% |
| awesomeness.Elite 1.0 | 5 | 40% |
| gjr.Cephalosporin 0.1 | 5 | 60% |

Hadur died in 309 of 350 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 79 | 26% | 88 |
| voidious.micro.BlitzBat 1.05 | 73 | 24% | 78 |
| jdw.Hurricane 1.4 | 44 | 14% | 58 |
| gre.svman4.Morfeas 1.4.1 | 30 | 10% | 33 |
| gjr.Cephalosporin 0.1 | 26 | 8% | 30 |
| ds.Oo 2.2 | 23 | 7% | 26 |
| adt.Ar2 1.1 | 13 | 4% | 13 |
| awesomeness.Elite 1.0 | 12 | 4% | 14 |
| amk.ChumbaMini 0.2 | 9 | 3% | 9 |

## Melee bench: F26

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 68.9 | 46 / 350 | 3.80 | 13.2% | 37497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.1 | 16.4% | 139 |
| hadur117.nano.SanaroS0 0.1 | 2.9 | 13.2% | 46 |
| shu.nitro.LENIN .T34 | 3.0 | 13.1% | 76 |
| lrem.Spectre 0.4.4 | 3.3 | 12.8% | 47 |
| js.PinBall 1.6 | 5.4 | 10.9% | 13 |
| gh.mini.GrubbmOne 1.0 | 5.7 | 10.4% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.0% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 7.9 | 7.1% | 11 |
| sample.SpinBot 1.0 | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 73.3 | 5 / 35 | 3660 |
| 2 | 4 | 57.9 | 66.3 | 2 / 35 | 3301 |
| 3 | 3 | 59.2 | 66.0 | 3 / 35 | 3635 |
| 4 | 3 | 59.7 | 66.3 | 5 / 35 | 3884 |
| 5 | 2 | 59.7 | 66.3 | 4 / 35 | 3839 |
| 6 | 2 | 63.1 | 76.2 | 7 / 35 | 4164 |
| 7 | 4 | 58.9 | 65.1 | 3 / 35 | 3668 |
| 8 | 3 | 60.5 | 70.2 | 4 / 35 | 3736 |
| 9 | 4 | 60.1 | 71.4 | 3 / 35 | 3495 |
| 10 | 2 | 60.9 | 67.9 | 10 / 35 | 4115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 47 | 23% |
| shu.nitro.LENIN .T34 | 35 | 37% |
| lrem.Spectre 0.4.4 | 32 | 34% |
| gh.mini.GrubbmOne 1.0 | 10 | 40% |
| js.PinBall 1.6 | 6 | 33% |
| jaybot.adv.bots.JayBot 2.0 | 4 | 75% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 50% |

Hadur died in 304 of 350 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 92 | 30% | 107 |
| shu.nitro.LENIN .T34 | 62 | 20% | 74 |
| lrem.Spectre 0.4.4 | 50 | 16% | 57 |
| gh.mini.GrubbmOne 1.0 | 37 | 12% | 42 |
| js.PinBall 1.6 | 27 | 9% | 29 |
| jaybot.adv.bots.JayBot 2.0 | 23 | 8% | 25 |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 3% | 12 |
| sample.SpinBot 1.0 | 4 | 1% | 4 |

## Melee bench: F27

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 66.5 | 63 / 350 | 4.01 | 13.1% | 33421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.7 | 15.1% | 143 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 13.1% | 63 |
| sheldor.melee.nano.TestMelee 0.1 | 3.3 | 12.1% | 40 |
| wee.Gem 1.8.4 | 3.8 | 11.7% | 57 |
| EH.Eagle 1.0.6 | 4.5 | 10.5% | 26 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.3% | 11 |
| joe.ADinosaur 1.0 | 7.1 | 8.8% | 5 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.3% | 6 |
| caimano.Furia_Ceca 0.22 | 8.9 | 7.1% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.4 | 45.7 | 4 / 35 | 4002 |
| 2 | 1 | 59.0 | 68.3 | 7 / 35 | 3347 |
| 3 | 3 | 58.8 | 69.8 | 6 / 35 | 3022 |
| 4 | 2 | 59.8 | 71.1 | 10 / 35 | 2742 |
| 5 | 3 | 58.4 | 67.3 | 7 / 35 | 3020 |
| 6 | 5 | 51.8 | 42.5 | 1 / 35 | 3904 |
| 7 | 1 | 61.8 | 74.6 | 6 / 35 | 3820 |
| 8 | 3 | 60.1 | 72.7 | 6 / 35 | 3137 |
| 9 | 2 | 61.8 | 76.8 | 8 / 35 | 3334 |
| 10 | 2 | 61.6 | 76.5 | 8 / 35 | 3093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 57 | 44% |
| wee.Gem 1.8.4 | 31 | 29% |
| EH.Eagle 1.0.6 | 25 | 64% |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 33% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 55% |
| throxbot.ThroxBot 0.1 | 2 | 50% |

Hadur died in 289 of 350 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 93 | 32% | 117 |
| wee.Gem 1.8.4 | 43 | 15% | 54 |
| sheldor.melee.nano.TestMelee 0.1 | 41 | 14% | 46 |
| EH.Eagle 1.0.6 | 27 | 9% | 43 |
| joe.ADinosaur 1.0 | 23 | 8% | 24 |
| caimano.Furia_Ceca 0.22 | 17 | 6% | 16 |
| throxbot.ThroxBot 0.1 | 16 | 6% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 14 | 5% | 19 |
| cs.Grudge 1.0 | 14 | 5% | 15 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 76.4 | 105 / 350 | 3.12 | 15.2% | 36556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.2 | 16.3% | 119 |
| hadur117.nano.SanaroS0 0.1 | 1.8 | 15.2% | 105 |
| uji.Antique 1.0 | 3.1 | 13.0% | 75 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.5% | 18 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.4% | 13 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.4% | 11 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.2% | 8 |
| matt.advanced.Katana 1.0 | 8.3 | 6.6% | 3 |
| stelo.PianistNano 1.2 | 9.1 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 78.4 | 8 / 35 | 3913 |
| 2 | 1 | 64.8 | 80.0 | 15 / 35 | 3886 |
| 3 | 1 | 63.9 | 80.6 | 13 / 35 | 3719 |
| 4 | 2 | 59.8 | 68.3 | 9 / 35 | 3518 |
| 5 | 2 | 61.7 | 72.4 | 10 / 35 | 3771 |
| 6 | 2 | 63.7 | 82.9 | 12 / 35 | 3416 |
| 7 | 2 | 62.4 | 75.6 | 6 / 35 | 3706 |
| 8 | 2 | 63.4 | 79.0 | 12 / 35 | 3435 |
| 9 | 2 | 62.2 | 73.7 | 11 / 35 | 3496 |
| 10 | 2 | 62.1 | 73.7 | 9 / 35 | 3696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 99 | 52% |
| uji.Antique 1.0 | 51 | 45% |
| qohnil.blot.BlotBot 3.61 | 12 | 67% |
| pfvicm.Sobieski 7.2.3b | 11 | 82% |
| ahr.ice.Ice 1.0.2 | 6 | 50% |
| amk.ChumbaWumba 0.3 | 6 | 100% |
| matt.advanced.Katana 1.0 | 4 | 100% |

Hadur died in 247 of 350 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 109 | 44% | 152 |
| uji.Antique 1.0 | 56 | 23% | 79 |
| pfvicm.Sobieski 7.2.3b | 29 | 12% | 38 |
| amk.ChumbaWumba 0.3 | 17 | 7% | 21 |
| qohnil.blot.BlotBot 3.61 | 13 | 5% | 21 |
| ahr.ice.Ice 1.0.2 | 7 | 3% | 14 |
| matt.advanced.Katana 1.0 | 6 | 2% | 11 |
| stelo.Lifestealer 1.0 | 5 | 2% | 6 |
| stelo.PianistNano 1.2 | 4 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 63.1 | 57 / 350 | 4.32 | 12.8% | 33732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.4 | 15.5% | 94 |
| zyx.mega.YersiniaPestis 3.1 | 1.7 | 15.3% | 105 |
| myl.micro.Troodon 1.10 | 3.4 | 13.0% | 23 |
| hadur117.nano.SanaroS0 0.1 | 3.8 | 12.8% | 57 |
| jok.PheonixM 0.1.2 | 4.7 | 11.8% | 35 |
| DBall.Anarchy 0.1 | 6.3 | 8.7% | 31 |
| ph.melee.ArcherME 0.3 | 6.7 | 8.3% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.5 | 5.4% | 0 |
| ap.Frederick 1.1 | 9.1 | 4.7% | 4 |
| jangs.ns51 1.0 | 9.4 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.8 | 59.7 | 4 / 35 | 3590 |
| 2 | 4 | 58.7 | 62.9 | 6 / 35 | 3095 |
| 3 | 4 | 58.3 | 61.6 | 7 / 35 | 3198 |
| 4 | 3 | 59.0 | 65.4 | 2 / 35 | 3408 |
| 5 | 5 | 58.8 | 61.9 | 3 / 35 | 3560 |
| 6 | 3 | 58.3 | 59.0 | 7 / 35 | 3451 |
| 7 | 4 | 59.6 | 64.4 | 8 / 35 | 3281 |
| 8 | 2 | 62.2 | 70.8 | 10 / 35 | 3607 |
| 9 | 5 | 58.1 | 62.2 | 4 / 35 | 3138 |
| 10 | 4 | 58.8 | 62.9 | 6 / 35 | 3404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 22% |
| zyx.mega.YersiniaPestis 3.1 | 36 | 50% |
| myl.micro.Troodon 1.10 | 20 | 70% |
| jok.PheonixM 0.1.2 | 13 | 69% |
| DBall.Anarchy 0.1 | 10 | 40% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 101 | 34% | 109 |
| zyx.mega.YersiniaPestis 3.1 | 63 | 21% | 81 |
| jok.PheonixM 0.1.2 | 49 | 17% | 59 |
| myl.micro.Troodon 1.10 | 37 | 13% | 50 |
| DBall.Anarchy 0.1 | 16 | 5% | 23 |
| ph.melee.ArcherME 0.3 | 15 | 5% | 15 |
| fullsail.TimbotNoPrediction 1.0 | 8 | 3% | 8 |
| jangs.ns51 1.0 | 5 | 2% | 5 |

## Melee bench: F30

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.6 | 55.7 | 17 / 350 | 4.99 | 10.5% | 27862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.1 | 14.3% | 99 |
| oog.melee.Capulet 1.2 | 2.3 | 13.7% | 63 |
| stelo.PastFuture 2.3.2 | 2.6 | 13.3% | 51 |
| darkcanuck.B26354 1.06 | 3.0 | 13.6% | 86 |
| hadur117.nano.SanaroS0 0.1 | 5.3 | 10.5% | 17 |
| intruder.PrairieWolf 2.61 | 5.8 | 9.7% | 20 |
| ntc.Opposite 1.5 | 7.7 | 7.7% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.6% | 9 |
| tripphippy.Alice 1.1 | 8.4 | 6.9% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.2 | 54.6 | 2 / 35 | 2756 |
| 2 | 5 | 53.0 | 53.7 | 3 / 35 | 2804 |
| 3 | 5 | 54.1 | 58.1 | 0 / 35 | 2817 |
| 4 | 5 | 56.6 | 61.9 | 4 / 35 | 3027 |
| 5 | 5 | 54.5 | 55.9 | 0 / 35 | 3046 |
| 6 | 6 | 51.0 | 50.8 | 1 / 35 | 2512 |
| 7 | 6 | 53.0 | 54.9 | 1 / 35 | 2669 |
| 8 | 5 | 53.5 | 53.3 | 1 / 35 | 2830 |
| 9 | 6 | 52.7 | 52.7 | 1 / 35 | 2887 |
| 10 | 5 | 54.9 | 61.0 | 4 / 35 | 2514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 22 | 18% |
| darkcanuck.B26354 1.06 | 17 | 29% |
| oog.melee.Capulet 1.2 | 13 | 23% |
| intruder.PrairieWolf 2.61 | 7 | 43% |
| stelo.PastFuture 2.3.2 | 6 | 33% |
| tripphippy.Alice 1.1 | 2 | 0% |

Hadur died in 333 of 350 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 72 | 22% | 76 |
| catcat20.Matcha 0.006 | 70 | 21% | 73 |
| oog.melee.Capulet 1.2 | 62 | 19% | 64 |
| darkcanuck.B26354 1.06 | 46 | 14% | 50 |
| intruder.PrairieWolf 2.61 | 26 | 8% | 29 |
| ntc.Opposite 1.5 | 22 | 7% | 22 |
| tripphippy.Alice 1.1 | 17 | 5% | 18 |
| fowl3628800.LightningBolt 2.6.0 | 15 | 5% | 15 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.2 | 57.9 | 23 / 350 | 4.79 | 11.1% | 28426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.6% | 188 |
| gh.mini.Griezel 0.2 | 2.2 | 14.0% | 71 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 12.4% | 32 |
| d414.nano.Quantum 1.0.0 | 3.9 | 11.9% | 27 |
| hadur117.nano.SanaroS0 0.1 | 4.5 | 11.1% | 23 |
| gh.nano.Grofvuil 0.2 | 6.1 | 8.8% | 8 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.6% | 2 |
| fm.mammillarias 1.3 | 7.8 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.4 | 60.0 | 2 / 35 | 2897 |
| 2 | 5 | 54.7 | 55.2 | 3 / 35 | 2770 |
| 3 | 5 | 53.4 | 54.9 | 0 / 35 | 2711 |
| 4 | 5 | 55.3 | 58.4 | 2 / 35 | 2834 |
| 5 | 3 | 58.9 | 66.7 | 5 / 35 | 3195 |
| 6 | 5 | 55.2 | 57.5 | 2 / 35 | 2875 |
| 7 | 3 | 55.6 | 60.0 | 2 / 35 | 2793 |
| 8 | 5 | 55.6 | 58.1 | 3 / 35 | 2937 |
| 9 | 5 | 52.8 | 54.3 | 2 / 35 | 2629 |
| 10 | 5 | 53.6 | 54.0 | 2 / 35 | 2785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 43 | 35% |
| gh.mini.Griezel 0.2 | 30 | 17% |
| d414.nano.Quantum 1.0.0 | 12 | 17% |
| spinnercat.micro.Tyger 0.1 | 8 | 13% |

Hadur died in 327 of 350 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 90 | 28% | 96 |
| abc.Shadow 3.84i | 78 | 24% | 91 |
| spinnercat.micro.Tyger 0.1 | 59 | 18% | 59 |
| d414.nano.Quantum 1.0.0 | 36 | 11% | 39 |
| fm.mammillarias 1.3 | 24 | 7% | 24 |
| gh.nano.Grofvuil 0.2 | 20 | 6% | 20 |
| timmit.nano.TimDog 0.33 | 9 | 3% | 9 |
| tlp.ThreeLeggedPig 1 | 6 | 2% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 5 |

## Melee bench: F32

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 74.1 | 96 / 350 | 3.33 | 14.5% | 35314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.3% | 113 |
| hadur117.nano.SanaroS0 0.1 | 1.8 | 14.5% | 96 |
| apc.botM 3.0 | 2.9 | 13.0% | 65 |
| lxx.ConceptA 0.8 | 4.3 | 11.1% | 10 |
| vjik.UnViolation 1.1 | 4.6 | 10.7% | 32 |
| bayen.UbaMicro 1.4 | 6.0 | 9.1% | 10 |
| panzer.Panzer 0.2 | 7.6 | 7.5% | 2 |
| yk.JahMicro 1.0 | 8.1 | 6.8% | 10 |
| conscience.Electron 1.3g | 8.7 | 6.5% | 4 |
| donjezza.Jezza 1.0 | 9.6 | 5.6% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 75.9 | 9 / 35 | 3522 |
| 2 | 3 | 60.4 | 72.7 | 9 / 35 | 3271 |
| 3 | 2 | 59.7 | 69.5 | 7 / 35 | 3545 |
| 4 | 2 | 60.7 | 73.0 | 11 / 35 | 3223 |
| 5 | 1 | 60.6 | 74.3 | 6 / 35 | 3624 |
| 6 | 1 | 62.9 | 77.8 | 13 / 35 | 3674 |
| 7 | 1 | 63.0 | 76.5 | 13 / 35 | 3819 |
| 8 | 2 | 59.7 | 72.7 | 5 / 35 | 3153 |
| 9 | 2 | 61.1 | 68.9 | 12 / 35 | 3844 |
| 10 | 2 | 63.3 | 79.7 | 11 / 35 | 3639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 71 | 41% |
| apc.botM 3.0 | 38 | 68% |
| lxx.ConceptA 0.8 | 21 | 90% |
| vjik.UnViolation 1.1 | 21 | 43% |
| donjezza.Jezza 1.0 | 7 | 43% |
| yk.JahMicro 1.0 | 7 | 43% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| panzer.Panzer 0.2 | 2 | 50% |

Hadur died in 256 of 350 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 79 | 31% | 112 |
| lxx.ConceptA 0.8 | 50 | 20% | 60 |
| apc.botM 3.0 | 43 | 17% | 75 |
| vjik.UnViolation 1.1 | 23 | 9% | 36 |
| bayen.UbaMicro 1.4 | 19 | 7% | 23 |
| panzer.Panzer 0.2 | 12 | 5% | 13 |
| yk.JahMicro 1.0 | 12 | 5% | 12 |
| conscience.Electron 1.3g | 12 | 5% | 11 |
| donjezza.Jezza 1.0 | 6 | 2% | 8 |

## Melee bench: F33

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 67.4 | 58 / 350 | 3.93 | 13.6% | 36996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.3% | 124 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 13.8% | 62 |
| hadur117.nano.SanaroS0 0.1 | 2.8 | 13.6% | 58 |
| labg.Cataclysm 2.05 | 4.4 | 11.2% | 54 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.0% | 36 |
| baal.nano.N 1.42 | 6.0 | 9.5% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.9 | 8.2% | 10 |
| zyx.micro.Ant 1.1 | 8.8 | 5.3% | 0 |
| sanja.First 0.1 | 8.8 | 5.3% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.4 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 71.1 | 5 / 35 | 3891 |
| 2 | 3 | 59.4 | 64.1 | 5 / 35 | 3465 |
| 3 | 4 | 58.5 | 61.0 | 2 / 35 | 3640 |
| 4 | 3 | 59.9 | 65.7 | 8 / 35 | 3644 |
| 5 | 3 | 58.1 | 63.5 | 3 / 35 | 3448 |
| 6 | 2 | 61.7 | 70.5 | 9 / 35 | 4008 |
| 7 | 3 | 57.9 | 62.2 | 3 / 35 | 3504 |
| 8 | 3 | 62.5 | 73.7 | 5 / 35 | 3877 |
| 9 | 3 | 60.3 | 68.3 | 8 / 35 | 3357 |
| 10 | 2 | 63.4 | 74.3 | 10 / 35 | 4162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 46% |
| maribo.Quester 0.3 | 44 | 27% |
| labg.Cataclysm 2.05 | 18 | 22% |
| gre.svman4.Leonidas 1.3.2 | 15 | 53% |
| baal.nano.N 1.42 | 7 | 86% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 97 | 33% | 111 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 69 | 24% | 93 |
| gre.svman4.Leonidas 1.3.2 | 44 | 15% | 49 |
| labg.Cataclysm 2.05 | 32 | 11% | 36 |
| kinsen.melee.Angsaichmophobia 1.8c | 19 | 7% | 20 |
| baal.nano.N 1.42 | 12 | 4% | 18 |
| zyx.micro.Ant 1.1 | 10 | 3% | 12 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 5 | 2% | 5 |
| sanja.First 0.1 | 4 | 1% | 6 |

## Melee bench: F34

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 70.1 | 48 / 350 | 3.69 | 13.8% | 39617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.4 | 17.4% | 140 |
| kid.Gladiator .7.2 | 1.6 | 17.5% | 121 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 13.8% | 48 |
| jcs.Seth 1.8 | 4.3 | 11.3% | 29 |
| tcf.Reach 3 | 4.8 | 10.9% | 10 |
| cli.Dancer 1.1 | 6.0 | 9.5% | 2 |
| ratosh.Wesco 1.4 | 6.9 | 7.5% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 66.7 | 4 / 35 | 3974 |
| 2 | 3 | 62.8 | 74.3 | 6 / 35 | 3843 |
| 3 | 3 | 59.2 | 61.0 | 4 / 35 | 3946 |
| 4 | 3 | 62.5 | 71.7 | 7 / 35 | 3896 |
| 5 | 3 | 59.3 | 61.6 | 3 / 35 | 3927 |
| 6 | 3 | 63.6 | 77.1 | 6 / 35 | 3951 |
| 7 | 3 | 63.8 | 75.2 | 7 / 35 | 4177 |
| 8 | 3 | 64.3 | 77.5 | 3 / 35 | 4360 |
| 9 | 3 | 61.8 | 70.5 | 6 / 35 | 3901 |
| 10 | 3 | 59.6 | 65.7 | 2 / 35 | 3642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 68 | 50% |
| kid.Gladiator .7.2 | 54 | 6% |
| jcs.Seth 1.8 | 19 | 53% |
| tcf.Reach 3 | 3 | 0% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 303 of 350 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 143 | 47% | 148 |
| stelo.Spread 0.9 | 81 | 27% | 109 |
| jcs.Seth 1.8 | 27 | 9% | 38 |
| tcf.Reach 3 | 21 | 7% | 23 |
| ratosh.Wesco 1.4 | 14 | 5% | 15 |
| cli.Dancer 1.1 | 8 | 3% | 9 |
| amk.Punbot.Punbot 0.01 | 5 | 2% | 5 |
| sample.RamFire 1.0 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 68.3 | 12 / 350 | 3.85 | 12.4% | 27727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 276 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.5% | 33 |
| hadur117.nano.SanaroS0 0.1 | 3.7 | 12.4% | 12 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.2% | 22 |
| rz.HawkOnFire 0.1 | 4.0 | 12.3% | 6 |
| myl.nano.KomoriNinja 1.1 | 6.1 | 7.3% | 0 |
| wit.Chuliath 1.0 | 7.0 | 6.5% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.9 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 67.9 | 1 / 35 | 3044 |
| 2 | 4 | 59.1 | 69.8 | 0 / 35 | 2849 |
| 3 | 3 | 59.2 | 70.5 | 2 / 35 | 2711 |
| 4 | 5 | 58.5 | 68.3 | 2 / 35 | 2615 |
| 5 | 3 | 59.6 | 71.4 | 1 / 35 | 2799 |
| 6 | 5 | 57.8 | 66.0 | 1 / 35 | 2694 |
| 7 | 2 | 60.0 | 73.0 | 2 / 35 | 2882 |
| 8 | 4 | 58.2 | 68.9 | 1 / 35 | 2695 |
| 9 | 4 | 56.7 | 63.5 | 0 / 35 | 2634 |
| 10 | 4 | 57.1 | 63.8 | 2 / 35 | 2804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 84 | 4% |
| gh.mini.Gruwel 0.9 | 18 | 11% |
| rz.HawkOnFire 0.1 | 10 | 60% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 14% |

Hadur died in 338 of 350 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 148 | 44% | 152 |
| gh.mini.Gruwel 0.9 | 69 | 20% | 72 |
| rz.HawkOnFire 0.1 | 54 | 16% | 58 |
| dmh.robocode.robot.BlackDeath 9.2 | 46 | 14% | 47 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 2% | 6 |
| myl.nano.KomoriNinja 1.1 | 4 | 1% | 4 |
| wit.Chuliath 1.0 | 4 | 1% | 4 |
| dans.Cinnamon 1.2 | 4 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 3 |

## Melee bench: F36

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 68.6 | 90 / 350 | 3.82 | 13.9% | 35723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.6 | 13.9% | 90 |
| bzdp.Pansy 2.1 | 2.5 | 13.1% | 68 |
| alpha.RainingFire 1.0 | 3.2 | 12.5% | 51 |
| mz.Cork 0.1 | 4.0 | 11.7% | 39 |
| bvh.micro.Freya 0.3 | 4.1 | 11.7% | 48 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.6% | 13 |
| m3thos.Eva02 0.7.1 | 6.4 | 9.7% | 18 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 10 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.4% | 5 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.5% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 66.3 | 8 / 35 | 3811 |
| 2 | 1 | 60.2 | 69.2 | 6 / 35 | 3547 |
| 3 | 2 | 59.8 | 67.9 | 6 / 35 | 3670 |
| 4 | 1 | 60.7 | 68.6 | 13 / 35 | 3428 |
| 5 | 1 | 60.1 | 68.6 | 8 / 35 | 3571 |
| 6 | 2 | 59.6 | 69.2 | 8 / 35 | 3206 |
| 7 | 2 | 60.7 | 67.6 | 9 / 35 | 3821 |
| 8 | 1 | 62.5 | 74.0 | 13 / 35 | 3664 |
| 9 | 3 | 58.6 | 64.4 | 8 / 35 | 3291 |
| 10 | 1 | 61.2 | 70.5 | 11 / 35 | 3714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 32 | 47% |
| mz.Cork 0.1 | 32 | 81% |
| bvh.micro.Freya 0.3 | 25 | 60% |
| alpha.RainingFire 1.0 | 21 | 71% |
| bvh.mini.Fenrir 0.39 | 12 | 100% |
| m3thos.Eva02 0.7.1 | 10 | 50% |
| sample.MyFirstRobot 1.0 | 10 | 10% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |
| dl.BetterWalls 1.0 | 2 | 0% |

Hadur died in 261 of 350 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 60 | 23% | 81 |
| alpha.RainingFire 1.0 | 48 | 18% | 58 |
| bvh.micro.Freya 0.3 | 36 | 14% | 44 |
| m3thos.Eva02 0.7.1 | 35 | 13% | 45 |
| bvh.mini.Fenrir 0.39 | 32 | 12% | 35 |
| mz.Cork 0.1 | 21 | 8% | 54 |
| dl.BetterWalls 1.0 | 11 | 4% | 13 |
| sample.MyFirstRobot 1.0 | 10 | 4% | 12 |
| squidM.TentalceMeleeNano 1.1 | 8 | 3% | 8 |

## Melee bench: F37

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 75.4 | 95 / 350 | 3.22 | 14.8% | 43164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.0 | 14.8% | 95 |
| germ.TheMind .2 | 2.9 | 11.8% | 66 |
| EBBU.Sim2 1.02 | 3.9 | 10.3% | 22 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 10.5% | 27 |
| agrach.Dalek 1.0 | 4.9 | 9.9% | 40 |
| mb.Beast 0.1 | 6.6 | 9.1% | 31 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.8% | 29 |
| lmk.ACPFinal 0.1 | 7.3 | 8.8% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 8.2% | 0 |
| skm.Ryubot 1.0 | 9.1 | 7.7% | 22 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 78.7 | 13 / 35 | 4350 |
| 2 | 1 | 61.8 | 75.2 | 12 / 35 | 4476 |
| 3 | 1 | 61.4 | 76.8 | 7 / 35 | 4449 |
| 4 | 1 | 63.3 | 81.9 | 10 / 35 | 4571 |
| 5 | 1 | 60.8 | 75.2 | 5 / 35 | 4614 |
| 6 | 1 | 62.0 | 76.5 | 9 / 35 | 4554 |
| 7 | 1 | 63.1 | 81.6 | 10 / 35 | 4464 |
| 8 | 1 | 60.3 | 71.1 | 11 / 35 | 4185 |
| 9 | 1 | 57.3 | 67.0 | 7 / 35 | 3614 |
| 10 | 1 | 59.1 | 69.5 | 11 / 35 | 3887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 42 | 33% |
| agrach.Dalek 1.0 | 25 | 48% |
| EBBU.Sim2 1.02 | 24 | 58% |
| mb.Beast 0.1 | 23 | 78% |
| skm.Ryubot 1.0 | 23 | 43% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 55% |
| stelo.UntouchableNano 1.3 | 16 | 56% |
| lmk.ACPFinal 0.1 | 12 | 58% |

Hadur died in 258 of 350 rounds, at a mean tick of 547. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 58 | 22% | 64 |
| com.syncleus.robocode.Dreadnaught 0.1 | 40 | 16% | 55 |
| agrach.Dalek 1.0 | 40 | 16% | 55 |
| EBBU.Sim2 1.02 | 28 | 11% | 40 |
| lmk.ACPFinal 0.1 | 22 | 9% | 30 |
| mb.Beast 0.1 | 21 | 8% | 40 |
| skm.Ryubot 1.0 | 18 | 7% | 22 |
| stelo.UntouchableNano 1.3 | 17 | 7% | 28 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 5% | 16 |

## Melee bench: F38

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 63.7 | 35 / 350 | 4.27 | 11.9% | 29306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.0% | 163 |
| bvh.mini.Freya 0.55 | 2.3 | 13.4% | 40 |
| hadur117.nano.SanaroS0 0.1 | 3.4 | 11.9% | 35 |
| cs.Wren 1.0 | 4.4 | 11.5% | 24 |
| bts.mega.Gnarly 1.4 | 4.8 | 11.0% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 10.6% | 16 |
| kdf.KoulDestroyer 1.0 | 6.6 | 9.5% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.9% | 13 |
| bzdp.BoxCar 2.0 | 9.4 | 4.1% | 0 |
| matt.UnderDark3 2.4.34 | 9.6 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 67.9 | 7 / 35 | 3285 |
| 2 | 2 | 56.9 | 64.1 | 5 / 35 | 2869 |
| 3 | 3 | 57.7 | 66.7 | 3 / 35 | 2866 |
| 4 | 3 | 57.3 | 63.5 | 6 / 35 | 2907 |
| 5 | 3 | 55.5 | 62.5 | 3 / 35 | 2750 |
| 6 | 3 | 57.5 | 66.7 | 1 / 35 | 2899 |
| 7 | 3 | 59.6 | 69.8 | 8 / 35 | 2891 |
| 8 | 4 | 56.6 | 61.0 | 1 / 35 | 3208 |
| 9 | 6 | 53.0 | 55.2 | 1 / 35 | 2566 |
| 10 | 5 | 55.5 | 59.4 | 0 / 35 | 3065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 52 | 35% |
| bts.mega.Gnarly 1.4 | 17 | 24% |
| bvh.mini.Freya 0.55 | 12 | 42% |
| cs.Wren 1.0 | 10 | 30% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 14% |
| kdf.KoulDestroyer 1.0 | 4 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 25% |

Hadur died in 316 of 350 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 85 | 27% | 101 |
| bts.mega.Gnarly 1.4 | 46 | 15% | 52 |
| bvh.mini.Freya 0.55 | 46 | 15% | 50 |
| cs.Wren 1.0 | 46 | 15% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 45 | 14% | 48 |
| kdf.KoulDestroyer 1.0 | 30 | 9% | 34 |
| kawigi.spare.SpareParts 0.7.6nosnd | 11 | 3% | 10 |
| bzdp.BoxCar 2.0 | 5 | 2% | 6 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.9 | 61.5 | 34 / 350 | 4.47 | 11.8% | 32087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 16.1% | 95 |
| az.Ololobot 0.2.4 | 2.0 | 13.9% | 125 |
| catcat20.Lambda 0.024 | 3.5 | 11.6% | 39 |
| hadur117.nano.SanaroS0 0.1 | 3.6 | 11.8% | 34 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.6% | 32 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.7% | 12 |
| gimp.GimpBot 0.1 | 6.7 | 8.4% | 7 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.5% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.4 | 6.1% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.6 | 57.5 | 4 / 35 | 3141 |
| 2 | 4 | 56.6 | 61.6 | 2 / 35 | 3448 |
| 3 | 3 | 54.3 | 57.8 | 1 / 35 | 3226 |
| 4 | 3 | 58.9 | 67.3 | 5 / 35 | 3598 |
| 5 | 5 | 54.2 | 58.1 | 2 / 35 | 3152 |
| 6 | 4 | 57.1 | 61.3 | 5 / 35 | 3491 |
| 7 | 3 | 57.9 | 68.3 | 5 / 35 | 3072 |
| 8 | 3 | 55.3 | 61.6 | 2 / 35 | 3003 |
| 9 | 4 | 53.9 | 57.5 | 3 / 35 | 2943 |
| 10 | 3 | 56.5 | 63.8 | 5 / 35 | 3013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 36 | 8% |
| bvh.fry.Freya 0.82 | 32 | 25% |
| catcat20.Lambda 0.024 | 24 | 75% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 21% |
| gimp.GimpBot 0.1 | 4 | 50% |
| winamp32.micro.MicroMacro 1.0 | 2 | 0% |

Hadur died in 317 of 350 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 110 | 35% | 120 |
| az.Ololobot 0.2.4 | 59 | 19% | 61 |
| stelo.SoRobotNanoMelee 1.2 | 46 | 15% | 48 |
| catcat20.Lambda 0.024 | 32 | 10% | 46 |
| apollokidd.ApolloKidd 0.9 | 25 | 8% | 26 |
| gimp.GimpBot 0.1 | 18 | 6% | 19 |
| winamp32.micro.MicroMacro 1.0 | 14 | 4% | 16 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 3% | 10 |
| dcs.Eater_of_Worlds 1.1.3-A | 4 | 1% | 4 |

## Melee bench: F41

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 67.9 | 62 / 350 | 3.89 | 13.0% | 31035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.2% | 166 |
| lessonz.robocode.Oz 0.5.0 | 3.0 | 13.3% | 46 |
| hadur117.nano.SanaroS0 0.1 | 3.1 | 13.0% | 62 |
| ary.Swarm 1.1 | 3.5 | 13.1% | 31 |
| simonton.nano.MeleeSeed 1.8 | 4.4 | 12.2% | 35 |
| shrub.Silver v048 | 6.1 | 9.0% | 9 |
| zyx.nano.Ant 1.1 | 6.9 | 7.7% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.2% | 4 |
| stelo.Mirror 1.1 | 8.8 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 67.3 | 5 / 35 | 2988 |
| 2 | 3 | 60.0 | 67.9 | 2 / 35 | 3524 |
| 3 | 2 | 60.2 | 69.8 | 7 / 35 | 3271 |
| 4 | 3 | 60.3 | 69.2 | 7 / 35 | 3046 |
| 5 | 5 | 57.4 | 61.9 | 6 / 35 | 2818 |
| 6 | 3 | 60.0 | 68.6 | 7 / 35 | 3224 |
| 7 | 3 | 60.5 | 69.5 | 7 / 35 | 2999 |
| 8 | 3 | 57.7 | 64.8 | 4 / 35 | 2976 |
| 9 | 4 | 60.5 | 68.9 | 10 / 35 | 3032 |
| 10 | 2 | 60.9 | 70.8 | 7 / 35 | 3157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 67 | 27% |
| lessonz.robocode.Oz 0.5.0 | 30 | 50% |
| simonton.nano.MeleeSeed 1.8 | 21 | 57% |
| ary.Swarm 1.1 | 19 | 68% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| zyx.nano.Ant 1.1 | 1 | 0% |
| stelo.Mirror 1.1 | 1 | 100% |
| shrub.Silver v048 | 1 | 0% |

Hadur died in 290 of 350 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 95 | 33% | 117 |
| ary.Swarm 1.1 | 56 | 19% | 66 |
| lessonz.robocode.Oz 0.5.0 | 48 | 17% | 58 |
| simonton.nano.MeleeSeed 1.8 | 45 | 16% | 57 |
| shrub.Silver v048 | 16 | 6% | 17 |
| zyx.nano.Ant 1.1 | 15 | 5% | 17 |
| stelo.Mirror 1.1 | 6 | 2% | 7 |
| jsal.Jsalbot 1.0 | 4 | 1% | 6 |
| acogdev.alpha 0.2 | 3 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 66.6 | 50 / 350 | 4.01 | 13.0% | 36161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 166 |
| maribo.mini.MiniQuester 0.1 | 2.7 | 14.3% | 50 |
| ara.Shera 0.88 | 2.8 | 14.5% | 73 |
| hadur117.nano.SanaroS0 0.1 | 3.5 | 13.0% | 50 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 1 |
| maribo.IotaCT 1.1 | 6.3 | 7.7% | 2 |
| dsw.StaticD 1.0 | 6.8 | 6.8% | 7 |
| mme.NikeEnhanced 2.0 | 8.3 | 5.8% | 0 |
| stelo.MirrorMicro 1.0 | 8.9 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 69.2 | 6 / 35 | 3455 |
| 2 | 4 | 60.5 | 66.3 | 7 / 35 | 3736 |
| 3 | 4 | 57.8 | 62.2 | 4 / 35 | 3599 |
| 4 | 3 | 60.2 | 68.9 | 5 / 35 | 3676 |
| 5 | 4 | 57.3 | 62.2 | 4 / 35 | 3415 |
| 6 | 4 | 57.5 | 61.3 | 2 / 35 | 3543 |
| 7 | 2 | 62.5 | 74.0 | 9 / 35 | 3986 |
| 8 | 3 | 60.8 | 73.3 | 5 / 35 | 3375 |
| 9 | 4 | 58.4 | 65.4 | 3 / 35 | 3507 |
| 10 | 4 | 58.1 | 62.9 | 5 / 35 | 3869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 64 | 38% |
| ara.Shera 0.88 | 27 | 44% |
| maribo.mini.MiniQuester 0.1 | 21 | 52% |
| dsw.StaticD 1.0 | 4 | 50% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 97 | 32% | 121 |
| ara.Shera 0.88 | 70 | 23% | 81 |
| maribo.mini.MiniQuester 0.1 | 62 | 21% | 74 |
| amz.NanoClone 1.41 | 29 | 10% | 30 |
| dsw.StaticD 1.0 | 11 | 4% | 13 |
| maribo.IotaCT 1.1 | 11 | 4% | 11 |
| mme.NikeEnhanced 2.0 | 10 | 3% | 10 |
| stelo.MirrorMicro 1.0 | 6 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 4 | 1% | 4 |

## Melee bench: F43

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 64.1 | 18 / 350 | 4.23 | 12.2% | 32438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 275 |
| brainfade.melee.Dusk 0.44 | 2.7 | 12.7% | 30 |
| hadur117.nano.SanaroS0 0.1 | 3.2 | 12.2% | 18 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.9% | 10 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.0% | 9 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.2% | 5 |
| mz.NanoGod 2.02 | 7.3 | 7.8% | 3 |
| jab.DiamondStealer 5 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 62.9 | 2 / 35 | 3253 |
| 2 | 5 | 56.4 | 56.2 | 2 / 35 | 3033 |
| 3 | 3 | 59.6 | 64.4 | 1 / 35 | 3203 |
| 4 | 4 | 58.2 | 61.6 | 1 / 35 | 3104 |
| 5 | 3 | 58.5 | 60.6 | 3 / 35 | 3052 |
| 6 | 2 | 60.1 | 66.0 | 2 / 35 | 3314 |
| 7 | 4 | 61.1 | 66.7 | 3 / 35 | 3548 |
| 8 | 4 | 59.8 | 65.1 | 1 / 35 | 3141 |
| 9 | 2 | 60.1 | 66.7 | 1 / 35 | 3339 |
| 10 | 2 | 61.9 | 71.1 | 2 / 35 | 3451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 77 | 13% |
| brainfade.melee.Dusk 0.44 | 8 | 50% |
| dummy.micro.Sparrow 2.5 | 4 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 2 | 0% |
| mz.NanoGod 2.02 | 2 | 50% |

Hadur died in 333 of 350 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 169 | 51% | 177 |
| dummy.micro.Sparrow 2.5 | 39 | 12% | 42 |
| brainfade.melee.Dusk 0.44 | 31 | 9% | 36 |
| Krabb.akim2.Akim2 1.1b | 31 | 9% | 31 |
| wcsv.melee.EngineerMelee 0.1 | 29 | 9% | 30 |
| mz.NanoGod 2.02 | 19 | 6% | 19 |
| jab.DiamondStealer 5 | 10 | 3% | 10 |
| cvt.Firsty 1.0 | 5 | 2% | 5 |

## Melee bench: F44

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 67.5 | 61 / 350 | 3.92 | 13.6% | 38078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.0 | 17.2% | 163 |
| tzu.TheArtOfWar 1.2 | 2.2 | 14.7% | 75 |
| hadur117.nano.SanaroS0 0.1 | 2.8 | 13.6% | 61 |
| jwirde.Gort 2.0 | 4.3 | 10.9% | 30 |
| wompi.Quokka 1.6 | 4.7 | 10.4% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.3 | 8.6% | 4 |
| disan.Chair 2.2.0 | 6.8 | 8.0% | 6 |
| stf.PanzerGeneral 0.1 | 7.9 | 6.9% | 0 |
| sample.Crazy 1.0 | 9.2 | 5.0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 67.6 | 6 / 35 | 3922 |
| 2 | 3 | 59.4 | 65.4 | 5 / 35 | 3647 |
| 3 | 3 | 61.8 | 71.4 | 8 / 35 | 3870 |
| 4 | 3 | 59.1 | 63.5 | 8 / 35 | 3605 |
| 5 | 3 | 61.1 | 69.8 | 5 / 35 | 3910 |
| 6 | 3 | 58.8 | 65.4 | 2 / 35 | 3861 |
| 7 | 3 | 62.4 | 74.3 | 7 / 35 | 3839 |
| 8 | 3 | 58.7 | 63.8 | 7 / 35 | 3490 |
| 9 | 2 | 59.0 | 64.1 | 4 / 35 | 3810 |
| 10 | 2 | 62.0 | 69.8 | 9 / 35 | 4124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 66 | 53% |
| tzu.TheArtOfWar 1.2 | 31 | 23% |
| jwirde.Gort 2.0 | 12 | 25% |
| wompi.Quokka 1.6 | 10 | 80% |
| disan.Chair 2.2.0 | 4 | 75% |
| sample.Crazy 1.0 | 3 | 67% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 33% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 92 | 32% | 128 |
| tzu.TheArtOfWar 1.2 | 71 | 24% | 81 |
| wompi.Quokka 1.6 | 35 | 12% | 37 |
| jwirde.Gort 2.0 | 31 | 11% | 34 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 23 | 8% | 26 |
| stf.PanzerGeneral 0.1 | 15 | 5% | 15 |
| disan.Chair 2.2.0 | 12 | 4% | 13 |
| amk.jointstrike.JointStrike 0.2 | 10 | 3% | 11 |
| sample.Crazy 1.0 | 3 | 1% | 5 |

## Melee bench: F45

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 66.8 | 57 / 350 | 3.99 | 13.8% | 38561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.6 | 13.8% | 57 |
| eem.IWillFireNoBullet v2.8 | 2.1 | 13.2% | 193 |
| jje.BagPuss 1.2 | 3.0 | 12.4% | 27 |
| myl.nano.Graviton 1.10 | 4.3 | 10.8% | 12 |
| sul.Lunar 1.1 | 4.3 | 11.1% | 25 |
| hvilela.HVilela 0.9 | 6.2 | 9.6% | 7 |
| fm.claire 1.7 | 7.3 | 8.7% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 7.4 | 8.5% | 6 |
| wit.Deep7 2.0 | 8.9 | 6.8% | 17 |
| abud.ThirdRobo 1.0 | 9.9 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.7 | 61.0 | 4 / 35 | 3848 |
| 2 | 1 | 62.0 | 72.7 | 8 / 35 | 3836 |
| 3 | 4 | 57.0 | 58.7 | 5 / 35 | 3633 |
| 4 | 1 | 64.2 | 77.1 | 7 / 35 | 4573 |
| 5 | 1 | 60.9 | 70.8 | 6 / 35 | 3816 |
| 6 | 2 | 58.3 | 64.1 | 5 / 35 | 3571 |
| 7 | 1 | 60.1 | 66.7 | 5 / 35 | 3992 |
| 8 | 1 | 58.4 | 65.1 | 3 / 35 | 3665 |
| 9 | 2 | 59.9 | 65.4 | 7 / 35 | 3980 |
| 10 | 1 | 59.4 | 66.0 | 7 / 35 | 3647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 68 | 35% |
| sul.Lunar 1.1 | 18 | 67% |
| jje.BagPuss 1.2 | 12 | 17% |
| myl.nano.Graviton 1.10 | 12 | 50% |
| hvilela.HVilela 0.9 | 5 | 60% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 100% |
| fm.claire 1.7 | 4 | 50% |
| wit.Deep7 2.0 | 4 | 75% |

Hadur died in 293 of 350 rounds, at a mean tick of 1090. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 63 | 22% | 85 |
| eem.IWillFireNoBullet v2.8 | 58 | 20% | 0 |
| myl.nano.Graviton 1.10 | 44 | 15% | 67 |
| hvilela.HVilela 0.9 | 37 | 13% | 43 |
| sul.Lunar 1.1 | 34 | 12% | 70 |
| fm.claire 1.7 | 29 | 10% | 33 |
| wit.Deep7 2.0 | 13 | 4% | 22 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 3% | 16 |
| abud.ThirdRobo 1.0 | 7 | 2% | 12 |

## Melee bench: F46

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 70.2 | 31 / 350 | 3.69 | 12.8% | 29130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.1 | 18.2% | 160 |
| rsalesc.melee.Medina 0.4.5 | 1.9 | 16.6% | 125 |
| hadur117.nano.SanaroS0 0.1 | 3.1 | 12.8% | 31 |
| mz.MicroSheep 1.0 | 4.4 | 11.1% | 10 |
| cx.Princess 1.0 | 4.6 | 10.4% | 22 |
| sadoner.killer 0.2 | 6.0 | 9.4% | 2 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.1% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 66.7 | 2 / 35 | 2429 |
| 2 | 3 | 60.7 | 74.0 | 4 / 35 | 3095 |
| 3 | 3 | 57.6 | 64.8 | 4 / 35 | 2805 |
| 4 | 4 | 54.9 | 59.4 | 1 / 35 | 2769 |
| 5 | 3 | 59.4 | 70.8 | 4 / 35 | 2860 |
| 6 | 3 | 60.1 | 72.7 | 3 / 35 | 2971 |
| 7 | 3 | 60.8 | 74.6 | 3 / 35 | 2868 |
| 8 | 3 | 59.6 | 70.2 | 2 / 35 | 3116 |
| 9 | 3 | 62.5 | 77.8 | 6 / 35 | 3230 |
| 10 | 3 | 59.7 | 70.8 | 2 / 35 | 2987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 78 | 26% |
| rsalesc.melee.Medina 0.4.5 | 35 | 17% |
| cx.Princess 1.0 | 9 | 33% |
| mz.MicroSheep 1.0 | 4 | 25% |
| sadoner.killer 0.2 | 2 | 50% |

Hadur died in 320 of 350 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 144 | 45% | 164 |
| rsalesc.melee.Medina 0.4.5 | 82 | 26% | 85 |
| mz.MicroSheep 1.0 | 29 | 9% | 30 |
| sadoner.killer 0.2 | 24 | 8% | 28 |
| cx.Princess 1.0 | 24 | 8% | 26 |
| arthord.NanoSatanMelee Beta | 12 | 4% | 12 |
| jeremyreeder.collective.Prophet 5 | 4 | 1% | 4 |
| kurios.DOSexe .9a | 1 | 0% | 1 |

