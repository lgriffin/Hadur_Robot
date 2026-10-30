# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 74.5 | 27 / 350 | 3.29 | 13.8% | 38295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 247 |
| hadur117.nano.SanaroG36 0.1 | 2.0 | 13.8% | 27 |
| mz.MicroGodMelee 1 | 3.9 | 11.5% | 20 |
| sgp.JollyNinja 3.53 | 4.1 | 11.3% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.4 | 11.3% | 16 |
| lorneswork.Predator 1.0 | 5.6 | 10.2% | 8 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 1 |
| skm.butterfly 1.0 | 9.0 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 76.8 | 3 / 35 | 3410 |
| 2 | 2 | 62.8 | 76.5 | 0 / 35 | 4184 |
| 3 | 2 | 59.1 | 67.9 | 1 / 35 | 3529 |
| 4 | 2 | 60.3 | 70.5 | 3 / 35 | 3887 |
| 5 | 2 | 62.3 | 78.4 | 5 / 35 | 3723 |
| 6 | 2 | 62.5 | 76.2 | 4 / 35 | 4001 |
| 7 | 2 | 62.1 | 75.2 | 4 / 35 | 3904 |
| 8 | 2 | 61.6 | 75.9 | 0 / 35 | 3872 |
| 9 | 2 | 61.0 | 72.4 | 1 / 35 | 4019 |
| 10 | 2 | 61.9 | 75.6 | 6 / 35 | 3766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 146 | 5% |
| mz.MicroGodMelee 1 | 19 | 47% |
| sgp.JollyNinja 3.53 | 14 | 36% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 27% |
| lorneswork.Predator 1.0 | 3 | 33% |
| adt.Ar2 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |

Hadur died in 323 of 350 rounds, at a mean tick of 1131. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 176 | 54% | 184 |
| sgp.JollyNinja 3.53 | 38 | 12% | 42 |
| mz.MicroGodMelee 1 | 30 | 9% | 39 |
| lorneswork.Predator 1.0 | 29 | 9% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 8% | 28 |
| adt.Ar2 1.0 | 14 | 4% | 16 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 1% | 5 |
| mym.EdgeStalker 1.0 | 4 | 1% | 4 |
| skm.butterfly 1.0 | 2 | 1% | 2 |

## Melee bench: F02

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 66.0 | 69 / 350 | 4.06 | 14.0% | 43832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.9 | 14.5% | 89 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.9 | 14.6% | 91 |
| hadur117.nano.SanaroG36 0.1 | 2.2 | 14.0% | 69 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.6% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 10.3% | 32 |
| sch.Simone 0.3d | 6.5 | 8.5% | 28 |
| fnc.bandit.Bandit 5.2.0 | 6.9 | 7.7% | 4 |
| Noran.BitchingElk 0.054 | 7.7 | 7.5% | 21 |
| stelo.PatternRobot 1.0 | 8.9 | 6.3% | 7 |
| fullsail.SweetTea 1.1 | 9.9 | 5.0% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 63.5 | 7 / 35 | 4405 |
| 2 | 3 | 59.7 | 66.0 | 3 / 35 | 4102 |
| 3 | 3 | 58.5 | 59.4 | 5 / 35 | 4384 |
| 4 | 3 | 58.4 | 59.0 | 6 / 35 | 4383 |
| 5 | 1 | 64.3 | 75.6 | 10 / 35 | 5062 |
| 6 | 3 | 59.2 | 62.2 | 7 / 35 | 4092 |
| 7 | 2 | 61.7 | 68.3 | 8 / 35 | 4316 |
| 8 | 2 | 60.2 | 65.4 | 7 / 35 | 4405 |
| 9 | 1 | 61.9 | 70.5 | 7 / 35 | 4565 |
| 10 | 2 | 61.8 | 70.5 | 9 / 35 | 4118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 51 | 22% |
| pulsar.PulsarMax 0.8.9 | 45 | 62% |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 50% |
| sch.Simone 0.3d | 16 | 44% |
| Noran.BitchingElk 0.054 | 9 | 22% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| fnc.bandit.Bandit 5.2.0 | 6 | 83% |
| stelo.PatternRobot 1.0 | 3 | 0% |

Hadur died in 283 of 350 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 71 | 25% | 85 |
| pulsar.PulsarMax 0.8.9 | 55 | 19% | 78 |
| lrem.micro.SpikeSoldier 0.4 | 38 | 13% | 44 |
| com.cohesiva.robocode.ManOwaR 1.0 | 32 | 11% | 37 |
| sch.Simone 0.3d | 31 | 11% | 39 |
| fnc.bandit.Bandit 5.2.0 | 25 | 9% | 28 |
| stelo.PatternRobot 1.0 | 16 | 6% | 18 |
| Noran.BitchingElk 0.054 | 9 | 3% | 15 |
| fullsail.SweetTea 1.1 | 6 | 2% | 6 |

## Melee bench: F03

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.0 | 72 / 350 | 3.16 | 14.7% | 41753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.9 | 15.0% | 93 |
| kawigi.nano.Lib 1.0 | 2.3 | 14.7% | 83 |
| hadur117.nano.SanaroG36 0.1 | 2.5 | 14.7% | 72 |
| vuen.Cake 2.51 | 3.3 | 13.6% | 77 |
| urdos.URDOS 1.3 | 5.0 | 10.2% | 16 |
| ghent.ArthurPanzergon 1.0.0 | 6.7 | 7.3% | 1 |
| adt.Ar1 2.1 | 6.9 | 7.4% | 1 |
| oa.weak.FlyMk1 0.1 | 7.6 | 6.6% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.8% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 73.7 | 8 / 35 | 4081 |
| 2 | 3 | 62.0 | 78.7 | 5 / 35 | 4010 |
| 3 | 2 | 62.4 | 73.7 | 8 / 35 | 4470 |
| 4 | 2 | 62.2 | 75.6 | 7 / 35 | 4340 |
| 5 | 3 | 60.3 | 72.1 | 8 / 35 | 3520 |
| 6 | 3 | 61.3 | 73.7 | 5 / 35 | 4185 |
| 7 | 1 | 64.6 | 84.1 | 9 / 35 | 4218 |
| 8 | 4 | 60.8 | 71.1 | 5 / 35 | 4223 |
| 9 | 1 | 65.4 | 84.1 | 13 / 35 | 4431 |
| 10 | 3 | 61.4 | 73.7 | 4 / 35 | 4275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 65 | 52% |
| vuen.Cake 2.51 | 58 | 43% |
| kawigi.nano.Lib 1.0 | 35 | 9% |
| urdos.URDOS 1.3 | 11 | 36% |
| oa.weak.FlyMk1 0.1 | 3 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 87 | 31% | 97 |
| radnor.DoctorBob 1.42 | 76 | 27% | 103 |
| vuen.Cake 2.51 | 45 | 16% | 65 |
| urdos.URDOS 1.3 | 44 | 16% | 48 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 4% | 8 |
| adt.Ar1 2.1 | 7 | 2% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 7 | 2% | 7 |
| oa.weak.FlyMk1 0.1 | 5 | 2% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 4 |

## Melee bench: F04

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 72.7 | 5 / 350 | 3.45 | 14.3% | 46631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 327 |
| hadur117.nano.SanaroG36 0.1 | 2.3 | 14.3% | 5 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.6% | 11 |
| TNT.TNT 0.99.1 | 4.0 | 10.3% | 6 |
| josago.Jorgito 0.16 | 5.5 | 8.5% | 0 |
| css.Delitioner 0.11 | 5.9 | 8.2% | 1 |
| tj.zombie1n 1.0.1 | 6.7 | 7.1% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 75.6 | 0 / 35 | 4415 |
| 2 | 2 | 62.8 | 74.0 | 0 / 35 | 4355 |
| 3 | 2 | 65.5 | 80.0 | 1 / 35 | 5007 |
| 4 | 3 | 61.5 | 67.0 | 0 / 35 | 4580 |
| 5 | 2 | 64.1 | 74.9 | 1 / 35 | 4874 |
| 6 | 2 | 64.3 | 76.8 | 0 / 35 | 4819 |
| 7 | 2 | 64.1 | 74.9 | 2 / 35 | 4774 |
| 8 | 3 | 61.0 | 66.7 | 1 / 35 | 4384 |
| 9 | 3 | 62.5 | 69.5 | 0 / 35 | 4791 |
| 10 | 2 | 61.8 | 67.9 | 0 / 35 | 4632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 149 | 1% |
| apc.LeeroyJenkins2 1.0 | 9 | 44% |
| TNT.TNT 0.99.1 | 1 | 0% |

Hadur died in 345 of 350 rounds, at a mean tick of 1261. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 234 | 68% | 236 |
| apc.LeeroyJenkins2 1.0 | 47 | 14% | 51 |
| josago.Jorgito 0.16 | 23 | 7% | 23 |
| TNT.TNT 0.99.1 | 19 | 6% | 19 |
| css.Delitioner 0.11 | 13 | 4% | 13 |
| rampancy.Durandal 2.1d | 6 | 2% | 6 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 0 |

## Melee bench: F06

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 68.7 | 61 / 350 | 3.81 | 13.3% | 33084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.4% | 93 |
| origin.SleepSiphon 1.7b | 2.5 | 14.2% | 101 |
| hadur117.nano.SanaroG36 0.1 | 3.1 | 13.3% | 61 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.6% | 46 |
| mld.Wisdom 1.0 | 4.5 | 11.1% | 18 |
| gg.Wolverine 2.0 | 6.3 | 8.7% | 9 |
| spinnercat.Omen 1.0 | 7.0 | 8.2% | 12 |
| DBall.NUKE 0.1 | 8.1 | 7.1% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.4% | 10 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 68.6 | 6 / 35 | 3017 |
| 2 | 3 | 58.3 | 64.4 | 4 / 35 | 3409 |
| 3 | 3 | 60.7 | 71.7 | 7 / 35 | 3553 |
| 4 | 2 | 62.2 | 74.6 | 10 / 35 | 3460 |
| 5 | 3 | 61.1 | 74.0 | 7 / 35 | 3298 |
| 6 | 3 | 60.7 | 70.2 | 9 / 35 | 3284 |
| 7 | 3 | 58.7 | 65.1 | 7 / 35 | 3377 |
| 8 | 4 | 58.0 | 64.8 | 2 / 35 | 3275 |
| 9 | 4 | 57.4 | 64.4 | 3 / 35 | 3034 |
| 10 | 3 | 60.1 | 69.5 | 6 / 35 | 3377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 45 | 51% |
| origin.SleepSiphon 1.7b | 41 | 37% |
| pe.minimelee.SandboxMiniMelee 1.1 | 17 | 59% |
| gg.Wolverine 2.0 | 7 | 100% |
| mld.Wisdom 1.0 | 7 | 43% |
| spinnercat.Omen 1.0 | 6 | 33% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |

Hadur died in 290 of 350 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 77 | 27% | 100 |
| jekl.StoneGhost 0.7 | 74 | 26% | 91 |
| pe.minimelee.SandboxMiniMelee 1.1 | 51 | 18% | 60 |
| mld.Wisdom 1.0 | 48 | 17% | 50 |
| spinnercat.Omen 1.0 | 15 | 5% | 16 |
| gg.Wolverine 2.0 | 12 | 4% | 17 |
| DBall.NUKE 0.1 | 7 | 2% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 1% | 6 |
| sample.Fire 1.0 | 2 | 1% | 2 |

## Melee bench: F07

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.2 | 109 / 350 | 2.51 | 17.1% | 50969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 18.0% | 111 |
| hadur117.nano.SanaroG36 0.1 | 2.1 | 17.1% | 109 |
| rtk.Tachikoma 1.0 | 2.4 | 16.9% | 77 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.8% | 21 |
| franzor.Lizt 1.3.1 | 4.8 | 10.9% | 31 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 1 |
| sample.Target 1.0 | 9.1 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.1 | 80.3 | 8 / 35 | 4932 |
| 2 | 3 | 66.2 | 77.8 | 7 / 35 | 5072 |
| 3 | 3 | 66.6 | 78.1 | 10 / 35 | 4912 |
| 4 | 2 | 69.0 | 87.9 | 13 / 35 | 4874 |
| 5 | 1 | 68.8 | 84.8 | 14 / 35 | 5209 |
| 6 | 2 | 68.2 | 82.9 | 12 / 35 | 5381 |
| 7 | 1 | 68.6 | 86.0 | 13 / 35 | 5273 |
| 8 | 2 | 69.0 | 87.3 | 12 / 35 | 5381 |
| 9 | 2 | 69.0 | 88.6 | 11 / 35 | 5315 |
| 10 | 2 | 66.0 | 78.7 | 9 / 35 | 4620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 99 | 63% |
| rsalesc.melee.Monk 0.3.6c | 66 | 14% |
| oog.melee.CapuletDroid 1.1 | 38 | 74% |
| franzor.Lizt 1.3.1 | 13 | 77% |
| skm.PateranBotlock2 1.0 | 1 | 0% |

