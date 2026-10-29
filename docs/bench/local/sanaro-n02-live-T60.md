# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 71.6 | 22 / 350 | 3.56 | 13.3% | 37028 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 249 |
| hadur117.nano.SanaroT60 0.1 | 2.3 | 13.3% | 22 |
| mz.MicroGodMelee 1 | 3.7 | 11.5% | 16 |
| sgp.JollyNinja 3.53 | 3.7 | 11.7% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 11.2% | 11 |
| lorneswork.Predator 1.0 | 5.7 | 9.9% | 9 |
| adt.Ar2 1.0 | 6.9 | 7.8% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.7% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 64.1 | 2 / 35 | 3565 |
| 2 | 2 | 61.2 | 72.7 | 2 / 35 | 3933 |
| 3 | 2 | 61.3 | 73.7 | 5 / 35 | 3739 |
| 4 | 2 | 60.2 | 71.7 | 2 / 35 | 3380 |
| 5 | 4 | 58.7 | 66.7 | 4 / 35 | 3172 |
| 6 | 2 | 61.6 | 74.0 | 0 / 35 | 3901 |
| 7 | 2 | 60.9 | 71.4 | 3 / 35 | 3991 |
| 8 | 2 | 62.8 | 78.4 | 2 / 35 | 3822 |
| 9 | 2 | 61.1 | 72.7 | 1 / 35 | 4079 |
| 10 | 2 | 59.5 | 70.2 | 1 / 35 | 3446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 138 | 4% |
| sgp.JollyNinja 3.53 | 18 | 44% |
| mz.MicroGodMelee 1 | 10 | 40% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 22% |
| lorneswork.Predator 1.0 | 6 | 17% |
| adt.Ar2 1.0 | 4 | 25% |

Hadur died in 328 of 350 rounds, at a mean tick of 1099. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 163 | 50% | 170 |
| sgp.JollyNinja 3.53 | 42 | 13% | 47 |
| simonton.nano.WeekendObsession_Melee 1.0 | 37 | 11% | 38 |
| lorneswork.Predator 1.0 | 31 | 9% | 34 |
| mz.MicroGodMelee 1 | 26 | 8% | 31 |
| adt.Ar2 1.0 | 17 | 5% | 18 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 2% | 6 |
| mym.EdgeStalker 1.0 | 3 | 1% | 3 |
| skm.butterfly 1.0 | 3 | 1% | 3 |

## Melee bench: F02

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 65.5 | 52 / 350 | 4.10 | 13.9% | 44303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.8 | 14.5% | 77 |
| pulsar.PulsarMax 0.8.9 | 2.1 | 14.1% | 95 |
| hadur117.nano.SanaroT60 0.1 | 2.2 | 13.9% | 52 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.6% | 7 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.2% | 32 |
| Noran.BitchingElk 0.054 | 6.8 | 8.5% | 41 |
| sch.Simone 0.3d | 7.0 | 8.3% | 24 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.6% | 7 |
| stelo.PatternRobot 1.0 | 8.8 | 6.7% | 11 |
| fullsail.SweetTea 1.1 | 9.8 | 4.7% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.9 | 52.1 | 2 / 35 | 4086 |
| 2 | 3 | 59.5 | 63.8 | 4 / 35 | 4370 |
| 3 | 2 | 61.6 | 67.3 | 5 / 35 | 4580 |
| 4 | 3 | 60.9 | 68.6 | 3 / 35 | 4447 |
| 5 | 2 | 59.7 | 63.5 | 4 / 35 | 4636 |
| 6 | 1 | 62.7 | 74.0 | 7 / 35 | 4218 |
| 7 | 2 | 60.5 | 64.4 | 8 / 35 | 4528 |
| 8 | 1 | 61.1 | 68.6 | 5 / 35 | 4591 |
| 9 | 3 | 58.2 | 61.3 | 4 / 35 | 4050 |
| 10 | 1 | 63.4 | 71.7 | 10 / 35 | 4797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 30% |
| pulsar.PulsarMax 0.8.9 | 38 | 53% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 54% |
| sch.Simone 0.3d | 12 | 42% |
| Noran.BitchingElk 0.054 | 10 | 20% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 80% |
| stelo.PatternRobot 1.0 | 4 | 0% |
| fullsail.SweetTea 1.1 | 4 | 0% |
| fnc.bandit.Bandit 5.2.0 | 3 | 33% |

Hadur died in 300 of 350 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 65 | 22% | 76 |
| pulsar.PulsarMax 0.8.9 | 63 | 21% | 83 |
| lrem.micro.SpikeSoldier 0.4 | 56 | 19% | 58 |
| stelo.PatternRobot 1.0 | 29 | 10% | 29 |
| com.cohesiva.robocode.ManOwaR 1.0 | 25 | 8% | 31 |
| sch.Simone 0.3d | 22 | 7% | 27 |
| Noran.BitchingElk 0.054 | 17 | 6% | 21 |
| fnc.bandit.Bandit 5.2.0 | 16 | 5% | 18 |
| fullsail.SweetTea 1.1 | 7 | 2% | 7 |

## Melee bench: F03

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 77.2 | 56 / 350 | 3.05 | 14.7% | 41754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 2.1 | 15.0% | 94 |
| kawigi.nano.Lib 1.0 | 2.1 | 15.0% | 93 |
| hadur117.nano.SanaroT60 0.1 | 2.3 | 14.7% | 56 |
| vuen.Cake 2.51 | 3.5 | 13.8% | 84 |
| urdos.URDOS 1.3 | 5.0 | 10.0% | 14 |
| adt.Ar1 2.1 | 6.3 | 7.4% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 7.1% | 5 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.9 | 5.4% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 74.6 | 7 / 35 | 4109 |
| 2 | 3 | 61.4 | 75.6 | 3 / 35 | 4017 |
| 3 | 3 | 62.9 | 80.3 | 4 / 35 | 4243 |
| 4 | 1 | 63.9 | 83.2 | 5 / 35 | 4221 |
| 5 | 2 | 62.3 | 75.2 | 7 / 35 | 4225 |
| 6 | 1 | 63.0 | 82.2 | 5 / 35 | 4004 |
| 7 | 2 | 62.3 | 75.9 | 8 / 35 | 4250 |
| 8 | 3 | 59.3 | 69.5 | 5 / 35 | 3755 |
| 9 | 2 | 63.3 | 78.1 | 7 / 35 | 4499 |
| 10 | 3 | 63.3 | 77.1 | 5 / 35 | 4431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 63 | 33% |
| radnor.DoctorBob 1.42 | 50 | 42% |
| kawigi.nano.Lib 1.0 | 40 | 8% |
| urdos.URDOS 1.3 | 16 | 38% |
| adt.Ar1 2.1 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 0% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 295 of 350 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 92 | 31% | 99 |
| radnor.DoctorBob 1.42 | 82 | 28% | 97 |
| vuen.Cake 2.51 | 53 | 18% | 75 |
| urdos.URDOS 1.3 | 39 | 13% | 46 |
| adt.Ar1 2.1 | 12 | 4% | 13 |
| oa.weak.FlyMk1 0.1 | 6 | 2% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 5 | 2% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 69.8 | 6 / 350 | 3.72 | 13.8% | 44737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.2% | 326 |
| apc.LeeroyJenkins2 1.0 | 2.3 | 14.1% | 8 |
| hadur117.nano.SanaroT60 0.1 | 2.7 | 13.8% | 6 |
| TNT.TNT 0.99.1 | 4.1 | 10.5% | 5 |
| josago.Jorgito 0.16 | 4.9 | 9.2% | 3 |
| css.Delitioner 0.11 | 6.4 | 7.7% | 1 |
| tj.zombie1n 1.0.1 | 6.6 | 7.3% | 1 |
| rampancy.Durandal 2.1d | 8.3 | 5.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.9 | 4.6% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 67.6 | 1 / 35 | 4461 |
| 2 | 2 | 61.1 | 67.9 | 0 / 35 | 4384 |
| 3 | 3 | 60.3 | 66.3 | 0 / 35 | 4135 |
| 4 | 3 | 61.4 | 67.6 | 0 / 35 | 4472 |
| 5 | 3 | 62.5 | 69.8 | 1 / 35 | 4481 |
| 6 | 2 | 63.8 | 73.7 | 1 / 35 | 4725 |
| 7 | 3 | 64.0 | 74.6 | 1 / 35 | 4852 |
| 8 | 2 | 62.6 | 69.5 | 1 / 35 | 4742 |
| 9 | 3 | 60.4 | 66.7 | 0 / 35 | 4182 |
| 10 | 3 | 63.3 | 74.0 | 1 / 35 | 4303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 134 | 4% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |
| TNT.TNT 0.99.1 | 1 | 0% |

Hadur died in 344 of 350 rounds, at a mean tick of 1126. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 207 | 60% | 211 |
| apc.LeeroyJenkins2 1.0 | 67 | 19% | 69 |
| josago.Jorgito 0.16 | 32 | 9% | 32 |
| TNT.TNT 0.99.1 | 12 | 3% | 12 |
| tj.zombie1n 1.0.1 | 10 | 3% | 11 |
| css.Delitioner 0.11 | 8 | 2% | 8 |
| sp.Nanos.Ember 1.1 | 4 | 1% | 4 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| spin.Bugstard 0.012b | 1 | 0% | 0 |

## Melee bench: F06

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 67.7 | 58 / 350 | 3.91 | 13.1% | 32508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.3 | 16.3% | 99 |
| origin.SleepSiphon 1.7b | 2.1 | 14.5% | 106 |
| hadur117.nano.SanaroT60 0.1 | 3.1 | 13.1% | 58 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 12.2% | 42 |
| mld.Wisdom 1.0 | 4.6 | 11.0% | 14 |
| gg.Wolverine 2.0 | 6.2 | 8.7% | 4 |
| spinnercat.Omen 1.0 | 6.9 | 8.0% | 7 |
| DBall.NUKE 0.1 | 8.3 | 6.9% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.5% | 14 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 67.3 | 8 / 35 | 3496 |
| 2 | 3 | 61.6 | 74.0 | 8 / 35 | 3178 |
| 3 | 3 | 59.2 | 66.3 | 5 / 35 | 3370 |
| 4 | 2 | 61.5 | 73.3 | 8 / 35 | 3459 |
| 5 | 3 | 59.1 | 68.3 | 3 / 35 | 3058 |
| 6 | 4 | 57.4 | 64.1 | 4 / 35 | 3026 |
| 7 | 2 | 60.7 | 73.0 | 6 / 35 | 3445 |
| 8 | 4 | 57.2 | 61.9 | 5 / 35 | 3064 |
| 9 | 3 | 59.2 | 66.7 | 6 / 35 | 3327 |
| 10 | 4 | 57.3 | 61.9 | 5 / 35 | 3085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 42 | 60% |
| origin.SleepSiphon 1.7b | 40 | 45% |
| pe.minimelee.SandboxMiniMelee 1.1 | 19 | 42% |
| gg.Wolverine 2.0 | 6 | 67% |
| mld.Wisdom 1.0 | 5 | 0% |
| DBall.NUKE 0.1 | 3 | 0% |
| spinnercat.Omen 1.0 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 295 of 350 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 87 | 29% | 103 |
| origin.SleepSiphon 1.7b | 67 | 23% | 87 |
| mld.Wisdom 1.0 | 50 | 17% | 51 |
| pe.minimelee.SandboxMiniMelee 1.1 | 42 | 14% | 53 |
| spinnercat.Omen 1.0 | 17 | 6% | 19 |
| gg.Wolverine 2.0 | 16 | 5% | 19 |
| DBall.NUKE 0.1 | 9 | 3% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 2% | 6 |
| sample.Fire 1.0 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.5 | 82 / 350 | 2.75 | 16.3% | 49084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 18.0% | 111 |
| rtk.Tachikoma 1.0 | 1.6 | 17.5% | 110 |
| hadur117.nano.SanaroT60 0.1 | 2.9 | 16.3% | 82 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.3% | 23 |
| franzor.Lizt 1.3.1 | 4.8 | 10.8% | 24 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.9% | 2 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.3 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.3 | 82.9 | 9 / 35 | 4861 |
| 2 | 3 | 66.8 | 81.0 | 7 / 35 | 5329 |
| 3 | 3 | 66.1 | 78.1 | 4 / 35 | 4974 |
| 4 | 3 | 66.8 | 81.0 | 10 / 35 | 4656 |
| 5 | 2 | 66.6 | 81.0 | 11 / 35 | 4841 |
| 6 | 3 | 65.6 | 75.2 | 8 / 35 | 4795 |
| 7 | 3 | 66.1 | 79.7 | 5 / 35 | 4975 |
| 8 | 3 | 67.1 | 82.2 | 8 / 35 | 5012 |
| 9 | 3 | 66.2 | 80.6 | 6 / 35 | 4924 |
| 10 | 3 | 68.0 | 83.5 | 14 / 35 | 4717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 100 | 52% |
| rsalesc.melee.Monk 0.3.6c | 51 | 8% |
| oog.melee.CapuletDroid 1.1 | 25 | 56% |
| franzor.Lizt 1.3.1 | 12 | 75% |
| exauge.GateKeeper 1.1.121g | 3 | 67% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 269 of 350 rounds, at a mean tick of 1184. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 124 | 46% | 183 |
| rsalesc.melee.Monk 0.3.6c | 101 | 38% | 111 |
| oog.melee.CapuletDroid 1.1 | 31 | 12% | 44 |
| exauge.GateKeeper 1.1.121g | 5 | 2% | 6 |
| franzor.Lizt 1.3.1 | 4 | 1% | 0 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 4 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 67.8 | 69 / 350 | 3.90 | 13.3% | 34097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroT60 0.1 | 1.8 | 13.3% | 69 |
| tm.Yuugao 1.0 | 2.0 | 13.5% | 98 |
| shrub.Vapour v159 | 2.5 | 13.1% | 70 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 11.2% | 43 |
| m3thos.Eva00 1.1 | 5.3 | 9.9% | 20 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 10.2% | 26 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.7% | 20 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 6.9% | 3 |
| SHAM.WOW 1.4 | 8.7 | 6.8% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.4 | 6.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.8 | 60.6 | 6 / 35 | 3171 |
| 2 | 3 | 57.3 | 63.5 | 7 / 35 | 3264 |
| 3 | 2 | 58.5 | 66.7 | 6 / 35 | 3476 |
| 4 | 3 | 58.9 | 68.6 | 5 / 35 | 3417 |
| 5 | 1 | 59.0 | 68.6 | 6 / 35 | 3391 |
| 6 | 1 | 59.7 | 68.9 | 7 / 35 | 3535 |
| 7 | 1 | 59.6 | 71.7 | 8 / 35 | 3101 |
| 8 | 1 | 60.1 | 69.2 | 10 / 35 | 3658 |
| 9 | 1 | 60.7 | 73.0 | 6 / 35 | 3693 |
| 10 | 2 | 58.7 | 67.0 | 8 / 35 | 3391 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 40 | 48% |
| shrub.Vapour v159 | 24 | 13% |
| Krabb.sliNk.Garm 0.9u | 21 | 62% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 53% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 67% |
| m3thos.Eva00 1.1 | 10 | 60% |
| qualidafial.MajorDick 1.0.1 | 3 | 33% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 70 | 25% | 74 |
| tm.Yuugao 1.0 | 54 | 19% | 76 |
| com.spp.robocode.MostlyHarmless 010 | 38 | 13% | 49 |
| Krabb.sliNk.Garm 0.9u | 36 | 13% | 46 |
| m3thos.Eva00 1.1 | 33 | 12% | 37 |
| jwst.DAD.DarkAndDarker 1.1 | 23 | 8% | 29 |
| zyx.nano.BacillusComma 1.0 | 14 | 5% | 18 |
| qualidafial.MajorDick 1.0.1 | 9 | 3% | 9 |
| SHAM.WOW 1.4 | 6 | 2% | 10 |

