# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 76.8 | 61 / 350 | 3.09 | 14.1% | 34558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 227 |
| hadur117.nano.SanaroHL 0.2 | 2.1 | 14.1% | 61 |
| sgp.JollyNinja 3.53 | 3.3 | 12.3% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.4% | 11 |
| mz.MicroGodMelee 1 | 5.0 | 10.8% | 5 |
| lorneswork.Predator 1.0 | 5.3 | 10.8% | 13 |
| adt.Ar2 1.0 | 7.1 | 6.8% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.6% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 73.0 | 5 / 35 | 3154 |
| 2 | 2 | 63.1 | 83.8 | 3 / 35 | 3301 |
| 3 | 2 | 60.4 | 74.3 | 3 / 35 | 3417 |
| 4 | 2 | 63.0 | 80.6 | 7 / 35 | 3440 |
| 5 | 2 | 62.5 | 78.1 | 9 / 35 | 3286 |
| 6 | 2 | 61.4 | 75.2 | 4 / 35 | 3517 |
| 7 | 2 | 63.0 | 79.0 | 9 / 35 | 3763 |
| 8 | 2 | 63.9 | 79.4 | 11 / 35 | 3775 |
| 9 | 3 | 60.1 | 68.9 | 5 / 35 | 3483 |
| 10 | 2 | 61.4 | 75.6 | 5 / 35 | 3422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 133 | 10% |
| sgp.JollyNinja 3.53 | 28 | 57% |
| mz.MicroGodMelee 1 | 18 | 94% |
| lorneswork.Predator 1.0 | 12 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 40% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 290 of 350 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 150 | 52% | 165 |
| sgp.JollyNinja 3.53 | 47 | 16% | 60 |
| lorneswork.Predator 1.0 | 33 | 11% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 31 | 11% | 36 |
| mz.MicroGodMelee 1 | 19 | 7% | 34 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 2% | 7 |
| adt.Ar2 1.0 | 4 | 1% | 4 |
| skm.butterfly 1.0 | 1 | 0% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 71.7 | 81 / 350 | 3.55 | 14.1% | 35233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.7 | 14.9% | 82 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.7% | 89 |
| hadur117.nano.SanaroHL 0.2 | 2.3 | 14.1% | 81 |
| lrem.micro.SpikeSoldier 0.4 | 4.6 | 10.7% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.2% | 24 |
| sch.Simone 0.3d | 6.7 | 8.5% | 22 |
| fnc.bandit.Bandit 5.2.0 | 6.9 | 8.3% | 8 |
| Noran.BitchingElk 0.054 | 7.6 | 7.6% | 25 |
| stelo.PatternRobot 1.0 | 8.6 | 6.7% | 11 |
| fullsail.SweetTea 1.1 | 9.9 | 4.3% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 66.0 | 6 / 35 | 3683 |
| 2 | 3 | 59.4 | 70.2 | 4 / 35 | 3333 |
| 3 | 3 | 59.4 | 68.3 | 7 / 35 | 3284 |
| 4 | 2 | 63.3 | 76.5 | 11 / 35 | 3843 |
| 5 | 3 | 60.2 | 70.2 | 8 / 35 | 3405 |
| 6 | 1 | 63.9 | 79.0 | 9 / 35 | 3940 |
| 7 | 3 | 60.3 | 69.8 | 8 / 35 | 3509 |
| 8 | 1 | 64.1 | 80.6 | 13 / 35 | 3572 |
| 9 | 3 | 56.4 | 60.6 | 4 / 35 | 3102 |
| 10 | 1 | 62.2 | 75.6 | 11 / 35 | 3562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 54 | 30% |
| pulsar.PulsarMax 0.8.9 | 48 | 56% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 69% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| Noran.BitchingElk 0.054 | 11 | 45% |
| sch.Simone 0.3d | 8 | 63% |
| fnc.bandit.Bandit 5.2.0 | 5 | 80% |
| stelo.PatternRobot 1.0 | 4 | 25% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 269 of 350 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 83 | 31% | 106 |
| pulsar.PulsarMax 0.8.9 | 55 | 20% | 77 |
| lrem.micro.SpikeSoldier 0.4 | 35 | 13% | 42 |
| stelo.PatternRobot 1.0 | 29 | 11% | 29 |
| com.cohesiva.robocode.ManOwaR 1.0 | 25 | 9% | 37 |
| sch.Simone 0.3d | 13 | 5% | 17 |
| fnc.bandit.Bandit 5.2.0 | 13 | 5% | 16 |
| Noran.BitchingElk 0.054 | 12 | 4% | 21 |
| fullsail.SweetTea 1.1 | 4 | 1% | 5 |

## Melee bench: F03

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 78.3 | 66 / 350 | 2.95 | 14.6% | 38111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 1.8 | 15.1% | 105 |
| radnor.DoctorBob 1.42 | 2.0 | 15.2% | 95 |
| hadur117.nano.SanaroHL 0.2 | 2.3 | 14.6% | 66 |
| vuen.Cake 2.51 | 3.9 | 13.0% | 66 |
| urdos.URDOS 1.3 | 5.0 | 10.2% | 15 |
| adt.Ar1 2.1 | 6.3 | 7.9% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.1% | 1 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.1 | 5.7% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 79.0 | 10 / 35 | 3898 |
| 2 | 2 | 60.9 | 74.6 | 7 / 35 | 3744 |
| 3 | 2 | 62.7 | 80.6 | 7 / 35 | 3757 |
| 4 | 3 | 61.0 | 75.2 | 6 / 35 | 3721 |
| 5 | 2 | 62.1 | 79.0 | 9 / 35 | 3474 |
| 6 | 1 | 63.7 | 80.3 | 8 / 35 | 4270 |
| 7 | 3 | 61.1 | 74.9 | 4 / 35 | 3963 |
| 8 | 3 | 61.9 | 79.7 | 6 / 35 | 3733 |
| 9 | 2 | 62.7 | 81.0 | 4 / 35 | 3916 |
| 10 | 3 | 62.1 | 79.0 | 5 / 35 | 3635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 12% |
| radnor.DoctorBob 1.42 | 58 | 40% |
| vuen.Cake 2.51 | 53 | 45% |
| urdos.URDOS 1.3 | 13 | 46% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 107 | 37% | 112 |
| radnor.DoctorBob 1.42 | 81 | 28% | 101 |
| vuen.Cake 2.51 | 43 | 15% | 69 |
| urdos.URDOS 1.3 | 28 | 10% | 35 |
| adt.Ar1 2.1 | 8 | 3% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 2% | 7 |
| oa.weak.FlyMk1 0.1 | 4 | 1% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 1% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 73.1 | 8 / 350 | 3.42 | 13.8% | 40498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.4% | 322 |
| hadur117.nano.SanaroHL 0.2 | 2.5 | 13.8% | 8 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 14.0% | 16 |
| TNT.TNT 0.99.1 | 4.1 | 10.6% | 3 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 0 |
| css.Delitioner 0.11 | 6.1 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.4 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.6 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 74.9 | 1 / 35 | 4479 |
| 2 | 2 | 61.4 | 71.4 | 2 / 35 | 3839 |
| 3 | 2 | 63.5 | 78.7 | 1 / 35 | 4040 |
| 4 | 3 | 60.6 | 68.6 | 0 / 35 | 3894 |
| 5 | 3 | 61.5 | 71.1 | 1 / 35 | 3887 |
| 6 | 3 | 62.3 | 74.9 | 2 / 35 | 3745 |
| 7 | 3 | 60.6 | 70.5 | 0 / 35 | 3624 |
| 8 | 2 | 63.8 | 76.8 | 0 / 35 | 4459 |
| 9 | 3 | 61.0 | 69.8 | 1 / 35 | 3828 |
| 10 | 2 | 63.7 | 74.6 | 0 / 35 | 4703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 168 | 2% |
| apc.LeeroyJenkins2 1.0 | 6 | 33% |
| TNT.TNT 0.99.1 | 2 | 50% |
| josago.Jorgito 0.16 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 342 of 350 rounds, at a mean tick of 1233. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 234 | 68% | 237 |
| apc.LeeroyJenkins2 1.0 | 47 | 14% | 49 |
| josago.Jorgito 0.16 | 26 | 8% | 27 |
| TNT.TNT 0.99.1 | 16 | 5% | 17 |
| css.Delitioner 0.11 | 12 | 4% | 13 |
| tj.zombie1n 1.0.1 | 5 | 1% | 5 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |

## Melee bench: F06

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 71.0 | 90 / 350 | 3.61 | 13.6% | 31345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.3 | 15.4% | 78 |
| origin.SleepSiphon 1.7b | 2.4 | 14.4% | 98 |
| hadur117.nano.SanaroHL 0.2 | 2.9 | 13.6% | 90 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.6 | 12.8% | 49 |
| mld.Wisdom 1.0 | 4.8 | 11.2% | 15 |
| gg.Wolverine 2.0 | 6.7 | 8.3% | 7 |
| spinnercat.Omen 1.0 | 7.1 | 7.8% | 2 |
| DBall.NUKE 0.1 | 7.7 | 7.1% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.4% | 7 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 69.8 | 8 / 35 | 3025 |
| 2 | 3 | 60.6 | 71.7 | 9 / 35 | 3158 |
| 3 | 2 | 62.2 | 74.6 | 12 / 35 | 3462 |
| 4 | 2 | 63.0 | 75.9 | 14 / 35 | 3217 |
| 5 | 3 | 59.9 | 69.8 | 8 / 35 | 3094 |
| 6 | 3 | 60.4 | 72.4 | 7 / 35 | 3194 |
| 7 | 4 | 56.1 | 61.0 | 4 / 35 | 2754 |
| 8 | 3 | 61.1 | 73.0 | 8 / 35 | 3192 |
| 9 | 3 | 61.4 | 74.3 | 10 / 35 | 3207 |
| 10 | 3 | 59.1 | 67.9 | 10 / 35 | 3042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 46 | 59% |
| jekl.StoneGhost 0.7 | 41 | 68% |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 52% |
| gg.Wolverine 2.0 | 12 | 83% |
| mld.Wisdom 1.0 | 5 | 60% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |
| DBall.NUKE 0.1 | 4 | 50% |

Hadur died in 263 of 350 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 71 | 27% | 87 |
| origin.SleepSiphon 1.7b | 66 | 25% | 97 |
| pe.minimelee.SandboxMiniMelee 1.1 | 47 | 18% | 65 |
| mld.Wisdom 1.0 | 34 | 13% | 38 |
| DBall.NUKE 0.1 | 14 | 5% | 19 |
| spinnercat.Omen 1.0 | 14 | 5% | 18 |
| gg.Wolverine 2.0 | 8 | 3% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 3% | 11 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 83.3 | 107 / 350 | 2.50 | 16.4% | 43297 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 17.6% | 88 |
| rtk.Tachikoma 1.0 | 1.8 | 17.5% | 90 |
| hadur117.nano.SanaroHL 0.2 | 2.7 | 16.4% | 107 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 12.0% | 22 |
| franzor.Lizt 1.3.1 | 4.8 | 11.3% | 39 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.2% | 2 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 1 |
| skm.PateranBotlock2 1.0 | 7.9 | 5.0% | 1 |
| sample.Target 1.0 | 9.4 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.6 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.8 | 82.9 | 9 / 35 | 4207 |
| 2 | 3 | 66.5 | 82.5 | 11 / 35 | 4289 |
| 3 | 3 | 65.3 | 80.0 | 7 / 35 | 4191 |
| 4 | 1 | 67.9 | 86.0 | 16 / 35 | 4542 |
| 5 | 3 | 67.0 | 83.5 | 8 / 35 | 4584 |
| 6 | 3 | 66.4 | 81.6 | 9 / 35 | 4360 |
| 7 | 3 | 68.1 | 86.7 | 15 / 35 | 4127 |
| 8 | 3 | 67.3 | 85.4 | 10 / 35 | 4315 |
| 9 | 2 | 66.0 | 80.3 | 11 / 35 | 4335 |
| 10 | 3 | 67.1 | 84.1 | 11 / 35 | 4347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 106 | 55% |
| rsalesc.melee.Monk 0.3.6c | 53 | 23% |
| oog.melee.CapuletDroid 1.1 | 33 | 76% |
| franzor.Lizt 1.3.1 | 25 | 44% |
| exauge.GateKeeper 1.1.121g | 2 | 50% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |
| skm.PateranBotlock2 1.0 | 1 | 0% |