Hadur died in 241 of 350 rounds, at a mean tick of 1331. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 99 | 41% | 110 |
| rtk.Tachikoma 1.0 | 96 | 40% | 163 |
| oog.melee.CapuletDroid 1.1 | 27 | 11% | 56 |
| franzor.Lizt 1.3.1 | 8 | 3% | 4 |
| exauge.GateKeeper 1.1.121g | 6 | 2% | 8 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 5 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 69.4 | 83 / 350 | 3.76 | 13.7% | 34470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.5 | 14.5% | 109 |
| shrub.Vapour v159 | 2.2 | 13.7% | 78 |
| hadur117.nano.SanaroG36 0.1 | 2.4 | 13.7% | 83 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.7% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.8% | 26 |
| m3thos.Eva00 1.1 | 6.0 | 9.0% | 14 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.3% | 9 |
| SHAM.WOW 1.4 | 8.6 | 6.9% | 6 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.7% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 68.9 | 10 / 35 | 3480 |
| 2 | 1 | 62.7 | 75.6 | 12 / 35 | 3870 |
| 3 | 3 | 57.8 | 62.9 | 10 / 35 | 3335 |
| 4 | 3 | 59.5 | 69.5 | 5 / 35 | 3549 |
| 5 | 4 | 56.2 | 61.6 | 7 / 35 | 2909 |
| 6 | 2 | 61.7 | 76.8 | 8 / 35 | 3664 |
| 7 | 3 | 60.0 | 71.4 | 5 / 35 | 3561 |
| 8 | 3 | 56.0 | 60.6 | 7 / 35 | 3121 |
| 9 | 2 | 60.5 | 70.5 | 11 / 35 | 3518 |
| 10 | 1 | 61.4 | 75.9 | 8 / 35 | 3463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 49 | 39% |
| shrub.Vapour v159 | 28 | 36% |
| Krabb.sliNk.Garm 0.9u | 23 | 83% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 56% |
| m3thos.Eva00 1.1 | 15 | 47% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 92% |
| qualidafial.MajorDick 1.0.1 | 4 | 75% |
| SHAM.WOW 1.4 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 268 of 350 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 74 | 28% | 96 |
| shrub.Vapour v159 | 62 | 23% | 74 |
| com.spp.robocode.MostlyHarmless 010 | 33 | 12% | 45 |
| Krabb.sliNk.Garm 0.9u | 27 | 10% | 37 |
| m3thos.Eva00 1.1 | 25 | 9% | 30 |
| zyx.nano.BacillusComma 1.0 | 18 | 7% | 20 |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 5% | 29 |
| SHAM.WOW 1.4 | 9 | 3% | 11 |
| qualidafial.MajorDick 1.0.1 | 7 | 3% | 7 |

## Melee bench: F09

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 62.1 | 36 / 350 | 4.41 | 12.0% | 30289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.5% | 172 |
| kc.micro.Figment 1.0 | 2.0 | 14.9% | 68 |
| hadur117.nano.SanaroG36 0.1 | 3.5 | 12.0% | 36 |
| yagami.Tidus 0.11 | 4.3 | 11.4% | 6 |
| pedersen.Grishnakh 1.0 | 4.3 | 11.1% | 37 |
| mc2.enemy.Original 0.9 | 6.0 | 9.4% | 23 |
| dft.Calliope 5.6 | 6.9 | 7.8% | 7 |
| step.nanoPri 1.0 | 8.5 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.6 | 5.5% | 0 |
| rdm.Dueler 0.4x | 9.9 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.1 | 59.7 | 3 / 35 | 2935 |
| 2 | 4 | 56.1 | 60.0 | 3 / 35 | 2980 |
| 3 | 5 | 56.5 | 59.7 | 5 / 35 | 3053 |
| 4 | 3 | 57.8 | 62.9 | 2 / 35 | 3200 |
| 5 | 3 | 58.4 | 65.4 | 4 / 35 | 2898 |
| 6 | 3 | 57.3 | 61.9 | 3 / 35 | 3063 |
| 7 | 3 | 58.9 | 68.6 | 4 / 35 | 2965 |
| 8 | 4 | 55.9 | 57.5 | 3 / 35 | 3024 |
| 9 | 3 | 57.7 | 63.5 | 4 / 35 | 3052 |
| 10 | 3 | 57.0 | 61.6 | 5 / 35 | 3119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 57 | 33% |
| kc.micro.Figment 1.0 | 35 | 23% |
| mc2.enemy.Original 0.9 | 8 | 50% |
| pedersen.Grishnakh 1.0 | 7 | 29% |
| yagami.Tidus 0.11 | 4 | 25% |
| dft.Calliope 5.6 | 2 | 50% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 314 of 350 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 100 | 32% | 120 |
| kc.micro.Figment 1.0 | 68 | 22% | 76 |
| yagami.Tidus 0.11 | 49 | 16% | 51 |
| mc2.enemy.Original 0.9 | 29 | 9% | 33 |
| pedersen.Grishnakh 1.0 | 27 | 9% | 28 |
| robar.nano.Assertive_Melee 0.2 | 17 | 5% | 18 |
| step.nanoPri 1.0 | 12 | 4% | 12 |
| dft.Calliope 5.6 | 7 | 2% | 7 |
| rdm.Dueler 0.4x | 5 | 2% | 5 |

## Melee bench: F10

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 80.3 | 98 / 350 | 2.77 | 15.6% | 42145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroG36 0.1 | 1.2 | 15.6% | 98 |
| DTF.Kludgy 1.2b | 1.9 | 15.1% | 91 |
| ne.Chimera 1.2 | 3.2 | 13.5% | 48 |
| ejb.Polaris 1.0.1 | 3.8 | 12.6% | 45 |
| vStar.RAFzilla 2.15 | 5.4 | 10.6% | 22 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.5% | 34 |
| sam.Samspin 1.0 | 7.6 | 6.2% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.6% | 0 |
| kurios.DOSexe .9b | 8.4 | 5.5% | 5 |
| donjezza.Muncho 1.0 | 9.7 | 4.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 80.3 | 10 / 35 | 3942 |
| 2 | 1 | 62.9 | 78.1 | 9 / 35 | 3987 |
| 3 | 1 | 63.2 | 78.7 | 10 / 35 | 4053 |
| 4 | 2 | 64.5 | 79.7 | 12 / 35 | 4299 |
| 5 | 1 | 63.9 | 80.0 | 8 / 35 | 4222 |
| 6 | 1 | 63.9 | 80.3 | 9 / 35 | 4444 |
| 7 | 1 | 64.0 | 81.3 | 8 / 35 | 4266 |
| 8 | 1 | 63.5 | 77.8 | 11 / 35 | 4275 |
| 9 | 1 | 65.1 | 83.2 | 12 / 35 | 4425 |
| 10 | 1 | 64.9 | 83.5 | 9 / 35 | 4232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 55 | 76% |
| DTF.Kludgy 1.2b | 48 | 25% |
| vStar.RAFzilla 2.15 | 30 | 63% |
| ne.Chimera 1.2 | 28 | 39% |
| tvv.micro.Antares 1.1.1 | 20 | 25% |
| kurios.DOSexe .9b | 6 | 83% |
| donjezza.Muncho 1.0 | 6 | 33% |
| sam.Samspin 1.0 | 4 | 50% |

Hadur died in 252 of 350 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 90 | 36% | 102 |
| ne.Chimera 1.2 | 65 | 26% | 77 |
| tvv.micro.Antares 1.1.1 | 28 | 11% | 30 |
| ejb.Polaris 1.0.1 | 25 | 10% | 69 |
| vStar.RAFzilla 2.15 | 25 | 10% | 43 |
| donjezza.Muncho 1.0 | 6 | 2% | 8 |
| sam.Samspin 1.0 | 5 | 2% | 6 |
| kurios.DOSexe .9b | 4 | 2% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 2% | 5 |

## Melee bench: F11

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 65.0 | 48 / 350 | 4.15 | 12.8% | 33580 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.4% | 148 |
| cx.mini.Nimrod 0.55 | 2.3 | 12.9% | 51 |
| hadur117.nano.SanaroG36 0.1 | 2.7 | 12.8% | 48 |
| djc.DynaBot 0.1.1 | 4.2 | 11.0% | 31 |
| br2.MobyDickBot 1.6 | 5.6 | 9.6% | 34 |
| rdt199.Warlord 0.73 | 5.9 | 9.3% | 19 |
| uji.YellohFellah 1.0 | 6.7 | 8.7% | 21 |
| KiraNL.Chupacabra 0.4 | 7.6 | 7.9% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 65.4 | 4 / 35 | 3239 |
| 2 | 2 | 62.4 | 73.7 | 8 / 35 | 4001 |
| 3 | 3 | 56.7 | 59.7 | 5 / 35 | 3114 |
| 4 | 2 | 59.6 | 68.3 | 7 / 35 | 3532 |
| 5 | 3 | 57.0 | 61.3 | 1 / 35 | 3545 |
| 6 | 3 | 56.8 | 64.1 | 2 / 35 | 3043 |
| 7 | 3 | 58.2 | 67.3 | 5 / 35 | 3098 |
| 8 | 2 | 59.9 | 67.9 | 6 / 35 | 3582 |
| 9 | 3 | 56.8 | 59.0 | 6 / 35 | 3309 |
| 10 | 3 | 57.0 | 63.2 | 4 / 35 | 3117 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 59 | 37% |
| cx.mini.Nimrod 0.55 | 18 | 33% |
| djc.DynaBot 0.1.1 | 12 | 67% |
| br2.MobyDickBot 1.6 | 10 | 20% |
| uji.YellohFellah 1.0 | 9 | 33% |
| rdt199.Warlord 0.73 | 7 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 117 | 39% | 136 |
| cx.mini.Nimrod 0.55 | 57 | 19% | 63 |
| rdt199.Warlord 0.73 | 35 | 12% | 45 |
| br2.MobyDickBot 1.6 | 26 | 9% | 29 |
| djc.DynaBot 0.1.1 | 20 | 7% | 25 |
| uji.YellohFellah 1.0 | 19 | 6% | 23 |
| KiraNL.Chupacabra 0.4 | 15 | 5% | 16 |
| stelo.MirrorNano 1.3 | 7 | 2% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 2% | 6 |

## Melee bench: F12

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 70.6 | 63 / 350 | 3.65 | 13.7% | 31679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 2.4 | 13.9% | 77 |
| nat.PallasHawk 1.0 | 2.4 | 14.2% | 92 |
| bts.wiki.RipCurl 0.9b | 2.6 | 14.0% | 73 |
| hadur117.nano.SanaroG36 0.1 | 2.7 | 13.7% | 63 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.6% | 28 |
| jrm.Test0 1.0 | 6.4 | 8.2% | 5 |
| jp.Perpy 16.0 | 7.1 | 7.2% | 4 |
| cs.sheldor.Talon 1.1 | 7.6 | 7.1% | 1 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.9% | 6 |
| stuff.Vlad 0.1 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 65.1 | 6 / 35 | 3143 |
| 2 | 4 | 58.4 | 67.6 | 4 / 35 | 3087 |
| 3 | 4 | 59.6 | 68.6 | 7 / 35 | 3241 |
| 4 | 2 | 61.7 | 74.6 | 6 / 35 | 3453 |
| 5 | 2 | 60.4 | 72.7 | 7 / 35 | 2957 |
| 6 | 3 | 58.2 | 69.2 | 5 / 35 | 2592 |
| 7 | 1 | 62.3 | 76.5 | 9 / 35 | 3175 |
| 8 | 1 | 62.2 | 75.9 | 10 / 35 | 3363 |
| 9 | 2 | 59.9 | 68.6 | 6 / 35 | 3462 |
| 10 | 4 | 58.9 | 67.0 | 3 / 35 | 3206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 45 | 49% |
| nat.PallasHawk 1.0 | 45 | 31% |
| darkcanuck.Leon 1.01 | 42 | 29% |
| brainfade.melee.Genghis 0.36 | 15 | 60% |
| jaybot.bots.Oddball 4.0 | 5 | 40% |
| stuff.Vlad 0.1 | 3 | 67% |
| jrm.Test0 1.0 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 0% |