## Melee bench: F09

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 60.5 | 35 / 350 | 4.55 | 11.8% | 30207 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.9% | 184 |
| kc.micro.Figment 1.0 | 2.0 | 14.7% | 62 |
| hadur117.nano.SanaroT60 0.1 | 3.6 | 11.8% | 35 |
| yagami.Tidus 0.11 | 4.2 | 11.3% | 9 |
| pedersen.Grishnakh 1.0 | 4.5 | 11.1% | 31 |
| mc2.enemy.Original 0.9 | 5.7 | 9.2% | 21 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 7 |
| step.nanoPri 1.0 | 8.4 | 6.0% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.1 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.4 | 60.0 | 2 / 35 | 2926 |
| 2 | 5 | 55.5 | 56.2 | 3 / 35 | 3165 |
| 3 | 3 | 56.8 | 62.9 | 2 / 35 | 2761 |
| 4 | 4 | 55.9 | 57.8 | 5 / 35 | 3047 |
| 5 | 3 | 57.7 | 61.9 | 4 / 35 | 3275 |
| 6 | 4 | 57.2 | 61.6 | 4 / 35 | 2839 |
| 7 | 3 | 59.1 | 66.3 | 6 / 35 | 3342 |
| 8 | 4 | 56.5 | 58.7 | 3 / 35 | 3136 |
| 9 | 3 | 58.4 | 66.0 | 4 / 35 | 3124 |
| 10 | 4 | 53.0 | 54.0 | 2 / 35 | 2592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 59 | 36% |
| kc.micro.Figment 1.0 | 22 | 23% |
| pedersen.Grishnakh 1.0 | 7 | 29% |
| mc2.enemy.Original 0.9 | 6 | 33% |
| yagami.Tidus 0.11 | 5 | 80% |
| dft.Calliope 5.6 | 2 | 50% |

Hadur died in 315 of 350 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 103 | 33% | 123 |
| kc.micro.Figment 1.0 | 66 | 21% | 71 |
| yagami.Tidus 0.11 | 45 | 14% | 50 |
| pedersen.Grishnakh 1.0 | 39 | 12% | 39 |
| mc2.enemy.Original 0.9 | 22 | 7% | 24 |
| step.nanoPri 1.0 | 15 | 5% | 15 |
| dft.Calliope 5.6 | 12 | 4% | 14 |
| robar.nano.Assertive_Melee 0.2 | 8 | 3% | 8 |
| rdm.Dueler 0.4x | 5 | 2% | 6 |

## Melee bench: F10

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 74.2 | 73 / 350 | 3.33 | 14.6% | 41932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroT60 0.1 | 1.6 | 14.6% | 73 |
| DTF.Kludgy 1.2b | 1.9 | 15.1% | 101 |
| ne.Chimera 1.2 | 3.1 | 13.3% | 50 |
| ejb.Polaris 1.0.1 | 3.4 | 13.1% | 59 |
| tvv.micro.Antares 1.1.1 | 5.4 | 10.8% | 38 |
| vStar.RAFzilla 2.15 | 5.6 | 10.8% | 20 |
| sam.Samspin 1.0 | 7.7 | 6.5% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.9% | 2 |
| kurios.DOSexe .9b | 8.9 | 5.2% | 2 |
| donjezza.Muncho 1.0 | 9.4 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 80.6 | 11 / 35 | 4382 |
| 2 | 1 | 62.7 | 75.2 | 10 / 35 | 4431 |
| 3 | 2 | 60.7 | 70.8 | 5 / 35 | 3903 |
| 4 | 1 | 62.6 | 76.2 | 8 / 35 | 4134 |
| 5 | 1 | 63.8 | 78.4 | 8 / 35 | 4538 |
| 6 | 2 | 60.6 | 68.9 | 4 / 35 | 4336 |
| 7 | 3 | 59.6 | 67.3 | 5 / 35 | 3961 |
| 8 | 1 | 62.9 | 76.2 | 10 / 35 | 4157 |
| 9 | 2 | 61.5 | 73.7 | 6 / 35 | 3984 |
| 10 | 2 | 61.8 | 74.3 | 6 / 35 | 4106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 55 | 22% |
| ejb.Polaris 1.0.1 | 44 | 61% |
| vStar.RAFzilla 2.15 | 22 | 64% |
| tvv.micro.Antares 1.1.1 | 20 | 40% |
| ne.Chimera 1.2 | 18 | 39% |
| kurios.DOSexe .9b | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 0% |
| sam.Samspin 1.0 | 2 | 0% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ne.Chimera 1.2 | 85 | 30% | 89 |
| DTF.Kludgy 1.2b | 84 | 30% | 92 |
| tvv.micro.Antares 1.1.1 | 31 | 11% | 33 |
| ejb.Polaris 1.0.1 | 30 | 11% | 61 |
| vStar.RAFzilla 2.15 | 20 | 7% | 31 |
| sam.Samspin 1.0 | 16 | 6% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 3% | 10 |
| donjezza.Muncho 1.0 | 4 | 1% | 6 |
| kurios.DOSexe .9b | 3 | 1% | 12 |

## Melee bench: F11

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 61.8 | 41 / 350 | 4.44 | 12.1% | 32175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.2% | 150 |
| cx.mini.Nimrod 0.55 | 2.1 | 13.4% | 54 |
| hadur117.nano.SanaroT60 0.1 | 3.2 | 12.1% | 41 |
| djc.DynaBot 0.1.1 | 3.8 | 11.0% | 27 |
| br2.MobyDickBot 1.6 | 5.4 | 10.1% | 32 |
| rdt199.Warlord 0.73 | 6.2 | 9.1% | 23 |
| uji.YellohFellah 1.0 | 6.6 | 8.7% | 21 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.8% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 64.4 | 4 / 35 | 3500 |
| 2 | 2 | 59.7 | 66.7 | 6 / 35 | 3594 |
| 3 | 3 | 56.1 | 61.3 | 4 / 35 | 2894 |
| 4 | 4 | 55.0 | 57.1 | 3 / 35 | 3221 |
| 5 | 3 | 56.0 | 61.3 | 3 / 35 | 3079 |
| 6 | 4 | 53.7 | 54.0 | 6 / 35 | 2880 |
| 7 | 3 | 57.7 | 65.7 | 2 / 35 | 3260 |
| 8 | 4 | 55.2 | 56.5 | 4 / 35 | 3097 |
| 9 | 3 | 57.8 | 65.7 | 4 / 35 | 3241 |
| 10 | 3 | 58.7 | 65.1 | 5 / 35 | 3409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 42 | 36% |
| cx.mini.Nimrod 0.55 | 21 | 62% |
| br2.MobyDickBot 1.6 | 9 | 56% |
| uji.YellohFellah 1.0 | 7 | 0% |
| djc.DynaBot 0.1.1 | 7 | 43% |
| rdt199.Warlord 0.73 | 5 | 60% |
| KiraNL.Chupacabra 0.4 | 2 | 50% |

Hadur died in 309 of 350 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 112 | 36% | 123 |
| cx.mini.Nimrod 0.55 | 61 | 20% | 70 |
| rdt199.Warlord 0.73 | 31 | 10% | 35 |
| djc.DynaBot 0.1.1 | 28 | 9% | 34 |
| uji.YellohFellah 1.0 | 22 | 7% | 26 |
| br2.MobyDickBot 1.6 | 21 | 7% | 27 |
| KiraNL.Chupacabra 0.4 | 16 | 5% | 17 |
| stelo.MirrorNano 1.3 | 10 | 3% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 3% | 8 |

## Melee bench: F12

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.0 | 63.1 | 53 / 350 | 4.32 | 12.2% | 29129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.7 | 14.3% | 81 |
| nat.PallasHawk 1.0 | 2.0 | 14.5% | 103 |
| darkcanuck.Leon 1.01 | 2.3 | 13.8% | 64 |
| hadur117.nano.SanaroT60 0.1 | 4.1 | 12.2% | 53 |
| brainfade.melee.Genghis 0.36 | 5.1 | 10.5% | 26 |
| jrm.Test0 1.0 | 5.9 | 8.8% | 8 |
| jp.Perpy 16.0 | 7.5 | 7.4% | 6 |
| cs.sheldor.Talon 1.1 | 7.9 | 7.1% | 2 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.9% | 4 |
| stuff.Vlad 0.1 | 9.4 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 66.7 | 5 / 35 | 2826 |
| 2 | 4 | 56.6 | 62.2 | 5 / 35 | 2918 |
| 3 | 4 | 59.6 | 69.5 | 5 / 35 | 3023 |
| 4 | 5 | 54.7 | 57.5 | 2 / 35 | 2939 |
| 5 | 4 | 57.4 | 63.2 | 6 / 35 | 2951 |
| 6 | 4 | 58.6 | 66.3 | 8 / 35 | 3003 |
| 7 | 4 | 56.4 | 61.9 | 6 / 35 | 2881 |
| 8 | 4 | 55.0 | 60.3 | 5 / 35 | 2549 |
| 9 | 4 | 55.7 | 58.7 | 7 / 35 | 2899 |
| 10 | 4 | 58.1 | 65.1 | 4 / 35 | 3140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 38 | 37% |
| bts.wiki.RipCurl 0.9b | 35 | 49% |
| darkcanuck.Leon 1.01 | 29 | 38% |
| brainfade.melee.Genghis 0.36 | 11 | 45% |
| jrm.Test0 1.0 | 6 | 100% |
| stuff.Vlad 0.1 | 2 | 0% |
| jaybot.bots.Oddball 4.0 | 1 | 0% |

