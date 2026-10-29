# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 72.6 | 34 / 350 | 3.47 | 13.5% | 36414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 238 |
| hadur117.nano.SanaroS02 0.1 | 2.2 | 13.5% | 34 |
| sgp.JollyNinja 3.53 | 3.3 | 12.3% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.4% | 16 |
| mz.MicroGodMelee 1 | 4.9 | 11.2% | 12 |
| lorneswork.Predator 1.0 | 5.5 | 9.9% | 9 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 7.9 | 6.1% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.7% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 80.6 | 3 / 35 | 3445 |
| 2 | 2 | 60.5 | 70.8 | 6 / 35 | 3548 |
| 3 | 2 | 62.0 | 73.7 | 4 / 35 | 4043 |
| 4 | 2 | 61.0 | 70.8 | 3 / 35 | 3968 |
| 5 | 2 | 61.2 | 73.3 | 6 / 35 | 3606 |
| 6 | 2 | 60.9 | 74.0 | 2 / 35 | 3404 |
| 7 | 2 | 61.5 | 76.5 | 5 / 35 | 3462 |
| 8 | 2 | 60.4 | 70.8 | 4 / 35 | 3717 |
| 9 | 3 | 59.8 | 69.2 | 1 / 35 | 3875 |
| 10 | 3 | 58.0 | 66.0 | 0 / 35 | 3346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 135 | 7% |
| sgp.JollyNinja 3.53 | 19 | 47% |
| mz.MicroGodMelee 1 | 12 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 78% |
| lorneswork.Predator 1.0 | 2 | 0% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 0% |

Hadur died in 318 of 350 rounds, at a mean tick of 1101. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 162 | 51% | 170 |
| sgp.JollyNinja 3.53 | 43 | 14% | 52 |
| lorneswork.Predator 1.0 | 34 | 11% | 34 |
| simonton.nano.WeekendObsession_Melee 1.0 | 32 | 10% | 36 |
| adt.Ar2 1.0 | 21 | 7% | 22 |
| mz.MicroGodMelee 1 | 20 | 6% | 27 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 4 |
| skm.butterfly 1.0 | 3 | 1% | 4 |

## Melee bench: F02

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 65.2 | 56 / 350 | 4.13 | 13.7% | 42778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.7 | 14.8% | 95 |
| pulsar.PulsarMax 0.8.9 | 1.9 | 14.7% | 97 |
| hadur117.nano.SanaroS02 0.1 | 2.4 | 13.7% | 56 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.3% | 8 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.5 | 9.9% | 24 |
| Noran.BitchingElk 0.054 | 6.5 | 8.3% | 32 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.2% | 5 |
| sch.Simone 0.3d | 7.5 | 7.8% | 21 |
| stelo.PatternRobot 1.0 | 8.6 | 6.6% | 9 |
| fullsail.SweetTea 1.1 | 9.9 | 4.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.5 | 63.2 | 9 / 35 | 3989 |
| 2 | 3 | 58.0 | 62.5 | 2 / 35 | 3915 |
| 3 | 3 | 58.1 | 59.4 | 5 / 35 | 4135 |
| 4 | 3 | 60.4 | 65.4 | 6 / 35 | 4302 |
| 5 | 3 | 60.0 | 62.5 | 4 / 35 | 4678 |
| 6 | 3 | 60.1 | 64.8 | 4 / 35 | 4301 |
| 7 | 3 | 59.8 | 64.4 | 7 / 35 | 3893 |
| 8 | 1 | 63.1 | 73.0 | 7 / 35 | 4742 |
| 9 | 2 | 61.2 | 69.8 | 5 / 35 | 4294 |
| 10 | 1 | 60.7 | 67.0 | 7 / 35 | 4529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 24% |
| pulsar.PulsarMax 0.8.9 | 39 | 44% |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 59% |
| Noran.BitchingElk 0.054 | 11 | 18% |
| sch.Simone 0.3d | 8 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 83% |
| stelo.PatternRobot 1.0 | 6 | 67% |
| fullsail.SweetTea 1.1 | 4 | 50% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |

Hadur died in 294 of 350 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 71 | 24% | 83 |
| pulsar.PulsarMax 0.8.9 | 70 | 24% | 82 |
| lrem.micro.SpikeSoldier 0.4 | 46 | 16% | 48 |
| com.cohesiva.robocode.ManOwaR 1.0 | 28 | 10% | 40 |
| stelo.PatternRobot 1.0 | 23 | 8% | 26 |
| Noran.BitchingElk 0.054 | 21 | 7% | 23 |
| sch.Simone 0.3d | 17 | 6% | 24 |
| fnc.bandit.Bandit 5.2.0 | 11 | 4% | 16 |
| fullsail.SweetTea 1.1 | 7 | 2% | 8 |

## Melee bench: F03

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 78.2 | 79 / 350 | 2.96 | 14.8% | 39074 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 2.0 | 15.1% | 91 |
| radnor.DoctorBob 1.42 | 2.0 | 15.1% | 89 |
| hadur117.nano.SanaroS02 0.1 | 2.3 | 14.8% | 79 |
| vuen.Cake 2.51 | 3.7 | 13.1% | 72 |
| urdos.URDOS 1.3 | 5.0 | 10.4% | 13 |
| adt.Ar1 2.1 | 6.6 | 7.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 6.8% | 1 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.5% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.6% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 73.3 | 6 / 35 | 3773 |
| 2 | 1 | 64.7 | 85.7 | 10 / 35 | 4061 |
| 3 | 2 | 63.8 | 81.3 | 9 / 35 | 4003 |
| 4 | 4 | 58.9 | 68.6 | 2 / 35 | 3694 |
| 5 | 3 | 61.5 | 70.8 | 9 / 35 | 4283 |
| 6 | 3 | 62.7 | 80.0 | 8 / 35 | 3772 |
| 7 | 2 | 62.3 | 80.3 | 9 / 35 | 3534 |
| 8 | 2 | 61.5 | 75.9 | 9 / 35 | 3899 |
| 9 | 1 | 64.1 | 86.7 | 8 / 35 | 3817 |
| 10 | 2 | 64.0 | 79.4 | 9 / 35 | 4238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 65 | 46% |
| vuen.Cake 2.51 | 59 | 47% |
| kawigi.nano.Lib 1.0 | 47 | 15% |
| urdos.URDOS 1.3 | 14 | 43% |
| adt.Ar1 2.1 | 5 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 50% |
| oa.weak.FlyMk1 0.1 | 1 | 0% |

Hadur died in 272 of 350 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 87 | 32% | 109 |
| kawigi.nano.Lib 1.0 | 74 | 27% | 92 |
| vuen.Cake 2.51 | 44 | 16% | 70 |
| urdos.URDOS 1.3 | 36 | 13% | 39 |
| adt.Ar1 2.1 | 11 | 4% | 14 |
| ghent.ArthurPanzergon 1.0.0 | 8 | 3% | 10 |
| oa.weak.FlyMk1 0.1 | 7 | 3% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 1% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 1% | 2 |

## Melee bench: F04

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 71.6 | 9 / 350 | 3.56 | 14.1% | 45396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 322 |
| hadur117.nano.SanaroS02 0.1 | 2.3 | 14.1% | 9 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.6% | 13 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 4 |
| josago.Jorgito 0.16 | 5.2 | 8.9% | 1 |
| tj.zombie1n 1.0.1 | 6.4 | 7.4% | 0 |
| css.Delitioner 0.11 | 6.4 | 7.5% | 1 |
| rampancy.Durandal 2.1d | 8.0 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.4 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 69.8 | 0 / 35 | 4418 |
| 2 | 2 | 63.4 | 73.7 | 1 / 35 | 4606 |
| 3 | 2 | 63.4 | 71.1 | 1 / 35 | 5043 |
| 4 | 3 | 61.1 | 67.6 | 0 / 35 | 4270 |
| 5 | 3 | 62.2 | 70.5 | 2 / 35 | 4276 |
| 6 | 2 | 64.6 | 77.5 | 2 / 35 | 4849 |
| 7 | 3 | 61.8 | 69.2 | 1 / 35 | 4342 |
| 8 | 2 | 63.4 | 74.6 | 2 / 35 | 4326 |
| 9 | 2 | 62.5 | 70.8 | 0 / 35 | 4508 |
| 10 | 2 | 62.8 | 70.8 | 0 / 35 | 4758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 143 | 1% |
| apc.LeeroyJenkins2 1.0 | 9 | 67% |
| TNT.TNT 0.99.1 | 2 | 50% |
| css.Delitioner 0.11 | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 341 of 350 rounds, at a mean tick of 1153. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 241 | 71% | 243 |
| apc.LeeroyJenkins2 1.0 | 47 | 14% | 53 |
| josago.Jorgito 0.16 | 17 | 5% | 17 |
| TNT.TNT 0.99.1 | 14 | 4% | 15 |
| css.Delitioner 0.11 | 10 | 3% | 10 |
| tj.zombie1n 1.0.1 | 10 | 3% | 10 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |

## Melee bench: F06

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 67.0 | 60 / 350 | 3.97 | 13.0% | 32938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.8% | 95 |
| origin.SleepSiphon 1.7b | 2.1 | 14.4% | 105 |
| hadur117.nano.SanaroS02 0.1 | 3.0 | 13.0% | 60 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.7% | 46 |
| mld.Wisdom 1.0 | 4.9 | 11.1% | 19 |
| gg.Wolverine 2.0 | 6.5 | 8.3% | 7 |
| spinnercat.Omen 1.0 | 7.0 | 8.0% | 8 |
| DBall.NUKE 0.1 | 7.6 | 7.4% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.9 | 5.9% | 6 |
| sample.Fire 1.0 | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 67.9 | 6 / 35 | 3164 |
| 2 | 4 | 56.5 | 61.3 | 4 / 35 | 3004 |
| 3 | 3 | 59.3 | 67.3 | 5 / 35 | 3407 |
| 4 | 3 | 60.7 | 70.5 | 9 / 35 | 3150 |
| 5 | 2 | 61.2 | 70.5 | 9 / 35 | 3533 |
| 6 | 2 | 61.4 | 72.7 | 7 / 35 | 3611 |
| 7 | 3 | 57.3 | 62.5 | 4 / 35 | 3310 |
| 8 | 3 | 58.4 | 66.0 | 7 / 35 | 3360 |
| 9 | 4 | 56.9 | 62.5 | 5 / 35 | 2854 |
| 10 | 3 | 60.0 | 68.3 | 4 / 35 | 3545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 50 | 48% |
| origin.SleepSiphon 1.7b | 38 | 37% |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 55% |
| gg.Wolverine 2.0 | 8 | 88% |
| DBall.NUKE 0.1 | 4 | 75% |
| mld.Wisdom 1.0 | 2 | 0% |
| spinnercat.Omen 1.0 | 1 | 0% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 0% |

Hadur died in 291 of 350 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 84 | 29% | 104 |
| origin.SleepSiphon 1.7b | 67 | 23% | 81 |
| pe.minimelee.SandboxMiniMelee 1.1 | 52 | 18% | 65 |
| mld.Wisdom 1.0 | 46 | 16% | 47 |
| spinnercat.Omen 1.0 | 18 | 6% | 20 |
| gg.Wolverine 2.0 | 11 | 4% | 15 |
| DBall.NUKE 0.1 | 7 | 2% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 1% | 5 |
| sample.Fire 1.0 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.4 | 91 / 350 | 2.85 | 16.1% | 47665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.5 | 17.5% | 94 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.5% | 89 |
| hadur117.nano.SanaroS02 0.1 | 2.7 | 16.1% | 91 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 12.2% | 31 |
| franzor.Lizt 1.3.1 | 4.7 | 11.4% | 43 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.7% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 1 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.6 | 81.3 | 7 / 35 | 4803 |
| 2 | 3 | 67.7 | 81.6 | 12 / 35 | 5063 |
| 3 | 3 | 65.1 | 74.9 | 9 / 35 | 4572 |
| 4 | 3 | 64.6 | 74.9 | 4 / 35 | 4616 |
| 5 | 3 | 65.4 | 78.1 | 8 / 35 | 4459 |
| 6 | 3 | 66.6 | 80.6 | 8 / 35 | 4613 |
| 7 | 3 | 66.2 | 77.8 | 10 / 35 | 4794 |
| 8 | 3 | 65.1 | 76.5 | 8 / 35 | 4472 |
| 9 | 1 | 69.1 | 87.0 | 15 / 35 | 5079 |
| 10 | 2 | 67.5 | 81.3 | 10 / 35 | 5194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 87 | 61% |
| rsalesc.melee.Monk 0.3.6c | 40 | 23% |
| oog.melee.CapuletDroid 1.1 | 31 | 55% |
| franzor.Lizt 1.3.1 | 17 | 47% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 0% |