Hadur died in 290 of 350 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 78 | 27% | 97 |
| bts.wiki.RipCurl 0.9b | 63 | 22% | 77 |
| darkcanuck.Leon 1.01 | 58 | 20% | 75 |
| brainfade.melee.Genghis 0.36 | 30 | 10% | 36 |
| jrm.Test0 1.0 | 21 | 7% | 21 |
| jp.Perpy 16.0 | 16 | 6% | 16 |
| jaybot.bots.Oddball 4.0 | 11 | 4% | 11 |
| cs.sheldor.Talon 1.1 | 9 | 3% | 11 |
| stuff.Vlad 0.1 | 4 | 1% | 6 |

## Melee bench: F13

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 72.6 | 28 / 350 | 3.46 | 13.1% | 32509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.5% | 156 |
| ags.Glacier 0.2.11 | 1.6 | 16.9% | 96 |
| hadur117.nano.SanaroG36 0.1 | 3.4 | 13.1% | 28 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.3% | 30 |
| shinh.Entangled 0.3 | 4.4 | 12.3% | 36 |
| apc.Colossus2 0.17 | 6.1 | 8.2% | 3 |
| stelo.Wang 1.0 | 7.0 | 6.5% | 1 |
| ayk.WallHugger 1.0 | 8.1 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.9 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.6 | 64.8 | 2 / 35 | 2929 |
| 2 | 3 | 60.1 | 71.7 | 1 / 35 | 3498 |
| 3 | 3 | 61.3 | 76.2 | 5 / 35 | 3095 |
| 4 | 3 | 60.8 | 73.7 | 1 / 35 | 3333 |
| 5 | 3 | 62.5 | 78.1 | 5 / 35 | 3338 |
| 6 | 3 | 60.2 | 73.0 | 2 / 35 | 3061 |
| 7 | 4 | 59.3 | 71.4 | 0 / 35 | 2944 |
| 8 | 4 | 61.9 | 75.2 | 5 / 35 | 3553 |
| 9 | 3 | 60.3 | 72.1 | 2 / 35 | 3535 |
| 10 | 4 | 60.1 | 70.2 | 5 / 35 | 3223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 61 | 25% |
| ags.Glacier 0.2.11 | 53 | 9% |
| gh.micro.Gruweltje 0.7 | 16 | 19% |
| shinh.Entangled 0.3 | 12 | 33% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 108 | 34% | 112 |
| mn.Combat 3.25.0 | 86 | 27% | 101 |
| gh.micro.Gruweltje 0.7 | 61 | 19% | 65 |
| shinh.Entangled 0.3 | 42 | 13% | 47 |
| stelo.Wang 1.0 | 10 | 3% | 10 |
| apc.Colossus2 0.17 | 9 | 3% | 9 |
| maribo.FollowFire 1 | 5 | 2% | 5 |
| ayk.WallHugger 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.4 | 85 / 350 | 3.13 | 14.4% | 34959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 18.1% | 154 |
| hadur117.nano.SanaroG36 0.1 | 2.0 | 14.4% | 85 |
| catcat20.shape.Theta 0.018 | 3.4 | 11.9% | 52 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 10.2% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 5.4 | 10.0% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 10.1% | 13 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 9.9% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 8.1% | 15 |
| pa.Improved 1.0 | 9.0 | 5.6% | 4 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 75.6 | 9 / 35 | 3363 |
| 2 | 2 | 61.5 | 75.6 | 7 / 35 | 3123 |
| 3 | 2 | 63.0 | 79.4 | 5 / 35 | 3706 |
| 4 | 2 | 65.8 | 86.3 | 13 / 35 | 3969 |
| 5 | 2 | 62.8 | 78.1 | 11 / 35 | 3464 |
| 6 | 2 | 60.3 | 69.8 | 8 / 35 | 3521 |
| 7 | 2 | 61.8 | 75.9 | 12 / 35 | 3075 |
| 8 | 2 | 62.7 | 77.1 | 8 / 35 | 3702 |
| 9 | 2 | 62.3 | 76.5 | 8 / 35 | 3452 |
| 10 | 2 | 60.2 | 69.5 | 4 / 35 | 3584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 110 | 41% |
| catcat20.shape.Theta 0.018 | 34 | 59% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 70% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 50% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 33% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 29% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 50% |
| pa.Improved 1.0 | 2 | 0% |

Hadur died in 265 of 350 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 135 | 51% | 175 |
| catcat20.shape.Theta 0.018 | 30 | 11% | 52 |
| sanyi.mikrobi.Roberto 1.0 | 23 | 9% | 30 |
| dmh.robocode.robot.RedDwarf 0.4 | 22 | 8% | 23 |
| Lo_Ian.Gandalf_V4 4.0 | 21 | 8% | 24 |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 5% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 5% | 19 |
| pa.Improved 1.0 | 6 | 2% | 8 |
| sample.TrackFire 1.0 | 2 | 1% | 2 |

## Melee bench: F15

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 63.4 | 40 / 350 | 4.29 | 12.8% | 38393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.2 | 15.3% | 87 |
| mld.DustBunny 3.8 | 2.7 | 13.5% | 43 |
| emp.Yngwie 1.11 | 2.8 | 13.6% | 102 |
| hadur117.nano.SanaroG36 0.1 | 3.5 | 12.8% | 40 |
| kawigi.robot.Girl 1.2 | 5.3 | 10.6% | 53 |
| cb.nano.Insomnia 1.0 | 5.5 | 11.0% | 19 |
| lambdaxy.TBot 0.1 | 7.4 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.6% | 2 |
| divineomega.TrialBot 0.003 | 8.8 | 5.5% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 67.6 | 6 / 35 | 4111 |
| 2 | 5 | 57.2 | 59.4 | 3 / 35 | 3629 |
| 3 | 5 | 54.6 | 53.3 | 2 / 35 | 3466 |
| 4 | 3 | 57.2 | 61.0 | 1 / 35 | 3800 |
| 5 | 2 | 59.6 | 66.0 | 2 / 35 | 4200 |
| 6 | 4 | 60.1 | 66.7 | 7 / 35 | 3772 |
| 7 | 2 | 59.9 | 67.0 | 6 / 35 | 3684 |
| 8 | 3 | 60.1 | 65.4 | 5 / 35 | 4132 |
| 9 | 4 | 56.9 | 61.0 | 3 / 35 | 3535 |
| 10 | 4 | 60.1 | 66.7 | 5 / 35 | 4064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 28 | 29% |
| emp.Yngwie 1.11 | 25 | 28% |
| mld.DustBunny 3.8 | 20 | 25% |
| cb.nano.Insomnia 1.0 | 16 | 69% |
| kawigi.robot.Girl 1.2 | 11 | 64% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| Grystrion.TrackerWO 1.0 | 1 | 0% |

Hadur died in 310 of 350 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 68 | 22% | 80 |
| kawigi.micro.Shiz 1.1 | 65 | 21% | 75 |
| mld.DustBunny 3.8 | 59 | 19% | 67 |
| cb.nano.Insomnia 1.0 | 44 | 14% | 42 |
| kawigi.robot.Girl 1.2 | 39 | 13% | 46 |
| Grystrion.TrackerWO 1.0 | 15 | 5% | 15 |
| divineomega.TrialBot 0.003 | 10 | 3% | 14 |
| lambdaxy.TBot 0.1 | 9 | 3% | 9 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 0% | 1 |

## Melee bench: F16

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 69.3 | 36 / 350 | 3.77 | 14.1% | 43619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.8% | 172 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.4 | 15.1% | 26 |
| hadur117.nano.SanaroG36 0.1 | 2.6 | 14.1% | 36 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 11.0% | 71 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.3% | 5 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.2% | 17 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.8% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.2 | 5.8% | 19 |
| repositorio.NanoStep 1.0 | 9.2 | 5.1% | 0 |
| asd.Cthulhu 1.3 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 70.2 | 5 / 35 | 4353 |
| 2 | 3 | 62.4 | 71.4 | 4 / 35 | 4467 |
| 3 | 2 | 62.1 | 68.6 | 4 / 35 | 4903 |
| 4 | 2 | 62.0 | 69.5 | 5 / 35 | 4573 |
| 5 | 3 | 60.3 | 67.3 | 4 / 35 | 3716 |
| 6 | 3 | 59.0 | 63.8 | 2 / 35 | 3918 |
| 7 | 2 | 63.7 | 75.2 | 4 / 35 | 4811 |
| 8 | 3 | 59.1 | 63.2 | 1 / 35 | 4004 |
| 9 | 3 | 61.2 | 67.6 | 2 / 35 | 4516 |
| 10 | 2 | 63.4 | 75.9 | 5 / 35 | 4358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 75 | 0% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 29 | 69% |
| techdude.forest.FlamingForest 1.1 | 21 | 14% |
| tvv.nano.Polaris 1.2 | 6 | 33% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 4 | 50% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 314 of 350 rounds, at a mean tick of 1242. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 144 | 46% | 149 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 63 | 20% | 77 |
| techdude.forest.FlamingForest 1.1 | 29 | 9% | 34 |
| bvh.fnr.Fenrir 0.36l | 29 | 9% | 32 |
| tvv.nano.Polaris 1.2 | 18 | 6% | 18 |
| divineomega.DivineBot 1.9.4.5 | 15 | 5% | 18 |
| stelo.IntrinsicVolatility 1.4 | 11 | 4% | 15 |
| asd.Cthulhu 1.3 | 3 | 1% | 3 |
| repositorio.NanoStep 1.0 | 2 | 1% | 4 |

## Melee bench: F17

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 67.8 | 68 / 350 | 3.90 | 13.7% | 39575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.9 | 13.9% | 77 |
| hadur117.nano.SanaroG36 0.1 | 2.4 | 13.7% | 68 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.3% | 75 |
| cx.BlestPain 1.41 | 3.4 | 13.1% | 65 |
| nic.Nicator 2.4 | 5.1 | 11.6% | 31 |
| ahf.NanoAndrew .4 | 5.5 | 11.7% | 32 |
| maribo.melee.BMV 0.1 | 6.9 | 9.0% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.4 | 5.4% | 0 |
| tex.Longbot 0.4 | 8.6 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 66.0 | 9 / 35 | 4155 |
| 2 | 3 | 60.5 | 68.3 | 5 / 35 | 3873 |
| 3 | 1 | 60.8 | 68.6 | 5 / 35 | 4267 |
| 4 | 2 | 61.5 | 67.0 | 11 / 35 | 4116 |
| 5 | 5 | 56.8 | 58.7 | 6 / 35 | 3387 |
| 6 | 3 | 59.8 | 67.0 | 3 / 35 | 3884 |
| 7 | 1 | 62.8 | 76.5 | 8 / 35 | 3716 |
| 8 | 3 | 59.6 | 67.0 | 5 / 35 | 3572 |
| 9 | 1 | 63.7 | 74.6 | 9 / 35 | 4656 |
| 10 | 2 | 60.0 | 64.4 | 7 / 35 | 3949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 40 | 20% |
| cx.BlestPain 1.41 | 39 | 67% |
| oog.melee.Mercutio 1.0 | 37 | 62% |
| nic.Nicator 2.4 | 12 | 42% |
| ahf.NanoAndrew .4 | 11 | 55% |

Hadur died in 284 of 350 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 71 | 25% | 80 |
| ahf.NanoAndrew .4 | 58 | 20% | 65 |
| cx.BlestPain 1.41 | 45 | 16% | 69 |
| oog.melee.Mercutio 1.0 | 45 | 16% | 66 |
| nic.Nicator 2.4 | 32 | 11% | 35 |
| maribo.melee.BMV 0.1 | 23 | 8% | 24 |
| tex.Longbot 0.4 | 7 | 2% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 1% | 3 |
| goblin.Bender 2.4 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 66.5 | 92 / 350 | 4.01 | 13.5% | 35120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.6 | 13.8% | 72 |
| hadur117.nano.SanaroG36 0.1 | 1.9 | 13.5% | 92 |
| agd.Mooserwirt2 2.7 | 2.7 | 12.7% | 70 |
| uji.DBH 1.1 | 4.5 | 11.3% | 38 |
| spinnercat.Robovirus 2.718 | 5.2 | 10.6% | 20 |
| ratosh.Nobo 0.21 | 5.4 | 10.5% | 13 |
| sigterm.Sigterm 1.0 | 6.7 | 9.0% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 7.2% | 9 |
| stelo.WangRobot 1.0 | 8.8 | 6.3% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.9 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 63.2 | 6 / 35 | 3469 |
| 2 | 3 | 58.7 | 63.2 | 11 / 35 | 3506 |
| 3 | 2 | 59.4 | 66.3 | 12 / 35 | 3253 |
| 4 | 1 | 60.5 | 69.2 | 10 / 35 | 3651 |
| 5 | 1 | 59.5 | 69.2 | 9 / 35 | 3267 |
| 6 | 1 | 60.1 | 67.0 | 11 / 35 | 3725 |
| 7 | 2 | 59.2 | 67.6 | 7 / 35 | 3496 |
| 8 | 2 | 59.4 | 65.4 | 9 / 35 | 3625 |
| 9 | 3 | 57.2 | 62.5 | 7 / 35 | 3235 |
| 10 | 1 | 61.9 | 71.7 | 10 / 35 | 3893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 44 | 66% |
| agd.Mooserwirt2 2.7 | 29 | 41% |
| uji.DBH 1.1 | 21 | 52% |
| spinnercat.Robovirus 2.718 | 19 | 89% |
| sigterm.Sigterm 1.0 | 15 | 73% |
| stelo.WangRobot 1.0 | 8 | 63% |
| ratosh.Nobo 0.21 | 7 | 86% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 100% |

