# Bench suite: gun-smoke-suite.txt

## Melee bench: F01

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3757118. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 37 over 1 battles (37.0 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.4 | 10 / 35 | 2.31 | 16.8% | 4658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 18.6% | 20 |
| hadur117.Hadur 3.19gx | 2.0 | 16.8% | 10 |
| sgp.JollyNinja 3.53 | 3.0 | 12.8% | 4 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 12.2% | 1 |
| mz.MicroGodMelee 1 | 5.0 | 10.4% | 0 |
| lorneswork.Predator 1.0 | 6.0 | 9.8% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 6.3% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.1% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 85.4 | 10 / 35 | 4658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 15 | 13% |
| sgp.JollyNinja 3.53 | 4 | 75% |
| mz.MicroGodMelee 1 | 3 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |

Hadur died in 25 of 35 rounds, at a mean tick of 1033. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 15 | 60% | 18 |
| sgp.JollyNinja 3.53 | 4 | 16% | 6 |
| mz.MicroGodMelee 1 | 3 | 12% | 6 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 12% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 22980 melee ticks, 12186 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 49 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 7534 sent, 6695 reached their opponent, 1338 virtual hits (20.0% of those reached).

## Melee bench: F02

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3983315. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 1 battles (21.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.4 | 15 / 35 | 2.40 | 18.1% | 4893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 18.1% | 15 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 14.3% | 6 |
| pulsar.PulsarMax 0.8.9 | 3.0 | 12.2% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.7% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.5% | 0 |
| Noran.BitchingElk 0.054 | 6.0 | 8.6% | 3 |
| sch.Simone 0.3d | 7.0 | 8.2% | 4 |
| fnc.bandit.Bandit 5.2.0 | 8.0 | 7.1% | 0 |
| stelo.PatternRobot 1.0 | 9.0 | 6.5% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.4 | 15 / 35 | 4893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 8 | 75% |
| Noran.BitchingElk 0.054 | 6 | 50% |
| pulsar.PulsarMax 0.8.9 | 3 | 33% |
| lrem.micro.SpikeSoldier 0.4 | 2 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 2 | 100% |
| sch.Simone 0.3d | 2 | 0% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 20 of 35 rounds, at a mean tick of 1036. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 5 | 25% | 11 |
| pulsar.PulsarMax 0.8.9 | 4 | 20% | 6 |
| Noran.BitchingElk 0.054 | 3 | 15% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 2 | 10% | 4 |
| stelo.PatternRobot 1.0 | 2 | 10% | 2 |
| sch.Simone 0.3d | 2 | 10% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 1 | 5% | 2 |
| fullsail.SweetTea 1.1 | 1 | 5% | 1 |
| fnc.bandit.Bandit 5.2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 30110 melee ticks, 6967 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 18 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 18 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 10431 sent, 9605 reached their opponent, 1733 virtual hits (18.0% of those reached).

## Melee bench: F03

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3945319. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 9 over 1 battles (9.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.1 | 24 / 35 | 1.80 | 20.3% | 6367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 20.3% | 24 |
| radnor.DoctorBob 1.42 | 2.0 | 14.0% | 6 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.2% | 2 |
| vuen.Cake 2.51 | 4.0 | 13.1% | 3 |
| adt.Ar1 2.1 | 5.0 | 8.3% | 0 |
| urdos.URDOS 1.3 | 6.0 | 8.1% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 8.0 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.1 | 24 / 35 | 6367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 12 | 92% |
| radnor.DoctorBob 1.42 | 8 | 100% |
| kawigi.nano.Lib 1.0 | 6 | 83% |

Hadur died in 11 of 35 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 5 | 45% | 12 |
| kawigi.nano.Lib 1.0 | 3 | 27% | 10 |
| vuen.Cake 2.51 | 1 | 9% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 9% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 9% | 1 |
| adt.Ar1 2.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 23314 melee ticks, 6969 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 40 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 1.

Targeting waves (35 rounds): 6745 sent, 5966 reached their opponent, 1603 virtual hits (26.9% of those reached).

## Melee bench: F04

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3875270. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 14 over 1 battles (14.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.0 | 7 / 35 | 2.17 | 17.8% | 5331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.8% | 26 |
| hadur117.Hadur 3.19gx | 2.0 | 17.8% | 7 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 2 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 0 |
| josago.Jorgito 0.16 | 5.0 | 7.8% | 0 |
| css.Delitioner 0.11 | 6.0 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.8% | 0 |
| spin.Bugstard 0.012b | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 87.0 | 7 / 35 | 5331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 21 | 14% |
| apc.LeeroyJenkins2 1.0 | 4 | 50% |
| TNT.TNT 0.99.1 | 2 | 100% |

Hadur died in 28 of 35 rounds, at a mean tick of 1272. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 21 | 75% | 22 |
| apc.LeeroyJenkins2 1.0 | 4 | 14% | 8 |
| TNT.TNT 0.99.1 | 2 | 7% | 4 |
| josago.Jorgito 0.16 | 1 | 4% | 1 |

Posture (Hadur's M records, 35 rounds): 34349 melee ticks, 10857 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 35 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 10506 sent, 9642 reached their opponent, 1534 virtual hits (15.9% of those reached).

## Melee bench: F05

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3863351. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 9 over 1 battles (9.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 73.7 | 1 / 35 | 3.37 | 13.4% | 3175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.4% | 20 |
| justin.DemonicRage 3.4 | 2.0 | 18.2% | 13 |
| hadur117.Hadur 3.19gx | 3.0 | 13.4% | 1 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 1 |
| ms.Ares 0.19 | 5.0 | 9.2% | 0 |
| axeBots.HataMoto 3.09 | 6.0 | 8.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.0 | 6.1% | 0 |
| supersample.SuperBoxBot 1.0 | 8.0 | 4.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 73.7 | 1 / 35 | 3175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 6 | 0% |
| justin.DemonicRage 3.4 | 5 | 20% |

Hadur died in 34 of 35 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 15 | 44% | 15 |
| justin.DemonicRage 3.4 | 11 | 32% | 12 |
| wompi.Numbat 2.1 | 4 | 12% | 4 |
| ms.Ares 0.19 | 2 | 6% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 3% | 1 |
| GarmBox.Oranges 1.0 | 1 | 3% | 1 |

Posture (Hadur's M records, 35 rounds): 26388 melee ticks, 3796 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 46 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 8165 sent, 7303 reached their opponent, 1171 virtual hits (16.0% of those reached).

## Melee bench: F06

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3922083. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 20 over 1 battles (20.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.9 | 17 / 35 | 2.09 | 18.3% | 4616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 18.3% | 17 |
| jekl.StoneGhost 0.7 | 2.0 | 14.5% | 3 |
| origin.SleepSiphon 1.7b | 3.0 | 14.3% | 7 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.7% | 7 |
| mld.Wisdom 1.0 | 5.0 | 11.3% | 1 |
| gg.Wolverine 2.0 | 6.0 | 7.7% | 0 |
| DBall.NUKE 0.1 | 7.0 | 6.9% | 0 |
| spinnercat.Omen 1.0 | 8.0 | 5.9% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 5.5% | 0 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.9 | 17 / 35 | 4616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 11 | 82% |
| origin.SleepSiphon 1.7b | 8 | 63% |
| pe.minimelee.SandboxMiniMelee 1.1 | 3 | 33% |
| mld.Wisdom 1.0 | 1 | 100% |
| gg.Wolverine 2.0 | 1 | 100% |

Hadur died in 18 of 35 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 6 | 33% | 10 |
| origin.SleepSiphon 1.7b | 6 | 33% | 9 |
| jekl.StoneGhost 0.7 | 5 | 28% | 11 |
| mld.Wisdom 1.0 | 1 | 6% | 3 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 27411 melee ticks, 7579 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 18 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 18 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 2.

Targeting waves (35 rounds): 8140 sent, 7338 reached their opponent, 1608 virtual hits (21.9% of those reached).

## Melee bench: F07

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3739774. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 16 over 1 battles (16.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.7 | 19 / 35 | 1.74 | 20.0% | 6047 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 20.0% | 19 |
| rtk.Tachikoma 1.0 | 2.0 | 17.0% | 6 |
| rsalesc.melee.Monk 0.3.6c | 3.0 | 16.3% | 5 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.4% | 2 |
| franzor.Lizt 1.3.1 | 5.0 | 10.7% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.0% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.0 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.7 | 19 / 35 | 6047 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 17 | 76% |
| rsalesc.melee.Monk 0.3.6c | 7 | 43% |
| oog.melee.CapuletDroid 1.1 | 3 | 67% |
| franzor.Lizt 1.3.1 | 2 | 50% |

Hadur died in 16 of 35 rounds, at a mean tick of 1563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 7 | 44% | 20 |
| rsalesc.melee.Monk 0.3.6c | 5 | 31% | 8 |
| oog.melee.CapuletDroid 1.1 | 2 | 13% | 5 |
| franzor.Lizt 1.3.1 | 2 | 13% | 2 |

Posture (Hadur's M records, 35 rounds): 35092 melee ticks, 14246 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 24 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 10088 sent, 9252 reached their opponent, 1957 virtual hits (21.2% of those reached).

## Melee bench: F08

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3930380. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 1 battles (21.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.0 | 18 / 35 | 2.26 | 18.1% | 4524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 18.1% | 18 |
| shrub.Vapour v159 | 2.0 | 13.5% | 5 |
| tm.Yuugao 1.0 | 3.0 | 11.9% | 5 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.6% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 5.0 | 9.9% | 2 |
| com.spp.robocode.MostlyHarmless 010 | 6.0 | 9.0% | 1 |
| m3thos.Eva00 1.1 | 7.0 | 8.6% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.5% | 0 |
| SHAM.WOW 1.4 | 9.0 | 5.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 86.0 | 18 / 35 | 4524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| Krabb.sliNk.Garm 0.9u | 6 | 50% |
| tm.Yuugao 1.0 | 5 | 80% |
| shrub.Vapour v159 | 4 | 75% |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| m3thos.Eva00 1.1 | 2 | 100% |
| com.spp.robocode.MostlyHarmless 010 | 1 | 100% |

Hadur died in 17 of 35 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | 7 | 41% | 11 |
| shrub.Vapour v159 | 4 | 24% | 6 |
| tm.Yuugao 1.0 | 3 | 18% | 6 |
| com.spp.robocode.MostlyHarmless 010 | 2 | 12% | 6 |
| m3thos.Eva00 1.1 | 1 | 6% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 35 rounds): 26455 melee ticks, 5227 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 39 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 1.

Targeting waves (35 rounds): 8556 sent, 7725 reached their opponent, 1499 virtual hits (19.4% of those reached).