Hadur died in 298 of 350 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 75 | 25% | 89 |
| bts.wiki.RipCurl 0.9b | 56 | 19% | 69 |
| darkcanuck.Leon 1.01 | 53 | 18% | 70 |
| brainfade.melee.Genghis 0.36 | 29 | 10% | 32 |
| jp.Perpy 16.0 | 26 | 9% | 27 |
| jrm.Test0 1.0 | 24 | 8% | 26 |
| stuff.Vlad 0.1 | 13 | 4% | 14 |
| jaybot.bots.Oddball 4.0 | 13 | 4% | 13 |
| cs.sheldor.Talon 1.1 | 9 | 3% | 10 |

## Melee bench: F13

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 68.7 | 29 / 350 | 3.81 | 12.6% | 32674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.1 | 17.8% | 175 |
| ags.Glacier 0.2.11 | 1.9 | 16.5% | 87 |
| hadur117.nano.SanaroT60 0.1 | 3.5 | 12.6% | 29 |
| shinh.Entangled 0.3 | 4.2 | 12.3% | 35 |
| gh.micro.Gruweltje 0.7 | 4.3 | 12.2% | 21 |
| apc.Colossus2 0.17 | 6.3 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.7 | 7.2% | 3 |
| ayk.WallHugger 1.0 | 8.3 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 72.7 | 1 / 35 | 3413 |
| 2 | 4 | 58.5 | 67.3 | 1 / 35 | 3128 |
| 3 | 3 | 58.8 | 70.2 | 3 / 35 | 2772 |
| 4 | 4 | 59.9 | 68.9 | 4 / 35 | 3347 |
| 5 | 4 | 59.5 | 67.9 | 3 / 35 | 3604 |
| 6 | 3 | 59.6 | 69.5 | 5 / 35 | 3035 |
| 7 | 3 | 59.7 | 67.9 | 4 / 35 | 3539 |
| 8 | 4 | 58.8 | 67.9 | 3 / 35 | 3166 |
| 9 | 3 | 60.2 | 69.8 | 3 / 35 | 3431 |
| 10 | 4 | 58.2 | 65.1 | 2 / 35 | 3239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 65 | 28% |
| ags.Glacier 0.2.11 | 45 | 13% |
| shinh.Entangled 0.3 | 16 | 25% |
| gh.micro.Gruweltje 0.7 | 6 | 17% |
| stelo.Wang 1.0 | 2 | 0% |

Hadur died in 321 of 350 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 100 | 31% | 117 |
| ags.Glacier 0.2.11 | 93 | 29% | 99 |
| gh.micro.Gruweltje 0.7 | 43 | 13% | 44 |
| shinh.Entangled 0.3 | 38 | 12% | 43 |
| stelo.Wang 1.0 | 27 | 8% | 27 |
| apc.Colossus2 0.17 | 10 | 3% | 10 |
| maribo.FollowFire 1 | 9 | 3% | 9 |
| ayk.WallHugger 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 76.3 | 87 / 350 | 3.13 | 14.8% | 37694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.1 | 17.7% | 155 |
| hadur117.nano.SanaroT60 0.1 | 1.9 | 14.8% | 87 |
| catcat20.shape.Theta 0.018 | 3.3 | 12.3% | 60 |
| Lo_Ian.Gandalf_V4 4.0 | 5.1 | 10.2% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.4 | 10.0% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.6% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 6.1 | 9.7% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.5% | 15 |
| pa.Improved 1.0 | 9.0 | 5.3% | 3 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 79.0 | 10 / 35 | 3992 |
| 2 | 1 | 64.2 | 81.3 | 12 / 35 | 3697 |
| 3 | 2 | 61.8 | 72.4 | 6 / 35 | 3794 |
| 4 | 2 | 62.1 | 74.3 | 10 / 35 | 3533 |
| 5 | 2 | 60.9 | 71.1 | 6 / 35 | 3603 |
| 6 | 2 | 64.6 | 79.0 | 13 / 35 | 3954 |
| 7 | 2 | 62.0 | 75.2 | 8 / 35 | 3460 |
| 8 | 2 | 61.7 | 72.1 | 9 / 35 | 3657 |
| 9 | 2 | 64.2 | 81.9 | 7 / 35 | 4192 |
| 10 | 2 | 63.0 | 76.8 | 6 / 35 | 3812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 91 | 34% |
| catcat20.shape.Theta 0.018 | 38 | 45% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 47% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 62% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 9 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 131 | 50% | 160 |
| catcat20.shape.Theta 0.018 | 40 | 15% | 51 |
| dmh.robocode.robot.RedDwarf 0.4 | 23 | 9% | 29 |
| Lo_Ian.Gandalf_V4 4.0 | 23 | 9% | 29 |
| sanyi.mikrobi.Roberto 1.0 | 22 | 8% | 35 |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 6% | 28 |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 3% | 13 |
| pa.Improved 1.0 | 1 | 0% | 3 |

## Melee bench: F15

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 60.4 | 38 / 350 | 4.56 | 12.3% | 36880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 14.8% | 81 |
| emp.Yngwie 1.11 | 2.1 | 13.8% | 118 |
| mld.DustBunny 3.8 | 2.7 | 13.3% | 33 |
| hadur117.nano.SanaroT60 0.1 | 4.2 | 12.3% | 38 |
| cb.nano.Insomnia 1.0 | 4.9 | 11.5% | 27 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.6% | 47 |
| lambdaxy.TBot 0.1 | 7.3 | 7.4% | 0 |
| Grystrion.TrackerWO 1.0 | 7.9 | 6.9% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.4% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 63.8 | 6 / 35 | 3792 |
| 2 | 5 | 56.4 | 59.0 | 3 / 35 | 3650 |
| 3 | 4 | 57.9 | 62.5 | 4 / 35 | 3632 |
| 4 | 4 | 57.6 | 61.3 | 5 / 35 | 3568 |
| 5 | 4 | 54.8 | 53.7 | 3 / 35 | 3477 |
| 6 | 5 | 57.8 | 61.9 | 1 / 35 | 3842 |
| 7 | 5 | 57.1 | 57.5 | 5 / 35 | 3719 |
| 8 | 4 | 58.4 | 62.9 | 6 / 35 | 3590 |
| 9 | 4 | 58.0 | 61.3 | 2 / 35 | 3760 |
| 10 | 4 | 57.9 | 60.6 | 3 / 35 | 3850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 28 | 25% |
| emp.Yngwie 1.11 | 24 | 33% |
| cb.nano.Insomnia 1.0 | 20 | 60% |
| kawigi.robot.Girl 1.2 | 14 | 64% |
| mld.DustBunny 3.8 | 10 | 10% |

Hadur died in 313 of 350 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 70 | 22% | 82 |
| kawigi.micro.Shiz 1.1 | 64 | 20% | 72 |
| mld.DustBunny 3.8 | 63 | 20% | 74 |
| cb.nano.Insomnia 1.0 | 62 | 20% | 56 |
| kawigi.robot.Girl 1.2 | 22 | 7% | 32 |
| divineomega.TrialBot 0.003 | 13 | 4% | 15 |
| Grystrion.TrackerWO 1.0 | 12 | 4% | 12 |
| lambdaxy.TBot 0.1 | 5 | 2% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 63.9 | 32 / 350 | 4.25 | 13.1% | 41030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.3% | 188 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.1 | 15.2% | 29 |
| hadur117.nano.SanaroT60 0.1 | 2.9 | 13.1% | 32 |
| techdude.forest.FlamingForest 1.1 | 4.4 | 10.8% | 63 |
| tvv.nano.Polaris 1.2 | 5.0 | 10.0% | 22 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 9.0% | 1 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.7% | 5 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.9% | 11 |
| repositorio.NanoStep 1.0 | 9.1 | 5.2% | 0 |
| asd.Cthulhu 1.3 | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.8 | 57.8 | 3 / 35 | 3703 |
| 2 | 3 | 59.9 | 63.8 | 3 / 35 | 4161 |
| 3 | 3 | 60.9 | 67.6 | 4 / 35 | 4285 |
| 4 | 3 | 60.4 | 65.7 | 3 / 35 | 4184 |
| 5 | 3 | 57.6 | 59.0 | 2 / 35 | 3961 |
| 6 | 3 | 57.3 | 59.0 | 3 / 35 | 3735 |
| 7 | 2 | 64.5 | 77.1 | 7 / 35 | 4776 |
| 8 | 3 | 59.4 | 62.5 | 1 / 35 | 4219 |
| 9 | 3 | 60.8 | 67.3 | 5 / 35 | 3931 |
| 10 | 3 | 57.9 | 59.0 | 1 / 35 | 4075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 74 | 5% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 70% |
| techdude.forest.FlamingForest 1.1 | 10 | 50% |
| tvv.nano.Polaris 1.2 | 6 | 33% |
| divineomega.DivineBot 1.9.4.5 | 5 | 60% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 50% |

Hadur died in 319 of 350 rounds, at a mean tick of 1100. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 139 | 44% | 147 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 63 | 20% | 74 |
| bvh.fnr.Fenrir 0.36l | 35 | 11% | 38 |
| techdude.forest.FlamingForest 1.1 | 22 | 7% | 26 |
| stelo.IntrinsicVolatility 1.4 | 20 | 6% | 23 |
| tvv.nano.Polaris 1.2 | 17 | 5% | 17 |
| divineomega.DivineBot 1.9.4.5 | 14 | 4% | 16 |
| asd.Cthulhu 1.3 | 8 | 3% | 8 |
| repositorio.NanoStep 1.0 | 1 | 0% | 1 |

## Melee bench: F17

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 65.3 | 61 / 350 | 4.13 | 13.3% | 38970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.8 | 14.1% | 66 |
| oog.melee.Mercutio 1.0 | 2.1 | 13.8% | 85 |
| hadur117.nano.SanaroT60 0.1 | 2.8 | 13.3% | 61 |
| cx.BlestPain 1.41 | 4.0 | 12.6% | 67 |
| ahf.NanoAndrew .4 | 5.2 | 11.3% | 31 |
| nic.Nicator 2.4 | 5.3 | 11.5% | 37 |
| maribo.melee.BMV 0.1 | 6.8 | 9.4% | 3 |
| tex.Longbot 0.4 | 8.5 | 5.4% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 67.3 | 7 / 35 | 3944 |
| 2 | 3 | 59.8 | 65.7 | 5 / 35 | 3997 |
| 3 | 2 | 61.0 | 66.0 | 9 / 35 | 4017 |
| 4 | 4 | 60.3 | 67.9 | 4 / 35 | 3910 |
| 5 | 5 | 56.6 | 59.0 | 3 / 35 | 3289 |
| 6 | 3 | 58.7 | 64.1 | 5 / 35 | 3632 |
| 7 | 3 | 58.6 | 62.9 | 3 / 35 | 3966 |
| 8 | 3 | 59.3 | 63.8 | 8 / 35 | 3704 |
| 9 | 1 | 61.0 | 68.3 | 8 / 35 | 4026 |
| 10 | 2 | 61.8 | 67.6 | 9 / 35 | 4485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 40 | 55% |
| et.Predator 1.8 | 32 | 19% |
| cx.BlestPain 1.41 | 27 | 93% |
| ahf.NanoAndrew .4 | 10 | 40% |
| nic.Nicator 2.4 | 9 | 44% |

Hadur died in 289 of 350 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 66 | 23% | 72 |
| oog.melee.Mercutio 1.0 | 61 | 21% | 80 |
| ahf.NanoAndrew .4 | 54 | 19% | 59 |
| cx.BlestPain 1.41 | 39 | 13% | 66 |
| nic.Nicator 2.4 | 36 | 12% | 40 |
| maribo.melee.BMV 0.1 | 24 | 8% | 24 |
| goblin.Bender 2.4 | 4 | 1% | 4 |
| tex.Longbot 0.4 | 3 | 1% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 1% | 2 |

## Melee bench: F18

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 69.8 | 83 / 350 | 3.71 | 14.0% | 35746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.6 | 14.0% | 83 |
| hadur117.nano.SanaroT60 0.1 | 1.7 | 14.0% | 83 |
| agd.Mooserwirt2 2.7 | 3.3 | 12.8% | 75 |
| uji.DBH 1.1 | 4.0 | 11.6% | 34 |
| ratosh.Nobo 0.21 | 4.9 | 10.9% | 16 |
| spinnercat.Robovirus 2.718 | 5.6 | 10.4% | 20 |
| sigterm.Sigterm 1.0 | 7.1 | 8.4% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 7.9 | 7.0% | 5 |
| stelo.WangRobot 1.0 | 9.2 | 5.9% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 74.9 | 9 / 35 | 3925 |
| 2 | 1 | 60.1 | 71.7 | 7 / 35 | 3353 |
| 3 | 3 | 57.3 | 63.2 | 6 / 35 | 3198 |
| 4 | 3 | 58.2 | 65.1 | 7 / 35 | 3190 |
| 5 | 2 | 62.1 | 73.7 | 8 / 35 | 3937 |
| 6 | 1 | 61.4 | 71.1 | 11 / 35 | 3764 |
| 7 | 2 | 59.7 | 68.6 | 8 / 35 | 3319 |
| 8 | 1 | 61.1 | 73.7 | 8 / 35 | 3536 |
| 9 | 2 | 60.4 | 69.2 | 9 / 35 | 3731 |
| 10 | 1 | 60.2 | 67.3 | 10 / 35 | 3793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 36% |
| agd.Mooserwirt2 2.7 | 28 | 50% |
| spinnercat.Robovirus 2.718 | 24 | 79% |
| uji.DBH 1.1 | 21 | 48% |
| ratosh.Nobo 0.21 | 14 | 71% |
| sigterm.Sigterm 1.0 | 12 | 33% |
| stelo.WangRobot 1.0 | 9 | 56% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 75% |