Hadur died in 264 of 350 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 77 | 29% | 107 |
| agd.Mooserwirt2 2.7 | 53 | 20% | 67 |
| ratosh.Nobo 0.21 | 32 | 12% | 41 |
| uji.DBH 1.1 | 28 | 11% | 36 |
| sigterm.Sigterm 1.0 | 21 | 8% | 32 |
| spinnercat.Robovirus 2.718 | 21 | 8% | 27 |
| stelo.WangRobot 1.0 | 12 | 5% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 4% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 3% | 11 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 78.6 | 98 / 350 | 2.92 | 15.7% | 41422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.9 | 16.1% | 102 |
| mld.Infinity 2.2 | 1.9 | 15.8% | 110 |
| hadur117.nano.SanaroG36 0.1 | 2.2 | 15.7% | 98 |
| erdnis.Rover 0.3 | 4.5 | 10.8% | 7 |
| krillr.mini.JointStrike 2.0.0 | 4.6 | 11.1% | 14 |
| patson.PatsonTestBot 1.0 | 5.9 | 9.0% | 8 |
| mbh.Mbh 0.1 | 7.6 | 7.3% | 0 |
| pac.ABC 2.1 | 8.0 | 7.1% | 8 |
| pbg.R2D2 1.0 | 8.4 | 6.2% | 4 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 84.4 | 10 / 35 | 4156 |
| 2 | 3 | 64.0 | 76.2 | 10 / 35 | 4002 |
| 3 | 3 | 65.5 | 81.3 | 12 / 35 | 3945 |
| 4 | 3 | 62.7 | 70.8 | 10 / 35 | 4053 |
| 5 | 3 | 63.3 | 75.2 | 6 / 35 | 3824 |
| 6 | 2 | 65.4 | 79.4 | 8 / 35 | 4360 |
| 7 | 1 | 66.0 | 81.6 | 10 / 35 | 4362 |
| 8 | 2 | 65.4 | 79.4 | 10 / 35 | 4339 |
| 9 | 2 | 64.1 | 76.2 | 10 / 35 | 4314 |
| 10 | 1 | 65.7 | 81.9 | 12 / 35 | 4067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 106 | 54% |
| davidalves.net.DuelistMiniMelee 1.2 | 68 | 24% |
| krillr.mini.JointStrike 2.0.0 | 13 | 77% |
| erdnis.Rover 0.3 | 7 | 86% |
| patson.PatsonTestBot 1.0 | 6 | 67% |
| pac.ABC 2.1 | 3 | 67% |
| pbg.R2D2 1.0 | 3 | 67% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 254 of 350 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 100 | 39% | 157 |
| mld.Infinity 2.2 | 68 | 27% | 42 |
| erdnis.Rover 0.3 | 27 | 11% | 45 |
| krillr.mini.JointStrike 2.0.0 | 21 | 8% | 43 |
| patson.PatsonTestBot 1.0 | 17 | 7% | 24 |
| mbh.Mbh 0.1 | 9 | 4% | 12 |
| pbg.R2D2 1.0 | 7 | 3% | 14 |
| pac.ABC 2.1 | 5 | 2% | 9 |

## Melee bench: F20

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 72.2 | 71 / 350 | 3.51 | 14.2% | 37557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.4% | 145 |
| hadur117.nano.SanaroG36 0.1 | 2.0 | 14.2% | 71 |
| nz.jdc.nano.GridFu 1.0 | 3.6 | 11.8% | 22 |
| fwb.Nine 1.0.1 | 3.7 | 11.7% | 43 |
| catcat20.Rabbit 0.001 | 5.0 | 10.1% | 31 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.9% | 10 |
| m3thos.mini.Eva01 0.5.5 | 6.6 | 8.8% | 16 |
| bayen.nut.Squirrel 1.615 | 7.6 | 7.8% | 10 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 4.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 74.9 | 7 / 35 | 3539 |
| 2 | 2 | 61.3 | 71.7 | 6 / 35 | 3836 |
| 3 | 2 | 60.8 | 68.9 | 8 / 35 | 3706 |
| 4 | 2 | 62.5 | 74.3 | 9 / 35 | 3991 |
| 5 | 2 | 59.7 | 64.1 | 11 / 35 | 3871 |
| 6 | 2 | 58.9 | 66.0 | 4 / 35 | 3609 |
| 7 | 2 | 61.1 | 72.4 | 6 / 35 | 3548 |
| 8 | 2 | 63.3 | 78.1 | 7 / 35 | 3923 |
| 9 | 2 | 61.2 | 72.4 | 5 / 35 | 3789 |
| 10 | 2 | 63.0 | 78.7 | 8 / 35 | 3745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 72 | 38% |
| fwb.Nine 1.0.1 | 32 | 59% |
| catcat20.Rabbit 0.001 | 20 | 50% |
| m3thos.mini.Eva01 0.5.5 | 13 | 15% |
| nz.jdc.nano.GridFu 1.0 | 10 | 20% |
| bayen.nut.Squirrel 1.615 | 7 | 57% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 280 of 350 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 116 | 41% | 136 |
| fwb.Nine 1.0.1 | 44 | 16% | 44 |
| nz.jdc.nano.GridFu 1.0 | 34 | 12% | 42 |
| catcat20.Rabbit 0.001 | 23 | 8% | 42 |
| m3thos.mini.Eva01 0.5.5 | 21 | 8% | 26 |
| bayen.nut.Squirrel 1.615 | 20 | 7% | 25 |
| djdjdj.NanoSkunk10 1.0 | 15 | 5% | 27 |
| ntc.ControlledChaos 1.1.4 | 3 | 1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.5 | 122 / 350 | 2.75 | 16.6% | 45626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.4 | 17.2% | 148 |
| hadur117.nano.SanaroG36 0.1 | 1.6 | 16.6% | 122 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.6% | 23 |
| cf.RiO.RiOx 4.2.1 | 4.1 | 11.6% | 24 |
| oa.weak.BotherBot 0.1 | 5.3 | 9.1% | 10 |
| eld.Hmm 1.0 | 5.6 | 8.6% | 23 |
| fire219.CatBot 1.0 | 7.0 | 6.9% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.9% | 1 |
| PSW.Relentless 0.1 | 8.9 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 79.4 | 11 / 35 | 4496 |
| 2 | 2 | 64.3 | 74.6 | 9 / 35 | 4585 |
| 3 | 2 | 64.9 | 79.7 | 10 / 35 | 4391 |
| 4 | 2 | 66.5 | 84.4 | 12 / 35 | 4377 |
| 5 | 1 | 65.8 | 80.3 | 14 / 35 | 4785 |
| 6 | 2 | 64.5 | 79.4 | 10 / 35 | 4326 |
| 7 | 2 | 66.7 | 82.5 | 12 / 35 | 4784 |
| 8 | 2 | 66.3 | 80.3 | 14 / 35 | 4661 |
| 9 | 1 | 65.1 | 80.0 | 13 / 35 | 4166 |
| 10 | 1 | 67.7 | 84.8 | 17 / 35 | 5055 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 138 | 52% |
| dummy.mini.Scimitar 1.01 | 40 | 83% |
| cf.RiO.RiOx 4.2.1 | 17 | 41% |
| eld.Hmm 1.0 | 11 | 55% |
| oa.weak.BotherBot 0.1 | 4 | 50% |

Hadur died in 229 of 350 rounds, at a mean tick of 1089. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 98 | 43% | 143 |
| dummy.mini.Scimitar 1.01 | 51 | 22% | 100 |
| cf.RiO.RiOx 4.2.1 | 40 | 17% | 48 |
| oa.weak.BotherBot 0.1 | 13 | 6% | 20 |
| eld.Hmm 1.0 | 8 | 3% | 18 |
| el.JumpShoot 0.2 | 6 | 3% | 8 |
| PSW.Relentless 0.1 | 6 | 3% | 6 |
| arthord.MannyPacquiao Beta | 4 | 2% | 4 |
| fire219.CatBot 1.0 | 3 | 1% | 3 |

## Melee bench: F23

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.6 | 88 / 350 | 2.93 | 15.7% | 40880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 19.0% | 172 |
| hadur117.nano.SanaroG36 0.1 | 2.1 | 15.7% | 88 |
| cre.Karolos 0.32 | 2.9 | 14.6% | 44 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.4% | 26 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.2% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.7 | 8.6% | 2 |
| sample.Walls 1.0 | 6.8 | 8.5% | 7 |
| cw.megas.Blade 0.8 | 6.9 | 8.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.7 | 81.9 | 13 / 35 | 4543 |
| 2 | 2 | 64.5 | 76.2 | 7 / 35 | 4075 |
| 3 | 2 | 63.3 | 74.9 | 5 / 35 | 3762 |
| 4 | 3 | 64.1 | 74.0 | 7 / 35 | 3795 |
| 5 | 2 | 63.5 | 74.9 | 8 / 35 | 3761 |
| 6 | 2 | 66.0 | 81.9 | 8 / 35 | 4349 |
| 7 | 2 | 65.8 | 79.7 | 12 / 35 | 4365 |
| 8 | 2 | 66.5 | 84.1 | 11 / 35 | 4131 |
| 9 | 2 | 64.4 | 78.4 | 9 / 35 | 3846 |
| 10 | 2 | 65.7 | 80.0 | 8 / 35 | 4253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 113 | 36% |
| cre.Karolos 0.32 | 43 | 42% |
| sample.Walls 1.0 | 20 | 70% |
| stelo.AreaTargetingBot 1.1 | 14 | 43% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| cw.megas.Blade 0.8 | 2 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 50% |

Hadur died in 263 of 350 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 120 | 46% | 165 |
| cre.Karolos 0.32 | 58 | 22% | 75 |
| stelo.AreaTargetingBot 1.1 | 43 | 16% | 50 |
| stelo.RamTrackSurfer 1.2 | 13 | 5% | 23 |
| sample.Walls 1.0 | 12 | 5% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 3% | 11 |
| cw.megas.Blade 0.8 | 7 | 3% | 8 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.4 | 59.7 | 38 / 350 | 4.62 | 11.5% | 28794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.0 | 14.9% | 86 |
| florent.XSeries.X2 0.12 | 2.7 | 13.6% | 67 |
| davidalves.Phoenix 0.54 | 2.9 | 13.4% | 87 |
| pedersen.Ugluk 1.1.1 | 3.9 | 12.0% | 43 |
| hadur117.nano.SanaroG36 0.1 | 4.6 | 11.5% | 38 |
| oog.melee.Corsair 1.0 | 6.2 | 9.4% | 13 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.5% | 14 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.7% | 1 |
| evd.X1 0.01 | 9.4 | 5.1% | 1 |
| as.FrankTheTank 1.3 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.1 | 61.9 | 1 / 35 | 2945 |
| 2 | 4 | 57.6 | 63.2 | 4 / 35 | 3103 |
| 3 | 5 | 55.3 | 59.4 | 4 / 35 | 2905 |
| 4 | 3 | 58.7 | 67.6 | 5 / 35 | 3222 |
| 5 | 5 | 55.8 | 60.6 | 4 / 35 | 2919 |
| 6 | 5 | 54.9 | 58.1 | 3 / 35 | 2975 |
| 7 | 5 | 53.3 | 56.5 | 3 / 35 | 2549 |
| 8 | 4 | 56.3 | 62.5 | 7 / 35 | 2786 |
| 9 | 6 | 50.8 | 49.2 | 3 / 35 | 2552 |
| 10 | 4 | 55.4 | 58.4 | 4 / 35 | 2838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 25 | 36% |
| davidalves.Phoenix 0.54 | 17 | 59% |
| florent.XSeries.X2 0.12 | 14 | 71% |
| pedersen.Ugluk 1.1.1 | 13 | 38% |
| stelo.SoJNanoMelee 1.1 | 8 | 38% |
| oog.melee.Corsair 1.0 | 4 | 25% |
| lunchie.Lunchbox 0.93 | 1 | 0% |
| evd.X1 0.01 | 1 | 0% |