Hadur died in 259 of 350 rounds, at a mean tick of 1180. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 112 | 43% | 176 |
| rsalesc.melee.Monk 0.3.6c | 82 | 32% | 97 |
| oog.melee.CapuletDroid 1.1 | 42 | 16% | 56 |
| franzor.Lizt 1.3.1 | 14 | 5% | 5 |
| exauge.GateKeeper 1.1.121g | 5 | 2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 6 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 68.3 | 79 / 350 | 3.86 | 13.4% | 32710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.5 | 14.7% | 104 |
| shrub.Vapour v159 | 2.3 | 13.7% | 76 |
| hadur117.nano.SanaroS02 0.1 | 2.5 | 13.4% | 79 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.7% | 35 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.8% | 32 |
| m3thos.Eva00 1.1 | 5.8 | 9.3% | 9 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.2% | 10 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 7.2% | 2 |
| SHAM.WOW 1.4 | 8.7 | 6.9% | 5 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 6.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 65.1 | 7 / 35 | 3101 |
| 2 | 3 | 56.9 | 63.5 | 7 / 35 | 3051 |
| 3 | 2 | 60.0 | 71.7 | 7 / 35 | 3249 |
| 4 | 3 | 58.3 | 66.3 | 9 / 35 | 3184 |
| 5 | 1 | 62.5 | 77.8 | 10 / 35 | 3503 |
| 6 | 2 | 60.9 | 73.0 | 9 / 35 | 3367 |
| 7 | 2 | 62.5 | 76.5 | 11 / 35 | 3644 |
| 8 | 3 | 57.5 | 62.9 | 7 / 35 | 3198 |
| 9 | 4 | 53.9 | 57.5 | 2 / 35 | 3059 |
| 10 | 2 | 59.5 | 68.3 | 10 / 35 | 3354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 54 | 35% |
| shrub.Vapour v159 | 33 | 39% |
| Krabb.sliNk.Garm 0.9u | 24 | 88% |
| com.spp.robocode.MostlyHarmless 010 | 13 | 38% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 91% |
| m3thos.Eva00 1.1 | 11 | 55% |
| qualidafial.MajorDick 1.0.1 | 4 | 75% |
| SHAM.WOW 1.4 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 271 of 350 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 74 | 27% | 98 |
| shrub.Vapour v159 | 58 | 21% | 70 |
| Krabb.sliNk.Garm 0.9u | 28 | 10% | 38 |
| m3thos.Eva00 1.1 | 25 | 9% | 30 |
| jwst.DAD.DarkAndDarker 1.1 | 24 | 9% | 34 |
| com.spp.robocode.MostlyHarmless 010 | 22 | 8% | 31 |
| zyx.nano.BacillusComma 1.0 | 18 | 7% | 21 |
| SHAM.WOW 1.4 | 11 | 4% | 16 |
| qualidafial.MajorDick 1.0.1 | 11 | 4% | 11 |

## Melee bench: F09

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 62.4 | 26 / 350 | 4.39 | 12.0% | 30140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.9% | 185 |
| kc.micro.Figment 1.0 | 2.0 | 15.0% | 77 |
| hadur117.nano.SanaroS02 0.1 | 3.5 | 12.0% | 26 |
| yagami.Tidus 0.11 | 4.2 | 11.0% | 3 |
| pedersen.Grishnakh 1.0 | 4.9 | 10.7% | 28 |
| mc2.enemy.Original 0.9 | 5.6 | 9.9% | 26 |
| dft.Calliope 5.6 | 6.8 | 7.9% | 4 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.1 | 61.3 | 1 / 35 | 2898 |
| 2 | 3 | 57.4 | 63.5 | 3 / 35 | 2922 |
| 3 | 3 | 55.9 | 59.4 | 2 / 35 | 2826 |
| 4 | 3 | 57.5 | 63.2 | 0 / 35 | 3162 |
| 5 | 3 | 60.9 | 74.0 | 4 / 35 | 3081 |
| 6 | 3 | 57.6 | 64.8 | 3 / 35 | 2932 |
| 7 | 4 | 56.4 | 59.7 | 3 / 35 | 2969 |
| 8 | 4 | 54.5 | 53.3 | 3 / 35 | 3043 |
| 9 | 3 | 58.5 | 64.8 | 3 / 35 | 3115 |
| 10 | 4 | 56.7 | 60.0 | 4 / 35 | 3192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 64 | 19% |
| kc.micro.Figment 1.0 | 30 | 7% |
| yagami.Tidus 0.11 | 9 | 89% |
| mc2.enemy.Original 0.9 | 8 | 25% |
| pedersen.Grishnakh 1.0 | 7 | 29% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 324 of 350 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 101 | 31% | 113 |
| kc.micro.Figment 1.0 | 77 | 24% | 81 |
| mc2.enemy.Original 0.9 | 40 | 12% | 41 |
| yagami.Tidus 0.11 | 38 | 12% | 45 |
| pedersen.Grishnakh 1.0 | 37 | 11% | 38 |
| robar.nano.Assertive_Melee 0.2 | 12 | 4% | 12 |
| step.nanoPri 1.0 | 9 | 3% | 9 |
| dft.Calliope 5.6 | 6 | 2% | 7 |
| rdm.Dueler 0.4x | 4 | 1% | 4 |

## Melee bench: F10

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 79.1 | 91 / 350 | 2.88 | 15.4% | 42471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS02 0.1 | 1.5 | 15.4% | 91 |
| DTF.Kludgy 1.2b | 1.6 | 15.4% | 111 |
| ne.Chimera 1.2 | 3.2 | 13.5% | 42 |
| ejb.Polaris 1.0.1 | 3.9 | 12.9% | 52 |
| vStar.RAFzilla 2.15 | 5.1 | 10.7% | 24 |
| tvv.micro.Antares 1.1.1 | 5.7 | 10.2% | 26 |
| sam.Samspin 1.0 | 7.5 | 6.3% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.6% | 0 |
| kurios.DOSexe .9b | 8.4 | 5.6% | 2 |
| donjezza.Muncho 1.0 | 9.8 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 75.2 | 9 / 35 | 3851 |
| 2 | 2 | 63.5 | 80.3 | 7 / 35 | 4150 |
| 3 | 1 | 64.4 | 80.6 | 11 / 35 | 4341 |
| 4 | 1 | 65.5 | 83.5 | 14 / 35 | 4409 |
| 5 | 2 | 61.8 | 74.9 | 7 / 35 | 4033 |
| 6 | 2 | 63.6 | 77.5 | 8 / 35 | 4380 |
| 7 | 1 | 64.2 | 81.0 | 9 / 35 | 4425 |
| 8 | 2 | 64.2 | 81.0 | 8 / 35 | 4373 |
| 9 | 1 | 62.7 | 77.8 | 7 / 35 | 4056 |
| 10 | 1 | 64.3 | 79.4 | 11 / 35 | 4453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 38% |
| ejb.Polaris 1.0.1 | 50 | 68% |
| ne.Chimera 1.2 | 27 | 48% |
| vStar.RAFzilla 2.15 | 19 | 32% |
| tvv.micro.Antares 1.1.1 | 10 | 40% |
| sam.Samspin 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 75% |
| donjezza.Muncho 1.0 | 2 | 50% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 262 of 350 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 94 | 36% | 114 |
| ne.Chimera 1.2 | 65 | 25% | 82 |
| ejb.Polaris 1.0.1 | 37 | 14% | 69 |
| tvv.micro.Antares 1.1.1 | 21 | 8% | 23 |
| vStar.RAFzilla 2.15 | 17 | 6% | 24 |
| sam.Samspin 1.0 | 13 | 5% | 15 |
| kurios.DOSexe .9b | 9 | 3% | 14 |
| donjezza.Muncho 1.0 | 4 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.8 | 60.3 | 35 / 350 | 4.57 | 11.6% | 29955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.3% | 146 |
| cx.mini.Nimrod 0.55 | 2.0 | 13.5% | 54 |
| hadur117.nano.SanaroS02 0.1 | 3.4 | 11.6% | 35 |
| djc.DynaBot 0.1.1 | 3.9 | 11.1% | 27 |
| br2.MobyDickBot 1.6 | 5.6 | 9.7% | 32 |
| rdt199.Warlord 0.73 | 5.9 | 9.4% | 23 |
| uji.YellohFellah 1.0 | 6.6 | 9.0% | 31 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.7% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.6 | 59.0 | 4 / 35 | 3068 |
| 2 | 3 | 57.1 | 62.9 | 2 / 35 | 3226 |
| 3 | 3 | 55.6 | 60.0 | 5 / 35 | 2953 |
| 4 | 3 | 55.4 | 61.9 | 4 / 35 | 2556 |
| 5 | 4 | 56.2 | 62.5 | 1 / 35 | 2899 |
| 6 | 4 | 54.4 | 55.2 | 4 / 35 | 2932 |
| 7 | 3 | 56.6 | 62.9 | 4 / 35 | 3033 |
| 8 | 3 | 58.4 | 65.7 | 5 / 35 | 3169 |
| 9 | 5 | 53.3 | 54.9 | 1 / 35 | 2979 |
| 10 | 3 | 55.1 | 57.8 | 5 / 35 | 3140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 48 | 42% |
| cx.mini.Nimrod 0.55 | 16 | 31% |
| uji.YellohFellah 1.0 | 7 | 29% |
| br2.MobyDickBot 1.6 | 7 | 14% |
| rdt199.Warlord 0.73 | 7 | 86% |
| djc.DynaBot 0.1.1 | 5 | 20% |

Hadur died in 315 of 350 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 111 | 35% | 130 |
| cx.mini.Nimrod 0.55 | 74 | 23% | 79 |
| br2.MobyDickBot 1.6 | 25 | 8% | 27 |
| uji.YellohFellah 1.0 | 24 | 8% | 27 |
| rdt199.Warlord 0.73 | 21 | 7% | 26 |
| KiraNL.Chupacabra 0.4 | 20 | 6% | 20 |
| djc.DynaBot 0.1.1 | 18 | 6% | 19 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 4% | 11 |
| stelo.MirrorNano 1.3 | 10 | 3% | 11 |

## Melee bench: F12

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.7 | 51 / 350 | 3.91 | 13.0% | 29505 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.7 | 14.5% | 99 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.5% | 85 |
| darkcanuck.Leon 1.01 | 2.6 | 13.6% | 70 |
| hadur117.nano.SanaroS02 0.1 | 3.6 | 13.0% | 51 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.7% | 25 |
| jrm.Test0 1.0 | 6.3 | 8.3% | 7 |
| jp.Perpy 16.0 | 7.0 | 7.4% | 4 |
| cs.sheldor.Talon 1.1 | 7.9 | 6.8% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.9% | 9 |
| stuff.Vlad 0.1 | 9.6 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 72.1 | 5 / 35 | 3137 |
| 2 | 2 | 60.2 | 69.8 | 8 / 35 | 3092 |
| 3 | 3 | 59.2 | 68.3 | 7 / 35 | 2895 |
| 4 | 4 | 58.8 | 67.6 | 5 / 35 | 3110 |
| 5 | 3 | 59.3 | 69.5 | 8 / 35 | 2906 |
| 6 | 4 | 58.5 | 67.9 | 2 / 35 | 2977 |
| 7 | 4 | 58.6 | 67.6 | 7 / 35 | 2778 |
| 8 | 5 | 55.0 | 59.7 | 2 / 35 | 2679 |
| 9 | 4 | 59.4 | 69.2 | 6 / 35 | 3123 |
| 10 | 4 | 57.2 | 65.4 | 1 / 35 | 2808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 50 | 22% |
| bts.wiki.RipCurl 0.9b | 43 | 47% |
| darkcanuck.Leon 1.01 | 38 | 26% |
| brainfade.melee.Genghis 0.36 | 10 | 70% |
| jaybot.bots.Oddball 4.0 | 6 | 0% |
| jrm.Test0 1.0 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 0% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 78 | 26% | 90 |
| bts.wiki.RipCurl 0.9b | 74 | 25% | 90 |
| darkcanuck.Leon 1.01 | 58 | 19% | 73 |
| brainfade.melee.Genghis 0.36 | 25 | 8% | 28 |
| jrm.Test0 1.0 | 19 | 6% | 20 |
| jp.Perpy 16.0 | 15 | 5% | 16 |
| jaybot.bots.Oddball 4.0 | 15 | 5% | 15 |
| cs.sheldor.Talon 1.1 | 10 | 3% | 10 |
| stuff.Vlad 0.1 | 6 | 2% | 8 |