Hadur died in 268 of 350 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 82 | 31% | 98 |
| agd.Mooserwirt2 2.7 | 45 | 17% | 64 |
| ratosh.Nobo 0.21 | 40 | 15% | 51 |
| uji.DBH 1.1 | 29 | 11% | 40 |
| spinnercat.Robovirus 2.718 | 24 | 9% | 36 |
| sigterm.Sigterm 1.0 | 17 | 6% | 21 |
| stelo.WangRobot 1.0 | 12 | 4% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 4% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 3% | 9 |

## Melee bench: F19

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.7 | 81 / 350 | 2.83 | 15.8% | 42328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.8 | 16.1% | 130 |
| davidalves.net.DuelistMiniMelee 1.2 | 1.9 | 16.3% | 103 |
| hadur117.nano.SanaroT60 0.1 | 2.3 | 15.8% | 81 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 10.9% | 11 |
| erdnis.Rover 0.3 | 4.9 | 10.1% | 7 |
| patson.PatsonTestBot 1.0 | 5.9 | 8.8% | 4 |
| mbh.Mbh 0.1 | 7.2 | 7.8% | 0 |
| pac.ABC 2.1 | 7.8 | 7.3% | 13 |
| pbg.R2D2 1.0 | 8.9 | 6.0% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 81.9 | 10 / 35 | 4194 |
| 2 | 2 | 64.6 | 77.8 | 8 / 35 | 4069 |
| 3 | 2 | 65.9 | 82.5 | 9 / 35 | 4198 |
| 4 | 2 | 65.8 | 81.3 | 8 / 35 | 4391 |
| 5 | 3 | 63.8 | 76.5 | 4 / 35 | 4247 |
| 6 | 2 | 65.8 | 81.6 | 6 / 35 | 4610 |
| 7 | 3 | 64.3 | 76.2 | 8 / 35 | 4206 |
| 8 | 3 | 63.3 | 75.2 | 6 / 35 | 4114 |
| 9 | 1 | 66.3 | 84.1 | 11 / 35 | 4211 |
| 10 | 3 | 65.4 | 79.4 | 11 / 35 | 4088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 97 | 47% |
| davidalves.net.DuelistMiniMelee 1.2 | 72 | 15% |
| erdnis.Rover 0.3 | 12 | 75% |
| krillr.mini.JointStrike 2.0.0 | 12 | 75% |
| pbg.R2D2 1.0 | 5 | 80% |
| pac.ABC 2.1 | 3 | 0% |
| patson.PatsonTestBot 1.0 | 3 | 33% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 271 of 350 rounds, at a mean tick of 1059. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 118 | 44% | 163 |
| mld.Infinity 2.2 | 70 | 26% | 45 |
| patson.PatsonTestBot 1.0 | 25 | 9% | 33 |
| krillr.mini.JointStrike 2.0.0 | 23 | 8% | 35 |
| erdnis.Rover 0.3 | 15 | 6% | 33 |
| pac.ABC 2.1 | 8 | 3% | 10 |
| pbg.R2D2 1.0 | 7 | 3% | 13 |
| mbh.Mbh 0.1 | 5 | 2% | 15 |

## Melee bench: F20

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 68.2 | 49 / 350 | 3.87 | 13.4% | 36508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.9% | 157 |
| hadur117.nano.SanaroT60 0.1 | 2.3 | 13.4% | 49 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.3% | 33 |
| fwb.Nine 1.0.1 | 3.8 | 11.5% | 45 |
| catcat20.Rabbit 0.001 | 5.3 | 9.9% | 33 |
| m3thos.mini.Eva01 0.5.5 | 6.6 | 8.6% | 9 |
| bayen.nut.Squirrel 1.615 | 6.8 | 8.2% | 14 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 8.5% | 6 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 70.2 | 5 / 35 | 3882 |
| 2 | 2 | 62.6 | 74.9 | 6 / 35 | 3997 |
| 3 | 2 | 62.3 | 73.3 | 6 / 35 | 4052 |
| 4 | 2 | 59.0 | 66.7 | 4 / 35 | 3450 |
| 5 | 3 | 56.6 | 61.6 | 5 / 35 | 3195 |
| 6 | 3 | 56.1 | 61.6 | 1 / 35 | 3296 |
| 7 | 3 | 60.8 | 70.5 | 7 / 35 | 3511 |
| 8 | 2 | 60.1 | 67.9 | 5 / 35 | 3764 |
| 9 | 2 | 60.1 | 68.3 | 5 / 35 | 3751 |
| 10 | 2 | 59.4 | 66.7 | 5 / 35 | 3610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 66 | 32% |
| fwb.Nine 1.0.1 | 15 | 53% |
| catcat20.Rabbit 0.001 | 13 | 38% |
| nz.jdc.nano.GridFu 1.0 | 12 | 33% |
| bayen.nut.Squirrel 1.615 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 75% |
| m3thos.mini.Eva01 0.5.5 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 301 of 350 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 124 | 41% | 145 |
| fwb.Nine 1.0.1 | 63 | 21% | 68 |
| nz.jdc.nano.GridFu 1.0 | 35 | 12% | 42 |
| catcat20.Rabbit 0.001 | 22 | 7% | 26 |
| djdjdj.NanoSkunk10 1.0 | 16 | 5% | 20 |
| bayen.nut.Squirrel 1.615 | 16 | 5% | 19 |
| m3thos.mini.Eva01 0.5.5 | 15 | 5% | 17 |
| ntc.ControlledChaos 1.1.4 | 5 | 2% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 2% | 5 |

## Melee bench: F21

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.6 | 117 / 350 | 2.83 | 16.6% | 46651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.3 | 17.6% | 166 |
| hadur117.nano.SanaroT60 0.1 | 1.9 | 16.6% | 117 |
| dummy.mini.Scimitar 1.01 | 2.8 | 14.6% | 21 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.4% | 25 |
| eld.Hmm 1.0 | 5.5 | 8.4% | 23 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.5% | 3 |
| fire219.CatBot 1.0 | 7.9 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.1 | 5.8% | 0 |
| el.JumpShoot 0.2 | 8.1 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 9.9 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.1 | 17 / 35 | 4462 |
| 2 | 1 | 67.5 | 85.4 | 15 / 35 | 4806 |
| 3 | 3 | 63.1 | 70.5 | 9 / 35 | 4432 |
| 4 | 2 | 66.5 | 80.6 | 14 / 35 | 4738 |
| 5 | 1 | 68.5 | 85.7 | 13 / 35 | 5432 |
| 6 | 2 | 66.6 | 82.9 | 13 / 35 | 4679 |
| 7 | 3 | 63.6 | 73.7 | 8 / 35 | 4329 |
| 8 | 2 | 66.0 | 81.9 | 12 / 35 | 4539 |
| 9 | 2 | 64.3 | 76.5 | 8 / 35 | 4507 |
| 10 | 2 | 64.7 | 74.9 | 8 / 35 | 4727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 138 | 49% |
| dummy.mini.Scimitar 1.01 | 35 | 83% |
| cf.RiO.RiOx 4.2.1 | 16 | 56% |
| eld.Hmm 1.0 | 12 | 58% |
| oa.weak.BotherBot 0.1 | 5 | 80% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 236 of 350 rounds, at a mean tick of 1133. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 105 | 44% | 136 |
| dummy.mini.Scimitar 1.01 | 50 | 21% | 96 |
| cf.RiO.RiOx 4.2.1 | 41 | 17% | 56 |
| eld.Hmm 1.0 | 10 | 4% | 22 |
| oa.weak.BotherBot 0.1 | 10 | 4% | 17 |
| el.JumpShoot 0.2 | 6 | 3% | 9 |
| PSW.Relentless 0.1 | 5 | 2% | 5 |
| fire219.CatBot 1.0 | 4 | 2% | 4 |
| arthord.MannyPacquiao Beta | 3 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.3 | 82 / 350 | 2.96 | 15.4% | 38552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.7% | 151 |
| hadur117.nano.SanaroT60 0.1 | 2.3 | 15.4% | 82 |
| cre.Karolos 0.32 | 2.7 | 14.6% | 61 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 11.4% | 21 |
| sample.Walls 1.0 | 6.0 | 9.1% | 16 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 9.2% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 9.1% | 2 |
| cw.megas.Blade 0.8 | 7.4 | 8.3% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 79.7 | 10 / 35 | 3835 |
| 2 | 3 | 63.9 | 74.3 | 5 / 35 | 3857 |
| 3 | 3 | 63.4 | 72.7 | 8 / 35 | 3899 |
| 4 | 2 | 65.4 | 81.0 | 11 / 35 | 3592 |
| 5 | 2 | 66.8 | 85.1 | 9 / 35 | 3864 |
| 6 | 2 | 65.5 | 79.7 | 7 / 35 | 4033 |
| 7 | 2 | 65.1 | 79.0 | 9 / 35 | 4100 |
| 8 | 2 | 65.9 | 82.2 | 9 / 35 | 3800 |
| 9 | 3 | 62.9 | 73.7 | 3 / 35 | 3727 |
| 10 | 2 | 64.8 | 75.2 | 11 / 35 | 3845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 91 | 34% |
| cre.Karolos 0.32 | 36 | 42% |
| stelo.AreaTargetingBot 1.1 | 26 | 50% |
| sample.Walls 1.0 | 24 | 75% |
| stelo.RamTrackSurfer 1.2 | 11 | 36% |
| cw.megas.Blade 0.8 | 2 | 50% |

Hadur died in 268 of 350 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 125 | 47% | 159 |
| cre.Karolos 0.32 | 53 | 20% | 74 |
| stelo.AreaTargetingBot 1.1 | 33 | 12% | 38 |
| stelo.RamTrackSurfer 1.2 | 21 | 8% | 28 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 19 | 7% | 24 |
| sample.Walls 1.0 | 11 | 4% | 18 |
| cw.megas.Blade 0.8 | 6 | 2% | 7 |

## Melee bench: F24

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.3 | 57.9 | 44 / 350 | 4.79 | 11.4% | 30016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.4 | 14.4% | 82 |
| florent.XSeries.X2 0.12 | 2.1 | 14.0% | 73 |
| davidalves.Phoenix 0.54 | 3.3 | 12.9% | 65 |
| pedersen.Ugluk 1.1.1 | 3.5 | 13.0% | 53 |
| hadur117.nano.SanaroT60 0.1 | 4.8 | 11.4% | 44 |
| oog.melee.Corsair 1.0 | 6.4 | 9.4% | 12 |
| stelo.SoJNanoMelee 1.1 | 6.6 | 8.9% | 18 |
| lunchie.Lunchbox 0.93 | 8.1 | 6.6% | 3 |
| as.FrankTheTank 1.3 | 9.1 | 5.0% | 0 |
| evd.X1 0.01 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.0 | 57.5 | 6 / 35 | 3035 |
| 2 | 5 | 55.9 | 59.0 | 6 / 35 | 2962 |
| 3 | 5 | 56.0 | 60.0 | 5 / 35 | 2852 |
| 4 | 6 | 53.0 | 52.4 | 3 / 35 | 2990 |
| 5 | 5 | 57.7 | 63.8 | 4 / 35 | 3276 |
| 6 | 5 | 56.4 | 59.4 | 6 / 35 | 3110 |
| 7 | 5 | 52.0 | 52.7 | 0 / 35 | 2750 |
| 8 | 5 | 53.4 | 53.7 | 4 / 35 | 2792 |
| 9 | 5 | 56.3 | 60.0 | 5 / 35 | 3174 |
| 10 | 3 | 56.1 | 60.3 | 5 / 35 | 3075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 21 | 48% |
| rz.GlowBlowMelee 1.4 | 21 | 38% |
| davidalves.Phoenix 0.54 | 12 | 67% |
| pedersen.Ugluk 1.1.1 | 10 | 80% |
| stelo.SoJNanoMelee 1.1 | 9 | 44% |
| oog.melee.Corsair 1.0 | 6 | 67% |
| lunchie.Lunchbox 0.93 | 1 | 0% |
| evd.X1 0.01 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 66 | 21% | 75 |
| rz.GlowBlowMelee 1.4 | 60 | 20% | 73 |
| pedersen.Ugluk 1.1.1 | 58 | 19% | 65 |
| davidalves.Phoenix 0.54 | 53 | 17% | 60 |
| stelo.SoJNanoMelee 1.1 | 25 | 8% | 27 |
| oog.melee.Corsair 1.0 | 19 | 6% | 22 |
| lunchie.Lunchbox 0.93 | 14 | 5% | 15 |
| as.FrankTheTank 1.3 | 6 | 2% | 7 |
| evd.X1 0.01 | 6 | 2% | 6 |

## Melee bench: F25

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.5 | 45 / 350 | 3.93 | 13.1% | 30765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 14.4% | 83 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.5% | 70 |
| hadur117.nano.SanaroT60 0.1 | 2.6 | 13.1% | 45 |
| jdw.Hurricane 1.4 | 3.8 | 12.0% | 57 |
| gre.svman4.Morfeas 1.4.1 | 4.6 | 11.0% | 37 |
| gjr.Cephalosporin 0.1 | 6.4 | 9.2% | 33 |
| ds.Oo 2.2 | 6.8 | 8.7% | 21 |
| awesomeness.Elite 1.0 | 8.3 | 6.9% | 6 |
| adt.Ar2 1.1 | 8.5 | 6.7% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 61.3 | 4 / 35 | 3005 |
| 2 | 2 | 61.2 | 73.3 | 7 / 35 | 3224 |
| 3 | 2 | 59.2 | 69.8 | 6 / 35 | 2967 |
| 4 | 3 | 59.6 | 67.9 | 6 / 35 | 3080 |
| 5 | 2 | 60.9 | 73.0 | 5 / 35 | 3273 |
| 6 | 5 | 55.7 | 62.5 | 2 / 35 | 2657 |
| 7 | 2 | 57.8 | 64.8 | 4 / 35 | 3088 |
| 8 | 1 | 59.7 | 71.4 | 6 / 35 | 3014 |
| 9 | 3 | 56.8 | 62.5 | 0 / 35 | 3335 |
| 10 | 2 | 59.1 | 68.3 | 5 / 35 | 3122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 42 | 21% |
| voidious.micro.BlitzBat 1.05 | 32 | 16% |
| jdw.Hurricane 1.4 | 22 | 50% |
| gre.svman4.Morfeas 1.4.1 | 20 | 45% |
| gjr.Cephalosporin 0.1 | 12 | 25% |
| ds.Oo 2.2 | 5 | 40% |
| adt.Ar2 1.1 | 4 | 75% |
| amk.ChumbaMini 0.2 | 1 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 82 | 27% | 94 |
| jdw.Hurricane 1.4 | 64 | 21% | 72 |
| voidious.micro.BlitzBat 1.05 | 60 | 20% | 67 |
| gre.svman4.Morfeas 1.4.1 | 30 | 10% | 36 |
| gjr.Cephalosporin 0.1 | 22 | 7% | 25 |
| ds.Oo 2.2 | 20 | 7% | 22 |
| adt.Ar2 1.1 | 13 | 4% | 17 |
| awesomeness.Elite 1.0 | 9 | 3% | 10 |
| amk.ChumbaMini 0.2 | 6 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 70.4 | 42 / 350 | 3.67 | 13.6% | 39873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.1 | 16.9% | 143 |
| hadur117.nano.SanaroT60 0.1 | 2.5 | 13.6% | 42 |
| shu.nitro.LENIN .T34 | 3.1 | 13.0% | 72 |
| lrem.Spectre 0.4.4 | 3.7 | 12.4% | 53 |
| gh.mini.GrubbmOne 1.0 | 5.4 | 10.6% | 16 |
| js.PinBall 1.6 | 5.5 | 10.9% | 11 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.2% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 6 |
| sample.SpinBot 1.0 | 9.0 | 5.0% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 69.8 | 1 / 35 | 4086 |
| 2 | 3 | 61.3 | 70.8 | 3 / 35 | 4099 |
| 3 | 2 | 61.4 | 69.8 | 4 / 35 | 4188 |
| 4 | 2 | 61.2 | 72.1 | 3 / 35 | 4121 |
| 5 | 4 | 58.4 | 64.8 | 3 / 35 | 3451 |
| 6 | 2 | 62.0 | 70.2 | 9 / 35 | 4053 |
| 7 | 2 | 61.0 | 71.4 | 3 / 35 | 4085 |
| 8 | 2 | 60.8 | 71.1 | 5 / 35 | 3802 |
| 9 | 4 | 60.7 | 67.3 | 4 / 35 | 3994 |
| 10 | 2 | 63.3 | 76.5 | 7 / 35 | 3994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 55 | 13% |
| lrem.Spectre 0.4.4 | 34 | 47% |
| shu.nitro.LENIN .T34 | 31 | 23% |
| gh.mini.GrubbmOne 1.0 | 9 | 11% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 63% |
| js.PinBall 1.6 | 6 | 50% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 50% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 106 | 34% | 115 |
| shu.nitro.LENIN .T34 | 62 | 20% | 72 |
| lrem.Spectre 0.4.4 | 42 | 14% | 49 |
| gh.mini.GrubbmOne 1.0 | 40 | 13% | 42 |
| js.PinBall 1.6 | 26 | 8% | 30 |
| jaybot.adv.bots.JayBot 2.0 | 14 | 5% | 20 |
| fullsail.LaxativeTeaTwo 1.0 | 11 | 4% | 15 |
| sample.SpinBot 1.0 | 7 | 2% | 7 |

## Melee bench: F27

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 65.7 | 67 / 350 | 4.08 | 13.0% | 33034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 2.1 | 14.5% | 118 |
| hadur117.nano.SanaroT60 0.1 | 2.6 | 13.0% | 67 |
| wee.Gem 1.8.4 | 3.4 | 12.1% | 80 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 11.8% | 40 |
| EH.Eagle 1.0.6 | 3.8 | 11.6% | 27 |
| techdude.kombat.FlamingKombat 1.5 | 6.4 | 9.2% | 8 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.6% | 9 |
| joe.ADinosaur 1.0 | 7.2 | 8.6% | 5 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.9% | 1 |
| cs.Grudge 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.9 | 45.7 | 2 / 35 | 3683 |
| 2 | 1 | 62.5 | 77.5 | 12 / 35 | 3196 |
| 3 | 3 | 58.2 | 66.3 | 6 / 35 | 3090 |
| 4 | 2 | 58.1 | 66.0 | 5 / 35 | 3071 |
| 5 | 1 | 62.3 | 75.6 | 10 / 35 | 3677 |
| 6 | 5 | 50.8 | 41.0 | 3 / 35 | 3668 |
| 7 | 2 | 61.4 | 75.6 | 6 / 35 | 3379 |
| 8 | 2 | 58.6 | 69.2 | 7 / 35 | 2737 |
| 9 | 3 | 57.6 | 65.1 | 5 / 35 | 3205 |
| 10 | 2 | 61.8 | 75.6 | 11 / 35 | 3328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 50 | 48% |
| EH.Eagle 1.0.6 | 30 | 70% |
| wee.Gem 1.8.4 | 25 | 32% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 46% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 71% |
| joe.ADinosaur 1.0 | 2 | 50% |
| throxbot.ThroxBot 0.1 | 2 | 50% |

Hadur died in 285 of 350 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 66 | 23% | 89 |
| wee.Gem 1.8.4 | 47 | 16% | 58 |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 16% | 50 |
| joe.ADinosaur 1.0 | 31 | 11% | 31 |
| EH.Eagle 1.0.6 | 25 | 9% | 46 |
| caimano.Furia_Ceca 0.22 | 22 | 8% | 24 |
| throxbot.ThroxBot 0.1 | 19 | 7% | 20 |
| cs.Grudge 1.0 | 15 | 5% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 13 | 5% | 19 |
2 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 77.4 | 119 / 350 | 3.04 | 15.5% | 36721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.1% | 110 |
| hadur117.nano.SanaroT60 0.1 | 1.7 | 15.5% | 119 |
| uji.Antique 1.0 | 3.0 | 13.0% | 57 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 11.3% | 27 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.4% | 12 |
| amk.ChumbaWumba 0.3 | 6.0 | 9.0% | 10 |
| ahr.ice.Ice 1.0.2 | 7.1 | 7.6% | 6 |
| matt.advanced.Katana 1.0 | 8.2 | 6.6% | 8 |
| stelo.PianistNano 1.2 | 8.9 | 5.4% | 0 |
| stelo.Lifestealer 1.0 | 9.6 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 85.1 | 16 / 35 | 3819 |
| 2 | 2 | 60.5 | 69.8 | 6 / 35 | 3558 |
| 3 | 1 | 65.6 | 81.9 | 15 / 35 | 4109 |
| 4 | 2 | 62.9 | 75.6 | 10 / 35 | 3618 |
| 5 | 2 | 61.6 | 72.7 | 8 / 35 | 3518 |
| 6 | 2 | 64.2 | 77.1 | 13 / 35 | 4098 |
| 7 | 2 | 62.2 | 74.3 | 12 / 35 | 3351 |
| 8 | 2 | 62.5 | 75.9 | 12 / 35 | 3323 |
| 9 | 1 | 65.8 | 83.8 | 17 / 35 | 3703 |
| 10 | 2 | 63.5 | 77.5 | 10 / 35 | 3624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 105 | 62% |
| uji.Antique 1.0 | 41 | 63% |
| qohnil.blot.BlotBot 3.61 | 22 | 45% |
| pfvicm.Sobieski 7.2.3b | 12 | 58% |
| matt.advanced.Katana 1.0 | 6 | 67% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 50% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 233 of 350 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 76 | 33% | 128 |
| pfvicm.Sobieski 7.2.3b | 44 | 19% | 48 |
| uji.Antique 1.0 | 33 | 14% | 63 |
| amk.ChumbaWumba 0.3 | 30 | 13% | 34 |
| qohnil.blot.BlotBot 3.61 | 25 | 11% | 40 |
| ahr.ice.Ice 1.0.2 | 13 | 6% | 16 |
| matt.advanced.Katana 1.0 | 6 | 3% | 13 |
| stelo.Lifestealer 1.0 | 5 | 2% | 6 |
| stelo.PianistNano 1.2 | 1 | 0% | 1 |

## Melee bench: F29

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 63.6 | 50 / 350 | 4.28 | 13.0% | 34986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.4 | 16.2% | 132 |
| deewiant.Anomaly 0.2 | 1.8 | 15.3% | 95 |
| myl.micro.Troodon 1.10 | 3.4 | 12.9% | 27 |
| hadur117.nano.SanaroT60 0.1 | 3.5 | 13.0% | 50 |
| jok.PheonixM 0.1.2 | 4.9 | 11.1% | 19 |
| DBall.Anarchy 0.1 | 6.5 | 8.1% | 20 |
| ph.melee.ArcherME 0.3 | 6.6 | 8.0% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.9% | 1 |
| ap.Frederick 1.1 | 9.1 | 5.0% | 6 |
| jangs.ns51 1.0 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.3 | 64.4 | 5 / 35 | 3292 |
| 2 | 5 | 55.4 | 54.6 | 2 / 35 | 3262 |
| 3 | 3 | 61.9 | 68.3 | 9 / 35 | 3830 |
| 4 | 2 | 60.5 | 66.3 | 5 / 35 | 3839 |
| 5 | 3 | 62.5 | 72.7 | 8 / 35 | 3612 |
| 6 | 4 | 58.2 | 62.5 | 1 / 35 | 3363 |
| 7 | 3 | 57.2 | 57.8 | 5 / 35 | 3150 |
| 8 | 3 | 60.1 | 65.7 | 9 / 35 | 3340 |
| 9 | 4 | 58.6 | 62.9 | 4 / 35 | 3445 |
| 10 | 4 | 58.4 | 60.6 | 2 / 35 | 3853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 42 | 31% |
| zyx.mega.YersiniaPestis 3.1 | 38 | 42% |
| myl.micro.Troodon 1.10 | 26 | 58% |
| jok.PheonixM 0.1.2 | 6 | 33% |
| DBall.Anarchy 0.1 | 6 | 33% |
| ap.Frederick 1.1 | 2 | 50% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 0% |