Hadur died in 312 of 350 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 70 | 22% | 80 |
| florent.XSeries.X2 0.12 | 60 | 19% | 72 |
| davidalves.Phoenix 0.54 | 60 | 19% | 68 |
| pedersen.Ugluk 1.1.1 | 47 | 15% | 49 |
| oog.melee.Corsair 1.0 | 22 | 7% | 24 |
| stelo.SoJNanoMelee 1.1 | 21 | 7% | 25 |
| lunchie.Lunchbox 0.93 | 17 | 5% | 17 |
| evd.X1 0.01 | 9 | 3% | 9 |
| as.FrankTheTank 1.3 | 6 | 2% | 6 |

## Melee bench: F25

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 65.5 | 46 / 350 | 4.10 | 12.7% | 29854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.7 | 14.4% | 78 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.7% | 61 |
| hadur117.nano.SanaroG36 0.1 | 2.9 | 12.7% | 46 |
| jdw.Hurricane 1.4 | 3.4 | 12.4% | 66 |
| gre.svman4.Morfeas 1.4.1 | 5.1 | 10.4% | 33 |
| ds.Oo 2.2 | 5.8 | 9.5% | 30 |
| gjr.Cephalosporin 0.1 | 6.9 | 8.6% | 27 |
| awesomeness.Elite 1.0 | 8.2 | 7.5% | 5 |
| adt.Ar2 1.1 | 8.7 | 6.9% | 6 |
| amk.ChumbaMini 0.2 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.4 | 61.6 | 6 / 35 | 2987 |
| 2 | 4 | 55.8 | 60.3 | 2 / 35 | 2922 |
| 3 | 4 | 56.0 | 61.6 | 0 / 35 | 2963 |
| 4 | 2 | 58.6 | 67.0 | 5 / 35 | 2999 |
| 5 | 2 | 59.0 | 68.3 | 6 / 35 | 2867 |
| 6 | 2 | 59.7 | 69.2 | 8 / 35 | 2996 |
| 7 | 3 | 59.4 | 69.5 | 4 / 35 | 2958 |
| 8 | 4 | 55.7 | 59.0 | 4 / 35 | 2869 |
| 9 | 3 | 57.6 | 65.1 | 6 / 35 | 2874 |
| 10 | 1 | 61.0 | 73.7 | 5 / 35 | 3419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 44 | 18% |
| voidious.micro.BlitzBat 1.05 | 34 | 29% |
| jdw.Hurricane 1.4 | 24 | 58% |
| gre.svman4.Morfeas 1.4.1 | 16 | 44% |
| ds.Oo 2.2 | 6 | 33% |
| gjr.Cephalosporin 0.1 | 6 | 33% |
| awesomeness.Elite 1.0 | 4 | 50% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 79 | 26% | 88 |
| voidious.micro.BlitzBat 1.05 | 69 | 23% | 79 |
| jdw.Hurricane 1.4 | 41 | 13% | 50 |
| gre.svman4.Morfeas 1.4.1 | 31 | 10% | 36 |
| gjr.Cephalosporin 0.1 | 30 | 10% | 33 |
| ds.Oo 2.2 | 24 | 8% | 28 |
| adt.Ar2 1.1 | 14 | 5% | 17 |
| awesomeness.Elite 1.0 | 12 | 4% | 14 |
| amk.ChumbaMini 0.2 | 5 | 2% | 5 |

## Melee bench: F26

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 69.4 | 46 / 350 | 3.75 | 13.5% | 39760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.9% | 143 |
| hadur117.nano.SanaroG36 0.1 | 2.3 | 13.5% | 46 |
| shu.nitro.LENIN .T34 | 3.0 | 13.2% | 72 |
| lrem.Spectre 0.4.4 | 4.1 | 12.1% | 39 |
| js.PinBall 1.6 | 5.1 | 11.0% | 16 |
| gh.mini.GrubbmOne 1.0 | 5.5 | 10.7% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 9.2% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.6% | 7 |
| sample.SpinBot 1.0 | 8.9 | 5.4% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 73.7 | 5 / 35 | 4358 |
| 2 | 2 | 61.4 | 70.5 | 4 / 35 | 4159 |
| 3 | 2 | 60.3 | 68.6 | 7 / 35 | 3667 |
| 4 | 2 | 59.4 | 66.3 | 5 / 35 | 3633 |
| 5 | 2 | 60.0 | 67.0 | 5 / 35 | 4024 |
| 6 | 2 | 62.8 | 73.7 | 5 / 35 | 4321 |
| 7 | 4 | 58.8 | 66.3 | 2 / 35 | 3621 |
| 8 | 2 | 61.9 | 72.7 | 4 / 35 | 4083 |
| 9 | 2 | 60.0 | 65.7 | 3 / 35 | 4042 |
| 10 | 3 | 60.6 | 69.5 | 6 / 35 | 3852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 58 | 17% |
| shu.nitro.LENIN .T34 | 37 | 27% |
| lrem.Spectre 0.4.4 | 23 | 48% |
| js.PinBall 1.6 | 10 | 70% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 67% |
| jaybot.adv.bots.JayBot 2.0 | 4 | 75% |
| gh.mini.GrubbmOne 1.0 | 4 | 0% |
| sample.SpinBot 1.0 | 2 | 50% |

Hadur died in 306 of 350 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 99 | 32% | 106 |
| shu.nitro.LENIN .T34 | 61 | 20% | 73 |
| lrem.Spectre 0.4.4 | 43 | 14% | 48 |
| gh.mini.GrubbmOne 1.0 | 42 | 14% | 42 |
| js.PinBall 1.6 | 22 | 7% | 33 |
| jaybot.adv.bots.JayBot 2.0 | 18 | 6% | 24 |
| sample.SpinBot 1.0 | 11 | 4% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 10 | 3% | 13 |

## Melee bench: F27

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.5 | 68 / 350 | 3.92 | 13.1% | 32169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.4 | 15.6% | 136 |
| hadur117.nano.SanaroG36 0.1 | 2.6 | 13.1% | 68 |
| wee.Gem 1.8.4 | 3.6 | 11.8% | 57 |
| EH.Eagle 1.0.6 | 3.9 | 11.6% | 35 |
| sheldor.melee.nano.TestMelee 0.1 | 3.9 | 11.7% | 37 |
| throxbot.ThroxBot 0.1 | 6.8 | 8.5% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.6% | 9 |
| joe.ADinosaur 1.0 | 8.0 | 7.4% | 4 |
| caimano.Furia_Ceca 0.22 | 8.2 | 7.3% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 68.6 | 5 / 35 | 3804 |
| 2 | 2 | 62.5 | 78.4 | 13 / 35 | 3148 |
| 3 | 2 | 56.4 | 61.9 | 6 / 35 | 3065 |
| 4 | 1 | 61.2 | 74.0 | 10 / 35 | 3435 |
| 5 | 1 | 62.1 | 76.5 | 9 / 35 | 3460 |
| 6 | 2 | 60.5 | 71.7 | 8 / 35 | 3148 |
| 7 | 6 | 48.9 | 35.2 | 2 / 35 | 3820 |
| 8 | 3 | 58.8 | 71.1 | 5 / 35 | 2784 |
| 9 | 4 | 57.2 | 68.3 | 4 / 35 | 2580 |
| 10 | 3 | 59.0 | 69.5 | 6 / 35 | 2925 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 64 | 59% |
| wee.Gem 1.8.4 | 25 | 28% |
| EH.Eagle 1.0.6 | 23 | 43% |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 40% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 67% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| throxbot.ThroxBot 0.1 | 1 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 82 | 29% | 121 |
| sheldor.melee.nano.TestMelee 0.1 | 48 | 17% | 53 |
| wee.Gem 1.8.4 | 41 | 14% | 49 |
| EH.Eagle 1.0.6 | 31 | 11% | 41 |
| throxbot.ThroxBot 0.1 | 20 | 7% | 22 |
| caimano.Furia_Ceca 0.22 | 17 | 6% | 17 |
| joe.ADinosaur 1.0 | 17 | 6% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 14 | 5% | 17 |
| cs.Grudge 1.0 | 13 | 5% | 13 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 78.9 | 98 / 350 | 2.90 | 15.5% | 36283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.2 | 16.6% | 134 |
| hadur117.nano.SanaroG36 0.1 | 1.8 | 15.5% | 98 |
| uji.Antique 1.0 | 3.3 | 12.7% | 66 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.8% | 12 |
| qohnil.blot.BlotBot 3.61 | 4.4 | 10.9% | 26 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.4% | 6 |
| ahr.ice.Ice 1.0.2 | 6.8 | 8.1% | 7 |
| matt.advanced.Katana 1.0 | 8.6 | 6.2% | 1 |
| stelo.PianistNano 1.2 | 8.7 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 83.8 | 13 / 35 | 3839 |
| 2 | 2 | 64.5 | 82.5 | 8 / 35 | 3857 |
| 3 | 2 | 61.3 | 70.8 | 8 / 35 | 3608 |
| 4 | 2 | 61.7 | 73.0 | 9 / 35 | 3421 |
| 5 | 2 | 65.7 | 86.7 | 11 / 35 | 3621 |
| 6 | 2 | 61.6 | 74.6 | 8 / 35 | 3513 |
| 7 | 2 | 64.3 | 81.6 | 10 / 35 | 3671 |
| 8 | 1 | 63.0 | 76.8 | 12 / 35 | 3565 |
| 9 | 2 | 64.1 | 80.3 | 12 / 35 | 3422 |
| 10 | 2 | 63.6 | 78.7 | 7 / 35 | 3766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 119 | 39% |
| uji.Antique 1.0 | 47 | 53% |
| pfvicm.Sobieski 7.2.3b | 13 | 69% |
| qohnil.blot.BlotBot 3.61 | 13 | 31% |
| amk.ChumbaWumba 0.3 | 7 | 86% |
| matt.advanced.Katana 1.0 | 5 | 100% |
| ahr.ice.Ice 1.0.2 | 4 | 25% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 253 of 350 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 112 | 44% | 139 |
| uji.Antique 1.0 | 47 | 19% | 78 |
| pfvicm.Sobieski 7.2.3b | 35 | 14% | 44 |
| amk.ChumbaWumba 0.3 | 27 | 11% | 34 |
| qohnil.blot.BlotBot 3.61 | 16 | 6% | 20 |
| ahr.ice.Ice 1.0.2 | 5 | 2% | 11 |
| matt.advanced.Katana 1.0 | 4 | 2% | 12 |
| stelo.Lifestealer 1.0 | 4 | 2% | 7 |
| stelo.PianistNano 1.2 | 3 | 1% | 5 |

## Melee bench: F29

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 64.6 | 41 / 350 | 4.19 | 13.0% | 34542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.2 | 16.6% | 126 |
| zyx.mega.YersiniaPestis 3.1 | 1.9 | 15.7% | 114 |
| hadur117.nano.SanaroG36 0.1 | 3.7 | 13.0% | 41 |
| myl.micro.Troodon 1.10 | 3.8 | 12.9% | 20 |
| jok.PheonixM 0.1.2 | 4.4 | 11.5% | 24 |
| DBall.Anarchy 0.1 | 6.5 | 7.9% | 21 |
| ph.melee.ArcherME 0.3 | 6.7 | 7.6% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.8% | 0 |
| jangs.ns51 1.0 | 9.1 | 4.8% | 2 |
| ap.Frederick 1.1 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.6 | 70.8 | 5 / 35 | 3568 |
| 2 | 4 | 58.9 | 62.5 | 6 / 35 | 3441 |
| 3 | 4 | 56.0 | 54.9 | 4 / 35 | 3303 |
| 4 | 3 | 60.2 | 65.7 | 2 / 35 | 3599 |
| 5 | 3 | 59.8 | 65.7 | 4 / 35 | 3315 |
| 6 | 5 | 58.3 | 62.2 | 2 / 35 | 3211 |
| 7 | 4 | 59.5 | 64.1 | 5 / 35 | 3573 |
| 8 | 3 | 60.0 | 65.4 | 4 / 35 | 3713 |
| 9 | 4 | 59.4 | 65.1 | 4 / 35 | 3345 |
| 10 | 3 | 60.9 | 69.5 | 5 / 35 | 3474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 54 | 17% |
| zyx.mega.YersiniaPestis 3.1 | 31 | 45% |
| myl.micro.Troodon 1.10 | 15 | 60% |
| DBall.Anarchy 0.1 | 8 | 38% |
| jok.PheonixM 0.1.2 | 5 | 80% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 310 of 350 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 122 | 39% | 131 |
| zyx.mega.YersiniaPestis 3.1 | 65 | 21% | 77 |
| myl.micro.Troodon 1.10 | 57 | 18% | 66 |
| jok.PheonixM 0.1.2 | 34 | 11% | 37 |
| ph.melee.ArcherME 0.3 | 12 | 4% | 13 |
| DBall.Anarchy 0.1 | 11 | 4% | 16 |
| jangs.ns51 1.0 | 5 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 1% | 5 |