## Melee bench: F13

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 69.9 | 35 / 350 | 3.71 | 12.8% | 32133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.5% | 172 |
| ags.Glacier 0.2.11 | 1.8 | 17.0% | 95 |
| hadur117.nano.SanaroS02 0.1 | 3.2 | 12.8% | 35 |
| gh.micro.Gruweltje 0.7 | 4.3 | 11.8% | 16 |
| shinh.Entangled 0.3 | 4.5 | 11.9% | 29 |
| apc.Colossus2 0.17 | 6.1 | 8.5% | 0 |
| stelo.Wang 1.0 | 6.9 | 7.1% | 5 |
| ayk.WallHugger 1.0 | 8.1 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 75.2 | 6 / 35 | 3266 |
| 2 | 3 | 60.9 | 75.6 | 6 / 35 | 2936 |
| 3 | 3 | 58.2 | 68.3 | 2 / 35 | 2981 |
| 4 | 3 | 58.0 | 65.7 | 3 / 35 | 3003 |
| 5 | 3 | 59.6 | 70.5 | 4 / 35 | 3199 |
| 6 | 4 | 58.7 | 64.4 | 2 / 35 | 3624 |
| 7 | 3 | 60.0 | 70.2 | 4 / 35 | 3193 |
| 8 | 3 | 57.9 | 67.0 | 1 / 35 | 2978 |
| 9 | 4 | 59.2 | 67.9 | 1 / 35 | 3327 |
| 10 | 3 | 61.7 | 74.3 | 6 / 35 | 3626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 65 | 34% |
| ags.Glacier 0.2.11 | 48 | 10% |
| shinh.Entangled 0.3 | 17 | 29% |
| gh.micro.Gruweltje 0.7 | 3 | 67% |
| stelo.Wang 1.0 | 3 | 33% |

Hadur died in 316 of 350 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 108 | 34% | 113 |
| mn.Combat 3.25.0 | 89 | 28% | 110 |
| shinh.Entangled 0.3 | 38 | 12% | 43 |
| gh.micro.Gruweltje 0.7 | 36 | 11% | 38 |
| stelo.Wang 1.0 | 24 | 8% | 25 |
| apc.Colossus2 0.17 | 8 | 3% | 8 |
| maribo.FollowFire 1 | 7 | 2% | 7 |
| ayk.WallHugger 1.0 | 6 | 2% | 6 |

## Melee bench: F14

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 75.7 | 77 / 350 | 3.19 | 14.4% | 35506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 18.0% | 161 |
| hadur117.nano.SanaroS02 0.1 | 2.0 | 14.4% | 77 |
| catcat20.shape.Theta 0.018 | 3.1 | 12.3% | 61 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.7 | 10.4% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 10.3% | 14 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 10.0% | 6 |
| sanyi.mikrobi.Roberto 1.0 | 6.2 | 9.7% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 7.9% | 16 |
| pa.Improved 1.0 | 9.0 | 5.3% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 76.5 | 6 / 35 | 3865 |
| 2 | 2 | 60.1 | 72.4 | 2 / 35 | 3470 |
| 3 | 2 | 61.2 | 70.8 | 7 / 35 | 3762 |
| 4 | 2 | 63.1 | 75.9 | 9 / 35 | 3706 |
| 5 | 2 | 64.3 | 84.1 | 9 / 35 | 3304 |
| 6 | 2 | 62.6 | 75.6 | 13 / 35 | 3249 |
| 7 | 2 | 62.9 | 78.7 | 8 / 35 | 3520 |
| 8 | 2 | 62.8 | 74.3 | 10 / 35 | 3791 |
| 9 | 2 | 61.4 | 74.6 | 6 / 35 | 3425 |
| 10 | 2 | 61.2 | 74.0 | 7 / 35 | 3414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 101 | 32% |
| catcat20.shape.Theta 0.018 | 41 | 46% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 69% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 92% |
| Lo_Ian.Gandalf_V4 4.0 | 9 | 22% |
| sanyi.mikrobi.Roberto 1.0 | 5 | 20% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 273 of 350 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 133 | 49% | 167 |
| catcat20.shape.Theta 0.018 | 42 | 15% | 60 |
| dmh.robocode.robot.RedDwarf 0.4 | 25 | 9% | 27 |
| sanyi.mikrobi.Roberto 1.0 | 24 | 9% | 29 |
| co.edu.usb.rc.LidisTron 1.0 | 18 | 7% | 22 |
| Lo_Ian.Gandalf_V4 4.0 | 17 | 6% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 4% | 20 |
| pa.Improved 1.0 | 1 | 0% | 2 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |

## Melee bench: F15

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 62.8 | 39 / 350 | 4.35 | 12.6% | 37102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.1 | 15.3% | 92 |
| emp.Yngwie 1.11 | 2.7 | 13.6% | 100 |
| mld.DustBunny 3.8 | 2.8 | 13.5% | 49 |
| hadur117.nano.SanaroS02 0.1 | 3.8 | 12.6% | 39 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.9% | 21 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.4% | 40 |
| Grystrion.TrackerWO 1.0 | 7.3 | 7.1% | 2 |
| lambdaxy.TBot 0.1 | 7.8 | 6.9% | 0 |
| divineomega.TrialBot 0.003 | 8.9 | 5.6% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 70.8 | 4 / 35 | 4017 |
| 2 | 4 | 58.5 | 64.8 | 2 / 35 | 3729 |
| 3 | 4 | 57.8 | 62.5 | 4 / 35 | 3560 |
| 4 | 3 | 59.8 | 67.3 | 2 / 35 | 3956 |
| 5 | 4 | 56.3 | 58.7 | 6 / 35 | 3278 |
| 6 | 4 | 57.2 | 61.0 | 2 / 35 | 3698 |
| 7 | 4 | 58.1 | 61.9 | 3 / 35 | 3919 |
| 8 | 4 | 56.5 | 59.0 | 5 / 35 | 3395 |
| 9 | 4 | 58.5 | 60.6 | 5 / 35 | 3864 |
| 10 | 5 | 58.7 | 61.3 | 6 / 35 | 3686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 31 | 23% |
| emp.Yngwie 1.11 | 21 | 48% |
| kawigi.robot.Girl 1.2 | 15 | 73% |
| mld.DustBunny 3.8 | 15 | 27% |
| cb.nano.Insomnia 1.0 | 10 | 60% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 74 | 24% | 82 |
| kawigi.micro.Shiz 1.1 | 66 | 21% | 71 |
| emp.Yngwie 1.11 | 65 | 21% | 80 |
| cb.nano.Insomnia 1.0 | 43 | 14% | 41 |
| kawigi.robot.Girl 1.2 | 27 | 9% | 36 |
| lambdaxy.TBot 0.1 | 12 | 4% | 14 |
| divineomega.TrialBot 0.003 | 10 | 3% | 10 |
| Grystrion.TrackerWO 1.0 | 10 | 3% | 10 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 5 | 2% | 5 |

## Melee bench: F16

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 65.5 | 32 / 350 | 4.11 | 13.4% | 41273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.6% | 191 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 15.4% | 31 |
| hadur117.nano.SanaroS02 0.1 | 3.1 | 13.4% | 32 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.9% | 57 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.3% | 7 |
| tvv.nano.Polaris 1.2 | 5.6 | 9.0% | 18 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 7.8% | 7 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.6% | 7 |
| repositorio.NanoStep 1.0 | 8.8 | 5.5% | 1 |
| asd.Cthulhu 1.3 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.6 | 62.9 | 1 / 35 | 3562 |
| 2 | 3 | 61.1 | 66.7 | 4 / 35 | 4259 |
| 3 | 3 | 62.3 | 70.2 | 3 / 35 | 4421 |
| 4 | 3 | 60.9 | 67.3 | 5 / 35 | 4146 |
| 5 | 3 | 62.6 | 69.5 | 4 / 35 | 4685 |
| 6 | 3 | 60.9 | 68.9 | 3 / 35 | 4257 |
| 7 | 3 | 59.3 | 61.6 | 5 / 35 | 4155 |
| 8 | 3 | 60.9 | 67.9 | 3 / 35 | 4128 |
| 9 | 3 | 60.9 | 65.7 | 4 / 35 | 4395 |
| 10 | 4 | 54.1 | 54.3 | 0 / 35 | 3265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 75 | 7% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 65% |
| techdude.forest.FlamingForest 1.1 | 12 | 25% |
| tvv.nano.Polaris 1.2 | 11 | 64% |
| bvh.fnr.Fenrir 0.36l | 4 | 75% |
| divineomega.DivineBot 1.9.4.5 | 3 | 67% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 319 of 350 rounds, at a mean tick of 1212. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 146 | 46% | 151 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 72 | 23% | 84 |
| bvh.fnr.Fenrir 0.36l | 33 | 10% | 34 |
| techdude.forest.FlamingForest 1.1 | 29 | 9% | 32 |
| tvv.nano.Polaris 1.2 | 13 | 4% | 18 |
| stelo.IntrinsicVolatility 1.4 | 13 | 4% | 14 |
| divineomega.DivineBot 1.9.4.5 | 7 | 2% | 10 |
| asd.Cthulhu 1.3 | 4 | 1% | 4 |
| repositorio.NanoStep 1.0 | 1 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 64.7 | 53 / 350 | 4.18 | 13.0% | 37457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 1.6 | 14.3% | 93 |
| et.Predator 1.8 | 1.9 | 14.1% | 74 |
| hadur117.nano.SanaroS02 0.1 | 3.4 | 13.0% | 53 |
| cx.BlestPain 1.41 | 3.9 | 12.6% | 60 |
| nic.Nicator 2.4 | 4.9 | 11.5% | 29 |
| ahf.NanoAndrew .4 | 5.4 | 11.3% | 34 |
| maribo.melee.BMV 0.1 | 6.9 | 9.2% | 7 |
| tex.Longbot 0.4 | 8.4 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.6 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.0 | 55.6 | 3 / 35 | 3576 |
| 2 | 6 | 56.1 | 58.1 | 2 / 35 | 3570 |
| 3 | 3 | 59.3 | 64.4 | 9 / 35 | 3461 |
| 4 | 3 | 62.1 | 68.9 | 10 / 35 | 4045 |
| 5 | 4 | 57.0 | 61.6 | 4 / 35 | 3313 |
| 6 | 3 | 59.9 | 66.0 | 4 / 35 | 3777 |
| 7 | 2 | 61.5 | 67.6 | 5 / 35 | 4475 |
| 8 | 2 | 61.0 | 71.7 | 3 / 35 | 3700 |
| 9 | 3 | 59.5 | 65.1 | 6 / 35 | 3904 |
| 10 | 3 | 60.4 | 67.9 | 7 / 35 | 3636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 42 | 10% |
| oog.melee.Mercutio 1.0 | 39 | 46% |
| cx.BlestPain 1.41 | 21 | 86% |
| nic.Nicator 2.4 | 16 | 50% |
| ahf.NanoAndrew .4 | 6 | 33% |
| maribo.melee.BMV 0.1 | 4 | 75% |

Hadur died in 298 of 350 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 91 | 31% | 96 |
| oog.melee.Mercutio 1.0 | 47 | 16% | 64 |
| ahf.NanoAndrew .4 | 47 | 16% | 48 |
| nic.Nicator 2.4 | 43 | 14% | 50 |
| cx.BlestPain 1.41 | 34 | 11% | 51 |
| maribo.melee.BMV 0.1 | 23 | 8% | 26 |
| tex.Longbot 0.4 | 6 | 2% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 5 | 2% | 7 |
| goblin.Bender 2.4 | 2 | 1% | 2 |