Hadur died in 301 of 350 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 101 | 34% | 115 |
| zyx.mega.YersiniaPestis 3.1 | 77 | 26% | 94 |
| myl.micro.Troodon 1.10 | 49 | 16% | 61 |
| jok.PheonixM 0.1.2 | 35 | 12% | 38 |
| fullsail.TimbotNoPrediction 1.0 | 14 | 5% | 14 |
| DBall.Anarchy 0.1 | 11 | 4% | 13 |
| ph.melee.ArcherME 0.3 | 8 | 3% | 9 |
| jangs.ns51 1.0 | 5 | 2% | 6 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F30

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.3 | 53.6 | 26 / 350 | 5.18 | 10.4% | 28011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.9 | 14.1% | 95 |
| catcat20.Matcha 0.006 | 2.1 | 14.3% | 82 |
| oog.melee.Capulet 1.2 | 2.5 | 13.7% | 71 |
| stelo.PastFuture 2.3.2 | 3.5 | 12.9% | 41 |
| hadur117.nano.SanaroT60 0.1 | 5.3 | 10.4% | 26 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.4% | 20 |
| fowl3628800.LightningBolt 2.6.0 | 7.6 | 7.9% | 6 |
| ntc.Opposite 1.5 | 7.9 | 7.6% | 3 |
| tripphippy.Alice 1.1 | 8.1 | 7.3% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.0 | 50.2 | 3 / 35 | 2590 |
| 2 | 5 | 50.5 | 47.9 | 0 / 35 | 2769 |
| 3 | 7 | 50.5 | 47.0 | 3 / 35 | 2713 |
| 4 | 5 | 53.2 | 54.6 | 2 / 35 | 2687 |
| 5 | 5 | 54.9 | 56.2 | 4 / 35 | 2963 |
| 6 | 5 | 51.8 | 51.4 | 1 / 35 | 2641 |
| 7 | 5 | 56.5 | 60.0 | 6 / 35 | 2989 |
| 8 | 6 | 52.8 | 54.0 | 0 / 35 | 2681 |
| 9 | 5 | 54.2 | 54.3 | 2 / 35 | 3154 |
| 10 | 5 | 56.1 | 60.3 | 5 / 35 | 2824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 18 | 17% |
| catcat20.Matcha 0.006 | 14 | 43% |
| stelo.PastFuture 2.3.2 | 13 | 85% |
| oog.melee.Capulet 1.2 | 10 | 10% |
| intruder.PrairieWolf 2.61 | 5 | 60% |
| tripphippy.Alice 1.1 | 3 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 0% |

Hadur died in 324 of 350 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 72 | 22% | 77 |
| catcat20.Matcha 0.006 | 60 | 19% | 69 |
| stelo.PastFuture 2.3.2 | 46 | 14% | 55 |
| oog.melee.Capulet 1.2 | 40 | 12% | 42 |
| intruder.PrairieWolf 2.61 | 31 | 10% | 32 |
| fowl3628800.LightningBolt 2.6.0 | 26 | 8% | 26 |
| ntc.Opposite 1.5 | 24 | 7% | 24 |
| tripphippy.Alice 1.1 | 20 | 6% | 20 |
| GarmBox.Anger 1.0 | 5 | 2% | 5 |

## Melee bench: F31

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.5 | 56.8 | 13 / 350 | 4.89 | 10.8% | 27863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.9% | 216 |
| gh.mini.Griezel 0.2 | 2.6 | 13.3% | 65 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 12.6% | 21 |
| d414.nano.Quantum 1.0.0 | 3.8 | 11.9% | 28 |
| hadur117.nano.SanaroT60 0.1 | 5.0 | 10.8% | 13 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.1% | 11 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.9% | 0 |
| fm.mammillarias 1.3 | 8.1 | 6.2% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.1 | 5.3% | 1 |
| tlp.ThreeLeggedPig 1 | 9.2 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.6 | 54.0 | 0 / 35 | 2461 |
| 2 | 5 | 55.0 | 56.2 | 1 / 35 | 2943 |
| 3 | 6 | 52.5 | 51.7 | 3 / 35 | 2687 |
| 4 | 4 | 57.2 | 62.5 | 2 / 35 | 2995 |
| 5 | 5 | 55.6 | 61.3 | 0 / 35 | 2644 |
| 6 | 5 | 53.8 | 54.9 | 3 / 35 | 2738 |
| 7 | 5 | 53.8 | 55.6 | 2 / 35 | 2652 |
| 8 | 4 | 56.8 | 62.5 | 1 / 35 | 2957 |
| 9 | 5 | 55.5 | 58.1 | 1 / 35 | 2964 |
| 10 | 6 | 52.2 | 51.4 | 0 / 35 | 2822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 41 | 20% |
| gh.mini.Griezel 0.2 | 17 | 0% |
| d414.nano.Quantum 1.0.0 | 7 | 14% |
| spinnercat.micro.Tyger 0.1 | 6 | 17% |
| gh.nano.Grofvuil 0.2 | 5 | 20% |
| fm.mammillarias 1.3 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 338 of 350 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 81 | 24% | 89 |
| spinnercat.micro.Tyger 0.1 | 72 | 21% | 73 |
| gh.mini.Griezel 0.2 | 71 | 21% | 73 |
| d414.nano.Quantum 1.0.0 | 49 | 14% | 49 |
| gh.nano.Grofvuil 0.2 | 22 | 7% | 23 |
| fm.mammillarias 1.3 | 17 | 5% | 17 |
| timmit.nano.TimDog 0.33 | 14 | 4% | 14 |
| Gecko.ultimateGeckoBot 1.0 | 8 | 2% | 9 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 71.7 | 98 / 350 | 3.55 | 14.2% | 36419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.2 | 15.6% | 120 |
| hadur117.nano.SanaroT60 0.1 | 1.9 | 14.2% | 98 |
| apc.botM 3.0 | 3.2 | 12.4% | 49 |
| lxx.ConceptA 0.8 | 4.3 | 10.8% | 9 |
| vjik.UnViolation 1.1 | 4.7 | 11.0% | 34 |
| bayen.UbaMicro 1.4 | 5.8 | 9.5% | 15 |
| panzer.Panzer 0.2 | 7.6 | 7.4% | 2 |
| yk.JahMicro 1.0 | 7.8 | 7.3% | 10 |
| conscience.Electron 1.3g | 8.9 | 6.3% | 2 |
| donjezza.Jezza 1.0 | 9.6 | 5.5% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 75.9 | 10 / 35 | 3482 |
| 2 | 2 | 61.1 | 69.8 | 9 / 35 | 3980 |
| 3 | 3 | 59.2 | 66.3 | 10 / 35 | 3414 |
| 4 | 2 | 61.0 | 71.7 | 10 / 35 | 3535 |
| 5 | 1 | 61.1 | 72.7 | 12 / 35 | 3558 |
| 6 | 2 | 58.6 | 64.4 | 7 / 35 | 3534 |
| 7 | 1 | 62.6 | 75.2 | 12 / 35 | 4051 |
| 8 | 2 | 60.3 | 71.4 | 7 / 35 | 3378 |
| 9 | 2 | 61.4 | 73.0 | 10 / 35 | 3815 |
| 10 | 2 | 62.5 | 76.5 | 11 / 35 | 3672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 74 | 42% |
| apc.botM 3.0 | 34 | 71% |
| lxx.ConceptA 0.8 | 20 | 90% |
| vjik.UnViolation 1.1 | 20 | 55% |
| yk.JahMicro 1.0 | 12 | 67% |
| donjezza.Jezza 1.0 | 8 | 50% |
| bayen.UbaMicro 1.4 | 4 | 25% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 252 of 350 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 83 | 33% | 118 |
| lxx.ConceptA 0.8 | 48 | 19% | 55 |
| vjik.UnViolation 1.1 | 31 | 12% | 47 |
| apc.botM 3.0 | 28 | 11% | 53 |
| bayen.UbaMicro 1.4 | 22 | 9% | 26 |
| panzer.Panzer 0.2 | 12 | 5% | 12 |
| yk.JahMicro 1.0 | 11 | 4% | 19 |
| conscience.Electron 1.3g | 11 | 4% | 11 |
| donjezza.Jezza 1.0 | 6 | 2% | 8 |

## Melee bench: F33

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 65.5 | 52 / 350 | 4.11 | 13.2% | 36098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.6% | 131 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 13.8% | 62 |
| hadur117.nano.SanaroT60 0.1 | 3.0 | 13.2% | 52 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.8% | 44 |
| labg.Cataclysm 2.05 | 4.8 | 11.0% | 41 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.2% | 14 |
| zyx.micro.Ant 1.1 | 8.4 | 5.7% | 0 |
| sanja.First 0.1 | 9.1 | 4.9% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 68.6 | 4 / 35 | 3837 |
| 2 | 3 | 59.6 | 64.8 | 5 / 35 | 3423 |
| 3 | 2 | 60.9 | 68.3 | 8 / 35 | 3730 |
| 4 | 3 | 58.4 | 63.5 | 5 / 35 | 3432 |
| 5 | 4 | 58.4 | 61.9 | 7 / 35 | 3535 |
| 6 | 3 | 60.1 | 66.3 | 5 / 35 | 3406 |
| 7 | 3 | 58.7 | 64.4 | 5 / 35 | 3315 |
| 8 | 2 | 61.5 | 70.2 | 4 / 35 | 4112 |
| 9 | 4 | 58.4 | 62.2 | 4 / 35 | 3477 |
| 10 | 3 | 59.9 | 64.8 | 5 / 35 | 3831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 42 | 24% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 55% |
| gre.svman4.Leonidas 1.3.2 | 24 | 50% |
| labg.Cataclysm 2.05 | 14 | 29% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 67% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| sanja.First 0.1 | 2 | 50% |

Hadur died in 299 of 350 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 109 | 36% | 119 |
| gre.svman4.Leonidas 1.3.2 | 49 | 16% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 16% | 71 |
| labg.Cataclysm 2.05 | 34 | 11% | 39 |
| kinsen.melee.Angsaichmophobia 1.8c | 26 | 9% | 25 |
| baal.nano.N 1.42 | 18 | 6% | 19 |
| sanja.First 0.1 | 7 | 2% | 7 |
| zyx.micro.Ant 1.1 | 6 | 2% | 9 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 1% | 3 |

## Melee bench: F34

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 69.5 | 47 / 350 | 3.74 | 13.8% | 40510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.4 | 17.7% | 146 |
| kid.Gladiator .7.2 | 1.6 | 17.2% | 113 |
| hadur117.nano.SanaroT60 0.1 | 3.0 | 13.8% | 47 |
| jcs.Seth 1.8 | 4.2 | 11.9% | 30 |
| tcf.Reach 3 | 5.1 | 10.5% | 10 |
| cli.Dancer 1.1 | 5.7 | 9.7% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.9% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 69.2 | 5 / 35 | 3894 |
| 2 | 3 | 62.3 | 71.7 | 5 / 35 | 4176 |
| 3 | 3 | 62.4 | 68.3 | 5 / 35 | 4332 |
| 4 | 3 | 63.1 | 71.7 | 4 / 35 | 4113 |
| 5 | 3 | 61.5 | 68.9 | 6 / 35 | 3785 |
| 6 | 3 | 63.2 | 71.1 | 8 / 35 | 4138 |
| 7 | 3 | 60.4 | 65.7 | 3 / 35 | 3942 |
| 8 | 3 | 61.4 | 67.6 | 4 / 35 | 4090 |
| 9 | 3 | 61.2 | 68.9 | 3 / 35 | 3893 |
| 10 | 3 | 62.1 | 72.1 | 4 / 35 | 4147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 67 | 48% |
| kid.Gladiator .7.2 | 54 | 11% |
| jcs.Seth 1.8 | 12 | 42% |
| tcf.Reach 3 | 3 | 67% |
| cli.Dancer 1.1 | 2 | 0% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 304 of 350 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 125 | 41% | 129 |
| stelo.Spread 0.9 | 94 | 31% | 128 |
| jcs.Seth 1.8 | 27 | 9% | 33 |
| tcf.Reach 3 | 20 | 7% | 21 |
| cli.Dancer 1.1 | 19 | 6% | 20 |
| ratosh.Wesco 1.4 | 10 | 3% | 10 |
| amk.Punbot.Punbot 0.01 | 6 | 2% | 6 |
| sample.VelociRobot 1.0 | 2 | 1% | 2 |
| sample.RamFire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 65.2 | 14 / 350 | 4.13 | 11.9% | 27254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 277 |
| gh.mini.Gruwel 0.9 | 2.9 | 13.1% | 31 |
| rz.HawkOnFire 0.1 | 3.5 | 12.6% | 11 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.6 | 12.3% | 18 |
| hadur117.nano.SanaroT60 0.1 | 4.0 | 11.9% | 14 |
| wit.Chuliath 1.0 | 6.7 | 6.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.9 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.6 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.9 | 63.2 | 1 / 35 | 2551 |
| 2 | 2 | 60.8 | 73.7 | 4 / 35 | 2998 |
| 3 | 5 | 58.0 | 66.0 | 1 / 35 | 2825 |
| 4 | 2 | 59.7 | 71.1 | 2 / 35 | 2931 |
| 5 | 4 | 58.0 | 65.1 | 2 / 35 | 2828 |
| 6 | 3 | 59.0 | 69.8 | 1 / 35 | 2900 |
| 7 | 5 | 55.5 | 61.6 | 0 / 35 | 2471 |
| 8 | 5 | 56.4 | 61.0 | 2 / 35 | 2655 |
| 9 | 5 | 55.8 | 61.3 | 1 / 35 | 2612 |
| 10 | 5 | 54.6 | 59.0 | 0 / 35 | 2483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 61 | 5% |
| rz.HawkOnFire 0.1 | 12 | 58% |
| gh.mini.Gruwel 0.9 | 12 | 17% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 50% |

Hadur died in 336 of 350 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 121 | 36% | 122 |
| rz.HawkOnFire 0.1 | 71 | 21% | 74 |
| gh.mini.Gruwel 0.9 | 57 | 17% | 61 |
| dmh.robocode.robot.BlackDeath 9.2 | 46 | 14% | 50 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 10 | 3% | 11 |
| myl.nano.KomoriNinja 1.1 | 10 | 3% | 10 |
| dans.Cinnamon 1.2 | 9 | 3% | 9 |
| wit.Chuliath 1.0 | 7 | 2% | 8 |
| stelo.MyAgileRobot 0.2 | 5 | 1% | 5 |

## Melee bench: F36

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 68.6 | 94 / 350 | 3.83 | 14.0% | 35800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroT60 0.1 | 1.2 | 14.0% | 94 |
| alpha.RainingFire 1.0 | 2.4 | 12.8% | 67 |
| bzdp.Pansy 2.1 | 3.3 | 12.1% | 54 |
| bvh.micro.Freya 0.3 | 4.3 | 11.3% | 40 |
| m3thos.Eva02 0.7.1 | 4.9 | 10.9% | 28 |
| mz.Cork 0.1 | 5.7 | 10.8% | 27 |
| bvh.mini.Fenrir 0.39 | 6.2 | 10.0% | 13 |
| squidM.TentalceMeleeNano 1.1 | 8.4 | 6.8% | 8 |
| dl.BetterWalls 1.0 | 8.7 | 6.8% | 5 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.6% | 16 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 69.2 | 13 / 35 | 3929 |
| 2 | 2 | 59.0 | 67.0 | 7 / 35 | 3203 |
| 3 | 1 | 59.8 | 68.9 | 7 / 35 | 3276 |
| 4 | 1 | 59.6 | 67.6 | 8 / 35 | 3723 |
| 5 | 1 | 62.9 | 71.4 | 16 / 35 | 4105 |
| 6 | 1 | 62.6 | 75.2 | 10 / 35 | 3764 |
| 7 | 1 | 60.8 | 68.9 | 11 / 35 | 3516 |
| 8 | 1 | 59.1 | 67.0 | 8 / 35 | 3321 |
| 9 | 1 | 59.0 | 66.3 | 8 / 35 | 3457 |
| 10 | 2 | 58.0 | 64.4 | 6 / 35 | 3506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 34 | 53% |
| bvh.micro.Freya 0.3 | 27 | 63% |
| alpha.RainingFire 1.0 | 24 | 58% |
| mz.Cork 0.1 | 22 | 68% |
| m3thos.Eva02 0.7.1 | 18 | 44% |
| bvh.mini.Fenrir 0.39 | 16 | 75% |
| dl.BetterWalls 1.0 | 9 | 67% |
| squidM.TentalceMeleeNano 1.1 | 7 | 43% |
| sample.MyFirstRobot 1.0 | 2 | 50% |

Hadur died in 258 of 350 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| m3thos.Eva02 0.7.1 | 47 | 18% | 61 |
| alpha.RainingFire 1.0 | 46 | 18% | 60 |
| bzdp.Pansy 2.1 | 44 | 17% | 63 |
| bvh.micro.Freya 0.3 | 34 | 13% | 44 |
| mz.Cork 0.1 | 29 | 11% | 46 |
| bvh.mini.Fenrir 0.39 | 24 | 9% | 29 |
| dl.BetterWalls 1.0 | 16 | 6% | 25 |
| squidM.TentalceMeleeNano 1.1 | 14 | 5% | 17 |
| sample.MyFirstRobot 1.0 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 76.8 | 118 / 350 | 3.09 | 15.3% | 44229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroT60 0.1 | 1.0 | 15.3% | 118 |
| germ.TheMind .2 | 2.9 | 11.5% | 51 |
| agrach.Dalek 1.0 | 3.8 | 10.3% | 45 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.0 | 10.7% | 27 |
| EBBU.Sim2 1.02 | 4.7 | 10.0% | 22 |
| stelo.UntouchableNano 1.3 | 6.6 | 8.7% | 23 |
| mb.Beast 0.1 | 7.0 | 8.8% | 26 |
| skm.Ryubot 1.0 | 7.9 | 8.3% | 26 |
| lmk.ACPFinal 0.1 | 8.0 | 8.3% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 9.1 | 7.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 81.3 | 15 / 35 | 4487 |
| 2 | 1 | 62.1 | 76.5 | 11 / 35 | 4261 |
| 3 | 1 | 62.0 | 74.9 | 12 / 35 | 4594 |
| 4 | 1 | 61.3 | 74.9 | 10 / 35 | 4372 |
| 5 | 1 | 61.4 | 74.6 | 12 / 35 | 4218 |
| 6 | 1 | 63.7 | 83.5 | 10 / 35 | 4601 |
| 7 | 1 | 63.6 | 80.0 | 12 / 35 | 4960 |
| 8 | 1 | 60.1 | 71.7 | 9 / 35 | 4134 |
| 9 | 1 | 63.1 | 77.8 | 17 / 35 | 4434 |
| 10 | 1 | 60.2 | 72.7 | 10 / 35 | 4168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 35 | 46% |
| agrach.Dalek 1.0 | 32 | 59% |
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 57% |
| EBBU.Sim2 1.02 | 23 | 52% |
| skm.Ryubot 1.0 | 22 | 45% |
| mb.Beast 0.1 | 21 | 71% |
| stelo.UntouchableNano 1.3 | 18 | 89% |
| lmk.ACPFinal 0.1 | 16 | 75% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 234 of 350 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 51 | 22% | 61 |
| com.syncleus.robocode.Dreadnaught 0.1 | 39 | 17% | 59 |
| EBBU.Sim2 1.02 | 31 | 13% | 42 |
| agrach.Dalek 1.0 | 25 | 11% | 51 |
| skm.Ryubot 1.0 | 24 | 10% | 32 |
| mb.Beast 0.1 | 21 | 9% | 38 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 8% | 20 |
| lmk.ACPFinal 0.1 | 15 | 6% | 24 |
| stelo.UntouchableNano 1.3 | 9 | 4% | 21 |

## Melee bench: F38

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 62.0 | 32 / 350 | 4.42 | 11.9% | 31484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.1 | 16.3% | 147 |
| bvh.mini.Freya 0.55 | 2.5 | 13.5% | 47 |
| bts.mega.Gnarly 1.4 | 3.7 | 12.0% | 53 |
| hadur117.nano.SanaroT60 0.1 | 4.1 | 11.9% | 32 |
| cs.Wren 1.0 | 4.6 | 11.3% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 10.5% | 23 |
| kdf.KoulDestroyer 1.0 | 6.5 | 9.7% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.8% | 7 |
| matt.UnderDark3 2.4.34 | 9.4 | 4.1% | 1 |
| bzdp.BoxCar 2.0 | 9.6 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.3 | 63.2 | 1 / 35 | 3287 |
| 2 | 6 | 53.7 | 54.9 | 0 / 35 | 3018 |
| 3 | 5 | 55.3 | 59.7 | 1 / 35 | 2889 |
| 4 | 4 | 57.0 | 58.7 | 6 / 35 | 3382 |
| 5 | 4 | 57.7 | 64.8 | 5 / 35 | 3198 |
| 6 | 2 | 60.1 | 69.8 | 8 / 35 | 3375 |
| 7 | 6 | 56.1 | 61.9 | 2 / 35 | 2766 |
| 8 | 4 | 56.9 | 60.3 | 3 / 35 | 3223 |
| 9 | 4 | 57.3 | 61.9 | 3 / 35 | 3362 |
| 10 | 3 | 57.0 | 64.8 | 3 / 35 | 2984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 52 | 40% |
| bts.mega.Gnarly 1.4 | 13 | 8% |
| bvh.mini.Freya 0.55 | 11 | 27% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 0% |
| cs.Wren 1.0 | 8 | 38% |
| matt.UnderDark3 2.4.34 | 2 | 100% |
| kdf.KoulDestroyer 1.0 | 2 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 0% |

Hadur died in 318 of 350 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 88 | 28% | 107 |
| bvh.mini.Freya 0.55 | 58 | 18% | 60 |
| bts.mega.Gnarly 1.4 | 50 | 16% | 53 |
| cs.Wren 1.0 | 48 | 15% | 51 |
| davidalves.net.DuelistNanoMelee 1.01 | 30 | 9% | 31 |
| kdf.KoulDestroyer 1.0 | 29 | 9% | 32 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 3% | 8 |
| bzdp.BoxCar 2.0 | 4 | 1% | 4 |
| matt.UnderDark3 2.4.34 | 3 | 1% | 4 |

## Melee bench: F39

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 67.0 | 40 / 350 | 3.97 | 12.9% | 35646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 15.6% | 88 |
| az.Ololobot 0.2.4 | 2.2 | 13.9% | 127 |
| hadur117.nano.SanaroT60 0.1 | 2.8 | 12.9% | 40 |
| catcat20.Lambda 0.024 | 3.9 | 11.4% | 43 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 9.2% | 29 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.8% | 10 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.4% | 4 |
| gimp.GimpBot 0.1 | 7.3 | 8.0% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.6% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 67.9 | 5 / 35 | 3584 |
| 2 | 3 | 57.6 | 66.7 | 2 / 35 | 3179 |
| 3 | 3 | 56.8 | 62.9 | 3 / 35 | 3491 |
| 4 | 3 | 56.8 | 64.8 | 1 / 35 | 3424 |
| 5 | 3 | 57.9 | 64.4 | 4 / 35 | 3703 |
| 6 | 2 | 58.9 | 68.3 | 5 / 35 | 3703 |
| 7 | 3 | 57.4 | 65.4 | 4 / 35 | 3187 |
| 8 | 3 | 59.0 | 65.1 | 6 / 35 | 3968 |
| 9 | 2 | 59.1 | 69.8 | 6 / 35 | 3560 |
| 10 | 3 | 61.3 | 74.6 | 4 / 35 | 3847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 36 | 33% |
| az.Ololobot 0.2.4 | 35 | 9% |
| catcat20.Lambda 0.024 | 23 | 61% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 21% |
| winamp32.micro.MicroMacro 1.0 | 8 | 50% |
| gimp.GimpBot 0.1 | 3 | 67% |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 50% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |

Hadur died in 311 of 350 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 100 | 32% | 107 |
| stelo.SoRobotNanoMelee 1.2 | 50 | 16% | 54 |
| az.Ololobot 0.2.4 | 47 | 15% | 49 |
| catcat20.Lambda 0.024 | 40 | 13% | 53 |
| apollokidd.ApolloKidd 0.9 | 29 | 9% | 32 |
| winamp32.micro.MicroMacro 1.0 | 14 | 5% | 19 |
| gimp.GimpBot 0.1 | 13 | 4% | 17 |
| whitesquare.robots.SkynetAdvanced 1.1 | 10 | 3% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 8 | 3% | 8 |

## Melee bench: F41

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 66.9 | 50 / 350 | 3.98 | 12.9% | 32225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.8% | 157 |
| ary.Swarm 1.1 | 2.6 | 13.6% | 30 |
| lessonz.robocode.Oz 0.5.0 | 3.1 | 13.4% | 63 |
| hadur117.nano.SanaroT60 0.1 | 3.8 | 12.9% | 50 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.7% | 31 |
| shrub.Silver v048 | 6.1 | 8.9% | 6 |
| zyx.nano.Ant 1.1 | 6.9 | 7.8% | 2 |
| jsal.Jsalbot 1.0 | 8.3 | 6.1% | 7 |
| stelo.Mirror 1.1 | 8.7 | 5.9% | 4 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.0 | 67.6 | 4 / 35 | 3008 |
| 2 | 5 | 56.8 | 61.0 | 2 / 35 | 2967 |
| 3 | 3 | 58.8 | 65.1 | 5 / 35 | 3398 |
| 4 | 4 | 59.4 | 68.3 | 4 / 35 | 3177 |
| 5 | 5 | 58.2 | 63.8 | 3 / 35 | 3145 |
| 6 | 2 | 61.8 | 73.0 | 5 / 35 | 3542 |
| 7 | 3 | 60.4 | 70.2 | 8 / 35 | 3122 |
| 8 | 4 | 58.3 | 62.2 | 8 / 35 | 3232 |
| 9 | 5 | 57.9 | 62.9 | 6 / 35 | 3031 |
| 10 | 3 | 62.5 | 74.6 | 5 / 35 | 3603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 64 | 20% |
| lessonz.robocode.Oz 0.5.0 | 31 | 35% |
| ary.Swarm 1.1 | 24 | 58% |
| simonton.nano.MeleeSeed 1.8 | 17 | 53% |
| zyx.nano.Ant 1.1 | 2 | 50% |
| shrub.Silver v048 | 2 | 50% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 90 | 30% | 103 |
| ary.Swarm 1.1 | 57 | 19% | 75 |
| lessonz.robocode.Oz 0.5.0 | 50 | 17% | 58 |
| simonton.nano.MeleeSeed 1.8 | 41 | 14% | 49 |
| shrub.Silver v048 | 25 | 8% | 26 |
| zyx.nano.Ant 1.1 | 21 | 7% | 21 |
| stelo.Mirror 1.1 | 10 | 3% | 11 |
| acogdev.alpha 0.2 | 4 | 1% | 4 |
| jsal.Jsalbot 1.0 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 68.1 | 46 / 350 | 3.87 | 13.4% | 38034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 167 |
| maribo.mini.MiniQuester 0.1 | 2.7 | 14.2% | 49 |
| ara.Shera 0.88 | 2.8 | 14.5% | 67 |
| hadur117.nano.SanaroT60 0.1 | 3.5 | 13.4% | 46 |
| amz.NanoClone 1.41 | 5.1 | 9.1% | 7 |
| maribo.IotaCT 1.1 | 6.2 | 7.7% | 1 |
| dsw.StaticD 1.0 | 6.8 | 7.2% | 12 |
| stelo.MirrorMicro 1.0 | 8.6 | 5.8% | 1 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.6 | 70.8 | 6 / 35 | 3472 |
| 2 | 2 | 62.2 | 73.3 | 8 / 35 | 3978 |
| 3 | 4 | 61.4 | 70.2 | 6 / 35 | 4009 |
| 4 | 2 | 63.2 | 76.5 | 7 / 35 | 4200 |
| 5 | 4 | 57.9 | 60.3 | 3 / 35 | 3779 |
| 6 | 4 | 60.9 | 71.1 | 4 / 35 | 3806 |
| 7 | 4 | 56.5 | 59.4 | 1 / 35 | 3617 |
| 8 | 3 | 59.8 | 68.9 | 4 / 35 | 3618 |
| 9 | 4 | 58.8 | 64.4 | 4 / 35 | 3886 |
| 10 | 4 | 58.9 | 65.7 | 3 / 35 | 3669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 64 | 25% |
| ara.Shera 0.88 | 27 | 33% |
| maribo.mini.MiniQuester 0.1 | 26 | 73% |
| dsw.StaticD 1.0 | 4 | 25% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 0% |

Hadur died in 304 of 350 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 99 | 33% | 114 |
| ara.Shera 0.88 | 87 | 29% | 95 |
| maribo.mini.MiniQuester 0.1 | 62 | 20% | 83 |
| amz.NanoClone 1.41 | 24 | 8% | 24 |
| maribo.IotaCT 1.1 | 10 | 3% | 10 |
| dsw.StaticD 1.0 | 9 | 3% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 6 | 2% | 7 |
| stelo.MirrorMicro 1.0 | 5 | 2% | 5 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 60.6 | 20 / 350 | 4.54 | 11.7% | 31922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.5% | 267 |
| brainfade.melee.Dusk 0.44 | 2.4 | 13.1% | 36 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.6% | 16 |
| hadur117.nano.SanaroT60 0.1 | 3.8 | 11.7% | 20 |
| wcsv.melee.EngineerMelee 0.1 | 4.9 | 11.0% | 8 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 9.8% | 2 |
| mz.NanoGod 2.02 | 7.2 | 8.1% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.7 | 59.0 | 1 / 35 | 3115 |
| 2 | 3 | 61.5 | 67.0 | 6 / 35 | 3524 |
| 3 | 3 | 58.9 | 62.9 | 2 / 35 | 3089 |
| 4 | 4 | 57.7 | 58.4 | 2 / 35 | 3106 |
| 5 | 4 | 59.4 | 63.8 | 2 / 35 | 3340 |
| 6 | 4 | 58.7 | 61.6 | 2 / 35 | 3132 |
| 7 | 4 | 59.2 | 58.7 | 3 / 35 | 3748 |
| 8 | 4 | 58.1 | 59.7 | 2 / 35 | 2902 |
| 9 | 3 | 57.9 | 60.6 | 0 / 35 | 3133 |
| 10 | 5 | 55.6 | 54.6 | 0 / 35 | 2833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 74 | 14% |
| brainfade.melee.Dusk 0.44 | 9 | 67% |
| dummy.micro.Sparrow 2.5 | 5 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 25% |

Hadur died in 330 of 350 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 132 | 40% | 140 |
| brainfade.melee.Dusk 0.44 | 62 | 19% | 69 |
| dummy.micro.Sparrow 2.5 | 54 | 16% | 58 |
| wcsv.melee.EngineerMelee 0.1 | 32 | 10% | 33 |
| Krabb.akim2.Akim2 1.1b | 22 | 7% | 22 |
| mz.NanoGod 2.02 | 14 | 4% | 14 |
| jab.DiamondStealer 5 | 11 | 3% | 11 |
| cvt.Firsty 1.0 | 3 | 1% | 3 |

## Melee bench: F44

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 65.3 | 50 / 350 | 4.12 | 13.2% | 37852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.0 | 17.2% | 152 |
| tzu.TheArtOfWar 1.2 | 2.4 | 14.6% | 89 |
| hadur117.nano.SanaroT60 0.1 | 2.8 | 13.2% | 50 |
| wompi.Quokka 1.6 | 4.4 | 11.4% | 19 |
| jwirde.Gort 2.0 | 4.5 | 10.7% | 26 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 8.9% | 3 |
| disan.Chair 2.2.0 | 7.2 | 7.6% | 4 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.1% | 5 |
| sample.Crazy 1.0 | 9.3 | 4.6% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 67.9 | 7 / 35 | 3984 |
| 2 | 2 | 62.6 | 74.9 | 7 / 35 | 3936 |
| 3 | 3 | 59.0 | 62.9 | 7 / 35 | 3696 |
| 4 | 3 | 61.1 | 69.5 | 6 / 35 | 3947 |
| 5 | 3 | 56.4 | 57.5 | 3 / 35 | 3360 |
| 6 | 3 | 60.1 | 68.6 | 4 / 35 | 3635 |
| 7 | 3 | 57.3 | 55.9 | 4 / 35 | 3862 |
| 8 | 3 | 59.3 | 65.1 | 3 / 35 | 3846 |
| 9 | 2 | 60.0 | 68.9 | 3 / 35 | 3592 |
| 10 | 3 | 59.1 | 61.9 | 6 / 35 | 3994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 64 | 41% |
| tzu.TheArtOfWar 1.2 | 37 | 32% |
| jwirde.Gort 2.0 | 9 | 33% |
| wompi.Quokka 1.6 | 7 | 71% |
| disan.Chair 2.2.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 50% |

Hadur died in 300 of 350 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 106 | 35% | 134 |
| tzu.TheArtOfWar 1.2 | 79 | 26% | 93 |
| jwirde.Gort 2.0 | 36 | 12% | 40 |
| wompi.Quokka 1.6 | 31 | 10% | 31 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 17 | 6% | 17 |
| disan.Chair 2.2.0 | 12 | 4% | 15 |
| stf.PanzerGeneral 0.1 | 11 | 4% | 12 |
| amk.jointstrike.JointStrike 0.2 | 6 | 2% | 6 |
| sample.Crazy 1.0 | 2 | 1% | 2 |

## Melee bench: F45

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 69.0 | 59 / 350 | 3.79 | 14.3% | 40323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroT60 0.1 | 1.2 | 14.3% | 59 |
| eem.IWillFireNoBullet v2.8 | 1.8 | 13.2% | 186 |
| jje.BagPuss 1.2 | 3.5 | 11.9% | 23 |
| myl.nano.Graviton 1.10 | 4.1 | 11.1% | 14 |
| sul.Lunar 1.1 | 4.5 | 11.0% | 34 |
| hvilela.HVilela 0.9 | 6.5 | 9.4% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.9% | 10 |
| fm.claire 1.7 | 7.5 | 8.5% | 0 |
| wit.Deep7 2.0 | 8.8 | 6.6% | 20 |
| abud.ThirdRobo 1.0 | 9.9 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.4 | 59.7 | 4 / 35 | 3806 |
| 2 | 1 | 63.4 | 75.6 | 11 / 35 | 4130 |
| 3 | 1 | 62.0 | 72.1 | 5 / 35 | 4336 |
| 4 | 2 | 60.7 | 69.5 | 4 / 35 | 3851 |
| 5 | 1 | 62.3 | 72.4 | 4 / 35 | 4459 |
| 6 | 1 | 59.4 | 64.8 | 3 / 35 | 4151 |
| 7 | 1 | 61.1 | 69.8 | 6 / 35 | 4032 |
| 8 | 1 | 60.3 | 68.3 | 9 / 35 | 3664 |
| 9 | 1 | 58.0 | 64.1 | 5 / 35 | 3547 |
| 10 | 1 | 63.2 | 74.3 | 8 / 35 | 4347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 85 | 32% |
| sul.Lunar 1.1 | 17 | 59% |
| myl.nano.Graviton 1.10 | 15 | 67% |
| jje.BagPuss 1.2 | 11 | 18% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 67% |
| wit.Deep7 2.0 | 4 | 0% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 1126. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 64 | 22% | 0 |
| myl.nano.Graviton 1.10 | 54 | 18% | 79 |
| jje.BagPuss 1.2 | 42 | 14% | 73 |
| sul.Lunar 1.1 | 38 | 13% | 72 |
| hvilela.HVilela 0.9 | 32 | 11% | 40 |
| fm.claire 1.7 | 25 | 9% | 29 |
| pez.mini.ChironexFleckeri 0.5 | 18 | 6% | 25 |
| wit.Deep7 2.0 | 12 | 4% | 18 |
| abud.ThirdRobo 1.0 | 7 | 2% | 10 |

## Melee bench: F46

hadur117.nano.SanaroT60 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 70.3 | 37 / 350 | 3.67 | 12.8% | 29727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.7% | 141 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 16.8% | 128 |
| hadur117.nano.SanaroT60 0.1 | 3.0 | 12.8% | 37 |
| mz.MicroSheep 1.0 | 4.2 | 10.8% | 13 |
| cx.Princess 1.0 | 5.0 | 10.2% | 27 |
| sadoner.killer 0.2 | 5.8 | 9.2% | 2 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.6% | 3 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.5% | 0 |
| kurios.DOSexe .9a | 9.2 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 74.9 | 7 / 35 | 3163 |
| 2 | 3 | 59.7 | 73.0 | 4 / 35 | 2759 |
| 3 | 3 | 57.5 | 65.7 | 1 / 35 | 2936 |
| 4 | 3 | 58.3 | 69.5 | 1 / 35 | 2785 |
| 5 | 3 | 60.2 | 71.1 | 3 / 35 | 3082 |
| 6 | 3 | 58.6 | 69.2 | 5 / 35 | 2764 |
| 7 | 3 | 60.0 | 70.5 | 5 / 35 | 3172 |
| 8 | 3 | 58.5 | 70.2 | 1 / 35 | 2722 |
| 9 | 3 | 57.6 | 65.1 | 5 / 35 | 2958 |
| 10 | 3 | 61.2 | 73.7 | 5 / 35 | 3386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 67 | 24% |
| rsalesc.melee.Medina 0.4.5 | 40 | 38% |
| mz.MicroSheep 1.0 | 8 | 13% |
| cx.Princess 1.0 | 7 | 29% |
| arthord.NanoSatanMelee Beta | 3 | 100% |

Hadur died in 315 of 350 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 134 | 43% | 152 |
| rsalesc.melee.Medina 0.4.5 | 78 | 25% | 94 |
| mz.MicroSheep 1.0 | 29 | 9% | 30 |
| cx.Princess 1.0 | 24 | 8% | 25 |
| sadoner.killer 0.2 | 23 | 7% | 23 |
| arthord.NanoSatanMelee Beta | 16 | 5% | 16 |
| jeremyreeder.collective.Prophet 5 | 9 | 3% | 9 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |
1 death(s) with no robot to name.