## Melee bench: F30

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.7 | 58.9 | 34 / 350 | 4.70 | 11.4% | 30344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 2.2 | 13.8% | 64 |
| catcat20.Matcha 0.006 | 2.2 | 13.9% | 89 |
| stelo.PastFuture 2.3.2 | 2.8 | 13.4% | 53 |
| darkcanuck.B26354 1.06 | 3.1 | 13.4% | 84 |
| hadur117.nano.SanaroG36 0.1 | 4.7 | 11.4% | 34 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.3% | 11 |
| ntc.Opposite 1.5 | 7.7 | 7.7% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.3% | 8 |
| tripphippy.Alice 1.1 | 8.2 | 7.4% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.1 | 56.2 | 3 / 35 | 3043 |
| 2 | 5 | 52.4 | 51.7 | 1 / 35 | 2891 |
| 3 | 5 | 56.3 | 59.4 | 4 / 35 | 3318 |
| 4 | 5 | 56.1 | 60.6 | 4 / 35 | 3037 |
| 5 | 4 | 55.2 | 58.4 | 3 / 35 | 2952 |
| 6 | 3 | 60.2 | 70.5 | 7 / 35 | 3230 |
| 7 | 5 | 55.1 | 57.8 | 3 / 35 | 2723 |
| 8 | 5 | 56.9 | 62.2 | 3 / 35 | 3088 |
| 9 | 5 | 54.1 | 54.6 | 4 / 35 | 2871 |
| 10 | 5 | 55.6 | 57.1 | 2 / 35 | 3191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 26 | 8% |
| catcat20.Matcha 0.006 | 23 | 39% |
| stelo.PastFuture 2.3.2 | 18 | 56% |
| oog.melee.Capulet 1.2 | 15 | 7% |
| intruder.PrairieWolf 2.61 | 9 | 89% |
| tripphippy.Alice 1.1 | 3 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 0% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 318 of 350 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 64 | 20% | 73 |
| oog.melee.Capulet 1.2 | 63 | 20% | 68 |
| catcat20.Matcha 0.006 | 60 | 19% | 68 |
| darkcanuck.B26354 1.06 | 57 | 18% | 59 |
| tripphippy.Alice 1.1 | 20 | 6% | 25 |
| ntc.Opposite 1.5 | 20 | 6% | 22 |
| intruder.PrairieWolf 2.61 | 19 | 6% | 20 |
| fowl3628800.LightningBolt 2.6.0 | 13 | 4% | 13 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |

## Melee bench: F31

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.2 | 56.2 | 14 / 350 | 4.95 | 10.7% | 27575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 189 |
| gh.mini.Griezel 0.2 | 2.1 | 14.0% | 85 |
| spinnercat.micro.Tyger 0.1 | 3.1 | 12.5% | 27 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.3% | 16 |
| hadur117.nano.SanaroG36 0.1 | 4.7 | 10.7% | 14 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.6% | 14 |
| fm.mammillarias 1.3 | 7.5 | 6.8% | 1 |
| timmit.nano.TimDog 0.33 | 7.7 | 7.0% | 5 |
| tlp.ThreeLeggedPig 1 | 9.1 | 5.0% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.8 | 52.7 | 2 / 35 | 2753 |
| 2 | 5 | 52.2 | 51.7 | 2 / 35 | 2489 |
| 3 | 5 | 52.9 | 53.3 | 3 / 35 | 2547 |
| 4 | 5 | 55.0 | 58.7 | 0 / 35 | 2677 |
| 5 | 4 | 54.8 | 58.1 | 0 / 35 | 2764 |
| 6 | 5 | 55.2 | 59.0 | 1 / 35 | 2778 |
| 7 | 6 | 51.7 | 49.8 | 1 / 35 | 2715 |
| 8 | 4 | 56.1 | 60.6 | 1 / 35 | 3021 |
| 9 | 5 | 54.8 | 58.1 | 1 / 35 | 2755 |
| 10 | 3 | 56.4 | 59.4 | 3 / 35 | 3076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 36 | 17% |
| gh.mini.Griezel 0.2 | 30 | 0% |
| spinnercat.micro.Tyger 0.1 | 11 | 18% |
| d414.nano.Quantum 1.0.0 | 7 | 0% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| gh.nano.Grofvuil 0.2 | 3 | 67% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 336 of 350 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 96 | 29% | 96 |
| abc.Shadow 3.84i | 68 | 20% | 75 |
| spinnercat.micro.Tyger 0.1 | 53 | 16% | 56 |
| d414.nano.Quantum 1.0.0 | 35 | 10% | 36 |
| fm.mammillarias 1.3 | 26 | 8% | 26 |
| gh.nano.Grofvuil 0.2 | 23 | 7% | 24 |
| timmit.nano.TimDog 0.33 | 21 | 6% | 23 |
| Gecko.ultimateGeckoBot 1.0 | 8 | 2% | 8 |
| tlp.ThreeLeggedPig 1 | 6 | 2% | 6 |

## Melee bench: F32

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 74.5 | 92 / 350 | 3.30 | 14.6% | 37014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroG36 0.1 | 1.6 | 14.6% | 92 |
| kawigi.sbf.FloodHT 0.9.2 | 1.6 | 14.9% | 115 |
| apc.botM 3.0 | 3.2 | 12.4% | 60 |
| lxx.ConceptA 0.8 | 4.1 | 11.2% | 13 |
| vjik.UnViolation 1.1 | 4.5 | 11.1% | 36 |
| bayen.UbaMicro 1.4 | 6.0 | 9.0% | 8 |
| yk.JahMicro 1.0 | 7.6 | 7.6% | 14 |
| panzer.Panzer 0.2 | 8.0 | 7.5% | 4 |
| conscience.Electron 1.3g | 8.5 | 6.6% | 0 |
| donjezza.Jezza 1.0 | 9.9 | 5.2% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 78.1 | 8 / 35 | 3603 |
| 2 | 2 | 59.0 | 67.6 | 8 / 35 | 3407 |
| 3 | 1 | 61.0 | 73.0 | 10 / 35 | 3611 |
| 4 | 2 | 62.9 | 79.0 | 8 / 35 | 3768 |
| 5 | 1 | 62.2 | 75.2 | 12 / 35 | 3914 |
| 6 | 2 | 59.2 | 69.5 | 9 / 35 | 3102 |
| 7 | 2 | 62.6 | 74.9 | 8 / 35 | 4216 |
| 8 | 2 | 62.1 | 75.2 | 9 / 35 | 3782 |
| 9 | 1 | 62.7 | 75.9 | 13 / 35 | 3836 |
| 10 | 2 | 61.6 | 76.2 | 7 / 35 | 3775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 85 | 31% |
| apc.botM 3.0 | 41 | 41% |
| vjik.UnViolation 1.1 | 24 | 58% |
| lxx.ConceptA 0.8 | 20 | 85% |
| donjezza.Jezza 1.0 | 9 | 44% |
| yk.JahMicro 1.0 | 9 | 33% |
| panzer.Panzer 0.2 | 8 | 100% |
| bayen.UbaMicro 1.4 | 5 | 60% |

Hadur died in 258 of 350 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 88 | 34% | 118 |
| lxx.ConceptA 0.8 | 54 | 21% | 59 |
| apc.botM 3.0 | 36 | 14% | 60 |
| vjik.UnViolation 1.1 | 22 | 9% | 41 |
| bayen.UbaMicro 1.4 | 18 | 7% | 22 |
| yk.JahMicro 1.0 | 11 | 4% | 15 |
| panzer.Panzer 0.2 | 10 | 4% | 11 |
| conscience.Electron 1.3g | 10 | 4% | 10 |
| donjezza.Jezza 1.0 | 9 | 3% | 14 |

## Melee bench: F33

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 67.1 | 45 / 350 | 3.96 | 13.5% | 37123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.9% | 140 |
| hadur117.nano.SanaroG36 0.1 | 2.5 | 13.5% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.1% | 46 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 11.2% | 43 |
| labg.Cataclysm 2.05 | 4.8 | 11.0% | 52 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.0 | 9.2% | 18 |
| baal.nano.N 1.42 | 6.3 | 9.0% | 3 |
| zyx.micro.Ant 1.1 | 8.3 | 5.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.9% | 2 |
| sanja.First 0.1 | 9.4 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 66.3 | 8 / 35 | 3997 |
| 2 | 4 | 58.1 | 62.5 | 5 / 35 | 3152 |
| 3 | 4 | 56.2 | 58.4 | 2 / 35 | 3309 |
| 4 | 3 | 60.0 | 66.3 | 4 / 35 | 3744 |
| 5 | 2 | 62.4 | 71.4 | 7 / 35 | 4027 |
| 6 | 2 | 61.1 | 72.1 | 3 / 35 | 3560 |
| 7 | 2 | 62.6 | 73.7 | 3 / 35 | 3999 |
| 8 | 2 | 58.6 | 64.4 | 4 / 35 | 3502 |
| 9 | 2 | 60.3 | 67.0 | 5 / 35 | 3733 |
| 10 | 2 | 61.0 | 68.9 | 4 / 35 | 4100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 59 | 27% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 47% |
| gre.svman4.Leonidas 1.3.2 | 17 | 35% |
| labg.Cataclysm 2.05 | 12 | 25% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 50% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |
| sanja.First 0.1 | 1 | 0% |

Hadur died in 305 of 350 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 121 | 40% | 143 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 16% | 65 |
| gre.svman4.Leonidas 1.3.2 | 41 | 13% | 45 |
| labg.Cataclysm 2.05 | 37 | 12% | 40 |
| kinsen.melee.Angsaichmophobia 1.8c | 23 | 8% | 23 |
| baal.nano.N 1.42 | 18 | 6% | 18 |
| sanja.First 0.1 | 8 | 3% | 8 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 1% | 4 |
| zyx.micro.Ant 1.1 | 4 | 1% | 4 |

## Melee bench: F34

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 72.7 | 66 / 350 | 3.46 | 14.5% | 41972 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.1% | 121 |
| kid.Gladiator .7.2 | 1.5 | 17.0% | 114 |
| hadur117.nano.SanaroG36 0.1 | 3.0 | 14.5% | 66 |
| jcs.Seth 1.8 | 4.4 | 11.2% | 22 |
| tcf.Reach 3 | 4.8 | 10.7% | 17 |
| cli.Dancer 1.1 | 5.8 | 9.6% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.8% | 5 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.9% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 67.3 | 7 / 35 | 4095 |
| 2 | 3 | 63.0 | 72.7 | 6 / 35 | 4226 |
| 3 | 3 | 61.0 | 64.4 | 7 / 35 | 3954 |
| 4 | 3 | 63.5 | 74.0 | 7 / 35 | 4171 |
| 5 | 3 | 64.2 | 74.9 | 10 / 35 | 4371 |
| 6 | 3 | 63.0 | 74.0 | 5 / 35 | 4255 |
| 7 | 3 | 64.8 | 78.7 | 8 / 35 | 4539 |
| 8 | 3 | 62.6 | 70.2 | 5 / 35 | 4045 |
| 9 | 3 | 63.1 | 71.1 | 6 / 35 | 4162 |
| 10 | 3 | 64.1 | 79.4 | 5 / 35 | 4154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 70 | 64% |
| kid.Gladiator .7.2 | 51 | 16% |
| jcs.Seth 1.8 | 21 | 43% |
| tcf.Reach 3 | 4 | 0% |
| cli.Dancer 1.1 | 3 | 67% |
| ratosh.Wesco 1.4 | 2 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 116 | 41% | 119 |
| stelo.Spread 0.9 | 85 | 30% | 130 |
| jcs.Seth 1.8 | 29 | 10% | 39 |
| tcf.Reach 3 | 19 | 7% | 22 |
| ratosh.Wesco 1.4 | 19 | 7% | 21 |
| cli.Dancer 1.1 | 12 | 4% | 14 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 3 |
| sample.VelociRobot 1.0 | 1 | 0% | 2 |

## Melee bench: F35

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 65.7 | 10 / 350 | 4.09 | 12.1% | 28765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.2% | 253 |
| gh.mini.Gruwel 0.9 | 2.1 | 13.9% | 51 |
| rz.HawkOnFire 0.1 | 3.6 | 12.7% | 9 |
| hadur117.nano.SanaroG36 0.1 | 4.0 | 12.1% | 10 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.8% | 26 |
| wit.Chuliath 1.0 | 6.5 | 6.9% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 66.3 | 2 / 35 | 2932 |
| 2 | 4 | 57.5 | 64.4 | 2 / 35 | 2683 |
| 3 | 4 | 57.0 | 64.1 | 1 / 35 | 2675 |
| 4 | 4 | 60.2 | 72.4 | 0 / 35 | 3020 |
| 5 | 5 | 56.8 | 63.5 | 0 / 35 | 2508 |
| 6 | 4 | 58.5 | 67.9 | 2 / 35 | 2819 |
| 7 | 4 | 57.8 | 65.1 | 0 / 35 | 2948 |
| 8 | 3 | 59.6 | 70.2 | 2 / 35 | 3132 |
| 9 | 3 | 58.5 | 64.8 | 1 / 35 | 3335 |
| 10 | 5 | 54.8 | 58.1 | 0 / 35 | 2713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 65 | 2% |
| gh.mini.Gruwel 0.9 | 28 | 25% |
| rz.HawkOnFire 0.1 | 5 | 40% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 0% |

Hadur died in 340 of 350 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 129 | 38% | 130 |
| gh.mini.Gruwel 0.9 | 63 | 19% | 71 |
| rz.HawkOnFire 0.1 | 57 | 17% | 58 |
| dmh.robocode.robot.BlackDeath 9.2 | 45 | 13% | 45 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 13 | 4% | 13 |
| wit.Chuliath 1.0 | 12 | 4% | 12 |
| stelo.MyAgileRobot 0.2 | 9 | 3% | 9 |
| myl.nano.KomoriNinja 1.1 | 8 | 2% | 8 |
| dans.Cinnamon 1.2 | 4 | 1% | 4 |

## Melee bench: F36

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 69.5 | 101 / 350 | 3.75 | 14.2% | 36094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroG36 0.1 | 1.6 | 14.2% | 101 |
| alpha.RainingFire 1.0 | 2.4 | 13.0% | 63 |
| bzdp.Pansy 2.1 | 2.6 | 12.9% | 65 |
| mz.Cork 0.1 | 4.2 | 11.7% | 31 |
| bvh.micro.Freya 0.3 | 4.3 | 11.5% | 35 |
| m3thos.Eva02 0.7.1 | 6.4 | 9.7% | 28 |
| bvh.mini.Fenrir 0.39 | 6.6 | 9.7% | 12 |
| dl.BetterWalls 1.0 | 8.2 | 7.0% | 8 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 6.3% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.0% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.4 | 72.7 | 8 / 35 | 3752 |
| 2 | 1 | 60.6 | 67.6 | 11 / 35 | 3671 |
| 3 | 1 | 61.5 | 71.7 | 10 / 35 | 3578 |
| 4 | 1 | 61.9 | 72.7 | 9 / 35 | 3867 |
| 5 | 4 | 56.0 | 60.0 | 7 / 35 | 2953 |
| 6 | 1 | 64.6 | 81.3 | 13 / 35 | 3882 |
| 7 | 1 | 60.2 | 66.3 | 11 / 35 | 3520 |
| 8 | 2 | 60.2 | 66.0 | 11 / 35 | 3706 |
| 9 | 2 | 61.2 | 69.2 | 10 / 35 | 3850 |
| 10 | 2 | 59.8 | 67.3 | 11 / 35 | 3315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 57% |
| alpha.RainingFire 1.0 | 26 | 54% |
| bvh.micro.Freya 0.3 | 23 | 74% |
| mz.Cork 0.1 | 22 | 59% |
| bvh.mini.Fenrir 0.39 | 18 | 100% |
| m3thos.Eva02 0.7.1 | 12 | 42% |
| dl.BetterWalls 1.0 | 5 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 33% |

Hadur died in 250 of 350 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 53 | 21% | 73 |
| bzdp.Pansy 2.1 | 52 | 21% | 80 |
| mz.Cork 0.1 | 36 | 14% | 45 |
| m3thos.Eva02 0.7.1 | 32 | 13% | 36 |
| bvh.mini.Fenrir 0.39 | 28 | 11% | 39 |
| bvh.micro.Freya 0.3 | 24 | 10% | 39 |
| dl.BetterWalls 1.0 | 11 | 4% | 17 |
| squidM.TentalceMeleeNano 1.1 | 9 | 4% | 14 |
| sample.MyFirstRobot 1.0 | 5 | 2% | 7 |

## Melee bench: F37

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 77.9 | 118 / 350 | 2.99 | 15.7% | 46124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroG36 0.1 | 1.0 | 15.7% | 118 |
| germ.TheMind .2 | 2.5 | 11.7% | 62 |
| EBBU.Sim2 1.02 | 3.6 | 10.6% | 23 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.7% | 21 |
| agrach.Dalek 1.0 | 6.2 | 9.1% | 39 |
| stelo.UntouchableNano 1.3 | 6.4 | 8.9% | 30 |
| mb.Beast 0.1 | 7.5 | 8.7% | 20 |
| lmk.ACPFinal 0.1 | 7.6 | 8.6% | 15 |
| skm.Ryubot 1.0 | 7.7 | 8.3% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 76.2 | 12 / 35 | 4801 |
| 2 | 1 | 63.2 | 79.0 | 12 / 35 | 4698 |
| 3 | 1 | 62.3 | 79.0 | 9 / 35 | 4483 |
| 4 | 1 | 62.2 | 75.9 | 12 / 35 | 4515 |
| 5 | 1 | 60.5 | 74.6 | 11 / 35 | 3999 |
| 6 | 1 | 64.5 | 80.6 | 16 / 35 | 5062 |
| 7 | 1 | 65.2 | 84.8 | 15 / 35 | 4771 |
| 8 | 1 | 61.7 | 75.9 | 8 / 35 | 4493 |
| 9 | 1 | 62.4 | 75.2 | 14 / 35 | 4763 |
| 10 | 1 | 62.4 | 77.8 | 9 / 35 | 4539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 36 | 25% |
| mb.Beast 0.1 | 31 | 77% |
| stelo.UntouchableNano 1.3 | 25 | 72% |
| EBBU.Sim2 1.02 | 24 | 63% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 74% |
| skm.Ryubot 1.0 | 21 | 43% |
| lmk.ACPFinal 0.1 | 16 | 75% |
| agrach.Dalek 1.0 | 15 | 80% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 235 of 350 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 62 | 26% | 75 |
| EBBU.Sim2 1.02 | 38 | 16% | 54 |
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 12% | 49 |
| skm.Ryubot 1.0 | 22 | 9% | 29 |
| agrach.Dalek 1.0 | 21 | 9% | 36 |
| mb.Beast 0.1 | 19 | 8% | 38 |
| lmk.ACPFinal 0.1 | 18 | 8% | 30 |
| stelo.UntouchableNano 1.3 | 16 | 7% | 25 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 5% | 13 |

## Melee bench: F38

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 63.3 | 37 / 350 | 4.31 | 12.1% | 31738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.0% | 163 |
| bvh.mini.Freya 0.55 | 2.8 | 13.0% | 39 |
| hadur117.nano.SanaroG36 0.1 | 3.5 | 12.1% | 37 |
| bts.mega.Gnarly 1.4 | 3.9 | 11.8% | 58 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 11.0% | 20 |
| cs.Wren 1.0 | 5.6 | 10.9% | 20 |
| kdf.KoulDestroyer 1.0 | 6.2 | 9.3% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.3% | 3 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.5 | 65.7 | 5 / 35 | 3261 |
| 2 | 3 | 58.3 | 67.6 | 2 / 35 | 3078 |
| 3 | 2 | 59.6 | 67.6 | 5 / 35 | 3650 |
| 4 | 2 | 59.3 | 67.6 | 3 / 35 | 3661 |
| 5 | 3 | 57.8 | 67.6 | 3 / 35 | 2701 |
| 6 | 6 | 53.9 | 54.3 | 4 / 35 | 2711 |
| 7 | 3 | 56.2 | 60.3 | 2 / 35 | 3139 |
| 8 | 7 | 52.2 | 49.8 | 4 / 35 | 2907 |
| 9 | 3 | 58.4 | 65.7 | 5 / 35 | 3167 |
| 10 | 3 | 58.9 | 66.3 | 4 / 35 | 3463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 51 | 43% |
| bts.mega.Gnarly 1.4 | 14 | 0% |
| bvh.mini.Freya 0.55 | 14 | 43% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 0% |
| cs.Wren 1.0 | 9 | 22% |
| kdf.KoulDestroyer 1.0 | 4 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 50% |
| matt.UnderDark3 2.4.34 | 2 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 86 | 27% | 106 |
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 15% | 48 |
| bts.mega.Gnarly 1.4 | 44 | 14% | 46 |
| bvh.mini.Freya 0.55 | 44 | 14% | 44 |
| cs.Wren 1.0 | 43 | 14% | 49 |
| kdf.KoulDestroyer 1.0 | 28 | 9% | 29 |
| kawigi.spare.SpareParts 0.7.6nosnd | 15 | 5% | 19 |
| bzdp.BoxCar 2.0 | 4 | 1% | 4 |
| matt.UnderDark3 2.4.34 | 3 | 1% | 5 |

## Melee bench: F39

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 64.3 | 41 / 350 | 4.22 | 12.5% | 35310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.6% | 86 |
| az.Ololobot 0.2.4 | 2.0 | 14.0% | 124 |
| hadur117.nano.SanaroG36 0.1 | 3.1 | 12.5% | 41 |
| catcat20.Lambda 0.024 | 3.9 | 11.4% | 45 |
| stelo.SoRobotNanoMelee 1.2 | 5.6 | 9.4% | 27 |
| winamp32.micro.MicroMacro 1.0 | 6.4 | 8.7% | 12 |
| apollokidd.ApolloKidd 0.9 | 6.6 | 8.6% | 8 |
| gimp.GimpBot 0.1 | 7.2 | 8.3% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.4 | 5.9% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.6 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.2 | 55.9 | 1 / 35 | 3586 |
| 2 | 3 | 55.6 | 59.7 | 5 / 35 | 3185 |
| 3 | 4 | 55.5 | 61.0 | 2 / 35 | 3226 |
| 4 | 3 | 58.8 | 68.3 | 4 / 35 | 3558 |
| 5 | 3 | 59.6 | 71.4 | 4 / 35 | 3621 |
| 6 | 3 | 60.0 | 69.2 | 7 / 35 | 3876 |
| 7 | 2 | 59.4 | 68.9 | 7 / 35 | 3458 |
| 8 | 2 | 58.0 | 66.0 | 5 / 35 | 3500 |
| 9 | 4 | 56.7 | 61.0 | 4 / 35 | 3689 |
| 10 | 3 | 56.2 | 61.3 | 2 / 35 | 3611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 47 | 11% |
| bvh.fry.Freya 0.82 | 35 | 29% |
| catcat20.Lambda 0.024 | 27 | 63% |
| stelo.SoRobotNanoMelee 1.2 | 11 | 27% |
| apollokidd.ApolloKidd 0.9 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 3 | 33% |
| gimp.GimpBot 0.1 | 2 | 50% |

Hadur died in 311 of 350 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 105 | 34% | 112 |
| az.Ololobot 0.2.4 | 68 | 22% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 39 | 13% | 41 |
| catcat20.Lambda 0.024 | 29 | 9% | 42 |
| apollokidd.ApolloKidd 0.9 | 26 | 8% | 32 |
| winamp32.micro.MicroMacro 1.0 | 14 | 5% | 16 |
| whitesquare.robots.SkynetAdvanced 1.1 | 12 | 4% | 13 |
| gimp.GimpBot 0.1 | 9 | 3% | 12 |
| dcs.Eater_of_Worlds 1.1.3-A | 9 | 3% | 10 |

## Melee bench: F41

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 67.6 | 58 / 350 | 3.92 | 13.0% | 32061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.9% | 161 |
| ary.Swarm 1.1 | 2.6 | 14.0% | 43 |
| hadur117.nano.SanaroG36 0.1 | 3.2 | 13.0% | 58 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 13.1% | 48 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.8% | 29 |
| shrub.Silver v048 | 6.2 | 8.9% | 6 |
| zyx.nano.Ant 1.1 | 6.8 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 8.4 | 6.0% | 5 |
| stelo.Mirror 1.1 | 8.6 | 5.6% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 70.5 | 5 / 35 | 2917 |
| 2 | 3 | 60.9 | 69.5 | 7 / 35 | 3454 |
| 3 | 2 | 61.6 | 71.7 | 9 / 35 | 3417 |
| 4 | 2 | 62.0 | 72.7 | 11 / 35 | 3407 |
| 5 | 4 | 56.9 | 62.5 | 4 / 35 | 2806 |
| 6 | 3 | 60.6 | 70.2 | 6 / 35 | 3298 |
| 7 | 4 | 57.0 | 59.7 | 3 / 35 | 3161 |
| 8 | 4 | 59.6 | 68.3 | 4 / 35 | 3030 |
| 9 | 4 | 57.7 | 62.9 | 4 / 35 | 3151 |
| 10 | 4 | 60.3 | 67.6 | 5 / 35 | 3420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 62 | 23% |
| ary.Swarm 1.1 | 27 | 70% |
| lessonz.robocode.Oz 0.5.0 | 23 | 61% |
| simonton.nano.MeleeSeed 1.8 | 13 | 54% |
| shrub.Silver v048 | 3 | 67% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 89 | 30% | 104 |
| ary.Swarm 1.1 | 73 | 25% | 89 |
| lessonz.robocode.Oz 0.5.0 | 52 | 18% | 62 |
| simonton.nano.MeleeSeed 1.8 | 42 | 14% | 52 |
| zyx.nano.Ant 1.1 | 14 | 5% | 15 |
| shrub.Silver v048 | 12 | 4% | 14 |
| jsal.Jsalbot 1.0 | 4 | 1% | 7 |
| stelo.Mirror 1.1 | 4 | 1% | 4 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 71.8 | 65 / 350 | 3.54 | 14.1% | 38991 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 167 |
| maribo.mini.MiniQuester 0.1 | 2.9 | 14.4% | 44 |
| hadur117.nano.SanaroG36 0.1 | 2.9 | 14.1% | 65 |
| ara.Shera 0.88 | 3.2 | 13.9% | 59 |
| amz.NanoClone 1.41 | 5.0 | 9.4% | 4 |
| maribo.IotaCT 1.1 | 6.2 | 7.7% | 0 |
| dsw.StaticD 1.0 | 6.9 | 7.1% | 8 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.6% | 2 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.4% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.4 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.4 | 68.6 | 6 / 35 | 3705 |
| 2 | 2 | 63.1 | 74.9 | 7 / 35 | 4091 |
| 3 | 3 | 60.7 | 70.2 | 7 / 35 | 3579 |
| 4 | 4 | 60.9 | 70.2 | 4 / 35 | 4054 |
| 5 | 2 | 62.4 | 73.7 | 9 / 35 | 3901 |
| 6 | 3 | 60.1 | 67.9 | 5 / 35 | 3921 |
| 7 | 3 | 60.5 | 69.8 | 6 / 35 | 3638 |
| 8 | 2 | 63.6 | 75.2 | 12 / 35 | 4090 |
| 9 | 3 | 61.7 | 73.7 | 4 / 35 | 3771 |
| 10 | 3 | 62.6 | 74.0 | 5 / 35 | 4241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 86 | 33% |
| maribo.mini.MiniQuester 0.1 | 30 | 80% |
| ara.Shera 0.88 | 21 | 33% |
| dsw.StaticD 1.0 | 5 | 60% |
| maribo.IotaCT 1.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 111 | 39% | 139 |
| ara.Shera 0.88 | 72 | 25% | 80 |
| maribo.mini.MiniQuester 0.1 | 61 | 21% | 83 |
| amz.NanoClone 1.41 | 12 | 4% | 12 |
| maribo.IotaCT 1.1 | 10 | 4% | 12 |
| stelo.MirrorMicro 1.0 | 10 | 4% | 9 |
| mme.NikeEnhanced 2.0 | 4 | 1% | 6 |
| dsw.StaticD 1.0 | 3 | 1% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 63.0 | 16 / 350 | 4.33 | 12.2% | 33492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.9% | 279 |
| brainfade.melee.Dusk 0.44 | 2.9 | 12.7% | 24 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.4% | 18 |
| hadur117.nano.SanaroG36 0.1 | 3.3 | 12.2% | 16 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.1% | 8 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 9.6% | 2 |
| mz.NanoGod 2.02 | 7.1 | 8.1% | 2 |
| jab.DiamondStealer 5 | 7.9 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 66.0 | 1 / 35 | 3491 |
| 2 | 3 | 59.5 | 62.2 | 3 / 35 | 3234 |
| 3 | 2 | 60.3 | 66.7 | 1 / 35 | 3492 |
| 4 | 3 | 58.5 | 60.6 | 1 / 35 | 3168 |
| 5 | 4 | 59.5 | 61.6 | 2 / 35 | 3571 |
| 6 | 5 | 57.9 | 57.8 | 2 / 35 | 3219 |
| 7 | 4 | 59.2 | 59.7 | 2 / 35 | 3600 |
| 8 | 3 | 59.6 | 65.4 | 0 / 35 | 3178 |
| 9 | 3 | 60.7 | 68.3 | 2 / 35 | 3248 |
| 10 | 4 | 59.2 | 62.2 | 2 / 35 | 3291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 8% |
| brainfade.melee.Dusk 0.44 | 8 | 63% |
| dummy.micro.Sparrow 2.5 | 5 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 50% |

Hadur died in 335 of 350 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 175 | 52% | 182 |
| dummy.micro.Sparrow 2.5 | 40 | 12% | 43 |
| wcsv.melee.EngineerMelee 0.1 | 37 | 11% | 38 |
| brainfade.melee.Dusk 0.44 | 36 | 11% | 40 |
| mz.NanoGod 2.02 | 21 | 6% | 21 |
| Krabb.akim2.Akim2 1.1b | 16 | 5% | 16 |
| jab.DiamondStealer 5 | 8 | 2% | 8 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 69.6 | 60 / 350 | 3.74 | 14.0% | 39173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.0 | 17.1% | 157 |
| tzu.TheArtOfWar 1.2 | 2.3 | 15.0% | 81 |
| hadur117.nano.SanaroG36 0.1 | 2.8 | 14.0% | 60 |
| jwirde.Gort 2.0 | 4.3 | 11.3% | 33 |
| wompi.Quokka 1.6 | 4.8 | 10.4% | 9 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 8.8% | 4 |
| disan.Chair 2.2.0 | 7.4 | 7.1% | 1 |
| stf.PanzerGeneral 0.1 | 7.6 | 6.9% | 3 |
| sample.Crazy 1.0 | 9.3 | 4.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 62.5 | 4 / 35 | 3970 |
| 2 | 2 | 63.8 | 77.1 | 8 / 35 | 3871 |
| 3 | 3 | 62.4 | 73.0 | 8 / 35 | 4108 |
| 4 | 4 | 56.5 | 59.4 | 3 / 35 | 3476 |
| 5 | 3 | 62.2 | 72.1 | 7 / 35 | 3961 |
| 6 | 2 | 63.3 | 75.2 | 9 / 35 | 3965 |
| 7 | 3 | 62.1 | 71.4 | 7 / 35 | 4142 |
| 8 | 3 | 58.9 | 62.5 | 7 / 35 | 3640 |
| 9 | 3 | 60.1 | 66.3 | 3 / 35 | 3876 |
| 10 | 2 | 63.0 | 75.9 | 4 / 35 | 4164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 66 | 47% |
| tzu.TheArtOfWar 1.2 | 41 | 41% |
| jwirde.Gort 2.0 | 20 | 35% |
| wompi.Quokka 1.6 | 4 | 25% |
| disan.Chair 2.2.0 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 0% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 0% |

Hadur died in 291 of 350 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 95 | 33% | 130 |
| tzu.TheArtOfWar 1.2 | 88 | 30% | 102 |
| jwirde.Gort 2.0 | 44 | 15% | 51 |
| wompi.Quokka 1.6 | 22 | 8% | 22 |
| stf.PanzerGeneral 0.1 | 12 | 4% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 4% | 12 |
| amk.jointstrike.JointStrike 0.2 | 8 | 3% | 8 |
| disan.Chair 2.2.0 | 7 | 2% | 8 |
| sample.Crazy 1.0 | 4 | 1% | 4 |

## Melee bench: F45

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 69.8 | 65 / 350 | 3.71 | 14.6% | 41480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroG36 0.1 | 1.0 | 14.6% | 65 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 12.6% | 173 |
| jje.BagPuss 1.2 | 3.2 | 12.4% | 23 |
| sul.Lunar 1.1 | 3.9 | 11.6% | 31 |
| myl.nano.Graviton 1.10 | 4.6 | 11.0% | 21 |
| hvilela.HVilela 0.9 | 6.1 | 9.2% | 4 |
| fm.claire 1.7 | 6.8 | 8.9% | 6 |
| pez.mini.ChironexFleckeri 0.5 | 7.9 | 7.9% | 3 |
| wit.Deep7 2.0 | 8.9 | 6.4% | 20 |
| abud.ThirdRobo 1.0 | 9.9 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 71.7 | 7 / 35 | 4175 |
| 2 | 1 | 62.5 | 72.7 | 8 / 35 | 4298 |
| 3 | 1 | 59.0 | 62.9 | 7 / 35 | 3842 |
| 4 | 1 | 64.5 | 75.9 | 10 / 35 | 4717 |
| 5 | 1 | 60.1 | 66.7 | 6 / 35 | 4048 |
| 6 | 1 | 61.7 | 71.7 | 6 / 35 | 4095 |
| 7 | 1 | 61.1 | 71.7 | 3 / 35 | 4043 |
| 8 | 1 | 60.6 | 68.6 | 8 / 35 | 3792 |
| 9 | 1 | 60.0 | 67.0 | 4 / 35 | 4264 |
| 10 | 1 | 61.4 | 69.5 | 6 / 35 | 4206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 81 | 36% |
| sul.Lunar 1.1 | 21 | 48% |
| jje.BagPuss 1.2 | 16 | 56% |
| myl.nano.Graviton 1.10 | 12 | 25% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 86% |
| fm.claire 1.7 | 5 | 60% |
| wit.Deep7 2.0 | 5 | 40% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 1213. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 58 | 20% | 0 |
| myl.nano.Graviton 1.10 | 51 | 18% | 64 |
| jje.BagPuss 1.2 | 49 | 17% | 82 |
| sul.Lunar 1.1 | 47 | 16% | 76 |
| hvilela.HVilela 0.9 | 25 | 9% | 32 |
| fm.claire 1.7 | 25 | 9% | 30 |
| pez.mini.ChironexFleckeri 0.5 | 15 | 5% | 28 |
| wit.Deep7 2.0 | 10 | 3% | 20 |
| abud.ThirdRobo 1.0 | 6 | 2% | 14 |

## Melee bench: F46

hadur117.nano.SanaroG36 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 69.4 | 28 / 350 | 3.75 | 12.6% | 29834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.0% | 147 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.9% | 136 |
| hadur117.nano.SanaroG36 0.1 | 3.1 | 12.6% | 28 |
| cx.Princess 1.0 | 4.5 | 10.7% | 30 |
| mz.MicroSheep 1.0 | 4.7 | 10.5% | 6 |
| sadoner.killer 0.2 | 5.8 | 9.3% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.4% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.4% | 1 |
| kurios.DOSexe .9a | 9.1 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 67.3 | 5 / 35 | 2827 |
| 2 | 3 | 58.1 | 67.6 | 2 / 35 | 2827 |
| 3 | 3 | 60.9 | 74.3 | 2 / 35 | 3183 |
| 4 | 3 | 61.2 | 75.9 | 4 / 35 | 3119 |
| 5 | 3 | 57.0 | 66.3 | 0 / 35 | 2735 |
| 6 | 3 | 60.6 | 72.1 | 5 / 35 | 3162 |
| 7 | 3 | 59.3 | 69.5 | 2 / 35 | 3068 |
| 8 | 3 | 60.3 | 71.4 | 3 / 35 | 3134 |
| 9 | 4 | 56.9 | 64.4 | 1 / 35 | 2849 |
| 10 | 3 | 57.4 | 65.1 | 4 / 35 | 2930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 22% |
| rsalesc.melee.Medina 0.4.5 | 40 | 28% |
| cx.Princess 1.0 | 7 | 14% |
| arthord.NanoSatanMelee Beta | 3 | 67% |
| mz.MicroSheep 1.0 | 2 | 0% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 124 | 39% | 137 |
| rsalesc.melee.Medina 0.4.5 | 87 | 27% | 99 |
| cx.Princess 1.0 | 34 | 11% | 35 |
| arthord.NanoSatanMelee Beta | 22 | 7% | 23 |
| mz.MicroSheep 1.0 | 22 | 7% | 22 |
| sadoner.killer 0.2 | 17 | 5% | 17 |
| jeremyreeder.collective.Prophet 5 | 11 | 3% | 12 |
| kurios.DOSexe .9a | 4 | 1% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |

