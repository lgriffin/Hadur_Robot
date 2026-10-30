# Bench suite: gun-smoke-suite.txt

## Melee bench: F01

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3483729. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 40 over 2 battles (20.0 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.5 | 14 / 70 | 2.49 | 16.5% | 9519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 44 |
| hadur117.Hadur 3.19gx | 2.0 | 16.5% | 14 |
| sgp.JollyNinja 3.53 | 3.0 | 12.6% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.7% | 2 |
| mz.MicroGodMelee 1 | 5.0 | 10.4% | 5 |
| lorneswork.Predator 1.0 | 5.5 | 10.3% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 0 |
| skm.butterfly 1.0 | 8.5 | 4.5% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 81.9 | 4 / 35 | 4606 |
| 2 | 2 | 66.8 | 85.1 | 10 / 35 | 4913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 36 | 11% |
| sgp.JollyNinja 3.53 | 7 | 43% |
| mz.MicroGodMelee 1 | 6 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 50% |
| lorneswork.Predator 1.0 | 1 | 100% |

Hadur died in 56 of 70 rounds, at a mean tick of 1100. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 37 | 66% | 41 |
| sgp.JollyNinja 3.53 | 8 | 14% | 9 |
| mz.MicroGodMelee 1 | 3 | 5% | 8 |
| lorneswork.Predator 1.0 | 3 | 5% | 6 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 5% | 3 |
| adt.Ar2 1.0 | 1 | 2% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 47843 melee ticks, 29216 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 51 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15187 sent, 13489 reached their opponent, 2723 virtual hits (20.2% of those reached).

## Melee bench: F02

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3541533. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 46 over 2 battles (23.0 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.5 | 31 / 70 | 2.21 | 18.5% | 9840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 18.5% | 31 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 13.5% | 12 |
| pulsar.PulsarMax 0.8.9 | 3.0 | 12.6% | 9 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.0 | 11.5% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 11.2% | 2 |
| Noran.BitchingElk 0.054 | 6.0 | 8.0% | 4 |
| sch.Simone 0.3d | 7.0 | 7.7% | 4 |
| fnc.bandit.Bandit 5.2.0 | 8.5 | 6.5% | 0 |
| stelo.PatternRobot 1.0 | 8.5 | 6.4% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.7 | 15 / 35 | 4959 |
| 2 | 1 | 68.0 | 86.3 | 16 / 35 | 4881 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 13 | 77% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 13 | 62% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 50% |
| Noran.BitchingElk 0.054 | 5 | 60% |
| sch.Simone 0.3d | 4 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 2 | 50% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 39 of 70 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 23% | 15 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 8 | 21% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 15% | 7 |
| pulsar.PulsarMax 0.8.9 | 5 | 13% | 15 |
| Noran.BitchingElk 0.054 | 5 | 13% | 7 |
| sch.Simone 0.3d | 3 | 8% | 4 |
| stelo.PatternRobot 1.0 | 2 | 5% | 2 |
| fnc.bandit.Bandit 5.2.0 | 1 | 3% | 1 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 60810 melee ticks, 17277 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 42 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 20864 sent, 19273 reached their opponent, 3537 virtual hits (18.4% of those reached).

## Melee bench: F03

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3720977. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 36 over 2 battles (18.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.4 | 49 / 70 | 1.96 | 19.9% | 12680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 19.9% | 49 |
| radnor.DoctorBob 1.42 | 2.0 | 14.2% | 12 |
| kawigi.nano.Lib 1.0 | 3.5 | 13.4% | 6 |
| vuen.Cake 2.51 | 3.5 | 12.6% | 2 |
| urdos.URDOS 1.3 | 5.5 | 7.9% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 6.5 | 7.2% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.6 | 24 / 35 | 6209 |
| 2 | 1 | 70.5 | 90.2 | 25 / 35 | 6471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 22 | 95% |
| radnor.DoctorBob 1.42 | 16 | 94% |
| kawigi.nano.Lib 1.0 | 10 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 21 of 70 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 11 | 52% | 21 |
| kawigi.nano.Lib 1.0 | 3 | 14% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 14% | 3 |
| vuen.Cake 2.51 | 2 | 10% | 24 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 5% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 5% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 2 |
| urdos.URDOS 1.3 | 0 | 0% | 1 |
| adt.Ar1 2.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 45349 melee ticks, 13318 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 24 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 13612 sent, 11999 reached their opponent, 3145 virtual hits (26.2% of those reached).

## Melee bench: F04

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3649556. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 43 over 2 battles (21.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.0 | 4 / 70 | 2.26 | 17.2% | 10744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 56 |
| hadur117.Hadur 3.19gx | 2.0 | 17.2% | 4 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.6% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 3 |
| josago.Jorgito 0.16 | 5.0 | 9.3% | 1 |
| tj.zombie1n 1.0.1 | 6.0 | 7.0% | 1 |
| css.Delitioner 0.11 | 7.0 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 87.0 | 2 / 35 | 5458 |
| 2 | 2 | 67.3 | 85.1 | 2 / 35 | 5286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 46 | 7% |
| TNT.TNT 0.99.1 | 3 | 33% |
| apc.LeeroyJenkins2 1.0 | 2 | 0% |
| tj.zombie1n 1.0.1 | 1 | 0% |

Hadur died in 66 of 70 rounds, at a mean tick of 1364. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 49 | 74% | 52 |
| apc.LeeroyJenkins2 1.0 | 7 | 11% | 7 |
| TNT.TNT 0.99.1 | 6 | 9% | 7 |
| josago.Jorgito 0.16 | 2 | 3% | 2 |
| tj.zombie1n 1.0.1 | 1 | 2% | 1 |
| css.Delitioner 0.11 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 67914 melee ticks, 29153 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 56 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 21086 sent, 19408 reached their opponent, 2969 virtual hits (15.3% of those reached).

## Melee bench: F05

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3770719. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 39 over 2 battles (19.5 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 77.6 | 6 / 70 | 3.01 | 14.3% | 6575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.2% | 35 |
| justin.DemonicRage 3.4 | 2.0 | 16.9% | 20 |
| hadur117.Hadur 3.19gx | 3.0 | 14.3% | 6 |
| wompi.Numbat 2.1 | 4.0 | 12.9% | 6 |
| ms.Ares 0.19 | 5.5 | 9.5% | 1 |
| axeBots.HataMoto 3.09 | 5.5 | 8.7% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.8% | 0 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.6% | 0 |
| GarmBox.Oranges 1.0 | 9.0 | 4.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 79.7 | 3 / 35 | 3166 |
| 2 | 3 | 62.2 | 75.6 | 3 / 35 | 3409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 14 | 0% |
| justin.DemonicRage 3.4 | 10 | 30% |
| wompi.Numbat 2.1 | 3 | 33% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 64 of 70 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 23 | 36% | 24 |
| justin.DemonicRage 3.4 | 21 | 33% | 24 |
| wompi.Numbat 2.1 | 11 | 17% | 11 |
| ms.Ares 0.19 | 5 | 8% | 5 |
| axeBots.HataMoto 3.09 | 3 | 5% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 2% | 2 |

Posture (Hadur's M records, 70 rounds): 52154 melee ticks, 8944 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 42 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16423 sent, 14689 reached their opponent, 2447 virtual hits (16.7% of those reached).

## Melee bench: F06

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3651164. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 58 over 2 battles (29.0 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.7 | 41 / 70 | 2.20 | 18.7% | 9748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 18.7% | 41 |
| jekl.StoneGhost 0.7 | 2.5 | 13.7% | 7 |
| origin.SleepSiphon 1.7b | 3.0 | 13.4% | 10 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 12.6% | 9 |
| mld.Wisdom 1.0 | 5.0 | 10.2% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.8% | 0 |
| DBall.NUKE 0.1 | 8.0 | 6.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.8% | 1 |
| spinnercat.Omen 1.0 | 8.0 | 5.9% | 0 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.0 | 20 / 35 | 4849 |
| 2 | 1 | 68.9 | 87.3 | 21 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 19 | 79% |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 81% |
| jekl.StoneGhost 0.7 | 9 | 89% |
| gg.Wolverine 2.0 | 2 | 100% |
| mld.Wisdom 1.0 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |

Hadur died in 29 of 70 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 9 | 31% | 23 |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 31% | 16 |
| jekl.StoneGhost 0.7 | 4 | 14% | 12 |
| mld.Wisdom 1.0 | 4 | 14% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 7% | 5 |
| spinnercat.Omen 1.0 | 1 | 3% | 2 |
| gg.Wolverine 2.0 | 0 | 0% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 53014 melee ticks, 15309 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 31 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15950 sent, 14260 reached their opponent, 3199 virtual hits (22.4% of those reached).

## Melee bench: F07

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3668213. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 45 over 2 battles (22.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.6 | 32 / 70 | 1.76 | 19.6% | 11770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 19.6% | 32 |
| rtk.Tachikoma 1.0 | 2.5 | 16.7% | 15 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 16.8% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.9% | 8 |
| franzor.Lizt 1.3.1 | 5.0 | 11.0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 7.6% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 6.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.0 | 3.0% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.0 | 18 / 35 | 5807 |
| 2 | 1 | 70.7 | 90.2 | 14 / 35 | 5963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 32 | 59% |
| rsalesc.melee.Monk 0.3.6c | 12 | 17% |
| oog.melee.CapuletDroid 1.1 | 9 | 44% |
| franzor.Lizt 1.3.1 | 5 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 38 of 70 rounds, at a mean tick of 1384. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 16 | 42% | 34 |
| rsalesc.melee.Monk 0.3.6c | 13 | 34% | 19 |
| oog.melee.CapuletDroid 1.1 | 7 | 18% | 16 |
| exauge.GateKeeper 1.1.121g | 1 | 3% | 1 |
| franzor.Lizt 1.3.1 | 1 | 3% | 0 |

Posture (Hadur's M records, 70 rounds): 67110 melee ticks, 26981 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 31 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 19701 sent, 18068 reached their opponent, 3784 virtual hits (20.9% of those reached).

## Melee bench: F08

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3765839. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 59 over 2 battles (29.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.0 | 34 / 70 | 2.26 | 18.0% | 8780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 18.0% | 34 |
| tm.Yuugao 1.0 | 2.5 | 14.1% | 16 |
| shrub.Vapour v159 | 3.0 | 12.7% | 7 |
| Krabb.sliNk.Garm 0.9u | 3.5 | 12.7% | 7 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 10.3% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.7% | 1 |
| m3thos.Eva00 1.1 | 6.5 | 8.7% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.4% | 0 |
| SHAM.WOW 1.4 | 9.0 | 4.7% | 0 |
| zyx.nano.BacillusComma 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.2 | 15 / 35 | 4396 |
| 2 | 1 | 68.5 | 89.8 | 19 / 35 | 4384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 21 | 52% |
| Krabb.sliNk.Garm 0.9u | 9 | 78% |
| shrub.Vapour v159 | 7 | 71% |
| com.spp.robocode.MostlyHarmless 010 | 5 | 80% |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 36 of 70 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 14 | 39% | 23 |
| Krabb.sliNk.Garm 0.9u | 7 | 19% | 15 |
| shrub.Vapour v159 | 5 | 14% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 14% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 6% | 8 |
| m3thos.Eva00 1.1 | 2 | 6% | 5 |
| SHAM.WOW 1.4 | 1 | 3% | 2 |

Posture (Hadur's M records, 70 rounds): 51452 melee ticks, 14985 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 47 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 16876 sent, 15145 reached their opponent, 2721 virtual hits (18.0% of those reached).