## Melee bench: F18

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 68.8 | 80 / 350 | 3.81 | 13.8% | 36151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS02 0.1 | 1.6 | 13.8% | 80 |
| morbid.MorbidPriest 1.0 | 1.8 | 14.2% | 89 |
| agd.Mooserwirt2 2.7 | 3.4 | 12.0% | 61 |
| uji.DBH 1.1 | 3.7 | 11.7% | 40 |
| ratosh.Nobo 0.21 | 5.4 | 10.7% | 19 |
| spinnercat.Robovirus 2.718 | 5.4 | 10.1% | 12 |
| sigterm.Sigterm 1.0 | 6.9 | 9.2% | 29 |
| kawigi.mini.Fhqwhgads 1.1 | 7.9 | 7.6% | 14 |
| stelo.WangRobot 1.0 | 9.1 | 5.6% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.4 | 70.2 | 9 / 35 | 3487 |
| 2 | 2 | 59.5 | 68.3 | 7 / 35 | 3451 |
| 3 | 1 | 62.2 | 75.2 | 10 / 35 | 3612 |
| 4 | 1 | 60.1 | 68.9 | 6 / 35 | 3804 |
| 5 | 1 | 63.2 | 75.6 | 11 / 35 | 4128 |
| 6 | 2 | 58.5 | 63.2 | 8 / 35 | 3647 |
| 7 | 2 | 59.3 | 66.7 | 11 / 35 | 3319 |
| 8 | 2 | 59.4 | 66.3 | 7 / 35 | 3659 |
| 9 | 2 | 58.6 | 67.3 | 6 / 35 | 3413 |
| 10 | 2 | 59.1 | 66.3 | 5 / 35 | 3631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 51 | 55% |
| agd.Mooserwirt2 2.7 | 22 | 41% |
| uji.DBH 1.1 | 22 | 64% |
| spinnercat.Robovirus 2.718 | 18 | 83% |
| sigterm.Sigterm 1.0 | 13 | 54% |
| ratosh.Nobo 0.21 | 7 | 43% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 29% |
| stelo.WangRobot 1.0 | 4 | 25% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 272 of 350 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 69 | 25% | 96 |
| agd.Mooserwirt2 2.7 | 44 | 16% | 54 |
| ratosh.Nobo 0.21 | 41 | 15% | 45 |
| uji.DBH 1.1 | 36 | 13% | 47 |
| sigterm.Sigterm 1.0 | 23 | 8% | 30 |
| spinnercat.Robovirus 2.718 | 19 | 7% | 29 |
| kawigi.mini.Fhqwhgads 1.1 | 18 | 7% | 23 |
| stelo.WangRobot 1.0 | 13 | 5% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 3% | 11 |

## Melee bench: F19

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.5 | 81 / 350 | 2.93 | 15.6% | 42071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.2 | 16.5% | 113 |
| mld.Infinity 2.2 | 2.1 | 16.2% | 117 |
| hadur117.nano.SanaroS02 0.1 | 2.7 | 15.6% | 81 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.4% | 14 |
| erdnis.Rover 0.3 | 4.9 | 10.7% | 9 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.3% | 4 |
| pac.ABC 2.1 | 7.3 | 7.3% | 10 |
| mbh.Mbh 0.1 | 7.9 | 6.9% | 0 |
| pbg.R2D2 1.0 | 8.5 | 6.1% | 2 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 81.0 | 8 / 35 | 4187 |
| 2 | 3 | 65.2 | 78.1 | 8 / 35 | 4280 |
| 3 | 2 | 65.8 | 81.9 | 9 / 35 | 4329 |
| 4 | 2 | 65.5 | 80.3 | 8 / 35 | 4488 |
| 5 | 3 | 62.4 | 71.7 | 4 / 35 | 4053 |
| 6 | 3 | 65.6 | 79.7 | 11 / 35 | 4122 |
| 7 | 3 | 66.2 | 81.6 | 9 / 35 | 4284 |
| 8 | 3 | 63.7 | 78.1 | 6 / 35 | 3854 |
| 9 | 3 | 64.6 | 76.5 | 10 / 35 | 4184 |
| 10 | 3 | 64.3 | 76.5 | 8 / 35 | 4290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 106 | 52% |
| davidalves.net.DuelistMiniMelee 1.2 | 70 | 14% |
| krillr.mini.JointStrike 2.0.0 | 13 | 69% |
| erdnis.Rover 0.3 | 8 | 50% |
| pac.ABC 2.1 | 6 | 33% |
| patson.PatsonTestBot 1.0 | 1 | 100% |

Hadur died in 271 of 350 rounds, at a mean tick of 1081. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 119 | 44% | 175 |
| mld.Infinity 2.2 | 75 | 28% | 41 |
| erdnis.Rover 0.3 | 29 | 11% | 44 |
| krillr.mini.JointStrike 2.0.0 | 18 | 7% | 31 |
| pac.ABC 2.1 | 12 | 4% | 19 |
| patson.PatsonTestBot 1.0 | 8 | 3% | 19 |
| pbg.R2D2 1.0 | 6 | 2% | 13 |
| mbh.Mbh 0.1 | 4 | 1% | 5 |

## Melee bench: F20

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 66.7 | 54 / 350 | 4.00 | 13.3% | 36996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.7% | 160 |
| hadur117.nano.SanaroS02 0.1 | 2.2 | 13.3% | 54 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.1% | 24 |
| fwb.Nine 1.0.1 | 4.1 | 11.2% | 42 |
| catcat20.Rabbit 0.001 | 4.9 | 10.4% | 38 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 9.2% | 11 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.8% | 9 |
| bayen.nut.Squirrel 1.615 | 7.6 | 7.8% | 12 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 70.2 | 5 / 35 | 3868 |
| 2 | 2 | 60.6 | 71.1 | 9 / 35 | 3529 |
| 3 | 3 | 56.3 | 59.7 | 2 / 35 | 3596 |
| 4 | 2 | 60.1 | 67.6 | 4 / 35 | 4037 |
| 5 | 2 | 60.1 | 68.6 | 6 / 35 | 3642 |
| 6 | 2 | 58.9 | 64.4 | 5 / 35 | 3794 |
| 7 | 2 | 60.3 | 68.6 | 8 / 35 | 3497 |
| 8 | 2 | 60.3 | 68.6 | 5 / 35 | 3665 |
| 9 | 2 | 57.7 | 62.2 | 3 / 35 | 3710 |
| 10 | 3 | 59.4 | 66.0 | 7 / 35 | 3658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 69 | 32% |
| fwb.Nine 1.0.1 | 16 | 50% |
| nz.jdc.nano.GridFu 1.0 | 13 | 46% |
| catcat20.Rabbit 0.001 | 9 | 67% |
| m3thos.mini.Eva01 0.5.5 | 6 | 67% |
| djdjdj.NanoSkunk10 1.0 | 5 | 80% |
| bayen.nut.Squirrel 1.615 | 4 | 100% |

Hadur died in 296 of 350 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 136 | 46% | 154 |
| nz.jdc.nano.GridFu 1.0 | 43 | 15% | 48 |
| fwb.Nine 1.0.1 | 42 | 14% | 40 |
| bayen.nut.Squirrel 1.615 | 25 | 8% | 30 |
| djdjdj.NanoSkunk10 1.0 | 20 | 7% | 28 |
| catcat20.Rabbit 0.001 | 15 | 5% | 25 |
| m3thos.mini.Eva01 0.5.5 | 9 | 3% | 16 |
| ntc.ControlledChaos 1.1.4 | 5 | 2% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% | 2 |

## Melee bench: F21

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.4 | 127 / 350 | 2.86 | 16.5% | 46106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.2 | 17.7% | 159 |
| hadur117.nano.SanaroS02 0.1 | 1.9 | 16.5% | 127 |
| dummy.mini.Scimitar 1.01 | 2.9 | 14.9% | 33 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 13 |
| eld.Hmm 1.0 | 5.4 | 8.5% | 12 |
| oa.weak.BotherBot 0.1 | 5.6 | 8.7% | 5 |
| fire219.CatBot 1.0 | 7.3 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.1 | 5.9% | 2 |
| PSW.Relentless 0.1 | 8.7 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 76.8 | 14 / 35 | 4514 |
| 2 | 2 | 65.2 | 76.5 | 13 / 35 | 4493 |
| 3 | 2 | 65.5 | 78.1 | 13 / 35 | 4564 |
| 4 | 1 | 66.4 | 80.0 | 17 / 35 | 4788 |
| 5 | 3 | 65.3 | 79.4 | 10 / 35 | 4674 |
| 6 | 2 | 64.6 | 77.1 | 7 / 35 | 4297 |
| 7 | 2 | 67.1 | 83.8 | 12 / 35 | 4886 |
| 8 | 2 | 66.7 | 82.9 | 16 / 35 | 4632 |
| 9 | 1 | 66.9 | 83.8 | 14 / 35 | 4704 |
| 10 | 2 | 64.6 | 75.2 | 11 / 35 | 4554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 125 | 61% |
| dummy.mini.Scimitar 1.01 | 41 | 78% |
| eld.Hmm 1.0 | 13 | 69% |
| cf.RiO.RiOx 4.2.1 | 10 | 70% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 223 of 350 rounds, at a mean tick of 1047. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 94 | 42% | 140 |
| dummy.mini.Scimitar 1.01 | 51 | 23% | 96 |
| cf.RiO.RiOx 4.2.1 | 43 | 19% | 53 |
| eld.Hmm 1.0 | 13 | 6% | 33 |
| oa.weak.BotherBot 0.1 | 6 | 3% | 11 |
| fire219.CatBot 1.0 | 6 | 3% | 7 |
| el.JumpShoot 0.2 | 5 | 2% | 5 |
| PSW.Relentless 0.1 | 4 | 2% | 4 |
| arthord.MannyPacquiao Beta | 1 | 0% | 1 |

## Melee bench: F23

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.7 | 88 / 350 | 2.74 | 15.8% | 38857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 19.0% | 166 |
| hadur117.nano.SanaroS02 0.1 | 2.1 | 15.8% | 88 |
| cre.Karolos 0.32 | 2.9 | 14.4% | 51 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.8% | 17 |
| stelo.RamTrackSurfer 1.2 | 5.9 | 9.5% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.9% | 1 |
| sample.Walls 1.0 | 6.4 | 8.6% | 11 |
| cw.megas.Blade 0.8 | 7.2 | 8.4% | 3 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 87.0 | 11 / 35 | 3722 |
| 2 | 2 | 64.7 | 79.7 | 10 / 35 | 3772 |
| 3 | 3 | 64.7 | 79.4 | 7 / 35 | 3778 |
| 4 | 2 | 65.7 | 79.7 | 10 / 35 | 4282 |
| 5 | 2 | 66.0 | 82.5 | 11 / 35 | 3873 |
| 6 | 2 | 66.6 | 82.9 | 6 / 35 | 4243 |
| 7 | 2 | 64.9 | 81.3 | 8 / 35 | 3606 |
| 8 | 2 | 65.6 | 81.0 | 9 / 35 | 3935 |
| 9 | 2 | 62.9 | 75.9 | 7 / 35 | 3340 |
| 10 | 2 | 65.3 | 77.8 | 9 / 35 | 4306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 117 | 35% |
| cre.Karolos 0.32 | 39 | 44% |
| sample.Walls 1.0 | 24 | 67% |
| stelo.AreaTargetingBot 1.1 | 14 | 50% |
| stelo.RamTrackSurfer 1.2 | 11 | 45% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 1 | 0% |

Hadur died in 263 of 350 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 137 | 52% | 181 |
| cre.Karolos 0.32 | 60 | 23% | 74 |
| stelo.AreaTargetingBot 1.1 | 26 | 10% | 31 |
| stelo.RamTrackSurfer 1.2 | 14 | 5% | 29 |
| sample.Walls 1.0 | 14 | 5% | 18 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 3% | 10 |
| cw.megas.Blade 0.8 | 4 | 2% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.9 | 55.8 | 46 / 350 | 4.98 | 10.8% | 27716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.4 | 14.9% | 85 |
| davidalves.Phoenix 0.54 | 2.6 | 13.7% | 82 |
| florent.XSeries.X2 0.12 | 2.7 | 13.4% | 66 |
| pedersen.Ugluk 1.1.1 | 3.7 | 12.2% | 43 |
| hadur117.nano.SanaroS02 0.1 | 4.9 | 10.8% | 46 |
| oog.melee.Corsair 1.0 | 6.1 | 9.3% | 11 |
| stelo.SoJNanoMelee 1.1 | 6.6 | 8.8% | 12 |
| lunchie.Lunchbox 0.93 | 8.1 | 6.9% | 4 |
| as.FrankTheTank 1.3 | 9.0 | 5.3% | 1 |
| evd.X1 0.01 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 61.3 | 6 / 35 | 3137 |
| 2 | 3 | 58.6 | 66.0 | 8 / 35 | 2808 |
| 3 | 7 | 49.2 | 47.6 | 2 / 35 | 2316 |
| 4 | 6 | 53.0 | 51.7 | 4 / 35 | 2827 |
| 5 | 5 | 54.8 | 57.5 | 5 / 35 | 2847 |
| 6 | 4 | 55.9 | 61.9 | 7 / 35 | 2582 |
| 7 | 5 | 52.1 | 51.7 | 3 / 35 | 2912 |
| 8 | 5 | 53.7 | 54.9 | 4 / 35 | 2577 |
| 9 | 5 | 54.1 | 56.2 | 5 / 35 | 2941 |
| 10 | 5 | 50.7 | 48.9 | 2 / 35 | 2769 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 24 | 67% |
| davidalves.Phoenix 0.54 | 22 | 50% |
| pedersen.Ugluk 1.1.1 | 14 | 64% |
| florent.XSeries.X2 0.12 | 13 | 62% |
| stelo.SoJNanoMelee 1.1 | 3 | 33% |
| oog.melee.Corsair 1.0 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 0% |