Hadur died in 243 of 350 rounds, at a mean tick of 1549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 110 | 45% | 181 |
| rsalesc.melee.Monk 0.3.6c | 73 | 30% | 95 |
| oog.melee.CapuletDroid 1.1 | 32 | 13% | 58 |
| franzor.Lizt 1.3.1 | 20 | 8% | 2 |
| lrem.micro.MoggFanatic 0.2 | 4 | 2% | 7 |
| exauge.GateKeeper 1.1.121g | 3 | 1% | 4 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 75.1 | 121 / 350 | 3.24 | 14.7% | 33147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHL 0.2 | 1.3 | 14.7% | 121 |
| tm.Yuugao 1.0 | 2.3 | 14.0% | 84 |
| shrub.Vapour v159 | 2.5 | 13.7% | 69 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.8% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 5.1 | 10.1% | 29 |
| m3thos.Eva00 1.1 | 6.0 | 9.1% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.2% | 17 |
| SHAM.WOW 1.4 | 8.3 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.9 | 6.3% | 1 |
| qualidafial.MajorDick 1.0.1 | 9.3 | 6.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.1 | 72.7 | 7 / 35 | 3335 |
| 2 | 1 | 63.1 | 78.7 | 11 / 35 | 3519 |
| 3 | 1 | 61.9 | 74.6 | 12 / 35 | 3486 |
| 4 | 1 | 63.0 | 79.7 | 14 / 35 | 3233 |
| 5 | 1 | 60.2 | 71.7 | 13 / 35 | 2974 |
| 6 | 2 | 60.0 | 71.1 | 12 / 35 | 3205 |
| 7 | 2 | 60.8 | 71.1 | 12 / 35 | 3333 |
| 8 | 1 | 60.3 | 73.3 | 11 / 35 | 2945 |
| 9 | 2 | 63.8 | 81.6 | 12 / 35 | 3506 |
| 10 | 1 | 63.4 | 76.5 | 17 / 35 | 3611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 72 | 61% |
| shrub.Vapour v159 | 47 | 38% |
| Krabb.sliNk.Garm 0.9u | 23 | 78% |
| com.spp.robocode.MostlyHarmless 010 | 20 | 65% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 93% |
| m3thos.Eva00 1.1 | 9 | 89% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 232 of 350 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 70 | 30% | 85 |
| tm.Yuugao 1.0 | 61 | 26% | 110 |
| Krabb.sliNk.Garm 0.9u | 31 | 13% | 43 |
| com.spp.robocode.MostlyHarmless 010 | 20 | 9% | 36 |
| m3thos.Eva00 1.1 | 13 | 6% | 21 |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 5% | 25 |
| zyx.nano.BacillusComma 1.0 | 11 | 5% | 14 |
| SHAM.WOW 1.4 | 7 | 3% | 9 |
| qualidafial.MajorDick 1.0.1 | 6 | 3% | 7 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 65.2 | 46 / 350 | 4.13 | 12.3% | 27435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.9% | 179 |
| kc.micro.Figment 1.0 | 2.0 | 15.2% | 68 |
| hadur117.nano.SanaroHL 0.2 | 3.2 | 12.3% | 46 |
| yagami.Tidus 0.11 | 4.2 | 11.2% | 3 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.9% | 33 |
| mc2.enemy.Original 0.9 | 5.9 | 9.1% | 18 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 3 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.1 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.0 | 60.3 | 3 / 35 | 2779 |
| 2 | 3 | 58.4 | 67.0 | 5 / 35 | 2816 |
| 3 | 3 | 58.0 | 66.3 | 4 / 35 | 2655 |
| 4 | 5 | 55.5 | 60.6 | 2 / 35 | 2561 |
| 5 | 3 | 57.6 | 62.2 | 7 / 35 | 2877 |
| 6 | 3 | 59.8 | 70.2 | 5 / 35 | 2932 |
| 7 | 3 | 58.9 | 67.6 | 4 / 35 | 3055 |
| 8 | 3 | 57.9 | 66.0 | 5 / 35 | 2632 |
| 9 | 3 | 58.5 | 66.7 | 6 / 35 | 2592 |
| 10 | 3 | 57.5 | 65.1 | 5 / 35 | 2536 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 73 | 19% |
| kc.micro.Figment 1.0 | 36 | 53% |
| mc2.enemy.Original 0.9 | 11 | 55% |
| pedersen.Grishnakh 1.0 | 9 | 22% |
| yagami.Tidus 0.11 | 5 | 80% |
| dft.Calliope 5.6 | 1 | 0% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 304 of 350 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 114 | 38% | 130 |
| kc.micro.Figment 1.0 | 64 | 21% | 81 |
| yagami.Tidus 0.11 | 38 | 13% | 44 |
| mc2.enemy.Original 0.9 | 32 | 11% | 38 |
| pedersen.Grishnakh 1.0 | 26 | 9% | 26 |
| robar.nano.Assertive_Melee 0.2 | 11 | 4% | 12 |
| step.nanoPri 1.0 | 7 | 2% | 7 |
| rdm.Dueler 0.4x | 6 | 2% | 6 |
| dft.Calliope 5.6 | 6 | 2% | 6 |

## Melee bench: F10

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 82.1 | 127 / 350 | 2.61 | 15.8% | 38784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHL 0.2 | 1.5 | 15.8% | 127 |
| DTF.Kludgy 1.2b | 1.6 | 15.4% | 89 |
| ne.Chimera 1.2 | 3.2 | 13.1% | 38 |
| ejb.Polaris 1.0.1 | 3.8 | 12.6% | 34 |
| tvv.micro.Antares 1.1.1 | 5.1 | 11.1% | 37 |
| vStar.RAFzilla 2.15 | 5.8 | 10.3% | 13 |
| sam.Samspin 1.0 | 7.5 | 6.2% | 2 |
| kurios.DOSexe .9b | 8.2 | 5.8% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.7% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 86.7 | 15 / 35 | 4236 |
| 2 | 1 | 65.7 | 86.7 | 14 / 35 | 3936 |
| 3 | 2 | 63.4 | 80.0 | 13 / 35 | 3561 |
| 4 | 1 | 63.3 | 80.6 | 12 / 35 | 3602 |
| 5 | 2 | 62.8 | 79.0 | 12 / 35 | 3935 |
| 6 | 2 | 64.9 | 84.1 | 11 / 35 | 3961 |
| 7 | 1 | 66.1 | 85.1 | 15 / 35 | 4324 |
| 8 | 2 | 62.4 | 77.1 | 9 / 35 | 3627 |
| 9 | 2 | 63.2 | 78.7 | 14 / 35 | 3461 |
| 10 | 1 | 64.6 | 82.5 | 12 / 35 | 4141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 69 | 43% |
| ejb.Polaris 1.0.1 | 62 | 85% |
| tvv.micro.Antares 1.1.1 | 27 | 26% |
| vStar.RAFzilla 2.15 | 25 | 76% |
| ne.Chimera 1.2 | 25 | 52% |
| kurios.DOSexe .9b | 4 | 75% |
| sam.Samspin 1.0 | 3 | 33% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 224 of 350 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 83 | 37% | 107 |
| ne.Chimera 1.2 | 49 | 22% | 67 |
| tvv.micro.Antares 1.1.1 | 34 | 15% | 36 |
| ejb.Polaris 1.0.1 | 21 | 9% | 78 |
| vStar.RAFzilla 2.15 | 11 | 5% | 28 |
| kurios.DOSexe .9b | 9 | 4% | 14 |
| sam.Samspin 1.0 | 9 | 4% | 11 |
| donjezza.Muncho 1.0 | 4 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 63.7 | 58 / 350 | 4.27 | 12.2% | 28583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.6% | 155 |
| cx.mini.Nimrod 0.55 | 2.5 | 12.7% | 40 |
| hadur117.nano.SanaroHL 0.2 | 3.0 | 12.2% | 58 |
| djc.DynaBot 0.1.1 | 3.8 | 11.0% | 22 |
| rdt199.Warlord 0.73 | 5.5 | 9.6% | 23 |
| br2.MobyDickBot 1.6 | 5.7 | 9.7% | 28 |
| uji.YellohFellah 1.0 | 6.8 | 8.9% | 25 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.7% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.8% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.6 | 67.9 | 7 / 35 | 3146 |
| 2 | 2 | 60.0 | 69.2 | 13 / 35 | 3092 |
| 3 | 3 | 58.3 | 68.3 | 6 / 35 | 2675 |
| 4 | 2 | 57.9 | 66.0 | 8 / 35 | 2734 |
| 5 | 3 | 57.3 | 63.2 | 4 / 35 | 3092 |
| 6 | 4 | 54.6 | 59.0 | 2 / 35 | 2873 |
| 7 | 2 | 59.6 | 70.8 | 6 / 35 | 3120 |
| 8 | 5 | 53.7 | 55.9 | 4 / 35 | 2623 |
| 9 | 3 | 54.9 | 60.3 | 3 / 35 | 2602 |
| 10 | 4 | 53.6 | 56.5 | 5 / 35 | 2626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 70 | 36% |
| cx.mini.Nimrod 0.55 | 18 | 50% |
| rdt199.Warlord 0.73 | 9 | 89% |
| uji.YellohFellah 1.0 | 9 | 44% |
| br2.MobyDickBot 1.6 | 8 | 63% |
| djc.DynaBot 0.1.1 | 7 | 71% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 137 | 47% | 158 |
| cx.mini.Nimrod 0.55 | 41 | 14% | 51 |
| rdt199.Warlord 0.73 | 27 | 9% | 37 |
| KiraNL.Chupacabra 0.4 | 21 | 7% | 22 |
| djc.DynaBot 0.1.1 | 19 | 7% | 24 |
| br2.MobyDickBot 1.6 | 14 | 5% | 20 |
| uji.YellohFellah 1.0 | 13 | 4% | 17 |
| stelo.MirrorNano 1.3 | 10 | 3% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 3% | 10 |

## Melee bench: F12

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 71.6 | 78 / 350 | 3.56 | 13.5% | 27639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.8 | 14.5% | 92 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.2% | 65 |
| hadur117.nano.SanaroHL 0.2 | 3.0 | 13.5% | 78 |
| darkcanuck.Leon 1.01 | 3.1 | 13.3% | 66 |
| brainfade.melee.Genghis 0.36 | 4.9 | 11.0% | 37 |
| jrm.Test0 1.0 | 6.2 | 8.4% | 4 |
| cs.sheldor.Talon 1.1 | 7.1 | 7.3% | 2 |
| jp.Perpy 16.0 | 7.9 | 6.8% | 2 |
| jaybot.bots.Oddball 4.0 | 9.4 | 5.5% | 6 |
| stuff.Vlad 0.1 | 9.4 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 77.1 | 8 / 35 | 3023 |
| 2 | 4 | 58.9 | 67.9 | 6 / 35 | 2813 |
| 3 | 4 | 57.3 | 66.0 | 7 / 35 | 2482 |
| 4 | 2 | 62.2 | 75.9 | 10 / 35 | 3048 |
| 5 | 4 | 58.3 | 66.7 | 7 / 35 | 2715 |
| 6 | 1 | 62.3 | 77.5 | 13 / 35 | 2963 |
| 7 | 1 | 63.1 | 82.2 | 9 / 35 | 2920 |
| 8 | 4 | 58.8 | 70.5 | 5 / 35 | 2679 |
| 9 | 3 | 58.9 | 70.8 | 7 / 35 | 2484 |
| 10 | 5 | 55.7 | 61.3 | 6 / 35 | 2512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 59 | 39% |
| nat.PallasHawk 1.0 | 54 | 30% |
| bts.wiki.RipCurl 0.9b | 45 | 51% |
| brainfade.melee.Genghis 0.36 | 16 | 63% |
| jrm.Test0 1.0 | 3 | 33% |
| jaybot.bots.Oddball 4.0 | 3 | 33% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 272 of 350 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 77 | 28% | 92 |
| darkcanuck.Leon 1.01 | 66 | 24% | 93 |
| bts.wiki.RipCurl 0.9b | 54 | 20% | 78 |
| jrm.Test0 1.0 | 24 | 9% | 26 |
| brainfade.melee.Genghis 0.36 | 21 | 8% | 25 |
| cs.sheldor.Talon 1.1 | 10 | 4% | 13 |
| jp.Perpy 16.0 | 10 | 4% | 11 |
| jaybot.bots.Oddball 4.0 | 8 | 3% | 9 |
| stuff.Vlad 0.1 | 2 | 1% | 2 |

## Melee bench: F13

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 72.2 | 53 / 350 | 3.51 | 12.9% | 29474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.4 | 16.9% | 82 |
| mn.Combat 3.25.0 | 1.6 | 17.3% | 155 |
| hadur117.nano.SanaroHL 0.2 | 3.3 | 12.9% | 53 |
| gh.micro.Gruweltje 0.7 | 4.3 | 12.1% | 22 |
| shinh.Entangled 0.3 | 4.4 | 12.1% | 36 |
| apc.Colossus2 0.17 | 6.2 | 8.2% | 3 |
| stelo.Wang 1.0 | 6.8 | 7.3% | 1 |
| ayk.WallHugger 1.0 | 8.4 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.6 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 65.7 | 3 / 35 | 3031 |
| 2 | 3 | 60.4 | 73.0 | 8 / 35 | 3065 |
| 3 | 3 | 61.9 | 77.5 | 5 / 35 | 3254 |
| 4 | 3 | 59.4 | 72.1 | 4 / 35 | 2773 |
| 5 | 3 | 59.6 | 71.1 | 8 / 35 | 2666 |
| 6 | 3 | 59.2 | 69.8 | 4 / 35 | 2961 |
| 7 | 3 | 59.9 | 73.3 | 5 / 35 | 2760 |
| 8 | 3 | 61.2 | 74.9 | 6 / 35 | 3189 |
| 9 | 3 | 60.7 | 75.2 | 7 / 35 | 2815 |
| 10 | 5 | 59.0 | 68.9 | 3 / 35 | 2960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 75 | 40% |
| ags.Glacier 0.2.11 | 59 | 22% |
| shinh.Entangled 0.3 | 18 | 22% |
| gh.micro.Gruweltje 0.7 | 8 | 63% |
| apc.Colossus2 0.17 | 2 | 50% |

Hadur died in 298 of 350 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 98 | 33% | 109 |
| mn.Combat 3.25.0 | 79 | 27% | 109 |
| shinh.Entangled 0.3 | 43 | 14% | 48 |
| gh.micro.Gruweltje 0.7 | 37 | 12% | 43 |
| stelo.Wang 1.0 | 18 | 6% | 19 |
| maribo.FollowFire 1 | 12 | 4% | 11 |
| apc.Colossus2 0.17 | 9 | 3% | 10 |
| ayk.WallHugger 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 79.0 | 111 / 350 | 2.89 | 14.8% | 32669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.2 | 17.2% | 120 |
| hadur117.nano.SanaroHL 0.2 | 1.8 | 14.8% | 111 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.7% | 65 |
| co.edu.usb.rc.LidisTron 1.0 | 4.6 | 10.6% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.1% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 10.0% | 12 |
| sanyi.mikrobi.Roberto 1.0 | 6.8 | 9.2% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.6 | 8.1% | 13 |
| pa.Improved 1.0 | 9.0 | 5.2% | 2 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 79.4 | 16 / 35 | 3460 |
| 2 | 2 | 63.5 | 81.0 | 12 / 35 | 3162 |
| 3 | 2 | 63.4 | 81.6 | 11 / 35 | 3019 |
| 4 | 2 | 62.1 | 76.8 | 8 / 35 | 3343 |
| 5 | 1 | 64.2 | 83.2 | 11 / 35 | 3686 |
| 6 | 2 | 59.8 | 69.5 | 6 / 35 | 3342 |
| 7 | 2 | 63.6 | 79.4 | 16 / 35 | 3303 |
| 8 | 2 | 61.7 | 77.5 | 10 / 35 | 2803 |
| 9 | 2 | 61.3 | 75.9 | 7 / 35 | 3020 |
| 10 | 1 | 65.1 | 85.7 | 14 / 35 | 3531 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 94 | 59% |
| catcat20.shape.Theta 0.018 | 51 | 43% |
| co.edu.usb.rc.LidisTron 1.0 | 20 | 45% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 73% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 75% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 43% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 239 of 350 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 106 | 44% | 163 |
| catcat20.shape.Theta 0.018 | 47 | 20% | 69 |
| co.edu.usb.rc.LidisTron 1.0 | 24 | 10% | 16 |
| Lo_Ian.Gandalf_V4 4.0 | 21 | 9% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 15 | 6% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 6% | 29 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 3% | 19 |
| pa.Improved 1.0 | 5 | 2% | 8 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |

## Melee bench: F15

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 68.6 | 65 / 350 | 3.83 | 13.5% | 35289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.5 | 14.7% | 73 |
| hadur117.nano.SanaroHL 0.2 | 2.6 | 13.5% | 65 |
| emp.Yngwie 1.11 | 2.8 | 13.6% | 93 |
| mld.DustBunny 3.8 | 3.8 | 12.6% | 34 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.4% | 27 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.6% | 54 |
| Grystrion.TrackerWO 1.0 | 7.4 | 7.2% | 2 |
| lambdaxy.TBot 0.1 | 7.6 | 7.0% | 1 |
| divineomega.TrialBot 0.003 | 9.1 | 5.2% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 69.2 | 6 / 35 | 3599 |
| 2 | 2 | 59.8 | 68.9 | 6 / 35 | 3538 |
| 3 | 2 | 62.4 | 74.6 | 10 / 35 | 3629 |
| 4 | 2 | 60.0 | 70.8 | 8 / 35 | 3129 |
| 5 | 2 | 59.5 | 67.6 | 6 / 35 | 3572 |
| 6 | 4 | 59.8 | 67.3 | 2 / 35 | 3842 |
| 7 | 4 | 57.8 | 64.4 | 8 / 35 | 2988 |
| 8 | 4 | 59.4 | 65.4 | 3 / 35 | 3691 |
| 9 | 2 | 61.5 | 70.2 | 10 / 35 | 3877 |
| 10 | 2 | 58.9 | 67.3 | 6 / 35 | 3424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 45 | 58% |
| kawigi.micro.Shiz 1.1 | 29 | 38% |
| cb.nano.Insomnia 1.0 | 19 | 68% |
| mld.DustBunny 3.8 | 15 | 20% |
| kawigi.robot.Girl 1.2 | 12 | 67% |
| Grystrion.TrackerWO 1.0 | 3 | 67% |
| divineomega.TrialBot 0.003 | 2 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 70 | 24% | 86 |
| emp.Yngwie 1.11 | 69 | 24% | 101 |
| mld.DustBunny 3.8 | 45 | 16% | 52 |
| cb.nano.Insomnia 1.0 | 41 | 14% | 37 |
| kawigi.robot.Girl 1.2 | 29 | 10% | 37 |
| Grystrion.TrackerWO 1.0 | 16 | 6% | 18 |
| divineomega.TrialBot 0.003 | 11 | 4% | 12 |
| lambdaxy.TBot 0.1 | 3 | 1% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 69.0 | 64 / 350 | 3.79 | 13.6% | 36341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.9% | 138 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.4 | 14.2% | 24 |
| hadur117.nano.SanaroHL 0.2 | 2.7 | 13.6% | 64 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.4% | 77 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.8% | 29 |
| bvh.fnr.Fenrir 0.36l | 5.9 | 9.3% | 6 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 8.1% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 5.2% | 1 |
| asd.Cthulhu 1.3 | 8.9 | 5.2% | 1 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 5.3% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 71.1 | 8 / 35 | 3792 |
| 2 | 4 | 58.6 | 62.9 | 7 / 35 | 3349 |
| 3 | 2 | 62.5 | 72.4 | 8 / 35 | 4021 |
| 4 | 2 | 61.3 | 72.1 | 5 / 35 | 3828 |
| 5 | 3 | 57.0 | 63.2 | 3 / 35 | 3216 |
| 6 | 3 | 55.5 | 56.2 | 3 / 35 | 3452 |
| 7 | 2 | 62.6 | 74.0 | 9 / 35 | 3857 |
| 8 | 2 | 64.0 | 77.5 | 11 / 35 | 3983 |
| 9 | 3 | 59.7 | 68.6 | 5 / 35 | 3367 |
| 10 | 3 | 60.9 | 71.7 | 5 / 35 | 3476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 87 | 40% |
| techdude.forest.FlamingForest 1.1 | 26 | 23% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 82% |
| tvv.nano.Polaris 1.2 | 10 | 20% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 50% |

Hadur died in 286 of 350 rounds, at a mean tick of 1212. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 132 | 46% | 169 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 36 | 13% | 46 |
| bvh.fnr.Fenrir 0.36l | 36 | 13% | 38 |
| techdude.forest.FlamingForest 1.1 | 34 | 12% | 42 |
| tvv.nano.Polaris 1.2 | 19 | 7% | 20 |
| stelo.IntrinsicVolatility 1.4 | 11 | 4% | 14 |
| divineomega.DivineBot 1.9.4.5 | 8 | 3% | 11 |
| asd.Cthulhu 1.3 | 6 | 2% | 6 |
| repositorio.NanoStep 1.0 | 4 | 1% | 4 |

## Melee bench: F17

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.8 | 79 / 350 | 3.81 | 13.5% | 34273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.1 | 14.3% | 72 |
| oog.melee.Mercutio 1.0 | 2.6 | 13.5% | 62 |
| hadur117.nano.SanaroHL 0.2 | 2.7 | 13.5% | 79 |
| cx.BlestPain 1.41 | 3.2 | 13.3% | 72 |
| nic.Nicator 2.4 | 4.5 | 12.0% | 42 |
| ahf.NanoAndrew .4 | 5.9 | 10.5% | 17 |
| maribo.melee.BMV 0.1 | 7.0 | 8.8% | 4 |
| tex.Longbot 0.4 | 8.3 | 5.7% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.5% | 2 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 77.5 | 5 / 35 | 3398 |
| 2 | 4 | 60.1 | 68.3 | 7 / 35 | 3371 |
| 3 | 3 | 58.8 | 65.4 | 10 / 35 | 3108 |
| 4 | 4 | 58.7 | 61.9 | 8 / 35 | 3564 |
| 5 | 5 | 57.7 | 63.5 | 7 / 35 | 2992 |
| 6 | 1 | 63.2 | 78.4 | 11 / 35 | 3352 |
| 7 | 4 | 57.3 | 61.9 | 5 / 35 | 3202 |
| 8 | 2 | 61.3 | 68.6 | 9 / 35 | 3983 |
| 9 | 2 | 60.3 | 68.9 | 6 / 35 | 3488 |
| 10 | 1 | 62.4 | 73.7 | 11 / 35 | 3815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 46 | 37% |
| oog.melee.Mercutio 1.0 | 34 | 65% |
| cx.BlestPain 1.41 | 31 | 77% |
| nic.Nicator 2.4 | 18 | 39% |
| ahf.NanoAndrew .4 | 11 | 64% |
| maribo.melee.BMV 0.1 | 2 | 50% |
| tex.Longbot 0.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 0% |

Hadur died in 271 of 350 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 68 | 25% | 86 |
| oog.melee.Mercutio 1.0 | 50 | 18% | 70 |
| nic.Nicator 2.4 | 49 | 18% | 56 |
| cx.BlestPain 1.41 | 41 | 15% | 66 |
| ahf.NanoAndrew .4 | 36 | 13% | 42 |
| maribo.melee.BMV 0.1 | 14 | 5% | 15 |
| tex.Longbot 0.4 | 6 | 2% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 5 | 2% | 6 |
| goblin.Bender 2.4 | 2 | 1% | 2 |

## Melee bench: F18

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 70.5 | 91 / 350 | 3.65 | 13.6% | 30882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.6 | 14.1% | 74 |
| hadur117.nano.SanaroHL 0.2 | 1.9 | 13.6% | 91 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.6% | 68 |
| uji.DBH 1.1 | 3.9 | 11.8% | 35 |
| ratosh.Nobo 0.21 | 5.2 | 10.9% | 12 |
| spinnercat.Robovirus 2.718 | 5.3 | 10.6% | 16 |
| sigterm.Sigterm 1.0 | 7.1 | 8.7% | 31 |
| kawigi.mini.Fhqwhgads 1.1 | 7.9 | 7.1% | 12 |
| stelo.WangRobot 1.0 | 9.2 | 5.7% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 75.6 | 9 / 35 | 2968 |
| 2 | 1 | 62.8 | 77.8 | 13 / 35 | 3403 |
| 3 | 3 | 56.5 | 63.2 | 4 / 35 | 3014 |
| 4 | 3 | 56.9 | 63.2 | 8 / 35 | 2831 |
| 5 | 2 | 60.0 | 69.5 | 12 / 35 | 3072 |
| 6 | 2 | 60.9 | 74.0 | 8 / 35 | 3207 |
| 7 | 3 | 57.7 | 66.0 | 8 / 35 | 2680 |
| 8 | 1 | 59.8 | 70.8 | 9 / 35 | 3150 |
| 9 | 2 | 60.3 | 69.8 | 9 / 35 | 3461 |
| 10 | 1 | 61.7 | 75.2 | 11 / 35 | 3096 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 48 | 65% |
| agd.Mooserwirt2 2.7 | 29 | 34% |
| uji.DBH 1.1 | 24 | 54% |
| spinnercat.Robovirus 2.718 | 18 | 83% |
| ratosh.Nobo 0.21 | 14 | 64% |
| sigterm.Sigterm 1.0 | 10 | 50% |
| stelo.WangRobot 1.0 | 4 | 75% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 67% |

Hadur died in 259 of 350 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 79 | 31% | 111 |
| agd.Mooserwirt2 2.7 | 49 | 19% | 64 |
| ratosh.Nobo 0.21 | 40 | 15% | 52 |
| uji.DBH 1.1 | 29 | 11% | 34 |
| spinnercat.Robovirus 2.718 | 24 | 9% | 32 |
| sigterm.Sigterm 1.0 | 19 | 7% | 25 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 3% | 13 |
| stelo.WangRobot 1.0 | 7 | 3% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 1% | 8 |

## Melee bench: F19

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 83.1 | 123 / 350 | 2.52 | 16.1% | 36940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.8 | 16.3% | 112 |
| davidalves.net.DuelistMiniMelee 1.2 | 1.8 | 16.4% | 93 |
| hadur117.nano.SanaroHL 0.2 | 2.4 | 16.1% | 123 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 11.0% | 6 |
| erdnis.Rover 0.3 | 4.5 | 10.6% | 9 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.2% | 2 |
| mbh.Mbh 0.1 | 7.1 | 7.3% | 0 |
| pac.ABC 2.1 | 7.8 | 7.1% | 5 |
| pbg.R2D2 1.0 | 8.8 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.7 | 83.5 | 11 / 35 | 3863 |
| 2 | 2 | 65.4 | 82.2 | 12 / 35 | 3717 |
| 3 | 2 | 66.3 | 86.0 | 11 / 35 | 3803 |
| 4 | 2 | 66.5 | 87.6 | 14 / 35 | 3552 |
| 5 | 2 | 65.4 | 79.0 | 16 / 35 | 3905 |
| 6 | 3 | 63.4 | 78.1 | 8 / 35 | 3362 |
| 7 | 2 | 65.7 | 85.4 | 11 / 35 | 3769 |
| 8 | 3 | 65.0 | 80.3 | 13 / 35 | 3663 |
| 9 | 2 | 66.3 | 83.8 | 14 / 35 | 3854 |
| 10 | 3 | 65.9 | 84.8 | 13 / 35 | 3452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 111 | 52% |
| davidalves.net.DuelistMiniMelee 1.2 | 74 | 42% |
| krillr.mini.JointStrike 2.0.0 | 16 | 94% |
| erdnis.Rover 0.3 | 11 | 73% |
| pac.ABC 2.1 | 7 | 57% |
| patson.PatsonTestBot 1.0 | 7 | 86% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 228 of 350 rounds, at a mean tick of 1085. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 92 | 40% | 174 |
| mld.Infinity 2.2 | 70 | 31% | 32 |
| krillr.mini.JointStrike 2.0.0 | 23 | 10% | 41 |
| erdnis.Rover 0.3 | 19 | 8% | 37 |
| patson.PatsonTestBot 1.0 | 11 | 5% | 22 |
| pac.ABC 2.1 | 8 | 4% | 15 |
| pbg.R2D2 1.0 | 4 | 2% | 13 |
| mbh.Mbh 0.1 | 1 | 0% | 12 |

## Melee bench: F20

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 73.3 | 104 / 350 | 3.40 | 14.3% | 33885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.4% | 133 |
| hadur117.nano.SanaroHL 0.2 | 2.1 | 14.3% | 104 |
| fwb.Nine 1.0.1 | 3.3 | 12.5% | 53 |
| nz.jdc.nano.GridFu 1.0 | 3.9 | 11.8% | 17 |
| catcat20.Rabbit 0.001 | 4.8 | 10.2% | 28 |
| djdjdj.NanoSkunk10 1.0 | 6.6 | 8.4% | 6 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.3% | 3 |
| bayen.nut.Squirrel 1.615 | 7.6 | 7.7% | 6 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 69.2 | 9 / 35 | 3294 |
| 2 | 2 | 60.8 | 68.9 | 12 / 35 | 3412 |
| 3 | 2 | 60.3 | 71.4 | 6 / 35 | 3347 |
| 4 | 2 | 63.2 | 78.1 | 8 / 35 | 3719 |
| 5 | 2 | 61.5 | 72.7 | 13 / 35 | 3283 |
| 6 | 2 | 62.0 | 75.6 | 12 / 35 | 3199 |
| 7 | 2 | 63.3 | 78.1 | 13 / 35 | 3656 |
| 8 | 2 | 61.2 | 72.7 | 10 / 35 | 3252 |
| 9 | 2 | 62.3 | 74.6 | 12 / 35 | 3514 |
| 10 | 2 | 61.2 | 71.7 | 9 / 35 | 3209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 83 | 51% |
| fwb.Nine 1.0.1 | 37 | 57% |
| catcat20.Rabbit 0.001 | 20 | 85% |
| nz.jdc.nano.GridFu 1.0 | 15 | 73% |
| bayen.nut.Squirrel 1.615 | 8 | 88% |
| djdjdj.NanoSkunk10 1.0 | 5 | 60% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 246 of 350 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 97 | 39% | 126 |
| fwb.Nine 1.0.1 | 53 | 22% | 54 |
| nz.jdc.nano.GridFu 1.0 | 39 | 16% | 59 |
| catcat20.Rabbit 0.001 | 21 | 9% | 41 |
| djdjdj.NanoSkunk10 1.0 | 11 | 4% | 25 |
| bayen.nut.Squirrel 1.615 | 9 | 4% | 21 |
| m3thos.mini.Eva01 0.5.5 | 7 | 3% | 11 |
| ntc.ControlledChaos 1.1.4 | 7 | 3% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 3 |

## Melee bench: F21

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.7 | 153 / 350 | 2.19 | 17.5% | 44242 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHL 0.2 | 1.4 | 17.5% | 153 |
| eem.EvBot v4.6.16 | 1.7 | 17.2% | 141 |
| dummy.mini.Scimitar 1.01 | 2.9 | 14.8% | 24 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 16 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.3% | 0 |
| eld.Hmm 1.0 | 5.6 | 8.6% | 16 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 1 |
| fire219.CatBot 1.0 | 7.7 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 85.4 | 12 / 35 | 4228 |
| 2 | 1 | 67.8 | 89.8 | 15 / 35 | 4346 |
| 3 | 1 | 68.4 | 92.1 | 19 / 35 | 4219 |
| 4 | 1 | 67.3 | 82.2 | 13 / 35 | 5281 |
| 5 | 2 | 66.2 | 84.1 | 14 / 35 | 4245 |
| 6 | 2 | 65.6 | 82.5 | 12 / 35 | 4034 |
| 7 | 1 | 69.2 | 91.1 | 20 / 35 | 4621 |
| 8 | 1 | 67.9 | 88.6 | 16 / 35 | 4383 |
| 9 | 2 | 66.8 | 84.4 | 14 / 35 | 4361 |
| 10 | 1 | 67.4 | 87.0 | 18 / 35 | 4524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 164 | 51% |
| dummy.mini.Scimitar 1.01 | 45 | 87% |
| cf.RiO.RiOx 4.2.1 | 21 | 52% |
| eld.Hmm 1.0 | 18 | 72% |
| oa.weak.BotherBot 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 2 | 50% |

Hadur died in 198 of 350 rounds, at a mean tick of 1407. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 103 | 52% | 163 |
| dummy.mini.Scimitar 1.01 | 48 | 24% | 96 |
| cf.RiO.RiOx 4.2.1 | 26 | 13% | 41 |
| eld.Hmm 1.0 | 8 | 4% | 26 |
| oa.weak.BotherBot 0.1 | 4 | 2% | 9 |
| el.JumpShoot 0.2 | 4 | 2% | 8 |
| fire219.CatBot 1.0 | 2 | 1% | 3 |
| PSW.Relentless 0.1 | 2 | 1% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.3 | 130 / 350 | 2.41 | 16.8% | 40548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.3 | 17.8% | 132 |
| hadur117.nano.SanaroHL 0.2 | 1.8 | 16.8% | 130 |
| cre.Karolos 0.32 | 2.9 | 14.7% | 50 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.8% | 24 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 8.9% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.9% | 1 |
| sample.Walls 1.0 | 6.9 | 8.4% | 4 |
| cw.megas.Blade 0.8 | 7.3 | 8.2% | 1 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 83.5 | 12 / 35 | 4105 |
| 2 | 2 | 66.7 | 84.1 | 13 / 35 | 3630 |
| 3 | 2 | 64.3 | 77.8 | 10 / 35 | 3806 |
| 4 | 2 | 65.4 | 82.5 | 13 / 35 | 3590 |
| 5 | 2 | 67.6 | 84.8 | 9 / 35 | 4770 |
| 6 | 2 | 67.6 | 88.3 | 15 / 35 | 3665 |
| 7 | 2 | 67.5 | 84.8 | 16 / 35 | 4362 |
| 8 | 1 | 68.9 | 89.8 | 18 / 35 | 4311 |
| 9 | 2 | 66.3 | 81.9 | 10 / 35 | 4618 |
| 10 | 1 | 66.8 | 85.4 | 14 / 35 | 3691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 115 | 53% |
| cre.Karolos 0.32 | 59 | 53% |
| stelo.AreaTargetingBot 1.1 | 27 | 44% |
| sample.Walls 1.0 | 13 | 100% |
| stelo.RamTrackSurfer 1.2 | 10 | 70% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 75% |
| cw.megas.Blade 0.8 | 3 | 67% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 220 of 350 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 108 | 49% | 176 |
| cre.Karolos 0.32 | 47 | 21% | 76 |
| stelo.AreaTargetingBot 1.1 | 37 | 17% | 45 |
| stelo.RamTrackSurfer 1.2 | 12 | 5% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 4% | 13 |
| cw.megas.Blade 0.8 | 5 | 2% | 7 |
| sample.Walls 1.0 | 3 | 1% | 10 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.2 | 61.2 | 54 / 350 | 4.49 | 11.4% | 24263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.6 | 14.8% | 92 |
| davidalves.Phoenix 0.54 | 2.3 | 13.4% | 68 |
| florent.XSeries.X2 0.12 | 2.3 | 13.5% | 67 |
| pedersen.Ugluk 1.1.1 | 4.1 | 12.5% | 40 |
| hadur117.nano.SanaroHL 0.2 | 4.8 | 11.4% | 54 |
| oog.melee.Corsair 1.0 | 6.4 | 9.3% | 8 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.9% | 15 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.6% | 6 |
| as.FrankTheTank 1.3 | 9.3 | 5.0% | 2 |
| evd.X1 0.01 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.2 | 60.0 | 5 / 35 | 2521 |
| 2 | 6 | 51.0 | 53.0 | 3 / 35 | 2092 |
| 3 | 5 | 53.7 | 57.5 | 4 / 35 | 2339 |
| 4 | 4 | 60.1 | 73.7 | 6 / 35 | 2834 |
| 5 | 5 | 55.0 | 59.4 | 5 / 35 | 2577 |
| 6 | 5 | 57.3 | 64.8 | 6 / 35 | 2695 |
| 7 | 5 | 54.3 | 61.0 | 5 / 35 | 2182 |
| 8 | 4 | 54.9 | 61.9 | 5 / 35 | 2297 |
| 9 | 4 | 56.4 | 63.5 | 7 / 35 | 2492 |
| 10 | 5 | 54.2 | 57.1 | 8 / 35 | 2234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 58% |
| florent.XSeries.X2 0.12 | 23 | 61% |
| davidalves.Phoenix 0.54 | 19 | 47% |
| pedersen.Ugluk 1.1.1 | 12 | 42% |
| lunchie.Lunchbox 0.93 | 5 | 20% |
| oog.melee.Corsair 1.0 | 4 | 100% |
| stelo.SoJNanoMelee 1.1 | 4 | 25% |
| as.FrankTheTank 1.3 | 3 | 33% |

Hadur died in 297 of 350 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 63 | 21% | 79 |
| davidalves.Phoenix 0.54 | 61 | 21% | 66 |
| florent.XSeries.X2 0.12 | 57 | 19% | 72 |
| pedersen.Ugluk 1.1.1 | 53 | 18% | 60 |
| stelo.SoJNanoMelee 1.1 | 21 | 7% | 24 |
| oog.melee.Corsair 1.0 | 15 | 5% | 18 |
| lunchie.Lunchbox 0.93 | 12 | 4% | 14 |
| as.FrankTheTank 1.3 | 8 | 3% | 10 |
| evd.X1 0.01 | 6 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 70.4 | 84 / 350 | 3.66 | 13.7% | 29848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.6 | 14.7% | 80 |
| hadur117.nano.SanaroHL 0.2 | 2.2 | 13.7% | 84 |
| voidious.micro.BlitzBat 1.05 | 2.6 | 13.5% | 57 |
| jdw.Hurricane 1.4 | 3.9 | 12.2% | 51 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 10.5% | 33 |
| ds.Oo 2.2 | 5.7 | 9.3% | 24 |
| gjr.Cephalosporin 0.1 | 6.9 | 8.4% | 18 |
| awesomeness.Elite 1.0 | 8.1 | 7.1% | 3 |
| adt.Ar2 1.1 | 8.8 | 6.6% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 70.2 | 8 / 35 | 2955 |
| 2 | 2 | 58.7 | 67.0 | 7 / 35 | 2960 |
| 3 | 4 | 56.7 | 63.8 | 6 / 35 | 2710 |
| 4 | 2 | 61.0 | 74.0 | 5 / 35 | 3059 |
| 5 | 1 | 64.2 | 81.0 | 13 / 35 | 3240 |
| 6 | 2 | 61.1 | 73.3 | 11 / 35 | 2903 |
| 7 | 3 | 59.5 | 67.6 | 8 / 35 | 2948 |
| 8 | 3 | 59.1 | 66.3 | 10 / 35 | 2979 |
| 9 | 1 | 60.3 | 70.2 | 9 / 35 | 3127 |
| 10 | 1 | 59.7 | 71.1 | 7 / 35 | 2967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 58 | 36% |
| voidious.micro.BlitzBat 1.05 | 45 | 38% |
| jdw.Hurricane 1.4 | 32 | 84% |
| ds.Oo 2.2 | 11 | 36% |
| gre.svman4.Morfeas 1.4.1 | 11 | 45% |
| gjr.Cephalosporin 0.1 | 5 | 40% |
| adt.Ar2 1.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 268 of 350 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 75 | 28% | 95 |
| voidious.micro.BlitzBat 1.05 | 74 | 28% | 94 |
| jdw.Hurricane 1.4 | 38 | 14% | 53 |
| ds.Oo 2.2 | 24 | 9% | 30 |
| gre.svman4.Morfeas 1.4.1 | 19 | 7% | 31 |
| gjr.Cephalosporin 0.1 | 16 | 6% | 17 |
| adt.Ar2 1.1 | 8 | 3% | 12 |
| awesomeness.Elite 1.0 | 7 | 3% | 10 |
| amk.ChumbaMini 0.2 | 6 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 70.5 | 61 / 350 | 3.65 | 13.2% | 33826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.7% | 129 |
| hadur117.nano.SanaroHL 0.2 | 2.7 | 13.2% | 61 |
| shu.nitro.LENIN .T34 | 2.9 | 13.0% | 67 |
| lrem.Spectre 0.4.4 | 3.9 | 12.2% | 45 |
| gh.mini.GrubbmOne 1.0 | 4.8 | 11.5% | 24 |
| js.PinBall 1.6 | 5.9 | 10.8% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 9.2% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 8 |
| sample.SpinBot 1.0 | 9.0 | 5.1% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.8 | 68.9 | 5 / 35 | 3467 |
| 2 | 2 | 59.7 | 68.3 | 8 / 35 | 3218 |
| 3 | 4 | 59.6 | 67.9 | 3 / 35 | 3537 |
| 4 | 3 | 59.3 | 69.2 | 6 / 35 | 3058 |
| 5 | 2 | 59.4 | 67.9 | 7 / 35 | 3482 |
| 6 | 2 | 61.5 | 76.5 | 5 / 35 | 3419 |
| 7 | 2 | 63.2 | 79.0 | 10 / 35 | 3554 |
| 8 | 3 | 60.3 | 70.2 | 5 / 35 | 3416 |
| 9 | 3 | 59.6 | 69.2 | 6 / 35 | 3023 |
| 10 | 2 | 60.0 | 67.9 | 6 / 35 | 3652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 55 | 29% |
| shu.nitro.LENIN .T34 | 39 | 38% |
| lrem.Spectre 0.4.4 | 26 | 38% |
| js.PinBall 1.6 | 13 | 92% |
| gh.mini.GrubbmOne 1.0 | 10 | 30% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 80% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 33% |
| sample.SpinBot 1.0 | 1 | 0% |

Hadur died in 291 of 350 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 88 | 30% | 105 |
| shu.nitro.LENIN .T34 | 52 | 18% | 70 |
| lrem.Spectre 0.4.4 | 44 | 15% | 51 |
| gh.mini.GrubbmOne 1.0 | 40 | 14% | 43 |
| js.PinBall 1.6 | 27 | 9% | 37 |
| jaybot.adv.bots.JayBot 2.0 | 23 | 8% | 27 |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 3% | 10 |
| sample.SpinBot 1.0 | 7 | 2% | 7 |
2 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 74.4 | 123 / 350 | 3.31 | 14.3% | 30128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.3 | 15.2% | 108 |
| hadur117.nano.SanaroHL 0.2 | 1.8 | 14.3% | 123 |
| sheldor.melee.nano.TestMelee 0.1 | 3.7 | 12.1% | 33 |
| wee.Gem 1.8.4 | 4.1 | 11.7% | 52 |
| EH.Eagle 1.0.6 | 4.6 | 10.9% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 6.4 | 8.6% | 10 |
| joe.ADinosaur 1.0 | 7.3 | 8.2% | 8 |
| throxbot.ThroxBot 0.1 | 7.6 | 7.7% | 2 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.5% | 3 |
| cs.Grudge 1.0 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 82.9 | 14 / 35 | 3020 |
| 2 | 2 | 59.9 | 60.0 | 9 / 35 | 4339 |
| 3 | 2 | 58.9 | 69.8 | 10 / 35 | 2824 |
| 4 | 1 | 64.0 | 82.5 | 16 / 35 | 3083 |
| 5 | 3 | 61.2 | 74.6 | 11 / 35 | 3010 |
| 6 | 1 | 62.5 | 76.8 | 13 / 35 | 3178 |
| 7 | 2 | 61.2 | 76.2 | 13 / 35 | 2618 |
| 8 | 2 | 58.6 | 70.2 | 11 / 35 | 2513 |
| 9 | 2 | 61.0 | 74.6 | 14 / 35 | 2663 |
| 10 | 2 | 61.4 | 76.2 | 12 / 35 | 2880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 91 | 70% |
| wee.Gem 1.8.4 | 47 | 66% |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 68% |
| joe.ADinosaur 1.0 | 7 | 43% |
| EH.Eagle 1.0.6 | 6 | 83% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 60% |
| throxbot.ThroxBot 0.1 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 228 of 350 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 77 | 34% | 137 |
| wee.Gem 1.8.4 | 37 | 16% | 67 |
| sheldor.melee.nano.TestMelee 0.1 | 35 | 15% | 52 |
| EH.Eagle 1.0.6 | 18 | 8% | 22 |
| throxbot.ThroxBot 0.1 | 17 | 7% | 20 |
| caimano.Furia_Ceca 0.22 | 16 | 7% | 17 |
| joe.ADinosaur 1.0 | 14 | 6% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 10 | 4% | 15 |
| cs.Grudge 1.0 | 3 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 80.7 | 112 / 350 | 2.74 | 15.5% | 32656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.3% | 117 |
| hadur117.nano.SanaroHL 0.2 | 1.7 | 15.5% | 112 |
| uji.Antique 1.0 | 3.2 | 12.9% | 62 |
| qohnil.blot.BlotBot 3.61 | 4.1 | 11.1% | 24 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.4% | 14 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.9% | 12 |
| amk.ChumbaWumba 0.3 | 6.6 | 8.1% | 5 |
| matt.advanced.Katana 1.0 | 8.3 | 6.3% | 3 |
| stelo.PianistNano 1.2 | 8.8 | 6.1% | 1 |
| stelo.Lifestealer 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 75.6 | 8 / 35 | 3182 |
| 2 | 1 | 65.8 | 86.3 | 13 / 35 | 3746 |
| 3 | 2 | 63.5 | 82.2 | 10 / 35 | 3275 |
| 4 | 2 | 61.5 | 74.3 | 13 / 35 | 3143 |
| 5 | 2 | 62.0 | 80.3 | 7 / 35 | 2780 |
| 6 | 2 | 63.3 | 80.0 | 10 / 35 | 3227 |
| 7 | 2 | 64.3 | 82.5 | 11 / 35 | 3482 |
| 8 | 1 | 64.3 | 84.1 | 11 / 35 | 3462 |
| 9 | 1 | 63.5 | 80.3 | 14 / 35 | 3280 |
| 10 | 2 | 63.9 | 81.3 | 15 / 35 | 3079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 129 | 48% |
| uji.Antique 1.0 | 34 | 62% |
| qohnil.blot.BlotBot 3.61 | 25 | 64% |
| pfvicm.Sobieski 7.2.3b | 13 | 46% |
| ahr.ice.Ice 1.0.2 | 4 | 25% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| matt.advanced.Katana 1.0 | 3 | 33% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 238 of 350 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 93 | 39% | 144 |
| pfvicm.Sobieski 7.2.3b | 41 | 17% | 47 |
| uji.Antique 1.0 | 40 | 17% | 69 |
| qohnil.blot.BlotBot 3.61 | 19 | 8% | 33 |
| amk.ChumbaWumba 0.3 | 18 | 8% | 20 |
| ahr.ice.Ice 1.0.2 | 16 | 7% | 19 |
| stelo.Lifestealer 1.0 | 4 | 2% | 7 |
| stelo.PianistNano 1.2 | 4 | 2% | 6 |
| matt.advanced.Katana 1.0 | 3 | 1% | 5 |

## Melee bench: F29

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 68.7 | 64 / 350 | 3.81 | 13.5% | 31634 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.1 | 16.5% | 120 |
| zyx.mega.YersiniaPestis 3.1 | 2.1 | 15.4% | 95 |
| hadur117.nano.SanaroHL 0.2 | 3.3 | 13.5% | 64 |
| myl.micro.Troodon 1.10 | 4.0 | 12.6% | 22 |
| jok.PheonixM 0.1.2 | 4.5 | 11.7% | 25 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.5% | 0 |
| DBall.Anarchy 0.1 | 6.7 | 8.0% | 20 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.4% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.3% | 4 |
| jangs.ns51 1.0 | 9.6 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.7 | 68.9 | 7 / 35 | 3006 |
| 2 | 3 | 61.7 | 72.7 | 8 / 35 | 2898 |
| 3 | 4 | 59.4 | 65.4 | 5 / 35 | 3175 |
| 4 | 3 | 62.5 | 74.0 | 8 / 35 | 3352 |
| 5 | 3 | 62.5 | 74.3 | 9 / 35 | 3187 |
| 6 | 3 | 58.7 | 62.9 | 5 / 35 | 3159 |
| 7 | 3 | 60.3 | 69.8 | 3 / 35 | 3175 |
| 8 | 3 | 60.2 | 67.6 | 6 / 35 | 3333 |
| 9 | 2 | 63.1 | 76.2 | 9 / 35 | 3428 |
| 10 | 5 | 55.3 | 55.6 | 4 / 35 | 2921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 54 | 9% |
| zyx.mega.YersiniaPestis 3.1 | 49 | 53% |
| myl.micro.Troodon 1.10 | 28 | 71% |
| jok.PheonixM 0.1.2 | 11 | 64% |
| DBall.Anarchy 0.1 | 10 | 50% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 124 | 43% | 131 |
| zyx.mega.YersiniaPestis 3.1 | 55 | 19% | 79 |
| myl.micro.Troodon 1.10 | 43 | 15% | 62 |
| jok.PheonixM 0.1.2 | 33 | 12% | 40 |
| DBall.Anarchy 0.1 | 13 | 5% | 20 |
| ph.melee.ArcherME 0.3 | 10 | 3% | 10 |
| jangs.ns51 1.0 | 5 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 1% | 3 |

## Melee bench: F30

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.7 | 58.4 | 28 / 350 | 4.74 | 10.9% | 26757 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 2.0 | 14.1% | 67 |
| catcat20.Matcha 0.006 | 2.4 | 14.0% | 85 |
| darkcanuck.B26354 1.06 | 2.5 | 14.0% | 87 |
| stelo.PastFuture 2.3.2 | 3.1 | 13.5% | 58 |
| hadur117.nano.SanaroHL 0.2 | 5.0 | 10.9% | 28 |
| intruder.PrairieWolf 2.61 | 6.4 | 9.0% | 12 |
| ntc.Opposite 1.5 | 6.9 | 8.1% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 7.0% | 5 |
| tripphippy.Alice 1.1 | 8.4 | 6.9% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.6 | 57.8 | 4 / 35 | 2660 |
| 2 | 5 | 56.3 | 58.7 | 3 / 35 | 3109 |
| 3 | 5 | 52.7 | 52.7 | 4 / 35 | 2587 |
| 4 | 5 | 55.6 | 62.9 | 1 / 35 | 2524 |
| 5 | 5 | 53.4 | 55.9 | 2 / 35 | 2473 |
| 6 | 5 | 57.1 | 62.9 | 6 / 35 | 2680 |
| 7 | 5 | 53.2 | 55.2 | 0 / 35 | 2666 |
| 8 | 5 | 54.1 | 57.5 | 1 / 35 | 2762 |
| 9 | 5 | 52.7 | 53.3 | 4 / 35 | 2331 |
| 10 | 5 | 57.8 | 67.3 | 3 / 35 | 2965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 27 | 15% |
| darkcanuck.B26354 1.06 | 25 | 24% |
| stelo.PastFuture 2.3.2 | 15 | 53% |
| oog.melee.Capulet 1.2 | 12 | 42% |
| tripphippy.Alice 1.1 | 4 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 73 | 23% | 80 |
| darkcanuck.B26354 1.06 | 72 | 22% | 80 |
| catcat20.Matcha 0.006 | 59 | 18% | 62 |
| oog.melee.Capulet 1.2 | 51 | 16% | 60 |
| tripphippy.Alice 1.1 | 19 | 6% | 19 |
| ntc.Opposite 1.5 | 19 | 6% | 19 |
| intruder.PrairieWolf 2.61 | 17 | 5% | 17 |
| fowl3628800.LightningBolt 2.6.0 | 12 | 4% | 13 |

## Melee bench: F31

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.3 | 60.5 | 29 / 350 | 4.55 | 11.2% | 24982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.1% | 176 |
| gh.mini.Griezel 0.2 | 2.3 | 13.8% | 88 |
| d414.nano.Quantum 1.0.0 | 3.5 | 12.3% | 28 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.8% | 20 |
| hadur117.nano.SanaroHL 0.2 | 4.4 | 11.2% | 29 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.4% | 7 |
| fm.mammillarias 1.3 | 7.3 | 7.0% | 2 |
| timmit.nano.TimDog 0.33 | 7.8 | 6.5% | 2 |
| tlp.ThreeLeggedPig 1 | 9.4 | 4.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.0 | 62.2 | 3 / 35 | 2677 |
| 2 | 5 | 54.8 | 58.7 | 1 / 35 | 2467 |
| 3 | 5 | 56.4 | 62.9 | 2 / 35 | 2746 |
| 4 | 5 | 53.5 | 56.8 | 2 / 35 | 2218 |
| 5 | 4 | 55.4 | 62.2 | 4 / 35 | 2240 |
| 6 | 5 | 54.4 | 59.7 | 2 / 35 | 2403 |
| 7 | 4 | 55.6 | 61.0 | 3 / 35 | 2411 |
| 8 | 3 | 57.9 | 64.1 | 8 / 35 | 2537 |
| 9 | 6 | 50.6 | 50.2 | 1 / 35 | 2410 |
| 10 | 3 | 58.0 | 67.6 | 3 / 35 | 2873 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 41 | 34% |
| abc.Shadow 3.84i | 36 | 31% |
| d414.nano.Quantum 1.0.0 | 12 | 8% |
| spinnercat.micro.Tyger 0.1 | 7 | 29% |
| timmit.nano.TimDog 0.33 | 1 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 0% |

Hadur died in 322 of 350 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 81 | 25% | 95 |
| abc.Shadow 3.84i | 77 | 24% | 86 |
| spinnercat.micro.Tyger 0.1 | 54 | 17% | 56 |
| d414.nano.Quantum 1.0.0 | 50 | 16% | 52 |
| gh.nano.Grofvuil 0.2 | 21 | 7% | 22 |
| fm.mammillarias 1.3 | 19 | 6% | 19 |
| timmit.nano.TimDog 0.33 | 13 | 4% | 13 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 1% | 4 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 3 |

## Melee bench: F32

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 74.6 | 134 / 350 | 3.29 | 14.5% | 31576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.5 | 15.1% | 99 |
| hadur117.nano.SanaroHL 0.2 | 2.0 | 14.5% | 134 |
| apc.botM 3.0 | 2.8 | 12.8% | 54 |
| lxx.ConceptA 0.8 | 4.4 | 10.7% | 10 |
| vjik.UnViolation 1.1 | 4.6 | 10.7% | 20 |
| bayen.UbaMicro 1.4 | 5.8 | 9.4% | 14 |
| yk.JahMicro 1.0 | 7.6 | 7.3% | 12 |
| panzer.Panzer 0.2 | 7.6 | 7.6% | 1 |
| conscience.Electron 1.3g | 8.8 | 6.6% | 2 |
| donjezza.Jezza 1.0 | 9.9 | 5.3% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 72.1 | 11 / 35 | 2923 |
| 2 | 2 | 62.7 | 80.3 | 14 / 35 | 3123 |
| 3 | 3 | 59.5 | 69.8 | 10 / 35 | 3041 |
| 4 | 1 | 64.0 | 82.9 | 18 / 35 | 3162 |
| 5 | 1 | 62.7 | 81.0 | 15 / 35 | 2836 |
| 6 | 2 | 58.9 | 65.7 | 13 / 35 | 3320 |
| 7 | 2 | 61.4 | 72.1 | 16 / 35 | 3420 |
| 8 | 2 | 61.4 | 76.2 | 10 / 35 | 3227 |
| 9 | 1 | 61.5 | 73.0 | 15 / 35 | 3403 |
| 10 | 3 | 60.7 | 72.7 | 12 / 35 | 3121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 82 | 59% |
| apc.botM 3.0 | 46 | 70% |
| lxx.ConceptA 0.8 | 22 | 95% |
| vjik.UnViolation 1.1 | 15 | 80% |
| yk.JahMicro 1.0 | 11 | 82% |
| bayen.UbaMicro 1.4 | 10 | 50% |
| donjezza.Jezza 1.0 | 6 | 33% |
| panzer.Panzer 0.2 | 5 | 100% |

Hadur died in 216 of 350 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 61 | 28% | 108 |
| lxx.ConceptA 0.8 | 40 | 19% | 51 |
| apc.botM 3.0 | 37 | 17% | 72 |
| bayen.UbaMicro 1.4 | 18 | 8% | 24 |
| vjik.UnViolation 1.1 | 17 | 8% | 42 |
| yk.JahMicro 1.0 | 15 | 7% | 19 |
| panzer.Panzer 0.2 | 14 | 6% | 16 |
| conscience.Electron 1.3g | 7 | 3% | 9 |
| donjezza.Jezza 1.0 | 7 | 3% | 7 |

## Melee bench: F33

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 71.0 | 85 / 350 | 3.61 | 14.2% | 36084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.2 | 16.9% | 98 |
| hadur117.nano.SanaroHL 0.2 | 2.0 | 14.2% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.5% | 72 |
| labg.Cataclysm 2.05 | 4.1 | 11.8% | 41 |
| gre.svman4.Leonidas 1.3.2 | 4.4 | 11.2% | 32 |
| baal.nano.N 1.42 | 6.5 | 8.8% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.5% | 15 |
| zyx.micro.Ant 1.1 | 8.4 | 5.6% | 2 |
| sanja.First 0.1 | 8.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 59.4 | 5 / 35 | 3573 |
| 2 | 2 | 61.6 | 71.7 | 8 / 35 | 3215 |
| 3 | 2 | 62.1 | 71.7 | 10 / 35 | 3593 |
| 4 | 2 | 56.7 | 60.3 | 3 / 35 | 3396 |
| 5 | 2 | 61.4 | 69.2 | 8 / 35 | 3630 |
| 6 | 2 | 62.9 | 74.3 | 10 / 35 | 3754 |
| 7 | 3 | 61.0 | 70.2 | 7 / 35 | 3635 |
| 8 | 1 | 64.5 | 81.0 | 13 / 35 | 3538 |
| 9 | 1 | 64.0 | 77.1 | 13 / 35 | 3644 |
| 10 | 2 | 63.5 | 75.2 | 8 / 35 | 4106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 70 | 59% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 11% |
| gre.svman4.Leonidas 1.3.2 | 29 | 59% |
| labg.Cataclysm 2.05 | 26 | 73% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 43% |

Hadur died in 265 of 350 rounds, at a mean tick of 1187. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 95 | 36% | 139 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 69 | 26% | 76 |
| gre.svman4.Leonidas 1.3.2 | 40 | 15% | 57 |
| labg.Cataclysm 2.05 | 19 | 7% | 35 |
| kinsen.melee.Angsaichmophobia 1.8c | 16 | 6% | 16 |
| baal.nano.N 1.42 | 13 | 5% | 14 |
| zyx.micro.Ant 1.1 | 7 | 3% | 7 |
| sanja.First 0.1 | 5 | 2% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 0% | 1 |

## Melee bench: F34

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 73.8 | 67 / 350 | 3.35 | 13.9% | 33604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.4 | 17.2% | 130 |
| kid.Gladiator .7.2 | 1.7 | 16.9% | 103 |
| hadur117.nano.SanaroHL 0.2 | 2.9 | 13.9% | 67 |
| jcs.Seth 1.8 | 4.4 | 11.6% | 30 |
| tcf.Reach 3 | 4.7 | 11.1% | 11 |
| cli.Dancer 1.1 | 5.9 | 9.9% | 6 |
| ratosh.Wesco 1.4 | 7.0 | 7.7% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 1 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 65.1 | 7 / 35 | 3019 |
| 2 | 3 | 59.7 | 69.8 | 4 / 35 | 2964 |
| 3 | 3 | 61.9 | 74.3 | 8 / 35 | 3151 |
| 4 | 3 | 62.5 | 72.7 | 6 / 35 | 3690 |
| 5 | 3 | 63.8 | 80.3 | 8 / 35 | 3463 |
| 6 | 2 | 64.8 | 81.0 | 8 / 35 | 3826 |
| 7 | 3 | 62.0 | 73.7 | 8 / 35 | 3413 |
| 8 | 3 | 62.9 | 76.5 | 9 / 35 | 3288 |
| 9 | 3 | 61.3 | 72.4 | 5 / 35 | 3353 |
| 10 | 3 | 61.8 | 72.7 | 4 / 35 | 3437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 65 | 51% |
| kid.Gladiator .7.2 | 55 | 24% |
| jcs.Seth 1.8 | 22 | 64% |
| tcf.Reach 3 | 8 | 63% |
| cli.Dancer 1.1 | 3 | 33% |
| amk.Punbot.Punbot 0.01 | 2 | 50% |

Hadur died in 284 of 350 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 118 | 42% | 127 |
| stelo.Spread 0.9 | 85 | 30% | 117 |
| tcf.Reach 3 | 23 | 8% | 33 |
| jcs.Seth 1.8 | 21 | 7% | 36 |
| ratosh.Wesco 1.4 | 15 | 5% | 15 |
| cli.Dancer 1.1 | 14 | 5% | 15 |
| amk.Punbot.Punbot 0.01 | 6 | 2% | 6 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 67.7 | 30 / 350 | 3.91 | 12.2% | 25508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.2% | 261 |
| gh.mini.Gruwel 0.9 | 2.4 | 13.6% | 32 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.6 | 12.4% | 17 |
| hadur117.nano.SanaroHL 0.2 | 3.9 | 12.2% | 30 |
| rz.HawkOnFire 0.1 | 4.1 | 12.0% | 8 |
| wit.Chuliath 1.0 | 6.5 | 7.1% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 6.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.4% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.2 | 65.4 | 1 / 35 | 2807 |
| 2 | 4 | 57.0 | 63.2 | 3 / 35 | 2525 |
| 3 | 5 | 56.0 | 63.8 | 2 / 35 | 2283 |
| 4 | 3 | 58.9 | 72.1 | 4 / 35 | 2268 |
| 5 | 3 | 60.5 | 73.0 | 4 / 35 | 2777 |
| 6 | 3 | 59.8 | 75.6 | 4 / 35 | 2317 |
| 7 | 4 | 57.8 | 63.8 | 2 / 35 | 3064 |
| 8 | 4 | 58.0 | 66.0 | 4 / 35 | 2638 |
| 9 | 4 | 57.1 | 65.7 | 2 / 35 | 2358 |
| 10 | 4 | 58.2 | 67.9 | 4 / 35 | 2471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 71 | 3% |
| gh.mini.Gruwel 0.9 | 23 | 57% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 73% |
| rz.HawkOnFire 0.1 | 5 | 80% |
| wit.Chuliath 1.0 | 3 | 33% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 321 of 350 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 138 | 43% | 140 |
| gh.mini.Gruwel 0.9 | 55 | 17% | 69 |
| dmh.robocode.robot.BlackDeath 9.2 | 55 | 17% | 62 |
| rz.HawkOnFire 0.1 | 49 | 15% | 52 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 2% | 8 |
| wit.Chuliath 1.0 | 7 | 2% | 8 |
| dans.Cinnamon 1.2 | 4 | 1% | 4 |
| myl.nano.KomoriNinja 1.1 | 4 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 3 |

## Melee bench: F36

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 77.5 | 155 / 350 | 3.02 | 15.7% | 35585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHL 0.2 | 1.0 | 15.7% | 155 |
| alpha.RainingFire 1.0 | 3.0 | 12.4% | 49 |
| mz.Cork 0.1 | 3.2 | 11.9% | 38 |
| bzdp.Pansy 2.1 | 3.4 | 12.3% | 41 |
| bvh.micro.Freya 0.3 | 4.7 | 10.7% | 20 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.6% | 17 |
| bvh.mini.Fenrir 0.39 | 6.4 | 9.6% | 14 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.5% | 4 |
| dl.BetterWalls 1.0 | 8.7 | 6.6% | 2 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.6% | 14 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 82.9 | 16 / 35 | 3583 |
| 2 | 1 | 62.6 | 72.7 | 16 / 35 | 3585 |
| 3 | 1 | 59.8 | 67.0 | 12 / 35 | 3422 |
| 4 | 1 | 64.4 | 80.6 | 16 / 35 | 3648 |
| 5 | 1 | 61.8 | 74.9 | 13 / 35 | 3373 |
| 6 | 1 | 66.5 | 84.4 | 21 / 35 | 3856 |
| 7 | 1 | 63.5 | 78.7 | 15 / 35 | 3538 |
| 8 | 1 | 65.5 | 82.5 | 18 / 35 | 3884 |
| 9 | 1 | 60.3 | 69.8 | 13 / 35 | 3173 |
| 10 | 1 | 64.4 | 81.6 | 15 / 35 | 3523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 59% |
| mz.Cork 0.1 | 38 | 87% |
| alpha.RainingFire 1.0 | 32 | 69% |
| bvh.micro.Freya 0.3 | 31 | 90% |
| bvh.mini.Fenrir 0.39 | 22 | 95% |
| m3thos.Eva02 0.7.1 | 17 | 71% |
| sample.MyFirstRobot 1.0 | 7 | 29% |
| dl.BetterWalls 1.0 | 7 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 0% |

Hadur died in 196 of 350 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 41 | 21% | 82 |
| alpha.RainingFire 1.0 | 33 | 17% | 48 |
| mz.Cork 0.1 | 31 | 16% | 68 |
| bvh.micro.Freya 0.3 | 30 | 15% | 51 |
| bvh.mini.Fenrir 0.39 | 17 | 9% | 28 |
| m3thos.Eva02 0.7.1 | 15 | 8% | 28 |
| squidM.TentalceMeleeNano 1.1 | 13 | 7% | 14 |
| sample.MyFirstRobot 1.0 | 8 | 4% | 12 |
| dl.BetterWalls 1.0 | 7 | 4% | 19 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 80.2 | 138 / 350 | 2.78 | 15.9% | 43324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHL 0.2 | 1.0 | 15.9% | 138 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.1 | 11.0% | 26 |
| germ.TheMind .2 | 3.2 | 11.3% | 43 |
| EBBU.Sim2 1.02 | 3.4 | 10.8% | 35 |
| agrach.Dalek 1.0 | 6.0 | 9.2% | 24 |
| stelo.UntouchableNano 1.3 | 6.3 | 9.2% | 27 |
| mb.Beast 0.1 | 7.1 | 8.6% | 28 |
| lmk.ACPFinal 0.1 | 7.4 | 8.5% | 12 |
| skm.Ryubot 1.0 | 8.5 | 7.9% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 7.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 78.7 | 9 / 35 | 4178 |
| 2 | 1 | 63.6 | 83.2 | 14 / 35 | 4153 |
| 3 | 1 | 65.2 | 84.4 | 15 / 35 | 4940 |
| 4 | 1 | 63.0 | 81.3 | 16 / 35 | 3663 |
| 5 | 1 | 60.6 | 72.7 | 12 / 35 | 4098 |
| 6 | 1 | 65.0 | 84.8 | 15 / 35 | 4792 |
| 7 | 1 | 64.8 | 84.1 | 14 / 35 | 4883 |
| 8 | 1 | 63.9 | 82.5 | 15 / 35 | 4312 |
| 9 | 1 | 63.3 | 77.1 | 17 / 35 | 4584 |
| 10 | 1 | 60.1 | 73.3 | 11 / 35 | 3721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 45 | 58% |
| stelo.UntouchableNano 1.3 | 40 | 70% |
| EBBU.Sim2 1.02 | 32 | 34% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 65% |
| mb.Beast 0.1 | 21 | 71% |
| agrach.Dalek 1.0 | 20 | 70% |
| skm.Ryubot 1.0 | 19 | 63% |
| lmk.ACPFinal 0.1 | 15 | 80% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 215 of 350 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 47 | 22% | 68 |
| EBBU.Sim2 1.02 | 42 | 20% | 51 |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 12% | 47 |
| agrach.Dalek 1.0 | 26 | 12% | 45 |
| stelo.UntouchableNano 1.3 | 23 | 11% | 46 |
| mb.Beast 0.1 | 14 | 7% | 34 |
| lmk.ACPFinal 0.1 | 14 | 7% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 6% | 13 |
| skm.Ryubot 1.0 | 11 | 5% | 22 |

## Melee bench: F38

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 65.7 | 31 / 350 | 4.09 | 12.0% | 27924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.4% | 149 |
| bvh.mini.Freya 0.55 | 2.8 | 13.2% | 40 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.9 | 12.2% | 36 |
| hadur117.nano.SanaroHL 0.2 | 4.1 | 12.0% | 31 |
| bts.mega.Gnarly 1.4 | 4.4 | 11.4% | 54 |
| cs.Wren 1.0 | 5.2 | 10.9% | 20 |
| kdf.KoulDestroyer 1.0 | 6.6 | 9.1% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.4% | 6 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 2 |
| bzdp.BoxCar 2.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 68.3 | 5 / 35 | 2873 |
| 2 | 4 | 58.1 | 67.3 | 3 / 35 | 2978 |
| 3 | 3 | 56.2 | 66.3 | 3 / 35 | 2369 |
| 4 | 4 | 58.5 | 68.9 | 4 / 35 | 2809 |
| 5 | 3 | 60.2 | 74.3 | 3 / 35 | 2815 |
| 6 | 5 | 56.7 | 63.2 | 2 / 35 | 2878 |
| 7 | 4 | 56.9 | 65.7 | 2 / 35 | 2902 |
| 8 | 4 | 56.9 | 63.5 | 2 / 35 | 3048 |
| 9 | 5 | 56.5 | 62.9 | 4 / 35 | 2631 |
| 10 | 6 | 53.6 | 56.8 | 3 / 35 | 2621 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 50 | 44% |
| bts.mega.Gnarly 1.4 | 16 | 19% |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 0% |
| bvh.mini.Freya 0.55 | 15 | 27% |
| cs.Wren 1.0 | 8 | 13% |
| kdf.KoulDestroyer 1.0 | 3 | 33% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 319 of 350 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 83 | 26% | 106 |
| bvh.mini.Freya 0.55 | 60 | 19% | 64 |
| davidalves.net.DuelistNanoMelee 1.01 | 50 | 16% | 50 |
| bts.mega.Gnarly 1.4 | 47 | 15% | 50 |
| cs.Wren 1.0 | 43 | 13% | 44 |
| kdf.KoulDestroyer 1.0 | 21 | 7% | 21 |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 2% | 6 |
| bzdp.BoxCar 2.0 | 5 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 4 | 1% | 4 |

## Melee bench: F39

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 64.9 | 34 / 350 | 4.16 | 12.1% | 30233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.4% | 75 |
| az.Ololobot 0.2.4 | 1.8 | 14.1% | 142 |
| hadur117.nano.SanaroHL 0.2 | 3.2 | 12.1% | 34 |
| catcat20.Lambda 0.024 | 4.3 | 11.2% | 41 |
| stelo.SoRobotNanoMelee 1.2 | 5.9 | 9.7% | 37 |
| winamp32.micro.MicroMacro 1.0 | 6.1 | 9.2% | 12 |
| apollokidd.ApolloKidd 0.9 | 6.4 | 8.8% | 3 |
| gimp.GimpBot 0.1 | 7.1 | 8.2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.3% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.4 | 61.0 | 5 / 35 | 2977 |
| 2 | 3 | 57.4 | 70.2 | 3 / 35 | 2689 |
| 3 | 3 | 56.8 | 65.4 | 5 / 35 | 3061 |
| 4 | 3 | 58.9 | 70.2 | 3 / 35 | 3412 |
| 5 | 3 | 55.8 | 62.9 | 2 / 35 | 3125 |
| 6 | 3 | 57.9 | 68.9 | 3 / 35 | 3153 |
| 7 | 3 | 56.6 | 61.9 | 3 / 35 | 3371 |
| 8 | 4 | 54.7 | 61.0 | 2 / 35 | 2745 |
| 9 | 3 | 56.8 | 65.4 | 5 / 35 | 2907 |
| 10 | 4 | 54.7 | 61.9 | 3 / 35 | 2793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 53 | 6% |
| bvh.fry.Freya 0.82 | 29 | 24% |
| catcat20.Lambda 0.024 | 21 | 71% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 7% |
| winamp32.micro.MicroMacro 1.0 | 8 | 50% |
| apollokidd.ApolloKidd 0.9 | 2 | 0% |
| gimp.GimpBot 0.1 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 50% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 316 of 350 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 100 | 32% | 106 |
| az.Ololobot 0.2.4 | 71 | 22% | 73 |
| stelo.SoRobotNanoMelee 1.2 | 42 | 13% | 44 |
| apollokidd.ApolloKidd 0.9 | 35 | 11% | 36 |
| catcat20.Lambda 0.024 | 23 | 7% | 31 |
| winamp32.micro.MicroMacro 1.0 | 19 | 6% | 27 |
| gimp.GimpBot 0.1 | 10 | 3% | 15 |
| whitesquare.robots.SkynetAdvanced 1.1 | 10 | 3% | 10 |
| dcs.Eater_of_Worlds 1.1.3-A | 6 | 2% | 8 |

## Melee bench: F41

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 71.6 | 103 / 350 | 3.55 | 13.8% | 29689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.2 | 16.0% | 129 |
| hadur117.nano.SanaroHL 0.2 | 2.8 | 13.8% | 103 |
| ary.Swarm 1.1 | 3.3 | 13.5% | 38 |
| lessonz.robocode.Oz 0.5.0 | 3.4 | 13.3% | 44 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 12.0% | 28 |
| shrub.Silver v048 | 6.2 | 9.0% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 8.1% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.0% | 5 |
| stelo.Mirror 1.1 | 8.6 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.0 | 70.2 | 8 / 35 | 2737 |
| 2 | 5 | 54.3 | 59.4 | 4 / 35 | 2260 |
| 3 | 2 | 63.4 | 76.8 | 12 / 35 | 3261 |
| 4 | 2 | 61.9 | 75.2 | 12 / 35 | 2902 |
| 5 | 1 | 66.7 | 88.9 | 20 / 35 | 3129 |
| 6 | 5 | 57.6 | 61.6 | 8 / 35 | 2842 |
| 7 | 2 | 62.3 | 74.6 | 11 / 35 | 2986 |
| 8 | 3 | 58.1 | 62.5 | 8 / 35 | 3122 |
| 9 | 2 | 62.0 | 73.0 | 12 / 35 | 3126 |
| 10 | 2 | 62.0 | 74.0 | 8 / 35 | 3324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 74 | 42% |
| lessonz.robocode.Oz 0.5.0 | 36 | 78% |
| ary.Swarm 1.1 | 30 | 80% |
| simonton.nano.MeleeSeed 1.8 | 22 | 77% |
| shrub.Silver v048 | 4 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 250 of 350 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 71 | 28% | 106 |
| ary.Swarm 1.1 | 60 | 24% | 79 |
| lessonz.robocode.Oz 0.5.0 | 43 | 17% | 62 |
| shrub.Silver v048 | 26 | 10% | 31 |
| simonton.nano.MeleeSeed 1.8 | 25 | 10% | 42 |
| zyx.nano.Ant 1.1 | 14 | 6% | 16 |
| acogdev.alpha 0.2 | 5 | 2% | 5 |
| stelo.Mirror 1.1 | 3 | 1% | 5 |
| jsal.Jsalbot 1.0 | 2 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 75.0 | 77 / 350 | 3.25 | 14.2% | 34782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.5% | 162 |
| hadur117.nano.SanaroHL 0.2 | 2.8 | 14.2% | 77 |
| maribo.mini.MiniQuester 0.1 | 2.9 | 14.4% | 41 |
| ara.Shera 0.88 | 3.3 | 13.7% | 56 |
| amz.NanoClone 1.41 | 5.1 | 9.4% | 4 |
| maribo.IotaCT 1.1 | 6.6 | 7.3% | 1 |
| dsw.StaticD 1.0 | 6.6 | 7.4% | 9 |
| mme.NikeEnhanced 2.0 | 8.1 | 5.8% | 0 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.8 | 68.9 | 6 / 35 | 3469 |
| 2 | 2 | 63.4 | 79.0 | 11 / 35 | 3556 |
| 3 | 2 | 62.6 | 76.8 | 13 / 35 | 3248 |
| 4 | 3 | 62.0 | 76.8 | 6 / 35 | 3508 |
| 5 | 2 | 63.0 | 75.6 | 8 / 35 | 3973 |
| 6 | 3 | 61.6 | 74.9 | 8 / 35 | 3387 |
| 7 | 2 | 62.9 | 78.4 | 8 / 35 | 3662 |
| 8 | 4 | 58.7 | 67.0 | 5 / 35 | 3304 |
| 9 | 3 | 61.6 | 72.7 | 5 / 35 | 3641 |
| 10 | 3 | 62.3 | 80.0 | 7 / 35 | 3034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 86 | 38% |
| ara.Shera 0.88 | 36 | 58% |
| maribo.mini.MiniQuester 0.1 | 30 | 70% |
| dsw.StaticD 1.0 | 5 | 40% |
| amz.NanoClone 1.41 | 2 | 0% |

Hadur died in 273 of 350 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 116 | 42% | 148 |
| ara.Shera 0.88 | 60 | 22% | 82 |
| maribo.mini.MiniQuester 0.1 | 57 | 21% | 76 |
| amz.NanoClone 1.41 | 15 | 5% | 16 |
| maribo.IotaCT 1.1 | 12 | 4% | 12 |
| dsw.StaticD 1.0 | 9 | 3% | 11 |
| stelo.MirrorMicro 1.0 | 3 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 0% | 2 |

## Melee bench: F43

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 61.7 | 23 / 350 | 4.45 | 11.4% | 26893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 281 |
| brainfade.melee.Dusk 0.44 | 2.6 | 12.7% | 20 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.2% | 12 |
| hadur117.nano.SanaroHL 0.2 | 4.0 | 11.4% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 4.6 | 11.2% | 11 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 10.4% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.8% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 65.4 | 4 / 35 | 2709 |
| 2 | 5 | 54.7 | 53.3 | 0 / 35 | 2685 |
| 3 | 5 | 56.7 | 58.7 | 0 / 35 | 2610 |
| 4 | 6 | 53.8 | 54.0 | 1 / 35 | 2335 |
| 5 | 2 | 59.7 | 66.0 | 4 / 35 | 3055 |
| 6 | 4 | 58.2 | 61.3 | 4 / 35 | 2793 |
| 7 | 2 | 62.1 | 74.3 | 4 / 35 | 2883 |
| 8 | 5 | 56.4 | 59.0 | 1 / 35 | 2462 |
| 9 | 5 | 56.9 | 59.0 | 1 / 35 | 2708 |
| 10 | 3 | 59.4 | 66.0 | 4 / 35 | 2653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 65 | 11% |
| dummy.micro.Sparrow 2.5 | 9 | 44% |
| brainfade.melee.Dusk 0.44 | 7 | 86% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| mz.NanoGod 2.02 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 327 of 350 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 142 | 43% | 147 |
| dummy.micro.Sparrow 2.5 | 49 | 15% | 54 |
| brainfade.melee.Dusk 0.44 | 35 | 11% | 43 |
| wcsv.melee.EngineerMelee 0.1 | 35 | 11% | 38 |
| Krabb.akim2.Akim2 1.1b | 23 | 7% | 24 |
| mz.NanoGod 2.02 | 20 | 6% | 21 |
| jab.DiamondStealer 5 | 17 | 5% | 17 |
| cvt.Firsty 1.0 | 6 | 2% | 6 |

## Melee bench: F44

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 71.6 | 74 / 350 | 3.55 | 13.9% | 33668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 17.2% | 146 |
| tzu.TheArtOfWar 1.2 | 2.1 | 15.2% | 81 |
| hadur117.nano.SanaroHL 0.2 | 2.8 | 13.9% | 74 |
| wompi.Quokka 1.6 | 4.3 | 11.0% | 14 |
| jwirde.Gort 2.0 | 4.8 | 10.4% | 26 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 9.0% | 2 |
| disan.Chair 2.2.0 | 7.2 | 7.3% | 5 |
| stf.PanzerGeneral 0.1 | 7.9 | 6.8% | 1 |
| sample.Crazy 1.0 | 9.0 | 5.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.9 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 73.7 | 12 / 35 | 3304 |
| 2 | 3 | 61.3 | 71.7 | 5 / 35 | 3652 |
| 3 | 3 | 61.8 | 73.3 | 7 / 35 | 3254 |
| 4 | 3 | 60.1 | 69.5 | 8 / 35 | 3039 |
| 5 | 3 | 61.1 | 74.6 | 5 / 35 | 3117 |
| 6 | 3 | 59.1 | 67.3 | 4 / 35 | 3285 |
| 7 | 2 | 61.7 | 71.1 | 7 / 35 | 3648 |
| 8 | 2 | 62.7 | 75.6 | 8 / 35 | 3700 |
| 9 | 3 | 61.0 | 70.2 | 9 / 35 | 3351 |
| 10 | 3 | 60.4 | 69.2 | 9 / 35 | 3318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 86 | 51% |
| tzu.TheArtOfWar 1.2 | 42 | 31% |
| jwirde.Gort 2.0 | 15 | 27% |
| wompi.Quokka 1.6 | 8 | 63% |
| disan.Chair 2.2.0 | 4 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 110 | 40% | 153 |
| tzu.TheArtOfWar 1.2 | 75 | 27% | 89 |
| jwirde.Gort 2.0 | 30 | 11% | 37 |
| wompi.Quokka 1.6 | 26 | 9% | 27 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 17 | 6% | 19 |
| stf.PanzerGeneral 0.1 | 7 | 3% | 9 |
| amk.jointstrike.JointStrike 0.2 | 7 | 3% | 8 |
| disan.Chair 2.2.0 | 3 | 1% | 5 |
| sample.Crazy 1.0 | 2 | 1% | 3 |

## Melee bench: F45

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 73.1 | 81 / 350 | 3.42 | 14.9% | 37210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHL 0.2 | 1.2 | 14.9% | 81 |
| jje.BagPuss 1.2 | 2.7 | 13.1% | 27 |
| eem.IWillFireNoBullet v2.8 | 3.0 | 12.0% | 158 |
| sul.Lunar 1.1 | 4.1 | 11.4% | 39 |
| myl.nano.Graviton 1.10 | 4.6 | 10.7% | 17 |
| hvilela.HVilela 0.9 | 6.2 | 9.3% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.4% | 7 |
| fm.claire 1.7 | 7.2 | 8.5% | 3 |
| wit.Deep7 2.0 | 9.0 | 6.5% | 18 |
| abud.ThirdRobo 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.4 | 70.5 | 9 / 35 | 3700 |
| 2 | 1 | 60.3 | 68.3 | 11 / 35 | 3503 |
| 3 | 1 | 64.5 | 75.6 | 12 / 35 | 3335 |
| 4 | 3 | 59.9 | 68.3 | 4 / 35 | 3756 |
| 5 | 1 | 64.0 | 80.0 | 7 / 35 | 3981 |
| 6 | 1 | 62.8 | 75.2 | 10 / 35 | 3844 |
| 7 | 1 | 63.1 | 77.1 | 5 / 35 | 4050 |
| 8 | 1 | 61.7 | 73.3 | 8 / 35 | 3685 |
| 9 | 1 | 59.9 | 67.6 | 6 / 35 | 3770 |
| 10 | 1 | 62.1 | 74.9 | 9 / 35 | 3586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 99 | 40% |
| sul.Lunar 1.1 | 25 | 20% |
| jje.BagPuss 1.2 | 20 | 60% |
| myl.nano.Graviton 1.10 | 14 | 71% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 100% |
| wit.Deep7 2.0 | 6 | 17% |
| hvilela.HVilela 0.9 | 3 | 100% |
| fm.claire 1.7 | 2 | 50% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 269 of 350 rounds, at a mean tick of 1336. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 66 | 25% | 0 |
| jje.BagPuss 1.2 | 57 | 21% | 102 |
| sul.Lunar 1.1 | 43 | 16% | 81 |
| myl.nano.Graviton 1.10 | 38 | 14% | 67 |
| fm.claire 1.7 | 20 | 7% | 23 |
| hvilela.HVilela 0.9 | 15 | 6% | 26 |
| pez.mini.ChironexFleckeri 0.5 | 14 | 5% | 23 |
| wit.Deep7 2.0 | 14 | 5% | 20 |
| abud.ThirdRobo 1.0 | 2 | 1% | 7 |

## Melee bench: F46

hadur117.nano.SanaroHL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 72.2 | 51 / 350 | 3.50 | 13.1% | 28741 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.1 | 18.1% | 137 |
| rsalesc.melee.Medina 0.4.5 | 1.9 | 16.9% | 138 |
| hadur117.nano.SanaroHL 0.2 | 3.0 | 13.1% | 51 |
| mz.MicroSheep 1.0 | 4.5 | 10.4% | 5 |
| cx.Princess 1.0 | 5.0 | 10.2% | 15 |
| sadoner.killer 0.2 | 5.5 | 9.5% | 2 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.3% | 4 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 77.5 | 4 / 35 | 2914 |
| 2 | 3 | 59.8 | 73.0 | 5 / 35 | 2743 |
| 3 | 3 | 59.2 | 71.4 | 8 / 35 | 2637 |
| 4 | 3 | 57.4 | 65.7 | 1 / 35 | 2785 |
| 5 | 3 | 61.9 | 76.2 | 7 / 35 | 3192 |
| 6 | 3 | 59.9 | 71.4 | 6 / 35 | 2897 |
| 7 | 3 | 59.6 | 71.1 | 6 / 35 | 2891 |
| 8 | 3 | 61.1 | 74.6 | 4 / 35 | 3146 |
| 9 | 3 | 59.0 | 70.5 | 4 / 35 | 2674 |
| 10 | 3 | 59.6 | 70.8 | 6 / 35 | 2862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 88 | 43% |
| rsalesc.melee.Medina 0.4.5 | 48 | 15% |
| mz.MicroSheep 1.0 | 5 | 40% |
| cx.Princess 1.0 | 4 | 50% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 301 of 350 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 120 | 40% | 159 |
| rsalesc.melee.Medina 0.4.5 | 91 | 30% | 97 |
| mz.MicroSheep 1.0 | 27 | 9% | 27 |
| sadoner.killer 0.2 | 21 | 7% | 22 |
| cx.Princess 1.0 | 20 | 7% | 22 |
| arthord.NanoSatanMelee Beta | 11 | 4% | 12 |
| kurios.DOSexe .9a | 6 | 2% | 6 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |
1 death(s) with no robot to name.