Hadur died in 304 of 350 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 69 | 23% | 88 |
| florent.XSeries.X2 0.12 | 68 | 22% | 77 |
| davidalves.Phoenix 0.54 | 55 | 18% | 60 |
| pedersen.Ugluk 1.1.1 | 45 | 15% | 51 |
| oog.melee.Corsair 1.0 | 20 | 7% | 23 |
| stelo.SoJNanoMelee 1.1 | 19 | 6% | 21 |
| lunchie.Lunchbox 0.93 | 12 | 4% | 14 |
| as.FrankTheTank 1.3 | 8 | 3% | 8 |
| evd.X1 0.01 | 8 | 3% | 8 |

## Melee bench: F25

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 66.7 | 56 / 350 | 4.00 | 13.0% | 29794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 14.3% | 81 |
| voidious.micro.BlitzBat 1.05 | 2.1 | 13.9% | 67 |
| jdw.Hurricane 1.4 | 3.0 | 12.8% | 61 |
| hadur117.nano.SanaroS02 0.1 | 3.2 | 13.0% | 56 |
| gre.svman4.Morfeas 1.4.1 | 4.8 | 10.8% | 36 |
| ds.Oo 2.2 | 6.0 | 9.4% | 22 |
| gjr.Cephalosporin 0.1 | 7.3 | 8.1% | 16 |
| awesomeness.Elite 1.0 | 7.7 | 7.1% | 9 |
| adt.Ar2 1.1 | 8.9 | 6.3% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 73.0 | 9 / 35 | 3241 |
| 2 | 3 | 60.4 | 70.2 | 7 / 35 | 3346 |
| 3 | 5 | 54.3 | 58.1 | 3 / 35 | 2644 |
| 4 | 3 | 59.6 | 68.9 | 4 / 35 | 3192 |
| 5 | 1 | 62.2 | 75.6 | 8 / 35 | 3367 |
| 6 | 4 | 56.6 | 61.9 | 5 / 35 | 2620 |
| 7 | 4 | 57.1 | 64.1 | 5 / 35 | 2760 |
| 8 | 3 | 58.9 | 67.3 | 5 / 35 | 3091 |
| 9 | 3 | 59.0 | 70.2 | 4 / 35 | 2751 |
| 10 | 4 | 55.5 | 57.8 | 6 / 35 | 2782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 31% |
| voidious.mini.BrokenSword 2.0.3 | 31 | 23% |
| jdw.Hurricane 1.4 | 26 | 77% |
| gre.svman4.Morfeas 1.4.1 | 13 | 38% |
| ds.Oo 2.2 | 8 | 75% |
| gjr.Cephalosporin 0.1 | 4 | 0% |
| adt.Ar2 1.1 | 4 | 75% |
| awesomeness.Elite 1.0 | 3 | 100% |

Hadur died in 295 of 350 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 75 | 25% | 82 |
| voidious.micro.BlitzBat 1.05 | 68 | 23% | 83 |
| jdw.Hurricane 1.4 | 42 | 14% | 58 |
| gre.svman4.Morfeas 1.4.1 | 41 | 14% | 44 |
| ds.Oo 2.2 | 22 | 7% | 29 |
| awesomeness.Elite 1.0 | 17 | 6% | 21 |
| adt.Ar2 1.1 | 13 | 4% | 15 |
| gjr.Cephalosporin 0.1 | 13 | 4% | 14 |
| amk.ChumbaMini 0.2 | 4 | 1% | 4 |

## Melee bench: F26

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 70.7 | 41 / 350 | 3.63 | 13.7% | 40703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.4% | 133 |
| hadur117.nano.SanaroS02 0.1 | 2.2 | 13.7% | 41 |
| shu.nitro.LENIN .T34 | 3.4 | 12.8% | 71 |
| lrem.Spectre 0.4.4 | 4.3 | 12.2% | 49 |
| js.PinBall 1.6 | 4.9 | 11.4% | 25 |
| gh.mini.GrubbmOne 1.0 | 5.6 | 10.6% | 12 |
| jaybot.adv.bots.JayBot 2.0 | 6.6 | 9.5% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.6% | 5 |
| sample.SpinBot 1.0 | 8.9 | 5.4% | 3 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 75.2 | 4 / 35 | 4446 |
| 2 | 2 | 61.4 | 71.1 | 4 / 35 | 4074 |
| 3 | 2 | 62.2 | 74.9 | 6 / 35 | 4219 |
| 4 | 3 | 60.5 | 66.7 | 4 / 35 | 4251 |
| 5 | 2 | 59.4 | 66.3 | 2 / 35 | 4010 |
| 6 | 2 | 61.1 | 71.4 | 3 / 35 | 4057 |
| 7 | 2 | 60.6 | 69.2 | 5 / 35 | 3757 |
| 8 | 2 | 61.0 | 70.8 | 4 / 35 | 3963 |
| 9 | 2 | 61.2 | 73.0 | 2 / 35 | 3810 |
| 10 | 3 | 61.7 | 68.6 | 7 / 35 | 4116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 56 | 21% |
| shu.nitro.LENIN .T34 | 37 | 24% |
| lrem.Spectre 0.4.4 | 30 | 40% |
| js.PinBall 1.6 | 10 | 20% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 29% |
| gh.mini.GrubbmOne 1.0 | 6 | 33% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 309 of 350 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 103 | 33% | 116 |
| shu.nitro.LENIN .T34 | 59 | 19% | 69 |
| lrem.Spectre 0.4.4 | 40 | 13% | 47 |
| js.PinBall 1.6 | 39 | 13% | 42 |
| gh.mini.GrubbmOne 1.0 | 33 | 11% | 37 |
| jaybot.adv.bots.JayBot 2.0 | 20 | 6% | 22 |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 3% | 9 |
| sample.SpinBot 1.0 | 7 | 2% | 8 |

## Melee bench: F27

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 65.4 | 62 / 350 | 4.11 | 12.9% | 33299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.5 | 15.9% | 154 |
| hadur117.nano.SanaroS02 0.1 | 2.9 | 12.9% | 62 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 11.9% | 39 |
| wee.Gem 1.8.4 | 3.7 | 11.7% | 57 |
| EH.Eagle 1.0.6 | 4.6 | 10.8% | 18 |
| techdude.kombat.FlamingKombat 1.5 | 5.9 | 9.5% | 13 |
| throxbot.ThroxBot 0.1 | 6.9 | 8.6% | 3 |
| joe.ADinosaur 1.0 | 7.2 | 8.3% | 3 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.4% | 2 |
| cs.Grudge 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 68.3 | 4 / 35 | 2804 |
| 2 | 2 | 59.9 | 72.4 | 7 / 35 | 2878 |
| 3 | 1 | 61.9 | 77.8 | 10 / 35 | 3254 |
| 4 | 2 | 62.7 | 79.0 | 9 / 35 | 3513 |
| 5 | 5 | 54.0 | 42.5 | 6 / 35 | 4267 |
| 6 | 6 | 51.2 | 39.7 | 3 / 35 | 4081 |
| 7 | 2 | 60.4 | 72.4 | 10 / 35 | 3238 |
| 8 | 3 | 58.5 | 67.0 | 4 / 35 | 3035 |
| 9 | 3 | 57.9 | 66.0 | 4 / 35 | 2895 |
| 10 | 2 | 59.6 | 68.9 | 5 / 35 | 3334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 51 | 51% |
| wee.Gem 1.8.4 | 22 | 36% |
| EH.Eagle 1.0.6 | 19 | 58% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 24% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 64% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| joe.ADinosaur 1.0 | 1 | 0% |

Hadur died in 290 of 350 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 87 | 30% | 112 |
| sheldor.melee.nano.TestMelee 0.1 | 50 | 17% | 54 |
| wee.Gem 1.8.4 | 34 | 12% | 41 |
| EH.Eagle 1.0.6 | 30 | 10% | 42 |
| throxbot.ThroxBot 0.1 | 24 | 8% | 25 |
| joe.ADinosaur 1.0 | 23 | 8% | 25 |
| techdude.kombat.FlamingKombat 1.5 | 19 | 7% | 25 |
| caimano.Furia_Ceca 0.22 | 11 | 4% | 15 |
| cs.Grudge 1.0 | 11 | 4% | 11 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 78.2 | 117 / 350 | 2.96 | 15.6% | 36497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS02 0.1 | 1.4 | 15.6% | 117 |
| kid.test.NightFox .2 | 1.6 | 16.2% | 109 |
| uji.Antique 1.0 | 3.2 | 12.8% | 62 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.8% | 32 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.3% | 12 |
| ahr.ice.Ice 1.0.2 | 6.4 | 8.0% | 8 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.0% | 6 |
| matt.advanced.Katana 1.0 | 8.0 | 6.9% | 4 |
| stelo.Lifestealer 1.0 | 9.3 | 5.7% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 79.4 | 12 / 35 | 3771 |
| 2 | 2 | 61.5 | 71.1 | 10 / 35 | 3658 |
| 3 | 1 | 63.5 | 81.0 | 14 / 35 | 3219 |
| 4 | 2 | 63.1 | 75.9 | 11 / 35 | 3612 |
| 5 | 1 | 63.2 | 78.7 | 11 / 35 | 3600 |
| 6 | 1 | 64.4 | 80.3 | 15 / 35 | 3452 |
| 7 | 1 | 65.3 | 82.9 | 14 / 35 | 3901 |
| 8 | 1 | 64.6 | 80.6 | 12 / 35 | 3976 |
| 9 | 2 | 60.9 | 70.8 | 7 / 35 | 3645 |
| 10 | 1 | 64.3 | 81.6 | 11 / 35 | 3663 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 116 | 60% |
| uji.Antique 1.0 | 47 | 57% |
| qohnil.blot.BlotBot 3.61 | 18 | 50% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| amk.ChumbaWumba 0.3 | 6 | 50% |
| ahr.ice.Ice 1.0.2 | 3 | 33% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 234 of 350 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 87 | 37% | 130 |
| uji.Antique 1.0 | 39 | 17% | 73 |
| pfvicm.Sobieski 7.2.3b | 38 | 16% | 43 |
| qohnil.blot.BlotBot 3.61 | 26 | 11% | 45 |
| amk.ChumbaWumba 0.3 | 26 | 11% | 28 |
| ahr.ice.Ice 1.0.2 | 7 | 3% | 13 |
| matt.advanced.Katana 1.0 | 5 | 2% | 9 |
| stelo.PianistNano 1.2 | 5 | 2% | 7 |
| stelo.Lifestealer 1.0 | 1 | 0% | 1 |

## Melee bench: F29

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 62.1 | 43 / 350 | 4.41 | 12.6% | 34400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.5 | 15.6% | 118 |
| deewiant.Anomaly 0.2 | 1.6 | 15.5% | 95 |
| myl.micro.Troodon 1.10 | 3.4 | 13.1% | 32 |
| hadur117.nano.SanaroS02 0.1 | 3.9 | 12.6% | 43 |
| jok.PheonixM 0.1.2 | 4.6 | 11.5% | 23 |
| DBall.Anarchy 0.1 | 6.1 | 8.6% | 25 |
| ph.melee.ArcherME 0.3 | 6.9 | 8.0% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.9% | 1 |
| ap.Frederick 1.1 | 9.1 | 4.9% | 11 |
| jangs.ns51 1.0 | 9.6 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.2 | 57.5 | 5 / 35 | 2958 |
| 2 | 3 | 59.1 | 63.8 | 4 / 35 | 3088 |
| 3 | 4 | 57.8 | 61.3 | 2 / 35 | 3210 |
| 4 | 3 | 60.4 | 65.1 | 5 / 35 | 3957 |
| 5 | 4 | 57.9 | 61.3 | 3 / 35 | 3470 |
| 6 | 4 | 58.8 | 61.3 | 4 / 35 | 3655 |
| 7 | 5 | 58.9 | 61.3 | 2 / 35 | 3637 |
| 8 | 5 | 57.1 | 59.4 | 6 / 35 | 3026 |
| 9 | 4 | 61.1 | 68.6 | 6 / 35 | 3893 |
| 10 | 3 | 58.4 | 61.9 | 6 / 35 | 3506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 30% |
| zyx.mega.YersiniaPestis 3.1 | 34 | 50% |
| myl.micro.Troodon 1.10 | 16 | 44% |
| jok.PheonixM 0.1.2 | 8 | 25% |
| DBall.Anarchy 0.1 | 6 | 33% |
| ap.Frederick 1.1 | 5 | 20% |

Hadur died in 307 of 350 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 92 | 30% | 107 |
| zyx.mega.YersiniaPestis 3.1 | 70 | 23% | 87 |
| myl.micro.Troodon 1.10 | 55 | 18% | 64 |
| jok.PheonixM 0.1.2 | 48 | 16% | 51 |
| ph.melee.ArcherME 0.3 | 14 | 5% | 14 |
| fullsail.TimbotNoPrediction 1.0 | 11 | 4% | 11 |
| DBall.Anarchy 0.1 | 9 | 3% | 12 |
| ap.Frederick 1.1 | 5 | 2% | 0 |
| jangs.ns51 1.0 | 3 | 1% | 3 |

## Melee bench: F30

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.6 | 55.7 | 16 / 350 | 4.99 | 10.5% | 27508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 2.3 | 13.7% | 66 |
| catcat20.Matcha 0.006 | 2.3 | 14.1% | 91 |
| darkcanuck.B26354 1.06 | 2.7 | 13.7% | 78 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.1% | 49 |
| intruder.PrairieWolf 2.61 | 5.3 | 10.0% | 39 |
| hadur117.nano.SanaroS02 0.1 | 5.4 | 10.5% | 16 |
| ntc.Opposite 1.5 | 7.8 | 7.4% | 1 |
| tripphippy.Alice 1.1 | 7.9 | 7.3% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 7.3% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 53.6 | 57.8 | 2 / 35 | 2357 |
| 2 | 5 | 51.8 | 51.7 | 1 / 35 | 2612 |
| 3 | 5 | 53.3 | 52.7 | 2 / 35 | 2792 |
| 4 | 5 | 51.9 | 50.2 | 2 / 35 | 2614 |
| 5 | 6 | 53.7 | 55.9 | 1 / 35 | 2839 |
| 6 | 5 | 55.8 | 61.9 | 1 / 35 | 3041 |
| 7 | 5 | 52.7 | 55.6 | 1 / 35 | 2529 |
| 8 | 6 | 52.5 | 51.4 | 2 / 35 | 2837 |
| 9 | 5 | 56.8 | 63.2 | 4 / 35 | 2789 |
| 10 | 6 | 53.5 | 56.2 | 0 / 35 | 3098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 17 | 53% |
| darkcanuck.B26354 1.06 | 15 | 20% |
| oog.melee.Capulet 1.2 | 15 | 13% |
| stelo.PastFuture 2.3.2 | 7 | 29% |
| intruder.PrairieWolf 2.61 | 5 | 0% |
| tripphippy.Alice 1.1 | 1 | 0% |

Hadur died in 334 of 350 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 61 | 18% | 64 |
| stelo.PastFuture 2.3.2 | 61 | 18% | 63 |
| oog.melee.Capulet 1.2 | 60 | 18% | 63 |
| catcat20.Matcha 0.006 | 55 | 16% | 63 |
| intruder.PrairieWolf 2.61 | 34 | 10% | 34 |
| ntc.Opposite 1.5 | 22 | 7% | 22 |
| tripphippy.Alice 1.1 | 22 | 7% | 22 |
| fowl3628800.LightningBolt 2.6.0 | 16 | 5% | 16 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.2 | 54.4 | 15 / 350 | 5.10 | 10.4% | 26753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.8% | 205 |
| gh.mini.Griezel 0.2 | 2.6 | 12.9% | 66 |
| spinnercat.micro.Tyger 0.1 | 2.9 | 12.6% | 33 |
| d414.nano.Quantum 1.0.0 | 3.8 | 11.6% | 14 |
| hadur117.nano.SanaroS02 0.1 | 5.0 | 10.4% | 15 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.6% | 8 |
| fm.mammillarias 1.3 | 7.4 | 7.1% | 3 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.8% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.2 | 57.5 | 2 / 35 | 2716 |
| 2 | 5 | 53.3 | 54.3 | 1 / 35 | 2537 |
| 3 | 5 | 53.6 | 54.3 | 2 / 35 | 2750 |
| 4 | 4 | 56.0 | 60.0 | 2 / 35 | 2982 |
| 5 | 6 | 52.9 | 54.0 | 3 / 35 | 2443 |
| 6 | 5 | 51.5 | 51.7 | 0 / 35 | 2569 |
| 7 | 5 | 52.6 | 53.3 | 1 / 35 | 2814 |
| 8 | 5 | 54.7 | 57.8 | 2 / 35 | 2594 |
| 9 | 6 | 50.8 | 48.6 | 1 / 35 | 2646 |
| 10 | 5 | 52.7 | 52.7 | 1 / 35 | 2702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 41 | 20% |
| gh.mini.Griezel 0.2 | 18 | 11% |
| spinnercat.micro.Tyger 0.1 | 8 | 25% |
| d414.nano.Quantum 1.0.0 | 5 | 40% |
| fm.mammillarias 1.3 | 1 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 335 of 350 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 86 | 26% | 91 |
| gh.mini.Griezel 0.2 | 67 | 20% | 70 |
| spinnercat.micro.Tyger 0.1 | 66 | 20% | 68 |
| d414.nano.Quantum 1.0.0 | 41 | 12% | 44 |
| gh.nano.Grofvuil 0.2 | 28 | 8% | 29 |
| fm.mammillarias 1.3 | 24 | 7% | 24 |
| timmit.nano.TimDog 0.33 | 12 | 4% | 12 |
| Gecko.ultimateGeckoBot 1.0 | 9 | 3% | 10 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 74.1 | 76 / 350 | 3.33 | 14.4% | 36596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.2 | 16.0% | 134 |
| hadur117.nano.SanaroS02 0.1 | 2.0 | 14.4% | 76 |
| apc.botM 3.0 | 3.3 | 12.3% | 58 |
| vjik.UnViolation 1.1 | 4.3 | 10.6% | 37 |
| lxx.ConceptA 0.8 | 4.6 | 10.5% | 7 |
| bayen.UbaMicro 1.4 | 5.6 | 9.4% | 10 |
| panzer.Panzer 0.2 | 7.6 | 7.3% | 2 |
| conscience.Electron 1.3g | 8.1 | 7.2% | 2 |
| yk.JahMicro 1.0 | 8.5 | 6.9% | 12 |
| donjezza.Jezza 1.0 | 9.8 | 5.5% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 77.5 | 5 / 35 | 3752 |
| 2 | 1 | 62.2 | 78.1 | 11 / 35 | 3592 |
| 3 | 2 | 58.7 | 67.9 | 4 / 35 | 3373 |
| 4 | 2 | 62.4 | 78.4 | 7 / 35 | 3721 |
| 5 | 2 | 62.9 | 76.2 | 8 / 35 | 4270 |
| 6 | 2 | 58.9 | 70.8 | 4 / 35 | 3451 |
| 7 | 1 | 61.8 | 74.6 | 12 / 35 | 3569 |
| 8 | 2 | 61.8 | 77.1 | 9 / 35 | 3516 |
| 9 | 4 | 58.3 | 66.3 | 5 / 35 | 3466 |
| 10 | 2 | 62.1 | 74.0 | 11 / 35 | 3886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 26% |
| apc.botM 3.0 | 35 | 40% |
| lxx.ConceptA 0.8 | 19 | 84% |
| vjik.UnViolation 1.1 | 17 | 41% |
| bayen.UbaMicro 1.4 | 10 | 70% |
| yk.JahMicro 1.0 | 6 | 83% |
| panzer.Panzer 0.2 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 0% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 274 of 350 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 103 | 38% | 125 |
| apc.botM 3.0 | 42 | 15% | 61 |
| vjik.UnViolation 1.1 | 34 | 12% | 46 |
| lxx.ConceptA 0.8 | 34 | 12% | 41 |
| bayen.UbaMicro 1.4 | 24 | 9% | 31 |
| conscience.Electron 1.3g | 12 | 4% | 15 |
| yk.JahMicro 1.0 | 11 | 4% | 14 |
| panzer.Panzer 0.2 | 9 | 3% | 9 |
| donjezza.Jezza 1.0 | 5 | 2% | 7 |

## Melee bench: F33

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 66.3 | 45 / 350 | 4.03 | 13.4% | 36879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.0% | 157 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.3% | 48 |
| hadur117.nano.SanaroS02 0.1 | 2.7 | 13.4% | 45 |
| labg.Cataclysm 2.05 | 4.6 | 11.3% | 44 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 11.2% | 31 |
| baal.nano.N 1.42 | 6.1 | 9.3% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.7% | 17 |
| zyx.micro.Ant 1.1 | 8.5 | 5.3% | 2 |
| sanja.First 0.1 | 8.9 | 5.1% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 70.8 | 7 / 35 | 3688 |
| 2 | 3 | 59.6 | 63.8 | 5 / 35 | 3646 |
| 3 | 3 | 58.3 | 61.6 | 4 / 35 | 3645 |
| 4 | 3 | 60.1 | 66.0 | 8 / 35 | 3429 |
| 5 | 4 | 57.3 | 60.0 | 3 / 35 | 3484 |
| 6 | 3 | 59.5 | 65.1 | 5 / 35 | 3577 |
| 7 | 2 | 62.6 | 73.0 | 4 / 35 | 4188 |
| 8 | 3 | 57.2 | 60.0 | 0 / 35 | 3451 |
| 9 | 2 | 61.3 | 69.8 | 3 / 35 | 4037 |
| 10 | 2 | 62.3 | 73.3 | 6 / 35 | 3734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 51 | 22% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 44% |
| labg.Cataclysm 2.05 | 16 | 31% |
| gre.svman4.Leonidas 1.3.2 | 15 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 63% |

Hadur died in 307 of 350 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 128 | 42% | 141 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 16% | 67 |
| labg.Cataclysm 2.05 | 33 | 11% | 37 |
| kinsen.melee.Angsaichmophobia 1.8c | 32 | 10% | 33 |
| gre.svman4.Leonidas 1.3.2 | 29 | 9% | 32 |
| baal.nano.N 1.42 | 21 | 7% | 22 |
| zyx.micro.Ant 1.1 | 7 | 2% | 7 |
| sanja.First 0.1 | 6 | 2% | 7 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 1% | 3 |

## Melee bench: F34

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 71.7 | 39 / 350 | 3.55 | 14.1% | 40308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.3 | 17.3% | 131 |
| kid.Gladiator .7.2 | 1.7 | 17.5% | 123 |
| hadur117.nano.SanaroS02 0.1 | 3.0 | 14.1% | 39 |
| jcs.Seth 1.8 | 4.3 | 11.5% | 34 |
| tcf.Reach 3 | 4.7 | 10.7% | 13 |
| cli.Dancer 1.1 | 6.0 | 9.3% | 7 |
| ratosh.Wesco 1.4 | 7.0 | 7.7% | 3 |
| amk.Punbot.Punbot 0.01 | 8.1 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.9% | 0 |
| sample.RamFire 1.0 | 9.9 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.1 | 80.3 | 5 / 35 | 4441 |
| 2 | 3 | 60.8 | 67.6 | 2 / 35 | 3908 |
| 3 | 3 | 64.6 | 77.5 | 4 / 35 | 4468 |
| 4 | 3 | 63.1 | 72.4 | 4 / 35 | 4236 |
| 5 | 3 | 63.2 | 73.7 | 4 / 35 | 3980 |
| 6 | 3 | 58.8 | 65.7 | 4 / 35 | 3217 |
| 7 | 3 | 59.1 | 65.1 | 1 / 35 | 3642 |
| 8 | 3 | 62.4 | 73.3 | 3 / 35 | 4071 |
| 9 | 3 | 61.9 | 69.5 | 5 / 35 | 4243 |
| 10 | 3 | 63.1 | 71.7 | 7 / 35 | 4102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 64 | 42% |
| kid.Gladiator .7.2 | 45 | 9% |
| jcs.Seth 1.8 | 16 | 31% |
| tcf.Reach 3 | 8 | 25% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 133 | 43% | 135 |
| stelo.Spread 0.9 | 95 | 30% | 122 |
| jcs.Seth 1.8 | 32 | 10% | 37 |
| tcf.Reach 3 | 26 | 8% | 27 |
| ratosh.Wesco 1.4 | 12 | 4% | 14 |
| cli.Dancer 1.1 | 10 | 3% | 10 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.RamFire 1.0 | 1 | 0% | 1 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 65.9 | 16 / 350 | 4.07 | 12.1% | 28130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 271 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.1% | 33 |
| rz.HawkOnFire 0.1 | 3.5 | 12.3% | 10 |
| hadur117.nano.SanaroS02 0.1 | 3.9 | 12.1% | 16 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.1 | 12.0% | 18 |
| wit.Chuliath 1.0 | 6.5 | 7.3% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 7.1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.9 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.3 | 64.4 | 2 / 35 | 2518 |
| 2 | 3 | 58.2 | 67.6 | 1 / 35 | 2763 |
| 3 | 3 | 59.2 | 69.2 | 1 / 35 | 3079 |
| 4 | 3 | 60.1 | 71.4 | 2 / 35 | 2988 |
| 5 | 5 | 55.4 | 60.0 | 3 / 35 | 2483 |
| 6 | 2 | 59.8 | 68.6 | 2 / 35 | 3312 |
| 7 | 3 | 59.4 | 71.1 | 1 / 35 | 2861 |
| 8 | 5 | 55.4 | 60.3 | 1 / 35 | 2605 |
| 9 | 5 | 57.6 | 64.4 | 2 / 35 | 2741 |
| 10 | 5 | 56.4 | 61.9 | 1 / 35 | 2780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 75 | 7% |
| gh.mini.Gruwel 0.9 | 14 | 21% |
| rz.HawkOnFire 0.1 | 10 | 60% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 33% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 334 of 350 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 146 | 44% | 151 |
| rz.HawkOnFire 0.1 | 64 | 19% | 70 |
| gh.mini.Gruwel 0.9 | 54 | 16% | 56 |
| dmh.robocode.robot.BlackDeath 9.2 | 38 | 11% | 41 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 15 | 4% | 15 |
| wit.Chuliath 1.0 | 6 | 2% | 6 |
| stelo.MyAgileRobot 0.2 | 5 | 1% | 5 |
| myl.nano.KomoriNinja 1.1 | 4 | 1% | 4 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 69.1 | 93 / 350 | 3.78 | 14.0% | 35475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS02 0.1 | 1.4 | 14.0% | 93 |
| alpha.RainingFire 1.0 | 2.6 | 12.5% | 60 |
| mz.Cork 0.1 | 3.6 | 12.0% | 45 |
| bzdp.Pansy 2.1 | 3.6 | 12.1% | 57 |
| bvh.micro.Freya 0.3 | 4.3 | 11.5% | 38 |
| m3thos.Eva02 0.7.1 | 6.0 | 10.1% | 16 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.6% | 10 |
| dl.BetterWalls 1.0 | 8.4 | 7.3% | 12 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.5% | 5 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.3% | 15 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 71.7 | 8 / 35 | 3646 |
| 2 | 3 | 56.8 | 61.3 | 6 / 35 | 3084 |
| 3 | 2 | 62.6 | 74.6 | 9 / 35 | 3787 |
| 4 | 1 | 63.8 | 78.7 | 10 / 35 | 4129 |
| 5 | 1 | 59.2 | 65.7 | 10 / 35 | 3367 |
| 6 | 1 | 59.3 | 65.4 | 10 / 35 | 3275 |
| 7 | 1 | 61.4 | 68.9 | 13 / 35 | 3802 |
| 8 | 1 | 61.9 | 72.1 | 11 / 35 | 3572 |
| 9 | 1 | 60.6 | 70.8 | 8 / 35 | 3846 |
| 10 | 2 | 57.0 | 61.9 | 8 / 35 | 2967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.Cork 0.1 | 31 | 74% |
| bzdp.Pansy 2.1 | 31 | 39% |
| alpha.RainingFire 1.0 | 25 | 56% |
| bvh.micro.Freya 0.3 | 18 | 72% |
| bvh.mini.Fenrir 0.39 | 18 | 89% |
| m3thos.Eva02 0.7.1 | 15 | 60% |
| dl.BetterWalls 1.0 | 8 | 63% |
| sample.MyFirstRobot 1.0 | 7 | 0% |
| squidM.TentalceMeleeNano 1.1 | 3 | 33% |

Hadur died in 257 of 350 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 54 | 21% | 69 |
| alpha.RainingFire 1.0 | 51 | 20% | 63 |
| m3thos.Eva02 0.7.1 | 36 | 14% | 47 |
| mz.Cork 0.1 | 32 | 12% | 56 |
| bvh.micro.Freya 0.3 | 31 | 12% | 42 |
| bvh.mini.Fenrir 0.39 | 25 | 10% | 30 |
| dl.BetterWalls 1.0 | 10 | 4% | 21 |
| squidM.TentalceMeleeNano 1.1 | 10 | 4% | 12 |
| sample.MyFirstRobot 1.0 | 8 | 3% | 10 |

## Melee bench: F37

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 75.5 | 111 / 350 | 3.21 | 14.9% | 41814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS02 0.1 | 1.0 | 14.9% | 111 |
| germ.TheMind .2 | 2.3 | 12.0% | 54 |
| EBBU.Sim2 1.02 | 4.4 | 10.5% | 20 |
| agrach.Dalek 1.0 | 5.1 | 9.8% | 43 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5.1 | 10.2% | 26 |
| stelo.UntouchableNano 1.3 | 5.7 | 9.3% | 33 |
| lmk.ACPFinal 0.1 | 7.3 | 8.5% | 15 |
| mb.Beast 0.1 | 7.3 | 8.5% | 28 |
| skm.Ryubot 1.0 | 8.4 | 8.3% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 8.4 | 8.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.1 | 76.2 | 11 / 35 | 3741 |
| 2 | 1 | 57.6 | 62.9 | 9 / 35 | 4142 |
| 3 | 1 | 61.0 | 74.9 | 12 / 35 | 3966 |
| 4 | 1 | 61.9 | 76.2 | 12 / 35 | 4294 |
| 5 | 1 | 63.0 | 81.3 | 11 / 35 | 4331 |
| 6 | 1 | 64.1 | 82.5 | 14 / 35 | 4577 |
| 7 | 1 | 63.9 | 82.2 | 12 / 35 | 4475 |
| 8 | 1 | 59.3 | 70.2 | 9 / 35 | 3789 |
| 9 | 1 | 58.4 | 67.6 | 7 / 35 | 4180 |
| 10 | 1 | 63.4 | 80.6 | 14 / 35 | 4319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 36 | 36% |
| EBBU.Sim2 1.02 | 35 | 71% |
| mb.Beast 0.1 | 25 | 64% |
| stelo.UntouchableNano 1.3 | 23 | 65% |
| agrach.Dalek 1.0 | 23 | 57% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 61% |
| skm.Ryubot 1.0 | 16 | 44% |
| lmk.ACPFinal 0.1 | 12 | 83% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 243 of 350 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 46 | 19% | 59 |
| agrach.Dalek 1.0 | 38 | 16% | 53 |
| EBBU.Sim2 1.02 | 29 | 12% | 50 |
| lmk.ACPFinal 0.1 | 28 | 12% | 35 |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 10% | 40 |
| mn.nano.perceptual.Impact 1.3.0 | 24 | 10% | 26 |
| mb.Beast 0.1 | 21 | 9% | 37 |
| stelo.UntouchableNano 1.3 | 17 | 7% | 29 |
| skm.Ryubot 1.0 | 16 | 7% | 20 |

## Melee bench: F38

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 62.6 | 32 / 350 | 4.37 | 11.8% | 30528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.6% | 180 |
| bvh.mini.Freya 0.55 | 2.4 | 13.3% | 35 |
| hadur117.nano.SanaroS02 0.1 | 3.4 | 11.8% | 32 |
| bts.mega.Gnarly 1.4 | 4.6 | 11.3% | 43 |
| cs.Wren 1.0 | 4.7 | 11.1% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.1 | 10.7% | 22 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.8% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.6% | 6 |
| bzdp.BoxCar 2.0 | 9.4 | 4.5% | 0 |
| matt.UnderDark3 2.4.34 | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.6 | 59.7 | 3 / 35 | 3006 |
| 2 | 3 | 57.8 | 62.5 | 4 / 35 | 3392 |
| 3 | 3 | 55.7 | 61.0 | 3 / 35 | 2804 |
| 4 | 3 | 56.9 | 61.3 | 4 / 35 | 3239 |
| 5 | 4 | 56.3 | 61.3 | 3 / 35 | 3056 |
| 6 | 2 | 58.3 | 65.7 | 4 / 35 | 3156 |
| 7 | 3 | 58.1 | 66.0 | 2 / 35 | 3179 |
| 8 | 5 | 54.3 | 57.8 | 3 / 35 | 2788 |
| 9 | 4 | 57.3 | 64.8 | 3 / 35 | 3061 |
| 10 | 3 | 57.6 | 66.0 | 3 / 35 | 2847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 51 | 31% |
| bts.mega.Gnarly 1.4 | 18 | 22% |
| bvh.mini.Freya 0.55 | 13 | 31% |
| cs.Wren 1.0 | 12 | 42% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 0% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |
| kdf.KoulDestroyer 1.0 | 2 | 100% |

Hadur died in 319 of 350 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 101 | 32% | 117 |
| bvh.mini.Freya 0.55 | 49 | 15% | 53 |
| bts.mega.Gnarly 1.4 | 44 | 14% | 48 |
| cs.Wren 1.0 | 43 | 13% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 33 | 10% | 35 |
| kdf.KoulDestroyer 1.0 | 29 | 9% | 30 |
| kawigi.spare.SpareParts 0.7.6nosnd | 10 | 3% | 10 |
| bzdp.BoxCar 2.0 | 9 | 3% | 10 |
| matt.UnderDark3 2.4.34 | 1 | 0% | 2 |

## Melee bench: F39

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 62.4 | 33 / 350 | 4.38 | 11.9% | 31644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.5 | 15.2% | 64 |
| az.Ololobot 0.2.4 | 1.6 | 14.8% | 144 |
| hadur117.nano.SanaroS02 0.1 | 3.3 | 11.9% | 33 |
| catcat20.Lambda 0.024 | 3.9 | 11.4% | 45 |
| stelo.SoRobotNanoMelee 1.2 | 5.6 | 9.8% | 34 |
| apollokidd.ApolloKidd 0.9 | 6.4 | 8.8% | 8 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.9% | 14 |
| gimp.GimpBot 0.1 | 7.1 | 8.4% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.3% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.1 | 60.6 | 4 / 35 | 2863 |
| 2 | 3 | 56.9 | 65.4 | 3 / 35 | 3239 |
| 3 | 4 | 56.4 | 59.7 | 5 / 35 | 3424 |
| 4 | 3 | 56.0 | 62.2 | 3 / 35 | 3437 |
| 5 | 4 | 55.1 | 60.6 | 2 / 35 | 2837 |
| 6 | 4 | 54.7 | 59.7 | 2 / 35 | 3136 |
| 7 | 4 | 55.5 | 60.3 | 5 / 35 | 2998 |
| 8 | 2 | 58.3 | 66.0 | 5 / 35 | 3331 |
| 9 | 3 | 59.2 | 70.2 | 3 / 35 | 3461 |
| 10 | 3 | 54.0 | 59.4 | 1 / 35 | 2918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 43 | 7% |
| bvh.fry.Freya 0.82 | 25 | 44% |
| catcat20.Lambda 0.024 | 13 | 77% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 25% |
| winamp32.micro.MicroMacro 1.0 | 7 | 29% |
| gimp.GimpBot 0.1 | 2 | 50% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 320 of 350 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 115 | 36% | 120 |
| az.Ololobot 0.2.4 | 65 | 20% | 70 |
| stelo.SoRobotNanoMelee 1.2 | 46 | 14% | 45 |
| catcat20.Lambda 0.024 | 25 | 8% | 35 |
| apollokidd.ApolloKidd 0.9 | 24 | 8% | 26 |
| gimp.GimpBot 0.1 | 17 | 5% | 22 |
| winamp32.micro.MicroMacro 1.0 | 14 | 4% | 17 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8 | 3% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 6 | 2% | 6 |

## Melee bench: F41

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 65.4 | 47 / 350 | 4.12 | 12.5% | 30695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 17.2% | 171 |
| lessonz.robocode.Oz 0.5.0 | 2.3 | 14.0% | 51 |
| ary.Swarm 1.1 | 3.4 | 13.0% | 30 |
| hadur117.nano.SanaroS02 0.1 | 3.8 | 12.5% | 47 |
| simonton.nano.MeleeSeed 1.8 | 4.4 | 12.0% | 38 |
| shrub.Silver v048 | 6.1 | 9.2% | 7 |
| zyx.nano.Ant 1.1 | 7.1 | 7.9% | 2 |
| jsal.Jsalbot 1.0 | 8.3 | 5.9% | 5 |
| stelo.Mirror 1.1 | 8.5 | 5.6% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.1 | 64.1 | 2 / 35 | 3227 |
| 2 | 2 | 61.2 | 72.7 | 7 / 35 | 2986 |
| 3 | 2 | 60.6 | 69.5 | 7 / 35 | 3418 |
| 4 | 4 | 59.4 | 67.3 | 3 / 35 | 3071 |
| 5 | 4 | 57.7 | 64.1 | 2 / 35 | 2911 |
| 6 | 4 | 59.4 | 67.6 | 8 / 35 | 3107 |
| 7 | 4 | 56.1 | 60.6 | 3 / 35 | 2823 |
| 8 | 5 | 58.2 | 64.1 | 5 / 35 | 2958 |
| 9 | 4 | 59.6 | 67.3 | 6 / 35 | 3066 |
| 10 | 5 | 55.6 | 56.2 | 4 / 35 | 3128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 56 | 18% |
| lessonz.robocode.Oz 0.5.0 | 26 | 54% |
| ary.Swarm 1.1 | 18 | 61% |
| simonton.nano.MeleeSeed 1.8 | 7 | 43% |
| shrub.Silver v048 | 6 | 83% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 100 | 33% | 113 |
| ary.Swarm 1.1 | 55 | 18% | 64 |
| lessonz.robocode.Oz 0.5.0 | 54 | 18% | 65 |
| simonton.nano.MeleeSeed 1.8 | 44 | 14% | 50 |
| shrub.Silver v048 | 21 | 7% | 23 |
| zyx.nano.Ant 1.1 | 18 | 6% | 18 |
| stelo.Mirror 1.1 | 6 | 2% | 9 |
| jsal.Jsalbot 1.0 | 3 | 1% | 5 |
| acogdev.alpha 0.2 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 68.0 | 45 / 350 | 3.88 | 13.2% | 35850 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.1% | 193 |
| ara.Shera 0.88 | 2.6 | 14.0% | 50 |
| maribo.mini.MiniQuester 0.1 | 2.9 | 13.6% | 47 |
| hadur117.nano.SanaroS02 0.1 | 3.5 | 13.2% | 45 |
| amz.NanoClone 1.41 | 5.4 | 9.3% | 3 |
| maribo.IotaCT 1.1 | 6.0 | 8.1% | 4 |
| dsw.StaticD 1.0 | 7.0 | 7.2% | 5 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.9% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.3% | 2 |
| mme.NikeEnhanced 2.0 | 9.1 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.3 | 65.7 | 2 / 35 | 3610 |
| 2 | 4 | 58.6 | 66.0 | 3 / 35 | 3443 |
| 3 | 4 | 60.7 | 70.2 | 6 / 35 | 3685 |
| 4 | 3 | 62.0 | 75.9 | 6 / 35 | 3558 |
| 5 | 3 | 60.3 | 70.2 | 7 / 35 | 3415 |
| 6 | 3 | 60.8 | 70.5 | 5 / 35 | 3659 |
| 7 | 3 | 59.3 | 67.9 | 4 / 35 | 3441 |
| 8 | 4 | 56.6 | 59.0 | 5 / 35 | 3559 |
| 9 | 4 | 60.2 | 69.5 | 2 / 35 | 3779 |
| 10 | 3 | 59.3 | 65.4 | 5 / 35 | 3701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 64 | 20% |
| ara.Shera 0.88 | 26 | 42% |
| maribo.mini.MiniQuester 0.1 | 24 | 67% |
| dsw.StaticD 1.0 | 4 | 75% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 50% |
| maribo.IotaCT 1.1 | 1 | 0% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 113 | 37% | 126 |
| ara.Shera 0.88 | 70 | 23% | 80 |
| maribo.mini.MiniQuester 0.1 | 62 | 20% | 78 |
| maribo.IotaCT 1.1 | 17 | 6% | 18 |
| amz.NanoClone 1.41 | 17 | 6% | 17 |
| dsw.StaticD 1.0 | 12 | 4% | 16 |
| stelo.MirrorMicro 1.0 | 7 | 2% | 7 |
| mme.NikeEnhanced 2.0 | 5 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 61.7 | 19 / 350 | 4.45 | 11.9% | 31846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 276 |
| brainfade.melee.Dusk 0.44 | 2.6 | 12.7% | 30 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.1% | 9 |
| hadur117.nano.SanaroS02 0.1 | 3.7 | 11.9% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 4.6 | 11.1% | 11 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.9% | 4 |
| mz.NanoGod 2.02 | 7.2 | 8.1% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.4% | 2 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 54.5 | 52.4 | 0 / 35 | 2886 |
| 2 | 4 | 60.8 | 65.4 | 3 / 35 | 3458 |
| 3 | 3 | 59.9 | 63.8 | 4 / 35 | 3264 |
| 4 | 5 | 57.5 | 60.6 | 1 / 35 | 2767 |
| 5 | 2 | 61.8 | 69.5 | 1 / 35 | 3419 |
| 6 | 3 | 59.0 | 63.2 | 3 / 35 | 3145 |
| 7 | 3 | 60.1 | 64.1 | 2 / 35 | 3491 |
| 8 | 4 | 57.3 | 58.1 | 2 / 35 | 3146 |
| 9 | 3 | 57.6 | 57.5 | 1 / 35 | 3281 |
| 10 | 4 | 58.5 | 61.9 | 2 / 35 | 2989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 75 | 13% |
| brainfade.melee.Dusk 0.44 | 14 | 43% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 50% |
| dummy.micro.Sparrow 2.5 | 2 | 0% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |
| jab.DiamondStealer 5 | 1 | 0% |

Hadur died in 331 of 350 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 156 | 47% | 167 |
| brainfade.melee.Dusk 0.44 | 46 | 14% | 51 |
| dummy.micro.Sparrow 2.5 | 41 | 12% | 41 |
| wcsv.melee.EngineerMelee 0.1 | 38 | 11% | 40 |
| jab.DiamondStealer 5 | 24 | 7% | 24 |
| mz.NanoGod 2.02 | 15 | 5% | 15 |
| Krabb.akim2.Akim2 1.1b | 11 | 3% | 12 |

## Melee bench: F44

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 67.9 | 66 / 350 | 3.89 | 13.5% | 35171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.0 | 17.0% | 154 |
| tzu.TheArtOfWar 1.2 | 2.1 | 14.9% | 78 |
| hadur117.nano.SanaroS02 0.1 | 2.9 | 13.5% | 66 |
| wompi.Quokka 1.6 | 4.5 | 11.1% | 10 |
| jwirde.Gort 2.0 | 4.6 | 11.1% | 32 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 8.9% | 7 |
| disan.Chair 2.2.0 | 7.0 | 7.6% | 4 |
| stf.PanzerGeneral 0.1 | 8.1 | 6.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.8% | 2 |
| sample.Crazy 1.0 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 67.3 | 6 / 35 | 3870 |
| 2 | 3 | 60.9 | 69.5 | 8 / 35 | 3619 |
| 3 | 3 | 61.7 | 71.1 | 7 / 35 | 3625 |
| 4 | 3 | 59.6 | 64.8 | 6 / 35 | 3740 |
| 5 | 3 | 58.3 | 64.8 | 6 / 35 | 3159 |
| 6 | 3 | 62.5 | 76.2 | 7 / 35 | 3446 |
| 7 | 3 | 59.1 | 65.1 | 6 / 35 | 3386 |
| 8 | 3 | 58.4 | 63.5 | 4 / 35 | 3363 |
| 9 | 3 | 60.3 | 68.3 | 8 / 35 | 3339 |
| 10 | 3 | 60.7 | 68.6 | 8 / 35 | 3624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 79 | 44% |
| tzu.TheArtOfWar 1.2 | 38 | 34% |
| jwirde.Gort 2.0 | 12 | 17% |
| wompi.Quokka 1.6 | 10 | 90% |
| disan.Chair 2.2.0 | 5 | 60% |
| amk.jointstrike.JointStrike 0.2 | 2 | 50% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 50% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 97 | 34% | 135 |
| tzu.TheArtOfWar 1.2 | 77 | 27% | 91 |
| wompi.Quokka 1.6 | 30 | 11% | 36 |
| jwirde.Gort 2.0 | 30 | 11% | 35 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 23 | 8% | 23 |
| disan.Chair 2.2.0 | 15 | 5% | 16 |
| stf.PanzerGeneral 0.1 | 8 | 3% | 9 |
| amk.jointstrike.JointStrike 0.2 | 2 | 1% | 3 |
| sample.Crazy 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 69.1 | 58 / 350 | 3.78 | 14.3% | 39308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS02 0.1 | 1.3 | 14.3% | 58 |
| jje.BagPuss 1.2 | 2.7 | 12.7% | 42 |
| eem.IWillFireNoBullet v2.8 | 3.2 | 11.6% | 157 |
| sul.Lunar 1.1 | 4.1 | 11.2% | 29 |
| myl.nano.Graviton 1.10 | 4.9 | 10.6% | 22 |
| hvilela.HVilela 0.9 | 5.8 | 9.8% | 10 |
| fm.claire 1.7 | 6.9 | 8.8% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 8.2% | 5 |
| wit.Deep7 2.0 | 8.5 | 7.5% | 26 |
| abud.ThirdRobo 1.0 | 9.9 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 77.8 | 13 / 35 | 3494 |
| 2 | 1 | 61.8 | 72.4 | 5 / 35 | 4220 |
| 3 | 2 | 60.4 | 68.3 | 3 / 35 | 3944 |
| 4 | 1 | 61.3 | 71.7 | 6 / 35 | 4033 |
| 5 | 1 | 61.2 | 70.8 | 5 / 35 | 4045 |
| 6 | 3 | 56.4 | 58.7 | 4 / 35 | 3542 |
| 7 | 1 | 59.0 | 66.0 | 5 / 35 | 3700 |
| 8 | 1 | 62.4 | 73.7 | 7 / 35 | 4205 |
| 9 | 1 | 59.2 | 63.8 | 4 / 35 | 4198 |
| 10 | 1 | 60.6 | 67.9 | 6 / 35 | 3927 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 58 | 34% |
| jje.BagPuss 1.2 | 25 | 20% |
| sul.Lunar 1.1 | 23 | 57% |
| myl.nano.Graviton 1.10 | 12 | 42% |
| fm.claire 1.7 | 7 | 100% |
| wit.Deep7 2.0 | 7 | 57% |
| hvilela.HVilela 0.9 | 6 | 17% |
| pez.mini.ChironexFleckeri 0.5 | 3 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 1154. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 64 | 22% | 90 |
| myl.nano.Graviton 1.10 | 50 | 17% | 68 |
| eem.IWillFireNoBullet v2.8 | 45 | 15% | 0 |
| sul.Lunar 1.1 | 44 | 15% | 74 |
| hvilela.HVilela 0.9 | 44 | 15% | 50 |
| fm.claire 1.7 | 21 | 7% | 28 |
| wit.Deep7 2.0 | 12 | 4% | 22 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 3% | 13 |
| abud.ThirdRobo 1.0 | 3 | 1% | 5 |

## Melee bench: F46

hadur117.nano.SanaroS02 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 67.1 | 29 / 350 | 3.96 | 12.3% | 28724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.4 | 17.9% | 129 |
| rsalesc.melee.Medina 0.4.5 | 1.6 | 17.9% | 168 |
| hadur117.nano.SanaroS02 0.1 | 3.2 | 12.3% | 29 |
| mz.MicroSheep 1.0 | 4.2 | 10.7% | 6 |
| cx.Princess 1.0 | 4.6 | 10.6% | 14 |
| sadoner.killer 0.2 | 6.1 | 8.8% | 3 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.3% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.5 | 62.2 | 0 / 35 | 2372 |
| 2 | 3 | 56.0 | 62.2 | 2 / 35 | 2620 |
| 3 | 3 | 59.9 | 68.3 | 6 / 35 | 3057 |
| 4 | 3 | 56.4 | 61.6 | 0 / 35 | 2860 |
| 5 | 4 | 55.5 | 60.3 | 1 / 35 | 2680 |
| 6 | 3 | 60.0 | 71.7 | 3 / 35 | 3032 |
| 7 | 3 | 58.7 | 68.3 | 3 / 35 | 2925 |
| 8 | 3 | 61.9 | 77.5 | 3 / 35 | 3257 |
| 9 | 3 | 58.5 | 66.3 | 7 / 35 | 2883 |
| 10 | 3 | 60.6 | 73.0 | 4 / 35 | 3038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 54 | 26% |
| rsalesc.melee.Medina 0.4.5 | 45 | 18% |
| mz.MicroSheep 1.0 | 5 | 20% |
| cx.Princess 1.0 | 4 | 75% |
| sadoner.killer 0.2 | 2 | 50% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 321 of 350 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 126 | 39% | 142 |
| rsalesc.melee.Medina 0.4.5 | 100 | 31% | 106 |
| mz.MicroSheep 1.0 | 25 | 8% | 28 |
| cx.Princess 1.0 | 22 | 7% | 24 |
| sadoner.killer 0.2 | 19 | 6% | 19 |
| arthord.NanoSatanMelee Beta | 13 | 4% | 15 |
| jeremyreeder.collective.Prophet 5 | 12 | 4% | 12 |
| kurios.DOSexe .9a | 3 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |

